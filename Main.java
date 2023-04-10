import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        int value;
        int result = 0;
        System.out.print("Bir Sayı Giriniz : ");
        number = input.nextInt();

        while(number != 0){
             value = number % 10;
             result += value;
             number /= 10;

        }
        System.out.println(result);









    }
}
