import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamsExamples {
    public static void main(String[] args)
    {
        List<Integer> grades = Arrays.asList(99,100,22,33,77,65,98,100);

        System.out.printf("The average is %s", grades.stream()
                                                .mapToInt(a -> a.intValue())
                                                .average()
                                                .toString());
    }
}
