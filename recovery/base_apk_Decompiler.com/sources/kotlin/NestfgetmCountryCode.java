package kotlin;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes4.dex */
final /* synthetic */ class NestfgetmCountryCode {
    public static final EducationalDegree IconCompatParcelizer(int i, final String str) {
        final AtomicInteger atomicInteger = new AtomicInteger();
        final int i2 = 1;
        return getDegree.AudioAttributesCompatParcelizer(Executors.newScheduledThreadPool(1, new ThreadFactory() { // from class: o.NotesDispatchAddressRequestKt
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return NestfgetmCountryCode.IconCompatParcelizer(i2, str, atomicInteger, runnable);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Thread IconCompatParcelizer(int i, String str, AtomicInteger atomicInteger, Runnable runnable) {
        if (i != 1) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append('-');
            sb.append(atomicInteger.incrementAndGet());
            str = sb.toString();
        }
        Thread thread = new Thread(runnable, str);
        thread.setDaemon(true);
        return thread;
    }
}
