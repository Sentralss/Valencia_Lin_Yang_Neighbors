public class NeighborsRunner{
    public static final String blue = "\u001B[34m";
    public static final String reset = "\u001B[0m"; 
    public static void main(String[] args){
        System.out.print("1️⃣  ");
        System.out.println(blue + "Welcome to Neighbors!\nHere is the board. It is currently empty" + reset);
        NeighborsGrid grid = new NeighborsGrid();
        Dice dice = new Dice(10);
        //System.out.println(grid);
        
        //while (!grid.isFull()) {

        //}
    }
}