package kotlin;

/* JADX INFO: loaded from: classes.dex */
public final class getAdDurationUs {
    public final boolean IconCompatParcelizer;
    private boolean read;

    public getAdDurationUs(boolean z, boolean z2) {
        this.IconCompatParcelizer = z;
        this.read = z2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NotificationInfo{fromCleverTap=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", shouldRender=");
        sb.append(this.read);
        sb.append('}');
        return sb.toString();
    }
}
