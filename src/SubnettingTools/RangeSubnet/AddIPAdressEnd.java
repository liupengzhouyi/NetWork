package SubnettingTools.RangeSubnet;

public class AddIPAdressEnd {



    private String stringI = "00000000.00000000.00000000.00000000";

    private String stringII = "11111111.11111111.11111111.11111110";

    private String stringIII = "11111111.11111111.11111111.11111111";

    private String stringIp = "";

    private String stringBinI = null;

    private String stringBinII = null;

    private String stringBinIII = null;

    public AddIPAdressEnd(String stringIp) {
        //初始化
        this.init();
        //获取值
        this.setStringIp(stringIp);
        this.setStringI();
        this.setStringII();
        this.setStringIII();
        //创建二进制的IP开始地址
        this.createStartBinIpAddress();
        //创建二进制的IP结束地址
        this.createEndBinIPAddress();
        //创建二进制的IP广播地址
        this.createBroadcastBinIPAddress();
    }

    /**
     * 初始化
     */
    public void init() {
        this.stringI = new String();
        this.stringII = new String();
        this.stringIII = new String();
        this.stringIp = new String();
        this.stringBinI = new String();
        this.stringBinII = new String();
        this.stringBinIII = new String();
    }

    /**
     * 创建二进制的IP开始地址
     */
    public void createStartBinIpAddress() {
        int number = this.getStringI().length();
        int length = this.getStringIp().length();
        this.setStringBinI(this.getStringIp());
        //System.out.println(length + " : " + number);
        for (int i=length;i<number;i++) {
            //System.out.println(this.getStringI().charAt(i));
            this.setStringBinI(this.getStringBinI() + this.getStringI().charAt(i));
        }
    }

    /**
     * 创建二进制的IP结束地址
     */
    public void createEndBinIPAddress() {
        int number = this.getStringII().length();
        int length = this.getStringIp().length();
        this.setStringBinII(this.getStringIp());
        for (int i=length;i<number;i++) {
            this.setStringBinII(this.getStringBinII() + this.getStringII().charAt(i));
        }
    }

    /**
     * 创建二进制的IP广播地址
     */
    public void createBroadcastBinIPAddress() {
        int number = this.getStringIII().length();
        int length = this.getStringIp().length();
        this.setStringBinIII(this.getStringIp());
        for (int i=length;i<number;i++) {
            this.setStringBinIII(this.getStringBinIII() + this.getStringIII().charAt(i));
        }
    }


    public String getStringI() {
        return stringI;
    }

    public void setStringI() {
        this.stringI = "00000000.00000000.00000000.00000000";
    }

    public String getStringII() {
        return stringII;
    }

    public void setStringII() {
        this.stringII = "11111111.11111111.11111111.11111110";
    }

    public String getStringIII() {
        return stringIII;
    }

    public void setStringIII() {
        this.stringIII = "11111111.11111111.11111111.11111111";
    }

    public String getStringIp() {
        return stringIp;
    }

    public void setStringIp(String stringIp) {
        this.stringIp = stringIp;
    }

    public String getStringBinI() {
        return stringBinI;
    }

    public void setStringBinI(String stringBinI) {
        this.stringBinI = stringBinI;
    }

    public String getStringBinII() {
        return stringBinII;
    }

    public void setStringBinII(String stringBinII) {
        this.stringBinII = stringBinII;
    }

    public String getStringBinIII() {
        return stringBinIII;
    }

    public void setStringBinIII(String stringBinIII) {
        this.stringBinIII = stringBinIII;
    }

    public static void main(String[] args) {
        AddIPAdressEnd addIPAdressEnd = new AddIPAdressEnd("11000000.10011100.01111011.110");
        System.out.println(addIPAdressEnd.getStringBinI());
        System.out.println(addIPAdressEnd.getStringBinII());
        System.out.println(addIPAdressEnd.getStringBinIII());
    }
}
