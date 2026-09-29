package kotlin;

import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B}\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0011\u001a\u00020\u00102\b\u0010\u0004\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0006\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0013\u001a\u00020\u00102\b\u0010\u0004\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0006\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0013\u0010\u0012J!\u0010\u0011\u001a\u00020\u00102\b\u0010\u0004\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0011\u0010\u0015J\r\u0010\u0016\u001a\u00020\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u001aH\u0000¢\u0006\u0004\b\u0018\u0010\u001bJ/\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u001a2\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0016\u0010\u001cR\u0019\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\u0006\n\u0004\b\u0011\u0010\u001dR\"\u0010\u0018\u001a\u00020\u00058\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001e\u0010!\"\u0004\b\u001e\u0010\"R$\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006@\u0007X\u0087\u000e¢\u0006\f\n\u0004\b\u0018\u0010\u001d\"\u0004\b\u0013\u0010#R$\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006@\u0007X\u0087\u000e¢\u0006\f\n\u0004\b\u0016\u0010\u001d\"\u0004\b\u0016\u0010#R$\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006@\u0007X\u0087\u000e¢\u0006\f\n\u0004\b\u0013\u0010\u001d\"\u0004\b\u0018\u0010#R$\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006@\u0007X\u0087\u000e¢\u0006\f\n\u0004\b$\u0010\u001d\"\u0004\b\u0011\u0010#R$\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006@\u0007X\u0087\u000e¢\u0006\f\n\u0004\b\u001e\u0010\u001d\"\u0004\b\u001e\u0010#"}, d2 = {"Lo/getMergeable;", "", "Lkotlin/Function0;", "", "p0", "Lo/WritableTypeIdInclusion;", "p1", "p2", "p3", "p4", "p5", "p6", "<init>", "(Lo/getCreatedOnDateMs;Lo/WritableTypeIdInclusion;Lo/getCreatedOnDateMs;Lo/getCreatedOnDateMs;Lo/getCreatedOnDateMs;Lo/getCreatedOnDateMs;Lo/getCreatedOnDateMs;)V", "Landroid/view/ActionMode;", "Landroid/view/Menu;", "", "AudioAttributesCompatParcelizer", "(Landroid/view/ActionMode;Landroid/view/Menu;)Z", "RemoteActionCompatParcelizer", "Landroid/view/MenuItem;", "(Landroid/view/ActionMode;Landroid/view/MenuItem;)Z", "IconCompatParcelizer", "()V", "write", "(Landroid/view/Menu;)V", "Lo/getVisibility;", "(Landroid/view/Menu;Lo/getVisibility;)V", "(Landroid/view/Menu;Lo/getVisibility;Lo/getCreatedOnDateMs;)V", "Lo/getCreatedOnDateMs;", "read", "MediaBrowserCompatItemReceiver", "Lo/WritableTypeIdInclusion;", "()Lo/WritableTypeIdInclusion;", "(Lo/WritableTypeIdInclusion;)V", "(Lo/getCreatedOnDateMs;)V", "AudioAttributesImplBaseParcelizer", "AudioAttributesImplApi21Parcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getMergeable {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final getCreatedOnDateMs<getShowPopup> read;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private getCreatedOnDateMs<getShowPopup> AudioAttributesImplApi21Parcelizer;
    private getCreatedOnDateMs<getShowPopup> IconCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private WritableTypeIdInclusion write;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private getCreatedOnDateMs<getShowPopup> AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private getCreatedOnDateMs<getShowPopup> AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private getCreatedOnDateMs<getShowPopup> RemoteActionCompatParcelizer;

    public getMergeable(getCreatedOnDateMs<getShowPopup> getcreatedondatems, WritableTypeIdInclusion writableTypeIdInclusion, getCreatedOnDateMs<getShowPopup> getcreatedondatems2, getCreatedOnDateMs<getShowPopup> getcreatedondatems3, getCreatedOnDateMs<getShowPopup> getcreatedondatems4, getCreatedOnDateMs<getShowPopup> getcreatedondatems5, getCreatedOnDateMs<getShowPopup> getcreatedondatems6) {
        this.read = getcreatedondatems;
        this.write = writableTypeIdInclusion;
        this.RemoteActionCompatParcelizer = getcreatedondatems2;
        this.IconCompatParcelizer = getcreatedondatems3;
        this.AudioAttributesCompatParcelizer = getcreatedondatems4;
        this.AudioAttributesImplApi21Parcelizer = getcreatedondatems5;
        this.AudioAttributesImplBaseParcelizer = getcreatedondatems6;
    }

    public /* synthetic */ getMergeable(getCreatedOnDateMs getcreatedondatems, WritableTypeIdInclusion writableTypeIdInclusion, getCreatedOnDateMs getcreatedondatems2, getCreatedOnDateMs getcreatedondatems3, getCreatedOnDateMs getcreatedondatems4, getCreatedOnDateMs getcreatedondatems5, getCreatedOnDateMs getcreatedondatems6, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i & 1) != 0 ? null : getcreatedondatems, (i & 2) != 0 ? WritableTypeIdInclusion.INSTANCE.write() : writableTypeIdInclusion, (i & 4) != 0 ? null : getcreatedondatems2, (i & 8) != 0 ? null : getcreatedondatems3, (i & 16) != 0 ? null : getcreatedondatems4, (i & 32) != 0 ? null : getcreatedondatems5, (i & 64) != 0 ? null : getcreatedondatems6);
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final WritableTypeIdInclusion getWrite() {
        return this.write;
    }

    public final void read(WritableTypeIdInclusion writableTypeIdInclusion) {
        this.write = writableTypeIdInclusion;
    }

    public final void RemoteActionCompatParcelizer(getCreatedOnDateMs<getShowPopup> getcreatedondatems) {
        this.RemoteActionCompatParcelizer = getcreatedondatems;
    }

    public final void IconCompatParcelizer(getCreatedOnDateMs<getShowPopup> getcreatedondatems) {
        this.IconCompatParcelizer = getcreatedondatems;
    }

    public final void write(getCreatedOnDateMs<getShowPopup> getcreatedondatems) {
        this.AudioAttributesCompatParcelizer = getcreatedondatems;
    }

    public final void AudioAttributesCompatParcelizer(getCreatedOnDateMs<getShowPopup> getcreatedondatems) {
        this.AudioAttributesImplApi21Parcelizer = getcreatedondatems;
    }

    public final void read(getCreatedOnDateMs<getShowPopup> getcreatedondatems) {
        this.AudioAttributesImplBaseParcelizer = getcreatedondatems;
    }

    public final boolean AudioAttributesCompatParcelizer(ActionMode p0, Menu p1) {
        if (p1 == null) {
            throw new IllegalArgumentException("onCreateActionMode requires a non-null menu".toString());
        }
        if (p0 == null) {
            throw new IllegalArgumentException("onCreateActionMode requires a non-null mode".toString());
        }
        if (this.RemoteActionCompatParcelizer != null) {
            write(p1, getVisibility.IconCompatParcelizer);
        }
        if (this.IconCompatParcelizer != null) {
            write(p1, getVisibility.read);
        }
        if (this.AudioAttributesCompatParcelizer != null) {
            write(p1, getVisibility.RemoteActionCompatParcelizer);
        }
        if (this.AudioAttributesImplApi21Parcelizer != null) {
            write(p1, getVisibility.write);
        }
        if (this.AudioAttributesImplBaseParcelizer == null) {
            return true;
        }
        write(p1, getVisibility.AudioAttributesCompatParcelizer);
        return true;
    }

    public final boolean RemoteActionCompatParcelizer(ActionMode p0, Menu p1) {
        if (p0 == null || p1 == null) {
            return false;
        }
        write(p1);
        return true;
    }

    public final boolean AudioAttributesCompatParcelizer(ActionMode p0, MenuItem p1) {
        toMagicModuleMetaRepoModel.write(p1);
        int itemId = p1.getItemId();
        if (itemId == getVisibility.IconCompatParcelizer.getWrite()) {
            getCreatedOnDateMs<getShowPopup> getcreatedondatems = this.RemoteActionCompatParcelizer;
            if (getcreatedondatems != null) {
                getcreatedondatems.invoke();
            }
        } else if (itemId == getVisibility.read.getWrite()) {
            getCreatedOnDateMs<getShowPopup> getcreatedondatems2 = this.IconCompatParcelizer;
            if (getcreatedondatems2 != null) {
                getcreatedondatems2.invoke();
            }
        } else if (itemId == getVisibility.RemoteActionCompatParcelizer.getWrite()) {
            getCreatedOnDateMs<getShowPopup> getcreatedondatems3 = this.AudioAttributesCompatParcelizer;
            if (getcreatedondatems3 != null) {
                getcreatedondatems3.invoke();
            }
        } else if (itemId == getVisibility.write.getWrite()) {
            getCreatedOnDateMs<getShowPopup> getcreatedondatems4 = this.AudioAttributesImplApi21Parcelizer;
            if (getcreatedondatems4 != null) {
                getcreatedondatems4.invoke();
            }
        } else {
            if (itemId != getVisibility.AudioAttributesCompatParcelizer.getWrite()) {
                return false;
            }
            getCreatedOnDateMs<getShowPopup> getcreatedondatems5 = this.AudioAttributesImplBaseParcelizer;
            if (getcreatedondatems5 != null) {
                getcreatedondatems5.invoke();
            }
        }
        if (p0 == null) {
            return true;
        }
        p0.finish();
        return true;
    }

    public final void IconCompatParcelizer() {
        getCreatedOnDateMs<getShowPopup> getcreatedondatems = this.read;
        if (getcreatedondatems != null) {
            getcreatedondatems.invoke();
        }
    }

    public final void write(Menu p0) {
        IconCompatParcelizer(p0, getVisibility.IconCompatParcelizer, this.RemoteActionCompatParcelizer);
        IconCompatParcelizer(p0, getVisibility.read, this.IconCompatParcelizer);
        IconCompatParcelizer(p0, getVisibility.RemoteActionCompatParcelizer, this.AudioAttributesCompatParcelizer);
        IconCompatParcelizer(p0, getVisibility.write, this.AudioAttributesImplApi21Parcelizer);
        IconCompatParcelizer(p0, getVisibility.AudioAttributesCompatParcelizer, this.AudioAttributesImplBaseParcelizer);
    }

    public final void write(Menu p0, getVisibility p1) {
        p0.add(0, p1.getWrite(), p1.getAudioAttributesCompatParcelizer(), p1.read()).setShowAsAction(1);
    }

    private final void IconCompatParcelizer(Menu p0, getVisibility p1, getCreatedOnDateMs<getShowPopup> p2) {
        if (p2 != null && p0.findItem(p1.getWrite()) == null) {
            write(p0, p1);
        } else {
            if (p2 != null || p0.findItem(p1.getWrite()) == null) {
                return;
            }
            p0.removeItem(p1.getWrite());
        }
    }

    public getMergeable() {
        this(null, null, null, null, null, null, null, 127, null);
    }
}
