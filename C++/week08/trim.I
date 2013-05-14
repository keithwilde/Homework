%{
FILE *fout;
%}
space [ \t\n]+
word [^ \t\n]+		//anything but space tab or newline
%%

{space} {fprintf(fout, " ");}		//replaces any number of spaces and newlines with a single space
{word}  {fprintf(fout, "%s", yytext);} //just replaces the word with the same word

%%

int main (int argc, char **argv) {
	fout fopen("out.txt","w");
	
	
	if(argc >1) {
		FILE *inFile;
		
		inFile = fopen(argv[1], "r");
		yyin inFile;
	}
	yylex();
	fclose(fout);
}