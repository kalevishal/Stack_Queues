
public class PeakPop {

    private class Node {
        int data;
        Node link;
    }

    Node top;
    PeakPop()
    {
        this.top = null;
    }

    public void push(int x){

        Node temp = new Node();
        if (temp == null) {
            System.out.print("\nHeap Overflow");
            return;
        }

        temp.data = x;
        temp.link = top;
        top = temp;
    }

    public boolean isEmpty()
    {
        return top == null;
    }

    public int peek()
    {
        if (!isEmpty()) {
            return top.data;
        }
        else {
            System.out.println("Stack is empty");
            return -1;
        }
    }

    public void pop()
    {
        if (top == null) {
            System.out.print("\nStack Underflow");
            return;
        }

        top = (top).link;
    }

    public void display()
    {
        if (top == null) {
            System.out.printf("\nStack Underflow");
            exit(1);
        }
        else {
            Node temp = top;
            while (temp != null) {

                System.out.printf("%d->", temp.data);

                temp = temp.link;
            }
        }
    }

    private void exit(int i) {
    }
}
class stackpop {
    public static void main(String[] args)
    {
        PeakPop obj = new PeakPop();
        obj.push(56);
        obj.push(30);
        obj.push(70);

        obj.display();
        System.out.printf("\nTop element is %d\n", obj.peek());

        obj.pop();
        obj.display();

        System.out.printf("\nTop element is %d\n", obj.peek());
    }

}