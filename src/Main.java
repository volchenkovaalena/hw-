public class Main {
    public static void main(String[] args) {

        var q = 12;
        var w = 27;
        var e = 44;
        var r = 15;
        var t = 9;
        var result = q*(w+(e-r*t));
        System.out.println(result);
        result = result - result*2;
        System.out.println(result);

        var a = 5;
        var b = 7;
        a = b - a;
        b = b - a;
        a = a + b;
        System.out.println(a);
        System.out.println(b);

        var c = 278;
        var u = c / 10 % 10 ;
        System.out.println(u);
    }
}
