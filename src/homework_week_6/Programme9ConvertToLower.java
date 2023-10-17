package homework_week_6;
// program to convert the upper case to lower case

import java.util.Scanner;

public class Programme9ConvertToLower {
    public static String toLowerCase(String str){
        return str.toLowerCase();

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string to convert to lower case :");
        String str = scanner.nextLine();
        String lowerCaseStr = toLowerCase(str);

        System.out.println("The lower case string is :" + lowerCaseStr);
        scanner.close();

    }
}
