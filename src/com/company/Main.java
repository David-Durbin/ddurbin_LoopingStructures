package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // variables
        int choice = -1;
        Scanner scanner = new Scanner(System.in);

        do
        {
            System.out.println("1. Main Lobby");
            System.out.println("2. Giant Robot Foundry");
            System.out.println("3. Crazed AI Development");
            System.out.println("4. Death Ray Testing");
            System.out.println("5. Goldfish Powered Space Miner Storage");
            System.out.println("6. DNA/RNA Recombination Lab");
            System.out.println("7. Mixtape vault");
            System.out.println("8. World Domination Scheme Dartboard");
            System.out.println("Please enter a floor number: ");
            choice = scanner.nextInt();

            if(choice < 1 || choice > 8)
            {
                display();
                System.out.println("That was not a valid choice.");
            }

        }while(choice < 1 || choice > 8);


        switch (choice)
        {
            case 1:
                System.out.println("Returning to floor 1: Main Lobby. Have a nice day.");
                break;
            case 2:
                System.out.println("Moving to floor 2: Giant Robot Foundry.");
                System.out.println("Please ensure you have proper eye and ear protection in place before exiting.");
                break;
            case 3:
                System.out.println("Moving to floor 3: Crazed AI Development.");
                System.out.println("Security Breach in Progress...Returning to floor 1: Main Lobby for your safety.");
                break;
            case 4:
                System.out.println("Moving to floor 4: Death Ray Testing.");
                System.out.println("Please remain behind the wooden line and white fences while observing the test.");
                break;
            case 5:
                System.out.println("Moving to floor 5: Goldfish Powered Space Miner Storage.");
                System.out.println("Please do not feed the fish.");
                break;
            case 6:
                System.out.println("Moving to floor 6: DNA/RNA Recombination Lab.");
                System.out.println("Do not attempt to pet the experiments.");
                break;
            case 7:
                System.out.println("Moving to floor 7: Mixtape vault.");
                System.out.println("Ear protection required for entry; spare ear protection may be found the left of the" +
                        "elevator.");
                break;
            case 8:
                System.out.println("Moving to floor 8: World Domination Scheme Dartboard.");
                System.out.println("Please dominate responsibly.");
        }
    }

    public static void display()
    {
        for(int i = 0; i < 30; i++)
        {
            System.out.println("");
        }
    }
}
