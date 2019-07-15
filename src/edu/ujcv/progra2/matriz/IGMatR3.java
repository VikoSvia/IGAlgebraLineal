package edu.ujcv.progra2.matriz;

import edu.ujcv.progra2.vector.IGVecR3;

public class IGMatR3 {
    IGVecR3 colum1;
    IGVecR3 colum2;
    IGVecR3 colum3;

    public IGMatR3 rotacionZ (double angulo, IGVecR3 vector){
        IGMatR3 retval = new IGMatR3();

        retval.colum1.setX(this.colum1.getX() * Math.cos(angulo));
        retval.colum1.setY(this.colum1.getY() * Math.sin(angulo));
        

        return retval;
    }



}
