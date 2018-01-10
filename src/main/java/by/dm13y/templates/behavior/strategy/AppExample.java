package by.dm13y.templates.behavior.strategy;

import java.util.ArrayList;

public class AppExample {
    public static void main(String[] args) {
        Sort<Integer> sorter = new Sort<>(new HeapSort<>());
        sorter.sort(new ArrayList<>());
        sorter.setAlgorithm(new MergeSort<>());
        sorter.sort(new ArrayList<>());
    }
}
