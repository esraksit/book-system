
public class BookLinkedList {
	private BookNode head;
	public BookLinkedList() {
		head=null;
	}
	public void addNewBook(String newBookTitle) {		  
			BookNode bd = new BookNode(newBookTitle);
			
			if (head== null) {
				head=bd;
			}		
			else {
				
				BookNode walk=head;
				
				while(walk!=null){
					if(walk.getData()==bd.getData()) {				
						break;}	
					
					else {
						if(walk.getNext()!=null) {
							walk=walk.getNext();}
						
						else {
							walk.setNext(bd);}					
					}								
				}									
			}
			System.out.print("eklendi");
			
		}

	
	public Book search(String key) {
		Book res=null;
		BookNode walk=head;
		while( walk!=null  ) {
			if(walk.getData().equals(key)) {
				res.setBookEntry(walk.getData());
				break;
			}
		}
		return res;
	}
	
	
	public void saveToTextFile(String fileName) {
		
	}
	public Book[] toArray() {
		BookNode walk =head;
		Book []bookArray=new Book[this.getSize()];
		//set of codes that will create array of book from linked list nodes								
		for(int i=0;i<this.getSize();i++){
			bookArray[i].setBookEntry(walk.getData()) ;
			walk=walk.getNext();		
		}
		return bookArray;
	}
	
	
	public int getSize() {
		int cnt=0;
		BookNode walk=head;
		
		while(walk!=null) {
			  cnt++;
			  walk=walk.getNext();		
		
	}
		return cnt;
}
}