package Timer;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * 定时器
 *
 */
public class TimerTest01{
	public static void main(String[] args) throws Exception{
		//创建定时器对象
		Timer timer = new Timer();
		//
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date firstTime = sdf.parse("2022-07-24 19:04:00");
		timer.schedule(new LogTimerTask(),firstTime,1000*10);

	}
}
//编写一个定时任务类
class LogTimerTask extends TimerTask{
	@Override
	public void run() {
		//编写需要执行的任务
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String strTime = sdf.format(new Date());
		System.out.println(strTime + ":成功完成了一次数据备份!");

	}
}
	

