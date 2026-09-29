package kotlin;

import android.graphics.Region;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\fR\u0011\u0010\u0007\u001a\u00020\r8\u0006¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00048WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\t8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0012"}, d2 = {"Lo/withAdditionalDeserializers;", "Lo/compileString;", "<init>", "()V", "Lo/appendReferring;", "p0", "", "read", "(Lo/appendReferring;)V", "", "write", "(Lo/compileString;)Z", "(Lo/appendReferring;)Z", "Landroid/graphics/Region;", "IconCompatParcelizer", "Landroid/graphics/Region;", "AudioAttributesCompatParcelizer", "()Lo/appendReferring;", "()Z", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class withAdditionalDeserializers implements compileString {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final Region read = new Region();

    @Override // kotlin.compileString
    public final void read(appendReferring p0) {
        this.read.set(p0.getRead(), p0.getWrite(), p0.getAudioAttributesCompatParcelizer(), p0.getIconCompatParcelizer());
    }

    @Override // kotlin.compileString
    public final appendReferring AudioAttributesCompatParcelizer() {
        return VersionUtil.read(this.read.getBounds());
    }

    @Override // kotlin.compileString
    public final boolean IconCompatParcelizer() {
        return this.read.isEmpty();
    }

    @Override // kotlin.compileString
    public final boolean write(compileString p0) {
        Region region = this.read;
        toMagicModuleMetaRepoModel.read(p0, "");
        return region.op(((withAdditionalDeserializers) p0).read, Region.Op.INTERSECT);
    }

    @Override // kotlin.compileString
    public final boolean write(appendReferring p0) {
        return this.read.op(p0.getRead(), p0.getWrite(), p0.getAudioAttributesCompatParcelizer(), p0.getIconCompatParcelizer(), Region.Op.DIFFERENCE);
    }
}
