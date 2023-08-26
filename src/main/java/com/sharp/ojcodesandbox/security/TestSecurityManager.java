package com.sharp.ojcodesandbox.security;

public class TestSecurityManager {
    public static void main(String[] args) {
        System.setSecurityManager(new MySecurityManager());

    }
}
