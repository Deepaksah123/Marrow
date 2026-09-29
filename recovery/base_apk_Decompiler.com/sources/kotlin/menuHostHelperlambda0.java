package kotlin;

import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import kotlin._findCustomDeser;
import kotlin._init_lambda5;
import kotlin.onActivityResult;

/* JADX INFO: loaded from: classes.dex */
public class menuHostHelperlambda0 extends onFastForward implements accessonBackPresseds1027565324 {
    private ensureViewModelStore IconCompatParcelizer;
    private final _findCustomDeser.AudioAttributesCompatParcelizer read;

    @Override // kotlin.accessonBackPresseds1027565324
    public onActivityResult IconCompatParcelizer(onActivityResult.write writeVar) {
        return null;
    }

    @Override // kotlin.accessonBackPresseds1027565324
    public void IconCompatParcelizer(onActivityResult onactivityresult) {
    }

    @Override // kotlin.accessonBackPresseds1027565324
    public void RemoteActionCompatParcelizer(onActivityResult onactivityresult) {
    }

    public menuHostHelperlambda0(Context context) {
        this(context, 0);
    }

    public menuHostHelperlambda0(Context context, int i) {
        super(context, RemoteActionCompatParcelizer(context, i));
        this.read = new _findCustomDeser.AudioAttributesCompatParcelizer() { // from class: o.getSavedStateRegistryControllerannotations
            @Override // o._findCustomDeser.AudioAttributesCompatParcelizer
            public final boolean superDispatchKeyEvent(KeyEvent keyEvent) {
                return this.read.RemoteActionCompatParcelizer(keyEvent);
            }
        };
        ensureViewModelStore ensureviewmodelstoreAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer();
        ensureviewmodelstoreAudioAttributesCompatParcelizer.read(RemoteActionCompatParcelizer(context, i));
        ensureviewmodelstoreAudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer((Bundle) null);
    }

    @Override // kotlin.onFastForward, android.app.Dialog
    public void onCreate(Bundle bundle) {
        AudioAttributesCompatParcelizer().AudioAttributesImplApi21Parcelizer();
        super.onCreate(bundle);
        AudioAttributesCompatParcelizer().AudioAttributesCompatParcelizer(bundle);
    }

    @Override // kotlin.onFastForward, android.app.Dialog
    public void setContentView(int i) {
        AudioAttributesCompatParcelizer().IconCompatParcelizer(i);
    }

    @Override // kotlin.onFastForward, android.app.Dialog
    public void setContentView(View view) {
        AudioAttributesCompatParcelizer().IconCompatParcelizer(view);
    }

    @Override // kotlin.onFastForward, android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        AudioAttributesCompatParcelizer().RemoteActionCompatParcelizer(view, layoutParams);
    }

    @Override // android.app.Dialog
    public <T extends View> T findViewById(int i) {
        return (T) AudioAttributesCompatParcelizer().write(i);
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        AudioAttributesCompatParcelizer().read(charSequence);
    }

    @Override // android.app.Dialog
    public void setTitle(int i) {
        super.setTitle(i);
        AudioAttributesCompatParcelizer().read(getContext().getString(i));
    }

    @Override // kotlin.onFastForward, android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        AudioAttributesCompatParcelizer().write(view, layoutParams);
    }

    @Override // kotlin.onFastForward, android.app.Dialog
    public void onStop() {
        super.onStop();
        AudioAttributesCompatParcelizer().MediaBrowserCompatMediaItem();
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        AudioAttributesCompatParcelizer().MediaBrowserCompatSearchResultReceiver();
    }

    public boolean IconCompatParcelizer(int i) {
        return AudioAttributesCompatParcelizer().AudioAttributesCompatParcelizer(i);
    }

    @Override // android.app.Dialog
    public void invalidateOptionsMenu() {
        AudioAttributesCompatParcelizer().RatingCompat();
    }

    public ensureViewModelStore AudioAttributesCompatParcelizer() {
        if (this.IconCompatParcelizer == null) {
            this.IconCompatParcelizer = ensureViewModelStore.read(this, this);
        }
        return this.IconCompatParcelizer;
    }

    private static int RemoteActionCompatParcelizer(Context context, int i) {
        if (i != 0) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(_init_lambda5.read.dialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    boolean RemoteActionCompatParcelizer(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        getWindow().getDecorView();
        return _findCustomDeser.IconCompatParcelizer(this.read, keyEvent);
    }
}
