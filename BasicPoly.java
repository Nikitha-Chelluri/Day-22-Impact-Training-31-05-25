// Write a prg to create a class animal as a animal and method name is sound and create 2 subclass cat and bird override the siund method in each cls to create specific sound for each animal
import java.util.*;
class Animal{
    public void sound(){
        System.out.println("animal roars:");
        
    }
}
class cat extends Animal{
    public void sound(){
        System.out.println("cat meows:");
    }
    
}
class bird extends Animal{
    public void sound(){
        System.out.println("Bird chirps:");
    }
    
}
class Main{
    public static void main(String[]args){
    Animal a=new Animal();
    cat c=new cat();
    bird b=new bird();
    a.sound();
    b.sound();
    c.sound();
    }
}
