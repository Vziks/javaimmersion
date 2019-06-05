package lesson042.serialization;

import java.io.Serializable;

class Person implements Serializable {
    private String specialization;
    private String name;
    private int iq;

    Person(String specialization, String name, int iq) {
        this.specialization = specialization;
        this.name = name;
        this.iq = iq;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }
}
