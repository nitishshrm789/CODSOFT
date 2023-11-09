import java.util.* ;
class StudentGradeCalculator 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in) ;
		System.out.println("---------------------------------WELCOME TO STUDENT GRADE CALCULATOR---------------------------------") ;

		System.out.print("Enter the number of Subject you have : ") ;
		int n = scan.nextInt() ;

		double totalSum = calculatingTotalMarks(n) ;
		double avgPercentage = calculatePercentage(totalSum, n) ;
		String grade = gradeCalculation(avgPercentage) ;

		System.out.println("Total Marks (out of "+(n*100)+") :- "+totalSum) ;
		System.out.println("Percentage :- "+avgPercentage) ;
		System.out.println("Grade :- "+grade) ;

		System.out.println("----------------------------------------------THANK YOU---------------------------------------------") ;

	}
	public static double calculatingTotalMarks(int totalSubjects){
		Scanner scan = new Scanner(System.in) ;
		double sum = 0 ;
		for(int i = 1; i <= totalSubjects; i++){
			System.out.print("Enter the marks in subject "+i+" :- ") ;
			double mark = scan.nextDouble() ;
			
			sum = sum + mark ;
		}
		return sum ;

	}
	public static double calculatePercentage(double totalSum, int totalSubject){
		double percentage = (totalSum/totalSubject) ;
		return percentage ;

	}
	public static String gradeCalculation(double percentage){
		String grade = null ;
		if(percentage>=91 && percentage<=100){
			grade = "A1" ;
		}
		else if(percentage>=81 && percentage<=90){
			grade = "A2" ;
		}
		else if(percentage>=71 && percentage<=80){
			grade = "B1" ;
		}
		else if(percentage>=61 && percentage<=70){
			grade = "B2" ;
		}
		else if(percentage>=51 && percentage<=60){
			grade = "C1" ;
		}
		else if(percentage>=41 && percentage<=50){
			grade = "C2" ;
		}
		else if(percentage>=33 && percentage<=40){
			grade = "D" ;
		}
		else if(percentage>=21 && percentage<=32){
			grade = "E1" ;
		}
		else if(percentage>=0 && percentage<=20){
			grade = "E2" ;
		}
		return grade ;
	}
}