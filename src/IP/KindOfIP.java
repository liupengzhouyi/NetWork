package IP;

public class KindOfIP {
    /**
     * 构造函数
     * @param ipAddress
     */
    public KindOfIP(IPAddress ipAddress) {
        //设置
        this.setIpAddress(ipAddress);
        //判定IP种类
        this.whichKind();
    }

    private IPAddress ipAddress;

    private int kind = 0;

    public IPAddress getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(IPAddress ipAddress) {
        this.ipAddress = ipAddress;
    }

    public int getKind() {
        return kind;
    }

    public void setKind(int kind) {
        this.kind = kind;
    }

    /**
     * 判断 你的 IP 种类
     */
    public void whichKind() {
        int numberI     = this.getIpAddress().getNumberI();
        int numberII    = this.getIpAddress().getNumberII();
        int numberIII   = this.getIpAddress().getNumberIII();
        int numberIV    = this.getIpAddress().getNumberIV();
        if (numberI < 126) {
            this.kind = 1;
        } else if (numberI == 126 && numberII == 0 && numberIII == 0 && numberIV == 0) {
            this.kind = 1;
        } else if (numberI <= 191 && numberI >= 128) {
            this.kind = 2;
        } else if (numberI >= 192 && numberI <= 223) {
            this.kind = 3;
        }
    }

    /**
     * 测试数据
     * @param args
     */
    public static void main(String[] args) {
        KindOfIP kindOfIP = new KindOfIP(new IPAddress(125, 255, 255, 255));
        System.out.println(kindOfIP.getKind());
    }


}
