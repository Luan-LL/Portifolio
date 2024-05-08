// See https://aka.ms/new-console-template for more information

using System.Reflection.Metadata.Ecma335;

int qtdNum;
do
{
    Console.WriteLine("Informe a quantidade de números (entre 3 e 10): ");

} while (!int.TryParse(Console.ReadLine(), out qtdNum) || qtdNum < 3 || qtdNum > 10);

double[] num = new double[qtdNum];

for (int i = 0; i < qtdNum; i++)
{
    Console.WriteLine($"Digite o {i+1}ºnúmero: ");
    while (!double.TryParse(Console.ReadLine(), out num[i]))
    {
        Console.WriteLine("Por favor, informe um número válido:");
    }
}
double soma = 0;
foreach(double numSoma in num)
{
    soma += numSoma;
}
double media = soma / qtdNum;

Console.WriteLine($"A soma do números é: {soma} \n A média dos números é: {media}");


Console.ReadLine();
    



