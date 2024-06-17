import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String toggle = toggleCase(input);
        System.out.print(toggle);
    }
    public static String toggleCase(String A){
        char[] charArray = A.toCharArray();
        for(int i = 0; i < charArray.length; i++){
            char ch = charArray[i];
            if(Character.isLowerCase(ch)){
                charArray[i] = Character.toUpperCase(ch);
            }
            else if(Character.isUpperCase(ch)){
                charArray[i] = Character.toLowerCase(ch);
            }
        }
        return new String(charArray);
    }
}