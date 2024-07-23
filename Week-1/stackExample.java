public class stackExample {
    public static void main(String[] args) {
        stackDataStructure s = new stackDataStructure(5);
        s.push(20);
        s.push(30);
        System.out.println(s.peek());
        s.push(40);
        System.out.println(s.pop);
        System.out.println(s.pop());
    }
}
class stackDataStructure{
    int max_size;
    int[] stack_arr;
    int top ;
    stackDataStructure(int max_size){
        this.max_size = max_size;
        top = -1;
        stack_arr = new int[this.max_size];

    }


boolean isEmpty(){
    return top == -1;

}
boolean isFull(){
    return top == max_size - 1;
}
int peek(){
    if(isEmpty()){
        System.out.println("Empty");
        return -1;
    }else{
        return  stack_arr[top];
    }
}
void push(int data){
    if(isFull()){
        System.out.println("Full");
    }else{
        top ++;
        stack_arr[top] = data;
    }
}
int pop(){
    if(isEmpty()){
    System.out.println("Empty");
    return -1;
}else{
    return stack_arr[top--];
}
}