package functionalinterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {
        int increment =  incrementByOne(1);
        System.out.println(increment);
        int increment2 =  incrementByOneFunction.apply(1);
        System.out.println(increment2);
        int multiply = multipleByTen.apply(increment2);
        System.out.println(multiply);
        Function<Integer, Integer> addAndMultiply = incrementByOneFunction.andThen(multipleByTen);
        System.out.println(addAndMultiply.apply(4));
        //Bi Function
        System.out.println(incrementByOneAndMultiplyBiFunction.apply(4, 100));
    }

    static Function<Integer, Integer> incrementByOneFunction =
            number -> number+1;

    static Function<Integer, Integer> multipleByTen = number -> number * 10;

    static BiFunction<Integer, Integer, Integer> incrementByOneAndMultiplyBiFunction =
            (number, numToMultiplyBy)
                    -> (number +1) * numToMultiplyBy;

    static int incrementByOne(int number){
        return number+1;
    }
    static int incrementByOneAndMultiply(int number, int numToMultiplyBy){
        return (number+1) * numToMultiplyBy;
    }
}
