package kotlin;

import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class DvbSubtitleReader {
    private static DvbSubtitleReader RemoteActionCompatParcelizer = new DvbSubtitleReader("FirebaseCrashlytics");
    private int IconCompatParcelizer = 4;
    private final String read;

    private DvbSubtitleReader(String str) {
        this.read = str;
    }

    public static DvbSubtitleReader read() {
        return RemoteActionCompatParcelizer;
    }

    private boolean AudioAttributesCompatParcelizer(int i) {
        return this.IconCompatParcelizer <= i || Log.isLoggable(this.read, i);
    }

    public final void AudioAttributesCompatParcelizer() {
        AudioAttributesCompatParcelizer(3);
    }

    private void MediaBrowserCompatCustomActionResultReceiver() {
        AudioAttributesCompatParcelizer(2);
    }

    private void IconCompatParcelizer() {
        AudioAttributesCompatParcelizer(4);
    }

    public final void RemoteActionCompatParcelizer() {
        AudioAttributesCompatParcelizer(5);
    }

    public final void write() {
        AudioAttributesCompatParcelizer(6);
    }

    public final void IconCompatParcelizer(String str) {
        AudioAttributesCompatParcelizer();
    }

    public final void AudioAttributesCompatParcelizer(String str) {
        MediaBrowserCompatCustomActionResultReceiver();
    }

    public final void write(String str) {
        IconCompatParcelizer();
    }

    public final void read(String str) {
        RemoteActionCompatParcelizer();
    }

    public final void RemoteActionCompatParcelizer(String str) {
        write();
    }
}
