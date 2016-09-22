package com.company;

/**
 * Created by Serhii_Kobzar on 9/22/2016.
 */
public class SmartPhone extends CellPhone {

    private String processFrequency;
    private int coreQuantity;
    private int OP;

    public String getProcessFrequency() {
        return processFrequency;
    }

    public void setProcessFrequency(String processFrequency) {
        this.processFrequency = processFrequency;
    }

    public int getCoreQuantity() {
        return coreQuantity;
    }

    public void setCoreQuantity(int coreQuantity) {
        this.coreQuantity = coreQuantity;
    }

    public double getOP() {
        return OP;
    }

    @Ignore(description = "for our method ignoring OP")
    public void setOP(int OP) {
        this.OP = OP;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "name='" + getName() + '\'' +
                ", weight='" + getWeight() + '\'' +
                ", diagonal=" + getDiagonal() +
                ", memory=" + getMemory() +
                ", withCamera=" + isWithCamera() +
                ", processFrequency='" + processFrequency + '\'' +
                ", coreQuantity=" + coreQuantity +
                ", OP=" + OP +
                '}';
    }
}
