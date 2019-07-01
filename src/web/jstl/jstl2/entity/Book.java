package web.jstl.jstl2.entity;

public class Book {
    private Integer id;
    private String name;
    private String authorName;
    private Integer price;
    private String press;

    public Book() {
    }

    public Book(String name, String authorName, Integer price, String press) {
        this.name = name;
        this.authorName = authorName;
        this.price = price;
        this.press = press;
    }

    public Book(Integer id, String name, String authorName, Integer price, String press) {
        this.id = id;
        this.name = name;
        this.authorName = authorName;
        this.price = price;
        this.press = press;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getPress() {
        return press;
    }

    public void setPress(String press) {
        this.press = press;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", nae='" + name+ '\'' +
                ", authrName='" + authorName + '\'' +
                ", price=" + price +
                ", press='" + press + '\'' +
                '}';
    }

}
