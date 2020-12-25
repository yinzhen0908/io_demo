package com.learning.commonsCollections;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
public class Book {
    private String name;
    private String isbn;
    private double retailPrice;
    public Book() {
    }
    public Book(String name, String isbn, double retailPrice) {
        this .name = name;
        this .isbn = isbn;
        this .retailPrice = retailPrice;
    }
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
        .append( "name" ,name)
        .append( "ISBN" ,isbn)
        .append( "retailPrice" ,retailPrice)
        .toString();
    }
    public String getIsbn() {
        return isbn;
    }
    public void setIsbn(String isbn) {
        this .isbn = isbn;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getRetailPrice() {
        return retailPrice;
    }
    public void setRetailPrice( double retailPrice) {
        this.retailPrice = retailPrice;
    }
}