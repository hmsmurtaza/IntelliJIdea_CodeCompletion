import java.awt.*;
import java.util.List;

public class CodeCompletion {


    private Square completion() {
        Square square = new Square();
        Square square2 = new Square();  // Alt + Enter for variable declaration
        Circle circle = new Circle();
        String string = "";
        List<Square> squares = List.of();

        for (Square square1: squares) { // Ctrl + Shift + Enter for loop body declaration
            if (square1.equals("")) {
                System.out.println(square.equals(""));
            }
        }
        return square;
    }

    private interface Shape {}
    private static class Square implements Shape {}
    private static class Circle implements Shape{}
}
