package mx.com.isccarrasco.domain;

import javax.persistence.Entity;
import java.io.Serializable;

/**
 * Created by mario on 21/04/17.
 */
@Entity
public class Person implements Serializable {

    private String name;
    private Integer age;
    private String country;

    public Person() {
    }

    public Person(String name, Integer age, String country) {
        this.name = name;
        this.age = age;
        this.country = country;
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

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
