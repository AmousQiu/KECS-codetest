package com.company;
import com.company.Shape;
import java.awt.*;

public class Form extends Shape{
    private float depth;
    private float mass;
    private String material;

    public float getDepth() {
        return depth;
    }

    public void setDepth(float depth) {
        this.depth = depth;
    }

    public float getMass() {
        return mass;
    }

    public void setMass(float mass) {
        this.mass = mass;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public static point com(ArrayList<Form> components){
	
        int count = components.size();
        Point centroid = new Point();
        double gx = 0.0, gy = 0.0;
        double summass=0.0;
    
        for(int i=0;i<count;i++){
            gx+=(components.get(i).com(components.get(i).getlist()).getX())*(components.get(i).getmass);
            gy+=(components.get(i).com(components.get(i).getlist()).getY())*(components.get(i).getmass);
            summass+=components.get(i).getmass;
        }
    
        if (summass>0){
        centroid.setLocation(gx/summass, gy/summass);
        }
    
        return centroid;
                
    }
     
}
