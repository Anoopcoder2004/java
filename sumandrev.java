import java.util.scanner;
class SumAndRev
{
	public static void main(string args[])
	{
	 Scanner Scanner = new Scanner (System.in);
	 System.out.println("Enter a number");
	 int n = scanner.nextInt();
	 int sum = 0;
	 int rev = 0;	
	 int d;
	 while(n>0)
	 {
		d = n % 10;
		sum = sum + d;
		rev = rev * 10 + d;
		n = n / 10;
	 }
	 System.out.println("The sum is"+ sum);
	 System.out.println("The reverse is"+ rev);
	}
}