package First;
// ��Calendarʵ��
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class TimedTask2 {
	public static void cronJob(int shi, int fen, int miao) {
		Calendar cal = Calendar.getInstance();
		// ÿ�춨��ִ��
		cal.set(Calendar.HOUR_OF_DAY, shi);
		cal.set(Calendar.MINUTE, fen);
		cal.set(Calendar.SECOND, miao);

		Timer timer = new Timer();
		timer.schedule(new TimerTask() {

			public void run() {
				// ��run����������ݻ�����Ҫִ�е�����
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				System.out.println("��ǰ��ϵͳʱ��Ϊ��" + sdf.format(new Date()));
			}
		}, cal.getTime(), 24 * 60 * 60 * 1000);
	}

	/*
	 * public static void main(String[] args) { 
	 * cronJob(18, 30, 0); //24Сʱ�� ʱ���� 
	 * }
	 */
}