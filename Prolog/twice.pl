twice([],[]).
twice([H|T], [HR|TR]) :-  
	HR = [H,H],
	twice(T,TR).