package com.company;

public class Girl {
    String name;
    int age;

    public Girl(String name, int a) {
        this(name);
        age = a;
    }

    public Girl(String name) {
        this.name = name;
    }

    public Girl() {
        System.out.println("hi girl!!!!");
    }

    @Override
    public String toString() {
        return "Girl{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public int countSum(int... a) {
        int sum = 0;

        for (int i : a) {
            sum += i;
        }
        return sum;
    }

    public String goToCinema(String cinema) {
        if (cinema.equals("Парк")) {
            return "no";
        } else {
            return "yes";
        }
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("goodbye");
    }
}
