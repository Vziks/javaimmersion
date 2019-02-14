package lesson008;

public class Identifier {
    public static void main(String[] args) {

        /*
            Examples of valid identifiers
            The only allowed characters for identifiers are all alphanumeric characters([A-Z],[a-z],[0-9]),
            ‘$‘(dollar sign) and ‘_‘ (underscore).
            For example “geek@” is not a valid java identifier as it contain ‘@’ special character.
         */
        int MyVariable;
        int MYVARIABLE;
        int myvariable;
        int x;
        int i;
        int x1;
        int i1;
        int _myvariable;
        int $myvariable;
        int sum_of_array;
        int geeks123;

        /*
            Examples of invalid identifiers
         */
        /*
        int My Variable  // contains a space
        int 123geeks   // Begins with a digit
        int a+c // plus sign is not an alphanumeric character
        int variable-2 // hyphen is not an alphanumeric character
        int sum_&_difference // ampersand is not an alphanumeric character
        */
    }
}
