# SINTAXE BÃSICA DO QT SPIM

	# SEMPRE INICIA COM A VARIÃVEL GLOBAL main
	.globl main 
	# .data ONDE DESEJAR USAR A MEMÃ“RIA
	.data
		A: .word -2
		B: .word 4
		MOD: .word 0
		MENSAGEM: .asciiz "O modulo é = "   # CADA CHAR TEM 8 BITS; 13 X 8 = 104 BITS
	# O SEU PROGRAMA VAI ABAIXO DA DIRETIVA .text
	.text 		

# PONTO INICIAL
# CALCULA O MÃ“DULO COMO VISTO NO EXEMPLO ABS
main:
	lw $t0, A
	lw $t1, B
	sub $t2, $t0, $t1
	bgez $t2, end
	sub $t2, $t1, $t0
end:
	sw $t2, MOD			

# EXEMPLO DE COMO MOSTRAR VALORES NA TELA
	li $v0, 4                   # CARREGA O CÃ“DIGO 4 PARA O SYSCALL
	la $a0, MENSAGEM            # CARREGA O ENDEREÃ‡O DA STRING NO REGISTRADOR $a0
	syscall                     # PASSA OS VALORES CARREGADOS PARA O SO

	li $v0, 1                   # CARREGA O CÃ“DIGO 1 PARA O SYSCALL
	move $a0, $t2               # CARREGA O VALOR DO INTEIRO NO REGISTRADOR $a0
	syscall                     # PASSA OS VALORES CARREGADOS PARA O SO

	# PARA FINALIZAR O PROGRAMA, CARREGUE O VALOR 10 
	# NO REGISTRADOR $v0 E EM SEGUIDA EXECUTE UM SYSCALL
	li $v0, 10 # COMANDO DE EXIT
	syscall # EXIT