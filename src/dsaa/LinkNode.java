package dsaa;

public class LinkNode<T> {
    T val;
    LinkNode next;

    public LinkNode() {
        val = null;
        next = null;
    }

    public LinkNode(T t) {
        val = t;
        next = null;
    }

    public LinkNode(T t, LinkNode linkNode) {
        val = t;
        next = linkNode;
    }

    public void printLink(LinkNode<T> node) {
        while(node.next != null) {
            System.out.print(node.val + "->");
            node = node.next;
        }
        System.out.print(node.val + "\n");
    }
}
