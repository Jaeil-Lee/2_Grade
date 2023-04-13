let numOne = '';
let operator = '';
let numTwo = '';

const $operator = document.querySelector('#operator'); // OPERATOR
const $result = document.querySelector('#result');     // RESULT


// for (let index = 0; index < 10; index++) {
//   document.querySelector(`#num-${index}`).addEventListener('click',()=>{
   

//   });
// }

/* 1. NUMBER */
document.querySelector('#num-0').addEventListener('click',()=>{
  if (operator) {
    numTwo +='0';
 
  } else {
    // 최초에는 operator 가  ''라서 false 처리된다
    numOne +='0';
  }
  $result.value +='0';
  console.log(numOne,numTwo,operator);
});
document.querySelector('#num-1').addEventListener('click',()=>{});
document.querySelector('#num-2').addEventListener('click',()=>{});
document.querySelector('#num-3').addEventListener('click',()=>{});
document.querySelector('#num-4').addEventListener('click',()=>{});
document.querySelector('#num-5').addEventListener('click',()=>{});
document.querySelector('#num-6').addEventListener('click',()=>{});
document.querySelector('#num-7').addEventListener('click',()=>{});
document.querySelector('#num-8').addEventListener('click',()=>{});
document.querySelector('#num-9').addEventListener('click',()=>{});


/* 2. OPERATOR */
document.querySelector('#plus').addEventListener('click',()=>{});
document.querySelector('#minus').addEventListener('click',()=>{});
document.querySelector('#divide').addEventListener('click',()=>{});
document.querySelector('#multiply').addEventListener('click',()=>{});
document.querySelector('#calculate').addEventListener('click',()=>{});
document.querySelector('#clear').addEventListener('click',()=>{});

