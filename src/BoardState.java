public class BoardState {

    //Instance variables
    Color currentPlayerColor;
    Color[][] grid = new Color[10][10];
    int piecesWhite = 2;
    int piecesBlack = 2;

    //Constructor
    public BoardState(Color currentPlayerColor){
       this.currentPlayerColor = currentPlayerColor;

        // Designates an index for all cells
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++) {
                grid[i][j] = Color.NONE;
            }
        }

        //Starting pieces
        grid[4][4] = Color.WHITE;
        grid[4][5] = Color.BLACK;
        grid[5][4] = Color.BLACK;
        grid[5][5] = Color.WHITE;

    }

    //Methods
    public void setBoardState(int mouseX, int mouseY, boolean mousePressed){

        int i = mouseX/50;

        int j = mouseY/50;

        if (mousePressed && this.grid[i][j] == Color.NONE) {

            this.grid[i][j] = this.currentPlayerColor;

            if(this.currentPlayerColor == Color.BLACK){
                this.currentPlayerColor = Color.WHITE;
                this.piecesBlack++;
            }
            else {
                this.currentPlayerColor = Color.BLACK;
                this.piecesWhite++;
            }
        }

    }

    //Something to capture other pieces and horizontal or vertical


}
