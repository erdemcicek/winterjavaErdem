package lambda;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class LambdaWithFiles {
	
	public static void main(String[] args) {
		
		// How to read a file by using functional programming
		
//		try {
//			Files.
//			lines(Paths.get("C:\\Users\\Pc\\Desktop\\myworkspace\\winterjava\\src\\lambda\\lambdaFile.txt")).forEach(t->System.out.println(t));
//		} catch (IOException e) {
//			System.out.println("I could not read the file " + e.getMessage());
//		}
		
		// Convert all characters to uppercase then read it
		
//		try {
//			Files.
//			lines(Paths.get("C:\\Users\\Pc\\Desktop\\myworkspace\\winterjava\\src\\lambda\\lambdaFile.txt")).
//			map(String::toUpperCase).forEach(t->System.out.println(t));
//		} catch (IOException e) {
//			System.out.println("I could not read the file " + e.getMessage());
//		}
		
		// Check if the file has the word "Lambda"
		
		
//		try {
//			System.out.println(Files.
//			lines(Paths.get("C:\\Users\\Pc\\Desktop\\myworkspace\\winterjava\\src\\lambda\\lambdaFile.txt")).
//			anyMatch(t->t.contains("Lambda"))); // true
//		} catch (IOException e) {
//			System.out.println("I could not read the file " + e.getMessage());
//		}
		
		// Check if the file has the word "NUMBER" ignore cases
		
//		try {
//			System.out.println(Files.
//			lines(Paths.get("C:\\Users\\Pc\\Desktop\\myworkspace\\winterjava\\src\\lambda\\lambdaFile.txt")).
//			map(t->t.toUpperCase()).anyMatch(t->t.contains("NUMBER"))); // true
//		} catch (IOException e) {
//			System.out.println("I could not read the file " + e.getMessage());
//		}
		
		// Print all distinct words in the text on the console
		
//		try {
//			Files.
//			lines(Paths.get("C:\\Users\\Pc\\Desktop\\myworkspace\\winterjava\\src\\lambda\\lambdaFile.txt")).
//			map(t->t.split(" ")).
//			flatMap(Arrays::stream).
//			map(t->t.replaceAll("\\W","")).
//			distinct().forEach(System.out::println);
//			 
//		} catch (IOException e) {
//			System.out.println("I could not read the file " + e.getMessage());
//		}
		
		
		// Print all words which contains "e" in the text on the console
		
		try {
			Files.
			lines(Paths.get("C:\\Users\\Pc\\Desktop\\myworkspace\\winterjava\\src\\lambda\\lambdaFile.txt")).
			map(t->t.split(" ")).
			flatMap(Arrays::stream).
			map(t->t.replaceAll("\\W","")).
			filter(t->t.contains("e")).
			forEach(System.out::println);
			 
		} catch (IOException e) {
			System.out.println("I could not read the file " + e.getMessage());
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
