import java.util.*;

public class CollectionsDemo {

   public static void main(String[] args) {
       // create an array list
      ArrayList al = new ArrayList();
      System.out.println("Initial size of al: " + al.size());

      // add elements to the array list
      al.add("C");
      al.add("A");
      al.add("E");
      al.add("B");
      al.add("D");
      al.add("F");
      al.add(1, "A2");
      System.out.println("Size of al after additions: " + al.size());

      // display the array list
      System.out.println("Contents of al: " + al);
      // Remove elements from the array list
      al.remove("F");
      al.remove(2);
      System.out.println("Size of al after deletions: " + al.size());
      System.out.println("Contents of al: " + al);

      // create a linked list
      LinkedList ll = new LinkedList();
      // add elements to the linked list
      ll.add("F");
      ll.add("B");
      ll.add("D");
      ll.add("E");
      ll.add("C");
      ll.addLast("Z");
      ll.addFirst("A");
      ll.add(1, "A2");
      System.out.println("Original contents of ll: " + ll);

      // remove elements from the linked list
      ll.remove("F");
      ll.remove(2);
      System.out.println("Contents of ll after deletion: "
       + ll);
      
      // remove first and last elements
      ll.removeFirst();
      ll.removeLast();
      System.out.println("ll after deleting first and last: "
       + ll);

      // get and set a value
      Object val = ll.get(2);
      ll.set(2, (String) val + " Changed");
      System.out.println("ll after change: " + ll);


      //HashSet
      Set s1 = new HashSet(); 
      s1.add("Zara");
      s1.add("Mahnaz");
      s1.add("Ayan");
      System.out.println();
      System.out.println(" Set Elements");
      System.out.print("\t" + s1);

      // create a hash set
      LinkedHashSet hs = new LinkedHashSet();
      // add elements to the hash set
      hs.add("B");
      hs.add("A");
      hs.add("D");
      hs.add("E");
      hs.add("C");
      hs.add("F");
      System.out.println();
      System.out.println(" LinkedHashSet Elements");
      System.out.println(hs);

      //HashMap
      Map m1 = new HashMap(); 
      m1.put("Zara", "8");
      m1.put("Mahnaz", "31");
      m1.put("Ayan", "12");
      m1.put("Daisy", "14");
      System.out.println();
      System.out.println(" Map Elements");
      System.out.print("\t" + m1);

     //HashSet - TreeSet
     int count[] = {34, 22,10,60,30,22};
     Set<Integer> set = new HashSet<Integer>();
     try{
        for(int i = 0; i<5; i++){
           set.add(count[i]);
        }
        System.out.println("Set:");
        System.out.println(set);
  
        TreeSet sortedSet = new TreeSet<Integer>(set);
        System.out.println("The sorted list is:");
        System.out.println(sortedSet);

        System.out.println("The First element of the set is: "+
                          (Integer)sortedSet.first());
        System.out.println("The last element of the set is: "+
                        (Integer)sortedSet.last());
     }
     catch(Exception e){}

     // Create the sorted set
      SortedSet set1 = new TreeSet(); 

      // Add elements to the set
      set1.add("b");
      set1.add("c");
      set1.add("a");

      // Iterating over the elements in the set
      Iterator it = set1.iterator();
      while (it.hasNext()) {
         // Get element
         Object element = it.next();
         System.out.println(element.toString());
      }

      // Map.Entry : Create a hash map
      HashMap hm = new HashMap();
      // Put elements to the map
      hm.put("Zara", new Double(3434.34));
      hm.put("Mahnaz", new Double(123.22));
      hm.put("Ayan", new Double(1378.00));
      hm.put("Daisy", new Double(99.22));
      hm.put("Qadir", new Double(-19.08));
      
      // Get a set of the entries
      Set set2 = hm.entrySet();
      // Get an iterator
      Iterator i = set2.iterator();
      // Display elements
      while(i.hasNext()) {
         Map.Entry me = (Map.Entry)i.next();
         System.out.print(me.getKey() + ": ");
         System.out.println(me.getValue());
      }
      System.out.println();
      // Deposit 1000 into Zara's account
      double balance = ((Double)hm.get("Zara")).doubleValue();
      hm.put("Zara", new Double(balance + 1000));
      System.out.println("Zara's new balance: " +
      hm.get("Zara"));

      //TreeMap : Create a hash map
      TreeMap tm = new TreeMap();
      // Put elements to the map
      tm.put("Zara", new Double(3434.34));
      tm.put("Mahnaz", new Double(123.22));
      tm.put("Ayan", new Double(1378.00));
      tm.put("Daisy", new Double(99.22));
      tm.put("Qadir", new Double(-19.08));
      
	  // Get a set of the entries
      Set set3 = tm.entrySet();
      // Get an iterator
      Iterator i3 = set3.iterator();
      // Display elements
      while(i3.hasNext()) {
         Map.Entry me = (Map.Entry)i3.next();
         System.out.print(me.getKey() + ": ");
         System.out.println(me.getValue());
      }
      System.out.println();
      // Deposit 1000 into Zara's account
      double balance3 = ((Double)tm.get("Zara")).doubleValue();
      tm.put("Zara", new Double(balance3 + 1000));
      System.out.println("Zara's new balance: " +
      tm.get("Zara"));

     // Create a hash map
      LinkedHashMap lhm = new LinkedHashMap();
      // Put elements to the map
      lhm.put("Zara", new Double(3434.34));
      lhm.put("Mahnaz", new Double(123.22));
      lhm.put("Ayan", new Double(1378.00));
      lhm.put("Daisy", new Double(99.22));
      lhm.put("Qadir", new Double(-19.08));
      
      // Get a set of the entries
      Set set4 = lhm.entrySet();
      // Get an iterator
      Iterator i4 = set4.iterator();
      // Display elements
      while(i4.hasNext()) {
         Map.Entry me = (Map.Entry)i4.next();
         System.out.print(me.getKey() + ": ");
         System.out.println(me.getValue());
      }
      System.out.println();
      // Deposit 1000 into Zara's account
      double balance4 = ((Double)lhm.get("Zara")).doubleValue();
      lhm.put("Zara", new Double(balance4 + 1000));
      System.out.println("Zara's new balance: " +
      lhm.get("Zara"));
   }
}