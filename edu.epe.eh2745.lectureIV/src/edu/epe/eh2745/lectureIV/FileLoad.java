package edu.epe.eh2745.lectureIV;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class FileLoad 
{
	public static void main (String[] args){
		String datafilename= "./res/iris.csv";
		File datafile= new File(datafilename);
		//FileReader input;
		InputStreamReader input;
		BufferedReader br;
		ArrayList<Flower> flowerList= new ArrayList<Flower>();
		String csvSeparator= ",";
		
		try {
			String line= "";
			String[] values;
			input= new FileReader(datafile);
			br= new BufferedReader(input);
			// Cycle through the file
			while ((line = br.readLine()) != null) { 
				// Read each line of file and store data into database 
				values= line.split(csvSeparator);
				Flower flor= new Flower((String)values[4], Double.valueOf(values[0]), 
						Double.valueOf(values[1]), Double.valueOf(values[2]), 
						Double.valueOf(values[3]));
				flowerList.add(flor);
			}
			// Cycle throught the internal database
			for (int i= 0; i< flowerList.size(); i++)
			{
				System.out.println(flowerList.get(i));
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
