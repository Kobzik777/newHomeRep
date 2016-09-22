package com.company;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Properties;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException, IllegalAccessException, InstantiationException, InvocationTargetException, NoSuchMethodException {
        // write your code here
        InputStream is = Main.class.getResourceAsStream("values.properties");
        Properties dataProps = new Properties();
        dataProps.load(is);
        Enumeration<String> names = (Enumeration<String>) dataProps.propertyNames();

        String className = "com.company.SmartPhone";
        Class clazz = Class.forName(className);
        Object obj = clazz.newInstance();


        while (names.hasMoreElements()) {
            String name = names.nextElement();
            String value = dataProps.getProperty(name);
            for (Method method : clazz.getMethods()) {

                if (method.getName().equals("set" + name.substring(0, 1).toUpperCase() +
                        name.substring(1))) {
                    if (method.isAnnotationPresent(Ignore.class)) {
                        Ignore annot = method.getAnnotation(Ignore.class);
                        System.out.println(annot.description());

                        break;
                    }
                    if (method.getParameterTypes()[0].isPrimitive()) {
                        if (method.getParameterTypes()[0] == int.class) {
                            method.invoke(obj, Integer.valueOf(value));
                        } else if (method.getParameterTypes()[0] == double.class) {
                            method.invoke(obj, Double.valueOf(value));
                        }
                    } else {
                        method.invoke(obj, value);
                    }
                    break;

                }
            }
        }
        for (Method method : clazz.getMethods()) {
            System.out.println("Имя: " + method.getName());
            System.out.println("Возвращаемый тип: " + method.getReturnType().getName());
            Class[] paramTypes = method.getParameterTypes();
            System.out.print("Типы параметров:");
            for (Class paramType : paramTypes) {
                System.out.print(" " + paramType.getName());
            }
        }
        System.out.println(obj);
        String cllass = clazz.getName();
        Class superClassName = clazz.getSuperclass();
        System.out.println(cllass);
        System.out.println(superClassName);
        Class[] paramTypes = new Class[]{int.class, String.class};

    }
}
