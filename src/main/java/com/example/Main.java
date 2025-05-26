package com.example;

import javax.persistence.EntityManager;

import com.example.util.JpaUtil;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        EntityManager manager = JpaUtil.getEntityManager();
    }
}