	.data
strInput:
	.asciiz "Please input  an integer to add to sum: "
strOutput:
	.asciiz "The sum is "
	.text
move $t0, $zero

li $v0, 4
la $a0, strInput
syscall
li $v0, 5
syscall

loop:
beq $v0, $zero, end
add $t0,$v0, $t0
li $v0, 4
la $a0, strInput
syscall
li $v0, 5
syscall
j loop



end:
li $v0, 4
la $a0, strOutput
syscall

li $v0, 1
move $a0, $t0
syscall