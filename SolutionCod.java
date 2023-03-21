import java.util.Scanner;

public class SolutionCod {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.println("Please enter the array size");
            int size = in.nextInt();
            String[] array = new String[size];
            FillArray(array);
            int size2 = FindSecondArraySize(array);
            String[] array2 = new String[size2];
            FillSecondArray(array , array2);
            System.out.println("This is old array ");
            PrintArray(array);
            System.out.println("\n This is new array ");
            PrintArray(array);

    }
    public static void FillArray(String[] array){
            Scanner in = new Scanner(System.in);
            for(int i = 0; i < array.length; i++){
            System.out.println("Please fill the array ");
           array[i] = in.next();
        }
    }
    public static int FindSecondArraySize(String[] array){
            int size2 = 0;
            for(int index = 0; index < array.length; index++){
                if(array[index].length() <= 3){
                     size2++;
                }
            }
            return size2;
    }
    public static void FillSecondArray(String[] oldArray, String[] newArray){
            int index2 = 0;
            for(int index = 0;index < oldArray.length;index++){
                if(oldArray[index].length() <= 3){
                    newArray[index2] = oldArray[index];
                    index2++;
                }
            }
    }
    public static void PrintArray(String[] array){
            for(int i = 0;i < array.length; i++){
                System.out.print(array[i] + " ");
            }

    }

}