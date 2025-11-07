class CommandLine{
public static void main(String[] args){
if(args.length<0){
System.out.println("error:parse minimum 1 parameter");
}else{
int sum=0;
for(int i=0;i<arr.length;i++){
sum=sum + Integer.parseInt(args[i]);
}

System.out.println("sum:" + sum);
}
}
 