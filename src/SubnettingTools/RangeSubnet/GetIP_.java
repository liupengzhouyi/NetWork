package SubnettingTools.RangeSubnet;

import SubnettingTools.IP.IPAddress;

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

    public void setBinString(String binString) {
        this.binString = binString;
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
}
