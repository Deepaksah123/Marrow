package kotlin;

import com.google.android.exoplayer2.video.VideoRendererEventListener$EventDispatcher$$ExternalSyntheticLambda9;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\u001a\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\f\u001a\u00020\t8\u0007¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000b"}, d2 = {"Lo/setColorized;", "", "p0", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "finalData", "Ljava/lang/String;", "read"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class setColorized {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private final String finalData;

    public static /* synthetic */ Object AudioAttributesCompatParcelizer(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i;
        int i8 = i2 | i7;
        int i9 = ~i6;
        int i10 = ~((~i2) | i7);
        int i11 = i + i6 + i5 + (1977613057 * i4) + (454551927 * i3);
        int i12 = i11 * i11;
        int i13 = (1378041352 * i) + 473956352 + (953991674 * i6) + (212024839 * i8) + (i9 * (-212024839)) + ((-212024839) * i10) + (1166016512 * i5) + ((-981467136) * i4) + ((-830472192) * i3) + ((-499122176) * i12);
        int i14 = (i * (-1131120504)) + 246467939 + (i6 * (-1131119078)) + (i8 * (-713)) + (i9 * 713) + (i10 * 713) + (i5 * (-1131119791)) + (i4 * (-1039407535)) + (i3 * 1820920743) + (i12 * 1447034880);
        int i15 = i13 + (i14 * i14 * 1170210816);
        return i15 != 1 ? i15 != 2 ? RemoteActionCompatParcelizer(objArr) : write(objArr) : AudioAttributesCompatParcelizer(objArr);
    }

    private static /* synthetic */ Object RemoteActionCompatParcelizer(Object[] objArr) {
        setColorized setcolorized = (setColorized) objArr[0];
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = i2 + 11;
        IconCompatParcelizer = i3 % 128;
        int i4 = i3 % 2;
        String str = setcolorized.finalData;
        int i5 = (((i2 | 112) << 1) - (i2 ^ 112)) - 1;
        IconCompatParcelizer = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final boolean equals(Object p0) {
        int iIconCompatParcelizer = VideoRendererEventListener$EventDispatcher$$ExternalSyntheticLambda9.IconCompatParcelizer();
        int iIconCompatParcelizer2 = VideoRendererEventListener$EventDispatcher$$ExternalSyntheticLambda9.IconCompatParcelizer();
        return ((Boolean) AudioAttributesCompatParcelizer(948970724, new Object[]{this, p0}, iIconCompatParcelizer, VideoRendererEventListener$EventDispatcher$$ExternalSyntheticLambda9.IconCompatParcelizer(), VideoRendererEventListener$EventDispatcher$$ExternalSyntheticLambda9.IconCompatParcelizer(), iIconCompatParcelizer2, -948970723)).booleanValue();
    }

    public final String read() {
        int iIconCompatParcelizer = VideoRendererEventListener$EventDispatcher$$ExternalSyntheticLambda9.IconCompatParcelizer();
        int iIconCompatParcelizer2 = VideoRendererEventListener$EventDispatcher$$ExternalSyntheticLambda9.IconCompatParcelizer();
        return (String) AudioAttributesCompatParcelizer(-1131502977, new Object[]{this}, iIconCompatParcelizer, VideoRendererEventListener$EventDispatcher$$ExternalSyntheticLambda9.IconCompatParcelizer(), VideoRendererEventListener$EventDispatcher$$ExternalSyntheticLambda9.IconCompatParcelizer(), iIconCompatParcelizer2, 1131502977);
    }

    public final int hashCode() {
        int iIconCompatParcelizer = VideoRendererEventListener$EventDispatcher$$ExternalSyntheticLambda9.IconCompatParcelizer();
        int iIconCompatParcelizer2 = VideoRendererEventListener$EventDispatcher$$ExternalSyntheticLambda9.IconCompatParcelizer();
        return ((Integer) AudioAttributesCompatParcelizer(2031143375, new Object[]{this}, iIconCompatParcelizer, VideoRendererEventListener$EventDispatcher$$ExternalSyntheticLambda9.IconCompatParcelizer(), VideoRendererEventListener$EventDispatcher$$ExternalSyntheticLambda9.IconCompatParcelizer(), iIconCompatParcelizer2, -2031143373)).intValue();
    }

    public final String toString() {
        int i = 2 % 2;
        String str = this.finalData;
        StringBuilder sb = new StringBuilder("setColorized(finalData=");
        int i2 = RemoteActionCompatParcelizer;
        int i3 = ((i2 ^ 37) - (~((i2 & 37) << 1))) - 1;
        IconCompatParcelizer = i3 % 128;
        int i4 = i3 % 2;
        sb.append(str);
        sb.append(")");
        if (i4 != 0) {
            sb.toString();
            throw null;
        }
        String string = sb.toString();
        int i5 = IconCompatParcelizer + 39;
        RemoteActionCompatParcelizer = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 86 / 0;
        }
        return string;
    }

    private static /* synthetic */ Object AudioAttributesCompatParcelizer(Object[] objArr) {
        setColorized setcolorized = (setColorized) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = i2 ^ 41;
        int i4 = (i2 & 41) << 1;
        int i5 = (i3 & i4) + (i3 | i4);
        int i6 = i5 % 128;
        IconCompatParcelizer = i6;
        Object obj2 = null;
        if (i5 % 2 != 0) {
            obj2.hashCode();
            throw null;
        }
        if (setcolorized == obj) {
            int i7 = i6 & 73;
            int i8 = -(-((i6 ^ 73) | i7));
            int i9 = (i7 & i8) + (i7 | i8);
            int i10 = i9 % 128;
            RemoteActionCompatParcelizer = i10;
            int i11 = i9 % 2;
            int i12 = ((((i10 ^ 71) | (i10 & 71)) << 1) - (~(-(((~i10) & 71) | (i10 & (-72)))))) - 1;
            IconCompatParcelizer = i12 % 128;
            if (i12 % 2 == 0) {
                return true;
            }
            obj2.hashCode();
            throw null;
        }
        if (!(obj instanceof setColorized)) {
            int i13 = ((i2 ^ 54) + ((i2 & 54) << 1)) - 1;
            IconCompatParcelizer = i13 % 128;
            int i14 = i13 % 2;
            int i15 = (i2 | 69) << 1;
            int i16 = -((i2 & (-70)) | ((~i2) & 69));
            int i17 = ((i15 | i16) << 1) - (i15 ^ i16);
            IconCompatParcelizer = i17 % 128;
            int i18 = i17 % 2;
            return false;
        }
        String str = setcolorized.finalData;
        String str2 = ((setColorized) obj).finalData;
        int i19 = i2 + 7;
        IconCompatParcelizer = i19 % 128;
        int i20 = i19 % 2;
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) str, (Object) str2)) {
            int i21 = IconCompatParcelizer + 45;
            RemoteActionCompatParcelizer = i21 % 128;
            int i22 = i21 % 2;
            return true;
        }
        int i23 = RemoteActionCompatParcelizer;
        int i24 = i23 & 27;
        int i25 = (i23 | 27) & (~i24);
        int i26 = i24 << 1;
        int i27 = (i25 ^ i26) + ((i25 & i26) << 1);
        IconCompatParcelizer = i27 % 128;
        return Boolean.valueOf(i27 % 2 != 0);
    }

    private static /* synthetic */ Object write(Object[] objArr) {
        setColorized setcolorized = (setColorized) objArr[0];
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = ((i2 | 69) << 1) - (i2 ^ 69);
        IconCompatParcelizer = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        String str = setcolorized.finalData;
        if (i4 != 0) {
            str.hashCode();
            obj.hashCode();
            throw null;
        }
        int iHashCode = str.hashCode();
        int i5 = RemoteActionCompatParcelizer + 1;
        IconCompatParcelizer = i5 % 128;
        if (i5 % 2 == 0) {
            return Integer.valueOf(iHashCode);
        }
        throw null;
    }
}
