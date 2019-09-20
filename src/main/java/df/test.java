package df;

import df.servers.FictionsServer;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class test {
    public static void main(String[] args) {

        System.out.println(Runtime.getRuntime().availableProcessors());
        List<Integer> test = new ArrayList<Integer>(){
            {
                for(int i = 0;i<10;i++){
                    add(i);
                }
            }
        };

        long start1 = System.currentTimeMillis();
        test.stream().mapToInt(Integer::intValue).sum();
        long end1 = System.currentTimeMillis();

        long start2 = System.currentTimeMillis();
        test.parallelStream().mapToInt(Integer::intValue).sum();
        long end2 = System.currentTimeMillis();

        System.out.println("串行化用时："+(end1-start1));
        System.out.println("并行化用时："+(end2-start2));
    }
}
