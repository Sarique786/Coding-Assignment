const str3=" This is a sunny day";              
document.writeln("Given Sentence : "+str3);
let arr=str3.split(" ");                        
let revstr3="";                                               

for(let j=0;j<arr.length;j++){
    let x=arr[j]                                 
     for(var k=x.length-1;k>=0;k--){
    revstr3+=x.charAt(k);                        
    }
  revstr3+=" ";                                   
}
document.writeln("|| Reversed Sentence : ")
document.writeln(revstr3);                        
