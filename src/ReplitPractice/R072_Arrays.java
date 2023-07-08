package ReplitPractice;

public class R072_Arrays {
    public static void main(String[] args) {
        /* Write a program that creates an array with the following values{s, a, y,  b, n, c, t,  d, a, e, x}
            Print the values so the output should look like below:   syntax      */
        char[] let = {'s', 'a', 'y', 'b', 'n', 'c', 't', 'd', 'a', 'e', 'x'};
        for (int i = 0; i < let.length; i += 2)
            System.out.print(let[i] + "");
    }
}

