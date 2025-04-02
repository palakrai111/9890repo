package javaproject;

public class BankApplicatonDemo {

	int balance = 1000;
	int acc_no;
	String accholder;
	BankApplicatonDemo(int acc_no,String accholder)
	{
		this.acc_no = acc_no;
	   this.accholder = accholder;
	}
	
	void withraw(int wamt)
	{
		if(wamt < balance)
		{
			balance = balance - wamt;
		}
		else
		{
			System.out.println("insuficient bal");
		}
	}
	void deposit(int damt)
	{
		balance = balance + damt;
	}
	void checkBalance()
	{
		System.out.println("amt in my acc  is :" + balance);
	}
	void display() 
	{
		System.out.println(accholder + " "+acc_no +" " + balance);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankApplicatonDemo ob  = new BankApplicatonDemo(2333,"palak");
		ob.withraw(500);
		ob.deposit(1500);
		ob.checkBalance();
		ob.display();
	}

}
