package com.inner.design.Pattern.SingleThreadExecution;

/**
 * @Date:           2020/6/25
 * @Author:         dengpeng
 * @Description:    测试类
 */
public class FightSecurityTest {

    static class Passengers extends Thread {

        private final FlightSecurity flightSecurity;

        //  旅客的身份证
        private final String idCard;

        //  旅客的登机牌
        private final String boardingPass;

        Passengers(FlightSecurity flightSecurity, String idCard, String boardingPass) {
            this.flightSecurity = flightSecurity;
            this.idCard = idCard;
            this.boardingPass = boardingPass;
        }

        @Override
        public void run() {

            while (true) {
                //  旅客不断进行安检
                flightSecurity.pass(boardingPass,idCard);
            }
        }

    }

    public static void main(String[] args) {

        //  定义三个旅客
        final FlightSecurity flightSecurity = new FlightSecurity();

        new Passengers(flightSecurity,"A123456","AF123456").start();
        new Passengers(flightSecurity,"B123456","BF123456").start();
        new Passengers(flightSecurity,"C123456","CF123456").start();

    }

}
