import java.io.File;
import java.util.Scanner;

public class reader {

		public int[] textreader(int num){
		int [] Array = new int[num];
		int i = 0;
		
		try{
			String next = "src/Num" + num + ".txt";
			Scanner scanner = new Scanner(new File(next));
			while(scanner.hasNextInt()){
				Array[i++] = scanner.nextInt(); }
		}catch(Exception e) { System.out.println(e);}
		return Array;
		}
	}

