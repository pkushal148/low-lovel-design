let students = [
  "shubh",
  "anajali",
  "Shivani",
  "Shivangi",
  "Annapurna",
  "Shubham",
  "Krishnanendu",
  "Ravindranathan",
  "Shivesh",
  "kaif",
  "Emanuel",
];
let griff = [],
  huff = [],
  raven = [],
  sly = [];

function sortHouses(names) {
  names.forEach((element) => {
    if (element.length < 6) {
      griff.push(element);
    } else {
      sly.push(element);
    }
  });
}

sortHouses(students);

let numbers = [2, 4, 7, 7, 10, 20, 20];
let last = -1;

numbers.forEach((num, index) => {
  if (num === last) {
    last = num;
  } else {
    last = num;
    num = num * 2;
    numbers[index] = num;
  }
});

// console.log(numbers);

let s = "The quick brown fox jumps over the lazy dog";
let words = s.split(" ");

words.reverse();

let reversedS = words.join(" ");

// console.log(reversedS);

let password = "@ssw0rd!";

function validatePassword(password) {
  if (password.length < 8) {
    return false;
  }
  let cap = false,
    small = false,
    digit = false;
  password = password.split("");
  password.forEach((s) => {
    if (s >= "a" && s <= "z") {
      small = true;
    } else if (s >= "0" && s <= "9") {
      digit = true;
    } else if (s >= "A" && s <= "Z") {
      cap = true;
    }
  });

  return cap && small && digit;
}

console.log(validatePassword(password));
