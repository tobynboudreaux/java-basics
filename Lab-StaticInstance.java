public class A {
    
    //static member
    public static int staticCount = 0;

    //instance member
    public int instanceCount = 0;

    public A() {
        staticCount++;
        this.instanceCount++;
    }

    public static int getStaticCount(){
        return A.staticCount;
    }

    public static void setStaticCount(int staticCount) {
        A.staticCount = staticCount;
    }

    public int getInstanceCount() {
        return this.instanceCount;
    }

    public void setInstanceCount(int instanceCount) {
        this.instanceCount = instanceCount;
    }
}

public class Test {

    public static void main(String[] args) {
        A a = new A();

        System.out.println(a.instanceCount);
        System.out.println(A.staticCount);

        A a2 = new A();

        System.out.println(a2.instanceCount);
        System.out.println(A.staticCount);

        a.setInstanceCount(15);
        
        System.out.println("object a instanceCount: " + a.instanceCount);
        System.out.println("object a2 instanceCount: " + a2.instanceCount);

        A.setStaticCount(2494);

        System.out.println("class A staticCount: " + A.staticCount);

    }
}
