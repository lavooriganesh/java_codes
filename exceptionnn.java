class division{///exception handling single inheritance
    int divide(int a,int b){
        return a/b;
    }
}
class exceptionnn extends division{
    public static void main(String [] args){
        exceptionnn d = new exceptionnn();
        try{
            int result = d.divide(10,0);
            System.out.println(result);  
        }
        catch(ArithmeticException e){
            System.out.println("cannot divides by zero");}
              finally{
            System.out.println("program is end");
            }
    
        }
        }
