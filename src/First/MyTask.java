package First;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimerTask;

public class MyTask extends TimerTask
{

    @Override
    public void run()
    {
        SimpleDateFormat sdf = null;
        sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        System.out.println("��ǰʱ�䣺" + sdf.format(new Date()));
        
    }
    
}