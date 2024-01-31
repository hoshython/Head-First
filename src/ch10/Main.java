package ch10;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Duck duck1 = new Duck();
        Duck duck2 = new Duck();
        Duck duck3 = new Duck();
        Duck duck4 = duck3;
        
        //        System.out.println(Duck.getDuckCount());
        System.out.println(duck1.getDuckCount());
        System.out.println(Constant.VAL);
        System.out.println(Constant.VAL2);
        duck1.printBlue();
        
        int x = 32;
        ArrayList<Integer> list = new ArrayList<>();
        list.add(x);
        
        int num = list.get(0);
        System.out.println(num);
        
        class TextBox {
            private Integer i = 10;
            private int j;
            
            void go() {
                j = i;
                System.out.println(i);
                System.out.println(j);
            }
        }
        TextBox t = new TextBox();
        t.go();
        
        System.out.println(Integer.parseInt("20"));
        System.out.println(Double.parseDouble("3.144444444444"));
        System.out.println(Float.parseFloat("3.2555555555"));
        boolean b = Boolean.parseBoolean("TrUe");
        System.out.println(b);
        //        System.out.println(Integer.parseInt("three"));
        
        double d = 42.5;
        System.out.println("" + d);
        System.out.println(Double.toString(d));
        System.out.println(String.valueOf(d));
        int myBillion = 1_000_000_000;
        String s = String.format("%,d", myBillion);
        System.out.println(s);
        System.out.println(String.format("%,.2f", Math.PI));
        System.out.println(String.format("%c", 42));
    }
}
