public class Figura{  //Criando a classe figura
    private static double base = 5; //Criando a variável base;
    private static double altura = 5; //Criando a variável;
    private static double area; //Criando a variável area;
    
    public static double calcularArea(){ //Endereço da função calcularArea
        area = base*altura; //Cálculo da área
        return area; //Retornando o valor da conta
    }

    Figura figura = new Figura(); //Criando o objeto figura

    public double getBase() { //Encapsulando a variavel base
        return base;
    }
    public void setBase(double base) { //Encapsulando a variavel base
        this.base = base;
    }
    public double getAltura() { //Encapsulando a variavel altura
        return altura;
    }
    public void setAltura(double altura) { //Encapsulando a variavel altura
        this.altura = altura;
    }
    public double getArea() { //Encapsulando a variavel area
        return area;
    }
    public void setArea(double area) { //Encapsulando a variavel area
        this.area = area;
    }

}