package kotlin;

import android.graphics.Typeface;

/* JADX INFO: loaded from: classes3.dex */
public final class SeekMapUnseekable extends SeekMapSeekPoints {
    private final Typeface IconCompatParcelizer;
    private boolean RemoteActionCompatParcelizer;
    private final AudioAttributesCompatParcelizer read;

    public interface AudioAttributesCompatParcelizer {
        void RemoteActionCompatParcelizer(Typeface typeface);
    }

    public SeekMapUnseekable(AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, Typeface typeface) {
        this.IconCompatParcelizer = typeface;
        this.read = audioAttributesCompatParcelizer;
    }

    @Override // kotlin.SeekMapSeekPoints
    public final void RemoteActionCompatParcelizer(Typeface typeface, boolean z) {
        read(typeface);
    }

    @Override // kotlin.SeekMapSeekPoints
    public final void AudioAttributesCompatParcelizer(int i) {
        read(this.IconCompatParcelizer);
    }

    public final void read() {
        this.RemoteActionCompatParcelizer = true;
    }

    private void read(Typeface typeface) {
        if (this.RemoteActionCompatParcelizer) {
            return;
        }
        this.read.RemoteActionCompatParcelizer(typeface);
    }
}
