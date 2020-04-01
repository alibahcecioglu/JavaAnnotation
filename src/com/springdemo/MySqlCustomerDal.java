package springIntro;

public class MySqlCustomerDal implements IcustomerDal {
    String connectingString;

    public String getConnectingString() {
        return connectingString;
    }

    public void setConnectingString(String connectingString) {
        this.connectingString = connectingString;
    }

    @Override
    public void add() {
        System.out.println("connecting String :"+ this.connectingString);
        System.out.println("MySql veritabanına eklendi..");
    }
}
