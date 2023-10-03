import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File; 
import java.io.FileNotFoundException;  

public class AnalyzerReader {
	 public static void main(String[] args) {
    try {

      File myObj = new File("D:/USER/Desktop/Projeto-POO2/Projeto-Poo2/src/test.txt");
      Scanner myReader = new Scanner(myObj);
      ArrayList<String> listaPalavras = new ArrayList<String>(); //cria a lista final de palavras

      while (myReader.hasNextLine()) {
        String data = myReader.nextLine().replaceAll("\\p{Punct}", ""); //tira toda pontuacao da linha
        String[] words = data.split(" ");
        listaPalavras.addAll(Arrays.asList(words));
      }

      System.out.println(listaPalavras);

      myReader.close();


      




    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }

  }
}
