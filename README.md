# JavaExercises

Exercicios de Java

Fonte: https://www.explicacoesjava.pt/exercicios/

-> Exercicio 1 - Índice de massa corporal 

Desenvolva um programa que calcule o Índice de Massa Corporal (IMC) do utilizador. Para isso deverá pedir-lhe o seu peso em kg e altura em metros. No final deverá mostrar na consola se o utilizador tem peso a menos, o peso ideal ou excesso de peso.

Considere que um IMC inferior a 18 significa peso a menos, um IMC entre 18 e 25 é o ideal, e um IMC superior a 25 significa excesso de peso.

A formula de cálculo do IMC é: peso/(altura*altura)

-> Exercicio 2 - Cumprimenta

Desenvolva um programa que pergunta o nome do utilizador e o cumprimenta adequadamente com "Bom dia", "Boa tarde" ou "Boa noite". Considere que das 7h ás 12h->Bom dia, 12h ás 20h->Boa tarde e das 20h ás 7h->Boa noite

Para saber a hora atual poderá utilizar as instruções:

Calendar rightNow = Calendar.getInstance();
int hora_actual = rightNow.get(Calendar.HOUR_OF_DAY);

Desta forma ficará guardada dentro da variável hora_actual, a hora do dia atual.

-> Exercicio 3 - Mostrar números na consola 

Desenvolva um procedimento que recebe um número inteiro como argumento e mostra na consola todos os números inteiros, até esse número (inclusive). Deve mostrar um número por linha.

-> Exercicio 4 - Números ímpares

Crie um procedimento que mostre na consola os números ímpares de 1 a 100.

-> Exercicio 5 - Vetor de inteiros 

Desenvolva uma função que constrói um vetor de inteiros, com os números de 0 a 10, e o retorna.
