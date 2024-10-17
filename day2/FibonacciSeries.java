package week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=8;
int firstnumber=0;
int secondnumber=1;
{
for (int i=1; i<=n; i++) {
	System.out.println(firstnumber);
	int next=firstnumber + secondnumber;
	firstnumber=secondnumber;
	secondnumber=next;
}
}
		

	}

}
  