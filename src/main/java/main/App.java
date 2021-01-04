package main;

import filehandlers.FileAppend;
import filehandlers.FileRead;
import filehandlers.FileWrite;

public class App {

	public static void main(String[] args) {
		FileRead A= new FileRead();
		FileWrite B= new FileWrite();
		FileAppend C = new FileAppend();
		// reading a file into an object and getting the string
		String s=A.fileRead("src/main/resources/11_dataset_v1.0.txt");
		
		// Writing the string from above file to a new file
		B.write("src/main/resources/11_dataset_v1.1.txt",s);
		
		//Appending 1
		C.Append("src/main/resources/11_dataset_v1.2.txt", s);
		
		//Appending 2
		C.Append("src/main/resources/11_dataset_v1.2.txt", s);
		
	}

}
