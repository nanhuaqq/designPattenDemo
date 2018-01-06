package com.xty.qq.proxy;

/**
 * Created by Administrator on 2018/1/6 0006.
 */
public class IvoryTower implements WizardTower{
    @Override
    public void enter(Wizard wizard) {
        System.out.println(wizard.toString() + " enter the tower");
    }
}
