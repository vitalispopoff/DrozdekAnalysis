package part_03.chap_03_circularList.unidirectional;

import part_03.chap_03_circularList.Circumlistable;

public class CircUniList implements Circumlistable {

    private CircUniNode
        tail = null;

    @Override
    public boolean isEmpty() {
        return tail == null;
    }

    @Override
    public void addToHead(int element) {

        CircUniNode
            cache = new CircUniNode(element);

        if (isEmpty())
            cache.next = cache;

        else {

            cache.next = tail.next.next;
            tail.next = cache;
        }

        tail = cache;
    }

    @Override
    public void addToTail(int element) {

        CircUniNode
            cache = new CircUniNode(element);

        if (isEmpty()) {

            cache.next = cache;
        }
        else {

            cache.next = tail.next;
            tail.next = cache;
        }

        tail = cache;
    }

    @Override
    public int removeFromHead() {

        if (isEmpty()) return (int)
                Float.NEGATIVE_INFINITY;

        else {

            int
                element = tail.next.info;

            if (tail.next == tail)
                tail = null;

            else {
                tail.next = tail.next.next;
            }

            return element;
        }
    }

    @Override
    public int removeFromTail() {

        if (isEmpty())
            return (int) Float.NEGATIVE_INFINITY;

        else {

            int
                element = tail.info;

            if (tail.next == tail)
                tail = null;

            else {
                CircUniNode
                    counter = tail.next;

                for (   ; counter.next != tail; counter = counter.next)
                    ;

                counter.next = tail.next;
                tail = counter;
            }

            return element;
        }
    }

    @Override
    public void remove(int element) {

        if (!isEmpty()) {

            if (tail == tail.next && tail.info == element)
                tail = null;

            else {

                CircUniNode
                        temporal = tail;

                for (   ; temporal.next.info != element && temporal.next != tail; temporal = temporal.next)
                    ;

                if (temporal.next == tail)
                    tail = temporal;

                temporal.next = temporal.next.next;
            }
        }
    }

    @Override
    public void printAll() {

        if (!isEmpty()) {

            CircUniNode
                    counter = tail.next;

            do {

                System.out.println(counter.info + " ");

                counter = counter.next;
            }
            while (counter != tail.next);
        }
    }

    @Override
    public boolean isInList(int element) {

        if (isEmpty())
            return false;

        else {
            CircUniNode
                temporal = tail;

            do {

                temporal = temporal.next;
            }
            while(temporal.info!=element && temporal!=tail);

            return temporal.info == element;
    }
}

    public static void main(String[] args) {

        CircUniList list = new CircUniList();
    }
}