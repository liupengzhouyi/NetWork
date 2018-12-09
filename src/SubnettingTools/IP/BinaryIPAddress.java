package SubnettingTools.IP;

public class BinaryIPAddress {

    public BinaryIPAddress(String numberI, String numberII, String numberIII, String numberIV) {
        //初始化
        this.init();
        //获取值
        this.numberI = numberI;
        this.numberII = numberII;
        this.numberIII = numberIII;
        this.numberIV = numberIV;
    }

    /**
     * 初始化
     */
    public void init() {
        this.numberI = new String();
        this.numberII = new String();
        this.numberIII = new String();
        this.numberIV = new String();
    }

    /**
     * 获取 SubnettingTools.IP 二进制 表示
     * @return
     */
    public String getBinaryIPAddress() {
        String string = "";
        string = this.getNumberI() + this.getNumberII() + this.getNumberIII() + this.getNumberIV();
        return string;
    }

    private String numberI = null;

    private String numberII = null;

    private String numberIII = null;

    private String numberIV = null;

    public String getNumberI() {
        return numberI;
    }

    public void setNumberI(String numberI) {
        this.numberI = numberI;
    }

    public String getNumberII() {
        return numberII;
    }

    public void setNumberII(String numberII) {
        this.numberII = numberII;
    }

    public String getNumberIII() {
        return numberIII;
    }

    public void setNumberIII(String numberIII) {
        this.numberIII = numberIII;
    }

    public String getNumberIV() {
        return numberIV;
    }

    public void setNumberIV(String numberIV) {
        this.numberIV = numberIV;
    }
}
