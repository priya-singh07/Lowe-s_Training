USING SETTER

package com.Priya;

public class Product {
    String pName;
}

public void setpName(String pName)
{
    this.pName = pName;
}

public void show() {
    System.out.println("thanks for purchasing.."+pName);
}




USING CONSTRUCTOR

package com.Priya;

public class Product {
    String pName;
}

public Product(String pName)
{
    this.pName = pName;
}

public void show() {
    System.out.println("thanks for purchasing.."+pName);
}
