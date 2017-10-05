package oop_concepts;

public class ShadowTest {
    public int x =0;

    class FirtLevel{
        public int x =1;
        void methodinFirstLevel(int x){
            System.out.println("x = "+x);
            System.out.println("this.x = "+this.x);
            System.out.println("ShadowTest.this.x = "+ShadowTest.this.x);
        }
    }

    public static void main(String[] args) {
        ShadowTest st = new ShadowTest();
        ShadowTest.FirtLevel f1 = st.new FirtLevel();
        f1.methodinFirstLevel(23);
    }
}
