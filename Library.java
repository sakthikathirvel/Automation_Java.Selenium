package org.testleaf.week3;

public class Library {
     public String addBook(String bookTitle){
        System.out.println("Book added successfully");
        return bookTitle;
     }

     public void issueBook(){
            System.out.println("Book issued successfully");

        }
    
    public static void main(String args[]){
        Library obj1 = new Library();
        String bookTitle = obj1.addBook("MIND");
        System.out.println("name of thebook is: "+bookTitle);
        
        obj1.issueBook();
       


    }

}
