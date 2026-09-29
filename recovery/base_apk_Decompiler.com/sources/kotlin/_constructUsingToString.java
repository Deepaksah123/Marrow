package kotlin;

import com.google.android.exoplayer2.extractor.mp4.Atom;
import com.google.android.exoplayer2.extractor.mp4.Sniffer;
import com.google.android.exoplayer2.util.MimeTypes;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class _constructUsingToString implements findConstructor {
    private final AsPropertyTypeDeserializer read = new AsPropertyTypeDeserializer(4);
    private final isProxyType RemoteActionCompatParcelizer = new isProxyType(-1, -1, MimeTypes.IMAGE_HEIF);

    @Override // kotlin.findConstructor
    public final void RemoteActionCompatParcelizer() {
    }

    @Override // kotlin.findConstructor
    public final boolean read(closeOnFailAndThrowAsIOE closeonfailandthrowasioe) throws IOException {
        closeonfailandthrowasioe.write(4);
        return read(closeonfailandthrowasioe, Atom.TYPE_ftyp) && read(closeonfailandthrowasioe, Sniffer.BRAND_HEIC);
    }

    @Override // kotlin.findConstructor
    public final void read(findRawSuperTypes findrawsupertypes) {
        this.RemoteActionCompatParcelizer.read(findrawsupertypes);
    }

    @Override // kotlin.findConstructor
    public final int RemoteActionCompatParcelizer(closeOnFailAndThrowAsIOE closeonfailandthrowasioe, isJacksonStdImpl isjacksonstdimpl) throws IOException {
        return this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(closeonfailandthrowasioe, isjacksonstdimpl);
    }

    @Override // kotlin.findConstructor
    public final void write(long j, long j2) {
        this.RemoteActionCompatParcelizer.write(j, j2);
    }

    private boolean read(closeOnFailAndThrowAsIOE closeonfailandthrowasioe, int i) throws IOException {
        this.read.write(4);
        closeonfailandthrowasioe.RemoteActionCompatParcelizer(this.read.RemoteActionCompatParcelizer(), 0, 4);
        return this.read.onMediaButtonEvent() == ((long) i);
    }
}
