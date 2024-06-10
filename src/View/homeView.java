package View;
import java.util.Scanner;
import Controller.homeController;

public class homeView {
    public void showHome() {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("/***************************/");
        System.out.println("Welcome to SecuryPass");
        System.out.println("/***************************/");
        System.out.println();

        System.out.println("1.- Read/Edit/Delete register.");
        System.out.println("2.- Create new register.");
        System.out.println("3.- Generate safe password.");
        System.out.println("4.- Cypher document.");
        System.out.print("Choose the option (NUMBER): ");

        try {
            int option = sc.nextInt();
            homeController home = new homeController();
            home.setOption(option);
            home.controller();
        } catch (Exception e) {
            System.out.println("Not a valid option.");
            this.showHome();
        }
    }
}
