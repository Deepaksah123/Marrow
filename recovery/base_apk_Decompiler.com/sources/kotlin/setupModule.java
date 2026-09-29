package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\f\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\bJ\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\rJ\r\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0010H\u0002¢\u0006\u0004\b\f\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0015R\u001e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0016R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0018"}, d2 = {"Lo/setupModule;", "", "", "p0", "<init>", "(Z)V", "Lo/_assertNotNull;", "AudioAttributesCompatParcelizer", "(Lo/_assertNotNull;)Z", "", "write", "(Lo/_assertNotNull;)V", "read", "()Lo/_assertNotNull;", "IconCompatParcelizer", "()Z", "Lo/AlertDialogLayout;", "()Lo/AlertDialogLayout;", "", "toString", "()Ljava/lang/String;", "Z", "Lo/AlertDialogLayout;", "Lo/withDescription;", "Lo/withDescription;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class setupModule {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private AlertDialogLayout<_assertNotNull> IconCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final withDescription<_assertNotNull> write = new withDescription<>(ModuleSetupContext.IconCompatParcelizer);

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final boolean read;

    public setupModule(boolean z) {
        this.read = z;
    }

    public final boolean AudioAttributesCompatParcelizer(_assertNotNull p0) {
        boolean zContains = this.write.contains(p0);
        if (this.read && zContains != read().AudioAttributesCompatParcelizer(p0)) {
            reportWrongTokenException.read("inconsistency in TreeSet");
        }
        return zContains;
    }

    public final void write(_assertNotNull p0) {
        if (!p0.AudioAttributesImplApi26Parcelizer()) {
            reportWrongTokenException.read("DepthSortedSet.add called on an unattached node");
        }
        if (this.read) {
            AlertDialogLayout<_assertNotNull> alertDialogLayout = read();
            int i = alertDialogLayout.read(p0, Integer.MAX_VALUE);
            if (i == Integer.MAX_VALUE) {
                alertDialogLayout.RemoteActionCompatParcelizer(p0, p0.getOnPlayFromUri());
            } else if (i != p0.getOnPlayFromUri()) {
                reportWrongTokenException.read("invalid node depth");
            }
        }
        this.write.add(p0);
    }

    public final boolean read(_assertNotNull p0) {
        if (!p0.AudioAttributesImplApi26Parcelizer()) {
            reportWrongTokenException.read("DepthSortedSet.remove called on an unattached node");
        }
        boolean zRemove = this.write.remove(p0);
        if (this.read) {
            AlertDialogLayout<_assertNotNull> alertDialogLayout = read();
            if (alertDialogLayout.AudioAttributesCompatParcelizer(p0)) {
                int iWrite = alertDialogLayout.write(p0);
                alertDialogLayout.IconCompatParcelizer(p0);
                if (iWrite != (zRemove ? p0.getOnPlayFromUri() : Integer.MAX_VALUE)) {
                    reportWrongTokenException.read("invalid node depth");
                }
            }
        }
        return zRemove;
    }

    public final _assertNotNull AudioAttributesCompatParcelizer() {
        _assertNotNull _assertnotnullFirst = this.write.first();
        read(_assertnotnullFirst);
        return _assertnotnullFirst;
    }

    public final boolean IconCompatParcelizer() {
        return this.write.isEmpty();
    }

    private final AlertDialogLayout<_assertNotNull> read() {
        if (this.IconCompatParcelizer == null) {
            this.IconCompatParcelizer = setSupportCompoundDrawablesTintList.IconCompatParcelizer();
        }
        AlertDialogLayout<_assertNotNull> alertDialogLayout = this.IconCompatParcelizer;
        toMagicModuleMetaRepoModel.write(alertDialogLayout);
        return alertDialogLayout;
    }

    public final String toString() {
        return this.write.toString();
    }
}
