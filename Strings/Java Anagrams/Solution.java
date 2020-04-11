

static boolean isAnagram(String a, String b) {
       
//      // once you declare a.toUppercase you should assign it to a. you cannot define it as just a.toUppercase... 
//      //I solved it with the long way however I could put a and b in a character array and then use  Arrays.sort(arrayname). after this steps convert them to string and check if they are equel.
        a=a.toUpperCase();
        b=b.toUpperCase();
        boolean ret = false;
        StringBuilder c= new StringBuilder(b);

        if(a.length()==b.length()){
            for(int i=0; i<a.length();i++){
                for(int j=0; j<c.length();j++){
                    if(a.charAt(i)==c.charAt(j)){
                            c.deleteCharAt(j);
                        if(i==a.length()-1 && c.length()==0){
                            ret=true;
                            break;
                        }
                        break;

                    }

                }
            }
        }return ret;
   
   }


   

