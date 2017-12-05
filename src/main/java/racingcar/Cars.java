package racingcar;

import java.util.ArrayList;
import java.util.Random;

public class Cars {
	private ArrayList<Car> cars = new ArrayList<>();

	Cars(String[] carNames) {
		for (int i = 0; i < carNames.length; i++) {
			cars.add(new Car(carNames[i]));
		}
	}

	public void add(Car car) {
		cars.add(car);
	}

	public ArrayList<Car> getCars() {
		return cars;
	}

	public Car getCar(int i) {
		return cars.get(i);
	}

	private int createRanNum() {
		Random random = new Random();
		return random.nextInt(10);
	}

	public void moveCars(int tryTimes) {
		for (int i = 0; i < tryTimes; i++) {
			this.setCarStatus();
		}
	}

	public void setCarStatus() {
		for (int i = 0; i < cars.size(); i++) {
			findCar(i).movePosition(createRanNum());
		}
	}

	private Car findCar(int index) {
		return cars.get(index);
	}

	public int findMaxScore() {
		int num = 0;
		for (Car car : cars) {
			if (num <= car.getPosition())
				num = car.getPosition();
		}
		return num;
	}

	public String[] compareWinner(int num) {
		ArrayList<String> winners = new ArrayList<String>();
		for (Car car : cars) {
			if (car.isSameNum(num))
				winners.add(car.getName());
		}
		return winners.toArray(new String[winners.size()]);
	}

}