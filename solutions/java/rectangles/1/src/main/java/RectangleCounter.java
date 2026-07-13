import java.util.ArrayList;

class RectangleCounter {

    int countRectangles(String[] grid) {
        if (grid.length == 0 || grid.length == 1) return 0;
        int gridHeight = grid.length;

        int count = 0;
        for (int row = 0; row< gridHeight; row++) {
            ArrayList<int[]> validColumns = isValidCeiling(grid[row]);
            if (validColumns != null) {
                for (int[] validColumn : validColumns) {
                    count += isValidRectangle(grid, row+1, gridHeight, validColumn);
                }
            }
        }
        return count;
    }

    private int isValidRectangle(String[] grid, int row, int gridHeight, int[] validColumn) {

        int count = 0;
        for (int validRow = row; validRow < gridHeight; validRow++ ) {
            if (isValidFloor(grid[validRow], validColumn)) {
                count += 1;
            }
            else if (grid[validRow].charAt(validColumn[0]) == ' ' || grid[validRow].charAt(validColumn[1]) == ' ' ||
                    grid[validRow].charAt(validColumn[0]) == '-' || grid[validRow].charAt(validColumn[1]) == '-') {
                break;
            }
        }
        return count;
    }

    ArrayList<int[]> isValidCeiling(String row) {

        ArrayList<int[]> result = new ArrayList<>();

        for(int anchor = 0; anchor < row.length(); anchor++){
            if(row.charAt(anchor) == '+'){
                for(int moving = anchor+1; moving < row.length(); moving++){
                    if(row.charAt(moving) == ' '){
                        break;
                    }
                    if(row.charAt(moving) == '+'){
                        result.add(new int[]{anchor, moving});
                    }
                }
            }
        }

        return result;
    }

    public boolean isValidFloor(String row, int[] validColumns){
        row = row.substring(validColumns[0], validColumns[1]+ 1);
        return row.matches("^\\+\\S*\\+$");
    }
}