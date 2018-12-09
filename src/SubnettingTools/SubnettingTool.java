package SubnettingTools;

import SubnettingTools.IP.DetermineIP;
import SubnettingTools.IP.IPAddress;
import SubnettingTools.IP.SubnetMask;

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
        //设置网络输入是否合法
        this.setIsError();
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
        this.broadcastBIpAddress = new IPAddress(0, 0, 0, 0);
    }

    //用户输入的IP
    private IPAddress ipAddress = null;
    //用户输入的子网掩码
    private SubnetMask subnetMask = null;
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

    public String getIsError() {
        return isError;
    }

    /**
     * 设置网络输入是否合法
     * //错误-》-1
     * //私有IP-》0
     * //公有IP-》1
     */
    public void setIsError() {
        DetermineIP determineIP = new DetermineIP(this.getIpAddress());
        int kind = determineIP.getKey();
        this.isError = "" + kind;
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

    public void setNetKind(String netKind) {
        this.netKind = netKind;
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

    public void setBeginIp(IPAddress beginIp) {
        this.beginIp = beginIp;
    }

    public IPAddress getEndIp() {
        return endIp;
    }

    public void setEndIp(IPAddress endIp) {
        this.endIp = endIp;
    }

    public IPAddress getBroadcastBIpAddress() {
        return broadcastBIpAddress;
    }

    public void setBroadcastBIpAddress(IPAddress broadcastBIpAddress) {
        this.broadcastBIpAddress = broadcastBIpAddress;
    }
}
