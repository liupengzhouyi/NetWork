package SubnettingTools.Tools;

public class BinaryAddOne {

    /**
     * 构造函数
     * @param ordBinary
     */
    public BinaryAddOne(String ordBinary) {
        //获取值
        this.setOrdBinary(ordBinary);
        // 创建 新的 二进制
        this.createnewBinary();
    }

    /**
     * 创建 新的 二进制
     */
    public void createnewBinary() {
        String string = this.getOrdBinary();
        String str = "";
        for (int i=0; i<string.length(); i++) {
            if (string.charAt(i) != '.') {
                str = str + string.charAt(i);
            }
        }
        //System.out.println(str);
        str = Binary(str);
        //System.out.println(str);
        String str1 = "";
        int j=0;
        for (int i=0;i<str.length();i++) {
            str1 = str1 + str.charAt(i);
            j++;
            if (j == 8) {
                str1 = str1 + ".";
                j = 0;
            }
        }
        //System.out.println(str1);
        this.setNewBinary(str1);
    }

    public String Binary(String BinaryNumber) {
        String binaryNumber = "";
        boolean key = false;
        for (int i=BinaryNumber.length()-1;i>=0;i--) {
            if (key == false) {
                if (BinaryNumber.charAt(i) == '0') {
                    binaryNumber = "1" + binaryNumber;
                    key = true;
                } else if (BinaryNumber.charAt(i) == '1') {
                    binaryNumber = "0" + binaryNumber;
                }
            } else {
                //System.out.print(BinaryNumber.charAt(i));
                binaryNumber = BinaryNumber.charAt(i) + binaryNumber;
            }
        }
        return binaryNumber;
    }


    private String ordBinary;

    private String newBinary;

    public String getOrdBinary() {
        return ordBinary;
    }

    public void setOrdBinary(String ordBinary) {
        this.ordBinary = ordBinary;
    }

    public String getNewBinary() {
        return newBinary;
    }

    public void setNewBinary(String newBinary) {
        this.newBinary = newBinary;
    }

    /**
     * 测试函数
     * @param args
     */
    public static void main(String[] args) {
        BinaryAddOne binaryAddOne = new BinaryAddOne("00001100.00001100.001");
        System.out.println(binaryAddOne.getNewBinary());
    }
}
