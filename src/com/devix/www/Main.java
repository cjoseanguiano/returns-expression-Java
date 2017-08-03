package com.devix.www;

public class Main {

    public static void main(String[] args) {
        int result = computeSize(10, 3);
        System.out.println(result);
    }

    private static int computeSize(int height, int width) {
        return height * width;
    }
}
