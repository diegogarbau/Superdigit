package com.ing.mb.mwchapter;

import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MvpSuperDigitDPlaza implements SuperDigit {

    @Override
    public int calc(String n, String k) {
        return Optional.of(IntStream.range(0, Integer.valueOf(k))
            .mapToObj(eachK -> n)
            .collect(Collectors.joining()))
            .map(number -> number.length() == 1
                ? Integer.valueOf(number)
                : calc(String.valueOf(number.chars()
                        .mapToObj(Character::getNumericValue)
                        .collect(Collectors.groupingBy(Integer::intValue, Collectors.counting()))
                        .entrySet()
                        .stream()
                        .map(entry -> entry.getValue() * entry.getKey())
                        .collect(Collectors.summingLong(Long::longValue)))
                    , "1"))
            .get();
    }
}
