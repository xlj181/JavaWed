package xlj.wed.demo2.entity;



public class People {
    private Integer id;
    private String name;
    private String sex;
    private Integer age;
    private String address;
    private Integer aslary;
    private Integer idcard;

    public People() {
    }

    public People(Integer id, String name, String sex, Integer age, String address, Integer aslary, Integer idcard) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.address = address;
        this.aslary = aslary;
        this.idcard = idcard;
    }

    public People(String name, String sex, Integer age, String address, Integer aslary, Integer idcard) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.address = address;
        this.aslary = aslary;
        this.idcard = idcard;
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
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

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getAslary() {
        return aslary;
    }

    public void setAslary(Integer aslary) {
        this.aslary = aslary;
    }

    public Integer getIdcard() {
        return idcard;
    }

    public void setIdcard(Integer idcard) {
        this.idcard = idcard;
    }

    @Override
    public String toString() {
        return "People{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", aslary=" + aslary +
                ", idcard=" + idcard +
                '}';
    }
}
