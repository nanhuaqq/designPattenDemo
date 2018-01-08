package com.xty.qq.command;

/**
 * Created by Administrator on 2018/1/8 0008.
 */
public class ShrinkSpell extends Command {

    private Size oldSize;
    private Target target;

    @Override
    public void execute(Target target) {
        oldSize = target.getSize();
        target.setSize(Size.SMALL);
        this.target = target;
    }

    @Override
    public void undo() {
        if (oldSize != null && target != null) {
            Size temp = target.getSize();
            target.setSize(oldSize);
            oldSize = temp;
        }
    }

    @Override
    public void redo() {
        undo();
    }

    @Override
    public String toString() {
        return "Shrink spell";
    }
}
