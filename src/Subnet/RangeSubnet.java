package Subnet;

import IP.IPAddress;
import IP.KindOfIP;
import IP.SubnetMask;

public class RangeSubnet {

    /**
     * 构造函数
     * @param ipAddress
     * @param subnetMask
     */
    public RangeSubnet(IPAddress ipAddress, SubnetMask subnetMask) {
        //获取值
        this.ipAddress = ipAddress;
        this.subnetMask = subnetMask;
        //获取二进制
        this.setBinSubnetNumber();
        //设置标准子网掩码
        this.setStandardSubnetNumber();

    }

    //IP开始地址
    private IPAddress IPBegin;

    //IP结束地址
    private IPAddress IPEnd;

    //IP广播地址
    private IPAddress IPbroadcast;

    // IP地址
    private IPAddress ipAddress;

    //子网掩码
    private SubnetMask subnetMask;

    //二进制子网掩码
    private String BinSubnetNumber = "";

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

    public String getBinSubnetNumber() {
        return BinSubnetNumber;
    }

    /**
     * 设置子网掩码的二进制
     */
    public void setBinSubnetNumber() {
        BinSubnetNumber = this.getSubnetMask().getBinSubnetMask();
    }

    public IPAddress getIPBegin() {
        return IPBegin;
    }

    public void setIPBegin(IPAddress IPBegin) {

        this.IPBegin = IPBegin;
    }

    /**
     * 获取起始IP地址（二进制）
     */
    public String getBeginBinIp() {
        int kind = this.getKind();
        String string = "";
        if (kind == 1) {
            for (int i=0;i<9;i++) {
                string = string + this.getIpAddress().getBinIPAddress().charAt(i);
            }
        } else if (kind == 2) {
            for (int i=0;i<18;i++) {
                string = string + this.getIpAddress().getBinIPAddress().charAt(i);
            }
        } else if (kind == 3) {
            for (int i=0;i<27;i++) {
                string = string + this.getIpAddress().getBinIPAddress().charAt(i);
            }
        }
        string = string + this.getNowHostNumber();
        return string;
    }

    public IPAddress getIPEnd() {
        return IPEnd;
    }

    public void setIPEnd(IPAddress IPEnd) {
        this.IPEnd = IPEnd;
    }

    public IPAddress getIPbroadcast() {
        return IPbroadcast;
    }

    public void setIPbroadcast(IPAddress IPbroadcast) {
        this.IPbroadcast = IPbroadcast;
    }

    //标准子网掩码
    private String SubnetNumberI    = "11111111.00000000.00000000.00000000";
    private String SubnetNumberII   = "11111111.11111111.00000000.00000000";
    private String SubnetNumberIII  = "11111111.11111111.11111111.00000000";

    private String standardSubnetNumber = "";

    public String getStandardSubnetNumber() {
        return standardSubnetNumber;
    }

    /**
     * 设置标准的子网掩码（未占位）
     */
    public void setStandardSubnetNumber() {
        int kind = this.getKind();
        if (kind == 1) {
            this.standardSubnetNumber = SubnetNumberI;
        } else if (kind == 2) {
            this.standardSubnetNumber = SubnetNumberII;
        } else if (kind == 3) {
            this.standardSubnetNumber = SubnetNumberIII;
        }
    }

    /**
     * 获取网络IP种类
     * @return
     */
    public int getKind() {
        KindOfIP kindOfIP = new KindOfIP(this.getIpAddress());
        int kind = kindOfIP.getKind();
        return kind;
    }

    /**
     * 获取占用的主机位
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
     * 获取你的占用的主机位的现在状态
     * @return
     */
    public String getNowHostNumber() {
        String str = "";
        int kind = this.getKind();
        int number = this.getHostNumber();
        if(number > 8 && number < 16) {
            number = number + 1;
        } else if (number > 16) {
            number = number + 2;
        }
        if (kind == 1) {
            //A类网络
            for (int i=9;i<9+number;i++) {
                str = str + this.getIpAddress().getBinIPAddress().charAt(i);
            }
        } else if (kind == 2) {
            //B类网络
            for (int i=18;i<18+number;i++) {
                str = str + this.getIpAddress().getBinIPAddress().charAt(i);
            }
        } else if (kind == 3) {
            //C类网络
            for (int i=27;i<27+number;i++) {
                str = str + this.getIpAddress().getBinIPAddress().charAt(i);
            }
        }
        return str;
    }

    /**
     * 测试函数
     * @param args
     */
    public static void main(String[] args) {
        RangeSubnet rangeSubnet = new RangeSubnet(
                new IPAddress(12, 12, 12, 35),
                new SubnetMask(255, 255, 224, 0));

        System.out.println("IP地址: " + rangeSubnet.getIpAddress().getIPAddress());

        System.out.println("子网掩码：" + rangeSubnet.getSubnetMask().getSubnetMask());

        System.out.println("网络种类：" + rangeSubnet.getKind());

        System.out.println("IP 2 : " + rangeSubnet.getIpAddress().getBinIPAddress());

        System.out.println("子网掩码 2 ：" + rangeSubnet.getBinSubnetNumber());

        System.out.println("标准子网掩码 ：" + rangeSubnet.getStandardSubnetNumber());

        System.out.println("占用主机位：" + rangeSubnet.getHostNumber());

        System.out.println("占位状态： " + rangeSubnet.getNowHostNumber());

        System.out.println("子网起始状态：" + 1);

        System.out.println("子网起始（二进制）" + rangeSubnet.getBeginBinIp());

        System.out.println("IP网址起点：" + rangeSubnet.getIPBegin());

        System.out.println("IP网址结束：" + rangeSubnet.getIPEnd());

        System.out.println("广播IP网址：" + rangeSubnet.getBinSubnetNumber());
    }
}
