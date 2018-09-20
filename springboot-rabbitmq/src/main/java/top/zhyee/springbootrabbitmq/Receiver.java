package top.zhyee.springbootrabbitmq;

import org.springframework.stereotype.Component;

/**
 * @author zhyee
 * @date 2018/8/11 下午5:07
 */
@Component
public class Receiver {


    public void receiveMessage(String message) {
        System.out.println("Received <" + message + ">");
    }

}
