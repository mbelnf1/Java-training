package com.mostafa.test;

import com.mostafa.builders.Assembler;
import com.mostafa.interfaces.Packager;
import com.mostafa.model.Package;

public class TestPackager {

    public static void main(String[] args) {
        Packager packager = new Assembler();
        Package myPackage = packager.assemblePackage();

        System.out.println(myPackage);
    }
}