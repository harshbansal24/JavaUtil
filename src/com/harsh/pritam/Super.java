package com.harsh.pritam;

import java.io.Serializable;

class Super  implements Serializable{
    public void test() {
        System.out.println("Super.test()");
    }
}

class Sub extends Super {
    @Override
    public void test() throws IndexOutOfBoundsException {
        // Method can throw any Unchecked Exception
        System.out.println("Sub.test()");
    }
}

class Sub2 extends Sub {
    @Override
    public void test() throws ArrayIndexOutOfBoundsException {
        // Any Unchecked Exception
        System.out.println("Sub2.test()");
    }
}

class Sub3 extends Sub2 {
    @Override
    public void test() {
        // Any Unchecked Exception or no exception
        System.out.println("Sub3.test()");
    }
}

class Sub4 extends Sub2 {
    @Override
    public void test() throws AssertionError {
        // Unchecked Exception IS-A RuntimeException or IS-A Error
        System.out.println("Sub4.test()");
    }
}