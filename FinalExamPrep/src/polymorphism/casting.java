package polymorphism;

import java.util.Arrays;

public class casting {



    public static void main(String[] args) {
// down-casting
        Tesla x=new Tesla();
        Vehicle v =x;
        System.out.println(v.toString());
//up-casting
        Vehicle truck =new Vehicle();
        Tesla ct= (Tesla) truck;
        System.out.println(ct.toString());

    }}

    class Vehicle{
        Vehicle(){
        }
        boolean isSuv(){
            return  true;
        }

        @Override
        public String toString() {
            return "vehicle";
        }
    }
    class Tesla extends Vehicle{
        Tesla(){
            super();
        }
        boolean isSuv(){
            return  false;
        }
        @Override
        public String toString() {
            return "tesla";
        }
    }


