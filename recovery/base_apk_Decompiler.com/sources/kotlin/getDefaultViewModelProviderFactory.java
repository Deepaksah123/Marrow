package kotlin;

import android.content.Context;
import android.content.res.Configuration;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.Toolbar;
import com.marrow.R;
import java.util.ArrayList;
import kotlin.getOnBackPressedDispatcherannotations;
import kotlin.onRequestPermissionsResult;
import kotlin.peekAvailableContext;

/* JADX INFO: loaded from: classes.dex */
final class getDefaultViewModelProviderFactory extends ActionBar {
    final Window.Callback AudioAttributesCompatParcelizer;
    private boolean AudioAttributesImplApi26Parcelizer;
    private final Toolbar.IconCompatParcelizer AudioAttributesImplBaseParcelizer;
    boolean IconCompatParcelizer;
    private boolean RemoteActionCompatParcelizer;
    final ActionBarLayoutParams read;
    final getOnBackPressedDispatcherannotations.IconCompatParcelizer write;
    private ArrayList<ActionBar.read> MediaBrowserCompatItemReceiver = new ArrayList<>();
    private final Runnable MediaBrowserCompatCustomActionResultReceiver = new Runnable() { // from class: o.getDefaultViewModelProviderFactory.1
        @Override // java.lang.Runnable
        public final void run() {
            getDefaultViewModelProviderFactory.this.AudioAttributesImplApi26Parcelizer();
        }
    };

    @Override // androidx.appcompat.app.ActionBar
    public final void IconCompatParcelizer(boolean z) {
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void write(boolean z) {
    }

    getDefaultViewModelProviderFactory(Toolbar toolbar, CharSequence charSequence, Window.Callback callback) {
        Toolbar.IconCompatParcelizer iconCompatParcelizer = new Toolbar.IconCompatParcelizer() { // from class: o.getDefaultViewModelProviderFactory.3
            @Override // androidx.appcompat.widget.Toolbar.IconCompatParcelizer
            public final boolean read(MenuItem menuItem) {
                return getDefaultViewModelProviderFactory.this.AudioAttributesCompatParcelizer.onMenuItemSelected(0, menuItem);
            }
        };
        this.AudioAttributesImplBaseParcelizer = iconCompatParcelizer;
        setIcon seticon = new setIcon(toolbar, false);
        this.read = seticon;
        this.AudioAttributesCompatParcelizer = (Window.Callback) StringCollectionDeserializer.RemoteActionCompatParcelizer(callback);
        seticon.read(callback);
        toolbar.setOnMenuItemClickListener(iconCompatParcelizer);
        seticon.write(charSequence);
        this.write = new IconCompatParcelizer();
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void AudioAttributesCompatParcelizer(float f) {
        InvalidTypeIdException.write(this.read.AudioAttributesImplBaseParcelizer(), f);
    }

    @Override // androidx.appcompat.app.ActionBar
    public final Context IconCompatParcelizer() {
        return this.read.AudioAttributesCompatParcelizer();
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void MediaBrowserCompatCustomActionResultReceiver() {
        this.read.RemoteActionCompatParcelizer(R.drawable.ic_action_arrow_back);
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void IconCompatParcelizer(Configuration configuration) {
        super.IconCompatParcelizer(configuration);
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void write(CharSequence charSequence) {
        this.read.IconCompatParcelizer(charSequence);
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void AudioAttributesCompatParcelizer(int i) {
        ActionBarLayoutParams actionBarLayoutParams = this.read;
        actionBarLayoutParams.IconCompatParcelizer(i != 0 ? actionBarLayoutParams.AudioAttributesCompatParcelizer().getText(i) : null);
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void AudioAttributesCompatParcelizer(CharSequence charSequence) {
        this.read.write(charSequence);
    }

    private void write(int i) {
        this.read.write((i & 4) | (this.read.RemoteActionCompatParcelizer() & (-5)));
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void RemoteActionCompatParcelizer(boolean z) {
        write(z ? 4 : 0);
    }

    @Override // androidx.appcompat.app.ActionBar
    public final int read() {
        return this.read.RemoteActionCompatParcelizer();
    }

    @Override // androidx.appcompat.app.ActionBar
    public final boolean MediaBrowserCompatItemReceiver() {
        return this.read.RatingCompat();
    }

    @Override // androidx.appcompat.app.ActionBar
    public final boolean write() {
        return this.read.MediaBrowserCompatCustomActionResultReceiver();
    }

    @Override // androidx.appcompat.app.ActionBar
    public final boolean AudioAttributesCompatParcelizer() {
        this.read.AudioAttributesImplBaseParcelizer().removeCallbacks(this.MediaBrowserCompatCustomActionResultReceiver);
        InvalidTypeIdException.AudioAttributesCompatParcelizer(this.read.AudioAttributesImplBaseParcelizer(), this.MediaBrowserCompatCustomActionResultReceiver);
        return true;
    }

    @Override // androidx.appcompat.app.ActionBar
    public final boolean RemoteActionCompatParcelizer() {
        if (!this.read.MediaBrowserCompatItemReceiver()) {
            return false;
        }
        this.read.read();
        return true;
    }

    final void AudioAttributesImplApi26Parcelizer() {
        Menu menuMediaBrowserCompatMediaItem = MediaBrowserCompatMediaItem();
        onRequestPermissionsResult onrequestpermissionsresult = menuMediaBrowserCompatMediaItem instanceof onRequestPermissionsResult ? (onRequestPermissionsResult) menuMediaBrowserCompatMediaItem : null;
        if (onrequestpermissionsresult != null) {
            onrequestpermissionsresult.onFastForward();
        }
        try {
            menuMediaBrowserCompatMediaItem.clear();
            if (!this.AudioAttributesCompatParcelizer.onCreatePanelMenu(0, menuMediaBrowserCompatMediaItem) || !this.AudioAttributesCompatParcelizer.onPreparePanel(0, null, menuMediaBrowserCompatMediaItem)) {
                menuMediaBrowserCompatMediaItem.clear();
            }
        } finally {
            if (onrequestpermissionsresult != null) {
                onrequestpermissionsresult.onCustomAction();
            }
        }
    }

    @Override // androidx.appcompat.app.ActionBar
    public final boolean read(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            MediaBrowserCompatItemReceiver();
        }
        return true;
    }

    @Override // androidx.appcompat.app.ActionBar
    public final boolean RemoteActionCompatParcelizer(int i, KeyEvent keyEvent) {
        Menu menuMediaBrowserCompatMediaItem = MediaBrowserCompatMediaItem();
        if (menuMediaBrowserCompatMediaItem == null) {
            return false;
        }
        menuMediaBrowserCompatMediaItem.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return menuMediaBrowserCompatMediaItem.performShortcut(i, keyEvent, 0);
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void AudioAttributesImplBaseParcelizer() {
        this.read.AudioAttributesImplBaseParcelizer().removeCallbacks(this.MediaBrowserCompatCustomActionResultReceiver);
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void AudioAttributesCompatParcelizer(boolean z) {
        if (z != this.RemoteActionCompatParcelizer) {
            this.RemoteActionCompatParcelizer = z;
            int size = this.MediaBrowserCompatItemReceiver.size();
            for (int i = 0; i < size; i++) {
                this.MediaBrowserCompatItemReceiver.get(i);
            }
        }
    }

    class IconCompatParcelizer implements getOnBackPressedDispatcherannotations.IconCompatParcelizer {
        IconCompatParcelizer() {
        }

        @Override // o.getOnBackPressedDispatcherannotations.IconCompatParcelizer
        public final boolean RemoteActionCompatParcelizer(int i) {
            if (i != 0 || getDefaultViewModelProviderFactory.this.IconCompatParcelizer) {
                return false;
            }
            getDefaultViewModelProviderFactory.this.read.MediaBrowserCompatMediaItem();
            getDefaultViewModelProviderFactory.this.IconCompatParcelizer = true;
            return false;
        }

        @Override // o.getOnBackPressedDispatcherannotations.IconCompatParcelizer
        public final View write(int i) {
            if (i == 0) {
                return new View(getDefaultViewModelProviderFactory.this.read.AudioAttributesCompatParcelizer());
            }
            return null;
        }
    }

    private Menu MediaBrowserCompatMediaItem() {
        if (!this.AudioAttributesImplApi26Parcelizer) {
            this.read.AudioAttributesCompatParcelizer(new write(), new RemoteActionCompatParcelizer());
            this.AudioAttributesImplApi26Parcelizer = true;
        }
        return this.read.AudioAttributesImplApi21Parcelizer();
    }

    final class write implements peekAvailableContext.AudioAttributesCompatParcelizer {
        private boolean IconCompatParcelizer;

        write() {
        }

        @Override // o.peekAvailableContext.AudioAttributesCompatParcelizer
        public final boolean read(onRequestPermissionsResult onrequestpermissionsresult) {
            getDefaultViewModelProviderFactory.this.AudioAttributesCompatParcelizer.onMenuOpened(108, onrequestpermissionsresult);
            return true;
        }

        @Override // o.peekAvailableContext.AudioAttributesCompatParcelizer
        public final void RemoteActionCompatParcelizer(onRequestPermissionsResult onrequestpermissionsresult, boolean z) {
            if (this.IconCompatParcelizer) {
                return;
            }
            this.IconCompatParcelizer = true;
            getDefaultViewModelProviderFactory.this.read.write();
            getDefaultViewModelProviderFactory.this.AudioAttributesCompatParcelizer.onPanelClosed(108, onrequestpermissionsresult);
            this.IconCompatParcelizer = false;
        }
    }

    final class RemoteActionCompatParcelizer implements onRequestPermissionsResult.RemoteActionCompatParcelizer {
        @Override // o.onRequestPermissionsResult.RemoteActionCompatParcelizer
        public final boolean write(onRequestPermissionsResult onrequestpermissionsresult, MenuItem menuItem) {
            return false;
        }

        RemoteActionCompatParcelizer() {
        }

        @Override // o.onRequestPermissionsResult.RemoteActionCompatParcelizer
        public final void read(onRequestPermissionsResult onrequestpermissionsresult) {
            if (getDefaultViewModelProviderFactory.this.read.MediaMetadataCompat()) {
                getDefaultViewModelProviderFactory.this.AudioAttributesCompatParcelizer.onPanelClosed(108, onrequestpermissionsresult);
            } else if (getDefaultViewModelProviderFactory.this.AudioAttributesCompatParcelizer.onPreparePanel(0, null, onrequestpermissionsresult)) {
                getDefaultViewModelProviderFactory.this.AudioAttributesCompatParcelizer.onMenuOpened(108, onrequestpermissionsresult);
            }
        }
    }
}
