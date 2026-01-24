package Encapsulation;

public class Solution {
	public static void main(String[] args) {
		SavingsAccount sa=new SavingsAccount(1234, "hari", 12000.97);
		System.out.println("Present Account balance of A/c no.: "+sa.getAcno()+" A/c Holder-Name: "+ sa.getNm()+" is : "+sa.getBlc());
		sa.Facilties();
		sa.deposit(1000);
		sa.deposit(-1000);
		sa.deposit(-2000.00);
		sa.deposit(2000.03);
		sa.withdrawal(11000.05,"Study");
		sa.withdrawal(4100.95);
		sa.withdrawal(4100.95, "Exam");
		sa.withdrawal(4000.95);

		CurrentAccount ca=new CurrentAccount(1235, "hari", 12000.00);
		System.out.println("Present Account balance of A/c no.: "+ca.getAcno()+" A/c Holder-Name: "+ca.getNm()+" is : "+ca.getBlc());
		ca.Facilties();
		ca.deposit(1000);
		ca.deposit(-1000);
		ca.deposit(-2000.00);
		ca.deposit(2000.00);
		ca.withdrawal(11000,"Study");
		ca.withdrawal(4100);
		ca.withdrawal(4100, "Exam");
		ca.withdrawal(4000, "Exam");
	}
}

abstract interface BankAccount {
	public abstract void deposit(int amt); //cash
	public abstract void deposit(double amt); //online
	public abstract void withdrawal(double amt); //with remark 
	public abstract void withdrawal(double amt, String remark); //without remark
}

class BankAccountDetails {
	private int acno;
	private String nm;
	private double blc;
	
	public BankAccountDetails() {
		
	}
	public BankAccountDetails(int acno,String nm,double blc) {
		setAcno(acno);
		setNm(nm);
		setBlc(blc);
	}
	
	public int getAcno() {
		return acno;
	}
	public void setAcno(int acno) {
		this.acno = acno;
	}
	public String getNm() {
		return nm;
	}
	public void setNm(String nm) {
		this.nm = nm;
	}
	public double getBlc() {
		return blc;
	}
	public void setBlc(double blc) {
		this.blc = blc;
	}
}

class SavingsAccount extends BankAccountDetails implements BankAccount  {
	public SavingsAccount() {
		super();
	}
	public SavingsAccount(int acno,String nm,double blc) {
		super(acno, nm, blc);
	}
	
	@Override
	public void deposit(int amt) {
		System.out.println("\nDeposit money !! Dont input negative amount !!");
		
		try {
			InvalidAmountException.checkneg((double)amt);
			double crnt=this.getBlc();
			this.setBlc((double)(crnt+amt));
			System.out.println("\nCash type Deposit of "+amt+" is Successful !! ");
		} catch (InvalidAmountException e) {
			System.out.println("\nDeposit amount cannot be negative !!");
		} finally {
			System.out.println("\nCurrent Account balance is : "+this.getBlc());
		}
		
	}
	public void deposit(double amt) {
		System.out.println("\nDeposit money !! Dont input negative amount !!");
		
		try {
			InvalidAmountException.checkneg(amt);
			double crnt=this.getBlc();
			this.setBlc((double)(crnt+amt));
			System.out.println("\nOnline type Deposit of "+amt+" is Successful !! ");
		} catch (InvalidAmountException e) {
			System.out.println("\nDeposit amount cannot be negative !!");
		} finally {
			System.out.println("\nCurrent Account balance is : "+this.getBlc());
		}
		
	}
	public void withdrawal(double amt) {

		System.out.println("\nWithdraw money !! But Dont exhaust current account balance !!");
		try {
			double crnt =this.getBlc();
			double rqst=amt;
			InsufficientAmountException.allowwithdrawal(rqst, crnt);
			this.setBlc((double)(crnt-rqst));
			System.out.println("\nWithdrawal of "+amt+" is Successful !!");
			System.out.println("No Remarks !!");
		} catch (InsufficientAmountException e) {
			System.out.println("\nWithdrawal amount cannot exceed current account balance !!");
		} finally {	
			System.out.println("\nCurrent Account balance is : "+this.getBlc());
		}
	}
	public void withdrawal(double amt,String remark) {

		System.out.println("\nWithdraw money !! But Dont exhaust current account balance !!");
		try {
			double crnt =this.getBlc();
			double rqst=amt;
			InsufficientAmountException.allowwithdrawal(rqst, crnt);
			this.setBlc((double)(crnt-rqst));
			System.out.println("\nWithdrawal of "+amt+" is Successful !!");	
			System.out.println("Remark: "+remark);
		} catch (InsufficientAmountException e) {
			System.out.println("\nWithdrawal amount cannot exceed current account balance !!");
		} finally {	
			System.out.println("\nCurrent Account balance is : "+this.getBlc());
		}
	}
	
	public void Facilties() {
		System.out.println("============Savings Account Facilities===========");
		System.out.println("1. Savings Account Interest rate @4.25% quarterly");
		System.out.println("2. FD Sweep-In Facility !!");
	}
}

class CurrentAccount extends BankAccountDetails implements BankAccount  {
	public CurrentAccount() {
		super();
	}
	public CurrentAccount(int acno,String nm,double blc) {
		super(acno, nm, blc);
	}
	
	@Override
	public void deposit(int amt) {
		System.out.println("\nDeposit money !! Dont input negative amount !!");
		
		try {
			InvalidAmountException.checkneg((double)amt);
			double crnt=this.getBlc();
			this.setBlc((double)(crnt+amt));
			System.out.println("\nCash type Deposit of "+amt+" is Successful !! ");
		} catch (InvalidAmountException e) {
			System.out.println("\nDeposit amount cannot be negative !!");
		} finally {
			System.out.println("\nCurrent Account balance is : "+this.getBlc());
		}
		
	}
	public void deposit(double amt) {
		System.out.println("\nDeposit money !! Dont input negative amount !!");
		
		try {
			InvalidAmountException.checkneg(amt);
			double crnt=this.getBlc();
			this.setBlc((double)(crnt+amt));
			System.out.println("\nOnline type Deposit of "+amt+" is Successful !! ");
		} catch (InvalidAmountException e) {
			System.out.println("\nDeposit amount cannot be negative !!");
		} finally {
			System.out.println("\nCurrent Account balance is : "+this.getBlc());
		}
		
	}
	public void withdrawal(double amt) {

		System.out.println("\nWithdraw money !! But Dont exhaust current account balance !!");
		try {
			double crnt =this.getBlc();
			double rqst=amt;
			InsufficientAmountException.allowwithdrawal(rqst, crnt);
			this.setBlc((double)(crnt-rqst));
			System.out.println("\nWithdrawal of "+amt+" is Successful !!");
			System.out.println("No Remarks !!");
		} catch (InsufficientAmountException e) {
			System.out.println("\nWithdrawal amount cannot exceed current account balance !!");
		} finally {	
			System.out.println("\nCurrent Account balance is : "+this.getBlc());
		}
	}
	public void withdrawal(double amt,String remark) {

		System.out.println("\nWithdraw money !! But Dont exhaust current account balance !!");
		try {
			double crnt =this.getBlc();
			double rqst=amt;
			InsufficientAmountException.allowwithdrawal(rqst, crnt);
			this.setBlc((double)(crnt-rqst));
			System.out.println("\nWithdrawal of "+amt+" is Successful !!");	
			System.out.println("Remark: "+remark);
		} catch (InsufficientAmountException e) {
			System.out.println("\nWithdrawal amount cannot exceed current account balance !!");
		} finally {	
			System.out.println("\nCurrent Account balance is : "+this.getBlc());
		}
	}

	public void Facilties() {
		System.out.println("============Current Account Facilities===========");
		System.out.println("1. Current Account Interest rate @2.25% quarterly");
		System.out.println("2. Overdraft Facility !!");
	}
}


class InvalidAmountException extends RuntimeException {
	public InvalidAmountException(String message) {
		super(message);
	}
	
	static void checkneg(double amt) {
		if(amt<=0) {
			throw new InvalidAmountException("Deposit Amount cannot be negative !! Please try again !!");
		}
	}
}

class InsufficientAmountException extends RuntimeException {
	public InsufficientAmountException(String message) {
		super(message);
	}
	
	static void allowwithdrawal(double rqst,double crnt) {
		if(rqst>crnt) {
			throw new InsufficientAmountException("Withdrawal Amount cannot exceed exisiting account balance !! Please try again !!");
		}
	}
}