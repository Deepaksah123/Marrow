package kotlin;

import android.content.ContentResolver;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;
import kotlin.fromUri;

/* JADX INFO: loaded from: classes2.dex */
public abstract class MediaItemAdsConfiguration<T> implements fromUri<T> {
    private T IconCompatParcelizer;
    private final ContentResolver read;
    private final Uri write;

    @Override // kotlin.fromUri
    public final void AudioAttributesCompatParcelizer() {
    }

    protected abstract T read(Uri uri, ContentResolver contentResolver) throws FileNotFoundException;

    protected abstract void write(T t) throws IOException;

    public MediaItemAdsConfiguration(ContentResolver contentResolver, Uri uri) {
        this.read = contentResolver;
        this.write = uri;
    }

    @Override // kotlin.fromUri
    public final void write(setSampleRate setsamplerate, fromUri.AudioAttributesCompatParcelizer<? super T> audioAttributesCompatParcelizer) {
        try {
            T t = read(this.write, this.read);
            this.IconCompatParcelizer = t;
            audioAttributesCompatParcelizer.write(t);
        } catch (FileNotFoundException e) {
            audioAttributesCompatParcelizer.IconCompatParcelizer(e);
        }
    }

    @Override // kotlin.fromUri
    public final void read() {
        T t = this.IconCompatParcelizer;
        if (t != null) {
            try {
                write(t);
            } catch (IOException unused) {
            }
        }
    }

    @Override // kotlin.fromUri
    public final onTracksChanged IconCompatParcelizer() {
        return onTracksChanged.LOCAL;
    }
}
