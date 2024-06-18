import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String reversed = reverseWords(input);
        System.out.print(reversed + " ");
    }
    public static String reverseWords(String A){
        int length = A.length();
        String result = "";
        int i = length -1;
        while(i >= 0){
            while(i >= 0 && A.charAt(i) == ' '){i--;}
            if(i < 0){break;}
            int end = i;
            while(i >= 0 && A.charAt(i) != ' '){i--;}
            if(!result.isEmpty()){result+= " ";}
            result += A.substring(i+1, end +1);
        }
        return result;
    }
}