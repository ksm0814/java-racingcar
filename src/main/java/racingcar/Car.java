package racingcar;

public class Car {
	private String name;
	private int position = 1;

	Car(String name) {
		this.name = name;
	}

	public int movePosition(int ranNum) {
		if (ranNum >= 4)
			this.position++;
		return this.position;
	}

	public int getPosition() {
		return this.position;
	}

	public String getName() {
		return this.name;
	}

	public boolean isSameNum(int num) {
		return this.position == num;
	}

}
