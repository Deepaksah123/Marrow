package kotlin;

import android.text.TextUtils;
import com.google.android.exoplayer2.text.ttml.TtmlNode;

/* JADX INFO: loaded from: classes2.dex */
final class _copyBufferContents {
    public final int AudioAttributesCompatParcelizer;
    public final int IconCompatParcelizer;
    public final int RemoteActionCompatParcelizer;
    public final int read;
    public final int write;

    private _copyBufferContents(int i, int i2, int i3, int i4, int i5) {
        this.RemoteActionCompatParcelizer = i;
        this.AudioAttributesCompatParcelizer = i2;
        this.write = i3;
        this.read = i4;
        this.IconCompatParcelizer = i5;
    }

    public static _copyBufferContents read(String str) {
        byte b;
        buildTypeSerializer.IconCompatParcelizer(str.startsWith("Format:"));
        String[] strArrSplit = TextUtils.split(str.substring(7), ",");
        int i = -1;
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        for (int i5 = 0; i5 < strArrSplit.length; i5++) {
            String str2 = parseMdhd.read(strArrSplit[i5].trim());
            str2.hashCode();
            switch (str2.hashCode()) {
                case 100571:
                    b = str2.equals(TtmlNode.END) ? (byte) 0 : (byte) -1;
                    break;
                case 3556653:
                    b = str2.equals("text") ? (byte) 1 : (byte) -1;
                    break;
                case 109757538:
                    b = str2.equals(TtmlNode.START) ? (byte) 2 : (byte) -1;
                    break;
                case 109780401:
                    b = str2.equals(TtmlNode.TAG_STYLE) ? (byte) 3 : (byte) -1;
                    break;
                default:
                    b = -1;
                    break;
            }
            if (b == 0) {
                i2 = i5;
            } else if (b == 1) {
                i4 = i5;
            } else if (b == 2) {
                i = i5;
            } else if (b == 3) {
                i3 = i5;
            }
        }
        if (i == -1 || i2 == -1 || i4 == -1) {
            return null;
        }
        return new _copyBufferContents(i, i2, i3, i4, strArrSplit.length);
    }
}
