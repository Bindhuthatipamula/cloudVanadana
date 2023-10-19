import java.util.Scanner;

public class Pangram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter input: ");
        String input = sc.nextLine();
	    Pangram obj = new Pangram();
        String result = obj.isPangram(input.toLowerCase());
        System.out.println("The given string "+ result);
    }

    public static String isPangram(String s){
        if(s.length() < 26){
            return "is not Pangram.";
        }else{
            for(char ch='a'; ch<='z';ch++){
                if(s.indexOf(ch) < 0){
                    return "is not Pangram.";
                }
            }
        }
        return "is Pangram.";
    }
}