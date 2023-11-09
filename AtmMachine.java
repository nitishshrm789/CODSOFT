import java.util.* ;

class AtmMachine 
{
	static double balance ;
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in) ;
		System.out.println("---------------Welcome to ATM Machine---------------") ;
		//System.out.println("Note :- Your Bank should have min of 2000 rupees.") ;
		
		while(true) {
			System.out.println("\n_____________________________________") ;
			System.out.println("Press 1 to check Balance.\t    |") ;
			System.out.println("Press 2 to Deposit your amount.\t    |") ;
			System.out.println("Press 3 to Debit your amount.\t    |") ;
			System.out.println("Press 4 to exit.\t\t    |") ;
			System.out.println("_____________________________________\n") ;

			System.out.print("Enter your input : ") ;
			int ip = scan.nextInt() ;

			switch (ip)
			{
				case 1 : {
					System.out.println("---------------BALANCE---------------") ;
					double balance = checkBalance() ;
					System.out.println("Balance : "+balance) ;
					System.out.println("-------------------------------------") ;
				break ;
				}
				case 2 : {
					System.out.print("Enter the amount you want to deposited : ") ;
					double amt = scan.nextInt() ;
					double deposit = deposit(amt) ;
					System.out.println("---------------BALANCE---------------") ;
					System.out.println("TRANSACTION SUCCESSFUL!") ;
					System.out.println("Balance : "+deposit) ;
					System.out.println("-------------------------------------") ;
					break ;
				}
				case 3 : {
					System.out.print("Enter the amount you want to debited : ") ;
					double amt = scan.nextInt() ;
					System.out.println("---------------BALANCE---------------") ;
					if(amt>=0 && amt<=balance){
						System.out.println("TRANSACTION SUCCESSFUL!") ;
					}
					else{
						System.out.println("TRANSACTION UNSUCCESSFUL!") ;
					}
					double withdraw = withdraw(amt) ;
					System.out.println("Balance : "+balance) ;
					System.out.println("-------------------------------------") ;
					break ;
				}
				case 4 : {
					break ;
				}
				default : {
					System.out.println("You have entered Wrong key. Please Re-Enter") ;
					continue ;
				}
			
			}
			if(ip == 4){
				System.out.println("-----------------------------------Thank You-----------------------------------") ;
				break ;
			}
		}
	}
	public static double checkBalance(){
		return balance ;
	}
	public static double withdraw(double amount){
		if(amount>=0 && amount <= balance){
			balance -= amount ;
		}
		else if(amount<0){
			//System.out.println("-----------------------") ;
			System.out.println("Wrong Withdrawl Amount!") ; 
			//System.out.println("-----------------------") ;
		}
		/*else if((balance-amount) <= 2000){
			System.out.println("---------------------------------------------------------------------------------------") ;
			System.out.println("Insufficient Balace.\nYour bank cannot have less than 2000 rupees after withdrawing") ;
			System.out.println("---------------------------------------------------------------------------------------") ;
		}*/
		else{
			System.out.println("------------------------") ;
			System.out.println("   INSUFFICIENT FUNDS!   ") ;
			System.out.println("------------------------") ;
		}
		return balance ;
	}
	public static double deposit(double amount){
		if(amount > 0){
			balance += amount ;
		}
		return balance ;
	}
}