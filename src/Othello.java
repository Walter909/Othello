import processing.core.PApplet;

public class Othello extends PApplet {

    //Instance variable
    BoardState boardState = new BoardState(Color.BLACK);

    public void settings() {
        size(500, 500);
    }

    public void draw() {
        //Background color
        background(144, 238, 144);
        ellipse(mouseX, mouseY, 20, 20);

        //Vertical lines
        for (int x = 50; x < 500; x += 50) {
            int start = 500;
            line(x, start, x, 0);
        }

        //Horizontal lines
        line(500, 50, 0, 50);
        for (int y = 50; y < 500; y += 50) {
            int start = 500;
            line(start, y, 0, y);
        }

        //Drawing grid
        for (int i = 0; i < boardState.grid.length; i++) {
            for (int j = 0; j < boardState.grid.length; j++) {
                if (boardState.grid[i][j] == Color.WHITE) {
                    fill(255);
                    ellipse(i * 50 + 25, j * 50 + 25, 50, 50);
                }
                if (boardState.grid[i][j] == Color.BLACK) {
                    fill(0);
                    ellipse(i * 50 + 25, j * 50 + 25, 50, 50);
                }

            }

        }

        boardState.setBoardState(mouseX,mouseY,mousePressed);
    }

    public static void main(String[] passedArgs) {
        String[] appletArgs = new String[]{"Othello"};
        PApplet.main(appletArgs);
    }
}