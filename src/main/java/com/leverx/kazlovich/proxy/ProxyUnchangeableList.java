package main.java.com.leverx.kazlovich.proxy;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class ProxyUnchangeableList implements Collection {

    private List proxyList;

    public ProxyUnchangeableList() {
        this.proxyList = new ArrayList();
    }

    @Override
    public boolean add(Object o){
        if (o != null){
            System.out.println("You cannot add the object into unchangeable collection");
        }
        return false;
    }

    @Override
    public boolean addAll(Collection c) {
        if (c != null){
            System.out.println("You cannot add the object into unchangeable collection");
        }
        return false;
    }

    @Override
    public boolean remove(Object o) {
        if (o != null){
            System.out.println("You cannot remove the object from unchangeable collection");
        }
        return false;
    }

    @Override
    public void clear() {
        System.out.println("You cannot clear the unchangeable collection");
    }

    @Override
    public boolean removeIf(Predicate filter) {
        if (filter != null){
            System.out.println("You cannot remove the object from unchangeable collection");
        }
        return false;
    }

    @Override
    public Spliterator spliterator() {
        return proxyList.spliterator();
    }

    @Override
    public Stream stream() {
        return proxyList.stream();
    }

    @Override
    public Stream parallelStream() {
        return proxyList.parallelStream();
    }

    @Override
    public int size() {
        return proxyList.size();
    }

    @Override
    public boolean isEmpty() {
        return proxyList.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return proxyList.contains(o);
    }

    @Override
    public Iterator iterator() {
        return proxyList.iterator();
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        if (c != null){
            System.out.println("You cannot remove the collection from unchangeable collection");
        }
        return false;
    }

    @Override
    public boolean retainAll(Collection c) {
        return proxyList.retainAll(c);
    }

    public List getProxyList() {
        return proxyList;
    }

    public void setProxyList(List proxyList) {
        this.proxyList = proxyList;
    }
}
