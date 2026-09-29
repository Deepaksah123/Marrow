package kotlin;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.os.Parcelable;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.widget.MenuPopupWindow;
import kotlin._init_lambda5;
import kotlin.peekAvailableContext;

/* JADX INFO: loaded from: classes.dex */
final class removeOnConfigurationChangedListener extends onSaveInstanceState implements PopupWindow.OnDismissListener, AdapterView.OnItemClickListener, View.OnKeyListener {
    private static final int read = _init_lambda5.MediaBrowserCompatCustomActionResultReceiver.abc_popup_menu_item_layout;
    ViewTreeObserver AudioAttributesCompatParcelizer;
    private View AudioAttributesImplApi21Parcelizer;
    private final Context AudioAttributesImplApi26Parcelizer;
    private final onPreparePanel MediaBrowserCompatCustomActionResultReceiver;
    private int MediaBrowserCompatItemReceiver;
    private PopupWindow.OnDismissListener MediaBrowserCompatMediaItem;
    private boolean MediaBrowserCompatSearchResultReceiver;
    private boolean MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    private final onRequestPermissionsResult MediaDescriptionCompat;
    private final boolean RatingCompat;
    final MenuPopupWindow RemoteActionCompatParcelizer;
    private final int handleMediaPlayPauseIfPendingOnHandler;
    private final int onAddQueueItem;
    private final int onCommand;
    private peekAvailableContext.AudioAttributesCompatParcelizer onCustomAction;
    private boolean onPlayFromMediaId;
    View write;
    final ViewTreeObserver.OnGlobalLayoutListener IconCompatParcelizer = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: o.removeOnConfigurationChangedListener.2
        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            if (!removeOnConfigurationChangedListener.this.MediaBrowserCompatCustomActionResultReceiver() || removeOnConfigurationChangedListener.this.RemoteActionCompatParcelizer.handleMediaPlayPauseIfPendingOnHandler()) {
                return;
            }
            View view = removeOnConfigurationChangedListener.this.write;
            if (view == null || !view.isShown()) {
                removeOnConfigurationChangedListener.this.write();
            } else {
                removeOnConfigurationChangedListener.this.RemoteActionCompatParcelizer.AudioAttributesImplBaseParcelizer();
            }
        }
    };
    private final View.OnAttachStateChangeListener AudioAttributesImplBaseParcelizer = new View.OnAttachStateChangeListener() { // from class: o.removeOnConfigurationChangedListener.4
        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            if (removeOnConfigurationChangedListener.this.AudioAttributesCompatParcelizer != null) {
                if (!removeOnConfigurationChangedListener.this.AudioAttributesCompatParcelizer.isAlive()) {
                    removeOnConfigurationChangedListener.this.AudioAttributesCompatParcelizer = view.getViewTreeObserver();
                }
                removeOnConfigurationChangedListener.this.AudioAttributesCompatParcelizer.removeGlobalOnLayoutListener(removeOnConfigurationChangedListener.this.IconCompatParcelizer);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    };
    private int MediaMetadataCompat = 0;

    @Override // kotlin.peekAvailableContext
    public final boolean AudioAttributesCompatParcelizer() {
        return false;
    }

    @Override // kotlin.peekAvailableContext
    public final Parcelable AudioAttributesImplApi26Parcelizer() {
        return null;
    }

    @Override // kotlin.peekAvailableContext
    public final void IconCompatParcelizer(Parcelable parcelable) {
    }

    @Override // kotlin.onSaveInstanceState
    public final void RemoteActionCompatParcelizer(onRequestPermissionsResult onrequestpermissionsresult) {
    }

    public removeOnConfigurationChangedListener(Context context, onRequestPermissionsResult onrequestpermissionsresult, View view, int i, int i2, boolean z) {
        this.AudioAttributesImplApi26Parcelizer = context;
        this.MediaDescriptionCompat = onrequestpermissionsresult;
        this.RatingCompat = z;
        this.MediaBrowserCompatCustomActionResultReceiver = new onPreparePanel(onrequestpermissionsresult, LayoutInflater.from(context), z, read);
        this.handleMediaPlayPauseIfPendingOnHandler = i;
        this.onAddQueueItem = i2;
        Resources resources = context.getResources();
        this.onCommand = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(_init_lambda5.AudioAttributesCompatParcelizer.abc_config_prefDialogWidth));
        this.AudioAttributesImplApi21Parcelizer = view;
        this.RemoteActionCompatParcelizer = new MenuPopupWindow(context, i, i2);
        onrequestpermissionsresult.write(this, context);
    }

    @Override // kotlin.onSaveInstanceState
    public final void RemoteActionCompatParcelizer(boolean z) {
        this.MediaBrowserCompatCustomActionResultReceiver.write(z);
    }

    @Override // kotlin.onSaveInstanceState
    public final void IconCompatParcelizer(int i) {
        this.MediaMetadataCompat = i;
    }

    private boolean MediaBrowserCompatItemReceiver() {
        View view;
        if (MediaBrowserCompatCustomActionResultReceiver()) {
            return true;
        }
        if (this.onPlayFromMediaId || (view = this.AudioAttributesImplApi21Parcelizer) == null) {
            return false;
        }
        this.write = view;
        this.RemoteActionCompatParcelizer.IconCompatParcelizer(this);
        this.RemoteActionCompatParcelizer.write(this);
        this.RemoteActionCompatParcelizer.IconCompatParcelizer(true);
        View view2 = this.write;
        boolean z = this.AudioAttributesCompatParcelizer == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.AudioAttributesCompatParcelizer = viewTreeObserver;
        if (z) {
            viewTreeObserver.addOnGlobalLayoutListener(this.IconCompatParcelizer);
        }
        view2.addOnAttachStateChangeListener(this.AudioAttributesImplBaseParcelizer);
        this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(view2);
        this.RemoteActionCompatParcelizer.AudioAttributesImplApi21Parcelizer(this.MediaMetadataCompat);
        if (!this.MediaBrowserCompatSearchResultReceiver) {
            this.MediaBrowserCompatItemReceiver = RemoteActionCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver, this.AudioAttributesImplApi26Parcelizer, this.onCommand);
            this.MediaBrowserCompatSearchResultReceiver = true;
        }
        this.RemoteActionCompatParcelizer.read(this.MediaBrowserCompatItemReceiver);
        this.RemoteActionCompatParcelizer.MediaBrowserCompatItemReceiver(2);
        this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(AudioAttributesImplApi21Parcelizer());
        this.RemoteActionCompatParcelizer.AudioAttributesImplBaseParcelizer();
        ListView listViewA_ = this.RemoteActionCompatParcelizer.a_();
        listViewA_.setOnKeyListener(this);
        if (this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver && this.MediaDescriptionCompat.AudioAttributesImplApi26Parcelizer() != null) {
            FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.AudioAttributesImplApi26Parcelizer).inflate(_init_lambda5.MediaBrowserCompatCustomActionResultReceiver.abc_popup_menu_header_item_layout, (ViewGroup) listViewA_, false);
            TextView textView = (TextView) frameLayout.findViewById(R.id.title);
            if (textView != null) {
                textView.setText(this.MediaDescriptionCompat.AudioAttributesImplApi26Parcelizer());
            }
            frameLayout.setEnabled(false);
            listViewA_.addHeaderView(frameLayout, null, false);
        }
        this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver);
        this.RemoteActionCompatParcelizer.AudioAttributesImplBaseParcelizer();
        return true;
    }

    @Override // kotlin.removeOnContextAvailableListener
    public final void AudioAttributesImplBaseParcelizer() {
        if (!MediaBrowserCompatItemReceiver()) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    @Override // kotlin.removeOnContextAvailableListener
    public final void write() {
        if (MediaBrowserCompatCustomActionResultReceiver()) {
            this.RemoteActionCompatParcelizer.write();
        }
    }

    @Override // kotlin.removeOnContextAvailableListener
    public final boolean MediaBrowserCompatCustomActionResultReceiver() {
        return !this.onPlayFromMediaId && this.RemoteActionCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver();
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.onPlayFromMediaId = true;
        this.MediaDescriptionCompat.close();
        ViewTreeObserver viewTreeObserver = this.AudioAttributesCompatParcelizer;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.AudioAttributesCompatParcelizer = this.write.getViewTreeObserver();
            }
            this.AudioAttributesCompatParcelizer.removeGlobalOnLayoutListener(this.IconCompatParcelizer);
            this.AudioAttributesCompatParcelizer = null;
        }
        this.write.removeOnAttachStateChangeListener(this.AudioAttributesImplBaseParcelizer);
        PopupWindow.OnDismissListener onDismissListener = this.MediaBrowserCompatMediaItem;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // kotlin.peekAvailableContext
    public final void AudioAttributesCompatParcelizer(boolean z) {
        this.MediaBrowserCompatSearchResultReceiver = false;
        onPreparePanel onpreparepanel = this.MediaBrowserCompatCustomActionResultReceiver;
        if (onpreparepanel != null) {
            onpreparepanel.notifyDataSetChanged();
        }
    }

    @Override // kotlin.peekAvailableContext
    public final void read(peekAvailableContext.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        this.onCustomAction = audioAttributesCompatParcelizer;
    }

    @Override // kotlin.peekAvailableContext
    public final boolean write(removeOnTrimMemoryListener removeontrimmemorylistener) {
        if (removeontrimmemorylistener.hasVisibleItems()) {
            onTrimMemory ontrimmemory = new onTrimMemory(this.AudioAttributesImplApi26Parcelizer, removeontrimmemorylistener, this.write, this.RatingCompat, this.handleMediaPlayPauseIfPendingOnHandler, this.onAddQueueItem);
            ontrimmemory.AudioAttributesCompatParcelizer(this.onCustomAction);
            ontrimmemory.RemoteActionCompatParcelizer(onSaveInstanceState.IconCompatParcelizer(removeontrimmemorylistener));
            ontrimmemory.AudioAttributesCompatParcelizer(this.MediaBrowserCompatMediaItem);
            this.MediaBrowserCompatMediaItem = null;
            this.MediaDescriptionCompat.RemoteActionCompatParcelizer(false);
            int iAudioAttributesCompatParcelizer = this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer();
            int iIconCompatParcelizer = this.RemoteActionCompatParcelizer.IconCompatParcelizer();
            if ((Gravity.getAbsoluteGravity(this.MediaMetadataCompat, InvalidTypeIdException.MediaBrowserCompatMediaItem(this.AudioAttributesImplApi21Parcelizer)) & 7) == 5) {
                iAudioAttributesCompatParcelizer += this.AudioAttributesImplApi21Parcelizer.getWidth();
            }
            if (ontrimmemory.AudioAttributesCompatParcelizer(iAudioAttributesCompatParcelizer, iIconCompatParcelizer)) {
                peekAvailableContext.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = this.onCustomAction;
                if (audioAttributesCompatParcelizer == null) {
                    return true;
                }
                audioAttributesCompatParcelizer.read(removeontrimmemorylistener);
                return true;
            }
        }
        return false;
    }

    @Override // kotlin.peekAvailableContext
    public final void IconCompatParcelizer(onRequestPermissionsResult onrequestpermissionsresult, boolean z) {
        if (onrequestpermissionsresult == this.MediaDescriptionCompat) {
            write();
            peekAvailableContext.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = this.onCustomAction;
            if (audioAttributesCompatParcelizer != null) {
                audioAttributesCompatParcelizer.RemoteActionCompatParcelizer(onrequestpermissionsresult, z);
            }
        }
    }

    @Override // kotlin.onSaveInstanceState
    public final void write(View view) {
        this.AudioAttributesImplApi21Parcelizer = view;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        write();
        return true;
    }

    @Override // kotlin.onSaveInstanceState
    public final void AudioAttributesCompatParcelizer(PopupWindow.OnDismissListener onDismissListener) {
        this.MediaBrowserCompatMediaItem = onDismissListener;
    }

    @Override // kotlin.removeOnContextAvailableListener
    public final ListView a_() {
        return this.RemoteActionCompatParcelizer.a_();
    }

    @Override // kotlin.onSaveInstanceState
    public final void RemoteActionCompatParcelizer(int i) {
        this.RemoteActionCompatParcelizer.write(i);
    }

    @Override // kotlin.onSaveInstanceState
    public final void write(int i) {
        this.RemoteActionCompatParcelizer.IconCompatParcelizer(i);
    }

    @Override // kotlin.onSaveInstanceState
    public final void write(boolean z) {
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = z;
    }
}
