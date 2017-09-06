import java.io.*;
import java.util.*;
import java.util.stream.*;

public class FunctionalSolution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        List<String> strings = IntStream.range(0, in.nextInt())
            .mapToObj(i -> in.next())
            .collect(Collectors.toList());

        IntStream.range(0, in.nextInt())
            .mapToObj(i -> in.next())
            .mapToLong(q -> strings.stream().filter(q::equals).count())
            .forEach(System.out::println);
            
        in.close();
    }
}
