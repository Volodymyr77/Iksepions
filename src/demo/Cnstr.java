package demo;

public class Cnstr {
    long id =0;
    String login = null;
    String password = null;
    byte age = 0;
    String sex =  null;
    float weight = 0.0F;
    double height = 0.0;
    boolean isActive = false;


    public Cnstr() {
        System.out.println("cnstr created");
        System.out.println(this);
    }

    public Cnstr(long id,
                 String login,
                 String password,
                 byte age,
                 String sex,
                 float weight,
                 double height,
                 boolean isActive) {
        this.id = id;
        this.login = login;
        this.password = password;
        this.age = age;
        this.sex = sex;
        this.weight = weight;
        this.height = height;
        this.isActive = isActive;

    }



//    @Override
//    public String toString() {
//
//    }
}
