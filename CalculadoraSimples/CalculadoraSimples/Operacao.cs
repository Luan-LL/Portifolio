using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CalculadoraSimples
{
    public class Operacao
    {
        double num1, num2;
        double result;
        public void Soma()
        {
            Console.WriteLine("1 - Soma\n");

            Console.WriteLine("Digite o primeiro valor: ");
            while (!double.TryParse(Console.ReadLine(), out num1))
            {
                Console.WriteLine("\nDigite somente valor númerico: ");

            }
            Console.WriteLine("Digite o segundo valor: ");
            while (!double.TryParse(Console.ReadLine(), out num2))
            {
                Console.WriteLine("\nDigite somente valor númerico: ");

            }
            double result = num1 + num2;

            Console.WriteLine($"Resultado: {result}\n");
        }
        public void Subtracao()
        {
            Console.WriteLine("2 - Subtração\n");

            Console.WriteLine("Digite o primeiro valor: ");
            while (!double.TryParse(Console.ReadLine(), out num1))
            {
                Console.WriteLine("\nDigite somente valor númerico: ");

            }
            Console.WriteLine("Digite o segundo valor: ");
            while (!double.TryParse(Console.ReadLine(), out num2))
            {
                Console.WriteLine("\nDigite somente valor númerico: ");

            }

            result = num1 - num2;

            Console.WriteLine($"Resultado: {result}\n");
        }
        public void Multiplicacao()
        {
            Console.WriteLine("3 - Multiplicação\n");

            Console.WriteLine("Digite o primeiro valor: ");
            while (!double.TryParse(Console.ReadLine(), out num1))
            {
                Console.WriteLine("\n Digite somente valor númerico: ");

            }
            Console.WriteLine("Digite o segundo valor: ");
            while (!double.TryParse(Console.ReadLine(), out num2))
            {
                Console.WriteLine("\nDigite somente valor númerico: ");

            }

            result = num1 * num2;

            Console.WriteLine($"Resultado: {result}\n");


        }
        public void Divicao()
        {
            Console.WriteLine("4 - Divisão\n");

            Console.WriteLine("Digite o primeiro valor: ");
            while (!double.TryParse(Console.ReadLine(), out num1))
            {
                Console.WriteLine("\nDigite somente valor númerico: ");

            }
            Console.WriteLine("Digite o segundo valor: ");
            while (!double.TryParse(Console.ReadLine(), out num2))
            {
                Console.WriteLine("\nDigite somente valor númerico: ");

            }

            result = num1 / num2;

            Console.WriteLine($"Resultado: {result}\n");

        }
        public void RestoDivicao()
        {
            Console.WriteLine("5 - Resto Divisão\n");

            Console.WriteLine("Digite o primeiro valor: ");
            while (!double.TryParse(Console.ReadLine(), out num1))
            {
                Console.WriteLine("\nDigite somente valor númerico: ");

            }
            Console.WriteLine("Digite o segundo valor: ");
            while (!double.TryParse(Console.ReadLine(), out num2))
            {
                Console.WriteLine("\nDigite somente valor númerico: ");

            }

            result = num1 % num2;

            Console.WriteLine($"Resultado: {result}\n");

        }
        public void Potenciacao()
        {
            Console.WriteLine("6 - Potenciação\n");

            Console.WriteLine("Digite o primeiro valor: ");
            while (!double.TryParse(Console.ReadLine(), out num1))
            {
                Console.WriteLine("\nDigite somente valor númerico: ");

            }
            Console.WriteLine("Digite o segundo valor: ");
            while (!double.TryParse(Console.ReadLine(), out num2))
            {
                Console.WriteLine("\nDigite somente valor númerico: ");

            }

            result = (double)Math.Pow(num1, num2);

            Console.WriteLine($"Resultado: {result}\n");


        }
    }
}
