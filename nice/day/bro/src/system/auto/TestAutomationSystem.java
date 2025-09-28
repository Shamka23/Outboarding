package system.auto;

public class TestAutomationSystem {
    public static void main(String[] args) {
        TestScenario[] tests = new TestScenario[3];
        tests[0] = new LoginTest();
        tests[1] = new PaymentTest();
        tests[2] = new ProductSearchTest();

        for(TestScenario element: tests){
            element.runTest();
        }
    }
}
