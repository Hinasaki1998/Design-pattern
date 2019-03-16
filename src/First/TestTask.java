package First;

import java.util.Calendar;
import java.util.Timer;

public class TestTask
{
    public static void main(String[] args)
    {
        Timer t = new Timer(); // 建立Timer对象
        MyTask task = new MyTask(); //定义任务
        t.schedule(task, 1000,5000);//设置任务的执行，1秒后开始，每2秒执行一次
        
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.MINUTE, 30);
        
        t.schedule(task, cal.getTime() , 2000);

        
    }
}