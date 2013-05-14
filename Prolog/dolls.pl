directlyIn(katarina,olga).
directlyIn(olga,natasha).
directlyIn(natasha,irina).

in(X,Y) :- directlyIn(X,Y).
in(X,Y) :- in(X,Z),
	in(Z,Y).
	

