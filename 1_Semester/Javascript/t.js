// const arr = Array(45).fill().map((e,i)=>i+1);
// const result = [];
// for (let i = arr.length ;  0 < arr.length; i--) {
//   const ransu = Math.floor(Math.random()*arr.length);
//   const randex = arr.splice(ransu,1);
//   const index = randex[0];
//   result.push(index);
// }
// console.log(result.sort((a,b)=> a-b));




// const a = (n,m) => Math.floor(Math.random()*(m-n+1))+1;
// console.log(a(1,10));



let a = [ 1,2,3,4,5];   
let b = [ 1,2,3,4,5];  
console.log(a.splice(0,1,12345));
console.log(b.slice(0,1,12345));
console.log(a);
console.log(b);



// const arr  = ['나','가','다','마','라','바'];
// arr.sort((a,b)=>{
//   if (a>b) {
//     return 1;
//   } else {
//     return -1;
//   }
// })
// console.log(arr);



// for (let i = 0; i < 5; i++) {console.log(i);}
// console.log('마지막 출력 i 는 ?  =>   '+i);
  


// console.log('첫 번째');
// setImmediate(() => {
//   console.log('두 번째');
// });
// console.log('세 번째');
// console.log('4 번째');
// console.log('5 번째');
// console.log('6 번째');
// console.log('7 번째');          



// const date =new Date(2023,6,20) - new Date(1994,10,1) ;
// console.log(date/1000/60/60/24);  // 초/분/시


// const arr = [1,2,3,4,5];
// const result = arr.reduce((a,c)=> {
//   re[c]=c*10;
//   return re ;
// }, re={})
// console.log(result);




// 두 번째 요소는 필요하지 않음
// const obj = {a:1,b:2,c:3,d:4};
// const {a,c} =obj;
// console.log(a);
// console.log(c);

// const result = [] ;

// for (let row = 0; row < 5; row++) {
//   const 행 = [];
//   for (let col = 0; col <4; col++) {
//     행.push(1);
//   } 
//   result.push(행);
// };
// console.log(result);



// const arr = [1,2,3,["ㅋ","ㄹ","ㅋ","ㄹ" , ["あ","い","う"]]];
// console.log(arr.flat())


// const arr = [ {a:1},'hello',null,undefined,false];

// const arr2 = [...arr];
// // const arr2 = JSON.parse(JSON.stringify(arr));


// console.log(arr[0]==arr2[0])


