package kotlin;

import com.google.android.exoplayer2.util.MimeTypes;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class LinkedDeque1 implements findConstructor {
    private final AsPropertyTypeDeserializer AudioAttributesCompatParcelizer = new AsPropertyTypeDeserializer(4);
    private final isProxyType IconCompatParcelizer = new isProxyType(-1, -1, MimeTypes.IMAGE_WEBP);

    @Override // kotlin.findConstructor
    public final void RemoteActionCompatParcelizer() {
    }

    @Override // kotlin.findConstructor
    public final boolean read(closeOnFailAndThrowAsIOE closeonfailandthrowasioe) throws IOException {
        this.AudioAttributesCompatParcelizer.write(4);
        closeonfailandthrowasioe.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(), 0, 4);
        if (this.AudioAttributesCompatParcelizer.onMediaButtonEvent() != 1380533830) {
            return false;
        }
        closeonfailandthrowasioe.write(4);
        this.AudioAttributesCompatParcelizer.write(4);
        closeonfailandthrowasioe.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(), 0, 4);
        return this.AudioAttributesCompatParcelizer.onMediaButtonEvent() == 1464156752;
    }

    @Override // kotlin.findConstructor
    public final void read(findRawSuperTypes findrawsupertypes) {
        this.IconCompatParcelizer.read(findrawsupertypes);
    }

    @Override // kotlin.findConstructor
    public final int RemoteActionCompatParcelizer(closeOnFailAndThrowAsIOE closeonfailandthrowasioe, isJacksonStdImpl isjacksonstdimpl) throws IOException {
        return this.IconCompatParcelizer.RemoteActionCompatParcelizer(closeonfailandthrowasioe, isjacksonstdimpl);
    }

    @Override // kotlin.findConstructor
    public final void write(long j, long j2) {
        this.IconCompatParcelizer.write(j, j2);
    }
}
