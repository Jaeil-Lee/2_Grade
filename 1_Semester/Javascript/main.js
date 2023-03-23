const arr2 = ['가','라','다','라','마','라']

for (let index = 0; index < arr2.length; index++) {
  const ra1 = arr2.indexOf('라');
  arr2.splice(ra1,1);
}
console.log(arr2);