

// Write your Checker class here
class Checker implements Comparator<Player>{
    @Override
    public int compare(Player a, Player b){
        if (a.score == b.score){
            return a.name.compareTo(b.name);
        } else {
            return b.score - a.score;//decreasing 
        }
    }
}
