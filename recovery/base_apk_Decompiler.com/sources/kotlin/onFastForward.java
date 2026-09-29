package kotlin;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import kotlin.Metadata;
import kotlin.anyIgnorals;
import kotlin.setRenderer;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0019\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u000b2\b\u0010\b\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u0019\u0010\u0014\u001a\u00020\r2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0013H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0018\u0010\u0011J\u000f\u0010\u0019\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0019\u0010\u0011J\u0017\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u000b2\b\u0010\b\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u001a\u0010\u000fJ\u0017\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001a\u0010\u001cR\u0018\u0010 \u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u001e\u001a\u00020!8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0014\u0010%\u001a\u00020\u001d8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b \u0010$R\u001a\u0010*\u001a\u00020&8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010'\u001a\u0004\b(\u0010)R\u0014\u0010\u0010\u001a\u00020+8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0014\u00100\u001a\u00020.8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b%\u0010/"}, d2 = {"Lo/onFastForward;", "Landroid/app/Dialog;", "Lo/hasGetter;", "Lo/onSetShuffleMode;", "Lo/PieChart;", "Landroid/content/Context;", "p0", "", "p1", "<init>", "(Landroid/content/Context;I)V", "Landroid/view/View;", "Landroid/view/ViewGroup$LayoutParams;", "", "addContentView", "(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V", "read", "()V", "onBackPressed", "Landroid/os/Bundle;", "onCreate", "(Landroid/os/Bundle;)V", "onSaveInstanceState", "()Landroid/os/Bundle;", "onStart", "onStop", "setContentView", "(Landroid/view/View;)V", "(I)V", "Lo/getSetterUnchecked;", "RemoteActionCompatParcelizer", "Lo/getSetterUnchecked;", "write", "Lo/anyIgnorals;", "getLifecycle", "()Lo/anyIgnorals;", "()Lo/getSetterUnchecked;", "AudioAttributesCompatParcelizer", "Lo/onSetRating;", "Lo/onSetRating;", "getOnBackPressedDispatcher", "()Lo/onSetRating;", "IconCompatParcelizer", "Lo/setOnChartValueSelectedListener;", "getSavedStateRegistry", "()Lo/setOnChartValueSelectedListener;", "Lo/setRenderer;", "Lo/setRenderer;", "MediaBrowserCompatItemReceiver"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class onFastForward extends Dialog implements onSetShuffleMode, PieChart {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final setRenderer MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private getSetterUnchecked write;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final onSetRating IconCompatParcelizer;

    public /* synthetic */ onFastForward(Context context, int i, int i2, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(context, (i2 & 2) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public onFastForward(Context context, int i) {
        super(context, i);
        toMagicModuleMetaRepoModel.write(context, "");
        setRenderer.RemoteActionCompatParcelizer remoteActionCompatParcelizer = setRenderer.AudioAttributesCompatParcelizer;
        this.MediaBrowserCompatItemReceiver = setRenderer.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(this);
        this.IconCompatParcelizer = new onSetRating(new Runnable() { // from class: o.onMediaButtonEvent
            @Override // java.lang.Runnable
            public final void run() {
                onFastForward.write(this.AudioAttributesCompatParcelizer);
            }
        });
    }

    private final getSetterUnchecked write() {
        getSetterUnchecked getsetterunchecked = this.write;
        if (getsetterunchecked != null) {
            return getsetterunchecked;
        }
        getSetterUnchecked getsetterunchecked2 = new getSetterUnchecked(this);
        this.write = getsetterunchecked2;
        return getsetterunchecked2;
    }

    @Override // kotlin.PieChart
    public setOnChartValueSelectedListener getSavedStateRegistry() {
        return this.MediaBrowserCompatItemReceiver.getRead();
    }

    @Override // kotlin.hasGetter
    public anyIgnorals getLifecycle() {
        return write();
    }

    @Override // android.app.Dialog
    public Bundle onSaveInstanceState() {
        Bundle bundleOnSaveInstanceState = super.onSaveInstanceState();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(bundleOnSaveInstanceState, "");
        this.MediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer(bundleOnSaveInstanceState);
        return bundleOnSaveInstanceState;
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle p0) {
        super.onCreate(p0);
        if (Build.VERSION.SDK_INT >= 33) {
            onSetRating onsetrating = this.IconCompatParcelizer;
            OnBackInvokedDispatcher onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(onBackInvokedDispatcher, "");
            onsetrating.by_(onBackInvokedDispatcher);
        }
        this.MediaBrowserCompatItemReceiver.AudioAttributesCompatParcelizer(p0);
        write().RemoteActionCompatParcelizer(anyIgnorals.read.ON_CREATE);
    }

    @Override // android.app.Dialog
    public void onStart() {
        super.onStart();
        write().RemoteActionCompatParcelizer(anyIgnorals.read.ON_RESUME);
    }

    @Override // android.app.Dialog
    public void onStop() {
        write().RemoteActionCompatParcelizer(anyIgnorals.read.ON_DESTROY);
        this.write = null;
        super.onStop();
    }

    @Override // kotlin.onSetShuffleMode
    /* JADX INFO: renamed from: getOnBackPressedDispatcher, reason: from getter */
    public final onSetRating getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void write(onFastForward onfastforward) {
        toMagicModuleMetaRepoModel.write(onfastforward, "");
        super.onBackPressed();
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        this.IconCompatParcelizer.RemoteActionCompatParcelizer();
    }

    @Override // android.app.Dialog
    public void setContentView(int p0) {
        read();
        super.setContentView(p0);
    }

    @Override // android.app.Dialog
    public void setContentView(View p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        read();
        super.setContentView(p0);
    }

    @Override // android.app.Dialog
    public void setContentView(View p0, ViewGroup.LayoutParams p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        read();
        super.setContentView(p0, p1);
    }

    @Override // android.app.Dialog
    public void addContentView(View p0, ViewGroup.LayoutParams p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        read();
        super.addContentView(p0, p1);
    }

    public void read() {
        Window window = getWindow();
        toMagicModuleMetaRepoModel.write(window);
        View decorView = window.getDecorView();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(decorView, "");
        isCreatorVisible.IconCompatParcelizer(decorView, this);
        Window window2 = getWindow();
        toMagicModuleMetaRepoModel.write(window2);
        View decorView2 = window2.getDecorView();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(decorView2, "");
        onSkipToQueueItem.read(decorView2, this);
        Window window3 = getWindow();
        toMagicModuleMetaRepoModel.write(window3);
        View decorView3 = window3.getDecorView();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(decorView3, "");
        setCenterTextRadiusPercent.read(decorView3, this);
    }
}
