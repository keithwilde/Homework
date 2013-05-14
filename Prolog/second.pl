second(X,[]).
second(X, [H|T]) :- second(X,[X,_|T).