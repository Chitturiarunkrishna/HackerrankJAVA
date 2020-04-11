

        //Write your code here

        Comparator<String> c = new Comparator<String>()
        {
            public int compare(String s1, String s2)
            {
               BigDecimal b1 = new BigDecimal(s1);
               BigDecimal b2 = new BigDecimal(s2);
               return b2.compareTo(b1);
            }
        };

         Arrays.sort(s, 0, n, c);

