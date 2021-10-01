package com.huangminghao;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @User:Mingaho
 * @Date:2021/09/21
 * @Time:17:16
 */
public class TankFrame extends Frame {
    int x = 200, y = 200;

    public TankFrame() {
        setSize(800, 600);
        setResizable(true);//窗口可拉动大小
        setTitle("tank war");
        setVisible(true);//设为可见

        this.addKeyListener(new MyKeyListener());

        addWindowListener(new WindowAdapter() {//添加window的监听器
            @Override
            public void windowClosing(WindowEvent e) {//监听windowClosing这件事
                System.exit(0);
            }
        });
    }

    @Override
    public void paint(Graphics g) {
        g.fillRect(x,y, 50, 50);
        //x += 10;
        //y += 10;
        //System.out.println("paint");
    }

    class MyKeyListener extends KeyAdapter {

        boolean bL = false;
        boolean bU = false;
        boolean bR = false;
        boolean bD = false;

        @Override
        public void keyPressed(KeyEvent e) {
            int key = e.getKeyCode();
            switch (key) {
                case KeyEvent.VK_LEFT:
                    bL = true;
                    break;
                case KeyEvent.VK_UP:
                    bU = true;
                    break;
                case KeyEvent.VK_RIGHT:
                    bR = true;
                    break;
                case KeyEvent.VK_DOWN:
                    bD = true;
                    break;
                default:
                    break;
            }
            //键按下去的时候调
            //System.out.println("KEY press");
            //x += 20;
            //repaint();//调用repaint 会自动调用paint

        }

        @Override
        public void keyReleased(KeyEvent e) {
            //键按抬上来的时候调用
            int key = e.getKeyCode();
            switch (key) {
                case KeyEvent.VK_LEFT:
                    bL = false;
                    break;
                case KeyEvent.VK_UP:
                    bU = false;
                    break;
                case KeyEvent.VK_RIGHT:
                    bR = false;
                    break;
                case KeyEvent.VK_DOWN:
                    bD = false;
                    break;
                default:
                    break;
            }
            //System.out.println("KEY release");
        }
    }
}
