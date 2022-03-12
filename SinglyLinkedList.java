package thessarx;

import java.util.NoSuchElementException;

    public class SinglyLinkedList<E> {
        private Node<E> firstNode;
        private Node<E> lastNode;
        private String name;

        public SinglyLinkedList() {
            this("linked list");
        }

        public SinglyLinkedList(String listName) {
            name = listName;
            firstNode = lastNode = null;
        }
        // Insert At Front
        public void insertAtFront(E insertItem) {
            Node newNode = new Node(insertItem);

            if (isEmpty()) {
                firstNode = lastNode = new Node<E>(insertItem);
            } else { // firstNode refers to new node
                newNode.next = firstNode;
                firstNode = newNode;
            }
        }
        // Insert At Back
        public void insertAtBack(E insertItem) {
            Node newNode = new Node(insertItem);

            if (isEmpty()) {
                firstNode = lastNode = new Node<E>(insertItem);
            } else {
                lastNode.next = newNode;
                lastNode = newNode;
            }
        }
        //Remove from Back
        public E removeFromBack() throws NoSuchElementException {
            if (isEmpty()) {
                throw new NoSuchElementException(name + " is empty");
            }
            E removedItem = lastNode.data;

            if (firstNode == null) {
                firstNode = lastNode = null;
            } else {
                Node<E> current = firstNode;
                while (current.next != lastNode) {
                    current = current.next;
                }
                lastNode = current;
                current.next = null;
            }
            return removedItem;
        }
        //Remove from Front
        public E removeFromFront() throws NoSuchElementException {
            if (isEmpty()) { // throw exception if List is empty
                throw new NoSuchElementException(name + " is empty");
            }

            E removedItem = firstNode.data;

            if(firstNode != null){
                Node temp = new Node(firstNode);
                firstNode = firstNode.next;
                temp = null;
            }
            return removedItem;
        }

        private boolean isEmpty() {
            return firstNode == null;
        }

        public void print() {
            if (isEmpty()) {
                System.out.printf("Empty %s%n", name);
                return;
            }

            System.out.printf("The %s is: %n", name);
            Node<E> current = firstNode;

            while (current != null) {
                System.out.printf("%s ", current.data);
                current = current.next;
            }
        }
    }
