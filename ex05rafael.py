soma = cont = soma2 = cont2 = 0
for c in range(1, 3):
    cd = int(input('Código da peça: '))
    num = int(input('Número de peças: '))
    valor = float(input('Valor da peça: '))
    if c == 1:
        cont = cont + num
        soma = soma + valor
    if c == 2:
        cont2 = cont2 + num
        soma2 = soma2 + valor
print(f'VALOR TOTAL A PAGAR: R$ {(soma * cont) + (soma2 * cont2):.2f}')