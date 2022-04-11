package eval1;

public class AlarmClock {

	public void alarm(int num, boolean cond) {
		int sunday = 0;

		if (cond == true && num == sunday) {
			System.out.println("“off”");
		}
		 if (cond == true && num >0&&num<=6) {
			System.out.println("“10:00”");
		}
		 if (cond ==false && num >0&&num<=6 ) {
			System.out.println("“7:00” ");
		}
		 if (cond == false && num == sunday) {
			System.out.println("“10:00”");
		}
		 if ((cond != true && cond != false) ||( num > 6 || num < 0)) {
			System.out.println("error");
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AlarmClock f1 = new AlarmClock();
		f1.alarm(2, true);
	}

}
