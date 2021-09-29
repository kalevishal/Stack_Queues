class Dequeue {
    int dequeue[] = new int[3];
    int size;
    int front;
    int rare;

    private int enQueue(int data){
        dequeue[rare] = data;
       size++;
       rare++;
       return data;
    }

    public int deQueue(){
        int data = dequeue[front];
        front++;
        size--;
        return data;
    }

    public void show(){
        System.out.print(" Element : " );
        for (int i = 0; i<size;i++){
            System.out.println(dequeue[front+i]+ " ");
        }
    }

    public static void main(String[] args) {
        Dequeue dequeue = new Dequeue();
        dequeue.enQueue(56);
        dequeue.enQueue(30);
        dequeue.enQueue(70);

        dequeue.deQueue();
        dequeue.show();
    }
}