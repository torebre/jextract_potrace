// Generated by jextract

package com.kjipo.potrace;

import java.lang.invoke.*;
import java.lang.foreign.*;
import java.nio.ByteOrder;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

import static java.lang.foreign.ValueLayout.*;
import static java.lang.foreign.MemoryLayout.PathElement.*;

/**
 * {@snippet lang=c :
 * struct potrace_progress_s {
 *     void (*callback)(double, void *);
 *     void *data;
 *     double min;
 *     double max;
 *     double epsilon;
 * }
 * }
 */
public class potrace_progress_s {

    potrace_progress_s() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        potracelib_h.C_POINTER.withName("callback"),
        potracelib_h.C_POINTER.withName("data"),
        potracelib_h.C_DOUBLE.withName("min"),
        potracelib_h.C_DOUBLE.withName("max"),
        potracelib_h.C_DOUBLE.withName("epsilon")
    ).withName("potrace_progress_s");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    /**
     * {@snippet lang=c :
     * void (*callback)(double, void *)
     * }
     */
    public class callback {

        /**
         * The function pointer signature, expressed as a functional interface
         */
        public interface Function {
            void apply(double _x0, MemorySegment _x1);
        }

        private static final FunctionDescriptor $DESC = FunctionDescriptor.ofVoid(
            potracelib_h.C_DOUBLE,
            potracelib_h.C_POINTER
        );

        /**
         * The descriptor of this function pointer
         */
        public static FunctionDescriptor descriptor() {
            return $DESC;
        }

        private static final MethodHandle UP$MH = potracelib_h.upcallHandle(Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(Function fi, Arena arena) {
            return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
        }

        private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

        /**
         * Invoke the upcall stub {@code funcPtr}, with given parameters
         */
        public static void invoke(MemorySegment funcPtr,double _x0, MemorySegment _x1) {
            try {
                 DOWN$MH.invokeExact(funcPtr, _x0, _x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        }
    }

    private static final AddressLayout callback$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("callback"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * void (*callback)(double, void *)
     * }
     */
    public static final AddressLayout callback$layout() {
        return callback$LAYOUT;
    }

    private static final long callback$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * void (*callback)(double, void *)
     * }
     */
    public static final long callback$offset() {
        return callback$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * void (*callback)(double, void *)
     * }
     */
    public static MemorySegment callback(MemorySegment struct) {
        return struct.get(callback$LAYOUT, callback$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * void (*callback)(double, void *)
     * }
     */
    public static void callback(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(callback$LAYOUT, callback$OFFSET, fieldValue);
    }

    private static final AddressLayout data$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("data"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * void *data
     * }
     */
    public static final AddressLayout data$layout() {
        return data$LAYOUT;
    }

    private static final long data$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * void *data
     * }
     */
    public static final long data$offset() {
        return data$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * void *data
     * }
     */
    public static MemorySegment data(MemorySegment struct) {
        return struct.get(data$LAYOUT, data$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * void *data
     * }
     */
    public static void data(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(data$LAYOUT, data$OFFSET, fieldValue);
    }

    private static final OfDouble min$LAYOUT = (OfDouble)$LAYOUT.select(groupElement("min"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * double min
     * }
     */
    public static final OfDouble min$layout() {
        return min$LAYOUT;
    }

    private static final long min$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * double min
     * }
     */
    public static final long min$offset() {
        return min$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * double min
     * }
     */
    public static double min(MemorySegment struct) {
        return struct.get(min$LAYOUT, min$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * double min
     * }
     */
    public static void min(MemorySegment struct, double fieldValue) {
        struct.set(min$LAYOUT, min$OFFSET, fieldValue);
    }

    private static final OfDouble max$LAYOUT = (OfDouble)$LAYOUT.select(groupElement("max"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * double max
     * }
     */
    public static final OfDouble max$layout() {
        return max$LAYOUT;
    }

    private static final long max$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * double max
     * }
     */
    public static final long max$offset() {
        return max$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * double max
     * }
     */
    public static double max(MemorySegment struct) {
        return struct.get(max$LAYOUT, max$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * double max
     * }
     */
    public static void max(MemorySegment struct, double fieldValue) {
        struct.set(max$LAYOUT, max$OFFSET, fieldValue);
    }

    private static final OfDouble epsilon$LAYOUT = (OfDouble)$LAYOUT.select(groupElement("epsilon"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * double epsilon
     * }
     */
    public static final OfDouble epsilon$layout() {
        return epsilon$LAYOUT;
    }

    private static final long epsilon$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * double epsilon
     * }
     */
    public static final long epsilon$offset() {
        return epsilon$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * double epsilon
     * }
     */
    public static double epsilon(MemorySegment struct) {
        return struct.get(epsilon$LAYOUT, epsilon$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * double epsilon
     * }
     */
    public static void epsilon(MemorySegment struct, double fieldValue) {
        struct.set(epsilon$LAYOUT, epsilon$OFFSET, fieldValue);
    }

    /**
     * Obtains a slice of {@code arrayParam} which selects the array element at {@code index}.
     * The returned segment has address {@code arrayParam.address() + index * layout().byteSize()}
     */
    public static MemorySegment asSlice(MemorySegment array, long index) {
        return array.asSlice(layout().byteSize() * index);
    }

    /**
     * The size (in bytes) of this struct
     */
    public static long sizeof() { return layout().byteSize(); }

    /**
     * Allocate a segment of size {@code layout().byteSize()} using {@code allocator}
     */
    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate(layout());
    }

    /**
     * Allocate an array of size {@code elementCount} using {@code allocator}.
     * The returned segment has size {@code elementCount * layout().byteSize()}.
     */
    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(elementCount, layout()));
    }

    /**
     * Reinterprets {@code addr} using target {@code arena} and {@code cleanupAction) (if any).
     * The returned segment has size {@code layout().byteSize()}
     */
    public static MemorySegment reinterpret(MemorySegment addr, Arena arena, Consumer<MemorySegment> cleanup) {
        return reinterpret(addr, 1, arena, cleanup);
    }

    /**
     * Reinterprets {@code addr} using target {@code arena} and {@code cleanupAction) (if any).
     * The returned segment has size {@code elementCount * layout().byteSize()}
     */
    public static MemorySegment reinterpret(MemorySegment addr, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr.reinterpret(layout().byteSize() * elementCount, arena, cleanup);
    }
}

