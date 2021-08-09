package my.lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Client {
    public static void main(String[] args) {
        List<Integer> data = new ArrayList<Integer>();
        data.add(1); data.add(2); data.add(3);
        /*List<Integer> results = data.stream().filter(x -> x %2 == 1).collect(Collectors.toList());
        results.stream().forEach( x -> {
            System.out.println(x);
        });*/
        data.stream().filter(x -> x %2 == 1)
                .collect(Collectors.toList())
                .forEach(x -> {
                    System.out.println(x);
                 });

    }

    public static void main1(String[] args) {
        System.out.println("Hello, world!");
        IntegerCollectionManager icm = new IntegerCollectionManager();
        List<Integer> data = new ArrayList<Integer>();
        data.add(1); data.add(2); data.add(3);
//        List<Integer> results = icm.squares(data);

//      Передача действия в стиле классического ООП (переопределение метода в момент передачи класса в виде аргумента метода)
        //IntegerCollectionManager1 icm1 = new IntegerCollectionManager1();
        /*List<Integer> results = icm1.transform(data, new TransformInteger() {
            @Override
            public Integer doTransform(Integer x) {
                return x * x;
            }
        });*/
//      Передача действия в функциональном стиле ( = лямбда стиль)
//       List<Integer> results = icm1.transform(data, x -> {return x * x * x;});
//      Скоращенный эквивалент предыдущей строки (не нужно писать return)
        /*List<Integer> results = icm1.transform(data, x ->  x * x * x);

        for(int x : results) {
            System.out.println(x);
        }*/
//      Лямбда выражение может быть длинным и сложным (т.е. внутри {} может быть много строк кода)
        /*icm1.transform(data, x -> {
            System.out.println(x * x);
            return x;
        });*/
        IntegerCollectionManager2 icm2 = new IntegerCollectionManager2();
        /*icm2.transform(data, x -> {
            System.out.println(x * x);
            return x;
        });*/
        List<Integer> results = icm2.filter(data, x -> x > 1);
        /*for(int x : results) {
            System.out.println(x);
        }*/
        icm2.doIt(results, x -> {
            System.out.println(x);
        });

    }
}
