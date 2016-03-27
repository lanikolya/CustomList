package com.company;

import java.util.Arrays;

public class CustomList<E> implements MethodsForList<E> {
    //    private int len = 0;
//    private Person arrayList[] = new Person[len];
    private Object arrayList[] = {};
    private static final int len = 10;
    private int size = 0;

    public CustomList() {
        arrayList = new Object[len];
    }

    private void checkSize() {
        int newIncreasedSize = arrayList.length * 2;
        arrayList = Arrays.copyOf(arrayList, newIncreasedSize);
    }

    @Override
    public void add(E o) {
        if (size == arrayList.length) {
            checkSize();
        }
        arrayList[size++] = o;
    }


    @Override
    public int size() {
        System.out.print("Size:" + "\t");
        return size;
    }

    @Override
    public CustomList clone() {
        CustomList<E> customList = new CustomList<>();
        Object copyList[] = new Object[size];
        for (int i = 0; i < size; i++) {
            copyList[i] = arrayList[i];
            customList.add((E) copyList[i]);
        }
        return customList;
    }

    @Override
    public boolean contains(E c) {
        for (int i = 0; i < size; i++) {
            if (c.equals(arrayList[i])) {
                System.out.println("coincidence with object" + " <<" + arrayList[i] + ">> " + " " + "with index" + " " + i);
                return true;
            }
        }
        System.out.println("There is no coincidence");
        return false;
    }

    @Override
    public int indexOf(E n) {
        if (presenceOfObjectInList(n)) {
            for (int i = 0; i < size; i++) {
                if (n.equals(arrayList[i])) {
                    System.out.print("Index of object" + " <<" + arrayList[i] + ">> " + " = ");
                    return i;
                }
            }
        }
        System.out.println("object with such index not found");
        return -1;
    }

    @Override
    public void clear() {
        size = 0;
        arrayList = new Object[size];
    }

    @Override
    public E get(int index) {
        if (index >= 0 && index < size) {
            System.out.print("The object with index" + " " + index + ":" + " ");
            return (E) arrayList[index];
        }
        System.out.println("The object with index" + " " + index + " " + "was not found");
        return null;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean removeForIndex(int index) {
        if (index >= 0 && index < size) {
            for (int j = index; j < size; j++) {
                arrayList[j] = arrayList[j + 1];
            }
            size--;
            System.out.println("Object" + "\t<<" + arrayList[index] + ">>\t" + "was removed");
            return true;
        }
        System.out.println("Incorrect index");
        return false;
    }

    @Override
    public boolean removeForObject(E object) {
        if (presenceOfObjectInList(object)) {
            for (int i = 0; i < size; i++) {
                if (object.equals(arrayList[i])) {
                    int index = i;
                    for (int j = index; j < size; j++) {
                        arrayList[j] = arrayList[j + 1];
                    }
                }
                System.out.println("Object" + "\t<<" + object + ">>\t" + "was removed");
                size--;
                return true;
            }
        }
        System.out.println("the object was not found");
        return false;
    }

    @Override
    public E[] toArray() {
        Object mass[] = new Object[size];
        for (int i = 0; i < size; i++) {
            mass[i] = arrayList[i];
        }
        return (E[]) mass;
    }

    @Override
    public void display() {
        System.out.print("Display list : ");
        if (size == 0) {
            System.out.println("List is empty");
        } else {
            for (int i = 0; i < size; i++) {
                System.out.print(arrayList[i] + " ");
            }
            System.out.println();
        }
    }

    private boolean presenceOfObjectInList(E object) {
        for (int i = 0; i < size; i++) {
            if (object.equals(arrayList[i])) {
                return true;
            }
        }
        return false;
    }
}
