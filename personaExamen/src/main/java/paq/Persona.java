package paq;

/**
 *
 * @author luisa
 */
public class Persona {

    //atributos
    private String nombre;
    private byte edad;
    private String Dni;
    private char sexo;
    private float peso;
    private float altura;

    //atributos por defecto
    public static final String DEFAULT_NOMBRE = "";
    public static final byte DEFAULT_EDAD = 0;
    public static final char DEFAULT_SEXO = 'H';
    public static final float DEFAULT_PESO = 0;
    public static final float DEFAULT_ALTURA = 0;

    //constructores
    public Persona() {

        this.nombre = Persona.DEFAULT_NOMBRE;
        this.edad = Persona.DEFAULT_EDAD;
        this.sexo = Persona.DEFAULT_SEXO;
        this.peso = Persona.DEFAULT_PESO;
        this.altura = Persona.DEFAULT_ALTURA;
    }

    public Persona(String nombre, byte edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = Persona.DEFAULT_PESO;
        this.altura = Persona.DEFAULT_ALTURA;
    }

    public Persona(String nombre, byte edad, String Dni, char sexo, float peso, float altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.Dni = Dni;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }
    //getters 

    public String getNombre() {
        return nombre;
    }

    public byte getEdad() {
        return edad;
    }

    public String getDni() {
        return Dni;
    }

    public char getSexo() {
        return sexo;
    }

    public float getPeso() {
        return peso;
    }

    public float getAltura() {
        return altura;
    }
    //setters

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }

    public void setDni(String Dni) {
        this.Dni = Dni;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    //metodos

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", Dni=" + Dni + ", sexo=" + sexo + ", peso=" + peso + ", altura=" + altura + '}';
    }

    public int calcularIMC() {
        int result;
        double imc = this.peso / Math.pow(this.altura, 2);
        if (imc < 18.5) {
            result = -1;
        } else if (imc > 24.9) {
            result = 1;
        } else {
            result = 0;
        }
        return result;
    }
}
