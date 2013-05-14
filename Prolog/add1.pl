add1([],[]).
add1([H1|T1],[H2|T2]) :-
	H2 is (H1+1),
	add1(T1,T2).