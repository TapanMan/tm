package com.mandal.tm.core;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SingletonDesign extends SingletonDesignClone implements Serializable {
    private static SingletonDesign instance;

    private SingletonDesign() {
        /*if (instance != null) {
            throw new IllegalStateException("Object cannot be created with Reflection API");
        }*/
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("You cannot clone the object");
    }

    public static synchronized SingletonDesign getInstance() {
        if (instance == null) {
            instance = new SingletonDesign();
        }
        return instance;
    }

    protected Object readResolve() {
        return instance;
    }

    public static void main(String[] args) throws CloneNotSupportedException, InvocationTargetException, InstantiationException, IllegalAccessException, IOException, ClassNotFoundException {
        SingletonDesign singletonDesign = SingletonDesign.getInstance();
        System.out.println("Singleton Instance creade with hash code =" + singletonDesign.hashCode());

        //The following is used while creating the object with the help of clone() method
       /* SingletonDesign sd = (SingletonDesign) singletonDesign.clone();
        System.out.println("Clone method objected created with hash code =" + sd.hashCode());
        */

        // Using the reflection API, we will clone it
        SingletonDesign reflectionInstance = null;
        Constructor[] constructors = SingletonDesign.class.getDeclaredConstructors();
        for (Constructor constructor : constructors) {
            constructor.setAccessible(true);
            reflectionInstance = (SingletonDesign) constructor.newInstance();
        }
        // System.out.println("Reflection objected created with hash code = " + reflectionInstance.hashCode());

        //Serialize singleton object to a file
        ObjectOutput objectOutput = new ObjectOutputStream(new FileOutputStream("Singleton.ser"));
        objectOutput.writeObject(singletonDesign);
        objectOutput.close();

        //Deserialize singleton object from a file
        ObjectInput objectInput = new ObjectInputStream(new FileInputStream("Singleton.ser"));
        SingletonDesign serializeObject = (SingletonDesign) objectInput.readObject();
        objectInput.close();
        System.out.println("Serialization objected created with hash code = " + serializeObject.hashCode());
    }
}
