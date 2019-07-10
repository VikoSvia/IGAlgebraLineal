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

    public double magnitud(){
        return Math.sqrt(productoPunto(this));
    }
}
