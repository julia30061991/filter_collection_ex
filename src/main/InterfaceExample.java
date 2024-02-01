import java.util.ArrayList;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class InterfaceExample {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        InterfaceExample example = new InterfaceExample();
        SumOfNumbers sumOfNumbers = new SumOfNumbers();
        System.out.println(example.getNewList(numbers, sumOfNumbers));
    }

    List<Integer> getNewList(List<Integer> list, SumOfNumbers sum) {
        return list.stream().map(n -> (Integer)sum.apply(n)).collect(toList());
    }
}