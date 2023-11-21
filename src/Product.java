public class Product {
    private  String productname;
    private  long price;

    public Product(String productname, long price) {
        this.productname = productname;
        this.price = price;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productname='" + productname + '\'' +
                ", price=" + price +
                '}';
    }
}
// Product деген класс тузунуз   (productname, price
