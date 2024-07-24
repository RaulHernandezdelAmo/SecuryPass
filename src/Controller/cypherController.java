package Controller;

import View.cypherView;
import View.securePassView;
import Model.cypher;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Queue;
import java.util.Scanner;

public class cypherController {
    Queue<String> message = null;

    //send to each cypher method controller depending on what the user chooses
    //empty constructor
    public cypherController(){}
    public cypherController(String path, int option) throws IOException {
        readMessage(path);
        switch (option) {
            case 1: //Vigenere
                //call vigenere
                cypherView cypherView = new cypherView();
                cypherView.showCypheredDocument(this.message);
                break;
            case 2: //Trasposition
                //call trasposition
                break;
            case 3: //Cesar
                //call cesar
                break;
            default:
                showView();
                break;
        }
    }
    public void readMessage(String path) throws IOException {
        cypher cypherModel = new cypher();
        this.message = cypher.getMessage(path);
    }
    public void showView() throws IOException {
        cypherView cypherView = new cypherView();
        cypherView.showCypherMenu();
    }

}
