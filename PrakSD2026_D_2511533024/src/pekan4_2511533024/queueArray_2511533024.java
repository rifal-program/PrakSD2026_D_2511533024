package pekan4_2511533024;

public class queueArray_2511533024 {
	int front_3024 , rear_3024, size_3024;
	int capacity;
	int array[];
	 public queueArray_2511533024(int capacity) {
		 this.capacity = capacity;
		 front_3024 = this.size_3024 = 0;
		 rear_3024 = capacity - 1;
		 array = new int [this.capacity];
	 }
	 boolean IsFull_3024 (queueArray_2511533024 queue) {
		 return (queue.size_3024 == queue.capacity);
	 }
	 boolean IsEmpty_3024 (queueArray_2511533024 queue) {
		 return (queue.size_3024 == 0);
	 }
	 void enqueue_3024 (int item) {
		 if (IsFull_3024 (this))
			 return;
		 this.rear_3024 = (this.rear_3024 + 1) % this.capacity;
		 this.array[this.rear_3024] = item;
		 this.size_3024 = this.size_3024 + 1;
		 System.out.println(item + " enqueued to queue");
	 }
	 int dequeue_3024 () {
	if (IsEmpty_3024 (this))
		return Integer.MIN_VALUE;
	int item = this.array[this.front_3024];
	this.front_3024 = (this.front_3024 + 1) % this.capacity;
	this.size_3024 = this.size_3024 - 1;
	return item;
	 }
	 int front_3024 () {
		 if (IsEmpty_3024 (this))
			 return Integer.MIN_VALUE;
		 return this.array[this.front_3024];
	 }
	 int rear_3024() {
		 if (IsEmpty_3024(this))
			 return Integer.MIN_VALUE;
		 return this.array[this.rear_3024];
	 }
	 void display_3024() {
		 int i;
		 if (front_3024 == rear_3024 ) {
			 System.out.printf("\nAntrian kosong\n");
			 return;
		 }
		 for(i = front_3024; i < rear_3024; i++) {
			 System.out.printf( " %d<-- ", array[i]);
		 }
		 return;
		 }
		 
}

