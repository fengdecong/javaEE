package fengdecong.model;

import java.util.List;

public class Duck {
    private String name;
    private Integer age;
    private List ducks;

    public Duck(){

    }

    public Duck(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Duck{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
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

    public void setDucks(List ducks) {
        this.ducks = ducks;
    }

    public List getDucks() {
        return ducks;
    }
}
