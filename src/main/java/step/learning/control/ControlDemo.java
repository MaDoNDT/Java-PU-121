package step.learning.control;

public class ControlDemo {
    public void run() {
        System.out.println("Hello from ControlDemo");
        /*
        Data types - типи даних
        reference types - посилальні типи
        primitive types - примітивні типи
        */
        byte xb; // 8 bit
        short xs; // 16 bit
        int xi; // 32 bit
        long xl; // 64 bit

        float xf; // 32 bit
        double xd; // 64 bit
        char ch; // 16 bit
        boolean b; // 1 bit
        //
        Byte yb=1;
        Short ys=2;
        Integer yi=3;
        Long yl=4L;

        Float yf=0.1F;
        Double yd=0.01;
        Character ych='a';
        Boolean bb=true;

        // Arrays - масиви
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = new int[]{1,2,3,4,5};
        int[] arr3 = new int[5];

        for (int i = 0; i < arr1.length; i++) {
            System.out.print(" " + arr1[i]);
        }
        System.out.println();

        for(int x:arr2) {
            System.out.print(" " + x);
        }
        System.out.println();
    }
}
/*
Control flow instructions - інструкції керування виконанням програми
 */