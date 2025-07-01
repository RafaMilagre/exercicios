soma = n1 = n2 = 0
for c in range(1, 3):
    valor = int(input(f'Digite o {c}º valor: '))
    soma = soma + valor
    if c == 1:
        n1 = valor
    if c == 2:
        n2 = valor
print(f'A soma do valor {n1} com o valor {n2} será {soma}.')