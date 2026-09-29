package kotlin;

import android.preference.PreferenceManager;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes.dex */
final class lambdaonTracksChanged31 {
    private static String IconCompatParcelizer;
    private static ReentrantReadWriteLock read = new ReentrantReadWriteLock();
    private static volatile boolean write = false;

    lambdaonTracksChanged31() {
    }

    public static void write() {
        if (write) {
            return;
        }
        lambdaonVideoFrameProcessingOffset20.AudioAttributesCompatParcelizer().execute(new Runnable() { // from class: o.lambdaonTracksChanged31.5
            @Override // java.lang.Runnable
            public final void run() {
                if (getMinWindowSequenceNumber.IconCompatParcelizer(this)) {
                    return;
                }
                try {
                    lambdaonTracksChanged31.IconCompatParcelizer();
                } catch (Throwable th) {
                    getMinWindowSequenceNumber.read(th, this);
                }
            }
        });
    }

    public static String AudioAttributesCompatParcelizer() {
        if (!write) {
            IconCompatParcelizer();
        }
        read.readLock().lock();
        try {
            return IconCompatParcelizer;
        } finally {
            read.readLock().unlock();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void IconCompatParcelizer() {
        if (write) {
            return;
        }
        read.writeLock().lock();
        try {
            if (!write) {
                IconCompatParcelizer = PreferenceManager.getDefaultSharedPreferences(lambdaonMediaMetadataChanged48.AudioAttributesCompatParcelizer()).getString("com.facebook.appevents.AnalyticsUserIDStore.userID", null);
                write = true;
            }
        } finally {
            read.writeLock().unlock();
        }
    }
}
