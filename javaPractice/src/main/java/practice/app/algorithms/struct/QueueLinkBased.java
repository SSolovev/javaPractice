package practice.app.algorithms.struct;

/**
 * Created by SeASolovev on 16.04.2015.
 */


public class QueueLinkBased {

    private Link first;
    private Link last;
    private int size;

    public void add(int value) {

        Link tmp = new Link(value);
        if (first == null) {
            first = tmp;
        }else{
            last.next=tmp;
        }
        last = tmp;
        size++;
    }

    public int poll() {
        Link res = first;

        if (first != null) {
            first = first.next;
        }

        size--;
        return res.value;
    }

    public boolean contains(int value) {
        Link tmp = first;
        while (tmp != null) {
            if (tmp.value == value) {
                return true;
            }
            tmp = tmp.next;
        }
        return false;
    }

    public boolean remove(int value) {
        Link tmp = first;
        Link tmpNext = first.next;
        while (tmpNext != null) {
            if ( tmpNext.value == value) {
                tmp.next = tmpNext.next;
//                tmp.prev.next = tmp.next;
                size--;
                return true;
            }
            tmp = tmp.next;
            tmpNext = tmp.next;
        }
        return false;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    static class Link {
        int value;
        Link next;

        Link(int value) {
            this.value = value;
        }
    }
}
