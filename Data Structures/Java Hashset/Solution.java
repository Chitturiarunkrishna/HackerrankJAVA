

     HashSet<String> set = new HashSet(t);
     for (int i = 0; i < t; i++)
     {
         set.add(pair_left[i] + " " + pair_right[i]);
         System.out.println(set.size());
     }

