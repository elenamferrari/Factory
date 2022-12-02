public class Avatar {
    int posY;
    int posX;
    int dx;
    int dy;
    int height;
    int width;
    String power;
    String role;
    String weakness;

    public Avatar() {
        posX = 400;
        posY = 600;
        dx = 20;
        dy = 70;
        height = 175;
        width = 220;
        power = "run";
        role = "villain";
        weakness = "pride";
    }

    public Avatar(int pposX, int pposY, int pdx, int pdy, int pheight, int pwidth, String ppower, String prole, String pweakness) {
        posX = pposX;
        posY = pposY;
        dx = pdx;
        dy = pdy;
        height = pheight;
        width = pwidth;
        power = ppower;
        role = prole;
        weakness = pweakness;
    }

    public void print() {
        System.out.println("the " + role + " can " + power + " and their weakness is " + weakness);
        System.out.println("they are at the location (" + posX + ", " + posY + ")");
        System.out.println("they will move " + dx + " meters to the right and " + dy + " meters to the left");
        //System.out.println("they are moving to position " + )
    }
}
