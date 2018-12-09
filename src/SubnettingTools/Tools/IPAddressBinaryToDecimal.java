package SubnettingTools.Tools;

import SubnettingTools.IP.BinaryIPAddress;
import SubnettingTools.IP.IPAddress;

public class IPAddressBinaryToDecimal {

    public IPAddressBinaryToDecimal(BinaryIPAddress binaryIPAddress) {
        //初始化
        this.init();
        //获取值
        this.binaryIPAddress = binaryIPAddress;
        //将二进制 转化为 十进制
        this.createDecimal();
    }

    /**
     * 初始化
     */
    public void init() {
        this.binaryIPAddress = new BinaryIPAddress("", "", "", "");

    }

    /**
     * 将二进制 转化为 十进制
     */
    public void createDecimal() {
        String numberI = binaryIPAddress.getNumberI();
        String numberII = binaryIPAddress.getNumberII();
        String numberIII = binaryIPAddress.getNumberIII();
        String numberIV = binaryIPAddress.getNumberIV();

        int numI = new BinrayToDecimal(numberI).getNumber();
        int numII = new BinrayToDecimal(numberII).getNumber();
        int numIII = new BinrayToDecimal(numberIII).getNumber();
        int numIV = new BinrayToDecimal(numberIV).getNumber();

        //创建对应的IP
        this.ipAddress = new IPAddress(numI, numII, numIII, numIV);

    }

    private BinaryIPAddress binaryIPAddress = null;

    private IPAddress ipAddress = null;

    public BinaryIPAddress getBinaryIPAddress() {
        return binaryIPAddress;
    }

    public void setBinaryIPAddress(BinaryIPAddress binaryIPAddress) {
        this.binaryIPAddress = binaryIPAddress;
    }

    public IPAddress getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(IPAddress ipAddress) {
        this.ipAddress = ipAddress;
    }
}
