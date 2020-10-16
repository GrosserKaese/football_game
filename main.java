import java.util.*;
import java.io.*;

public class main{
	public static void main(String[] args){
		try {
			File file = new File("p_teams.ftb");
			Scanner f_scan = new Scanner(file);
			
			while(f_scan.hasNextLine()){
				String data = f_scan.nextLine();
				System.out.println(data);
			}
		} catch (FileNotFoundException e){
			e.printStackTrace();
		}
	}
}
