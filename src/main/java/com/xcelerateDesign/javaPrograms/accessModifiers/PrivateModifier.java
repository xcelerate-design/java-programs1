package com.xcelerateDesign.javaPrograms.accessModifiers;

/**
 * @author Xcelerate Design on 2023-05-16
 * @project java-programs
 */

public class PrivateModifier {

    private String privateString;

    public static void main(String[] args) {

        PrivateModifier privateModifier = new PrivateModifier();
        privateModifier.privateString = "Private String";
        System.out.println(privateModifier.privateString);

    }

}
