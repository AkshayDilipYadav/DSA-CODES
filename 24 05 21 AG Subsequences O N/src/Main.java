import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String A = sc.next();

        int result = countAGSubsequences(A);

        System.out.println(result);

    }

    public static int countAGSubsequences(String A){
        int mod = 1000000007;
        int countA = 0;
        int result = 0;

        for (int i =0; i< A.length(); i++){
            char ch = A.charAt(i);
            if(ch == 'A'){countA++;}
            else if(ch == 'G'){
                result = (result + countA)% mod;
            }
        }
        return result;
    }


}