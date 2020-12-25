package com.learning.commonsLang;
import java.util.Date;
public class BuilderUsage {
    public static void main(String[] args) {
        Staff staff1 = new Staff(123, "John Smith" , new Date());
        Staff staff2 = new Staff(456, "Jane Smith" , new Date());
        System.out.println( "staff1’s info: " + staff1);
        System.out.println( "staff2’s info: " + staff2);
        System.out.println( "staff1’s hash code: " +staff1.hashCode());
        System.out.println( "staff2’s hash code: " +staff2.hashCode());
        System.out.println( "staff1 equals staff2? " +staff1.equals(staff2));
        System.out.println( "staff1 compareTo staff2? " +staff1.compareTo(staff2));
    }
}