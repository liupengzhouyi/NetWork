package SubnettingTools.IP;

/**
 * 判断你的网络种类 与 子网掩码 是否配套
 */
public class DeterminelKindAndSubnetMask {

    /**
     * 初始化函数
     * @param kind
     * @param subnetMask
     */
    public DeterminelKindAndSubnetMask(String kind, SubnetMask subnetMask) {
        //初始化
        this.init();
        this.kind = kind;
        this.subnetMask = subnetMask;
        //判断你的子网掩码
        this.setKey(this.determinel());
    }

    /**
     * 初始化
     */
    public void init() {
        this.kind = new String();
        this.subnetMask = new SubnetMask(0, 0, 0, 0);
    }

    /**
     * 判断你的子网掩码
     * @return
     */
    public boolean determinel() {
        boolean key = false;
        if(this.getKind().equals("A")) {
            if (this.getSubnetMask().getNumberI() == 255) {
                key = true;
            } else {
                key = false;
            }
        } else if (this.getKind().equals("B")) {
            if (this.getSubnetMask().getNumberI() == 255 && this.getSubnetMask().getNumberII() == 255) {
                key = true;
            } else {
                key = false;
            }
        } else if (this.getKind().equals("C")) {
            if (this.getSubnetMask().getNumberI() == 255
                    && this.getSubnetMask().getNumberII() == 255
                    && this.getSubnetMask().getNumberIII() == 255) {
                key = true;
            } else {
                key = false;
            }
        }
        return key;
    }

    private boolean key = false;

    private String kind = null;

    private SubnetMask subnetMask = null;

    public boolean isKey() {
        return key;
    }

    public void setKey(boolean key) {
        this.key = key;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public SubnetMask getSubnetMask() {
        return subnetMask;
    }

    public void setSubnetMask(SubnetMask subnetMask) {
        this.subnetMask = subnetMask;
    }

    /**
     * 测试函数
     * @param args
     */
    public static void main(String[] args) {
        DeterminelKindAndSubnetMask determinelKindAndSubnetMask = new DeterminelKindAndSubnetMask("C",
                new SubnetMask(255, 255, 255, 0));
        System.out.println(determinelKindAndSubnetMask.isKey());
    }
}
