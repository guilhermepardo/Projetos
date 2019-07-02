preco = float(input('Digite o preço do produto: '))
desconto = preco * 0.05
novoPreco = preco - desconto

print('O produto custava {:.2f}, com o desconto, passou a custar {:.2f}'.format(preco, novoPreco))
