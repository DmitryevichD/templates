package by.dm13y.templates.behavior.strategy;

import java.util.List;

public class Sort<T> {
    private Algorithm<T> algorithm;

    public Sort(Algorithm<T> algorithm) {
        this.algorithm = algorithm;
    }

    public void setAlgorithm(Algorithm<T> algorithm) {
        this.algorithm = algorithm;
    }

    public void sort(List<T> list) {
        algorithm.sort(list);
    }
}
