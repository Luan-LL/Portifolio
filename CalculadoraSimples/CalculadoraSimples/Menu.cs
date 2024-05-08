// See https://aka.ms/new-console-template for more information
using CalculadoraSimples;
using System;
using System.Linq.Expressions;
using System.Threading.Channels;

int op;
string input;

do
{
    do
    {
        Console.WriteLine("---------------------------------------Menu---------------------------------------");

        Console.WriteLine("\n\n Escolha a operação desejada:  \n 1 - Soma \n 2 - Subtrair \n 3 - Multiplicar \n 4 - Dividir \n 5 - Resto Divisão \n 6 - Potênciação  \n 0 - Sair \n\n");
        input = (Console.ReadLine());
        Console.Clear();

    } while (!int.TryParse(input, out op) || op > 6 || op < 0);

    Operacao operacao = new Operacao();


    switch (op)
    {
        case 1:

            operacao.Soma();

            break;

        case 2:
            operacao.Subtracao();
            break;

        case 3:
            operacao.Multiplicacao();

            break;

        case 4:
            operacao.Divicao();
            break;

        case 5:

            operacao.RestoDivicao();

            break;

        case 6:
            operacao.Potenciacao();
            break;

        case 0:
            Console.WriteLine("Encerrado.");

            break;
    }
} while (op != 0);


