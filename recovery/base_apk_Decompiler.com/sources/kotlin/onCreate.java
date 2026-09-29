package kotlin;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class onCreate implements handleMissingEndArrayForSingle {
    private Context AudioAttributesCompatParcelizer;
    private Drawable AudioAttributesImplBaseParcelizer;
    private MenuItem.OnMenuItemClickListener IconCompatParcelizer;
    private CharSequence MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    private Intent MediaDescriptionCompat;
    private char MediaMetadataCompat;
    private CharSequence handleMediaPlayPauseIfPendingOnHandler;
    private char onCommand;
    private CharSequence onCustomAction;
    private CharSequence write;
    private int onAddQueueItem = 4096;
    private int MediaBrowserCompatSearchResultReceiver = 4096;
    private ColorStateList MediaBrowserCompatCustomActionResultReceiver = null;
    private PorterDuff.Mode MediaBrowserCompatItemReceiver = null;
    private boolean AudioAttributesImplApi21Parcelizer = false;
    private boolean AudioAttributesImplApi26Parcelizer = false;
    private int RemoteActionCompatParcelizer = 16;
    private final int RatingCompat = R.id.home;
    private final int read = 0;
    private final int MediaBrowserCompatMediaItem = 0;

    @Override // kotlin.handleMissingEndArrayForSingle
    public final ThrowableDeserializer RemoteActionCompatParcelizer() {
        return null;
    }

    @Override // kotlin.handleMissingEndArrayForSingle, android.view.MenuItem
    public final boolean collapseActionView() {
        return false;
    }

    @Override // kotlin.handleMissingEndArrayForSingle, android.view.MenuItem
    public final boolean expandActionView() {
        return false;
    }

    @Override // kotlin.handleMissingEndArrayForSingle, android.view.MenuItem
    public final View getActionView() {
        return null;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return false;
    }

    @Override // kotlin.handleMissingEndArrayForSingle, android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return false;
    }

    @Override // kotlin.handleMissingEndArrayForSingle, android.view.MenuItem
    public final void setShowAsAction(int i) {
    }

    @Override // kotlin.handleMissingEndArrayForSingle, android.view.MenuItem
    public final /* synthetic */ MenuItem setActionView(int i) {
        return read();
    }

    @Override // kotlin.handleMissingEndArrayForSingle, android.view.MenuItem
    public final /* synthetic */ MenuItem setActionView(View view) {
        return AudioAttributesCompatParcelizer();
    }

    public onCreate(Context context, CharSequence charSequence) {
        this.AudioAttributesCompatParcelizer = context;
        this.handleMediaPlayPauseIfPendingOnHandler = charSequence;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.MediaMetadataCompat;
    }

    @Override // kotlin.handleMissingEndArrayForSingle, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.MediaBrowserCompatSearchResultReceiver;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.read;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.MediaDescriptionCompat;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.RatingCompat;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.onCommand;
    }

    @Override // kotlin.handleMissingEndArrayForSingle, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.onAddQueueItem;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.MediaBrowserCompatMediaItem;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.handleMediaPlayPauseIfPendingOnHandler;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.onCustomAction;
        return charSequence != null ? charSequence : this.handleMediaPlayPauseIfPendingOnHandler;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.RemoteActionCompatParcelizer & 1) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.RemoteActionCompatParcelizer & 2) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.RemoteActionCompatParcelizer & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        return (this.RemoteActionCompatParcelizer & 8) == 0;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c) {
        this.MediaMetadataCompat = Character.toLowerCase(c);
        return this;
    }

    @Override // kotlin.handleMissingEndArrayForSingle, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c, int i) {
        this.MediaMetadataCompat = Character.toLowerCase(c);
        this.MediaBrowserCompatSearchResultReceiver = KeyEvent.normalizeMetaState(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z) {
        this.RemoteActionCompatParcelizer = (z ? 1 : 0) | (this.RemoteActionCompatParcelizer & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z) {
        this.RemoteActionCompatParcelizer = (z ? 2 : 0) | (this.RemoteActionCompatParcelizer & (-3));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z) {
        this.RemoteActionCompatParcelizer = (z ? 16 : 0) | (this.RemoteActionCompatParcelizer & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.AudioAttributesImplBaseParcelizer = drawable;
        write();
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i) {
        this.AudioAttributesImplBaseParcelizer = _isNaN.getDrawable(this.AudioAttributesCompatParcelizer, i);
        write();
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.MediaDescriptionCompat = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c) {
        this.onCommand = c;
        return this;
    }

    @Override // kotlin.handleMissingEndArrayForSingle, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c, int i) {
        this.onCommand = c;
        this.onAddQueueItem = KeyEvent.normalizeMetaState(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.IconCompatParcelizer = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2) {
        this.onCommand = c;
        this.MediaMetadataCompat = Character.toLowerCase(c2);
        return this;
    }

    @Override // kotlin.handleMissingEndArrayForSingle, android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.onCommand = c;
        this.onAddQueueItem = KeyEvent.normalizeMetaState(i);
        this.MediaMetadataCompat = Character.toLowerCase(c2);
        this.MediaBrowserCompatSearchResultReceiver = KeyEvent.normalizeMetaState(i2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.handleMediaPlayPauseIfPendingOnHandler = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i) {
        this.handleMediaPlayPauseIfPendingOnHandler = this.AudioAttributesCompatParcelizer.getResources().getString(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.onCustomAction = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z) {
        this.RemoteActionCompatParcelizer = (z ? 0 : 8) | (this.RemoteActionCompatParcelizer & 8);
        return this;
    }

    private static handleMissingEndArrayForSingle AudioAttributesCompatParcelizer() {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    private static handleMissingEndArrayForSingle read() {
        throw new UnsupportedOperationException();
    }

    @Override // kotlin.handleMissingEndArrayForSingle
    public final handleMissingEndArrayForSingle AudioAttributesCompatParcelizer(ThrowableDeserializer throwableDeserializer) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.handleMissingEndArrayForSingle, android.view.MenuItem
    /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public handleMissingEndArrayForSingle setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // kotlin.handleMissingEndArrayForSingle, android.view.MenuItem
    /* JADX INFO: renamed from: read */
    public final handleMissingEndArrayForSingle setContentDescription(CharSequence charSequence) {
        this.write = charSequence;
        return this;
    }

    @Override // kotlin.handleMissingEndArrayForSingle, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.write;
    }

    @Override // kotlin.handleMissingEndArrayForSingle, android.view.MenuItem
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer */
    public final handleMissingEndArrayForSingle setTooltipText(CharSequence charSequence) {
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = charSequence;
        return this;
    }

    @Override // kotlin.handleMissingEndArrayForSingle, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    }

    @Override // kotlin.handleMissingEndArrayForSingle, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.MediaBrowserCompatCustomActionResultReceiver = colorStateList;
        this.AudioAttributesImplApi21Parcelizer = true;
        write();
        return this;
    }

    @Override // kotlin.handleMissingEndArrayForSingle, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    @Override // kotlin.handleMissingEndArrayForSingle, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.MediaBrowserCompatItemReceiver = mode;
        this.AudioAttributesImplApi26Parcelizer = true;
        write();
        return this;
    }

    @Override // kotlin.handleMissingEndArrayForSingle, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.MediaBrowserCompatItemReceiver;
    }

    private void write() {
        Drawable drawable = this.AudioAttributesImplBaseParcelizer;
        if (drawable != null) {
            if (this.AudioAttributesImplApi21Parcelizer || this.AudioAttributesImplApi26Parcelizer) {
                Drawable drawableAudioAttributesImplApi26Parcelizer = findFormatOverrides.AudioAttributesImplApi26Parcelizer(drawable);
                this.AudioAttributesImplBaseParcelizer = drawableAudioAttributesImplApi26Parcelizer;
                Drawable drawableMutate = drawableAudioAttributesImplApi26Parcelizer.mutate();
                this.AudioAttributesImplBaseParcelizer = drawableMutate;
                if (this.AudioAttributesImplApi21Parcelizer) {
                    findFormatOverrides.AudioAttributesCompatParcelizer(drawableMutate, this.MediaBrowserCompatCustomActionResultReceiver);
                }
                if (this.AudioAttributesImplApi26Parcelizer) {
                    findFormatOverrides.read(this.AudioAttributesImplBaseParcelizer, this.MediaBrowserCompatItemReceiver);
                }
            }
        }
    }
}
