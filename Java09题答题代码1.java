package com.ISEKAI;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class nine {
    public static void main(String[] args) {
        List<String> strings = List.of("I", "am", "a", "list", "of", "Strings");
        Stream<String> stream = strings.stream();
//调用流API的方法，例如我们希望最多有4个元素
        System.out.println(stream);
        Stream<String> limit = stream.limit(4);
//最后我们打印结果
        System.out.println("limit = " + limit);
        //--------------------------------------------------------------------------以下为修改
        Collection<String> a=new ArrayList<>();
        a=List.of("I", "am", "a", "list", "of", "Strings");
        a.stream().limit(4).forEach(n-> System.out.println(n));
    }
}