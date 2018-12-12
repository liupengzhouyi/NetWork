package SubnettingTools.RangeSubnet;

import java.util.ArrayList;
import java.util.List;

public class GetSubnet_Number {

    public GetSubnet_Number(int number) {
        //获取值
        this.number = number;
        //初始化
        this.init();
        //获取你的占用主机位的网络分段
        this.show();

    }

    /**
     * 初始化
     */
    public void init() {
        this.setNumbers();
        this.list = new ArrayList<>();
    }

    /**
     * 获取你的占用主机位的网络分段
     */
    public void show() {
        //System.out.println(this.getHostNumber());
        Division division = new Division(this.getHostNumber());
        //System.out.println(division.getSubnet_number());
        list.add(division.getSubnet_number());
        for (int i=0;i<this.getNumbers()-1;i++) {
            BinrayAndOne binrayAndOne = new BinrayAndOne(this.getHostNumber(), this.getNumber());
            this.setHostNumber(binrayAndOne.getOutBinary());
            //System.out.println(this.getHostNumber());
            Division divisionI = new Division(this.getHostNumber());
            //System.out.println(divisionI.getSubnet_number());
            list.add(divisionI.getSubnet_number());
        }
    }

    private int numbers = 0;

    private int number = 0;

    private String HostNumber = "";

    private ArrayList<String> list = null;

    public int getNumbers() {
        return numbers;
    }

    /**
     * 设置网段数目
     */
    public void setNumbers() {
        this.numbers = 1;
        for(int i=0;i<number;i++) {
            this.numbers = this.numbers * 2;
            this.setHostNumber(this.getHostNumber() + "0");
        }
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getHostNumber() {
        return HostNumber;
    }

    public void setHostNumber(String hostNumber) {
        HostNumber = hostNumber;
    }

    public ArrayList<String> getList() {
        return list;
    }

    public void setList(ArrayList<String> list) {
        this.list = list;
    }

    public static void main(String[] args) {
        GetSubnet_Number getSubnet_number = new GetSubnet_Number(9);
        ArrayList<String> list = getSubnet_number.getList();
        for (String i : list
             ) {
            System.out.println(i);
        }
    }
}
