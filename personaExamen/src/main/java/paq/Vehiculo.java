package paq;

/**
 *
 * @author luisa
 */
public class Vehiculo implements Itraducible {
    //atributos
    private String marca;
    private String modelo;
    private int ano;
    
    //constructores

    public Vehiculo() {
        
    }

    public Vehiculo(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }
    
    //getters
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }
    
    //setters

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    
    //metodos

    @Override
    public String toString() {
        return "Vehiculo{" + "marca=" + marca + ", modelo=" + modelo + ", año=" + ano + '}';
    }
    @Override
    public String aIngles() {
        return "Vehicle{" + "Brand =" + marca + ", Model =" + modelo + ", Year =" + ano + '}';
    }
    
}
