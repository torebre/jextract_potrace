package com.kjipo;


import com.kjipo.potrace.*;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;

public class RunPotraceOnImage {



    public void runOnImage() {

        try(Arena arena = Arena.ofConfined()) {
            MemorySegment bitmapStruct = potrace_bitmap_s.allocate(arena);

            System.out.println("Test23: " +potracelib_h.potrace_word);

            System.out.println(potracelib_h.potrace_word.byteSize());

//            potracelib_h.potrace_word.byteAlignment()

            potrace_bitmap_s.h(bitmapStruct, 10);
            potrace_bitmap_s.w(bitmapStruct, 10);
            potrace_bitmap_s.dy(bitmapStruct, 2);

            MemorySegment bitmapData = arena.allocateFrom(potracelib_h.potrace_word, 1, 1, 1);
//            potrace_bitmap_s.map(bitmapStruct);



//            potrace_bitmap_s.dy(bitmapStruct, );


            MemorySegment potraceParams = potrace_param_s.allocate(arena);
            potrace_param_s.turdsize(potraceParams, 2);
            potrace_param_s.turnpolicy(potraceParams, potracelib_h.POTRACE_TURNPOLICY_BLACK());
            potrace_param_s.alphamax(potraceParams, 1.0);
            potrace_param_s.opticurve(potraceParams, 1);


            // TODO

            MemorySegment result = potracelib_h.potrace_trace(bitmapData, potraceParams);

            MemorySegment traceList = potrace_state_s.plist(result);
//            var area = potrace_path_s.area(traceList);
//            System.out.println("Test31: " +area);


            int resultStatus = potrace_state_s.status(result);

            System.out.println("Test30: " +resultStatus);





        }


    }


    public static void main(String[] args) {
        RunPotraceOnImage runPotraceOnImage = new RunPotraceOnImage();
        runPotraceOnImage.runOnImage();
    }





}
