package kotlin;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes4.dex */
public final class setDegree extends CancellationException implements setTestStatus<setDegree> {
    private transient setPassingYear IconCompatParcelizer;

    public setDegree(String str, Throwable th, setPassingYear setpassingyear) {
        super(str);
        this.IconCompatParcelizer = setpassingyear;
        if (th != null) {
            initCause(th);
        }
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        if (getCollegeId.IconCompatParcelizer()) {
            return super.fillInStackTrace();
        }
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.setTestStatus
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public setDegree RemoteActionCompatParcelizer() {
        if (!getCollegeId.IconCompatParcelizer()) {
            return null;
        }
        String message = getMessage();
        toMagicModuleMetaRepoModel.write((Object) message);
        return new setDegree(message, this, this.IconCompatParcelizer);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("; job=");
        sb.append(this.IconCompatParcelizer);
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof setDegree)) {
            return false;
        }
        setDegree setdegree = (setDegree) obj;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) setdegree.getMessage(), (Object) getMessage()) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(setdegree.IconCompatParcelizer, this.IconCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(setdegree.getCause(), getCause());
    }

    public final int hashCode() {
        String message = getMessage();
        toMagicModuleMetaRepoModel.write((Object) message);
        int iHashCode = message.hashCode();
        int iHashCode2 = this.IconCompatParcelizer.hashCode();
        Throwable cause = getCause();
        return (((iHashCode * 31) + iHashCode2) * 31) + (cause != null ? cause.hashCode() : 0);
    }
}
