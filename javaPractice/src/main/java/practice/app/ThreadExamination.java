/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice.app;

/**
 *
 * @author sergey
 */
public class ThreadExamination {

    static class TestThread extends Thread {

        private StringBuffer buffer;

        TestThread(StringBuffer b) {
            this.buffer = b;
        }

        @Override
        public void run() {
//            synchronized (buffer) {
            for (int i = 0; i < 100; i++) {
                System.out.println(buffer);
            }

            buffer.setCharAt(0, (char) (buffer.charAt(0) + 1));
//            }
        }
    }

    public static void startThreads() {
        StringBuffer b = new StringBuffer("A");

        TestThread t1 = new TestThread(b);
        TestThread t2 = new TestThread(b);
        TestThread t3 = new TestThread(b);
        t1.start();
        t2.start();
        t3.start();

    }

}
