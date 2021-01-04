package filehandlers;

import java.io.File;
import java.io.FileNotFoundException;

import java.util.Scanner;

import Data.Movie;

public class FileRead {
	Scanner myReader;
public String fileRead(String filename) {	
	Movie M = new Movie();
	String movies = "" ;
	try {
		File myObj = new File(filename);
		myReader = new Scanner(myObj);
		while (myReader.hasNextLine()) {
			
			String data[] = myReader.nextLine().split(";");
			M.setTitle(data[0]);
			M.setTitle_type(data[1]);
			M.setDirectors(data[2]);
			M.setImdb_rtng(data[3]);
			M.setRuntime(data[4]);
			M.setYear(data[5]);
			M.setGenres(data[6]);
			M.setVotes(data[7]);
			M.setTop250(data[8]);
			M.setMw1001(data[9]);
			M.setUrl(data[10]);
			movies+=M+"\n";
			
		}
		
		
	} catch (FileNotFoundException e) {
		System.out.println("An error occurred.");
		e.printStackTrace();
	}finally {
		System.out.println(movies);
		myReader.close();
	}
	//System.out.println(movies.toString());
	return movies;
}
}

