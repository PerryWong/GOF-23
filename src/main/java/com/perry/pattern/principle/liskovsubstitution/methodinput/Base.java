package com.perry.pattern.principle.liskovsubstitution.methodinput;

import java.util.HashMap;

public class Base {
    public void method(HashMap map){
        System.out.println("父类被执行");
    }
}
