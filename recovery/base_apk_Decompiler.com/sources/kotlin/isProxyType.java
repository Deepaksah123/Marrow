package kotlin;

import java.io.IOException;
import kotlin.C0170format;

/* JADX INFO: loaded from: classes2.dex */
public final class isProxyType implements findConstructor {
    private findRawSuperTypes AudioAttributesCompatParcelizer;
    private nonNullString AudioAttributesImplApi21Parcelizer;
    private final String IconCompatParcelizer;
    private int MediaBrowserCompatCustomActionResultReceiver;
    private final int RemoteActionCompatParcelizer;
    private final int read;
    private int write;

    @Override // kotlin.findConstructor
    public final void RemoteActionCompatParcelizer() {
    }

    public isProxyType(int i, int i2, String str) {
        this.read = i;
        this.RemoteActionCompatParcelizer = i2;
        this.IconCompatParcelizer = str;
    }

    @Override // kotlin.findConstructor
    public final boolean read(closeOnFailAndThrowAsIOE closeonfailandthrowasioe) throws IOException {
        buildTypeSerializer.write((this.read == -1 || this.RemoteActionCompatParcelizer == -1) ? false : true);
        AsPropertyTypeDeserializer asPropertyTypeDeserializer = new AsPropertyTypeDeserializer(this.RemoteActionCompatParcelizer);
        closeonfailandthrowasioe.RemoteActionCompatParcelizer(asPropertyTypeDeserializer.RemoteActionCompatParcelizer(), 0, this.RemoteActionCompatParcelizer);
        return asPropertyTypeDeserializer.onPrepare() == this.read;
    }

    @Override // kotlin.findConstructor
    public final void read(findRawSuperTypes findrawsupertypes) {
        this.AudioAttributesCompatParcelizer = findrawsupertypes;
        write(this.IconCompatParcelizer);
    }

    @Override // kotlin.findConstructor
    public final int RemoteActionCompatParcelizer(closeOnFailAndThrowAsIOE closeonfailandthrowasioe, isJacksonStdImpl isjacksonstdimpl) throws IOException {
        int i = this.MediaBrowserCompatCustomActionResultReceiver;
        if (i == 1) {
            AudioAttributesCompatParcelizer(closeonfailandthrowasioe);
            return 0;
        }
        if (i == 2) {
            return -1;
        }
        throw new IllegalStateException();
    }

    @Override // kotlin.findConstructor
    public final void write(long j, long j2) {
        if (j == 0 || this.MediaBrowserCompatCustomActionResultReceiver == 1) {
            this.MediaBrowserCompatCustomActionResultReceiver = 1;
            this.write = 0;
        }
    }

    private void AudioAttributesCompatParcelizer(closeOnFailAndThrowAsIOE closeonfailandthrowasioe) throws IOException {
        int iAudioAttributesCompatParcelizer = ((nonNullString) buildTypeSerializer.IconCompatParcelizer(this.AudioAttributesImplApi21Parcelizer)).AudioAttributesCompatParcelizer(closeonfailandthrowasioe, 1024, true);
        if (iAudioAttributesCompatParcelizer == -1) {
            this.MediaBrowserCompatCustomActionResultReceiver = 2;
            this.AudioAttributesImplApi21Parcelizer.IconCompatParcelizer(0L, 1, this.write, 0, null);
            this.write = 0;
            return;
        }
        this.write += iAudioAttributesCompatParcelizer;
    }

    private void write(String str) {
        nonNullString nonnullstringIconCompatParcelizer = this.AudioAttributesCompatParcelizer.IconCompatParcelizer(1024, 4);
        this.AudioAttributesImplApi21Parcelizer = nonnullstringIconCompatParcelizer;
        nonnullstringIconCompatParcelizer.write(new C0170format.RemoteActionCompatParcelizer().AudioAttributesImplApi26Parcelizer(str).IconCompatParcelizer());
        this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer();
        this.AudioAttributesCompatParcelizer.read(new nonNull());
        this.MediaBrowserCompatCustomActionResultReceiver = 1;
    }
}
