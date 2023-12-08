public class Mul_inhe {
    public void animalSound() {
        System.out.println("The animal makes a sound");
      }
    }
    
class Pig extends Mul_inhe {
      public void animalSound() {
        System.out.println("The pig says: wee wee");
      }
    }
    
class Dog extends Mul_inhe {
      public void animalSound() {
        System.out.println("The dog says: bow wow");
      }
    }
    
class Main {
      public static void main(String[] args) {
        Mul_inhe myAnimal = new Mul_inhe();  
        Mul_inhe myPig = new Pig();  //pehle parent class likhte hai baadme child class
        Mul_inhe myDog = new Dog();  
        myAnimal.animalSound();
        myPig.animalSound();
        myDog.animalSound();
      }
  }

