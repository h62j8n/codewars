/**
 * Create a function that gives a personalized greeting. This function takes two parameters: name and owner.
 * 개인화된 인사말을 제공하는 기능을 만듭니다. 이 함수는 name 및 owner 2개의 매개변수를 사용 합니다.
 * 
 * name 및 owner가 같다면: 'Hello boss'
 * 다르면: 'Hello guest'
 */

export function greet(name: string, owner: string): string {
  const user: string = name === owner ? 'boss' : 'guest';
  return `Hello ${user}`;
}

/**
 * Write function bmi that calculates body mass index (bmi = weight / height2).
 * 체질량 지수(bmi = 체중 / 키 2 )를 계산하는 함수 bmi를 작성하십시오.
 * 
 * bmi <= 18.5인 경우 "Underweight" (저체중) 반환
 * bmi <= 25.0이면 "Normal" (정상)을 반환합니다.
 * bmi <= 30.0이면 "Overweight" (과체중)을 반환합니다.
 * bmi > 30이면 "Obese" (비만)을 반환합니다.
 */

export function bmi(weight: number, height: number): string {
  const data: number = weight / Math.pow(height, 2);
  let result: string = 'Obese';
  if (data <= 30 && data > 25) result = 'Overweight';
  else if (data <= 25 && data > 18.5) result = 'Normal';
  else if (data <= 18.5) result = 'Underweight';
  
  return result;
}

/**
 * Given a non-empty array of integers, return the result of multiplying the values together in order.
 * 비어 있지 않은 정수 배열이 주어지면 값을 순서대로 곱한 결과를 반환합니다.
 * 
 * Example:
 * [1, 2, 3, 4] => 1 * 2 * 3 * 4 = 24
 */

export function grow(arr: number[]): number {
  let result: number = 1;
  arr.forEach(item => result = item * result);

  return result;
}

/**
 * Your task is to create the functionisDivideBy (or is_divide_by) to check if an integer number is divisible by both integers a and b.
 * 당신의 임무는 하나의 정수가 정수 a와 정수 b로 나눌 수 있는지 확인 하는 함수 isDivideBy(또는 is_divide_bynumberab)를 만드는 것 입니다.
 */

export function isDivideBy(number: number, a: number, b: number): boolean {
  return Number.isInteger(number / a) && Number.isInteger(number / b);
}

/**
 * The first century spans from the year 1 up to and including the year 100, the second century - from the year 101 up to and including the year 200, etc.
 * 1세기는 1년부터 100년 까지를 포함 하고, 2세기는 101년부터 200년 까지를 포함 합니다.
 * 
 * Given a year, return the century it is in.
 * 1년이 주어지면 그것이 속한 세기를 반환합니다.
 */

export const centuryFromYear = (year: number): number => {
  // return Number.isInteger(year / 100) ? year : year + 1;
  return Math.ceil(year / 100);
};

/**
 * Can you find the needle in the haystack?
 * Write a function findNeedle() that takes an array full of junk but containing one "needle"
 * 건초 더미에서 바늘을 찾을 수 있습니까?
 * 쓰레기로 가득 차 있지만 하나의 "needle"을 포함하는 배열을 가지는 함수 findNeedle()를 작성하십시오.
 * 
 * After your function finds the needle it should return a message (as a string) that says:
 * 함수가 바늘을 찾은 후에는 다음과 같은 메시지(문자열로)를 반환해야 합니다.
 * 
 * "found the needle at position " plus the index it found the needle,
 */

export function findNeedle(haystack: any[]):string {
  return `found the needle at position ${haystack.indexOf('needle')}`;
}