/**
 * Task1
 */
public class List {
    Node head;
    Node tail;

    
    /**
     * Task1
     */
    public class Node {
        int value;
        Node next;
        Node previous;
    
    }

    public void revert() {      // revert - метод разворота списка 
        Node currentNode = head;
        while (currentNode != null){
            Node next = currentNode.next;
            Node previous = currentNode.previous;
            currentNode.next = previous;    // меняем элементы местами
            currentNode.previous = next;     // меняем элементы местами
            if (previous == null){          
                tail = currentNode;
            } 
            if (next == null){          
                head = currentNode;
            }             
            currentNode = next;             // currentNode становится следующим
        }  
    }
}