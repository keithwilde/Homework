double([],[])
double([H|T], [HR|TR] :- 
	HR is H*2,
	double(T,Tr).