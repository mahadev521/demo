import java.util.Scanner;

public class Question121 {
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
String input = sc.nextLine();
char seq[] = input.toCharArray();
int outflag=0;
for(int i=0; i<seq.length; i++){
seq[i]=gui_map(seq[i]);
if (seq[i]=='R' || seq[i]=='S' || seq[i]=='F' ||seq[i]=='C')
break;
}
//Print Mapped GUI (remove comment to see the mapped sequence
/*
for(int i=0; i<seq.length; i++){
System.out.print(seq[i]);
}
*/
// Use double type of values for entire calculation
double operand1=0.0;
String o1="";
double operand2=0.0;
String o2="";
double output=0.0;
// Perform calculaton operations
outerloop:
for(int i=0; i<seq.length; i++){
if(seq[i]=='C'){ //Clear
operand1=0.0;
operand2=0.0;
output=0.0;
outflag=0;
break outerloop;
}else if(seq[i]=='R'){ //Square Root
for(int j=0; j<i; j++){
o1+=Character.toString(seq[j]);
}
operand1=Double.parseDouble(o1);
output=Math.sqrt(operand1);
outflag=1;
break outerloop;
}
else if(seq[i]=='S'){ //Square
for(int j=0; j<i; j++){
o1+=Character.toString(seq[j]);
}
operand1=Double.parseDouble(o1);
output=Math.pow(operand1,2);
outflag=1;
break outerloop;
}else if(seq[i]=='F'){ //Inverse
for(int j=0; j<i; j++){
o1+=Character.toString(seq[j]);
}
operand1=Double.parseDouble(o1);
output=Math.pow(operand1,-1);
outflag=1;
break outerloop;
}else{
int r=0;
if(seq[i]=='+'||seq[i]=='-'||seq[i]=='/'||seq[i]=='*'||seq[i]=='='){
for(int j=0; j<i; j++){
o1+=Character.toString(seq[j]);
}
operand1=Double.parseDouble(o1);
for(int k=i+1; k<seq.length; k++){
if(seq[k]=='='){
outflag=1;
operand2=Double.parseDouble(o2);
if(seq[i]=='+'){
output=operand1+operand2;
}else if(seq[i]=='-'){
output=operand1-operand2;
}else if(seq[i]=='/'){
output=operand1/operand2;
}else if(seq[i]=='*'){
output=operand1*operand2;
}
break outerloop;
}else{
o2+=Character.toString(seq[k]);
}
}
}
}
}
// Check if output is available and print the output
if(outflag==1)
System.out.print(output);