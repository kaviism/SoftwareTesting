import java.util.*;
public class programST3{
    public static void main(String[]args){
        int shrt;
        Scanner sc=new Scanner(System.in);
        System.out.println("ENter a age:");
        int n=sc.nextInt();
        if(n>=18){
            System.out.println("You are eligible for voting");
        }
        else{
            shrt= (18-n);
            System.out.println("Sorry,You can vote after :"+ shrt + " years");
        }
}
}
