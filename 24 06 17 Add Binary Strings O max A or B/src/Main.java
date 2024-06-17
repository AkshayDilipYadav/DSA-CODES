
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String A = sc.nextLine();
        String B = sc.nextLine();
        String binarySum = addBinaryString(A, B);
        System.out.println(binarySum);
    }
    public static String addBinaryString(String A, String B){
        StringBuilder result = new StringBuilder();

        int i = A.length() -1;
        int j = B.length() -1;
        int carry = 0;
        while(i >= 0|| j >= 0 || carry !=0){
            int sum = carry;
            if(i >= 0){
                sum += A.charAt(i) - '0';
                i--;
            }
            if(j >= 0){
                sum+= B.charAt(j) - '0';
                j--;
            }
            carry = sum / 2;
            result.append(sum % 2);
        }
        return result.reverse().toString();
    }
}