package com.haungminghao.Interface;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @User:Mingaho
 * @Date:2021/09/20
 * @Time:15:32
 */
public class TestLockDoor {
    public static void main(String[] args) {
        LockDoor lockDoor = new LockDoor();
        lockDoor.closeDoor();
        lockDoor.closeLock();
        lockDoor.openDoor();
        lockDoor.openLock();
    }
}
