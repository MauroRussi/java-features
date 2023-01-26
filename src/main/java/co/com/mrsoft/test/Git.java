package co.com.mrsoft.test;

interface Commit {
    Commit parent();
}
/*
    a - b - c - d - e - f
              - h - i - j - ... - z

    getCommonParent(z, e) = c
*/
public class Git {
    public static Commit getCommonParent(Commit a, Commit b) {
        while(true) {
            Commit ap = a.parent();
            Commit bp = b.parent();

            if(ap == bp) {
                return ap;
            }

            a = ap;
            b = bp;
        }
    }
}
