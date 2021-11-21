package dataStructure;

import java.util.Scanner;

class Node{
    int data;
    Node next;
    Node(int d){
        data = d;
        next = null;
    }
}
public class LinkedList {
    public static Node insert(Node head, int data){
        Node newNode;
        if(head==null){
            newNode = new Node(data);
            head = newNode;
        }else{
            newNode = new Node(data);
            Node tmp = head;
            while(tmp.next!=null){
                tmp = tmp.next;
            }
            tmp.next = newNode;
        }
       return head;
    }

    public static void display(Node head){
        Node start = head;
        while(start!=null){
            System.out.println(start.data + " ");
            start = start.next;
        }
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        Node head = null;
        int N = sc.nextInt();

        while(N-- >0){
            int ele = sc.nextInt();
            head = insert(head, ele);
        }
        display(head);
        sc.close();
    }
}
