// 🟢 Fisher_Yates_Shuffle 알고리즘 🟢

const arr_45 = Array(45).fill().map((e,i)=>i+1);
// console.log(arr_45) 

const random_arr = [];

while (arr_45.length > 0) {
  const ransu = Math.floor(Math.random()*arr_45.length); // 0 ~ 45 사이의 랜덤 숫자(index) 추출
  const selsected_index = arr_45.splice(ransu,1); // 배열로 반환함  // 위에서 뽑은 숫자(index)
  const index = selsected_index[0]; // 랜덤 인덱스 하나 뽑음
   random_arr.push(index);
}
console.log(random_arr)