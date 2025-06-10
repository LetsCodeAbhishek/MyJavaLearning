public class QueueArray{
    static class Queue{
        static int arr[];
        static int size;
        static int rear;
        static int front;
        Queue(int n){
            arr = new int[n];
            size = n;
            rear = -1;
            //--------
            front=-1;
        }
        public static boolean isEmpty(){
            return rear == -1 && front == -1;
        }
        //----------------------------

        public static boolean isFull(){
            //System.out.println("Queue is Full ");
            return (rear+1) % size == front;
        }

        // // add
        // public static void add(int data){
        //     if(rear == size-1){
        //         System.out.println(" Queue is full");
        //         return ;
        //     }
        //     rear = rear +1;
        //     arr[rear] = data;
        // }

        // // Remove 

        // public static int Remove(){
        //     if(isEmpty()){
        //         System.out.println("Empty Queue ");
        //         return -1;
        //     }
        //     int front = arr[0];

        //     for(int i=0; i<rear ; i++){
        //         arr[i] = arr[i+1];
        //     }
        //     rear = rear -1 ;
        //     return front;
        // }

        // // Peek

        // public static int peek(){
        //     if(isEmpty()){
        //         System.out.println("Empty Queue ");
        //         return -1;
        //     }
        //     return arr[0];
        // }

        //Circular Queue --------------------------

        // add 

        public static void add(int data){
            if(isFull()){
                System.out.println("Queue is Full" );
                return;
            }
            // Add 1st element 
            if(front == -1 ){
                front = 0;
            }
            rear = (rear + 1 )% size;
            arr[rear] = data;
        }

        // Remove 

        public static int Remove(){
            if(isEmpty()){
                System.out.println("Empty Queue ");
                return -1;
            }
            int result = arr[front];

            // last Element Delete

            if(rear == front){
                rear = front = -1;
            }else{
                front = (front + 1)%size;
            }
            return result;
        }

        // Peek

        public static int peek(){
            if(isEmpty()){
                System.out.println("Empty Queue ");
                return -1;
            }
            return arr[front];
        }



    }
    public static void main(String args[]){
        Queue q = new Queue(3);
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println(q.Remove());
        q.add(4);
        System.out.println(q.Remove());
       q.add(5);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.Remove();
        }
    }
}