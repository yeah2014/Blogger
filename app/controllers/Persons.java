package controllers;

import play.mvc.*;
import models.*;

public class Persons extends Controller{
	public static void persons()
	{
		Person person = new Person();
		person.addperson("yeah", "男");
		person.addperson("张宏业", "男");
		person.addperson("KeithChen", "男");
		person = Person.find("name", "Yeah").first();
		render(person);
	}
}
