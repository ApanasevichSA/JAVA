package com.company;

/**
 * Created by user on 14.06.2017.
 */
public class Counter {
    private String name;

    public Counter(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Counter counter = (Counter) o;

        return name.equals(counter.name);

    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}
