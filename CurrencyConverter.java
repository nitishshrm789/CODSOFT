import java.util.Scanner ;
class CurrencyConverter
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in) ;
		System.out.println("-------------------WELCOME TO CURRENCY CONVERTER-------------------") ;

		System.out.println("Press 1 for Indian Rupee (INR)") ;
		System.out.println("Press 2 for United States Dollar (USD)") ;
		System.out.println("Press 3 for Euro (EUR)") ;
		System.out.println("Press 4 for Dirham (AED)") ;
		System.out.println("Press 5 for Vietnamese dong (VND)") ;

		System.out.print("\nEnter the above mentioned number for base Currency : ") ;
		int baseCurrency = scan.nextInt() ;

		System.out.print("Enter the above mentioned number for target Currency : ") ;
		int targetCurrency = scan.nextInt() ;

		System.out.print("Enter the amount : ") ;
		double amt = scan.nextDouble() ;

		if(baseCurrency == 1){
			inr_currencyConvertor(baseCurrency, targetCurrency, amt) ;
		}
		else if(baseCurrency == 2){
			usd_currencyConvertor(baseCurrency, targetCurrency, amt) ;
		}
		else if(baseCurrency == 3){
			eur_currencyConvertor(baseCurrency, targetCurrency, amt) ;
		}
		else if(baseCurrency == 4){
			aed_currencyConvertor(baseCurrency, targetCurrency, amt) ;
		}
		else if(baseCurrency == 5){
			vnd_currencyConvertor(baseCurrency, targetCurrency, amt) ;
		}
		else{
			System.out.println("You have entered wrong base currency value or wrong target currency value!!!") ;
		}
	}

	public static void inr_currencyConvertor(int baseCurr, int targetCurr, double amt){
		if(baseCurr==1 && targetCurr==2){
			System.out.println("\nIndian Rupee (INR)  --->   United States Dollar (USD)") ;
			System.out.println(amt+" (INR) --->  "+inr_To_Usd(amt)+" (USD)") ;
		}
		else if(baseCurr==1 && targetCurr==3){
			System.out.println("\nIndian Rupee (INR)  --->   Euro (EUR)") ;
			System.out.println(amt+" (INR) --->  "+inr_To_Eur(amt)+" (EUR)") ;
		}
		else if(baseCurr==1 && targetCurr==4){
			System.out.println("\nIndian Rupee (INR)  --->   Dirham (AED)") ;
			System.out.println(amt+" (INR) --->  "+inr_To_Aed(amt)+" (AED)") ;
		}
		else if(baseCurr==1 && targetCurr==5){
			System.out.println("\nIndian Rupee (INR)  --->   Vietnamese dong (VND)") ;
			System.out.println(amt+" (INR) --->  "+inr_To_vnd(amt)+" (VND)") ;
		}
		else{
			System.out.println("You have entered wrong base currency value or wrong target currency value!!!") ;
		}
	}

	public static void usd_currencyConvertor(int baseCurr, int targetCurr, double amt){
		if(baseCurr==2 && targetCurr==1){
			System.out.println("\nUnited States Dollar (USD)   --->  Indian Rupee (INR)  ") ;
			System.out.println(amt+" (USD)  --->  "+usd_To_Inr(amt)+" (INR)") ;
		}
		else if(baseCurr==2 && targetCurr==3){
			System.out.println("\nUnited States Dollar (USD)   --->   Euro (EUR) ") ;
			System.out.println(amt+" (USD)  --->  "+usd_To_Eur(amt)+" (EUR)") ;
		}
		else if(baseCurr==2 && targetCurr==4){
			System.out.println("\nUnited States Dollar (USD)   --->   Dirham (AED) ") ;
			System.out.println(amt+" (USD)  --->  "+usd_To_Aed(amt)+" (AED)") ;
		}
		else if(baseCurr==2 && targetCurr==5){
			System.out.println("\nUnited States Dollar (USD)   --->   Vietnamese dong (VND) ") ;
			System.out.println(amt+" (USD)  --->  "+usd_To_vnd(amt)+" (VND)") ;
		}
		else{
			System.out.println("You have entered wrong base currency value or wrong target currency value!!!") ;
		}
	}

	public static void eur_currencyConvertor(int baseCurr, int targetCurr, double amt){
		if(baseCurr==3 && targetCurr==1){
			System.out.println("\nEuro (EUR)   --->   Indian Rupee (INR)  ") ;
			System.out.println(amt+" (EUR)  --->  "+eur_To_Inr(amt)+" (INR)") ;
		}
		else if(baseCurr==3 && targetCurr==2){
			System.out.println("\nEuro (EUR)   --->   United States Dollar (USD) ") ;
			System.out.println(amt+" (EUR)  --->  "+eur_To_Usd(amt)+" (USD)") ;
		}
		else if(baseCurr==3 && targetCurr==4){
			System.out.println("\nEuro (EUR)   --->   Dirham (AED) ") ;
			System.out.println(amt+" (EUR)  --->  "+eur_To_Aed(amt)+" (AED)") ;
		}
		else if(baseCurr==3 && targetCurr==5){
			System.out.println("\nEuro (EUR)   --->   Vietnamese dong (VND) ") ;
			System.out.println(amt+" (EUR)  --->  "+eur_To_vnd(amt)+" (VND)") ;
		}
		else{
			System.out.println("You have entered wrong base currency value or wrong target currency value!!!") ;
		}
	}

	public static void aed_currencyConvertor(int baseCurr, int targetCurr, double amt){
		if(baseCurr==4 && targetCurr==1){
			System.out.println("\nDirham (AED)   --->   Indian Rupee (INR) ") ;
			System.out.println(amt+" (AED)  --->  "+aed_To_Inr(amt)+" (INR)") ;
		}														   
		else if(baseCurr==4 && targetCurr==2){					   
			System.out.println("\nDirham (AED)   --->   United States Dollar (USD) ") ;
			System.out.println(amt+" (AED)  --->  "+aed_To_Usd(amt)+" (USD)") ;
		}														   
		else if(baseCurr==4 && targetCurr==3){					   
			System.out.println("\nDirham (AED)   --->   Euro (EUR) ") ;
			System.out.println(amt+" (AED)  --->  "+aed_To_Eur(amt)+" (EUR)") ;
		}														   
		else if(baseCurr==4 && targetCurr==5){					   
			System.out.println("\nDirham (AED)   --->    Vietnamese dong (VND) ") ;
			System.out.println(amt+" (AED)  --->  "+aed_To_vnd(amt)+" (VND)") ;
		}
		else{
			System.out.println("You have entered wrong base currency value or wrong target currency value!!!") ;
		}
	}

	public static void vnd_currencyConvertor(int baseCurr, int targetCurr, double amt){
		if(baseCurr==5 && targetCurr==1){
			System.out.println("\nVietnamese dong (VND)   --->   Indian Rupee (INR) ") ;
			System.out.println(amt+" (VND)  --->  "+vnd_To_Inr(amt)+" (INR)") ;
		}
		else if(baseCurr==5 && targetCurr==2){
			System.out.println("\nVietnamese dong (VND)   --->   United States Dollar (USD) ") ;
			System.out.println(amt+" (VND)  --->  "+vnd_To_Usd(amt)+" (USD)") ;
		}
		else if(baseCurr==5 && targetCurr==3){
			System.out.println("\nVietnamese dong (VND)   --->   Euro (EUR) ") ;
			System.out.println(amt+" (VND)  --->  "+vnd_To_Eur(amt)+" (EUR)") ;
		}
		else if(baseCurr==5 && targetCurr==4){
			System.out.println("\nVietnamese dong (VND)   --->   Dirham (AED) ") ;
			System.out.println(amt+" (VND)  --->  "+vnd_To_Aed(amt)+" (AED)") ;
		}
		else{
			System.out.println("You have entered wrong base currency value or wrong target currency value!!!") ;
		}
	}


	public static double inr_To_Usd(double amt){
		return amt/83.12 ;
	}
	public static double inr_To_Eur(double amt){
		return amt/88.11 ;
	}
	public static double inr_To_Aed(double amt){
		return amt/22.63 ;
	}
	public static double inr_To_vnd(double amt){
		return amt/0.0034 ;
	}

	public static double usd_To_Inr(double amt){
		return amt/0.012 ;
	}
	public static double usd_To_Eur(double amt){
		return amt/1.06 ;
	}
	public static double usd_To_Aed(double amt){
		return amt/0.27 ;
	}
	public static double usd_To_vnd(double amt){
		return amt/0.000041 ;
	}

	public static double eur_To_Inr(double amt){
		return amt/0.011 ;
	}
	public static double eur_To_Usd(double amt){
		return amt/0.94 ;
	}
	public static double eur_To_Aed(double amt){
		return amt/0.26 ;
	}
	public static double eur_To_vnd(double amt){
		return amt/0.000039 ;
	}

	public static double aed_To_Inr(double amt){
		return amt/0.044 ;
	}
	public static double aed_To_Usd(double amt){
		return amt/3.67 ;
	}
	public static double aed_To_Eur(double amt){
		return amt/3.89 ;
	}
	public static double aed_To_vnd(double amt){
		return amt/0.00015 ;
	}

	public static double vnd_To_Inr(double amt){
		return amt/293.37 ;
	}
	public static double vnd_To_Usd(double amt){
		return amt/24384.95 ;
	}
	public static double vnd_To_Eur(double amt){
		return amt/25854.76 ;
	}
	public static double vnd_To_Aed(double amt){
		return amt/6638.97 ;
	}	
}