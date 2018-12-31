package SubnettingTools.RangeSubnet;

public class BinrayAndOne {

    public BinrayAndOne(String inputBinray, int number) {
        this.init();
        //获取值
        this.setInputBinray(inputBinray);
        //创建输出的二进制
        this.createOutBinary();
    }

    /**
     * 创建下一个占用的主机位
     */
    public void createOutBinary() {
        int length = this.getInputBinray().length();
        boolean key = true;
        for(int i=0;i<length;i++) {
            if (this.getInputBinray().charAt(i) != '1') {
                key = false;
            }
        }
        if (key == false) {
            this.setOutBinary("");
            boolean k = false;
            //可以继续加
            for (int i=length-1;i>=0;i--) {
                if (k == false) {
                    if (this.getInputBinray().charAt(i) == '0') {
                        this.setOutBinary("1" + this.getOutBinary());
                        k = true;
                    } else if (this.getInputBinray().charAt(i) == '1') {
                        this.setOutBinary("0" + this.getOutBinary());
                    }
                } else {
                    this.setOutBinary(this.getInputBinray().charAt(i) + this.getOutBinary());
                }
            }
        } else {
            //不能继续加
            this.setOutBinary(this.getInputBinray());
        }
    }

    /**
     * 初始化
     */
    public void init() {
        this.inputBinray = new String();
        this.outBinary = new String();
    }

    private String inputBinray = null;

    private String outBinary = null;

    private int number = 0;

    public String getInputBinray() {
        return inputBinray;
    }

    public void setInputBinray(String inputBinray) {
        this.inputBinray = inputBinray;
    }

    public String getOutBinary() {
        return outBinary;
    }

    public void setOutBinary(String outBinary) {
        this.outBinary = outBinary;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public static void main(String[] args) {
        String string = "111001";
        BinrayAndOne binrayAndOne = new BinrayAndOne(string, 6);
        System.out.println(binrayAndOne.getOutBinary());

    }
}
