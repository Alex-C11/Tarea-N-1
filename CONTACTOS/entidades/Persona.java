package entidades;


public class Persona {
    String name;
    String sex;

    public void laugh(){

        System.out.println(name+" ,Cuenta");
    
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
    
}
