/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duckduckgoose;

/**
 *
 * @author Carmen_Lucia3
 */
public class node {

    node next;
    int data;

}

class lista {

    node start;
    node end;

    public lista() {

        start = null;
        end = null;
    }

    public void add(int data) {
        node n = new node();
        n.data = data;
        if (start == null) {
            start = n;
            end = start;
            start.next = end;
        } else {
            end.next = n;
            n.next = start;
            end = n;
        }
    }

    public void print() {
        node actual = start;
        do {
            System.out.print("The winner student will be: " + actual.data);
            actual = actual.next;
        } while (actual != start);
        System.out.println("");
    }

    public void delete(int duck) {
        node actual = new node();
        actual = start;
        node prev = new node();
        prev = end;
        duck = duck + 1;
        do {
            if (duck == 1) {
                if (actual == start) {
                    start = start.next;
                    end.next = start;
                } else if (actual == end) {
                    prev.next = end.next;
                    end = prev;
                } else {
                    prev.next = actual.next;
                }
            }
            duck--;
            prev = actual;
            actual = actual.next;
        } while (duck != 0);

    }
}
