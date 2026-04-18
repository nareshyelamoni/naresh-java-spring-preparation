package com.naresh.oops.encapsulation;
class Book{
    private int bookID;
    private String bookName;

    public void setBookID(int bookCode) {
        if(bookCode>0){
            bookID=bookCode;
        }else{
            System.out.println("Kindly add non zero number");
        }
    }

    public void setBookName(String book) {
        bookName = book;
    }
    public int getBookID(){
        return bookID;
    }

    public String getBookName() {
        return bookName;
    }
    public void display(){
        System.out.println("Book id is "+bookID+" and its name is "+bookName);
    }
}

public class LaunchEncap {
    public void main(String[] args) {
        Book book=new Book();
        //book.bookId=1;-->we cant access
        book.setBookID(1);
        book.setBookName("Bagavath Geetha");
        System.out.println(book.getBookID());
        System.out.println(book.getBookName());
        book.display();
    }
}
