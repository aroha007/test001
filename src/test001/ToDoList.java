package test001;

public class ToDoList {
    public static void main(String[] args) {
        // 1. 변수 및 배열 선언
    	
        String listTitle = "오늘의 할 일 (To-Do)";
        String[] todos = {"설거지하기", "저녁 식사 하기", "샤워하기"};
        
        System.out.println("=== " + listTitle + " ===");
        
        // 2. 반복문(for)과 조건문(if) 활용
        
        for (int i = 0; i < todos.length; i++) {
            if (i == 0) {
                System.out.println((i + 1) + ". [우선순위] " + todos[i]);
            } else {
                System.out.println((i + 1) + ". [일반] " + todos[i]);
            }
        }
    }
}
