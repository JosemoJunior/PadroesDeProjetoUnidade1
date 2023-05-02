package strategy.person;

import strategy.person.strategies.eat.MeatFoodStrategy;
import strategy.person.strategies.eat.VeggieFoodStrategy;
import strategy.person.strategies.transportation.AirplaneStrategy;
import strategy.person.strategies.transportation.BikeStrategy;
import strategy.person.strategies.transportation.CarStrategy;
import strategy.person.strategies.transportation.WalkStrategy;
import strategy.person.strategies.work.DeveloperStrategy;
import strategy.person.strategies.work.NoWorkStrategy;
import strategy.person.strategies.work.PilotStrategy;

public class Client {

	public static void main(String[] args) {
		Person jhon = new Person("Felipe", new MeatFoodStrategy(), 
				new CarStrategy(), new DeveloperStrategy());
		presentYourself(jhon);
		
		Person ann = new Person("Josemo", new MeatFoodStrategy(), 
				new AirplaneStrategy(), new PilotStrategy());
		presentYourself(ann);
		
		Person carol = new Person("Helton", new VeggieFoodStrategy(), 
				new BikeStrategy(), new DeveloperStrategy());
		presentYourself(carol);
		
		Person alan = new Person("Luis", new VeggieFoodStrategy(), 
				new WalkStrategy(), new NoWorkStrategy());
		presentYourself(alan);
	}
	
	public static void presentYourself(Person person) {
		System.out.println("Hi, I'm " + person.getName());
		person.eat();
		person.move();
		person.work();
		System.out.println("----------------");
	}
}
