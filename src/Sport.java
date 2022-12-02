public class Sport {
    int players;
    int record;
    String name;

    public void print() {
        System.out.println("the sport " + name + " has " + players + " players with a record of " + record);
        Rating();
    }

    public Sport(int pPlayers, int pRecord, String pName) {
        name = pName;
        players = pPlayers;
        record = pRecord;
    }

    public void Rating() {
        if(record > 10) {
            System.out.println("this is a great season!");
        }
        else {
            System.out.println("this is not a good season");
        }
    }
}
