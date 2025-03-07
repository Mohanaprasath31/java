class Animal{
    String name;
    int age;
    
    void makeSound()
    {
        System.out.println("Animal makes sound");
        
    }
}
class Dog extends Animal{
    String breed;
    @Override
    void makeSound(){
        System.out.println("Dog barks");
    }
    void fetch()
    {
        System.out.println("Dog is fetching");
    }
}
class Cat extends Animal{
    String Colour;
    @Override
    void makeSound(){
        System.out.println("meowww.......sound");
    }
    void climb()
    {
        System.out.println("cat is climbing");
    }
}
      public class MainClass {
          public static void main (String[] args){
              Dog d1 = new Dog();
              d1.name="Timmy";
              d1.age=2;
              d1.breed="Husky";
              d1.makeSound();
              d1.fetch();
              
              Cat c1=new Cat();
              c1.name="Moon";
              c1.age=2;
              c1.Colour="White";
              c1.makeSound();
              c1.climb();
          }
      }
    
------------------------------------------------------------------------------------------------------------------------------------------------
class Book {
    private String name;
    private String author;
    private String isbn;
    private int stock;
    public Book() {
        this.name = "Unknown";
        this.author = "Unknown";
        this.isbn = "000000";
        this.stock = 0;
    }
    public Book(String name, String author, String isbn, int stock) {
        this.name = name;
        this.author = author;
        this.isbn = isbn;
        this.stock = stock;
    }
    public Book(Book other) {
        this.name = other.name;
        this.author = other.author;
        this.isbn = other.isbn;
        this.stock = other.stock;
    }
    public void displayDetails() {
        System.out.println("Book Name: " + name);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
        System.out.println("Stock: " + stock);
        System.out.println("-----------------------");
    }

    public void updateStock(int newStock) {
        if (newStock >= 0) {
            this.stock = newStock;
            System.out.println("Stock updated successfully.");
        } else {
            System.out.println("Stock cannot be negative.");
        }
    }
    public class Library {
    public static void main(String args[]) {
        Book book1 = new Book();
        System.out.println("Default Constructor:");
        book1.displayDetails();

        Book book2 = new Book("The Alchemist", "Paulo Coelho", "123456789", 10);
        System.out.println("Parameterized Constructor:");
        book2.displayDetails();
        
        Book book3 = new Book(book2);
        System.out.println("Copy Constructor (Duplicate Book):");
        book3.displayDetails();
        System.out.println("Updating stock for 'The Alchemist'...");
        book2.updateStock(15);
        book2.displayDetails();
    }
  }
}


