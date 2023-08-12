package br.com.gilmarioarantes.validacpf.model;

1 public class ValidaCPF {
2    public boolean isCPF(String cpf){
3        boolean result = false;
4        int[] numerosCpf = new int[11];
5        int quantidadeZeros = 11 - cpf.length();
6        int soma = 0;
7
7        //valida se a quantidade de dígitos informados é maior de 11
8        if(cpf.length() > 11){
9            return result;
10        }
11
12        //validar se existe algum caracter que não seja dígito
13        for(int i = 0; i < cpf.length(); i++){
14            if(!Character.isDigit(cpf.charAt(i))){
15                return result;
16            }
17        }
18
19        for(int i = 0; i < quantidadeZeros; i++){
20            numerosCpf[i] = 0;
21        }
22
23        int j = 0;
24       for(int i = quantidadeZeros; i < 11; i++){
25            numerosCpf[i] = Integer.parseInt(cpf.substring(j,j+1));
26            j++;
27        }
28
29
30        //valida se todos os números são iguais
31        if(numerosCpf[0] == numerosCpf[1] &&
32                numerosCpf[1] == numerosCpf[2] &&
33                numerosCpf[2] == numerosCpf[3] &&
34                numerosCpf[3] == numerosCpf[4] &&
35                numerosCpf[4] == numerosCpf[5] &&
36                numerosCpf[5] == numerosCpf[6] &&
37                numerosCpf[6] == numerosCpf[7] &&
38                numerosCpf[7] == numerosCpf[8] &&
39                numerosCpf[8] == numerosCpf[9] &&
40                numerosCpf[9] == numerosCpf[10]){
41            return result;
42        }

43        //calculo do primeiro dígito
44        for(int i = 0; i < numerosCpf.length-2; i++){
45            soma += numerosCpf[i] * (10-i);
46        }
47
48       int restoDivisaoPrimeiroDigito = (soma%11);
49
50        int primeiroDigito = 0;
51        if(restoDivisaoPrimeiroDigito < 2){
52            primeiroDigito = 0;
53        }else{
54            primeiroDigito = 11 - restoDivisaoPrimeiroDigito;
55        }
56
57        //Cálculo do segundo dígito
58        soma = 0;
59        for(int i = 0; i < numerosCpf.length-1; i++){
60            soma += numerosCpf[i] * (11-i);
61        }
62
63        int restoDivisaoSegundoDigito = (soma%11);
64
65        int segundoDigito = 0;
66        if(restoDivisaoSegundoDigito < 2){
67            segundoDigito = 0;
68        }else{
69            segundoDigito = 11 - restoDivisaoSegundoDigito;
70        }
71
72        result = (primeiroDigito == numerosCpf[9]) && (segundoDigito ==  numerosCpf[10]);
73
74        return result;
75    }
76
77 }
