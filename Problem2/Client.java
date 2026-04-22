public class Client {
    String name;
    int riskScore;
    double balance;

    public Client(String name, int riskScore, double balance) {
        this.name = name;
        this.riskScore = riskScore;
        this.balance = balance;
    }

    public String toString() {
        return name + " | Risk: " + riskScore + " | Balance: " + balance;
    }
}