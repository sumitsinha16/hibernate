package manytoone;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity(name="hspitals")
public class Hospital {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
private String name;
private String ceo;

@OneToMany
private List<Branch> branches;


public List<Branch> getBranches() {
	return branches;
}
public void setBranches(List<Branch> branches) {
	this.branches = branches;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getCeo() {
	return ceo;
}
public void setCeo(String ceo) {
	this.ceo = ceo;
}
}
