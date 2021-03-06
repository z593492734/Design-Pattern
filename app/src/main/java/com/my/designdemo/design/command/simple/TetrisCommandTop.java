package com.my.designdemo.design.command.simple;

/**
 * Author: mengyuan
 * Date  : 2020/9/9/5:41 PM
 * E-Mail: mengyuanzz@126.com
 * -----------
 * 命令模式-Command的具体实现
 */
public class TetrisCommandTop implements TetrisCommand {

    private TetrisReceiver receiver;

    public TetrisCommandTop(TetrisReceiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public String execute() {
        return receiver.top();
    }
}
