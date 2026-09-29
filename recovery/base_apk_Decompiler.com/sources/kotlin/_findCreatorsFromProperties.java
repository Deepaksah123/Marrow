package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\t\b\u0080\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\n\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0015\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0011\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0011\u0010\rR\u001a\u0010\u0017\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0016\u001a\u0004\b\u0015\u0010\r"}, d2 = {"Lo/_findCreatorsFromProperties;", "", "Lo/_findCustomBeanDeserializer;", "p0", "", "p1", "p2", "<init>", "(Lo/_findCustomBeanDeserializer;II)V", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "write", "Lo/_findCustomBeanDeserializer;", "RemoteActionCompatParcelizer", "()Lo/_findCustomBeanDeserializer;", "IconCompatParcelizer", "I", "AudioAttributesCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class _findCreatorsFromProperties {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final int write;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final int AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final _findCustomBeanDeserializer IconCompatParcelizer;

    public _findCreatorsFromProperties(_findCustomBeanDeserializer _findcustombeandeserializer, int i, int i2) {
        this.IconCompatParcelizer = _findcustombeandeserializer;
        this.write = i;
        this.AudioAttributesCompatParcelizer = i2;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final _findCustomBeanDeserializer getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final int getWrite() {
        return this.write;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final int getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof _findCreatorsFromProperties)) {
            return false;
        }
        _findCreatorsFromProperties _findcreatorsfromproperties = (_findCreatorsFromProperties) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.IconCompatParcelizer, _findcreatorsfromproperties.IconCompatParcelizer) && this.write == _findcreatorsfromproperties.write && this.AudioAttributesCompatParcelizer == _findcreatorsfromproperties.AudioAttributesCompatParcelizer;
    }

    public final int hashCode() {
        return (((this.IconCompatParcelizer.hashCode() * 31) + Integer.hashCode(this.write)) * 31) + Integer.hashCode(this.AudioAttributesCompatParcelizer);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("_findCreatorsFromProperties(IconCompatParcelizer=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", write=");
        sb.append(this.write);
        sb.append(", AudioAttributesCompatParcelizer=");
        sb.append(this.AudioAttributesCompatParcelizer);
        sb.append(')');
        return sb.toString();
    }
}
