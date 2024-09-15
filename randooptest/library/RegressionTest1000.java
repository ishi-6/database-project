package library;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1000 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        library.Subscription subscription0 = new library.Subscription();
        java.lang.String str1 = subscription0.getSite();
        subscription0.setSite("");
        subscription0.setSite("false");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        library.Subscription subscription0 = new library.Subscription();
        java.lang.String str1 = subscription0.getSite();
        subscription0.setSite("");
        java.lang.Class<?> wildcardClass4 = subscription0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        library.UserType userType0 = new library.UserType();
        library.Request request6 = new library.Request((library.User) userType0, "", "", "hi!", "", false);
        library.User user7 = request6.getUser();
        java.lang.String str8 = request6.getItemType();
        request6.setName("User: userType=null, email=null, password=null]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        library.UserType userType0 = new library.UserType();
        library.Request request6 = new library.Request((library.User) userType0, "", "", "hi!", "", false);
        java.lang.String str7 = userType0.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        library.UserType userType0 = new library.UserType();
        library.Request request6 = new library.Request((library.User) userType0, "", "", "hi!", "", false);
        library.User user7 = request6.getUser();
        java.util.Date date13 = null;
        java.util.Date date14 = null;
        library.UserType userType15 = new library.UserType();
        library.Request request21 = new library.Request((library.User) userType15, "", "", "hi!", "", false);
        library.CD cD27 = new library.CD("", "hi!", "", "", true, date13, date14, (library.User) userType15, "hi!", (java.lang.Double) 1.0d, "hi!", "", "hi!");
        java.lang.String str28 = userType15.toString();
        request6.setUser((library.User) userType15);
        java.lang.String str30 = userType15.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "User: userType=null, email=null, password=null]" + "'", str28.equals("User: userType=null, email=null, password=null]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "User: userType=null, email=null, password=null]" + "'", str30.equals("User: userType=null, email=null, password=null]"));
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        library.Book book0 = new library.Book();
        java.util.Date date1 = null;
        book0.considerIfLost(date1);
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            book0.setBorrowedDate(date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        java.util.Date date5 = null;
        java.util.Date date6 = null;
        library.User user7 = null;
        library.Magazine magazine13 = new library.Magazine("", "hi!", "", "", true, date5, date6, user7, "", (java.lang.Double) (-1.0d), "", "hi!", "");
        java.lang.Double double14 = magazine13.getCost();
        boolean boolean15 = magazine13.isPurchasable();
        java.lang.Double double16 = magazine13.getCost();
        magazine13.setEdition("User: userType=null, email=null, password=null]");
        java.lang.String str19 = magazine13.getEdition();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "User: userType=null, email=null, password=null]" + "'", str19.equals("User: userType=null, email=null, password=null]"));
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        library.UserType userType3 = new library.UserType("", "", "");
        java.lang.String str4 = userType3.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        java.util.Date date5 = null;
        java.util.Date date6 = null;
        library.UserType userType7 = new library.UserType();
        library.Request request13 = new library.Request((library.User) userType7, "", "", "hi!", "", false);
        library.Book book19 = new library.Book("false", "true", "true", "User: userType=null, email=null, password=null]", true, date5, date6, (library.User) userType7, "true", (java.lang.Double) 0.0d, "User: userType=null, email=null, password=null]", "true", "false");
        java.util.Date date20 = book19.getLostDate();
        java.lang.String str21 = book19.getLocation();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "User: userType=null, email=null, password=null]" + "'", str21.equals("User: userType=null, email=null, password=null]"));
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        library.SubscriptionDatabase subscriptionDatabase0 = library.MaintainSubscriptions.getInstance();
        java.lang.Class<?> wildcardClass1 = subscriptionDatabase0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(subscriptionDatabase0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        library.UserType userType0 = new library.UserType();
        library.Request request6 = new library.Request((library.User) userType0, "", "", "hi!", "", false);
        library.User user7 = request6.getUser();
        java.lang.String str8 = request6.getItemType();
        java.util.Date date14 = null;
        java.util.Date date15 = null;
        library.UserType userType16 = new library.UserType();
        library.Request request22 = new library.Request((library.User) userType16, "", "", "hi!", "", false);
        library.CD cD28 = new library.CD("", "hi!", "", "", true, date14, date15, (library.User) userType16, "hi!", (java.lang.Double) 1.0d, "hi!", "", "hi!");
        java.lang.String str29 = userType16.toString();
        userType16.setPassword("hi!");
        request6.setUser((library.User) userType16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "User: userType=null, email=null, password=null]" + "'", str29.equals("User: userType=null, email=null, password=null]"));
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        library.Student student0 = new library.Student();
        java.lang.String str1 = student0.getuserType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        java.util.Date date5 = null;
        java.util.Date date6 = null;
        library.UserType userType7 = new library.UserType();
        library.Request request13 = new library.Request((library.User) userType7, "", "", "hi!", "", false);
        library.Book book19 = new library.Book("false", "true", "true", "User: userType=null, email=null, password=null]", true, date5, date6, (library.User) userType7, "true", (java.lang.Double) 0.0d, "User: userType=null, email=null, password=null]", "true", "false");
        java.util.Date date20 = book19.getLostDate();
        boolean boolean21 = book19.isPurchasable();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        java.util.Date date5 = null;
        java.util.Date date6 = null;
        library.UserType userType7 = new library.UserType();
        library.Request request13 = new library.Request((library.User) userType7, "", "", "hi!", "", false);
        library.Book book19 = new library.Book("false", "true", "true", "User: userType=null, email=null, password=null]", true, date5, date6, (library.User) userType7, "true", (java.lang.Double) 0.0d, "User: userType=null, email=null, password=null]", "true", "false");
        java.util.Date date20 = book19.getLostDate();
        java.util.Date date21 = null;
        // The following exception was thrown during execution in test generation
        try {
            book19.setBorrowedDate(date21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date20);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        library.Book book0 = new library.Book();
        java.util.Date date1 = null;
        book0.considerIfLost(date1);
        java.lang.Double double3 = book0.getCost();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(double3);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        java.util.Date date5 = null;
        java.util.Date date6 = null;
        library.User user7 = null;
        library.Magazine magazine13 = new library.Magazine("", "hi!", "", "", true, date5, date6, user7, "", (java.lang.Double) (-1.0d), "", "hi!", "");
        java.lang.Double double14 = magazine13.getCost();
        boolean boolean15 = magazine13.isPurchasable();
        java.lang.Double double16 = magazine13.getCost();
        java.lang.String str17 = magazine13.getPurchasable();
        java.lang.Class<?> wildcardClass18 = magazine13.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "false" + "'", str17.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        library.Book book0 = new library.Book();
        boolean boolean1 = book0.getIfLost();
        boolean boolean2 = book0.isPurchasable();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        library.CD cD0 = new library.CD();
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        java.util.Date date5 = null;
        java.util.Date date6 = null;
        library.UserType userType7 = new library.UserType();
        library.Request request13 = new library.Request((library.User) userType7, "", "", "hi!", "", false);
        library.CD cD19 = new library.CD("", "hi!", "", "", true, date5, date6, (library.User) userType7, "hi!", (java.lang.Double) 1.0d, "hi!", "", "hi!");
        cD19.setEdition("");
        cD19.setPurchasable("");
        cD19.setOnDiscount("hi!");
        cD19.setPurchasable("true");
        java.util.Date date28 = cD19.getDueDate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date28);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        library.Nonfaculty nonfaculty0 = new library.Nonfaculty();
        java.lang.String str1 = nonfaculty0.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        java.util.Date date5 = null;
        java.util.Date date6 = null;
        library.User user7 = null;
        library.Magazine magazine13 = new library.Magazine("", "hi!", "", "", true, date5, date6, user7, "", (java.lang.Double) (-1.0d), "", "hi!", "");
        magazine13.setOnDiscount("");
        magazine13.setPurchasable("User: userType=null, email=null, password=null]");
        magazine13.setRentable("User: userType=null, email=null, password=null]");
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        library.AdminAccount adminAccount0 = new library.AdminAccount();
        java.lang.String str1 = adminAccount0.path;
        java.lang.String str2 = adminAccount0.path;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        java.util.Date date5 = null;
        java.util.Date date6 = null;
        library.UserType userType7 = new library.UserType();
        library.Request request13 = new library.Request((library.User) userType7, "", "", "hi!", "", false);
        library.CD cD19 = new library.CD("", "hi!", "", "", true, date5, date6, (library.User) userType7, "hi!", (java.lang.Double) 1.0d, "hi!", "", "hi!");
        cD19.setEdition("");
        cD19.setPurchasable("");
        java.lang.String str24 = cD19.getRentable();
        java.util.Date date25 = null;
        // The following exception was thrown during execution in test generation
        try {
            cD19.calcCost(date25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "true" + "'", str24.equals("true"));
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        library.AdminAccount adminAccount0 = new library.AdminAccount();
        java.lang.String str1 = adminAccount0.path;
        java.util.ArrayList<library.Item> itemList2 = null;
        // The following exception was thrown during execution in test generation
        try {
            adminAccount0.enable_ItemsList(itemList2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        java.util.Date date5 = null;
        java.util.Date date6 = null;
        library.UserType userType7 = new library.UserType();
        library.Request request13 = new library.Request((library.User) userType7, "", "", "hi!", "", false);
        library.CD cD19 = new library.CD("", "hi!", "", "", true, date5, date6, (library.User) userType7, "hi!", (java.lang.Double) 1.0d, "hi!", "", "hi!");
        cD19.setEdition("");
        cD19.setID("User: userType=null, email=null, password=null]");
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        library.MaintainSubscriptionsProxy maintainSubscriptionsProxy0 = new library.MaintainSubscriptionsProxy();
        library.Subscription subscription1 = new library.Subscription();
        java.lang.String str2 = subscription1.getSite();
        library.Subscription subscription3 = new library.Subscription();
        library.Subscription[] subscriptionArray4 = new library.Subscription[] { subscription1, subscription3 };
        java.util.ArrayList<library.Subscription> subscriptionList5 = new java.util.ArrayList<library.Subscription>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<library.Subscription>) subscriptionList5, subscriptionArray4);
        maintainSubscriptionsProxy0.setSubs((java.util.List<library.Subscription>) subscriptionList5);
        maintainSubscriptionsProxy0.load("true");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(subscriptionArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        java.util.Date date5 = null;
        java.util.Date date6 = null;
        library.UserType userType7 = new library.UserType();
        library.Request request13 = new library.Request((library.User) userType7, "", "", "hi!", "", false);
        library.CD cD19 = new library.CD("", "hi!", "", "", true, date5, date6, (library.User) userType7, "hi!", (java.lang.Double) 1.0d, "hi!", "", "hi!");
        cD19.setEdition("");
        cD19.setPurchasable("");
        cD19.setOnDiscount("hi!");
        cD19.setID("false");
        cD19.setOnDiscount("false");
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        library.Book book0 = new library.Book();
        boolean boolean1 = book0.getIfLost();
        java.lang.String str2 = book0.getOnDiscount();
        java.lang.String str3 = book0.getPublisher();
        java.util.Date date4 = null;
        // The following exception was thrown during execution in test generation
        try {
            book0.setBorrowedDate(date4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "false" + "'", str2.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        java.util.Date date5 = null;
        java.util.Date date6 = null;
        library.UserType userType7 = new library.UserType();
        library.Request request13 = new library.Request((library.User) userType7, "", "", "hi!", "", false);
        library.Book book19 = new library.Book("false", "true", "true", "User: userType=null, email=null, password=null]", true, date5, date6, (library.User) userType7, "true", (java.lang.Double) 0.0d, "User: userType=null, email=null, password=null]", "true", "false");
        java.lang.String str20 = userType7.getuserType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        library.MaintainCoursesProxy maintainCoursesProxy0 = new library.MaintainCoursesProxy();
        library.Course course1 = null;
        maintainCoursesProxy0.addCourse(course1);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        library.UserDatabase userDatabase0 = library.MaintainUser.getInstance();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userDatabase0);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        library.Request request0 = new library.Request();
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        java.util.Date date5 = null;
        java.util.Date date6 = null;
        library.UserType userType7 = new library.UserType();
        library.Request request13 = new library.Request((library.User) userType7, "", "", "hi!", "", false);
        library.CD cD19 = new library.CD("", "hi!", "", "", true, date5, date6, (library.User) userType7, "hi!", (java.lang.Double) 1.0d, "hi!", "", "hi!");
        cD19.setEdition("");
        cD19.setPurchasable("");
        library.Admin admin27 = new library.Admin("false", "false", "false");
        cD19.setOwner((library.User) admin27);
        java.util.List<library.Item> itemList29 = admin27.getItems();
        admin27.setUserType("true");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemList29);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        library.Faculty faculty0 = new library.Faculty();
        faculty0.setUserType("User: userType=null, email=null, password=null]");
        faculty0.setPassword("false");
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        library.Faculty faculty3 = new library.Faculty("", "false", "false");
        faculty3.setEmail("User: userType=null, email=null, password=null]");
        java.lang.String str6 = faculty3.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "User: userType=null, email=null, password=null]" + "'", str6.equals("User: userType=null, email=null, password=null]"));
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        java.util.Date date5 = null;
        java.util.Date date6 = null;
        library.UserType userType7 = new library.UserType();
        library.Request request13 = new library.Request((library.User) userType7, "", "", "hi!", "", false);
        library.CD cD19 = new library.CD("", "hi!", "", "", true, date5, date6, (library.User) userType7, "hi!", (java.lang.Double) 1.0d, "hi!", "", "hi!");
        cD19.setEdition("");
        cD19.setPurchasable("");
        java.lang.String str24 = cD19.getRentable();
        cD19.setTitle("User: userType=null, email=null, password=null]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "true" + "'", str24.equals("true"));
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        library.UserType userType0 = new library.UserType();
        library.Request request6 = new library.Request((library.User) userType0, "", "", "hi!", "", false);
        library.User user7 = request6.getUser();
        java.util.Date date13 = null;
        java.util.Date date14 = null;
        library.UserType userType15 = new library.UserType();
        library.Request request21 = new library.Request((library.User) userType15, "", "", "hi!", "", false);
        library.CD cD27 = new library.CD("", "hi!", "", "", true, date13, date14, (library.User) userType15, "hi!", (java.lang.Double) 1.0d, "hi!", "", "hi!");
        java.lang.String str28 = userType15.toString();
        request6.setUser((library.User) userType15);
        request6.setName("false");
        request6.setName("User: userType=, email=User: userType=null, email=null, password=null], password=false]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "User: userType=null, email=null, password=null]" + "'", str28.equals("User: userType=null, email=null, password=null]"));
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        java.util.Date date5 = null;
        java.util.Date date6 = null;
        library.User user7 = null;
        library.Magazine magazine13 = new library.Magazine("", "hi!", "", "", true, date5, date6, user7, "", (java.lang.Double) (-1.0d), "", "hi!", "");
        java.lang.Double double14 = magazine13.getCost();
        boolean boolean15 = magazine13.isPurchasable();
        java.lang.Double double16 = magazine13.getCost();
        java.lang.String str17 = magazine13.getID();
        java.lang.String str18 = magazine13.getTitle();
        java.lang.String str19 = magazine13.getLocation();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        java.util.Date date7 = null;
        java.util.Date date8 = null;
        library.UserType userType9 = new library.UserType();
        library.Request request15 = new library.Request((library.User) userType9, "", "", "hi!", "", false);
        library.Book book21 = new library.Book("false", "true", "true", "User: userType=null, email=null, password=null]", true, date7, date8, (library.User) userType9, "true", (java.lang.Double) 0.0d, "User: userType=null, email=null, password=null]", "true", "false");
        library.Subscription subscription23 = new library.Subscription("false", "false", (library.User) userType9, true);
        java.lang.String str24 = subscription23.isStatus();
        library.User user25 = subscription23.getU();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "true" + "'", str24.equals("true"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user25);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        java.util.Date date5 = null;
        java.util.Date date6 = null;
        library.User user7 = null;
        library.Magazine magazine13 = new library.Magazine("", "hi!", "", "", true, date5, date6, user7, "", (java.lang.Double) (-1.0d), "", "hi!", "");
        java.lang.Double double14 = magazine13.getCost();
        boolean boolean15 = magazine13.isPurchasable();
        java.lang.String str16 = magazine13.getPublisher();
        magazine13.setLocation("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        java.util.Date date5 = null;
        java.util.Date date6 = null;
        library.User user7 = null;
        library.Magazine magazine13 = new library.Magazine("", "hi!", "", "", true, date5, date6, user7, "", (java.lang.Double) (-1.0d), "", "hi!", "");
        java.lang.Double double14 = magazine13.getCost();
        boolean boolean15 = magazine13.isPurchasable();
        java.lang.Double double16 = magazine13.getCost();
        java.lang.String str17 = magazine13.getRentable();
        java.util.Date date18 = null;
        // The following exception was thrown during execution in test generation
        try {
            magazine13.calcCost(date18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "true" + "'", str17.equals("true"));
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        java.util.Date date5 = null;
        java.util.Date date6 = null;
        library.User user7 = null;
        library.Magazine magazine13 = new library.Magazine("", "hi!", "", "", true, date5, date6, user7, "", (java.lang.Double) (-1.0d), "", "hi!", "");
        magazine13.setOnDiscount("");
        magazine13.setPurchasable("User: userType=null, email=null, password=null]");
        magazine13.setTitle("");
        java.lang.String str20 = magazine13.getTitle();
        java.util.Date date21 = null;
        // The following exception was thrown during execution in test generation
        try {
            magazine13.calcCost(date21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        java.util.Date date5 = null;
        java.util.Date date6 = null;
        library.UserType userType7 = new library.UserType();
        library.Request request13 = new library.Request((library.User) userType7, "", "", "hi!", "", false);
        library.CD cD19 = new library.CD("", "hi!", "", "", true, date5, date6, (library.User) userType7, "hi!", (java.lang.Double) 1.0d, "hi!", "", "hi!");
        cD19.setEdition("");
        cD19.setPurchasable("");
        library.Admin admin27 = new library.Admin("false", "false", "false");
        cD19.setOwner((library.User) admin27);
        java.util.List<library.Item> itemList29 = admin27.getItems();
        library.Book book30 = new library.Book();
        boolean boolean31 = book30.getIfLost();
        java.lang.String str32 = book30.getItemType();
        admin27.enableItem((library.Item) book30);
        java.lang.String str34 = book30.getItemType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemList29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str34);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        library.Book book0 = new library.Book();
        boolean boolean1 = book0.getIfLost();
        java.lang.String str2 = book0.getOnDiscount();
        boolean boolean3 = book0.isPurchasable();
        book0.setPurchasable("User: userType=null, email=null, password=null]");
        java.lang.String str6 = book0.getTitle();
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            book0.calcCost(date7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "false" + "'", str2.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        java.util.Date date5 = null;
        java.util.Date date6 = null;
        library.User user7 = null;
        library.Magazine magazine13 = new library.Magazine("", "hi!", "", "", true, date5, date6, user7, "", (java.lang.Double) (-1.0d), "", "hi!", "");
        java.lang.Double double14 = magazine13.getCost();
        boolean boolean15 = magazine13.isPurchasable();
        magazine13.setPublisher("hi!");
        java.util.Date date18 = null;
        magazine13.setDueDate(date18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        java.util.Date date5 = null;
        java.util.Date date6 = null;
        library.UserType userType7 = new library.UserType();
        library.Request request13 = new library.Request((library.User) userType7, "", "", "hi!", "", false);
        library.CD cD19 = new library.CD("", "hi!", "", "", true, date5, date6, (library.User) userType7, "hi!", (java.lang.Double) 1.0d, "hi!", "", "hi!");
        cD19.setEdition("");
        cD19.setPurchasable("");
        java.lang.String str24 = cD19.getEdition();
        java.lang.String str25 = cD19.getPublisher();
        cD19.setPublisher("true");
        cD19.setPurchasable("User: userType=null, email=null, password=null]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "" + "'", str24.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!" + "'", str25.equals("hi!"));
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        library.AdminAccount adminAccount0 = new library.AdminAccount();
        java.lang.String str1 = adminAccount0.path;
        java.util.ArrayList<java.lang.String> strList2 = adminAccount0.getAllUnregMail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        library.Student student3 = new library.Student("true", "false", "User: userType=null, email=null, password=null]");
        student3.setEmail("User: userType=, email=User: userType=null, email=null, password=null], password=false]");
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        library.Faculty faculty3 = new library.Faculty("", "false", "false");
        faculty3.setEmail("User: userType=null, email=null, password=null]");
        faculty3.setUserType("User: userType=, email=User: userType=null, email=null, password=null], password=false]");
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        library.AdminAccount adminAccount0 = new library.AdminAccount();
        java.lang.String str1 = adminAccount0.path;
        library.Book book2 = new library.Book();
        boolean boolean3 = book2.getIfLost();
        java.lang.String str4 = book2.getOnDiscount();
        java.lang.String str5 = book2.getPublisher();
        java.lang.String str6 = book2.getLocation();
        adminAccount0.add_createItem((library.Item) book2);
        java.util.Date date8 = book2.getLostDate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "false" + "'", str4.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date8);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        java.util.Date date5 = null;
        java.util.Date date6 = null;
        library.User user7 = null;
        library.Magazine magazine13 = new library.Magazine("", "hi!", "", "", true, date5, date6, user7, "", (java.lang.Double) (-1.0d), "", "hi!", "");
        java.lang.Double double14 = magazine13.getCost();
        boolean boolean15 = magazine13.isPurchasable();
        java.util.Date date16 = magazine13.getBorrowedDate();
        java.util.Date date17 = magazine13.getLostDate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date17);
    }

  

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        library.Student student3 = new library.Student("false", "true", "");
        java.util.ArrayList<library.Course> courseList4 = student3.getCourses();
        java.lang.String str5 = student3.getuserType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(courseList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "false" + "'", str5.equals("false"));
    }


    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        java.util.Date date5 = null;
        java.util.Date date6 = null;
        library.User user7 = null;
        library.Magazine magazine13 = new library.Magazine("", "hi!", "", "", true, date5, date6, user7, "", (java.lang.Double) (-1.0d), "", "hi!", "");
        java.lang.Double double14 = magazine13.getCost();
        boolean boolean15 = magazine13.isPurchasable();
        java.lang.Double double16 = magazine13.getCost();
        java.lang.String str17 = magazine13.getID();
        magazine13.setLocation("");
        magazine13.setOnDiscount("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        java.util.Date date5 = null;
        java.util.Date date6 = null;
        library.User user7 = null;
        library.Magazine magazine13 = new library.Magazine("", "hi!", "", "", true, date5, date6, user7, "", (java.lang.Double) (-1.0d), "", "hi!", "");
        java.lang.Double double14 = magazine13.getCost();
        boolean boolean15 = magazine13.isPurchasable();
        java.lang.Double double16 = magazine13.getCost();
        java.lang.String str17 = magazine13.getID();
        java.lang.String str18 = magazine13.getRentable();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "true" + "'", str18.equals("true"));
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        library.Book book0 = new library.Book();
        boolean boolean1 = book0.getIfLost();
        java.lang.String str2 = book0.getOnDiscount();
        boolean boolean3 = book0.isPurchasable();
        book0.setPurchasable("User: userType=null, email=null, password=null]");
        book0.setPublisher("User: userType=null, email=null, password=null]");
        java.lang.String str8 = book0.getLocation();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "false" + "'", str2.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        java.util.Date date5 = null;
        java.util.Date date6 = null;
        library.User user7 = null;
        library.Magazine magazine13 = new library.Magazine("", "hi!", "", "", true, date5, date6, user7, "", (java.lang.Double) (-1.0d), "", "hi!", "");
        java.lang.Double double14 = magazine13.getCost();
        magazine13.setPurchasable("hi!");
        java.util.Date date17 = magazine13.getLostDate();
        boolean boolean18 = magazine13.isPurchasable();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        library.Book book0 = new library.Book();
        boolean boolean1 = book0.getIfLost();
        java.lang.String str2 = book0.getItemType();
        book0.setCost((java.lang.Double) 0.0d);
        java.util.Date date5 = null;
        book0.considerIfLost(date5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        java.util.Date date5 = null;
        java.util.Date date6 = null;
        library.User user7 = null;
        library.Magazine magazine13 = new library.Magazine("", "hi!", "", "", true, date5, date6, user7, "", (java.lang.Double) (-1.0d), "", "hi!", "");
        java.lang.Double double14 = magazine13.getCost();
        boolean boolean15 = magazine13.isPurchasable();
        java.lang.Double double16 = magazine13.getCost();
        java.lang.String str17 = magazine13.getID();
        magazine13.setEdition("true");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        java.util.Date date5 = null;
        java.util.Date date6 = null;
        library.User user7 = null;
        library.Magazine magazine13 = new library.Magazine("", "hi!", "", "", true, date5, date6, user7, "", (java.lang.Double) (-1.0d), "", "hi!", "");
        java.lang.Double double14 = magazine13.getCost();
        boolean boolean15 = magazine13.isPurchasable();
        java.lang.Double double16 = magazine13.getCost();
        magazine13.setCost((java.lang.Double) 10.0d);
        magazine13.setEdition("User: userType=, email=User: userType=null, email=null, password=null], password=false]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16.equals((-1.0d)));
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        java.util.Date date5 = null;
        java.util.Date date6 = null;
        library.UserType userType7 = new library.UserType();
        library.Request request13 = new library.Request((library.User) userType7, "", "", "hi!", "", false);
        library.Book book19 = new library.Book("false", "true", "true", "User: userType=null, email=null, password=null]", true, date5, date6, (library.User) userType7, "true", (java.lang.Double) 0.0d, "User: userType=null, email=null, password=null]", "true", "false");
        java.util.Date date20 = book19.getLostDate();
        java.lang.String str21 = book19.getPublisher();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "true" + "'", str21.equals("true"));
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        java.util.Date date5 = null;
        java.util.Date date6 = null;
        library.UserType userType7 = new library.UserType();
        library.Request request13 = new library.Request((library.User) userType7, "", "", "hi!", "", false);
        library.Book book19 = new library.Book("false", "true", "true", "User: userType=null, email=null, password=null]", true, date5, date6, (library.User) userType7, "true", (java.lang.Double) 0.0d, "User: userType=null, email=null, password=null]", "true", "false");
        java.util.Date date20 = book19.getLostDate();
        java.lang.Double double21 = book19.getCost();
        book19.setItemType("false");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21.equals(0.0d));
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        java.util.Date date5 = null;
        java.util.Date date6 = null;
        library.User user7 = null;
        library.Magazine magazine13 = new library.Magazine("", "hi!", "", "", true, date5, date6, user7, "", (java.lang.Double) (-1.0d), "", "hi!", "");
        java.lang.Double double14 = magazine13.getCost();
        boolean boolean15 = magazine13.isPurchasable();
        java.lang.Double double16 = magazine13.getCost();
        java.lang.String str17 = magazine13.getRentable();
        java.lang.String str18 = magazine13.getRentable();
        library.User user19 = magazine13.getOwner();
        java.lang.String str20 = magazine13.getPublisher();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "true" + "'", str17.equals("true"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "true" + "'", str18.equals("true"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        library.Faculty faculty0 = new library.Faculty();
        java.lang.String str1 = faculty0.getPassword();
        library.Book book2 = new library.Book();
        java.util.Date date3 = null;
        book2.considerIfLost(date3);
        java.util.Date date5 = book2.getBorrowedDate();
        faculty0.addBookItem(book2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date5);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        library.UserType userType0 = new library.UserType();
        library.Request request6 = new library.Request((library.User) userType0, "", "", "hi!", "", false);
        library.User user7 = null;
        request6.setUser(user7);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        library.Visitor visitor0 = new library.Visitor();
        java.lang.String str1 = visitor0.getuserType();
        visitor0.setPassword("hi!");
        visitor0.setPassword("true");
        visitor0.setUserType("false");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        java.util.Date date5 = null;
        java.util.Date date6 = null;
        library.User user7 = null;
        library.Magazine magazine13 = new library.Magazine("", "hi!", "", "", true, date5, date6, user7, "", (java.lang.Double) (-1.0d), "", "hi!", "");
        java.util.Date date14 = null;
        magazine13.considerIfLost(date14);
        magazine13.setTitle("false");
        magazine13.setID("true");
        java.util.Date date20 = magazine13.getDueDate();
        magazine13.setTitle("false");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date20);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        java.util.Date date5 = null;
        java.util.Date date6 = null;
        library.UserType userType7 = new library.UserType();
        library.Request request13 = new library.Request((library.User) userType7, "", "", "hi!", "", false);
        library.CD cD19 = new library.CD("", "hi!", "", "", true, date5, date6, (library.User) userType7, "hi!", (java.lang.Double) 1.0d, "hi!", "", "hi!");
        cD19.setEdition("");
        cD19.setPurchasable("");
        library.Admin admin27 = new library.Admin("false", "false", "false");
        cD19.setOwner((library.User) admin27);
        java.lang.String str29 = admin27.getuserType();
        java.util.List<library.Item> itemList30 = admin27.getItems();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "false" + "'", str29.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemList30);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        library.Faculty faculty3 = new library.Faculty("", "false", "false");
        faculty3.setEmail("User: userType=null, email=null, password=null]");
        java.lang.String str6 = faculty3.getuserType();
        java.lang.String str7 = faculty3.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "false" + "'", str7.equals("false"));
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        java.util.Date date5 = null;
        java.util.Date date6 = null;
        library.Visitor visitor7 = new library.Visitor();
        library.Book book13 = new library.Book("hi!", "", "", "true", false, date5, date6, (library.User) visitor7, "User: userType=null, email=null, password=null]", (java.lang.Double) 0.0d, "true", "", "User: userType=null, email=null, password=null]");
        boolean boolean14 = book13.getIfLost();
        java.util.Date date15 = null;
        // The following exception was thrown during execution in test generation
        try {
            book13.calcCost(date15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        library.Faculty faculty0 = new library.Faculty();
        java.lang.String str1 = faculty0.getPassword();
        java.lang.String str2 = faculty0.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        java.util.Date date5 = null;
        java.util.Date date6 = null;
        library.UserType userType7 = new library.UserType();
        library.Request request13 = new library.Request((library.User) userType7, "", "", "hi!", "", false);
        library.CD cD19 = new library.CD("", "hi!", "", "", true, date5, date6, (library.User) userType7, "hi!", (java.lang.Double) 1.0d, "hi!", "", "hi!");
        cD19.setEdition("");
        cD19.setPurchasable("");
        cD19.setOnDiscount("hi!");
        cD19.setPurchasable("true");
        boolean boolean28 = cD19.isRentable();
        java.lang.Double double29 = cD19.getCost();
        java.util.Date date35 = null;
        java.util.Date date36 = null;
        library.UserType userType37 = new library.UserType();
        library.Request request43 = new library.Request((library.User) userType37, "", "", "hi!", "", false);
        library.CD cD49 = new library.CD("", "hi!", "", "", true, date35, date36, (library.User) userType37, "hi!", (java.lang.Double) 1.0d, "hi!", "", "hi!");
        cD49.setEdition("");
        cD49.setPurchasable("");
        library.Admin admin57 = new library.Admin("false", "false", "false");
        cD49.setOwner((library.User) admin57);
        java.util.List<library.Item> itemList59 = admin57.getItems();
        cD19.setOwner((library.User) admin57);
        java.util.Date date61 = null;
        cD19.considerIfLost(date61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 1.0d + "'", double29.equals(1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemList59);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        java.util.Date date5 = null;
        java.util.Date date6 = null;
        library.User user7 = null;
        library.Magazine magazine13 = new library.Magazine("", "hi!", "", "", true, date5, date6, user7, "", (java.lang.Double) (-1.0d), "", "hi!", "");
        java.lang.Double double14 = magazine13.getCost();
        boolean boolean15 = magazine13.isPurchasable();
        java.lang.Double double16 = magazine13.getCost();
        boolean boolean17 = magazine13.isRentable();
        library.Student student21 = new library.Student("false", "true", "");
        magazine13.setOwner((library.User) student21);
        library.Book book23 = new library.Book();
        boolean boolean24 = book23.getIfLost();
        java.lang.String str25 = book23.getOnDiscount();
        student21.addBookItem(book23);
        library.Faculty faculty30 = new library.Faculty("", "false", "false");
        faculty30.setEmail("User: userType=null, email=null, password=null]");
        java.lang.String str33 = faculty30.toString();
        book23.setOwner((library.User) faculty30);
        java.lang.String str35 = book23.getItemType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "false" + "'", str25.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "User: userType=, email=User: userType=null, email=null, password=null], password=false]" + "'", str33.equals("User: userType=, email=User: userType=null, email=null, password=null], password=false]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str35);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        library.Faculty faculty3 = new library.Faculty("", "false", "false");
        faculty3.setUserType("User: userType=, email=User: userType=null, email=null, password=null], password=false]");
        faculty3.setUserType("false");
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        java.util.Date date5 = null;
        java.util.Date date6 = null;
        library.UserType userType7 = new library.UserType();
        library.Request request13 = new library.Request((library.User) userType7, "", "", "hi!", "", false);
        library.CD cD19 = new library.CD("", "hi!", "", "", true, date5, date6, (library.User) userType7, "hi!", (java.lang.Double) 1.0d, "hi!", "", "hi!");
        cD19.setEdition("");
        cD19.setPurchasable("");
        java.lang.String str24 = cD19.getEdition();
        java.lang.String str25 = cD19.getPublisher();
        cD19.setPublisher("true");
        java.lang.String str28 = cD19.getLocation();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "" + "'", str24.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!" + "'", str25.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "" + "'", str28.equals(""));
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        java.util.Date date5 = null;
        java.util.Date date6 = null;
        library.UserType userType7 = new library.UserType();
        library.Request request13 = new library.Request((library.User) userType7, "", "", "hi!", "", false);
        library.CD cD19 = new library.CD("", "hi!", "", "", true, date5, date6, (library.User) userType7, "hi!", (java.lang.Double) 1.0d, "hi!", "", "hi!");
        cD19.setEdition("");
        cD19.setPurchasable("");
        java.lang.String str24 = cD19.getEdition();
        java.lang.String str25 = cD19.getTitle();
        java.lang.String str26 = cD19.getOnDiscount();
        cD19.setLocation("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "" + "'", str24.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!" + "'", str25.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "false" + "'", str26.equals("false"));
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        library.Book book0 = new library.Book();
        boolean boolean1 = book0.getIfLost();
        java.lang.String str2 = book0.getOnDiscount();
        java.lang.String str3 = book0.getPublisher();
        java.lang.String str4 = book0.getLocation();
        boolean boolean5 = book0.getIfLost();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "false" + "'", str2.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        java.util.Date date5 = null;
        java.util.Date date6 = null;
        library.User user7 = null;
        library.Magazine magazine13 = new library.Magazine("", "hi!", "", "", true, date5, date6, user7, "", (java.lang.Double) (-1.0d), "", "hi!", "");
        java.lang.Double double14 = magazine13.getCost();
        magazine13.setPurchasable("hi!");
        java.lang.String str17 = magazine13.getEdition();
        magazine13.setItemType("User: userType=null, email=null, password=null]");
        magazine13.setOnDiscount("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        library.UserType userType3 = new library.UserType("false", "", "hi!");
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        library.Visitor visitor0 = new library.Visitor();
        java.lang.String str1 = visitor0.getuserType();
        java.lang.String str2 = visitor0.getuserType();
        visitor0.setPassword("true");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        library.Search search1 = new library.Search();
        library.Search search4 = new library.Search();
        library.ItemDatabase itemDatabase6 = library.MaintainItems.getInstance();
        java.util.List<library.Item> itemList7 = search4.strategyInput("hi!", itemDatabase6);
        java.util.List<library.Item> itemList8 = library.Facade.search("hi!", itemDatabase6);
        java.util.List<library.Item> itemList9 = search1.strategyInput("User: userType=null, email=null, password=null]", itemDatabase6);
        java.util.List<library.Item> itemList10 = library.Facade.search("true", itemDatabase6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemDatabase6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemList10);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        library.UserType userType0 = new library.UserType();
        library.Request request6 = new library.Request((library.User) userType0, "", "", "hi!", "", false);
        library.User user7 = request6.getUser();
        java.lang.String str8 = request6.getPriority();
        java.lang.String str9 = request6.getItemType();
        java.lang.String str10 = request6.getPriority();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        java.util.Date date5 = null;
        java.util.Date date6 = null;
        library.UserType userType7 = new library.UserType();
        library.Request request13 = new library.Request((library.User) userType7, "", "", "hi!", "", false);
        library.CD cD19 = new library.CD("", "hi!", "", "", true, date5, date6, (library.User) userType7, "hi!", (java.lang.Double) 1.0d, "hi!", "", "hi!");
        java.lang.String str20 = cD19.getRentable();
        cD19.setRentable("hi!");
        java.util.Date date23 = null;
        cD19.considerIfLost(date23);
        java.lang.Class<?> wildcardClass25 = cD19.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "true" + "'", str20.equals("true"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        java.util.Date date5 = null;
        java.util.Date date6 = null;
        library.UserType userType7 = new library.UserType();
        library.Request request13 = new library.Request((library.User) userType7, "", "", "hi!", "", false);
        library.CD cD19 = new library.CD("", "hi!", "", "", true, date5, date6, (library.User) userType7, "hi!", (java.lang.Double) 1.0d, "hi!", "", "hi!");
        cD19.setEdition("");
        cD19.setPurchasable("");
        cD19.setOnDiscount("hi!");
        java.lang.String str26 = cD19.getOnDiscount();
        java.lang.String str27 = cD19.getTitle();
        java.lang.String str28 = cD19.getTitle();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "false" + "'", str26.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "hi!" + "'", str27.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "hi!" + "'", str28.equals("hi!"));
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        library.Subscription subscription0 = new library.Subscription();
        java.lang.String str1 = subscription0.getSite();
        subscription0.setSite("");
        subscription0.setSite("");
        library.User user6 = subscription0.getU();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user6);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        java.util.Date date5 = null;
        java.util.Date date6 = null;
        library.User user7 = null;
        library.Magazine magazine13 = new library.Magazine("", "hi!", "", "", true, date5, date6, user7, "", (java.lang.Double) (-1.0d), "", "hi!", "");
        magazine13.setOnDiscount("");
        magazine13.setRentable("false");
        magazine13.setID("");
    }

   

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        java.util.Date date5 = null;
        java.util.Date date6 = null;
        library.UserType userType7 = new library.UserType();
        library.Request request13 = new library.Request((library.User) userType7, "", "", "hi!", "", false);
        library.CD cD19 = new library.CD("", "hi!", "", "", true, date5, date6, (library.User) userType7, "hi!", (java.lang.Double) 1.0d, "hi!", "", "hi!");
        cD19.setEdition("");
        cD19.setPurchasable("");
        java.lang.String str24 = cD19.getEdition();
        java.lang.String str25 = cD19.getTitle();
        java.lang.String str26 = cD19.getOnDiscount();
        java.util.Date date27 = null;
        cD19.setDueDate(date27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "" + "'", str24.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!" + "'", str25.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "false" + "'", str26.equals("false"));
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        java.util.Date date5 = null;
        java.util.Date date6 = null;
        library.Student student7 = new library.Student();
        java.lang.String str8 = student7.getuserType();
        library.Book book14 = new library.Book("true", "hi!", "hi!", "false", false, date5, date6, (library.User) student7, "", (java.lang.Double) 1.0d, "hi!", "", "");
        java.util.Date date15 = null;
        // The following exception was thrown during execution in test generation
        try {
            book14.setBorrowedDate(date15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        java.util.Date date5 = null;
        java.util.Date date6 = null;
        library.UserType userType7 = new library.UserType();
        library.Request request13 = new library.Request((library.User) userType7, "", "", "hi!", "", false);
        library.CD cD19 = new library.CD("", "hi!", "", "", true, date5, date6, (library.User) userType7, "hi!", (java.lang.Double) 1.0d, "hi!", "", "hi!");
        cD19.setEdition("");
        cD19.setPurchasable("");
        cD19.setOnDiscount("hi!");
        cD19.setPurchasable("true");
        library.User user28 = cD19.getOwner();
        boolean boolean29 = cD19.isOnDiscount();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        library.Visitor visitor3 = new library.Visitor("false", "true", "true");
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        java.util.Date date5 = null;
        java.util.Date date6 = null;
        library.User user7 = null;
        library.Magazine magazine13 = new library.Magazine("", "hi!", "", "", true, date5, date6, user7, "", (java.lang.Double) (-1.0d), "", "hi!", "");
        magazine13.setOnDiscount("");
        magazine13.setRentable("false");
        java.lang.String str18 = magazine13.getPublisher();
        magazine13.setEdition("true");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        library.Facade facade0 = new library.Facade();
        boolean boolean2 = facade0.passwordValid("User: userType=null, email=null, password=null]");
        boolean boolean4 = facade0.userTypeValid("false");
        boolean boolean6 = facade0.userTypeValid("true");
        library.User user7 = facade0.getUser();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user7);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        java.util.Date date5 = null;
        java.util.Date date6 = null;
        library.User user7 = null;
        library.Magazine magazine13 = new library.Magazine("", "hi!", "", "", true, date5, date6, user7, "", (java.lang.Double) (-1.0d), "", "hi!", "");
        magazine13.setOnDiscount("");
        magazine13.setPurchasable("User: userType=null, email=null, password=null]");
        java.util.Date date18 = magazine13.getLostDate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date18);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        library.Nonfaculty nonfaculty0 = new library.Nonfaculty();
        java.lang.String str1 = nonfaculty0.getuserType();
        library.Request request7 = new library.Request((library.User) nonfaculty0, "", "false", "hi!", "false", true);
        java.lang.String str8 = request7.getPriority();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "false" + "'", str8.equals("false"));
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        java.util.Date date5 = null;
        java.util.Date date6 = null;
        library.UserType userType7 = new library.UserType();
        library.Request request13 = new library.Request((library.User) userType7, "", "", "hi!", "", false);
        library.CD cD19 = new library.CD("", "hi!", "", "", true, date5, date6, (library.User) userType7, "hi!", (java.lang.Double) 1.0d, "hi!", "", "hi!");
        cD19.setEdition("");
        cD19.setPurchasable("");
        cD19.setOnDiscount("hi!");
        cD19.setID("false");
        java.util.Date date28 = null;
        // The following exception was thrown during execution in test generation
        try {
            cD19.calcCost(date28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        library.UserType userType0 = new library.UserType();
        library.Request request6 = new library.Request((library.User) userType0, "", "", "hi!", "", false);
        library.User user7 = request6.getUser();
        library.User user8 = request6.getUser();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user8);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        library.Subscription subscription0 = new library.Subscription();
        java.lang.String str1 = subscription0.getSite();
        library.Visitor visitor2 = new library.Visitor();
        java.lang.String str3 = visitor2.getuserType();
        java.lang.String str4 = visitor2.getPassword();
        subscription0.setU((library.User) visitor2);
        visitor2.setUserType("false");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        java.util.Date date7 = null;
        java.util.Date date8 = null;
        library.UserType userType9 = new library.UserType();
        library.Request request15 = new library.Request((library.User) userType9, "", "", "hi!", "", false);
        library.Book book21 = new library.Book("false", "true", "true", "User: userType=null, email=null, password=null]", true, date7, date8, (library.User) userType9, "true", (java.lang.Double) 0.0d, "User: userType=null, email=null, password=null]", "true", "false");
        library.Subscription subscription23 = new library.Subscription("false", "false", (library.User) userType9, true);
        java.lang.String str24 = subscription23.isStatus();
        java.lang.String str25 = subscription23.isStatus();
        java.lang.String str26 = subscription23.getCompanyName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "true" + "'", str24.equals("true"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "true" + "'", str25.equals("true"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "false" + "'", str26.equals("false"));
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        library.MaintainNewsletterProxy maintainNewsletterProxy0 = new library.MaintainNewsletterProxy();
        library.NewsletterSystem newsletterSystem3 = new library.NewsletterSystem("true", "User: userType=null, email=null, password=null]");
        library.NewsletterSystem[] newsletterSystemArray4 = new library.NewsletterSystem[] { newsletterSystem3 };
        java.util.ArrayList<library.NewsletterSystem> newsletterSystemList5 = new java.util.ArrayList<library.NewsletterSystem>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<library.NewsletterSystem>) newsletterSystemList5, newsletterSystemArray4);
        maintainNewsletterProxy0.setNews((java.util.List<library.NewsletterSystem>) newsletterSystemList5);
        library.MaintainNewsletterProxy maintainNewsletterProxy8 = new library.MaintainNewsletterProxy();
        library.NewsletterSystem newsletterSystem11 = new library.NewsletterSystem("true", "User: userType=null, email=null, password=null]");
        library.NewsletterSystem[] newsletterSystemArray12 = new library.NewsletterSystem[] { newsletterSystem11 };
        java.util.ArrayList<library.NewsletterSystem> newsletterSystemList13 = new java.util.ArrayList<library.NewsletterSystem>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<library.NewsletterSystem>) newsletterSystemList13, newsletterSystemArray12);
        maintainNewsletterProxy8.setNews((java.util.List<library.NewsletterSystem>) newsletterSystemList13);
        maintainNewsletterProxy0.setNews((java.util.List<library.NewsletterSystem>) newsletterSystemList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(newsletterSystemArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(newsletterSystemArray12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        library.Visitor visitor0 = new library.Visitor();
        java.lang.String str1 = visitor0.getuserType();
        java.lang.String str2 = visitor0.getPassword();
        library.Request request8 = new library.Request((library.User) visitor0, "true", "User: userType=, email=User: userType=null, email=null, password=null], password=false]", "", "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        library.MaintainRequestsProxy maintainRequestsProxy0 = new library.MaintainRequestsProxy();
        library.MaintainRequestsProxy maintainRequestsProxy1 = new library.MaintainRequestsProxy();
        library.UserType userType2 = new library.UserType();
        library.Request request8 = new library.Request((library.User) userType2, "", "", "hi!", "", false);
        library.User user9 = request8.getUser();
        java.lang.String str10 = request8.getItemType();
        java.lang.String str11 = maintainRequestsProxy1.notifyPriority(request8);
        maintainRequestsProxy0.removeReq(request8);
// flaky:         maintainRequestsProxy0.load("hi!");
        java.util.List<library.Request> requestList15 = maintainRequestsProxy0.getReqCT();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(requestList15);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        library.MaintainCoursesProxy maintainCoursesProxy0 = new library.MaintainCoursesProxy();
        library.Course[] courseArray1 = new library.Course[] {};
        java.util.ArrayList<library.Course> courseList2 = new java.util.ArrayList<library.Course>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<library.Course>) courseList2, courseArray1);
        maintainCoursesProxy0.setCourses((java.util.List<library.Course>) courseList2);
        library.Course course5 = null;
        library.Course course6 = maintainCoursesProxy0.getCourse(course5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(courseArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(course6);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        java.util.Date date5 = null;
        java.util.Date date6 = null;
        library.User user7 = null;
        library.Magazine magazine13 = new library.Magazine("", "hi!", "", "", true, date5, date6, user7, "", (java.lang.Double) (-1.0d), "", "hi!", "");
        java.lang.Double double14 = magazine13.getCost();
        boolean boolean15 = magazine13.isPurchasable();
        java.lang.String str16 = magazine13.getEdition();
        java.lang.String str17 = magazine13.getEdition();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        java.util.Date date5 = null;
        java.util.Date date6 = null;
        library.UserType userType7 = new library.UserType();
        library.Request request13 = new library.Request((library.User) userType7, "", "", "hi!", "", false);
        library.CD cD19 = new library.CD("", "hi!", "", "", true, date5, date6, (library.User) userType7, "hi!", (java.lang.Double) 1.0d, "hi!", "", "hi!");
        cD19.setEdition("");
        cD19.setPurchasable("");
        library.Admin admin27 = new library.Admin("false", "false", "false");
        cD19.setOwner((library.User) admin27);
        java.util.List<library.Item> itemList29 = admin27.getItems();
        admin27.setPassword("hi!");
        java.util.List<library.Item> itemList32 = admin27.getItems();
        java.lang.String str33 = admin27.getEmail();
        admin27.setEmail("User: userType=, email=User: userType=null, email=null, password=null], password=false]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemList29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemList32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "false" + "'", str33.equals("false"));
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        library.Faculty faculty3 = new library.Faculty("", "false", "false");
        faculty3.setEmail("User: userType=, email=User: userType=null, email=null, password=null], password=false]");
        library.Request request11 = new library.Request((library.User) faculty3, "false", "User: userType=null, email=null, password=null]", "hi!", "User: userType=, email=User: userType=null, email=null, password=null], password=false]", true);
        java.lang.String str12 = faculty3.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "User: userType=, email=User: userType=null, email=null, password=null], password=false]" + "'", str12.equals("User: userType=, email=User: userType=null, email=null, password=null], password=false]"));
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        java.util.Date date5 = null;
        java.util.Date date6 = null;
        library.UserType userType7 = new library.UserType();
        library.Request request13 = new library.Request((library.User) userType7, "", "", "hi!", "", false);
        library.CD cD19 = new library.CD("", "hi!", "", "", true, date5, date6, (library.User) userType7, "hi!", (java.lang.Double) 1.0d, "hi!", "", "hi!");
        java.lang.String str20 = cD19.getRentable();
        cD19.setRentable("hi!");
        boolean boolean23 = cD19.isOnDiscount();
        cD19.setEdition("User: userType=null, email=null, password=null]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "true" + "'", str20.equals("true"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        java.util.Date date5 = null;
        java.util.Date date6 = null;
        library.Admin admin10 = new library.Admin("false", "false", "false");
        java.lang.String str11 = admin10.getPassword();
        library.CD cD17 = new library.CD("", "true", "false", "true", false, date5, date6, (library.User) admin10, "hi!", (java.lang.Double) 0.0d, "true", "hi!", "");
        java.util.Date date18 = null;
        cD17.considerIfLost(date18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "false" + "'", str11.equals("false"));
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        library.Admin admin0 = new library.Admin();
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        java.util.Date date5 = null;
        java.util.Date date6 = null;
        library.Visitor visitor7 = new library.Visitor();
        library.Book book13 = new library.Book("hi!", "", "", "true", false, date5, date6, (library.User) visitor7, "User: userType=null, email=null, password=null]", (java.lang.Double) 0.0d, "true", "", "User: userType=null, email=null, password=null]");
        book13.setLocation("User: userType=null, email=null, password=null]");
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        library.MaintainRequestsProxy maintainRequestsProxy0 = new library.MaintainRequestsProxy();
        library.UserType userType1 = new library.UserType();
        library.Request request7 = new library.Request((library.User) userType1, "", "", "hi!", "", false);
        library.User user8 = request7.getUser();
        java.lang.String str9 = request7.getItemType();
        java.lang.String str10 = maintainRequestsProxy0.notifyPriority(request7);
        library.UserType userType11 = new library.UserType();
        library.Request request17 = new library.Request((library.User) userType11, "", "", "hi!", "", false);
        library.User user18 = request17.getUser();
        java.lang.String str19 = maintainRequestsProxy0.notifyPriority(request17);
        java.util.Date date25 = null;
        java.util.Date date26 = null;
        java.util.Date date32 = null;
        java.util.Date date33 = null;
        library.UserType userType34 = new library.UserType();
        library.Request request40 = new library.Request((library.User) userType34, "", "", "hi!", "", false);
        library.CD cD46 = new library.CD("", "hi!", "", "", true, date32, date33, (library.User) userType34, "hi!", (java.lang.Double) 1.0d, "hi!", "", "hi!");
        cD46.setEdition("");
        cD46.setPurchasable("");
        library.Admin admin54 = new library.Admin("false", "false", "false");
        cD46.setOwner((library.User) admin54);
        java.lang.String str56 = admin54.getPassword();
        java.util.ArrayList<library.Request> requestList57 = admin54.getRequestList();
        admin54.handleRequests();
        library.CD cD64 = new library.CD("true", "hi!", "", "User: userType=null, email=null, password=null]", false, date25, date26, (library.User) admin54, "", (java.lang.Double) 10.0d, "", "true", "");
        java.util.Date date70 = null;
        java.util.Date date71 = null;
        library.UserType userType72 = new library.UserType();
        library.Request request78 = new library.Request((library.User) userType72, "", "", "hi!", "", false);
        library.CD cD84 = new library.CD("", "hi!", "", "", true, date70, date71, (library.User) userType72, "hi!", (java.lang.Double) 1.0d, "hi!", "", "hi!");
        cD84.setEdition("");
        cD84.setPurchasable("");
        library.Admin admin92 = new library.Admin("false", "false", "false");
        cD84.setOwner((library.User) admin92);
        java.lang.String str94 = admin92.getPassword();
        java.util.ArrayList<library.Request> requestList95 = admin92.getRequestList();
        admin92.handleRequests();
        java.util.ArrayList<library.Request> requestList97 = admin92.getRequestList();
        admin54.setRequestList(requestList97);
        maintainRequestsProxy0.setReqSI((java.util.List<library.Request>) requestList97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str56 + "' != '" + "false" + "'", str56.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(requestList57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str94 + "' != '" + "false" + "'", str94.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(requestList95);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(requestList97);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        java.util.Date date5 = null;
        java.util.Date date6 = null;
        library.UserType userType7 = new library.UserType();
        library.Request request13 = new library.Request((library.User) userType7, "", "", "hi!", "", false);
        library.CD cD19 = new library.CD("", "hi!", "", "", true, date5, date6, (library.User) userType7, "hi!", (java.lang.Double) 1.0d, "hi!", "", "hi!");
        cD19.setEdition("");
        cD19.setPurchasable("");
        library.Admin admin27 = new library.Admin("false", "false", "false");
        cD19.setOwner((library.User) admin27);
        java.util.Date date29 = null;
        cD19.considerIfLost(date29);
        cD19.setLost(false);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        java.util.Date date5 = null;
        java.util.Date date6 = null;
        library.User user7 = null;
        library.Magazine magazine13 = new library.Magazine("", "hi!", "", "", true, date5, date6, user7, "", (java.lang.Double) (-1.0d), "", "hi!", "");
        java.lang.Double double14 = magazine13.getCost();
        boolean boolean15 = magazine13.isPurchasable();
        java.lang.Double double16 = magazine13.getCost();
        java.lang.String str17 = magazine13.getPurchasable();
        java.util.Date date18 = null;
        // The following exception was thrown during execution in test generation
        try {
            magazine13.calcCost(date18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "false" + "'", str17.equals("false"));
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        java.util.Date date5 = null;
        java.util.Date date6 = null;
        java.util.Date date12 = null;
        java.util.Date date13 = null;
        library.UserType userType14 = new library.UserType();
        library.Request request20 = new library.Request((library.User) userType14, "", "", "hi!", "", false);
        library.CD cD26 = new library.CD("", "hi!", "", "", true, date12, date13, (library.User) userType14, "hi!", (java.lang.Double) 1.0d, "hi!", "", "hi!");
        cD26.setEdition("");
        cD26.setPurchasable("");
        library.Admin admin34 = new library.Admin("false", "false", "false");
        cD26.setOwner((library.User) admin34);
        java.lang.String str36 = admin34.getPassword();
        java.util.ArrayList<library.Request> requestList37 = admin34.getRequestList();
        admin34.handleRequests();
        library.CD cD44 = new library.CD("true", "hi!", "", "User: userType=null, email=null, password=null]", false, date5, date6, (library.User) admin34, "", (java.lang.Double) 10.0d, "", "true", "");
        java.util.Date date50 = null;
        java.util.Date date51 = null;
        library.UserType userType52 = new library.UserType();
        library.Request request58 = new library.Request((library.User) userType52, "", "", "hi!", "", false);
        library.CD cD64 = new library.CD("", "hi!", "", "", true, date50, date51, (library.User) userType52, "hi!", (java.lang.Double) 1.0d, "hi!", "", "hi!");
        cD64.setEdition("");
        cD64.setPurchasable("");
        library.Admin admin72 = new library.Admin("false", "false", "false");
        cD64.setOwner((library.User) admin72);
        java.lang.String str74 = admin72.getPassword();
        java.util.ArrayList<library.Request> requestList75 = admin72.getRequestList();
        admin72.handleRequests();
        java.util.ArrayList<library.Request> requestList77 = admin72.getRequestList();
        admin34.setRequestList(requestList77);
        java.lang.String str79 = admin34.getuserType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "false" + "'", str36.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(requestList37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str74 + "' != '" + "false" + "'", str74.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(requestList75);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(requestList77);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str79 + "' != '" + "false" + "'", str79.equals("false"));
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        library.Student student3 = new library.Student("true", "false", "User: userType=null, email=null, password=null]");
        java.lang.String str4 = student3.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "User: userType=true, email=false, password=User: userType=null, email=null, password=null]]" + "'", str4.equals("User: userType=true, email=false, password=User: userType=null, email=null, password=null]]"));
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        java.util.Date date5 = null;
        java.util.Date date6 = null;
        library.UserType userType7 = new library.UserType();
        library.Request request13 = new library.Request((library.User) userType7, "", "", "hi!", "", false);
        library.CD cD19 = new library.CD("", "hi!", "", "", true, date5, date6, (library.User) userType7, "hi!", (java.lang.Double) 1.0d, "hi!", "", "hi!");
        cD19.setItemType("User: userType=null, email=null, password=null]");
        java.lang.Double double22 = cD19.getCost();
        cD19.setItemType("true");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.0d + "'", double22.equals(1.0d));
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        library.Book book0 = new library.Book();
        boolean boolean1 = book0.getIfLost();
        java.lang.String str2 = book0.getOnDiscount();
        boolean boolean3 = book0.isPurchasable();
        book0.setPurchasable("User: userType=null, email=null, password=null]");
        java.lang.String str6 = book0.getTitle();
        java.util.Date date7 = book0.getDueDate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "false" + "'", str2.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date7);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        library.Admin admin3 = new library.Admin("false", "false", "false");
        java.lang.String str4 = admin3.getPassword();
        admin3.handleRequests();
        java.lang.String str6 = admin3.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "false" + "'", str4.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "User: userType=false, email=false, password=false]" + "'", str6.equals("User: userType=false, email=false, password=false]"));
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        java.util.Date date5 = null;
        java.util.Date date6 = null;
        library.User user7 = null;
        library.Magazine magazine13 = new library.Magazine("", "hi!", "", "", true, date5, date6, user7, "", (java.lang.Double) (-1.0d), "", "hi!", "");
        magazine13.setOnDiscount("");
        magazine13.setPurchasable("User: userType=null, email=null, password=null]");
        magazine13.setTitle("");
        java.util.Date date20 = null;
        // The following exception was thrown during execution in test generation
        try {
            magazine13.setBorrowedDate(date20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        library.AdminAccount adminAccount0 = new library.AdminAccount();
        java.lang.String str1 = adminAccount0.path;
        adminAccount0.path = "false";
        adminAccount0.path = "hi!";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        library.NewsletterDatabase newsletterDatabase0 = library.MaintainNewsletter.getInstance();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(newsletterDatabase0);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        library.Faculty faculty0 = new library.Faculty();
        faculty0.setEmail("false");
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        library.Nonfaculty nonfaculty0 = new library.Nonfaculty();
        nonfaculty0.setPassword("hi!");
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        library.Faculty faculty0 = new library.Faculty();
        faculty0.setUserType("User: userType=null, email=null, password=null]");
        faculty0.setEmail("false");
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        library.AdminAccount adminAccount0 = new library.AdminAccount();
        java.util.List<library.Item> itemList1 = adminAccount0.return_allItems();
        adminAccount0.path = "false";
        java.lang.String str4 = adminAccount0.path;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "false" + "'", str4.equals("false"));
    }

    

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        library.Faculty faculty3 = new library.Faculty("", "false", "false");
        faculty3.setEmail("User: userType=null, email=null, password=null]");
        java.lang.String str6 = faculty3.getuserType();
        faculty3.setUserType("User: userType=true, email=false, password=User: userType=null, email=null, password=null]]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        java.util.Date date5 = null;
        java.util.Date date6 = null;
        library.UserType userType7 = new library.UserType();
        library.Request request13 = new library.Request((library.User) userType7, "", "", "hi!", "", false);
        library.CD cD19 = new library.CD("", "hi!", "", "", true, date5, date6, (library.User) userType7, "hi!", (java.lang.Double) 1.0d, "hi!", "", "hi!");
        cD19.setEdition("");
        cD19.setPurchasable("");
        cD19.setOnDiscount("hi!");
        cD19.setPurchasable("true");
        library.User user28 = cD19.getOwner();
        java.util.Date date29 = null;
        // The following exception was thrown during execution in test generation
        try {
            cD19.calcCost(date29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user28);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        java.util.Date date5 = null;
        java.util.Date date6 = null;
        library.UserType userType7 = new library.UserType();
        library.Request request13 = new library.Request((library.User) userType7, "", "", "hi!", "", false);
        library.CD cD19 = new library.CD("", "hi!", "", "", true, date5, date6, (library.User) userType7, "hi!", (java.lang.Double) 1.0d, "hi!", "", "hi!");
        cD19.setEdition("");
        cD19.setPurchasable("");
        library.Admin admin27 = new library.Admin("false", "false", "false");
        cD19.setOwner((library.User) admin27);
        java.util.Date date29 = null;
        // The following exception was thrown during execution in test generation
        try {
            cD19.setBorrowedDate(date29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        library.NewsletterSystem newsletterSystem2 = new library.NewsletterSystem("", "true");
    }


    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        library.RequestDatabase requestDatabase0 = library.MaintainRequests.getInstance();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(requestDatabase0);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        library.MaintainNewsletterProxy maintainNewsletterProxy0 = new library.MaintainNewsletterProxy();
        library.NewsletterSystem newsletterSystem2 = maintainNewsletterProxy0.getItemByName("true");
        library.MaintainNewsletterProxy maintainNewsletterProxy3 = new library.MaintainNewsletterProxy();
        library.NewsletterSystem newsletterSystem6 = new library.NewsletterSystem("true", "User: userType=null, email=null, password=null]");
        library.NewsletterSystem[] newsletterSystemArray7 = new library.NewsletterSystem[] { newsletterSystem6 };
        java.util.ArrayList<library.NewsletterSystem> newsletterSystemList8 = new java.util.ArrayList<library.NewsletterSystem>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<library.NewsletterSystem>) newsletterSystemList8, newsletterSystemArray7);
        maintainNewsletterProxy3.setNews((java.util.List<library.NewsletterSystem>) newsletterSystemList8);
        maintainNewsletterProxy0.setNews((java.util.List<library.NewsletterSystem>) newsletterSystemList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(newsletterSystem2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(newsletterSystemArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        java.util.Date date5 = null;
        java.util.Date date6 = null;
        library.User user7 = null;
        library.Magazine magazine13 = new library.Magazine("", "hi!", "", "", true, date5, date6, user7, "", (java.lang.Double) (-1.0d), "", "hi!", "");
        magazine13.setOnDiscount("");
        magazine13.setPurchasable("User: userType=null, email=null, password=null]");
        java.lang.Double double18 = magazine13.getCost();
        java.util.Date date19 = null;
        // The following exception was thrown during execution in test generation
        try {
            magazine13.calcCost(date19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.0d) + "'", double18.equals((-1.0d)));
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        java.util.Date date5 = null;
        java.util.Date date6 = null;
        library.UserType userType7 = new library.UserType();
        library.Request request13 = new library.Request((library.User) userType7, "", "", "hi!", "", false);
        library.CD cD19 = new library.CD("", "hi!", "", "", true, date5, date6, (library.User) userType7, "hi!", (java.lang.Double) 1.0d, "hi!", "", "hi!");
        cD19.setEdition("");
        cD19.setPurchasable("");
        library.Admin admin27 = new library.Admin("false", "false", "false");
        cD19.setOwner((library.User) admin27);
        java.lang.String str29 = admin27.getPassword();
        java.util.ArrayList<library.Request> requestList30 = admin27.getRequestList();
        admin27.handleRequests();
        java.util.ArrayList<library.Request> requestList32 = admin27.getRequestList();
        java.util.Date date38 = null;
        java.util.Date date39 = null;
        library.UserType userType40 = new library.UserType();
        library.Request request46 = new library.Request((library.User) userType40, "", "", "hi!", "", false);
        library.CD cD52 = new library.CD("", "hi!", "", "", true, date38, date39, (library.User) userType40, "hi!", (java.lang.Double) 1.0d, "hi!", "", "hi!");
        cD52.setEdition("");
        cD52.setPurchasable("");
        library.Admin admin60 = new library.Admin("false", "false", "false");
        cD52.setOwner((library.User) admin60);
        java.util.List<library.Item> itemList62 = admin60.getItems();
        library.Book book63 = new library.Book();
        boolean boolean64 = book63.getIfLost();
        java.lang.String str65 = book63.getItemType();
        admin60.enableItem((library.Item) book63);
        admin27.addItem((library.Item) book63);
        java.lang.String str68 = book63.getEdition();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "false" + "'", str29.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(requestList30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(requestList32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemList62);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str65);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str68);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        java.util.Date date5 = null;
        java.util.Date date6 = null;
        library.UserType userType7 = new library.UserType();
        library.Request request13 = new library.Request((library.User) userType7, "", "", "hi!", "", false);
        library.CD cD19 = new library.CD("", "hi!", "", "", true, date5, date6, (library.User) userType7, "hi!", (java.lang.Double) 1.0d, "hi!", "", "hi!");
        cD19.setPublisher("");
        java.lang.String str22 = cD19.getID();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        library.Course course0 = new library.Course();
        course0.subject = "User: userType=false, email=false, password=false]";
        java.util.ArrayList<library.User> userList3 = course0.getStudents();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(userList3);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        java.util.Date date5 = null;
        java.util.Date date6 = null;
        library.UserType userType7 = new library.UserType();
        library.Request request13 = new library.Request((library.User) userType7, "", "", "hi!", "", false);
        library.CD cD19 = new library.CD("", "hi!", "", "", true, date5, date6, (library.User) userType7, "hi!", (java.lang.Double) 1.0d, "hi!", "", "hi!");
        java.lang.String str20 = cD19.getRentable();
        cD19.setOnDiscount("");
        cD19.setLost(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "true" + "'", str20.equals("true"));
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        library.Student student0 = new library.Student();
        java.util.ArrayList<library.Book> bookList1 = student0.getBookItems();
        java.lang.String str2 = student0.toString();
        java.lang.String str3 = student0.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "User: userType=null, email=null, password=null]" + "'", str2.equals("User: userType=null, email=null, password=null]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        library.AdminAccount adminAccount0 = new library.AdminAccount();
        java.lang.String str1 = adminAccount0.path;
        adminAccount0.path = "false";
        library.AdminAccount adminAccount4 = new library.AdminAccount();
        java.util.List<library.Item> itemList5 = adminAccount4.return_allItems();
        java.util.List<library.Item> itemList6 = adminAccount4.return_allItems();
        library.UserType userType7 = new library.UserType();
        library.Request request13 = new library.Request((library.User) userType7, "", "", "hi!", "", false);
        library.User user14 = request13.getUser();
        java.lang.String str15 = request13.getPriority();
        java.lang.String str16 = request13.getPriority();
        adminAccount4.request_Deny(request13);
        adminAccount0.request_Deny(request13);
        java.util.List<library.Item> itemList19 = adminAccount0.return_allItems();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemList19);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        java.util.Date date5 = null;
        java.util.Date date6 = null;
        library.User user7 = null;
        library.Magazine magazine13 = new library.Magazine("", "hi!", "", "", true, date5, date6, user7, "", (java.lang.Double) (-1.0d), "", "hi!", "");
        java.lang.Double double14 = magazine13.getCost();
        boolean boolean15 = magazine13.isPurchasable();
        java.lang.Double double16 = magazine13.getCost();
        boolean boolean17 = magazine13.isRentable();
        library.Student student21 = new library.Student("false", "true", "");
        magazine13.setOwner((library.User) student21);
        java.lang.Double double23 = magazine13.getCost();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-1.0d) + "'", double23.equals((-1.0d)));
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        library.Course course0 = new library.Course();
        java.util.ArrayList<library.User> userList1 = course0.getStudents();
        java.util.Date date7 = null;
        java.util.Date date8 = null;
        library.UserType userType9 = new library.UserType();
        library.Request request15 = new library.Request((library.User) userType9, "", "", "hi!", "", false);
        library.CD cD21 = new library.CD("", "hi!", "", "", true, date7, date8, (library.User) userType9, "hi!", (java.lang.Double) 1.0d, "hi!", "", "hi!");
        boolean boolean22 = cD21.getIfLost();
        course0.setTextbooks((library.Item) cD21);
        java.util.Date date24 = course0.getEndDate();
        java.lang.String str25 = course0.getSubject();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(userList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        java.util.Date date5 = null;
        java.util.Date date6 = null;
        library.Student student7 = new library.Student();
        java.lang.String str8 = student7.getuserType();
        library.Book book14 = new library.Book("true", "hi!", "hi!", "false", false, date5, date6, (library.User) student7, "", (java.lang.Double) 1.0d, "hi!", "", "");
        java.util.Date date15 = null;
        book14.setDueDate(date15);
        book14.setOnDiscount("User: userType=false, email=false, password=false]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        library.AdminAccount adminAccount0 = new library.AdminAccount();
        java.lang.String str1 = adminAccount0.path;
        adminAccount0.path = "false";
        library.AdminAccount adminAccount4 = new library.AdminAccount();
        java.util.List<library.Item> itemList5 = adminAccount4.return_allItems();
        java.util.List<library.Item> itemList6 = adminAccount4.return_allItems();
        library.UserType userType7 = new library.UserType();
        library.Request request13 = new library.Request((library.User) userType7, "", "", "hi!", "", false);
        library.User user14 = request13.getUser();
        java.lang.String str15 = request13.getPriority();
        java.lang.String str16 = request13.getPriority();
        adminAccount4.request_Deny(request13);
        adminAccount0.request_Deny(request13);
        library.Faculty faculty22 = new library.Faculty("", "false", "false");
        faculty22.setEmail("User: userType=, email=User: userType=null, email=null, password=null], password=false]");
        library.Request request30 = new library.Request((library.User) faculty22, "false", "User: userType=null, email=null, password=null]", "hi!", "User: userType=, email=User: userType=null, email=null, password=null], password=false]", true);
        adminAccount0.request_Accept(request30);
        adminAccount0.path = "User: userType=false, email=false, password=false]";
        java.util.ArrayList<java.lang.String> strList34 = adminAccount0.getAllUnregMail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList34);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        library.Nonfaculty nonfaculty0 = new library.Nonfaculty();
        nonfaculty0.setEmail("User: userType=null, email=null, password=null]");
        java.lang.String str3 = nonfaculty0.getuserType();
        nonfaculty0.setPassword("User: userType=true, email=false, password=User: userType=null, email=null, password=null]]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        java.util.Date date5 = null;
        java.util.Date date6 = null;
        library.UserType userType7 = new library.UserType();
        library.Request request13 = new library.Request((library.User) userType7, "", "", "hi!", "", false);
        library.CD cD19 = new library.CD("", "hi!", "", "", true, date5, date6, (library.User) userType7, "hi!", (java.lang.Double) 1.0d, "hi!", "", "hi!");
        cD19.setEdition("");
        cD19.setPurchasable("");
        java.lang.String str24 = cD19.getRentable();
        boolean boolean25 = cD19.isOnDiscount();
        cD19.setRentable("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "true" + "'", str24.equals("true"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        java.util.Date date5 = null;
        java.util.Date date6 = null;
        library.UserType userType7 = new library.UserType();
        library.Request request13 = new library.Request((library.User) userType7, "", "", "hi!", "", false);
        library.CD cD19 = new library.CD("", "hi!", "", "", true, date5, date6, (library.User) userType7, "hi!", (java.lang.Double) 1.0d, "hi!", "", "hi!");
        cD19.setEdition("");
        cD19.setPurchasable("");
        library.Admin admin27 = new library.Admin("false", "false", "false");
        cD19.setOwner((library.User) admin27);
        java.util.List<library.Item> itemList29 = admin27.getItems();
        admin27.setPassword("hi!");
        java.util.List<library.Item> itemList32 = admin27.getItems();
        admin27.handleRequests();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemList29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemList32);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        java.util.Date date5 = null;
        java.util.Date date6 = null;
        library.UserType userType7 = new library.UserType();
        library.Request request13 = new library.Request((library.User) userType7, "", "", "hi!", "", false);
        library.CD cD19 = new library.CD("", "hi!", "", "", true, date5, date6, (library.User) userType7, "hi!", (java.lang.Double) 1.0d, "hi!", "", "hi!");
        cD19.setEdition("");
        cD19.setPurchasable("");
        cD19.setOnDiscount("hi!");
        cD19.setPurchasable("true");
        boolean boolean28 = cD19.isRentable();
        java.lang.Double double29 = cD19.getCost();
        cD19.setTitle("true");
        java.lang.String str32 = cD19.getTitle();
        java.util.Date date33 = cD19.getDueDate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 1.0d + "'", double29.equals(1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "true" + "'", str32.equals("true"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date33);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        library.Book book0 = new library.Book();
        java.lang.String str1 = book0.getTitle();
        java.lang.String str2 = book0.getPurchasable();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "false" + "'", str2.equals("false"));
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        library.Faculty faculty3 = new library.Faculty("true", "true", "User: userType=true, email=false, password=User: userType=null, email=null, password=null]]");
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        library.Book book0 = new library.Book();
        boolean boolean1 = book0.getIfLost();
        java.lang.String str2 = book0.getOnDiscount();
        boolean boolean3 = book0.isPurchasable();
        book0.setPurchasable("User: userType=null, email=null, password=null]");
        book0.setOnDiscount("");
        java.lang.String str8 = book0.getPublisher();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "false" + "'", str2.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        java.util.Date date5 = null;
        java.util.Date date6 = null;
        library.UserType userType7 = new library.UserType();
        library.Request request13 = new library.Request((library.User) userType7, "", "", "hi!", "", false);
        library.Book book19 = new library.Book("false", "true", "true", "User: userType=null, email=null, password=null]", true, date5, date6, (library.User) userType7, "true", (java.lang.Double) 0.0d, "User: userType=null, email=null, password=null]", "true", "false");
        java.util.Date date20 = book19.getLostDate();
        java.lang.Double double21 = book19.getCost();
        book19.setItemType("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21.equals(0.0d));
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        library.MaintainRequestsProxy maintainRequestsProxy0 = new library.MaintainRequestsProxy();
        library.UserType userType1 = new library.UserType();
        library.Request request7 = new library.Request((library.User) userType1, "", "", "hi!", "", false);
        library.User user8 = request7.getUser();
        java.lang.String str9 = request7.getItemType();
        java.lang.String str10 = maintainRequestsProxy0.notifyPriority(request7);
        library.AdminAccount adminAccount11 = new library.AdminAccount();
        java.lang.String str12 = adminAccount11.path;
        library.UserType userType13 = new library.UserType();
        library.Request request19 = new library.Request((library.User) userType13, "", "", "hi!", "", false);
        library.User user20 = request19.getUser();
        java.util.Date date26 = null;
        java.util.Date date27 = null;
        library.UserType userType28 = new library.UserType();
        library.Request request34 = new library.Request((library.User) userType28, "", "", "hi!", "", false);
        library.CD cD40 = new library.CD("", "hi!", "", "", true, date26, date27, (library.User) userType28, "hi!", (java.lang.Double) 1.0d, "hi!", "", "hi!");
        java.lang.String str41 = userType28.toString();
        request19.setUser((library.User) userType28);
        maintainRequestsProxy0.sendRequestDeny(adminAccount11, request19);
        library.Student student47 = new library.Student("", "", "User: userType=null, email=null, password=null]");
        library.Book book48 = new library.Book();
        boolean boolean49 = book48.getIfLost();
        java.lang.String str50 = book48.getOnDiscount();
        boolean boolean51 = book48.isPurchasable();
        book48.setPurchasable("User: userType=null, email=null, password=null]");
        java.lang.String str54 = book48.getTitle();
        java.lang.String str55 = book48.getRentable();
        book48.setLocation("false");
        student47.addBookItem(book48);
        request19.setUser((library.User) student47);
        java.util.ArrayList<library.Course> courseList60 = student47.getCourses();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "User: userType=null, email=null, password=null]" + "'", str41.equals("User: userType=null, email=null, password=null]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str50 + "' != '" + "false" + "'", str50.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str55 + "' != '" + "false" + "'", str55.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(courseList60);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        java.util.Date date5 = null;
        java.util.Date date6 = null;
        library.UserType userType7 = new library.UserType();
        library.Request request13 = new library.Request((library.User) userType7, "", "", "hi!", "", false);
        library.CD cD19 = new library.CD("", "hi!", "", "", true, date5, date6, (library.User) userType7, "hi!", (java.lang.Double) 1.0d, "hi!", "", "hi!");
        java.lang.String str20 = cD19.getRentable();
        cD19.setOnDiscount("");
        java.util.Date date23 = null;
        // The following exception was thrown during execution in test generation
        try {
            cD19.setBorrowedDate(date23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "true" + "'", str20.equals("true"));
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        library.DiscountOffers discountOffers0 = new library.DiscountOffers();
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        library.Search search3 = new library.Search();
        library.ItemDatabase itemDatabase5 = library.MaintainItems.getInstance();
        java.util.List<library.Item> itemList6 = search3.strategyInput("hi!", itemDatabase5);
        java.util.List<library.Item> itemList7 = library.Facade.search("hi!", itemDatabase5);
        java.util.List<library.Item> itemList8 = library.Facade.discountOffers("User: userType=true, email=User: userType=, email=User: userType=null, email=null, password=null], password=false], password=null]", itemDatabase5);
        java.util.List<library.Item> itemList9 = library.Facade.discountOffers("", itemDatabase5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemDatabase5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemList9);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        library.MaintainSubscriptionsProxy maintainSubscriptionsProxy0 = new library.MaintainSubscriptionsProxy();
        java.util.List<library.Subscription> subscriptionList1 = maintainSubscriptionsProxy0.getSubs();
        library.MaintainSubscriptionsProxy maintainSubscriptionsProxy2 = new library.MaintainSubscriptionsProxy();
        java.util.List<library.Subscription> subscriptionList3 = maintainSubscriptionsProxy2.getSubs();
        maintainSubscriptionsProxy0.setSubs(subscriptionList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(subscriptionList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(subscriptionList3);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        java.util.Date date5 = null;
        java.util.Date date6 = null;
        library.UserType userType7 = new library.UserType();
        library.Request request13 = new library.Request((library.User) userType7, "", "", "hi!", "", false);
        library.CD cD19 = new library.CD("", "hi!", "", "", true, date5, date6, (library.User) userType7, "hi!", (java.lang.Double) 1.0d, "hi!", "", "hi!");
        cD19.setItemType("User: userType=null, email=null, password=null]");
        boolean boolean22 = cD19.isRentable();
        cD19.setLocation("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        java.util.Date date5 = null;
        java.util.Date date6 = null;
        library.User user7 = null;
        library.Magazine magazine13 = new library.Magazine("", "hi!", "", "", true, date5, date6, user7, "", (java.lang.Double) (-1.0d), "", "hi!", "");
        java.lang.Double double14 = magazine13.getCost();
        boolean boolean15 = magazine13.isPurchasable();
        java.lang.Double double16 = magazine13.getCost();
        java.lang.String str17 = magazine13.getID();
        java.util.Date date18 = magazine13.getLostDate();
        java.util.Date date19 = magazine13.getBorrowedDate();
        boolean boolean20 = magazine13.isOnDiscount();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        library.Nonfaculty nonfaculty0 = new library.Nonfaculty();
        nonfaculty0.setEmail("User: userType=null, email=null, password=null]");
        java.lang.String str3 = nonfaculty0.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "User: userType=null, email=null, password=null]" + "'", str3.equals("User: userType=null, email=null, password=null]"));
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        library.Book book0 = new library.Book();
        java.lang.String str1 = book0.getPublisher();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        java.util.Date date5 = null;
        java.util.Date date6 = null;
        library.UserType userType7 = new library.UserType();
        library.Request request13 = new library.Request((library.User) userType7, "", "", "hi!", "", false);
        library.CD cD19 = new library.CD("", "hi!", "", "", true, date5, date6, (library.User) userType7, "hi!", (java.lang.Double) 1.0d, "hi!", "", "hi!");
        cD19.setEdition("");
        cD19.setPurchasable("");
        cD19.setOnDiscount("hi!");
        java.lang.String str26 = cD19.getOnDiscount();
        java.util.Date date27 = cD19.getLostDate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "false" + "'", str26.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date27);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        java.util.Date date5 = null;
        java.util.Date date6 = null;
        library.UserType userType7 = new library.UserType();
        library.Request request13 = new library.Request((library.User) userType7, "", "", "hi!", "", false);
        library.CD cD19 = new library.CD("", "hi!", "", "", true, date5, date6, (library.User) userType7, "hi!", (java.lang.Double) 1.0d, "hi!", "", "hi!");
        java.lang.String str20 = cD19.getRentable();
        cD19.setRentable("hi!");
        java.util.Date date23 = null;
        cD19.considerIfLost(date23);
        cD19.setRentable("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "true" + "'", str20.equals("true"));
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        java.util.Date date5 = null;
        java.util.Date date6 = null;
        library.UserType userType7 = new library.UserType();
        library.Request request13 = new library.Request((library.User) userType7, "", "", "hi!", "", false);
        library.CD cD19 = new library.CD("", "hi!", "", "", true, date5, date6, (library.User) userType7, "hi!", (java.lang.Double) 1.0d, "hi!", "", "hi!");
        cD19.setEdition("");
        cD19.setPurchasable("");
        library.Admin admin27 = new library.Admin("false", "false", "false");
        cD19.setOwner((library.User) admin27);
        java.util.Date date29 = cD19.getLostDate();
        java.lang.Double double30 = cD19.getCost();
        java.util.Date date31 = null;
        cD19.setLostDate(date31);
        library.User user33 = cD19.getOwner();
        java.lang.String str34 = cD19.getTitle();
        java.lang.Double double35 = cD19.getCost();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 1.0d + "'", double30.equals(1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "hi!" + "'", str34.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 1.0d + "'", double35.equals(1.0d));
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        java.util.Date date5 = null;
        java.util.Date date6 = null;
        library.UserType userType7 = new library.UserType();
        library.Request request13 = new library.Request((library.User) userType7, "", "", "hi!", "", false);
        library.CD cD19 = new library.CD("", "hi!", "", "", true, date5, date6, (library.User) userType7, "hi!", (java.lang.Double) 1.0d, "hi!", "", "hi!");
        java.lang.String str20 = cD19.getRentable();
        cD19.setRentable("hi!");
        boolean boolean23 = cD19.isOnDiscount();
        java.util.Date date24 = cD19.getDueDate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "true" + "'", str20.equals("true"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date24);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        library.Book book0 = new library.Book();
        boolean boolean1 = book0.getIfLost();
        java.lang.String str2 = book0.getItemType();
        book0.setPurchasable("true");
        boolean boolean5 = book0.getIfLost();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        java.util.Date date5 = null;
        java.util.Date date6 = null;
        library.UserType userType7 = new library.UserType();
        library.Request request13 = new library.Request((library.User) userType7, "", "", "hi!", "", false);
        library.CD cD19 = new library.CD("", "hi!", "", "", true, date5, date6, (library.User) userType7, "hi!", (java.lang.Double) 1.0d, "hi!", "", "hi!");
        cD19.setItemType("User: userType=null, email=null, password=null]");
        java.lang.Double double22 = cD19.getCost();
        cD19.setItemType("User: userType=true, email=false, password=User: userType=null, email=null, password=null]]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.0d + "'", double22.equals(1.0d));
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        library.MaintainCoursesProxy maintainCoursesProxy0 = new library.MaintainCoursesProxy();
        java.util.List<library.Course> courseList1 = maintainCoursesProxy0.getCourses();
        library.MaintainCoursesProxy maintainCoursesProxy2 = new library.MaintainCoursesProxy();
        library.Course[] courseArray3 = new library.Course[] {};
        java.util.ArrayList<library.Course> courseList4 = new java.util.ArrayList<library.Course>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<library.Course>) courseList4, courseArray3);
        maintainCoursesProxy2.setCourses((java.util.List<library.Course>) courseList4);
        maintainCoursesProxy0.setCourses((java.util.List<library.Course>) courseList4);
        library.Course course8 = new library.Course();
        java.util.ArrayList<library.User> userList9 = course8.getStudents();
        library.Course course10 = maintainCoursesProxy0.getCourse(course8);
        // The following exception was thrown during execution in test generation
        try {
            course10.subject = "User: userType=, email=User: userType=null, email=null, password=null], password=false]";
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(courseList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(courseArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(userList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(course10);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        java.util.Date date5 = null;
        java.util.Date date6 = null;
        library.Student student7 = new library.Student();
        java.lang.String str8 = student7.getuserType();
        library.Book book14 = new library.Book("true", "hi!", "hi!", "false", false, date5, date6, (library.User) student7, "", (java.lang.Double) 1.0d, "hi!", "", "");
        student7.setEmail("true");
        java.lang.String str17 = student7.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "User: userType=null, email=true, password=null]" + "'", str17.equals("User: userType=null, email=true, password=null]"));
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        library.AdminAccount adminAccount0 = new library.AdminAccount();
        java.lang.String str1 = adminAccount0.path;
        adminAccount0.path = "false";
        library.AdminAccount adminAccount4 = new library.AdminAccount();
        java.util.List<library.Item> itemList5 = adminAccount4.return_allItems();
        java.util.List<library.Item> itemList6 = adminAccount4.return_allItems();
        library.UserType userType7 = new library.UserType();
        library.Request request13 = new library.Request((library.User) userType7, "", "", "hi!", "", false);
        library.User user14 = request13.getUser();
        java.lang.String str15 = request13.getPriority();
        java.lang.String str16 = request13.getPriority();
        adminAccount4.request_Deny(request13);
        adminAccount0.request_Deny(request13);
        library.Faculty faculty22 = new library.Faculty("", "false", "false");
        faculty22.setEmail("User: userType=, email=User: userType=null, email=null, password=null], password=false]");
        library.Request request30 = new library.Request((library.User) faculty22, "false", "User: userType=null, email=null, password=null]", "hi!", "User: userType=, email=User: userType=null, email=null, password=null], password=false]", true);
        adminAccount0.request_Accept(request30);
        adminAccount0.path = "User: userType=false, email=false, password=false]";
        java.lang.String str34 = adminAccount0.path;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "User: userType=false, email=false, password=false]" + "'", str34.equals("User: userType=false, email=false, password=false]"));
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        library.MaintainRequestsProxy maintainRequestsProxy0 = new library.MaintainRequestsProxy();
        library.UserType userType1 = new library.UserType();
        library.Request request7 = new library.Request((library.User) userType1, "", "", "hi!", "", false);
        library.User user8 = request7.getUser();
        java.lang.String str9 = request7.getItemType();
        java.lang.String str10 = maintainRequestsProxy0.notifyPriority(request7);
        request7.setEdition("User: userType=, email=User: userType=null, email=null, password=null], password=false]");
        request7.setEdition("User: userType=false, email=false, password=false]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        library.Admin admin3 = new library.Admin("false", "false", "false");
        java.lang.String str4 = admin3.getPassword();
        admin3.setPassword("User: userType=false, email=true, password=]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "false" + "'", str4.equals("false"));
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        java.util.Date date5 = null;
        java.util.Date date6 = null;
        library.UserType userType7 = new library.UserType();
        library.Request request13 = new library.Request((library.User) userType7, "", "", "hi!", "", false);
        library.CD cD19 = new library.CD("", "hi!", "", "", true, date5, date6, (library.User) userType7, "hi!", (java.lang.Double) 1.0d, "hi!", "", "hi!");
        cD19.setEdition("");
        cD19.setPurchasable("");
        library.Admin admin27 = new library.Admin("false", "false", "false");
        cD19.setOwner((library.User) admin27);
        java.lang.String str29 = admin27.getPassword();
        java.util.ArrayList<library.Request> requestList30 = admin27.getRequestList();
        admin27.handleRequests();
        java.util.ArrayList<library.Request> requestList32 = admin27.getRequestList();
        java.util.Date date38 = null;
        java.util.Date date39 = null;
        library.UserType userType40 = new library.UserType();
        library.Request request46 = new library.Request((library.User) userType40, "", "", "hi!", "", false);
        library.CD cD52 = new library.CD("", "hi!", "", "", true, date38, date39, (library.User) userType40, "hi!", (java.lang.Double) 1.0d, "hi!", "", "hi!");
        cD52.setEdition("");
        cD52.setPurchasable("");
        library.Admin admin60 = new library.Admin("false", "false", "false");
        cD52.setOwner((library.User) admin60);
        java.util.List<library.Item> itemList62 = admin60.getItems();
        library.Book book63 = new library.Book();
        boolean boolean64 = book63.getIfLost();
        java.lang.String str65 = book63.getItemType();
        admin60.enableItem((library.Item) book63);
        admin27.addItem((library.Item) book63);
        java.lang.String str68 = book63.getPurchasable();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "false" + "'", str29.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(requestList30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(requestList32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemList62);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str65);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str68 + "' != '" + "false" + "'", str68.equals("false"));
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        library.Course course0 = new library.Course();
        java.util.ArrayList<library.User> userList1 = course0.getStudents();
        java.util.Date date7 = null;
        java.util.Date date8 = null;
        library.UserType userType9 = new library.UserType();
        library.Request request15 = new library.Request((library.User) userType9, "", "", "hi!", "", false);
        library.CD cD21 = new library.CD("", "hi!", "", "", true, date7, date8, (library.User) userType9, "hi!", (java.lang.Double) 1.0d, "hi!", "", "hi!");
        boolean boolean22 = cD21.getIfLost();
        course0.setTextbooks((library.Item) cD21);
        java.util.Date date24 = course0.getEndDate();
        java.util.Date date30 = null;
        java.util.Date date31 = null;
        library.UserType userType32 = new library.UserType();
        library.Request request38 = new library.Request((library.User) userType32, "", "", "hi!", "", false);
        library.CD cD44 = new library.CD("", "hi!", "", "", true, date30, date31, (library.User) userType32, "hi!", (java.lang.Double) 1.0d, "hi!", "", "hi!");
        cD44.setEdition("");
        cD44.setPurchasable("");
        library.Admin admin52 = new library.Admin("false", "false", "false");
        cD44.setOwner((library.User) admin52);
        course0.professorFaculty = admin52;
        java.util.ArrayList<library.Request> requestList55 = admin52.getRequestList();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(userList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(requestList55);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        library.Book book0 = new library.Book();
        boolean boolean1 = book0.getIfLost();
        java.util.Date date2 = book0.getLostDate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date2);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        java.util.Date date5 = null;
        java.util.Date date6 = null;
        library.User user7 = null;
        library.Magazine magazine13 = new library.Magazine("", "hi!", "", "", true, date5, date6, user7, "", (java.lang.Double) (-1.0d), "", "hi!", "");
        magazine13.setOnDiscount("");
        java.util.Date date16 = null;
        magazine13.setLostDate(date16);
        java.lang.String str18 = magazine13.getRentable();
        boolean boolean19 = magazine13.getIfLost();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "true" + "'", str18.equals("true"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        library.Facade facade0 = new library.Facade();
        boolean boolean2 = facade0.passwordValid("User: userType=null, email=null, password=null]");
        boolean boolean4 = facade0.passwordValid("User: userType=null, email=null, password=null]");
        boolean boolean6 = facade0.userTypeValid("User: userType=null, email=true, password=null]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        library.NewsletterSystem newsletterSystem2 = new library.NewsletterSystem("true", "User: userType=null, email=null, password=null]");
        newsletterSystem2.setWebsite("");
        java.lang.String str5 = newsletterSystem2.getCompany();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "true" + "'", str5.equals("true"));
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        java.util.Date date5 = null;
        java.util.Date date6 = null;
        library.Student student7 = new library.Student();
        java.lang.String str8 = student7.getuserType();
        library.Book book14 = new library.Book("true", "hi!", "hi!", "false", false, date5, date6, (library.User) student7, "", (java.lang.Double) 1.0d, "hi!", "", "");
        student7.setEmail("true");
        student7.setEmail("true");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        java.util.Date date5 = null;
        java.util.Date date6 = null;
        library.Student student7 = new library.Student();
        java.lang.String str8 = student7.getuserType();
        library.Book book14 = new library.Book("true", "hi!", "hi!", "false", false, date5, date6, (library.User) student7, "", (java.lang.Double) 1.0d, "hi!", "", "");
        java.lang.String str15 = book14.getTitle();
        book14.setID("User: userType=true, email=User: userType=, email=User: userType=null, email=null, password=null], password=false], password=null]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        library.NewsletterSystem newsletterSystem2 = new library.NewsletterSystem("User: userType=, email=User: userType=null, email=null, password=null], password=false]", "");
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        java.util.Date date5 = null;
        java.util.Date date6 = null;
        library.User user7 = null;
        library.Magazine magazine13 = new library.Magazine("", "hi!", "", "", true, date5, date6, user7, "", (java.lang.Double) (-1.0d), "", "hi!", "");
        java.lang.Double double14 = magazine13.getCost();
        boolean boolean15 = magazine13.isPurchasable();
        java.lang.Double double16 = magazine13.getCost();
        java.lang.String str17 = magazine13.getPurchasable();
        magazine13.setItemType("User: userType=null, email=null, password=null]");
        library.Student student20 = new library.Student();
        java.util.ArrayList<library.Book> bookList21 = student20.getBookItems();
        magazine13.setOwner((library.User) student20);
        java.lang.String str23 = student20.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "false" + "'", str17.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookList21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "User: userType=null, email=null, password=null]" + "'", str23.equals("User: userType=null, email=null, password=null]"));
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        java.util.Date date5 = null;
        java.util.Date date6 = null;
        library.User user7 = null;
        library.Magazine magazine13 = new library.Magazine("", "hi!", "", "", true, date5, date6, user7, "", (java.lang.Double) (-1.0d), "", "hi!", "");
        java.lang.Double double14 = magazine13.getCost();
        magazine13.setPurchasable("hi!");
        java.lang.String str17 = magazine13.getEdition();
        magazine13.setPublisher("User: userType=false, email=false, password=false]");
        java.util.Date date20 = null;
        // The following exception was thrown during execution in test generation
        try {
            magazine13.calcCost(date20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        library.Book book0 = new library.Book();
        boolean boolean1 = book0.getIfLost();
        java.lang.String str2 = book0.getOnDiscount();
        boolean boolean3 = book0.isPurchasable();
        book0.setPurchasable("User: userType=null, email=null, password=null]");
        book0.setPublisher("User: userType=null, email=null, password=null]");
        boolean boolean8 = book0.isPurchasable();
        book0.setID("User: userType=, email=User: userType=null, email=null, password=null], password=false]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "false" + "'", str2.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        library.MaintainCoursesProxy maintainCoursesProxy0 = new library.MaintainCoursesProxy();
        library.Course[] courseArray1 = new library.Course[] {};
        java.util.ArrayList<library.Course> courseList2 = new java.util.ArrayList<library.Course>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<library.Course>) courseList2, courseArray1);
        maintainCoursesProxy0.setCourses((java.util.List<library.Course>) courseList2);
        java.util.List<library.Course> courseList5 = maintainCoursesProxy0.getCourses();
        java.util.List<library.Course> courseList6 = maintainCoursesProxy0.getCourses();
        library.Course course7 = new library.Course();
        java.util.ArrayList<library.User> userList8 = course7.getStudents();
        maintainCoursesProxy0.addCourse(course7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(courseArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(courseList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(courseList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(userList8);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        java.util.Date date5 = null;
        java.util.Date date6 = null;
        library.UserType userType7 = new library.UserType();
        library.Request request13 = new library.Request((library.User) userType7, "", "", "hi!", "", false);
        library.CD cD19 = new library.CD("", "hi!", "", "", true, date5, date6, (library.User) userType7, "hi!", (java.lang.Double) 1.0d, "hi!", "", "hi!");
        cD19.setEdition("");
        cD19.setPurchasable("");
        cD19.setOnDiscount("hi!");
        java.lang.String str26 = cD19.getOnDiscount();
        java.lang.String str27 = cD19.getTitle();
        cD19.setTitle("hi!");
        java.lang.Double double30 = cD19.getCost();
        boolean boolean31 = cD19.getIfLost();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "false" + "'", str26.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "hi!" + "'", str27.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 1.0d + "'", double30.equals(1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        library.Book book0 = new library.Book();
        boolean boolean1 = book0.getIfLost();
        java.lang.String str2 = book0.getOnDiscount();
        boolean boolean3 = book0.isPurchasable();
        book0.setPurchasable("User: userType=null, email=null, password=null]");
        book0.setID("true");
        book0.setCost((java.lang.Double) 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "false" + "'", str2.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        library.Facade facade0 = new library.Facade();
        boolean boolean2 = facade0.passwordValid("User: userType=null, email=null, password=null]");
        library.User user3 = facade0.getUser();
        boolean boolean5 = facade0.userTypeValid("User: userType=false, email=true, password=]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

   

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        java.util.Date date5 = null;
        java.util.Date date6 = null;
        library.User user7 = null;
        library.Magazine magazine13 = new library.Magazine("", "hi!", "", "", true, date5, date6, user7, "", (java.lang.Double) (-1.0d), "", "hi!", "");
        magazine13.setOnDiscount("User: userType=null, email=null, password=null]");
        boolean boolean16 = magazine13.isPurchasable();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        library.Course course0 = new library.Course();
        java.util.ArrayList<library.User> userList1 = course0.getStudents();
        java.util.Date date7 = null;
        java.util.Date date8 = null;
        library.UserType userType9 = new library.UserType();
        library.Request request15 = new library.Request((library.User) userType9, "", "", "hi!", "", false);
        library.CD cD21 = new library.CD("", "hi!", "", "", true, date7, date8, (library.User) userType9, "hi!", (java.lang.Double) 1.0d, "hi!", "", "hi!");
        boolean boolean22 = cD21.getIfLost();
        course0.setTextbooks((library.Item) cD21);
        java.util.Date date24 = course0.getEndDate();
        java.util.Date date25 = course0.endDate;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(userList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date25);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        library.MaintainUserProxy maintainUserProxy0 = new library.MaintainUserProxy();
        java.util.List<library.User> userList1 = maintainUserProxy0.getUsers();
        java.util.Date date7 = null;
        java.util.Date date8 = null;
        library.UserType userType9 = new library.UserType();
        library.Request request15 = new library.Request((library.User) userType9, "", "", "hi!", "", false);
        library.CD cD21 = new library.CD("", "hi!", "", "", true, date7, date8, (library.User) userType9, "hi!", (java.lang.Double) 1.0d, "hi!", "", "hi!");
        cD21.setEdition("");
        cD21.setPurchasable("");
        library.Admin admin29 = new library.Admin("false", "false", "false");
        cD21.setOwner((library.User) admin29);
        maintainUserProxy0.addUser((library.User) admin29);
        library.AdminAccount adminAccount32 = new library.AdminAccount();
        java.lang.String str33 = adminAccount32.path;
        library.Book book34 = new library.Book();
        boolean boolean35 = book34.getIfLost();
        java.lang.String str36 = book34.getOnDiscount();
        java.lang.String str37 = book34.getPublisher();
        java.lang.String str38 = book34.getLocation();
        adminAccount32.add_createItem((library.Item) book34);
        admin29.enableItem((library.Item) book34);
        boolean boolean41 = book34.getIfLost();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "false" + "'", str36.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        java.util.Date date5 = null;
        java.util.Date date6 = null;
        library.UserType userType7 = new library.UserType();
        library.Request request13 = new library.Request((library.User) userType7, "", "", "hi!", "", false);
        library.CD cD19 = new library.CD("", "hi!", "", "", true, date5, date6, (library.User) userType7, "hi!", (java.lang.Double) 1.0d, "hi!", "", "hi!");
        cD19.setEdition("");
        cD19.setPurchasable("");
        java.lang.String str24 = cD19.getRentable();
        java.util.Date date25 = null;
        cD19.considerIfLost(date25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "true" + "'", str24.equals("true"));
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        library.MaintainRequestsProxy maintainRequestsProxy0 = new library.MaintainRequestsProxy();
        library.UserType userType1 = new library.UserType();
        library.Request request7 = new library.Request((library.User) userType1, "", "", "hi!", "", false);
        library.User user8 = request7.getUser();
        java.lang.String str9 = request7.getItemType();
        java.lang.String str10 = maintainRequestsProxy0.notifyPriority(request7);
        library.AdminAccount adminAccount11 = new library.AdminAccount();
        java.lang.String str12 = adminAccount11.path;
        library.UserType userType13 = new library.UserType();
        library.Request request19 = new library.Request((library.User) userType13, "", "", "hi!", "", false);
        library.User user20 = request19.getUser();
        java.util.Date date26 = null;
        java.util.Date date27 = null;
        library.UserType userType28 = new library.UserType();
        library.Request request34 = new library.Request((library.User) userType28, "", "", "hi!", "", false);
        library.CD cD40 = new library.CD("", "hi!", "", "", true, date26, date27, (library.User) userType28, "hi!", (java.lang.Double) 1.0d, "hi!", "", "hi!");
        java.lang.String str41 = userType28.toString();
        request19.setUser((library.User) userType28);
        maintainRequestsProxy0.sendRequestDeny(adminAccount11, request19);
        java.util.List<library.Request> requestList44 = maintainRequestsProxy0.getReqSI();
        library.UserType userType45 = new library.UserType();
        library.Request request51 = new library.Request((library.User) userType45, "", "", "hi!", "", false);
        library.User user52 = request51.getUser();
        java.lang.String str53 = request51.getPriority();
        java.lang.String str54 = request51.getPriority();
        maintainRequestsProxy0.confirmReq(request51);
        java.util.List<library.Request> requestList56 = maintainRequestsProxy0.getReqSI();
        java.util.List<library.Request> requestList57 = maintainRequestsProxy0.getReqCT();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "User: userType=null, email=null, password=null]" + "'", str41.equals("User: userType=null, email=null, password=null]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(requestList44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str53 + "' != '" + "" + "'", str53.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str54 + "' != '" + "" + "'", str54.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(requestList56);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertNull(requestList57);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        library.Magazine magazine0 = new library.Magazine();
        java.lang.String str1 = magazine0.getEdition();
        magazine0.setLost(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        library.MaintainCoursesProxy maintainCoursesProxy0 = new library.MaintainCoursesProxy();
        java.util.List<library.Course> courseList1 = maintainCoursesProxy0.getCourses();
        library.Course course2 = null;
        library.Course course3 = maintainCoursesProxy0.getCourse(course2);
        java.util.List<library.Course> courseList4 = maintainCoursesProxy0.getCourses();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(courseList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(course3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(courseList4);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        java.util.Date date5 = null;
        java.util.Date date6 = null;
        library.User user7 = null;
        library.Magazine magazine13 = new library.Magazine("", "hi!", "", "", true, date5, date6, user7, "", (java.lang.Double) (-1.0d), "", "hi!", "");
        java.lang.Double double14 = magazine13.getCost();
        magazine13.setPurchasable("hi!");
        java.util.Date date17 = magazine13.getLostDate();
        magazine13.setPublisher("false");
        java.lang.String str20 = magazine13.getItemType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        library.AdminAccount adminAccount0 = new library.AdminAccount();
        java.lang.String str1 = adminAccount0.path;
        adminAccount0.path = "false";
        library.AdminAccount adminAccount4 = new library.AdminAccount();
        java.util.List<library.Item> itemList5 = adminAccount4.return_allItems();
        java.util.List<library.Item> itemList6 = adminAccount4.return_allItems();
        library.UserType userType7 = new library.UserType();
        library.Request request13 = new library.Request((library.User) userType7, "", "", "hi!", "", false);
        library.User user14 = request13.getUser();
        java.lang.String str15 = request13.getPriority();
        java.lang.String str16 = request13.getPriority();
        adminAccount4.request_Deny(request13);
        adminAccount0.request_Deny(request13);
        library.UserType userType19 = new library.UserType();
        library.Request request25 = new library.Request((library.User) userType19, "", "", "hi!", "", false);
        library.User user26 = request25.getUser();
        java.util.Date date32 = null;
        java.util.Date date33 = null;
        library.UserType userType34 = new library.UserType();
        library.Request request40 = new library.Request((library.User) userType34, "", "", "hi!", "", false);
        library.CD cD46 = new library.CD("", "hi!", "", "", true, date32, date33, (library.User) userType34, "hi!", (java.lang.Double) 1.0d, "hi!", "", "hi!");
        java.lang.String str47 = userType34.toString();
        request25.setUser((library.User) userType34);
        request25.setName("false");
        adminAccount0.request_Accept(request25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "User: userType=null, email=null, password=null]" + "'", str47.equals("User: userType=null, email=null, password=null]"));
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        java.util.Date date5 = null;
        java.util.Date date6 = null;
        library.User user7 = null;
        library.Magazine magazine13 = new library.Magazine("", "hi!", "", "", true, date5, date6, user7, "", (java.lang.Double) (-1.0d), "", "hi!", "");
        java.lang.Double double14 = magazine13.getCost();
        boolean boolean15 = magazine13.isPurchasable();
        java.lang.Double double16 = magazine13.getCost();
        boolean boolean17 = magazine13.isRentable();
        library.Student student21 = new library.Student("false", "true", "");
        magazine13.setOwner((library.User) student21);
        library.Book book23 = new library.Book();
        boolean boolean24 = book23.getIfLost();
        java.lang.String str25 = book23.getOnDiscount();
        student21.addBookItem(book23);
        library.Faculty faculty30 = new library.Faculty("", "false", "false");
        faculty30.setEmail("User: userType=null, email=null, password=null]");
        java.lang.String str33 = faculty30.toString();
        book23.setOwner((library.User) faculty30);
        java.lang.String str35 = faculty30.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "false" + "'", str25.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "User: userType=, email=User: userType=null, email=null, password=null], password=false]" + "'", str33.equals("User: userType=, email=User: userType=null, email=null, password=null], password=false]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "false" + "'", str35.equals("false"));
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        java.util.Date date5 = null;
        java.util.Date date6 = null;
        library.User user7 = null;
        library.Magazine magazine13 = new library.Magazine("", "hi!", "", "", true, date5, date6, user7, "", (java.lang.Double) (-1.0d), "", "hi!", "");
        java.lang.Double double14 = magazine13.getCost();
        boolean boolean15 = magazine13.isPurchasable();
        java.lang.String str16 = magazine13.getEdition();
        magazine13.setLost(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        library.Admin admin3 = new library.Admin("false", "false", "false");
        java.lang.String str4 = admin3.getPassword();
        admin3.handleRequests();
        java.lang.String str6 = admin3.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "false" + "'", str4.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "false" + "'", str6.equals("false"));
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        library.MaintainNewsletterProxy maintainNewsletterProxy0 = new library.MaintainNewsletterProxy();
        library.NewsletterSystem newsletterSystem3 = new library.NewsletterSystem("true", "User: userType=null, email=null, password=null]");
        library.NewsletterSystem[] newsletterSystemArray4 = new library.NewsletterSystem[] { newsletterSystem3 };
        java.util.ArrayList<library.NewsletterSystem> newsletterSystemList5 = new java.util.ArrayList<library.NewsletterSystem>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<library.NewsletterSystem>) newsletterSystemList5, newsletterSystemArray4);
        maintainNewsletterProxy0.setNews((java.util.List<library.NewsletterSystem>) newsletterSystemList5);
        maintainNewsletterProxy0.load("User: userType=false, email=false, password=false]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(newsletterSystemArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        library.Nonfaculty nonfaculty0 = new library.Nonfaculty();
        java.lang.String str1 = nonfaculty0.getuserType();
        java.lang.String str2 = nonfaculty0.toString();
        java.lang.String str3 = nonfaculty0.getuserType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "User: userType=null, email=null, password=null]" + "'", str2.equals("User: userType=null, email=null, password=null]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        java.util.Date date5 = null;
        java.util.Date date6 = null;
        library.User user7 = null;
        library.Magazine magazine13 = new library.Magazine("", "hi!", "", "", true, date5, date6, user7, "", (java.lang.Double) (-1.0d), "", "hi!", "");
        java.util.Date date14 = null;
        magazine13.considerIfLost(date14);
        magazine13.setTitle("false");
        magazine13.setID("true");
        magazine13.setOnDiscount("User: userType=false, email=false, password=false]");
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        java.util.Date date5 = null;
        java.util.Date date6 = null;
        library.Visitor visitor7 = new library.Visitor();
        java.lang.String str8 = visitor7.getuserType();
        java.lang.String str9 = visitor7.getPassword();
        visitor7.setUserType("true");
        visitor7.setEmail("User: userType=, email=User: userType=null, email=null, password=null], password=false]");
        java.lang.String str14 = visitor7.toString();
        library.CD cD20 = new library.CD("", "true", "User: userType=null, email=null, password=null]", "false", false, date5, date6, (library.User) visitor7, "User: userType=true, email=false, password=User: userType=null, email=null, password=null]]", (java.lang.Double) 100.0d, "User: userType=null, email=true, password=null]", "hi!", "User: userType=true, email=false, password=User: userType=null, email=null, password=null]]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "User: userType=true, email=User: userType=, email=User: userType=null, email=null, password=null], password=false], password=null]" + "'", str14.equals("User: userType=true, email=User: userType=, email=User: userType=null, email=null, password=null], password=false], password=null]"));
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        library.Student student0 = new library.Student();
        java.util.ArrayList<library.Book> bookList1 = student0.getBookItems();
        student0.setEmail("User: userType=null, email=null, password=null]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookList1);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        java.util.Date date5 = null;
        java.util.Date date6 = null;
        library.UserType userType7 = new library.UserType();
        library.Request request13 = new library.Request((library.User) userType7, "", "", "hi!", "", false);
        library.CD cD19 = new library.CD("", "hi!", "", "", true, date5, date6, (library.User) userType7, "hi!", (java.lang.Double) 1.0d, "hi!", "", "hi!");
        java.lang.String str20 = cD19.getRentable();
        boolean boolean21 = cD19.isPurchasable();
        java.util.Date date22 = null;
        // The following exception was thrown during execution in test generation
        try {
            cD19.setBorrowedDate(date22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "true" + "'", str20.equals("true"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        java.util.Date date5 = null;
        java.util.Date date6 = null;
        library.UserType userType7 = new library.UserType();
        library.Request request13 = new library.Request((library.User) userType7, "", "", "hi!", "", false);
        library.CD cD19 = new library.CD("", "hi!", "", "", true, date5, date6, (library.User) userType7, "hi!", (java.lang.Double) 1.0d, "hi!", "", "hi!");
        cD19.setEdition("");
        cD19.setPurchasable("");
        library.Admin admin27 = new library.Admin("false", "false", "false");
        cD19.setOwner((library.User) admin27);
        cD19.setLost(false);
        java.util.Date date31 = cD19.getDueDate();
        java.util.Date date32 = null;
        // The following exception was thrown during execution in test generation
        try {
            cD19.setBorrowedDate(date32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date31);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        library.Book book0 = new library.Book();
        boolean boolean1 = book0.getIfLost();
        java.lang.String str2 = book0.getOnDiscount();
        boolean boolean3 = book0.isPurchasable();
        book0.setPurchasable("User: userType=null, email=null, password=null]");
        java.lang.String str6 = book0.getTitle();
        java.lang.String str7 = book0.getRentable();
        book0.setLocation("false");
        java.util.Date date10 = null;
        book0.considerIfLost(date10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "false" + "'", str2.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "false" + "'", str7.equals("false"));
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        library.MaintainSubscriptionsProxy maintainSubscriptionsProxy0 = new library.MaintainSubscriptionsProxy();
        library.Subscription subscription1 = new library.Subscription();
        java.lang.String str2 = subscription1.getSite();
        library.Visitor visitor3 = new library.Visitor();
        java.lang.String str4 = visitor3.getuserType();
        java.lang.String str5 = visitor3.getPassword();
        subscription1.setU((library.User) visitor3);
        maintainSubscriptionsProxy0.addSub(subscription1);
        maintainSubscriptionsProxy0.load("User: userType=false, email=true, password=]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        library.Course course0 = new library.Course();
        java.util.ArrayList<library.User> userList1 = course0.getStudents();
        java.util.Date date2 = null;
        course0.setEndDate(date2);
        library.User user4 = course0.getProfessorFaculty();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(userList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user4);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        java.util.Date date5 = null;
        java.util.Date date6 = null;
        library.UserType userType7 = new library.UserType();
        library.Request request13 = new library.Request((library.User) userType7, "", "", "hi!", "", false);
        library.CD cD19 = new library.CD("", "hi!", "", "", true, date5, date6, (library.User) userType7, "hi!", (java.lang.Double) 1.0d, "hi!", "", "hi!");
        cD19.setEdition("");
        cD19.setPurchasable("");
        library.Admin admin27 = new library.Admin("false", "false", "false");
        cD19.setOwner((library.User) admin27);
        java.lang.String str29 = admin27.getPassword();
        java.lang.String str30 = admin27.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "false" + "'", str29.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "false" + "'", str30.equals("false"));
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        library.MaintainRequestsProxy maintainRequestsProxy0 = new library.MaintainRequestsProxy();
        library.UserType userType1 = new library.UserType();
        library.Request request7 = new library.Request((library.User) userType1, "", "", "hi!", "", false);
        library.User user8 = request7.getUser();
        java.lang.String str9 = request7.getItemType();
        java.lang.String str10 = maintainRequestsProxy0.notifyPriority(request7);
        library.AdminAccount adminAccount11 = new library.AdminAccount();
        java.lang.String str12 = adminAccount11.path;
        library.UserType userType13 = new library.UserType();
        library.Request request19 = new library.Request((library.User) userType13, "", "", "hi!", "", false);
        library.User user20 = request19.getUser();
        java.util.Date date26 = null;
        java.util.Date date27 = null;
        library.UserType userType28 = new library.UserType();
        library.Request request34 = new library.Request((library.User) userType28, "", "", "hi!", "", false);
        library.CD cD40 = new library.CD("", "hi!", "", "", true, date26, date27, (library.User) userType28, "hi!", (java.lang.Double) 1.0d, "hi!", "", "hi!");
        java.lang.String str41 = userType28.toString();
        request19.setUser((library.User) userType28);
        maintainRequestsProxy0.sendRequestDeny(adminAccount11, request19);
        library.Subscription subscription44 = new library.Subscription();
        java.lang.String str45 = subscription44.getSite();
        library.Visitor visitor46 = new library.Visitor();
        java.lang.String str47 = visitor46.getuserType();
        java.lang.String str48 = visitor46.getPassword();
        subscription44.setU((library.User) visitor46);
        request19.setUser((library.User) visitor46);
        request19.setPriority("User: userType=true, email=false, password=User: userType=null, email=null, password=null]]");
        request19.setItemType("User: userType=true, email=false, password=User: userType=null, email=null, password=null]]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "User: userType=null, email=null, password=null]" + "'", str41.equals("User: userType=null, email=null, password=null]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str48);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        java.util.Date date5 = null;
        java.util.Date date6 = null;
        library.UserType userType7 = new library.UserType();
        library.Request request13 = new library.Request((library.User) userType7, "", "", "hi!", "", false);
        library.CD cD19 = new library.CD("", "hi!", "", "", true, date5, date6, (library.User) userType7, "hi!", (java.lang.Double) 1.0d, "hi!", "", "hi!");
        cD19.setEdition("");
        cD19.setPurchasable("");
        library.Admin admin27 = new library.Admin("false", "false", "false");
        cD19.setOwner((library.User) admin27);
        java.util.Date date29 = cD19.getLostDate();
        java.lang.Double double30 = cD19.getCost();
        java.util.Date date31 = null;
        cD19.setLostDate(date31);
        java.lang.Double double33 = cD19.getCost();
        java.util.Date date34 = null;
        // The following exception was thrown during execution in test generation
        try {
            cD19.setBorrowedDate(date34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 1.0d + "'", double30.equals(1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 1.0d + "'", double33.equals(1.0d));
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        library.Subscription subscription0 = new library.Subscription();
        java.lang.String str1 = subscription0.getSite();
        library.Visitor visitor2 = new library.Visitor();
        java.lang.String str3 = visitor2.getuserType();
        java.lang.String str4 = visitor2.getPassword();
        subscription0.setU((library.User) visitor2);
        java.lang.String str6 = visitor2.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        java.util.Date date5 = null;
        java.util.Date date6 = null;
        java.util.Date date14 = null;
        java.util.Date date15 = null;
        library.UserType userType16 = new library.UserType();
        library.Request request22 = new library.Request((library.User) userType16, "", "", "hi!", "", false);
        library.Book book28 = new library.Book("false", "true", "true", "User: userType=null, email=null, password=null]", true, date14, date15, (library.User) userType16, "true", (java.lang.Double) 0.0d, "User: userType=null, email=null, password=null]", "true", "false");
        library.Subscription subscription30 = new library.Subscription("false", "false", (library.User) userType16, true);
        library.Magazine magazine36 = new library.Magazine("User: userType=false, email=true, password=]", "User: userType=true, email=User: userType=, email=User: userType=null, email=null, password=null], password=false], password=null]", "User: userType=false, email=true, password=]", "User: userType=false, email=true, password=]", false, date5, date6, (library.User) userType16, "", (java.lang.Double) 0.0d, "User: userType=null, email=true, password=null]", "true", "User: userType=true, email=false, password=User: userType=null, email=null, password=null]]");
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        java.util.Date date5 = null;
        java.util.Date date6 = null;
        library.User user7 = null;
        library.Magazine magazine13 = new library.Magazine("", "hi!", "", "", true, date5, date6, user7, "", (java.lang.Double) (-1.0d), "", "hi!", "");
        java.util.Date date14 = null;
        magazine13.considerIfLost(date14);
        magazine13.setTitle("false");
        magazine13.setPurchasable("User: userType=false, email=true, password=]");
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        java.util.Date date5 = null;
        java.util.Date date6 = null;
        library.UserType userType7 = new library.UserType();
        library.Request request13 = new library.Request((library.User) userType7, "", "", "hi!", "", false);
        library.CD cD19 = new library.CD("", "hi!", "", "", true, date5, date6, (library.User) userType7, "hi!", (java.lang.Double) 1.0d, "hi!", "", "hi!");
        cD19.setEdition("");
        cD19.setPurchasable("");
        library.Admin admin27 = new library.Admin("false", "false", "false");
        cD19.setOwner((library.User) admin27);
        java.util.List<library.Item> itemList29 = admin27.getItems();
        admin27.setPassword("hi!");
        java.util.List<library.Item> itemList32 = admin27.getItems();
        admin27.setUserType("true");
        java.util.List<library.Item> itemList35 = admin27.getItems();
        java.util.Date date41 = null;
        java.util.Date date42 = null;
        library.UserType userType43 = new library.UserType();
        library.Request request49 = new library.Request((library.User) userType43, "", "", "hi!", "", false);
        library.CD cD55 = new library.CD("", "hi!", "", "", true, date41, date42, (library.User) userType43, "hi!", (java.lang.Double) 1.0d, "hi!", "", "hi!");
        cD55.setEdition("");
        cD55.setPurchasable("");
        library.Admin admin63 = new library.Admin("false", "false", "false");
        cD55.setOwner((library.User) admin63);
        java.lang.String str65 = admin63.getPassword();
        java.util.ArrayList<library.Request> requestList66 = admin63.getRequestList();
        admin63.handleRequests();
        java.util.ArrayList<library.Request> requestList68 = admin63.getRequestList();
        java.util.ArrayList<library.Request> requestList69 = admin63.getRequestList();
        admin27.setRequestList(requestList69);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemList29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemList32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemList35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str65 + "' != '" + "false" + "'", str65.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(requestList66);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(requestList68);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(requestList69);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        java.util.Date date5 = null;
        java.util.Date date6 = null;
        library.User user7 = null;
        library.Magazine magazine13 = new library.Magazine("", "hi!", "", "", true, date5, date6, user7, "", (java.lang.Double) (-1.0d), "", "hi!", "");
        java.lang.Double double14 = magazine13.getCost();
        boolean boolean15 = magazine13.isPurchasable();
        java.lang.Double double16 = magazine13.getCost();
        java.lang.String str17 = magazine13.getID();
        java.util.Date date18 = magazine13.getLostDate();
        java.util.Date date19 = magazine13.getDueDate();
        boolean boolean20 = magazine13.isPurchasable();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        java.util.Date date5 = null;
        java.util.Date date6 = null;
        library.UserType userType7 = new library.UserType();
        library.Request request13 = new library.Request((library.User) userType7, "", "", "hi!", "", false);
        library.CD cD19 = new library.CD("", "hi!", "", "", true, date5, date6, (library.User) userType7, "hi!", (java.lang.Double) 1.0d, "hi!", "", "hi!");
        java.lang.String str20 = cD19.getRentable();
        cD19.setRentable("hi!");
        cD19.setEdition("User: userType=, email=User: userType=null, email=null, password=null], password=false]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "true" + "'", str20.equals("true"));
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        java.util.Date date5 = null;
        java.util.Date date6 = null;
        library.User user7 = null;
        library.Magazine magazine13 = new library.Magazine("", "hi!", "", "", true, date5, date6, user7, "", (java.lang.Double) (-1.0d), "", "hi!", "");
        java.lang.Double double14 = magazine13.getCost();
        boolean boolean15 = magazine13.isPurchasable();
        java.lang.Double double16 = magazine13.getCost();
        boolean boolean17 = magazine13.isRentable();
        library.Student student21 = new library.Student("false", "true", "");
        magazine13.setOwner((library.User) student21);
        java.lang.String str23 = student21.toString();
        library.Book book24 = new library.Book();
        boolean boolean25 = book24.getIfLost();
        java.lang.String str26 = book24.getItemType();
        java.util.Date date27 = null;
        book24.considerIfLost(date27);
        java.lang.Double double29 = book24.getCost();
        student21.addBookItem(book24);
        java.util.ArrayList<library.Course> courseList31 = student21.getCourses();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "User: userType=false, email=true, password=]" + "'", str23.equals("User: userType=false, email=true, password=]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(double29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(courseList31);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        java.util.Date date5 = null;
        java.util.Date date6 = null;
        library.User user7 = null;
        library.Magazine magazine13 = new library.Magazine("", "hi!", "", "", true, date5, date6, user7, "", (java.lang.Double) (-1.0d), "", "hi!", "");
        java.lang.Double double14 = magazine13.getCost();
        boolean boolean15 = magazine13.isPurchasable();
        java.lang.Double double16 = magazine13.getCost();
        boolean boolean17 = magazine13.isRentable();
        library.Student student21 = new library.Student("false", "true", "");
        magazine13.setOwner((library.User) student21);
        student21.setUserType("true");
        java.lang.String str25 = student21.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "true" + "'", str25.equals("true"));
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        library.Nonfaculty nonfaculty0 = new library.Nonfaculty();
        java.lang.String str1 = nonfaculty0.getuserType();
        java.lang.String str2 = nonfaculty0.toString();
        java.lang.String str3 = nonfaculty0.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "User: userType=null, email=null, password=null]" + "'", str2.equals("User: userType=null, email=null, password=null]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        library.Course course0 = new library.Course();
        java.util.ArrayList<library.User> userList1 = course0.getStudents();
        java.util.Date date2 = null;
        course0.setEndDate(date2);
        course0.setCourseCode("User: userType=, email=User: userType=null, email=null, password=null], password=false]");
        java.util.Date date6 = course0.getStartDate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(userList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date6);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        library.Faculty faculty0 = new library.Faculty();
        java.lang.String str1 = faculty0.getPassword();
        java.lang.String str2 = faculty0.getuserType();
        library.MaintainCoursesProxy maintainCoursesProxy3 = new library.MaintainCoursesProxy();
        java.util.List<library.Course> courseList4 = maintainCoursesProxy3.getCourses();
        library.MaintainCoursesProxy maintainCoursesProxy5 = new library.MaintainCoursesProxy();
        library.Course[] courseArray6 = new library.Course[] {};
        java.util.ArrayList<library.Course> courseList7 = new java.util.ArrayList<library.Course>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<library.Course>) courseList7, courseArray6);
        maintainCoursesProxy5.setCourses((java.util.List<library.Course>) courseList7);
        maintainCoursesProxy3.setCourses((java.util.List<library.Course>) courseList7);
        library.Course course11 = new library.Course();
        java.util.ArrayList<library.User> userList12 = course11.getStudents();
        library.Course course13 = maintainCoursesProxy3.getCourse(course11);
        faculty0.addCourse(course11);
        java.util.ArrayList<library.Book> bookList15 = faculty0.getBookItems();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(courseList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(courseArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(userList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(course13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookList15);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        library.UserType userType0 = new library.UserType();
        library.Request request6 = new library.Request((library.User) userType0, "", "", "hi!", "", false);
        library.User user7 = request6.getUser();
        java.lang.String str8 = request6.getPriority();
        java.lang.String str9 = request6.getItemType();
        library.Student student13 = new library.Student("false", "true", "");
        request6.setUser((library.User) student13);
        student13.setUserType("true");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        library.MaintainUserProxy maintainUserProxy0 = new library.MaintainUserProxy();
        java.util.List<library.User> userList1 = maintainUserProxy0.getUsers();
        java.util.Date date7 = null;
        java.util.Date date8 = null;
        library.UserType userType9 = new library.UserType();
        library.Request request15 = new library.Request((library.User) userType9, "", "", "hi!", "", false);
        library.CD cD21 = new library.CD("", "hi!", "", "", true, date7, date8, (library.User) userType9, "hi!", (java.lang.Double) 1.0d, "hi!", "", "hi!");
        cD21.setEdition("");
        cD21.setPurchasable("");
        library.Admin admin29 = new library.Admin("false", "false", "false");
        cD21.setOwner((library.User) admin29);
        maintainUserProxy0.addUser((library.User) admin29);
        library.AdminAccount adminAccount32 = new library.AdminAccount();
        java.lang.String str33 = adminAccount32.path;
        library.Book book34 = new library.Book();
        boolean boolean35 = book34.getIfLost();
        java.lang.String str36 = book34.getOnDiscount();
        java.lang.String str37 = book34.getPublisher();
        java.lang.String str38 = book34.getLocation();
        adminAccount32.add_createItem((library.Item) book34);
        admin29.enableItem((library.Item) book34);
        java.util.List<library.Item> itemList41 = admin29.getItems();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "false" + "'", str36.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemList41);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        java.util.Date date5 = null;
        java.util.Date date6 = null;
        library.UserType userType7 = new library.UserType();
        library.Request request13 = new library.Request((library.User) userType7, "", "", "hi!", "", false);
        library.CD cD19 = new library.CD("", "hi!", "", "", true, date5, date6, (library.User) userType7, "hi!", (java.lang.Double) 1.0d, "hi!", "", "hi!");
        cD19.setEdition("");
        cD19.setPurchasable("");
        cD19.setOnDiscount("hi!");
        cD19.setPurchasable("true");
        boolean boolean28 = cD19.isRentable();
        java.util.Date date29 = null;
        cD19.considerIfLost(date29);
        java.lang.String str31 = cD19.getOnDiscount();
        java.lang.String str32 = cD19.getID();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "false" + "'", str31.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "" + "'", str32.equals(""));
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        library.NewsletterSystem newsletterSystem2 = new library.NewsletterSystem("User: userType=false, email=true, password=]", "true");
        newsletterSystem2.setCompany("User: userType=true, email=User: userType=, email=User: userType=null, email=null, password=null], password=false], password=null]");
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        library.UserType userType0 = new library.UserType();
        library.Request request6 = new library.Request((library.User) userType0, "", "", "hi!", "", false);
        library.User user7 = request6.getUser();
        java.lang.String str8 = request6.getPriority();
        java.lang.String str9 = request6.getPriority();
        boolean boolean10 = request6.isCompletion();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        library.MaintainRequestsProxy maintainRequestsProxy0 = new library.MaintainRequestsProxy();
        library.UserType userType1 = new library.UserType();
        library.Request request7 = new library.Request((library.User) userType1, "", "", "hi!", "", false);
        library.User user8 = request7.getUser();
        java.lang.String str9 = request7.getItemType();
        java.lang.String str10 = maintainRequestsProxy0.notifyPriority(request7);
        library.MaintainRequestsProxy maintainRequestsProxy11 = new library.MaintainRequestsProxy();
        library.UserType userType12 = new library.UserType();
        library.Request request18 = new library.Request((library.User) userType12, "", "", "hi!", "", false);
        library.User user19 = request18.getUser();
        java.lang.String str20 = request18.getItemType();
        java.lang.String str21 = maintainRequestsProxy11.notifyPriority(request18);
        library.UserType userType22 = new library.UserType();
        library.Request request28 = new library.Request((library.User) userType22, "", "", "hi!", "", false);
        library.User user29 = request28.getUser();
        java.lang.String str30 = maintainRequestsProxy11.notifyPriority(request28);
        library.MaintainRequestsProxy maintainRequestsProxy31 = new library.MaintainRequestsProxy();
        library.UserType userType32 = new library.UserType();
        library.Request request38 = new library.Request((library.User) userType32, "", "", "hi!", "", false);
        library.User user39 = request38.getUser();
        java.lang.String str40 = request38.getItemType();
        java.lang.String str41 = maintainRequestsProxy31.notifyPriority(request38);
        library.AdminAccount adminAccount42 = new library.AdminAccount();
        java.lang.String str43 = adminAccount42.path;
        library.UserType userType44 = new library.UserType();
        library.Request request50 = new library.Request((library.User) userType44, "", "", "hi!", "", false);
        library.User user51 = request50.getUser();
        java.util.Date date57 = null;
        java.util.Date date58 = null;
        library.UserType userType59 = new library.UserType();
        library.Request request65 = new library.Request((library.User) userType59, "", "", "hi!", "", false);
        library.CD cD71 = new library.CD("", "hi!", "", "", true, date57, date58, (library.User) userType59, "hi!", (java.lang.Double) 1.0d, "hi!", "", "hi!");
        java.lang.String str72 = userType59.toString();
        request50.setUser((library.User) userType59);
        maintainRequestsProxy31.sendRequestDeny(adminAccount42, request50);
        java.lang.String str75 = maintainRequestsProxy11.notifyPriority(request50);
        maintainRequestsProxy0.confirmReq(request50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "" + "'", str21.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "" + "'", str30.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "hi!" + "'", str40.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "" + "'", str41.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str72 + "' != '" + "User: userType=null, email=null, password=null]" + "'", str72.equals("User: userType=null, email=null, password=null]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str75 + "' != '" + "" + "'", str75.equals(""));
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        library.Admin admin3 = new library.Admin("", "hi!", "false");
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        library.NewsletterSystem newsletterSystem2 = new library.NewsletterSystem("true", "User: userType=null, email=null, password=null]");
        java.lang.String str3 = newsletterSystem2.getCompany();
        newsletterSystem2.setWebsite("User: userType=null, email=null, password=null]");
        newsletterSystem2.setCompany("false");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "true" + "'", str3.equals("true"));
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        library.MaintainCoursesProxy maintainCoursesProxy0 = new library.MaintainCoursesProxy();
        java.util.List<library.Course> courseList1 = maintainCoursesProxy0.getCourses();
        library.MaintainCoursesProxy maintainCoursesProxy2 = new library.MaintainCoursesProxy();
        library.Course[] courseArray3 = new library.Course[] {};
        java.util.ArrayList<library.Course> courseList4 = new java.util.ArrayList<library.Course>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<library.Course>) courseList4, courseArray3);
        maintainCoursesProxy2.setCourses((java.util.List<library.Course>) courseList4);
        maintainCoursesProxy0.setCourses((java.util.List<library.Course>) courseList4);
        library.Course course8 = new library.Course();
        java.util.Date date9 = course8.endDate;
        library.Course course10 = maintainCoursesProxy0.getCourse(course8);
        java.util.Date date11 = course8.endDate;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(courseList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(courseArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(course10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date11);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        library.Visitor visitor3 = new library.Visitor("User: userType=false, email=true, password=]", "User: userType=, email=User: userType=null, email=null, password=null], password=false]", "hi!");
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        library.MaintainCourses maintainCourses0 = new library.MaintainCourses();
        java.util.List<library.Course> courseList1 = maintainCourses0.getCourses();
        library.Course course2 = new library.Course();
        library.Course course3 = maintainCourses0.getCourse(course2);
        library.Course course4 = new library.Course();
        java.util.ArrayList<library.User> userList5 = course4.getStudents();
        java.util.Date date11 = null;
        java.util.Date date12 = null;
        library.UserType userType13 = new library.UserType();
        library.Request request19 = new library.Request((library.User) userType13, "", "", "hi!", "", false);
        library.CD cD25 = new library.CD("", "hi!", "", "", true, date11, date12, (library.User) userType13, "hi!", (java.lang.Double) 1.0d, "hi!", "", "hi!");
        boolean boolean26 = cD25.getIfLost();
        course4.setTextbooks((library.Item) cD25);
        java.util.Date date33 = null;
        java.util.Date date34 = null;
        library.Admin admin38 = new library.Admin("false", "false", "false");
        java.lang.String str39 = admin38.getPassword();
        library.CD cD45 = new library.CD("", "true", "false", "true", false, date33, date34, (library.User) admin38, "hi!", (java.lang.Double) 0.0d, "true", "hi!", "");
        course4.setFaculty((library.User) admin38);
        maintainCourses0.addCourse(course4);
        course4.courseCode = "User: userType=true, email=User: userType=, email=User: userType=null, email=null, password=null], password=false], password=null]";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(courseList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(course3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(userList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "false" + "'", str39.equals("false"));
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        java.util.Date date5 = null;
        java.util.Date date6 = null;
        library.User user7 = null;
        library.Magazine magazine13 = new library.Magazine("", "hi!", "", "", true, date5, date6, user7, "", (java.lang.Double) (-1.0d), "", "hi!", "");
        magazine13.setOnDiscount("");
        java.util.Date date16 = null;
        magazine13.setLostDate(date16);
        java.lang.String str18 = magazine13.getRentable();
        java.lang.String str19 = magazine13.getID();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "true" + "'", str18.equals("true"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        library.MaintainUserProxy maintainUserProxy0 = new library.MaintainUserProxy();
        java.util.List<library.User> userList1 = maintainUserProxy0.getUsers();
        library.MaintainUserProxy maintainUserProxy2 = new library.MaintainUserProxy();
        java.util.List<library.User> userList3 = maintainUserProxy2.getUsers();
        maintainUserProxy0.setUsers(userList3);
        library.Visitor visitor5 = new library.Visitor();
        maintainUserProxy0.addUser((library.User) visitor5);
        library.Faculty faculty10 = new library.Faculty("", "false", "false");
        library.Book book11 = new library.Book();
        boolean boolean12 = book11.getIfLost();
        java.lang.String str13 = book11.getOnDiscount();
        java.lang.String str14 = book11.getPublisher();
        faculty10.addBookItem(book11);
        maintainUserProxy0.addUser((library.User) faculty10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "false" + "'", str13.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        library.Facade facade0 = new library.Facade();
        boolean boolean2 = facade0.passwordValid("true");
        library.User user3 = facade0.getUser();
        boolean boolean5 = facade0.passwordValid("User: userType=false, email=true, password=]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        java.util.Date date5 = null;
        java.util.Date date6 = null;
        library.UserType userType7 = new library.UserType();
        library.Request request13 = new library.Request((library.User) userType7, "", "", "hi!", "", false);
        library.Book book19 = new library.Book("false", "true", "true", "User: userType=null, email=null, password=null]", true, date5, date6, (library.User) userType7, "true", (java.lang.Double) 0.0d, "User: userType=null, email=null, password=null]", "true", "false");
        java.util.Date date20 = book19.getLostDate();
        java.lang.Double double21 = book19.getCost();
        java.util.Date date22 = book19.getDueDate();
        java.util.Date date23 = null;
        book19.setLostDate(date23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date22);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        java.util.Date date5 = null;
        java.util.Date date6 = null;
        library.UserType userType7 = new library.UserType();
        library.Request request13 = new library.Request((library.User) userType7, "", "", "hi!", "", false);
        library.CD cD19 = new library.CD("", "hi!", "", "", true, date5, date6, (library.User) userType7, "hi!", (java.lang.Double) 1.0d, "hi!", "", "hi!");
        cD19.setEdition("");
        cD19.setPurchasable("");
        library.Admin admin27 = new library.Admin("false", "false", "false");
        cD19.setOwner((library.User) admin27);
        java.lang.String str29 = admin27.getPassword();
        java.util.ArrayList<library.Request> requestList30 = admin27.getRequestList();
        admin27.handleRequests();
        java.util.ArrayList<library.Request> requestList32 = admin27.getRequestList();
        java.util.List<library.Item> itemList33 = admin27.getItems();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "false" + "'", str29.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(requestList30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(requestList32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemList33);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        library.Student student3 = new library.Student("true", "false", "User: userType=null, email=null, password=null]");
        student3.setUserType("false");
        student3.setUserType("User: userType=null, email=true, password=null]");
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        library.Course course0 = new library.Course();
        java.util.ArrayList<library.User> userList1 = course0.getStudents();
        java.util.Date date2 = null;
        course0.setEndDate(date2);
        library.MaintainUserProxy maintainUserProxy4 = new library.MaintainUserProxy();
        java.util.List<library.User> userList5 = maintainUserProxy4.getUsers();
        java.util.Date date11 = null;
        java.util.Date date12 = null;
        library.UserType userType13 = new library.UserType();
        library.Request request19 = new library.Request((library.User) userType13, "", "", "hi!", "", false);
        library.CD cD25 = new library.CD("", "hi!", "", "", true, date11, date12, (library.User) userType13, "hi!", (java.lang.Double) 1.0d, "hi!", "", "hi!");
        cD25.setEdition("");
        cD25.setPurchasable("");
        library.Admin admin33 = new library.Admin("false", "false", "false");
        cD25.setOwner((library.User) admin33);
        maintainUserProxy4.addUser((library.User) admin33);
        library.AdminAccount adminAccount36 = new library.AdminAccount();
        java.lang.String str37 = adminAccount36.path;
        library.Book book38 = new library.Book();
        boolean boolean39 = book38.getIfLost();
        java.lang.String str40 = book38.getOnDiscount();
        java.lang.String str41 = book38.getPublisher();
        java.lang.String str42 = book38.getLocation();
        adminAccount36.add_createItem((library.Item) book38);
        admin33.enableItem((library.Item) book38);
        course0.professorFaculty = admin33;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(userList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "false" + "'", str40.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str42);
    }

 
    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        library.MaintainSubscriptionsProxy maintainSubscriptionsProxy0 = new library.MaintainSubscriptionsProxy();
        library.MaintainSubscriptionsProxy maintainSubscriptionsProxy1 = new library.MaintainSubscriptionsProxy();
        library.Subscription subscription2 = new library.Subscription();
        java.lang.String str3 = subscription2.getSite();
        subscription2.setSite("");
        java.util.Date date13 = null;
        java.util.Date date14 = null;
        library.UserType userType15 = new library.UserType();
        library.Request request21 = new library.Request((library.User) userType15, "", "", "hi!", "", false);
        library.Book book27 = new library.Book("false", "true", "true", "User: userType=null, email=null, password=null]", true, date13, date14, (library.User) userType15, "true", (java.lang.Double) 0.0d, "User: userType=null, email=null, password=null]", "true", "false");
        library.Subscription subscription29 = new library.Subscription("false", "false", (library.User) userType15, true);
        java.lang.String str30 = subscription29.isStatus();
        library.Subscription subscription31 = new library.Subscription();
        java.lang.String str32 = subscription31.getSite();
        subscription31.setSite("");
        library.Subscription subscription35 = new library.Subscription();
        java.lang.String str36 = subscription35.getSite();
        subscription35.setSite("");
        library.Subscription[] subscriptionArray39 = new library.Subscription[] { subscription2, subscription29, subscription31, subscription35 };
        java.util.ArrayList<library.Subscription> subscriptionList40 = new java.util.ArrayList<library.Subscription>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<library.Subscription>) subscriptionList40, subscriptionArray39);
        maintainSubscriptionsProxy1.setSubs((java.util.List<library.Subscription>) subscriptionList40);
        maintainSubscriptionsProxy0.setSubs((java.util.List<library.Subscription>) subscriptionList40);
        java.util.Date date51 = null;
        java.util.Date date52 = null;
        library.UserType userType53 = new library.UserType();
        library.Request request59 = new library.Request((library.User) userType53, "", "", "hi!", "", false);
        library.Book book65 = new library.Book("false", "true", "true", "User: userType=null, email=null, password=null]", true, date51, date52, (library.User) userType53, "true", (java.lang.Double) 0.0d, "User: userType=null, email=null, password=null]", "true", "false");
        library.Subscription subscription67 = new library.Subscription("false", "false", (library.User) userType53, true);
        maintainSubscriptionsProxy0.addSub(subscription67);
        library.MaintainSubscriptionsProxy maintainSubscriptionsProxy69 = new library.MaintainSubscriptionsProxy();
        library.Subscription subscription70 = new library.Subscription();
        java.lang.String str71 = subscription70.getSite();
        library.Visitor visitor72 = new library.Visitor();
        java.lang.String str73 = visitor72.getuserType();
        java.lang.String str74 = visitor72.getPassword();
        subscription70.setU((library.User) visitor72);
        maintainSubscriptionsProxy69.addSub(subscription70);
        maintainSubscriptionsProxy0.addSub(subscription70);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "true" + "'", str30.equals("true"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(subscriptionArray39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str71);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str73);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str74);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        library.UserType userType0 = new library.UserType();
        library.Request request6 = new library.Request((library.User) userType0, "", "", "hi!", "", false);
        library.User user7 = request6.getUser();
        java.lang.String str8 = request6.getPriority();
        java.lang.String str9 = request6.getItemType();
        request6.setItemType("User: userType=false, email=true, password=]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        library.Book book0 = new library.Book();
        boolean boolean1 = book0.getIfLost();
        java.lang.String str2 = book0.getItemType();
        book0.setPurchasable("true");
        java.lang.String str5 = book0.getTitle();
        book0.setPublisher("");
        java.util.Date date8 = null;
        // The following exception was thrown during execution in test generation
        try {
            book0.setBorrowedDate(date8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        library.MaintainNewsletterProxy maintainNewsletterProxy0 = new library.MaintainNewsletterProxy();
        library.NewsletterSystem newsletterSystem2 = maintainNewsletterProxy0.getItemByName("true");
        maintainNewsletterProxy0.load("User: userType=, email=User: userType=null, email=null, password=null], password=false]");
        maintainNewsletterProxy0.load("User: userType=null, email=true, password=null]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(newsletterSystem2);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        java.util.Date date5 = null;
        java.util.Date date6 = null;
        library.User user7 = null;
        library.Magazine magazine13 = new library.Magazine("", "hi!", "", "", true, date5, date6, user7, "", (java.lang.Double) (-1.0d), "", "hi!", "");
        java.lang.Double double14 = magazine13.getCost();
        boolean boolean15 = magazine13.isPurchasable();
        java.lang.Double double16 = magazine13.getCost();
        java.lang.String str17 = magazine13.getID();
        java.util.Date date18 = magazine13.getLostDate();
        java.util.Date date19 = magazine13.getBorrowedDate();
        magazine13.setTitle("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date19);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        java.util.Date date5 = null;
        java.util.Date date6 = null;
        library.UserType userType7 = new library.UserType();
        library.Request request13 = new library.Request((library.User) userType7, "", "", "hi!", "", false);
        library.CD cD19 = new library.CD("", "hi!", "", "", true, date5, date6, (library.User) userType7, "hi!", (java.lang.Double) 1.0d, "hi!", "", "hi!");
        cD19.setEdition("");
        cD19.setPurchasable("");
        cD19.setOnDiscount("hi!");
        cD19.setPurchasable("true");
        boolean boolean28 = cD19.isRentable();
        java.util.Date date29 = null;
        cD19.considerIfLost(date29);
        java.lang.String str31 = cD19.getOnDiscount();
        cD19.setPublisher("User: userType=null, email=null, password=null]");
        java.lang.Class<?> wildcardClass34 = cD19.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "false" + "'", str31.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        library.UserType userType0 = new library.UserType();
        library.Request request6 = new library.Request((library.User) userType0, "", "", "hi!", "", false);
        library.User user7 = request6.getUser();
        java.util.Date date13 = null;
        java.util.Date date14 = null;
        library.UserType userType15 = new library.UserType();
        library.Request request21 = new library.Request((library.User) userType15, "", "", "hi!", "", false);
        library.CD cD27 = new library.CD("", "hi!", "", "", true, date13, date14, (library.User) userType15, "hi!", (java.lang.Double) 1.0d, "hi!", "", "hi!");
        java.lang.String str28 = userType15.toString();
        request6.setUser((library.User) userType15);
        request6.setItemType("false");
        request6.setName("User: userType=true, email=User: userType=, email=User: userType=null, email=null, password=null], password=false], password=null]");
        java.lang.String str34 = request6.getPriority();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "User: userType=null, email=null, password=null]" + "'", str28.equals("User: userType=null, email=null, password=null]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "" + "'", str34.equals(""));
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        java.util.Date date5 = null;
        java.util.Date date6 = null;
        library.User user7 = null;
        library.Magazine magazine13 = new library.Magazine("", "hi!", "", "", true, date5, date6, user7, "", (java.lang.Double) (-1.0d), "", "hi!", "");
        java.lang.Double double14 = magazine13.getCost();
        boolean boolean15 = magazine13.isPurchasable();
        java.lang.Double double16 = magazine13.getCost();
        java.lang.String str17 = magazine13.getRentable();
        java.lang.String str18 = magazine13.getRentable();
        library.User user19 = magazine13.getOwner();
        java.lang.String str20 = magazine13.getOnDiscount();
        magazine13.setItemType("User: userType=null, email=true, password=null]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "true" + "'", str17.equals("true"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "true" + "'", str18.equals("true"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "false" + "'", str20.equals("false"));
    }

  
    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        java.util.Date date5 = null;
        java.util.Date date6 = null;
        library.UserType userType7 = new library.UserType();
        library.Request request13 = new library.Request((library.User) userType7, "", "", "hi!", "", false);
        library.CD cD19 = new library.CD("", "hi!", "", "", true, date5, date6, (library.User) userType7, "hi!", (java.lang.Double) 1.0d, "hi!", "", "hi!");
        cD19.setItemType("User: userType=null, email=null, password=null]");
        java.lang.Double double22 = cD19.getCost();
        library.User user23 = cD19.getOwner();
        java.util.Date date24 = null;
        cD19.setLostDate(date24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.0d + "'", double22.equals(1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user23);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        java.util.Date date5 = null;
        java.util.Date date6 = null;
        library.Student student7 = new library.Student();
        java.lang.String str8 = student7.getuserType();
        library.Book book14 = new library.Book("true", "hi!", "hi!", "false", false, date5, date6, (library.User) student7, "", (java.lang.Double) 1.0d, "hi!", "", "");
        student7.setEmail("true");
        library.Request request22 = new library.Request((library.User) student7, "User: userType=true, email=false, password=User: userType=null, email=null, password=null]]", "User: userType=true, email=User: userType=, email=User: userType=null, email=null, password=null], password=false], password=null]", "", "true", false);
        student7.setPassword("User: userType=null, email=, password=null]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        library.MaintainRequestsProxy maintainRequestsProxy0 = new library.MaintainRequestsProxy();
        library.UserType userType1 = new library.UserType();
        library.Request request7 = new library.Request((library.User) userType1, "", "", "hi!", "", false);
        library.User user8 = request7.getUser();
        java.lang.String str9 = request7.getItemType();
        java.lang.String str10 = maintainRequestsProxy0.notifyPriority(request7);
        library.AdminAccount adminAccount11 = new library.AdminAccount();
        java.lang.String str12 = adminAccount11.path;
        library.UserType userType13 = new library.UserType();
        library.Request request19 = new library.Request((library.User) userType13, "", "", "hi!", "", false);
        library.User user20 = request19.getUser();
        java.util.Date date26 = null;
        java.util.Date date27 = null;
        library.UserType userType28 = new library.UserType();
        library.Request request34 = new library.Request((library.User) userType28, "", "", "hi!", "", false);
        library.CD cD40 = new library.CD("", "hi!", "", "", true, date26, date27, (library.User) userType28, "hi!", (java.lang.Double) 1.0d, "hi!", "", "hi!");
        java.lang.String str41 = userType28.toString();
        request19.setUser((library.User) userType28);
        maintainRequestsProxy0.sendRequestDeny(adminAccount11, request19);
        library.MaintainRequestsProxy maintainRequestsProxy44 = new library.MaintainRequestsProxy();
        library.UserType userType45 = new library.UserType();
        library.Request request51 = new library.Request((library.User) userType45, "", "", "hi!", "", false);
        library.User user52 = request51.getUser();
        java.lang.String str53 = request51.getItemType();
        java.lang.String str54 = maintainRequestsProxy44.notifyPriority(request51);
        library.AdminAccount adminAccount55 = new library.AdminAccount();
        java.lang.String str56 = adminAccount55.path;
        library.UserType userType57 = new library.UserType();
        library.Request request63 = new library.Request((library.User) userType57, "", "", "hi!", "", false);
        library.User user64 = request63.getUser();
        java.util.Date date70 = null;
        java.util.Date date71 = null;
        library.UserType userType72 = new library.UserType();
        library.Request request78 = new library.Request((library.User) userType72, "", "", "hi!", "", false);
        library.CD cD84 = new library.CD("", "hi!", "", "", true, date70, date71, (library.User) userType72, "hi!", (java.lang.Double) 1.0d, "hi!", "", "hi!");
        java.lang.String str85 = userType72.toString();
        request63.setUser((library.User) userType72);
        maintainRequestsProxy44.sendRequestDeny(adminAccount55, request63);
        java.util.List<library.Request> requestList88 = maintainRequestsProxy44.getReqSI();
        maintainRequestsProxy0.setReqSI(requestList88);
        java.util.List<library.Request> requestList90 = maintainRequestsProxy0.getRequests();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "User: userType=null, email=null, password=null]" + "'", str41.equals("User: userType=null, email=null, password=null]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str53 + "' != '" + "hi!" + "'", str53.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str54 + "' != '" + "" + "'", str54.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str85 + "' != '" + "User: userType=null, email=null, password=null]" + "'", str85.equals("User: userType=null, email=null, password=null]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(requestList88);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(requestList90);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        java.util.Date date5 = null;
        java.util.Date date6 = null;
        library.Visitor visitor7 = new library.Visitor();
        library.Book book13 = new library.Book("hi!", "", "", "true", false, date5, date6, (library.User) visitor7, "User: userType=null, email=null, password=null]", (java.lang.Double) 0.0d, "true", "", "User: userType=null, email=null, password=null]");
        java.lang.String str14 = book13.getTitle();
        book13.setLocation("User: userType=, email=User: userType=null, email=null, password=null], password=false]");
        java.lang.String str17 = book13.getEdition();
        book13.setItemType("User: userType=false, email=false, password=false]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "User: userType=null, email=null, password=null]" + "'", str17.equals("User: userType=null, email=null, password=null]"));
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        library.Course course0 = new library.Course();
        java.util.ArrayList<library.User> userList1 = course0.getStudents();
        java.util.Date date2 = null;
        course0.setEndDate(date2);
        course0.setCourseCode("User: userType=, email=User: userType=null, email=null, password=null], password=false]");
        java.util.ArrayList<library.User> userList6 = null;
        course0.students = userList6;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(userList1);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        java.util.Date date5 = null;
        java.util.Date date6 = null;
        library.User user7 = null;
        library.Magazine magazine13 = new library.Magazine("", "hi!", "", "", true, date5, date6, user7, "", (java.lang.Double) (-1.0d), "", "hi!", "");
        java.lang.Double double14 = magazine13.getCost();
        magazine13.setPurchasable("hi!");
        java.lang.String str17 = magazine13.getEdition();
        magazine13.setItemType("User: userType=null, email=null, password=null]");
        java.lang.String str20 = magazine13.getID();
        java.util.Date date21 = magazine13.getDueDate();
        java.util.Date date22 = null;
        // The following exception was thrown during execution in test generation
        try {
            magazine13.setBorrowedDate(date22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date21);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        java.util.Date date5 = null;
        java.util.Date date6 = null;
        library.User user7 = null;
        library.Magazine magazine13 = new library.Magazine("", "hi!", "", "", true, date5, date6, user7, "", (java.lang.Double) (-1.0d), "", "hi!", "");
        magazine13.setOnDiscount("");
        magazine13.setPurchasable("User: userType=null, email=null, password=null]");
        magazine13.setTitle("");
        magazine13.setLost(true);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        library.Book book0 = new library.Book();
        boolean boolean1 = book0.getIfLost();
        java.lang.String str2 = book0.getOnDiscount();
        java.lang.String str3 = book0.getPublisher();
        java.lang.String str4 = book0.getTitle();
        library.User user5 = book0.getOwner();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "false" + "'", str2.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user5);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        java.util.Date date5 = null;
        java.util.Date date6 = null;
        library.User user7 = null;
        library.Magazine magazine13 = new library.Magazine("", "hi!", "", "", true, date5, date6, user7, "", (java.lang.Double) (-1.0d), "", "hi!", "");
        java.lang.Double double14 = magazine13.getCost();
        boolean boolean15 = magazine13.isPurchasable();
        java.lang.Double double16 = magazine13.getCost();
        magazine13.setEdition("User: userType=null, email=null, password=null]");
        java.util.Date date19 = null;
        magazine13.considerIfLost(date19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16.equals((-1.0d)));
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        java.util.Date date5 = null;
        java.util.Date date6 = null;
        library.User user7 = null;
        library.Magazine magazine13 = new library.Magazine("", "hi!", "", "", true, date5, date6, user7, "", (java.lang.Double) (-1.0d), "", "hi!", "");
        java.lang.Double double14 = magazine13.getCost();
        magazine13.setPurchasable("hi!");
        java.lang.String str17 = magazine13.getEdition();
        magazine13.setPublisher("User: userType=false, email=false, password=false]");
        java.util.Date date20 = null;
        magazine13.considerIfLost(date20);
        magazine13.setLocation("false");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        library.Student student3 = new library.Student("false", "true", "");
        java.util.ArrayList<library.Course> courseList4 = student3.getCourses();
        java.lang.String str5 = student3.getEmail();
        java.lang.String str6 = student3.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(courseList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "true" + "'", str5.equals("true"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "true" + "'", str6.equals("true"));
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        library.Book book0 = new library.Book();
        boolean boolean1 = book0.getIfLost();
        java.lang.String str2 = book0.getItemType();
        java.util.Date date3 = null;
        book0.considerIfLost(date3);
        java.lang.Double double5 = book0.getCost();
        java.lang.String str6 = book0.getRentable();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(double5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "false" + "'", str6.equals("false"));
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        java.util.Date date5 = null;
        java.util.Date date6 = null;
        library.Student student7 = new library.Student();
        java.lang.String str8 = student7.getuserType();
        library.Book book14 = new library.Book("true", "hi!", "hi!", "false", false, date5, date6, (library.User) student7, "", (java.lang.Double) 1.0d, "hi!", "", "");
        java.lang.String str15 = student7.getPassword();
        student7.setEmail("User: userType=null, email=true, password=null]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        library.MaintainSubscriptionsProxy maintainSubscriptionsProxy0 = new library.MaintainSubscriptionsProxy();
        library.MaintainSubscriptionsProxy maintainSubscriptionsProxy1 = new library.MaintainSubscriptionsProxy();
        library.Subscription subscription2 = new library.Subscription();
        java.lang.String str3 = subscription2.getSite();
        subscription2.setSite("");
        java.util.Date date13 = null;
        java.util.Date date14 = null;
        library.UserType userType15 = new library.UserType();
        library.Request request21 = new library.Request((library.User) userType15, "", "", "hi!", "", false);
        library.Book book27 = new library.Book("false", "true", "true", "User: userType=null, email=null, password=null]", true, date13, date14, (library.User) userType15, "true", (java.lang.Double) 0.0d, "User: userType=null, email=null, password=null]", "true", "false");
        library.Subscription subscription29 = new library.Subscription("false", "false", (library.User) userType15, true);
        java.lang.String str30 = subscription29.isStatus();
        library.Subscription subscription31 = new library.Subscription();
        java.lang.String str32 = subscription31.getSite();
        subscription31.setSite("");
        library.Subscription subscription35 = new library.Subscription();
        java.lang.String str36 = subscription35.getSite();
        subscription35.setSite("");
        library.Subscription[] subscriptionArray39 = new library.Subscription[] { subscription2, subscription29, subscription31, subscription35 };
        java.util.ArrayList<library.Subscription> subscriptionList40 = new java.util.ArrayList<library.Subscription>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<library.Subscription>) subscriptionList40, subscriptionArray39);
        maintainSubscriptionsProxy1.setSubs((java.util.List<library.Subscription>) subscriptionList40);
        maintainSubscriptionsProxy0.setSubs((java.util.List<library.Subscription>) subscriptionList40);
        java.util.List<library.Subscription> subscriptionList44 = maintainSubscriptionsProxy0.getSubs();
        library.User user47 = null;
        library.Subscription subscription49 = new library.Subscription("false", "User: userType=false, email=true, password=]", user47, false);
        java.lang.String str50 = subscription49.getCompanyName();
        java.lang.String str51 = subscription49.getSite();
        maintainSubscriptionsProxy0.addSub(subscription49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "true" + "'", str30.equals("true"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(subscriptionArray39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(subscriptionList44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str50 + "' != '" + "User: userType=false, email=true, password=]" + "'", str50.equals("User: userType=false, email=true, password=]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str51 + "' != '" + "false" + "'", str51.equals("false"));
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        java.util.Date date5 = null;
        java.util.Date date6 = null;
        library.UserType userType7 = new library.UserType();
        library.Request request13 = new library.Request((library.User) userType7, "", "", "hi!", "", false);
        library.CD cD19 = new library.CD("", "hi!", "", "", true, date5, date6, (library.User) userType7, "hi!", (java.lang.Double) 1.0d, "hi!", "", "hi!");
        cD19.setEdition("");
        cD19.setPurchasable("");
        cD19.setOnDiscount("hi!");
        cD19.setPurchasable("true");
        boolean boolean28 = cD19.isRentable();
        java.util.Date date29 = null;
        cD19.considerIfLost(date29);
        cD19.setPurchasable("false");
        boolean boolean33 = cD19.isPurchasable();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        java.util.Date date5 = null;
        java.util.Date date6 = null;
        library.UserType userType7 = new library.UserType();
        library.Request request13 = new library.Request((library.User) userType7, "", "", "hi!", "", false);
        library.CD cD19 = new library.CD("", "hi!", "", "", true, date5, date6, (library.User) userType7, "hi!", (java.lang.Double) 1.0d, "hi!", "", "hi!");
        java.lang.String str20 = cD19.getItemType();
        java.lang.String str21 = cD19.getLocation();
        java.util.Date date22 = null;
        cD19.setDueDate(date22);
        library.User user24 = cD19.getOwner();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "" + "'", str21.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user24);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        library.MaintainSubscriptionsProxy maintainSubscriptionsProxy0 = new library.MaintainSubscriptionsProxy();
        library.Subscription subscription1 = new library.Subscription();
        java.lang.String str2 = subscription1.getSite();
        subscription1.setSite("");
        java.util.Date date12 = null;
        java.util.Date date13 = null;
        library.UserType userType14 = new library.UserType();
        library.Request request20 = new library.Request((library.User) userType14, "", "", "hi!", "", false);
        library.Book book26 = new library.Book("false", "true", "true", "User: userType=null, email=null, password=null]", true, date12, date13, (library.User) userType14, "true", (java.lang.Double) 0.0d, "User: userType=null, email=null, password=null]", "true", "false");
        library.Subscription subscription28 = new library.Subscription("false", "false", (library.User) userType14, true);
        java.lang.String str29 = subscription28.isStatus();
        library.Subscription subscription30 = new library.Subscription();
        java.lang.String str31 = subscription30.getSite();
        subscription30.setSite("");
        library.Subscription subscription34 = new library.Subscription();
        java.lang.String str35 = subscription34.getSite();
        subscription34.setSite("");
        library.Subscription[] subscriptionArray38 = new library.Subscription[] { subscription1, subscription28, subscription30, subscription34 };
        java.util.ArrayList<library.Subscription> subscriptionList39 = new java.util.ArrayList<library.Subscription>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<library.Subscription>) subscriptionList39, subscriptionArray38);
        maintainSubscriptionsProxy0.setSubs((java.util.List<library.Subscription>) subscriptionList39);
        maintainSubscriptionsProxy0.load("true");
        java.util.List<library.Subscription> subscriptionList44 = maintainSubscriptionsProxy0.getSubs();
        maintainSubscriptionsProxy0.load("hi!");
        maintainSubscriptionsProxy0.load("User: userType=null, email=true, password=null]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "true" + "'", str29.equals("true"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(subscriptionArray38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(subscriptionList44);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        library.Course course0 = new library.Course();
        java.util.ArrayList<library.User> userList1 = course0.getStudents();
        java.util.Date date7 = null;
        java.util.Date date8 = null;
        library.UserType userType9 = new library.UserType();
        library.Request request15 = new library.Request((library.User) userType9, "", "", "hi!", "", false);
        library.CD cD21 = new library.CD("", "hi!", "", "", true, date7, date8, (library.User) userType9, "hi!", (java.lang.Double) 1.0d, "hi!", "", "hi!");
        boolean boolean22 = cD21.getIfLost();
        course0.setTextbooks((library.Item) cD21);
        java.util.Date date24 = course0.getEndDate();
        java.lang.String str25 = course0.courseCode;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(userList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        java.util.Date date5 = null;
        java.util.Date date6 = null;
        library.UserType userType7 = new library.UserType();
        library.Request request13 = new library.Request((library.User) userType7, "", "", "hi!", "", false);
        library.CD cD19 = new library.CD("", "hi!", "", "", true, date5, date6, (library.User) userType7, "hi!", (java.lang.Double) 1.0d, "hi!", "", "hi!");
        cD19.setEdition("");
        cD19.setPurchasable("");
        java.lang.String str24 = cD19.getEdition();
        java.lang.String str25 = cD19.getTitle();
        boolean boolean26 = cD19.isRentable();
        java.lang.String str27 = cD19.getLocation();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "" + "'", str24.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!" + "'", str25.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "" + "'", str27.equals(""));
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        java.util.Date date5 = null;
        java.util.Date date6 = null;
        library.UserType userType7 = new library.UserType();
        library.Request request13 = new library.Request((library.User) userType7, "", "", "hi!", "", false);
        library.CD cD19 = new library.CD("", "hi!", "", "", true, date5, date6, (library.User) userType7, "hi!", (java.lang.Double) 1.0d, "hi!", "", "hi!");
        cD19.setEdition("");
        cD19.setPurchasable("");
        library.Admin admin27 = new library.Admin("false", "false", "false");
        cD19.setOwner((library.User) admin27);
        java.lang.String str29 = cD19.getPublisher();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "hi!" + "'", str29.equals("hi!"));
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        library.Student student3 = new library.Student("", "", "User: userType=null, email=null, password=null]");
        library.Book book4 = new library.Book();
        boolean boolean5 = book4.getIfLost();
        java.lang.String str6 = book4.getOnDiscount();
        boolean boolean7 = book4.isPurchasable();
        book4.setPurchasable("User: userType=null, email=null, password=null]");
        java.lang.String str10 = book4.getTitle();
        java.lang.String str11 = book4.getRentable();
        book4.setLocation("false");
        student3.addBookItem(book4);
        book4.setItemType("");
        boolean boolean17 = book4.isOnDiscount();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "false" + "'", str6.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "false" + "'", str11.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        library.Nonfaculty nonfaculty0 = new library.Nonfaculty();
        java.lang.String str1 = nonfaculty0.getPassword();
        java.lang.String str2 = nonfaculty0.getuserType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        java.util.Date date5 = null;
        java.util.Date date6 = null;
        library.UserType userType7 = new library.UserType();
        library.Request request13 = new library.Request((library.User) userType7, "", "", "hi!", "", false);
        library.CD cD19 = new library.CD("", "hi!", "", "", true, date5, date6, (library.User) userType7, "hi!", (java.lang.Double) 1.0d, "hi!", "", "hi!");
        cD19.setItemType("User: userType=null, email=null, password=null]");
        java.lang.Double double22 = cD19.getCost();
        library.User user23 = cD19.getOwner();
        cD19.setTitle("");
        library.User user26 = cD19.getOwner();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.0d + "'", double22.equals(1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user26);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        library.UserType userType0 = new library.UserType();
        library.Request request6 = new library.Request((library.User) userType0, "", "", "hi!", "", false);
        library.User user7 = request6.getUser();
        java.lang.String str8 = request6.getPriority();
        request6.setCompletion(true);
        java.lang.String str11 = request6.getName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        library.Course course0 = new library.Course();
        java.util.Date date1 = course0.endDate;
        java.lang.String str2 = course0.getCourseCode();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        library.MaintainRequestsProxy maintainRequestsProxy0 = new library.MaintainRequestsProxy();
        library.MaintainRequestsProxy maintainRequestsProxy1 = new library.MaintainRequestsProxy();
        library.UserType userType2 = new library.UserType();
        library.Request request8 = new library.Request((library.User) userType2, "", "", "hi!", "", false);
        library.User user9 = request8.getUser();
        java.lang.String str10 = request8.getItemType();
        java.lang.String str11 = maintainRequestsProxy1.notifyPriority(request8);
        maintainRequestsProxy0.confirmReq(request8);
        maintainRequestsProxy0.load("User: userType=true, email=false, password=User: userType=null, email=null, password=null]]");
        java.util.List<library.Request> requestList15 = maintainRequestsProxy0.getRequests();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(requestList15);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        java.util.Date date5 = null;
        java.util.Date date6 = null;
        library.User user7 = null;
        library.Magazine magazine13 = new library.Magazine("", "hi!", "", "", true, date5, date6, user7, "", (java.lang.Double) (-1.0d), "", "hi!", "");
        java.lang.Double double14 = magazine13.getCost();
        boolean boolean15 = magazine13.isPurchasable();
        java.lang.String str16 = magazine13.getOnDiscount();
        java.lang.String str17 = magazine13.getRentable();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "false" + "'", str16.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "true" + "'", str17.equals("true"));
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        library.MaintainUserProxy maintainUserProxy0 = new library.MaintainUserProxy();
        java.util.List<library.User> userList1 = maintainUserProxy0.getUsers();
        java.util.Date date7 = null;
        java.util.Date date8 = null;
        library.UserType userType9 = new library.UserType();
        library.Request request15 = new library.Request((library.User) userType9, "", "", "hi!", "", false);
        library.CD cD21 = new library.CD("", "hi!", "", "", true, date7, date8, (library.User) userType9, "hi!", (java.lang.Double) 1.0d, "hi!", "", "hi!");
        cD21.setEdition("");
        cD21.setPurchasable("");
        library.Admin admin29 = new library.Admin("false", "false", "false");
        cD21.setOwner((library.User) admin29);
        maintainUserProxy0.addUser((library.User) admin29);
        library.AdminAccount adminAccount32 = new library.AdminAccount();
        java.lang.String str33 = adminAccount32.path;
        library.Book book34 = new library.Book();
        boolean boolean35 = book34.getIfLost();
        java.lang.String str36 = book34.getOnDiscount();
        java.lang.String str37 = book34.getPublisher();
        java.lang.String str38 = book34.getLocation();
        adminAccount32.add_createItem((library.Item) book34);
        admin29.enableItem((library.Item) book34);
        boolean boolean41 = book34.isPurchasable();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "false" + "'", str36.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        java.util.Date date5 = null;
        java.util.Date date6 = null;
        library.UserType userType7 = new library.UserType();
        library.Request request13 = new library.Request((library.User) userType7, "", "", "hi!", "", false);
        library.CD cD19 = new library.CD("", "hi!", "", "", true, date5, date6, (library.User) userType7, "hi!", (java.lang.Double) 1.0d, "hi!", "", "hi!");
        cD19.setEdition("");
        cD19.setPurchasable("");
        cD19.setOnDiscount("hi!");
        cD19.setPurchasable("true");
        java.lang.String str28 = cD19.getPublisher();
        cD19.setItemType("User: userType=null, email=true, password=null]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "hi!" + "'", str28.equals("hi!"));
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        library.Nonfaculty nonfaculty0 = new library.Nonfaculty();
        nonfaculty0.setEmail("User: userType=null, email=null, password=null]");
        java.lang.String str3 = nonfaculty0.getuserType();
        java.lang.String str4 = nonfaculty0.getEmail();
        nonfaculty0.setUserType("User: userType=true, email=User: userType=, email=User: userType=null, email=null, password=null], password=false], password=null]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "User: userType=null, email=null, password=null]" + "'", str4.equals("User: userType=null, email=null, password=null]"));
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        library.Course course0 = new library.Course();
        java.util.ArrayList<library.User> userList1 = course0.getStudents();
        java.util.Date date7 = null;
        java.util.Date date8 = null;
        library.UserType userType9 = new library.UserType();
        library.Request request15 = new library.Request((library.User) userType9, "", "", "hi!", "", false);
        library.CD cD21 = new library.CD("", "hi!", "", "", true, date7, date8, (library.User) userType9, "hi!", (java.lang.Double) 1.0d, "hi!", "", "hi!");
        boolean boolean22 = cD21.getIfLost();
        course0.setTextbooks((library.Item) cD21);
        java.util.Date date29 = null;
        java.util.Date date30 = null;
        library.Admin admin34 = new library.Admin("false", "false", "false");
        java.lang.String str35 = admin34.getPassword();
        library.CD cD41 = new library.CD("", "true", "false", "true", false, date29, date30, (library.User) admin34, "hi!", (java.lang.Double) 0.0d, "true", "hi!", "");
        course0.setFaculty((library.User) admin34);
        admin34.setPassword("false");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(userList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "false" + "'", str35.equals("false"));
    }


  
    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        library.User user2 = null;
        library.Subscription subscription4 = new library.Subscription("false", "User: userType=false, email=true, password=]", user2, false);
        java.lang.String str5 = subscription4.getSite();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "false" + "'", str5.equals("false"));
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        library.User user2 = null;
        library.Subscription subscription4 = new library.Subscription("false", "User: userType=false, email=true, password=]", user2, false);
        java.lang.String str5 = subscription4.getCompanyName();
        java.lang.String str6 = subscription4.getSite();
        java.lang.String str7 = subscription4.isStatus();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "User: userType=false, email=true, password=]" + "'", str5.equals("User: userType=false, email=true, password=]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "false" + "'", str6.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "false" + "'", str7.equals("false"));
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        java.util.Date date5 = null;
        java.util.Date date6 = null;
        library.User user7 = null;
        library.Magazine magazine13 = new library.Magazine("", "hi!", "", "", true, date5, date6, user7, "", (java.lang.Double) (-1.0d), "", "hi!", "");
        java.lang.Double double14 = magazine13.getCost();
        boolean boolean15 = magazine13.isPurchasable();
        java.lang.Double double16 = magazine13.getCost();
        boolean boolean17 = magazine13.isRentable();
        library.Student student21 = new library.Student("false", "true", "");
        magazine13.setOwner((library.User) student21);
        library.Book book23 = new library.Book();
        boolean boolean24 = book23.getIfLost();
        java.lang.String str25 = book23.getOnDiscount();
        student21.addBookItem(book23);
        java.lang.Double double27 = book23.getCost();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "false" + "'", str25.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(double27);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        library.Subscription subscription0 = new library.Subscription();
        java.lang.String str1 = subscription0.getSite();
        library.Visitor visitor2 = new library.Visitor();
        java.lang.String str3 = visitor2.getuserType();
        java.lang.String str4 = visitor2.getPassword();
        subscription0.setU((library.User) visitor2);
        java.lang.String str6 = visitor2.getuserType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        java.util.Date date5 = null;
        java.util.Date date6 = null;
        library.UserType userType7 = new library.UserType();
        library.Request request13 = new library.Request((library.User) userType7, "", "", "hi!", "", false);
        library.CD cD19 = new library.CD("", "hi!", "", "", true, date5, date6, (library.User) userType7, "hi!", (java.lang.Double) 1.0d, "hi!", "", "hi!");
        cD19.setEdition("");
        cD19.setPurchasable("");
        java.util.Date date24 = null;
        cD19.considerIfLost(date24);
        java.util.Date date26 = cD19.getLostDate();
        boolean boolean27 = cD19.isRentable();
        java.lang.Double double28 = cD19.getCost();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 1.0d + "'", double28.equals(1.0d));
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        library.Visitor visitor0 = new library.Visitor();
        java.lang.String str1 = visitor0.getuserType();
        library.Request request7 = new library.Request((library.User) visitor0, "User: userType=null, email=null, password=null]", "false", "User: userType=, email=User: userType=null, email=null, password=null], password=false]", "true", true);
        library.User user8 = request7.getUser();
        boolean boolean9 = request7.isCompletion();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        java.util.Date date5 = null;
        java.util.Date date6 = null;
        library.UserType userType7 = new library.UserType();
        library.Request request13 = new library.Request((library.User) userType7, "", "", "hi!", "", false);
        library.CD cD19 = new library.CD("", "hi!", "", "", true, date5, date6, (library.User) userType7, "hi!", (java.lang.Double) 1.0d, "hi!", "", "hi!");
        cD19.setEdition("");
        cD19.setPurchasable("");
        library.Admin admin27 = new library.Admin("false", "false", "false");
        cD19.setOwner((library.User) admin27);
        java.util.Date date29 = cD19.getLostDate();
        java.lang.Double double30 = cD19.getCost();
        java.util.Date date31 = null;
        cD19.setLostDate(date31);
        cD19.setCost((java.lang.Double) (-1.0d));
        java.util.Date date35 = null;
        cD19.setDueDate(date35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 1.0d + "'", double30.equals(1.0d));
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        library.MaintainCourses maintainCourses0 = new library.MaintainCourses();
        library.Course course1 = null;
        library.Course course2 = maintainCourses0.getCourse(course1);
        library.Course course3 = new library.Course();
        java.util.ArrayList<library.User> userList4 = course3.getStudents();
        java.util.Date date10 = null;
        java.util.Date date11 = null;
        library.UserType userType12 = new library.UserType();
        library.Request request18 = new library.Request((library.User) userType12, "", "", "hi!", "", false);
        library.CD cD24 = new library.CD("", "hi!", "", "", true, date10, date11, (library.User) userType12, "hi!", (java.lang.Double) 1.0d, "hi!", "", "hi!");
        boolean boolean25 = cD24.getIfLost();
        course3.setTextbooks((library.Item) cD24);
        java.util.Date date27 = course3.getEndDate();
        java.util.Date date33 = null;
        java.util.Date date34 = null;
        library.UserType userType35 = new library.UserType();
        library.Request request41 = new library.Request((library.User) userType35, "", "", "hi!", "", false);
        library.CD cD47 = new library.CD("", "hi!", "", "", true, date33, date34, (library.User) userType35, "hi!", (java.lang.Double) 1.0d, "hi!", "", "hi!");
        cD47.setEdition("");
        cD47.setPurchasable("");
        library.Admin admin55 = new library.Admin("false", "false", "false");
        cD47.setOwner((library.User) admin55);
        course3.professorFaculty = admin55;
        library.Course course58 = maintainCourses0.getCourse(course3);
        java.util.ArrayList<library.User> userList59 = course3.getStudents();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(course2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(userList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(course58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(userList59);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        library.MaintainCoursesProxy maintainCoursesProxy0 = new library.MaintainCoursesProxy();
        library.Course[] courseArray1 = new library.Course[] {};
        java.util.ArrayList<library.Course> courseList2 = new java.util.ArrayList<library.Course>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<library.Course>) courseList2, courseArray1);
        maintainCoursesProxy0.setCourses((java.util.List<library.Course>) courseList2);
        java.util.List<library.Course> courseList5 = maintainCoursesProxy0.getCourses();
        library.Course course6 = null;
        library.Course course7 = maintainCoursesProxy0.getCourse(course6);
        library.Course course8 = null;
        maintainCoursesProxy0.addCourse(course8);
        library.MaintainCoursesProxy maintainCoursesProxy10 = new library.MaintainCoursesProxy();
        java.util.List<library.Course> courseList11 = maintainCoursesProxy10.getCourses();
        library.MaintainCoursesProxy maintainCoursesProxy12 = new library.MaintainCoursesProxy();
        library.Course[] courseArray13 = new library.Course[] {};
        java.util.ArrayList<library.Course> courseList14 = new java.util.ArrayList<library.Course>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<library.Course>) courseList14, courseArray13);
        maintainCoursesProxy12.setCourses((java.util.List<library.Course>) courseList14);
        maintainCoursesProxy10.setCourses((java.util.List<library.Course>) courseList14);
        maintainCoursesProxy0.setCourses((java.util.List<library.Course>) courseList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(courseArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(courseList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(course7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(courseList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(courseArray13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        java.util.Date date5 = null;
        java.util.Date date6 = null;
        library.UserType userType7 = new library.UserType();
        library.Request request13 = new library.Request((library.User) userType7, "", "", "hi!", "", false);
        library.CD cD19 = new library.CD("", "hi!", "", "", true, date5, date6, (library.User) userType7, "hi!", (java.lang.Double) 1.0d, "hi!", "", "hi!");
        cD19.setEdition("");
        cD19.setPurchasable("");
        java.lang.String str24 = cD19.getRentable();
        boolean boolean25 = cD19.isOnDiscount();
        java.lang.String str26 = cD19.getRentable();
        java.util.Date date27 = cD19.getDueDate();
        cD19.setOnDiscount("User: userType=true, email=User: userType=, email=User: userType=null, email=null, password=null], password=false], password=null]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "true" + "'", str24.equals("true"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "true" + "'", str26.equals("true"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date27);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        library.Nonfaculty nonfaculty0 = new library.Nonfaculty();
        java.lang.String str1 = nonfaculty0.getuserType();
        library.Request request7 = new library.Request((library.User) nonfaculty0, "", "false", "hi!", "false", true);
        java.lang.String str8 = request7.getEdition();
        library.Nonfaculty nonfaculty9 = new library.Nonfaculty();
        java.lang.String str10 = nonfaculty9.getuserType();
        java.lang.String str11 = nonfaculty9.getuserType();
        request7.setUser((library.User) nonfaculty9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "false" + "'", str8.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        java.util.Date date5 = null;
        java.util.Date date6 = null;
        library.User user7 = null;
        library.Magazine magazine13 = new library.Magazine("", "hi!", "", "", true, date5, date6, user7, "", (java.lang.Double) (-1.0d), "", "hi!", "");
        java.lang.Double double14 = magazine13.getCost();
        boolean boolean15 = magazine13.isPurchasable();
        boolean boolean16 = magazine13.isPurchasable();
        boolean boolean17 = magazine13.isPurchasable();
        java.util.Date date18 = null;
        // The following exception was thrown during execution in test generation
        try {
            magazine13.setBorrowedDate(date18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        library.Search search1 = new library.Search();
        library.ItemDatabase itemDatabase3 = library.MaintainItems.getInstance();
        java.util.List<library.Item> itemList4 = search1.strategyInput("hi!", itemDatabase3);
        library.Context context5 = new library.Context((library.Menu) search1);
        library.Context context6 = new library.Context((library.Menu) search1);
        library.Search search9 = new library.Search();
        library.ItemDatabase itemDatabase11 = library.MaintainItems.getInstance();
        java.util.List<library.Item> itemList12 = search9.strategyInput("hi!", itemDatabase11);
        java.util.List<library.Item> itemList13 = library.Facade.search("hi!", itemDatabase11);
        java.util.List<library.Item> itemList14 = context6.strategyInput("User: userType=, email=User: userType=null, email=null, password=null], password=false]", itemDatabase11);
        java.util.List<library.Item> itemList15 = library.Facade.search("", itemDatabase11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemDatabase3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemDatabase11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemList15);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        library.Facade facade0 = new library.Facade();
        boolean boolean2 = facade0.passwordValid("User: userType=null, email=null, password=null]");
        boolean boolean4 = facade0.passwordValid("User: userType=null, email=null, password=null]");
        boolean boolean6 = facade0.passwordValid("User: userType=false, email=false, password=false]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        library.Search search1 = new library.Search();
        library.ItemDatabase itemDatabase3 = library.MaintainItems.getInstance();
        java.util.List<library.Item> itemList4 = search1.strategyInput("hi!", itemDatabase3);
        library.Context context5 = new library.Context((library.Menu) search1);
        library.Context context6 = new library.Context((library.Menu) search1);
        library.Search search9 = new library.Search();
        library.ItemDatabase itemDatabase11 = library.MaintainItems.getInstance();
        java.util.List<library.Item> itemList12 = search9.strategyInput("hi!", itemDatabase11);
        library.Context context13 = new library.Context((library.Menu) search9);
        library.Context context14 = new library.Context((library.Menu) search9);
        library.Search search17 = new library.Search();
        library.ItemDatabase itemDatabase19 = library.MaintainItems.getInstance();
        java.util.List<library.Item> itemList20 = search17.strategyInput("hi!", itemDatabase19);
        java.util.List<library.Item> itemList21 = library.Facade.search("hi!", itemDatabase19);
        java.util.List<library.Item> itemList22 = context14.strategyInput("User: userType=, email=User: userType=null, email=null, password=null], password=false]", itemDatabase19);
        java.util.List<library.Item> itemList23 = library.Facade.discountOffers("", itemDatabase19);
        java.util.List<library.Item> itemList24 = context6.strategyInput("User: userType=false, email=true, password=]", itemDatabase19);
        java.util.List<library.Item> itemList25 = library.Facade.discountOffers("true", itemDatabase19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemDatabase3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemDatabase11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemDatabase19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemList20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemList21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemList22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemList23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemList24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemList25);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        library.MaintainRequestsProxy maintainRequestsProxy0 = new library.MaintainRequestsProxy();
        library.UserType userType1 = new library.UserType();
        library.Request request7 = new library.Request((library.User) userType1, "", "", "hi!", "", false);
        library.User user8 = request7.getUser();
        java.lang.String str9 = request7.getItemType();
        java.lang.String str10 = maintainRequestsProxy0.notifyPriority(request7);
        library.AdminAccount adminAccount11 = new library.AdminAccount();
        java.lang.String str12 = adminAccount11.path;
        library.UserType userType13 = new library.UserType();
        library.Request request19 = new library.Request((library.User) userType13, "", "", "hi!", "", false);
        library.User user20 = request19.getUser();
        java.util.Date date26 = null;
        java.util.Date date27 = null;
        library.UserType userType28 = new library.UserType();
        library.Request request34 = new library.Request((library.User) userType28, "", "", "hi!", "", false);
        library.CD cD40 = new library.CD("", "hi!", "", "", true, date26, date27, (library.User) userType28, "hi!", (java.lang.Double) 1.0d, "hi!", "", "hi!");
        java.lang.String str41 = userType28.toString();
        request19.setUser((library.User) userType28);
        maintainRequestsProxy0.sendRequestDeny(adminAccount11, request19);
        library.MaintainRequestsProxy maintainRequestsProxy44 = new library.MaintainRequestsProxy();
        library.UserType userType45 = new library.UserType();
        library.Request request51 = new library.Request((library.User) userType45, "", "", "hi!", "", false);
        library.User user52 = request51.getUser();
        java.lang.String str53 = request51.getItemType();
        java.lang.String str54 = maintainRequestsProxy44.notifyPriority(request51);
        library.AdminAccount adminAccount55 = new library.AdminAccount();
        java.lang.String str56 = adminAccount55.path;
        library.UserType userType57 = new library.UserType();
        library.Request request63 = new library.Request((library.User) userType57, "", "", "hi!", "", false);
        library.User user64 = request63.getUser();
        java.util.Date date70 = null;
        java.util.Date date71 = null;
        library.UserType userType72 = new library.UserType();
        library.Request request78 = new library.Request((library.User) userType72, "", "", "hi!", "", false);
        library.CD cD84 = new library.CD("", "hi!", "", "", true, date70, date71, (library.User) userType72, "hi!", (java.lang.Double) 1.0d, "hi!", "", "hi!");
        java.lang.String str85 = userType72.toString();
        request63.setUser((library.User) userType72);
        maintainRequestsProxy44.sendRequestDeny(adminAccount55, request63);
        java.util.List<library.Request> requestList88 = maintainRequestsProxy44.getReqSI();
        maintainRequestsProxy0.setReqSI(requestList88);
        java.util.List<library.Request> requestList90 = maintainRequestsProxy0.getReqCT();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "User: userType=null, email=null, password=null]" + "'", str41.equals("User: userType=null, email=null, password=null]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str53 + "' != '" + "hi!" + "'", str53.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str54 + "' != '" + "" + "'", str54.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str85 + "' != '" + "User: userType=null, email=null, password=null]" + "'", str85.equals("User: userType=null, email=null, password=null]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(requestList88);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertNull(requestList90);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
        java.util.Date date5 = null;
        java.util.Date date6 = null;
        library.UserType userType7 = new library.UserType();
        library.Request request13 = new library.Request((library.User) userType7, "", "", "hi!", "", false);
        library.CD cD19 = new library.CD("", "hi!", "", "", true, date5, date6, (library.User) userType7, "hi!", (java.lang.Double) 1.0d, "hi!", "", "hi!");
        cD19.setEdition("");
        cD19.setPurchasable("");
        library.Admin admin27 = new library.Admin("false", "false", "false");
        cD19.setOwner((library.User) admin27);
        java.util.Date date29 = cD19.getLostDate();
        java.lang.Double double30 = cD19.getCost();
        java.util.Date date31 = null;
        cD19.setLostDate(date31);
        cD19.setCost((java.lang.Double) (-1.0d));
        java.lang.Class<?> wildcardClass35 = cD19.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 1.0d + "'", double30.equals(1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        library.MaintainNewsletterProxy maintainNewsletterProxy0 = new library.MaintainNewsletterProxy();
        library.NewsletterSystem newsletterSystem3 = new library.NewsletterSystem("true", "User: userType=null, email=null, password=null]");
        library.NewsletterSystem[] newsletterSystemArray4 = new library.NewsletterSystem[] { newsletterSystem3 };
        java.util.ArrayList<library.NewsletterSystem> newsletterSystemList5 = new java.util.ArrayList<library.NewsletterSystem>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<library.NewsletterSystem>) newsletterSystemList5, newsletterSystemArray4);
        maintainNewsletterProxy0.setNews((java.util.List<library.NewsletterSystem>) newsletterSystemList5);
        java.util.List<library.NewsletterSystem> newsletterSystemList8 = maintainNewsletterProxy0.getNews();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(newsletterSystemArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(newsletterSystemList8);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
        library.Faculty faculty3 = new library.Faculty("", "false", "false");
        faculty3.setEmail("User: userType=null, email=null, password=null]");
        java.lang.String str6 = faculty3.getuserType();
        faculty3.setPassword("true");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        library.Book book0 = new library.Book();
        boolean boolean1 = book0.getIfLost();
        java.lang.String str2 = book0.getOnDiscount();
        boolean boolean3 = book0.isPurchasable();
        book0.setPurchasable("User: userType=null, email=null, password=null]");
        book0.setPublisher("User: userType=null, email=null, password=null]");
        boolean boolean8 = book0.isPurchasable();
        java.lang.Double double9 = book0.getCost();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "false" + "'", str2.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(double9);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        library.Admin admin3 = new library.Admin("", "User: userType=false, email=true, password=]", "User: userType=null, email=null, password=null]");
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
        java.util.Date date5 = null;
        java.util.Date date6 = null;
        library.User user7 = null;
        library.Magazine magazine13 = new library.Magazine("", "hi!", "", "", true, date5, date6, user7, "", (java.lang.Double) (-1.0d), "", "hi!", "");
        magazine13.setOnDiscount("");
        java.lang.String str16 = magazine13.getOnDiscount();
        java.lang.String str17 = magazine13.getID();
        java.util.Date date18 = magazine13.getLostDate();
        java.util.Date date19 = null;
        magazine13.setDueDate(date19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "false" + "'", str16.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date18);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
        library.MaintainRequestsProxy maintainRequestsProxy0 = new library.MaintainRequestsProxy();
        library.MaintainRequestsProxy maintainRequestsProxy1 = new library.MaintainRequestsProxy();
        library.UserType userType2 = new library.UserType();
        library.Request request8 = new library.Request((library.User) userType2, "", "", "hi!", "", false);
        library.User user9 = request8.getUser();
        java.lang.String str10 = request8.getItemType();
        java.lang.String str11 = maintainRequestsProxy1.notifyPriority(request8);
        maintainRequestsProxy0.removeReq(request8);
        java.util.List<library.Request> requestList13 = null;
        maintainRequestsProxy0.setReqCT(requestList13);
        library.AdminAccount adminAccount15 = new library.AdminAccount();
        java.lang.String str16 = adminAccount15.path;
        library.Book book17 = new library.Book();
        boolean boolean18 = book17.getIfLost();
        java.lang.String str19 = book17.getOnDiscount();
        java.lang.String str20 = book17.getPublisher();
        java.lang.String str21 = book17.getLocation();
        adminAccount15.add_createItem((library.Item) book17);
        library.MaintainRequestsProxy maintainRequestsProxy23 = new library.MaintainRequestsProxy();
        library.UserType userType24 = new library.UserType();
        library.Request request30 = new library.Request((library.User) userType24, "", "", "hi!", "", false);
        library.User user31 = request30.getUser();
        java.lang.String str32 = request30.getItemType();
        java.lang.String str33 = maintainRequestsProxy23.notifyPriority(request30);
        library.AdminAccount adminAccount34 = new library.AdminAccount();
        java.lang.String str35 = adminAccount34.path;
        library.UserType userType36 = new library.UserType();
        library.Request request42 = new library.Request((library.User) userType36, "", "", "hi!", "", false);
        library.User user43 = request42.getUser();
        java.util.Date date49 = null;
        java.util.Date date50 = null;
        library.UserType userType51 = new library.UserType();
        library.Request request57 = new library.Request((library.User) userType51, "", "", "hi!", "", false);
        library.CD cD63 = new library.CD("", "hi!", "", "", true, date49, date50, (library.User) userType51, "hi!", (java.lang.Double) 1.0d, "hi!", "", "hi!");
        java.lang.String str64 = userType51.toString();
        request42.setUser((library.User) userType51);
        maintainRequestsProxy23.sendRequestDeny(adminAccount34, request42);
        maintainRequestsProxy0.sendRequestDeny(adminAccount15, request42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "false" + "'", str19.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "hi!" + "'", str32.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "" + "'", str33.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str64 + "' != '" + "User: userType=null, email=null, password=null]" + "'", str64.equals("User: userType=null, email=null, password=null]"));
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
        library.UserType userType0 = new library.UserType();
        library.Request request6 = new library.Request((library.User) userType0, "", "", "hi!", "", false);
        library.User user7 = request6.getUser();
        java.util.Date date13 = null;
        java.util.Date date14 = null;
        library.UserType userType15 = new library.UserType();
        library.Request request21 = new library.Request((library.User) userType15, "", "", "hi!", "", false);
        library.CD cD27 = new library.CD("", "hi!", "", "", true, date13, date14, (library.User) userType15, "hi!", (java.lang.Double) 1.0d, "hi!", "", "hi!");
        java.lang.String str28 = userType15.toString();
        request6.setUser((library.User) userType15);
        request6.setItemType("User: userType=false, email=false, password=false]");
        request6.setEdition("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "User: userType=null, email=null, password=null]" + "'", str28.equals("User: userType=null, email=null, password=null]"));
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
        java.util.Date date5 = null;
        java.util.Date date6 = null;
        library.UserType userType7 = new library.UserType();
        library.Request request13 = new library.Request((library.User) userType7, "", "", "hi!", "", false);
        library.CD cD19 = new library.CD("", "hi!", "", "", true, date5, date6, (library.User) userType7, "hi!", (java.lang.Double) 1.0d, "hi!", "", "hi!");
        cD19.setPublisher("");
        java.lang.String str22 = cD19.getPublisher();
        java.lang.String str23 = cD19.getLocation();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "" + "'", str23.equals(""));
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
        java.util.Date date5 = null;
        java.util.Date date6 = null;
        library.User user7 = null;
        library.Magazine magazine13 = new library.Magazine("", "hi!", "", "", true, date5, date6, user7, "", (java.lang.Double) (-1.0d), "", "hi!", "");
        java.lang.Double double14 = magazine13.getCost();
        boolean boolean15 = magazine13.isPurchasable();
        java.lang.Double double16 = magazine13.getCost();
        magazine13.setEdition("User: userType=null, email=null, password=null]");
        boolean boolean19 = magazine13.getIfLost();
        magazine13.setLocation("User: userType=false, email=false, password=false]");
        java.lang.String str22 = magazine13.getTitle();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!" + "'", str22.equals("hi!"));
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
        library.Search search2 = new library.Search();
        library.ItemDatabase itemDatabase4 = library.MaintainItems.getInstance();
        java.util.List<library.Item> itemList5 = search2.strategyInput("hi!", itemDatabase4);
        java.util.List<library.Item> itemList6 = library.Facade.search("hi!", itemDatabase4);
        java.util.List<library.Item> itemList7 = library.Facade.search("false", itemDatabase4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemDatabase4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemList7);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
        java.util.Date date5 = null;
        java.util.Date date6 = null;
        library.User user7 = null;
        library.Magazine magazine13 = new library.Magazine("", "hi!", "", "", true, date5, date6, user7, "", (java.lang.Double) (-1.0d), "", "hi!", "");
        java.lang.Double double14 = magazine13.getCost();
        boolean boolean15 = magazine13.isPurchasable();
        java.lang.Double double16 = magazine13.getCost();
        java.lang.String str17 = magazine13.getID();
        java.util.Date date18 = magazine13.getLostDate();
        java.util.Date date19 = magazine13.getBorrowedDate();
        java.lang.String str20 = magazine13.getPurchasable();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "false" + "'", str20.equals("false"));
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
        library.Visitor visitor3 = new library.Visitor("User: userType=false, email=false, password=false]", "false", "User: userType=true, email=false, password=User: userType=null, email=null, password=null]]");
        java.lang.String str4 = visitor3.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "false" + "'", str4.equals("false"));
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
        library.Student student3 = new library.Student("User: userType=null, email=null, password=null]", "false", "true");
        java.util.ArrayList<library.Course> courseList4 = student3.getCourses();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(courseList4);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
        java.util.Date date5 = null;
        java.util.Date date6 = null;
        library.UserType userType7 = new library.UserType();
        library.Request request13 = new library.Request((library.User) userType7, "", "", "hi!", "", false);
        library.CD cD19 = new library.CD("", "hi!", "", "", true, date5, date6, (library.User) userType7, "hi!", (java.lang.Double) 1.0d, "hi!", "", "hi!");
        cD19.setItemType("false");
        cD19.setRentable("hi!");
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
        library.MaintainNewsletterProxy maintainNewsletterProxy0 = new library.MaintainNewsletterProxy();
        library.NewsletterSystem newsletterSystem2 = maintainNewsletterProxy0.getItemByName("true");
        library.NewsletterSystem newsletterSystem5 = new library.NewsletterSystem("hi!", "User: userType=null, email=null, password=null]");
        maintainNewsletterProxy0.addNews(newsletterSystem5);
        newsletterSystem5.setCompany("true");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(newsletterSystem2);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
        library.MaintainNewsletterProxy maintainNewsletterProxy0 = new library.MaintainNewsletterProxy();
        library.NewsletterSystem newsletterSystem2 = maintainNewsletterProxy0.getItemByName("true");
        library.NewsletterSystem newsletterSystem5 = new library.NewsletterSystem("hi!", "User: userType=null, email=null, password=null]");
        maintainNewsletterProxy0.addNews(newsletterSystem5);
        java.util.List<library.NewsletterSystem> newsletterSystemList7 = maintainNewsletterProxy0.getNews();
        library.NewsletterSystem newsletterSystem10 = new library.NewsletterSystem("", "true");
        library.NewsletterSystem newsletterSystem13 = new library.NewsletterSystem("User: userType=, email=User: userType=null, email=null, password=null], password=false]", "");
        library.NewsletterSystem newsletterSystem16 = new library.NewsletterSystem("true", "User: userType=null, email=null, password=null]");
        newsletterSystem16.setWebsite("");
        java.lang.String str19 = newsletterSystem16.getCompany();
        library.NewsletterSystem[] newsletterSystemArray20 = new library.NewsletterSystem[] { newsletterSystem10, newsletterSystem13, newsletterSystem16 };
        java.util.ArrayList<library.NewsletterSystem> newsletterSystemList21 = new java.util.ArrayList<library.NewsletterSystem>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<library.NewsletterSystem>) newsletterSystemList21, newsletterSystemArray20);
        maintainNewsletterProxy0.setNews((java.util.List<library.NewsletterSystem>) newsletterSystemList21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(newsletterSystem2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(newsletterSystemList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "true" + "'", str19.equals("true"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(newsletterSystemArray20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test322");
        java.util.Date date5 = null;
        java.util.Date date6 = null;
        library.UserType userType7 = new library.UserType();
        library.Request request13 = new library.Request((library.User) userType7, "", "", "hi!", "", false);
        library.CD cD19 = new library.CD("", "hi!", "", "", true, date5, date6, (library.User) userType7, "hi!", (java.lang.Double) 1.0d, "hi!", "", "hi!");
        cD19.setEdition("");
        cD19.setPurchasable("");
        library.Admin admin27 = new library.Admin("false", "false", "false");
        cD19.setOwner((library.User) admin27);
        java.util.Date date29 = cD19.getLostDate();
        java.lang.Double double30 = cD19.getCost();
        java.util.Date date31 = null;
        cD19.setLostDate(date31);
        library.User user33 = cD19.getOwner();
        java.lang.String str34 = cD19.getTitle();
        cD19.setPurchasable("User: userType=null, email=null, password=null]");
        cD19.setRentable("User: userType=null, email=true, password=null]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 1.0d + "'", double30.equals(1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "hi!" + "'", str34.equals("hi!"));
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
        library.Admin admin5 = new library.Admin("hi!", "false", "false");
        java.lang.String str6 = admin5.getPassword();
        java.util.ArrayList<library.Request> requestList7 = null;
        admin5.setRequestList(requestList7);
        library.Subscription subscription10 = new library.Subscription("hi!", "hi!", (library.User) admin5, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "false" + "'", str6.equals("false"));
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test324");
        java.util.Date date5 = null;
        java.util.Date date6 = null;
        library.Visitor visitor7 = new library.Visitor();
        library.Book book13 = new library.Book("hi!", "", "", "true", false, date5, date6, (library.User) visitor7, "User: userType=null, email=null, password=null]", (java.lang.Double) 0.0d, "true", "", "User: userType=null, email=null, password=null]");
        java.lang.String str14 = book13.getTitle();
        java.lang.String str15 = book13.getOnDiscount();
        book13.setTitle("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "false" + "'", str15.equals("false"));
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test325");
        library.Book book0 = new library.Book();
        java.lang.String str1 = book0.getItemType();
        book0.setID("false");
        book0.setPublisher("User: userType=true, email=User: userType=, email=User: userType=null, email=null, password=null], password=false], password=null]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test326");
        library.MaintainSubscriptionsProxy maintainSubscriptionsProxy0 = new library.MaintainSubscriptionsProxy();
        library.MaintainSubscriptionsProxy maintainSubscriptionsProxy1 = new library.MaintainSubscriptionsProxy();
        library.Subscription subscription2 = new library.Subscription();
        java.lang.String str3 = subscription2.getSite();
        subscription2.setSite("");
        java.util.Date date13 = null;
        java.util.Date date14 = null;
        library.UserType userType15 = new library.UserType();
        library.Request request21 = new library.Request((library.User) userType15, "", "", "hi!", "", false);
        library.Book book27 = new library.Book("false", "true", "true", "User: userType=null, email=null, password=null]", true, date13, date14, (library.User) userType15, "true", (java.lang.Double) 0.0d, "User: userType=null, email=null, password=null]", "true", "false");
        library.Subscription subscription29 = new library.Subscription("false", "false", (library.User) userType15, true);
        java.lang.String str30 = subscription29.isStatus();
        library.Subscription subscription31 = new library.Subscription();
        java.lang.String str32 = subscription31.getSite();
        subscription31.setSite("");
        library.Subscription subscription35 = new library.Subscription();
        java.lang.String str36 = subscription35.getSite();
        subscription35.setSite("");
        library.Subscription[] subscriptionArray39 = new library.Subscription[] { subscription2, subscription29, subscription31, subscription35 };
        java.util.ArrayList<library.Subscription> subscriptionList40 = new java.util.ArrayList<library.Subscription>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<library.Subscription>) subscriptionList40, subscriptionArray39);
        maintainSubscriptionsProxy1.setSubs((java.util.List<library.Subscription>) subscriptionList40);
        maintainSubscriptionsProxy0.setSubs((java.util.List<library.Subscription>) subscriptionList40);
        java.util.List<library.Subscription> subscriptionList44 = maintainSubscriptionsProxy0.getSubs();
        java.util.List<library.Subscription> subscriptionList45 = maintainSubscriptionsProxy0.getSubs();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "true" + "'", str30.equals("true"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(subscriptionArray39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(subscriptionList44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(subscriptionList45);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test327");
        library.MaintainCoursesProxy maintainCoursesProxy0 = new library.MaintainCoursesProxy();
        java.util.List<library.Course> courseList1 = maintainCoursesProxy0.getCourses();
        library.MaintainCoursesProxy maintainCoursesProxy2 = new library.MaintainCoursesProxy();
        library.Course[] courseArray3 = new library.Course[] {};
        java.util.ArrayList<library.Course> courseList4 = new java.util.ArrayList<library.Course>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<library.Course>) courseList4, courseArray3);
        maintainCoursesProxy2.setCourses((java.util.List<library.Course>) courseList4);
        maintainCoursesProxy0.setCourses((java.util.List<library.Course>) courseList4);
        library.Course course8 = new library.Course();
        java.util.Date date9 = course8.endDate;
        library.Course course10 = maintainCoursesProxy0.getCourse(course8);
        course8.courseCode = "true";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(courseList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(courseArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(course10);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test328");
        library.NewsletterSystem newsletterSystem0 = new library.NewsletterSystem();
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test329");
        library.MaintainRequestsProxy maintainRequestsProxy0 = new library.MaintainRequestsProxy();
        library.UserType userType1 = new library.UserType();
        library.Request request7 = new library.Request((library.User) userType1, "", "", "hi!", "", false);
        library.User user8 = request7.getUser();
        java.lang.String str9 = request7.getItemType();
        java.lang.String str10 = maintainRequestsProxy0.notifyPriority(request7);
        library.AdminAccount adminAccount11 = new library.AdminAccount();
        java.lang.String str12 = adminAccount11.path;
        library.UserType userType13 = new library.UserType();
        library.Request request19 = new library.Request((library.User) userType13, "", "", "hi!", "", false);
        library.User user20 = request19.getUser();
        java.util.Date date26 = null;
        java.util.Date date27 = null;
        library.UserType userType28 = new library.UserType();
        library.Request request34 = new library.Request((library.User) userType28, "", "", "hi!", "", false);
        library.CD cD40 = new library.CD("", "hi!", "", "", true, date26, date27, (library.User) userType28, "hi!", (java.lang.Double) 1.0d, "hi!", "", "hi!");
        java.lang.String str41 = userType28.toString();
        request19.setUser((library.User) userType28);
        maintainRequestsProxy0.sendRequestDeny(adminAccount11, request19);
        java.util.List<library.Request> requestList44 = null;
        maintainRequestsProxy0.setReqCT(requestList44);
        library.UserType userType46 = new library.UserType();
        library.Request request52 = new library.Request((library.User) userType46, "", "", "hi!", "", false);
        library.User user53 = request52.getUser();
        java.util.Date date59 = null;
        java.util.Date date60 = null;
        library.UserType userType61 = new library.UserType();
        library.Request request67 = new library.Request((library.User) userType61, "", "", "hi!", "", false);
        library.CD cD73 = new library.CD("", "hi!", "", "", true, date59, date60, (library.User) userType61, "hi!", (java.lang.Double) 1.0d, "hi!", "", "hi!");
        java.lang.String str74 = userType61.toString();
        request52.setUser((library.User) userType61);
        request52.setName("false");
        request52.setCompletion(true);
        maintainRequestsProxy0.removeReq(request52);
        java.lang.Class<?> wildcardClass81 = request52.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "User: userType=null, email=null, password=null]" + "'", str41.equals("User: userType=null, email=null, password=null]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str74 + "' != '" + "User: userType=null, email=null, password=null]" + "'", str74.equals("User: userType=null, email=null, password=null]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass81);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test330");
        library.MaintainCourses maintainCourses0 = new library.MaintainCourses();
        java.util.List<library.Course> courseList1 = maintainCourses0.getCourses();
        library.Course course2 = new library.Course();
        library.Course course3 = maintainCourses0.getCourse(course2);
        library.MaintainCoursesProxy maintainCoursesProxy4 = new library.MaintainCoursesProxy();
        java.util.List<library.Course> courseList5 = maintainCoursesProxy4.getCourses();
        library.Course course6 = null;
        maintainCoursesProxy4.addCourse(course6);
        library.Course course8 = new library.Course();
        java.util.ArrayList<library.User> userList9 = course8.getStudents();
        java.util.Date date15 = null;
        java.util.Date date16 = null;
        library.UserType userType17 = new library.UserType();
        library.Request request23 = new library.Request((library.User) userType17, "", "", "hi!", "", false);
        library.CD cD29 = new library.CD("", "hi!", "", "", true, date15, date16, (library.User) userType17, "hi!", (java.lang.Double) 1.0d, "hi!", "", "hi!");
        boolean boolean30 = cD29.getIfLost();
        course8.setTextbooks((library.Item) cD29);
        java.util.Date date32 = course8.getEndDate();
        maintainCoursesProxy4.addCourse(course8);
        library.Course course34 = maintainCourses0.getCourse(course8);
        library.Course course35 = new library.Course();
        java.util.ArrayList<library.User> userList36 = course35.getStudents();
        java.util.Date date42 = null;
        java.util.Date date43 = null;
        library.UserType userType44 = new library.UserType();
        library.Request request50 = new library.Request((library.User) userType44, "", "", "hi!", "", false);
        library.CD cD56 = new library.CD("", "hi!", "", "", true, date42, date43, (library.User) userType44, "hi!", (java.lang.Double) 1.0d, "hi!", "", "hi!");
        boolean boolean57 = cD56.getIfLost();
        course35.setTextbooks((library.Item) cD56);
        maintainCourses0.addCourse(course35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(courseList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(course3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(courseList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(userList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(course34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(userList36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test331");
        java.util.Date date5 = null;
        java.util.Date date6 = null;
        library.User user7 = null;
        library.Magazine magazine13 = new library.Magazine("", "hi!", "", "", true, date5, date6, user7, "", (java.lang.Double) (-1.0d), "", "hi!", "");
        java.lang.Double double14 = magazine13.getCost();
        boolean boolean15 = magazine13.isPurchasable();
        java.lang.Double double16 = magazine13.getCost();
        boolean boolean17 = magazine13.isRentable();
        library.Student student21 = new library.Student("false", "true", "");
        magazine13.setOwner((library.User) student21);
        java.lang.String str23 = student21.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "true" + "'", str23.equals("true"));
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test332");
        java.util.Date date5 = null;
        java.util.Date date6 = null;
        library.UserType userType7 = new library.UserType();
        library.Request request13 = new library.Request((library.User) userType7, "", "", "hi!", "", false);
        library.CD cD19 = new library.CD("", "hi!", "", "", true, date5, date6, (library.User) userType7, "hi!", (java.lang.Double) 1.0d, "hi!", "", "hi!");
        cD19.setEdition("");
        cD19.setPurchasable("");
        library.Admin admin27 = new library.Admin("false", "false", "false");
        cD19.setOwner((library.User) admin27);
        java.lang.String str29 = admin27.getPassword();
        java.util.ArrayList<library.Request> requestList30 = admin27.getRequestList();
        admin27.handleRequests();
        java.util.ArrayList<library.Request> requestList32 = admin27.getRequestList();
        java.util.Date date38 = null;
        java.util.Date date39 = null;
        library.UserType userType40 = new library.UserType();
        library.Request request46 = new library.Request((library.User) userType40, "", "", "hi!", "", false);
        library.CD cD52 = new library.CD("", "hi!", "", "", true, date38, date39, (library.User) userType40, "hi!", (java.lang.Double) 1.0d, "hi!", "", "hi!");
        cD52.setEdition("");
        cD52.setPurchasable("");
        library.Admin admin60 = new library.Admin("false", "false", "false");
        cD52.setOwner((library.User) admin60);
        java.util.List<library.Item> itemList62 = admin60.getItems();
        library.Book book63 = new library.Book();
        boolean boolean64 = book63.getIfLost();
        java.lang.String str65 = book63.getItemType();
        admin60.enableItem((library.Item) book63);
        admin27.addItem((library.Item) book63);
        book63.setCost((java.lang.Double) 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "false" + "'", str29.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(requestList30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(requestList32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemList62);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str65);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test333");
        library.Nonfaculty nonfaculty0 = new library.Nonfaculty();
        nonfaculty0.setEmail("true");
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test334");
        java.util.Date date5 = null;
        java.util.Date date6 = null;
        library.User user7 = null;
        library.Magazine magazine13 = new library.Magazine("", "hi!", "", "", true, date5, date6, user7, "", (java.lang.Double) (-1.0d), "", "hi!", "");
        java.lang.Double double14 = magazine13.getCost();
        boolean boolean15 = magazine13.isPurchasable();
        java.lang.Double double16 = magazine13.getCost();
        boolean boolean17 = magazine13.isRentable();
        library.Student student21 = new library.Student("false", "true", "");
        magazine13.setOwner((library.User) student21);
        java.lang.String str23 = student21.getuserType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "false" + "'", str23.equals("false"));
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test335");
        library.Visitor visitor3 = new library.Visitor("true", "hi!", "false");
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test336");
        java.util.Date date5 = null;
        java.util.Date date6 = null;
        library.User user7 = null;
        library.Magazine magazine13 = new library.Magazine("", "hi!", "", "", true, date5, date6, user7, "", (java.lang.Double) (-1.0d), "", "hi!", "");
        java.lang.Double double14 = magazine13.getCost();
        magazine13.setPurchasable("hi!");
        java.util.Date date17 = magazine13.getLostDate();
        magazine13.setPublisher("false");
        java.util.Date date20 = magazine13.getDueDate();
        magazine13.setOnDiscount("User: userType=null, email=null, password=null]");
        magazine13.setLocation("User: userType=null, email=true, password=null]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date20);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test337");
        java.util.Date date5 = null;
        java.util.Date date6 = null;
        library.UserType userType7 = new library.UserType();
        library.Request request13 = new library.Request((library.User) userType7, "", "", "hi!", "", false);
        library.CD cD19 = new library.CD("", "hi!", "", "", true, date5, date6, (library.User) userType7, "hi!", (java.lang.Double) 1.0d, "hi!", "", "hi!");
        cD19.setEdition("");
        cD19.setPurchasable("");
        library.Admin admin27 = new library.Admin("false", "false", "false");
        cD19.setOwner((library.User) admin27);
        java.util.Date date29 = cD19.getLostDate();
        java.lang.Double double30 = cD19.getCost();
        java.util.Date date31 = null;
        cD19.setLostDate(date31);
        library.User user33 = cD19.getOwner();
        java.util.Date date34 = null;
        cD19.considerIfLost(date34);
        boolean boolean36 = cD19.getIfLost();
        java.lang.String str37 = cD19.getOnDiscount();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 1.0d + "'", double30.equals(1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "false" + "'", str37.equals("false"));
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test338");
        library.AdminAccount adminAccount0 = new library.AdminAccount();
        java.lang.String str1 = adminAccount0.path;
        library.Book book2 = new library.Book();
        boolean boolean3 = book2.getIfLost();
        java.lang.String str4 = book2.getOnDiscount();
        java.lang.String str5 = book2.getPublisher();
        java.lang.String str6 = book2.getLocation();
        adminAccount0.add_createItem((library.Item) book2);
        java.util.List<library.Item> itemList8 = adminAccount0.return_allItems();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "false" + "'", str4.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemList8);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test339");
        library.Nonfaculty nonfaculty0 = new library.Nonfaculty();
        java.lang.String str1 = nonfaculty0.getPassword();
        java.lang.String str2 = nonfaculty0.getEmail();
        java.lang.String str3 = nonfaculty0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "User: userType=null, email=null, password=null]" + "'", str3.equals("User: userType=null, email=null, password=null]"));
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test340");
        library.AdminAccount adminAccount0 = new library.AdminAccount();
        java.lang.String str1 = adminAccount0.path;
        adminAccount0.path = "false";
        library.AdminAccount adminAccount4 = new library.AdminAccount();
        java.util.List<library.Item> itemList5 = adminAccount4.return_allItems();
        java.util.List<library.Item> itemList6 = adminAccount4.return_allItems();
        library.UserType userType7 = new library.UserType();
        library.Request request13 = new library.Request((library.User) userType7, "", "", "hi!", "", false);
        library.User user14 = request13.getUser();
        java.lang.String str15 = request13.getPriority();
        java.lang.String str16 = request13.getPriority();
        adminAccount4.request_Deny(request13);
        adminAccount0.request_Deny(request13);
        library.MaintainRequestsProxy maintainRequestsProxy19 = new library.MaintainRequestsProxy();
        library.MaintainRequestsProxy maintainRequestsProxy20 = new library.MaintainRequestsProxy();
        library.UserType userType21 = new library.UserType();
        library.Request request27 = new library.Request((library.User) userType21, "", "", "hi!", "", false);
        library.User user28 = request27.getUser();
        java.lang.String str29 = request27.getItemType();
        java.lang.String str30 = maintainRequestsProxy20.notifyPriority(request27);
        maintainRequestsProxy19.removeReq(request27);
        java.lang.String str32 = request27.getName();
        adminAccount0.request_Accept(request27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "hi!" + "'", str29.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "" + "'", str30.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "" + "'", str32.equals(""));
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test341");
        library.MaintainRequestsProxy maintainRequestsProxy0 = new library.MaintainRequestsProxy();
        library.MaintainRequestsProxy maintainRequestsProxy1 = new library.MaintainRequestsProxy();
        library.UserType userType2 = new library.UserType();
        library.Request request8 = new library.Request((library.User) userType2, "", "", "hi!", "", false);
        library.User user9 = request8.getUser();
        java.lang.String str10 = request8.getItemType();
        java.lang.String str11 = maintainRequestsProxy1.notifyPriority(request8);
        maintainRequestsProxy0.removeReq(request8);
        maintainRequestsProxy0.load("hi!");
        maintainRequestsProxy0.load("User: userType=null, email=true, password=null]");
        java.util.List<library.Request> requestList17 = maintainRequestsProxy0.getReqCT();
        maintainRequestsProxy0.load("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(requestList17);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test342");
        library.AdminAccount adminAccount0 = new library.AdminAccount();
        java.lang.String str1 = adminAccount0.path;
        library.Book book2 = new library.Book();
        boolean boolean3 = book2.getIfLost();
        java.lang.String str4 = book2.getOnDiscount();
        java.lang.String str5 = book2.getPublisher();
        java.lang.String str6 = book2.getLocation();
        adminAccount0.add_createItem((library.Item) book2);
        adminAccount0.path = "hi!";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "false" + "'", str4.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test343");
        library.Book book0 = new library.Book();
        java.util.Date date1 = null;
        book0.considerIfLost(date1);
        book0.setLocation("User: userType=true, email=false, password=User: userType=null, email=null, password=null]]");
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test344");
        library.AdminAccount adminAccount0 = new library.AdminAccount();
        java.lang.String str1 = adminAccount0.path;
        adminAccount0.path = "false";
        library.AdminAccount adminAccount4 = new library.AdminAccount();
        java.util.List<library.Item> itemList5 = adminAccount4.return_allItems();
        java.util.List<library.Item> itemList6 = adminAccount4.return_allItems();
        library.UserType userType7 = new library.UserType();
        library.Request request13 = new library.Request((library.User) userType7, "", "", "hi!", "", false);
        library.User user14 = request13.getUser();
        java.lang.String str15 = request13.getPriority();
        java.lang.String str16 = request13.getPriority();
        adminAccount4.request_Deny(request13);
        adminAccount0.request_Deny(request13);
        library.Faculty faculty22 = new library.Faculty("", "false", "false");
        faculty22.setEmail("User: userType=, email=User: userType=null, email=null, password=null], password=false]");
        library.Request request30 = new library.Request((library.User) faculty22, "false", "User: userType=null, email=null, password=null]", "hi!", "User: userType=, email=User: userType=null, email=null, password=null], password=false]", true);
        adminAccount0.request_Accept(request30);
        library.MaintainRequestsProxy maintainRequestsProxy32 = new library.MaintainRequestsProxy();
        library.UserType userType33 = new library.UserType();
        library.Request request39 = new library.Request((library.User) userType33, "", "", "hi!", "", false);
        library.User user40 = request39.getUser();
        java.lang.String str41 = request39.getItemType();
        java.lang.String str42 = maintainRequestsProxy32.notifyPriority(request39);
        library.UserType userType43 = new library.UserType();
        library.Request request49 = new library.Request((library.User) userType43, "", "", "hi!", "", false);
        library.User user50 = request49.getUser();
        java.lang.String str51 = maintainRequestsProxy32.notifyPriority(request49);
        library.MaintainRequestsProxy maintainRequestsProxy52 = new library.MaintainRequestsProxy();
        library.UserType userType53 = new library.UserType();
        library.Request request59 = new library.Request((library.User) userType53, "", "", "hi!", "", false);
        library.User user60 = request59.getUser();
        java.lang.String str61 = request59.getItemType();
        java.lang.String str62 = maintainRequestsProxy52.notifyPriority(request59);
        library.AdminAccount adminAccount63 = new library.AdminAccount();
        java.lang.String str64 = adminAccount63.path;
        library.UserType userType65 = new library.UserType();
        library.Request request71 = new library.Request((library.User) userType65, "", "", "hi!", "", false);
        library.User user72 = request71.getUser();
        java.util.Date date78 = null;
        java.util.Date date79 = null;
        library.UserType userType80 = new library.UserType();
        library.Request request86 = new library.Request((library.User) userType80, "", "", "hi!", "", false);
        library.CD cD92 = new library.CD("", "hi!", "", "", true, date78, date79, (library.User) userType80, "hi!", (java.lang.Double) 1.0d, "hi!", "", "hi!");
        java.lang.String str93 = userType80.toString();
        request71.setUser((library.User) userType80);
        maintainRequestsProxy52.sendRequestDeny(adminAccount63, request71);
        java.lang.String str96 = maintainRequestsProxy32.notifyPriority(request71);
        boolean boolean97 = request71.isCompletion();
        adminAccount0.request_Deny(request71);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "hi!" + "'", str41.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "" + "'", str42.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str51 + "' != '" + "" + "'", str51.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str61 + "' != '" + "hi!" + "'", str61.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str62 + "' != '" + "" + "'", str62.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user72);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str93 + "' != '" + "User: userType=null, email=null, password=null]" + "'", str93.equals("User: userType=null, email=null, password=null]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str96 + "' != '" + "" + "'", str96.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test345");
        library.Nonfaculty nonfaculty0 = new library.Nonfaculty();
        java.lang.String str1 = nonfaculty0.getPassword();
        java.lang.String str2 = nonfaculty0.getEmail();
        nonfaculty0.setUserType("User: userType=, email=User: userType=null, email=null, password=null], password=false]");
        nonfaculty0.setPassword("User: userType=true, email=false, password=User: userType=null, email=null, password=null]]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test346");
        library.Visitor visitor0 = new library.Visitor();
        java.lang.String str1 = visitor0.getuserType();
        java.lang.String str2 = visitor0.getPassword();
        visitor0.setUserType("true");
        visitor0.setEmail("User: userType=, email=User: userType=null, email=null, password=null], password=false]");
        java.lang.String str7 = visitor0.toString();
        visitor0.setUserType("");
        visitor0.setUserType("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "User: userType=true, email=User: userType=, email=User: userType=null, email=null, password=null], password=false], password=null]" + "'", str7.equals("User: userType=true, email=User: userType=, email=User: userType=null, email=null, password=null], password=false], password=null]"));
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test347");
        library.MaintainUserProxy maintainUserProxy0 = new library.MaintainUserProxy();
        java.util.List<library.User> userList1 = maintainUserProxy0.getUsers();
        java.util.Date date7 = null;
        java.util.Date date8 = null;
        java.util.Date date14 = null;
        java.util.Date date15 = null;
        library.UserType userType16 = new library.UserType();
        library.Request request22 = new library.Request((library.User) userType16, "", "", "hi!", "", false);
        library.CD cD28 = new library.CD("", "hi!", "", "", true, date14, date15, (library.User) userType16, "hi!", (java.lang.Double) 1.0d, "hi!", "", "hi!");
        cD28.setEdition("");
        cD28.setPurchasable("");
        library.Admin admin36 = new library.Admin("false", "false", "false");
        cD28.setOwner((library.User) admin36);
        java.lang.String str38 = admin36.getPassword();
        java.util.ArrayList<library.Request> requestList39 = admin36.getRequestList();
        admin36.handleRequests();
        library.CD cD46 = new library.CD("true", "hi!", "", "User: userType=null, email=null, password=null]", false, date7, date8, (library.User) admin36, "", (java.lang.Double) 10.0d, "", "true", "");
        java.util.Date date52 = null;
        java.util.Date date53 = null;
        library.User user54 = null;
        library.Magazine magazine60 = new library.Magazine("", "hi!", "", "", true, date52, date53, user54, "", (java.lang.Double) (-1.0d), "", "hi!", "");
        java.lang.Double double61 = magazine60.getCost();
        boolean boolean62 = magazine60.isPurchasable();
        java.lang.Double double63 = magazine60.getCost();
        java.lang.String str64 = magazine60.getRentable();
        java.lang.String str65 = magazine60.getRentable();
        admin36.addItem((library.Item) magazine60);
        maintainUserProxy0.addUser((library.User) admin36);
        library.Nonfaculty nonfaculty68 = new library.Nonfaculty();
        java.lang.String str69 = nonfaculty68.getuserType();
        java.lang.String str70 = nonfaculty68.toString();
        maintainUserProxy0.addUser((library.User) nonfaculty68);
        nonfaculty68.setUserType("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "false" + "'", str38.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(requestList39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + (-1.0d) + "'", double61.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + (-1.0d) + "'", double63.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str64 + "' != '" + "true" + "'", str64.equals("true"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str65 + "' != '" + "true" + "'", str65.equals("true"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str69);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str70 + "' != '" + "User: userType=null, email=null, password=null]" + "'", str70.equals("User: userType=null, email=null, password=null]"));
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test348");
        library.Nonfaculty nonfaculty0 = new library.Nonfaculty();
        java.lang.String str1 = nonfaculty0.getuserType();
        library.Request request7 = new library.Request((library.User) nonfaculty0, "", "false", "hi!", "false", true);
        java.lang.String str8 = nonfaculty0.getPassword();
        java.lang.String str9 = nonfaculty0.getEmail();
        nonfaculty0.setPassword("User: userType=null, email=null, password=null]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test349");
        library.Visitor visitor0 = new library.Visitor();
        java.lang.String str1 = visitor0.getEmail();
        java.lang.String str2 = visitor0.getEmail();
        visitor0.setPassword("User: userType=true, email=false, password=User: userType=null, email=null, password=null]]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test350");
        java.util.Date date5 = null;
        java.util.Date date6 = null;
        library.UserType userType7 = new library.UserType();
        library.Request request13 = new library.Request((library.User) userType7, "", "", "hi!", "", false);
        library.CD cD19 = new library.CD("", "hi!", "", "", true, date5, date6, (library.User) userType7, "hi!", (java.lang.Double) 1.0d, "hi!", "", "hi!");
        cD19.setEdition("");
        cD19.setPurchasable("");
        library.Admin admin27 = new library.Admin("false", "false", "false");
        cD19.setOwner((library.User) admin27);
        java.util.List<library.Item> itemList29 = admin27.getItems();
        library.Book book30 = new library.Book();
        boolean boolean31 = book30.getIfLost();
        java.lang.String str32 = book30.getItemType();
        admin27.enableItem((library.Item) book30);
        admin27.setUserType("User: userType=false, email=false, password=false]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemList29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str32);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test351");
        library.Course course0 = new library.Course();
        java.util.ArrayList<library.User> userList1 = course0.getStudents();
        java.util.Date date7 = null;
        java.util.Date date8 = null;
        library.UserType userType9 = new library.UserType();
        library.Request request15 = new library.Request((library.User) userType9, "", "", "hi!", "", false);
        library.CD cD21 = new library.CD("", "hi!", "", "", true, date7, date8, (library.User) userType9, "hi!", (java.lang.Double) 1.0d, "hi!", "", "hi!");
        boolean boolean22 = cD21.getIfLost();
        course0.setTextbooks((library.Item) cD21);
        course0.setSubject("User: userType=true, email=false, password=User: userType=null, email=null, password=null]]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(userList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test352");
        java.util.Date date5 = null;
        java.util.Date date6 = null;
        library.UserType userType7 = new library.UserType();
        library.Request request13 = new library.Request((library.User) userType7, "", "", "hi!", "", false);
        library.CD cD19 = new library.CD("", "hi!", "", "", true, date5, date6, (library.User) userType7, "hi!", (java.lang.Double) 1.0d, "hi!", "", "hi!");
        cD19.setEdition("");
        cD19.setID("User: userType=null, email=, password=null]");
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test353");
        java.util.Date date5 = null;
        java.util.Date date6 = null;
        library.User user7 = null;
        library.Magazine magazine13 = new library.Magazine("", "hi!", "", "", true, date5, date6, user7, "", (java.lang.Double) (-1.0d), "", "hi!", "");
        java.lang.Double double14 = magazine13.getCost();
        magazine13.setPurchasable("hi!");
        java.util.Date date17 = magazine13.getLostDate();
        magazine13.setPublisher("false");
        java.util.Date date20 = magazine13.getDueDate();
        boolean boolean21 = magazine13.getIfLost();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test354");
        java.util.Date date5 = null;
        java.util.Date date6 = null;
        library.User user7 = null;
        library.Magazine magazine13 = new library.Magazine("", "hi!", "", "", true, date5, date6, user7, "", (java.lang.Double) (-1.0d), "", "hi!", "");
        magazine13.setPublisher("true");
        boolean boolean16 = magazine13.getIfLost();
        java.lang.String str17 = magazine13.getID();
        java.lang.String str18 = magazine13.getTitle();
        magazine13.setLocation("User: userType=null, email=null, password=null]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test355");
        library.Magazine magazine0 = new library.Magazine();
        java.lang.String str1 = magazine0.getEdition();
        java.lang.String str2 = magazine0.getRentable();
        magazine0.setOnDiscount("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "false" + "'", str2.equals("false"));
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test356");
        java.util.Date date5 = null;
        java.util.Date date6 = null;
        library.User user7 = null;
        library.Magazine magazine13 = new library.Magazine("", "hi!", "", "", true, date5, date6, user7, "", (java.lang.Double) (-1.0d), "", "hi!", "");
        java.lang.Double double14 = magazine13.getCost();
        boolean boolean15 = magazine13.isPurchasable();
        java.lang.Double double16 = magazine13.getCost();
        java.lang.String str17 = magazine13.getID();
        magazine13.setLocation("");
        java.util.Date date20 = null;
        magazine13.setDueDate(date20);
        java.util.Date date22 = null;
        magazine13.setLostDate(date22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test357");
        library.Search search0 = new library.Search();
        library.Context context1 = new library.Context((library.Menu) search0);
        library.Context context2 = new library.Context((library.Menu) search0);
        library.Context context3 = new library.Context((library.Menu) search0);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test358");
        library.MaintainSubscriptionsProxy maintainSubscriptionsProxy0 = new library.MaintainSubscriptionsProxy();
        library.MaintainSubscriptionsProxy maintainSubscriptionsProxy1 = new library.MaintainSubscriptionsProxy();
        library.Subscription subscription2 = new library.Subscription();
        java.lang.String str3 = subscription2.getSite();
        subscription2.setSite("");
        java.util.Date date13 = null;
        java.util.Date date14 = null;
        library.UserType userType15 = new library.UserType();
        library.Request request21 = new library.Request((library.User) userType15, "", "", "hi!", "", false);
        library.Book book27 = new library.Book("false", "true", "true", "User: userType=null, email=null, password=null]", true, date13, date14, (library.User) userType15, "true", (java.lang.Double) 0.0d, "User: userType=null, email=null, password=null]", "true", "false");
        library.Subscription subscription29 = new library.Subscription("false", "false", (library.User) userType15, true);
        java.lang.String str30 = subscription29.isStatus();
        library.Subscription subscription31 = new library.Subscription();
        java.lang.String str32 = subscription31.getSite();
        subscription31.setSite("");
        library.Subscription subscription35 = new library.Subscription();
        java.lang.String str36 = subscription35.getSite();
        subscription35.setSite("");
        library.Subscription[] subscriptionArray39 = new library.Subscription[] { subscription2, subscription29, subscription31, subscription35 };
        java.util.ArrayList<library.Subscription> subscriptionList40 = new java.util.ArrayList<library.Subscription>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<library.Subscription>) subscriptionList40, subscriptionArray39);
        maintainSubscriptionsProxy1.setSubs((java.util.List<library.Subscription>) subscriptionList40);
        maintainSubscriptionsProxy0.setSubs((java.util.List<library.Subscription>) subscriptionList40);
        java.util.Date date51 = null;
        java.util.Date date52 = null;
        library.UserType userType53 = new library.UserType();
        library.Request request59 = new library.Request((library.User) userType53, "", "", "hi!", "", false);
        library.Book book65 = new library.Book("false", "true", "true", "User: userType=null, email=null, password=null]", true, date51, date52, (library.User) userType53, "true", (java.lang.Double) 0.0d, "User: userType=null, email=null, password=null]", "true", "false");
        library.Subscription subscription67 = new library.Subscription("false", "false", (library.User) userType53, true);
        maintainSubscriptionsProxy0.addSub(subscription67);
        java.util.Date date76 = null;
        java.util.Date date77 = null;
        library.UserType userType78 = new library.UserType();
        library.Request request84 = new library.Request((library.User) userType78, "", "", "hi!", "", false);
        library.Book book90 = new library.Book("false", "true", "true", "User: userType=null, email=null, password=null]", true, date76, date77, (library.User) userType78, "true", (java.lang.Double) 0.0d, "User: userType=null, email=null, password=null]", "true", "false");
        library.Subscription subscription92 = new library.Subscription("false", "false", (library.User) userType78, true);
        java.lang.String str93 = subscription92.isStatus();
        maintainSubscriptionsProxy0.addSub(subscription92);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "true" + "'", str30.equals("true"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(subscriptionArray39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str93 + "' != '" + "true" + "'", str93.equals("true"));
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test359");
        java.util.Date date5 = null;
        java.util.Date date6 = null;
        library.UserType userType7 = new library.UserType();
        library.Request request13 = new library.Request((library.User) userType7, "", "", "hi!", "", false);
        library.CD cD19 = new library.CD("", "hi!", "", "", true, date5, date6, (library.User) userType7, "hi!", (java.lang.Double) 1.0d, "hi!", "", "hi!");
        cD19.setEdition("");
        cD19.setPurchasable("");
        cD19.setOnDiscount("hi!");
        cD19.setPurchasable("true");
        boolean boolean28 = cD19.isRentable();
        java.lang.Double double29 = cD19.getCost();
        java.util.Date date30 = null;
        // The following exception was thrown during execution in test generation
        try {
            cD19.calcCost(date30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 1.0d + "'", double29.equals(1.0d));
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test360");
        java.util.Date date5 = null;
        java.util.Date date6 = null;
        library.UserType userType7 = new library.UserType();
        library.Request request13 = new library.Request((library.User) userType7, "", "", "hi!", "", false);
        library.CD cD19 = new library.CD("", "hi!", "", "", true, date5, date6, (library.User) userType7, "hi!", (java.lang.Double) 1.0d, "hi!", "", "hi!");
        cD19.setEdition("");
        cD19.setPurchasable("");
        java.util.Date date24 = null;
        cD19.considerIfLost(date24);
        java.util.Date date26 = cD19.getLostDate();
        boolean boolean27 = cD19.isRentable();
        boolean boolean28 = cD19.getIfLost();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test361");
        java.util.Date date5 = null;
        java.util.Date date6 = null;
        library.User user7 = null;
        library.Magazine magazine13 = new library.Magazine("", "hi!", "", "", true, date5, date6, user7, "", (java.lang.Double) (-1.0d), "", "hi!", "");
        java.lang.Double double14 = magazine13.getCost();
        boolean boolean15 = magazine13.isPurchasable();
        java.lang.Double double16 = magazine13.getCost();
        magazine13.setEdition("User: userType=null, email=null, password=null]");
        boolean boolean19 = magazine13.getIfLost();
        magazine13.setLocation("User: userType=false, email=false, password=false]");
        java.lang.String str22 = magazine13.getEdition();
        magazine13.setItemType("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "User: userType=null, email=null, password=null]" + "'", str22.equals("User: userType=null, email=null, password=null]"));
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test362");
        library.MaintainUnregisteredUser maintainUnregisteredUser0 = new library.MaintainUnregisteredUser();
        java.util.List<library.User> userList1 = maintainUnregisteredUser0.getUsers();
        java.lang.Class<?> wildcardClass2 = userList1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test363");
        library.MaintainNewsletterProxy maintainNewsletterProxy0 = new library.MaintainNewsletterProxy();
        library.NewsletterSystem newsletterSystem2 = maintainNewsletterProxy0.getItemByName("true");
        library.NewsletterSystem newsletterSystem5 = new library.NewsletterSystem("hi!", "User: userType=null, email=null, password=null]");
        maintainNewsletterProxy0.addNews(newsletterSystem5);
        library.MaintainNewsletterProxy maintainNewsletterProxy7 = new library.MaintainNewsletterProxy();
        library.NewsletterSystem newsletterSystem9 = maintainNewsletterProxy7.getItemByName("true");
        library.NewsletterSystem newsletterSystem12 = new library.NewsletterSystem("hi!", "User: userType=null, email=null, password=null]");
        maintainNewsletterProxy7.addNews(newsletterSystem12);
        java.util.List<library.NewsletterSystem> newsletterSystemList14 = maintainNewsletterProxy7.getNews();
        maintainNewsletterProxy0.setNews(newsletterSystemList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(newsletterSystem2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(newsletterSystem9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(newsletterSystemList14);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test364");
        library.Subscription subscription0 = new library.Subscription();
        java.lang.String str1 = subscription0.getSite();
        subscription0.setSite("");
        java.lang.String str4 = subscription0.getSite();
        java.lang.String str5 = subscription0.getSite();
        java.util.Date date11 = null;
        java.util.Date date12 = null;
        library.Student student13 = new library.Student();
        java.lang.String str14 = student13.getuserType();
        library.Book book20 = new library.Book("true", "hi!", "hi!", "false", false, date11, date12, (library.User) student13, "", (java.lang.Double) 1.0d, "hi!", "", "");
        student13.setEmail("true");
        library.Request request28 = new library.Request((library.User) student13, "User: userType=true, email=false, password=User: userType=null, email=null, password=null]]", "User: userType=true, email=User: userType=, email=User: userType=null, email=null, password=null], password=false], password=null]", "", "true", false);
        subscription0.setU((library.User) student13);
        java.lang.String str30 = student13.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str30);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test365");
        library.MaintainUserProxy maintainUserProxy0 = new library.MaintainUserProxy();
        java.util.List<library.User> userList1 = maintainUserProxy0.getUsers();
        java.util.Date date7 = null;
        java.util.Date date8 = null;
        java.util.Date date14 = null;
        java.util.Date date15 = null;
        library.UserType userType16 = new library.UserType();
        library.Request request22 = new library.Request((library.User) userType16, "", "", "hi!", "", false);
        library.CD cD28 = new library.CD("", "hi!", "", "", true, date14, date15, (library.User) userType16, "hi!", (java.lang.Double) 1.0d, "hi!", "", "hi!");
        cD28.setEdition("");
        cD28.setPurchasable("");
        library.Admin admin36 = new library.Admin("false", "false", "false");
        cD28.setOwner((library.User) admin36);
        java.lang.String str38 = admin36.getPassword();
        java.util.ArrayList<library.Request> requestList39 = admin36.getRequestList();
        admin36.handleRequests();
        library.CD cD46 = new library.CD("true", "hi!", "", "User: userType=null, email=null, password=null]", false, date7, date8, (library.User) admin36, "", (java.lang.Double) 10.0d, "", "true", "");
        java.util.Date date52 = null;
        java.util.Date date53 = null;
        library.User user54 = null;
        library.Magazine magazine60 = new library.Magazine("", "hi!", "", "", true, date52, date53, user54, "", (java.lang.Double) (-1.0d), "", "hi!", "");
        java.lang.Double double61 = magazine60.getCost();
        boolean boolean62 = magazine60.isPurchasable();
        java.lang.Double double63 = magazine60.getCost();
        java.lang.String str64 = magazine60.getRentable();
        java.lang.String str65 = magazine60.getRentable();
        admin36.addItem((library.Item) magazine60);
        maintainUserProxy0.addUser((library.User) admin36);
        java.util.List<library.User> userList68 = maintainUserProxy0.getUsers();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "false" + "'", str38.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(requestList39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + (-1.0d) + "'", double61.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + (-1.0d) + "'", double63.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str64 + "' != '" + "true" + "'", str64.equals("true"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str65 + "' != '" + "true" + "'", str65.equals("true"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList68);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test366");
        java.util.Date date5 = null;
        java.util.Date date6 = null;
        library.UserType userType7 = new library.UserType();
        library.Request request13 = new library.Request((library.User) userType7, "", "", "hi!", "", false);
        library.CD cD19 = new library.CD("", "hi!", "", "", true, date5, date6, (library.User) userType7, "hi!", (java.lang.Double) 1.0d, "hi!", "", "hi!");
        cD19.setEdition("");
        cD19.setPurchasable("");
        library.Admin admin27 = new library.Admin("false", "false", "false");
        cD19.setOwner((library.User) admin27);
        java.lang.String str29 = admin27.getPassword();
        java.lang.String str30 = admin27.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "false" + "'", str29.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "User: userType=false, email=false, password=false]" + "'", str30.equals("User: userType=false, email=false, password=false]"));
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test367");
        library.MaintainNewsletterProxy maintainNewsletterProxy0 = new library.MaintainNewsletterProxy();
        library.NewsletterSystem newsletterSystem2 = maintainNewsletterProxy0.getItemByName("true");
        library.NewsletterSystem newsletterSystem5 = new library.NewsletterSystem("User: userType=true, email=false, password=User: userType=null, email=null, password=null]]", "hi!");
        maintainNewsletterProxy0.addNews(newsletterSystem5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(newsletterSystem2);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test368");
        library.Search search0 = new library.Search();
        library.ItemDatabase itemDatabase2 = library.MaintainItems.getInstance();
        java.util.List<library.Item> itemList3 = search0.strategyInput("hi!", itemDatabase2);
        library.Context context4 = new library.Context((library.Menu) search0);
        library.Context context5 = new library.Context((library.Menu) search0);
        library.Search search8 = new library.Search();
        library.ItemDatabase itemDatabase10 = library.MaintainItems.getInstance();
        java.util.List<library.Item> itemList11 = search8.strategyInput("hi!", itemDatabase10);
        library.Context context12 = new library.Context((library.Menu) search8);
        library.Context context13 = new library.Context((library.Menu) search8);
        library.Search search16 = new library.Search();
        library.ItemDatabase itemDatabase18 = library.MaintainItems.getInstance();
        java.util.List<library.Item> itemList19 = search16.strategyInput("hi!", itemDatabase18);
        java.util.List<library.Item> itemList20 = library.Facade.search("hi!", itemDatabase18);
        java.util.List<library.Item> itemList21 = context13.strategyInput("User: userType=, email=User: userType=null, email=null, password=null], password=false]", itemDatabase18);
        library.Search search23 = new library.Search();
        library.ItemDatabase itemDatabase25 = library.MaintainItems.getInstance();
        java.util.List<library.Item> itemList26 = search23.strategyInput("hi!", itemDatabase25);
        java.util.List<library.Item> itemList27 = context13.strategyInput("hi!", itemDatabase25);
        library.Search search30 = new library.Search();
        library.ItemDatabase itemDatabase32 = library.MaintainItems.getInstance();
        java.util.List<library.Item> itemList33 = search30.strategyInput("hi!", itemDatabase32);
        library.Context context34 = new library.Context((library.Menu) search30);
        library.Context context35 = new library.Context((library.Menu) search30);
        library.Search search38 = new library.Search();
        library.ItemDatabase itemDatabase40 = library.MaintainItems.getInstance();
        java.util.List<library.Item> itemList41 = search38.strategyInput("hi!", itemDatabase40);
        java.util.List<library.Item> itemList42 = library.Facade.search("hi!", itemDatabase40);
        java.util.List<library.Item> itemList43 = context35.strategyInput("User: userType=, email=User: userType=null, email=null, password=null], password=false]", itemDatabase40);
        java.util.List<library.Item> itemList44 = library.Facade.discountOffers("", itemDatabase40);
        java.util.List<library.Item> itemList45 = context13.strategyInput("User: userType=true, email=false, password=User: userType=null, email=null, password=null]]", itemDatabase40);
        java.util.List<library.Item> itemList46 = library.Facade.search("", itemDatabase40);
        java.util.List<library.Item> itemList47 = search0.strategyInput("true", itemDatabase40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemDatabase2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemDatabase10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemDatabase18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemList20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemList21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemDatabase25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemList26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemList27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemDatabase32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemList33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemDatabase40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemList41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemList42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemList43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemList44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemList45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemList46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemList47);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test369");
        library.Subscription subscription0 = new library.Subscription();
        java.lang.String str1 = subscription0.getSite();
        subscription0.setSite("");
        library.Visitor visitor4 = new library.Visitor();
        java.lang.String str5 = visitor4.getuserType();
        java.lang.String str6 = visitor4.getuserType();
        subscription0.setU((library.User) visitor4);
        visitor4.setUserType("User: userType=true, email=false, password=User: userType=null, email=null, password=null]]");
        java.lang.String str10 = visitor4.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test370");
        library.Faculty faculty0 = new library.Faculty();
        java.lang.String str1 = faculty0.getPassword();
        java.lang.String str2 = faculty0.getuserType();
        library.MaintainCoursesProxy maintainCoursesProxy3 = new library.MaintainCoursesProxy();
        java.util.List<library.Course> courseList4 = maintainCoursesProxy3.getCourses();
        library.MaintainCoursesProxy maintainCoursesProxy5 = new library.MaintainCoursesProxy();
        library.Course[] courseArray6 = new library.Course[] {};
        java.util.ArrayList<library.Course> courseList7 = new java.util.ArrayList<library.Course>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<library.Course>) courseList7, courseArray6);
        maintainCoursesProxy5.setCourses((java.util.List<library.Course>) courseList7);
        maintainCoursesProxy3.setCourses((java.util.List<library.Course>) courseList7);
        library.Course course11 = new library.Course();
        java.util.ArrayList<library.User> userList12 = course11.getStudents();
        library.Course course13 = maintainCoursesProxy3.getCourse(course11);
        faculty0.addCourse(course11);
        faculty0.setPassword("User: userType=true, email=User: userType=, email=User: userType=null, email=null, password=null], password=false], password=null]");
        java.lang.String str17 = faculty0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(courseList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(courseArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(userList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(course13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "User: userType=null, email=null, password=User: userType=true, email=User: userType=, email=User: userType=null, email=null, password=null], password=false], password=null]]" + "'", str17.equals("User: userType=null, email=null, password=User: userType=true, email=User: userType=, email=User: userType=null, email=null, password=null], password=false], password=null]]"));
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test371");
        java.util.Date date5 = null;
        java.util.Date date6 = null;
        library.User user7 = null;
        library.Magazine magazine13 = new library.Magazine("", "hi!", "", "", true, date5, date6, user7, "", (java.lang.Double) (-1.0d), "", "hi!", "");
        java.lang.Double double14 = magazine13.getCost();
        boolean boolean15 = magazine13.isPurchasable();
        java.lang.Double double16 = magazine13.getCost();
        java.lang.String str17 = magazine13.getID();
        java.lang.String str18 = magazine13.getTitle();
        magazine13.setLocation("hi!");
        boolean boolean21 = magazine13.isOnDiscount();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

  
    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test373");
        java.util.Date date5 = null;
        java.util.Date date6 = null;
        library.User user7 = null;
        library.Magazine magazine13 = new library.Magazine("", "hi!", "", "", true, date5, date6, user7, "", (java.lang.Double) (-1.0d), "", "hi!", "");
        java.lang.Double double14 = magazine13.getCost();
        boolean boolean15 = magazine13.isPurchasable();
        java.lang.Double double16 = magazine13.getCost();
        java.lang.String str17 = magazine13.getID();
        magazine13.setLocation("");
        java.lang.String str20 = magazine13.getRentable();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "true" + "'", str20.equals("true"));
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test374");
        library.NewsletterSystem newsletterSystem2 = new library.NewsletterSystem("true", "User: userType=null, email=null, password=null]");
        newsletterSystem2.setWebsite("");
        newsletterSystem2.setCompany("User: userType=true, email=false, password=User: userType=null, email=null, password=null]]");
        java.lang.String str7 = newsletterSystem2.getWebsite();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test375");
        library.MaintainCoursesProxy maintainCoursesProxy0 = new library.MaintainCoursesProxy();
        library.Course[] courseArray1 = new library.Course[] {};
        java.util.ArrayList<library.Course> courseList2 = new java.util.ArrayList<library.Course>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<library.Course>) courseList2, courseArray1);
        maintainCoursesProxy0.setCourses((java.util.List<library.Course>) courseList2);
        java.util.List<library.Course> courseList5 = maintainCoursesProxy0.getCourses();
        library.Course course6 = null;
        library.Course course7 = maintainCoursesProxy0.getCourse(course6);
        library.Course course8 = new library.Course();
        java.util.ArrayList<library.User> userList9 = course8.getStudents();
        java.util.Date date15 = null;
        java.util.Date date16 = null;
        library.UserType userType17 = new library.UserType();
        library.Request request23 = new library.Request((library.User) userType17, "", "", "hi!", "", false);
        library.CD cD29 = new library.CD("", "hi!", "", "", true, date15, date16, (library.User) userType17, "hi!", (java.lang.Double) 1.0d, "hi!", "", "hi!");
        boolean boolean30 = cD29.getIfLost();
        course8.setTextbooks((library.Item) cD29);
        java.util.Date date32 = course8.getEndDate();
        maintainCoursesProxy0.addCourse(course8);
        java.util.Date date34 = course8.getEndDate();
        java.util.Date date35 = null;
        course8.setEndDate(date35);
        library.Nonfaculty nonfaculty40 = new library.Nonfaculty("true", "true", "User: userType=null, email=true, password=null]");
        course8.professorFaculty = nonfaculty40;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(courseArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(courseList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(course7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(userList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date34);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test376");
        java.util.Date date5 = null;
        java.util.Date date6 = null;
        library.Visitor visitor7 = new library.Visitor();
        library.Book book13 = new library.Book("hi!", "", "", "true", false, date5, date6, (library.User) visitor7, "User: userType=null, email=null, password=null]", (java.lang.Double) 0.0d, "true", "", "User: userType=null, email=null, password=null]");
        java.lang.String str14 = book13.getTitle();
        book13.setLocation("User: userType=, email=User: userType=null, email=null, password=null], password=false]");
        book13.setItemType("User: userType=true, email=false, password=User: userType=null, email=null, password=null]]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test377");
        library.Student student0 = new library.Student();
        library.Book book1 = new library.Book();
        boolean boolean2 = book1.getIfLost();
        java.lang.String str3 = book1.getItemType();
        book1.setPurchasable("true");
        student0.addBookItem(book1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test378");
        library.MaintainRequestsProxy maintainRequestsProxy0 = new library.MaintainRequestsProxy();
        library.MaintainRequestsProxy maintainRequestsProxy1 = new library.MaintainRequestsProxy();
        library.UserType userType2 = new library.UserType();
        library.Request request8 = new library.Request((library.User) userType2, "", "", "hi!", "", false);
        library.User user9 = request8.getUser();
        java.lang.String str10 = request8.getItemType();
        java.lang.String str11 = maintainRequestsProxy1.notifyPriority(request8);
        maintainRequestsProxy0.removeReq(request8);
        java.lang.String str13 = request8.getPriority();
        request8.setEdition("true");
        request8.setCompletion(true);
        java.lang.String str18 = request8.getEdition();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "true" + "'", str18.equals("true"));
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test379");
        java.util.Date date5 = null;
        java.util.Date date6 = null;
        library.UserType userType7 = new library.UserType();
        library.Request request13 = new library.Request((library.User) userType7, "", "", "hi!", "", false);
        library.CD cD19 = new library.CD("", "hi!", "", "", true, date5, date6, (library.User) userType7, "hi!", (java.lang.Double) 1.0d, "hi!", "", "hi!");
        java.lang.String str20 = cD19.getRentable();
        java.lang.String str21 = cD19.getItemType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "true" + "'", str20.equals("true"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "" + "'", str21.equals(""));
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test380");
        java.util.Date date5 = null;
        java.util.Date date6 = null;
        library.UserType userType7 = new library.UserType();
        library.Request request13 = new library.Request((library.User) userType7, "", "", "hi!", "", false);
        library.CD cD19 = new library.CD("", "hi!", "", "", true, date5, date6, (library.User) userType7, "hi!", (java.lang.Double) 1.0d, "hi!", "", "hi!");
        cD19.setEdition("");
        boolean boolean22 = cD19.isOnDiscount();
        java.util.Date date23 = cD19.getDueDate();
        java.util.Date date24 = cD19.getLostDate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date24);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test381");
        library.Subscription subscription0 = new library.Subscription();
        java.lang.String str1 = subscription0.getSite();
        subscription0.setSite("");
        subscription0.setSite("");
        java.lang.String str6 = subscription0.isStatus();
        library.User user7 = subscription0.getU();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "false" + "'", str6.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user7);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test382");
        library.UserType userType0 = new library.UserType();
        library.Request request6 = new library.Request((library.User) userType0, "", "", "hi!", "", false);
        library.User user7 = request6.getUser();
        java.lang.String str8 = request6.getItemType();
        request6.setItemType("User: userType=null, email=null, password=null]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test383");
        library.Magazine magazine0 = new library.Magazine();
        java.util.Date date1 = magazine0.getBorrowedDate();
        java.lang.String str2 = magazine0.getLocation();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test384");
        java.util.Date date5 = null;
        java.util.Date date6 = null;
        library.User user7 = null;
        library.Magazine magazine13 = new library.Magazine("", "hi!", "", "", true, date5, date6, user7, "", (java.lang.Double) (-1.0d), "", "hi!", "");
        java.lang.Double double14 = magazine13.getCost();
        boolean boolean15 = magazine13.isPurchasable();
        java.lang.Double double16 = magazine13.getCost();
        java.lang.String str17 = magazine13.getID();
        magazine13.setLocation("");
        java.util.Date date20 = null;
        magazine13.setDueDate(date20);
        magazine13.setItemType("User: userType=true, email=User: userType=, email=User: userType=null, email=null, password=null], password=false], password=null]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test385");
        library.MaintainSubscriptionsProxy maintainSubscriptionsProxy0 = new library.MaintainSubscriptionsProxy();
        library.UserType userType3 = new library.UserType();
        library.Request request9 = new library.Request((library.User) userType3, "", "", "hi!", "", false);
        library.User user10 = request9.getUser();
        library.Subscription subscription12 = new library.Subscription("false", "", user10, true);
        maintainSubscriptionsProxy0.addSub(subscription12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user10);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test386");
        java.util.Date date5 = null;
        java.util.Date date6 = null;
        library.User user7 = null;
        library.Magazine magazine13 = new library.Magazine("", "hi!", "", "", true, date5, date6, user7, "", (java.lang.Double) (-1.0d), "", "hi!", "");
        java.lang.Double double14 = magazine13.getCost();
        boolean boolean15 = magazine13.isPurchasable();
        java.lang.Double double16 = magazine13.getCost();
        boolean boolean17 = magazine13.isRentable();
        library.Student student21 = new library.Student("false", "true", "");
        magazine13.setOwner((library.User) student21);
        library.Book book23 = new library.Book();
        boolean boolean24 = book23.getIfLost();
        java.lang.String str25 = book23.getOnDiscount();
        student21.addBookItem(book23);
        java.lang.String str27 = student21.getEmail();
        java.util.ArrayList<library.Course> courseList28 = student21.getCourses();
        student21.setUserType("User: userType=false, email=false, password=false]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "false" + "'", str25.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "true" + "'", str27.equals("true"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(courseList28);
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test387");
        library.Admin admin3 = new library.Admin("hi!", "User: userType=true, email=User: userType=, email=User: userType=null, email=null, password=null], password=false], password=null]", "User: userType=null, email=true, password=null]");
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test388");
        library.MaintainRequestsProxy maintainRequestsProxy0 = new library.MaintainRequestsProxy();
        library.UserType userType1 = new library.UserType();
        library.Request request7 = new library.Request((library.User) userType1, "", "", "hi!", "", false);
        library.User user8 = request7.getUser();
        java.lang.String str9 = request7.getItemType();
        java.lang.String str10 = maintainRequestsProxy0.notifyPriority(request7);
        library.UserType userType11 = new library.UserType();
        library.Request request17 = new library.Request((library.User) userType11, "", "", "hi!", "", false);
        library.User user18 = request17.getUser();
        java.lang.String str19 = maintainRequestsProxy0.notifyPriority(request17);
        library.UserType userType20 = new library.UserType();
        library.Request request26 = new library.Request((library.User) userType20, "", "", "hi!", "", false);
        library.User user27 = request26.getUser();
        java.lang.String str28 = request26.getPriority();
        maintainRequestsProxy0.confirmReq(request26);
        java.util.List<library.Request> requestList30 = maintainRequestsProxy0.getRequests();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "" + "'", str28.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(requestList30);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test389");
        library.Nonfaculty nonfaculty0 = new library.Nonfaculty();
        java.lang.String str1 = nonfaculty0.getPassword();
        nonfaculty0.setPassword("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test390");
        library.Visitor visitor3 = new library.Visitor("User: userType=true, email=false, password=User: userType=null, email=null, password=null]]", "User: userType=true, email=false, password=User: userType=null, email=null, password=null]]", "false");
        visitor3.setEmail("User: userType=false, email=true, password=]");
        visitor3.setUserType("");
        visitor3.setUserType("User: userType=null, email=true, password=null]");
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test391");
        java.util.Date date5 = null;
        java.util.Date date6 = null;
        library.UserType userType7 = new library.UserType();
        library.Request request13 = new library.Request((library.User) userType7, "", "", "hi!", "", false);
        library.CD cD19 = new library.CD("", "hi!", "", "", true, date5, date6, (library.User) userType7, "hi!", (java.lang.Double) 1.0d, "hi!", "", "hi!");
        boolean boolean20 = cD19.getIfLost();
        cD19.setPublisher("User: userType=false, email=false, password=false]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test392");
        library.Book book0 = new library.Book();
        boolean boolean1 = book0.getIfLost();
        java.lang.String str2 = book0.getOnDiscount();
        boolean boolean3 = book0.isPurchasable();
        book0.setPurchasable("User: userType=null, email=null, password=null]");
        book0.setPublisher("User: userType=null, email=null, password=null]");
        boolean boolean8 = book0.isPurchasable();
        java.util.Date date9 = book0.getBorrowedDate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "false" + "'", str2.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date9);
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test393");
        library.MaintainCoursesProxy maintainCoursesProxy0 = new library.MaintainCoursesProxy();
        java.util.List<library.Course> courseList1 = maintainCoursesProxy0.getCourses();
        library.Course course2 = null;
        maintainCoursesProxy0.addCourse(course2);
        library.Course course4 = new library.Course();
        java.util.ArrayList<library.User> userList5 = course4.getStudents();
        java.util.Date date11 = null;
        java.util.Date date12 = null;
        library.UserType userType13 = new library.UserType();
        library.Request request19 = new library.Request((library.User) userType13, "", "", "hi!", "", false);
        library.CD cD25 = new library.CD("", "hi!", "", "", true, date11, date12, (library.User) userType13, "hi!", (java.lang.Double) 1.0d, "hi!", "", "hi!");
        boolean boolean26 = cD25.getIfLost();
        course4.setTextbooks((library.Item) cD25);
        java.util.Date date28 = course4.getEndDate();
        maintainCoursesProxy0.addCourse(course4);
        java.lang.String str30 = course4.getSubject();
        course4.setSubject("User: userType=true, email=false, password=User: userType=null, email=null, password=null]]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(courseList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(userList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str30);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test394");
        library.Faculty faculty3 = new library.Faculty("", "false", "false");
        faculty3.setEmail("User: userType=, email=User: userType=null, email=null, password=null], password=false]");
        library.Request request11 = new library.Request((library.User) faculty3, "false", "User: userType=null, email=null, password=null]", "hi!", "User: userType=, email=User: userType=null, email=null, password=null], password=false]", true);
        java.lang.String str12 = faculty3.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "User: userType=, email=User: userType=, email=User: userType=null, email=null, password=null], password=false], password=false]" + "'", str12.equals("User: userType=, email=User: userType=, email=User: userType=null, email=null, password=null], password=false], password=false]"));
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test395");
        library.Faculty faculty3 = new library.Faculty("", "false", "false");
        library.Book book4 = new library.Book();
        boolean boolean5 = book4.getIfLost();
        java.lang.String str6 = book4.getOnDiscount();
        java.lang.String str7 = book4.getPublisher();
        faculty3.addBookItem(book4);
        faculty3.setEmail("true");
        faculty3.setEmail("false");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "false" + "'", str6.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test396");
        library.Student student0 = new library.Student();
        java.util.ArrayList<library.Book> bookList1 = student0.getBookItems();
        java.lang.String str2 = student0.toString();
        student0.setUserType("false");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "User: userType=null, email=null, password=null]" + "'", str2.equals("User: userType=null, email=null, password=null]"));
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test397");
        java.util.Date date5 = null;
        java.util.Date date6 = null;
        library.Student student7 = new library.Student();
        java.lang.String str8 = student7.getuserType();
        library.Book book14 = new library.Book("true", "hi!", "hi!", "false", false, date5, date6, (library.User) student7, "", (java.lang.Double) 1.0d, "hi!", "", "");
        student7.setEmail("true");
        library.Request request22 = new library.Request((library.User) student7, "User: userType=true, email=false, password=User: userType=null, email=null, password=null]]", "User: userType=true, email=User: userType=, email=User: userType=null, email=null, password=null], password=false], password=null]", "", "true", false);
        java.lang.String str23 = student7.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "true" + "'", str23.equals("true"));
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test398");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test399");
        library.MaintainCoursesProxy maintainCoursesProxy0 = new library.MaintainCoursesProxy();
        library.Course[] courseArray1 = new library.Course[] {};
        java.util.ArrayList<library.Course> courseList2 = new java.util.ArrayList<library.Course>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<library.Course>) courseList2, courseArray1);
        maintainCoursesProxy0.setCourses((java.util.List<library.Course>) courseList2);
        java.util.List<library.Course> courseList5 = maintainCoursesProxy0.getCourses();
        library.Course course6 = null;
        library.Course course7 = maintainCoursesProxy0.getCourse(course6);
        library.Course course8 = new library.Course();
        java.util.ArrayList<library.User> userList9 = course8.getStudents();
        java.util.Date date15 = null;
        java.util.Date date16 = null;
        library.UserType userType17 = new library.UserType();
        library.Request request23 = new library.Request((library.User) userType17, "", "", "hi!", "", false);
        library.CD cD29 = new library.CD("", "hi!", "", "", true, date15, date16, (library.User) userType17, "hi!", (java.lang.Double) 1.0d, "hi!", "", "hi!");
        boolean boolean30 = cD29.getIfLost();
        course8.setTextbooks((library.Item) cD29);
        java.util.Date date32 = course8.getEndDate();
        maintainCoursesProxy0.addCourse(course8);
        java.util.Date date34 = course8.getEndDate();
        java.util.Date date35 = null;
        course8.setEndDate(date35);
        library.Item item37 = course8.textbooks;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(courseArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(courseList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(course7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(userList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(item37);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test400");
        library.MaintainUnregisteredUser maintainUnregisteredUser0 = new library.MaintainUnregisteredUser();
        java.util.List<library.User> userList1 = maintainUnregisteredUser0.getUsers();
        library.MaintainUserProxy maintainUserProxy2 = new library.MaintainUserProxy();
        java.util.List<library.User> userList3 = maintainUserProxy2.getUsers();
        library.MaintainUserProxy maintainUserProxy4 = new library.MaintainUserProxy();
        java.util.List<library.User> userList5 = maintainUserProxy4.getUsers();
        maintainUserProxy2.setUsers(userList5);
        maintainUnregisteredUser0.setUsers(userList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList5);
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test401");
        library.MaintainCoursesProxy maintainCoursesProxy0 = new library.MaintainCoursesProxy();
        java.util.List<library.Course> courseList1 = maintainCoursesProxy0.getCourses();
        library.MaintainCoursesProxy maintainCoursesProxy2 = new library.MaintainCoursesProxy();
        library.Course[] courseArray3 = new library.Course[] {};
        java.util.ArrayList<library.Course> courseList4 = new java.util.ArrayList<library.Course>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<library.Course>) courseList4, courseArray3);
        maintainCoursesProxy2.setCourses((java.util.List<library.Course>) courseList4);
        maintainCoursesProxy0.setCourses((java.util.List<library.Course>) courseList4);
        library.Course course8 = new library.Course();
        java.util.Date date9 = course8.endDate;
        library.Course course10 = maintainCoursesProxy0.getCourse(course8);
        library.Course course11 = new library.Course();
        java.util.ArrayList<library.User> userList12 = course11.getStudents();
        java.util.Date date18 = null;
        java.util.Date date19 = null;
        library.UserType userType20 = new library.UserType();
        library.Request request26 = new library.Request((library.User) userType20, "", "", "hi!", "", false);
        library.CD cD32 = new library.CD("", "hi!", "", "", true, date18, date19, (library.User) userType20, "hi!", (java.lang.Double) 1.0d, "hi!", "", "hi!");
        boolean boolean33 = cD32.getIfLost();
        course11.setTextbooks((library.Item) cD32);
        java.util.Date date35 = course11.getEndDate();
        java.util.Date date36 = course11.startDate;
        maintainCoursesProxy0.addCourse(course11);
        library.User user38 = course11.getProfessorFaculty();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(courseList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(courseArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(course10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(userList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user38);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test402");
        library.Faculty faculty3 = new library.Faculty("false", "false", "User: userType=null, email=null, password=null]");
        java.lang.String str4 = faculty3.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "User: userType=false, email=false, password=User: userType=null, email=null, password=null]]" + "'", str4.equals("User: userType=false, email=false, password=User: userType=null, email=null, password=null]]"));
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test403");
        java.util.Date date5 = null;
        java.util.Date date6 = null;
        library.UserType userType7 = new library.UserType();
        library.Request request13 = new library.Request((library.User) userType7, "", "", "hi!", "", false);
        library.Book book19 = new library.Book("false", "true", "true", "User: userType=null, email=null, password=null]", true, date5, date6, (library.User) userType7, "true", (java.lang.Double) 0.0d, "User: userType=null, email=null, password=null]", "true", "false");
        java.util.Date date20 = book19.getLostDate();
        java.lang.Double double21 = book19.getCost();
        java.util.Date date22 = book19.getDueDate();
        book19.setID("User: userType=null, email=null, password=null]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date22);
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test404");
        java.util.Date date5 = null;
        java.util.Date date6 = null;
        library.User user7 = null;
        library.Magazine magazine13 = new library.Magazine("", "hi!", "", "", true, date5, date6, user7, "", (java.lang.Double) (-1.0d), "", "hi!", "");
        java.lang.Double double14 = magazine13.getCost();
        boolean boolean15 = magazine13.isPurchasable();
        java.lang.String str16 = magazine13.getOnDiscount();
        boolean boolean17 = magazine13.isOnDiscount();
        java.lang.String str18 = magazine13.getItemType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "false" + "'", str16.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test405");
        library.Visitor visitor0 = new library.Visitor();
        java.lang.String str1 = visitor0.getuserType();
        visitor0.setPassword("User: userType=false, email=true, password=]");
        java.lang.String str4 = visitor0.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "User: userType=false, email=true, password=]" + "'", str4.equals("User: userType=false, email=true, password=]"));
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test406");
        library.Facade facade0 = new library.Facade();
        boolean boolean2 = facade0.passwordValid("User: userType=null, email=null, password=null]");
        boolean boolean4 = facade0.passwordValid("User: userType=null, email=null, password=null]");
        boolean boolean6 = facade0.userTypeValid("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test407");
        library.UserType userType3 = new library.UserType("hi!", "User: userType=true, email=User: userType=, email=User: userType=null, email=null, password=null], password=false], password=null]", "User: userType=true, email=false, password=User: userType=null, email=null, password=null]]");
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test408");
        library.MaintainUserProxy maintainUserProxy0 = new library.MaintainUserProxy();
        java.util.List<library.User> userList1 = maintainUserProxy0.getUsers();
        library.MaintainUserProxy maintainUserProxy2 = new library.MaintainUserProxy();
        java.util.List<library.User> userList3 = maintainUserProxy2.getUsers();
        maintainUserProxy0.setUsers(userList3);
        library.Visitor visitor5 = new library.Visitor();
        maintainUserProxy0.addUser((library.User) visitor5);
        java.lang.String str7 = visitor5.toString();
        visitor5.setPassword("User: userType=, email=User: userType=null, email=null, password=null], password=false]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "User: userType=null, email=null, password=null]" + "'", str7.equals("User: userType=null, email=null, password=null]"));
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test409");
        library.MaintainRequestsProxy maintainRequestsProxy0 = new library.MaintainRequestsProxy();
        library.UserType userType1 = new library.UserType();
        library.Request request7 = new library.Request((library.User) userType1, "", "", "hi!", "", false);
        library.User user8 = request7.getUser();
        java.lang.String str9 = request7.getItemType();
        java.lang.String str10 = maintainRequestsProxy0.notifyPriority(request7);
        java.lang.String str11 = request7.getItemType();
        request7.setName("User: userType=null, email=true, password=null]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test410");
        java.util.Date date5 = null;
        java.util.Date date6 = null;
        library.User user7 = null;
        library.Magazine magazine13 = new library.Magazine("", "hi!", "", "", true, date5, date6, user7, "", (java.lang.Double) (-1.0d), "", "hi!", "");
        java.lang.Double double14 = magazine13.getCost();
        boolean boolean15 = magazine13.isPurchasable();
        java.lang.Double double16 = magazine13.getCost();
        java.lang.String str17 = magazine13.getID();
        magazine13.setLocation("");
        java.util.Date date20 = null;
        magazine13.setDueDate(date20);
        java.lang.String str22 = magazine13.getRentable();
        boolean boolean23 = magazine13.isOnDiscount();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "true" + "'", str22.equals("true"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test411");
        library.Subscription subscription0 = new library.Subscription();
        java.lang.String str1 = subscription0.getSite();
        subscription0.setSite("");
        library.Visitor visitor4 = new library.Visitor();
        java.lang.String str5 = visitor4.getuserType();
        java.lang.String str6 = visitor4.getuserType();
        subscription0.setU((library.User) visitor4);
        subscription0.setCompanyName("User: userType=null, email=, password=null]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test412");
        library.Book book0 = new library.Book();
        boolean boolean1 = book0.getIfLost();
        java.lang.String str2 = book0.getItemType();
        java.lang.Double double3 = book0.getCost();
        book0.setPurchasable("User: userType=null, email=null, password=null]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(double3);
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test413");
        library.Subscription subscription0 = new library.Subscription();
        java.lang.String str1 = subscription0.getSite();
        subscription0.setSite("");
        library.Visitor visitor4 = new library.Visitor();
        java.lang.String str5 = visitor4.getuserType();
        java.lang.String str6 = visitor4.getuserType();
        subscription0.setU((library.User) visitor4);
        visitor4.setUserType("User: userType=true, email=false, password=User: userType=null, email=null, password=null]]");
        java.lang.String str10 = visitor4.getuserType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "User: userType=true, email=false, password=User: userType=null, email=null, password=null]]" + "'", str10.equals("User: userType=true, email=false, password=User: userType=null, email=null, password=null]]"));
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test414");
        java.util.Date date5 = null;
        java.util.Date date6 = null;
        library.UserType userType7 = new library.UserType();
        library.Request request13 = new library.Request((library.User) userType7, "", "", "hi!", "", false);
        library.CD cD19 = new library.CD("", "hi!", "", "", true, date5, date6, (library.User) userType7, "hi!", (java.lang.Double) 1.0d, "hi!", "", "hi!");
        cD19.setEdition("");
        cD19.setPurchasable("");
        java.lang.String str24 = cD19.getEdition();
        java.lang.String str25 = cD19.getTitle();
        boolean boolean26 = cD19.isOnDiscount();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "" + "'", str24.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!" + "'", str25.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test415");
        library.MaintainUnregisteredUser maintainUnregisteredUser0 = new library.MaintainUnregisteredUser();
        java.lang.String str1 = maintainUnregisteredUser0.path;
        java.util.List<library.User> userList2 = maintainUnregisteredUser0.getUsers();
        java.util.ArrayList<library.User> userList3 = null;
        maintainUnregisteredUser0.users = userList3;
        java.util.List<library.User> userList5 = maintainUnregisteredUser0.getUsers();
        java.lang.String str6 = maintainUnregisteredUser0.path;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(userList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test416");
        library.MaintainUnregisteredUser maintainUnregisteredUser0 = new library.MaintainUnregisteredUser();
        java.lang.String str1 = maintainUnregisteredUser0.path;
        java.util.ArrayList<library.User> userList2 = maintainUnregisteredUser0.users;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList2);
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test417");
        java.util.Date date5 = null;
        java.util.Date date6 = null;
        library.User user7 = null;
        library.Magazine magazine13 = new library.Magazine("", "hi!", "", "", true, date5, date6, user7, "", (java.lang.Double) (-1.0d), "", "hi!", "");
        java.lang.Double double14 = magazine13.getCost();
        boolean boolean15 = magazine13.isPurchasable();
        java.lang.Double double16 = magazine13.getCost();
        java.lang.String str17 = magazine13.getID();
        java.lang.String str18 = magazine13.getTitle();
        magazine13.setPurchasable("true");
        magazine13.setCost((java.lang.Double) 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test418");
        library.UserType userType3 = new library.UserType("User: userType=false, email=true, password=]", "User: userType=null, email=null, password=User: userType=true, email=User: userType=, email=User: userType=null, email=null, password=null], password=false], password=null]]", "User: userType=true, email=User: userType=, email=User: userType=null, email=null, password=null], password=false], password=null]");
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test419");
        java.util.Date date5 = null;
        java.util.Date date6 = null;
        library.User user7 = null;
        library.Magazine magazine13 = new library.Magazine("", "hi!", "", "", true, date5, date6, user7, "", (java.lang.Double) (-1.0d), "", "hi!", "");
        java.lang.Double double14 = magazine13.getCost();
        boolean boolean15 = magazine13.isPurchasable();
        magazine13.setPublisher("hi!");
        magazine13.setRentable("User: userType=false, email=true, password=]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test420");
        library.Course course0 = new library.Course();
        course0.subject = "User: userType=false, email=false, password=false]";
        java.util.Date date3 = null;
        course0.setStartDate(date3);
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test421");
        library.Nonfaculty nonfaculty0 = new library.Nonfaculty();
        java.lang.String str1 = nonfaculty0.getuserType();
        java.lang.String str2 = nonfaculty0.getuserType();
        nonfaculty0.setUserType("User: userType=true, email=User: userType=, email=User: userType=null, email=null, password=null], password=false], password=null]");
        nonfaculty0.setUserType("User: userType=true, email=User: userType=, email=User: userType=null, email=null, password=null], password=false], password=null]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test422");
        library.MaintainCourses maintainCourses0 = new library.MaintainCourses();
        java.util.List<library.Course> courseList1 = maintainCourses0.getCourses();
        library.Course course2 = new library.Course();
        library.Course course3 = maintainCourses0.getCourse(course2);
        java.util.Date date9 = null;
        java.util.Date date10 = null;
        library.User user11 = null;
        library.Magazine magazine17 = new library.Magazine("", "hi!", "", "", true, date9, date10, user11, "", (java.lang.Double) (-1.0d), "", "hi!", "");
        magazine17.setOnDiscount("");
        magazine17.setPurchasable("User: userType=null, email=null, password=null]");
        magazine17.setCost((java.lang.Double) 100.0d);
        course2.setTextbooks((library.Item) magazine17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(courseList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(course3);
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test423");
        library.MaintainRequestsProxy maintainRequestsProxy0 = new library.MaintainRequestsProxy();
        library.UserType userType1 = new library.UserType();
        library.Request request7 = new library.Request((library.User) userType1, "", "", "hi!", "", false);
        library.User user8 = request7.getUser();
        java.lang.String str9 = request7.getItemType();
        java.lang.String str10 = maintainRequestsProxy0.notifyPriority(request7);
        library.AdminAccount adminAccount11 = new library.AdminAccount();
        java.lang.String str12 = adminAccount11.path;
        library.UserType userType13 = new library.UserType();
        library.Request request19 = new library.Request((library.User) userType13, "", "", "hi!", "", false);
        library.User user20 = request19.getUser();
        java.util.Date date26 = null;
        java.util.Date date27 = null;
        library.UserType userType28 = new library.UserType();
        library.Request request34 = new library.Request((library.User) userType28, "", "", "hi!", "", false);
        library.CD cD40 = new library.CD("", "hi!", "", "", true, date26, date27, (library.User) userType28, "hi!", (java.lang.Double) 1.0d, "hi!", "", "hi!");
        java.lang.String str41 = userType28.toString();
        request19.setUser((library.User) userType28);
        maintainRequestsProxy0.sendRequestDeny(adminAccount11, request19);
        java.util.List<library.Request> requestList44 = maintainRequestsProxy0.getReqSI();
        library.UserType userType45 = new library.UserType();
        library.Request request51 = new library.Request((library.User) userType45, "", "", "hi!", "", false);
        library.User user52 = request51.getUser();
        java.lang.String str53 = request51.getPriority();
        java.lang.String str54 = request51.getPriority();
        maintainRequestsProxy0.confirmReq(request51);
        java.util.Date date61 = null;
        java.util.Date date62 = null;
        library.Student student63 = new library.Student();
        java.lang.String str64 = student63.getuserType();
        library.Book book70 = new library.Book("true", "hi!", "hi!", "false", false, date61, date62, (library.User) student63, "", (java.lang.Double) 1.0d, "hi!", "", "");
        student63.setEmail("true");
        library.Request request78 = new library.Request((library.User) student63, "User: userType=true, email=false, password=User: userType=null, email=null, password=null]]", "User: userType=true, email=User: userType=, email=User: userType=null, email=null, password=null], password=false], password=null]", "", "true", false);
        maintainRequestsProxy0.confirmReq(request78);
        java.util.List<library.Request> requestList80 = maintainRequestsProxy0.getRequests();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "User: userType=null, email=null, password=null]" + "'", str41.equals("User: userType=null, email=null, password=null]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(requestList44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str53 + "' != '" + "" + "'", str53.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str54 + "' != '" + "" + "'", str54.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(requestList80);
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test424");
        library.Faculty faculty3 = new library.Faculty("", "false", "false");
        faculty3.setEmail("User: userType=, email=User: userType=null, email=null, password=null], password=false]");
        library.Request request11 = new library.Request((library.User) faculty3, "false", "User: userType=null, email=null, password=null]", "hi!", "User: userType=, email=User: userType=null, email=null, password=null], password=false]", true);
        faculty3.setEmail("User: userType=null, email=true, password=null]");
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test425");
        java.util.Date date5 = null;
        java.util.Date date6 = null;
        library.UserType userType7 = new library.UserType();
        library.Request request13 = new library.Request((library.User) userType7, "", "", "hi!", "", false);
        library.CD cD19 = new library.CD("", "hi!", "", "", true, date5, date6, (library.User) userType7, "hi!", (java.lang.Double) 1.0d, "hi!", "", "hi!");
        cD19.setEdition("");
        cD19.setPurchasable("");
        java.lang.String str24 = cD19.getRentable();
        java.util.Date date25 = cD19.getBorrowedDate();
        boolean boolean26 = cD19.isOnDiscount();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "true" + "'", str24.equals("true"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test426");
        library.Book book0 = new library.Book();
        boolean boolean1 = book0.getIfLost();
        java.lang.String str2 = book0.getOnDiscount();
        java.lang.String str3 = book0.getPublisher();
        java.lang.String str4 = book0.getOnDiscount();
        book0.setRentable("true");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "false" + "'", str2.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "false" + "'", str4.equals("false"));
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test427");
        java.util.Date date5 = null;
        java.util.Date date6 = null;
        library.User user7 = null;
        library.Magazine magazine13 = new library.Magazine("", "hi!", "", "", true, date5, date6, user7, "", (java.lang.Double) (-1.0d), "", "hi!", "");
        java.lang.Double double14 = magazine13.getCost();
        boolean boolean15 = magazine13.isPurchasable();
        java.lang.Double double16 = magazine13.getCost();
        java.lang.String str17 = magazine13.getID();
        magazine13.setLocation("");
        java.lang.String str20 = magazine13.getItemType();
        magazine13.setOnDiscount("");
        boolean boolean23 = magazine13.isPurchasable();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test428");
        library.Student student3 = new library.Student("", "", "User: userType=null, email=null, password=null]");
        library.Book book4 = new library.Book();
        boolean boolean5 = book4.getIfLost();
        java.lang.String str6 = book4.getOnDiscount();
        boolean boolean7 = book4.isPurchasable();
        book4.setPurchasable("User: userType=null, email=null, password=null]");
        java.lang.String str10 = book4.getTitle();
        java.lang.String str11 = book4.getRentable();
        book4.setLocation("false");
        student3.addBookItem(book4);
        java.lang.String str15 = book4.getTitle();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "false" + "'", str6.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "false" + "'", str11.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test429");
        library.Faculty faculty3 = new library.Faculty("", "false", "false");
        faculty3.setEmail("User: userType=, email=User: userType=null, email=null, password=null], password=false]");
        library.Request request11 = new library.Request((library.User) faculty3, "false", "User: userType=null, email=null, password=null]", "hi!", "User: userType=, email=User: userType=null, email=null, password=null], password=false]", true);
        java.util.ArrayList<library.Book> bookList12 = faculty3.getBookItems();
        java.lang.String str13 = faculty3.getuserType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test430");
        java.util.Date date5 = null;
        java.util.Date date6 = null;
        library.UserType userType7 = new library.UserType();
        library.Request request13 = new library.Request((library.User) userType7, "", "", "hi!", "", false);
        library.CD cD19 = new library.CD("", "hi!", "", "", true, date5, date6, (library.User) userType7, "hi!", (java.lang.Double) 1.0d, "hi!", "", "hi!");
        cD19.setEdition("");
        cD19.setPurchasable("");
        library.Admin admin27 = new library.Admin("false", "false", "false");
        cD19.setOwner((library.User) admin27);
        java.util.Date date29 = cD19.getLostDate();
        java.lang.Double double30 = cD19.getCost();
        java.util.Date date31 = null;
        cD19.setLostDate(date31);
        java.lang.Double double33 = cD19.getCost();
        java.lang.String str34 = cD19.getRentable();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 1.0d + "'", double30.equals(1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 1.0d + "'", double33.equals(1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "true" + "'", str34.equals("true"));
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test431");
        library.Faculty faculty3 = new library.Faculty("User: userType=null, email=null, password=null]", "", "true");
        library.MaintainCourses maintainCourses4 = new library.MaintainCourses();
        library.MaintainCoursesProxy maintainCoursesProxy5 = new library.MaintainCoursesProxy();
        library.Course[] courseArray6 = new library.Course[] {};
        java.util.ArrayList<library.Course> courseList7 = new java.util.ArrayList<library.Course>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<library.Course>) courseList7, courseArray6);
        maintainCoursesProxy5.setCourses((java.util.List<library.Course>) courseList7);
        java.util.List<library.Course> courseList10 = maintainCoursesProxy5.getCourses();
        library.Course course11 = null;
        library.Course course12 = maintainCoursesProxy5.getCourse(course11);
        library.Course course13 = new library.Course();
        java.util.ArrayList<library.User> userList14 = course13.getStudents();
        java.util.Date date20 = null;
        java.util.Date date21 = null;
        library.UserType userType22 = new library.UserType();
        library.Request request28 = new library.Request((library.User) userType22, "", "", "hi!", "", false);
        library.CD cD34 = new library.CD("", "hi!", "", "", true, date20, date21, (library.User) userType22, "hi!", (java.lang.Double) 1.0d, "hi!", "", "hi!");
        boolean boolean35 = cD34.getIfLost();
        course13.setTextbooks((library.Item) cD34);
        java.util.Date date37 = course13.getEndDate();
        maintainCoursesProxy5.addCourse(course13);
        java.util.Date date39 = course13.getEndDate();
        library.Course course40 = maintainCourses4.getCourse(course13);
        faculty3.addCourse(course13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(courseArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(courseList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(course12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(userList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(course40);
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test432");
        library.MaintainRequestsProxy maintainRequestsProxy0 = new library.MaintainRequestsProxy();
        library.UserType userType1 = new library.UserType();
        library.Request request7 = new library.Request((library.User) userType1, "", "", "hi!", "", false);
        library.User user8 = request7.getUser();
        java.lang.String str9 = request7.getItemType();
        java.lang.String str10 = maintainRequestsProxy0.notifyPriority(request7);
        library.UserType userType11 = new library.UserType();
        library.Request request17 = new library.Request((library.User) userType11, "", "", "hi!", "", false);
        library.User user18 = request17.getUser();
        java.util.Date date24 = null;
        java.util.Date date25 = null;
        library.UserType userType26 = new library.UserType();
        library.Request request32 = new library.Request((library.User) userType26, "", "", "hi!", "", false);
        library.CD cD38 = new library.CD("", "hi!", "", "", true, date24, date25, (library.User) userType26, "hi!", (java.lang.Double) 1.0d, "hi!", "", "hi!");
        java.lang.String str39 = userType26.toString();
        request17.setUser((library.User) userType26);
        request17.setItemType("User: userType=false, email=false, password=false]");
        maintainRequestsProxy0.confirmReq(request17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "User: userType=null, email=null, password=null]" + "'", str39.equals("User: userType=null, email=null, password=null]"));
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test433");
        java.util.Date date5 = null;
        java.util.Date date6 = null;
        library.UserType userType7 = new library.UserType();
        library.Request request13 = new library.Request((library.User) userType7, "", "", "hi!", "", false);
        library.CD cD19 = new library.CD("", "hi!", "", "", true, date5, date6, (library.User) userType7, "hi!", (java.lang.Double) 1.0d, "hi!", "", "hi!");
        cD19.setEdition("");
        cD19.setPurchasable("");
        cD19.setOnDiscount("hi!");
        cD19.setPurchasable("true");
        boolean boolean28 = cD19.isRentable();
        java.util.Date date29 = null;
        cD19.considerIfLost(date29);
        java.util.Date date31 = cD19.getBorrowedDate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date31);
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test434");
        library.Admin admin3 = new library.Admin("hi!", "false", "false");
        java.lang.String str4 = admin3.getPassword();
        java.util.ArrayList<library.Request> requestList5 = null;
        admin3.setRequestList(requestList5);
        java.util.Date date12 = null;
        java.util.Date date13 = null;
        library.User user14 = null;
        library.Magazine magazine20 = new library.Magazine("", "hi!", "", "", true, date12, date13, user14, "", (java.lang.Double) (-1.0d), "", "hi!", "");
        java.lang.Double double21 = magazine20.getCost();
        java.util.Date date22 = null;
        magazine20.setLostDate(date22);
        admin3.addItem((library.Item) magazine20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "false" + "'", str4.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-1.0d) + "'", double21.equals((-1.0d)));
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test435");
        library.Course course0 = new library.Course();
        java.util.ArrayList<library.User> userList1 = course0.getStudents();
        java.util.Date date7 = null;
        java.util.Date date8 = null;
        library.UserType userType9 = new library.UserType();
        library.Request request15 = new library.Request((library.User) userType9, "", "", "hi!", "", false);
        library.CD cD21 = new library.CD("", "hi!", "", "", true, date7, date8, (library.User) userType9, "hi!", (java.lang.Double) 1.0d, "hi!", "", "hi!");
        boolean boolean22 = cD21.getIfLost();
        course0.setTextbooks((library.Item) cD21);
        java.util.Date date24 = course0.getEndDate();
        java.util.Date date30 = null;
        java.util.Date date31 = null;
        library.UserType userType32 = new library.UserType();
        library.Request request38 = new library.Request((library.User) userType32, "", "", "hi!", "", false);
        library.CD cD44 = new library.CD("", "hi!", "", "", true, date30, date31, (library.User) userType32, "hi!", (java.lang.Double) 1.0d, "hi!", "", "hi!");
        cD44.setEdition("");
        cD44.setPurchasable("");
        library.Admin admin52 = new library.Admin("false", "false", "false");
        cD44.setOwner((library.User) admin52);
        course0.professorFaculty = admin52;
        java.util.Date date55 = null;
        course0.setStartDate(date55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(userList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date24);
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test436");
        java.util.Date date5 = null;
        java.util.Date date6 = null;
        library.User user7 = null;
        library.Magazine magazine13 = new library.Magazine("", "hi!", "", "", true, date5, date6, user7, "", (java.lang.Double) (-1.0d), "", "hi!", "");
        java.lang.Double double14 = magazine13.getCost();
        boolean boolean15 = magazine13.isPurchasable();
        java.lang.Double double16 = magazine13.getCost();
        boolean boolean17 = magazine13.isRentable();
        library.Student student21 = new library.Student("false", "true", "");
        magazine13.setOwner((library.User) student21);
        library.Book book23 = new library.Book();
        boolean boolean24 = book23.getIfLost();
        java.lang.String str25 = book23.getOnDiscount();
        student21.addBookItem(book23);
        java.lang.String str27 = student21.getEmail();
        java.util.ArrayList<library.Course> courseList28 = student21.getCourses();
        library.MaintainCourses maintainCourses29 = new library.MaintainCourses();
        library.Course course30 = null;
        library.Course course31 = maintainCourses29.getCourse(course30);
        library.Course course32 = new library.Course();
        java.util.ArrayList<library.User> userList33 = course32.getStudents();
        java.util.Date date39 = null;
        java.util.Date date40 = null;
        library.UserType userType41 = new library.UserType();
        library.Request request47 = new library.Request((library.User) userType41, "", "", "hi!", "", false);
        library.CD cD53 = new library.CD("", "hi!", "", "", true, date39, date40, (library.User) userType41, "hi!", (java.lang.Double) 1.0d, "hi!", "", "hi!");
        boolean boolean54 = cD53.getIfLost();
        course32.setTextbooks((library.Item) cD53);
        java.util.Date date56 = course32.getEndDate();
        java.util.Date date62 = null;
        java.util.Date date63 = null;
        library.UserType userType64 = new library.UserType();
        library.Request request70 = new library.Request((library.User) userType64, "", "", "hi!", "", false);
        library.CD cD76 = new library.CD("", "hi!", "", "", true, date62, date63, (library.User) userType64, "hi!", (java.lang.Double) 1.0d, "hi!", "", "hi!");
        cD76.setEdition("");
        cD76.setPurchasable("");
        library.Admin admin84 = new library.Admin("false", "false", "false");
        cD76.setOwner((library.User) admin84);
        course32.professorFaculty = admin84;
        library.Course course87 = maintainCourses29.getCourse(course32);
        java.lang.String str88 = course32.getCourseCode();
        java.util.ArrayList<library.User> userList89 = course32.students;
        student21.addCourse(course32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "false" + "'", str25.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "true" + "'", str27.equals("true"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(courseList28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(course31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(userList33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(course87);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str88);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(userList89);
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test437");
        java.util.Date date5 = null;
        java.util.Date date6 = null;
        library.UserType userType7 = new library.UserType();
        library.Request request13 = new library.Request((library.User) userType7, "", "", "hi!", "", false);
        library.CD cD19 = new library.CD("", "hi!", "", "", true, date5, date6, (library.User) userType7, "hi!", (java.lang.Double) 1.0d, "hi!", "", "hi!");
        cD19.setEdition("");
        cD19.setPurchasable("");
        cD19.setOnDiscount("hi!");
        cD19.setPurchasable("true");
        boolean boolean28 = cD19.isRentable();
        java.lang.Double double29 = cD19.getCost();
        java.util.Date date35 = null;
        java.util.Date date36 = null;
        library.UserType userType37 = new library.UserType();
        library.Request request43 = new library.Request((library.User) userType37, "", "", "hi!", "", false);
        library.CD cD49 = new library.CD("", "hi!", "", "", true, date35, date36, (library.User) userType37, "hi!", (java.lang.Double) 1.0d, "hi!", "", "hi!");
        cD49.setEdition("");
        cD49.setPurchasable("");
        library.Admin admin57 = new library.Admin("false", "false", "false");
        cD49.setOwner((library.User) admin57);
        java.util.List<library.Item> itemList59 = admin57.getItems();
        cD19.setOwner((library.User) admin57);
        java.util.Date date66 = null;
        java.util.Date date67 = null;
        library.User user68 = null;
        library.Magazine magazine74 = new library.Magazine("", "hi!", "", "", true, date66, date67, user68, "", (java.lang.Double) (-1.0d), "", "hi!", "");
        java.lang.Double double75 = magazine74.getCost();
        boolean boolean76 = magazine74.isPurchasable();
        java.lang.Double double77 = magazine74.getCost();
        boolean boolean78 = magazine74.isRentable();
        library.Student student82 = new library.Student("false", "true", "");
        magazine74.setOwner((library.User) student82);
        library.Book book84 = new library.Book();
        boolean boolean85 = book84.getIfLost();
        java.lang.String str86 = book84.getOnDiscount();
        student82.addBookItem(book84);
        admin57.enableItem((library.Item) book84);
        book84.setLost(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 1.0d + "'", double29.equals(1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(itemList59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + (-1.0d) + "'", double75.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + (-1.0d) + "'", double77.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str86 + "' != '" + "false" + "'", str86.equals("false"));
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test438");
        library.Book book0 = new library.Book();
        java.util.Date date1 = null;
        book0.considerIfLost(date1);
        book0.setItemType("User: userType=null, email=, password=null]");
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test439");
        java.util.Date date5 = null;
        java.util.Date date6 = null;
        library.User user7 = null;
        library.Magazine magazine13 = new library.Magazine("", "hi!", "", "", true, date5, date6, user7, "", (java.lang.Double) (-1.0d), "", "hi!", "");
        magazine13.setPublisher("true");
        boolean boolean16 = magazine13.getIfLost();
        java.lang.String str17 = magazine13.getID();
        java.lang.String str18 = magazine13.getTitle();
        magazine13.setCost((java.lang.Double) (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test440");
        library.MaintainUserProxy maintainUserProxy0 = new library.MaintainUserProxy();
        java.util.List<library.User> userList1 = maintainUserProxy0.getUsers();
        java.util.Date date7 = null;
        java.util.Date date8 = null;
        java.util.Date date14 = null;
        java.util.Date date15 = null;
        library.UserType userType16 = new library.UserType();
        library.Request request22 = new library.Request((library.User) userType16, "", "", "hi!", "", false);
        library.CD cD28 = new library.CD("", "hi!", "", "", true, date14, date15, (library.User) userType16, "hi!", (java.lang.Double) 1.0d, "hi!", "", "hi!");
        cD28.setEdition("");
        cD28.setPurchasable("");
        library.Admin admin36 = new library.Admin("false", "false", "false");
        cD28.setOwner((library.User) admin36);
        java.lang.String str38 = admin36.getPassword();
        java.util.ArrayList<library.Request> requestList39 = admin36.getRequestList();
        admin36.handleRequests();
        library.CD cD46 = new library.CD("true", "hi!", "", "User: userType=null, email=null, password=null]", false, date7, date8, (library.User) admin36, "", (java.lang.Double) 10.0d, "", "true", "");
        java.util.Date date52 = null;
        java.util.Date date53 = null;
        library.User user54 = null;
        library.Magazine magazine60 = new library.Magazine("", "hi!", "", "", true, date52, date53, user54, "", (java.lang.Double) (-1.0d), "", "hi!", "");
        java.lang.Double double61 = magazine60.getCost();
        boolean boolean62 = magazine60.isPurchasable();
        java.lang.Double double63 = magazine60.getCost();
        java.lang.String str64 = magazine60.getRentable();
        java.lang.String str65 = magazine60.getRentable();
        admin36.addItem((library.Item) magazine60);
        maintainUserProxy0.addUser((library.User) admin36);
        library.Nonfaculty nonfaculty68 = new library.Nonfaculty();
        java.lang.String str69 = nonfaculty68.getuserType();
        java.lang.String str70 = nonfaculty68.toString();
        maintainUserProxy0.addUser((library.User) nonfaculty68);
        maintainUserProxy0.load("User: userType=null, email=null, password=User: userType=true, email=User: userType=, email=User: userType=null, email=null, password=null], password=false], password=null]]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "false" + "'", str38.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(requestList39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + (-1.0d) + "'", double61.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + (-1.0d) + "'", double63.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str64 + "' != '" + "true" + "'", str64.equals("true"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str65 + "' != '" + "true" + "'", str65.equals("true"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str69);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str70 + "' != '" + "User: userType=null, email=null, password=null]" + "'", str70.equals("User: userType=null, email=null, password=null]"));
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test441");
        java.util.Date date5 = null;
        java.util.Date date6 = null;
        library.User user7 = null;
        library.Magazine magazine13 = new library.Magazine("", "hi!", "", "", true, date5, date6, user7, "", (java.lang.Double) (-1.0d), "", "hi!", "");
        java.lang.Double double14 = magazine13.getCost();
        boolean boolean15 = magazine13.isPurchasable();
        java.lang.Double double16 = magazine13.getCost();
        java.lang.String str17 = magazine13.getPurchasable();
        magazine13.setItemType("User: userType=null, email=null, password=null]");
        library.Student student20 = new library.Student();
        java.util.ArrayList<library.Book> bookList21 = student20.getBookItems();
        magazine13.setOwner((library.User) student20);
        magazine13.setLocation("User: userType=, email=User: userType=null, email=null, password=null], password=false]");
        magazine13.setRentable("User: userType=null, email=, password=null]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "false" + "'", str17.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookList21);
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test442");
        library.Faculty faculty3 = new library.Faculty("", "false", "false");
        faculty3.setEmail("User: userType=, email=User: userType=null, email=null, password=null], password=false]");
        library.Request request11 = new library.Request((library.User) faculty3, "false", "User: userType=null, email=null, password=null]", "hi!", "User: userType=, email=User: userType=null, email=null, password=null], password=false]", true);
        java.util.ArrayList<library.Book> bookList12 = faculty3.getBookItems();
        java.util.ArrayList<library.Book> bookList13 = faculty3.getBookItems();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookList13);
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test443");
        library.MaintainCourses maintainCourses0 = new library.MaintainCourses();
        java.util.List<library.Course> courseList1 = maintainCourses0.getCourses();
        library.Course course2 = new library.Course();
        library.Course course3 = maintainCourses0.getCourse(course2);
        java.util.List<library.Course> courseList4 = maintainCourses0.getCourses();
        library.MaintainCoursesProxy maintainCoursesProxy5 = new library.MaintainCoursesProxy();
        java.util.List<library.Course> courseList6 = maintainCoursesProxy5.getCourses();
        library.MaintainCoursesProxy maintainCoursesProxy7 = new library.MaintainCoursesProxy();
        library.Course[] courseArray8 = new library.Course[] {};
        java.util.ArrayList<library.Course> courseList9 = new java.util.ArrayList<library.Course>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<library.Course>) courseList9, courseArray8);
        maintainCoursesProxy7.setCourses((java.util.List<library.Course>) courseList9);
        maintainCoursesProxy5.setCourses((java.util.List<library.Course>) courseList9);
        library.Course course13 = new library.Course();
        java.util.Date date14 = course13.endDate;
        library.Course course15 = maintainCoursesProxy5.getCourse(course13);
        maintainCourses0.addCourse(course13);
        library.Item item17 = null;
        course13.textbooks = item17;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(courseList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(course3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(courseList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(courseList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(courseArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(course15);
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test444");
        library.UserType userType0 = new library.UserType();
        library.Request request6 = new library.Request((library.User) userType0, "", "", "hi!", "", false);
        library.User user7 = request6.getUser();
        java.util.Date date13 = null;
        java.util.Date date14 = null;
        library.UserType userType15 = new library.UserType();
        library.Request request21 = new library.Request((library.User) userType15, "", "", "hi!", "", false);
        library.CD cD27 = new library.CD("", "hi!", "", "", true, date13, date14, (library.User) userType15, "hi!", (java.lang.Double) 1.0d, "hi!", "", "hi!");
        java.lang.String str28 = userType15.toString();
        request6.setUser((library.User) userType15);
        request6.setItemType("User: userType=false, email=false, password=false]");
        library.Nonfaculty nonfaculty32 = new library.Nonfaculty();
        java.lang.String str33 = nonfaculty32.getuserType();
        java.lang.String str34 = nonfaculty32.toString();
        request6.setUser((library.User) nonfaculty32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "User: userType=null, email=null, password=null]" + "'", str28.equals("User: userType=null, email=null, password=null]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "User: userType=null, email=null, password=null]" + "'", str34.equals("User: userType=null, email=null, password=null]"));
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test445");
        library.Student student3 = new library.Student("false", "true", "");
        java.util.ArrayList<library.Course> courseList4 = student3.getCourses();
        java.lang.String str5 = student3.getEmail();
        java.util.ArrayList<library.Book> bookList6 = student3.getBookItems();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(courseList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "true" + "'", str5.equals("true"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookList6);
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test446");
        library.MaintainNewsletterProxy maintainNewsletterProxy0 = new library.MaintainNewsletterProxy();
        library.NewsletterSystem newsletterSystem2 = maintainNewsletterProxy0.getItemByName("true");
        maintainNewsletterProxy0.load("User: userType=, email=User: userType=null, email=null, password=null], password=false]");
        java.util.List<library.NewsletterSystem> newsletterSystemList5 = maintainNewsletterProxy0.getNews();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(newsletterSystem2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(newsletterSystemList5);
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test447");
        library.Facade facade0 = new library.Facade();
        boolean boolean2 = facade0.passwordValid("User: userType=null, email=null, password=null]");
        library.User user3 = facade0.getUser();
        library.User user4 = facade0.getUser();
        java.lang.String str8 = facade0.makeUser("false", "User: userType=false, email=false, password=User: userType=null, email=null, password=null]]", "User: userType=false, email=false, password=false]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "<html>Pick one of the following user types:<br/>student, faculty, non-faculty, or visitor</html>" + "'", str8.equals("<html>Pick one of the following user types:<br/>student, faculty, non-faculty, or visitor</html>"));
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test448");
        library.Faculty faculty3 = new library.Faculty("", "false", "false");
        library.Book book4 = new library.Book();
        boolean boolean5 = book4.getIfLost();
        java.lang.String str6 = book4.getOnDiscount();
        java.lang.String str7 = book4.getPublisher();
        faculty3.addBookItem(book4);
        java.util.ArrayList<library.Course> courseList9 = faculty3.getCourses();
        library.Book book10 = null;
        faculty3.addBookItem(book10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "false" + "'", str6.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(courseList9);
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test449");
        java.util.Date date5 = null;
        java.util.Date date6 = null;
        library.UserType userType7 = new library.UserType();
        library.Request request13 = new library.Request((library.User) userType7, "", "", "hi!", "", false);
        library.CD cD19 = new library.CD("", "hi!", "", "", true, date5, date6, (library.User) userType7, "hi!", (java.lang.Double) 1.0d, "hi!", "", "hi!");
        cD19.setEdition("");
        cD19.setPurchasable("");
        java.lang.String str24 = cD19.getEdition();
        java.lang.String str25 = cD19.getTitle();
        boolean boolean26 = cD19.isRentable();
        java.lang.String str27 = cD19.getEdition();
        cD19.setCost((java.lang.Double) 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "" + "'", str24.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!" + "'", str25.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "" + "'", str27.equals(""));
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test450");
        java.util.Date date5 = null;
        java.util.Date date6 = null;
        java.util.Date date12 = null;
        java.util.Date date13 = null;
        library.Admin admin17 = new library.Admin("false", "false", "false");
        java.lang.String str18 = admin17.getPassword();
        library.CD cD24 = new library.CD("", "true", "false", "true", false, date12, date13, (library.User) admin17, "hi!", (java.lang.Double) 0.0d, "true", "hi!", "");
        library.CD cD30 = new library.CD("", "", "hi!", "User: userType=false, email=false, password=User: userType=null, email=null, password=null]]", true, date5, date6, (library.User) admin17, "true", (java.lang.Double) 0.0d, "false", "User: userType=true, email=User: userType=, email=User: userType=null, email=null, password=null], password=false], password=null]", "User: userType=true, email=false, password=User: userType=null, email=null, password=null]]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "false" + "'", str18.equals("false"));
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test451");
        library.Nonfaculty nonfaculty0 = new library.Nonfaculty();
        java.lang.String str1 = nonfaculty0.getuserType();
        library.Request request7 = new library.Request((library.User) nonfaculty0, "", "false", "hi!", "false", true);
        java.lang.String str8 = nonfaculty0.getPassword();
        java.lang.String str9 = nonfaculty0.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test452");
        java.util.Date date5 = null;
        java.util.Date date6 = null;
        java.util.Date date12 = null;
        java.util.Date date13 = null;
        library.UserType userType14 = new library.UserType();
        library.Request request20 = new library.Request((library.User) userType14, "", "", "hi!", "", false);
        library.CD cD26 = new library.CD("", "hi!", "", "", true, date12, date13, (library.User) userType14, "hi!", (java.lang.Double) 1.0d, "hi!", "", "hi!");
        cD26.setEdition("");
        cD26.setPurchasable("");
        library.Admin admin34 = new library.Admin("false", "false", "false");
        cD26.setOwner((library.User) admin34);
        java.lang.String str36 = admin34.getPassword();
        java.util.ArrayList<library.Request> requestList37 = admin34.getRequestList();
        admin34.handleRequests();
        library.CD cD44 = new library.CD("true", "hi!", "", "User: userType=null, email=null, password=null]", false, date5, date6, (library.User) admin34, "", (java.lang.Double) 10.0d, "", "true", "");
        admin34.setEmail("false");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "false" + "'", str36.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(requestList37);
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test453");
        java.util.Date date5 = null;
        java.util.Date date6 = null;
        library.UserType userType7 = new library.UserType();
        library.Request request13 = new library.Request((library.User) userType7, "", "", "hi!", "", false);
        library.CD cD19 = new library.CD("", "hi!", "", "", true, date5, date6, (library.User) userType7, "hi!", (java.lang.Double) 1.0d, "hi!", "", "hi!");
        java.lang.String str20 = cD19.getPurchasable();
        cD19.setItemType("User: userType=true, email=User: userType=, email=User: userType=null, email=null, password=null], password=false], password=null]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "false" + "'", str20.equals("false"));
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test454");
        java.util.Date date5 = null;
        java.util.Date date6 = null;
        library.User user7 = null;
        library.Magazine magazine13 = new library.Magazine("", "hi!", "", "", true, date5, date6, user7, "", (java.lang.Double) (-1.0d), "", "hi!", "");
        java.lang.Double double14 = magazine13.getCost();
        magazine13.setPurchasable("hi!");
        java.lang.String str17 = magazine13.getEdition();
        magazine13.setPublisher("User: userType=false, email=false, password=false]");
        magazine13.setEdition("User: userType=false, email=false, password=false]");
        boolean boolean22 = magazine13.getIfLost();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test455");
        java.util.Date date5 = null;
        java.util.Date date6 = null;
        library.User user7 = null;
        library.Magazine magazine13 = new library.Magazine("", "hi!", "", "", true, date5, date6, user7, "", (java.lang.Double) (-1.0d), "", "hi!", "");
        java.lang.Double double14 = magazine13.getCost();
        boolean boolean15 = magazine13.isPurchasable();
        java.util.Date date16 = magazine13.getBorrowedDate();
        boolean boolean17 = magazine13.getIfLost();
        magazine13.setPublisher("User: userType=null, email=, password=null]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test456");
        java.util.Date date5 = null;
        java.util.Date date6 = null;
        library.User user7 = null;
        library.Magazine magazine13 = new library.Magazine("", "hi!", "", "", true, date5, date6, user7, "", (java.lang.Double) (-1.0d), "", "hi!", "");
        java.lang.Double double14 = magazine13.getCost();
        boolean boolean15 = magazine13.isPurchasable();
        java.lang.Double double16 = magazine13.getCost();
        java.lang.String str17 = magazine13.getRentable();
        magazine13.setRentable("true");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "true" + "'", str17.equals("true"));
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test457");
        java.util.Date date5 = null;
        java.util.Date date6 = null;
        library.User user7 = null;
        library.Magazine magazine13 = new library.Magazine("", "hi!", "", "", true, date5, date6, user7, "", (java.lang.Double) (-1.0d), "", "hi!", "");
        java.lang.Double double14 = magazine13.getCost();
        boolean boolean15 = magazine13.isPurchasable();
        java.util.Date date16 = magazine13.getBorrowedDate();
        magazine13.setLocation("User: userType=null, email=null, password=null]");
        magazine13.setTitle("User: userType=true, email=User: userType=, email=User: userType=null, email=null, password=null], password=false], password=null]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date16);
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test458");
        library.Faculty faculty3 = new library.Faculty("", "false", "false");
        faculty3.setEmail("User: userType=, email=User: userType=null, email=null, password=null], password=false]");
        faculty3.setPassword("hi!");
        java.util.ArrayList<library.Course> courseList8 = faculty3.getCourses();
        java.lang.String str9 = faculty3.getEmail();
        faculty3.setUserType("User: userType=null, email=null, password=User: userType=true, email=User: userType=, email=User: userType=null, email=null, password=null], password=false], password=null]]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(courseList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "User: userType=, email=User: userType=null, email=null, password=null], password=false]" + "'", str9.equals("User: userType=, email=User: userType=null, email=null, password=null], password=false]"));
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test459");
        library.NewsletterSystem newsletterSystem2 = new library.NewsletterSystem("true", "User: userType=null, email=null, password=null]");
        java.lang.String str3 = newsletterSystem2.getWebsite();
        newsletterSystem2.setWebsite("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "User: userType=null, email=null, password=null]" + "'", str3.equals("User: userType=null, email=null, password=null]"));
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test460");
        library.Book book0 = new library.Book();
        boolean boolean1 = book0.getIfLost();
        java.lang.String str2 = book0.getItemType();
        book0.setID("true");
        java.util.Date date5 = null;
        // The following exception was thrown during execution in test generation
        try {
            book0.calcCost(date5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test461");
        java.util.Date date5 = null;
        java.util.Date date6 = null;
        library.UserType userType7 = new library.UserType();
        library.Request request13 = new library.Request((library.User) userType7, "", "", "hi!", "", false);
        library.CD cD19 = new library.CD("", "hi!", "", "", true, date5, date6, (library.User) userType7, "hi!", (java.lang.Double) 1.0d, "hi!", "", "hi!");
        cD19.setEdition("");
        cD19.setPurchasable("");
        java.lang.String str24 = cD19.getEdition();
        java.lang.String str25 = cD19.getTitle();
        java.lang.String str26 = cD19.getOnDiscount();
        java.lang.String str27 = cD19.getItemType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "" + "'", str24.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!" + "'", str25.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "false" + "'", str26.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "" + "'", str27.equals(""));
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test462");
        java.util.Date date5 = null;
        java.util.Date date6 = null;
        library.Student student7 = new library.Student();
        java.lang.String str8 = student7.getuserType();
        library.Book book14 = new library.Book("true", "hi!", "hi!", "false", false, date5, date6, (library.User) student7, "", (java.lang.Double) 1.0d, "hi!", "", "");
        student7.setEmail("true");
        library.Request request22 = new library.Request((library.User) student7, "User: userType=true, email=false, password=User: userType=null, email=null, password=null]]", "User: userType=true, email=User: userType=, email=User: userType=null, email=null, password=null], password=false], password=null]", "", "true", false);
        boolean boolean23 = request22.isCompletion();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test463");
        library.Book book0 = new library.Book();
        boolean boolean1 = book0.getIfLost();
        java.lang.String str2 = book0.getItemType();
        book0.setCost((java.lang.Double) 0.0d);
        java.lang.String str5 = book0.getRentable();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "false" + "'", str5.equals("false"));
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test464");
        java.util.Date date5 = null;
        java.util.Date date6 = null;
        library.UserType userType7 = new library.UserType();
        library.Request request13 = new library.Request((library.User) userType7, "", "", "hi!", "", false);
        library.Book book19 = new library.Book("false", "true", "true", "User: userType=null, email=null, password=null]", true, date5, date6, (library.User) userType7, "true", (java.lang.Double) 0.0d, "User: userType=null, email=null, password=null]", "true", "false");
        java.util.Date date20 = book19.getLostDate();
        java.lang.Double double21 = book19.getCost();
        java.lang.String str22 = book19.getTitle();
        book19.setOnDiscount("User: userType=true, email=false, password=User: userType=null, email=null, password=null]]");
        java.lang.String str25 = book19.getID();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "true" + "'", str22.equals("true"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "true" + "'", str25.equals("true"));
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test465");
        java.util.Date date5 = null;
        java.util.Date date6 = null;
        library.UserType userType7 = new library.UserType();
        library.Request request13 = new library.Request((library.User) userType7, "", "", "hi!", "", false);
        library.CD cD19 = new library.CD("", "hi!", "", "", true, date5, date6, (library.User) userType7, "hi!", (java.lang.Double) 1.0d, "hi!", "", "hi!");
        cD19.setEdition("");
        cD19.setPurchasable("");
        java.lang.String str24 = cD19.getRentable();
        boolean boolean25 = cD19.isOnDiscount();
        java.lang.String str26 = cD19.getRentable();
        java.util.Date date27 = cD19.getDueDate();
        cD19.setLost(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "true" + "'", str24.equals("true"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "true" + "'", str26.equals("true"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date27);
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test466");
        java.util.Date date5 = null;
        java.util.Date date6 = null;
        library.Admin admin10 = new library.Admin("false", "false", "false");
        java.lang.String str11 = admin10.getPassword();
        library.CD cD17 = new library.CD("", "true", "false", "true", false, date5, date6, (library.User) admin10, "hi!", (java.lang.Double) 0.0d, "true", "hi!", "");
        java.lang.String str18 = cD17.getPublisher();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "false" + "'", str11.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test467");
        java.util.Date date5 = null;
        java.util.Date date6 = null;
        library.User user7 = null;
        library.Magazine magazine13 = new library.Magazine("", "hi!", "", "", true, date5, date6, user7, "", (java.lang.Double) (-1.0d), "", "hi!", "");
        java.lang.Double double14 = magazine13.getCost();
        boolean boolean15 = magazine13.isPurchasable();
        java.lang.Double double16 = magazine13.getCost();
        boolean boolean17 = magazine13.isRentable();
        library.Student student21 = new library.Student("false", "true", "");
        magazine13.setOwner((library.User) student21);
        library.Book book23 = new library.Book();
        boolean boolean24 = book23.getIfLost();
        java.lang.String str25 = book23.getOnDiscount();
        student21.addBookItem(book23);
        library.Faculty faculty30 = new library.Faculty("", "false", "false");
        faculty30.setEmail("User: userType=null, email=null, password=null]");
        java.lang.String str33 = faculty30.toString();
        book23.setOwner((library.User) faculty30);
        faculty30.setPassword("true");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "false" + "'", str25.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "User: userType=, email=User: userType=null, email=null, password=null], password=false]" + "'", str33.equals("User: userType=, email=User: userType=null, email=null, password=null], password=false]"));
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test468");
        library.MaintainSubscriptionsProxy maintainSubscriptionsProxy0 = new library.MaintainSubscriptionsProxy();
        library.MaintainSubscriptionsProxy maintainSubscriptionsProxy1 = new library.MaintainSubscriptionsProxy();
        library.Subscription subscription2 = new library.Subscription();
        java.lang.String str3 = subscription2.getSite();
        subscription2.setSite("");
        java.util.Date date13 = null;
        java.util.Date date14 = null;
        library.UserType userType15 = new library.UserType();
        library.Request request21 = new library.Request((library.User) userType15, "", "", "hi!", "", false);
        library.Book book27 = new library.Book("false", "true", "true", "User: userType=null, email=null, password=null]", true, date13, date14, (library.User) userType15, "true", (java.lang.Double) 0.0d, "User: userType=null, email=null, password=null]", "true", "false");
        library.Subscription subscription29 = new library.Subscription("false", "false", (library.User) userType15, true);
        java.lang.String str30 = subscription29.isStatus();
        library.Subscription subscription31 = new library.Subscription();
        java.lang.String str32 = subscription31.getSite();
        subscription31.setSite("");
        library.Subscription subscription35 = new library.Subscription();
        java.lang.String str36 = subscription35.getSite();
        subscription35.setSite("");
        library.Subscription[] subscriptionArray39 = new library.Subscription[] { subscription2, subscription29, subscription31, subscription35 };
        java.util.ArrayList<library.Subscription> subscriptionList40 = new java.util.ArrayList<library.Subscription>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<library.Subscription>) subscriptionList40, subscriptionArray39);
        maintainSubscriptionsProxy1.setSubs((java.util.List<library.Subscription>) subscriptionList40);
        maintainSubscriptionsProxy0.setSubs((java.util.List<library.Subscription>) subscriptionList40);
        java.util.Date date51 = null;
        java.util.Date date52 = null;
        library.UserType userType53 = new library.UserType();
        library.Request request59 = new library.Request((library.User) userType53, "", "", "hi!", "", false);
        library.Book book65 = new library.Book("false", "true", "true", "User: userType=null, email=null, password=null]", true, date51, date52, (library.User) userType53, "true", (java.lang.Double) 0.0d, "User: userType=null, email=null, password=null]", "true", "false");
        library.Subscription subscription67 = new library.Subscription("false", "false", (library.User) userType53, true);
        maintainSubscriptionsProxy0.addSub(subscription67);
        java.lang.String str69 = subscription67.getSite();
        java.lang.String str70 = subscription67.getCompanyName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "true" + "'", str30.equals("true"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(subscriptionArray39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str69 + "' != '" + "false" + "'", str69.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str70 + "' != '" + "false" + "'", str70.equals("false"));
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test469");
        java.util.Date date5 = null;
        java.util.Date date6 = null;
        library.Course course7 = new library.Course();
        java.util.ArrayList<library.User> userList8 = course7.getStudents();
        java.util.Date date14 = null;
        java.util.Date date15 = null;
        library.UserType userType16 = new library.UserType();
        library.Request request22 = new library.Request((library.User) userType16, "", "", "hi!", "", false);
        library.CD cD28 = new library.CD("", "hi!", "", "", true, date14, date15, (library.User) userType16, "hi!", (java.lang.Double) 1.0d, "hi!", "", "hi!");
        boolean boolean29 = cD28.getIfLost();
        course7.setTextbooks((library.Item) cD28);
        java.util.Date date31 = course7.getEndDate();
        java.util.Date date37 = null;
        java.util.Date date38 = null;
        library.UserType userType39 = new library.UserType();
        library.Request request45 = new library.Request((library.User) userType39, "", "", "hi!", "", false);
        library.CD cD51 = new library.CD("", "hi!", "", "", true, date37, date38, (library.User) userType39, "hi!", (java.lang.Double) 1.0d, "hi!", "", "hi!");
        cD51.setEdition("");
        cD51.setPurchasable("");
        library.Admin admin59 = new library.Admin("false", "false", "false");
        cD51.setOwner((library.User) admin59);
        course7.professorFaculty = admin59;
        library.Magazine magazine67 = new library.Magazine("true", "User: userType=null, email=, password=null]", "User: userType=null, email=null, password=null]", "User: userType=false, email=true, password=]", false, date5, date6, (library.User) admin59, "hi!", (java.lang.Double) 0.0d, "User: userType=null, email=null, password=null]", "User: userType=, email=User: userType=null, email=null, password=null], password=false]", "false");
        java.util.Date date73 = null;
        java.util.Date date74 = null;
        library.User user75 = null;
        library.Magazine magazine81 = new library.Magazine("", "hi!", "", "", true, date73, date74, user75, "", (java.lang.Double) (-1.0d), "", "hi!", "");
        java.lang.Double double82 = magazine81.getCost();
        boolean boolean83 = magazine81.isPurchasable();
        admin59.enableItem((library.Item) magazine81);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(userList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double82 + "' != '" + (-1.0d) + "'", double82.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test470");
        library.Facade facade0 = new library.Facade();
        boolean boolean2 = facade0.passwordValid("User: userType=null, email=null, password=null]");
        boolean boolean4 = facade0.userTypeValid("false");
        boolean boolean6 = facade0.userTypeValid("User: userType=true, email=User: userType=, email=User: userType=null, email=null, password=null], password=false], password=null]");
        java.lang.String str10 = facade0.makeUser("User: userType=false, email=true, password=]", "", "User: userType=, email=User: userType=null, email=null, password=null], password=false]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "<html>Pick one of the following user types:<br/>student, faculty, non-faculty, or visitor</html>" + "'", str10.equals("<html>Pick one of the following user types:<br/>student, faculty, non-faculty, or visitor</html>"));
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test471");
        library.Nonfaculty nonfaculty0 = new library.Nonfaculty();
        java.lang.String str1 = nonfaculty0.getuserType();
        java.lang.String str2 = nonfaculty0.getuserType();
        java.lang.String str3 = nonfaculty0.getPassword();
        java.lang.String str4 = nonfaculty0.getuserType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test472");
        library.Course course0 = new library.Course();
        java.util.ArrayList<library.User> userList1 = course0.getStudents();
        java.util.Date date7 = null;
        java.util.Date date8 = null;
        library.UserType userType9 = new library.UserType();
        library.Request request15 = new library.Request((library.User) userType9, "", "", "hi!", "", false);
        library.CD cD21 = new library.CD("", "hi!", "", "", true, date7, date8, (library.User) userType9, "hi!", (java.lang.Double) 1.0d, "hi!", "", "hi!");
        boolean boolean22 = cD21.getIfLost();
        course0.setTextbooks((library.Item) cD21);
        java.util.Date date24 = course0.getEndDate();
        library.Student student25 = new library.Student();
        java.util.ArrayList<library.Course> courseList26 = student25.getCourses();
        course0.setFaculty((library.User) student25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(userList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(courseList26);
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test473");
        library.MaintainUserProxy maintainUserProxy0 = new library.MaintainUserProxy();
        java.util.List<library.User> userList1 = maintainUserProxy0.getUsers();
        library.MaintainUserProxy maintainUserProxy2 = new library.MaintainUserProxy();
        java.util.List<library.User> userList3 = maintainUserProxy2.getUsers();
        maintainUserProxy0.setUsers(userList3);
        maintainUserProxy0.load("hi!");
        java.util.List<library.User> userList7 = maintainUserProxy0.getUsers();
        library.Faculty faculty11 = new library.Faculty("", "false", "false");
        faculty11.setEmail("User: userType=, email=User: userType=null, email=null, password=null], password=false]");
        faculty11.setPassword("hi!");
        maintainUserProxy0.addUser((library.User) faculty11);
        java.lang.String str17 = faculty11.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test474");
        java.util.Date date5 = null;
        java.util.Date date6 = null;
        library.Course course7 = new library.Course();
        java.util.ArrayList<library.User> userList8 = course7.getStudents();
        java.util.Date date14 = null;
        java.util.Date date15 = null;
        library.UserType userType16 = new library.UserType();
        library.Request request22 = new library.Request((library.User) userType16, "", "", "hi!", "", false);
        library.CD cD28 = new library.CD("", "hi!", "", "", true, date14, date15, (library.User) userType16, "hi!", (java.lang.Double) 1.0d, "hi!", "", "hi!");
        boolean boolean29 = cD28.getIfLost();
        course7.setTextbooks((library.Item) cD28);
        java.util.Date date31 = course7.getEndDate();
        java.util.Date date37 = null;
        java.util.Date date38 = null;
        library.UserType userType39 = new library.UserType();
        library.Request request45 = new library.Request((library.User) userType39, "", "", "hi!", "", false);
        library.CD cD51 = new library.CD("", "hi!", "", "", true, date37, date38, (library.User) userType39, "hi!", (java.lang.Double) 1.0d, "hi!", "", "hi!");
        cD51.setEdition("");
        cD51.setPurchasable("");
        library.Admin admin59 = new library.Admin("false", "false", "false");
        cD51.setOwner((library.User) admin59);
        course7.professorFaculty = admin59;
        admin59.setUserType("User: userType=false, email=true, password=]");
        library.CD cD69 = new library.CD("hi!", "User: userType=, email=User: userType=null, email=null, password=null], password=false]", "User: userType=false, email=false, password=false]", "", true, date5, date6, (library.User) admin59, "User: userType=null, email=true, password=null]", (java.lang.Double) 0.0d, "false", "User: userType=false, email=true, password=]", "User: userType=false, email=true, password=]");
        java.lang.String str70 = cD69.getItemType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(userList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str70 + "' != '" + "hi!" + "'", str70.equals("hi!"));
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test475");
        library.Student student0 = new library.Student();
        java.lang.String str1 = student0.getuserType();
        java.util.ArrayList<library.Book> bookList2 = student0.getBookItems();
        java.lang.String str3 = student0.getuserType();
        java.lang.Class<?> wildcardClass4 = student0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test476");
        library.Admin admin3 = new library.Admin("hi!", "false", "false");
        java.lang.String str4 = admin3.getuserType();
        java.util.Date date10 = null;
        java.util.Date date11 = null;
        library.UserType userType12 = new library.UserType();
        library.Request request18 = new library.Request((library.User) userType12, "", "", "hi!", "", false);
        library.CD cD24 = new library.CD("", "hi!", "", "", true, date10, date11, (library.User) userType12, "hi!", (java.lang.Double) 1.0d, "hi!", "", "hi!");
        cD24.setEdition("");
        cD24.setPurchasable("");
        java.lang.String str29 = cD24.getEdition();
        java.lang.String str30 = cD24.getTitle();
        boolean boolean31 = cD24.isRentable();
        java.lang.String str32 = cD24.getEdition();
        admin3.addItem((library.Item) cD24);
        java.lang.String str34 = cD24.getEdition();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "" + "'", str29.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "hi!" + "'", str30.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "" + "'", str32.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "" + "'", str34.equals(""));
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test477");
        library.MaintainCoursesProxy maintainCoursesProxy0 = new library.MaintainCoursesProxy();
        java.util.List<library.Course> courseList1 = maintainCoursesProxy0.getCourses();
        library.Course course2 = null;
        maintainCoursesProxy0.addCourse(course2);
        library.Course course4 = new library.Course();
        java.util.ArrayList<library.User> userList5 = course4.getStudents();
        java.util.Date date11 = null;
        java.util.Date date12 = null;
        library.UserType userType13 = new library.UserType();
        library.Request request19 = new library.Request((library.User) userType13, "", "", "hi!", "", false);
        library.CD cD25 = new library.CD("", "hi!", "", "", true, date11, date12, (library.User) userType13, "hi!", (java.lang.Double) 1.0d, "hi!", "", "hi!");
        boolean boolean26 = cD25.getIfLost();
        course4.setTextbooks((library.Item) cD25);
        java.util.Date date28 = course4.getEndDate();
        maintainCoursesProxy0.addCourse(course4);
        java.util.Date date30 = null;
        course4.endDate = date30;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(courseList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(userList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date28);
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test478");
        library.Visitor visitor0 = new library.Visitor();
        java.lang.String str1 = visitor0.getPassword();
        visitor0.setEmail("");
        java.lang.String str4 = visitor0.toString();
        java.lang.String str5 = visitor0.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "User: userType=null, email=, password=null]" + "'", str4.equals("User: userType=null, email=, password=null]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test479");
        java.util.Date date5 = null;
        java.util.Date date6 = null;
        java.util.Date date12 = null;
        java.util.Date date13 = null;
        library.UserType userType14 = new library.UserType();
        library.Request request20 = new library.Request((library.User) userType14, "", "", "hi!", "", false);
        library.CD cD26 = new library.CD("", "hi!", "", "", true, date12, date13, (library.User) userType14, "hi!", (java.lang.Double) 1.0d, "hi!", "", "hi!");
        cD26.setEdition("");
        cD26.setPurchasable("");
        library.Admin admin34 = new library.Admin("false", "false", "false");
        cD26.setOwner((library.User) admin34);
        java.lang.String str36 = admin34.getPassword();
        java.util.ArrayList<library.Request> requestList37 = admin34.getRequestList();
        admin34.handleRequests();
        library.CD cD44 = new library.CD("true", "hi!", "", "User: userType=null, email=null, password=null]", false, date5, date6, (library.User) admin34, "", (java.lang.Double) 10.0d, "", "true", "");
        java.util.Date date50 = null;
        java.util.Date date51 = null;
        library.UserType userType52 = new library.UserType();
        library.Request request58 = new library.Request((library.User) userType52, "", "", "hi!", "", false);
        library.CD cD64 = new library.CD("", "hi!", "", "", true, date50, date51, (library.User) userType52, "hi!", (java.lang.Double) 1.0d, "hi!", "", "hi!");
        cD64.setEdition("");
        cD64.setPurchasable("");
        library.Admin admin72 = new library.Admin("false", "false", "false");
        cD64.setOwner((library.User) admin72);
        java.lang.String str74 = admin72.getPassword();
        java.util.ArrayList<library.Request> requestList75 = admin72.getRequestList();
        admin72.handleRequests();
        java.util.ArrayList<library.Request> requestList77 = admin72.getRequestList();
        admin34.setRequestList(requestList77);
        java.lang.String str79 = admin34.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "false" + "'", str36.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(requestList37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str74 + "' != '" + "false" + "'", str74.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(requestList75);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(requestList77);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str79 + "' != '" + "false" + "'", str79.equals("false"));
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test480");
        java.util.Date date5 = null;
        java.util.Date date6 = null;
        library.UserType userType7 = new library.UserType();
        library.Request request13 = new library.Request((library.User) userType7, "", "", "hi!", "", false);
        library.Book book19 = new library.Book("false", "true", "true", "User: userType=null, email=null, password=null]", true, date5, date6, (library.User) userType7, "true", (java.lang.Double) 0.0d, "User: userType=null, email=null, password=null]", "true", "false");
        java.util.Date date20 = book19.getLostDate();
        java.lang.String str21 = book19.getTitle();
        java.util.Date date22 = null;
        book19.setLostDate(date22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "true" + "'", str21.equals("true"));
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test481");
        library.MaintainCoursesProxy maintainCoursesProxy0 = new library.MaintainCoursesProxy();
        library.Course[] courseArray1 = new library.Course[] {};
        java.util.ArrayList<library.Course> courseList2 = new java.util.ArrayList<library.Course>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<library.Course>) courseList2, courseArray1);
        maintainCoursesProxy0.setCourses((java.util.List<library.Course>) courseList2);
        java.util.List<library.Course> courseList5 = maintainCoursesProxy0.getCourses();
        library.Course course6 = null;
        library.Course course7 = maintainCoursesProxy0.getCourse(course6);
        library.Course course8 = new library.Course();
        java.util.ArrayList<library.User> userList9 = course8.getStudents();
        java.util.Date date15 = null;
        java.util.Date date16 = null;
        library.UserType userType17 = new library.UserType();
        library.Request request23 = new library.Request((library.User) userType17, "", "", "hi!", "", false);
        library.CD cD29 = new library.CD("", "hi!", "", "", true, date15, date16, (library.User) userType17, "hi!", (java.lang.Double) 1.0d, "hi!", "", "hi!");
        boolean boolean30 = cD29.getIfLost();
        course8.setTextbooks((library.Item) cD29);
        java.util.Date date32 = course8.getEndDate();
        maintainCoursesProxy0.addCourse(course8);
        java.util.Date date34 = course8.getEndDate();
        java.util.Date date35 = course8.getStartDate();
        library.Item item36 = course8.getTextbooks();
        java.util.Date date42 = null;
        java.util.Date date43 = null;
        library.User user44 = null;
        library.Magazine magazine50 = new library.Magazine("", "hi!", "", "", true, date42, date43, user44, "", (java.lang.Double) (-1.0d), "", "hi!", "");
        magazine50.setOnDiscount("");
        java.lang.String str53 = magazine50.getOnDiscount();
        java.lang.String str54 = magazine50.getRentable();
        java.lang.String str55 = magazine50.getRentable();
        course8.textbooks = magazine50;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(courseArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(courseList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(course7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(userList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(item36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str53 + "' != '" + "false" + "'", str53.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str54 + "' != '" + "true" + "'", str54.equals("true"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str55 + "' != '" + "true" + "'", str55.equals("true"));
    }
}
