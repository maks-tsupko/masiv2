public class Main {
    public static void main(String[] args) {
        System.out.println("задача 1");
        int[] money = {1000, 1200, 1150, 2500, 2700};
        int sum = 0;
        for (int index = 0; index < money.length; index++) {
            sum = sum + money[index];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");

        System.out.print(" ");
        System.out.println("задача 2");
        int[] money2 = {200, 250, 310, 400, 150};
        int sumMax1 = 0;
        int sumMin = money2[0];
        for (int i = 0; i < money2.length; i++) {
            final int current = money2[i];
            if (current > sumMax1) {
                sumMax1 = current;
            }
        }
        for (int i = 0; i < money2.length; i++)
            if (money2[i] < sumMin) {
                sumMin = money2[i];

            }
        System.out.println("Минимальная сумма трат за неделю составила " + sumMin + " рублей");
        System.out.println("Максимальная сумма трат за неделю составила " + sumMax1 + " рублей");

        System.out.println(" ");
        System.out.println("задача 3");
        double[] money3 = {1000, 1200, 1150, 2500, 2700};
        double sum3 = 0;
        double averageAmount = 0;
        for (int i = 0; i < money3.length; i++) {
            sum3 = sum3 + money3[i];
        }
        sum3 = sum3 / 5;
        System.out.println(sum3);
        
        System.out.println("Средняя сумма трат за месяц составила " + averageAmount + " рублей");
        System.out.println(" ");
        System.out.println("задача 4");
        char[] reverseFullName = {'n' , 'a' , 'v' , 'I' , ' ' , 'v' , 'o' , 'n' , 'a' , 'v' ,'I'};
        int left = 0;
        int right = reverseFullName.length - 1;
        while (left < right) {
            char temp = reverseFullName[left];
            reverseFullName[left] = reverseFullName[right];
            reverseFullName[right] = temp;
            left++;
            right--;
        }
        System.out.println(reverseFullName);


    }
}
