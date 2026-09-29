package kotlin;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;
import kotlin.onActivityResult;
import kotlin.onRequestPermissionsResult;

/* JADX INFO: loaded from: classes.dex */
public final class onBackPressed extends onActivityResult implements onRequestPermissionsResult.RemoteActionCompatParcelizer {
    private WeakReference<View> AudioAttributesCompatParcelizer;
    private onRequestPermissionsResult AudioAttributesImplApi26Parcelizer;
    private boolean AudioAttributesImplBaseParcelizer;
    private Context IconCompatParcelizer;
    private ActionBarContextView RemoteActionCompatParcelizer;
    private boolean read;
    private onActivityResult.write write;

    public onBackPressed(Context context, ActionBarContextView actionBarContextView, onActivityResult.write writeVar, boolean z) {
        this.IconCompatParcelizer = context;
        this.RemoteActionCompatParcelizer = actionBarContextView;
        this.write = writeVar;
        onRequestPermissionsResult onrequestpermissionsresultHandleMediaPlayPauseIfPendingOnHandler = new onRequestPermissionsResult(actionBarContextView.getContext()).handleMediaPlayPauseIfPendingOnHandler();
        this.AudioAttributesImplApi26Parcelizer = onrequestpermissionsresultHandleMediaPlayPauseIfPendingOnHandler;
        onrequestpermissionsresultHandleMediaPlayPauseIfPendingOnHandler.IconCompatParcelizer(this);
        this.AudioAttributesImplBaseParcelizer = z;
    }

    @Override // kotlin.onActivityResult
    public final void RemoteActionCompatParcelizer(CharSequence charSequence) {
        this.RemoteActionCompatParcelizer.setTitle(charSequence);
    }

    @Override // kotlin.onActivityResult
    public final void write(CharSequence charSequence) {
        this.RemoteActionCompatParcelizer.setSubtitle(charSequence);
    }

    @Override // kotlin.onActivityResult
    public final void RemoteActionCompatParcelizer(int i) {
        RemoteActionCompatParcelizer((CharSequence) this.IconCompatParcelizer.getString(i));
    }

    @Override // kotlin.onActivityResult
    public final void read(int i) {
        write(this.IconCompatParcelizer.getString(i));
    }

    @Override // kotlin.onActivityResult
    public final void write(boolean z) {
        super.write(z);
        this.RemoteActionCompatParcelizer.setTitleOptional(z);
    }

    @Override // kotlin.onActivityResult
    public final boolean AudioAttributesImplApi26Parcelizer() {
        return this.RemoteActionCompatParcelizer.write();
    }

    @Override // kotlin.onActivityResult
    public final void read(View view) {
        this.RemoteActionCompatParcelizer.setCustomView(view);
        this.AudioAttributesCompatParcelizer = view != null ? new WeakReference<>(view) : null;
    }

    @Override // kotlin.onActivityResult
    public final void AudioAttributesImplApi21Parcelizer() {
        this.write.RemoteActionCompatParcelizer(this, this.AudioAttributesImplApi26Parcelizer);
    }

    @Override // kotlin.onActivityResult
    public final void IconCompatParcelizer() {
        if (this.read) {
            return;
        }
        this.read = true;
        this.write.RemoteActionCompatParcelizer(this);
    }

    @Override // kotlin.onActivityResult
    public final Menu RemoteActionCompatParcelizer() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    @Override // kotlin.onActivityResult
    public final CharSequence AudioAttributesImplBaseParcelizer() {
        return this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer();
    }

    @Override // kotlin.onActivityResult
    public final CharSequence MediaBrowserCompatItemReceiver() {
        return this.RemoteActionCompatParcelizer.IconCompatParcelizer();
    }

    @Override // kotlin.onActivityResult
    public final View write() {
        WeakReference<View> weakReference = this.AudioAttributesCompatParcelizer;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // kotlin.onActivityResult
    public final MenuInflater AudioAttributesCompatParcelizer() {
        return new onMenuItemSelected(this.RemoteActionCompatParcelizer.getContext());
    }

    @Override // o.onRequestPermissionsResult.RemoteActionCompatParcelizer
    public final boolean write(onRequestPermissionsResult onrequestpermissionsresult, MenuItem menuItem) {
        return this.write.IconCompatParcelizer(this, menuItem);
    }

    @Override // o.onRequestPermissionsResult.RemoteActionCompatParcelizer
    public final void read(onRequestPermissionsResult onrequestpermissionsresult) {
        AudioAttributesImplApi21Parcelizer();
        this.RemoteActionCompatParcelizer.read();
    }
}
