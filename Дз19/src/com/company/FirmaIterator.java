package com.company;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Created by Admin on 10.07.17.
 */
public class FirmaIterator implements Iterator<Firma.Part> {

    private int index = -1;
    private Firma f;

    public FirmaIterator(Firma f){
        this.f = f;
    }

    public boolean hasNext(){
        if (index == -1) return f.hasDirektor() || f.hasMenedger() ||  f.hasZam();
        if (index == 0) return f.hasDirektor() || f.hasMenedger();
        if (index == 1) return  f.hasMenedger();
        return false;
    }

    public Firma.Direktor next(){
        if (index == -1) {
            if (f.hasDirektor()) {index = 0; return f.getDirektor();}
            if (f.hasMenedger()) {index = 1; return f.getMenedger(); }
            if (f.hasZam()) {index = 2; return f.getZam();}
        }
        if (index == 0) {
            if (f.hasMenedger()) {index = 1; return f.getMenedger();}
            if (f.hasZam()) {index = 2; return f.getZam();}
        }
        if (index == 1) {
            if (f.hasZam()) {index = 2; return f.getZam();}
        }
        throw new NoSuchElementException();
    }

    @Override
    public void remove() {

    }


}
