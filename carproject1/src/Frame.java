import javax.swing.*;

public class Frame extends JFrame {
    public static void main(String[] args){
        JFrame frame = new JFrame();
        frame.setSize(750,550);
        frame.add(new Board());
        frame.setVisible(true);
    }

}
