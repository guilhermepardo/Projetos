altura = float(input('Altura da sua parede: '))
largura = float(input('Largura da sua parede: '))
area = altura * largura
qtdTinta = area * 0.5
print('A quantidade necessária de tinta para pintar sua parede de {:.2f}m2 \n será de {:.2f}L'.format(area, qtdTinta))