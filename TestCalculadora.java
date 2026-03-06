public class TestCalculadora{
    public static void main(String[]args){
        Calculadora calc = new Calculadora();
        
        assert calc.sumar(2,3)==5:"Error en suma";
        assert calc.restar(5,2)==3:"Error en resta";
        assert calc.multiplicar(3,4)==12:"Error en multiplicacion";
        assert calc.dividir(10,2)==5:"Error en division";
        
        System.out.println("Tosa las pruebas pasaron correctamente");
    }
}