package models;

import javax.persistence.*;

import play.libs.Codec;


@Entity
@Table (name = "person")
public class Person {
	@Id
	public String id;
	
	@Column (name = "person_name")
	public String name;
	
	@Lob
	@Column (name = "sex")
	public String sex;
	
	@Column (name = "age")
	public int age;
	
	@Column (name = "height")
	public String height;
	
	@Column (name = "weight")
	public String weight;
	
	public Person(String name , String sex ,
				  int  age ,String height , String weight)
	{
		this.id = Codec.UUID();
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
}
