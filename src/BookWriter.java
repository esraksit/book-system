import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BookWriter {

	private final static String outputFileName="TextBooks.txt";
	

	public BookWriter() throws IOException {
		
		
	}
	
	public void write(BookLinkedList list1) throws IOException {
		
		
		String current = System.getProperty("user.dir");
		File file1 = new File(current , outputFileName);     //yeni yaratýlan dosya
		file1.createNewFile();
		
		//create new file TextBooks that will overwrite the existing one
		Book []listYeni=list1.toArray();
		
		//save all book to file
		BufferedWriter f = null;
	
        try {
            f = new BufferedWriter(new FileWriter(outputFileName));
            for(int i=0;i<listYeni.length;i++) {
            	f.write(listYeni[i].toString());
            }
            
        }
        catch(IOException e) {
            System.out.println(e);
        }
        finally {
            if (f != null)
                f.close();  
        }
	}
	
	
	

}
