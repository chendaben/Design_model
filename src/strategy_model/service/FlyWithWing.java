package strategy_model.service;

/**
 * Created by computer on 2016/12/2.
 */
public class FlyWithWing implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("我有翅膀我能飞");
    }
}
