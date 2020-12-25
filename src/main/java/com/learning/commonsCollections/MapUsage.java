package com.learning.commonsCollections;

import org.apache.commons.collections.BidiMap;
import org.apache.commons.collections.Factory;
import org.apache.commons.collections.bidimap.DualHashBidiMap;
import org.apache.commons.collections.map.LazyMap;
import org.apache.commons.collections.map.MultiValueMap;
import org.apache.commons.lang3.StringUtils;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
public class MapUsage {
    public static void main(String[] args) {
        demoBidiMap();
        demoMultiMap();
        demoLazyMap();
    }
    public static void demoBidiMap() {
        System.out.println(StringUtils.center( " demoBidiMap " , 40, "=" ));
        BidiMap bidiMap = new DualHashBidiMap();
        bidiMap.put( "BJ" , "Beijing" );
        bidiMap.put( "SH" , "Shanghai" );
        bidiMap.put( "GZ" , "Guangzhou" );
        bidiMap.put( "CD" , "Chengdu" );
        System.out.println( "Key-Value: BJ = " + bidiMap.get( "BJ" ));
        System.out.println( "Value-Key: Chengdu =" + bidiMap.getKey( "Chengdu" ));
        System.out.println(StringUtils.repeat( "=" , 40));
    }
    public static void demoMultiMap() {
        System.out.println(StringUtils.center( " demoMultiMap " , 40, "=" ));
        MultiValueMap multiMap = new MultiValueMap();
        multiMap.put( "Sean" , "C/C++" );
        multiMap.put( "Sean" , "OO" );
        multiMap.put( "Sean" , "Java" );
        multiMap.put( "Sean" , ".NET" );
        multiMap.remove( "Sean" , "C/C++" );
        System.out.println( "Sean’s skill set: " + multiMap.get( "Sean" ));
        System.out.println(StringUtils.repeat( "=" , 40));
    }
    public static void demoLazyMap() {
        System.out.println(StringUtils.center( " demoLazyMap " , 40, "=" ));
        // borrowed from Commons Collection’sJavadoc
        Factory factory = new Factory() {
            public Object create() {
                return new Date();
            }
        };
        Map lazy = LazyMap.decorate( new HashMap(), factory);
        System.out.println(lazy.get( "NOW" ));
        System.out.println(StringUtils.repeat( "=" , 40));
    }
}