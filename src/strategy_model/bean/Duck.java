package strategy_model.bean;

import strategy_model.service.FlyBehavior;

/**
 * Created by computer on 2016/12/1.
 */
public abstract class Duck {
    public Duck() {
    }

    public FlyBehavior flyBehavior;
//    抽象方法
    public abstract  void display();

    public void displayFly(){
        flyBehavior.fly();
    }


}
