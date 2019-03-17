package lesson028;

import java.util.Scanner;

/**
 * Class LessonString
 *
 * @author Anton Prokhorov
 */
public class LessonString {
    private static Scanner stdIn = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) {


        System.out.println("Enter source string");
        StringBuilder sourceString = new StringBuilder(stdIn.next());
        System.out.println(sourceString.toString());

        System.out.println("Type a substring to replace");
        String replaceToString = stdIn.next();

        System.out.println("Enter a string to insert");
        String insertToString = stdIn.next();

        int start = sourceString.indexOf(replaceToString);
        while (start >= 0) {
            sourceString.delete(start, start + replaceToString.length());
            sourceString.insert(start, insertToString);
            start = sourceString.indexOf(replaceToString);
        }


        System.out.println(sourceString);
    }


}
