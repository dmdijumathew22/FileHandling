package filehandlers;

import java.io.FileWriter;

public class FileAppend {

	public void Append(String Filename, String S)
	{ 
		FileWriter fw=null;
		try {
			
			fw=new FileWriter(Filename,true);
			
			fw.write(S);
			System.out.println("appending successful");
			fw.close();

		}catch (Exception e) {
			e.printStackTrace();
		}finally {

			System.out.println("appending done");

		}
	}
}
