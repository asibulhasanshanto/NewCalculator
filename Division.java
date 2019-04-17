public class Division{

	int a, int b;

	Division(){
		System.out.println("Nothing is selected");
	}
	Division(int m, int n){
		if(m == 0){
			System.out.println(0);
		}
		else if(n == 0){
			System.out.println("Math Error");
		}
		else{
			double x, y;
			x = (double)m;
			y = (double)n;
			System.out.println(x/y);
		}
	}
}