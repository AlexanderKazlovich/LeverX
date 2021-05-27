package main.java.com.leverx.kazlovich;

import main.java.com.leverx.kazlovich.proxy.ProxyUnchangeableList;

public   class Main {
    public static void main(String[] args) {
        ProxyUnchangeableList list = new ProxyUnchangeableList();
        list.add(new Object());
    }
}

