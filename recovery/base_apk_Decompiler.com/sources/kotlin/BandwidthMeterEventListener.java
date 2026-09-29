package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t"}, d2 = {"Lo/BandwidthMeterEventListener;", "", "<init>", "()V", "IconCompatParcelizer", "write", "read", "Lo/BandwidthMeterEventListener$IconCompatParcelizer;", "Lo/BandwidthMeterEventListener$write;", "Lo/BandwidthMeterEventListener$read;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class BandwidthMeterEventListener {
    private BandwidthMeterEventListener() {
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/BandwidthMeterEventListener$IconCompatParcelizer;", "Lo/BandwidthMeterEventListener;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class IconCompatParcelizer extends BandwidthMeterEventListener {
        private static int AudioAttributesCompatParcelizer = 0;
        public static final IconCompatParcelizer INSTANCE = new IconCompatParcelizer();
        private static int RemoteActionCompatParcelizer = 1;

        private IconCompatParcelizer() {
            super(null);
        }

        static {
            int i = RemoteActionCompatParcelizer;
            int i2 = ((i ^ 85) | (i & 85)) << 1;
            int i3 = -(((~i) & 85) | (i & (-86)));
            int i4 = (i2 & i3) + (i3 | i2);
            AudioAttributesCompatParcelizer = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    public /* synthetic */ BandwidthMeterEventListener(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/BandwidthMeterEventListener$write;", "Lo/BandwidthMeterEventListener;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class write extends BandwidthMeterEventListener {
        private static int AudioAttributesCompatParcelizer = 0;
        public static final write INSTANCE = new write();
        private static int RemoteActionCompatParcelizer = 1;

        private write() {
            super(null);
        }

        static {
            int i = AudioAttributesCompatParcelizer;
            int i2 = (((i ^ 21) | (i & 21)) << 1) - (((~i) & 21) | (i & (-22)));
            RemoteActionCompatParcelizer = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 12 / 0;
            }
        }
    }

    public static final class read extends BandwidthMeterEventListener {
        private static int RemoteActionCompatParcelizer = 1;
        private static int read;
        private final String IconCompatParcelizer;

        public static /* synthetic */ Object AudioAttributesCompatParcelizer(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
            int i7 = (~((~i6) | i3)) | (~(i6 | i));
            int i8 = ~i3;
            int i9 = (~(i8 | i)) | i6;
            int i10 = (~(i | i3)) | (~(i8 | (~i))) | i6;
            int i11 = i3 + i6 + i5 + ((-737137436) * i4) + ((-1840598144) * i2);
            int i12 = i11 * i11;
            int i13 = (((-699670985) * i3) - 818937856) + (24099949 * i6) + (723770934 * i7) + ((-1447541868) * i9) + ((-723770934) * i10) + ((-1423441920) * i5) + (1335885824 * i4) + ((-1946157056) * i2) + ((-1593638912) * i12);
            int i14 = (i3 * 1252406331) + 1981669868 + (i6 * 1252405337) + (i7 * (-994)) + (i9 * 1988) + (i10 * 994) + (i5 * 1252407325) + (i4 * (-1820396076)) + (i2 * 1320834432) + (i12 * (-447283200));
            int i15 = i13 + (i14 * i14 * 1511325696);
            return i15 != 1 ? i15 != 2 ? i15 != 3 ? IconCompatParcelizer(objArr) : read(objArr) : write(objArr) : AudioAttributesCompatParcelizer(objArr);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public read(String str) {
            super(null);
            toMagicModuleMetaRepoModel.write(str, "");
            this.IconCompatParcelizer = str;
        }

        private static /* synthetic */ Object IconCompatParcelizer(Object[] objArr) {
            read readVar = (read) objArr[0];
            int i = 2 % 2;
            int i2 = RemoteActionCompatParcelizer + 113;
            int i3 = i2 % 128;
            read = i3;
            int i4 = i2 % 2;
            String str = readVar.IconCompatParcelizer;
            int i5 = ((i3 & 81) - (~(i3 | 81))) - 1;
            RemoteActionCompatParcelizer = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public final boolean equals(Object obj) {
            int iAudioAttributesCompatParcelizer = UtilExternalSyntheticLambda1.AudioAttributesCompatParcelizer();
            int iAudioAttributesCompatParcelizer2 = UtilExternalSyntheticLambda1.AudioAttributesCompatParcelizer();
            int iAudioAttributesCompatParcelizer3 = UtilExternalSyntheticLambda1.AudioAttributesCompatParcelizer();
            return ((Boolean) AudioAttributesCompatParcelizer(iAudioAttributesCompatParcelizer, UtilExternalSyntheticLambda1.AudioAttributesCompatParcelizer(), -342334436, iAudioAttributesCompatParcelizer3, iAudioAttributesCompatParcelizer2, 342334438, new Object[]{this, obj})).booleanValue();
        }

        public final String read() {
            int iAudioAttributesCompatParcelizer = UtilExternalSyntheticLambda1.AudioAttributesCompatParcelizer();
            int iAudioAttributesCompatParcelizer2 = UtilExternalSyntheticLambda1.AudioAttributesCompatParcelizer();
            int iAudioAttributesCompatParcelizer3 = UtilExternalSyntheticLambda1.AudioAttributesCompatParcelizer();
            return (String) AudioAttributesCompatParcelizer(iAudioAttributesCompatParcelizer, UtilExternalSyntheticLambda1.AudioAttributesCompatParcelizer(), 263173123, iAudioAttributesCompatParcelizer3, iAudioAttributesCompatParcelizer2, -263173123, new Object[]{this});
        }

        public final int hashCode() {
            int iAudioAttributesCompatParcelizer = UtilExternalSyntheticLambda1.AudioAttributesCompatParcelizer();
            int iAudioAttributesCompatParcelizer2 = UtilExternalSyntheticLambda1.AudioAttributesCompatParcelizer();
            int iAudioAttributesCompatParcelizer3 = UtilExternalSyntheticLambda1.AudioAttributesCompatParcelizer();
            return ((Integer) AudioAttributesCompatParcelizer(iAudioAttributesCompatParcelizer, UtilExternalSyntheticLambda1.AudioAttributesCompatParcelizer(), 2129724984, iAudioAttributesCompatParcelizer3, iAudioAttributesCompatParcelizer2, -2129724981, new Object[]{this})).intValue();
        }

        public final String toString() {
            int iAudioAttributesCompatParcelizer = UtilExternalSyntheticLambda1.AudioAttributesCompatParcelizer();
            int iAudioAttributesCompatParcelizer2 = UtilExternalSyntheticLambda1.AudioAttributesCompatParcelizer();
            int iAudioAttributesCompatParcelizer3 = UtilExternalSyntheticLambda1.AudioAttributesCompatParcelizer();
            return (String) AudioAttributesCompatParcelizer(iAudioAttributesCompatParcelizer, UtilExternalSyntheticLambda1.AudioAttributesCompatParcelizer(), 2018194262, iAudioAttributesCompatParcelizer3, iAudioAttributesCompatParcelizer2, -2018194261, new Object[]{this});
        }

        private static /* synthetic */ Object AudioAttributesCompatParcelizer(Object[] objArr) {
            int i = 2 % 2;
            String str = ((read) objArr[0]).IconCompatParcelizer;
            StringBuilder sb = new StringBuilder("V2(pageKey=");
            int i2 = RemoteActionCompatParcelizer;
            int i3 = (i2 & 54) + (i2 | 54);
            int i4 = (i3 ^ (-1)) + (i3 << 1);
            read = i4 % 128;
            int i5 = i4 % 2;
            sb.append(str);
            sb.append(")");
            if (i5 == 0) {
                return sb.toString();
            }
            sb.toString();
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private static /* synthetic */ Object write(Object[] objArr) {
            read readVar = (read) objArr[0];
            Object obj = objArr[1];
            int i = 2 % 2;
            int i2 = read;
            int i3 = (i2 & 39) + (i2 | 39);
            RemoteActionCompatParcelizer = i3 % 128;
            Object obj2 = null;
            if (i3 % 2 == 0) {
                obj2.hashCode();
                throw null;
            }
            if (readVar == obj) {
                int i4 = i2 ^ 55;
                int i5 = (i2 & 55) << 1;
                int i6 = ((i4 | i5) << 1) - (i4 ^ i5);
                RemoteActionCompatParcelizer = i6 % 128;
                int i7 = i6 % 2;
                return true;
            }
            if (!(obj instanceof read)) {
                int i8 = i2 & 95;
                int i9 = (i2 ^ 95) | i8;
                int i10 = (i8 ^ i9) + ((i8 & i9) << 1);
                int i11 = i10 % 128;
                RemoteActionCompatParcelizer = i11;
                boolean z = i10 % 2 == 0;
                int i12 = i11 ^ 117;
                int i13 = (i11 & 117) << 1;
                int i14 = (i12 & i13) + (i13 | i12);
                read = i14 % 128;
                if (i14 % 2 == 0) {
                    return Boolean.valueOf(z);
                }
                throw null;
            }
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) readVar.IconCompatParcelizer, (Object) ((read) obj).IconCompatParcelizer)) {
                int i15 = read + 69;
                RemoteActionCompatParcelizer = i15 % 128;
                int i16 = i15 % 2;
                return true;
            }
            int i17 = read;
            int i18 = i17 & 65;
            int i19 = i17 | 65;
            int i20 = (i18 & i19) + (i18 | i19);
            RemoteActionCompatParcelizer = i20 % 128;
            int i21 = i20 % 2;
            int i22 = (-2) - (((i17 ^ 16) + ((i17 & 16) << 1)) ^ (-1));
            RemoteActionCompatParcelizer = i22 % 128;
            int i23 = i22 % 2;
            return false;
        }

        private static /* synthetic */ Object read(Object[] objArr) {
            read readVar = (read) objArr[0];
            int i = 2 % 2;
            int i2 = RemoteActionCompatParcelizer;
            int i3 = (((i2 | 88) << 1) - (i2 ^ 88)) - 1;
            read = i3 % 128;
            int i4 = i3 % 2;
            int iHashCode = readVar.IconCompatParcelizer.hashCode();
            if (i4 != 0) {
                int i5 = 20 / 0;
            }
            int i6 = RemoteActionCompatParcelizer;
            int i7 = (i6 & 65) + (i6 | 65);
            read = i7 % 128;
            int i8 = i7 % 2;
            return Integer.valueOf(iHashCode);
        }
    }
}
