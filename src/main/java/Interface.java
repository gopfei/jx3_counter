import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Interface {
    public static void main(String[] args){
        JFrame frame = new JFrame("剑网三生活技能成本计算器");
        JPanel jp=new JPanel();
        JLabel l = new JLabel("生活技能");
        JComboBox box = new JComboBox();
        box.addItem("--请选择--");
        box.addItem("烹饪");
        box.addItem("缝纫");
        box.addItem("医术");
        box.addItem("锻造");
        jp.add(l);
        jp.add(box);
        frame.add(jp);
        frame.setBounds(300,200,400,400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);




    }

}
