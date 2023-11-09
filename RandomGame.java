import java.util.*;

class RandomGame 
{
	public static void main(String[] args) 
	{
		int randomNumber = giveRandomNumber() ;
		
		guessingTheNumber(randomNumber) ;
	}
	public static int giveRandomNumber(){
		Random random = new Random();

        int randomNumber = random.nextInt(100) + 1 ;

		return randomNumber ;
	}
	public static void guessingTheNumber(int randomNumber){
		Scanner Scan = new Scanner(System.in) ;

		System.out.print("How many rounds you want to play : ") ;
		int numberOfRounds = Scan.nextInt() ;
		int cnt = 1 ;
		int scores = 0 ;
		int wonRounds = 0 ;

		while(numberOfRounds-- > 0){
			int numberOfAttempts = new Random().nextInt(3) + 5 ;
			System.out.println("\n----------------WELCOME TO ROUND NO "+cnt+"----------------") ;
			System.out.println("You have only "+(numberOfAttempts)+" attempts to guess the number.") ;
			while (numberOfAttempts-- > 0)
			{
				System.out.print("Enter a guess (between 1 to 100) : ") ;
				int userGuess = Scan.nextInt() ;

				if (userGuess == randomNumber)
				{
					numberOfAttempts += 1 ; 
					System.out.println("Congratulations! Your guess is correct. The number was: " + randomNumber) ;
					break ;
				}
				else if(userGuess < randomNumber){
					System.out.println("Too Low! Try again") ;
				}
				else{
					System.out.println("Too High! Try again") ;
				}
			}
			if(numberOfAttempts <= 0){
				System.out.println("YOU LOOSE ROUND NO "+cnt) ;
			}
			else{
				System.out.println("You Won ROUND NO "+cnt) ;
				scores += 100 ;
				wonRounds++ ;
			}
			cnt++ ;
			randomNumber = giveRandomNumber() ;
		}
		System.out.println("-------------------------RESULTS-------------------------") ;
		System.out.println("You have won "+wonRounds+" round(s) out of "+(cnt-1)+" rounds.") ;
		System.out.println("You have scored "+scores+" in "+(cnt-1)+" rounds out of "+((cnt-1)*100)+" scores") ;
		System.out.println("------------------------THANK YOU------------------------") ;
	}
}