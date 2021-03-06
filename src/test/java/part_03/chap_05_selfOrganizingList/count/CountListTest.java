package part_03.chap_05_selfOrganizingList.count;

import org.junit.*;

//@Ignore
public class CountListTest /*implements TestingCountList*/ {

    //    @Ignore
    @Test
    public void addTest_01() {
        CountList list = new CountList();
        list.add(0);
        Assert.assertEquals(0, list.head.info);
    }

    //    @Ignore
    @Test
    public void addTest_02() {
        CountList list = new CountList();
        list.add(0);
        Assert.assertTrue(list.head == list.tail);
        Assert.assertFalse(list.head == null);
    }

    //    @Ignore
    @Test
    public void addTest_03() {
        CountList list = new CountList();
        for (int i = 0; i <= 2; list.add(i++)) ;
        Assert.assertEquals(0, list.head.info);
        Assert.assertEquals(1, list.head.next.info);
        Assert.assertTrue(list.tail.next == null);
    }

    //    @Ignore
    @Test
    public void isEmptyTest_01() {
        CountList list = new CountList();
        Assert.assertTrue(list.isEmpty());
    }

    @Test
    public void isInListTest_01() {
        CountList list = new CountList();

        Assert.assertFalse(list.isInList(0));
    }

    @Test
    public void isInListTest_02() {
        CountList list = new CountList();
        list.add(0);
        Assert.assertTrue(list.isInList(0));
        Assert.assertEquals("[0]", list.toString());
    }

    @Test
    public void isnInListTest_03() {
        CountList list = new CountList();
        for (int i = 0; i < 2; list.add(i++)) ;
        Assert.assertTrue(list.isInList(0));
        Assert.assertTrue(list.isInList(1));
        list.isInList(1);
        Assert.assertEquals("[1, 0]", list.toString());
    }

    @Test
    public void isInListTest_04() {
        CountList list = new CountList();
        for (int i = 0; i < 3; list.add(i++)) ;
        list.isInList(2);
        Assert.assertEquals("[2, 0, 1]", list.toString());
        for (int i = 0; i < 2; i++) list.isInList(0);
        Assert.assertEquals("[0, 2, 1]", list.toString());
    }

    @Test
    public void isInListTest_05(){
        CountList list = new CountList();
        for (int i = 0; i < 5; list.add(i++));
        Assert.assertTrue(list.isInList(4));
        Assert.assertEquals("[4, 0, 1, 2, 3]", list.toString());
        Assert.assertFalse(list.isInList(5));
    }


    @Test
    public void findElementTest_01() {
        CountList list = new CountList();

        Assert.assertNull(list.findElement(0));
    }

    @Test
    public void findElementTest_02() {
        CountList list = new CountList();
        for (int i = 0; i < 3; list.add(i++)) ;
        Assert.assertNull(list.findElement(3));
    }

    @Test
    public void findElementTest_03() {
        CountList list = new CountList();
        for (int i = 0; i < 3; list.add(i++)) {
            Assert.assertTrue(list.findElement(0) == list.head);
//            Assert.assertTrue(list.findElement(1)==list.head.next);       //TODO why this one breaks the tests?
        }
    }

    @Test
    public void isPrevCounterMinorTest_01() {
        CountList list = new CountList();
        CountNode node = list.add(0);
        Assert.assertFalse(list.isPrevCounterMinor(node));
    }

    @Test
    public void isPrevCounterMinorTest_02() {
        CountList list = new CountList();
        for (int i = 0; i < 2; list.add(i++)) ;
        Assert.assertFalse(list.isPrevCounterMinor(list.head));
        Assert.assertFalse(list.isPrevCounterMinor(list.head.next));
        Assert.assertFalse(list.isPrevCounterMinor(list.tail));
        list.head.next.counter++;
        Assert.assertTrue(list.isPrevCounterMinor(list.head.next));

    }

    @Test
    public void swapTest_01() {
        CountList list = new CountList();
        Assert.assertNull(list.swap(list.head));
    }

    @Test
    public void swapTest_02() {
        CountList list = new CountList();
        for (int i = 0; i < 2; list.add(i++)) ;
//        list.tail.counter++;
        Assert.assertEquals("[0, 1]", list.toString());
        list.swap(list.tail);
        Assert.assertEquals("[1, 0]", list.toString());

    }

    @Test
    public void swapTest_03() {
        CountList list = new CountList();
        for (int i = 0; i < 3; list.add(i++)) ;
        Assert.assertEquals("[0, 1, 2]", list.toString());
        list.swap(list.tail.prev);
        Assert.assertEquals("[1, 0, 2]", list.toString());

    }

    @Test
    public void swapTest_04() {
        CountList list = new CountList();
        for (int i = 0; i < 3; list.add(i++)) ;
        Assert.assertEquals("[0, 1, 2]", list.toString());
        list.swap(list.tail);
        Assert.assertEquals("[0, 2, 1]", list.toString());
    }

    @Test
    public void swapTest_05() {
        CountList list = new CountList();
        for (int i = 0; i < 4; list.add(i++)) ;
//        list.tail.prev.counter++;

        Assert.assertEquals("[0, 1, 2, 3]", list.toString());
        list.swap(list.tail.prev);
        Assert.assertEquals("[0, 2, 1, 3]", list.toString());


//        Assert.assertSame(list.head.next.prev, list.head);
//        Assert.assertSame(list.tail.prev.prev, list.head);
//        Assert.assertSame(list.head.next.next, list.tail);


//        Assert.assertEquals("[0, 2, 1, 3]", list.toString());
    }

    @Test
    public void removeTest_01(){
        CountList list = new CountList();
        Assert.assertNull(list.remove(0));
    }

    @Test
    public void removeTest_02(){
        CountList list = new CountList();
        CountNode node = list.add(0);
        Assert.assertSame(node, list.remove(0));
    }

    @Test
    public void removeTest_03(){
        CountList list = new CountList();
        for (int i = 0; i < 2; list.add(i++));
        Assert.assertSame(list.head, list.remove(0));
    }

    @Test
    public void removeTest_04(){
        CountList list = new CountList();
        for (int i = 0; i < 2; list.add(i++));
        Assert.assertSame(list.tail, list.remove(1));
    }

    @Test
    public void removeTest_05(){
        CountList list = new CountList();
        for (int i = 0; i < 3; list.add(i++));
        Assert.assertSame(list.tail.prev, list.remove(1));
    }


    //    @Ignore
    @Test
    public void toStringTest_01() {
        CountList list = new CountList();
        Assert.assertEquals("[]", list.toString());
    }

    //    @Ignore
    @Test
    public void toStringTest_02() {
        CountList list = new CountList();
        list.add(0);
        Assert.assertEquals("[0]", list.toString());
    }

    //    @Ignore
    @Test
    public void toStringTest_03() {
        CountList list = new CountList();
        for (int i = 0; i < 2; list.add(i++)) ;
        Assert.assertEquals("[0, 1]", list.toString());
    }
}
