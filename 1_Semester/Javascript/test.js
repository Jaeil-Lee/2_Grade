// const candidate = Array(45).fill().map((v, i) => i + 1);
// console.log(candidate)
// console.log(candidate.splice(3,1))

const { body } = document;
const $table = document.createElement('table');
const $result = document.createElement('div'); // 결과창
const rows = [];
for (let i = 1; i <= 5; i++) {
 const $tr = document.createElement('tr');
 const cells = [];
 for (let j = 1; j <= 4; j++) {
 const $td = document.createElement('td');
 cells.push($td);
 $tr.appendChild($td);
 }
 rows.push(cells);
 $table.appendChild($tr);
}