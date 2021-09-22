package day35maps;

import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ConvertCsvToMap {
	
	/*
	 	Read a csv file and convert it to a Map
	 	csv ==> Name, Ali
	 			Id, 101
	 			Address, Miami
	 			
	 			Output ==>  {Name=Ali, Id=101, City=Miami}
	 */
	
	public static void main(String[] args) {
		System.out.println(convertCsvToMap());
		
	}
	public static Map<String, String> convertCsvToMap(){
		
		BufferedReader br;
		List<String> linesList = new ArrayList<>();
		LinkedHashMap<String, String> lhm = new LinkedHashMap<>();
		
		try {
			br = new BufferedReader(new FileReader("C:\\Users\\Pc\\Desktop\\myworkspace\\winterjava\\src\\day35maps\\myFile.csv"));
			String lines = br.readLine();
			
			
			while(lines != null) {
				linesList.add(lines);
				lines = br.readLine();
			}
			
		} catch (IOException e) {
			System.out.println("File could not be read" + e.getMessage());
		}
		
		System.out.println(linesList);
		
		for (String w: linesList) {
			String arr[] = w.split(",");
			lhm.put(arr[0].trim(), arr[1].trim());
		}
		
//		System.out.println(hm);
		
		return lhm;
		
	}

}
