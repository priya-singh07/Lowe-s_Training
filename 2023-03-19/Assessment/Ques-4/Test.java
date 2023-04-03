package com.Priya;

public class Test {
    public static void main(String[] args) {
        Resource r = new ClassPathResource("applicationContext.xml");
        BeanFactory fac = new XmlBeanFactory(r);
        Product p = (Product) fac.getBean("pBean");
    }
}
