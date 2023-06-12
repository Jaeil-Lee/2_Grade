let ransu = Array(45).fill(0).map((e,i)=>{return i+1 })

console.log(ransu);

let shuffle = [];

while(ransu.length>0){
  let randomIndex = Math.floor(Math.random()*ransu.length) 
  let contain = ransu.splice(randomIndex,1);
  let result = contain[0];
  shuffle.push(result);
}

console.log(shuffle)

function betty () {
  
}