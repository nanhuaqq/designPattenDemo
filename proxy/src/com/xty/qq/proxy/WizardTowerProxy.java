package com.xty.qq.proxy;

/**
 * Created by Administrator on 2018/1/6 0006.
 */
public class WizardTowerProxy implements WizardTower {

    public static final int NUM_WIZARDS_ALLOWED = 3;

    private int numLimit;

    private WizardTower wizardTower;

    public WizardTowerProxy(WizardTower wizardTower) {
        this.wizardTower = wizardTower;
    }

    @Override
    public void enter(Wizard wizard) {
        if (numLimit < NUM_WIZARDS_ALLOWED){
            wizardTower.enter(wizard);
            numLimit ++ ;
        }else {
            System.out.println(wizard.toString() + " is not allowed to enter");
        }
    }
}
