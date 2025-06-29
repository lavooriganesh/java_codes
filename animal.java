class animal{
  void eat(){

   System.out.println("i am eating");
}}

   class cat extends animal{
    void tasty(){
    System.out.println("tasty food");
}}

  class pet extends cat{
   void jump(){
   System.out.println("and jumping ");
   }

   public static void main(String [] args){ 
   pet P = new pet();
     P.eat();
     P.tasty();
     P.jump();
}
}