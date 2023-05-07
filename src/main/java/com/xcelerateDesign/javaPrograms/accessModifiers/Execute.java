package com.xcelerateDesign.javaPrograms.accessModifiers;

/**
 * @author Xcelerate Design on 2023-05-16
 * @project java-programs
 */

public class Execute {

    public static void main(String[] args) {

        PublicModifier publicModifier = new PublicModifier();
        publicModifier.publicString = "Public String";
        System.out.println(publicModifier.publicString);

        DefaultModifier defaultModifier = new DefaultModifier();
        defaultModifier.defaultString = "Default String";
        System.out.println(defaultModifier.defaultString);

        ProtectedModifier protectedModifier = new ProtectedModifier();
        protectedModifier.protectedString = "Protected String";
        System.out.println(protectedModifier.protectedString);

        //PrivateModifier privateModifier = new PrivateModifier();
        //privateModifier.privateString = "Private String";
        //System.out.println(privateModifier.privateString);

    }
}
