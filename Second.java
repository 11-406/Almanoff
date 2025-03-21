import java.util.Scanner;
class Second{
	public static void main(String [] args){
		Scanner scn = new Scanner(System.in);
		
		int p = scn.nextInt();
		
		if(p%2== 0){
			System.out.println("Не простое!");
		}else{
			for(int i = 2; i < p;i++){
				if(p%i==0){
					System.out.println("Не простое!");
					break;
				}
			}
		}
	}
}