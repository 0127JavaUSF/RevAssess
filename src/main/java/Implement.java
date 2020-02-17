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
        int x = checkthenumber(20);

        System.out.println(sum);

        System.out.println(x);
    }
}
