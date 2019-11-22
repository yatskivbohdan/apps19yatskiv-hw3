package ua.edu.ucu.smartarr;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.stream.Stream;

// Remove duplicates from SmartArray. Use method equals() to compare objects
public class DistinctDecorator extends SmartArrayDecorator {
    public DistinctDecorator(SmartArray smartArray) {
        super(smartArray);
        array = Arrays.stream(smartArray.toArray()).distinct().toArray();
    }

    @Override
    public String operationDescription() {
        return smartArray.operationDescription() + "+DistinctDecorator";
    }
}

