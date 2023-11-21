import java.math.BigDecimal;

public class Card {
    private  String firstname;
    private  String lastName;
    private  String  cardNumber;
    private double balanc;
    private  long password;

    public Card(String firstname, String lastName, String cardNumber, double balanc, long password) {
        this.firstname = firstname;
        this.lastName = lastName;
        this.cardNumber = cardNumber;
        this.balanc = balanc;
        this.password = password;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public double getBalanc() {
        return balanc;
    }

    public void setBalanc(double balanc) {
        this.balanc = balanc;
    }

    public long getPassword() {
        return password;
    }

    public void setPassword(long password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Card{" +
                "firstname='" + firstname + '\'' +
                ", lastName='" + lastName + '\'' +
                ", cardNumber='" + cardNumber + '\'' +
                ", balanc=" + balanc +
                ", password=" + password +
                '}';
    }
}
// Card  деген класс тузунуз  (firstname, lastname, card number,
////balance, password)