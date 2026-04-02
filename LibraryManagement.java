package org.testleaf.week3;

public class LibraryManagement {
    public static void main (String[]args){
         Library obj1 = new Library();
        String bookTitle = obj1.addBook("hii");
        System.out.println(bookTitle);
        obj1.issueBook();

       

    }

}
