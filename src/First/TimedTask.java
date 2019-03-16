package First;
import java.text.SimpleDateFormat;  
import java.util.Date;  
import java.util.concurrent.Executors;  
import java.util.concurrent.ScheduledExecutorService;  
import java.util.concurrent.TimeUnit;  
  
public class TimedTask {  
    public static void main(String[] args) {  
        Runnable runnable = new Runnable() {  
            public void run() {  
                // ��run����������ݻ�����Ҫִ�е�����  
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  
                System.out.println("��ǰ��ϵͳʱ��Ϊ��" + sdf.format(new Date()));  
            }  
        };  
        ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();  
        //public ScheduledFuture<?> scheduleAtFixedRate(Runnable command, long initialDelay, long period, TimeUnit unit);  
        //command--ִ�е�����,initialDelay--�ӳٿ�ʼ,period--���ʱ��,unit--ʱ�䵥λ  
        service.scheduleAtFixedRate(runnable, 0, 5, TimeUnit.SECONDS);  
    }  
}  