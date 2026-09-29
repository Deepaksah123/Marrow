package kotlin;

import com.google.android.exoplayer2.util.MimeTypes;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class _constructUsingEnumNamingStrategy implements findConstructor {
    private final findConstructor AudioAttributesCompatParcelizer;

    public _constructUsingEnumNamingStrategy() {
        this(0);
    }

    public _constructUsingEnumNamingStrategy(int i) {
        if ((i & 1) != 0) {
            this.AudioAttributesCompatParcelizer = new isProxyType(65496, 2, MimeTypes.IMAGE_JPEG);
        } else {
            this.AudioAttributesCompatParcelizer = new _constructFor();
        }
    }

    @Override // kotlin.findConstructor
    public final boolean read(closeOnFailAndThrowAsIOE closeonfailandthrowasioe) throws IOException {
        return this.AudioAttributesCompatParcelizer.read(closeonfailandthrowasioe);
    }

    @Override // kotlin.findConstructor
    public final void read(findRawSuperTypes findrawsupertypes) {
        this.AudioAttributesCompatParcelizer.read(findrawsupertypes);
    }

    @Override // kotlin.findConstructor
    public final int RemoteActionCompatParcelizer(closeOnFailAndThrowAsIOE closeonfailandthrowasioe, isJacksonStdImpl isjacksonstdimpl) throws IOException {
        return this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(closeonfailandthrowasioe, isjacksonstdimpl);
    }

    @Override // kotlin.findConstructor
    public final void write(long j, long j2) {
        this.AudioAttributesCompatParcelizer.write(j, j2);
    }

    @Override // kotlin.findConstructor
    public final void RemoteActionCompatParcelizer() {
        this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer();
    }
}
