package oop_concepts;

public class TestCount
{
    public int aMethod()
    {
        int i = 0;
        i++;
        return i;
    }
    public static void main(String args[])
    {
        TestCount test = new TestCount();
        test.aMethod();
        int j = test.aMethod();
        System.out.println(j);
    }
}