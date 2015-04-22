package practice.app.algorithms.hanoy;

import java.util.Stack;

/**
 * Created by SeASolovev on 22.04.2015.
 */
public class HanoyTower {

    private static class StackTower {
        Stack<Long> tower;
        int towerMaxHigh;
        String name;

        StackTower(int towerMaxHigh, String name) {
            this.towerMaxHigh = towerMaxHigh;
            this.name = name;
            tower = new Stack<>();
        }

        public void push(Long circle) {
            if (tower.size() > 0 && tower.peek() < circle) {
                throw new RuntimeException("You cant put bigger circle");
            } else if (tower.size() > towerMaxHigh) {
                throw new RuntimeException("Tower cant be higher then " + towerMaxHigh);
            } else {
                tower.push(circle);
            }
        }

        public Long peek() {
            return tower.peek();
        }

        public Long pop() {
            return tower.pop();
        }

        @Override
        public String toString() {
            Object[] a = tower.toArray();
            String res = " " + name + "\n | \n";
            for (int i = tower.size() - 1; i >= 0; i--) {
                res += a[i] + "|" + a[i] + "\n";
            }
            return res;
        }

        public int size() {
            return tower.size();
        }
    }

    public static void hanoyTest() {
        int max = 4;
        StackTower tower1 = new StackTower(max, "A");
        StackTower tower2 = new StackTower(max, "B");
        StackTower tower3 = new StackTower(max, "C");
        tower1.push(4l);
        tower1.push(3l);
        tower1.push(2l);
        tower1.push(1l);
        doReplace(max, tower1, tower2, tower3);
    }

    public static void trace(StackTower towerFrom, StackTower towerInner, StackTower towerTo) {
        System.out.println("From " + towerFrom.name + " To " + towerTo.name);
        System.out.println(towerFrom.toString());
        System.out.println(towerInner.toString());
        System.out.println(towerTo.toString());
        System.out.println("=================================");
    }

    public static void doReplace(int size, StackTower towerFrom, StackTower towerInner, StackTower towerTo) {

        if (size == 1) {
            towerTo.push(towerFrom.pop());
            trace(towerFrom, towerInner, towerTo);
        } else {
            doReplace(size - 1, towerFrom, towerTo, towerInner);
            towerTo.push(towerFrom.pop());
            trace(towerFrom, towerInner, towerTo);
            doReplace(size - 1, towerInner, towerFrom, towerTo);
        }


    }
}
