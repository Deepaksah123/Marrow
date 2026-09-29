package kotlin;

import com.google.android.exoplayer2.C;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import kotlin.withTimeZone;

/* JADX INFO: loaded from: classes2.dex */
public final class looksLikeISO8601 implements findConstructor {
    private final withTimeZone AudioAttributesImplApi21Parcelizer;
    private nonNullString RatingCompat;
    private int read;
    private final C0170format write;
    private final _parse4D AudioAttributesCompatParcelizer = new _parse4D();
    private byte[] MediaBrowserCompatCustomActionResultReceiver = LaissezFaireSubTypeValidator.RemoteActionCompatParcelizer;
    private final AsPropertyTypeDeserializer IconCompatParcelizer = new AsPropertyTypeDeserializer();
    private final List<RemoteActionCompatParcelizer> RemoteActionCompatParcelizer = new ArrayList();
    private int MediaBrowserCompatItemReceiver = 0;
    private long[] AudioAttributesImplBaseParcelizer = LaissezFaireSubTypeValidator.IconCompatParcelizer;
    private long AudioAttributesImplApi26Parcelizer = C.TIME_UNSET;

    @Override // kotlin.findConstructor
    public final boolean read(closeOnFailAndThrowAsIOE closeonfailandthrowasioe) throws IOException {
        return true;
    }

    public looksLikeISO8601(withTimeZone withtimezone, C0170format c0170format) {
        this.AudioAttributesImplApi21Parcelizer = withtimezone;
        this.write = c0170format.write().AudioAttributesImplApi26Parcelizer("application/x-media3-cues").RemoteActionCompatParcelizer(c0170format.onPlayFromUri).IconCompatParcelizer(withtimezone.IconCompatParcelizer()).IconCompatParcelizer();
    }

    @Override // kotlin.findConstructor
    public final void read(findRawSuperTypes findrawsupertypes) {
        buildTypeSerializer.write(this.MediaBrowserCompatItemReceiver == 0);
        nonNullString nonnullstringIconCompatParcelizer = findrawsupertypes.IconCompatParcelizer(0, 3);
        this.RatingCompat = nonnullstringIconCompatParcelizer;
        nonnullstringIconCompatParcelizer.write(this.write);
        findrawsupertypes.RemoteActionCompatParcelizer();
        findrawsupertypes.read(new hasEnclosingMethod(new long[]{0}, new long[]{0}, C.TIME_UNSET));
        this.MediaBrowserCompatItemReceiver = 1;
    }

    @Override // kotlin.findConstructor
    public final int RemoteActionCompatParcelizer(closeOnFailAndThrowAsIOE closeonfailandthrowasioe, isJacksonStdImpl isjacksonstdimpl) throws IOException {
        int i = this.MediaBrowserCompatItemReceiver;
        buildTypeSerializer.write((i == 0 || i == 5) ? false : true);
        if (this.MediaBrowserCompatItemReceiver == 1) {
            int iRemoteActionCompatParcelizer = closeonfailandthrowasioe.read() != -1 ? parseTextAttribute.RemoteActionCompatParcelizer(closeonfailandthrowasioe.read()) : 1024;
            if (iRemoteActionCompatParcelizer > this.MediaBrowserCompatCustomActionResultReceiver.length) {
                this.MediaBrowserCompatCustomActionResultReceiver = new byte[iRemoteActionCompatParcelizer];
            }
            this.read = 0;
            this.MediaBrowserCompatItemReceiver = 2;
        }
        if (this.MediaBrowserCompatItemReceiver == 2 && IconCompatParcelizer(closeonfailandthrowasioe)) {
            read();
            this.MediaBrowserCompatItemReceiver = 4;
        }
        if (this.MediaBrowserCompatItemReceiver == 3 && RemoteActionCompatParcelizer(closeonfailandthrowasioe)) {
            IconCompatParcelizer();
            this.MediaBrowserCompatItemReceiver = 4;
        }
        return this.MediaBrowserCompatItemReceiver == 4 ? -1 : 0;
    }

    @Override // kotlin.findConstructor
    public final void write(long j, long j2) {
        int i = this.MediaBrowserCompatItemReceiver;
        buildTypeSerializer.write((i == 0 || i == 5) ? false : true);
        this.AudioAttributesImplApi26Parcelizer = j2;
        if (this.MediaBrowserCompatItemReceiver == 2) {
            this.MediaBrowserCompatItemReceiver = 1;
        }
        if (this.MediaBrowserCompatItemReceiver == 4) {
            this.MediaBrowserCompatItemReceiver = 3;
        }
    }

    @Override // kotlin.findConstructor
    public final void RemoteActionCompatParcelizer() {
        if (this.MediaBrowserCompatItemReceiver == 5) {
            return;
        }
        this.AudioAttributesImplApi21Parcelizer.RemoteActionCompatParcelizer();
        this.MediaBrowserCompatItemReceiver = 5;
    }

    private static boolean RemoteActionCompatParcelizer(closeOnFailAndThrowAsIOE closeonfailandthrowasioe) throws IOException {
        return closeonfailandthrowasioe.read((closeonfailandthrowasioe.read() > (-1L) ? 1 : (closeonfailandthrowasioe.read() == (-1L) ? 0 : -1)) != 0 ? parseTextAttribute.RemoteActionCompatParcelizer(closeonfailandthrowasioe.read()) : 1024) == -1;
    }

    private boolean IconCompatParcelizer(closeOnFailAndThrowAsIOE closeonfailandthrowasioe) throws IOException {
        byte[] bArr = this.MediaBrowserCompatCustomActionResultReceiver;
        if (bArr.length == this.read) {
            this.MediaBrowserCompatCustomActionResultReceiver = Arrays.copyOf(bArr, bArr.length + 1024);
        }
        byte[] bArr2 = this.MediaBrowserCompatCustomActionResultReceiver;
        int i = this.read;
        int iAudioAttributesCompatParcelizer = closeonfailandthrowasioe.AudioAttributesCompatParcelizer(bArr2, i, bArr2.length - i);
        if (iAudioAttributesCompatParcelizer != -1) {
            this.read += iAudioAttributesCompatParcelizer;
        }
        long j = closeonfailandthrowasioe.read();
        return (j != -1 && ((long) this.read) == j) || iAudioAttributesCompatParcelizer == -1;
    }

    private void read() throws IOException {
        withTimeZone.RemoteActionCompatParcelizer remoteActionCompatParcelizerAudioAttributesCompatParcelizer;
        try {
            long j = this.AudioAttributesImplApi26Parcelizer;
            if (j != C.TIME_UNSET) {
                remoteActionCompatParcelizerAudioAttributesCompatParcelizer = withTimeZone.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(j);
            } else {
                remoteActionCompatParcelizerAudioAttributesCompatParcelizer = withTimeZone.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer();
            }
            this.AudioAttributesImplApi21Parcelizer.RemoteActionCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver, 0, this.read, remoteActionCompatParcelizerAudioAttributesCompatParcelizer, new TypeSerializer() { // from class: o.clone
                @Override // kotlin.TypeSerializer
                public final void read(Object obj) {
                    this.write.read((pad3) obj);
                }
            });
            Collections.sort(this.RemoteActionCompatParcelizer);
            this.AudioAttributesImplBaseParcelizer = new long[this.RemoteActionCompatParcelizer.size()];
            for (int i = 0; i < this.RemoteActionCompatParcelizer.size(); i++) {
                this.AudioAttributesImplBaseParcelizer[i] = this.RemoteActionCompatParcelizer.get(i).AudioAttributesCompatParcelizer;
            }
            this.MediaBrowserCompatCustomActionResultReceiver = LaissezFaireSubTypeValidator.RemoteActionCompatParcelizer;
        } catch (RuntimeException e) {
            throw SchemaAware.RemoteActionCompatParcelizer("SubtitleParser failed.", e);
        }
    }

    final /* synthetic */ void read(pad3 pad3Var) {
        RemoteActionCompatParcelizer remoteActionCompatParcelizer = new RemoteActionCompatParcelizer(pad3Var.IconCompatParcelizer, _parse4D.write(pad3Var.read, pad3Var.AudioAttributesCompatParcelizer), (byte) 0);
        this.RemoteActionCompatParcelizer.add(remoteActionCompatParcelizer);
        if (this.AudioAttributesImplApi26Parcelizer == C.TIME_UNSET || pad3Var.IconCompatParcelizer >= this.AudioAttributesImplApi26Parcelizer) {
            read(remoteActionCompatParcelizer);
        }
    }

    private void IconCompatParcelizer() {
        long j = this.AudioAttributesImplApi26Parcelizer;
        for (int iRemoteActionCompatParcelizer = j == C.TIME_UNSET ? 0 : LaissezFaireSubTypeValidator.RemoteActionCompatParcelizer(this.AudioAttributesImplBaseParcelizer, j, true); iRemoteActionCompatParcelizer < this.RemoteActionCompatParcelizer.size(); iRemoteActionCompatParcelizer++) {
            read(this.RemoteActionCompatParcelizer.get(iRemoteActionCompatParcelizer));
        }
    }

    private void read(RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        buildTypeSerializer.AudioAttributesCompatParcelizer(this.RatingCompat);
        int length = remoteActionCompatParcelizer.write.length;
        this.IconCompatParcelizer.AudioAttributesCompatParcelizer(remoteActionCompatParcelizer.write);
        this.RatingCompat.RemoteActionCompatParcelizer(this.IconCompatParcelizer, length);
        this.RatingCompat.IconCompatParcelizer(remoteActionCompatParcelizer.AudioAttributesCompatParcelizer, 1, length, 0, null);
    }

    static class RemoteActionCompatParcelizer implements Comparable<RemoteActionCompatParcelizer> {
        private final long AudioAttributesCompatParcelizer;
        private final byte[] write;

        /* synthetic */ RemoteActionCompatParcelizer(long j, byte[] bArr, byte b) {
            this(j, bArr);
        }

        private RemoteActionCompatParcelizer(long j, byte[] bArr) {
            this.AudioAttributesCompatParcelizer = j;
            this.write = bArr;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public int compareTo(RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
            return Long.compare(this.AudioAttributesCompatParcelizer, remoteActionCompatParcelizer.AudioAttributesCompatParcelizer);
        }
    }
}
