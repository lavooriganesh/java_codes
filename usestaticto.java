class usestaticto{
   static int a=3;
   static int b=0;
    static void gani(String ganesh){
       System.out.println("ganesh="+ganesh);
       System.out.println("a = " + a);
       System.out.println("b = " + b);
}
     static{
     System.out.println("static block");
     b=a*4;
 }
     public static void main(String [] args){
        gani("gani");
}
}


