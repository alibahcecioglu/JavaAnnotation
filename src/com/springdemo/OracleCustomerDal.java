package springIntro;

public class OracleCustomerDal implements IcustomerDal{
    String connectingString;

    public String getConnectingString() {
        return connectingString;
    }

    public void setConnectingString(String connectingString) {
        this.connectingString = connectingString;
    }

    public void add(){
        System.out.println("connecting String :"+this.connectingString);
        System.out.println("oracle veritabanina yüklendi");
    }
}
