package swing;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.*;
public class JFrameDemo extends JFrame
{
    public JFrameDemo()
    {
        setTitle("Java ��һ�� GUI ����");    //������ʾ���ڱ���
        setSize(400,200);    //���ô�����ʾ�ߴ�
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    //�ô����Ƿ���Թر�
        JLabel jl=new JLabel("����ʹ��JFrame�ഴ���Ĵ���");    //����һ����ǩ
        Container c=getContentPane();    //��ȡ��ǰ���ڵ����ݴ���
        c.add(jl);    //����ǩ������ӵ����ݴ�����
        setVisible(true);    //���ô����Ƿ�ɼ�
    }
    public static void main(String[] agrs)
    {
        new JFrameDemo();    //����һ��ʵ��������
    }
}