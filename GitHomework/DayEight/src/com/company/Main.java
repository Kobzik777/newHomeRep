package com.company;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Properties;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException, IllegalAccessException, InstantiationException, InvocationTargetException {
        // write your code here

        InputStream is = Main.class.getResourceAsStream("test.properties");
        Properties dataProps = new Properties();
        dataProps.load(is);
        is = Main.class.getResourceAsStream("regexps.properties");
        Properties regexp = new Properties();
        regexp.load(is);
        Enumeration<String> names = (Enumeration<String>) dataProps.propertyNames();
        String className = "com.company.Record";
        Class clazz = Class.forName(className);
        Object obj = clazz.newInstance();

        while (names.hasMoreElements()) {
            String name = names.nextElement();
            String values = dataProps.getProperty(name);
            if (!values.matches(regexp.getProperty(name))) {
                System.out.println("Not matches: " + name + "=" + values);
                Method[] methods = clazz.getMethods();
            }
            for (Method method : clazz.getMethods()) {
                if (method.getName().equals("set" + name.substring(0, 1).toUpperCase() + name.substring(1))) {
                    if (method.getParameterTypes()[0].isPrimitive()) {
                        if (method.getParameterTypes()[0] == int.class) {
                            method.invoke(obj, Integer.valueOf(values));
                        }
                    } else {
                        method.invoke(obj, values);
                    }
                    break;
                }

            }
        }        System.out.println(obj);
    }


}
