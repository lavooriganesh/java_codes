abstract class vehicle{
  abstract void start();
}
  class car extends vehicle{
    void start(){
   System.out.println("car stars with key");
   }
}  
   class bike extends vehicle{
   void start(){
   System.out.println("bike start with kick");
}
   public static void main(String [] args){
   car c = new car();
   c.start();
   bike b = new bike();
   b.start();
}}

