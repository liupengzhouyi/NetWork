package IP;

public class DetermineIP {

    private IPAddress ipAddress = null;

    private int key = 0;

    public DetermineIP(IPAddress ipAddress) {
        this.setIpAddress(ipAddress);
        this.determinel();
    }

    public IPAddress getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(IPAddress ipAddress) {
        this.ipAddress = ipAddress;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    /**
     * 判断IP
     * -1 不合法
     * 0 私有IP
     * 1 公有IP
     */
    public void determinel() {
        int numberI = this.getIpAddress().getNumberI();
        int numberII = this.getIpAddress().getNumberII();
        int numberIII = this.getIpAddress().getNumberIII();
        int numberIV = this.getIpAddress().getNumberIV();
        boolean keyI = false;
        boolean keyII = false;
        boolean keyIII = false;
        boolean keyIV = false;

        //-----------------------------------------------------------------------------------1
        if (numberI > 255 || numberI < 0) {
            //IP 地址不合法
            this.setKey(-1);
        } else {
            if (numberI == 10 || numberI == 172 || numberI == 192) {
                //有私有IP的嫌疑
                keyI = true;
            }
            //-------------------------------------------------------------------------------2
            if (numberII > 255 || numberII < 0) {
                //IP 地址不合法
                this.setKey(-1);
            } else {
                if (numberI == 10) {
                    //有私有IP的嫌疑
                    keyII = true;
                } else if (numberI == 172 && numberII <= 31 && numberII >= 16) {
                    //有私有IP的嫌疑
                    keyII = true;
                } else if (numberI == 192 && numberII == 168) {
                    //有私有IP的嫌疑
                    keyII = true;
                }
                //----------------------------------------------------------------------------3
                if (numberIII > 255 || numberIII < 0) {
                    //IP 地址不合法
                    this.setKey(-1);
                } else {
                    if (numberI == 10) {
                        //有私有IP的嫌疑
                        keyIII = true;
                    } else if (numberI == 172) {
                        //有私有IP的嫌疑
                        keyIII = true;
                    } else if (numberI == 192) {
                        //有私有IP的嫌疑
                        keyIII = true;
                    }
                    //------------------------------------------------------------------------4
                    if (numberIV > 255 || numberIV < 0) {
                        //IP 地址不合法
                        this.setKey(-1);
                    } else {
                        if (numberI == 10) {
                            //有私有IP的嫌疑
                            keyIV = true;
                        } else if (numberI == 172) {
                            //有私有IP的嫌疑
                            keyIV = true;
                        } else if (numberI == 192) {
                            //有私有IP的嫌疑
                            keyIV = true;
                        }
                    }
                }
            }
        }

        if (keyI && keyII && keyIII && keyIV) {
            //表示私有IP
            this.setKey(0);
        } else if (this.getKey() != -1){
            //表示公网IP
            this.setKey(1);
        } else {
            //表示IP不合法
            this.setKey(-1);
        }
    }

    /**
     * 测试IP判断
     * @param args
     */
    public static void main(String[] args) {
        for (int i=0;i<256;i++) {
            for (int j=0;j<256;j++) {
                int l = 12;
                int k = 13;
                DetermineIP determineIP = new DetermineIP(new IPAddress(i, j, l, k));
                if (determineIP.getKey() == 0) {
                    System.out.print(i + "." + j + "." + l + "." + k + " : ");
                    System.out.println(determineIP.getKey());
                }
            }
        }

    }
}
