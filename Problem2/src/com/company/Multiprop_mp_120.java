package com.company;

public class Multiprop_mp_120 {
    private String productDesignation;
    private float mass;
    private float extension;
    private float angle;

    public static float allowableLoad(float extension,float angle){
		float load = 0;//假设长度单位为m，承载单位为KN
		double a = Math.toRadians(angle);//绝对度数转换成弧度
		if(extension < 1.1){
			load = (float) (90*Math.cos(a));
		}else{
			load = (float) (86*Math.cos(a));
		}
		return load;
	}
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
