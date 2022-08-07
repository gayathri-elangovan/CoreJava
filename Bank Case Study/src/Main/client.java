package Main;
import BankFramework.BankFactory;
import BankApplication.MMBankFactory;
import BankApplication.MMCurrentAcc;
import BankApplication.MMSavingAcc;
import BankFramework.BankFactory;
import BankFramework.CurrentAcc;
import BankFramework.SavingAcc;
public class client{
	public static void main(String args[])
	{
		BankFactory bf = new MMBankFactory();
		SavingAcc sa = new MMSavingAcc(121,"Gayathri",5000);
		sa.withdraw(500);
		CurrentAcc ca = new MMCurrentAcc(122,"Vasanthi",5000);
		ca.withdraw(500);
	}

}