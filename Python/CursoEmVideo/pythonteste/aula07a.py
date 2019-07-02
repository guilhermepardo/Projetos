n1 = int(input('Digite um valor: '))
n2 = int(input('Outro valor: '))
s = n1+n2
m = n1 * n2
d = n1 / n2
di = n1 // n2
e = n1 ** n2
print('A soma é {}, \n o produto é {} e a divisão é {:.3f}'.format(s, m, d), end=' ')   #:.3f faz a divisão ter apenas 3 casas decimais após a virgula e end=' ' evita que a linha se quebre entre um print e o outro print, \n quebra a linha
print('Divisão inteira {} e potência {}'.format(di, e))
