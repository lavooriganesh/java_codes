class animal{
    void eat(){
        System.out.println("food is good");
    }
}
    class cat extends animal{
      void  tasty(){
        System.out.println("tasty good");
        }
    }
    class dog extends cat{
        void jump(){
            System.out.println("jumping");

        }
        
    }
    public class animalll{
        public static void main(String [] args){
            dog d = new dog();
            d.tasty();
            d.eat();
            d.jump();
        }
    }
