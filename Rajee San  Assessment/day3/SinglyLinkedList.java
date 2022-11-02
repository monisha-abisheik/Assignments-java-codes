package day3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SinglyLinkedList {

	class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public Node head = null;
	public Node tail = null;

	public void addNode(int data) {

		Node newNode = new Node(data);

		if (head == null) {
			head = newNode;
			tail = newNode;
		} else {
			tail.next = newNode;
			tail = newNode;
		}
	}

	public void display() {
		Node current = head;

		if (head == null) {
			System.out.println("List is empty");
			return;
		}
		System.out.println("Nodes of singly linked list: ");
		while (current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}
		System.out.println();
	}

	public void max() {

		Node max = head;
		Node j = head.next;
		while (max != tail) {
			int n = max.data;
			while (j != null) {
				if (max.data < j.data)
					max.data = j.data;

				j = j.next;

			}
			if (max.data == n) {
				max.data = 0;
			}
			max = max.next;
			j = max.next;
		}
		tail.data = 0;
		display();
	}

	public static void main(String[] args) {

		SinglyLinkedList sList = new SinglyLinkedList();

		sList.addNode(2);
		sList.addNode(7);
		sList.addNode(4);
		sList.addNode(3);
		sList.addNode(5);

		sList.display();
		sList.max();
	}

}
