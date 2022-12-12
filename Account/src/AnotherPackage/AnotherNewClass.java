package AnotherPackage;

import AccessModifire.AccessModifire;

public class AnotherNewClass {

    public static void main(String[]args){
        AccessModifire obj1 = new AccessModifire();
        System.out.println(obj1.publicInt);
        System.out.println(obj1.privateInt);    // cannot use another package
        System.out.println(obj1.protectedInt);  // cannot use another package
        System.out.println(obj1.defaultInt);    // cannot use another package
    }
}
