package Java_Learning;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TextReader {

	public static void main(String[] args) {
		String fileName="test.text";
		try {
			FileWriter fileWriter=new  FileWriter(fileName);
			BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
			
			bufferedWriter.write("Hello their  ,");
			bufferedWriter.newLine();
			bufferedWriter.write("Here is some text  ,");
			bufferedWriter.newLine();
			bufferedWriter.write("We are writting  ,");
			bufferedWriter.newLine();
			bufferedWriter.write("The text to the file  ,");
			bufferedWriter.newLine();
			bufferedWriter.close();
		} catch(IOException ex){
			System.out.println("Error writing to file"+fileName);
					ex.printStackTrace();
			
		}

	}

}
