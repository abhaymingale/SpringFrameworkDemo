package demo;

import java.util.List;

public class employee {


    private int id;
    private String name;
    private Integer age;
    private String dept;
    private List prooject;

    public employee(int id, String name, Integer age, String dept, List prooject) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.dept = dept;
        this.prooject = prooject;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public List getProoject() {
        return prooject;
    }

    public void setProoject(List prooject) {
        this.prooject = prooject;
    }

    @Override
    public String toString() {
        return "employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", dept='" + dept + '\'' +
                ", prooject=" + prooject +
                '}';
    }
}
