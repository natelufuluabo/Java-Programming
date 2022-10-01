import java.util.Scanner;

public class SimpleGame {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome! You have to pick to pick between 2 options");
        System.out.println("Option 1 : Convert time, from seconds to hours, minutes and seconds");
        System.out.println("Option 2 : Calculate the sum of all digits in an integer");
        System.out.println("Use 1 or 2 to let us know your choice 😁");

        int userChoice = scanner.nextInt();

        while (userChoice != 1 || userChoice != 2) {
            if (userChoice == 1 || userChoice == 2) break;
            System.out.println("Wrong choice! Try again");
            userChoice = scanner.nextInt();
        }

        if (userChoice == 1) {
            System.out.println("Lets convert some seconds to hours, minutes and seconds!");
            System.out.println("Enter seconds");
            int userInput = scanner.nextInt();
            int hours = userInput / 3600;
            int minutes = 0;
            int seconds = 0;
            if (userInput % 3600 >= 60) {
                minutes = (userInput % 3600) / 60;
                seconds = (userInput % 3600) % 60;
            } else {
                minutes = 0;
                seconds = userInput % 3600;
            }
            System.out.println(hours + " : " + minutes + " : " + seconds);
        } 
        if (userChoice == 2) {
            System.out.println("Lets do some maths!");
            System.out.println("Enter an integer");
            String userInput = String.valueOf(scanner.nextInt());
            char[] arr = userInput.toCharArray();
            int sum = 0;
            for (int i = 0; i < arr.length; i++) {
                int value = Character.getNumericValue(arr[i]);
                sum += value;
            }
            System.out.println(sum);
        }        
    }
}
