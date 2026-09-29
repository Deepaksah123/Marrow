package kotlin;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.exoplayer2.C;
import kotlin.ThrowableDeserializer;
import kotlin._init_lambda5;
import kotlin.registerForActivityResult;

/* JADX INFO: loaded from: classes.dex */
public final class onRetainNonConfigurationInstance implements handleMissingEndArrayForSingle {
    private ThrowableDeserializer AudioAttributesCompatParcelizer;
    private final int AudioAttributesImplApi21Parcelizer;
    private View IconCompatParcelizer;
    private CharSequence MediaBrowserCompatCustomActionResultReceiver;
    private final int MediaBrowserCompatMediaItem;
    private Runnable MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    private Drawable RatingCompat;
    onRequestPermissionsResult RemoteActionCompatParcelizer;
    private ContextMenu.ContextMenuInfo handleMediaPlayPauseIfPendingOnHandler;
    private Intent onCustomAction;
    private char onMediaButtonEvent;
    private char onPause;
    private final int onPlay;
    private MenuItem.OnActionExpandListener onPlayFromMediaId;
    private CharSequence onPlayFromUri;
    private removeOnTrimMemoryListener onPrepare;
    private CharSequence onPrepareFromMediaId;
    private int onPrepareFromSearch;
    private CharSequence onSeekTo;
    private MenuItem.OnMenuItemClickListener read;
    private final int write;
    private int onPlayFromSearch = 4096;
    private int onFastForward = 4096;
    private int MediaMetadataCompat = 0;
    private ColorStateList MediaBrowserCompatSearchResultReceiver = null;
    private PorterDuff.Mode MediaDescriptionCompat = null;
    private boolean AudioAttributesImplBaseParcelizer = false;
    private boolean MediaBrowserCompatItemReceiver = false;
    private boolean onAddQueueItem = false;
    private int AudioAttributesImplApi26Parcelizer = 16;
    private boolean onCommand = false;

    onRetainNonConfigurationInstance(onRequestPermissionsResult onrequestpermissionsresult, int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        this.RemoteActionCompatParcelizer = onrequestpermissionsresult;
        this.MediaBrowserCompatMediaItem = i2;
        this.AudioAttributesImplApi21Parcelizer = i;
        this.write = i3;
        this.onPlay = i4;
        this.onPrepareFromMediaId = charSequence;
        this.onPrepareFromSearch = i5;
    }

    public final boolean AudioAttributesImplBaseParcelizer() {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.read;
        if (onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(this)) {
            return true;
        }
        onRequestPermissionsResult onrequestpermissionsresult = this.RemoteActionCompatParcelizer;
        if (onrequestpermissionsresult.AudioAttributesCompatParcelizer(onrequestpermissionsresult, this)) {
            return true;
        }
        if (this.onCustomAction != null) {
            try {
                this.RemoteActionCompatParcelizer.IconCompatParcelizer().startActivity(this.onCustomAction);
                return true;
            } catch (ActivityNotFoundException unused) {
            }
        }
        ThrowableDeserializer throwableDeserializer = this.AudioAttributesCompatParcelizer;
        return throwableDeserializer != null && throwableDeserializer.write();
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.AudioAttributesImplApi26Parcelizer & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z) {
        if (z) {
            this.AudioAttributesImplApi26Parcelizer |= 16;
        } else {
            this.AudioAttributesImplApi26Parcelizer &= -17;
        }
        this.RemoteActionCompatParcelizer.read(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public final int getItemId() {
        return this.MediaBrowserCompatMediaItem;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.write;
    }

    public final int write() {
        return this.onPlay;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.onCustomAction;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.onCustomAction = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.onMediaButtonEvent;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c) {
        if (this.onMediaButtonEvent == c) {
            return this;
        }
        this.onMediaButtonEvent = Character.toLowerCase(c);
        this.RemoteActionCompatParcelizer.read(false);
        return this;
    }

    @Override // kotlin.handleMissingEndArrayForSingle, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c, int i) {
        if (this.onMediaButtonEvent == c && this.onFastForward == i) {
            return this;
        }
        this.onMediaButtonEvent = Character.toLowerCase(c);
        this.onFastForward = KeyEvent.normalizeMetaState(i);
        this.RemoteActionCompatParcelizer.read(false);
        return this;
    }

    @Override // kotlin.handleMissingEndArrayForSingle, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.onFastForward;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.onPause;
    }

    @Override // kotlin.handleMissingEndArrayForSingle, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.onPlayFromSearch;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c) {
        if (this.onPause == c) {
            return this;
        }
        this.onPause = c;
        this.RemoteActionCompatParcelizer.read(false);
        return this;
    }

    @Override // kotlin.handleMissingEndArrayForSingle, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c, int i) {
        if (this.onPause == c && this.onPlayFromSearch == i) {
            return this;
        }
        this.onPause = c;
        this.onPlayFromSearch = KeyEvent.normalizeMetaState(i);
        this.RemoteActionCompatParcelizer.read(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2) {
        this.onPause = c;
        this.onMediaButtonEvent = Character.toLowerCase(c2);
        this.RemoteActionCompatParcelizer.read(false);
        return this;
    }

    @Override // kotlin.handleMissingEndArrayForSingle, android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.onPause = c;
        this.onPlayFromSearch = KeyEvent.normalizeMetaState(i);
        this.onMediaButtonEvent = Character.toLowerCase(c2);
        this.onFastForward = KeyEvent.normalizeMetaState(i2);
        this.RemoteActionCompatParcelizer.read(false);
        return this;
    }

    public final char read() {
        return this.RemoteActionCompatParcelizer.MediaBrowserCompatSearchResultReceiver() ? this.onMediaButtonEvent : this.onPause;
    }

    public final String AudioAttributesCompatParcelizer() {
        char c = read();
        if (c == 0) {
            return "";
        }
        Resources resources = this.RemoteActionCompatParcelizer.IconCompatParcelizer().getResources();
        StringBuilder sb = new StringBuilder();
        if (ViewConfiguration.get(this.RemoteActionCompatParcelizer.IconCompatParcelizer()).hasPermanentMenuKey()) {
            sb.append(resources.getString(_init_lambda5.AudioAttributesImplApi21Parcelizer.abc_prepend_shortcut_label));
        }
        int i = this.RemoteActionCompatParcelizer.MediaBrowserCompatSearchResultReceiver() ? this.onFastForward : this.onPlayFromSearch;
        read(sb, i, C.DEFAULT_BUFFER_SEGMENT_SIZE, resources.getString(_init_lambda5.AudioAttributesImplApi21Parcelizer.abc_menu_meta_shortcut_label));
        read(sb, i, 4096, resources.getString(_init_lambda5.AudioAttributesImplApi21Parcelizer.abc_menu_ctrl_shortcut_label));
        read(sb, i, 2, resources.getString(_init_lambda5.AudioAttributesImplApi21Parcelizer.abc_menu_alt_shortcut_label));
        read(sb, i, 1, resources.getString(_init_lambda5.AudioAttributesImplApi21Parcelizer.abc_menu_shift_shortcut_label));
        read(sb, i, 4, resources.getString(_init_lambda5.AudioAttributesImplApi21Parcelizer.abc_menu_sym_shortcut_label));
        read(sb, i, 8, resources.getString(_init_lambda5.AudioAttributesImplApi21Parcelizer.abc_menu_function_shortcut_label));
        if (c == '\b') {
            sb.append(resources.getString(_init_lambda5.AudioAttributesImplApi21Parcelizer.abc_menu_delete_shortcut_label));
        } else if (c == '\n') {
            sb.append(resources.getString(_init_lambda5.AudioAttributesImplApi21Parcelizer.abc_menu_enter_shortcut_label));
        } else if (c == ' ') {
            sb.append(resources.getString(_init_lambda5.AudioAttributesImplApi21Parcelizer.abc_menu_space_shortcut_label));
        } else {
            sb.append(c);
        }
        return sb.toString();
    }

    private static void read(StringBuilder sb, int i, int i2, String str) {
        if ((i & i2) == i2) {
            sb.append(str);
        }
    }

    public final boolean RatingCompat() {
        return this.RemoteActionCompatParcelizer.onCommand() && read() != 0;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.onPrepare;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.onPrepare != null;
    }

    public final void RemoteActionCompatParcelizer(removeOnTrimMemoryListener removeontrimmemorylistener) {
        this.onPrepare = removeontrimmemorylistener;
        removeontrimmemorylistener.setHeaderTitle(getTitle());
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public final CharSequence getTitle() {
        return this.onPrepareFromMediaId;
    }

    public final CharSequence IconCompatParcelizer(registerForActivityResult.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        if (audioAttributesCompatParcelizer.write()) {
            return getTitleCondensed();
        }
        return getTitle();
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.onPrepareFromMediaId = charSequence;
        this.RemoteActionCompatParcelizer.read(false);
        removeOnTrimMemoryListener removeontrimmemorylistener = this.onPrepare;
        if (removeontrimmemorylistener != null) {
            removeontrimmemorylistener.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i) {
        return setTitle(this.RemoteActionCompatParcelizer.IconCompatParcelizer().getString(i));
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.onPlayFromUri;
        return charSequence == null ? this.onPrepareFromMediaId : charSequence;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.onPlayFromUri = charSequence;
        this.RemoteActionCompatParcelizer.read(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        Drawable drawable = this.RatingCompat;
        if (drawable != null) {
            return AudioAttributesCompatParcelizer(drawable);
        }
        if (this.MediaMetadataCompat == 0) {
            return null;
        }
        Drawable drawableWrite = getDefaultViewModelCreationExtras.write(this.RemoteActionCompatParcelizer.IconCompatParcelizer(), this.MediaMetadataCompat);
        this.MediaMetadataCompat = 0;
        this.RatingCompat = drawableWrite;
        return AudioAttributesCompatParcelizer(drawableWrite);
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.MediaMetadataCompat = 0;
        this.RatingCompat = drawable;
        this.onAddQueueItem = true;
        this.RemoteActionCompatParcelizer.read(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i) {
        this.RatingCompat = null;
        this.MediaMetadataCompat = i;
        this.onAddQueueItem = true;
        this.RemoteActionCompatParcelizer.read(false);
        return this;
    }

    @Override // kotlin.handleMissingEndArrayForSingle, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.MediaBrowserCompatSearchResultReceiver = colorStateList;
        this.AudioAttributesImplBaseParcelizer = true;
        this.onAddQueueItem = true;
        this.RemoteActionCompatParcelizer.read(false);
        return this;
    }

    @Override // kotlin.handleMissingEndArrayForSingle, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.MediaBrowserCompatSearchResultReceiver;
    }

    @Override // kotlin.handleMissingEndArrayForSingle, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.MediaDescriptionCompat = mode;
        this.MediaBrowserCompatItemReceiver = true;
        this.onAddQueueItem = true;
        this.RemoteActionCompatParcelizer.read(false);
        return this;
    }

    @Override // kotlin.handleMissingEndArrayForSingle, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.MediaDescriptionCompat;
    }

    private Drawable AudioAttributesCompatParcelizer(Drawable drawable) {
        if (drawable != null && this.onAddQueueItem && (this.AudioAttributesImplBaseParcelizer || this.MediaBrowserCompatItemReceiver)) {
            drawable = findFormatOverrides.AudioAttributesImplApi26Parcelizer(drawable).mutate();
            if (this.AudioAttributesImplBaseParcelizer) {
                findFormatOverrides.AudioAttributesCompatParcelizer(drawable, this.MediaBrowserCompatSearchResultReceiver);
            }
            if (this.MediaBrowserCompatItemReceiver) {
                findFormatOverrides.read(drawable, this.MediaDescriptionCompat);
            }
            this.onAddQueueItem = false;
        }
        return drawable;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.AudioAttributesImplApi26Parcelizer & 1) == 1;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z) {
        int i = this.AudioAttributesImplApi26Parcelizer;
        int i2 = (z ? 1 : 0) | (i & (-2));
        this.AudioAttributesImplApi26Parcelizer = i2;
        if (i != i2) {
            this.RemoteActionCompatParcelizer.read(false);
        }
        return this;
    }

    public final void write(boolean z) {
        this.AudioAttributesImplApi26Parcelizer = (z ? 4 : 0) | (this.AudioAttributesImplApi26Parcelizer & (-5));
    }

    public final boolean MediaBrowserCompatCustomActionResultReceiver() {
        return (this.AudioAttributesImplApi26Parcelizer & 4) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.AudioAttributesImplApi26Parcelizer & 2) == 2;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z) {
        if ((this.AudioAttributesImplApi26Parcelizer & 4) != 0) {
            this.RemoteActionCompatParcelizer.read(this);
            return this;
        }
        RemoteActionCompatParcelizer(z);
        return this;
    }

    final void RemoteActionCompatParcelizer(boolean z) {
        int i = this.AudioAttributesImplApi26Parcelizer;
        int i2 = (z ? 2 : 0) | (i & (-3));
        this.AudioAttributesImplApi26Parcelizer = i2;
        if (i != i2) {
            this.RemoteActionCompatParcelizer.read(false);
        }
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        ThrowableDeserializer throwableDeserializer = this.AudioAttributesCompatParcelizer;
        return (throwableDeserializer == null || !throwableDeserializer.RemoteActionCompatParcelizer()) ? (this.AudioAttributesImplApi26Parcelizer & 8) == 0 : (this.AudioAttributesImplApi26Parcelizer & 8) == 0 && this.AudioAttributesCompatParcelizer.IconCompatParcelizer();
    }

    final boolean AudioAttributesCompatParcelizer(boolean z) {
        int i = this.AudioAttributesImplApi26Parcelizer;
        int i2 = (z ? 0 : 8) | (i & (-9));
        this.AudioAttributesImplApi26Parcelizer = i2;
        return i != i2;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z) {
        if (AudioAttributesCompatParcelizer(z)) {
            this.RemoteActionCompatParcelizer.onAddQueueItem();
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.read = onMenuItemClickListener;
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.onPrepareFromMediaId;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.handleMediaPlayPauseIfPendingOnHandler;
    }

    public final void IconCompatParcelizer() {
        this.RemoteActionCompatParcelizer.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
    }

    public final boolean MediaBrowserCompatSearchResultReceiver() {
        return this.RemoteActionCompatParcelizer.RatingCompat();
    }

    public final boolean AudioAttributesImplApi21Parcelizer() {
        return (this.AudioAttributesImplApi26Parcelizer & 32) == 32;
    }

    public final boolean MediaBrowserCompatItemReceiver() {
        return (this.onPrepareFromSearch & 1) == 1;
    }

    public final boolean MediaBrowserCompatMediaItem() {
        return (this.onPrepareFromSearch & 2) == 2;
    }

    public final void read(boolean z) {
        if (z) {
            this.AudioAttributesImplApi26Parcelizer |= 32;
        } else {
            this.AudioAttributesImplApi26Parcelizer &= -33;
        }
    }

    public final boolean MediaDescriptionCompat() {
        return (this.onPrepareFromSearch & 4) == 4;
    }

    @Override // kotlin.handleMissingEndArrayForSingle, android.view.MenuItem
    public final void setShowAsAction(int i) {
        int i2 = i & 3;
        if (i2 != 0 && i2 != 1 && i2 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.onPrepareFromSearch = i;
        this.RemoteActionCompatParcelizer.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.handleMissingEndArrayForSingle, android.view.MenuItem
    /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public handleMissingEndArrayForSingle setActionView(View view) {
        int i;
        this.IconCompatParcelizer = view;
        this.AudioAttributesCompatParcelizer = null;
        if (view != null && view.getId() == -1 && (i = this.MediaBrowserCompatMediaItem) > 0) {
            view.setId(i);
        }
        this.RemoteActionCompatParcelizer.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
        return this;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.handleMissingEndArrayForSingle, android.view.MenuItem
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public handleMissingEndArrayForSingle setActionView(int i) {
        Context contextIconCompatParcelizer = this.RemoteActionCompatParcelizer.IconCompatParcelizer();
        setActionView(LayoutInflater.from(contextIconCompatParcelizer).inflate(i, (ViewGroup) new LinearLayout(contextIconCompatParcelizer), false));
        return this;
    }

    @Override // kotlin.handleMissingEndArrayForSingle, android.view.MenuItem
    public final View getActionView() {
        View view = this.IconCompatParcelizer;
        if (view != null) {
            return view;
        }
        ThrowableDeserializer throwableDeserializer = this.AudioAttributesCompatParcelizer;
        if (throwableDeserializer == null) {
            return null;
        }
        View viewAudioAttributesCompatParcelizer = throwableDeserializer.AudioAttributesCompatParcelizer(this);
        this.IconCompatParcelizer = viewAudioAttributesCompatParcelizer;
        return viewAudioAttributesCompatParcelizer;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // kotlin.handleMissingEndArrayForSingle
    public final ThrowableDeserializer RemoteActionCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    @Override // kotlin.handleMissingEndArrayForSingle
    public final handleMissingEndArrayForSingle AudioAttributesCompatParcelizer(ThrowableDeserializer throwableDeserializer) {
        ThrowableDeserializer throwableDeserializer2 = this.AudioAttributesCompatParcelizer;
        if (throwableDeserializer2 != null) {
            throwableDeserializer2.AudioAttributesImplBaseParcelizer();
        }
        this.IconCompatParcelizer = null;
        this.AudioAttributesCompatParcelizer = throwableDeserializer;
        this.RemoteActionCompatParcelizer.read(true);
        ThrowableDeserializer throwableDeserializer3 = this.AudioAttributesCompatParcelizer;
        if (throwableDeserializer3 != null) {
            throwableDeserializer3.RemoteActionCompatParcelizer(new ThrowableDeserializer.AudioAttributesCompatParcelizer() { // from class: o.onRetainNonConfigurationInstance.1
                @Override // o.ThrowableDeserializer.AudioAttributesCompatParcelizer
                public final void write() {
                    onRetainNonConfigurationInstance.this.RemoteActionCompatParcelizer.onAddQueueItem();
                }
            });
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.handleMissingEndArrayForSingle, android.view.MenuItem
    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
    public handleMissingEndArrayForSingle setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    @Override // kotlin.handleMissingEndArrayForSingle, android.view.MenuItem
    public final boolean expandActionView() {
        if (!AudioAttributesImplApi26Parcelizer()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.onPlayFromMediaId;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.RemoteActionCompatParcelizer.IconCompatParcelizer(this);
        }
        return false;
    }

    @Override // kotlin.handleMissingEndArrayForSingle, android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.onPrepareFromSearch & 8) == 0) {
            return false;
        }
        if (this.IconCompatParcelizer == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.onPlayFromMediaId;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(this);
        }
        return false;
    }

    public final boolean AudioAttributesImplApi26Parcelizer() {
        ThrowableDeserializer throwableDeserializer;
        if ((this.onPrepareFromSearch & 8) == 0) {
            return false;
        }
        if (this.IconCompatParcelizer == null && (throwableDeserializer = this.AudioAttributesCompatParcelizer) != null) {
            this.IconCompatParcelizer = throwableDeserializer.AudioAttributesCompatParcelizer(this);
        }
        return this.IconCompatParcelizer != null;
    }

    public final void IconCompatParcelizer(boolean z) {
        this.onCommand = z;
        this.RemoteActionCompatParcelizer.read(false);
    }

    @Override // kotlin.handleMissingEndArrayForSingle, android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.onCommand;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.onPlayFromMediaId = onActionExpandListener;
        return this;
    }

    @Override // kotlin.handleMissingEndArrayForSingle, android.view.MenuItem
    /* JADX INFO: renamed from: read */
    public final handleMissingEndArrayForSingle setContentDescription(CharSequence charSequence) {
        this.MediaBrowserCompatCustomActionResultReceiver = charSequence;
        this.RemoteActionCompatParcelizer.read(false);
        return this;
    }

    @Override // kotlin.handleMissingEndArrayForSingle, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    @Override // kotlin.handleMissingEndArrayForSingle, android.view.MenuItem
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer */
    public final handleMissingEndArrayForSingle setTooltipText(CharSequence charSequence) {
        this.onSeekTo = charSequence;
        this.RemoteActionCompatParcelizer.read(false);
        return this;
    }

    @Override // kotlin.handleMissingEndArrayForSingle, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.onSeekTo;
    }
}
