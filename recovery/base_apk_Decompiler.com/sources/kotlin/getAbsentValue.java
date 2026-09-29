package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0010\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0011R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00018\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013"}, d2 = {"Lo/getAbsentValue;", "", "Lo/_handleOddName;", "p0", "Lo/isAbstract;", "p1", "p2", "<init>", "(Lo/_handleOddName;Lo/isAbstract;Ljava/lang/Object;)V", "", "toString", "()Ljava/lang/String;", "write", "Lo/_handleOddName;", "RemoteActionCompatParcelizer", "()Lo/_handleOddName;", "AudioAttributesCompatParcelizer", "Lo/isAbstract;", "IconCompatParcelizer", "Ljava/lang/Object;", "read"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getAbsentValue {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final Object read;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final isAbstract write;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final _handleOddName AudioAttributesCompatParcelizer;

    public getAbsentValue(_handleOddName _handleoddname, isAbstract isabstract, Object obj) {
        this.AudioAttributesCompatParcelizer = _handleoddname;
        this.write = isabstract;
        this.read = obj;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final _handleOddName getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ModifierInfo(");
        sb.append(this.AudioAttributesCompatParcelizer);
        sb.append(", ");
        sb.append(this.write);
        sb.append(", ");
        sb.append(this.read);
        sb.append(')');
        return sb.toString();
    }
}
