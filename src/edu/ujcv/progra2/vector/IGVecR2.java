package edu.ujcv.progra2.vector;

public class IGVecR2 {


    private double x;
    private double y;

    public IGVecR2 suma(IGVecR2 b){

        IGVecR2 retval = new IGVecR2();
        retval.x = x + b.x;
        retval.y = y + b.y;
        System.out.println(retval);

        return new IGVecR2();
    }

    public IGVecR2 resta(IGVecR2 b){
        //TODO: implementar
        return new IGVecR2();
    }

    //producto.
    public  IGVecR2 escalarPorVector(double alpha){
        //TODO: implementar
        return new IGVecR2();
    }

    public double productoPunto(IGVecR2 b){
        //TODO: implementar
        return 0.0;
    }


    // no esta definido en R2.!!!!!
    //public IGVecR2 productoCruz(IGVecR2 b){

    //}

    public double angulo(IGVecR2 b){
        //TODO: implementar
        return 0.0;
    }

    public double magnitud(){
        return Math.sqrt(productoPunto(this));
    }


}
