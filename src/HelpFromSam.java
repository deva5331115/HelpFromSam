import java.util.Scanner;

public class HelpFromSam {
    static int helpFromSam(int num){
        int Count = 1;
        int score = 1;
        while (score < num){
            score *= 2;
            if (score > num){
                score /= 2;
                score ++;
                Count++;
            }
        }
        return Count;
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int num= scan.nextInt();
        System.out.println(helpFromSam(num));
    }
}
