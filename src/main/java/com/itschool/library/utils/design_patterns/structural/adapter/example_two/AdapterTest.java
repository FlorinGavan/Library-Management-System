package com.itschool.library.utils.design_patterns.structural.adapter.example_two;

public class AdapterTest {

    public static void main(String[] args) {
        testObjectAdapter();
        System.out.println();
        testClassAdapter();
    }

    public static void testObjectAdapter() {
        SocketAdapter socketAdapter = new SocketObjectAdapterImpl();
        Volt v32 = getVolt(socketAdapter, 32);
        Volt v67 = getVolt(socketAdapter, 67);
        Volt v120 = getVolt(socketAdapter, 120);
        System.out.println("v32 volts using Object Adapter=" + v32.getVolts());
        System.out.println("v67 volts using Object Adapter=" + v67.getVolts());
        System.out.println("v120 volts using Object Adapter=" + v120.getVolts());
    }

    private static void testClassAdapter() {
        SocketAdapter socketAdapter = new SocketClassAdapterImpl();
        Volt v32 = getVolt(socketAdapter, 32);
        Volt v67 = getVolt(socketAdapter, 67);
        Volt v120 = getVolt(socketAdapter, 120);
        System.out.println("v32 volts using Class Adapter=" + v32.getVolts());
        System.out.println("v67 volts using Class Adapter=" + v67.getVolts());
        System.out.println("v120 volts using Class Adapter=" + v120.getVolts());
    }

    private static Volt getVolt(SocketAdapter sockAdapter, int i) {
        switch (i) {
            case 32:
                return sockAdapter.get32Volt();
            case 67:
                return sockAdapter.get67Volt();
            case 120:
                return sockAdapter.get120Volt();
            default:
                return sockAdapter.get120Volt();
        }
    }
}
