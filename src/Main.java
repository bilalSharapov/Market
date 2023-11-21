import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Product product = new Product("sabiz",50);
        Product product1 = new Product("alma",40);
        Product product2 = new Product("alcha",60);
        Product product3 = new Product("banan",70);
        Product [] products = {product,product1,product2,product3};
        Basket basket = new Basket(products);
        int summa = 0;
        for (Product produc : products) {
            summa += produc.getPrice();
        }
        Client client = new Client("bili","sharapo",17, new Card("bili","sharapo","123456789",500,3456L),basket);
        System.out.println(Arrays.toString(products));
        System.out.println("obshe summa :"  +summa);
        if (summa >= 100){
            System.out.println("password jaz :");
            Scanner scanner = new Scanner(System.in);
            long password = scanner.nextLong();
            if (password == client.getCard().getPassword()&& client.getCard().getBalanc() >= summa){
                System.out.println("""
                     Pokupka proshla yspeshno
                   
                    """+ Arrays.toString(products));


            }
        }

    }
}