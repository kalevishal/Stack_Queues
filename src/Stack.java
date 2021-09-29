class Stack {
    int stack[] = new int[3];
    int top =0;
    private void push(int data){
        stack[top] = data;
       top++;
    }

    /*public int pop(){
        int data;
        data = stack[top];
        stack [top] = 0;
        return data;
    }*/

    private void show() {
        for(int n : stack){
            System.out.print(n + "-> ");
        }
    }

    public static void main(String a[]) {
        Stack number = new Stack();
        number.push(56);
        number.push(30);
        number.push(70);

        number.show();
    }
}