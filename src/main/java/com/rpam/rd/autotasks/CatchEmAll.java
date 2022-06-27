package com.rpam.rd.autotasks;

import java.io.FileNotFoundException;

import java.io.IOException;

public class CatchEmAll {


    static Exception exception = new FileNotFoundException("nfn");

    public static void riskyMethod() throws Exception {
        throw exception;
    }

    public static void main(String[] args) throws Exception {
        try {
            riskyMethod();
        }
        catch (FileNotFoundException ex) {
            throw new IllegalArgumentException("Resource is missing", ex);
        }
        catch (IOException ex) {
            throw new IllegalArgumentException("Resource error", ex);
        }
        catch (NumberFormatException | ArithmeticException ex) {
            System.err.println(ex.getMessage());
        }

    }
}