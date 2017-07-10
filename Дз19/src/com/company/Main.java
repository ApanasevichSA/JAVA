package com.company;

import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Firma firma = new Firma();
        firma.setDirektor(null);
        Iterator iterator = new FirmaIterator(firma);
        System.out.println(iterator.hasNext());
        System.out.println(iterator.next());
        System.out.println(iterator.hasNext());
        System.out.println(iterator.next());
    }
}
