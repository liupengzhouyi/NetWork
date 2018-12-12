package SubnettingTools.RangeSubnet;

import SubnettingTools.IP.BinaryIPAddress;
import SubnettingTools.IP.IPAddress;
import SubnettingTools.IP.SubnetMask;
import SubnettingTools.Subnet.RangeSubnet;
import SubnettingTools.Tools.IPAddressBinaryToDecimal;

public class GetRangeSubnets {

    private String endBinIPAddress = null;

    private String startBinIPAddress = null;

    private String broadcastBinIPAddress = null;

    private RangeSubnets rangeSubnets = null;

    private BinaryIPAddress binaryIPAddress = null;

    private IPAddress startIPAddress = null;

    private IPAddress endIPAddress = null;

    private IPAddress broadcastIPAddres = null;
    /**
     * 构造函数
     * @param endBinIPAddress
     * @param startBinIPAddress
     * @param broadcastBinIPAddress
     */
    public GetRangeSubnets(String startBinIPAddress, String endBinIPAddress, String broadcastBinIPAddress) {
        //初始化
        this.init();
        //获取值
        this.setStartBinIPAddress(startBinIPAddress);
        this.setEndBinIPAddress(endBinIPAddress);
        this.setBroadcastBinIPAddress(broadcastBinIPAddress);
        //设置开始IP
        this.createStartIPAddress();
        //设置结束IP
        this.createEndIPAddress();
        //设置广播IP
        this.createBroadcastIPAddress();
        //设置广播范围
        this.createRangeSubnets();
    }

    /**
     * 初始化
     */
    public void init() {
        this.binaryIPAddress = new BinaryIPAddress("", "", "", "");
        this.rangeSubnets = new RangeSubnets(new IPAddress(0, 0, 0, 0),
                                             new IPAddress(0, 0, 0, 0),
                                             new IPAddress(0, 0, 0, 0));
        this.startBinIPAddress = new String();
        this.endBinIPAddress = new String();
        this.broadcastBinIPAddress = new String();

        this.startIPAddress = new IPAddress(0, 0, 0, 0);
        this.endIPAddress = new IPAddress(0, 0, 0, 0);
        this.broadcastIPAddres = new IPAddress(0, 0, 0, 0);
    }

    /**
     * 设置开始IP
     */
    public void createStartIPAddress() {
        String[] strings = new String[4];
        int number = this.getStartBinIPAddress().length();
        int j = 0;
        int k = 0;
        strings[k] = "";
        for (int i=0;i<number;i++) {
            j++;
            strings[k] = strings[k] + this.getStartBinIPAddress().charAt(i);
            if (j == 8) {
                j = 0;
                //System.out.println(strings[k]);
                k = k + 1;
                i = i + 1;
                if (k < 4) {
                    strings[k] = "";
                }
            }
        }
        BinaryIPAddress binaryIPAddress = new BinaryIPAddress(strings[0], strings[1], strings[2], strings[3]);
        IPAddressBinaryToDecimal ipAddressBinaryToDecimal = new IPAddressBinaryToDecimal(binaryIPAddress);
        this.setStartIPAddress(ipAddressBinaryToDecimal.getIpAddress());
    }

    /**
     * 设置结束IP
     */
    public void createEndIPAddress() {
        String[] strings = new String[4];
        int number = this.getEndBinIPAddress().length();
        int j = 0;
        int k = 0;
        strings[k] = "";
        for (int i=0;i<number;i++) {
            j++;
            strings[k] = strings[k] + this.getEndBinIPAddress().charAt(i);
            if (j == 8) {
                j = 0;
                //System.out.println(strings[k]);
                k = k + 1;
                i = i + 1;
                if (k < 4) {
                    strings[k] = "";
                }
            }
        }
        BinaryIPAddress binaryIPAddress = new BinaryIPAddress(strings[0], strings[1], strings[2], strings[3]);
        IPAddressBinaryToDecimal ipAddressBinaryToDecimal = new IPAddressBinaryToDecimal(binaryIPAddress);
        this.setEndIPAddress(ipAddressBinaryToDecimal.getIpAddress());
    }

    /**
     * 设置广播IP
     */
    public void createBroadcastIPAddress() {
        String[] strings = new String[4];
        int number = this.getBroadcastBinIPAddress().length();
        int j = 0;
        int k = 0;
        strings[k] = "";
        for (int i=0;i<number;i++) {
            j++;
            strings[k] = strings[k] + this.getBroadcastBinIPAddress().charAt(i);
            if (j == 8) {
                j = 0;
                //System.out.println(strings[k]);
                k = k + 1;
                i = i + 1;
                if (k < 4) {
                    strings[k] = "";
                }
            }
        }
        BinaryIPAddress binaryIPAddress = new BinaryIPAddress(strings[0], strings[1], strings[2], strings[3]);
        IPAddressBinaryToDecimal ipAddressBinaryToDecimal = new IPAddressBinaryToDecimal(binaryIPAddress);
        this.setBroadcastIPAddres(ipAddressBinaryToDecimal.getIpAddress());
    }

    /**
     * 设置广播范围
     */
    public void createRangeSubnets() {
        this.setRangeSubnets(new RangeSubnets(this.getStartIPAddress(), this.getEndIPAddress(), this.getBroadcastIPAddres()));
    }

    public String getEndBinIPAddress() {
        return endBinIPAddress;
    }

    public void setEndBinIPAddress(String endBinIPAddress) {
        this.endBinIPAddress = endBinIPAddress;
    }

    public String getStartBinIPAddress() {
        return startBinIPAddress;
    }

    public void setStartBinIPAddress(String startBinIPAddress) {
        this.startBinIPAddress = startBinIPAddress;
    }

    public String getBroadcastBinIPAddress() {
        return broadcastBinIPAddress;
    }

    public void setBroadcastBinIPAddress(String broadcastBinIPAddress) {
        this.broadcastBinIPAddress = broadcastBinIPAddress;
    }

    public RangeSubnets getRangeSubnets() {
        return rangeSubnets;
    }

    public void setRangeSubnets(RangeSubnets rangeSubnets) {
        this.rangeSubnets = rangeSubnets;
    }

    public BinaryIPAddress getBinaryIPAddress() {
        return binaryIPAddress;
    }

    public void setBinaryIPAddress(BinaryIPAddress binaryIPAddress) {
        this.binaryIPAddress = binaryIPAddress;
    }

    public IPAddress getStartIPAddress() {
        return startIPAddress;
    }

    public void setStartIPAddress(IPAddress startIPAddress) {
        this.startIPAddress = startIPAddress;
    }

    public IPAddress getEndIPAddress() {
        return endIPAddress;
    }

    public void setEndIPAddress(IPAddress endIPAddress) {
        this.endIPAddress = endIPAddress;
    }

    public IPAddress getBroadcastIPAddres() {
        return broadcastIPAddres;
    }

    public void setBroadcastIPAddres(IPAddress broadcastIPAddres) {
        this.broadcastIPAddres = broadcastIPAddres;
    }

    public static void main(String[] args) {
        GetRangeSubnets getRangeSubnets = new GetRangeSubnets("11000000.10011100.01111011.11000000",
                "11000000.10011100.01111011.11011110", "11000000.10011100.01111011.11011111");
        System.out.println(getRangeSubnets.getStartBinIPAddress());
        System.out.println(getRangeSubnets.getEndBinIPAddress());
        System.out.println(getRangeSubnets.getBroadcastBinIPAddress());
        System.out.println(getRangeSubnets.getStartIPAddress().getIPAddress());
        System.out.println(getRangeSubnets.getEndIPAddress().getIPAddress());
        System.out.println(getRangeSubnets.getBroadcastIPAddres().getIPAddress());
        System.out.println(getRangeSubnets.getRangeSubnets().getStartIP().getIPAddress());
    }
}


