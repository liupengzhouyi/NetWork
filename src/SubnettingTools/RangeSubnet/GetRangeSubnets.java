package SubnettingTools.RangeSubnet;

import SubnettingTools.IP.BinaryIPAddress;
import SubnettingTools.Subnet.RangeSubnet;

public class GetRangeSubnets {

    private String endBinIPAddress = null;

    private String startBinIPAddress = null;

    private String broadcastBinIPAddress = null;

    private RangeSubnet rangeSubnet = null;

    private BinaryIPAddress binaryIPAddress = null;

    /**
     * 构造函数
     * @param endBinIPAddress
     * @param startBinIPAddress
     * @param broadcastBinIPAddress
     */
    public GetRangeSubnets(String endBinIPAddress, String startBinIPAddress, String broadcastBinIPAddress) {
        this.endBinIPAddress = endBinIPAddress;
        this.startBinIPAddress = startBinIPAddress;
        this.broadcastBinIPAddress = broadcastBinIPAddress;
    }

    public void init() {

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

    public RangeSubnet getRangeSubnet() {
        return rangeSubnet;
    }

    public void setRangeSubnet(RangeSubnet rangeSubnet) {
        this.rangeSubnet = rangeSubnet;
    }

    public BinaryIPAddress getBinaryIPAddress() {
        return binaryIPAddress;
    }

    public void setBinaryIPAddress(BinaryIPAddress binaryIPAddress) {
        this.binaryIPAddress = binaryIPAddress;
    }
}
