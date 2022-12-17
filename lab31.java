import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Введите размерность массива, начиная от 2:");
        while(!sc.hasNextInt())
        {
            System.out.println("Введите целое число: ");
            sc.next();
        }
       int amountOfEl = sc.nextInt();
        if(amountOfEl <2 ){
            while(amountOfEl < 2){
                System.out.println("Введите целое число от 2: ");
                amountOfEl = sc.nextInt();
            }
        }
        System.out.println("Введите элементы массива:");
 double[] arrayOfDouble = new double[amountOfEl];
 for(int i = 0; i < amountOfEl; i++){
     while(!sc.hasNextInt())
     {
         System.out.println("Введите целое число: ");
         sc.next();
     }
     arrayOfDouble[i] = sc.nextDouble();
 }
 System.out.println("Введите номер элемента, который будет заменяться:");
        while(!sc.hasNextInt())
        {
            System.out.println("Введите целое число: ");
            sc.next();
        }
int amount = sc.nextInt();
        if(amount < 1){
            while(amount < 1){
                System.out.println("Введите целое число от 1: ");
                amount = sc.nextInt();
            }
        }
 System.out.print("Исходный массив:");
 for(int i = 0; i < arrayOfDouble.length; i++)
 {
     System.out.print(arrayOfDouble[i] + " ");
 }
 System.out.println();
        double sum = 0;
        for(int i = 0; i < arrayOfDouble.length; i++)
        {
            if (i == amount + 1){
                break;
            }
            sum += arrayOfDouble[i];
        }
        System.out.println(sum);

if (amount == 1 && amountOfEl == 2)
    arrayOfDouble[amount] = sum / 2;
      else{
          arrayOfDouble[amount] =sum / (amount - 1);
          }
        System.out.print("Новый массив:");
        for(int i = 0; i < arrayOfDouble.length; i++)
        {
            System.out.print(arrayOfDouble[i] + " ");
        }
        sc.close();
    }}
