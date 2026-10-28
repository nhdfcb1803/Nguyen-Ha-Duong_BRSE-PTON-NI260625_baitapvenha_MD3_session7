class Rectangle {
    double length;
    double width;

public Rectangle() {
    length = 1;
    width = 1;
}

public Rectangle(double length, double width) {
    this.length = length;
    this.width = width;
}

public double getArea() {
    return length * width;
}

public double getPerimeter() {
    return (length + width) * 2;
}

public void display() {
    System.out.println("Chieu dai: " + length);
    System.out.println("Chieu rong: " + width);
    System.out.println("Dien tich: " + getArea());
    System.out.println("Chu vi: " + getPerimeter());
}

void main() {
}