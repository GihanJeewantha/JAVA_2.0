package AccessModifire;

public class AnotherClass {
    public static void main(String[]args){
        AccessModifire obj1 = new AccessModifire();
        System.out.println(obj1.publicInt);
        System.out.println(obj1.privateInt); // private access modifire cannot use another class
        System.out.println(obj1.protectedInt);
        System.out.println(obj1.defaultInt);

    }
}
