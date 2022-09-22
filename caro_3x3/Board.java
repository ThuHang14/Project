import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;

public class Board extends JPanel { //1 container chua 9 o nho ben trong
    private static final int N = 3;
    private static final int M = 3;

    private Image imgX;
    private Image imgO;

    public Board(){
        addMouseListener(new MouseAdapter() { // MouseAdapter : click se lay ra toa do(x,y)
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
               int x = e.getX();
               int y = e.getY();
            }
        });
        try {
            imgO = ImageIO.read(getClass().getResource("0.png"));
            imgX = ImageIO.read(getClass().getResource("x.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void paint(Graphics g) { //ham paint : ve canvas jvSwing
        int w = getWidth()/3;
        int h = getHeight()/3;

        Graphics2D graphics2D = (Graphics2D) g;

        int k = 0;
        for (int i = 0; i <N ; i++) { //toa do(x,y)thay doi sx cac o
            for (int j = 0; j <M ; j++) {
                int x = i *w; // 0*200,1*200,2*200
                int y =j*h;

                Color color = k %2 == 0 ? Color.PINK:Color.LIGHT_GRAY;
                graphics2D.setColor(color);
                graphics2D.fillRect(x,y,w,h);

                Image image = k %2 == 0 ? imgX : imgO ;
                graphics2D.drawImage(image,x,y,w,h,this);

                k++;
            }
        }
    }
}
