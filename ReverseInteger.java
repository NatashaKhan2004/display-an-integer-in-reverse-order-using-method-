import java.util.Scanner;

public class ReverseInteger {

    public static void reverse(int number) {
        
        String numberStr = Integer.toString(number);
        String reversedStr = "";

       boolean isNegative = number < 0;

        if (isNegative) {
            numberStr = numberStr.substring(1); 

        
        for (int i = numberStr.length() - 1; i >= 0; i--) {
            reversedStr += numberStr.charAt(i);
        }

        if (isNegative) {
            reversedStr = "-" + reversedStr;
        }

        System.out.println("Reversed number: " + reversedStr);
    } public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        reverse(number);
        scanner.close();
    }
}