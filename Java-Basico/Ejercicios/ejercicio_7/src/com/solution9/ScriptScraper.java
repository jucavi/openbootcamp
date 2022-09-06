package com.solution9;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ScriptScraper {

    /**
     * Create separate JavaScript files from embedding scripts blocks
     * @param args optional arguments
     */
    public static void main(String[] args) {

        try {
            String pathIn = "./templates/samplePage.html";
            String folderOut = "./templates/output";

            HashMap<String, ArrayList<String>> blocksClassifier = classifyScriptsBlocks(pathIn);

            System.out.println("Encontrados " + blocksClassifier.get("inlines").size() + " scripts's de una sola linea en la ruta '" + pathIn + "'");
            System.out.println("Encontrados " + blocksClassifier.get("blocks").size() + " scripts's como bloque de código en la ruta '" + pathIn + "'");

            ArrayList<String> blocks = blocksClassifier.get("blocks");
            ArrayList<String> jsBlocks = jsBlockScripts(blocks);

            for (int i = 0; i < jsBlocks.size(); i++) {
                String path = folderOut + "/script" + i + ".js";
                createJSFile(path, jsBlocks.get(i));
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

    private static HashMap<String, ArrayList<String>> classifyScriptsBlocks(String path) throws IOException {

        ArrayList<String> inLines = new ArrayList<>(20);
        ArrayList<String> blocks = new ArrayList<>(20);
        HashMap<String, ArrayList<String>> blockTypes = new HashMap<>();

        try {
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(path)))) {

                String line;
                StringBuilder blockCode = new StringBuilder();
                boolean isInBlockCode = false;
                boolean isOpenTag;
                boolean isCloseTag;
                boolean isOneLineScript;

                while ((line = reader.readLine()) != null) {

                    String trimLine = line.trim();
                    isOpenTag = trimLine.startsWith("<script");
                    isCloseTag = trimLine.endsWith("</script>");
                    isOneLineScript = isOpenTag && isCloseTag;

                    isInBlockCode = (isInBlockCode || isOpenTag) && !isCloseTag;

                    if (trimLine.equals("")) continue;

                    if (isOneLineScript) {
                        inLines.add(trimLine + "\n");
                    } else if (isInBlockCode) {
                        blockCode.append(line).append("\n");
                    } else if (isCloseTag) {
                        blockCode.append(line).append("\n");
                        blocks.add(blockCode.toString());
                        blockCode = new StringBuilder();
                    }
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + path);
        }

        inLines.trimToSize();
        blockTypes.put("inlines", inLines);
        blocks.trimToSize();
        blockTypes.put("blocks", blocks);

        return blockTypes;
    }

    private static ArrayList<String> jsBlockScripts(ArrayList<String> blocks) {

        ArrayList<String> jsBlocks = new ArrayList<>(20);

        for (String block : blocks) {
            if (block.contains("text/javascript")) {
                jsBlocks.add(block);
            }
        }
        return jsBlocks;
    }

    private static void createJSFile(String path, String block) throws IOException {
        
        try (PrintStream out = new PrintStream(path)) {
            String[] lines = block.split("\n");

            for (String line : lines) {
                if (line.contains("script")) {
                    line = removeScriptTag(line);
                    if (line.equals("")) continue;
                }

                out.println(line);
            }
        }
    }
    
    private static String removeScriptTag(String line) {
        Pattern startPattern = Pattern.compile("^<\s*script\s+type=\"text/javascript\"\s*>");
        Pattern endPattern = Pattern.compile("</\s*script\s*>");

        Matcher matcherStart = startPattern.matcher(line);
        Matcher matcherEnd = endPattern.matcher(line);
        String replaced = "";

        if (matcherStart.find()) {
            replaced =  line.replace(matcherStart.group(0), "");
        }
        if (matcherEnd.find()) {
            replaced =  line.replace(matcherEnd.group(0), "");
        }
        
        return replaced;
    }
}
