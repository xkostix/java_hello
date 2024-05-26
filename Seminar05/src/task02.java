//Написать программу, определяющую правильность расстановки скобок в выражении.
//Пример 1: a+(d*3) - истина
//Пример 2: [a+(1*3) - ложь
//Пример 3: [6+(3*3)] - истина
//Пример 4: {a}[+]{(d*3)} - истина
//Пример 5: <{a}+{(d*3)}> - истина
//Пример 6: {a+]}{(d*3)} - ложь

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class task02 {
    public static void main(String[] args) {
        System.out.println(correctRoundBrackets("(1-2(4+4)(2*3))"));
        System.out.println(correctBrackets("{[a+]}{(d*3)}"));
    }

    static boolean correctRoundBrackets(String str) { // проверяем только круглые скобки
        Stack<Character> stack = new Stack<>();
        char[] c = str.toCharArray();
        for (int i = 0; i < c.length; i++) {
            if (c[i] == '(') stack.push(c[i]);
            if (c[i] == ')') {
                if (stack.isEmpty() || stack.pop() != '(') return false;
            }
        }
        return stack.isEmpty(); //If stack is empty, it's OK (true)
    }

    static boolean correctBrackets(String str) { // проверяем только круглые скобки
        Map<Character,Character> characterMap = new HashMap<>();
        characterMap.put('{', '}');
        characterMap.put('(', ')');
        characterMap.put('[', ']');
        characterMap.put('<', '>');

        Stack<Character> stack = new Stack<>();
        char[] chars = str.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (characterMap.containsKey(chars[i])){
                stack.push(chars[i]);
            }
            if (characterMap.containsValue(chars[i])) {
                if (stack.isEmpty() || characterMap.get(stack.pop()) != chars[i]){
                    return false;
                }
            }
        }
        return stack.isEmpty(); //If stack is empty, it's OK (true)
    }
}