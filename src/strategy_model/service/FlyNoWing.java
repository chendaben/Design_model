package strategy_model.service;

/**
 * Created by computer on 2016/12/2.
 */
public class FlyNoWing implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("没有翅膀不能飞");
    }
}
