package JavaSem2.week5;

// File: Point.java
public class Point {
    // Fields (State)
    private int x;
    private int y;



    // Constructor default (tanpa parameter)
    public Point() {
        x = 0;
        y = 0;
    }

    // Constructor berparameter
    public Point(int initialX, int initialY) {
        x = initialX;
        y = initialY;
    }


    // Getter untuk x
    public int getX() {
        return x;
    }

    // Getter untuk y
    public int getY() {
        return y;
    }

    // Setter untuk x
    public void setX(int x) {
        this.x = x;
    }

    // Setter untuk y
    public void setY(int y) {
        this.y = y;
    }


    // Method untuk menggeser koordinat titik
    public void translate(int dx, int dy) {
        x = x + dx;
        y = y + dy;
    }

    // Method untuk menampilkan informasi titik
    public void print() {
        System.out.println("Titik berada di (" + x + ", " + y + ")");
    }

    public String toString() {
        return "Titik berada di (" + x + ", " + y + ")";
    }

}

