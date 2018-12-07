package Subnet;

import IP.DetermineIP;
import IP.IPAddress;
import IP.KindOfIP;
import IP.SubnetMask;

public class SubnetNumbers {

    /**
     * 构造函数
     * @param ipAddress
     * @param subnetMask
     */
    public SubnetNumbers(IPAddress ipAddress, SubnetMask subnetMask) {
        this.setIpAddress(ipAddress);
        this.setSubnetMask(subnetMask);
        //获取输入的子网掩码
        this.setBinSubnetNumber(this.getSubnetMask().getBinSubnetMask());
        System.out.println(this.getBinSubnetNumber());
    }

    // IP地址
    private IPAddress ipAddress;

    //子网掩码
    private SubnetMask subnetMask;

    //二进制子网掩码
    private String BinSubnetNumber = "";

    //标准子网掩码
    private String SubnetNumberI    = "11111111.00000000.00000000.00000000";
    private String SubnetNumberII   = "11111111.11111111.00000000.00000000";
    private String SubnetNumberIII  = "11111111.11111111.11111111.00000000";

    public IPAddress getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(IPAddress ipAddress) {
        this.ipAddress = ipAddress;
    }

    public SubnetMask getSubnetMask() {
        return subnetMask;
    }

    public void setSubnetMask(SubnetMask subnetMask) {
        this.subnetMask = subnetMask;
    }

    public int getKind() {
        KindOfIP kindOfIP = new KindOfIP(this.getIpAddress());
        int kind = kindOfIP.getKind();
        return kind;
    }

    public String getBinSubnetNumber() {
        return BinSubnetNumber;
    }

    public void setBinSubnetNumber(String binSubnetNumber) {
        BinSubnetNumber = binSubnetNumber;
    }

    /**
     * 计算子网数量
     *
     * 1。 得到你的IP种类
     * 2。 得到标准的子网掩码（二进制）
     * 3。 得到你的输入的子网掩码（二进制）
     * 4。 1的位数多几个？
     * 5。 占位数量-->子网数量
     */
    public int getHostNumber() {
        String strI = this.getBinSubnetNumber();
        int number = this.getKind();
        String strII = "";
        if (number == 1) {
            strII = SubnetNumberI;
        } else if (number == 2) {
            strII = SubnetNumberII;
        } else if (number == 3) {
            strII = SubnetNumberIII;
        }
        int  numbers = 0;
        for (int i=0;i<strI.length();i++) {
            if (strI.charAt(i) != strII.charAt(i)) {
                numbers = numbers + 1;
            }
        }
        return numbers;
    }

    /**
     * 获取你的子网数量
     *
     * 1。获取占用的主机位
     * 2。通过占用的主机位 --> 获取子网书
     * @return
     */
    public int getSubnetNumbers() {
        int number = 1;
        int hostNumber = this.getHostNumber();
        for (int i=0;i<hostNumber;i++) {
            number = number * 2;
        }
        return number;
    }

    /**
     * 测试函数
     * @param args
     */
    public static void main(String[] args) {
        SubnetNumbers subnetNumbers = new SubnetNumbers(
                new IPAddress(193, 12, 12, 12),
                new SubnetMask(255, 255, 255, 224));

        System.out.println(subnetNumbers.getHostNumber());
        System.out.println(subnetNumbers.getSubnetNumbers());
    }
}
