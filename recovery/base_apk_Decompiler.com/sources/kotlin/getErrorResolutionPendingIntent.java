package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/marrow2/ui/feedback/viewmodel/ThankYouUIState;", "", "slideUpHeart", "", "slideUpTYText", "<init>", "(ZZ)V", "getSlideUpHeart", "()Z", "getSlideUpTYText", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class getErrorResolutionPendingIntent {
    private final boolean RemoteActionCompatParcelizer;
    private final boolean write;

    private getErrorResolutionPendingIntent(boolean z, boolean z2) {
        this.write = z;
        this.RemoteActionCompatParcelizer = z2;
    }

    public /* synthetic */ getErrorResolutionPendingIntent(boolean z, boolean z2, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2);
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final boolean getWrite() {
        return this.write;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final boolean getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public getErrorResolutionPendingIntent() {
        boolean z = false;
        this(z, z, 3, null);
    }

    public static getErrorResolutionPendingIntent AudioAttributesCompatParcelizer(boolean z, boolean z2) {
        return new getErrorResolutionPendingIntent(z, z2);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof getErrorResolutionPendingIntent)) {
            return false;
        }
        getErrorResolutionPendingIntent geterrorresolutionpendingintent = (getErrorResolutionPendingIntent) other;
        return this.write == geterrorresolutionpendingintent.write && this.RemoteActionCompatParcelizer == geterrorresolutionpendingintent.RemoteActionCompatParcelizer;
    }

    public final int hashCode() {
        return (Boolean.hashCode(this.write) * 31) + Boolean.hashCode(this.RemoteActionCompatParcelizer);
    }

    public final String toString() {
        boolean z = this.write;
        boolean z2 = this.RemoteActionCompatParcelizer;
        StringBuilder sb = new StringBuilder("ThankYouUIState(slideUpHeart=");
        sb.append(z);
        sb.append(", slideUpTYText=");
        sb.append(z2);
        sb.append(")");
        return sb.toString();
    }
}
