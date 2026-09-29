package kotlin;

import android.net.Uri;
import com.google.android.exoplayer2.C;
import kotlin.JsonSerializableSchema;
import kotlin.PolymorphicTypeValidator;

/* JADX INFO: loaded from: classes2.dex */
public final class TokenBufferSerializer extends PolymorphicTypeValidator {
    private static final Object IconCompatParcelizer = new Object();
    private final boolean AudioAttributesCompatParcelizer;
    private final JsonSerializableSchema AudioAttributesImplApi21Parcelizer;
    private final long AudioAttributesImplApi26Parcelizer;
    private final long AudioAttributesImplBaseParcelizer;
    private final Object MediaBrowserCompatCustomActionResultReceiver;
    private final JsonSerializableSchema.AudioAttributesImplApi26Parcelizer MediaBrowserCompatItemReceiver;
    private final boolean MediaBrowserCompatMediaItem;
    private final long MediaBrowserCompatSearchResultReceiver;
    private final long MediaDescriptionCompat;
    private final long MediaMetadataCompat;
    private final long RatingCompat;
    private final boolean read;
    private final long write;

    @Override // kotlin.PolymorphicTypeValidator
    public final int AudioAttributesCompatParcelizer() {
        return 1;
    }

    @Override // kotlin.PolymorphicTypeValidator
    public final int IconCompatParcelizer() {
        return 1;
    }

    static {
        new JsonSerializableSchema.IconCompatParcelizer().RemoteActionCompatParcelizer("SinglePeriodTimeline").read(Uri.EMPTY).IconCompatParcelizer();
    }

    public TokenBufferSerializer(long j, boolean z, boolean z2, JsonSerializableSchema jsonSerializableSchema) {
        this(j, j, z, false, z2, null, jsonSerializableSchema);
    }

    private TokenBufferSerializer(long j, long j2, boolean z, boolean z2, boolean z3, Object obj, JsonSerializableSchema jsonSerializableSchema) {
        this(C.TIME_UNSET, C.TIME_UNSET, j, j2, 0L, 0L, z, false, false, null, jsonSerializableSchema, z3 ? jsonSerializableSchema.RemoteActionCompatParcelizer : null);
    }

    public TokenBufferSerializer(long j, long j2, long j3, long j4, long j5, long j6, boolean z, boolean z2, boolean z3, Object obj, JsonSerializableSchema jsonSerializableSchema, JsonSerializableSchema.AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer) {
        this.AudioAttributesImplApi26Parcelizer = j;
        this.RatingCompat = j2;
        this.write = C.TIME_UNSET;
        this.AudioAttributesImplBaseParcelizer = j3;
        this.MediaMetadataCompat = j4;
        this.MediaBrowserCompatSearchResultReceiver = j5;
        this.MediaDescriptionCompat = j6;
        this.AudioAttributesCompatParcelizer = z;
        this.read = z2;
        this.MediaBrowserCompatMediaItem = z3;
        this.MediaBrowserCompatCustomActionResultReceiver = obj;
        this.AudioAttributesImplApi21Parcelizer = (JsonSerializableSchema) buildTypeSerializer.IconCompatParcelizer(jsonSerializableSchema);
        this.MediaBrowserCompatItemReceiver = audioAttributesImplApi26Parcelizer;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e A[PHI: r1
      0x002e: PHI (r1v2 long) = (r1v1 long), (r1v1 long), (r1v1 long), (r1v4 long) binds: [B:3:0x000c, B:5:0x0010, B:7:0x0016, B:12:0x0028] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // kotlin.PolymorphicTypeValidator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final o.PolymorphicTypeValidator.IconCompatParcelizer write(int r24, o.PolymorphicTypeValidator.IconCompatParcelizer r25, long r26) {
        /*
            r23 = this;
            r0 = r23
            r1 = 1
            r2 = r24
            kotlin.buildTypeSerializer.RemoteActionCompatParcelizer(r2, r1)
            long r1 = r0.MediaDescriptionCompat
            boolean r3 = r0.read
            if (r3 == 0) goto L2e
            boolean r3 = r0.MediaBrowserCompatMediaItem
            if (r3 != 0) goto L2e
            r3 = 0
            int r3 = (r26 > r3 ? 1 : (r26 == r3 ? 0 : -1))
            if (r3 == 0) goto L2e
            long r3 = r0.MediaMetadataCompat
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L24
            goto L2b
        L24:
            long r1 = r1 + r26
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 > 0) goto L2b
            goto L2e
        L2b:
            r16 = r5
            goto L30
        L2e:
            r16 = r1
        L30:
            java.lang.Object r4 = o.PolymorphicTypeValidator.IconCompatParcelizer.read
            o.JsonSerializableSchema r5 = r0.AudioAttributesImplApi21Parcelizer
            java.lang.Object r6 = r0.MediaBrowserCompatCustomActionResultReceiver
            long r7 = r0.AudioAttributesImplApi26Parcelizer
            long r9 = r0.RatingCompat
            long r11 = r0.write
            boolean r13 = r0.AudioAttributesCompatParcelizer
            boolean r14 = r0.read
            o.JsonSerializableSchema$AudioAttributesImplApi26Parcelizer r15 = r0.MediaBrowserCompatItemReceiver
            long r1 = r0.MediaMetadataCompat
            r18 = r1
            r20 = 0
            long r0 = r0.MediaBrowserCompatSearchResultReceiver
            r21 = r0
            r3 = r25
            o.PolymorphicTypeValidator$IconCompatParcelizer r0 = r3.write(r4, r5, r6, r7, r9, r11, r13, r14, r15, r16, r18, r20, r21)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.TokenBufferSerializer.write(int, o.PolymorphicTypeValidator$IconCompatParcelizer, long):o.PolymorphicTypeValidator$IconCompatParcelizer");
    }

    @Override // kotlin.PolymorphicTypeValidator
    public final PolymorphicTypeValidator.AudioAttributesCompatParcelizer RemoteActionCompatParcelizer(int i, PolymorphicTypeValidator.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, boolean z) {
        buildTypeSerializer.RemoteActionCompatParcelizer(i, 1);
        return audioAttributesCompatParcelizer.read(null, z ? IconCompatParcelizer : null, this.AudioAttributesImplBaseParcelizer, -this.MediaBrowserCompatSearchResultReceiver);
    }

    @Override // kotlin.PolymorphicTypeValidator
    public final int read(Object obj) {
        return IconCompatParcelizer.equals(obj) ? 0 : -1;
    }

    @Override // kotlin.PolymorphicTypeValidator
    public final Object write(int i) {
        buildTypeSerializer.RemoteActionCompatParcelizer(i, 1);
        return IconCompatParcelizer;
    }
}
