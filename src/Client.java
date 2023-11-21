public class Client implements  CardInterface{
    private  String firstname;
    private  String lastname;
    private int age;
    private  Card card;
    private Basket basket;

    public Client(String firstname, String lastname, int age, Card card, Basket basket) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.card = card;
        this.basket = basket;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public Basket getBasket() {
        return basket;
    }

    public void setBasket(Basket basket) {
        this.basket = basket;
    }

    @Override
    public String toString() {
        return "Client{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", age=" + age +
                ", card=" + card +
                ", basket=" + basket +
                '}';
    }

    @Override
    public void paywithcard(double money) {


    }

    @Override
    public void getcardbalance(double balanc) {

    }
}
// /Client  деген класс тузунуз  полялары (firstname, lastname, age,
////card, basket).
