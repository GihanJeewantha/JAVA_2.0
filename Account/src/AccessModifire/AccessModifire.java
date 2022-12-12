package AccessModifire;

public class AccessModifire {

    public int publicInt = 10;
    private int privateInt = 20;
    protected  int protectedInt = 30;
    int defaultInt = 40;

    public static void main(String[]args){
        AccessModifire obj1 = new AccessModifire();
        System.out.println(obj1.publicInt);
        System.out.println(obj1.privateInt);
        System.out.println(obj1.protectedInt);
        System.out.println(obj1.defaultInt);
    }

}
