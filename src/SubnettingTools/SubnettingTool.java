package SubnettingTools;

import SubnettingTools.IP.*;
import SubnettingTools.Subnet.RangeSubnet;

public class SubnettingTool {

    /**
     * 构造函数
     * @param ipAddress
     * @param subnetMask
     */
    public SubnettingTool(IPAddress ipAddress, SubnetMask subnetMask) {
        //初始化
        this.init();
        //获取值
        this.setIpAddress(ipAddress);
        this.setSubnetMask(subnetMask);
        //设置网络IP地址输入是否合法
        this.setIsIpError();
        //设置子网掩码是否正确
        this.setIsSubnetMaskError();
        //设置网络输入是否合法
        this.setIsError();


        //设置你的IP开始


        //设置你的网络种类
        this.setNetKind();
        //设置IP网段的开始IP
        this.setBeginIp();
        //设置IP网段的结束IP
        this.setEndIp();
    }

    /**
     * 初始化
     */
    public void init() {
        this.ipAddress = new IPAddress(0, 0, 0, 0);
        this.subnetMask = new SubnetMask(0, 0, 0, 0);
        this.beginIp = new IPAddress(0, 0, 0, 0);
        this.endIp = new IPAddress(0, 0, 0, 0);
        this.isError = new String();
        this.netKind = new String();
        this.isIpError = new String();
        this.isSubnetMaskError = new String();
        this.broadcastBIpAddress = new IPAddress(0, 0, 0, 0);
    }

    //用户输入的IP
    private IPAddress ipAddress = null;
    //用户输入的子网掩码
    private SubnetMask subnetMask = null;
    //IP地址是否合法
    private String isIpError = null;
    //子网掩码是否合法
    private String isSubnetMaskError = null;
    //是否合法
    private String isError = null;
    //错误种类
    private int error = 0;
    //网络种类
    //A
    //B
    //C
    //私有IP
    //127
    private String netKind = null;
    //子网数
    private int subnetNumbers = 0;
    //有效子网数
    private int effectiveSubnetNumber = 0;
    //主机数
    private int hostNumber = 0;
    //有效主机数
    private int effectiveHostNumber = 0;
    //开始IP
    private IPAddress beginIp = null;
    //结束IP
    private IPAddress endIp = null;
    //广播IP
    private IPAddress broadcastBIpAddress = null;

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

    public String getIsIpError() {
        return isIpError;
    }

    /**
     * 设置网络输入是否合法
     * // 错 误 -》-1
     * // 私 有 IP-》0
     * // 公 有 IP-》1
     * // 127 --> 127
     */
    public void setIsIpError() {
        DetermineIP determineIP = new DetermineIP(this.getIpAddress());
        int kind = determineIP.getKey();
        this.isIpError = "" + kind;
    }

    public String getIsSubnetMaskError() {
        return isSubnetMaskError;
    }

    /**
     * 设置子网掩码是否正确
     * 0 -》错误
     * 1 -》正确
     */
    public void setIsSubnetMaskError() {
        //获取子网掩码
        DetermineSubnetMask determineSubnetMask = new DetermineSubnetMask(this.getSubnetMask());
        //判断子网掩码
        int kind = determineSubnetMask.getKind();
        //设置子网掩码是否正确
        this.isSubnetMaskError = "" + kind;
    }

    public String getIsError() {
        return isError;
    }

    /**
     * 设置网络输入是否合法
     * 0 -> 子网掩码 错误
     * 1 -> IP 正确
     * 2 -> IP 私有IP
     * 3 -> IP 127
     *
     */
    public void setIsError() {
        String IP = this.getIsIpError();
        String SubnetMask = this.getIsSubnetMaskError();
        if (SubnetMask == "0") {
            this.isError = "0";
        } else {
            if(IP == "1") {
                this.isError = "1";
            } else if (IP == "0") {
                this.isError = "2";
            } else if (IP == "127") {
                this.isError = "3";
            }
        }
    }

    public int getError() {
        return error;
    }

    public void setError(int error) {
        this.error = error;
    }

    public String getNetKind() {
        return netKind;
    }

    /**
     * 设置你的网络种类
     */
    public void setNetKind() {
        this.netKind = netKind;
        KindOfIP kindOfIP = new KindOfIP(this.getIpAddress());
        int kind = kindOfIP.getKind();
        if (kind == 1) {
            this.netKind = "A";
        } else if (kind == 2) {
            this.netKind = "B";
        } else if (kind == 3) {
            this.netKind = "C";
        } else if (kind == 127) {
            this.netKind = "127";
        }
    }

    public int getSubnetNumbers() {
        return subnetNumbers;
    }

    public void setSubnetNumbers(int subnetNumbers) {
        this.subnetNumbers = subnetNumbers;
    }

    public int getEffectiveSubnetNumber() {
        return effectiveSubnetNumber;
    }

    public void setEffectiveSubnetNumber(int effectiveSubnetNumber) {
        this.effectiveSubnetNumber = effectiveSubnetNumber;
    }

    public int getHostNumber() {
        return hostNumber;
    }

    public void setHostNumber(int hostNumber) {
        this.hostNumber = hostNumber;
    }

    public int getEffectiveHostNumber() {
        return effectiveHostNumber;
    }

    public void setEffectiveHostNumber(int effectiveHostNumber) {
        this.effectiveHostNumber = effectiveHostNumber;
    }

    public IPAddress getBeginIp() {
        return beginIp;
    }

    /**
     * 设置IP网段的开始IP
     */
    public void setBeginIp() {
        RangeSubnet rangeSubnet = new RangeSubnet(this.getIpAddress(), this.getSubnetMask());
        this.beginIp = rangeSubnet.getIPBegin();
    }

    public IPAddress getEndIp() {
        return endIp;
    }

    /**
     * 设置IP网段的结束IP
     */
    public void setEndIp() {
        RangeSubnet rangeSubnet = new RangeSubnet(this.getIpAddress(), this.getSubnetMask());
        this.endIp = rangeSubnet.getIPEnd();
    }

    public IPAddress getBroadcastBIpAddress() {
        return broadcastBIpAddress;
    }

    public void setBroadcastBIpAddress(IPAddress broadcastBIpAddress) {
        this.broadcastBIpAddress = broadcastBIpAddress;
    }

    public static void main(String[] args) {
        SubnettingTool subnettingTool = new SubnettingTool(
                new IPAddress(192, 157, 12, 17),
                new SubnetMask(255, 255, 255, 0)
        );
        System.out.println("       IP: " + subnettingTool.getIpAddress().getIPAddress());
        System.out.println("  子网掩码: " + subnettingTool.getSubnetMask().getSubnetMask());
        System.out.println("  网络种类: " + subnettingTool.getNetKind());
        System.out.println("  主机数量: " + subnettingTool.getHostNumber());
        System.out.println("网段开始IP: " + subnettingTool.getBeginIp().getIPAddress());
        System.out.println("网段结束IP: " + subnettingTool.getEndIp().getIPAddress());

        System.out.println("" + subnettingTool.getIsError());
    }
}
