package arroganteIT.projects.consolBankigJPA;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;

public class Customer extends Person implements SavingAccount {

    private String username;

    private String password;

    private double balance;

    private ArrayList<String> transactions = new ArrayList<>(5);

    public Customer(String firstName, String lastName, String address, String phone, String username, String password,
                    double balance, ArrayList<String> transactions, Date date) {
        super(firstName, lastName, address, phone);
        this.username = username;
        this.password = password;
        this.balance = balance;
        addTransaction(String.format("Initial deposit - " + NumberFormat.getCurrencyInstance().format(balance) +
                " as on " + "%1$tD" + " at " + "%1$tT.", date));
    }

    public Customer(String firstName, String lastName, String address, String phone, String username,
                    String password, Date date) {
        super(firstName, lastName, address, phone);
        this.username = username;
        this.password = password;
    }

    public Customer() { }

    private void addTransaction(String message) {
        transactions.add(0, message);
        if (transactions.size() > 5) {
            transactions.remove(5);
            transactions.trimToSize();
        }
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public ArrayList<String> getTransactions() {
        return this.transactions;
    }

    public void setTransactions(ArrayList<String> transactions) {
        this.transactions = transactions;
    }


    @Override
    public void deposit(double amount, Date date) {
        this.balance = this.balance + amount;
        addTransaction(String.format(NumberFormat.getCurrencyInstance().format(amount) +
                " credited to your account. Balance - " + NumberFormat.getCurrencyInstance().format(this.balance) +
                " as on " + "%1$tD" + " at " + "%1$tT.", date));
    }


    @Override
    public void withdraw(double amount, Date date) {
        if (amount > (this.balance - 200)) {
            System.out.println("Insufficient balance.");
            return;
        }
        this.balance -= amount;
        addTransaction(String.format(NumberFormat.getCurrencyInstance().format(amount) +
                " debited from your account. Balance - " + NumberFormat.getCurrencyInstance().format(balance) +
                " as on " + "%1$tD" + " at " + "%1$tT", date));
    }

    @Override
    public String toString() {
        return "Customer{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", balance=" + balance +
                ", transactions=" + transactions +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Customer customer = (Customer) o;
        return Double.compare(customer.balance, balance) == 0 &&
                Objects.equals(username, customer.username) &&
                Objects.equals(password, customer.password) &&
                Objects.equals(transactions, customer.transactions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), username, password, balance, transactions);
    }
}















































