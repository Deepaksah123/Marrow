package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\n\b\u0080\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ2\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0013\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u000fR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\t\u0010\u0017R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0013\u0010\u001a"}, d2 = {"Lo/JsonGeneratorImpl;", "", "", "p0", "Lo/_skipCComment;", "p1", "p2", "<init>", "(ILo/_skipCComment;Ljava/lang/Integer;)V", "read", "(ILo/_skipCComment;Ljava/lang/Integer;)Lo/JsonGeneratorImpl;", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "AudioAttributesCompatParcelizer", "I", "IconCompatParcelizer", "Lo/_skipCComment;", "()Lo/_skipCComment;", "write", "Ljava/lang/Integer;", "()Ljava/lang/Integer;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class JsonGeneratorImpl {
    private final int AudioAttributesCompatParcelizer;
    private final _skipCComment IconCompatParcelizer;
    private final Integer write;

    public JsonGeneratorImpl(int i, _skipCComment _skipccomment, Integer num) {
        this.AudioAttributesCompatParcelizer = i;
        this.IconCompatParcelizer = _skipccomment;
        this.write = num;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final int getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final _skipCComment getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final Integer getWrite() {
        return this.write;
    }

    public static /* synthetic */ JsonGeneratorImpl read$default(JsonGeneratorImpl jsonGeneratorImpl, int i, _skipCComment _skipccomment, Integer num, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = jsonGeneratorImpl.AudioAttributesCompatParcelizer;
        }
        if ((i2 & 2) != 0) {
            _skipccomment = jsonGeneratorImpl.IconCompatParcelizer;
        }
        if ((i2 & 4) != 0) {
            num = jsonGeneratorImpl.write;
        }
        return jsonGeneratorImpl.read(i, _skipccomment, num);
    }

    public final JsonGeneratorImpl read(int p0, _skipCComment p1, Integer p2) {
        return new JsonGeneratorImpl(p0, p1, p2);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof JsonGeneratorImpl)) {
            return false;
        }
        JsonGeneratorImpl jsonGeneratorImpl = (JsonGeneratorImpl) p0;
        return this.AudioAttributesCompatParcelizer == jsonGeneratorImpl.AudioAttributesCompatParcelizer && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.IconCompatParcelizer, jsonGeneratorImpl.IconCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.write, jsonGeneratorImpl.write);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.AudioAttributesCompatParcelizer);
        _skipCComment _skipccomment = this.IconCompatParcelizer;
        int iHashCode2 = _skipccomment == null ? 0 : _skipccomment.hashCode();
        Integer num = this.write;
        return (((iHashCode * 31) + iHashCode2) * 31) + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("JsonGeneratorImpl(AudioAttributesCompatParcelizer=");
        sb.append(this.AudioAttributesCompatParcelizer);
        sb.append(", IconCompatParcelizer=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", write=");
        sb.append(this.write);
        sb.append(')');
        return sb.toString();
    }
}
