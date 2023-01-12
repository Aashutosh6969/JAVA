package model;

public class Result {
    int maths;
    int physics;
    int chem;

    public int getMaths() {
        return maths;
    }

    public void setMaths(int maths) {
        this.maths = maths;
    }

    public int getPhysics() {
        return physics;
    }

    public void setPhysics(int physics) {
        this.physics = physics;
    }

    public int getChem() {
        return chem;
    }

    public void setChem(int chem) {
        this.chem = chem;
    }

    public Result(int maths, int physics, int chem) {
        this.maths = maths;
        this.physics = physics;
        this.chem = chem;
    }


}
