	.data 			# everything under this is variables
strInput:
	.asciiz "Please input  an integer to add to sum: "
strOutput:
	.asciiz "The sum is "
	.text 			#everything under this is instructions
move $t0, $zero
							#btt blt
li $v0, 4
la $a0, strInput
syscall
li $v0, 5
move $t0,$v0
syscall

li $v0, 4
la $a0, strInput
syscall
li $v0, 5
move $t1,$v0
syscall

li $v0, 4
la $a0, strInput
syscall
li $v0, 5
move $t2, $v0
syscall

add $t3, $t0,$t1
add $t4, $t1,$t2
add $t5, $t2, $t3


