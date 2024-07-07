import java.util.Scanner;
class RemoveConsecutivePairs{
    public static String removePairs(String A){
        StringBuilder result = new StringBuilder();
        for(char c : A.toCharArray()){
            int length = result.length();
            if(length > 0 && result.charAt(length - 1) == c){
                result.deleteCharAt(length - 1);
            }
            else{
                result.append(c);
            }
        }
        return result.toString();
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String A = sc.nextLine();
        String result = removePairs(A);
        System.out.print(result);
    }
}