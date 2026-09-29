package kotlin;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public enum getCreatedOn implements SchemaLessonStatus {
    CANCELLED;

    @Override // kotlin.SchemaLessonStatus
    public final void AudioAttributesCompatParcelizer() {
    }

    @Override // kotlin.SchemaLessonStatus
    public final void write(long j) {
    }

    public static boolean AudioAttributesCompatParcelizer(SchemaLessonStatus schemaLessonStatus, SchemaLessonStatus schemaLessonStatus2) {
        if (schemaLessonStatus2 == null) {
            getPaymentRefIds.RemoteActionCompatParcelizer(new NullPointerException("next is null"));
            return false;
        }
        if (schemaLessonStatus == null) {
            return true;
        }
        schemaLessonStatus2.AudioAttributesCompatParcelizer();
        IconCompatParcelizer();
        return false;
    }

    private static void IconCompatParcelizer() {
        getPaymentRefIds.RemoteActionCompatParcelizer(new getTagExpiryMs("Subscription already set!"));
    }

    public static boolean AudioAttributesCompatParcelizer(long j) {
        if (j > 0) {
            return true;
        }
        getPaymentRefIds.RemoteActionCompatParcelizer(new IllegalArgumentException("n > 0 required but it was ".concat(String.valueOf(j))));
        return false;
    }

    public static boolean write(AtomicReference<SchemaLessonStatus> atomicReference, SchemaLessonStatus schemaLessonStatus) {
        setHasPyt.AudioAttributesCompatParcelizer(schemaLessonStatus, "s is null");
        if (setBackInvokedCallbackEnabled.read(atomicReference, null, schemaLessonStatus)) {
            return true;
        }
        schemaLessonStatus.AudioAttributesCompatParcelizer();
        if (atomicReference.get() == CANCELLED) {
            return false;
        }
        IconCompatParcelizer();
        return false;
    }

    public static boolean AudioAttributesCompatParcelizer(AtomicReference<SchemaLessonStatus> atomicReference) {
        SchemaLessonStatus andSet;
        SchemaLessonStatus schemaLessonStatus = atomicReference.get();
        getCreatedOn getcreatedon = CANCELLED;
        if (schemaLessonStatus == getcreatedon || (andSet = atomicReference.getAndSet(getcreatedon)) == getcreatedon) {
            return false;
        }
        if (andSet == null) {
            return true;
        }
        andSet.AudioAttributesCompatParcelizer();
        return true;
    }

    public static boolean AudioAttributesCompatParcelizer(AtomicReference<SchemaLessonStatus> atomicReference, AtomicLong atomicLong, SchemaLessonStatus schemaLessonStatus) {
        if (!write(atomicReference, schemaLessonStatus)) {
            return false;
        }
        long andSet = atomicLong.getAndSet(0L);
        if (andSet == 0) {
            return true;
        }
        schemaLessonStatus.write(andSet);
        return true;
    }

    public static void AudioAttributesCompatParcelizer(AtomicReference<SchemaLessonStatus> atomicReference, AtomicLong atomicLong, long j) {
        SchemaLessonStatus schemaLessonStatus = atomicReference.get();
        if (schemaLessonStatus != null) {
            schemaLessonStatus.write(j);
            return;
        }
        if (AudioAttributesCompatParcelizer(j)) {
            getAccessLevel.RemoteActionCompatParcelizer(atomicLong, j);
            SchemaLessonStatus schemaLessonStatus2 = atomicReference.get();
            if (schemaLessonStatus2 != null) {
                long andSet = atomicLong.getAndSet(0L);
                if (andSet != 0) {
                    schemaLessonStatus2.write(andSet);
                }
            }
        }
    }

    public static boolean IconCompatParcelizer(AtomicReference<SchemaLessonStatus> atomicReference, SchemaLessonStatus schemaLessonStatus, long j) {
        if (!write(atomicReference, schemaLessonStatus)) {
            return false;
        }
        schemaLessonStatus.write(j);
        return true;
    }
}
