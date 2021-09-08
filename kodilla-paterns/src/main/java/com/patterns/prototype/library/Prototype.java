package com.patterns.prototype.library;

public class Prototype<T> implements Cloneable {

    public T clone() throws CloneNotSupportedException {
        return (T)super.clone();
    }
}
