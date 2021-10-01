package com.haungminghao.Interface;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @User:Mingaho
 * @Date:2021/09/20
 * @Time:15:28
 */
public class LockDoor extends Door implements Lock {
    @Override
    public void openDoor() {
        System.out.println("开门");
    }

    @Override
    public void closeDoor() {
        System.out.println("关门");
    }

    @Override
    public void openLock() {
        System.out.println("开锁");

    }

    @Override
    public void closeLock() {
        System.out.println("上锁");
    }
}
