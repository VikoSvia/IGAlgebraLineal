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
        retval.colum1.setZ(this.colum1.getZ() * 0);
        retval.colum2.setX(this.colum2.getX() * -Math.sin(angulo));
        retval.colum2.setY(this.colum2.getY() * Math.cos(angulo));
        retval.colum2.setZ(this.colum2.getZ() * 0);
        retval.colum3.setX(this.colum3.getX() * 0);
        retval.colum3.setY(this.colum3.getY() * 0);
        retval.colum3.setZ(this.colum3.getZ() * 1);

        return retval;
    }

    public IGMatR3 rotacionX (double angulo, IGVecR3 vector){
        IGMatR3 retval = new IGMatR3();

        retval.colum1.setX(this.colum1.getX() * 1);
        retval.colum1.setY(this.colum1.getY() * 0);
        retval.colum1.setZ(this.colum1.getZ() * 0);
        retval.colum3.setX(this.colum2.getX() * 0);
        retval.colum3.setY(this.colum2.getY() * Math.cos(angulo));
        retval.colum3.setZ(this.colum2.getZ() * Math.sin(angulo));
        retval.colum2.setX(this.colum2.getX() * 0);
        retval.colum2.setY(this.colum2.getY() * -Math.sin(angulo));
        retval.colum2.setZ(this.colum2.getZ() * Math.cos(angulo));


        return retval;
    }



}
