public class NeighborsGrid {
    private int[][] grid;
    private int totalScore;

    /**
     * Constructs a NeighborsGrid object: initializes grid to a 5x5 2D array
     */
    public NeighborsGrid() {
        grid = new int[5][5];
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
        String[][] originalGrid = {
        {"-","-","-","-","-","-","-","-","-","-","-","-","-","-","-",}



        }
    }

---------- 1 0 
-------------------------
| 10 |  🔟 |    |    |   |
---------------------
|    |    |    |    |    |
---------------------
|   |   |   |   |   |
---------------------
---------------------


----------------------------------
|     |      |      |      |     |
----------------------------------
|     |      |      |      |     |
----------------------------------
|     |      |      |      |     |
----------------------------------
|     |      |      |      |     |
----------------------------------")