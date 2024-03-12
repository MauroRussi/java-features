// Module declaration
module co.com.mrsoft.test.java9.module {
    /*
     * Dependent modules - We can declare runtime and a compile-time dependencies of other modules in the module.
     * All public types exported from a dependency are accessible by our module.
     */
    requires java.sql;
    requires java.desktop;
    requires java.net.http;

    /*
     * Optional modules - We can declare optional dependencies that users of our library will never want to use.
     */
    requires static java.logging;

    /*
     * Transitive modules - It implies that a client of this module can access the transitive modules. For example:
     * If "bar" requires transitive "drink" and "customer" requires "bar", then "customer" can read "drink" even though
     * it doesn't explicitly depend on it.
     */
    requires transitive java.sql.rowset;

    /*
     * Export Public Members - By default, no public class of a package of a module is exposed to outside world.
     * It exposes all public members of the named package.
     */
    exports co.com.mrsoft.test.java9.module;

    /*
     * Allow Reflection of Private Members - The opens directive allows reflection of private types of the specific package.
     * The open directive can also be used at module declaration level allowing all packages within the module.
     */
    opens co.com.mrsoft.test.java9.module;
}