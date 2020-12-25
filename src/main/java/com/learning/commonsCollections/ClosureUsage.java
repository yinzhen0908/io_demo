package com.learning.commonsCollections;

import org.apache.commons.collections.Closure;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
public class ClosureUsage {
    public static void main(String[] args) {
        demoClosureUsage();
    }
    public static void demoClosureUsage() {
        System.out.println(StringUtils.center( " demoClosureUsage " , 40, "=" ));
        // data setup
        Employee[] employees = new Employee[] {
            new Employee( "Tony" ,26, new Date(), "E4" , 2000),
            new Employee( "Michelle" ,24, new Date(), "E4" , 2000),
            new Employee( "Jack" ,28, new Date(), "E5" , 3000)
        };
        Collection empColl = Arrays.asList(employees);
        printColl( "Beforesalary increase:" , empColl);
        // closure setup
        Closure salaryIncreaseClosure = new Closure() {
            public void execute(Object obj) {
                Employee emp = (Employee) obj;
                emp.setSalary(emp.getSalary() *1.20);
            }
        };
        // salary increase
        CollectionUtils.forAllDo(empColl,salaryIncreaseClosure);
        printColl( "After salary increase:" , empColl);
        System.out.println(StringUtils.repeat( "=" , 40));
    }
    public static void printColl(String label, Collection c) {
        if (StringUtils.isNotBlank(label)) {
            System.out.println(label);
        }
        Iterator iter = c.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }
}