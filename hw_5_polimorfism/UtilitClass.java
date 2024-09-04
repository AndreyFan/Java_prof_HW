package de.telran.lesson_2.hw_5_polimorfism;

public class UtilitClass {
//   1) Напишите утилитный класс, в котором реализованы методы
//   получения среднего значения AVG, максимального MAX и
//   минимального значения MIN из следующих наборов данных:
//* пары целых чисел
//•	пары дробных чисел
//•	одного целого и одного дробного числа
//•	массива целых чисел
//•	массива дробных чисел Используйте механизм перегрузки.

    static double avg(int num1, int num2){
        return (num1+num2)/2 ;
    }

    static double avg(double num1, double num2){
        return (num1+num2)/2 ;
    }

    static double avg(int num1, double num2){
        return (num1+num2)/2 ;
    }

    static double avg(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum/arr.length;
    }

    static double avg(double[] arr){
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum/arr.length;
    }

    static int max(int a, int b){
        return a>b ? a:b;
    }

    static double max(double a, double b){
        return a>b ? a:b;
    }

    static double max(int a, double b){
        return a>b ? a:b;
    }

    static int max(int[] arr){
        int maximal=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>maximal) maximal=arr[i];
        }
        return maximal;
    }

    static double max(double[] arr){
        double maximal=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>maximal) maximal=arr[i];
        }
        return maximal;
    }

    static int min(int a, int b){
        return a<b ? a:b;
    }

    static double min(double a, double b){
        return a<b ? a:b;
    }

    static double min(int a, double b){
        return a<b ? a:b;
    }

    static int min(int[] arr){
        int minimal=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]<minimal) minimal=arr[i];
        }
        return minimal;
    }

    static double min(double[] arr){
        double minimal=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]<minimal) minimal=arr[i];
        }
        return minimal;
    }


    public static void main(String[] args) {

        System.out.println(" max of 2 number:   " + max(2,6));
        int[] array1={6, 2, 3, 4, 8, 1, 16, 5};
        System.out.println("max element array:   "+max(array1));
        System.out.println(" min of 2 number:   " + min(20, 15));
        System.out.println("min element array:   "+min(array1));
    }




}
