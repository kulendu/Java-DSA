package com.bishal;

import java.util.Arrays;

public class VarArgs {
    /*
        VarArg = Passing variable arguments, when the
        argument count is unknown
    */
    public static void main(String[] args) {
        varargs(12,12,34,89,74);
    }

    static void varargs(int ...a) {
        /*
            This '...a' takes 'n' no. of arguments and stores
            in an array. If using multiple args, it must
            come at the end
        */
        System.out.println(Arrays.toString(a));
    }
}
