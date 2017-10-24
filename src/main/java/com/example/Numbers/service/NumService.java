package com.example.Numbers.service;


import com.example.Numbers.model.NumModel;
import org.springframework.stereotype.Service;


import java.util.Arrays;
import java.util.stream.IntStream;

@Service
public class NumService {
    public IntStream sort(String str) {
        NumModel numModel = new NumModel();
        numModel.setId(0L);
        numModel.setStr(str);

        IntStream statistics =  Arrays.
                stream(str.split(","))
                .mapToInt(Integer::parseInt)
                .distinct()
                .filter(x -> (x > 0) & IntStream
                        .rangeClosed(2, (int) (Math.sqrt(x)))
                        .allMatch(n -> x % n != 0))
                .sorted();

            return statistics;
    }
}
