package kotlin;

import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0019\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\r\u001a\u00020\u0005H\u0002J\u0011\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0005H\u0086\u0002J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0005H\u0002J\u0018\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0005H\u0002J\u001e\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0019J\u0012\u0010\u001a\u001a\u00020\u00122\n\u0010\u001b\u001a\u00060\u001cj\u0002`\u001dJ\u0006\u0010\u001e\u001a\u00020\u0005J\b\u0010\u001f\u001a\u00020\u0019H\u0016R\u000e\u0010\t\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Landroidx/compose/ui/text/input/GapBuffer;", "", "initBuffer", "", "initGapStart", "", "initGapEnd", "<init>", "([CII)V", "capacity", "buffer", "gapStart", "gapEnd", "gapLength", "get", "", "index", "makeSureAvailableSpace", "", "requestSize", "delete", TtmlNode.START, TtmlNode.END, "replace", "text", "", "append", "builder", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", SessionDescription.ATTR_LENGTH, "toString", "ui-text"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class constructForJsonNodeField {
    private char[] AudioAttributesCompatParcelizer;
    private int IconCompatParcelizer;
    private int read;
    private int write;

    public constructForJsonNodeField(char[] cArr, int i, int i2) {
        this.write = cArr.length;
        this.AudioAttributesCompatParcelizer = cArr;
        this.read = i;
        this.IconCompatParcelizer = i2;
    }

    private final int AudioAttributesCompatParcelizer() {
        return this.IconCompatParcelizer - this.read;
    }

    public final char RemoteActionCompatParcelizer(int i) {
        int i2 = this.read;
        if (i < i2) {
            return this.AudioAttributesCompatParcelizer[i];
        }
        return this.AudioAttributesCompatParcelizer[(i - i2) + this.IconCompatParcelizer];
    }

    private final void read(int i) {
        if (i <= AudioAttributesCompatParcelizer()) {
            return;
        }
        int iAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer();
        int i2 = this.write;
        do {
            i2 <<= 1;
        } while (i2 - this.write < i - iAudioAttributesCompatParcelizer);
        char[] cArr = new char[i2];
        getOrderDetails.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, cArr, 0, 0, this.read);
        int i3 = this.write;
        int i4 = this.IconCompatParcelizer;
        int i5 = i3 - i4;
        int i6 = i2 - i5;
        getOrderDetails.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, cArr, i6, i4, i5 + i4);
        this.AudioAttributesCompatParcelizer = cArr;
        this.write = i2;
        this.IconCompatParcelizer = i6;
    }

    private final void RemoteActionCompatParcelizer(int i, int i2) {
        int i3 = this.read;
        if (i < i3 && i2 <= i3) {
            int i4 = i3 - i2;
            char[] cArr = this.AudioAttributesCompatParcelizer;
            getOrderDetails.RemoteActionCompatParcelizer(cArr, cArr, this.IconCompatParcelizer - i4, i2, i3);
            this.read = i;
            this.IconCompatParcelizer -= i4;
            return;
        }
        if (i < i3 && i2 >= i3) {
            this.IconCompatParcelizer = i2 + AudioAttributesCompatParcelizer();
            this.read = i;
            return;
        }
        int iAudioAttributesCompatParcelizer = i + AudioAttributesCompatParcelizer();
        int iAudioAttributesCompatParcelizer2 = AudioAttributesCompatParcelizer();
        int i5 = this.IconCompatParcelizer;
        char[] cArr2 = this.AudioAttributesCompatParcelizer;
        getOrderDetails.RemoteActionCompatParcelizer(cArr2, cArr2, this.read, i5, iAudioAttributesCompatParcelizer);
        this.read += iAudioAttributesCompatParcelizer - i5;
        this.IconCompatParcelizer = i2 + iAudioAttributesCompatParcelizer2;
    }

    public final void RemoteActionCompatParcelizer(int i, int i2, String str) {
        read(str.length() - (i2 - i));
        RemoteActionCompatParcelizer(i, i2);
        SettableAnyProperty.RemoteActionCompatParcelizer(str, this.AudioAttributesCompatParcelizer, this.read);
        this.read += str.length();
    }

    public final void write(StringBuilder sb) {
        sb.append(this.AudioAttributesCompatParcelizer, 0, this.read);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(sb, "");
        char[] cArr = this.AudioAttributesCompatParcelizer;
        int i = this.IconCompatParcelizer;
        sb.append(cArr, i, this.write - i);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(sb, "");
    }

    public final int read() {
        return this.write - AudioAttributesCompatParcelizer();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) sb);
        return sb.toString();
    }
}
