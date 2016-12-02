package strategy_model.test;

import strategy_model.bean.Duck;

/**
 * Created by computer on 2016/12/2.
 */
public class test {
    public static void main(String args[]){
        Duck blackDuck=new BlackDuck();
        blackDuck.display();
        blackDuck.displayFly();

        System.out.print("一家6人,外加一警察,和一个罪犯共8人~警察不在," +
                "罪犯会杀死所有的人,母亲不在,父亲会杀死两个女儿,父亲不在," +
                "母亲会杀死2个儿子.一天他们要过河,船只能在两个人." +
                "父亲母亲警察会划船,其他人都不会. 怎样才能使他们8个人过河?");


    }
}
