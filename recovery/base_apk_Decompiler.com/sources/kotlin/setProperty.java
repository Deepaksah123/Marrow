package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0006H\u0086\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0013\u001a\u00020\u00028\u0006@\u0006X\u0086\f¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\n\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u0018R\u0016\u0010\u0011\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0011\u0010\r\u001a\u00020\u00068G¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0019"}, d2 = {"Lo/setProperty;", "", "", "p0", "<init>", "(Ljava/lang/String;)V", "", "p1", "p2", "", "read", "(IILjava/lang/String;)V", "", "AudioAttributesCompatParcelizer", "(I)C", "toString", "()Ljava/lang/String;", "IconCompatParcelizer", "Ljava/lang/String;", "write", "Lo/constructForJsonNodeField;", "AudioAttributesImplApi26Parcelizer", "Lo/constructForJsonNodeField;", "RemoteActionCompatParcelizer", "I", "()I"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class setProperty {

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private constructForJsonNodeField RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    public String write;
    public static final int read = 8;

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private int read = -1;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private int IconCompatParcelizer = -1;

    public setProperty(String str) {
        this.write = str;
    }

    public final int IconCompatParcelizer() {
        constructForJsonNodeField constructforjsonnodefield = this.RemoteActionCompatParcelizer;
        return constructforjsonnodefield == null ? this.write.length() : (this.write.length() - (this.IconCompatParcelizer - this.read)) + constructforjsonnodefield.read();
    }

    public final void read(int p0, int p1, String p2) {
        if (p0 > p1) {
            StringBuilder sb = new StringBuilder("start index must be less than or equal to end index: ");
            sb.append(p0);
            sb.append(" > ");
            sb.append(p1);
            withStackTrace.read(sb.toString());
        }
        if (p0 < 0) {
            withStackTrace.read("start must be non-negative, but was ".concat(String.valueOf(p0)));
        }
        constructForJsonNodeField constructforjsonnodefield = this.RemoteActionCompatParcelizer;
        if (constructforjsonnodefield == null) {
            int iMax = Math.max(255, p2.length() + 128);
            char[] cArr = new char[iMax];
            int iMin = Math.min(p0, 64);
            int iMin2 = Math.min(this.write.length() - p1, 64);
            int i = p0 - iMin;
            NullValueProvider.write(this.write, cArr, 0, i, p0);
            int i2 = iMax - iMin2;
            int i3 = iMin2 + p1;
            NullValueProvider.write(this.write, cArr, i2, p1, i3);
            SettableAnyProperty.RemoteActionCompatParcelizer(p2, cArr, iMin);
            this.RemoteActionCompatParcelizer = new constructForJsonNodeField(cArr, iMin + p2.length(), i2);
            this.read = i;
            this.IconCompatParcelizer = i3;
            return;
        }
        int i4 = this.read;
        int i5 = p0 - i4;
        int i6 = p1 - i4;
        if (i5 < 0 || i6 > constructforjsonnodefield.read()) {
            this.write = toString();
            this.RemoteActionCompatParcelizer = null;
            this.read = -1;
            this.IconCompatParcelizer = -1;
            read(p0, p1, p2);
            return;
        }
        constructforjsonnodefield.RemoteActionCompatParcelizer(i5, i6, p2);
    }

    public final char AudioAttributesCompatParcelizer(int p0) {
        constructForJsonNodeField constructforjsonnodefield = this.RemoteActionCompatParcelizer;
        if (constructforjsonnodefield == null) {
            return this.write.charAt(p0);
        }
        if (p0 < this.read) {
            return this.write.charAt(p0);
        }
        int i = constructforjsonnodefield.read();
        int i2 = this.read;
        if (p0 < i + i2) {
            return constructforjsonnodefield.RemoteActionCompatParcelizer(p0 - i2);
        }
        return this.write.charAt(p0 - ((i - this.IconCompatParcelizer) + i2));
    }

    public final String toString() {
        constructForJsonNodeField constructforjsonnodefield = this.RemoteActionCompatParcelizer;
        if (constructforjsonnodefield == null) {
            return this.write;
        }
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) this.write, 0, this.read);
        constructforjsonnodefield.write(sb);
        String str = this.write;
        sb.append((CharSequence) str, this.IconCompatParcelizer, str.length());
        return sb.toString();
    }
}
