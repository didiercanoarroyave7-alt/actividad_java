public class sobrecarga {

    public float suma (float a, float b){
        return a + b ;
    }

    public float suma (float a, float b, float c){
        return a + b + c;
    }

    public String soyMayorEdad( int edad){
        if(edad >= 18){
            return "es mayor de edad";
        }else{
            return "no es mayor de edad";
        }
    }

    public String soyMayorEdad( int edad){
        if(edad >= 21){
            return "es mayor de edad";
        }else{
            return "no es mayor de edad";
        }
    }