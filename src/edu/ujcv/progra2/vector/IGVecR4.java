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
        //TODO: implementar
        return new IGVecR4();
    }

    //producto.
    public  IGVecR4 escalarPorVector(double alpha){
        //TODO: implementar
        return new IGVecR4();
    }

    public double productoPunto(IGVecR4 b){
        //TODO: implementar
        return 0.0;
    }


    // no esta definido en R4.!!!!!
    //public IGVecR4 productoCruz(IGVecR4 b){

    //}


    public double angulo(IGVecR4 b){
        //TODO: implementar
        return 0.0;
    }

    public double magnitud(){
        return Math.sqrt(productoPunto(this));
    }
}
