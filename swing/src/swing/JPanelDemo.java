package swing;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.*;
public class JPanelDemo
{   
    public static void main(String[] agrs)
    {
        JFrame jf=new JFrame("Java�ڶ���GUI����");    //����һ��JFrame����
        jf.setBounds(300, 100, 400, 200);    //���ô��ڴ�С��λ��
        JPanel jp=new JPanel();    //����һ��JPanel����
        JLabel jl=new JLabel("���Ƿ���JPanel�ϵı�ǩ");    //����һ����ǩ
        jp.setBackground(Color.white);    //���ñ���ɫ
        jp.add(jl);    //����ǩ��ӵ����
        jf.add(jp);    //�������ӵ�����
        jf.setVisible(true);    //���ô��ڿɼ�
    }
}
