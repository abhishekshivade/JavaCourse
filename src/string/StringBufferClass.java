package string;
/**
 *
 *
 *  String Buffer -
 *      - Mutable class (can modify)
 *      - Thread safe (only one thread can access at a time)
 *      - All Methods of String buffer class are synchronised
 *        (one time only one thread can use method)
 *
 *  Difference in String and String Buffer
 *      * String                * String Buffer
 *      1. Immutable            1. Mutable
 *      2. Uses SPC             2. Heap Memory
 *      3. Unsafe               3. Thread Safe  //verify it
 *      4. Slow                 4. Fast
 *
 * String Builder -
 *      - All Methods of String buffer class are synchronised
 *        (one time only one thread can use method)
 *
 *      *String Builder                 *String Buffer
 *      1. Mutable                      1. Mutable
 *      2. Methods are                  2. Methods are
 *         non-synchronised                Synchronised
 *      3. Efficient                    3. Inefficient
 *      4. Thread Unsafe                4. Thread Safe
 *      5. Fast                         5. Slow
 *      6. available from 1.5 version   6. 1.0 version
 *
 *  Can we create custom immutable class?
 *  Yes, steps are -
 *  1. Class should be final
 *      (can't override and overwrite methods)
 *      (Can't extend the class)
 *  2. All data member must be final
 *  3. Parameterised constructor
 *  4. Should have only getter methods
 *
 * */
public class StringBufferClass {
// StringBuffer
// StringBuilder
}
