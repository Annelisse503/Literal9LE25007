package com.iis.le25007.demo_le25007;

/**
 * Hello world!
 */
public class App 
{
    public String Hello() {
        return "Hello World";
    }
    
    public static void main(String[] args) {
        App hw = new App();  // Corregir la asignación
        System.out.println(hw.Hello());
    }
}
