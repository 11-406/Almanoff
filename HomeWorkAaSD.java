import java.util.Scanner;
import java.util.Random;

public class HomeWorkAaSD{
    public static void main(String [] args){
        Scanner scn = new Scanner(System.in);
        Random rand = new Random();

        int num = scn.nextInt();
        int count = scn.nextInt();
        boolean flag = true;
        int random_in_num;

        while(count > 0){
            if(num == 2){
                break;
            }
            if(num % 2 == 0){
                flag = false;
                break;
            }
            random_in_num = rand.nextInt(2, num);
            if((Math.pow(random_in_num, num - 1) % num) != 1){
                flag = false;
            } else{
                flag = true;
            }
            count--;
        }
        System.out.println("Число " + num + " простое - " + flag);
    }

}
