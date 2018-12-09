package SubnettingTools.IP;

public class DetermineSubnetMask {

    /**
     * 沟槽函数
     * @param subnetMask 一个IP子网掩码
     */
    public DetermineSubnetMask(SubnetMask subnetMask) {
        //初始化
        this.init();
        //获取值
        this.setSubnetMask(subnetMask);
        //剥离
        this.getNumbers();
        //判断子网掩码是否合法
        this.judgeSubnetMask();
    }

    /**
     * 初始化函数
     */
    public void init() {
        this.subnetMask = new SubnetMask(0, 0, 0, 0);
    }

    /**
     * 剥离函数
     */
    public void getNumbers() {
        this.setNumberI(this.getSubnetMask().getNumberI());
        this.setNumberII(this.getSubnetMask().getNumberII());
        this.setNumberIII(this.getSubnetMask().getNumberIII());
        this.setNumberIV(this.getSubnetMask().getNumberIV());
    }

    /**
     * 判读一个数字是否小于等于255 并且 大雨等于 0
     * @param number
     * @return
     */
    public boolean judgeNumber(int number) {
        boolean key = false;
        if (number < 0 || number > 255) {
            key = false;
        } else {
            key = true;
        }
        return key;
    }

    /**
     * 判断子网掩码是否合法
     * @return
     */
    public boolean judgeSubnetMask() {
        boolean key = false;
        boolean keyI = this.judgeNumber(this.getNumberI());
        boolean keyII = this.judgeNumber(this.getNumberII());
        boolean keyIII = this.judgeNumber(this.getNumberIII());
        boolean keyIV = this.judgeNumber(this.getNumberIV());
        if (keyI && keyII && keyIII && keyIV) {
            key = true;
            this.setKind(1);
        } else {
            this.setKind(0);
        }

        return key;
    }

    private int kind = 0;

    private SubnetMask subnetMask = null;

    public int getKind() {
        return kind;
    }

    public void setKind(int kind) {
        this.kind = kind;
    }

    public SubnetMask getSubnetMask() {
        return subnetMask;
    }

    public void setSubnetMask(SubnetMask subnetMask) {
        this.subnetMask = subnetMask;
    }

    private int numberI = 0;
    private int numberII = 0;
    private int numberIII = 0;
    private int numberIV = 0;

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

    /**
     * 测试函数
     * @param args
     */
    public static void main(String[] args) {
        DetermineSubnetMask determineSubnetMask = new DetermineSubnetMask(new SubnetMask(255, 255, 122, 12 ));
        System.out.println(determineSubnetMask.getKind());
    }
}
