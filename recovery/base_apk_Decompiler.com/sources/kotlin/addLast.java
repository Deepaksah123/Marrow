package kotlin;

import com.google.android.exoplayer2.C;
import java.util.Arrays;
import kotlin.removeFirstOccurrence;

/* JADX INFO: loaded from: classes2.dex */
public final class addLast implements checkNotEmpty {
    private static final double[] read = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    private final AudioAttributesCompatParcelizer AudioAttributesCompatParcelizer;
    private final boolean[] AudioAttributesImplApi21Parcelizer;
    private nonNullString AudioAttributesImplApi26Parcelizer;
    private long AudioAttributesImplBaseParcelizer;
    private boolean IconCompatParcelizer;
    private boolean MediaBrowserCompatCustomActionResultReceiver;
    private boolean MediaBrowserCompatItemReceiver;
    private boolean MediaBrowserCompatMediaItem;
    private long MediaBrowserCompatSearchResultReceiver;
    private final offer MediaDescriptionCompat;
    private long MediaMetadataCompat;
    private long RatingCompat;
    private long RemoteActionCompatParcelizer;
    private final removeLast handleMediaPlayPauseIfPendingOnHandler;
    private final AsPropertyTypeDeserializer onAddQueueItem;
    private String write;

    public addLast() {
        this(null);
    }

    addLast(removeLast removelast) {
        this.handleMediaPlayPauseIfPendingOnHandler = removelast;
        this.AudioAttributesImplApi21Parcelizer = new boolean[4];
        this.AudioAttributesCompatParcelizer = new AudioAttributesCompatParcelizer();
        if (removelast != null) {
            this.MediaDescriptionCompat = new offer(178);
            this.onAddQueueItem = new AsPropertyTypeDeserializer();
        } else {
            this.MediaDescriptionCompat = null;
            this.onAddQueueItem = null;
        }
        this.AudioAttributesImplBaseParcelizer = C.TIME_UNSET;
        this.RatingCompat = C.TIME_UNSET;
    }

    @Override // kotlin.checkNotEmpty
    public final void write() {
        noTypeInfoBuilder.read(this.AudioAttributesImplApi21Parcelizer);
        this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer();
        offer offerVar = this.MediaDescriptionCompat;
        if (offerVar != null) {
            offerVar.write();
        }
        this.MediaBrowserCompatSearchResultReceiver = 0L;
        this.MediaBrowserCompatMediaItem = false;
        this.AudioAttributesImplBaseParcelizer = C.TIME_UNSET;
        this.RatingCompat = C.TIME_UNSET;
    }

    @Override // kotlin.checkNotEmpty
    public final void write(findRawSuperTypes findrawsupertypes, removeFirstOccurrence.write writeVar) {
        writeVar.read();
        this.write = writeVar.IconCompatParcelizer();
        this.AudioAttributesImplApi26Parcelizer = findrawsupertypes.IconCompatParcelizer(writeVar.write(), 2);
        removeLast removelast = this.handleMediaPlayPauseIfPendingOnHandler;
        if (removelast != null) {
            removelast.write(findrawsupertypes, writeVar);
        }
    }

    @Override // kotlin.checkNotEmpty
    public final void IconCompatParcelizer(long j, int i) {
        this.AudioAttributesImplBaseParcelizer = j;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0142  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // kotlin.checkNotEmpty
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void read(kotlin.AsPropertyTypeDeserializer r21) {
        /*
            Method dump skipped, instruction units count: 328
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.addLast.read(o.AsPropertyTypeDeserializer):void");
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // kotlin.checkNotEmpty
    public final void write(boolean z) {
        buildTypeSerializer.AudioAttributesCompatParcelizer(this.AudioAttributesImplApi26Parcelizer);
        if (z) {
            boolean z2 = this.MediaBrowserCompatItemReceiver;
            this.AudioAttributesImplApi26Parcelizer.IconCompatParcelizer(this.RatingCompat, z2 ? 1 : 0, (int) (this.MediaBrowserCompatSearchResultReceiver - this.MediaMetadataCompat), 0, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static android.util.Pair<kotlin.C0170format, java.lang.Long> write(o.addLast.AudioAttributesCompatParcelizer r8, java.lang.String r9) {
        /*
            byte[] r0 = r8.write
            int r1 = r8.RemoteActionCompatParcelizer
            byte[] r0 = java.util.Arrays.copyOf(r0, r1)
            r1 = 4
            r2 = r0[r1]
            r3 = 5
            r4 = r0[r3]
            r5 = 6
            r5 = r0[r5]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << r1
            r6 = r4 & 255(0xff, float:3.57E-43)
            int r6 = r6 >> r1
            r2 = r2 | r6
            r4 = r4 & 15
            int r4 = r4 << 8
            r5 = r5 & 255(0xff, float:3.57E-43)
            r4 = r4 | r5
            r5 = 7
            r6 = r0[r5]
            r6 = r6 & 240(0xf0, float:3.36E-43)
            int r6 = r6 >> r1
            r7 = 2
            if (r6 == r7) goto L3c
            r7 = 3
            if (r6 == r7) goto L36
            if (r6 == r1) goto L30
            r1 = 1065353216(0x3f800000, float:1.0)
            goto L43
        L30:
            int r1 = r4 * 121
            float r1 = (float) r1
            int r6 = r2 * 100
            goto L41
        L36:
            int r1 = r4 << 4
            float r1 = (float) r1
            int r6 = r2 * 9
            goto L41
        L3c:
            int r1 = r4 << 2
            float r1 = (float) r1
            int r6 = r2 * 3
        L41:
            float r6 = (float) r6
            float r1 = r1 / r6
        L43:
            o.format$RemoteActionCompatParcelizer r6 = new o.format$RemoteActionCompatParcelizer
            r6.<init>()
            o.format$RemoteActionCompatParcelizer r9 = r6.AudioAttributesCompatParcelizer(r9)
            java.lang.String r6 = "video/mpeg2"
            o.format$RemoteActionCompatParcelizer r9 = r9.AudioAttributesImplApi26Parcelizer(r6)
            o.format$RemoteActionCompatParcelizer r9 = r9.onFastForward(r2)
            o.format$RemoteActionCompatParcelizer r9 = r9.MediaBrowserCompatItemReceiver(r4)
            o.format$RemoteActionCompatParcelizer r9 = r9.write(r1)
            java.util.List r1 = java.util.Collections.singletonList(r0)
            o.format$RemoteActionCompatParcelizer r9 = r9.RemoteActionCompatParcelizer(r1)
            o.format r9 = r9.IconCompatParcelizer()
            r1 = r0[r5]
            r1 = r1 & 15
            int r1 = r1 + (-1)
            if (r1 < 0) goto L97
            double[] r2 = kotlin.addLast.read
            int r4 = r2.length
            if (r1 >= r4) goto L97
            r1 = r2[r1]
            int r8 = r8.IconCompatParcelizer
            int r8 = r8 + 9
            r8 = r0[r8]
            r0 = r8 & 96
            int r0 = r0 >> r3
            r8 = r8 & 31
            if (r0 == r8) goto L8f
            double r3 = (double) r0
            r5 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r3 = r3 + r5
            int r8 = r8 + 1
            double r5 = (double) r8
            double r3 = r3 / r5
            double r1 = r1 * r3
        L8f:
            r3 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            double r3 = r3 / r1
            long r0 = (long) r3
            goto L99
        L97:
            r0 = 0
        L99:
            java.lang.Long r8 = java.lang.Long.valueOf(r0)
            android.util.Pair r8 = android.util.Pair.create(r9, r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.addLast.write(o.addLast$AudioAttributesCompatParcelizer, java.lang.String):android.util.Pair");
    }

    static final class AudioAttributesCompatParcelizer {
        private static final byte[] read = {0, 0, 1};
        private boolean AudioAttributesCompatParcelizer;
        public int IconCompatParcelizer;
        public int RemoteActionCompatParcelizer;
        public byte[] write = new byte[128];

        public final void AudioAttributesCompatParcelizer() {
            this.AudioAttributesCompatParcelizer = false;
            this.RemoteActionCompatParcelizer = 0;
            this.IconCompatParcelizer = 0;
        }

        public final boolean RemoteActionCompatParcelizer(int i, int i2) {
            if (this.AudioAttributesCompatParcelizer) {
                int i3 = this.RemoteActionCompatParcelizer - i2;
                this.RemoteActionCompatParcelizer = i3;
                if (this.IconCompatParcelizer == 0 && i == 181) {
                    this.IconCompatParcelizer = i3;
                } else {
                    this.AudioAttributesCompatParcelizer = false;
                    return true;
                }
            } else if (i == 179) {
                this.AudioAttributesCompatParcelizer = true;
            }
            byte[] bArr = read;
            AudioAttributesCompatParcelizer(bArr, 0, bArr.length);
            return false;
        }

        public final void AudioAttributesCompatParcelizer(byte[] bArr, int i, int i2) {
            if (this.AudioAttributesCompatParcelizer) {
                int i3 = i2 - i;
                byte[] bArr2 = this.write;
                int length = bArr2.length;
                int i4 = this.RemoteActionCompatParcelizer + i3;
                if (length < i4) {
                    this.write = Arrays.copyOf(bArr2, i4 << 1);
                }
                System.arraycopy(bArr, i, this.write, this.RemoteActionCompatParcelizer, i3);
                this.RemoteActionCompatParcelizer += i3;
            }
        }
    }
}
