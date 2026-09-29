package kotlin;

import android.content.res.AssetManager;
import java.io.IOException;
import kotlin.fromUri;

/* JADX INFO: loaded from: classes2.dex */
public abstract class LivePlaybackSpeedControl<T> implements fromUri<T> {
    private T AudioAttributesCompatParcelizer;
    private final String IconCompatParcelizer;
    private final AssetManager write;

    @Override // kotlin.fromUri
    public final void AudioAttributesCompatParcelizer() {
    }

    protected abstract T read(AssetManager assetManager, String str) throws IOException;

    protected abstract void read(T t) throws IOException;

    public LivePlaybackSpeedControl(AssetManager assetManager, String str) {
        this.write = assetManager;
        this.IconCompatParcelizer = str;
    }

    @Override // kotlin.fromUri
    public final void write(setSampleRate setsamplerate, fromUri.AudioAttributesCompatParcelizer<? super T> audioAttributesCompatParcelizer) {
        try {
            T t = read(this.write, this.IconCompatParcelizer);
            this.AudioAttributesCompatParcelizer = t;
            audioAttributesCompatParcelizer.write(t);
        } catch (IOException e) {
            audioAttributesCompatParcelizer.IconCompatParcelizer(e);
        }
    }

    @Override // kotlin.fromUri
    public final void read() {
        T t = this.AudioAttributesCompatParcelizer;
        if (t != null) {
            try {
                read(t);
            } catch (IOException unused) {
            }
        }
    }

    @Override // kotlin.fromUri
    public final onTracksChanged IconCompatParcelizer() {
        return onTracksChanged.LOCAL;
    }
}
