class StaticDemo {
    
    static int counter = 0;
    int number = 0;

    public StaticDemo(){
        counter++;
        number++;
    }
    public static void main(String[] args) {

        StaticDemo instanceA = new StaticDemo();
        System.out.println("InstanceA counter: " + instanceA.counter);
        System.out.println("InstanceA number: " + instanceA.number);

        StaticDemo instanceB = new StaticDemo();
        System.out.println("InstanceB counter: " + instanceB.counter);
        System.out.println("InstanceB number: " + instanceB.number);
    }
}
