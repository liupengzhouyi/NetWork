package SubnettingTools.RangeSubnet;

import SubnettingTools.IP.IPAddress;
import SubnettingTools.Subnet.RangeSubnet;

import java.util.ArrayList;

public class GetAllSubnet {

    public GetAllSubnet(IPAddress ipAddress, int kind, int number) {
        //初始化
        this.init();
        //获取值
        this.setIpAddress(ipAddress);
        this.setKind(kind);
        this.setNumber(number);
        //设置你的IP前缀
        this.createGetIP();
        //设置你的占用的主机位
        this.createGetSubnet_number();
        //设置你的子网范围
        this.createSubnet();
    }

    /**
     * 初始化
     */
    public void init() {
        this.ipAddress = new IPAddress(0, 0, 0, 0);
        this.getSubnet_number = new GetSubnet_Number(0);
        this.startBinIPAddress = new String();
        this.endBinIPAddress = new String();
        this.broadcastBinIPAddress = new String();
        this.setArrayList(new ArrayList<RangeSubnets>());
    }

    /**
     * 设置你的IP前缀
     */
    public void createGetIP() {
        this.setGetIP_(new GetIP_(this.getIpAddress(), this.getKind()));
    }

    /**
     * 设置你的占用的主机位
     */
    public void createGetSubnet_number() {
        this.setGetSubnet_number(new GetSubnet_Number(this.getNumber()));
    }

    private IPAddress ipAddress = null;

    private int kind = 0;

    private GetIP_ getIP_ = null;

    private GetSubnet_Number getSubnet_number = null;

    private int number = 0;

    private ArrayList<String> list = null;

    private String endBinIPAddress = null;

    private String startBinIPAddress = null;

    private String broadcastBinIPAddress = null;

    private ArrayList<RangeSubnets> arrayList = null;

    /**
     * 构建网段开启结束
     */
    public void createSubnet() {
        //int i=0;
        ArrayList<String> subnetNumbers = this.getSubnet_number.getList();
        this.setStartBinIPAddress(this.getIP_.getBinString());
        for (String subnetNumber : subnetNumbers
             ) {
            //System.out.println(this.getStartBinIPAddress());
            //System.out.println(subnetNumber);
            String strI = this.getStartBinIPAddress() + subnetNumber;
            //System.out.println(strI);
            String tempString = strI;
            AddIPAdressEnd addIPAdressEnd = new AddIPAdressEnd(tempString);

            /*System.out.println(addIPAdressEnd.getStringBinI());
            System.out.println(addIPAdressEnd.getStringBinII());
            System.out.println(addIPAdressEnd.getStringBinIII());*/

            //System.out.println(i);
            //i++;
            GetRangeSubnets getRangeSubnets = new GetRangeSubnets(addIPAdressEnd.getStringBinI(),
                                                                    addIPAdressEnd.getStringBinII(),
                                                                    addIPAdressEnd.getStringBinIII());

            RangeSubnets rangeSubnets = new RangeSubnets(getRangeSubnets.getStartIPAddress(), getRangeSubnets.getEndIPAddress(), getRangeSubnets.getBroadcastIPAddres());

            //rangeSubnets.show();

            //getRangeSubnets.show();

            this.getArrayList().add(rangeSubnets);

        }

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

    public GetIP_ getGetIP_() {
        return getIP_;
    }

    public void setGetIP_(GetIP_ getIP_) {
        this.getIP_ = getIP_;
    }

    public GetSubnet_Number getGetSubnet_number() {
        return getSubnet_number;
    }

    public void setGetSubnet_number(GetSubnet_Number getSubnet_number) {
        this.getSubnet_number = getSubnet_number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public ArrayList<String> getList() {
        return list;
    }

    public void setList(ArrayList<String> list) {
        this.list = list;
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

    public ArrayList<RangeSubnets> getArrayList() {
        return arrayList;
    }

    public void setArrayList(ArrayList<RangeSubnets> arrayList) {
        this.arrayList = arrayList;
    }

    /**
     * 测、测试输出版本
     */
    public void testShow() {
        ArrayList<RangeSubnets> l = this.getArrayList();
        for (RangeSubnets rangeSubnets : l
             ) {
            rangeSubnets.show();
        }
    }

    public static void main(String[] args) {
        GetAllSubnet getAllSubnet = new GetAllSubnet(new IPAddress(10, 156, 123, 68), 1, 15);

        getAllSubnet.testShow();
    }
}
