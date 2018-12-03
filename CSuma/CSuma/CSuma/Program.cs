using System;

namespace CSuma
{
    class MainClass
    {
        public static void Main(string[] args)
        {
            decimal primerNumero = readDecimal("Primer número: ");
            decimal segundoNumero = readDecimal("Segundo número: ");
            decimal suma = primerNumero + segundoNumero;
            Console.WriteLine("Suma = " + suma);
        }

        //private static decimal readDecimal(string label){
        //    Console.Write(label);
        //    string string
        //}







//            Console.Write("Primer número: ");
//            string stringPrimerNumero = Console.ReadLine();
//            decimal primerNumero = decimal.Parse(stringPrimerNumero);

//            Console.Write("Segundo número: ");
//            string stringSegundoNumero = Console.ReadLine();
//            decimal segundoNumero = decimal.Parse(stringSegundoNumero);

//            decimal suma = primerNumero + segundoNumero;
//            Console.Write("El resultado de la suma es: " + suma);
//        }
    }
}
