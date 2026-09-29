package kotlin;

import java.lang.Thread;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
final class H265ReaderSampleReader implements Thread.UncaughtExceptionHandler {
    private final AtomicBoolean AudioAttributesCompatParcelizer = new AtomicBoolean(false);
    private final DefaultTsPayloadReaderFactoryFlags IconCompatParcelizer;
    private final write RemoteActionCompatParcelizer;
    private final Thread.UncaughtExceptionHandler read;
    private final readFormat write;

    interface write {
        void write(readFormat readformat, Thread thread, Throwable th);
    }

    public H265ReaderSampleReader(write writeVar, readFormat readformat, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, DefaultTsPayloadReaderFactoryFlags defaultTsPayloadReaderFactoryFlags) {
        this.RemoteActionCompatParcelizer = writeVar;
        this.write = readformat;
        this.read = uncaughtExceptionHandler;
        this.IconCompatParcelizer = defaultTsPayloadReaderFactoryFlags;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Thread$UncaughtExceptionHandler] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.concurrent.atomic.AtomicBoolean] */
    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        String str = "Completed exception processing. Invoking default exception handler.";
        this.AudioAttributesCompatParcelizer.set(true);
        try {
            try {
                if (IconCompatParcelizer(thread, th)) {
                    this.RemoteActionCompatParcelizer.write(this.write, thread, th);
                } else {
                    DvbSubtitleReader.read().IconCompatParcelizer("Uncaught exception will not be recorded by Crashlytics.");
                }
            } catch (Exception unused) {
                DvbSubtitleReader.read().write();
            }
        } finally {
            DvbSubtitleReader.read().IconCompatParcelizer(str);
            this.read.uncaughtException(thread, th);
            this.AudioAttributesCompatParcelizer.set(false);
        }
    }

    final boolean AudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer.get();
    }

    private boolean IconCompatParcelizer(Thread thread, Throwable th) {
        if (thread == null) {
            DvbSubtitleReader.read().RemoteActionCompatParcelizer("Crashlytics will not record uncaught exception; null thread");
            return false;
        }
        if (th == null) {
            DvbSubtitleReader.read().RemoteActionCompatParcelizer("Crashlytics will not record uncaught exception; null throwable");
            return false;
        }
        if (!this.IconCompatParcelizer.RemoteActionCompatParcelizer()) {
            return true;
        }
        DvbSubtitleReader.read().IconCompatParcelizer("Crashlytics will not record uncaught exception; native crash exists for session.");
        return false;
    }
}
