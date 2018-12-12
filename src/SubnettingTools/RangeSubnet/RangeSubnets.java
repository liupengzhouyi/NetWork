package SubnettingTools.RangeSubnet;

import SubnettingTools.IP.IPAddress;
import SubnettingTools.IP.SubnetMask;
import SubnettingTools.Subnet.RangeSubnet;

public class RangeSubnets {

    /**
     * 构建函数
     * @param ipAddress
     * @param subnetMask
     */
    public RangeSubnets(IPAddress ipAddress, SubnetMask subnetMask) {
        //初始化
        this.init();
        this.setIpAddress(ipAddress);
        this.setSubnetMask(subnetMask);
        //获取网络占用的主机位与网络种类
        this.getNumberAndKind();

    }



    /**
     * 初始化函数
     */
    public void init() {
        this.startIP = new IPAddress(0, 0, 0, 0);
        this.endIP = new IPAddress(0, 0, 0, 0);
        this.broadcastIP = new IPAddress(0, 0, 0, 0);
        this.ipAddress = new IPAddress(0, 0, 0, 0);
        this.subnetMask = new SubnetMask(0, 0, 0, 0);
        this.rangeSubnet = new RangeSubnet(this.getIpAddress(), this.getSubnetMask());
    }

    /**
     * 获取网络占用的主机位与网络种类
     */
    public void getNumberAndKind() {
        this.setNumber(this.getRangeSubnet().getHostNumber());
        this.setKind(this.getRangeSubnet().getKind());
    }

    private IPAddress startIP = null;

    private IPAddress endIP = null;

    private IPAddress broadcastIP = null;

    private RangeSubnet rangeSubnet= null;

    private IPAddress ipAddress = null;

    private SubnetMask subnetMask = null;

    private int number = 0;

    private int kind = 0;

    public IPAddress getStartIP() {
        return startIP;
    }

    public void setStartIP(IPAddress startIP) {
        this.startIP = startIP;
    }

    public IPAddress getEndIP() {
        return endIP;
    }

    public void setEndIP(IPAddress endIP) {
        this.endIP = endIP;
    }

    public IPAddress getBroadcastIP() {
        return broadcastIP;
    }

    public void setBroadcastIP(IPAddress broadcastIP) {
        this.broadcastIP = broadcastIP;
    }

    public RangeSubnet getRangeSubnet() {
        return rangeSubnet;
    }

    public void setRangeSubnet(RangeSubnet rangeSubnet) {
        this.rangeSubnet = rangeSubnet;
    }

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

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getKind() {
        return kind;
    }

    public void setKind(int kind) {
        this.kind = kind;
    }


}
