package lesson027;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Class Main
 *
 * @author Anton Prokhorov
 */
public class Main {

    private String data = "&&&hello&&bye&&sss&ss||s||";

    private String[] result;

    private String reg = "(&&|\\|\\|)";

    public static void main(String[] args) {

        Main main = new Main();

        main.setResult(splitPreserveDelimiter(main.getData(), main.getReg()));

        System.out.println(Arrays.toString(main.getResult()));
        System.out.println("end");
    }

    private static String[] splitPreserveDelimiter(String data, String regexp) {
        LinkedList<String> splitted = new LinkedList<>();
        int last_match = 0;
        Matcher m = Pattern.compile(regexp).matcher(data);
        while (m.find()) {
            if (last_match < m.start()) {
                splitted.add(data.substring(last_match, m.start()));
            }
            splitted.add(m.group());
            last_match = m.end();
        }
        if (last_match<data.length()) {
            splitted.add(data.substring(last_match));
        }
        return  splitted.toArray(new String[splitted.size()]);
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String[] getResult() {
        return result;
    }

    public void setResult(String[] result) {
        this.result = result;
    }

    public String getReg() {
        return reg;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }
}