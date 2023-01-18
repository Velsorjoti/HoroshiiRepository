package homeworkeoffunctionmethod;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HomeWorkerofFunctionStream {
    public static void main(String[] args) {
        task1();
        task2();
    }

    private static void task1() {
        System.out.println("Задача 1");
    }

    public static <T> void findMinMax(Stream<? extends T> stream,
                                      Comparator<? super T> order,
                                      BiConsumer<? super T, ? super T> minMaxConsumer) {
        List<T> listik = stream.collect(Collectors.toList());
        Stream<T> streamMin = listik.stream();
        Optional<? extends T> min = streamMin.min(order);
        Stream<T> streamMax = listik.stream();
        Optional<? extends T> max = streamMax.max(order);

        if (min.isPresent() && max.isPresent()) {
            minMaxConsumer.accept(min.get(), max.get());
        } else {
            minMaxConsumer.accept(null, null);
        }
    }

    private static void task2() {
        List<Integer> stremusha = new ArrayList<>();
        stremusha.stream().filter(s -> s % 2 == 0).count();


    }
}
