/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package ec.gob.bomberosquito.linkedlistandarraylist;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author danielhwang
 */
public class LinkedListAndArrayList {

    public static void main(String[] args) {
        //Focus on being fast adding things lo the list
        LinkedList<String> namesLinkedList = new LinkedList<>();
        namesLinkedList.add("Daniel");
        namesLinkedList.add("Ringo");
        namesLinkedList.add("Taisha");
        
        //Focus on fast retreiving info 
        ArrayList<String> namesArrayList = new ArrayList<>();
        namesArrayList.add("Balu");
        namesArrayList.add("Toby");
        namesArrayList.add("Hashirama");
        
        System.out.println("Hello World!");
    }
}
