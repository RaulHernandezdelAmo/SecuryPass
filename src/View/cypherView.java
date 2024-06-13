package View;

import Controller.cypherController;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class cypherView {

    private Scanner readDoc() throws FileNotFoundException {
        Scanner in =new Scanner(new File("PruebaDescifrar.txt"));
        return in;
    }
    public void showCypherMenu() throws FileNotFoundException {
        System.out.print("Select the document to decypher");
        Scanner doc = readDoc();
        System.out.print("Select the cypher method:");
        System.out.println("1.- Vigenere.");
        System.out.println("2.- Transposition.");
        System.out.println("3.- Cesar.");
        System.out.print("Choose the option (NUMBER): ");
        Scanner option = new Scanner (System.in);
        cypherController cypher = new cypherController(doc, option);



    }

}
