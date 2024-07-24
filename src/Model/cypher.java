package Model;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;

public class cypher {

    //TODO revisar si me interesa usar linkedList u otra estructura
    public static Queue<String> getMessage(String path) throws IOException {
        Queue<String> message = new LinkedList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("D:/Users/Raul/IdeaProjects/SecuryPass/PruebaDescifrar.txt"))){
            String line;
            while((line = br.readLine()) != null){
                message.add(line);
            }
        }
        return message;
    }

}
