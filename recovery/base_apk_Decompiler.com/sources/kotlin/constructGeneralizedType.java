package kotlin;

import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
import kotlin.SubTypeValidator;
import kotlin.constructCollectionType;

/* JADX INFO: loaded from: classes2.dex */
public final class constructGeneralizedType<T> implements constructCollectionType.AudioAttributesCompatParcelizer {
    private final IconCompatParcelizer<? extends T> AudioAttributesCompatParcelizer;
    private final _handleUnknownTypeId IconCompatParcelizer;
    private volatile T MediaBrowserCompatItemReceiver;
    public final long RemoteActionCompatParcelizer;
    public final int read;
    public final SubTypeValidator write;

    public interface IconCompatParcelizer<T> {
        T RemoteActionCompatParcelizer(Uri uri, InputStream inputStream) throws IOException;
    }

    @Override // o.constructCollectionType.AudioAttributesCompatParcelizer
    public final void B_() {
    }

    public constructGeneralizedType(_hasTypeResolver _hastyperesolver, Uri uri, int i, IconCompatParcelizer<? extends T> iconCompatParcelizer) {
        this(_hastyperesolver, new SubTypeValidator.write().IconCompatParcelizer(uri).read(1).write(), i, iconCompatParcelizer);
    }

    private constructGeneralizedType(_hasTypeResolver _hastyperesolver, SubTypeValidator subTypeValidator, int i, IconCompatParcelizer<? extends T> iconCompatParcelizer) {
        this.IconCompatParcelizer = new _handleUnknownTypeId(_hastyperesolver);
        this.write = subTypeValidator;
        this.read = i;
        this.AudioAttributesCompatParcelizer = iconCompatParcelizer;
        this.RemoteActionCompatParcelizer = StdDelegatingSerializer.AudioAttributesCompatParcelizer();
    }

    public final T RemoteActionCompatParcelizer() {
        return this.MediaBrowserCompatItemReceiver;
    }

    public final long write() {
        return this.IconCompatParcelizer.write();
    }

    public final Uri MediaBrowserCompatCustomActionResultReceiver() {
        return this.IconCompatParcelizer.RemoteActionCompatParcelizer();
    }

    public final Map<String, List<String>> read() {
        return this.IconCompatParcelizer.AudioAttributesImplApi26Parcelizer();
    }

    @Override // o.constructCollectionType.AudioAttributesCompatParcelizer
    public final void AudioAttributesCompatParcelizer() throws IOException {
        this.IconCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver();
        verifyBaseTypeValidity verifybasetypevalidity = new verifyBaseTypeValidity(this.IconCompatParcelizer, this.write);
        try {
            verifybasetypevalidity.IconCompatParcelizer();
            this.MediaBrowserCompatItemReceiver = this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer((Uri) buildTypeSerializer.IconCompatParcelizer(this.IconCompatParcelizer.IconCompatParcelizer()), verifybasetypevalidity);
        } finally {
            LaissezFaireSubTypeValidator.AudioAttributesCompatParcelizer(verifybasetypevalidity);
        }
    }
}
