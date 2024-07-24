package View;

import Controller.cypherController;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Queue;
import java.util.Scanner;

public class cypherView {

    Scanner in = new Scanner(System.in);

    public void showCypherMenu() throws IOException {
        System.out.print("Select the document to decypher");
        String path = in.nextLine();
        System.out.print("Select the cypher method:");
        System.out.println("1.- Vigenere.");
        System.out.println("2.- Transposition.");
        System.out.println("3.- Cesar.");
        System.out.print("Choose the option (NUMBER): ");
        int option = in.nextInt();
        cypherController cypher = new cypherController(path, option);

    }

    public void showCypheredDocument(Queue<String> message){
        System.out.print(message);
    }
}
