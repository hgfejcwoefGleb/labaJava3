import java.util.Scanner;
import java.util.Arrays;
public class Aboba {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] newArr = null;
        System.out.println("Введите размерность массива, начиная от 2:");
        while(!sc.hasNextInt())
        {
            System.out.println("Введите целое число: ");
            sc.next();
        }
        int amountOfEl = sc.nextInt();
        if(amountOfEl < 2 ){
            while(amountOfEl < 2 ){
                System.out.println("Введите целое число от 2: ");
                amountOfEl = sc.nextInt();
            }
        }
        System.out.println("Введите элементы массива:");
        int[] arrayOfDouble = new int[amountOfEl];
        for(int i = 0; i < amountOfEl; i++){
            while(!sc.hasNextInt())
            {
                System.out.println("Введите целое число: ");
                sc.next();
            }
            arrayOfDouble[i] = sc.nextInt();
        }
        System.out.println("Введите целое число, которое хотите удалить: ");
        while(!sc.hasNextInt())
        {
            System.out.println("Введите целое число: ");
            sc.next();
        }
        int deletedEl = sc.nextInt();
        System.out.println("Исходный массив: "+Arrays.toString(arrayOfDouble));
        for (int i = 0; i < arrayOfDouble.length-1; i++) {
            if(arrayOfDouble[i] == deletedEl)
            {
                newArr = new int[arrayOfDouble.length - 1];
                for(int index = 0; index < i; index++){
                    newArr[index] = arrayOfDouble[index];
                }
                for(int j = i; j < arrayOfDouble.length - 1; j++){
                    newArr[j] = arrayOfDouble[j+1];
                }
                break;
            }
        }
        System.out.println(" Новый массив: " +Arrays.toString(newArr));
        sc.close();
        }

    }


