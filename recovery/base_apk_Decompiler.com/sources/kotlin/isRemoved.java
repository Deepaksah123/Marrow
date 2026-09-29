package kotlin;

import android.view.textclassifier.TextClassification;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0011\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u000f\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014"}, d2 = {"Lo/isRemoved;", "Lo/getPosition;", "", "p0", "Landroid/view/textclassifier/TextClassification;", "p1", "", "p2", "<init>", "(Ljava/lang/Object;Landroid/view/textclassifier/TextClassification;I)V", "", "toString", "()Ljava/lang/String;", "RemoteActionCompatParcelizer", "Landroid/view/textclassifier/TextClassification;", "IconCompatParcelizer", "()Landroid/view/textclassifier/TextClassification;", "write", "I", "read", "()I"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class isRemoved extends getPosition {

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final TextClassification write;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final int IconCompatParcelizer;

    public isRemoved(Object obj, TextClassification textClassification, int i) {
        super(obj);
        this.write = textClassification;
        this.IconCompatParcelizer = i;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final TextClassification getWrite() {
        return this.write;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final int getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextContextMenuRemoteActionItem(key=");
        sb.append(getAudioAttributesCompatParcelizer());
        sb.append(", textClassification=");
        sb.append(this.write);
        sb.append(", index=");
        sb.append(this.IconCompatParcelizer);
        sb.append(')');
        return sb.toString();
    }
}
