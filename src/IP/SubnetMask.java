package IP;

import Tools.DecimalTobinary;

public class SubnetMask {

    public SubnetMask(int numberI, int numberII, int numberIII, int numberIV) {
        //初始化
        this.init();
        //获取值
        this.numberI = numberI;
        this.numberII = numberII;
        this.numberIII = numberIII;
        this.numberIV = numberIV;
        //设置子网掩码
        this.setSubnetMask();
        //设置二进制子网掩码
        this.setBinSubnetMask();
    }

    /**
     * 初始化函数
     */
    public void init() {
        this.binSubnetMask = new String();
        this.SubnetMask = new String();
    }

    String SubnetMask = null;

    String binSubnetMask = null;

    int numberI = 0;

    int numberII = 0;

    int numberIII = 0;

    int numberIV = 0;



    public String getSubnetMask() {
        return SubnetMask;
    }

    /**
     * 设置子网掩码
     */
    public void setSubnetMask() {
        SubnetMask =  this.getNumberI() + "." + this.getNumberII() + "." + this.getNumberIII() + "." + this.getNumberIV();
    }

    public String getBinSubnetMask() {
        return binSubnetMask;
    }

    /**
     * 设置二进制的子网掩码
     */
    public void setBinSubnetMask() {
        DecimalTobinary decimalTobinaryI = new DecimalTobinary(this.getNumberI());
        DecimalTobinary decimalTobinaryII = new DecimalTobinary(this.getNumberII());
        DecimalTobinary decimalTobinaryIII = new DecimalTobinary(this.getNumberIII());
        DecimalTobinary decimalTobinaryIV = new DecimalTobinary(this.getNumberIV());
        this.binSubnetMask = decimalTobinaryI.getBinary() + "."
                                + decimalTobinaryII.getBinary() + "."
                                + decimalTobinaryIII.getBinary() + "."
                                + decimalTobinaryIV.getBinary();
    }

    public int getNumberI() {
        return numberI;
    }

    public void setNumberI(int numberI) {
        this.numberI = numberI;
    }

    public int getNumberII() {
        return numberII;
    }

    public void setNumberII(int numberII) {
        this.numberII = numberII;
    }

    public int getNumberIII() {
        return numberIII;
    }

    public void setNumberIII(int numberIII) {
        this.numberIII = numberIII;
    }

    public int getNumberIV() {
        return numberIV;
    }

    public void setNumberIV(int numberIV) {
        this.numberIV = numberIV;
    }

    public static void main(String[] args) {
        IP.SubnetMask subnetMask = new SubnetMask(255,255,255, 0);
        System.out.println(subnetMask.getSubnetMask());
        System.out.println(subnetMask.getBinSubnetMask());
    }

}
