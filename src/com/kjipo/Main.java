package com.kjipo;


import com.kjipo.potrace.potracelib_h;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;

public class Main {

    public static void main(String[] args) {
//        System.loadLibrary("potrace");

        System.out.println(potracelib_h.potrace_version());

        var memorySegment = potracelib_h.potrace_version();

        System.out.println("Byte size: " + memorySegment.byteSize());

        var slicedSegment = memorySegment.asSlice(0, 10);

//        var chars = slicedSegment.toArray(ValueLayout.JAVA_CHAR);
//        var version = String.valueOf(chars);
//        System.out.println("Version: " + version);

//        var version2 = memorySegment.reinterpret(1).getString(0);
//        System.out.println("Version 2: " + version2);

        try (final Arena arena = Arena.ofConfined()) {
            final MemorySegment ptr = memorySegment.reinterpret(100, arena, null);
            System.out.println("Version 3: " + ptr.getString(0));
        }


//        try (var arena = Arena.ofConfined()) {
//            potracelib_h.potrace_version();
//        }
    }


}