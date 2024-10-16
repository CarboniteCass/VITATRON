import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your age: ");
        int in = input.nextInt();
        System.out.println("You are "+in+ " Years old");
        if(in >= 18){
            System.out.println("Now get out and Vote!");
        }
        else{
            System.out.println("Have fun playing outside!!");
        }
        input.close();



    }
}
