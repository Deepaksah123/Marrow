package kotlin;

import android.net.Uri;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class _handleUnknownTypeId implements _hasTypeResolver {
    private final _hasTypeResolver RemoteActionCompatParcelizer;
    private long read;
    private Uri IconCompatParcelizer = Uri.EMPTY;
    private Map<String, List<String>> AudioAttributesCompatParcelizer = Collections.emptyMap();

    public _handleUnknownTypeId(_hasTypeResolver _hastyperesolver) {
        this.RemoteActionCompatParcelizer = (_hasTypeResolver) buildTypeSerializer.IconCompatParcelizer(_hastyperesolver);
    }

    public final void MediaBrowserCompatCustomActionResultReceiver() {
        this.read = 0L;
    }

    public final long write() {
        return this.read;
    }

    public final Uri RemoteActionCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final Map<String, List<String>> AudioAttributesImplApi26Parcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    @Override // kotlin._hasTypeResolver
    public final void read(TypeNameIdResolver typeNameIdResolver) {
        this.RemoteActionCompatParcelizer.read(typeNameIdResolver);
    }

    @Override // kotlin._hasTypeResolver
    public final long RemoteActionCompatParcelizer(SubTypeValidator subTypeValidator) throws IOException {
        this.IconCompatParcelizer = subTypeValidator.AudioAttributesImplBaseParcelizer;
        this.AudioAttributesCompatParcelizer = Collections.emptyMap();
        long jRemoteActionCompatParcelizer = this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(subTypeValidator);
        this.IconCompatParcelizer = (Uri) buildTypeSerializer.IconCompatParcelizer(IconCompatParcelizer());
        this.AudioAttributesCompatParcelizer = read();
        return jRemoteActionCompatParcelizer;
    }

    @Override // kotlin.JsonNullFormatVisitor
    public final int AudioAttributesCompatParcelizer(byte[] bArr, int i, int i2) throws IOException {
        int iAudioAttributesCompatParcelizer = this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(bArr, i, i2);
        if (iAudioAttributesCompatParcelizer != -1) {
            this.read += (long) iAudioAttributesCompatParcelizer;
        }
        return iAudioAttributesCompatParcelizer;
    }

    @Override // kotlin._hasTypeResolver
    public final Uri IconCompatParcelizer() {
        return this.RemoteActionCompatParcelizer.IconCompatParcelizer();
    }

    @Override // kotlin._hasTypeResolver
    public final Map<String, List<String>> read() {
        return this.RemoteActionCompatParcelizer.read();
    }

    @Override // kotlin._hasTypeResolver
    public final void AudioAttributesCompatParcelizer() throws IOException {
        this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer();
    }
}
