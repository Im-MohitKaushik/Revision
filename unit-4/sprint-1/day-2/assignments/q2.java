package sprint1Day2;

public class q2 {
	public void vovelCheck(String str) {
		String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lower = "abcdefghijklmnopqrstuvwxyz";
		String vovellow = "aeiou";
		String vovelup = "AEIOU";
		int x = -1;
		for (int i = 0; i < upper.length(); i++) {
			if (upper.charAt(i) == str.charAt(0) || str.charAt(0) == lower.charAt(i)) {
				if (str.charAt(0) == vovellow.charAt(0) || str.charAt(0) == vovellow.charAt(0)
						|| str.charAt(0) == vovellow.charAt(1) || str.charAt(0) == vovellow.charAt(2)
						|| str.charAt(0) == vovellow.charAt(3) || str.charAt(0) == vovellow.charAt(4)
						|| str.charAt(0) == vovelup.charAt(0) ||

						str.charAt(0) == vovelup.charAt(1) || str.charAt(0) == vovelup.charAt(2)
						|| str.charAt(0) == vovelup.charAt(3) ||

						str.charAt(0) == vovelup.charAt(4)) {
					x = 1;

				} else {
					x = 0;

				}

			}

		}
		if (x == 1) {
			System.out.println("character is vowel");
		} else if (x == 0) {
			System.out.println("character is consonant");
		} else {
			System.out.println("error");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		q2 xample = new q2();
		xample.vovelCheck("a");
		xample.vovelCheck("b");
		xample.vovelCheck("@");
	}

}
