package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0011\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0011\u0010\u0017"}, d2 = {"Lo/setUncaughtExceptionHandlerui;", "", "Lo/assignParameter;", "p0", "Lo/Instantiatable;", "p1", "<init>", "(FLo/Instantiatable;Lo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "IconCompatParcelizer", "F", "RemoteActionCompatParcelizer", "()F", "write", "Lo/Instantiatable;", "()Lo/Instantiatable;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class setUncaughtExceptionHandlerui {
    private final float IconCompatParcelizer;
    private final Instantiatable write;

    private setUncaughtExceptionHandlerui(float f, Instantiatable instantiatable) {
        this.IconCompatParcelizer = f;
        this.write = instantiatable;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final Instantiatable getWrite() {
        return this.write;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final float getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof setUncaughtExceptionHandlerui)) {
            return false;
        }
        setUncaughtExceptionHandlerui setuncaughtexceptionhandlerui = (setUncaughtExceptionHandlerui) p0;
        return assignParameter.IconCompatParcelizer(this.IconCompatParcelizer, setuncaughtexceptionhandlerui.IconCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.write, setuncaughtexceptionhandlerui.write);
    }

    public final int hashCode() {
        return (assignParameter.AudioAttributesCompatParcelizer(this.IconCompatParcelizer) * 31) + this.write.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BorderStroke(width=");
        sb.append((Object) assignParameter.RemoteActionCompatParcelizer(this.IconCompatParcelizer));
        sb.append(", brush=");
        sb.append(this.write);
        sb.append(')');
        return sb.toString();
    }

    public /* synthetic */ setUncaughtExceptionHandlerui(float f, Instantiatable instantiatable, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(f, instantiatable);
    }
}
