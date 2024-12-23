import java.util.*;
class Account{

	int accountno;
	double balance;
	 String  name,type;

	


	Account(int acno,  String  n,double bal)
	 {
	   accountno=acno;
	   name=n;
	   balance=bal;
         }
	
	 }
	class Curaccnt extends Account{
	 double min=500;
         double service_charge=100;
	 

	 Curaccnt(int accountno, String  name,double balance)
	 { 
	  super(accountno,name,balance);
	 }
	 void Checkbalance()
         {
	 if(balance<min)
         balance=balance+service_charge;
	 System.out.println("balance should be minimum"+min);
	 System.out.println("amount to be paid is"+balance);
         }
         }

 	class Savaccnt extends Account{
	 Savaccnt(int accountno, String name,double balance)
	 { 
	   super(accountno,name,balance);
         }
            double withdraw()
 	 {
           Scanner sc=new Scanner(System.in);

          System.out.println("enter amount to be withdrawn");
	  double withdraw1=sc.nextDouble();
	  balance=balance-withdraw1;
	  System.out.println("withdrawal successful");
	  return balance;
 	 }
         void compound_int()
         {double i=1.5;
           Scanner sc=new Scanner(System.in);

	  System.out.println("enter years");
 	  double t=sc.nextDouble();
    	  double ci=balance*Math.pow((1+(i/100),(100*t))-balance;
	  System.out.println("compund interest is"+ci);
	 }
	 }
	  




    	 class Bank{
         public static void main(String args[]){

	
	 Scanner sc=new Scanner(System.in);
	 System.out.println("enter name");
	 String  name=sc.next();
	 System.out.println("enter account number");
	 int accountno=sc.nextInt();
	
	 System.out.println("enter balance");
	 double balance=sc.nextInt();
 	

         System.out.println("ENTER type of account\n 1)current 2)savings");
	 int choice=sc.nextInt();
	 if(choice==1)
	 {
	   Curaccnt obj1=new Curaccnt(accountno,name,balance);

            obj1.Checkbalance();
	 }
         else
	 {
          Savaccnt obj2=new Savaccnt(accountno,name,balance);
          System.out.println("choose one\n 1)withdraw \n 2)compound interest");
	  int option=sc.nextInt();
          if(option==1)
         { 
	   double w=obj2.withdraw();
	   System.out.println("the balance amount left is"+w);
         }
         else 
         {
           obj2.compound_int();
         }
           
         }
         }
         }
                   
         

