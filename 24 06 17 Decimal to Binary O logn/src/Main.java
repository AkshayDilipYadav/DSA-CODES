import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i =0; i<n; i++){
            int a = sc.nextInt();
            String binaryString = toBinaryString(a);
            System.out.println(binaryString);
        }
    }
    public static String toBinaryString(int a){
        if(a == 0){return "0";}
        StringBuilder binaryString = new StringBuilder();
        while(a > 0){
            int remainder = a & 1;
            binaryString.insert(0, remainder);
            a = a >> 1;
        }
        return binaryString.toString();
    }
}