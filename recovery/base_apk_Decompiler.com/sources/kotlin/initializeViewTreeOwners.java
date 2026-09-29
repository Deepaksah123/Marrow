package kotlin;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin._init_lambda5;

/* JADX INFO: loaded from: classes.dex */
public final class initializeViewTreeOwners extends ContextWrapper {
    private static Configuration write;
    private Resources.Theme AudioAttributesCompatParcelizer;
    private Resources IconCompatParcelizer;
    private int MediaBrowserCompatItemReceiver;
    private LayoutInflater RemoteActionCompatParcelizer;
    private Configuration read;

    public initializeViewTreeOwners() {
        super(null);
    }

    public initializeViewTreeOwners(Context context, int i) {
        super(context);
        this.MediaBrowserCompatItemReceiver = i;
    }

    public initializeViewTreeOwners(Context context, Resources.Theme theme) {
        super(context);
        this.AudioAttributesCompatParcelizer = theme;
    }

    @Override // android.content.ContextWrapper
    protected final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public final void read(Configuration configuration) {
        if (this.IconCompatParcelizer != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        }
        if (this.read != null) {
            throw new IllegalStateException("Override configuration has already been set");
        }
        this.read = new Configuration(configuration);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        return AudioAttributesCompatParcelizer();
    }

    private Resources AudioAttributesCompatParcelizer() {
        if (this.IconCompatParcelizer == null) {
            Configuration configuration = this.read;
            if (configuration == null || RemoteActionCompatParcelizer(configuration)) {
                this.IconCompatParcelizer = super.getResources();
            } else {
                this.IconCompatParcelizer = write.RemoteActionCompatParcelizer(this, this.read).getResources();
            }
        }
        return this.IconCompatParcelizer;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        if (this.MediaBrowserCompatItemReceiver != i) {
            this.MediaBrowserCompatItemReceiver = i;
            write();
        }
    }

    public final int IconCompatParcelizer() {
        return this.MediaBrowserCompatItemReceiver;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources.Theme getTheme() {
        Resources.Theme theme = this.AudioAttributesCompatParcelizer;
        if (theme != null) {
            return theme;
        }
        if (this.MediaBrowserCompatItemReceiver == 0) {
            this.MediaBrowserCompatItemReceiver = _init_lambda5.MediaBrowserCompatItemReceiver.Theme_AppCompat_Light;
        }
        write();
        return this.AudioAttributesCompatParcelizer;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if ("layout_inflater".equals(str)) {
            if (this.RemoteActionCompatParcelizer == null) {
                this.RemoteActionCompatParcelizer = LayoutInflater.from(getBaseContext()).cloneInContext(this);
            }
            return this.RemoteActionCompatParcelizer;
        }
        return getBaseContext().getSystemService(str);
    }

    private static void read(Resources.Theme theme, int i) {
        theme.applyStyle(i, true);
    }

    private void write() {
        if (this.AudioAttributesCompatParcelizer == null) {
            this.AudioAttributesCompatParcelizer = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.AudioAttributesCompatParcelizer.setTo(theme);
            }
        }
        read(this.AudioAttributesCompatParcelizer, this.MediaBrowserCompatItemReceiver);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final AssetManager getAssets() {
        return getResources().getAssets();
    }

    private static boolean RemoteActionCompatParcelizer(Configuration configuration) {
        if (configuration == null) {
            return true;
        }
        if (write == null) {
            Configuration configuration2 = new Configuration();
            configuration2.fontScale = BitmapDescriptorFactory.HUE_RED;
            write = configuration2;
        }
        return configuration.equals(write);
    }

    static class write {
        static Context RemoteActionCompatParcelizer(initializeViewTreeOwners initializeviewtreeowners, Configuration configuration) {
            return initializeviewtreeowners.createConfigurationContext(configuration);
        }
    }
}
