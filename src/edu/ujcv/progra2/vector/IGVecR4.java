package edu.ujcv.progra2.vector;

public class IGVecR4 {

    private double x;
    private double y;
    private double z;
    private double a;
    
    public IGVecR4 suma(IGVecR4 b){
        IGVecR4 retval = new IGVecR4();
        retval.x = x + b.x;
        retval.y = y + b.y;
        retval.z = z + b.z;
        retval.a = a + b.a;
        System.out.println(retval);
        return new IGVecR4();
    }

    public IGVecR4 resta(IGVecR4 b){
        IGVecR4 retval = new IGVecR4();
        retval.x = x - b.x;
        retval.y = y - b.y;
        retval.z = z - b.z;
        retval.a = a - b.a;
        return new IGVecR4();
    }

    //producto.
    public  IGVecR4 escalarPorVector(double alpha){
        IGVecR4 retval = new IGVecR4();
        retval.x = (alpha * x);
        retval.y = (alpha * y);
        retval.z = (alpha * z);
        retval.a = (alpha * a);
        return new IGVecR4();
    }

    public double productoPunto(IGVecR4 b){
        double retval;
        retval = (x * b.x) + (y * b.y) + (z * b.z) + (a + b.a);
        return retval;
    }


    public double productoCruz(IGVecR4 b){
        double retval;
        retval = (x * b.x) + (y * b.y) + (z + b.z) + (a + b.a);
        return retval;
    }


    public double angulo(IGVecR4 b, IGVecR4 a){
        double retval;
        retval = Math.acos(4/ magnitud(a) * magnitud(b));
        return retval;
    }

    public double magnitud(IGVecR4 b){
        return Math.sqrt(Math.pow(b.x,4) + Math.pow(b.y,4) + Math.pow(b.z,4) + Math.pow(b.a,4));
    }


    public double getX(){
        return x;
    }

    public void setX(double x){
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }
}

