package Tools;

public class BinrayToDecimal {

    /**
     * 初始化
     * @param binary
     */
    public BinrayToDecimal(String binary) {
        this.binary = binary;
        this.setNumber();
    }



    private int number;

    private String binary = null;

    public String getBinary() {
        return binary;
    }

    public void setBinary(String binary) {
        this.binary = binary;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber() {
        int[] a = new int[8];
        a[0] = 128;
        a[1] = 64;
        a[2] = 32;
        a[3] = 16;
        a[4] = 8;
        a[5] = 4;
        a[6] = 2;
        a[7] = 1;
        String string = this.getBinary();
        int num = 0;
        for (int i=0;i<8;i++) {
            if (string.charAt(i) == '1') {
                num = num + a[i];
            }
        }
        this.number = num;
    }

    public static void main(String[] args) {
        BinrayToDecimal binrayToDecimal = new BinrayToDecimal("10000011");
        System.out.println(binrayToDecimal.getNumber());
    }
}
