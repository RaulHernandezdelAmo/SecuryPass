package Model;
import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class cypher {

    //TODO revisar si me interesa usar linkedList u otra estructura
    public Queue<String> getMessage(String path) throws IOException {
        Queue<String> message = new LinkedList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("D:/Users/Raul/IdeaProjects/SecuryPass/PruebaDescifrar.txt"))){
            String line;
            while((line = br.readLine()) != null){
                message.add(line);
            }
        }
        return message;
    }

    public boolean createDocument (String name){
        try {
            File document = new File(name);
            return document.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean saveCypheredMessage (Queue<String> message, String name) throws IOException {
        boolean success = true;
        try {
            FileWriter file = new FileWriter("D:/Users/Raul/IdeaProjects/SecuryPass/" + name);
            System.out.println(file);
            BufferedWriter bw = new BufferedWriter(file);
            String line;
            while (message.peek() != null) {
                line = message.remove();
                try{
                    bw.write(line);
                    //If it is neccesary check if its the last lane before always adding a new line
                    bw.newLine();
                }catch (Exception e){
                    success = false;
                }
            }
            bw.close();
            System.out.println("Terminado bien");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return success;
    }
}
