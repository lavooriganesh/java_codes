class box{
  double width;
  double height;
  double depth;
   box(){
     System.out.println("constructor box");
     width=10;
     height=20;
     depth=30;
  }
    double volume(){
     return width*height*depth;
}
}
       class assignmentconstructor{
       public static void main(String [] args){
         box mybox1= new box();
         box mybox2= new box();
        double vol;
          vol=mybox1.volume();
            System.out.println("volume is " +vol);
          vol =mybox2.volume();
            System.out.println("volume is " + vol);
}
}