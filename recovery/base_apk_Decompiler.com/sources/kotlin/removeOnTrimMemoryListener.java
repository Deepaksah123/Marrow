package kotlin;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import kotlin.onRequestPermissionsResult;

/* JADX INFO: loaded from: classes.dex */
public class removeOnTrimMemoryListener extends onRequestPermissionsResult implements SubMenu {
    private onRetainNonConfigurationInstance IconCompatParcelizer;
    private onRequestPermissionsResult read;

    public removeOnTrimMemoryListener(Context context, onRequestPermissionsResult onrequestpermissionsresult, onRetainNonConfigurationInstance onretainnonconfigurationinstance) {
        super(context);
        this.read = onrequestpermissionsresult;
        this.IconCompatParcelizer = onretainnonconfigurationinstance;
    }

    @Override // kotlin.onRequestPermissionsResult, android.view.Menu
    public void setQwertyMode(boolean z) {
        this.read.setQwertyMode(z);
    }

    @Override // kotlin.onRequestPermissionsResult
    public final boolean MediaBrowserCompatSearchResultReceiver() {
        return this.read.MediaBrowserCompatSearchResultReceiver();
    }

    @Override // kotlin.onRequestPermissionsResult
    public final boolean onCommand() {
        return this.read.onCommand();
    }

    public final Menu onPlay() {
        return this.read;
    }

    @Override // android.view.SubMenu
    public MenuItem getItem() {
        return this.IconCompatParcelizer;
    }

    @Override // kotlin.onRequestPermissionsResult
    public final void IconCompatParcelizer(onRequestPermissionsResult.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        this.read.IconCompatParcelizer(remoteActionCompatParcelizer);
    }

    @Override // kotlin.onRequestPermissionsResult
    public final onRequestPermissionsResult MediaBrowserCompatMediaItem() {
        return this.read.MediaBrowserCompatMediaItem();
    }

    @Override // kotlin.onRequestPermissionsResult
    final boolean AudioAttributesCompatParcelizer(onRequestPermissionsResult onrequestpermissionsresult, MenuItem menuItem) {
        return super.AudioAttributesCompatParcelizer(onrequestpermissionsresult, menuItem) || this.read.AudioAttributesCompatParcelizer(onrequestpermissionsresult, menuItem);
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(Drawable drawable) {
        this.IconCompatParcelizer.setIcon(drawable);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(int i) {
        this.IconCompatParcelizer.setIcon(i);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(Drawable drawable) {
        return (SubMenu) super.write(drawable);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(int i) {
        return (SubMenu) super.read(i);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(CharSequence charSequence) {
        return (SubMenu) super.RemoteActionCompatParcelizer(charSequence);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(int i) {
        return (SubMenu) super.IconCompatParcelizer(i);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderView(View view) {
        return (SubMenu) super.RemoteActionCompatParcelizer(view);
    }

    @Override // kotlin.onRequestPermissionsResult
    public final boolean IconCompatParcelizer(onRetainNonConfigurationInstance onretainnonconfigurationinstance) {
        return this.read.IconCompatParcelizer(onretainnonconfigurationinstance);
    }

    @Override // kotlin.onRequestPermissionsResult
    public final boolean RemoteActionCompatParcelizer(onRetainNonConfigurationInstance onretainnonconfigurationinstance) {
        return this.read.RemoteActionCompatParcelizer(onretainnonconfigurationinstance);
    }

    @Override // kotlin.onRequestPermissionsResult
    public final String write() {
        onRetainNonConfigurationInstance onretainnonconfigurationinstance = this.IconCompatParcelizer;
        int itemId = onretainnonconfigurationinstance != null ? onretainnonconfigurationinstance.getItemId() : 0;
        if (itemId == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(super.write());
        sb.append(":");
        sb.append(itemId);
        return sb.toString();
    }

    @Override // kotlin.onRequestPermissionsResult, android.view.Menu
    public void setGroupDividerEnabled(boolean z) {
        this.read.setGroupDividerEnabled(z);
    }

    @Override // kotlin.onRequestPermissionsResult
    public final boolean MediaMetadataCompat() {
        return this.read.MediaMetadataCompat();
    }
}
