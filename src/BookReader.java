import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class BookReader {
	
	
	private final static String inputFileName="TextBook.txt";

	public BookReader(BookLinkedList list1) {}
	
	public void bookReader(BookLinkedList list1) {
		try{
			  
			  FileInputStream fstream = new FileInputStream(inputFileName);
			  DataInputStream in = new DataInputStream(fstream);
			  BufferedReader br = new BufferedReader(new InputStreamReader(in));
			  String strLine;
			 
			  while ((strLine = br.readLine()) != null)   {
				list1.addNewBook(strLine);
			  System.out.println (strLine);
			  }

			  in.close();
			    
			  
			  }catch (Exception e){
			  System.err.println("Error: " + e.getMessage());
			  }
		
	}
	

	
}
