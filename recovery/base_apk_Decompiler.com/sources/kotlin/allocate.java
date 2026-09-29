package kotlin;

import com.google.android.gms.auth.api.proxy.AuthApiStatusCodes;
import in.juspay.hypersdk.core.AndroidInterface$$ExternalSyntheticLambda4;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0007\u0004\u0005\u0006\u0007\b\t\nB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0007\u000b\f\r\u000e\u000f\u0010\u0011"}, d2 = {"Lo/allocate;", "", "<init>", "()V", "MediaBrowserCompatCustomActionResultReceiver", "AudioAttributesCompatParcelizer", "RemoteActionCompatParcelizer", "MediaBrowserCompatItemReceiver", "read", "write", "IconCompatParcelizer", "Lo/allocate$read;", "Lo/allocate$write;", "Lo/allocate$IconCompatParcelizer;", "Lo/allocate$RemoteActionCompatParcelizer;", "Lo/allocate$AudioAttributesCompatParcelizer;", "Lo/allocate$MediaBrowserCompatItemReceiver;", "Lo/allocate$MediaBrowserCompatCustomActionResultReceiver;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class allocate {
    private allocate() {
    }

    public static final class MediaBrowserCompatCustomActionResultReceiver extends allocate {
        private static int AudioAttributesCompatParcelizer = 0;
        private static int IconCompatParcelizer = 1;
        private final AllocatorAllocationNode RemoteActionCompatParcelizer;

        public static /* synthetic */ Object RemoteActionCompatParcelizer(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
            int i7 = (~((~i6) | i4)) | (~(i4 | i2));
            int i8 = (~i4) | (~i2);
            int i9 = i7 | (~(i8 | i6));
            int i10 = (~i8) | i6;
            int i11 = ~(i2 | i6);
            int i12 = i6 + i4 + i3 + ((-417414852) * i) + (1247522396 * i5);
            int i13 = i12 * i12;
            int i14 = (i6 * (-1219797419)) + 1526988800 + ((-1219797419) * i4) + (825712212 * i9) + ((-1651424424) * i10) + ((-825712212) * i11) + ((-2045509632) * i3) + ((-2135949312) * i) + ((-953155584) * i5) + ((-430374912) * i13);
            int i15 = ((i6 * 184508743) - 476012450) + (i4 * 184508743) + (i9 * (-996)) + (i10 * 1992) + (i11 * 996) + (i3 * 184509739) + (i * (-953474796)) + (i5 * (-288057996)) + (i13 * (-839712768));
            int i16 = i14 + (i15 * i15 * 1709113344);
            return i16 != 1 ? i16 != 2 ? i16 != 3 ? RemoteActionCompatParcelizer(objArr) : read(objArr) : write(objArr) : IconCompatParcelizer(objArr);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MediaBrowserCompatCustomActionResultReceiver(AllocatorAllocationNode allocatorAllocationNode) {
            super(null);
            toMagicModuleMetaRepoModel.write(allocatorAllocationNode, "");
            this.RemoteActionCompatParcelizer = allocatorAllocationNode;
        }

        private static /* synthetic */ Object IconCompatParcelizer(Object[] objArr) {
            MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiver = (MediaBrowserCompatCustomActionResultReceiver) objArr[0];
            int i = 2 % 2;
            int i2 = IconCompatParcelizer;
            int i3 = i2 & 115;
            int i4 = -(-((i2 ^ 115) | i3));
            int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
            int i6 = i5 % 128;
            AudioAttributesCompatParcelizer = i6;
            int i7 = i5 % 2;
            AllocatorAllocationNode allocatorAllocationNode = mediaBrowserCompatCustomActionResultReceiver.RemoteActionCompatParcelizer;
            int i8 = i6 + 85;
            IconCompatParcelizer = i8 % 128;
            int i9 = i8 % 2;
            return allocatorAllocationNode;
        }

        public final boolean equals(Object obj) {
            int iRemoteActionCompatParcelizer = AuthApiStatusCodes.RemoteActionCompatParcelizer();
            int iRemoteActionCompatParcelizer2 = AuthApiStatusCodes.RemoteActionCompatParcelizer();
            return ((Boolean) RemoteActionCompatParcelizer(AuthApiStatusCodes.RemoteActionCompatParcelizer(), iRemoteActionCompatParcelizer, iRemoteActionCompatParcelizer2, new Object[]{this, obj}, -92852173, AuthApiStatusCodes.RemoteActionCompatParcelizer(), 92852176)).booleanValue();
        }

        public final AllocatorAllocationNode RemoteActionCompatParcelizer() {
            int iRemoteActionCompatParcelizer = AuthApiStatusCodes.RemoteActionCompatParcelizer();
            int iRemoteActionCompatParcelizer2 = AuthApiStatusCodes.RemoteActionCompatParcelizer();
            return (AllocatorAllocationNode) RemoteActionCompatParcelizer(AuthApiStatusCodes.RemoteActionCompatParcelizer(), iRemoteActionCompatParcelizer, iRemoteActionCompatParcelizer2, new Object[]{this}, -766262347, AuthApiStatusCodes.RemoteActionCompatParcelizer(), 766262348);
        }

        public final int hashCode() {
            int iRemoteActionCompatParcelizer = AuthApiStatusCodes.RemoteActionCompatParcelizer();
            int iRemoteActionCompatParcelizer2 = AuthApiStatusCodes.RemoteActionCompatParcelizer();
            return ((Integer) RemoteActionCompatParcelizer(AuthApiStatusCodes.RemoteActionCompatParcelizer(), iRemoteActionCompatParcelizer, iRemoteActionCompatParcelizer2, new Object[]{this}, 1520154625, AuthApiStatusCodes.RemoteActionCompatParcelizer(), -1520154623)).intValue();
        }

        public final String toString() {
            int iRemoteActionCompatParcelizer = AuthApiStatusCodes.RemoteActionCompatParcelizer();
            int iRemoteActionCompatParcelizer2 = AuthApiStatusCodes.RemoteActionCompatParcelizer();
            return (String) RemoteActionCompatParcelizer(AuthApiStatusCodes.RemoteActionCompatParcelizer(), iRemoteActionCompatParcelizer, iRemoteActionCompatParcelizer2, new Object[]{this}, -1108151665, AuthApiStatusCodes.RemoteActionCompatParcelizer(), 1108151665);
        }

        private static /* synthetic */ Object RemoteActionCompatParcelizer(Object[] objArr) {
            int i = 2 % 2;
            AllocatorAllocationNode allocatorAllocationNode = ((MediaBrowserCompatCustomActionResultReceiver) objArr[0]).RemoteActionCompatParcelizer;
            StringBuilder sb = new StringBuilder("TaskStarted(task=");
            int i2 = AudioAttributesCompatParcelizer;
            int i3 = i2 & 71;
            int i4 = i3 + ((i2 ^ 71) | i3);
            IconCompatParcelizer = i4 % 128;
            int i5 = i4 % 2;
            sb.append(allocatorAllocationNode);
            sb.append(")");
            String string = sb.toString();
            int i6 = IconCompatParcelizer;
            int i7 = i6 & 117;
            int i8 = ((i6 ^ 117) | i7) << 1;
            int i9 = -((i6 | 117) & (~i7));
            int i10 = (i8 ^ i9) + ((i9 & i8) << 1);
            AudioAttributesCompatParcelizer = i10 % 128;
            int i11 = i10 % 2;
            return string;
        }

        private static /* synthetic */ Object write(Object[] objArr) {
            MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiver = (MediaBrowserCompatCustomActionResultReceiver) objArr[0];
            int i = 2 % 2;
            int i2 = AudioAttributesCompatParcelizer;
            int i3 = i2 & 17;
            int i4 = ((((i2 ^ 17) | i3) << 1) - (~(-((i2 | 17) & (~i3))))) - 1;
            IconCompatParcelizer = i4 % 128;
            int i5 = i4 % 2;
            AllocatorAllocationNode allocatorAllocationNode = mediaBrowserCompatCustomActionResultReceiver.RemoteActionCompatParcelizer;
            if (i5 != 0) {
                return Integer.valueOf(allocatorAllocationNode.hashCode());
            }
            allocatorAllocationNode.hashCode();
            throw null;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0037, code lost:
        
            return true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0038, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x003b, code lost:
        
            if ((r9 instanceof o.allocate.MediaBrowserCompatCustomActionResultReceiver) != false) goto L20;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x003d, code lost:
        
            r9 = r5 ^ 63;
            r1 = -(-((r5 & 63) << 1));
            r3 = (r9 ^ r1) + ((r9 & r1) << 1);
            r9 = r3 % 128;
            o.allocate.MediaBrowserCompatCustomActionResultReceiver.AudioAttributesCompatParcelizer = r9;
            r3 = r3 % 2;
            r1 = r9 | 99;
            r2 = (r1 << 1) - ((~(r9 & 99)) & r1);
            o.allocate.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer = r2 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x005c, code lost:
        
            if ((r2 % 2) == 0) goto L18;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0062, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0063, code lost:
        
            r8.hashCode();
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0066, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x006d, code lost:
        
            if (r1.RemoteActionCompatParcelizer == ((o.allocate.MediaBrowserCompatCustomActionResultReceiver) r9).RemoteActionCompatParcelizer) goto L31;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x006f, code lost:
        
            r9 = r7 ^ 25;
            r1 = (r7 & 25) << 1;
            r3 = ((r9 | r1) << 1) - (r9 ^ r1);
            r9 = r3 % 128;
            o.allocate.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer = r9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x007e, code lost:
        
            if ((r3 % 2) != 0) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0080, code lost:
        
            r0 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0081, code lost:
        
            r1 = ((r9 | 7) << 1) - (r9 ^ 7);
            o.allocate.MediaBrowserCompatCustomActionResultReceiver.AudioAttributesCompatParcelizer = r1 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x008c, code lost:
        
            if ((r1 % 2) != 0) goto L29;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0092, code lost:
        
            return java.lang.Boolean.valueOf(r0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x0093, code lost:
        
            r8.hashCode();
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x0096, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0097, code lost:
        
            r9 = ((r7 & 77) - (~(r7 | 77))) - 1;
            o.allocate.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer = r9 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x00a3, code lost:
        
            if ((r9 % 2) != 0) goto L34;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x00a5, code lost:
        
            r9 = 47 / 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x00a8, code lost:
        
            return true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0025, code lost:
        
            if (r1 == r9) goto L8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x0028, code lost:
        
            if (r1 == r9) goto L8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x002a, code lost:
        
            r9 = ((r5 & 68) + (r5 | 68)) - 1;
            o.allocate.MediaBrowserCompatCustomActionResultReceiver.AudioAttributesCompatParcelizer = r9 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0035, code lost:
        
            if ((r9 % 2) != 0) goto L11;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static /* synthetic */ java.lang.Object read(java.lang.Object[] r9) {
            /*
                r0 = 0
                r1 = r9[r0]
                o.allocate$MediaBrowserCompatCustomActionResultReceiver r1 = (o.allocate.MediaBrowserCompatCustomActionResultReceiver) r1
                r2 = 1
                java.lang.Boolean r3 = java.lang.Boolean.valueOf(r2)
                r9 = r9[r2]
                r4 = r9
                java.lang.Object r4 = (java.lang.Object) r4
                r4 = 2
                int r5 = r4 % r4
                int r5 = o.allocate.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer
                r6 = r5 | 1
                int r6 = r6 << r2
                r7 = r5 ^ 1
                int r6 = r6 - r7
                int r7 = r6 % 128
                o.allocate.MediaBrowserCompatCustomActionResultReceiver.AudioAttributesCompatParcelizer = r7
                int r6 = r6 % r4
                r8 = 0
                if (r6 == 0) goto L28
                r6 = 60
                int r6 = r6 / r0
                if (r1 != r9) goto L39
                goto L2a
            L28:
                if (r1 != r9) goto L39
            L2a:
                r9 = r5 & 68
                r0 = r5 | 68
                int r9 = r9 + r0
                int r9 = r9 - r2
                int r0 = r9 % 128
                o.allocate.MediaBrowserCompatCustomActionResultReceiver.AudioAttributesCompatParcelizer = r0
                int r9 = r9 % r4
                if (r9 != 0) goto L38
                return r3
            L38:
                throw r8
            L39:
                boolean r6 = r9 instanceof o.allocate.MediaBrowserCompatCustomActionResultReceiver
                if (r6 != 0) goto L67
                r9 = r5 ^ 63
                r1 = r5 & 63
                int r1 = r1 << r2
                int r1 = -r1
                int r1 = -r1
                r3 = r9 ^ r1
                r9 = r9 & r1
                int r9 = r9 << r2
                int r3 = r3 + r9
                int r9 = r3 % 128
                o.allocate.MediaBrowserCompatCustomActionResultReceiver.AudioAttributesCompatParcelizer = r9
                int r3 = r3 % r4
                r1 = r9 | 99
                int r2 = r1 << 1
                r9 = r9 & 99
                int r9 = ~r9
                r9 = r9 & r1
                int r2 = r2 - r9
                int r9 = r2 % 128
                o.allocate.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer = r9
                int r2 = r2 % r4
                if (r2 == 0) goto L63
                java.lang.Boolean r9 = java.lang.Boolean.valueOf(r0)
                return r9
            L63:
                r8.hashCode()
                throw r8
            L67:
                o.allocate$MediaBrowserCompatCustomActionResultReceiver r9 = (o.allocate.MediaBrowserCompatCustomActionResultReceiver) r9
                o.AllocatorAllocationNode r1 = r1.RemoteActionCompatParcelizer
                o.AllocatorAllocationNode r9 = r9.RemoteActionCompatParcelizer
                if (r1 == r9) goto L97
                r9 = r7 ^ 25
                r1 = r7 & 25
                int r1 = r1 << r2
                r3 = r9 | r1
                int r3 = r3 << r2
                r9 = r9 ^ r1
                int r3 = r3 - r9
                int r9 = r3 % 128
                o.allocate.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer = r9
                int r3 = r3 % r4
                if (r3 != 0) goto L81
                r0 = r2
            L81:
                r1 = r9 | 7
                int r1 = r1 << r2
                r9 = r9 ^ 7
                int r1 = r1 - r9
                int r9 = r1 % 128
                o.allocate.MediaBrowserCompatCustomActionResultReceiver.AudioAttributesCompatParcelizer = r9
                int r1 = r1 % r4
                if (r1 != 0) goto L93
                java.lang.Boolean r9 = java.lang.Boolean.valueOf(r0)
                return r9
            L93:
                r8.hashCode()
                throw r8
            L97:
                r9 = r7 & 77
                r1 = r7 | 77
                int r1 = ~r1
                int r9 = r9 - r1
                int r9 = r9 - r2
                int r1 = r9 % 128
                o.allocate.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer = r1
                int r9 = r9 % r4
                if (r9 != 0) goto La8
                r9 = 47
                int r9 = r9 / r0
            La8:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: o.allocate.MediaBrowserCompatCustomActionResultReceiver.read(java.lang.Object[]):java.lang.Object");
        }
    }

    public /* synthetic */ allocate(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this();
    }

    public static final class AudioAttributesCompatParcelizer extends allocate {
        private static int IconCompatParcelizer = 0;
        private static int read = 1;
        private final int RemoteActionCompatParcelizer;
        private final AllocatorAllocationNode write;

        public static /* synthetic */ Object AudioAttributesCompatParcelizer(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
            int i7 = ~i4;
            int i8 = ~(i7 | i);
            int i9 = ~i;
            int i10 = i8 | (~(i9 | i5));
            int i11 = ~(i9 | i4);
            int i12 = i10 | i11;
            int i13 = ~i5;
            int i14 = i11 | (~(i13 | i4));
            int i15 = (~(i | i7 | i13)) | (~(i13 | i9 | i4));
            int i16 = i5 + i4 + i6 + ((-1369571145) * i3) + ((-720088171) * i2);
            int i17 = i16 * i16;
            int i18 = (((-954023988) * i5) - 252706816) + ((-260227018) * i4) + ((-346898485) * i12) + (i14 * 346898485) + (346898485 * i15) + ((-607125504) * i6) + (565182464 * i3) + (1611661312 * i2) + ((-409206784) * i17);
            int i19 = ((i5 * (-1931095572)) - 2087550970) + (i4 * (-1931094842)) + (i12 * (-365)) + (i14 * 365) + (i15 * 365) + (i6 * (-1931095207)) + (i3 * (-789048161)) + (i2 * 356376013) + (i17 * 423362560);
            int i20 = i18 + (i19 * i19 * (-1901854720));
            return i20 != 1 ? i20 != 2 ? i20 != 3 ? i20 != 4 ? write(objArr) : RemoteActionCompatParcelizer(objArr) : IconCompatParcelizer(objArr) : AudioAttributesCompatParcelizer(objArr) : read(objArr);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AudioAttributesCompatParcelizer(AllocatorAllocationNode allocatorAllocationNode, int i) {
            super(null);
            toMagicModuleMetaRepoModel.write(allocatorAllocationNode, "");
            this.write = allocatorAllocationNode;
            this.RemoteActionCompatParcelizer = i;
        }

        private static /* synthetic */ Object AudioAttributesCompatParcelizer(Object[] objArr) {
            AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = (AudioAttributesCompatParcelizer) objArr[0];
            int i = 2 % 2;
            int i2 = IconCompatParcelizer;
            int i3 = i2 & 105;
            int i4 = -(-(i2 | 105));
            int i5 = ((i3 | i4) << 1) - (i3 ^ i4);
            read = i5 % 128;
            int i6 = i5 % 2;
            int i7 = audioAttributesCompatParcelizer.RemoteActionCompatParcelizer;
            int i8 = i2 | 69;
            int i9 = i8 << 1;
            int i10 = -((~(i2 & 69)) & i8);
            int i11 = (i9 ^ i10) + ((i10 & i9) << 1);
            read = i11 % 128;
            int i12 = i11 % 2;
            return Integer.valueOf(i7);
        }

        private static /* synthetic */ Object IconCompatParcelizer(Object[] objArr) {
            AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = (AudioAttributesCompatParcelizer) objArr[0];
            int i = 2 % 2;
            int i2 = read;
            int i3 = ((i2 ^ 122) + ((i2 & 122) << 1)) - 1;
            IconCompatParcelizer = i3 % 128;
            int i4 = i3 % 2;
            AllocatorAllocationNode allocatorAllocationNode = audioAttributesCompatParcelizer.write;
            int i5 = i2 & 93;
            int i6 = (((i2 ^ 93) | i5) << 1) - ((i2 | 93) & (~i5));
            IconCompatParcelizer = i6 % 128;
            int i7 = i6 % 2;
            return allocatorAllocationNode;
        }

        public final boolean equals(Object obj) {
            int iRemoteActionCompatParcelizer = AndroidInterface$$ExternalSyntheticLambda4.RemoteActionCompatParcelizer();
            int iRemoteActionCompatParcelizer2 = AndroidInterface$$ExternalSyntheticLambda4.RemoteActionCompatParcelizer();
            int iRemoteActionCompatParcelizer3 = AndroidInterface$$ExternalSyntheticLambda4.RemoteActionCompatParcelizer();
            return ((Boolean) AudioAttributesCompatParcelizer(iRemoteActionCompatParcelizer, AndroidInterface$$ExternalSyntheticLambda4.RemoteActionCompatParcelizer(), iRemoteActionCompatParcelizer3, new Object[]{this, obj}, -1110971307, 1110971311, iRemoteActionCompatParcelizer2)).booleanValue();
        }

        public final int IconCompatParcelizer() {
            int iRemoteActionCompatParcelizer = AndroidInterface$$ExternalSyntheticLambda4.RemoteActionCompatParcelizer();
            int iRemoteActionCompatParcelizer2 = AndroidInterface$$ExternalSyntheticLambda4.RemoteActionCompatParcelizer();
            int iRemoteActionCompatParcelizer3 = AndroidInterface$$ExternalSyntheticLambda4.RemoteActionCompatParcelizer();
            return ((Integer) AudioAttributesCompatParcelizer(iRemoteActionCompatParcelizer, AndroidInterface$$ExternalSyntheticLambda4.RemoteActionCompatParcelizer(), iRemoteActionCompatParcelizer3, new Object[]{this}, -1426211750, 1426211752, iRemoteActionCompatParcelizer2)).intValue();
        }

        public final AllocatorAllocationNode write() {
            int iRemoteActionCompatParcelizer = AndroidInterface$$ExternalSyntheticLambda4.RemoteActionCompatParcelizer();
            int iRemoteActionCompatParcelizer2 = AndroidInterface$$ExternalSyntheticLambda4.RemoteActionCompatParcelizer();
            int iRemoteActionCompatParcelizer3 = AndroidInterface$$ExternalSyntheticLambda4.RemoteActionCompatParcelizer();
            return (AllocatorAllocationNode) AudioAttributesCompatParcelizer(iRemoteActionCompatParcelizer, AndroidInterface$$ExternalSyntheticLambda4.RemoteActionCompatParcelizer(), iRemoteActionCompatParcelizer3, new Object[]{this}, -2121217977, 2121217980, iRemoteActionCompatParcelizer2);
        }

        public final int hashCode() {
            int iRemoteActionCompatParcelizer = AndroidInterface$$ExternalSyntheticLambda4.RemoteActionCompatParcelizer();
            int iRemoteActionCompatParcelizer2 = AndroidInterface$$ExternalSyntheticLambda4.RemoteActionCompatParcelizer();
            int iRemoteActionCompatParcelizer3 = AndroidInterface$$ExternalSyntheticLambda4.RemoteActionCompatParcelizer();
            return ((Integer) AudioAttributesCompatParcelizer(iRemoteActionCompatParcelizer, AndroidInterface$$ExternalSyntheticLambda4.RemoteActionCompatParcelizer(), iRemoteActionCompatParcelizer3, new Object[]{this}, 545800569, -545800569, iRemoteActionCompatParcelizer2)).intValue();
        }

        public final String toString() {
            int iRemoteActionCompatParcelizer = AndroidInterface$$ExternalSyntheticLambda4.RemoteActionCompatParcelizer();
            int iRemoteActionCompatParcelizer2 = AndroidInterface$$ExternalSyntheticLambda4.RemoteActionCompatParcelizer();
            int iRemoteActionCompatParcelizer3 = AndroidInterface$$ExternalSyntheticLambda4.RemoteActionCompatParcelizer();
            return (String) AudioAttributesCompatParcelizer(iRemoteActionCompatParcelizer, AndroidInterface$$ExternalSyntheticLambda4.RemoteActionCompatParcelizer(), iRemoteActionCompatParcelizer3, new Object[]{this}, -1140616181, 1140616182, iRemoteActionCompatParcelizer2);
        }

        private static /* synthetic */ Object write(Object[] objArr) {
            int i;
            AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = (AudioAttributesCompatParcelizer) objArr[0];
            int i2 = 2 % 2;
            int i3 = IconCompatParcelizer;
            int i4 = (i3 & 13) + (i3 | 13);
            read = i4 % 128;
            int i5 = i4 % 2;
            int iHashCode = audioAttributesCompatParcelizer.write.hashCode() * 31;
            int i6 = audioAttributesCompatParcelizer.RemoteActionCompatParcelizer;
            int i7 = read;
            int i8 = (i7 & (-30)) | ((~i7) & 29);
            int i9 = (i7 & 29) << 1;
            int i10 = (i8 ^ i9) + ((i9 & i8) << 1);
            IconCompatParcelizer = i10 % 128;
            int i11 = i10 % 2;
            int iHashCode2 = Integer.hashCode(i6);
            if (i11 != 0) {
                i = iHashCode >> iHashCode2;
            } else {
                int i12 = iHashCode | iHashCode2;
                int i13 = i12 << 1;
                int i14 = -((~(iHashCode2 & iHashCode)) & i12);
                i = ((i13 | i14) << 1) - (i14 ^ i13);
            }
            return Integer.valueOf(i);
        }

        private static /* synthetic */ Object read(Object[] objArr) {
            AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = (AudioAttributesCompatParcelizer) objArr[0];
            int i = 2 % 2;
            AllocatorAllocationNode allocatorAllocationNode = audioAttributesCompatParcelizer.write;
            int i2 = audioAttributesCompatParcelizer.RemoteActionCompatParcelizer;
            StringBuilder sb = new StringBuilder("TaskPageCompleted(task=");
            int i3 = read + 23;
            IconCompatParcelizer = i3 % 128;
            int i4 = i3 % 2;
            sb.append(allocatorAllocationNode);
            sb.append(", page=");
            if (i4 != 0) {
                sb.append(i2);
                sb.append(")");
                throw null;
            }
            sb.append(i2);
            sb.append(")");
            String string = sb.toString();
            int i5 = read + 23;
            IconCompatParcelizer = i5 % 128;
            int i6 = i5 % 2;
            return string;
        }

        private static /* synthetic */ Object RemoteActionCompatParcelizer(Object[] objArr) {
            AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = (AudioAttributesCompatParcelizer) objArr[0];
            Object obj = objArr[1];
            int i = 2 % 2;
            int i2 = read;
            int i3 = i2 & 35;
            int i4 = (((~i3) & (i2 | 35)) - (~(-(-(i3 << 1))))) - 1;
            int i5 = i4 % 128;
            IconCompatParcelizer = i5;
            Object obj2 = null;
            if (i4 % 2 != 0) {
                throw null;
            }
            if (audioAttributesCompatParcelizer == obj) {
                int i6 = i5 + 103;
                read = i6 % 128;
                if (i6 % 2 != 0) {
                    return true;
                }
                obj2.hashCode();
                throw null;
            }
            if (!(obj instanceof AudioAttributesCompatParcelizer)) {
                int i7 = i2 + 37;
                IconCompatParcelizer = i7 % 128;
                int i8 = i7 % 2;
                int i9 = (i2 & (-126)) | ((~i2) & 125);
                int i10 = -(-((i2 & 125) << 1));
                int i11 = (i9 ^ i10) + ((i9 & i10) << 1);
                IconCompatParcelizer = i11 % 128;
                int i12 = i11 % 2;
                return false;
            }
            AudioAttributesCompatParcelizer audioAttributesCompatParcelizer2 = (AudioAttributesCompatParcelizer) obj;
            if (audioAttributesCompatParcelizer.write != audioAttributesCompatParcelizer2.write) {
                int i13 = i5 & 97;
                int i14 = (i5 ^ 97) | i13;
                int i15 = ((i13 | i14) << 1) - (i13 ^ i14);
                read = i15 % 128;
                return Boolean.valueOf(i15 % 2 == 0);
            }
            if (audioAttributesCompatParcelizer.RemoteActionCompatParcelizer == audioAttributesCompatParcelizer2.RemoteActionCompatParcelizer) {
                int i16 = i5 ^ 85;
                int i17 = -(-((i5 & 85) << 1));
                int i18 = (i16 ^ i17) + ((i16 & i17) << 1);
                read = i18 % 128;
                if (i18 % 2 != 0) {
                    return true;
                }
                obj2.hashCode();
                throw null;
            }
            int i19 = (i5 ^ 37) + ((i5 & 37) << 1);
            int i20 = i19 % 128;
            read = i20;
            int i21 = i19 % 2;
            int i22 = (-2) - ((((i20 | 90) << 1) - (i20 ^ 90)) ^ (-1));
            IconCompatParcelizer = i22 % 128;
            if (i22 % 2 == 0) {
                return false;
            }
            throw null;
        }
    }

    public static final class RemoteActionCompatParcelizer extends allocate {
        private static int RemoteActionCompatParcelizer = 0;
        private static int write = 1;
        private final AllocatorAllocationNode read;

        public static /* synthetic */ Object read(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
            int i7 = ~i2;
            int i8 = ~(i7 | i3);
            int i9 = ~i4;
            int i10 = ~i3;
            int i11 = i8 | (~(i9 | i10 | i2));
            int i12 = (~(i3 | i9 | i2)) | (~(i10 | i7));
            int i13 = ~(i7 | i9);
            int i14 = i4 + i2 + i5 + (762713021 * i6) + (1579510587 * i);
            int i15 = i14 * i14;
            int i16 = ((i4 * (-1846875272)) - 1480523776) + ((-1846875272) * i2) + (i11 * (-1613556599)) + (i12 * (-1613556599)) + ((-1613556599) * i13) + (834535424 * i5) + ((-750387200) * i6) + ((-523632640) * i) + ((-1971257344) * i15);
            int i17 = ((i4 * (-1364308824)) - 1074288667) + (i2 * (-1364308824)) + (i11 * 659) + (i12 * 659) + (i13 * 659) + (i5 * (-1364308165)) + (i6 * (-893132913)) + (i * 986770329) + (i15 * (-1162149888));
            int i18 = i16 + (i17 * i17 * (-1529413632));
            return i18 != 1 ? i18 != 2 ? i18 != 3 ? IconCompatParcelizer(objArr) : read(objArr) : RemoteActionCompatParcelizer(objArr) : AudioAttributesCompatParcelizer(objArr);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RemoteActionCompatParcelizer(AllocatorAllocationNode allocatorAllocationNode) {
            super(null);
            toMagicModuleMetaRepoModel.write(allocatorAllocationNode, "");
            this.read = allocatorAllocationNode;
        }

        private static /* synthetic */ Object read(Object[] objArr) {
            RemoteActionCompatParcelizer remoteActionCompatParcelizer = (RemoteActionCompatParcelizer) objArr[0];
            int i = 2 % 2;
            int i2 = RemoteActionCompatParcelizer;
            int i3 = ((i2 ^ 59) | (i2 & 59)) << 1;
            int i4 = -((i2 & (-60)) | ((~i2) & 59));
            int i5 = (i3 ^ i4) + ((i3 & i4) << 1);
            write = i5 % 128;
            int i6 = i5 % 2;
            AllocatorAllocationNode allocatorAllocationNode = remoteActionCompatParcelizer.read;
            if (i6 == 0) {
                int i7 = 90 / 0;
            }
            int i8 = i2 + 118;
            int i9 = (i8 ^ (-1)) + (i8 << 1);
            write = i9 % 128;
            int i10 = i9 % 2;
            return allocatorAllocationNode;
        }

        public final boolean equals(Object obj) {
            int iWrite = HlsSampleStream.write();
            int iWrite2 = HlsSampleStream.write();
            int iWrite3 = HlsSampleStream.write();
            return ((Boolean) read(HlsSampleStream.write(), -702782617, iWrite, 702782618, iWrite2, iWrite3, new Object[]{this, obj})).booleanValue();
        }

        public final AllocatorAllocationNode read() {
            int iWrite = HlsSampleStream.write();
            int iWrite2 = HlsSampleStream.write();
            int iWrite3 = HlsSampleStream.write();
            return (AllocatorAllocationNode) read(HlsSampleStream.write(), -92781229, iWrite, 92781232, iWrite2, iWrite3, new Object[]{this});
        }

        public final int hashCode() {
            int iWrite = HlsSampleStream.write();
            int iWrite2 = HlsSampleStream.write();
            int iWrite3 = HlsSampleStream.write();
            return ((Integer) read(HlsSampleStream.write(), -1170629299, iWrite, 1170629301, iWrite2, iWrite3, new Object[]{this})).intValue();
        }

        public final String toString() {
            int iWrite = HlsSampleStream.write();
            int iWrite2 = HlsSampleStream.write();
            int iWrite3 = HlsSampleStream.write();
            return (String) read(HlsSampleStream.write(), -1169199152, iWrite, 1169199152, iWrite2, iWrite3, new Object[]{this});
        }

        private static /* synthetic */ Object IconCompatParcelizer(Object[] objArr) {
            int i = 2 % 2;
            AllocatorAllocationNode allocatorAllocationNode = ((RemoteActionCompatParcelizer) objArr[0]).read;
            StringBuilder sb = new StringBuilder("TaskCompleted(task=");
            int i2 = RemoteActionCompatParcelizer;
            int i3 = (i2 & 7) + (i2 | 7);
            write = i3 % 128;
            int i4 = i3 % 2;
            sb.append(allocatorAllocationNode);
            sb.append(")");
            String string = sb.toString();
            int i5 = RemoteActionCompatParcelizer + 53;
            write = i5 % 128;
            if (i5 % 2 != 0) {
                return string;
            }
            throw null;
        }

        private static /* synthetic */ Object AudioAttributesCompatParcelizer(Object[] objArr) {
            RemoteActionCompatParcelizer remoteActionCompatParcelizer = (RemoteActionCompatParcelizer) objArr[0];
            Object obj = objArr[1];
            int i = 2 % 2;
            int i2 = write;
            int i3 = (i2 ^ 25) + ((i2 & 25) << 1);
            int i4 = i3 % 128;
            RemoteActionCompatParcelizer = i4;
            if (i3 % 2 != 0) {
                throw null;
            }
            if (remoteActionCompatParcelizer == obj) {
                int i5 = i4 & 67;
                int i6 = (~i5) & (i4 | 67);
                int i7 = -(-(i5 << 1));
                int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
                write = i8 % 128;
                int i9 = i8 % 2;
                int i10 = i4 & 53;
                int i11 = ((((i4 ^ 53) | i10) << 1) - (~(-((~i10) & (i4 | 53))))) - 1;
                write = i11 % 128;
                int i12 = i11 % 2;
                return true;
            }
            if (!(obj instanceof RemoteActionCompatParcelizer)) {
                int i13 = ((((i2 ^ 117) | (i2 & 117)) << 1) - (~(-((i2 & (-118)) | ((~i2) & 117))))) - 1;
                int i14 = i13 % 128;
                RemoteActionCompatParcelizer = i14;
                int i15 = i13 % 2;
                int i16 = i14 & 113;
                int i17 = -(-((i14 ^ 113) | i16));
                int i18 = (i16 & i17) + (i16 | i17);
                write = i18 % 128;
                int i19 = i18 % 2;
                return false;
            }
            if (remoteActionCompatParcelizer.read == ((RemoteActionCompatParcelizer) obj).read) {
                int i20 = ((i2 | 95) << 1) - (i2 ^ 95);
                RemoteActionCompatParcelizer = i20 % 128;
                if (i20 % 2 != 0) {
                    int i21 = 61 / 0;
                }
                return true;
            }
            int i22 = (i4 & (-46)) | ((~i4) & 45);
            int i23 = (i4 & 45) << 1;
            int i24 = (i22 ^ i23) + ((i22 & i23) << 1);
            int i25 = i24 % 128;
            write = i25;
            int i26 = i24 % 2;
            int i27 = (i25 & 91) + (i25 | 91);
            RemoteActionCompatParcelizer = i27 % 128;
            if (i27 % 2 == 0) {
                return false;
            }
            throw null;
        }

        private static /* synthetic */ Object RemoteActionCompatParcelizer(Object[] objArr) {
            RemoteActionCompatParcelizer remoteActionCompatParcelizer = (RemoteActionCompatParcelizer) objArr[0];
            int i = 2 % 2;
            int i2 = write;
            int i3 = i2 & 11;
            int i4 = (i2 ^ 11) | i3;
            int i5 = (i3 & i4) + (i4 | i3);
            RemoteActionCompatParcelizer = i5 % 128;
            int i6 = i5 % 2;
            int iHashCode = remoteActionCompatParcelizer.read.hashCode();
            if (i6 != 0) {
                int i7 = 0 / 0;
            }
            return Integer.valueOf(iHashCode);
        }
    }

    public static final class MediaBrowserCompatItemReceiver extends allocate {
        private static int IconCompatParcelizer = 1;
        private static int RemoteActionCompatParcelizer;
        private final AllocatorAllocationNode write;

        public static /* synthetic */ Object IconCompatParcelizer(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
            int i7 = i | i6;
            int i8 = ~i4;
            int i9 = i7 | i8;
            int i10 = ~(i8 | i);
            int i11 = (~i7) | i10;
            int i12 = i10 | (~((~i) | (~i6)));
            int i13 = i + i6 + i2 + (1699743442 * i5) + (2071835342 * i3);
            int i14 = i13 * i13;
            int i15 = ((i * (-557635572)) - 1375207424) + ((-557635572) * i6) + (i9 * (-2106796043)) + (2106796043 * i11) + ((-2106796043) * i12) + (1630535680 * i2) + ((-648019968) * i5) + ((-1801453568) * i3) + (1296564224 * i14);
            int i16 = ((i * (-355764420)) - 259725689) + (i6 * (-355764420)) + (i9 * 521) + (i11 * (-521)) + (i12 * 521) + (i2 * (-355763899)) + (i5 * 2119243930) + (i3 * (-943812730)) + (i14 * (-597164032));
            int i17 = i15 + (i16 * i16 * 58195968);
            return i17 != 1 ? i17 != 2 ? AudioAttributesCompatParcelizer(objArr) : IconCompatParcelizer(objArr) : write(objArr);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MediaBrowserCompatItemReceiver(AllocatorAllocationNode allocatorAllocationNode) {
            super(null);
            toMagicModuleMetaRepoModel.write(allocatorAllocationNode, "");
            this.write = allocatorAllocationNode;
        }

        public final boolean equals(Object obj) {
            int iOnSetPlaybackSpeed = DefaultDrmSessionExternalSyntheticLambda3.onSetPlaybackSpeed();
            return ((Boolean) IconCompatParcelizer(-532856705, new Object[]{this, obj}, DefaultDrmSessionExternalSyntheticLambda3.onSetPlaybackSpeed(), DefaultDrmSessionExternalSyntheticLambda3.onSetPlaybackSpeed(), iOnSetPlaybackSpeed, DefaultDrmSessionExternalSyntheticLambda3.onSetPlaybackSpeed(), 532856706)).booleanValue();
        }

        public final int hashCode() {
            int iOnSetPlaybackSpeed = DefaultDrmSessionExternalSyntheticLambda3.onSetPlaybackSpeed();
            return ((Integer) IconCompatParcelizer(2074015653, new Object[]{this}, DefaultDrmSessionExternalSyntheticLambda3.onSetPlaybackSpeed(), DefaultDrmSessionExternalSyntheticLambda3.onSetPlaybackSpeed(), iOnSetPlaybackSpeed, DefaultDrmSessionExternalSyntheticLambda3.onSetPlaybackSpeed(), -2074015651)).intValue();
        }

        public final String toString() {
            int iOnSetPlaybackSpeed = DefaultDrmSessionExternalSyntheticLambda3.onSetPlaybackSpeed();
            return (String) IconCompatParcelizer(189257792, new Object[]{this}, DefaultDrmSessionExternalSyntheticLambda3.onSetPlaybackSpeed(), DefaultDrmSessionExternalSyntheticLambda3.onSetPlaybackSpeed(), iOnSetPlaybackSpeed, DefaultDrmSessionExternalSyntheticLambda3.onSetPlaybackSpeed(), -189257792);
        }

        private static /* synthetic */ Object AudioAttributesCompatParcelizer(Object[] objArr) {
            int i = 2 % 2;
            AllocatorAllocationNode allocatorAllocationNode = ((MediaBrowserCompatItemReceiver) objArr[0]).write;
            StringBuilder sb = new StringBuilder("TaskSkipped(task=");
            int i2 = RemoteActionCompatParcelizer;
            int i3 = i2 & 39;
            int i4 = i2 | 39;
            int i5 = (i3 & i4) + (i4 | i3);
            IconCompatParcelizer = i5 % 128;
            int i6 = i5 % 2;
            sb.append(allocatorAllocationNode);
            sb.append(")");
            if (i6 != 0) {
                return sb.toString();
            }
            int i7 = 41 / 0;
            return sb.toString();
        }

        private static /* synthetic */ Object write(Object[] objArr) {
            MediaBrowserCompatItemReceiver mediaBrowserCompatItemReceiver = (MediaBrowserCompatItemReceiver) objArr[0];
            Object obj = objArr[1];
            int i = 2 % 2;
            int i2 = IconCompatParcelizer;
            int i3 = ((i2 ^ 30) + ((i2 & 30) << 1)) - 1;
            int i4 = i3 % 128;
            RemoteActionCompatParcelizer = i4;
            int i5 = i3 % 2;
            if (mediaBrowserCompatItemReceiver == obj) {
                int i6 = i2 & 1;
                int i7 = (((i2 ^ 1) | i6) << 1) - ((~i6) & (i2 | 1));
                int i8 = i7 % 128;
                RemoteActionCompatParcelizer = i8;
                int i9 = i7 % 2;
                int i10 = i8 & 119;
                int i11 = -(-((i8 ^ 119) | i10));
                int i12 = ((i10 | i11) << 1) - (i10 ^ i11);
                IconCompatParcelizer = i12 % 128;
                int i13 = i12 % 2;
                return true;
            }
            if (!(obj instanceof MediaBrowserCompatItemReceiver)) {
                int i14 = (((i4 | 118) << 1) - (i4 ^ 118)) - 1;
                IconCompatParcelizer = i14 % 128;
                boolean z = i14 % 2 == 0;
                int i15 = i4 + 97;
                IconCompatParcelizer = i15 % 128;
                int i16 = i15 % 2;
                return Boolean.valueOf(z);
            }
            if (mediaBrowserCompatItemReceiver.write == ((MediaBrowserCompatItemReceiver) obj).write) {
                int i17 = i4 & 61;
                int i18 = -(-((i4 ^ 61) | i17));
                int i19 = (i17 & i18) + (i17 | i18);
                IconCompatParcelizer = i19 % 128;
                int i20 = i19 % 2;
                return true;
            }
            int i21 = (((i4 | 94) << 1) - (i4 ^ 94)) - 1;
            int i22 = i21 % 128;
            IconCompatParcelizer = i22;
            int i23 = i21 % 2;
            int i24 = i22 | 29;
            int i25 = (i24 << 1) - (i24 & (~(i22 & 29)));
            RemoteActionCompatParcelizer = i25 % 128;
            if (i25 % 2 == 0) {
                return false;
            }
            throw null;
        }

        private static /* synthetic */ Object IconCompatParcelizer(Object[] objArr) {
            MediaBrowserCompatItemReceiver mediaBrowserCompatItemReceiver = (MediaBrowserCompatItemReceiver) objArr[0];
            int i = 2 % 2;
            int i2 = IconCompatParcelizer;
            int i3 = i2 & 11;
            int i4 = -(-((i2 ^ 11) | i3));
            int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
            RemoteActionCompatParcelizer = i5 % 128;
            int i6 = i5 % 2;
            int iHashCode = mediaBrowserCompatItemReceiver.write.hashCode();
            int i7 = RemoteActionCompatParcelizer;
            int i8 = (((i7 & (-20)) | ((~i7) & 19)) - (~(-(-((i7 & 19) << 1))))) - 1;
            IconCompatParcelizer = i8 % 128;
            int i9 = i8 % 2;
            return Integer.valueOf(iHashCode);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/allocate$read;", "Lo/allocate;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class read extends allocate {
        public static final read INSTANCE = new read();
        private static int RemoteActionCompatParcelizer = 1;
        private static int write;

        private read() {
            super(null);
        }

        static {
            int i = write;
            int i2 = i & 73;
            int i3 = (i ^ 73) | i2;
            int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
            RemoteActionCompatParcelizer = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    public static final class write extends allocate {
        private static int read = 0;
        private static int write = 1;
        private final Exception AudioAttributesCompatParcelizer;
        private final AllocatorAllocationNode IconCompatParcelizer;

        public static /* synthetic */ Object RemoteActionCompatParcelizer(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
            int i7 = ~i6;
            int i8 = ~i3;
            int i9 = ~(i7 | i8);
            int i10 = ~i4;
            int i11 = i9 | (~(i8 | i10));
            int i12 = ~(i4 | i6 | i3);
            int i13 = i11 | i12;
            int i14 = i10 | i6;
            int i15 = i6 + i3 + i + (112060874 * i5) + ((-1891258303) * i2);
            int i16 = i15 * i15;
            int i17 = (i6 * 1286644997) + 1783103488 + (1286644997 * i3) + (i13 * (-1821943044)) + ((-651081208) * i12) + ((-1821943044) * i14) + ((-535298048) * i) + ((-1427111936) * i5) + (1712848896 * i2) + (159514624 * i16);
            int i18 = ((i6 * (-1669307009)) - 1771304782) + (i3 * (-1669307009)) + (i13 * 564) + (i12 * (-1128)) + (i14 * 564) + (i * (-1669306445)) + (i5 * (-1582645698)) + (i2 * (-198941581)) + (i16 * (-203030528));
            int i19 = i17 + (i18 * i18 * (-2008154112));
            return i19 != 1 ? i19 != 2 ? i19 != 3 ? i19 != 4 ? IconCompatParcelizer(objArr) : RemoteActionCompatParcelizer(objArr) : read(objArr) : AudioAttributesCompatParcelizer(objArr) : write(objArr);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public write(AllocatorAllocationNode allocatorAllocationNode, Exception exc) {
            super(null);
            toMagicModuleMetaRepoModel.write(allocatorAllocationNode, "");
            this.IconCompatParcelizer = allocatorAllocationNode;
            this.AudioAttributesCompatParcelizer = exc;
        }

        private static /* synthetic */ Object IconCompatParcelizer(Object[] objArr) {
            write writeVar = (write) objArr[0];
            int i = 2 % 2;
            int i2 = write;
            int i3 = i2 & 91;
            int i4 = (~i3) & (i2 | 91);
            int i5 = i3 << 1;
            int i6 = (i4 & i5) + (i5 | i4);
            read = i6 % 128;
            int i7 = i6 % 2;
            AllocatorAllocationNode allocatorAllocationNode = writeVar.IconCompatParcelizer;
            if (i7 != 0) {
                throw null;
            }
            int i8 = i2 & 27;
            int i9 = i8 + ((i2 ^ 27) | i8);
            read = i9 % 128;
            int i10 = i9 % 2;
            return allocatorAllocationNode;
        }

        private static /* synthetic */ Object RemoteActionCompatParcelizer(Object[] objArr) {
            write writeVar = (write) objArr[0];
            int i = 2 % 2;
            int i2 = write;
            int i3 = i2 & 97;
            int i4 = i2 | 97;
            int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
            int i6 = i5 % 128;
            read = i6;
            int i7 = i5 % 2;
            Exception exc = writeVar.AudioAttributesCompatParcelizer;
            int i8 = i6 & 1;
            int i9 = ((i6 | 1) & (~i8)) + (i8 << 1);
            write = i9 % 128;
            if (i9 % 2 != 0) {
                return exc;
            }
            throw null;
        }

        public final boolean equals(Object obj) {
            int iIconCompatParcelizer = setScheme.IconCompatParcelizer();
            int iIconCompatParcelizer2 = setScheme.IconCompatParcelizer();
            int iIconCompatParcelizer3 = setScheme.IconCompatParcelizer();
            return ((Boolean) RemoteActionCompatParcelizer(iIconCompatParcelizer2, setScheme.IconCompatParcelizer(), 1381690618, iIconCompatParcelizer, new Object[]{this, obj}, iIconCompatParcelizer3, -1381690615)).booleanValue();
        }

        public final Exception IconCompatParcelizer() {
            int iIconCompatParcelizer = setScheme.IconCompatParcelizer();
            int iIconCompatParcelizer2 = setScheme.IconCompatParcelizer();
            int iIconCompatParcelizer3 = setScheme.IconCompatParcelizer();
            return (Exception) RemoteActionCompatParcelizer(iIconCompatParcelizer2, setScheme.IconCompatParcelizer(), -1850110835, iIconCompatParcelizer, new Object[]{this}, iIconCompatParcelizer3, 1850110839);
        }

        public final AllocatorAllocationNode AudioAttributesCompatParcelizer() {
            int iIconCompatParcelizer = setScheme.IconCompatParcelizer();
            int iIconCompatParcelizer2 = setScheme.IconCompatParcelizer();
            int iIconCompatParcelizer3 = setScheme.IconCompatParcelizer();
            return (AllocatorAllocationNode) RemoteActionCompatParcelizer(iIconCompatParcelizer2, setScheme.IconCompatParcelizer(), 918403904, iIconCompatParcelizer, new Object[]{this}, iIconCompatParcelizer3, -918403904);
        }

        public final int hashCode() {
            int iIconCompatParcelizer = setScheme.IconCompatParcelizer();
            int iIconCompatParcelizer2 = setScheme.IconCompatParcelizer();
            int iIconCompatParcelizer3 = setScheme.IconCompatParcelizer();
            return ((Integer) RemoteActionCompatParcelizer(iIconCompatParcelizer2, setScheme.IconCompatParcelizer(), 1267692418, iIconCompatParcelizer, new Object[]{this}, iIconCompatParcelizer3, -1267692416)).intValue();
        }

        public final String toString() {
            int iIconCompatParcelizer = setScheme.IconCompatParcelizer();
            int iIconCompatParcelizer2 = setScheme.IconCompatParcelizer();
            int iIconCompatParcelizer3 = setScheme.IconCompatParcelizer();
            return (String) RemoteActionCompatParcelizer(iIconCompatParcelizer2, setScheme.IconCompatParcelizer(), 230481080, iIconCompatParcelizer, new Object[]{this}, iIconCompatParcelizer3, -230481079);
        }

        private static /* synthetic */ Object write(Object[] objArr) {
            write writeVar = (write) objArr[0];
            int i = 2 % 2;
            AllocatorAllocationNode allocatorAllocationNode = writeVar.IconCompatParcelizer;
            Exception exc = writeVar.AudioAttributesCompatParcelizer;
            StringBuilder sb = new StringBuilder("SyncFailed(task=");
            int i2 = read;
            int i3 = (i2 & 119) + (i2 | 119);
            write = i3 % 128;
            int i4 = i3 % 2;
            sb.append(allocatorAllocationNode);
            sb.append(", cause=");
            sb.append(exc);
            int i5 = read;
            int i6 = i5 & 57;
            int i7 = (((i5 | 57) & (~i6)) - (~(i6 << 1))) - 1;
            write = i7 % 128;
            int i8 = i7 % 2;
            sb.append(")");
            String string = sb.toString();
            int i9 = read;
            int i10 = ((i9 ^ 56) + ((i9 & 56) << 1)) - 1;
            write = i10 % 128;
            int i11 = i10 % 2;
            return string;
        }

        private static /* synthetic */ Object AudioAttributesCompatParcelizer(Object[] objArr) {
            int iHashCode = 0;
            write writeVar = (write) objArr[0];
            int i = 2 % 2;
            int i2 = read;
            int i3 = i2 & 89;
            int i4 = (i2 | 89) & (~i3);
            int i5 = -(-(i3 << 1));
            int i6 = ((i4 | i5) << 1) - (i4 ^ i5);
            write = i6 % 128;
            int i7 = i6 % 2;
            int iHashCode2 = writeVar.IconCompatParcelizer.hashCode();
            Exception exc = writeVar.AudioAttributesCompatParcelizer;
            int i8 = read;
            int i9 = (i8 & 80) + (i8 | 80);
            int i10 = (i9 ^ (-1)) + (i9 << 1);
            write = i10 % 128;
            int i11 = i10 % 2;
            if (exc == null) {
                int i12 = i8 & 43;
                int i13 = i8 | 43;
                int i14 = (i12 & i13) + (i12 | i13);
                int i15 = i14 % 128;
                write = i15;
                int i16 = i14 % 2;
                int i17 = (((i15 & (-38)) | ((~i15) & 37)) - (~(-(-((i15 & 37) << 1))))) - 1;
                read = i17 % 128;
                int i18 = i17 % 2;
            } else {
                iHashCode = exc.hashCode();
                int i19 = write;
                int i20 = i19 & 23;
                int i21 = (((i19 | 23) & (~i20)) - (~(-(-(i20 << 1))))) - 1;
                read = i21 % 128;
                if (i21 % 2 != 0) {
                    int i22 = 4 % 4;
                }
            }
            int i23 = iHashCode2 * 31;
            int i24 = i23 & iHashCode;
            int i25 = i24 + ((iHashCode ^ i23) | i24);
            int i26 = read;
            int i27 = i26 ^ 61;
            int i28 = ((i26 & 61) | i27) << 1;
            int i29 = -i27;
            int i30 = (i28 & i29) + (i28 | i29);
            write = i30 % 128;
            int i31 = i30 % 2;
            return Integer.valueOf(i25);
        }

        private static /* synthetic */ Object read(Object[] objArr) {
            write writeVar = (write) objArr[0];
            Object obj = objArr[1];
            int i = 2 % 2;
            int i2 = read;
            int i3 = i2 & 7;
            int i4 = -(-((i2 ^ 7) | i3));
            int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
            int i6 = i5 % 128;
            write = i6;
            if (i5 % 2 == 0) {
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            if (writeVar == obj) {
                int i7 = i6 + 79;
                read = i7 % 128;
                if (i7 % 2 != 0) {
                    int i8 = 28 / 0;
                }
                return true;
            }
            if (!(obj instanceof write)) {
                int i9 = i6 & 105;
                int i10 = -(-((i6 ^ 105) | i9));
                int i11 = ((i9 | i10) << 1) - (i9 ^ i10);
                read = i11 % 128;
                int i12 = i11 % 2;
                int i13 = (((i6 & (-58)) | ((~i6) & 57)) - (~(-(-((i6 & 57) << 1))))) - 1;
                read = i13 % 128;
                int i14 = i13 % 2;
                return false;
            }
            if (writeVar.IconCompatParcelizer != ((write) obj).IconCompatParcelizer) {
                int i15 = i6 ^ 41;
                int i16 = (((i6 & 41) | i15) << 1) - i15;
                read = i16 % 128;
                int i17 = i16 % 2;
                return false;
            }
            if (!(!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(writeVar.AudioAttributesCompatParcelizer, r9.AudioAttributesCompatParcelizer))) {
                int i18 = write + 111;
                read = i18 % 128;
                int i19 = i18 % 2;
                return true;
            }
            int i20 = read;
            int i21 = ((i20 | 107) << 1) - (i20 ^ 107);
            write = i21 % 128;
            boolean z = i21 % 2 == 0;
            int i22 = (-2) - (((i20 ^ 80) + ((i20 & 80) << 1)) ^ (-1));
            write = i22 % 128;
            int i23 = i22 % 2;
            return Boolean.valueOf(z);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/allocate$IconCompatParcelizer;", "Lo/allocate;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class IconCompatParcelizer extends allocate {
        public static final IconCompatParcelizer INSTANCE = new IconCompatParcelizer();
        private static int read = 1;
        private static int write;

        private IconCompatParcelizer() {
            super(null);
        }

        static {
            int i = write;
            int i2 = (((i | 92) << 1) - (i ^ 92)) - 1;
            read = i2 % 128;
            int i3 = i2 % 2;
        }
    }
}
