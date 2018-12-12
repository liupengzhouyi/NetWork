package SubnettingTools.RangeSubnet;

public class GetSubnet_Number {

    public GetSubnet_Number(int number) {
        this.number = number;
    }



    private int number = 0;

    private String HostNumber = "";

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getHostNumber() {
        return HostNumber;
    }

    public void setHostNumber(String hostNumber) {
        HostNumber = hostNumber;
    }
}
