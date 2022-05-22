package hometask.task2;

public class ArithmeticAverage {

    public static void main(String[] args) {

        int a = 4, b = 8, c = 13;

        int average1 = (a + b + c)/3;
        System.out.println(average1);

        //для вычисления среднего арифметического лучше использовать
        //тип float или double. В зависимости от диапазона числел
        float average2 =  (float) (a + b + c)/3;//добавил кастинг - так как выводило 8.0 что не есть верно
        double average3 = (double) (a + b + c)/3;

        System.out.println(average2);
        System.out.println(average3);

    }

}
