package kotlin;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
final class RootNameLookup {
    public final int[] AudioAttributesCompatParcelizer = new int[255];
    private final AsPropertyTypeDeserializer AudioAttributesImplApi21Parcelizer = new AsPropertyTypeDeserializer(255);
    public int AudioAttributesImplApi26Parcelizer;
    private int AudioAttributesImplBaseParcelizer;
    public int IconCompatParcelizer;
    private long MediaBrowserCompatCustomActionResultReceiver;
    private long MediaBrowserCompatItemReceiver;
    private long RatingCompat;
    public long RemoteActionCompatParcelizer;
    public int read;
    public int write;

    RootNameLookup() {
    }

    public final void IconCompatParcelizer() {
        this.AudioAttributesImplBaseParcelizer = 0;
        this.AudioAttributesImplApi26Parcelizer = 0;
        this.RemoteActionCompatParcelizer = 0L;
        this.RatingCompat = 0L;
        this.MediaBrowserCompatCustomActionResultReceiver = 0L;
        this.MediaBrowserCompatItemReceiver = 0L;
        this.read = 0;
        this.write = 0;
        this.IconCompatParcelizer = 0;
    }

    public final boolean AudioAttributesCompatParcelizer(closeOnFailAndThrowAsIOE closeonfailandthrowasioe) throws IOException {
        return write(closeonfailandthrowasioe, -1L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0051, code lost:
    
        if (r10 == (-1)) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0059, code lost:
    
        if (r9.IconCompatParcelizer() >= r10) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0060, code lost:
    
        if (r9.read(1) != (-1)) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0062, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean write(kotlin.closeOnFailAndThrowAsIOE r9, long r10) throws java.io.IOException {
        /*
            r8 = this;
            long r0 = r9.IconCompatParcelizer()
            long r2 = r9.write()
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L10
            r0 = r2
            goto L11
        L10:
            r0 = r1
        L11:
            kotlin.buildTypeSerializer.IconCompatParcelizer(r0)
            o.AsPropertyTypeDeserializer r0 = r8.AudioAttributesImplApi21Parcelizer
            r3 = 4
            r0.write(r3)
        L1a:
            r4 = -1
            int r0 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r0 == 0) goto L2b
            long r4 = r9.IconCompatParcelizer()
            r6 = 4
            long r4 = r4 + r6
            int r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r4 >= 0) goto L51
        L2b:
            o.AsPropertyTypeDeserializer r4 = r8.AudioAttributesImplApi21Parcelizer
            byte[] r4 = r4.RemoteActionCompatParcelizer()
            boolean r4 = kotlin.findSuperClasses.IconCompatParcelizer(r9, r4, r3, r2)
            if (r4 == 0) goto L51
            o.AsPropertyTypeDeserializer r0 = r8.AudioAttributesImplApi21Parcelizer
            r0.MediaBrowserCompatCustomActionResultReceiver(r1)
            o.AsPropertyTypeDeserializer r0 = r8.AudioAttributesImplApi21Parcelizer
            long r4 = r0.onMediaButtonEvent()
            r6 = 1332176723(0x4f676753, double:6.58182753E-315)
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 != 0) goto L4d
            r9.RemoteActionCompatParcelizer()
            return r2
        L4d:
            r9.IconCompatParcelizer(r2)
            goto L1a
        L51:
            if (r0 == 0) goto L5b
            long r3 = r9.IconCompatParcelizer()
            int r8 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r8 >= 0) goto L62
        L5b:
            int r8 = r9.read(r2)
            r3 = -1
            if (r8 != r3) goto L51
        L62:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.RootNameLookup.write(o.closeOnFailAndThrowAsIOE, long):boolean");
    }

    public final boolean read(closeOnFailAndThrowAsIOE closeonfailandthrowasioe, boolean z) throws IOException {
        IconCompatParcelizer();
        this.AudioAttributesImplApi21Parcelizer.write(27);
        if (!findSuperClasses.IconCompatParcelizer(closeonfailandthrowasioe, this.AudioAttributesImplApi21Parcelizer.RemoteActionCompatParcelizer(), 27, z) || this.AudioAttributesImplApi21Parcelizer.onMediaButtonEvent() != 1332176723) {
            return false;
        }
        int iOnPlayFromMediaId = this.AudioAttributesImplApi21Parcelizer.onPlayFromMediaId();
        this.AudioAttributesImplBaseParcelizer = iOnPlayFromMediaId;
        if (iOnPlayFromMediaId != 0) {
            if (z) {
                return false;
            }
            throw SchemaAware.RemoteActionCompatParcelizer("unsupported bit stream revision");
        }
        this.AudioAttributesImplApi26Parcelizer = this.AudioAttributesImplApi21Parcelizer.onPlayFromMediaId();
        this.RemoteActionCompatParcelizer = this.AudioAttributesImplApi21Parcelizer.MediaDescriptionCompat();
        this.RatingCompat = this.AudioAttributesImplApi21Parcelizer.RatingCompat();
        this.MediaBrowserCompatCustomActionResultReceiver = this.AudioAttributesImplApi21Parcelizer.RatingCompat();
        this.MediaBrowserCompatItemReceiver = this.AudioAttributesImplApi21Parcelizer.RatingCompat();
        int iOnPlayFromMediaId2 = this.AudioAttributesImplApi21Parcelizer.onPlayFromMediaId();
        this.read = iOnPlayFromMediaId2;
        this.write = iOnPlayFromMediaId2 + 27;
        this.AudioAttributesImplApi21Parcelizer.write(iOnPlayFromMediaId2);
        if (!findSuperClasses.IconCompatParcelizer(closeonfailandthrowasioe, this.AudioAttributesImplApi21Parcelizer.RemoteActionCompatParcelizer(), this.read, z)) {
            return false;
        }
        for (int i = 0; i < this.read; i++) {
            this.AudioAttributesCompatParcelizer[i] = this.AudioAttributesImplApi21Parcelizer.onPlayFromMediaId();
            this.IconCompatParcelizer += this.AudioAttributesCompatParcelizer[i];
        }
        return true;
    }
}
