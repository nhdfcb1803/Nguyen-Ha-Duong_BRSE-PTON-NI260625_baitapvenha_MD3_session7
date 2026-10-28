class Book {
    // Khai báo thuộc tính private
    private String title;
    private String author;
    private double price;

public Book(String title, String author, double price) {
    this.title = title;
    this.author = author;
    setPrice(price);
}

// 3. Getter và Setter cho title
public String getTitle() {
    return title;
}

public void setTitle(String title) {
    this.title = title;
}

// 4. Getter và Setter cho author
public String getAuthor() {
    return author;
}

public void setAuthor(String author) {
    this.author = author;
}

// 5. Getter và Setter cho price
public double getPrice() {
    return price;
}

public void setPrice(double price) {
    if (price >= 0) {
        this.price = price;
    } else {
        System.out.println("Gia sach khong duoc am!");
    }
}

void main() {
}