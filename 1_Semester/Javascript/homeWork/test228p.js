/* 원래 문제
function test() {
  let result = "";

  if (!a) {
    result += "a";
    result += "b";
    return result;
  }

  if (!b) {
    result = "c";
  }
  result += "b";
  return result;
}
*/


// 재일이의 답
function test() {
  let result = "";

  if (a) {
    if (!b) {
      result = "c";
    }
  } else {
    result += "a";
  }
  result += "b";

  return result;
}