import java.util.Scanner;

public class Implement {

    public static int sumArray(){
        int[] array = new int[]{1,5,6,8,9,10,20,25};
        int sum = 0;

        //iterare over the array

        for (int x : array){
            sum+=x;
        }

        return sum;
    }

    public static  int checkthenumber(int number)
    {
        int sum = 0;
        String numberString = String.valueOf(number);
        int length = numberString.length();
        while (number > 0){
            int value = number % 10;
            sum = (int) (sum + (Math.pow(value,length)));
            number = number /10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int sum = sumArray();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number you want: ");
        int number = scanner.nextInt();
        int x = checkthenumber(number);

        System.out.println("The sumation of array function: " + sum);

        System.out.println("The power of a number: "+ x);
    }
}
