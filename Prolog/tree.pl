
swap(leaf(X),leaf(X)).
swap(tree(L,R), tree(NL,NR)) :- 
	
	swap(L,NR),
	swap(R,NL).
	
	
	
