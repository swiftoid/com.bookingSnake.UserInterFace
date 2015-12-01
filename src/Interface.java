
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;

public class  Interface{

    public static void main(String s[]) {
        JFrame frame = new JFrame("JFrame Source Demo");
        // Add a window listner for close button
        frame.addWindowListener(new WindowAdapter() {

            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        // This is an empty content area in the frame
        JLabel jlbempty = new JLabel("Middle Earth");
        JLabel Andy = new JLabel ("North");
        JLabel foo = new JLabel("South");
        JLabel foobar = new JLabel("East");
      //  JLabel northeast = new JLabel ("Westt");

        jlbempty.setPreferredSize(new Dimension(300, 280));
        frame.getContentPane().add(jlbempty,BorderLayout.CENTER);
        frame.getContentPane().add(Andy,BorderLayout.NORTH);
        frame.getContentPane ().add(foo, BorderLayout.SOUTH);
        frame.getContentPane() .add(foobar,BorderLayout.EAST);
        // frame.getContentPane() .add(northeast,BorderLayout.WEST);
        frame.pack();
        frame.setVisible(true);


        class DisplayImage {


            private BufferedImage img;

            public DisplayImage(){

                try {


                    img = ImageIO.read(new File("image1.png"));

                } catch (IOException e){

                    e.printStackTrace();
                }


            }

            public void paint (Graphics g){
                g.drawImage(img, 0, 0, null);



            }

        }



    }
}