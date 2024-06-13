package Controller;

import View.cypherView;
import View.securePassView;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class cypherController {

    //send to each cypher method controller depending on what the user chooses
    public cypherController(Scanner file, int option) throws FileNotFoundException {
        switch (option) {
            case 1: //Vigenere
                //call vigenere
                break;
            case 2: //Trasposition
                //call trasposition
                break;
            case 3: //Cesar
                //call cesar
                break;
            default:
                cypherView cypherView = new cypherView();
                cypherView.showCypherMenu();
                break;
        }
    }

}
