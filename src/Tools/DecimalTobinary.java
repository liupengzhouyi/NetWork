package Tools;

public class DecimalTobinary {
    public DecimalTobinary(int decimal) {
        //初始化函数
        this.init();
        //获取被转二进制的数
        this.setDecimal(decimal);
        //转化二进制
        this.createBin();
        //补位
        this.addedDigits();
    }

    /**
     * 初始化函数
     */
    public void init() {
        this.binary = new String();
        this.setBinary("");
    }

    /**
     * 创建二进制数
     */
    public void createBin() {
        int number = this.getDecimal();
        while(number >= 1) {
            int tempNumnber = number % 2;
            this.setBinary(tempNumnber + this.getBinary());
            number = number / 2;
        }
    }

    /**
     * 二进制补位
     * 构成8位二进制
     */
    public void addedDigits() {
        int length = this.getBinary().length();
        for (int i=0;i<8-length;i++) {
            this.setBinary("0" + this.getBinary());
        }
    }


    int decimal = 0;

    String binary = null;

    public int getDecimal() {
        return decimal;
    }

    public void setDecimal(int decimal) {
        this.decimal = decimal;
    }

    public String getBinary() {
        return binary;
    }

    public void setBinary(String binary) {
        this.binary = binary;
    }

    /**
     * 测试函数
     * @param args
     */
    public static void main(String[] args) {
        DecimalTobinary decimalTobinary = new DecimalTobinary(35);
        System.out.println(decimalTobinary.getBinary());
    }
}
