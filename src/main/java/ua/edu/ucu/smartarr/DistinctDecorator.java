package ua.edu.ucu.smartarr;

import org.apache.commons.lang3.ArrayUtils;
import sun.security.util.ArrayUtil;

import java.lang.Object;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Arrays;
import java.util.Set;

// Remove duplicates from SmartArray. Use method equals() to compare objects
public class DistinctDecorator extends SmartArrayDecorator {

    public DistinctDecorator(SmartArray smartArray){
        super(smartArray);
      //ArrayList <Object> Array = new ArrayList<>();
//        Object[] array  =  smartArray.toArray().clone();
//        for (int i = 0; i < smartArray.size(); i++){
//            for(int j = i; j < smartArray.size(); j++){
//                if (array[i].equals(array[j])) {
//                    array = ArrayUtils.remove(array, j);
//                }
//            }
//        }
//        this.decoratedArray = array;


        Set<Object> set = new HashSet<>(Arrays.asList(smartArray.toArray()));
        this.decoratedArray = set.toArray();
     }

    @Override
    public String operationDescription() {
        return "Remove duplicates from array with equals method";
    }

}
