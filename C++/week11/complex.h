//operator overloading

#ifndef _COMPLEX_H
#define _COMPLEX_H


using namespace std;

class Complex {
	public:
		Complex(double = 0.0, double =0.0);
		Complex operator+(Complex &);
		Complex operator-(Complex &);
		Complex operator*(Complex &);
		void print();
		
	private:
		double real;
		double imag;

		};
Complex::Complex(double realPart, double imagPart) : 
	real(realPart), 
	imag(imagPart) {}

Complex Complex::operator+ (Complex &operand2){
	return Complex(real + operand2.real, imag + operand2.imag);
}

Complex Complex::operator- (Complex &operand2){
	return Complex(real - operand2.real, imag - operand2.imag);
}
Complex Complex::operator* (Complex &operand2){
	return Complex(real * operand2.real, imag*operand2.imag);
}
void Complex::print(){
	cout<< "("<<real<<","<<imag<<")";
}

#endif
