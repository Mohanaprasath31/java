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
