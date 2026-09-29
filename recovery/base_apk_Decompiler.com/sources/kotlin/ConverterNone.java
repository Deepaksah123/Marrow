package kotlin;

import com.google.android.exoplayer2.C;
import java.io.IOException;
import kotlin.isCollectionMapOrArray;

/* JADX INFO: loaded from: classes2.dex */
public final class ConverterNone implements findConstructor {
    private locateField AudioAttributesCompatParcelizer;
    private boolean AudioAttributesImplApi26Parcelizer;
    private long IconCompatParcelizer;
    private boolean MediaBrowserCompatCustomActionResultReceiver;
    private int MediaDescriptionCompat;
    private int MediaMetadataCompat;
    private long RatingCompat;
    private findRawSuperTypes RemoteActionCompatParcelizer;
    private Converter onCustomAction;
    private int read;
    private final AsPropertyTypeDeserializer AudioAttributesImplApi21Parcelizer = new AsPropertyTypeDeserializer(4);
    private final AsPropertyTypeDeserializer write = new AsPropertyTypeDeserializer(9);
    private final AsPropertyTypeDeserializer MediaBrowserCompatSearchResultReceiver = new AsPropertyTypeDeserializer(11);
    private final AsPropertyTypeDeserializer MediaBrowserCompatMediaItem = new AsPropertyTypeDeserializer();
    private final EnumResolver MediaBrowserCompatItemReceiver = new EnumResolver();
    private int AudioAttributesImplBaseParcelizer = 1;

    @Override // kotlin.findConstructor
    public final void RemoteActionCompatParcelizer() {
    }

    static {
        new getClassDescription() { // from class: o.findCaseInsensitive
            @Override // kotlin.getClassDescription
            public final findConstructor[] RemoteActionCompatParcelizer() {
                return ConverterNone.read();
            }
        };
    }

    static /* synthetic */ findConstructor[] read() {
        return new findConstructor[]{new ConverterNone()};
    }

    @Override // kotlin.findConstructor
    public final boolean read(closeOnFailAndThrowAsIOE closeonfailandthrowasioe) throws IOException {
        closeonfailandthrowasioe.RemoteActionCompatParcelizer(this.AudioAttributesImplApi21Parcelizer.RemoteActionCompatParcelizer(), 0, 3);
        this.AudioAttributesImplApi21Parcelizer.MediaBrowserCompatCustomActionResultReceiver(0);
        if (this.AudioAttributesImplApi21Parcelizer.onPause() != 4607062) {
            return false;
        }
        closeonfailandthrowasioe.RemoteActionCompatParcelizer(this.AudioAttributesImplApi21Parcelizer.RemoteActionCompatParcelizer(), 0, 2);
        this.AudioAttributesImplApi21Parcelizer.MediaBrowserCompatCustomActionResultReceiver(0);
        if ((this.AudioAttributesImplApi21Parcelizer.onPrepare() & 250) != 0) {
            return false;
        }
        closeonfailandthrowasioe.RemoteActionCompatParcelizer(this.AudioAttributesImplApi21Parcelizer.RemoteActionCompatParcelizer(), 0, 4);
        this.AudioAttributesImplApi21Parcelizer.MediaBrowserCompatCustomActionResultReceiver(0);
        int iMediaBrowserCompatItemReceiver = this.AudioAttributesImplApi21Parcelizer.MediaBrowserCompatItemReceiver();
        closeonfailandthrowasioe.RemoteActionCompatParcelizer();
        closeonfailandthrowasioe.write(iMediaBrowserCompatItemReceiver);
        closeonfailandthrowasioe.RemoteActionCompatParcelizer(this.AudioAttributesImplApi21Parcelizer.RemoteActionCompatParcelizer(), 0, 4);
        this.AudioAttributesImplApi21Parcelizer.MediaBrowserCompatCustomActionResultReceiver(0);
        return this.AudioAttributesImplApi21Parcelizer.MediaBrowserCompatItemReceiver() == 0;
    }

    @Override // kotlin.findConstructor
    public final void read(findRawSuperTypes findrawsupertypes) {
        this.RemoteActionCompatParcelizer = findrawsupertypes;
    }

    @Override // kotlin.findConstructor
    public final void write(long j, long j2) {
        if (j == 0) {
            this.AudioAttributesImplBaseParcelizer = 1;
            this.MediaBrowserCompatCustomActionResultReceiver = false;
        } else {
            this.AudioAttributesImplBaseParcelizer = 3;
        }
        this.read = 0;
    }

    @Override // kotlin.findConstructor
    public final int RemoteActionCompatParcelizer(closeOnFailAndThrowAsIOE closeonfailandthrowasioe, isJacksonStdImpl isjacksonstdimpl) throws IOException {
        buildTypeSerializer.AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer);
        while (true) {
            int i = this.AudioAttributesImplBaseParcelizer;
            if (i != 1) {
                if (i == 2) {
                    MediaBrowserCompatCustomActionResultReceiver(closeonfailandthrowasioe);
                } else if (i != 3) {
                    if (i == 4) {
                        if (RemoteActionCompatParcelizer(closeonfailandthrowasioe)) {
                            return 0;
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                } else if (!AudioAttributesCompatParcelizer(closeonfailandthrowasioe)) {
                    return -1;
                }
            } else if (!write(closeonfailandthrowasioe)) {
                return -1;
            }
        }
    }

    private boolean write(closeOnFailAndThrowAsIOE closeonfailandthrowasioe) throws IOException {
        if (!closeonfailandthrowasioe.AudioAttributesCompatParcelizer(this.write.RemoteActionCompatParcelizer(), 0, 9, true)) {
            return false;
        }
        this.write.MediaBrowserCompatCustomActionResultReceiver(0);
        this.write.AudioAttributesImplBaseParcelizer(4);
        int iOnPlayFromMediaId = this.write.onPlayFromMediaId();
        boolean z = (iOnPlayFromMediaId & 4) != 0;
        boolean z2 = (iOnPlayFromMediaId & 1) != 0;
        if (z && this.AudioAttributesCompatParcelizer == null) {
            this.AudioAttributesCompatParcelizer = new locateField(this.RemoteActionCompatParcelizer.IconCompatParcelizer(8, 1));
        }
        if (z2 && this.onCustomAction == null) {
            this.onCustomAction = new Converter(this.RemoteActionCompatParcelizer.IconCompatParcelizer(9, 2));
        }
        this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer();
        this.read = this.write.MediaBrowserCompatItemReceiver() - 5;
        this.AudioAttributesImplBaseParcelizer = 2;
        return true;
    }

    private void MediaBrowserCompatCustomActionResultReceiver(closeOnFailAndThrowAsIOE closeonfailandthrowasioe) throws IOException {
        closeonfailandthrowasioe.IconCompatParcelizer(this.read);
        this.read = 0;
        this.AudioAttributesImplBaseParcelizer = 3;
    }

    private boolean AudioAttributesCompatParcelizer(closeOnFailAndThrowAsIOE closeonfailandthrowasioe) throws IOException {
        if (!closeonfailandthrowasioe.AudioAttributesCompatParcelizer(this.MediaBrowserCompatSearchResultReceiver.RemoteActionCompatParcelizer(), 0, 11, true)) {
            return false;
        }
        this.MediaBrowserCompatSearchResultReceiver.MediaBrowserCompatCustomActionResultReceiver(0);
        this.MediaMetadataCompat = this.MediaBrowserCompatSearchResultReceiver.onPlayFromMediaId();
        this.MediaDescriptionCompat = this.MediaBrowserCompatSearchResultReceiver.onPause();
        this.RatingCompat = this.MediaBrowserCompatSearchResultReceiver.onPause();
        this.RatingCompat = (((long) (this.MediaBrowserCompatSearchResultReceiver.onPlayFromMediaId() << 24)) | this.RatingCompat) * 1000;
        this.MediaBrowserCompatSearchResultReceiver.AudioAttributesImplBaseParcelizer(3);
        this.AudioAttributesImplBaseParcelizer = 4;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean RemoteActionCompatParcelizer(kotlin.closeOnFailAndThrowAsIOE r10) throws java.io.IOException {
        /*
            r9 = this;
            long r0 = r9.MediaBrowserCompatCustomActionResultReceiver()
            int r2 = r9.MediaMetadataCompat
            r3 = 8
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6 = 1
            if (r2 != r3) goto L22
            o.locateField r3 = r9.AudioAttributesCompatParcelizer
            if (r3 == 0) goto L22
            r9.IconCompatParcelizer()
            o.locateField r2 = r9.AudioAttributesCompatParcelizer
            o.AsPropertyTypeDeserializer r10 = r9.IconCompatParcelizer(r10)
            boolean r10 = r2.AudioAttributesCompatParcelizer(r10, r0)
            goto L6c
        L22:
            r3 = 9
            if (r2 != r3) goto L38
            o.Converter r3 = r9.onCustomAction
            if (r3 == 0) goto L38
            r9.IconCompatParcelizer()
            o.Converter r2 = r9.onCustomAction
            o.AsPropertyTypeDeserializer r10 = r9.IconCompatParcelizer(r10)
            boolean r10 = r2.AudioAttributesCompatParcelizer(r10, r0)
            goto L6c
        L38:
            r3 = 18
            if (r2 != r3) goto L6e
            boolean r2 = r9.AudioAttributesImplApi26Parcelizer
            if (r2 != 0) goto L6e
            o.EnumResolver r2 = r9.MediaBrowserCompatItemReceiver
            o.AsPropertyTypeDeserializer r10 = r9.IconCompatParcelizer(r10)
            boolean r10 = r2.AudioAttributesCompatParcelizer(r10, r0)
            o.EnumResolver r0 = r9.MediaBrowserCompatItemReceiver
            long r0 = r0.AudioAttributesCompatParcelizer()
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 == 0) goto L6c
            o.findRawSuperTypes r2 = r9.RemoteActionCompatParcelizer
            o.EnumResolver r3 = r9.MediaBrowserCompatItemReceiver
            long[] r3 = r3.RemoteActionCompatParcelizer()
            o.EnumResolver r7 = r9.MediaBrowserCompatItemReceiver
            o.hasEnclosingMethod r8 = new o.hasEnclosingMethod
            long[] r7 = r7.write()
            r8.<init>(r3, r7, r0)
            r2.read(r8)
            r9.AudioAttributesImplApi26Parcelizer = r6
        L6c:
            r0 = r6
            goto L75
        L6e:
            int r0 = r9.MediaDescriptionCompat
            r10.IconCompatParcelizer(r0)
            r10 = 0
            r0 = r10
        L75:
            boolean r1 = r9.MediaBrowserCompatCustomActionResultReceiver
            if (r1 != 0) goto L8f
            if (r10 == 0) goto L8f
            r9.MediaBrowserCompatCustomActionResultReceiver = r6
            o.EnumResolver r10 = r9.MediaBrowserCompatItemReceiver
            long r1 = r10.AudioAttributesCompatParcelizer()
            int r10 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r10 != 0) goto L8b
            long r1 = r9.RatingCompat
            long r1 = -r1
            goto L8d
        L8b:
            r1 = 0
        L8d:
            r9.IconCompatParcelizer = r1
        L8f:
            r10 = 4
            r9.read = r10
            r10 = 2
            r9.AudioAttributesImplBaseParcelizer = r10
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.ConverterNone.RemoteActionCompatParcelizer(o.closeOnFailAndThrowAsIOE):boolean");
    }

    private AsPropertyTypeDeserializer IconCompatParcelizer(closeOnFailAndThrowAsIOE closeonfailandthrowasioe) throws IOException {
        if (this.MediaDescriptionCompat > this.MediaBrowserCompatMediaItem.AudioAttributesCompatParcelizer()) {
            AsPropertyTypeDeserializer asPropertyTypeDeserializer = this.MediaBrowserCompatMediaItem;
            asPropertyTypeDeserializer.IconCompatParcelizer(new byte[Math.max(asPropertyTypeDeserializer.AudioAttributesCompatParcelizer() << 1, this.MediaDescriptionCompat)], 0);
        } else {
            this.MediaBrowserCompatMediaItem.MediaBrowserCompatCustomActionResultReceiver(0);
        }
        this.MediaBrowserCompatMediaItem.AudioAttributesCompatParcelizer(this.MediaDescriptionCompat);
        closeonfailandthrowasioe.IconCompatParcelizer(this.MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer(), 0, this.MediaDescriptionCompat);
        return this.MediaBrowserCompatMediaItem;
    }

    private void IconCompatParcelizer() {
        if (this.AudioAttributesImplApi26Parcelizer) {
            return;
        }
        this.RemoteActionCompatParcelizer.read(new isCollectionMapOrArray.write(C.TIME_UNSET));
        this.AudioAttributesImplApi26Parcelizer = true;
    }

    private long MediaBrowserCompatCustomActionResultReceiver() {
        if (this.MediaBrowserCompatCustomActionResultReceiver) {
            return this.IconCompatParcelizer + this.RatingCompat;
        }
        if (this.MediaBrowserCompatItemReceiver.AudioAttributesCompatParcelizer() == C.TIME_UNSET) {
            return 0L;
        }
        return this.RatingCompat;
    }
}
