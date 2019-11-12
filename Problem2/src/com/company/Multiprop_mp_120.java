package com.company;

public class Multiprop_mp_120 {
    private String productDesignation;
    private float mass;
    private float extension;
    private float angle;

    public static float allowableLoad(float extension, float angle) {
        float load = 0;
        double a = Math.toRadians(angle);
        if (extension < 1.1) {
            load = (float) (90 * Math.cos(a));
        } else {
            load = (float) (86 * Math.cos(a));
        }
        return load;
    }

    public String getProductDesignation() {
        return productDesignation;
    }

    public void setProductDesignation(String productDesignation) {
        this.productDesignation = productDesignation;
    }

    public float getMass() {
        return mass;
    }

    public void setMass(float mass) {
        this.mass = mass;
    }

    public float getExtension() {
        return extension;
    }

    public void setExtension(float extension) {
        this.extension = extension;
    }

    public float getAngle() {
        return angle;
    }

    public void setAngle(float angle) {
        this.angle = angle;
    }
}
