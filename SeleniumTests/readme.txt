Seleniuum doesn't work well with module-info.java.
This file introduces a class path and a module path to the build.
If you add all the jars to the  class path, there are compile-time errors.
If you add all the jars to the module path, there are run-time errors.
