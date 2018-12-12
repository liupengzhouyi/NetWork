package SubnettingTools.RangeSubnet;

public class Division {

    private String subnet_number = null;

    private String ordSubnetNumber = null;

    /**
     * 构造函数
     * @param ordSubnetNumber
     */
    public Division(String ordSubnetNumber) {
        //初始化
        this.init();
        //获取值
        this.setOrdSubnetNumber(ordSubnetNumber);
        //创建IP格式的主机位
        this.createIPAdress();
    }

    /**
     * 初始化
     */
    public void init() {
        this.ordSubnetNumber = new String();
        this.subnet_number = new String();
    }

    public String getSubnet_number() {
        return subnet_number;
    }

    public void setSubnet_number(String subnet_number) {
        this.subnet_number = subnet_number;
    }

    public String getOrdSubnetNumber() {
        return ordSubnetNumber;
    }

    public void setOrdSubnetNumber(String ordSubnetNumber) {
        this.ordSubnetNumber = ordSubnetNumber;
    }

    /**
     * 创建IP格式的主机位
     */
    public void createIPAdress() {
        int j=0;
        for (int i=0;i<this.getOrdSubnetNumber().length();i++) {
            this.setSubnet_number(this.getSubnet_number() + this.getOrdSubnetNumber().charAt(i));
            j++;
            if (j == 8) {
                j = 0;
                this.setSubnet_number(this.getSubnet_number() + ".");
            }
        }
    }

    /**
     * 获取你的
     * @param args
     */
    public static void main(String[] args) {
        Division division = new Division("100010101010");
        System.out.println(division.getSubnet_number());
    }
}
