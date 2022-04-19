import java.util.*;
public class StringSum2
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input;
        String again;
        do{
        int sum = 0;
        System.out.print("Enter the numbers you want to add: ");
        input = scan.nextLine();
        int len = input.length();
        String[] strArr = new String[len];
        int[] intArr = new int[len];
        for (int i = 0; i < len; i++){
            strArr[i] = input.substring(i,i+1);
            intArr[i] = Integer.parseInt(strArr[i]);
            sum += intArr[i];
        }
        Arrays.sort(intArr);
        int min, max;
        min = intArr[0];
        max = intArr[len - 1];
        System.out.println("The sum of the digits is: " + sum);
        System.out.println("The highest digit is: " + max);
        System.out.println("The lowest digit is: " + min);
        System.out.print("Run program again? Y/N: ");
        again = scan.nextLine();
        }
        while(again.equalsIgnoreCase("y"));
}
}
