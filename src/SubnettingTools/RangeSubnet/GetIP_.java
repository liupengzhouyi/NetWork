package SubnettingTools.RangeSubnet;

import SubnettingTools.IP.IPAddress;
import SubnettingTools.Tools.DecimalTobinary;

public class GetIP_ {

    private IPAddress ipAddress = null;

    private int kind = 0;

    private String string = null;

    private String binString = null;

    /**
     * 构造函数
     * @param ipAddress
     * @param kind
     */
    public GetIP_(IPAddress ipAddress, int kind) {
        //初始化
        this.init();
        this.ipAddress = ipAddress;
        this.kind = kind;
        //获取IP_
        this.setString();
        //设置二进制原网络位
        this.setBinString();
    }

    /**
     * 初始化
     */
    public void init() {
        this.ipAddress = new IPAddress(0, 0, 0, 0);
        this.string = new String();
        this.binString = new String();
    }

    public IPAddress getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(IPAddress ipAddress) {
        this.ipAddress = ipAddress;
    }

    public int getKind() {
        return kind;
    }

    public void setKind(int kind) {
        this.kind = kind;
    }

    public String getString() {
        return string;
    }

    public String getBinString() {
        return binString;
    }

    /**
     * 设置二进制原网络位
     */
    public void setBinString() {
        this.binString = "";
        if (this.getKind() == 1) {
            DecimalTobinary decimalTobinaryI = new DecimalTobinary(this.getIpAddress().getNumberI());
            this.binString = this.binString + decimalTobinaryI.getBinary() + ".";
        } else if (this.getKind() == 2) {
            DecimalTobinary decimalTobinaryI = new DecimalTobinary(this.getIpAddress().getNumberI());
            this.binString = this.binString + decimalTobinaryI.getBinary() + ".";
            DecimalTobinary decimalTobinaryII = new DecimalTobinary(this.getIpAddress().getNumberII());
            this.binString = this.binString + decimalTobinaryII.getBinary() + ".";
        } else if (this.getKind() == 3) {
            DecimalTobinary decimalTobinaryI = new DecimalTobinary(this.getIpAddress().getNumberI());
            this.binString = this.binString + decimalTobinaryI.getBinary() + ".";
            DecimalTobinary decimalTobinaryII = new DecimalTobinary(this.getIpAddress().getNumberII());
            this.binString = this.binString + decimalTobinaryII.getBinary() + ".";
            DecimalTobinary decimalTobinaryIII = new DecimalTobinary(this.getIpAddress().getNumberIII());
            this.binString = this.binString + decimalTobinaryIII.getBinary() + ".";
        }
    }

    /**
     * 设置你的原网络位
     */
    public void setString() {
        this.string = "";
        if (this.getKind() == 1) {
            this.string = this.string + this.getIpAddress().getNumberI() + ".";
        } else if (this.getKind() == 2) {
            this.string = this.string + this.getIpAddress().getNumberI() + ".";
            this.string = this.string + this.getIpAddress().getNumberII() + ".";
        } else if (this.getKind() == 3) {
            this.string = this.string + this.getIpAddress().getNumberI() + ".";
            this.string = this.string + this.getIpAddress().getNumberII() + ".";
            this.string = this.string + this.getIpAddress().getNumberIII() + ".";
        }
    }

    public static void main(String[] args) {
        GetIP_ getIP_ = new GetIP_(new IPAddress(192, 173, 12, 67), 3);
        System.out.println(getIP_.getString());
        System.out.println(getIP_.getBinString());
    }
}
