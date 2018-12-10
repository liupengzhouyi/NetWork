package SubnettingTools;

import SubnettingTools.IP.DeterminelKindAndSubnetMask;
import SubnettingTools.IP.IPAddress;
import SubnettingTools.IP.SubnetMask;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "GetInputInformationServlet")
public class GetInputInformationServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //初始化
        this.init();
        //获取值
        this.getValues(request);
        //创建IP地址
        this.createIpAdressNumber();
        //创建子网掩码
        this.createSubnetMask();
        //创建工具类
        this.createSubnettingTool();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    /**
     * 初始化
     */
    public void init() {
        this.IPAddressNumberI = new String();
        this.IPAddressNumberII = new String();
        this.IPAddressNumberIII = new String();
        this.IPAddressNumberIV = new String();
        this.SubnetMaskNumberI = new String();
        this.SubnetMaskNumberII = new String();
        this.SubnetMaskNumberIII = new String();
        this.SubnetMaskNumberIV = new String();
    }

    /**
     * 获取值
     * @param request
     */
    public void getValues(HttpServletRequest request) {
        this.setIPAddressNumberI(request.getParameter("IPAddressNumberI"));
        this.setIPAddressNumberII(request.getParameter("IPAddressNumberII"));
        this.setIPAddressNumberIII(request.getParameter("IPAddressNumberIII"));
        this.setIPAddressNumberIV(request.getParameter("IPAddressNumberIV"));
        this.setSubnetMaskNumberI(request.getParameter("SubnetMaskNumberI"));
        this.setSubnetMaskNumberII(request.getParameter("SubnetMaskNumberII"));
        this.setSubnetMaskNumberIII(request.getParameter("SubnetMaskNumberIII"));
        this.setSubnetMaskNumberIV(request.getParameter("SubnetMaskNumberIV"));
    }

    /**
     * 创建IP地址
     */
    public void createIpAdressNumber() {
        IPAddress ipAddress = new IPAddress(Integer.parseInt(this.getIPAddressNumberI()),
                                            Integer.parseInt(this.getIPAddressNumberII()),
                                            Integer.parseInt(this.getIPAddressNumberIII()),
                                            Integer.parseInt(this.getIPAddressNumberIV()));
        this.setIpAddress(ipAddress);
    }

    /**
     * 创建子网掩码
     */
    public void createSubnetMask() {
        SubnetMask subnetMask = new SubnetMask( Integer.parseInt(this.getSubnetMaskNumberI()),
                                                Integer.parseInt(this.getSubnetMaskNumberII()),
                                                Integer.parseInt(this.getSubnetMaskNumberIII()),
                                                Integer.parseInt(this.getSubnetMaskNumberIV()));
        this.setSubnetMask(subnetMask);
    }

    /**
     * 创建网址判断的工具
     */
    public void createSubnettingTool() {
        SubnettingTool subnettingTool = new SubnettingTool(this.getIpAddress(), this.getSubnetMask());
        this.setSubnettingTool(subnettingTool);
    }

    /**
     * 判断输入
     */
    public void determineInput() {
        int number = 0;
        String kind = this.getSubnettingTool().getNetKind();
        DeterminelKindAndSubnetMask determinelKindAndSubnetMask = new DeterminelKindAndSubnetMask(kind, this.getSubnetMask());
        boolean key = determinelKindAndSubnetMask.isKey();
        if (key) {
            //IP与子网掩码配套

        } else {
            //IP与子网掩码 不 配套

        }

    }

    private String IPAddressNumberI = null;

    private String IPAddressNumberII = null;

    private String IPAddressNumberIII = null;

    private String IPAddressNumberIV = null;

    private String SubnetMaskNumberI = null;

    private String SubnetMaskNumberII = null;

    private String SubnetMaskNumberIII = null;

    private String SubnetMaskNumberIV = null;

    private IPAddress ipAddress = null;

    private SubnetMask subnetMask = null;

    private SubnettingTool subnettingTool = null;

    public String getIPAddressNumberI() {
        return IPAddressNumberI;
    }

    public void setIPAddressNumberI(String IPAddressNumberI) {
        this.IPAddressNumberI = IPAddressNumberI;
    }

    public String getIPAddressNumberII() {
        return IPAddressNumberII;
    }

    public void setIPAddressNumberII(String IPAddressNumberII) {
        this.IPAddressNumberII = IPAddressNumberII;
    }

    public String getIPAddressNumberIII() {
        return IPAddressNumberIII;
    }

    public void setIPAddressNumberIII(String IPAddressNumberIII) {
        this.IPAddressNumberIII = IPAddressNumberIII;
    }

    public String getIPAddressNumberIV() {
        return IPAddressNumberIV;
    }

    public void setIPAddressNumberIV(String IPAddressNumberIV) {
        this.IPAddressNumberIV = IPAddressNumberIV;
    }

    public String getSubnetMaskNumberI() {
        return SubnetMaskNumberI;
    }

    public void setSubnetMaskNumberI(String subnetMaskNumberI) {
        SubnetMaskNumberI = subnetMaskNumberI;
    }

    public String getSubnetMaskNumberII() {
        return SubnetMaskNumberII;
    }

    public void setSubnetMaskNumberII(String subnetMaskNumberII) {
        SubnetMaskNumberII = subnetMaskNumberII;
    }

    public String getSubnetMaskNumberIII() {
        return SubnetMaskNumberIII;
    }

    public void setSubnetMaskNumberIII(String subnetMaskNumberIII) {
        SubnetMaskNumberIII = subnetMaskNumberIII;
    }

    public String getSubnetMaskNumberIV() {
        return SubnetMaskNumberIV;
    }

    public void setSubnetMaskNumberIV(String subnetMaskNumberIV) {
        SubnetMaskNumberIV = subnetMaskNumberIV;
    }

    public IPAddress getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(IPAddress ipAddress) {
        this.ipAddress = ipAddress;
    }

    public SubnetMask getSubnetMask() {
        return subnetMask;
    }

    public void setSubnetMask(SubnetMask subnetMask) {
        this.subnetMask = subnetMask;
    }

    public SubnettingTool getSubnettingTool() {
        return subnettingTool;
    }

    public void setSubnettingTool(SubnettingTool subnettingTool) {
        this.subnettingTool = subnettingTool;
    }
}
