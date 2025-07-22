public class Main {
    public static void main(String[] args) {
        BrowserHistory obj = new BrowserHistory("leetcode.com");
        obj.visit("google.com");
        String param_2 = obj.back(1);
        String param_3 = obj.forward(2);
    }
}

