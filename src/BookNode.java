
public class BookNode {
	private String data;
	private BookNode next;
	
	public BookNode(String item) {
		data=item;
		next=null;
	}

	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public BookNode getNext() {
		return next;
	}
	public void setNext(BookNode next) {
		this.next = next;
	}
}
