package com.company;

import java.io.*;

public class CopySolution8 {

    public static void main(String[] args) {

        try {
            copyFile("./src/com/company/CopySolution8.java", "./src/com/company/CopySolution8.copy");
        } catch (IOException e) {
            e.printStackTrace();
        }

        /*

        try {
            copyFileBuffer("./src/com/company/CopySolution8.java", "./src/com/company/CopySolution8.copy");
        } catch (IOException e) {
            e.printStackTrace();
        }

         */

    }


    public static void copyFile(String fileIn, String fileOut) throws IOException {
        try {
            InputStream original = new FileInputStream(fileIn);
            PrintStream out = new PrintStream(new FileOutputStream(fileOut), true);

            byte[] buffer = new byte[1024];
            int lenRead;
            while ((lenRead = original.read(buffer)) > 0) {
                out.write(buffer, 0, lenRead);
                // out.flush();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }


    /*
    public static void copyFile(String fileIn, String fileOut) throws IOException {
        try {
            try (
                    InputStream original = new FileInputStream(fileIn);
                    PrintStream out = new PrintStream(new FileOutputStream(fileOut), true)
            ) {
                byte[] buffer = new byte[1024];
                int lenRead;
                while ((lenRead = original.read(buffer)) > 0) {
                    out.write(buffer, 0, lenRead);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

     */


    public static void copyFileBuffer(String fileIn, String fileOut) throws IOException {
        try {

            try (
                    FileInputStream original = new FileInputStream(fileIn);
                    FileOutputStream copied = new FileOutputStream(fileOut)
            ) {
                InputStream in = new BufferedInputStream(original);
                OutputStream out = new BufferedOutputStream(copied);

                byte[] buffer = new byte[1024];
                int lenRead;
                while ((lenRead = in.read(buffer)) > 0) {
                    out.write(buffer, 0, lenRead);
                    out.flush();
                }

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
