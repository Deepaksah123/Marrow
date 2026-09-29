package kotlin;

import com.google.android.exoplayer2.C;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class setName {
    private final C0170format[] AudioAttributesCompatParcelizer;
    public final int IconCompatParcelizer;
    private int RemoteActionCompatParcelizer;
    public final String read;
    public final int write;

    private static int write(int i) {
        return i | 16384;
    }

    public setName(C0170format... c0170formatArr) {
        this("", c0170formatArr);
    }

    public setName(String str, C0170format... c0170formatArr) {
        buildTypeSerializer.IconCompatParcelizer(c0170formatArr.length > 0);
        this.read = str;
        this.AudioAttributesCompatParcelizer = c0170formatArr;
        this.write = c0170formatArr.length;
        int iIconCompatParcelizer = DefaultBaseTypeLimitingValidator.IconCompatParcelizer(c0170formatArr[0].onPlayFromUri);
        this.IconCompatParcelizer = iIconCompatParcelizer == -1 ? DefaultBaseTypeLimitingValidator.IconCompatParcelizer(c0170formatArr[0].AudioAttributesImplApi21Parcelizer) : iIconCompatParcelizer;
        write();
    }

    public final C0170format AudioAttributesCompatParcelizer(int i) {
        return this.AudioAttributesCompatParcelizer[i];
    }

    public final int read(C0170format c0170format) {
        int i = 0;
        while (true) {
            C0170format[] c0170formatArr = this.AudioAttributesCompatParcelizer;
            if (i >= c0170formatArr.length) {
                return -1;
            }
            if (c0170format == c0170formatArr[i]) {
                return i;
            }
            i++;
        }
    }

    public final int hashCode() {
        if (this.RemoteActionCompatParcelizer == 0) {
            this.RemoteActionCompatParcelizer = ((this.read.hashCode() + 527) * 31) + Arrays.hashCode(this.AudioAttributesCompatParcelizer);
        }
        return this.RemoteActionCompatParcelizer;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        setName setname = (setName) obj;
        return this.read.equals(setname.read) && Arrays.equals(this.AudioAttributesCompatParcelizer, setname.AudioAttributesCompatParcelizer);
    }

    static {
        LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(0);
        LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(1);
    }

    private void write() {
        String strIconCompatParcelizer = IconCompatParcelizer(this.AudioAttributesCompatParcelizer[0].MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
        int iWrite = write(this.AudioAttributesCompatParcelizer[0].onPrepare);
        int i = 1;
        while (true) {
            C0170format[] c0170formatArr = this.AudioAttributesCompatParcelizer;
            if (i >= c0170formatArr.length) {
                return;
            }
            if (!strIconCompatParcelizer.equals(IconCompatParcelizer(c0170formatArr[i].MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver))) {
                RemoteActionCompatParcelizer("languages", this.AudioAttributesCompatParcelizer[0].MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, this.AudioAttributesCompatParcelizer[i].MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, i);
                return;
            } else {
                if (iWrite != write(this.AudioAttributesCompatParcelizer[i].onPrepare)) {
                    RemoteActionCompatParcelizer("role flags", Integer.toBinaryString(this.AudioAttributesCompatParcelizer[0].onPrepare), Integer.toBinaryString(this.AudioAttributesCompatParcelizer[i].onPrepare), i);
                    return;
                }
                i++;
            }
        }
    }

    private static String IconCompatParcelizer(String str) {
        return (str == null || str.equals(C.LANGUAGE_UNDETERMINED)) ? "" : str;
    }

    private static void RemoteActionCompatParcelizer(String str, String str2, String str3, int i) {
        StringBuilder sb = new StringBuilder("Different ");
        sb.append(str);
        sb.append(" combined in one TrackGroup: '");
        sb.append(str2);
        sb.append("' (track 0) and '");
        sb.append(str3);
        sb.append("' (track ");
        sb.append(i);
        sb.append(")");
        prune.read("TrackGroup", "", new IllegalStateException(sb.toString()));
    }
}
