import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestMain
{


//    private String getStringProperty(DACArecipient person, String name) throws NoSuchFieldException, IllegalAccessException
//    {
//        // Get the class of the object
//        Class<?> clazz = person.getClass();
//
//        // Get the private field "uscisNumber" using reflection
//        Field uscisNumberField = clazz.getDeclaredField(name);
//
//        // Make the field accessible (since it's private)
//        uscisNumberField.setAccessible(true);
//
//        // Get the value of the field from the person object
//        String value = (String) uscisNumberField.get(person);
//
//        // Print the result
//        return value;
//    }


    @Test
    @DisplayName("testUscisNumber")
    void testStringGetter(String name, String data)
    {
        DACArecipient person = new DACArecipient();
        Class<?> clazz = person.getClass();
        Method setterMethod = null;
        Method getterMethod = null;
        try
        {
            setterMethod = clazz.getDeclaredMethod("set" + name, String.class);
            getterMethod = clazz.getDeclaredMethod("get" + name);
            setterMethod.invoke(person, data);
            assertEquals(data, getterMethod.invoke(person));
        } catch (NoSuchMethodException e)
        {
            throw new RuntimeException("Either the set" + name + " or the get" + name + "  method does not exist.");
        } catch (InvocationTargetException e)
        {
            throw new RuntimeException("An error occured in your code.", e);
        } catch (IllegalAccessException e)
        {
            throw new RuntimeException("Could not call either set" + name + " or get" + name + " methods, check that they are public.");
        }
    }

    @Test
    @DisplayName("testUscisNumber")
    void testUscisNumber()
    {
        DACArecipient person = new DACArecipient();
        Class<?> clazz = person.getClass();
        Method setUscisNumberMethod = null;
        Method getUscisNumberMethod = null;
        try
        {
            setUscisNumberMethod = clazz.getDeclaredMethod("setUscisNumber", String.class);
            getUscisNumberMethod = clazz.getDeclaredMethod("getUscisNumber");
            setUscisNumberMethod.invoke(person, "12-3-456");
            assertEquals("12-3-456", getUscisNumberMethod.invoke(person));
        } catch (NoSuchMethodException e)
        {
            throw new RuntimeException("The setUcsisNumber method does not exist.");
        } catch (InvocationTargetException e)
        {
            throw new RuntimeException("Calling setUcsisNumber caused an error.");
        } catch (IllegalAccessException e)
        {
            throw new RuntimeException("Could not call setUcsisNumber method, check that it is public.");
        }
    }

    @Test
    @DisplayName("testGivenName")
    void testGivenName()
    {
        DACArecipient person = new DACArecipient();
        testStringGetter("GivenName", "Javier");
    }

    @Test
    @DisplayName("testSurname")
    void testSurname()
    {
        DACArecipient person = new DACArecipient();
        testStringGetter("Surname", "Mendez");
    }

    @Test
    @DisplayName("testCountryOfOrigin")
    void testCountryOfOrigin()
    {
        DACArecipient person = new DACArecipient();
        testStringGetter("CountryOfOrigin", "Guatamala");
    }

//    @Test
//    @DisplayName("testBirthday")
//    void testBirthday()
//    {
//        DACArecipient person = new DACArecipient();
//        person.setBirthday(1234567);
//        assertEquals(1234567, person.getBirthday());
//    }
//
//    @Test
//    @DisplayName("testValidFromDate")
//    void testValidFromDate()
//    {
//        DACArecipient person = new DACArecipient();
//        person.setValidFromDate(1234567);
//        assertEquals(1234567, person.getValidFromDate());
//    }
//
//    @Test
//    @DisplayName("testSex")
//    void testSex()
//    {
//        DACArecipient person = new DACArecipient();
//        person.setSex('M');
//        assertEquals('M', person.getSex());
//    }
//
//    @Test
//    @DisplayName("testSetAllPart1")
//    void testSetAllPart1()
//    {
//        DACArecipient person = new DACArecipient();
//        person.setAll("Kim", "Seo-yun", "25-6-567", "South Korea", 2451257, 39567322, 39567818, 'F');
//        assertEquals("Kim", person.getSurname());
//    }
//
//    @Test
//    @DisplayName("testSetAllPart2")
//    void testSetAllPart2()
//    {
//        DACArecipient person = new DACArecipient();
//        person.setAll("Kim", "Seo-yun", "25-6-567", "South Korea", 2451257, 39567322, 39567818, 'F');
//        assertEquals("Seo-yun", person.getGivenName());
//    }
//
//    @Test
//    @DisplayName("testSetAllPart3")
//    void testSetAllPart3()
//    {
//        DACArecipient person = new DACArecipient();
//        person.setAll("Kim", "Seo-yun", "25-6-567", "South Korea", 2451257, 39567322, 39567818, 'F');
//        assertEquals("25-6-567", person.getUscisNumber());
//    }
//
//    @Test
//    @DisplayName("testSetAllPart7")
//    void testSetAllPart7()
//    {
//        DACArecipient person = new DACArecipient();
//        person.setAll("Kim", "Seo-yun", "25-6-567", "South Korea", 2451257, 39567322, 39567818, 'F');
//        assertEquals(39567818, person.getExpirationDate());
//    }
//
//    @Test
//    @DisplayName("testSetAllPart8")
//    void testSetAllPart8()
//    {
//        DACArecipient person = new DACArecipient();
//        person.setAll("Kim", "Seo-yun", "25-6-567", "South Korea", 2451257, 39567322, 39567818, 'F');
//        assertEquals('F', person.getSex());
//    }
//
//    @Test
//    @DisplayName("testExpirationDate")
//    void testExpirationDate()
//    {
//        DACArecipient person = new DACArecipient();
//        person.setExpirationDate(1234567);
//        assertEquals(1234567, person.getExpirationDate());
//    }
//
//    @Test
//    @DisplayName("testSetAllPart4")
//    void testSetAllPart4()
//    {
//        DACArecipient person = new DACArecipient();
//        person.setAll("Kim", "Seo-yun", "25-6-567", "South Korea", 2451257, 39567322, 39567818, 'F');
//        assertEquals("South Korea", person.getCountryOfOrigin());
//    }
//
//    @Test
//    @DisplayName("testSetAllPart5")
//    void testSetAllPart5()
//    {
//        DACArecipient person = new DACArecipient();
//        person.setAll("Kim", "Seo-yun", "25-6-567", "South Korea", 2451257, 39567322, 39567818, 'F');
//        assertEquals(2451257, person.getBirthday());
//    }
//
//    @Test
//    @DisplayName("testSetAllPart6")
//    void testSetAllPart6()
//    {
//        DACArecipient person = new DACArecipient();
//        person.setAll("Kim", "Seo-yun", "25-6-567", "South Korea", 2451257, 39567322, 39567818, 'F');
//        assertEquals(39567322, person.getValidFromDate());
//    }

}