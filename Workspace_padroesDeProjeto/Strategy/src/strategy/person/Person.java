package strategy.person;

import strategy.person.strategies.eat.EatStrategy;
import strategy.person.strategies.transportation.TransportationStrategy;
import strategy.person.strategies.work.WorkStrategy;

public class Person {
	private EatStrategy eatStrategy;
	private TransportationStrategy moveStrategy;
	private WorkStrategy workStrategy;
	private String name;

	public Person(String name, EatStrategy eatStrategy, TransportationStrategy moveStrategy, WorkStrategy workStrategy) {
		this.name = name;
		this.eatStrategy = eatStrategy;
		this.moveStrategy = moveStrategy;
		this.workStrategy = workStrategy;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void eat() {
		eatStrategy.eat();
	}
	
	public void move() {
		moveStrategy.move();
	}
	
	public void work() {
		workStrategy.work();
	}
}
