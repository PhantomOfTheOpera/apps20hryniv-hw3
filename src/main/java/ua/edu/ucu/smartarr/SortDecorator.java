package ua.edu.ucu.smartarr;

import ua.edu.ucu.functions.MyComparator;

import java.util.Arrays;

// Sorts elements using MyComparator to compare them
public class SortDecorator extends SmartArrayDecorator {

    public SortDecorator(SmartArray smartArray, MyComparator comparator) {
        super(smartArray);
        this.decoratedArray = Arrays.stream(this.smartArray.toArray()).sorted(comparator).toArray();
    }

    @Override
    public String operationDescription() {
        return "Sort Decorator";
    }
}
