package com.inner.design.Pattern.SingleThreadExecution;

/**
 * @Date:           2020/6/24
 * @Author:         dengpeng
 * @Description:    安检类
 */
public class FlightSecurity {

    //  计数
    private int count;

    //  登机牌
    private String bordingPass = "null";

    private String idCard = "null";

    //  加入不用synchronized修饰，则会出现异常
    //  pass方法保证了同步，其中check方法也就保证了同步
    public synchronized void pass(String bordingPass,String idCard) {

        this.bordingPass = bordingPass;
        this.idCard = idCard;
        this.count++;

        check();

    }

    private void check() {

        //  简单的测试，当登机牌和身份证首字母不相同时则表示检查不通过
        if (bordingPass.charAt(0) != idCard.charAt(0)) {
            throw new RuntimeException("==Exception==" + toString());
        }

    }

    public String toString() {
        return "第" + count + "客户的登机牌和证件号为：[" + bordingPass + "," + idCard + "]";
    }


}
