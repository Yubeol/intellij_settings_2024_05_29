package org.example;

// 문제 : 할인 대상인지 아닌지 출력해주세요.
// 조건 : 나이가 19세 이하이거나 60세 이상이면 할인 대상입니다.
// 조건 : 출력예시 처럼 출력되어야 합니다.
// 조건 : `구현시작` 부분만 수정 할 수 있습니다.
// 조건 : 4가지 이상의 방법으로 풀어야 합니다.
// 조건 : 그 중 2가지 방법은 `&&, ||`없이 풀어야 합니다.

class Main {
    public static void main(String[] args) {
        int age = 60; // 이 값을 바꿔가면서 실행해보세요.

        System.out.println("당신의 나이는 " + age + "살 입니다.");
        System.out.println("===v1===");
        // 구현시작
        if (age <= 19 || age >= 60 ) {
            System.out.println("할인대상입니다");
        }
        if (age > 19 && age < 60){
            System.out.println("할인 대상이 아닙니다");
        }
        System.out.println("===v2===");
        // 구현시작
        if (age <= 19 || age >= 60 ) {
            System.out.println("할인대상입니다");
        }
        if (age > 19 && age < 60){
            System.out.println("할인 대상이 아닙니다");
        }
        System.out.println("===v3===");
        // 구현시작
        if (age <= 19 || age >= 60 ) {
            System.out.println("할인대상입니다");
        }
        else{
            System.out.println("할인 대상이 아닙니다");
        }
        // 출력 => 할인대상입니다. 또는 할인 대상이 아닙니다.
        System.out.println("===v4===");
        // 구현시작
        if (age <= 19) {
            System.out.println("할인");
        }
        if (age >= 60){
            System.out.println("할인");
        }
        if (age > 19 && age < 60) {
            System.out.println("할인 대상이 아닙니다");
        }
    }
}
