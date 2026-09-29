package kotlin;

import com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher$$ExternalSyntheticLambda2;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005"}, d2 = {"Lo/getIndividualAllocationLength;", "", "<init>", "()V", "AudioAttributesCompatParcelizer", "Lo/getIndividualAllocationLength$AudioAttributesCompatParcelizer;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class getIndividualAllocationLength {
    private getIndividualAllocationLength() {
    }

    public /* synthetic */ getIndividualAllocationLength(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this();
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lo/getIndividualAllocationLength$AudioAttributesCompatParcelizer;", "Lo/getIndividualAllocationLength;", "<init>", "()V", "", "p0", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AudioAttributesCompatParcelizer extends getIndividualAllocationLength {
        private static int AudioAttributesCompatParcelizer = 0;
        public static final AudioAttributesCompatParcelizer INSTANCE = new AudioAttributesCompatParcelizer();
        private static int IconCompatParcelizer = 1;
        private static int read = 1;
        private static int write;

        public static /* synthetic */ Object write(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
            int i7 = ~i4;
            int i8 = ~i5;
            int i9 = (~(i7 | i8)) | i6;
            int i10 = ~(i4 | i5);
            int i11 = i9 | i10;
            int i12 = ~i6;
            int i13 = (~(i12 | i5)) | (~(i12 | i4)) | i10;
            int i14 = (~(i7 | i5)) | (~(i8 | i4));
            int i15 = i4 + i5 + i3 + (1040777104 * i2) + ((-1861505373) * i);
            int i16 = i15 * i15;
            int i17 = (i4 * (-1036928585)) + 527892480 + ((-1036928585) * i5) + ((-562525036) * i11) + (562525036 * i13) + ((-281262518) * i14) + ((-1318191104) * i3) + (1608515584 * i2) + ((-1123418112) * i) + ((-2114519040) * i16);
            int i18 = (i4 * 1703033811) + 1712528133 + (i5 * 1703033811) + (i11 * 1508) + (i13 * (-1508)) + (i14 * 754) + (i3 * 1703034565) + (i2 * (-2114876976)) + (i * 1880022383) + (i16 * (-720175104));
            if (i17 + (i18 * i18 * (-739180544)) != 1) {
                return write(objArr);
            }
            int i19 = 2 % 2;
            int i20 = AudioAttributesCompatParcelizer;
            int i21 = ((((i20 ^ 123) | (i20 & 123)) << 1) - (~(-(((~i20) & 123) | (i20 & (-124)))))) - 1;
            int i22 = i21 % 128;
            IconCompatParcelizer = i22;
            int i23 = i21 % 2;
            int i24 = i22 & 107;
            int i25 = (((i22 | 107) & (~i24)) - (~(-(-(i24 << 1))))) - 1;
            AudioAttributesCompatParcelizer = i25 % 128;
            int i26 = i25 % 2;
            return -70637018;
        }

        private AudioAttributesCompatParcelizer() {
            super(null);
        }

        static {
            int i = read;
            int i2 = (((i & (-34)) | ((~i) & 33)) - (~(-(-((i & 33) << 1))))) - 1;
            write = i2 % 128;
            int i3 = i2 % 2;
        }

        public final boolean equals(Object p0) {
            int iIconCompatParcelizer = MediaSourceEventListener$EventDispatcher$$ExternalSyntheticLambda2.IconCompatParcelizer();
            int iIconCompatParcelizer2 = MediaSourceEventListener$EventDispatcher$$ExternalSyntheticLambda2.IconCompatParcelizer();
            return ((Boolean) write(new Object[]{this, p0}, MediaSourceEventListener$EventDispatcher$$ExternalSyntheticLambda2.IconCompatParcelizer(), MediaSourceEventListener$EventDispatcher$$ExternalSyntheticLambda2.IconCompatParcelizer(), iIconCompatParcelizer2, -1928561585, 1928561585, iIconCompatParcelizer)).booleanValue();
        }

        public final int hashCode() {
            int iIconCompatParcelizer = MediaSourceEventListener$EventDispatcher$$ExternalSyntheticLambda2.IconCompatParcelizer();
            int iIconCompatParcelizer2 = MediaSourceEventListener$EventDispatcher$$ExternalSyntheticLambda2.IconCompatParcelizer();
            return ((Integer) write(new Object[]{this}, MediaSourceEventListener$EventDispatcher$$ExternalSyntheticLambda2.IconCompatParcelizer(), MediaSourceEventListener$EventDispatcher$$ExternalSyntheticLambda2.IconCompatParcelizer(), iIconCompatParcelizer2, 1332626825, -1332626824, iIconCompatParcelizer)).intValue();
        }

        public final String toString() {
            int i = 2 % 2;
            int i2 = IconCompatParcelizer;
            int i3 = (i2 ^ 53) + ((i2 & 53) << 1);
            int i4 = i3 % 128;
            AudioAttributesCompatParcelizer = i4;
            if (i3 % 2 != 0) {
                throw null;
            }
            int i5 = i4 & 89;
            int i6 = (i4 | 89) & (~i5);
            int i7 = -(-(i5 << 1));
            int i8 = (i6 & i7) + (i6 | i7);
            IconCompatParcelizer = i8 % 128;
            if (i8 % 2 != 0) {
                return "AudioAttributesCompatParcelizer";
            }
            throw null;
        }

        private static /* synthetic */ Object write(Object[] objArr) {
            AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = (AudioAttributesCompatParcelizer) objArr[0];
            Object obj = objArr[1];
            int i = 2 % 2;
            int i2 = IconCompatParcelizer;
            int i3 = i2 & 1;
            int i4 = (~i3) & (i2 | 1);
            int i5 = -(-(i3 << 1));
            int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
            AudioAttributesCompatParcelizer = i6 % 128;
            int i7 = i6 % 2;
            if (audioAttributesCompatParcelizer == obj) {
                int i8 = i2 ^ 85;
                int i9 = -(-((i2 & 85) << 1));
                int i10 = (i8 ^ i9) + ((i8 & i9) << 1);
                AudioAttributesCompatParcelizer = i10 % 128;
                return Boolean.valueOf(i10 % 2 == 0);
            }
            if (!(obj instanceof AudioAttributesCompatParcelizer)) {
                int i11 = (i2 | 37) << 1;
                int i12 = -(i2 ^ 37);
                int i13 = (i11 ^ i12) + ((i11 & i12) << 1);
                AudioAttributesCompatParcelizer = i13 % 128;
                int i14 = i13 % 2;
                return false;
            }
            int i15 = ((i2 ^ 9) | (i2 & 9)) << 1;
            int i16 = -((i2 & (-10)) | ((~i2) & 9));
            int i17 = (i15 ^ i16) + ((i15 & i16) << 1);
            AudioAttributesCompatParcelizer = i17 % 128;
            if (i17 % 2 == 0) {
                return true;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
    }
}
