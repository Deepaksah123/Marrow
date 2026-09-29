package kotlin;

import kotlin.Metadata;
import kotlin.getKeyType;
import kotlin.iterator;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001a\u0010\t\u001a\u00020\f8\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\u000fR\u001a\u0010\r\u001a\u00020\u00108\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0013\u001a\u00020\f8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u000e\u001a\u0004\b\u0015\u0010\u000fR\u001a\u0010\u0015\u001a\u00020\u00108\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\t\u0010\u0014"}, d2 = {"Lo/getSuperClass;", "Lo/wrapWithPath;", "", "p0", "<init>", "([Lo/wrapWithPath;)V", "", "toString", "()Ljava/lang/String;", "AudioAttributesCompatParcelizer", "[Lo/wrapWithPath;", "write", "Lo/iterator;", "RemoteActionCompatParcelizer", "Lo/iterator;", "()Lo/iterator;", "Lo/getKeyType;", "AudioAttributesImplApi26Parcelizer", "Lo/getKeyType;", "read", "()Lo/getKeyType;", "IconCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class getSuperClass implements wrapWithPath {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final wrapWithPath[] write;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private final getKeyType RemoteActionCompatParcelizer;
    private final getKeyType IconCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final iterator AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final iterator read;

    public getSuperClass(wrapWithPath[] wrapwithpathArr) {
        this.write = wrapwithpathArr;
        iterator.Companion companion = iterator.INSTANCE;
        int length = wrapwithpathArr.length;
        iterator[] iteratorVarArr = new iterator[length];
        for (int i = 0; i < length; i++) {
            iteratorVarArr[i] = this.write[i].getWrite();
        }
        this.AudioAttributesCompatParcelizer = companion.read(iteratorVarArr);
        getKeyType.Companion companion2 = getKeyType.INSTANCE;
        int length2 = this.write.length;
        getKeyType[] getkeytypeArr = new getKeyType[length2];
        for (int i2 = 0; i2 < length2; i2++) {
            getkeytypeArr[i2] = this.write[i2].getAudioAttributesCompatParcelizer();
        }
        this.RemoteActionCompatParcelizer = companion2.IconCompatParcelizer(getkeytypeArr);
        iterator.Companion companion3 = iterator.INSTANCE;
        int length3 = this.write.length;
        iterator[] iteratorVarArr2 = new iterator[length3];
        for (int i3 = 0; i3 < length3; i3++) {
            iteratorVarArr2[i3] = this.write[i3].getIconCompatParcelizer();
        }
        this.read = companion3.write(iteratorVarArr2);
        getKeyType.Companion companion4 = getKeyType.INSTANCE;
        int length4 = this.write.length;
        getKeyType[] getkeytypeArr2 = new getKeyType[length4];
        for (int i4 = 0; i4 < length4; i4++) {
            getkeytypeArr2[i4] = this.write[i4].getRead();
        }
        this.IconCompatParcelizer = companion4.AudioAttributesCompatParcelizer(getkeytypeArr2);
    }

    @Override // kotlin.wrapWithPath
    /* JADX INFO: renamed from: write, reason: from getter */
    public final iterator getWrite() {
        return this.AudioAttributesCompatParcelizer;
    }

    @Override // kotlin.wrapWithPath
    /* JADX INFO: renamed from: read, reason: from getter */
    public final getKeyType getAudioAttributesCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    @Override // kotlin.wrapWithPath
    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final iterator getIconCompatParcelizer() {
        return this.read;
    }

    @Override // kotlin.wrapWithPath
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final getKeyType getRead() {
        return this.IconCompatParcelizer;
    }

    public final String toString() {
        return getOrderDetails.RemoteActionCompatParcelizer(this.write, (CharSequence) null, "innermostOf(", ")", 0, (CharSequence) null, (getAnswerMap) null, 57);
    }
}
