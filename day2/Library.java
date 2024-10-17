package week1.day2;

public class Library {
	
	public String addbook(String bookTitle) {
System.out.println("Book Name :" + bookTitle +  "is added Successfully");
return bookTitle;		
	}
public void issueBook()	{
	System.out.println("Book issued Succesfully");
}
    public static void main(String[] args) {
Library lib = new Library();
lib.addbook("The Psychology of Money");
lib.issueBook();
    }
}
