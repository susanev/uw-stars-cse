// This program allows you to explore the use of regular expressions to split a
// string.  You can type in various regular expressions for any given string to
// see what sequence of strings it produces.  To make it easier to read the
// output, the program puts single quotes around each resulting string.  The
// split method does not produce strings with quotes.

import java.util.*;

public class Splitter {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("string to split? ");
        String line = console.nextLine();
        boolean done = false;
        while (!done) {
            System.out.print("    regular expression to use (enter to quit)? ");
            String expression = console.nextLine();
            if (expression.length() == 0) {
                done = true;
            } else {
                String[] result = line.split(expression);
                for (int i = 0; i < result.length; i++)
                    result[i] = "'" + result[i] + "'";
                System.out.println("    expression = '" + expression + "'");
                System.out.println("    result = " + Arrays.toString(result));
            }
        }
    }
}