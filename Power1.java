import java.util.Scanner;
class Power1{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int base;
int power;
int result=1;
System.out.print("enter the base number=");
base=sc.nextInt();
System.out.print("enter the power number=");
power=sc.nextInt();
for(int i=1;i<=power;i++){
result *=base;}
System.out.println(result);}}


