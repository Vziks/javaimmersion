package examples;



public class Ascending {

    public static void main(String[] args) {

        // byte > short > int > long неявное implicit
        // byte < short < int < long явное obvious (byte)(short)(int)(long)
        // При приведении float или double к целочисленным типам, дробная часть не округляется, а просто отбрасывается.
        // Тип boolean не приводится ни к одному из типов.
        // Тип char приводится к числовым типам, как код символа в системе UNICODE.
        // Если число больше своего контейнера, результат будет непредсказуемым.
        int i, y;
        long s;


        int ii, yy;
        short ss;

        i = 5;
        ii = 5;
        y = 10;
        yy = 10;

        s = i + y;
        ss = (short) (ii + yy);

        System.out.println(s);
        System.out.println(ss);


    }
}
