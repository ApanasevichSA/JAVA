package com.company;

import com.sun.xml.internal.bind.v2.util.FlattenIterator;

import java.util.Iterator;

/**
 * Created by Admin on 10.07.17.
 */
public class Firma implements Iterable<Firma.Part> {
    private Direktor direktor = new Direktor();
    private Zam zam = new Zam();
    private Menedger menedger = new Menedger();

    public Direktor getDirektor() {
        return direktor;
    }

    public void setDirektor(Direktor direktor) {
        this.direktor = direktor;
    }

    public boolean hasDirektor(){
        return direktor != null;
    }

    public Zam getZam() {
        return zam;
    }

    public void setZam(Zam zam) {
        this.zam = zam;
    }

    public boolean hasZam(){
        return zam != null;
    }
    public Menedger getMenedger() {
        return menedger;
    }

    public void setMenedger(Menedger menedger) {
        this.menedger = menedger;
    }

    public boolean hasMenedger(){
        return menedger != null;
    }

    @Override
    public Iterator<Part> iterator() {
        return new FlattenIterator(this);
    }

    public interface Part {    }
    public class Direktor implements Part{    }
    public class Zam  implements Part {    }
    public class Menedger implements Part{    }


}
