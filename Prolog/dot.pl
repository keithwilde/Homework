
dot([],[],0).
dot([H1|T1], [H2|T2], R) :-
	 
	P is (H1*H2),	
	dot(T1,T2,Y),
        R is P+Y.