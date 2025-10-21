package guru.qa;

public class SimpleOperations {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        double c = 10.0;


    //0) применить несколько арифметических операций ( + , -, * , /) над двумя примитивами типа int
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a * b = " + (a * b));

    //1) применить несколько арифметических операций над int и double в одном выражении
        System.out.println("c + a - b = " + (c + a - b));

    //2) применить несколько логических операций ( < , >, >=, <= )
        System.out.println( "a < b = " + (a < b));
        System.out.println( "a >= b = " + (a >= b));

    //3) прочитать про диапазоны типов данных для вещественных / чисел с плавающей точкой (какие максимальные и минимальные значения есть, как их получить) и переполнение
        System.out.println("Float.MIN_VALUE);
        System.out.println("Double.MAX_VALUE);

    //4) получить переполнение при арифметической операции
        System.out.println("Float.Over = " + Float.MAX_VALUE * a);
}

}