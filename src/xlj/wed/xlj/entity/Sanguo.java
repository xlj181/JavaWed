package xlj.wed.xlj.entity;

import java.util.Date;

public class Sanguo {
    private Integer id;
    private String name;
    private Integer age;
    private String address;
    private Date birthday;

    public Sanguo() {
    }

    public Sanguo(Integer id, String name, Integer age, String address, Date birthday) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
        this.birthday = birthday;
    }

    public Sanguo(String name, Integer age, String address, Date birthday) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.birthday = birthday;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String sddress) {
        this.address = sddress;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Sanguo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sddress='" + address + '\'' +
                ", birthday=" + birthday +
                '}';
    }
}
