package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0012\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0012\u0010\u0015R&\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018"}, d2 = {"Lo/getUnmodifiedPayloads;", "Lo/getPosition;", "", "p0", "", "p1", "", "p2", "Lkotlin/Function1;", "Lo/isRecyclable;", "", "p3", "<init>", "(Ljava/lang/Object;Ljava/lang/String;ILo/getAnswerMap;)V", "toString", "()Ljava/lang/String;", "read", "Ljava/lang/String;", "write", "RemoteActionCompatParcelizer", "I", "()I", "IconCompatParcelizer", "Lo/getAnswerMap;", "()Lo/getAnswerMap;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getUnmodifiedPayloads extends getPosition {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final getAnswerMap<isRecyclable, getShowPopup> RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final int read;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final String write;

    /* JADX WARN: Multi-variable type inference failed */
    public getUnmodifiedPayloads(Object obj, String str, int i, getAnswerMap<? super isRecyclable, getShowPopup> getanswermap) {
        super(obj);
        this.write = str;
        this.read = i;
        this.RemoteActionCompatParcelizer = getanswermap;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final String getWrite() {
        return this.write;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final int getRead() {
        return this.read;
    }

    public final getAnswerMap<isRecyclable, getShowPopup> IconCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextContextMenuItem(key=");
        sb.append(getAudioAttributesCompatParcelizer());
        sb.append(", label=\"");
        sb.append(this.write);
        sb.append("\", leadingIcon=");
        sb.append(this.read);
        sb.append(')');
        return sb.toString();
    }
}
