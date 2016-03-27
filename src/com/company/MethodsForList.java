package com.company;


public interface MethodsForList<T> {
    public void add(T t);
    public int size();
    public Object clone();
    public boolean contains(T c);
    public int indexOf(T i);
    public void clear();
    public Object get(int index);
    public boolean isEmpty();
    public boolean removeForIndex(int index);
    public boolean removeForObject(T object);
    public T[] toArray();
    public void display();
}
