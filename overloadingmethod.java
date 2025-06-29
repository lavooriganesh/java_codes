public class overloadingmethod {
    public int add (int a,int b){
        return a+b;
    }
    public int add(int a,int b,int c){
        return a+b+c;
    }
    public double add(double a,double b){
        return a+b;
    }
    public static void main(String [] args){
        overloadingmethod v = new overloadingmethod();
        System.out.println("sum of two integers:"+ v.add(5,10));
System.out.println("sum of three intergers :"+ v.add(5,10,30));
System.out.println("sum of two double:"+ v.add(10.5,30));
    }
}
