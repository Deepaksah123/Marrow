package kotlin;

import android.content.Context;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u0003\u001a\u0004\u0018\u00010\u000fH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0019R\u0014\u0010\u0016\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001c"}, d2 = {"Lo/setShowLayoutBounds;", "Lo/setLastVerticalBias;", "Landroid/content/Context;", "p0", "Lo/bufferMapProperty;", "p1", "Lo/switchToNext;", "p2", "Lo/getReturnTransition;", "p3", "<init>", "(Landroid/content/Context;Lo/bufferMapProperty;JLo/getReturnTransition;Lo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V", "Lo/setLastHorizontalStyle;", "write", "()Lo/setLastHorizontalStyle;", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "RemoteActionCompatParcelizer", "Landroid/content/Context;", "AudioAttributesCompatParcelizer", "Lo/bufferMapProperty;", "IconCompatParcelizer", "J", "Lo/getReturnTransition;", "read"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class setShowLayoutBounds implements setLastVerticalBias {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final getReturnTransition read;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final long RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final Context AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final bufferMapProperty IconCompatParcelizer;

    private setShowLayoutBounds(Context context, bufferMapProperty buffermapproperty, long j, getReturnTransition getreturntransition) {
        this.AudioAttributesCompatParcelizer = context;
        this.IconCompatParcelizer = buffermapproperty;
        this.RemoteActionCompatParcelizer = j;
        this.read = getreturntransition;
    }

    @Override // kotlin.setLastVerticalBias
    public final setLastHorizontalStyle write() {
        return new setParentCompositionContext(this.AudioAttributesCompatParcelizer, this.IconCompatParcelizer, this.RemoteActionCompatParcelizer, this.read, null);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(getClass(), p0 != null ? p0.getClass() : null)) {
            return false;
        }
        toMagicModuleMetaRepoModel.read(p0, "");
        setShowLayoutBounds setshowlayoutbounds = (setShowLayoutBounds) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, setshowlayoutbounds.AudioAttributesCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.IconCompatParcelizer, setshowlayoutbounds.IconCompatParcelizer) && switchToNext.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, setshowlayoutbounds.RemoteActionCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.read, setshowlayoutbounds.read);
    }

    public final int hashCode() {
        int iHashCode = this.AudioAttributesCompatParcelizer.hashCode();
        return (((((iHashCode * 31) + this.IconCompatParcelizer.hashCode()) * 31) + switchToNext.MediaBrowserCompatItemReceiver(this.RemoteActionCompatParcelizer)) * 31) + this.read.hashCode();
    }

    public /* synthetic */ setShowLayoutBounds(Context context, bufferMapProperty buffermapproperty, long j, getReturnTransition getreturntransition, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(context, buffermapproperty, j, getreturntransition);
    }
}
