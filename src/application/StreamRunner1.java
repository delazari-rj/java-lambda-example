package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamRunner1 {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(0,1,2,3,4,5,6,7,8,9);

        Stream<Integer> st1 = list.stream().map(x -> x * 10);
        System.out.println(Arrays.toString(st1.toArray()));

        Stream<String> st2 = Stream.of("Fabio", "Maria", "Eduardo");
        System.out.println(Arrays.toString(st2.toArray()));

        Stream<Integer> st3 = Stream.iterate(0, x -> x + 3);
        System.out.println(Arrays.toString(st3.limit(30).toArray()));

        Stream<Long> st4 = Stream.iterate(new Long[] {0L, 1L}, p -> new Long[] {p[1], p[0]+p[1]}).map(p -> p[0]);
        System.out.println(Arrays.toString(st4.limit(30).toArray()));

        List<Integer> newList = list.stream()
                        .filter(x -> x % 2 == 0)
                        .map(x -> x * 10)
                        .collect(Collectors.toList());
        System.out.println(Arrays.toString(newList.toArray()));

        double avg = list.stream()
                        .map(x -> x * 10)
                        .reduce(0, (x,y) -> x + y);
        System.out.println(avg/list.size());
    }
}
