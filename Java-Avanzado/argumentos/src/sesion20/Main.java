package sesion20;

import org.apache.commons.cli.*;

public class Main {
    public static void main(String[] args) {
        int opcionPrametro1 = 0;
        int opcionPrametro2 = 0;

        System.out.println("El número de parámetros de entrada es de " + args.length);

        for (String arg : args) {
            System.out.println("Pasado como parámetro: " + arg);
        }


        // --parametro valor
        for (int i = 0; i < args.length; i++) {
            switch (args[i]) {
                case "--parametro1" -> {
                    opcionPrametro1 = Integer.parseInt(args[i + 1]);
                    i++;
                }
                case "--parametro2" -> {
                    opcionPrametro2 = Integer.parseInt(args[i + 1]);
                    i++;
                }
            }
        }

        System.out.println("El --parámetro uno es: " + opcionPrametro1);
        System.out.println("El --parámetro dos es: " + opcionPrametro2);


        // Parser
        OptionParse optionParser = new OptionParse(args);
        optionParser.parse();
        System.out.println(optionParser.getOptions());

        demoACCLI(args);
    }


    // http://commons.apache.org/cli/ - Apache Commons CLI
    // http://www.martiansoftware.com/jasap/ - JSAP
    public static void demoACCLI(String[] args) {
        Options options = new Options();

        Option maxVal = new Option("max", "maxVal", true, "Valor Máximo");
        maxVal.setRequired(true);

        options.addOption(maxVal);

        CommandLineParser parser = new DefaultParser();
        HelpFormatter formatter = new HelpFormatter();
        formatter.printHelp("ant", options);
        CommandLine cmd = null;

        try {
            cmd = parser.parse(options, args);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        assert cmd != null;
        int max = Integer.parseInt(cmd.getOptionValue(maxVal));
        System.out.println("maxVal: " + max);
    }
}
