import java.util.Scanner;
class Power{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int result=1;
System.out.print("enter the base number=");
int base=sc.nextInt();
System.out.print("enter the power number=");
int power=sc.nextInt();
for(int i=1;i<=power;i++){
result*=base;}
System.out.print(result);
}}



