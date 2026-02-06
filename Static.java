class Static{
    static int x;

    static {
        x = 5;
        System.out.println("Static block");
    }
    static void show() {
        System.out.println("Value of x: " + x);
    }
    public static void main(String[] args) {
        System.out.println("Main method started");
        Static.show();
    }
}