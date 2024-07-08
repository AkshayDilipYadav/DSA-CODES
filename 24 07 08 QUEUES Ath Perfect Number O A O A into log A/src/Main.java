import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class PerfectNumberFinder{
    public static String findAthPerfectNumber(int A){
        Queue<String> queue = new LinkedList<>();
        queue.add("1");
        queue.add("2");

        String result = "";

        while(A > 0){
            String current = queue.poll();
            String palindrome = current + new StringBuilder(current).reverse().toString();
            A--;
            if(A == 0){
                result = palindrome;
                break;
            }
            queue.add(current + "1");
            queue.add(current + "2");

        }
        return result;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        System.out.println(findAthPerfectNumber(A));
    }

}