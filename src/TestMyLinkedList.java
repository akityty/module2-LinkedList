public class TestMyLinkedList {
    public static void main(String[] args) {
        System.out.println("/=/=/=/= TESTING /=/=/=/=");
        MyLinkedList ll = new MyLinkedList(9);
        ll.addFirst(11);
        ll.addFirst(12);
        ll.addFirst(13);
//        System.out.println(ll.get(2));
        ll.add(3,7);
        ll.print();

    }
}
