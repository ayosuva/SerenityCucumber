package com.test.collections;

import java.util.*;

public class CollectionsDemo {
    public static void main(String[] args) {


        Collection<String> list=new ArrayList<>();
        ArrayList<String> list1= (ArrayList<String>) list;

        list1.forEach(s->System.out.println(s));

        list.add("Ganesh");
        list.add("Yosu");

        Iterator<String> s=list.iterator();

        while(s.hasNext())
        {
            System.out.println(s.next());
        }

        for (String item: list)
        {
            System.out.println(item);
        }

        for (int i=0;i< list1.size();i++)
        {
            System.out.println(list1.get(i));
        }

        Set<String> ss=new HashSet<>();
        ss.add("Ganesh");
        ss.add("Yosu");

        for (String item: ss)
        {
            System.out.println(item);
        }


        Map<String,String> map=new HashMap<>();
        map.put("key1","value1");
        map.put("key2","value2");

        Set<Map.Entry<String, String>> entrySet=map.entrySet();
        Iterator<Map.Entry<String,String>> iterator=entrySet.iterator();
        while(iterator.hasNext())
        {
            Map.Entry<String,String> entry=iterator.next();
            System.out.println(entry.getKey()+"--"+entry.getValue());
        }


        Interface1 interface1=new AA();
        interface1.test();

        Interface1 interface11=()->System.out.println("test");
        interface11.test();

        Interface1 interface12=()->System.out.println("test2");
        interface12.test();

    }
}
@FunctionalInterface
interface Interface1
{
    public void test();

}

class AA implements  Interface1{

    @Override
    public void test() {
        System.out.println("test");
    }
}

