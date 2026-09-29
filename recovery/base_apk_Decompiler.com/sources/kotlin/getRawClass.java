package kotlin;

import java.util.ArrayList;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.wrapWithPath;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tR\u0013\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0019\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00048\u0006¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001a\u0010\r\u001a\u00020\u000f8\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0012\u001a\u00020\u000f8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0011\u001a\u0004\b\f\u0010\u0013"}, d2 = {"Lo/getRawClass;", "Lo/isObject;", "", "p0", "", "p1", "<init>", "(Ljava/lang/String;[Lo/isObject;)V", "toString", "()Ljava/lang/String;", "AudioAttributesCompatParcelizer", "Ljava/lang/String;", "read", "RemoteActionCompatParcelizer", "[Lo/isObject;", "Lo/wrapWithPath;", "write", "Lo/wrapWithPath;", "IconCompatParcelizer", "()Lo/wrapWithPath;"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class getRawClass implements isObject {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final String read;
    private final wrapWithPath IconCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final isObject[] AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final wrapWithPath RemoteActionCompatParcelizer;

    public getRawClass(String str, isObject[] isobjectArr) {
        this.read = str;
        this.AudioAttributesCompatParcelizer = isobjectArr;
        wrapWithPath.Companion companion = wrapWithPath.INSTANCE;
        ArrayList arrayList = new ArrayList(isobjectArr.length);
        for (isObject isobject : isobjectArr) {
            arrayList.add(isobject.getRemoteActionCompatParcelizer());
        }
        wrapWithPath[] wrapwithpathArr = (wrapWithPath[]) arrayList.toArray(new wrapWithPath[0]);
        this.RemoteActionCompatParcelizer = getDescription.RemoteActionCompatParcelizer(companion, (wrapWithPath[]) Arrays.copyOf(wrapwithpathArr, wrapwithpathArr.length));
        wrapWithPath.Companion companion2 = wrapWithPath.INSTANCE;
        isObject[] isobjectArr2 = this.AudioAttributesCompatParcelizer;
        ArrayList arrayList2 = new ArrayList(isobjectArr2.length);
        for (isObject isobject2 : isobjectArr2) {
            arrayList2.add(isobject2.getWrite());
        }
        wrapWithPath[] wrapwithpathArr2 = (wrapWithPath[]) arrayList2.toArray(new wrapWithPath[0]);
        this.IconCompatParcelizer = getDescription.RemoteActionCompatParcelizer(companion2, (wrapWithPath[]) Arrays.copyOf(wrapwithpathArr2, wrapwithpathArr2.length));
    }

    @Override // kotlin.isObject
    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final wrapWithPath getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    @Override // kotlin.isObject
    /* JADX INFO: renamed from: read, reason: from getter */
    public final wrapWithPath getWrite() {
        return this.IconCompatParcelizer;
    }

    public final String toString() {
        String str = this.read;
        return str == null ? getOrderDetails.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, (CharSequence) null, "innermostOf(", ")", 0, (CharSequence) null, (getAnswerMap) null, 57) : str;
    }
}
