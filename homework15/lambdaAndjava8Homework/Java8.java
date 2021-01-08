package endTermHomeWork.homework15.lambdaAndjava8Homework;

class Java8Test {
    public static void main(String args[]){

        Java8Test tester = new Java8Test();

        // ��������
        MathOperation addition = (int a, int b) -> a + b;

        // ������������
        MathOperation subtraction = (a, b) -> a - b;

        // �������еķ������
        MathOperation multiplication = (int a, int b) -> { return a * b; };

        // û�д����ż��������
        MathOperation division = (int a, int b) -> a / b;

        System.out.println("10 + 5 = " + tester.operate(10, 5, addition));
        System.out.println("10 - 5 = " + tester.operate(10, 5, subtraction));
        System.out.println("10 x 5 = " + tester.operate(10, 5, multiplication));
        System.out.println("10 / 5 = " + tester.operate(10, 5, division));

        // ��������
        GreetingService greetService1 = message ->
                System.out.println("Hello " + message);

        // ������
        GreetingService greetService2 = (message) ->
                System.out.println("Hello " + message);

        greetService1.sayMessage("Runoob");
        greetService2.sayMessage("Google");
    }

    interface MathOperation {
        int operation(int a, int b);
    }

    interface GreetingService {
        void sayMessage(String message);
    }

    private int operate(int a, int b, MathOperation mathOperation){
        return mathOperation.operation(a, b);
    }
}
