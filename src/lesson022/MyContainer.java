package lesson022;

import java.util.List;

public class MyContainer {
    List<String> elements;

    public MyContainer(List<String> elements) {
        this.elements = elements;
    }

    public Integer getCount() {
        return elements == null ? null : elements.size();
    }
}