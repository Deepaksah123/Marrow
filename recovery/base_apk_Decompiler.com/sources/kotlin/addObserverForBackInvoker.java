package kotlin;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.Toolbar;
import kotlin._isFalse;
import kotlin.onActivityResult;
import kotlin.setOnChartValueSelectedListener;

/* JADX INFO: loaded from: classes.dex */
public class addObserverForBackInvoker extends maybeGetTypeVariable implements accessonBackPresseds1027565324, _isFalse.RemoteActionCompatParcelizer {
    private ensureViewModelStore AudioAttributesCompatParcelizer;
    private Resources read;

    private boolean write(KeyEvent keyEvent) {
        return false;
    }

    @Override // kotlin.accessonBackPresseds1027565324
    public onActivityResult IconCompatParcelizer(onActivityResult.write writeVar) {
        return null;
    }

    @Override // kotlin.accessonBackPresseds1027565324
    public void IconCompatParcelizer(onActivityResult onactivityresult) {
    }

    protected void RemoteActionCompatParcelizer(int i) {
    }

    @Override // kotlin.accessonBackPresseds1027565324
    public void RemoteActionCompatParcelizer(onActivityResult onactivityresult) {
    }

    @Deprecated
    public void at_() {
    }

    protected void read(StdKeyDeserializerStringCtorKeyDeserializer stdKeyDeserializerStringCtorKeyDeserializer) {
    }

    public void read(_isFalse _isfalse) {
    }

    public addObserverForBackInvoker() {
        MediaBrowserCompatItemReceiver();
    }

    public addObserverForBackInvoker(int i) {
        super(i);
        MediaBrowserCompatItemReceiver();
    }

    private void MediaBrowserCompatItemReceiver() {
        getSavedStateRegistry().IconCompatParcelizer("androidx:appcompat", new setOnChartValueSelectedListener.AudioAttributesCompatParcelizer() { // from class: o.addObserverForBackInvoker.4
            @Override // o.setOnChartValueSelectedListener.AudioAttributesCompatParcelizer
            public Bundle read() {
                Bundle bundle = new Bundle();
                addObserverForBackInvoker.this.ar_().write(bundle);
                return bundle;
            }
        });
        addOnContextAvailableListener(new PlaybackStateCompatCustomAction() { // from class: o.addObserverForBackInvoker.2
            @Override // kotlin.PlaybackStateCompatCustomAction
            public void write(Context context) {
                ensureViewModelStore ensureviewmodelstoreAr_ = addObserverForBackInvoker.this.ar_();
                ensureviewmodelstoreAr_.AudioAttributesImplApi21Parcelizer();
                ensureviewmodelstoreAr_.AudioAttributesCompatParcelizer(addObserverForBackInvoker.this.getSavedStateRegistry().RemoteActionCompatParcelizer("androidx:appcompat"));
            }
        });
    }

    @Override // kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(ar_().write(context));
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(int i) {
        super.setTheme(i);
        ar_().read(i);
    }

    @Override // android.app.Activity
    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        ar_().read(bundle);
    }

    public ActionBar as_() {
        return ar_().MediaBrowserCompatCustomActionResultReceiver();
    }

    public void IconCompatParcelizer(Toolbar toolbar) {
        ar_().AudioAttributesCompatParcelizer(toolbar);
    }

    @Override // android.app.Activity
    public MenuInflater getMenuInflater() {
        return ar_().MediaBrowserCompatItemReceiver();
    }

    @Override // kotlin.MediaBrowserCompatMediaItem, android.app.Activity
    public void setContentView(int i) {
        AudioAttributesImplApi26Parcelizer();
        ar_().IconCompatParcelizer(i);
    }

    @Override // kotlin.MediaBrowserCompatMediaItem, android.app.Activity
    public void setContentView(View view) {
        AudioAttributesImplApi26Parcelizer();
        ar_().IconCompatParcelizer(view);
    }

    @Override // kotlin.MediaBrowserCompatMediaItem, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        AudioAttributesImplApi26Parcelizer();
        ar_().RemoteActionCompatParcelizer(view, layoutParams);
    }

    @Override // kotlin.MediaBrowserCompatMediaItem, android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        AudioAttributesImplApi26Parcelizer();
        ar_().write(view, layoutParams);
    }

    private void AudioAttributesImplApi26Parcelizer() {
        isCreatorVisible.IconCompatParcelizer(getWindow().getDecorView(), this);
        isFieldVisible.AudioAttributesCompatParcelizer(getWindow().getDecorView(), this);
        setCenterTextRadiusPercent.read(getWindow().getDecorView(), this);
        onSkipToQueueItem.read(getWindow().getDecorView(), this);
    }

    @Override // kotlin.MediaBrowserCompatMediaItem, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ar_().AudioAttributesCompatParcelizer(configuration);
        if (this.read != null) {
            this.read.updateConfiguration(super.getResources().getConfiguration(), super.getResources().getDisplayMetrics());
        }
    }

    @Override // kotlin.maybeGetTypeVariable, android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        ar_().MediaDescriptionCompat();
    }

    @Override // kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public void onStart() {
        super.onStart();
        ar_().MediaMetadataCompat();
    }

    @Override // kotlin.maybeGetTypeVariable, android.app.Activity
    public void onStop() {
        super.onStop();
        ar_().MediaBrowserCompatMediaItem();
    }

    @Override // android.app.Activity
    public <T extends View> T findViewById(int i) {
        return (T) ar_().write(i);
    }

    @Override // kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        ActionBar actionBarAs_ = as_();
        if (menuItem.getItemId() != 16908332 || actionBarAs_ == null || (actionBarAs_.read() & 4) == 0) {
            return false;
        }
        return IconCompatParcelizer();
    }

    @Override // kotlin.maybeGetTypeVariable, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        ar_().MediaBrowserCompatSearchResultReceiver();
    }

    @Override // android.app.Activity
    protected void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        ar_().read(charSequence);
    }

    @Override // kotlin.maybeGetTypeVariable
    public void supportInvalidateOptionsMenu() {
        ar_().RatingCompat();
    }

    @Override // android.app.Activity
    public void invalidateOptionsMenu() {
        ar_().RatingCompat();
    }

    public void write(_isFalse _isfalse) {
        _isfalse.write(this);
    }

    public boolean IconCompatParcelizer() {
        Intent intentAk_ = ak_();
        if (intentAk_ == null) {
            return false;
        }
        if (IconCompatParcelizer(intentAk_)) {
            _isFalse _isfalseRemoteActionCompatParcelizer = _isFalse.RemoteActionCompatParcelizer(this);
            write(_isfalseRemoteActionCompatParcelizer);
            read(_isfalseRemoteActionCompatParcelizer);
            _isfalseRemoteActionCompatParcelizer.read();
            try {
                _checkBooleanToStringCoercion.RemoteActionCompatParcelizer(this);
                return true;
            } catch (IllegalStateException unused) {
                finish();
                return true;
            }
        }
        RemoteActionCompatParcelizer(intentAk_);
        return true;
    }

    @Override // o._isFalse.RemoteActionCompatParcelizer
    public Intent ak_() {
        return _checkToStringCoercion.RemoteActionCompatParcelizer(this);
    }

    public boolean IconCompatParcelizer(Intent intent) {
        return _checkToStringCoercion.RemoteActionCompatParcelizer(this, intent);
    }

    public void RemoteActionCompatParcelizer(Intent intent) {
        _checkToStringCoercion.IconCompatParcelizer(this, intent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onContentChanged() {
        at_();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuOpened(int i, Menu menu) {
        return super.onMenuOpened(i, menu);
    }

    @Override // kotlin.MediaBrowserCompatMediaItem, android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        super.onPanelClosed(i, menu);
    }

    public ensureViewModelStore ar_() {
        if (this.AudioAttributesCompatParcelizer == null) {
            this.AudioAttributesCompatParcelizer = ensureViewModelStore.IconCompatParcelizer(this, this);
        }
        return this.AudioAttributesCompatParcelizer;
    }

    @Override // kotlin._checkFloatSpecialValue, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        ActionBar actionBarAs_ = as_();
        if (keyCode == 82 && actionBarAs_ != null && actionBarAs_.read(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        Resources resources = this.read;
        return resources == null ? super.getResources() : resources;
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (write(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.app.Activity
    public void openOptionsMenu() {
        ActionBar actionBarAs_ = as_();
        if (getWindow().hasFeature(0)) {
            if (actionBarAs_ == null || !actionBarAs_.MediaBrowserCompatItemReceiver()) {
                super.openOptionsMenu();
            }
        }
    }

    @Override // android.app.Activity
    public void closeOptionsMenu() {
        ActionBar actionBarAs_ = as_();
        if (getWindow().hasFeature(0)) {
            if (actionBarAs_ == null || !actionBarAs_.write()) {
                super.closeOptionsMenu();
            }
        }
    }

    @Override // kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public void onPause() {
        super.onPause();
    }
}
