package kotlin;

import com.google.android.exoplayer2.extractor.mp4.Atom;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class verifyMustOverride implements findConstructor {
    private final AsPropertyTypeDeserializer read = new AsPropertyTypeDeserializer(4);
    private final isProxyType write = new isProxyType(-1, -1, "image/avif");

    @Override // kotlin.findConstructor
    public final void RemoteActionCompatParcelizer() {
    }

    @Override // kotlin.findConstructor
    public final boolean read(closeOnFailAndThrowAsIOE closeonfailandthrowasioe) throws IOException {
        closeonfailandthrowasioe.write(4);
        return read(closeonfailandthrowasioe, Atom.TYPE_ftyp) && read(closeonfailandthrowasioe, 1635150182);
    }

    @Override // kotlin.findConstructor
    public final void read(findRawSuperTypes findrawsupertypes) {
        this.write.read(findrawsupertypes);
    }

    @Override // kotlin.findConstructor
    public final int RemoteActionCompatParcelizer(closeOnFailAndThrowAsIOE closeonfailandthrowasioe, isJacksonStdImpl isjacksonstdimpl) throws IOException {
        return this.write.RemoteActionCompatParcelizer(closeonfailandthrowasioe, isjacksonstdimpl);
    }

    @Override // kotlin.findConstructor
    public final void write(long j, long j2) {
        this.write.write(j, j2);
    }

    private boolean read(closeOnFailAndThrowAsIOE closeonfailandthrowasioe, int i) throws IOException {
        this.read.write(4);
        closeonfailandthrowasioe.RemoteActionCompatParcelizer(this.read.RemoteActionCompatParcelizer(), 0, 4);
        return this.read.onMediaButtonEvent() == ((long) i);
    }
}
