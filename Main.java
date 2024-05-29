package org.example;


class Main {
    public static void main(String[] args) {
        if ( true ) {
            System.out.println("참");
        }

        if ( false ) {
            System.out.println("거짓");
        }

        int a = 10; //a라는 변수에 10이라는 값을 넣겠다
        // `==` => 같다.
        if ( a == 10 ) {
            System.out.println("true1");
        }

        // `!=` => 같지 않다.
        if ( a != 10 ) {
            System.out.println("false1");
        }

        if ( a > 10 ) {
            System.out.println("false2");
        }

        if ( a >= 10 ) {
            System.out.println("true2");
        }

        int b = 10;

        if ( a == b ) {
            System.out.println("true3");
        }

        // boolean c => c 에는 오직 true/false 만 담을 수 있다.
        boolean c = a != b;

        if ( c ) {
            System.out.println("false3");
        }

        if ( c == false ) {
            System.out.println("true4");
        }

        // `!` => 반전
        if ( !c ) {
            System.out.println("true5");
        }

        // `!` => 반전
        if ( !(!c) ) {
            System.out.println("true6");
        }

        boolean d = true;

        if ( c != d ) {
            System.out.println("ture7");
        }

        if ( 20 > 2 && 10 > 3 && true != false && 10 != 10 ) {
            System.out.println("false4");
        }

        if ( 10 != 10 || 10 < 2 ) {
            System.out.println("false5");
        }
    }
}