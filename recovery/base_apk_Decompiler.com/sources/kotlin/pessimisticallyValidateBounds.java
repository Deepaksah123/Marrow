package kotlin;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import java.io.PrintWriter;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0011\b\u0010\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B+\b\u0000\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0005\u0010\u000eJ9\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00020\u000f2\b\u0010\t\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000b\u001a\u00020\u00112\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0004\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0014\u001a\u00028\u0000H&¢\u0006\u0004\b\u0014\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ-\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00020 2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00122\u0006\u0010\u000b\u001a\u00020\fH\u0017¢\u0006\u0004\b\u0017\u0010!J\u0017\u0010\u0014\u001a\u00020\u001d2\u0006\u0010\u0004\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0014\u0010\"J1\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00020 2\u0006\u0010\t\u001a\u00020#2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010$H\u0016¢\u0006\u0004\b\u001e\u0010%JS\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00020 2\u0006\u0010\t\u001a\u00020&2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010#2\u0006\u0010'\u001a\u00020\f2\u0006\u0010(\u001a\u00020\f2\u0006\u0010)\u001a\u00020\f2\b\u0010*\u001a\u0004\u0018\u00010$H\u0017¢\u0006\u0004\b\u0017\u0010+J\u000f\u0010\u0017\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0017\u0010,R\u0019\u0010.\u001a\u0004\u0018\u00010\u00078\u0007¢\u0006\f\n\u0004\b\u001e\u0010-\u001a\u0004\b.\u0010/R\u001a\u0010\u0017\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b.\u00100\u001a\u0004\b1\u00102R\u001a\u0010\u001e\u001a\u0002038GX\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u00104\u001a\u0004\b5\u00106R\u001a\u0010\u0014\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u00107\u001a\u0004\b8\u00109R\u0014\u0010\u001b\u001a\u00020\f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010:"}, d2 = {"Lo/pessimisticallyValidateBounds;", "H", "Lo/getAlwaysAsId;", "Lo/maybeGetTypeVariable;", "p0", "<init>", "(Lo/maybeGetTypeVariable;)V", "Landroid/app/Activity;", "Landroid/content/Context;", "p1", "Landroid/os/Handler;", "p2", "", "p3", "(Landroid/app/Activity;Landroid/content/Context;Landroid/os/Handler;)V", "", "Ljava/io/FileDescriptor;", "Ljava/io/PrintWriter;", "", "", "write", "(Ljava/lang/String;Ljava/io/PrintWriter;[Ljava/lang/String;)V", "Landroid/view/View;", "read", "(I)Landroid/view/View;", "()Ljava/lang/Object;", "Landroid/view/LayoutInflater;", "RemoteActionCompatParcelizer", "()Landroid/view/LayoutInflater;", "", "AudioAttributesCompatParcelizer", "()Z", "Landroidx/fragment/app/Fragment;", "(Landroidx/fragment/app/Fragment;[Ljava/lang/String;)V", "(Ljava/lang/String;)Z", "Landroid/content/Intent;", "Landroid/os/Bundle;", "(Landroidx/fragment/app/Fragment;Landroid/content/Intent;ILandroid/os/Bundle;)V", "Landroid/content/IntentSender;", "p4", "p5", "p6", "p7", "(Landroidx/fragment/app/Fragment;Landroid/content/IntentSender;ILandroid/content/Intent;IIILandroid/os/Bundle;)V", "()V", "Landroid/app/Activity;", "IconCompatParcelizer", "()Landroid/app/Activity;", "Landroid/content/Context;", "AudioAttributesImplApi21Parcelizer", "()Landroid/content/Context;", "Landroidx/fragment/app/FragmentManager;", "Landroidx/fragment/app/FragmentManager;", "AudioAttributesImplBaseParcelizer", "()Landroidx/fragment/app/FragmentManager;", "Landroid/os/Handler;", "MediaBrowserCompatItemReceiver", "()Landroid/os/Handler;", "I"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class pessimisticallyValidateBounds<H> extends getAlwaysAsId {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final Activity IconCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final Context read;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final Handler write;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final int RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final FragmentManager AudioAttributesCompatParcelizer;

    @Override // kotlin.getAlwaysAsId
    public boolean AudioAttributesCompatParcelizer() {
        return true;
    }

    @Override // kotlin.getAlwaysAsId
    public View read(int p0) {
        return null;
    }

    public void read() {
    }

    public abstract H write();

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final Activity getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from getter */
    public final Context getRead() {
        return this.read;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from getter */
    public final Handler getWrite() {
        return this.write;
    }

    private pessimisticallyValidateBounds(Activity activity, Context context, Handler handler) {
        toMagicModuleMetaRepoModel.write(context, "");
        toMagicModuleMetaRepoModel.write(handler, "");
        this.IconCompatParcelizer = activity;
        this.read = context;
        this.write = handler;
        this.RemoteActionCompatParcelizer = 0;
        this.AudioAttributesCompatParcelizer = new _checkRenameByField();
    }

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from getter */
    public final FragmentManager getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public pessimisticallyValidateBounds(maybeGetTypeVariable maybegettypevariable) {
        this(maybegettypevariable, maybegettypevariable, new Handler());
        toMagicModuleMetaRepoModel.write(maybegettypevariable, "");
    }

    public LayoutInflater RemoteActionCompatParcelizer() {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.read);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(layoutInflaterFrom, "");
        return layoutInflaterFrom;
    }

    public final void AudioAttributesCompatParcelizer(Fragment p0, Intent p1, int p2, Bundle p3) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        if (p2 != -1) {
            throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host".toString());
        }
        _isNaN.startActivity(this.read, p1, p3);
    }

    @getRenewGrpId
    public final void read(Fragment p0, IntentSender p1, int p2, Intent p3, int p4, int p5, int p6, Bundle p7) throws IntentSender.SendIntentException {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        if (p2 != -1) {
            throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host".toString());
        }
        Activity activity = this.IconCompatParcelizer;
        if (activity == null) {
            throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host".toString());
        }
        _checkBooleanToStringCoercion.IconCompatParcelizer(activity, p1, p2, p3, p4, p5, p6, p7);
    }

    public void write(String str, PrintWriter printWriter, String[] strArr) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(printWriter, "");
    }

    @getRenewGrpId
    public static void read(Fragment fragment, String[] strArr) {
        toMagicModuleMetaRepoModel.write(fragment, "");
        toMagicModuleMetaRepoModel.write(strArr, "");
    }

    public boolean write(String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return false;
    }
}
