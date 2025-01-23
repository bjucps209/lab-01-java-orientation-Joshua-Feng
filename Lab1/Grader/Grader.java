import java.util.*;

class Grader{
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("How many people got grade?");
        int num = scan.nextInt();


        for(int i = 0; i < num; i++){
            int score = scan.nextInt();
            if(score >= 38){
                int next_multiple = ((score / 5) + 1)*5;
                if (next_multiple - score < 3){
                    System.out.println(next_multiple);
                }else{
                     System.out.println(score);
                }
            }else{
                 System.out.println(score);
            }
        } 

    }
}