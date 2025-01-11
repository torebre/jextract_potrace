# Bindings to Potrace



## Changes done to Potrace build process
Mirror of Potrace-project on Github: https://github.com/skyrpex/potrace

Needed to change libpotrace_la_LDFLAGS in Makefile.in in the Potrace project to be get a so-file, 
which is what jextract seems to require.
```
libpotrace_la_LDFLAGS = -version-info 0:6:0 -rpath '$(libdir)' \
 -export-symbols $(srcdir)/libpotrace-export.sym -no-undefined -module -shared
```

Configure needs to be run with *--with-libpotrace* to create the library.


## Building jextract

```
sh ./gradlew -Pjdk22_home=/home/student/.sdkman/candidates/java/22.0.1-open/ \
-Pllvm_home=/usr/lib/llvm-18/ \
clean verify
```

Creating bindings to Potrace
```
./build/jextract/bin/jextract \
--output ./potrace_extract \
--target-package com.kjipo.potrace \
--library :/usr/local/lib/libpotrace.so.0.0.6 \
/home/student/data/potrace/src/potracelib.h
```

## Links

Documentation for Potrace Library API: https://potrace.sourceforge.net/potracelib.pdf
