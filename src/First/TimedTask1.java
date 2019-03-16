package First;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

//��DATE��ʵ��
public class TimedTask1 {

	// ��ȡӦ���ڶ������
	public static long getTaskTime(int shi,int fen) {
		DateFormat sdf = new SimpleDateFormat("HH:mm:ss");

		// ��ǰʱ�����ַ����г�����
		String[] sArr = sdf.format(new Date()).split(":");
		// ������ȡֵ����� �����ֵ
		long currentMiao = (Integer.parseInt(sArr[0]) *60*60) + (Integer.parseInt(sArr[1]) *60)
				+ Integer.parseInt(sArr[2]);
		// �趨��ִ��ʱ�任��� �����ֵ
		long runTime = (shi*60*60 + fen*60);

		if (currentMiao <= runTime) {
			return runTime - currentMiao;
		} else {
			return currentMiao + (24*60*60) - (currentMiao - runTime);
		}
	}

	// ��ʱ����
	public static void cronJob(int shi,int fen) {
		Timer timer = new Timer();
		timer.schedule(new TimerTask() {
			// ��run����������ݻ���Ҫ���еĴ���
			public void run() {
				
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				System.out.println("��ǰ��ϵͳʱ��Ϊ��" + sdf.format(new Date()));
				
			}
		}, getTaskTime(shi,fen) *1000, 24*60*60*1000);
	}

	/*public static void main(String[] args) {
		cronJob(18,30);
	}*/
}

