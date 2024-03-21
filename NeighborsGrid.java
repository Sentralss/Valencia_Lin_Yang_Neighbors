public class NeighborsGrid {
    private static int[][] grid;
    private String[][] gridStr;
    private int totalScore;

    /**
     * Constructs a NeighborsGrid object: initializes grid to a 5x5 2D array
     */
    public NeighborsGrid() {
        grid = new int[5][5];
        gridStr = new String[5][5];
        for (int i = 0; i < gridStr.length; i++) {
            for (int k = 0; k < gridStr[0].length; k++) {
                gridStr[i][k] = " ";            
            }
        }
    }

    public void convertIntToEmoji() {
        for (int i = 0; i < grid.length; i++) {
            for (int k = 0; k < grid[0].length; k++) {
                if (grid[i][k] == 1) {
                    gridStr[i][k] = "1️⃣";
                }
            }
        }
    }
    /**
     * Inserts value into the space at grid[row][column]
     * row & column will be zero-indexed
     */
    public void insert(int row, int column, int value) {
        grid[row][column] = value;
    }

    /**
     * Determines if a number can be placed in a certain spot or not
     * @return A boolean saying whether the placement is valid
     */
    public boolean canPlace(int row, int column) {
        // 0 indicates that the space is vacant
        return grid[row][column] == 0;
    }

    /**
     * Determines if the grid is full or not
     * @return A boolean saying whether anymore values can be placed in the grid
     */
    public boolean isFull() {
        for (int i = 0; i < grid.length; i++) {
            for (int k = 0; k < grid[0].length; k++) {
                if (grid[i][k] == 0) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public String toString() {
        String originalGrid = {
        {"-","-","-","-","-","-","-","-","-","-","-","-","-","-","-","-","-","-","-","-","-"},
        {"|"," "," "," ","|"," "," "," ","|"," "," "," ","|"," "," "," ","|"," "," "," ","|"},
        {"-","-","-","-","-","-","-","-","-","-","-","-","-","-","-","-","-","-","-","-","-"},
        {"|"," "," "," ","|"," "," "," ","|"," "," "," ","|"," "," "," ","|"," "," "," ","|"},
        {"-","-","-","-","-","-","-","-","-","-","-","-","-","-","-","-","-","-","-","-","-"},
        {"|"," "," "," ","|"," "," "," ","|"," "," "," ","|"," "," "," ","|"," "," "," ","|"},
        {"-","-","-","-","-","-","-","-","-","-","-","-","-","-","-","-","-","-","-","-","-"},
        {"|"," "," "," ","|"," "," "," ","|"," "," "," ","|"," "," "," ","|"," "," "," ","|"},
        {"-","-","-","-","-","-","-","-","-","-","-","-","-","-","-","-","-","-","-","-","-"},
        {"|"," "," "," ","|"," "," "," ","|"," "," "," ","|"," "," "," ","|"," "," "," ","|"},
        {"-","-","-","-","-","-","-","-","-","-","-","-","-","-","-","-","-","-","-","-","-"}
        };
        return ;
    }

    public static int countScore(){
        int score = 0;
        for(int row = 0; row < grid.length; row++){
            for(int column = 0; column < grid[row].length; column++){
                int count = 1;
                for(int nextColumn = column + 1; nextColumn < grid[row].length; nextColumn++){
                    if(grid[row][column] = grid[row][nextColumn]){
                        count ++;
                    }else{
                        break;
                    }
                }
                if(count >=2 && count<=5){
                    score += row[row][column] * count;
                }
                count = nextColumn - 1;
            }
        }

        for(int column = 0; column< grid[0].lenght;column++){
            for(int row = 0; row<grid.length;row++){
                int count = 1;
                for(int nextRow = row + 1; row < grid.length; nextRow ++){
                    if(grid[row][column] = grid[nextRow][column]){
                        count ++;
                    }else{
                        break;
                    }
                }
                if(count >=2 && count<=5){
                    score += row[row][column] * count;
                }
                count = nextRow - 1;
            }
        }   
    }
    
}
    


 // use this to copy paste numbers
//  1️⃣2️⃣3️⃣4️⃣5️⃣6️⃣7️⃣8️⃣9️⃣🔟