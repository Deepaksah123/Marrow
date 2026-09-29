package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0004\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001a\u001a\u00020\u00038\u0006¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0011\u0010\u001d\u001a\u00020\u00058\u0006¢\u0006\u0006\n\u0004\b\u000e\u0010\u001cR\u0011\u0010\u001e\u001a\u00020\u00078\u0006¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f"}, d2 = {"Lo/setUncaughtExceptionHandler;", "Lo/writerFor;", "Lo/setAccessibilityEventBatchIntervalMillis;", "Lo/assignParameter;", "p0", "Lo/Instantiatable;", "p1", "Lo/findAndAddVirtualProperties;", "p2", "<init>", "(FLo/Instantiatable;Lo/findAndAddVirtualProperties;Lo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V", "AudioAttributesCompatParcelizer", "()Lo/setAccessibilityEventBatchIntervalMillis;", "", "write", "(Lo/setAccessibilityEventBatchIntervalMillis;)V", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "IconCompatParcelizer", "F", "Lo/Instantiatable;", "RemoteActionCompatParcelizer", "read", "Lo/findAndAddVirtualProperties;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class setUncaughtExceptionHandler extends writerFor<setAccessibilityEventBatchIntervalMillis> {
    private final float IconCompatParcelizer;
    private final findAndAddVirtualProperties read;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final Instantiatable RemoteActionCompatParcelizer;

    private setUncaughtExceptionHandler(float f, Instantiatable instantiatable, findAndAddVirtualProperties findandaddvirtualproperties) {
        this.IconCompatParcelizer = f;
        this.RemoteActionCompatParcelizer = instantiatable;
        this.read = findandaddvirtualproperties;
    }

    @Override // kotlin.writerFor
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final setAccessibilityEventBatchIntervalMillis IconCompatParcelizer() {
        return new setAccessibilityEventBatchIntervalMillis(this.IconCompatParcelizer, this.RemoteActionCompatParcelizer, this.read, null);
    }

    @Override // kotlin.writerFor
    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
    public final void IconCompatParcelizer(setAccessibilityEventBatchIntervalMillis p0) {
        p0.AudioAttributesCompatParcelizer(this.IconCompatParcelizer);
        p0.write(this.RemoteActionCompatParcelizer);
        p0.IconCompatParcelizer(this.read);
    }

    public /* synthetic */ setUncaughtExceptionHandler(float f, Instantiatable instantiatable, findAndAddVirtualProperties findandaddvirtualproperties, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(f, instantiatable, findandaddvirtualproperties);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof setUncaughtExceptionHandler)) {
            return false;
        }
        setUncaughtExceptionHandler setuncaughtexceptionhandler = (setUncaughtExceptionHandler) p0;
        return assignParameter.IconCompatParcelizer(this.IconCompatParcelizer, setuncaughtexceptionhandler.IconCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, setuncaughtexceptionhandler.RemoteActionCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.read, setuncaughtexceptionhandler.read);
    }

    public final int hashCode() {
        return (((assignParameter.AudioAttributesCompatParcelizer(this.IconCompatParcelizer) * 31) + this.RemoteActionCompatParcelizer.hashCode()) * 31) + this.read.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("setUncaughtExceptionHandler(IconCompatParcelizer=");
        sb.append((Object) assignParameter.RemoteActionCompatParcelizer(this.IconCompatParcelizer));
        sb.append(", RemoteActionCompatParcelizer=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", read=");
        sb.append(this.read);
        sb.append(')');
        return sb.toString();
    }
}
