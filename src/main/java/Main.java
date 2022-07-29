import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cell c1 = new Cell("Большая", "c1");
        List<Cell> cells = new ArrayList<>();
        cells.add(c1);
        c1.grow();
        Cell c2 = c1.divide();
        cells.add(c2);
        c2.grow();

        for (Cell c: cells) {
            c.getInfo();
        }
    }
}
