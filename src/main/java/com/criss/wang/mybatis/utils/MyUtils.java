package com.criss.wang.mybatis.utils;
import org.springframework.lang.Nullable;

import java.util.*;
import java.util.concurrent.TimeUnit;

/**
 * @Author wangqiubao
 * @Date 2019/11/22 11:42
 * @Description
 **/
public class MyUtils {

    public static String[] toStringArray(@Nullable Collection<String> collection) {
        return (collection != null ? collection.toArray(new String[0]) : new String[0]);
    }

    public void main(String[] args){
        List<String> collection = new ArrayList<>();
        collection.add("wang");
        collection.add("qiu");
        collection.add("bao");

        String[] str = toStringArray(collection);
        for(int i = 0; i<str.length;i++){
            System.out.println(str[i]);
        }

        String[] a = new String[0];
        System.out.println(a.length );
    }
}
