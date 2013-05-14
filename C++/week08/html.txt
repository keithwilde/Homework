%{
FILE *fout;
%}
tag [/^$/!{s/<[^>]*]
word [^ \t\n]+		
%%

{tag} {fprintf(fout, "");}		
{word}  {fprintf(fout, "%s", yytext);} 
 
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