class A {
    protected void finalize() {
        System.out.println("finalize called");
    }

    public static void main(String[] args) {
        A b = new A();
        b = null;
        System.gc();


    }
}
