package First;

import java.util.Calendar;
import java.util.Timer;

public class TestTask
{
    public static void main(String[] args)
    {
        Timer t = new Timer(); // ����Timer����
        MyTask task = new MyTask(); //��������
        t.schedule(task, 1000,5000);//���������ִ�У�1���ʼ��ÿ2��ִ��һ��
        
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.MINUTE, 30);
        
        t.schedule(task, cal.getTime() , 2000);

        
    }
}