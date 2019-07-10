package edu.ujcv.progra2.vector;

public class IGVecR2 {


    private double x;
    private double y;

    public IGVecR2 suma (IGVecR2 b){

        IGVecR2 retval = new IGVecR2();
        retval.x = x + b.x;
        retval.y = y + b.y;
        System.out.println(retval);

        return new retval;
    }

    public IGVecR2 resta (IGVecR2 b){
          IGVecR2 retval = new IGVecR2();
          retval.x = x - b.x;
          retval.y = y - b.y;
        return new retval;
    }

    public  IGVecR2 escalarPorVector (double alpha){
        IGVecR2 retval = new IGVecR2();
        retval.x = (alpha * x);
        retval.y = (alpha * y);
        return new retval;
    }

    public double productoPunto(IGVecR2 b){
        double retval;
        retval = (x * b.x) + (y * b.y);
        return retval;
    }


    public double angulo (IGVecR2 b, IGVecR2 a){
        double retval;
        retval = Math.acos(a.productoPunto(b)/ magnitud(a) * magnitud(b));
        return Math.toDegrees(retval);
    }

    public double magnitud(IGVecR2 b) {
        return Math.sqrt(Math.pow(b.x,2)) + Math.pow(b.y,2);
    }



public double getX(){
return x;
}

public void setX(double x){
    this.x = x;
}

public double getY(){
    return y;
}

public void setY(double y){
    this.y = y;
}
}