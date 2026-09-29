package kotlin;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import kotlin._init_lambda5;
import kotlin.createFullyDrawnExecutor;
import kotlin.peekAvailableContext;

/* JADX INFO: loaded from: classes.dex */
final class onRetainCustomNonConfigurationInstance implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, peekAvailableContext.AudioAttributesCompatParcelizer {
    private createFullyDrawnExecutor AudioAttributesCompatParcelizer;
    private onPanelClosed IconCompatParcelizer;
    private peekAvailableContext.AudioAttributesCompatParcelizer RemoteActionCompatParcelizer;
    private onRequestPermissionsResult read;

    @Override // o.peekAvailableContext.AudioAttributesCompatParcelizer
    public final boolean read(onRequestPermissionsResult onrequestpermissionsresult) {
        return false;
    }

    public onRetainCustomNonConfigurationInstance(onRequestPermissionsResult onrequestpermissionsresult) {
        this.read = onrequestpermissionsresult;
    }

    public final void read() {
        onRequestPermissionsResult onrequestpermissionsresult = this.read;
        createFullyDrawnExecutor.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = new createFullyDrawnExecutor.AudioAttributesCompatParcelizer(onrequestpermissionsresult.IconCompatParcelizer());
        onPanelClosed onpanelclosed = new onPanelClosed(audioAttributesCompatParcelizer.getContext(), _init_lambda5.MediaBrowserCompatCustomActionResultReceiver.abc_list_menu_item_layout);
        this.IconCompatParcelizer = onpanelclosed;
        onpanelclosed.read(this);
        this.read.AudioAttributesCompatParcelizer(this.IconCompatParcelizer);
        audioAttributesCompatParcelizer.RemoteActionCompatParcelizer(this.IconCompatParcelizer.read(), this);
        View viewAudioAttributesImplBaseParcelizer = onrequestpermissionsresult.AudioAttributesImplBaseParcelizer();
        if (viewAudioAttributesImplBaseParcelizer != null) {
            audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(viewAudioAttributesImplBaseParcelizer);
        } else {
            audioAttributesCompatParcelizer.read(onrequestpermissionsresult.AudioAttributesImplApi21Parcelizer()).setTitle(onrequestpermissionsresult.AudioAttributesImplApi26Parcelizer());
        }
        audioAttributesCompatParcelizer.read(this);
        createFullyDrawnExecutor createfullydrawnexecutorCreate = audioAttributesCompatParcelizer.create();
        this.AudioAttributesCompatParcelizer = createfullydrawnexecutorCreate;
        createfullydrawnexecutorCreate.setOnDismissListener(this);
        WindowManager.LayoutParams attributes = this.AudioAttributesCompatParcelizer.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        this.AudioAttributesCompatParcelizer.show();
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.AudioAttributesCompatParcelizer.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.AudioAttributesCompatParcelizer.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.read.RemoteActionCompatParcelizer(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.read.performShortcut(i, keyEvent, 0);
    }

    private void AudioAttributesCompatParcelizer() {
        createFullyDrawnExecutor createfullydrawnexecutor = this.AudioAttributesCompatParcelizer;
        if (createfullydrawnexecutor != null) {
            createfullydrawnexecutor.dismiss();
        }
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.IconCompatParcelizer.IconCompatParcelizer(this.read, true);
    }

    @Override // o.peekAvailableContext.AudioAttributesCompatParcelizer
    public final void RemoteActionCompatParcelizer(onRequestPermissionsResult onrequestpermissionsresult, boolean z) {
        if (z || onrequestpermissionsresult == this.read) {
            AudioAttributesCompatParcelizer();
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.read.IconCompatParcelizer((onRetainNonConfigurationInstance) this.IconCompatParcelizer.read().getItem(i), 0);
    }
}
