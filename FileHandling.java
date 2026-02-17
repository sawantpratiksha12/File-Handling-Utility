package task1;

//public class FileHandling {
	import java.io.*;
	import java.io.File;
	import java.io.FileReader;
	import java.io.FileWriter;
	import java.io.IOException;

	public class FileHandling {

		public static void main(String[] args) {
			 String fileName = "task1.txt";

		        try {
		            
		            FileWriter writer = new FileWriter(fileName);
		            writer.write("Internship Task-1\nFile Handling Utility in Java");
		            writer.close();

		           
		            BufferedReader reader = new BufferedReader(new FileReader(fileName));
		            String line;
		            System.out.println("File Content:");
		            while ((line = reader.readLine()) != null) {
		                System.out.println(line);
		            }
		            reader.close();

		           
		            FileWriter modify = new FileWriter(fileName, true);
		            modify.write("\nFile modified successfully.");
		            modify.close();

		        } catch (IOException e) {
		            System.out.println("Error occurred");
		        }}

		}

