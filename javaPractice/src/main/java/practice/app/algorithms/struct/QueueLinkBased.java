package practice.app.algorithms.struct;

/**
 * Created by SeASolovev on 16.04.2015.
 */


public class QueueLinkBased {

    private Link first;
    private Link last;
    private int size;

    public void add(int value) {

        Link tmp = new Link(value, first, null);
        if (first != null) {
            first.prev = tmp;
        } else {
            last = tmp;
        }
        first = tmp;
        size++;
    }

    public int poll() {
        Link res = last;
        last = last.prev;
        if (last != null) {
            last.next = null;
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
        while (tmp != null) {
            if (tmp.value == value) {
                tmp.next.prev = tmp.prev;
                tmp.prev.next = tmp.next;
                size--;
                return true;
            }
            tmp = tmp.next;
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
        Link prev;

        Link(int value, Link next, Link prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }
}
