scalarMult(_,[],[]).
scalarMult(X,[H|T],[R|RT]):- 
	R is (X*H),
	scalarMult(X,T,RT).