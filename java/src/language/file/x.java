package language.file;

import java.io.*;

public class x {

    public static void main (String[] args) throws IOException{
        //fileReader();
        bufferedRead();
    }

    static void bufferedRead() throws IOException{

        try(BufferedReader reader = new BufferedReader(new FileReader("src/dd.java"));
            BufferedWriter writer = new BufferedWriter(new FileWriter("src/_File/Buffered_dd.txt"))){
            String line = "";
            while((line = reader.readLine())!=null){
                writer.write(line);
                writer.newLine();
            }

        }
        catch(IOException e){
            throw e;
        }
    }

    static void fileReader() throws IOException{

        try(Reader reader = new FileReader("src/dd.java");
            Writer writer = new FileWriter("src/_File/dd.txt")){
            char[] data = new  char[8];
            int length;
            while((length = reader.read(data))>=0){
                writer.write(data);
            }

        }
        catch(IOException e){
            throw e;
        }
    }

    static void dd() throws IOException{

        Reader reader = new FileReader("src/dd.java");
        Writer writer = new FileWriter("src/dd.txt");
        char[] data = new  char[8];
        int length;
        while((length = reader.read(data))>=0)
            writer.write(data);

    }

}
