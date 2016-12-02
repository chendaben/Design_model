package strategy_model.test;

import strategy_model.bean.Duck;
import strategy_model.service.FlyWithWing;

/**
 * Created by computer on 2016/12/2.
 */
public class BlackDuck extends Duck {

    public BlackDuck(){
        flyBehavior=new FlyWithWing();
    }
    @Override
    public void display() {
        System.out.println("我是一只黑鸭");
    }
}
