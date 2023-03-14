package ih222cj_assign3;

public class AlarmClockMain {

	public static void main(String[] args) {
		AlarmClock alrm = new AlarmClock(23, 48);
		alrm.setAlarm(6, 15);
		alrm.displayAlarmTime();

		
		for (int i = 0; i < 500; i++) {
			alrm.timeTick();

		}

	}

}
