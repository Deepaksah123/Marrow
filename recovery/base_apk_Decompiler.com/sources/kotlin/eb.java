package kotlin;

import android.app.Notification;

/* JADX INFO: loaded from: classes2.dex */
public final class eb {
    private final Notification IconCompatParcelizer;
    private final int RemoteActionCompatParcelizer;
    private final int write;

    public eb(int i, Notification notification, int i2) {
        this.write = i;
        this.IconCompatParcelizer = notification;
        this.RemoteActionCompatParcelizer = i2;
    }

    public final int RemoteActionCompatParcelizer() {
        return this.write;
    }

    public final int read() {
        return this.RemoteActionCompatParcelizer;
    }

    public final Notification IconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        eb ebVar = (eb) obj;
        if (this.write == ebVar.write && this.RemoteActionCompatParcelizer == ebVar.RemoteActionCompatParcelizer) {
            return this.IconCompatParcelizer.equals(ebVar.IconCompatParcelizer);
        }
        return false;
    }

    public final int hashCode() {
        return (((this.write * 31) + this.RemoteActionCompatParcelizer) * 31) + this.IconCompatParcelizer.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ForegroundInfo{mNotificationId=");
        sb.append(this.write);
        sb.append(", mForegroundServiceType=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", mNotification=");
        sb.append(this.IconCompatParcelizer);
        sb.append('}');
        return sb.toString();
    }
}
