package sesion20;

import java.util.HashMap;

public class OptionParse {
    private final HashMap<String, String> options = new HashMap<String, String>();
    private String[] args;

    private OptionParse() {}
    public OptionParse(String[] args) {
        this.args = args;
    }

    public HashMap<String, String> getOptions() {
        return options;
    }

    public void setOptionValue(String option) {
        options.put(option, "");
    }

    public void setOptionValue(String option, String value) {
        options.put(option, value);
    }

    public String getOption(String option) {
        return options.get(option);
    }

    public void parse() {
        for (int i = 0; i < args.length; i++) {
            if (args[i].startsWith("--")) {
                setOptionValue(args[i].replace("--", ""), args[i + 1]);
                i++;
            }
        }
    }
}
