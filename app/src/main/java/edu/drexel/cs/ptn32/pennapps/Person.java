package edu.drexel.cs.ptn32.pennapps;

/**
 * Created by PhucNgo on 1/22/16.
 */
public class Person {
    String myName = "";
    String myNumber = "";

    public String getName() {
        return myName;
    }

    public void setName(String name) {
        myName = name;
    }

    public String getPhoneNum() {
        return myNumber;
    }

    public void setPhoneNum(String number) {
        myNumber = number;
    }
}
