// 1. 
console.log(`문자열이 긴 경우에는 문자열을 나눈 뒤 다시 합칩니다`);


// 2.
console.log(3**(2+1));


// 3.
console.log(5 + 4 * 3 !== 27); 


// 4. 
let a = 1;
let b = 2;

let box;
console.log(a);
console.log(b);

box = a;
a = b;
b = box;

console.log(a);
console.log(b);


// 5.
let cond = true;
let value = '';

switch (cond) {

case !!cond:
  value = "true 입니다"
  break;
case !cond:
  value = "false 입니다"
  break;
  default:
    console.log('마 단디 입력 안하나') 
}


// 6. 
for (let index = 1; index <= 100; index++) {
  console.log(index);
}

// 7. 
const TWO = 2;
const NINE = 9;

// 단
for (let dan = TWO; dan< NINE; dan++) {
  // 1 ~ 9
  for (let index = 1; index < NINE; index++) {
    if (dan*index%2 == 0) {
      continue
    }
    console.log(dan +"x"+ index + "=" , dan*index)
  }
  console.log();
}


// 8.
const arr1=  [ 1,2,3,4,5,6,7 ] ;

console.log(arr.length-2);

// 9.
const arr2 = ['가','라','다','라','마','라']

for (let index = 0; index < arr.length; index++) {
  const ra1 = arr.indexOf('라');
  arr.splice(ra1,1);
}
console.log(arr);


// 10.
const multiple = (x,y,z) =>  x * y * z;

console.log(multiple(5,5,5));


// 11.
// 143p. 1분퀴즈

const ichiban = {
  name:{
    first:'jaeil',
    last:'lee'
  },
  sex:'m'
};

console.log(ichiban.name.last);

