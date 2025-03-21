//алгоритмы и структуры данных
import java.util.Scanner;
class First{
	public static void main(String [] args){
		Scanner scn = new Scanner(System.in);
		int x = scn.nextInt();
		int p = scn.nextInt();
		
		double start = System.nanoTime();
		
		int res = 1;
		
		while(p>0){
			if(p%2 != 0){
				res = res*x;
				x*= x;
				p = p/ 2;
			} else{
				x*= x;
				p = p / 2;
			}
		}
		double end = System.nanoTime();
		System.out.println(res + " , " +  (end - start)/1000);
		
		int x1 = scn.nextInt();
		int p1 = scn.nextInt();
		
		start = System.nanoTime();
		
		res = 1;
		
		for(int i = 0; i  < p1; i++){
			res*=x1;
		}
		
		end = System.nanoTime();
		System.out.println(res + " , " +  (end - start)/1000);
	}
}