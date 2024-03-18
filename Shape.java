public class Shape {
    protected double area = 0.0;
    protected double perimeter;
    protected String name;

    static final void hitungLuas() {
        System.out.println("Hitung luas");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void getInfo() {
        System.out.println("Name: " + name);
        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
    }
}
