public class Main {
    public static void main(String[] args) {


        //task1

        double [] payment = {12000, 32000, 6000, 21000, 51999};
        double sum = 0;
        for (int i = 0; i < payment.length; i++) {
            sum += payment [i];
        }
        System.out.println( "Сумма трат за месяц составила " + sum + " рублей.");

        //task2

        double min = Double.MAX_VALUE;
        double max = Double.MIN_VALUE;
        for (int i = 0; i < payment.length; i++) {
            if (payment[i] < min) {
                min = payment[i];
            }
            if (payment[i]>max) {
                max = payment[i];
            }
        }
            System.out.println("Минимальная сумма трат за неделю составила " + min + " рублей. " +
                    " Максимальная сумма трат за неделю составила " + max + "рублей");

        //task3

        double average = sum / payment.length;
        System.out.println( "Средняя сумма трат за месяц составила " + average +  "рублей");

        //task4

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >=0 ; i--) {
            System.out.print(reverseFullName[i]);

        }





    }
}