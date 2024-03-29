package First;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

//用DATE类实现
public class TimedTask1 {

	// 获取应该在多少秒后
	public static long getTaskTime(int shi,int fen) {
		DateFormat sdf = new SimpleDateFormat("HH:mm:ss");

		// 当前时分秒字符串切成数组
		String[] sArr = sdf.format(new Date()).split(":");
		// 从数组取值换算成 秒计数值
		long currentMiao = (Integer.parseInt(sArr[0]) *60*60) + (Integer.parseInt(sArr[1]) *60)
				+ Integer.parseInt(sArr[2]);
		// 设定的执行时间换算成 秒计数值
		long runTime = (shi*60*60 + fen*60);

		if (currentMiao <= runTime) {
			return runTime - currentMiao;
		} else {
			return currentMiao + (24*60*60) - (currentMiao - runTime);
		}
	}

	// 定时任务
	public static void cronJob(int shi,int fen) {
		Timer timer = new Timer();
		timer.schedule(new TimerTask() {
			// 把run方法里的内容换成要运行的代码
			public void run() {
				
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				System.out.println("当前的系统时间为：" + sdf.format(new Date()));
				
			}
		}, getTaskTime(shi,fen) *1000, 24*60*60*1000);
	}

	/*public static void main(String[] args) {
		cronJob(18,30);
	}*/
}

