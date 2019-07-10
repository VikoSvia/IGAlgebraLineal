package edu.ujcv.progra2.vector;

public class IGVecR3 {

    private double x;
    private double y;
    private double z;

    public IGVecR3 suma (IGVecR3 b){
        IGVecR3 retval = new IGVecR3();
        retval.x = x + b.x;
        retval.y = y + b.y;
        retval.z = z + b.z;
        System.out.println(retval);
        return retval;
    }

    public IGVecR3 resta(IGVecR3 b){
        IGVecR3 retval = new IGVecR3();
        retval.x = x - b.x;
        retval.y = y - b.y;
        retval.z = z - b.z;
        return retval;
    }


    public  IGVecR3 escalarPorVector(double alpha){
        IGVecR3 retval = new IGVecR3();
        retval.x = (alpha * x);
        retval.y = (alpha * y);
        retval.z = (alpha * z);
        return retval;
    }

    public double productoPunto(IGVecR3 b){
        double retval;
        retval = (x * b.x) + (y * b.y) + (z * b.z);
        return retval;
    }



    public double productoCruz(IGVecR3 b){
        double retval;
        retval = (x * b.x) + (y * b.y) + (z + b.z);
        return retval;
    }


    public double angulo(IGVecR3 b, IGVecR3 a){
        double retval;
        retval = Math.acos(3/ magnitud(a) * magnitud(b));
        return retval;
    }

    public double magnitud(IGVecR3 b){
        return Math.sqrt(Math.pow(b.x,3)) + Math.pow(b.y,3) + Math.pow(b.y,3);
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
}


