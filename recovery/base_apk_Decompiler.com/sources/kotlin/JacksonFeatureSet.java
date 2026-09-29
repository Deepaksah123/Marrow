package kotlin;

import android.graphics.RenderEffect;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0002\u001a\u0004\u0018\u00010\rH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001bR\u0014\u0010\u0017\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001d"}, d2 = {"Lo/JacksonFeatureSet;", "Lo/parseVersionPart;", "p0", "", "p1", "p2", "Lo/findContentSerializer;", "p3", "<init>", "(Lo/parseVersionPart;FFILo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V", "Landroid/graphics/RenderEffect;", "cd_", "()Landroid/graphics/RenderEffect;", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "write", "Lo/parseVersionPart;", "AudioAttributesCompatParcelizer", "IconCompatParcelizer", "F", "read", "I"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class JacksonFeatureSet extends parseVersionPart {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final int write;
    private final float IconCompatParcelizer;
    private final float read;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final parseVersionPart AudioAttributesCompatParcelizer;

    private JacksonFeatureSet(parseVersionPart parseversionpart, float f, float f2, int i) {
        super(null);
        this.AudioAttributesCompatParcelizer = parseversionpart;
        this.IconCompatParcelizer = f;
        this.read = f2;
        this.write = i;
    }

    @Override // kotlin.parseVersionPart
    /* JADX INFO: renamed from: cd_ */
    protected final RenderEffect getRead() {
        return AnnotationIntrospector.INSTANCE.ce_(this.AudioAttributesCompatParcelizer, this.IconCompatParcelizer, this.read, this.write);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof JacksonFeatureSet)) {
            return false;
        }
        JacksonFeatureSet jacksonFeatureSet = (JacksonFeatureSet) p0;
        return this.IconCompatParcelizer == jacksonFeatureSet.IconCompatParcelizer && this.read == jacksonFeatureSet.read && findContentSerializer.IconCompatParcelizer(this.write, jacksonFeatureSet.write) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, jacksonFeatureSet.AudioAttributesCompatParcelizer);
    }

    public final int hashCode() {
        parseVersionPart parseversionpart = this.AudioAttributesCompatParcelizer;
        return ((((((parseversionpart != null ? parseversionpart.hashCode() : 0) * 31) + Float.hashCode(this.IconCompatParcelizer)) * 31) + Float.hashCode(this.read)) * 31) + findContentSerializer.AudioAttributesCompatParcelizer(this.write);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BlurEffect(renderEffect=");
        sb.append(this.AudioAttributesCompatParcelizer);
        sb.append(", radiusX=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", radiusY=");
        sb.append(this.read);
        sb.append(", edgeTreatment=");
        sb.append((Object) findContentSerializer.RemoteActionCompatParcelizer(this.write));
        sb.append(')');
        return sb.toString();
    }

    public /* synthetic */ JacksonFeatureSet(parseVersionPart parseversionpart, float f, float f2, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(parseversionpart, f, f2, i);
    }
}
