import java.util.Random;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Random rand = new Random();
        int x = rand.nextInt(100);

        Scanner scan = new Scanner(System.in);
        int guess; 

        do {
            System.out.println("Enter your first guess");
            guess = scan.nextInt();

        //if guess is less than x 
        //if guess is more than x
        //count how many guesses
        //if count is less than 7, you print a very good guess


        

            if(guess < x){
                System.out.println("Too low");
            }
    
            else if(x < guess){
                System.out.println("Too high");
            }

            else{
                System.out.println("Correct");
            }

            int count = 1;
            
            if(count < 7 && guess == x){
                System.out.println("A very good guess");
            }
           
            }
        
        while (guess!=x);

        System.out.println(guess);
    }
}