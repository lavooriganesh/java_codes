import java.util.Scanner;
public class primecheck{
public static void main(String[] args){
         Scanner sc = new
 Scanner(System.in);
         System.out.print("enter a number:");
         int num = sc.nextInt();
         sc.close();
         boolean isprime=num > 1;
         for(int i=2;i*i <=num;i++){
         if(num % i==0){
            isprime=false;
            break;
}
}
System.out.println(num + (isprime ? " is a prime number." :" is not a prime number."));
}
}
