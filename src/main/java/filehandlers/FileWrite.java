package filehandlers;

import java.io.FileWriter;



public class FileWrite {

	
	
	
	
	public void write(String Filename, String S)
	{ 
		FileWriter fw=null;
		try {
			
			fw=new FileWriter(Filename);
			
			fw.write(S);
			System.out.println("Writing successful");
			fw.close();

		}catch (Exception e) {
			e.printStackTrace();
		}finally {

			System.out.println("Writing done");

		}
	}
}
