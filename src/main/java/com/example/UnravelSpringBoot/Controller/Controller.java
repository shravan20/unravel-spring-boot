package com.example.UnravelSpringBoot.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
public class Controller {


    @RequestMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
        //LinkedList<String> = new LinkedList<String>();
        return "Hello " + name;
    }

    @GetMapping("/ArrayList")
    public ArrayList arraylist() {
        ArrayList<String> list=new ArrayList<String>();//Creating arraylist
        list.add("Mango");//Adding object in arraylist
        list.add("Apple");
        list.add("Banana");
        list.add("Grapes");
        return list;
    }

    @GetMapping("/LinkedList")
    public LinkedList linkedlist() {
        LinkedList<String> al=new LinkedList<String>();
        al.add("Ravi");
        al.add("Vijay");
        al.add("Ravi");
        al.add("Ajay");
        System.out.print(al);
        return al;
    }

    @GetMapping("/List")
    public List<String> clist() {
        List<String> list = new ArrayList<String>();
        //Adding elements in the List
        list.add("Mango");
        list.add("Apple");
        list.add("Banana");
        list.add("Grapes");
        System.out.println(list);
        return list;
    }

    @GetMapping("/HashSet")
    public HashSet hashset() {
        //Creating HashSet and adding elements
        HashSet<String> set=new HashSet();
        set.add("One");
        set.add("Two");
        set.add("Three");
        set.add("Four");
        set.add("Five");
        set.add("Four");
        set.add("Five");
        Iterator<String> i = set.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }
        System.out.println(set);
        return set;
    }

    @GetMapping("/LinkedHashSet")
    public LinkedHashSet linkedhashset() {
        LinkedHashSet<String> set=new LinkedHashSet();
        set.add("One");
        set.add("Two");
        set.add("Three");
        set.add("Four");
        set.add("Five");
        Iterator<String> i=set.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }
        return set;
    }

    @GetMapping("/HashMap")
    public HashMap hashmap() {
        HashMap<Integer,String> map=new HashMap<Integer,String>();//Creating HashMap
        map.put(1,"Mango");  //Put elements in Map
        map.put(2,"Apple");
        map.put(3,"Banana");
        map.put(4,"Grapes");
        return map;
    }
}
