package kotlin;

import com.marrow2.data.user.remote.model.ResetContentInfoResponse;

/* JADX INFO: loaded from: classes3.dex */
public final class postAtFrontOfQueue {
    private final ResetContentInfoResponse.ScreenCopy RemoteActionCompatParcelizer;
    private final ResetContentInfoResponse.ContentStatus read;

    public postAtFrontOfQueue(ResetContentInfoResponse.ContentStatus contentStatus, ResetContentInfoResponse.ScreenCopy screenCopy) {
        this.read = contentStatus;
        this.RemoteActionCompatParcelizer = screenCopy;
    }

    public final ResetContentInfoResponse.ContentStatus read() {
        return this.read;
    }

    public final ResetContentInfoResponse.ScreenCopy RemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof postAtFrontOfQueue)) {
            return false;
        }
        postAtFrontOfQueue postatfrontofqueue = (postAtFrontOfQueue) obj;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.read, postatfrontofqueue.read) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, postatfrontofqueue.RemoteActionCompatParcelizer);
    }

    public final int hashCode() {
        ResetContentInfoResponse.ContentStatus contentStatus = this.read;
        int iHashCode = contentStatus == null ? 0 : contentStatus.hashCode();
        ResetContentInfoResponse.ScreenCopy screenCopy = this.RemoteActionCompatParcelizer;
        return (iHashCode * 31) + (screenCopy != null ? screenCopy.hashCode() : 0);
    }

    public final String toString() {
        ResetContentInfoResponse.ContentStatus contentStatus = this.read;
        ResetContentInfoResponse.ScreenCopy screenCopy = this.RemoteActionCompatParcelizer;
        StringBuilder sb = new StringBuilder("ResetContentInfoRepoModel(contentStatus=");
        sb.append(contentStatus);
        sb.append(", screenCopy=");
        sb.append(screenCopy);
        sb.append(")");
        return sb.toString();
    }
}
