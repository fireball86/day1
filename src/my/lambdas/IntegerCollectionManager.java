package my.lambdas;

import java.util.ArrayList;
import java.util.List;

//классический для ООП класс, а не для функционального программирования - принимает данные в качестве аргумента, а не действия в качестве арзумента
public class IntegerCollectionManager {
    public List<Integer> squares(List<Integer> data) {
        List<Integer> results = new ArrayList<Integer>();
        for(int x: data) {
            results.add(x * x);
        }
        return results;
    }
}
