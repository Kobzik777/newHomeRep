package com.company;

/**
 * Created by Serhii_Kobzar on 9/22/2016.
 */
public class CellPhone {

    private String name;
    private String weight;
    private String diagonal;
    private String memory;
    private boolean withCamera;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(String diagonal) {
        this.diagonal = diagonal;
    }

    public String getMemory() {
        return memory;
    }
    @Ignore(description = "for our method ignoring")
    public void setMemory(String memory) {
        this.memory = memory;
    }

    public boolean isWithCamera() {
        return withCamera;
    }

    @Ignore(description = "for our method ignoring it")
    public void setWithCamera(boolean withCamera) {
        this.withCamera = withCamera;
    }

    @Override
    public String toString() {
        return "CellPhone{" +
                "name='" + name + '\'' +
                ", weight='" + weight + '\'' +
                ", diagonal=" + diagonal +
                ", memory=" + memory +
                ", withCamera=" + withCamera +
                '}';
    }
}

