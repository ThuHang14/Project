import javax.swing.*;
import java.awt.*;

public class main {
    public static void main(String[] args) {
        Board board = new Board();

        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize(); //lay ra kich thuoc man hinh

        JFrame frame = new JFrame("Caro 3x3"); // tieu de cua cua so
        frame.setSize(600,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //khi tat chuong trinh se dong luon
        frame.setResizable(false);//k chinh sua kich thuoc
        frame.add(board);

        int x = (int) (dimension.getHeight()/2); //gan kich thuoc ra giua
        int y = (int) (dimension.getWidth()/12);
        frame.setLocation(x,y);

        frame.setVisible(true); // true de mo cua so
    }
}
