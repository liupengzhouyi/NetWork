package SubnettingTools.IP;

import SubnettingTools.Tools.DecimalTobinary;

public class IPAddress {

    public IPAddress(int numberI, int numberII, int numberIII, int numberIV) {
        // 初始化函数
        this.init();
        //获取值
        this.numberI = numberI;
        this.numberII = numberII;
        this.numberIII = numberIII;
        this.numberIV = numberIV;
        //设置IP地址
        this.setIdAddress();
        //设置二进制的IP
        this.setBinIPAddress();
    }

    /**
     * 初始化函数
     */
    public void init() {
        this.IPAddress = new String();
        this.binIPAddress = new String();
    }


    String IPAddress = null;

    String binIPAddress = null;

    int numberI = 0;

    int numberII = 0;

    int numberIII = 0;

    int numberIV = 0;

    public String getIPAddress() {
        return IPAddress;
    }

    /**
     * 创建一个IP地址
     */
    public void setIdAddress() {
        this.IPAddress = this.getNumberI() + "." + this.getNumberII() + "." + this.getNumberIII() + "." + this.getNumberIV();
    }

    public int getNumberI() {
        return numberI;
    }

    public String getBinIPAddress() {
        return binIPAddress;
    }

    /**
     * 获取二进制的IP
     */
    public void setBinIPAddress() {
        DecimalTobinary decimalTobinaryI = new DecimalTobinary(this.getNumberI());
        DecimalTobinary decimalTobinaryII = new DecimalTobinary(this.getNumberII());
        DecimalTobinary decimalTobinaryIII = new DecimalTobinary(this.getNumberIII());
        DecimalTobinary decimalTobinaryIV = new DecimalTobinary(this.getNumberIV());
        this.binIPAddress = decimalTobinaryI.getBinary() + "."
                + decimalTobinaryII.getBinary() + "."
                + decimalTobinaryIII.getBinary() + "."
                + decimalTobinaryIV.getBinary();
    }

    public void setNumberI(int numberI) {
        this.numberI = numberI;
    }

    public int getNumberII() {
        return numberII;
    }

    public void setNumberII(int numberII) {
        this.numberII = numberII;
    }

    public int getNumberIII() {
        return numberIII;
    }

    public void setNumberIII(int numberIII) {
        this.numberIII = numberIII;
    }

    public int getNumberIV() {
        return numberIV;
    }

    public void setNumberIV(int numberIV) {
        this.numberIV = numberIV;
    }

    public static void main(String[] args) {
        SubnettingTools.IP.IPAddress ipAddress = new IPAddress(123, 25, 185, 221);
        System.out.println(ipAddress.getIPAddress());
        System.out.println(ipAddress.getBinIPAddress());
    }
}
