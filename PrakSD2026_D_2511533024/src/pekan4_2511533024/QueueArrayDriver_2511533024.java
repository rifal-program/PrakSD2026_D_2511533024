package pekan4_2511533024;

public class QueueArrayDriver_2511533024 {
	public static void main (String [] args) {
		queueArray_2511533024 queue = new queueArray_2511533024(1000);
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		queue.enqueue(40);
		System.out.println("item di depan "+ queue.front_3024);
		System.out.println("item paling belakang "+ queue.rear_3024);
		System.out.println("tampilan queue");
		queue.display_3024();
		System.out.println();
		System.out.println(queue.dequeue() + "dihapus dari queue");
		System.out.println("item di depan: "+ queue.front_3024);
		System.out.println("item di belakang "+queue.rear_3024);
		System.out.println("tampilan queue setelah satu data dihapus");
		queue.display_3024();
	}

}
