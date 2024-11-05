package exam01;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex09 {
    public static void main(String[] args) {
        List<String> hearts =  Stream.generate(() -> "♥").limit(10).toList();
        System.out.println(hearts);


        int[] nums = IntStream.iterate(1, i -> i + i).limit(10).toArray();
        System.out.println(Arrays.toString(nums));
    }
}
