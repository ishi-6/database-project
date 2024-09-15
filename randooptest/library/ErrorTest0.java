package library;


import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test1");
        library.Facade facade0 = new library.Facade();
        boolean boolean2 = facade0.passwordValid("User: userType=null, email=null, password=null]");
        boolean boolean4 = facade0.userTypeValid("false");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        facade0.initializeGUI();
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        library.Facade facade0 = new library.Facade();
        char[] charArray4 = new char[] { 'a', '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        library.User user5 = facade0.loginUser("User: userType=null, email=true, password=null]", charArray4);
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test3");
        library.Facade facade0 = new library.Facade();
        boolean boolean2 = facade0.passwordValid("User: userType=null, email=null, password=null]");
        boolean boolean4 = facade0.passwordValid("User: userType=null, email=null, password=null]");
        char[] charArray10 = new char[] { '#', 'a', ' ', '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        library.User user11 = facade0.loginUser("hi!", charArray10);
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test4");
        library.Course course0 = new library.Course();
        java.util.Date date1 = course0.endDate;
        java.lang.String str2 = course0.getCourseCode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = course0.getStudentsToString();
    }

}

