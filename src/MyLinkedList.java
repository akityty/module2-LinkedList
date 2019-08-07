public class MyLinkedList {
    private class Node {
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }
    }

    private Node head;
    private int numNode;

    public MyLinkedList(Object data) {
        head = new Node(data);
        numNode++;
    }

    public void add(int index, Object data) {
        Node temp = head;
        Node holder;
        for (int i = 0; i < index - 1 && temp != null; i++) {
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = new Node(data);
        temp.next.next = holder;
        numNode++;
    }
    public void addFirst(Object data){
        Node temp = head;
        head = new Node(data);
        head.next = temp;
        numNode++;
    }
    public Object get(int index){
        Node temp = head;
        for( int i = 0; i< index ; i++){
            temp = temp.next;
        }
        return temp.data;
    }
    public void print(){
        Node temp =head;
        while (temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
