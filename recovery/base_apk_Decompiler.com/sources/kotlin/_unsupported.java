package kotlin;

import com.google.android.exoplayer2.C;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class _unsupported extends ClassKey {
    private final C0170format IconCompatParcelizer;
    private final int onCommand;
    private boolean read;
    private long write;

    @Override // o.constructCollectionType.AudioAttributesCompatParcelizer
    public final void B_() {
    }

    public _unsupported(_hasTypeResolver _hastyperesolver, SubTypeValidator subTypeValidator, C0170format c0170format, int i, Object obj, long j, long j2, long j3, int i2, C0170format c0170format2) {
        super(_hastyperesolver, subTypeValidator, c0170format, i, obj, j, j2, C.TIME_UNSET, C.TIME_UNSET, j3);
        this.onCommand = i2;
        this.IconCompatParcelizer = c0170format2;
    }

    @Override // kotlin.getSelfReferencedType
    public final boolean write() {
        return this.read;
    }

    @Override // o.constructCollectionType.AudioAttributesCompatParcelizer
    public final void AudioAttributesCompatParcelizer() throws IOException {
        LogicalType logicalType = read();
        logicalType.RemoteActionCompatParcelizer(0L);
        nonNullString nonnullstringRemoteActionCompatParcelizer = logicalType.RemoteActionCompatParcelizer(this.onCommand);
        nonnullstringRemoteActionCompatParcelizer.write(this.IconCompatParcelizer);
        try {
            long jRemoteActionCompatParcelizer = this.AudioAttributesImplBaseParcelizer.RemoteActionCompatParcelizer(this.AudioAttributesImplApi26Parcelizer.IconCompatParcelizer(this.write));
            if (jRemoteActionCompatParcelizer != -1) {
                jRemoteActionCompatParcelizer += this.write;
            }
            classOf classof = new classOf(this.AudioAttributesImplBaseParcelizer, this.write, jRemoteActionCompatParcelizer);
            for (int iAudioAttributesCompatParcelizer = 0; iAudioAttributesCompatParcelizer != -1; iAudioAttributesCompatParcelizer = nonnullstringRemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(classof, Integer.MAX_VALUE, true)) {
                this.write += (long) iAudioAttributesCompatParcelizer;
            }
            nonnullstringRemoteActionCompatParcelizer.IconCompatParcelizer(this.MediaBrowserCompatItemReceiver, 1, (int) this.write, 0, null);
            StdTypeResolverBuilder1.IconCompatParcelizer(this.AudioAttributesImplBaseParcelizer);
            this.read = true;
        } catch (Throwable th) {
            StdTypeResolverBuilder1.IconCompatParcelizer(this.AudioAttributesImplBaseParcelizer);
            throw th;
        }
    }
}
