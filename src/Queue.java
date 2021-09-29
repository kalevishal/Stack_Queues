public class Queue {
    int queue[] = new int[3];
    int size;
    int front;
    int rear;

    public void enQueue(int data){
        queue[rear] = data;
        rear= rear + 1;
        size= size + 1;
    }
    public void show(){
        System.out.println("Element : ");
        for (int i=0; i<size; i++){
            System.out.print( queue[i]+ " ");
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.enQueue(56);
        q.enQueue(30);
        q.enQueue(70);

        q.show();
    }
}