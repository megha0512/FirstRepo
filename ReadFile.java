package filehandling;
import java.io.*;
import java.util.Scanner;

public class ReadFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			File ob = new File("D:\\File.txt");
			Scanner sc=new Scanner(ob);
			while(sc.hasNextLine())
			{
				String e=sc.nextLine();
				System.out.println(e);
			}
			sc.close();
		}
		catch(FileNotFoundException f)
		{
			System.out.println("An error occured");
		
		}
		

	}

}
