package com.xty.qq.command;

/**
 * Created by Administrator on 2018/1/8 0008.
 */
public abstract class Command {

    public abstract void execute(Target target);

    public abstract void undo();

    public abstract void redo();

    @Override
    public abstract String toString();
}
