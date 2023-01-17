package homeworkeoffunctionmethod;

import list.Main;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
public class HomeWorkeofFunctionMethod {

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1() {
        Predicate<Integer> ishu = x -> x > 0;

        Predicate<Integer> ishu1 = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                boolean b = integer > 0;
                if (b) {
                    return true;
                }
                return false;
            }
        };
    }

    public static void task2() {
        Consumer<String> greeting = x -> System.out.println("Привет" + x);

        Consumer<String> greeting1 = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println("Привет" + s);
            }
        };
    }

    public static void task3() {
        Function<Double, Long> metamorphosis = x -> Math.round(x);

        Function<Double, Long> metamorphosis1 = new Function<Double, Long>() {
            @Override
            public Long apply(Double aDouble) {
                return Math.round(aDouble);
            }
        };
    }

    public static void task4() {
        Random random = new Random();
        Supplier<Integer> daiNomerok = () -> random.nextInt(100);

        Supplier<Integer> daiNomerok1 = new Supplier<Integer>() {
            @Override
            public Integer get() {
                Random random1 = new Random();
                return random1.nextInt(100);
            }
        };
    }

    public static void task5() {

    }
    public static <T, U> Function<T, U> ternaryOperator(
            Predicate<? super T> condition,
            Function<? super T, ? extends U> ifTrue,
            Function<? super T, ? extends U> ifFalse) {
        Function<T,U> function = new Function<T, U>() {
            @Override
            public U apply(T t) {
                if(condition.test(t)) {
                    return  ifTrue.apply(t);
                } else {
                    return ifFalse.apply(t);
                }
            }
        };
        return function;
    }

    public static <T, U> Function<T, U> ternaryOperator1(
            Predicate<? super T> condition1,
            Function<? super T, ? extends U> ifTrue,
            Function<? super T, ? extends U> ifFalse) {
        return t -> condition1.test(t) ? ifTrue.apply(t) : ifFalse.apply(t);
    }
}
