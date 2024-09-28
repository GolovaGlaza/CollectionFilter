package org.example;

import java.util.Arrays;

import static org.example.FilterUtil.filter;


public class Main {
    public static void main(String[] args) {

        String[] words = {"кофе", "чай", "молоко"};

        Filter toUpperCaseFilter = new Filter() {
            @Override
            public Object apply(Object o) {
                if (o instanceof String){
                    return ((String) o).toUpperCase();
                }
                return o;
            }
        };

        // Применяем фильтр верхнего регистра
        Object[] result = filter(words, toUpperCaseFilter);

        // Выводим результат
        System.out.println(Arrays.toString(result));

        Integer[] numbers = { 1, 2, 3, 4, 5 };

        Filter squareFilter = new Filter() {
            @Override
            public Object apply(Object o) {
                if (o instanceof Integer) {
                    return (Integer) o * (Integer) o;  // Возводим число в квадрат
                }
                return o;
            }
        };

        // Применяем фильтр для возведения в квадрат
        Object[] squaredNumbers = filter(numbers, squareFilter);

        //Выводим результат
        System.out.println(Arrays.toString(squaredNumbers));

    }
}





