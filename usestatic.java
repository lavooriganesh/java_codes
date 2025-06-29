class usestatic{
   static int a=3;
   static int b;
   //static int g;
    static void math(int x){
    System.out.println(" x = "+ x);
    System.out.println(" a = "+ a);
    System.out.println(" b = "+ b);
    //System.out.println(" g = "+ g);

}
    static{
      System.out.println("static block initialized");
      b=a*4;
      System.out.println("static block initialized");
      a=b*4;
      //System.out.println("static block initialized updated");
      //g=a*b;

     }
      public static void main(String [] args){
          math(42);
}
}

    