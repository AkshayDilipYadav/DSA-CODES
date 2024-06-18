import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String reversed = reverseString(input);
        System.out.print(reversed);
    }
    public static String reverseString(String A){
        char[] charArray = A.toCharArray();
        int left = 0;
        int right = charArray.length -1;
        while(left < right){
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
            left++;
            right--;
        }
        return new String(charArray);
    }
}