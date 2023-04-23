/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.balonnumarasibulma;
import java.util.Scanner;

/**
 *
 * @author Melisa
 */
public class BalonNumarasiBulma
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Kullanıcıdan n ve m veri girisleri alınır
        System.out.print("Lütfen balon sayısını girin: ");
        int n = sc.nextInt();

        System.out.print("Lütfen patlamasını istediğiniz balon numarasını girin: ");
        int m = sc.nextInt();

        balonPozisyonuBul(m,n);
    }

    static void balonPozisyonuBul(int m, int n)
    {
        // Node sinifi ve bu sinif icin gerekli "constructor" metodu olusturulur
         class Node {

        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
}
        Node head;
        head = new Node(1) {};
        Node prev = head;
        for (int i = 2; i <= n; i++) {
            Node curr = new Node(i);
            prev.next = curr;
            prev = curr;
        }
        prev.next = head;

    Node curr = head;
        while (curr.next != curr) {
            for (int i = 1; i < m - 1; i++) {
                curr = curr.next;
            }
            System.out.println(curr.next.data + " Patladı.");
            curr.next = curr.next.next;
            curr = curr.next;
        }
        // Son kalan balonun numarasını yazdırma
        System.out.println("Son kalan balonun numarası: " + curr.data);
    }
}
