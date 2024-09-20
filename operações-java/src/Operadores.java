public class Operadores {
    public static void main(String[] args) {
        //O "+" serve para juntar duas String's
        String nomeCompleto = "Linguagem" + "Java";
       
        //Aqui, ele vai realizar uma soma até encontrar uma string exibida entre: ""
        String concatenacao = "?";
        
        concatenacao = 1+1+1+"1";
        
        concatenacao = 1+"1"+1+1;
        
        concatenacao = 1+"1"+1+"1";
        
        concatenacao = "1"+(1+1+1);
        
        //Para realizar uma operação matemática no valor de uma variável, utiliza-se o nome da variável + o valor que você deseja atribuir
        //Exemplo:+,-,*,%
       
        int numero = 6;
        numero = numero + 10;

        //Utiliza-se o "Boolean" para definir uma váriavel como true ou false
        //(Obs): Para inventer o valor, deve-se utilizar "!" antes de printar
        
        Boolean variavel1 = false;
        
        //Inventer valor 
        
        Boolean variavel2 = true;

        //Para descobrir se a variável é diferente ou verdadeira...
        //Declaramos duas variáveis e após, utilizaremos o if e else.
        //Exemplo
        int a, b;

        a = 10;
        b = 11;

        String resultado = "";
        if (a==b)
            resultado = "Os valores são iguais";
        else
            resultado = "Os valores não são iguais";

        //O resultado trará um resultado falso, pois "a" é diferente de "b"
        //Se "a" for igual a "b", o resultado imprimido será verdadeiro.

        //Posso utilizar também a seguinte expressão para descobrir o resultado desta operação:

        String resultado = a == b ? "Verdadeiro" : "Falso";

    }
}
