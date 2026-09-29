package kotlin;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.ViewStubCompat;
import androidx.core.view.WindowInsetsCompat;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;
import java.util.Objects;
import kotlin._findCustomDeser;
import kotlin._init_lambda5;
import kotlin._parseDoublePrimitive;
import kotlin.anyIgnorals;
import kotlin.getViewModelStore;
import kotlin.onActivityResult;
import kotlin.onRequestPermissionsResult;
import kotlin.peekAvailableContext;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes.dex */
class getOnBackPressedDispatcherannotations extends ensureViewModelStore implements onRequestPermissionsResult.RemoteActionCompatParcelizer, LayoutInflater.Factory2 {
    ActionBarContextView AudioAttributesCompatParcelizer;
    boolean AudioAttributesImplApi21Parcelizer;
    boolean AudioAttributesImplApi26Parcelizer;
    final Context AudioAttributesImplBaseParcelizer;
    PopupWindow IconCompatParcelizer;
    findTransient MediaBrowserCompatCustomActionResultReceiver;
    final accessonBackPresseds1027565324 MediaBrowserCompatItemReceiver;
    boolean MediaBrowserCompatMediaItem;
    int MediaBrowserCompatSearchResultReceiver;
    Window MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    boolean MediaDescriptionCompat;
    MenuInflater MediaMetadataCompat;
    private onAddQueueItem MediaSessionCompatQueueItem;
    private addOnNewIntentListener MediaSessionCompatResultReceiverWrapper;
    private boolean MediaSessionCompatToken;
    private MediaBrowserCompatSearchResultReceiver[] ParcelableVolumeInfo;
    private int PlaybackStateCompat;
    private Rect PlaybackStateCompatCustomAction;
    final Object RatingCompat;
    ActionBar RemoteActionCompatParcelizer;
    private View ResultReceiver;
    private CharSequence _init_lambda2;
    boolean handleMediaPlayPauseIfPendingOnHandler;
    Runnable onAddQueueItem;
    boolean onCommand;
    ViewGroup onCustomAction;
    boolean onMediaButtonEvent;
    private write onPlayFromSearch;
    private addOnPictureInPictureModeChangedListener onPrepare;
    private boolean onPrepareFromMediaId;
    private int onPrepareFromSearch;
    private AudioAttributesImplBaseParcelizer onPrepareFromUri;
    private boolean onRemoveQueueItem;
    private OnBackInvokedCallback onRemoveQueueItemAt;
    private MediaMetadataCompat onRewind;
    private MediaMetadataCompat onSeekTo;
    private OnBackInvokedDispatcher onSetCaptioningEnabled;
    private removeCancellable onSetPlaybackSpeed;
    private Configuration onSetRating;
    private boolean onSetRepeatMode;
    private boolean onSetShuffleMode;
    private final Runnable onSkipToNext;
    private boolean onSkipToPrevious;
    private boolean onSkipToQueueItem;
    private boolean onStop;
    private Rect r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw;
    private boolean r8lambdaKUbBm7ckfqTc9QCgukC86fguu4;
    private MediaBrowserCompatSearchResultReceiver r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
    private TextView r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;
    private int r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0;
    onActivityResult read;
    private boolean setSessionImpl;
    private static final AppCompatCheckBox<String, Integer> onPlay = new AppCompatCheckBox<>();
    private static final boolean onPlayFromMediaId = false;
    private static final int[] onPlayFromUri = {R.attr.windowBackground};
    private static final boolean onPause = !"robolectric".equals(Build.FINGERPRINT);
    private static final boolean onFastForward = true;

    interface IconCompatParcelizer {
        boolean RemoteActionCompatParcelizer(int i);

        View write(int i);
    }

    private int MediaDescriptionCompat(int i) {
        if (i == 8) {
            return 108;
        }
        if (i == 9) {
            return 109;
        }
        return i;
    }

    void read(ViewGroup viewGroup) {
    }

    @Override // kotlin.ensureViewModelStore
    public void write(Bundle bundle) {
    }

    getOnBackPressedDispatcherannotations(Activity activity, accessonBackPresseds1027565324 accessonbackpresseds1027565324) {
        this(activity, null, accessonbackpresseds1027565324, activity);
    }

    getOnBackPressedDispatcherannotations(Dialog dialog, accessonBackPresseds1027565324 accessonbackpresseds1027565324) {
        this(dialog.getContext(), dialog.getWindow(), accessonbackpresseds1027565324, dialog);
    }

    private getOnBackPressedDispatcherannotations(Context context, Window window, accessonBackPresseds1027565324 accessonbackpresseds1027565324, Object obj) {
        AppCompatCheckBox<String, Integer> appCompatCheckBox;
        Integer num;
        addObserverForBackInvoker addobserverforbackinvokerOnSeekTo;
        this.MediaBrowserCompatCustomActionResultReceiver = null;
        this.setSessionImpl = true;
        this.PlaybackStateCompat = -100;
        this.onSkipToNext = new Runnable() { // from class: o.getOnBackPressedDispatcherannotations.4
            @Override // java.lang.Runnable
            public void run() {
                if ((getOnBackPressedDispatcherannotations.this.MediaBrowserCompatSearchResultReceiver & 1) != 0) {
                    getOnBackPressedDispatcherannotations.this.MediaBrowserCompatCustomActionResultReceiver(0);
                }
                if ((getOnBackPressedDispatcherannotations.this.MediaBrowserCompatSearchResultReceiver & 4096) != 0) {
                    getOnBackPressedDispatcherannotations.this.MediaBrowserCompatCustomActionResultReceiver(108);
                }
                getOnBackPressedDispatcherannotations.this.MediaBrowserCompatMediaItem = false;
                getOnBackPressedDispatcherannotations.this.MediaBrowserCompatSearchResultReceiver = 0;
            }
        };
        this.AudioAttributesImplBaseParcelizer = context;
        this.MediaBrowserCompatItemReceiver = accessonbackpresseds1027565324;
        this.RatingCompat = obj;
        if (this.PlaybackStateCompat == -100 && (obj instanceof Dialog) && (addobserverforbackinvokerOnSeekTo = onSeekTo()) != null) {
            this.PlaybackStateCompat = addobserverforbackinvokerOnSeekTo.ar_().AudioAttributesImplBaseParcelizer();
        }
        if (this.PlaybackStateCompat == -100 && (num = (appCompatCheckBox = onPlay).get(obj.getClass().getName())) != null) {
            this.PlaybackStateCompat = num.intValue();
            appCompatCheckBox.remove(obj.getClass().getName());
        }
        if (window != null) {
            write(window);
        }
        startIntentSenderForResult.IconCompatParcelizer();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002c  */
    @Override // kotlin.ensureViewModelStore
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void bC_(android.window.OnBackInvokedDispatcher r3) {
        /*
            r2 = this;
            super.bC_(r3)
            android.window.OnBackInvokedDispatcher r0 = r2.onSetCaptioningEnabled
            if (r0 == 0) goto L11
            android.window.OnBackInvokedCallback r1 = r2.onRemoveQueueItemAt
            if (r1 == 0) goto L11
            o.getOnBackPressedDispatcherannotations.AudioAttributesImplApi26Parcelizer.write(r0, r1)
            r0 = 0
            r2.onRemoveQueueItemAt = r0
        L11:
            if (r3 != 0) goto L2c
            java.lang.Object r0 = r2.RatingCompat
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L2c
            android.app.Activity r0 = (android.app.Activity) r0
            android.view.Window r0 = r0.getWindow()
            if (r0 == 0) goto L2c
            java.lang.Object r3 = r2.RatingCompat
            android.app.Activity r3 = (android.app.Activity) r3
            android.window.OnBackInvokedDispatcher r3 = o.getOnBackPressedDispatcherannotations.AudioAttributesImplApi26Parcelizer.bD_(r3)
            r2.onSetCaptioningEnabled = r3
            goto L2e
        L2c:
            r2.onSetCaptioningEnabled = r3
        L2e:
            r2.onPlayFromSearch()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getOnBackPressedDispatcherannotations.bC_(android.window.OnBackInvokedDispatcher):void");
    }

    void onPlayFromSearch() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean zOnPause = onPause();
            if (zOnPause && this.onRemoveQueueItemAt == null) {
                this.onRemoveQueueItemAt = AudioAttributesImplApi26Parcelizer.bE_(this.onSetCaptioningEnabled, this);
            } else {
                if (zOnPause || (onBackInvokedCallback = this.onRemoveQueueItemAt) == null) {
                    return;
                }
                AudioAttributesImplApi26Parcelizer.write(this.onSetCaptioningEnabled, onBackInvokedCallback);
            }
        }
    }

    @Override // kotlin.ensureViewModelStore
    public Context write(Context context) {
        this.onRemoveQueueItem = true;
        int iWrite = write(context, onPrepare());
        if (RemoteActionCompatParcelizer(context)) {
            read(context);
        }
        StdKeyDeserializerStringCtorKeyDeserializer stdKeyDeserializerStringCtorKeyDeserializerAudioAttributesImplApi21Parcelizer = AudioAttributesImplApi21Parcelizer(context);
        if (onFastForward && (context instanceof ContextThemeWrapper)) {
            try {
                RatingCompat.AudioAttributesCompatParcelizer((ContextThemeWrapper) context, write(context, iWrite, stdKeyDeserializerStringCtorKeyDeserializerAudioAttributesImplApi21Parcelizer, null, false));
                return context;
            } catch (IllegalStateException unused) {
            }
        }
        if (context instanceof initializeViewTreeOwners) {
            try {
                ((initializeViewTreeOwners) context).read(write(context, iWrite, stdKeyDeserializerStringCtorKeyDeserializerAudioAttributesImplApi21Parcelizer, null, false));
                return context;
            } catch (IllegalStateException unused2) {
            }
        }
        if (!onPause) {
            return super.write(context);
        }
        Configuration configuration = new Configuration();
        configuration.uiMode = -1;
        configuration.fontScale = BitmapDescriptorFactory.HUE_RED;
        Configuration configuration2 = read.write(context, configuration).getResources().getConfiguration();
        Configuration configuration3 = context.getResources().getConfiguration();
        configuration2.uiMode = configuration3.uiMode;
        Configuration configurationWrite = write(context, iWrite, stdKeyDeserializerStringCtorKeyDeserializerAudioAttributesImplApi21Parcelizer, !configuration2.equals(configuration3) ? RemoteActionCompatParcelizer(configuration2, configuration3) : null, true);
        initializeViewTreeOwners initializeviewtreeowners = new initializeViewTreeOwners(context, _init_lambda5.MediaBrowserCompatItemReceiver.Theme_AppCompat_Empty);
        initializeviewtreeowners.read(configurationWrite);
        try {
            if (context.getTheme() != null) {
                _parseDoublePrimitive.MediaBrowserCompatCustomActionResultReceiver.AudioAttributesCompatParcelizer(initializeviewtreeowners.getTheme());
            }
        } catch (NullPointerException unused3) {
        }
        return super.write(initializeviewtreeowners);
    }

    static class RatingCompat {
        static void AudioAttributesCompatParcelizer(ContextThemeWrapper contextThemeWrapper, Configuration configuration) {
            contextThemeWrapper.applyOverrideConfiguration(configuration);
        }
    }

    @Override // kotlin.ensureViewModelStore
    public void AudioAttributesCompatParcelizer(Bundle bundle) {
        String strIconCompatParcelizer;
        this.onRemoveQueueItem = true;
        AudioAttributesCompatParcelizer(false);
        onRemoveQueueItem();
        Object obj = this.RatingCompat;
        if (obj instanceof Activity) {
            try {
                strIconCompatParcelizer = _checkToStringCoercion.IconCompatParcelizer((Activity) obj);
            } catch (IllegalArgumentException unused) {
                strIconCompatParcelizer = null;
            }
            if (strIconCompatParcelizer != null) {
                ActionBar actionBarOnPlay = onPlay();
                if (actionBarOnPlay == null) {
                    this.onStop = true;
                } else {
                    actionBarOnPlay.IconCompatParcelizer(true);
                }
            }
            IconCompatParcelizer(this);
        }
        this.onSetRating = new Configuration(this.AudioAttributesImplBaseParcelizer.getResources().getConfiguration());
        this.onSetShuffleMode = true;
    }

    @Override // kotlin.ensureViewModelStore
    public void read(Bundle bundle) {
        onRemoveQueueItemAt();
    }

    @Override // kotlin.ensureViewModelStore
    public ActionBar MediaBrowserCompatCustomActionResultReceiver() {
        onRewind();
        return this.RemoteActionCompatParcelizer;
    }

    final ActionBar onPlay() {
        return this.RemoteActionCompatParcelizer;
    }

    final Window.Callback onCommand() {
        return this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.getCallback();
    }

    private void onRewind() {
        onRemoveQueueItemAt();
        if (this.AudioAttributesImplApi26Parcelizer && this.RemoteActionCompatParcelizer == null) {
            Object obj = this.RatingCompat;
            if (obj instanceof Activity) {
                this.RemoteActionCompatParcelizer = new getActivityResultRegistry((Activity) this.RatingCompat, this.handleMediaPlayPauseIfPendingOnHandler);
            } else if (obj instanceof Dialog) {
                this.RemoteActionCompatParcelizer = new getActivityResultRegistry((Dialog) this.RatingCompat);
            }
            ActionBar actionBar = this.RemoteActionCompatParcelizer;
            if (actionBar != null) {
                actionBar.IconCompatParcelizer(this.onStop);
            }
        }
    }

    @Override // kotlin.ensureViewModelStore
    public void AudioAttributesCompatParcelizer(Toolbar toolbar) {
        if (this.RatingCompat instanceof Activity) {
            ActionBar actionBarMediaBrowserCompatCustomActionResultReceiver = MediaBrowserCompatCustomActionResultReceiver();
            if (actionBarMediaBrowserCompatCustomActionResultReceiver instanceof getActivityResultRegistry) {
                throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
            }
            this.MediaMetadataCompat = null;
            if (actionBarMediaBrowserCompatCustomActionResultReceiver != null) {
                actionBarMediaBrowserCompatCustomActionResultReceiver.AudioAttributesImplBaseParcelizer();
            }
            this.RemoteActionCompatParcelizer = null;
            if (toolbar != null) {
                getDefaultViewModelProviderFactory getdefaultviewmodelproviderfactory = new getDefaultViewModelProviderFactory(toolbar, MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(), this.onPrepareFromUri);
                this.RemoteActionCompatParcelizer = getdefaultviewmodelproviderfactory;
                this.onPrepareFromUri.write(getdefaultviewmodelproviderfactory.write);
                toolbar.setBackInvokedCallbackEnabled(true);
            } else {
                this.onPrepareFromUri.write(null);
            }
            RatingCompat();
        }
    }

    final Context onCustomAction() {
        ActionBar actionBarMediaBrowserCompatCustomActionResultReceiver = MediaBrowserCompatCustomActionResultReceiver();
        Context contextIconCompatParcelizer = actionBarMediaBrowserCompatCustomActionResultReceiver != null ? actionBarMediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer() : null;
        return contextIconCompatParcelizer == null ? this.AudioAttributesImplBaseParcelizer : contextIconCompatParcelizer;
    }

    @Override // kotlin.ensureViewModelStore
    public MenuInflater MediaBrowserCompatItemReceiver() {
        if (this.MediaMetadataCompat == null) {
            onRewind();
            ActionBar actionBar = this.RemoteActionCompatParcelizer;
            this.MediaMetadataCompat = new onMenuItemSelected(actionBar != null ? actionBar.IconCompatParcelizer() : this.AudioAttributesImplBaseParcelizer);
        }
        return this.MediaMetadataCompat;
    }

    @Override // kotlin.ensureViewModelStore
    public <T extends View> T write(int i) {
        onRemoveQueueItemAt();
        return (T) this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.findViewById(i);
    }

    @Override // kotlin.ensureViewModelStore
    public void AudioAttributesCompatParcelizer(Configuration configuration) {
        ActionBar actionBarMediaBrowserCompatCustomActionResultReceiver;
        if (this.AudioAttributesImplApi26Parcelizer && this.r8lambdaKUbBm7ckfqTc9QCgukC86fguu4 && (actionBarMediaBrowserCompatCustomActionResultReceiver = MediaBrowserCompatCustomActionResultReceiver()) != null) {
            actionBarMediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer(configuration);
        }
        startIntentSenderForResult.write().IconCompatParcelizer(this.AudioAttributesImplBaseParcelizer);
        this.onSetRating = new Configuration(this.AudioAttributesImplBaseParcelizer.getResources().getConfiguration());
        AudioAttributesCompatParcelizer(false, false);
    }

    @Override // kotlin.ensureViewModelStore
    public void MediaMetadataCompat() {
        AudioAttributesCompatParcelizer(true, false);
    }

    @Override // kotlin.ensureViewModelStore
    public void MediaBrowserCompatMediaItem() {
        ActionBar actionBarMediaBrowserCompatCustomActionResultReceiver = MediaBrowserCompatCustomActionResultReceiver();
        if (actionBarMediaBrowserCompatCustomActionResultReceiver != null) {
            actionBarMediaBrowserCompatCustomActionResultReceiver.write(false);
        }
    }

    @Override // kotlin.ensureViewModelStore
    public void MediaDescriptionCompat() {
        ActionBar actionBarMediaBrowserCompatCustomActionResultReceiver = MediaBrowserCompatCustomActionResultReceiver();
        if (actionBarMediaBrowserCompatCustomActionResultReceiver != null) {
            actionBarMediaBrowserCompatCustomActionResultReceiver.write(true);
        }
    }

    @Override // kotlin.ensureViewModelStore
    public void IconCompatParcelizer(View view) {
        onRemoveQueueItemAt();
        ViewGroup viewGroup = (ViewGroup) this.onCustomAction.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.onPrepareFromUri.IconCompatParcelizer(this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.getCallback());
    }

    @Override // kotlin.ensureViewModelStore
    public void IconCompatParcelizer(int i) {
        onRemoveQueueItemAt();
        ViewGroup viewGroup = (ViewGroup) this.onCustomAction.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.AudioAttributesImplBaseParcelizer).inflate(i, viewGroup);
        this.onPrepareFromUri.IconCompatParcelizer(this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.getCallback());
    }

    @Override // kotlin.ensureViewModelStore
    public void RemoteActionCompatParcelizer(View view, ViewGroup.LayoutParams layoutParams) {
        onRemoveQueueItemAt();
        ViewGroup viewGroup = (ViewGroup) this.onCustomAction.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.onPrepareFromUri.IconCompatParcelizer(this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.getCallback());
    }

    @Override // kotlin.ensureViewModelStore
    public void write(View view, ViewGroup.LayoutParams layoutParams) {
        onRemoveQueueItemAt();
        ((ViewGroup) this.onCustomAction.findViewById(R.id.content)).addView(view, layoutParams);
        this.onPrepareFromUri.IconCompatParcelizer(this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.getCallback());
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0045  */
    @Override // kotlin.ensureViewModelStore
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void MediaBrowserCompatSearchResultReceiver() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.RatingCompat
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L9
            RemoteActionCompatParcelizer(r3)
        L9:
            boolean r0 = r3.MediaBrowserCompatMediaItem
            if (r0 == 0) goto L18
            android.view.Window r0 = r3.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver
            android.view.View r0 = r0.getDecorView()
            java.lang.Runnable r1 = r3.onSkipToNext
            r0.removeCallbacks(r1)
        L18:
            r0 = 1
            r3.AudioAttributesImplApi21Parcelizer = r0
            int r0 = r3.PlaybackStateCompat
            r1 = -100
            if (r0 == r1) goto L45
            java.lang.Object r0 = r3.RatingCompat
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L45
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L45
            o.AppCompatCheckBox<java.lang.String, java.lang.Integer> r0 = kotlin.getOnBackPressedDispatcherannotations.onPlay
            java.lang.Object r1 = r3.RatingCompat
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            int r2 = r3.PlaybackStateCompat
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            goto L54
        L45:
            o.AppCompatCheckBox<java.lang.String, java.lang.Integer> r0 = kotlin.getOnBackPressedDispatcherannotations.onPlay
            java.lang.Object r1 = r3.RatingCompat
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.remove(r1)
        L54:
            androidx.appcompat.app.ActionBar r0 = r3.RemoteActionCompatParcelizer
            if (r0 == 0) goto L5b
            r0.AudioAttributesImplBaseParcelizer()
        L5b:
            r3.onPlayFromUri()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getOnBackPressedDispatcherannotations.MediaBrowserCompatSearchResultReceiver():void");
    }

    private void onPlayFromUri() {
        MediaMetadataCompat mediaMetadataCompat = this.onRewind;
        if (mediaMetadataCompat != null) {
            mediaMetadataCompat.read();
        }
        MediaMetadataCompat mediaMetadataCompat2 = this.onSeekTo;
        if (mediaMetadataCompat2 != null) {
            mediaMetadataCompat2.read();
        }
    }

    @Override // kotlin.ensureViewModelStore
    public void read(int i) {
        this.r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0 = i;
    }

    private void onRemoveQueueItem() {
        if (this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver == null) {
            Object obj = this.RatingCompat;
            if (obj instanceof Activity) {
                write(((Activity) obj).getWindow());
            }
        }
        if (this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    private void write(Window window) {
        if (this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver != null) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof AudioAttributesImplBaseParcelizer) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        AudioAttributesImplBaseParcelizer audioAttributesImplBaseParcelizer = new AudioAttributesImplBaseParcelizer(callback);
        this.onPrepareFromUri = audioAttributesImplBaseParcelizer;
        window.setCallback(audioAttributesImplBaseParcelizer);
        setTitle settitleIconCompatParcelizer = setTitle.IconCompatParcelizer(this.AudioAttributesImplBaseParcelizer, null, onPlayFromUri);
        Drawable drawableRemoteActionCompatParcelizer = settitleIconCompatParcelizer.RemoteActionCompatParcelizer(0);
        if (drawableRemoteActionCompatParcelizer != null) {
            window.setBackgroundDrawable(drawableRemoteActionCompatParcelizer);
        }
        settitleIconCompatParcelizer.write();
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = window;
        if (Build.VERSION.SDK_INT < 33 || this.onSetCaptioningEnabled != null) {
            return;
        }
        bC_(null);
    }

    private void onRemoveQueueItemAt() {
        if (this.r8lambdaKUbBm7ckfqTc9QCgukC86fguu4) {
            return;
        }
        this.onCustomAction = onPrepareFromSearch();
        CharSequence charSequenceMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
        if (!TextUtils.isEmpty(charSequenceMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver)) {
            removeCancellable removecancellable = this.onSetPlaybackSpeed;
            if (removecancellable != null) {
                removecancellable.setWindowTitle(charSequenceMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
            } else if (onPlay() != null) {
                onPlay().AudioAttributesCompatParcelizer(charSequenceMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
            } else {
                TextView textView = this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;
                if (textView != null) {
                    textView.setText(charSequenceMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
                }
            }
        }
        onPrepareFromMediaId();
        read(this.onCustomAction);
        this.r8lambdaKUbBm7ckfqTc9QCgukC86fguu4 = true;
        MediaBrowserCompatSearchResultReceiver mediaBrowserCompatSearchResultReceiver = read(0, false);
        if (this.AudioAttributesImplApi21Parcelizer) {
            return;
        }
        if (mediaBrowserCompatSearchResultReceiver == null || mediaBrowserCompatSearchResultReceiver.RatingCompat == null) {
            AudioAttributesImplApi21Parcelizer(108);
        }
    }

    private ViewGroup onPrepareFromSearch() {
        ViewGroup viewGroup;
        Context initializeviewtreeowners;
        TypedArray typedArrayObtainStyledAttributes = this.AudioAttributesImplBaseParcelizer.obtainStyledAttributes(_init_lambda5.AudioAttributesImplApi26Parcelizer.AppCompatTheme);
        if (!typedArrayObtainStyledAttributes.hasValue(_init_lambda5.AudioAttributesImplApi26Parcelizer.AppCompatTheme_windowActionBar)) {
            typedArrayObtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (typedArrayObtainStyledAttributes.getBoolean(_init_lambda5.AudioAttributesImplApi26Parcelizer.AppCompatTheme_windowNoTitle, false)) {
            AudioAttributesCompatParcelizer(1);
        } else if (typedArrayObtainStyledAttributes.getBoolean(_init_lambda5.AudioAttributesImplApi26Parcelizer.AppCompatTheme_windowActionBar, false)) {
            AudioAttributesCompatParcelizer(108);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(_init_lambda5.AudioAttributesImplApi26Parcelizer.AppCompatTheme_windowActionBarOverlay, false)) {
            AudioAttributesCompatParcelizer(109);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(_init_lambda5.AudioAttributesImplApi26Parcelizer.AppCompatTheme_windowActionModeOverlay, false)) {
            AudioAttributesCompatParcelizer(10);
        }
        this.MediaDescriptionCompat = typedArrayObtainStyledAttributes.getBoolean(_init_lambda5.AudioAttributesImplApi26Parcelizer.AppCompatTheme_android_windowIsFloating, false);
        typedArrayObtainStyledAttributes.recycle();
        onRemoveQueueItem();
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.getDecorView();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.AudioAttributesImplBaseParcelizer);
        if (!this.onMediaButtonEvent) {
            if (this.MediaDescriptionCompat) {
                viewGroup = (ViewGroup) layoutInflaterFrom.inflate(_init_lambda5.MediaBrowserCompatCustomActionResultReceiver.abc_dialog_title_material, (ViewGroup) null);
                this.handleMediaPlayPauseIfPendingOnHandler = false;
                this.AudioAttributesImplApi26Parcelizer = false;
            } else if (this.AudioAttributesImplApi26Parcelizer) {
                TypedValue typedValue = new TypedValue();
                this.AudioAttributesImplBaseParcelizer.getTheme().resolveAttribute(_init_lambda5.read.actionBarTheme, typedValue, true);
                if (typedValue.resourceId != 0) {
                    initializeviewtreeowners = new initializeViewTreeOwners(this.AudioAttributesImplBaseParcelizer, typedValue.resourceId);
                } else {
                    initializeviewtreeowners = this.AudioAttributesImplBaseParcelizer;
                }
                viewGroup = (ViewGroup) LayoutInflater.from(initializeviewtreeowners).inflate(_init_lambda5.MediaBrowserCompatCustomActionResultReceiver.abc_screen_toolbar, (ViewGroup) null);
                removeCancellable removecancellable = (removeCancellable) viewGroup.findViewById(_init_lambda5.AudioAttributesImplBaseParcelizer.decor_content_parent);
                this.onSetPlaybackSpeed = removecancellable;
                removecancellable.setWindowCallback(onCommand());
                if (this.handleMediaPlayPauseIfPendingOnHandler) {
                    this.onSetPlaybackSpeed.IconCompatParcelizer(109);
                }
                if (this.onSkipToQueueItem) {
                    this.onSetPlaybackSpeed.IconCompatParcelizer(2);
                }
                if (this.onSkipToPrevious) {
                    this.onSetPlaybackSpeed.IconCompatParcelizer(5);
                }
            } else {
                viewGroup = null;
            }
        } else {
            viewGroup = this.onCommand ? (ViewGroup) layoutInflaterFrom.inflate(_init_lambda5.MediaBrowserCompatCustomActionResultReceiver.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) layoutInflaterFrom.inflate(_init_lambda5.MediaBrowserCompatCustomActionResultReceiver.abc_screen_simple, (ViewGroup) null);
        }
        if (viewGroup == null) {
            StringBuilder sb = new StringBuilder("AppCompat does not support the current theme features: { windowActionBar: ");
            sb.append(this.AudioAttributesImplApi26Parcelizer);
            sb.append(", windowActionBarOverlay: ");
            sb.append(this.handleMediaPlayPauseIfPendingOnHandler);
            sb.append(", android:windowIsFloating: ");
            sb.append(this.MediaDescriptionCompat);
            sb.append(", windowActionModeOverlay: ");
            sb.append(this.onCommand);
            sb.append(", windowNoTitle: ");
            sb.append(this.onMediaButtonEvent);
            sb.append(" }");
            throw new IllegalArgumentException(sb.toString());
        }
        InvalidTypeIdException.read(viewGroup, new finishBranchObject() { // from class: o.getOnBackPressedDispatcherannotations.3
            @Override // kotlin.finishBranchObject
            public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                int iMediaBrowserCompatCustomActionResultReceiver = windowInsetsCompat.MediaBrowserCompatCustomActionResultReceiver();
                int iAudioAttributesCompatParcelizer = getOnBackPressedDispatcherannotations.this.AudioAttributesCompatParcelizer(windowInsetsCompat, (Rect) null);
                if (iMediaBrowserCompatCustomActionResultReceiver != iAudioAttributesCompatParcelizer) {
                    windowInsetsCompat = windowInsetsCompat.read(windowInsetsCompat.AudioAttributesImplApi21Parcelizer(), iAudioAttributesCompatParcelizer, windowInsetsCompat.MediaBrowserCompatItemReceiver(), windowInsetsCompat.AudioAttributesImplBaseParcelizer());
                }
                return InvalidTypeIdException.AudioAttributesCompatParcelizer(view, windowInsetsCompat);
            }
        });
        if (this.onSetPlaybackSpeed == null) {
            this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = (TextView) viewGroup.findViewById(_init_lambda5.AudioAttributesImplBaseParcelizer.title);
        }
        setChecked.read(viewGroup);
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(_init_lambda5.AudioAttributesImplBaseParcelizer.action_bar_activity_content);
        ViewGroup viewGroup2 = (ViewGroup) this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.findViewById(R.id.content);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup2.setId(-1);
            contentFrameLayout.setId(R.id.content);
            if (viewGroup2 instanceof FrameLayout) {
                ((FrameLayout) viewGroup2).setForeground(null);
            }
        }
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new ContentFrameLayout.read() { // from class: o.getOnBackPressedDispatcherannotations.5
            @Override // androidx.appcompat.widget.ContentFrameLayout.read
            public void IconCompatParcelizer() {
            }

            @Override // androidx.appcompat.widget.ContentFrameLayout.read
            public void read() {
                getOnBackPressedDispatcherannotations.this.handleMediaPlayPauseIfPendingOnHandler();
            }
        });
        return viewGroup;
    }

    private void onPrepareFromMediaId() {
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) this.onCustomAction.findViewById(R.id.content);
        View decorView = this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.getDecorView();
        contentFrameLayout.setDecorPadding(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        TypedArray typedArrayObtainStyledAttributes = this.AudioAttributesImplBaseParcelizer.obtainStyledAttributes(_init_lambda5.AudioAttributesImplApi26Parcelizer.AppCompatTheme);
        typedArrayObtainStyledAttributes.getValue(_init_lambda5.AudioAttributesImplApi26Parcelizer.AppCompatTheme_windowMinWidthMajor, contentFrameLayout.read());
        typedArrayObtainStyledAttributes.getValue(_init_lambda5.AudioAttributesImplApi26Parcelizer.AppCompatTheme_windowMinWidthMinor, contentFrameLayout.MediaBrowserCompatCustomActionResultReceiver());
        if (typedArrayObtainStyledAttributes.hasValue(_init_lambda5.AudioAttributesImplApi26Parcelizer.AppCompatTheme_windowFixedWidthMajor)) {
            typedArrayObtainStyledAttributes.getValue(_init_lambda5.AudioAttributesImplApi26Parcelizer.AppCompatTheme_windowFixedWidthMajor, contentFrameLayout.AudioAttributesCompatParcelizer());
        }
        if (typedArrayObtainStyledAttributes.hasValue(_init_lambda5.AudioAttributesImplApi26Parcelizer.AppCompatTheme_windowFixedWidthMinor)) {
            typedArrayObtainStyledAttributes.getValue(_init_lambda5.AudioAttributesImplApi26Parcelizer.AppCompatTheme_windowFixedWidthMinor, contentFrameLayout.write());
        }
        if (typedArrayObtainStyledAttributes.hasValue(_init_lambda5.AudioAttributesImplApi26Parcelizer.AppCompatTheme_windowFixedHeightMajor)) {
            typedArrayObtainStyledAttributes.getValue(_init_lambda5.AudioAttributesImplApi26Parcelizer.AppCompatTheme_windowFixedHeightMajor, contentFrameLayout.IconCompatParcelizer());
        }
        if (typedArrayObtainStyledAttributes.hasValue(_init_lambda5.AudioAttributesImplApi26Parcelizer.AppCompatTheme_windowFixedHeightMinor)) {
            typedArrayObtainStyledAttributes.getValue(_init_lambda5.AudioAttributesImplApi26Parcelizer.AppCompatTheme_windowFixedHeightMinor, contentFrameLayout.RemoteActionCompatParcelizer());
        }
        typedArrayObtainStyledAttributes.recycle();
        contentFrameLayout.requestLayout();
    }

    @Override // kotlin.ensureViewModelStore
    public boolean AudioAttributesCompatParcelizer(int i) {
        int iMediaDescriptionCompat = MediaDescriptionCompat(i);
        if (this.onMediaButtonEvent && iMediaDescriptionCompat == 108) {
            return false;
        }
        if (this.AudioAttributesImplApi26Parcelizer && iMediaDescriptionCompat == 1) {
            this.AudioAttributesImplApi26Parcelizer = false;
        }
        if (iMediaDescriptionCompat == 1) {
            onPrepareFromUri();
            this.onMediaButtonEvent = true;
            return true;
        }
        if (iMediaDescriptionCompat == 2) {
            onPrepareFromUri();
            this.onSkipToQueueItem = true;
            return true;
        }
        if (iMediaDescriptionCompat == 5) {
            onPrepareFromUri();
            this.onSkipToPrevious = true;
            return true;
        }
        if (iMediaDescriptionCompat == 10) {
            onPrepareFromUri();
            this.onCommand = true;
            return true;
        }
        if (iMediaDescriptionCompat == 108) {
            onPrepareFromUri();
            this.AudioAttributesImplApi26Parcelizer = true;
            return true;
        }
        if (iMediaDescriptionCompat == 109) {
            onPrepareFromUri();
            this.handleMediaPlayPauseIfPendingOnHandler = true;
            return true;
        }
        return this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.requestFeature(iMediaDescriptionCompat);
    }

    @Override // kotlin.ensureViewModelStore
    public final void read(CharSequence charSequence) {
        this._init_lambda2 = charSequence;
        removeCancellable removecancellable = this.onSetPlaybackSpeed;
        if (removecancellable != null) {
            removecancellable.setWindowTitle(charSequence);
            return;
        }
        if (onPlay() != null) {
            onPlay().AudioAttributesCompatParcelizer(charSequence);
            return;
        }
        TextView textView = this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    final CharSequence MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        Object obj = this.RatingCompat;
        if (obj instanceof Activity) {
            return ((Activity) obj).getTitle();
        }
        return this._init_lambda2;
    }

    void MediaBrowserCompatItemReceiver(int i) {
        if (i == 108) {
            ActionBar actionBarMediaBrowserCompatCustomActionResultReceiver = MediaBrowserCompatCustomActionResultReceiver();
            if (actionBarMediaBrowserCompatCustomActionResultReceiver != null) {
                actionBarMediaBrowserCompatCustomActionResultReceiver.AudioAttributesCompatParcelizer(false);
                return;
            }
            return;
        }
        if (i == 0) {
            MediaBrowserCompatSearchResultReceiver mediaBrowserCompatSearchResultReceiver = read(i, true);
            if (mediaBrowserCompatSearchResultReceiver.MediaBrowserCompatCustomActionResultReceiver) {
                RemoteActionCompatParcelizer(mediaBrowserCompatSearchResultReceiver, false);
            }
        }
    }

    void AudioAttributesImplBaseParcelizer(int i) {
        ActionBar actionBarMediaBrowserCompatCustomActionResultReceiver;
        if (i != 108 || (actionBarMediaBrowserCompatCustomActionResultReceiver = MediaBrowserCompatCustomActionResultReceiver()) == null) {
            return;
        }
        actionBarMediaBrowserCompatCustomActionResultReceiver.AudioAttributesCompatParcelizer(true);
    }

    @Override // o.onRequestPermissionsResult.RemoteActionCompatParcelizer
    public boolean write(onRequestPermissionsResult onrequestpermissionsresult, MenuItem menuItem) {
        MediaBrowserCompatSearchResultReceiver mediaBrowserCompatSearchResultReceiverAudioAttributesCompatParcelizer;
        Window.Callback callbackOnCommand = onCommand();
        if (callbackOnCommand == null || this.AudioAttributesImplApi21Parcelizer || (mediaBrowserCompatSearchResultReceiverAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(onrequestpermissionsresult.MediaBrowserCompatMediaItem())) == null) {
            return false;
        }
        return callbackOnCommand.onMenuItemSelected(mediaBrowserCompatSearchResultReceiverAudioAttributesCompatParcelizer.read, menuItem);
    }

    @Override // o.onRequestPermissionsResult.RemoteActionCompatParcelizer
    public void read(onRequestPermissionsResult onrequestpermissionsresult) {
        write(true);
    }

    public onActivityResult IconCompatParcelizer(onActivityResult.write writeVar) {
        accessonBackPresseds1027565324 accessonbackpresseds1027565324;
        if (writeVar == null) {
            throw new IllegalArgumentException("ActionMode callback can not be null.");
        }
        onActivityResult onactivityresult = this.read;
        if (onactivityresult != null) {
            onactivityresult.IconCompatParcelizer();
        }
        AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = new AudioAttributesCompatParcelizer(writeVar);
        ActionBar actionBarMediaBrowserCompatCustomActionResultReceiver = MediaBrowserCompatCustomActionResultReceiver();
        if (actionBarMediaBrowserCompatCustomActionResultReceiver != null) {
            onActivityResult onactivityresultWrite = actionBarMediaBrowserCompatCustomActionResultReceiver.write(audioAttributesCompatParcelizer);
            this.read = onactivityresultWrite;
            if (onactivityresultWrite != null && (accessonbackpresseds1027565324 = this.MediaBrowserCompatItemReceiver) != null) {
                accessonbackpresseds1027565324.RemoteActionCompatParcelizer(onactivityresultWrite);
            }
        }
        if (this.read == null) {
            this.read = AudioAttributesCompatParcelizer(audioAttributesCompatParcelizer);
        }
        onPlayFromSearch();
        return this.read;
    }

    @Override // kotlin.ensureViewModelStore
    public void RatingCompat() {
        if (onPlay() == null || MediaBrowserCompatCustomActionResultReceiver().AudioAttributesCompatParcelizer()) {
            return;
        }
        AudioAttributesImplApi21Parcelizer(0);
    }

    onActivityResult AudioAttributesCompatParcelizer(onActivityResult.write writeVar) {
        onActivityResult onactivityresultIconCompatParcelizer;
        Context initializeviewtreeowners;
        accessonBackPresseds1027565324 accessonbackpresseds1027565324;
        onAddQueueItem();
        onActivityResult onactivityresult = this.read;
        if (onactivityresult != null) {
            onactivityresult.IconCompatParcelizer();
        }
        if (!(writeVar instanceof AudioAttributesCompatParcelizer)) {
            writeVar = new AudioAttributesCompatParcelizer(writeVar);
        }
        accessonBackPresseds1027565324 accessonbackpresseds10275653242 = this.MediaBrowserCompatItemReceiver;
        if (accessonbackpresseds10275653242 == null || this.AudioAttributesImplApi21Parcelizer) {
            onactivityresultIconCompatParcelizer = null;
        } else {
            try {
                onactivityresultIconCompatParcelizer = accessonbackpresseds10275653242.IconCompatParcelizer(writeVar);
            } catch (AbstractMethodError unused) {
                onactivityresultIconCompatParcelizer = null;
            }
        }
        if (onactivityresultIconCompatParcelizer != null) {
            this.read = onactivityresultIconCompatParcelizer;
        } else {
            if (this.AudioAttributesCompatParcelizer == null) {
                if (this.MediaDescriptionCompat) {
                    TypedValue typedValue = new TypedValue();
                    Resources.Theme theme = this.AudioAttributesImplBaseParcelizer.getTheme();
                    theme.resolveAttribute(_init_lambda5.read.actionBarTheme, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        Resources.Theme themeNewTheme = this.AudioAttributesImplBaseParcelizer.getResources().newTheme();
                        themeNewTheme.setTo(theme);
                        themeNewTheme.applyStyle(typedValue.resourceId, true);
                        initializeviewtreeowners = new initializeViewTreeOwners(this.AudioAttributesImplBaseParcelizer, 0);
                        initializeviewtreeowners.getTheme().setTo(themeNewTheme);
                    } else {
                        initializeviewtreeowners = this.AudioAttributesImplBaseParcelizer;
                    }
                    this.AudioAttributesCompatParcelizer = new ActionBarContextView(initializeviewtreeowners);
                    PopupWindow popupWindow = new PopupWindow(initializeviewtreeowners, (AttributeSet) null, _init_lambda5.read.actionModePopupWindowStyle);
                    this.IconCompatParcelizer = popupWindow;
                    AnnotatedClassCreators.RemoteActionCompatParcelizer(popupWindow, 2);
                    this.IconCompatParcelizer.setContentView(this.AudioAttributesCompatParcelizer);
                    this.IconCompatParcelizer.setWidth(-1);
                    initializeviewtreeowners.getTheme().resolveAttribute(_init_lambda5.read.actionBarSize, typedValue, true);
                    this.AudioAttributesCompatParcelizer.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, initializeviewtreeowners.getResources().getDisplayMetrics()));
                    this.IconCompatParcelizer.setHeight(-2);
                    this.onAddQueueItem = new Runnable() { // from class: o.getOnBackPressedDispatcherannotations.2
                        @Override // java.lang.Runnable
                        public void run() {
                            getOnBackPressedDispatcherannotations.this.IconCompatParcelizer.showAtLocation(getOnBackPressedDispatcherannotations.this.AudioAttributesCompatParcelizer, 55, 0, 0);
                            getOnBackPressedDispatcherannotations.this.onAddQueueItem();
                            if (getOnBackPressedDispatcherannotations.this.onMediaButtonEvent()) {
                                getOnBackPressedDispatcherannotations.this.AudioAttributesCompatParcelizer.setAlpha(BitmapDescriptorFactory.HUE_RED);
                                getOnBackPressedDispatcherannotations getonbackpresseddispatcherannotations = getOnBackPressedDispatcherannotations.this;
                                getonbackpresseddispatcherannotations.MediaBrowserCompatCustomActionResultReceiver = InvalidTypeIdException.AudioAttributesCompatParcelizer(getonbackpresseddispatcherannotations.AudioAttributesCompatParcelizer).read(1.0f);
                                getOnBackPressedDispatcherannotations.this.MediaBrowserCompatCustomActionResultReceiver.AudioAttributesCompatParcelizer(new Java7SupportImpl() { // from class: o.getOnBackPressedDispatcherannotations.2.4
                                    @Override // kotlin.Java7SupportImpl, kotlin.NioPathDeserializer
                                    public void read(View view) {
                                        getOnBackPressedDispatcherannotations.this.AudioAttributesCompatParcelizer.setVisibility(0);
                                    }

                                    @Override // kotlin.Java7SupportImpl, kotlin.NioPathDeserializer
                                    public void RemoteActionCompatParcelizer(View view) {
                                        getOnBackPressedDispatcherannotations.this.AudioAttributesCompatParcelizer.setAlpha(1.0f);
                                        getOnBackPressedDispatcherannotations.this.MediaBrowserCompatCustomActionResultReceiver.AudioAttributesCompatParcelizer((NioPathDeserializer) null);
                                        getOnBackPressedDispatcherannotations.this.MediaBrowserCompatCustomActionResultReceiver = null;
                                    }
                                });
                                return;
                            }
                            getOnBackPressedDispatcherannotations.this.AudioAttributesCompatParcelizer.setAlpha(1.0f);
                            getOnBackPressedDispatcherannotations.this.AudioAttributesCompatParcelizer.setVisibility(0);
                        }
                    };
                } else {
                    ViewStubCompat viewStubCompat = (ViewStubCompat) this.onCustomAction.findViewById(_init_lambda5.AudioAttributesImplBaseParcelizer.action_mode_bar_stub);
                    if (viewStubCompat != null) {
                        viewStubCompat.setLayoutInflater(LayoutInflater.from(onCustomAction()));
                        this.AudioAttributesCompatParcelizer = (ActionBarContextView) viewStubCompat.write();
                    }
                }
            }
            if (this.AudioAttributesCompatParcelizer != null) {
                onAddQueueItem();
                this.AudioAttributesCompatParcelizer.MediaBrowserCompatItemReceiver();
                onBackPressed onbackpressed = new onBackPressed(this.AudioAttributesCompatParcelizer.getContext(), this.AudioAttributesCompatParcelizer, writeVar, this.IconCompatParcelizer == null);
                if (writeVar.AudioAttributesCompatParcelizer(onbackpressed, onbackpressed.RemoteActionCompatParcelizer())) {
                    onbackpressed.AudioAttributesImplApi21Parcelizer();
                    this.AudioAttributesCompatParcelizer.IconCompatParcelizer(onbackpressed);
                    this.read = onbackpressed;
                    if (onMediaButtonEvent()) {
                        this.AudioAttributesCompatParcelizer.setAlpha(BitmapDescriptorFactory.HUE_RED);
                        findTransient findtransient = InvalidTypeIdException.AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer).read(1.0f);
                        this.MediaBrowserCompatCustomActionResultReceiver = findtransient;
                        findtransient.AudioAttributesCompatParcelizer(new Java7SupportImpl() { // from class: o.getOnBackPressedDispatcherannotations.1
                            @Override // kotlin.Java7SupportImpl, kotlin.NioPathDeserializer
                            public void read(View view) {
                                getOnBackPressedDispatcherannotations.this.AudioAttributesCompatParcelizer.setVisibility(0);
                                if (getOnBackPressedDispatcherannotations.this.AudioAttributesCompatParcelizer.getParent() instanceof View) {
                                    InvalidTypeIdException.onSetRepeatMode((View) getOnBackPressedDispatcherannotations.this.AudioAttributesCompatParcelizer.getParent());
                                }
                            }

                            @Override // kotlin.Java7SupportImpl, kotlin.NioPathDeserializer
                            public void RemoteActionCompatParcelizer(View view) {
                                getOnBackPressedDispatcherannotations.this.AudioAttributesCompatParcelizer.setAlpha(1.0f);
                                getOnBackPressedDispatcherannotations.this.MediaBrowserCompatCustomActionResultReceiver.AudioAttributesCompatParcelizer((NioPathDeserializer) null);
                                getOnBackPressedDispatcherannotations.this.MediaBrowserCompatCustomActionResultReceiver = null;
                            }
                        });
                    } else {
                        this.AudioAttributesCompatParcelizer.setAlpha(1.0f);
                        this.AudioAttributesCompatParcelizer.setVisibility(0);
                        if (this.AudioAttributesCompatParcelizer.getParent() instanceof View) {
                            InvalidTypeIdException.onSetRepeatMode((View) this.AudioAttributesCompatParcelizer.getParent());
                        }
                    }
                    if (this.IconCompatParcelizer != null) {
                        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.getDecorView().post(this.onAddQueueItem);
                    }
                } else {
                    this.read = null;
                }
            }
        }
        onActivityResult onactivityresult2 = this.read;
        if (onactivityresult2 != null && (accessonbackpresseds1027565324 = this.MediaBrowserCompatItemReceiver) != null) {
            accessonbackpresseds1027565324.RemoteActionCompatParcelizer(onactivityresult2);
        }
        onPlayFromSearch();
        return this.read;
    }

    final boolean onMediaButtonEvent() {
        ViewGroup viewGroup;
        return this.r8lambdaKUbBm7ckfqTc9QCgukC86fguu4 && (viewGroup = this.onCustomAction) != null && InvalidTypeIdException.onSeekTo(viewGroup);
    }

    public boolean onFastForward() {
        return this.setSessionImpl;
    }

    void onAddQueueItem() {
        findTransient findtransient = this.MediaBrowserCompatCustomActionResultReceiver;
        if (findtransient != null) {
            findtransient.write();
        }
    }

    boolean onPause() {
        if (this.onSetCaptioningEnabled == null) {
            return false;
        }
        MediaBrowserCompatSearchResultReceiver mediaBrowserCompatSearchResultReceiver = read(0, false);
        return (mediaBrowserCompatSearchResultReceiver != null && mediaBrowserCompatSearchResultReceiver.MediaBrowserCompatCustomActionResultReceiver) || this.read != null;
    }

    boolean onPlayFromMediaId() {
        boolean z = this.MediaSessionCompatToken;
        this.MediaSessionCompatToken = false;
        MediaBrowserCompatSearchResultReceiver mediaBrowserCompatSearchResultReceiver = read(0, false);
        if (mediaBrowserCompatSearchResultReceiver != null && mediaBrowserCompatSearchResultReceiver.MediaBrowserCompatCustomActionResultReceiver) {
            if (!z) {
                RemoteActionCompatParcelizer(mediaBrowserCompatSearchResultReceiver, true);
            }
            return true;
        }
        onActivityResult onactivityresult = this.read;
        if (onactivityresult != null) {
            onactivityresult.IconCompatParcelizer();
            return true;
        }
        ActionBar actionBarMediaBrowserCompatCustomActionResultReceiver = MediaBrowserCompatCustomActionResultReceiver();
        return actionBarMediaBrowserCompatCustomActionResultReceiver != null && actionBarMediaBrowserCompatCustomActionResultReceiver.RemoteActionCompatParcelizer();
    }

    boolean read(int i, KeyEvent keyEvent) {
        ActionBar actionBarMediaBrowserCompatCustomActionResultReceiver = MediaBrowserCompatCustomActionResultReceiver();
        if (actionBarMediaBrowserCompatCustomActionResultReceiver != null && actionBarMediaBrowserCompatCustomActionResultReceiver.RemoteActionCompatParcelizer(i, keyEvent)) {
            return true;
        }
        MediaBrowserCompatSearchResultReceiver mediaBrowserCompatSearchResultReceiver = this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
        if (mediaBrowserCompatSearchResultReceiver != null && AudioAttributesCompatParcelizer(mediaBrowserCompatSearchResultReceiver, keyEvent.getKeyCode(), keyEvent, 1)) {
            MediaBrowserCompatSearchResultReceiver mediaBrowserCompatSearchResultReceiver2 = this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
            if (mediaBrowserCompatSearchResultReceiver2 != null) {
                mediaBrowserCompatSearchResultReceiver2.MediaBrowserCompatItemReceiver = true;
            }
            return true;
        }
        if (this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM == null) {
            MediaBrowserCompatSearchResultReceiver mediaBrowserCompatSearchResultReceiver3 = read(0, true);
            IconCompatParcelizer(mediaBrowserCompatSearchResultReceiver3, keyEvent);
            boolean zAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(mediaBrowserCompatSearchResultReceiver3, keyEvent.getKeyCode(), keyEvent, 1);
            mediaBrowserCompatSearchResultReceiver3.AudioAttributesImplApi21Parcelizer = false;
            if (zAudioAttributesCompatParcelizer) {
                return true;
            }
        }
        return false;
    }

    boolean read(KeyEvent keyEvent) {
        View decorView;
        Object obj = this.RatingCompat;
        if (((obj instanceof _findCustomDeser.AudioAttributesCompatParcelizer) || (obj instanceof menuHostHelperlambda0)) && (decorView = this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.getDecorView()) != null && _findCustomDeser.read(decorView, keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() == 82 && this.onPrepareFromUri.RemoteActionCompatParcelizer(this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.getCallback(), keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        return keyEvent.getAction() == 0 ? write(keyCode, keyEvent) : RemoteActionCompatParcelizer(keyCode, keyEvent);
    }

    boolean RemoteActionCompatParcelizer(int i, KeyEvent keyEvent) {
        if (i != 4) {
            if (i == 82) {
                IconCompatParcelizer(0, keyEvent);
                return true;
            }
        } else if (onPlayFromMediaId()) {
            return true;
        }
        return false;
    }

    boolean write(int i, KeyEvent keyEvent) {
        if (i == 4) {
            this.MediaSessionCompatToken = (keyEvent.getFlags() & 128) != 0;
        } else if (i == 82) {
            AudioAttributesCompatParcelizer(0, keyEvent);
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View RemoteActionCompatParcelizer(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z;
        boolean zRemoteActionCompatParcelizer = false;
        if (this.onPrepare == null) {
            String string = this.AudioAttributesImplBaseParcelizer.obtainStyledAttributes(_init_lambda5.AudioAttributesImplApi26Parcelizer.AppCompatTheme).getString(_init_lambda5.AudioAttributesImplApi26Parcelizer.AppCompatTheme_viewInflaterClass);
            if (string == null) {
                this.onPrepare = new addOnPictureInPictureModeChangedListener();
            } else {
                try {
                    this.onPrepare = (addOnPictureInPictureModeChangedListener) this.AudioAttributesImplBaseParcelizer.getClassLoader().loadClass(string).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Throwable unused) {
                    this.onPrepare = new addOnPictureInPictureModeChangedListener();
                }
            }
        }
        boolean z2 = onPlayFromMediaId;
        if (z2) {
            if (this.MediaSessionCompatResultReceiverWrapper == null) {
                this.MediaSessionCompatResultReceiverWrapper = new addOnNewIntentListener();
            }
            if (!this.MediaSessionCompatResultReceiverWrapper.AudioAttributesCompatParcelizer(attributeSet)) {
                if (attributeSet instanceof XmlPullParser) {
                    if (((XmlPullParser) attributeSet).getDepth() > 1) {
                    }
                } else {
                    zRemoteActionCompatParcelizer = RemoteActionCompatParcelizer((ViewParent) view);
                }
                z = zRemoteActionCompatParcelizer;
            }
            z = true;
        } else {
            z = zRemoteActionCompatParcelizer;
        }
        return this.onPrepare.RemoteActionCompatParcelizer(view, str, context, attributeSet, z, z2, true, false);
    }

    private boolean RemoteActionCompatParcelizer(ViewParent viewParent) {
        if (viewParent == null) {
            return false;
        }
        View decorView = this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.getDecorView();
        while (viewParent != null) {
            if (viewParent == decorView || !(viewParent instanceof View) || InvalidTypeIdException.onPlayFromSearch((View) viewParent)) {
                return false;
            }
            viewParent = viewParent.getParent();
        }
        return true;
    }

    @Override // kotlin.ensureViewModelStore
    public void AudioAttributesImplApi21Parcelizer() {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.AudioAttributesImplBaseParcelizer);
        if (layoutInflaterFrom.getFactory() == null) {
            UntypedObjectDeserializer.read(layoutInflaterFrom, this);
        } else {
            layoutInflaterFrom.getFactory2();
        }
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return RemoteActionCompatParcelizer(view, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    private addObserverForBackInvoker onSeekTo() {
        for (Context baseContext = this.AudioAttributesImplBaseParcelizer; baseContext != null; baseContext = ((ContextWrapper) baseContext).getBaseContext()) {
            if (baseContext instanceof addObserverForBackInvoker) {
                return (addObserverForBackInvoker) baseContext;
            }
            if (!(baseContext instanceof ContextWrapper)) {
                return null;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void read(o.getOnBackPressedDispatcherannotations.MediaBrowserCompatSearchResultReceiver r12, android.view.KeyEvent r13) {
        /*
            Method dump skipped, instruction units count: 244
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getOnBackPressedDispatcherannotations.read(o.getOnBackPressedDispatcherannotations$MediaBrowserCompatSearchResultReceiver, android.view.KeyEvent):void");
    }

    private boolean IconCompatParcelizer(MediaBrowserCompatSearchResultReceiver mediaBrowserCompatSearchResultReceiver) {
        mediaBrowserCompatSearchResultReceiver.RemoteActionCompatParcelizer(onCustomAction());
        mediaBrowserCompatSearchResultReceiver.AudioAttributesCompatParcelizer = new MediaDescriptionCompat(mediaBrowserCompatSearchResultReceiver.MediaBrowserCompatMediaItem);
        mediaBrowserCompatSearchResultReceiver.AudioAttributesImplBaseParcelizer = 81;
        return true;
    }

    private void write(boolean z) {
        removeCancellable removecancellable = this.onSetPlaybackSpeed;
        if (removecancellable != null && removecancellable.write() && (!ViewConfiguration.get(this.AudioAttributesImplBaseParcelizer).hasPermanentMenuKey() || this.onSetPlaybackSpeed.MediaBrowserCompatItemReceiver())) {
            Window.Callback callbackOnCommand = onCommand();
            if (!this.onSetPlaybackSpeed.AudioAttributesImplApi21Parcelizer() || !z) {
                if (callbackOnCommand == null || this.AudioAttributesImplApi21Parcelizer) {
                    return;
                }
                if (this.MediaBrowserCompatMediaItem && (this.MediaBrowserCompatSearchResultReceiver & 1) != 0) {
                    this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.getDecorView().removeCallbacks(this.onSkipToNext);
                    this.onSkipToNext.run();
                }
                MediaBrowserCompatSearchResultReceiver mediaBrowserCompatSearchResultReceiver = read(0, true);
                if (mediaBrowserCompatSearchResultReceiver.RatingCompat == null || mediaBrowserCompatSearchResultReceiver.MediaDescriptionCompat || !callbackOnCommand.onPreparePanel(0, mediaBrowserCompatSearchResultReceiver.write, mediaBrowserCompatSearchResultReceiver.RatingCompat)) {
                    return;
                }
                callbackOnCommand.onMenuOpened(108, mediaBrowserCompatSearchResultReceiver.RatingCompat);
                this.onSetPlaybackSpeed.AudioAttributesImplBaseParcelizer();
                return;
            }
            this.onSetPlaybackSpeed.RemoteActionCompatParcelizer();
            if (this.AudioAttributesImplApi21Parcelizer) {
                return;
            }
            callbackOnCommand.onPanelClosed(108, read(0, true).RatingCompat);
            return;
        }
        MediaBrowserCompatSearchResultReceiver mediaBrowserCompatSearchResultReceiver2 = read(0, true);
        mediaBrowserCompatSearchResultReceiver2.MediaMetadataCompat = true;
        RemoteActionCompatParcelizer(mediaBrowserCompatSearchResultReceiver2, false);
        read(mediaBrowserCompatSearchResultReceiver2, (KeyEvent) null);
    }

    private boolean RemoteActionCompatParcelizer(MediaBrowserCompatSearchResultReceiver mediaBrowserCompatSearchResultReceiver) {
        Resources.Theme themeNewTheme;
        Context context = this.AudioAttributesImplBaseParcelizer;
        if ((mediaBrowserCompatSearchResultReceiver.read == 0 || mediaBrowserCompatSearchResultReceiver.read == 108) && this.onSetPlaybackSpeed != null) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme theme = context.getTheme();
            theme.resolveAttribute(_init_lambda5.read.actionBarTheme, typedValue, true);
            if (typedValue.resourceId != 0) {
                themeNewTheme = context.getResources().newTheme();
                themeNewTheme.setTo(theme);
                themeNewTheme.applyStyle(typedValue.resourceId, true);
                themeNewTheme.resolveAttribute(_init_lambda5.read.actionBarWidgetTheme, typedValue, true);
            } else {
                theme.resolveAttribute(_init_lambda5.read.actionBarWidgetTheme, typedValue, true);
                themeNewTheme = null;
            }
            if (typedValue.resourceId != 0) {
                if (themeNewTheme == null) {
                    themeNewTheme = context.getResources().newTheme();
                    themeNewTheme.setTo(theme);
                }
                themeNewTheme.applyStyle(typedValue.resourceId, true);
            }
            if (themeNewTheme != null) {
                initializeViewTreeOwners initializeviewtreeowners = new initializeViewTreeOwners(context, 0);
                initializeviewtreeowners.getTheme().setTo(themeNewTheme);
                context = initializeviewtreeowners;
            }
        }
        onRequestPermissionsResult onrequestpermissionsresult = new onRequestPermissionsResult(context);
        onrequestpermissionsresult.IconCompatParcelizer(this);
        mediaBrowserCompatSearchResultReceiver.read(onrequestpermissionsresult);
        return true;
    }

    private boolean write(MediaBrowserCompatSearchResultReceiver mediaBrowserCompatSearchResultReceiver) {
        if (mediaBrowserCompatSearchResultReceiver.write != null) {
            mediaBrowserCompatSearchResultReceiver.handleMediaPlayPauseIfPendingOnHandler = mediaBrowserCompatSearchResultReceiver.write;
            return true;
        }
        if (mediaBrowserCompatSearchResultReceiver.RatingCompat == null) {
            return false;
        }
        if (this.MediaSessionCompatQueueItem == null) {
            this.MediaSessionCompatQueueItem = new onAddQueueItem();
        }
        mediaBrowserCompatSearchResultReceiver.handleMediaPlayPauseIfPendingOnHandler = (View) mediaBrowserCompatSearchResultReceiver.RemoteActionCompatParcelizer(this.MediaSessionCompatQueueItem);
        return mediaBrowserCompatSearchResultReceiver.handleMediaPlayPauseIfPendingOnHandler != null;
    }

    private boolean IconCompatParcelizer(MediaBrowserCompatSearchResultReceiver mediaBrowserCompatSearchResultReceiver, KeyEvent keyEvent) {
        removeCancellable removecancellable;
        removeCancellable removecancellable2;
        removeCancellable removecancellable3;
        if (this.AudioAttributesImplApi21Parcelizer) {
            return false;
        }
        if (mediaBrowserCompatSearchResultReceiver.AudioAttributesImplApi21Parcelizer) {
            return true;
        }
        MediaBrowserCompatSearchResultReceiver mediaBrowserCompatSearchResultReceiver2 = this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
        if (mediaBrowserCompatSearchResultReceiver2 != null && mediaBrowserCompatSearchResultReceiver2 != mediaBrowserCompatSearchResultReceiver) {
            RemoteActionCompatParcelizer(mediaBrowserCompatSearchResultReceiver2, false);
        }
        Window.Callback callbackOnCommand = onCommand();
        if (callbackOnCommand != null) {
            mediaBrowserCompatSearchResultReceiver.write = callbackOnCommand.onCreatePanelView(mediaBrowserCompatSearchResultReceiver.read);
        }
        boolean z = mediaBrowserCompatSearchResultReceiver.read == 0 || mediaBrowserCompatSearchResultReceiver.read == 108;
        if (z && (removecancellable3 = this.onSetPlaybackSpeed) != null) {
            removecancellable3.setMenuPrepared();
        }
        if (mediaBrowserCompatSearchResultReceiver.write == null && (!z || !(onPlay() instanceof getDefaultViewModelProviderFactory))) {
            if (mediaBrowserCompatSearchResultReceiver.RatingCompat == null || mediaBrowserCompatSearchResultReceiver.MediaDescriptionCompat) {
                if (mediaBrowserCompatSearchResultReceiver.RatingCompat == null && (!RemoteActionCompatParcelizer(mediaBrowserCompatSearchResultReceiver) || mediaBrowserCompatSearchResultReceiver.RatingCompat == null)) {
                    return false;
                }
                if (z && this.onSetPlaybackSpeed != null) {
                    if (this.onPlayFromSearch == null) {
                        this.onPlayFromSearch = new write();
                    }
                    this.onSetPlaybackSpeed.setMenu(mediaBrowserCompatSearchResultReceiver.RatingCompat, this.onPlayFromSearch);
                }
                mediaBrowserCompatSearchResultReceiver.RatingCompat.onFastForward();
                if (!callbackOnCommand.onCreatePanelMenu(mediaBrowserCompatSearchResultReceiver.read, mediaBrowserCompatSearchResultReceiver.RatingCompat)) {
                    mediaBrowserCompatSearchResultReceiver.read(null);
                    if (z && (removecancellable = this.onSetPlaybackSpeed) != null) {
                        removecancellable.setMenu(null, this.onPlayFromSearch);
                    }
                    return false;
                }
                mediaBrowserCompatSearchResultReceiver.MediaDescriptionCompat = false;
            }
            mediaBrowserCompatSearchResultReceiver.RatingCompat.onFastForward();
            if (mediaBrowserCompatSearchResultReceiver.RemoteActionCompatParcelizer != null) {
                mediaBrowserCompatSearchResultReceiver.RatingCompat.RemoteActionCompatParcelizer(mediaBrowserCompatSearchResultReceiver.RemoteActionCompatParcelizer);
                mediaBrowserCompatSearchResultReceiver.RemoteActionCompatParcelizer = null;
            }
            if (!callbackOnCommand.onPreparePanel(0, mediaBrowserCompatSearchResultReceiver.write, mediaBrowserCompatSearchResultReceiver.RatingCompat)) {
                if (z && (removecancellable2 = this.onSetPlaybackSpeed) != null) {
                    removecancellable2.setMenu(null, this.onPlayFromSearch);
                }
                mediaBrowserCompatSearchResultReceiver.RatingCompat.onCustomAction();
                return false;
            }
            mediaBrowserCompatSearchResultReceiver.MediaBrowserCompatSearchResultReceiver = KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1;
            mediaBrowserCompatSearchResultReceiver.RatingCompat.setQwertyMode(mediaBrowserCompatSearchResultReceiver.MediaBrowserCompatSearchResultReceiver);
            mediaBrowserCompatSearchResultReceiver.RatingCompat.onCustomAction();
        }
        mediaBrowserCompatSearchResultReceiver.AudioAttributesImplApi21Parcelizer = true;
        mediaBrowserCompatSearchResultReceiver.MediaBrowserCompatItemReceiver = false;
        this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = mediaBrowserCompatSearchResultReceiver;
        return true;
    }

    void write(onRequestPermissionsResult onrequestpermissionsresult) {
        if (this.onSetRepeatMode) {
            return;
        }
        this.onSetRepeatMode = true;
        this.onSetPlaybackSpeed.IconCompatParcelizer();
        Window.Callback callbackOnCommand = onCommand();
        if (callbackOnCommand != null && !this.AudioAttributesImplApi21Parcelizer) {
            callbackOnCommand.onPanelClosed(108, onrequestpermissionsresult);
        }
        this.onSetRepeatMode = false;
    }

    void AudioAttributesImplApi26Parcelizer(int i) {
        RemoteActionCompatParcelizer(read(i, true), true);
    }

    void RemoteActionCompatParcelizer(MediaBrowserCompatSearchResultReceiver mediaBrowserCompatSearchResultReceiver, boolean z) {
        removeCancellable removecancellable;
        if (z && mediaBrowserCompatSearchResultReceiver.read == 0 && (removecancellable = this.onSetPlaybackSpeed) != null && removecancellable.AudioAttributesImplApi21Parcelizer()) {
            write(mediaBrowserCompatSearchResultReceiver.RatingCompat);
            return;
        }
        WindowManager windowManager = (WindowManager) this.AudioAttributesImplBaseParcelizer.getSystemService("window");
        if (windowManager != null && mediaBrowserCompatSearchResultReceiver.MediaBrowserCompatCustomActionResultReceiver && mediaBrowserCompatSearchResultReceiver.AudioAttributesCompatParcelizer != null) {
            windowManager.removeView(mediaBrowserCompatSearchResultReceiver.AudioAttributesCompatParcelizer);
            if (z) {
                AudioAttributesCompatParcelizer(mediaBrowserCompatSearchResultReceiver.read, mediaBrowserCompatSearchResultReceiver, null);
            }
        }
        mediaBrowserCompatSearchResultReceiver.AudioAttributesImplApi21Parcelizer = false;
        mediaBrowserCompatSearchResultReceiver.MediaBrowserCompatItemReceiver = false;
        mediaBrowserCompatSearchResultReceiver.MediaBrowserCompatCustomActionResultReceiver = false;
        mediaBrowserCompatSearchResultReceiver.handleMediaPlayPauseIfPendingOnHandler = null;
        mediaBrowserCompatSearchResultReceiver.MediaMetadataCompat = true;
        if (this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM == mediaBrowserCompatSearchResultReceiver) {
            this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = null;
        }
        if (mediaBrowserCompatSearchResultReceiver.read == 0) {
            onPlayFromSearch();
        }
    }

    private boolean AudioAttributesCompatParcelizer(int i, KeyEvent keyEvent) {
        if (keyEvent.getRepeatCount() != 0) {
            return false;
        }
        MediaBrowserCompatSearchResultReceiver mediaBrowserCompatSearchResultReceiver = read(i, true);
        if (mediaBrowserCompatSearchResultReceiver.MediaBrowserCompatCustomActionResultReceiver) {
            return false;
        }
        return IconCompatParcelizer(mediaBrowserCompatSearchResultReceiver, keyEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean IconCompatParcelizer(int r4, android.view.KeyEvent r5) {
        /*
            r3 = this;
            o.onActivityResult r0 = r3.read
            r1 = 0
            if (r0 == 0) goto L6
            return r1
        L6:
            r0 = 1
            o.getOnBackPressedDispatcherannotations$MediaBrowserCompatSearchResultReceiver r2 = r3.read(r4, r0)
            if (r4 != 0) goto L43
            o.removeCancellable r4 = r3.onSetPlaybackSpeed
            if (r4 == 0) goto L43
            boolean r4 = r4.write()
            if (r4 == 0) goto L43
            android.content.Context r4 = r3.AudioAttributesImplBaseParcelizer
            android.view.ViewConfiguration r4 = android.view.ViewConfiguration.get(r4)
            boolean r4 = r4.hasPermanentMenuKey()
            if (r4 != 0) goto L43
            o.removeCancellable r4 = r3.onSetPlaybackSpeed
            boolean r4 = r4.AudioAttributesImplApi21Parcelizer()
            if (r4 != 0) goto L3c
            boolean r4 = r3.AudioAttributesImplApi21Parcelizer
            if (r4 != 0) goto L5f
            boolean r4 = r3.IconCompatParcelizer(r2, r5)
            if (r4 == 0) goto L5f
            o.removeCancellable r4 = r3.onSetPlaybackSpeed
            boolean r0 = r4.AudioAttributesImplBaseParcelizer()
            goto L67
        L3c:
            o.removeCancellable r4 = r3.onSetPlaybackSpeed
            boolean r0 = r4.RemoteActionCompatParcelizer()
            goto L67
        L43:
            boolean r4 = r2.MediaBrowserCompatCustomActionResultReceiver
            if (r4 != 0) goto L61
            boolean r4 = r2.MediaBrowserCompatItemReceiver
            if (r4 != 0) goto L61
            boolean r4 = r2.AudioAttributesImplApi21Parcelizer
            if (r4 == 0) goto L5f
            boolean r4 = r2.MediaDescriptionCompat
            if (r4 == 0) goto L5b
            r2.AudioAttributesImplApi21Parcelizer = r1
            boolean r4 = r3.IconCompatParcelizer(r2, r5)
            if (r4 == 0) goto L5f
        L5b:
            r3.read(r2, r5)
            goto L67
        L5f:
            r0 = r1
            goto L67
        L61:
            boolean r4 = r2.MediaBrowserCompatCustomActionResultReceiver
            r3.RemoteActionCompatParcelizer(r2, r0)
            r0 = r4
        L67:
            if (r0 == 0) goto L7c
            android.content.Context r3 = r3.AudioAttributesImplBaseParcelizer
            android.content.Context r3 = r3.getApplicationContext()
            java.lang.String r4 = "audio"
            java.lang.Object r3 = r3.getSystemService(r4)
            android.media.AudioManager r3 = (android.media.AudioManager) r3
            if (r3 == 0) goto L7c
            r3.playSoundEffect(r1)
        L7c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getOnBackPressedDispatcherannotations.IconCompatParcelizer(int, android.view.KeyEvent):boolean");
    }

    void AudioAttributesCompatParcelizer(int i, MediaBrowserCompatSearchResultReceiver mediaBrowserCompatSearchResultReceiver, Menu menu) {
        if (menu == null) {
            if (mediaBrowserCompatSearchResultReceiver == null && i >= 0) {
                MediaBrowserCompatSearchResultReceiver[] mediaBrowserCompatSearchResultReceiverArr = this.ParcelableVolumeInfo;
                if (i < mediaBrowserCompatSearchResultReceiverArr.length) {
                    mediaBrowserCompatSearchResultReceiver = mediaBrowserCompatSearchResultReceiverArr[i];
                }
            }
            if (mediaBrowserCompatSearchResultReceiver != null) {
                menu = mediaBrowserCompatSearchResultReceiver.RatingCompat;
            }
        }
        if ((mediaBrowserCompatSearchResultReceiver == null || mediaBrowserCompatSearchResultReceiver.MediaBrowserCompatCustomActionResultReceiver) && !this.AudioAttributesImplApi21Parcelizer) {
            this.onPrepareFromUri.RemoteActionCompatParcelizer(this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.getCallback(), i, menu);
        }
    }

    MediaBrowserCompatSearchResultReceiver AudioAttributesCompatParcelizer(Menu menu) {
        MediaBrowserCompatSearchResultReceiver[] mediaBrowserCompatSearchResultReceiverArr = this.ParcelableVolumeInfo;
        int length = mediaBrowserCompatSearchResultReceiverArr != null ? mediaBrowserCompatSearchResultReceiverArr.length : 0;
        for (int i = 0; i < length; i++) {
            MediaBrowserCompatSearchResultReceiver mediaBrowserCompatSearchResultReceiver = mediaBrowserCompatSearchResultReceiverArr[i];
            if (mediaBrowserCompatSearchResultReceiver != null && mediaBrowserCompatSearchResultReceiver.RatingCompat == menu) {
                return mediaBrowserCompatSearchResultReceiver;
            }
        }
        return null;
    }

    protected MediaBrowserCompatSearchResultReceiver read(int i, boolean z) {
        MediaBrowserCompatSearchResultReceiver[] mediaBrowserCompatSearchResultReceiverArr = this.ParcelableVolumeInfo;
        if (mediaBrowserCompatSearchResultReceiverArr == null || mediaBrowserCompatSearchResultReceiverArr.length <= i) {
            MediaBrowserCompatSearchResultReceiver[] mediaBrowserCompatSearchResultReceiverArr2 = new MediaBrowserCompatSearchResultReceiver[i + 1];
            if (mediaBrowserCompatSearchResultReceiverArr != null) {
                System.arraycopy(mediaBrowserCompatSearchResultReceiverArr, 0, mediaBrowserCompatSearchResultReceiverArr2, 0, mediaBrowserCompatSearchResultReceiverArr.length);
            }
            this.ParcelableVolumeInfo = mediaBrowserCompatSearchResultReceiverArr2;
            mediaBrowserCompatSearchResultReceiverArr = mediaBrowserCompatSearchResultReceiverArr2;
        }
        MediaBrowserCompatSearchResultReceiver mediaBrowserCompatSearchResultReceiver = mediaBrowserCompatSearchResultReceiverArr[i];
        if (mediaBrowserCompatSearchResultReceiver != null) {
            return mediaBrowserCompatSearchResultReceiver;
        }
        MediaBrowserCompatSearchResultReceiver mediaBrowserCompatSearchResultReceiver2 = new MediaBrowserCompatSearchResultReceiver(i);
        mediaBrowserCompatSearchResultReceiverArr[i] = mediaBrowserCompatSearchResultReceiver2;
        return mediaBrowserCompatSearchResultReceiver2;
    }

    private boolean AudioAttributesCompatParcelizer(MediaBrowserCompatSearchResultReceiver mediaBrowserCompatSearchResultReceiver, int i, KeyEvent keyEvent, int i2) {
        boolean zPerformShortcut = false;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((mediaBrowserCompatSearchResultReceiver.AudioAttributesImplApi21Parcelizer || IconCompatParcelizer(mediaBrowserCompatSearchResultReceiver, keyEvent)) && mediaBrowserCompatSearchResultReceiver.RatingCompat != null) {
            zPerformShortcut = mediaBrowserCompatSearchResultReceiver.RatingCompat.performShortcut(i, keyEvent, i2);
        }
        if (zPerformShortcut && (i2 & 1) == 0 && this.onSetPlaybackSpeed == null) {
            RemoteActionCompatParcelizer(mediaBrowserCompatSearchResultReceiver, true);
        }
        return zPerformShortcut;
    }

    private void AudioAttributesImplApi21Parcelizer(int i) {
        this.MediaBrowserCompatSearchResultReceiver = (1 << i) | this.MediaBrowserCompatSearchResultReceiver;
        if (this.MediaBrowserCompatMediaItem) {
            return;
        }
        InvalidTypeIdException.AudioAttributesCompatParcelizer(this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.getDecorView(), this.onSkipToNext);
        this.MediaBrowserCompatMediaItem = true;
    }

    void MediaBrowserCompatCustomActionResultReceiver(int i) {
        MediaBrowserCompatSearchResultReceiver mediaBrowserCompatSearchResultReceiver;
        MediaBrowserCompatSearchResultReceiver mediaBrowserCompatSearchResultReceiver2 = read(i, true);
        if (mediaBrowserCompatSearchResultReceiver2.RatingCompat != null) {
            Bundle bundle = new Bundle();
            mediaBrowserCompatSearchResultReceiver2.RatingCompat.IconCompatParcelizer(bundle);
            if (bundle.size() > 0) {
                mediaBrowserCompatSearchResultReceiver2.RemoteActionCompatParcelizer = bundle;
            }
            mediaBrowserCompatSearchResultReceiver2.RatingCompat.onFastForward();
            mediaBrowserCompatSearchResultReceiver2.RatingCompat.clear();
        }
        mediaBrowserCompatSearchResultReceiver2.MediaDescriptionCompat = true;
        mediaBrowserCompatSearchResultReceiver2.MediaMetadataCompat = true;
        if ((i != 108 && i != 0) || this.onSetPlaybackSpeed == null || (mediaBrowserCompatSearchResultReceiver = read(0, false)) == null) {
            return;
        }
        mediaBrowserCompatSearchResultReceiver.AudioAttributesImplApi21Parcelizer = false;
        IconCompatParcelizer(mediaBrowserCompatSearchResultReceiver, (KeyEvent) null);
    }

    final int AudioAttributesCompatParcelizer(WindowInsetsCompat windowInsetsCompat, Rect rect) {
        int iMediaBrowserCompatCustomActionResultReceiver;
        boolean z;
        boolean z2;
        if (windowInsetsCompat != null) {
            iMediaBrowserCompatCustomActionResultReceiver = windowInsetsCompat.MediaBrowserCompatCustomActionResultReceiver();
        } else {
            iMediaBrowserCompatCustomActionResultReceiver = rect != null ? rect.top : 0;
        }
        ActionBarContextView actionBarContextView = this.AudioAttributesCompatParcelizer;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.AudioAttributesCompatParcelizer.getLayoutParams();
            if (this.AudioAttributesCompatParcelizer.isShown()) {
                if (this.r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw == null) {
                    this.r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw = new Rect();
                    this.PlaybackStateCompatCustomAction = new Rect();
                }
                Rect rect2 = this.r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw;
                Rect rect3 = this.PlaybackStateCompatCustomAction;
                if (windowInsetsCompat == null) {
                    rect2.set(rect);
                } else {
                    rect2.set(windowInsetsCompat.AudioAttributesImplApi21Parcelizer(), windowInsetsCompat.MediaBrowserCompatCustomActionResultReceiver(), windowInsetsCompat.MediaBrowserCompatItemReceiver(), windowInsetsCompat.AudioAttributesImplBaseParcelizer());
                }
                setChecked.read(this.onCustomAction, rect2, rect3);
                int i = rect2.top;
                int i2 = rect2.left;
                int i3 = rect2.right;
                WindowInsetsCompat windowInsetsCompatHandleMediaPlayPauseIfPendingOnHandler = InvalidTypeIdException.handleMediaPlayPauseIfPendingOnHandler(this.onCustomAction);
                int iAudioAttributesImplApi21Parcelizer = windowInsetsCompatHandleMediaPlayPauseIfPendingOnHandler == null ? 0 : windowInsetsCompatHandleMediaPlayPauseIfPendingOnHandler.AudioAttributesImplApi21Parcelizer();
                int iMediaBrowserCompatItemReceiver = windowInsetsCompatHandleMediaPlayPauseIfPendingOnHandler == null ? 0 : windowInsetsCompatHandleMediaPlayPauseIfPendingOnHandler.MediaBrowserCompatItemReceiver();
                if (marginLayoutParams.topMargin == i && marginLayoutParams.leftMargin == i2 && marginLayoutParams.rightMargin == i3) {
                    z2 = false;
                } else {
                    marginLayoutParams.topMargin = i;
                    marginLayoutParams.leftMargin = i2;
                    marginLayoutParams.rightMargin = i3;
                    z2 = true;
                }
                if (i > 0 && this.ResultReceiver == null) {
                    View view = new View(this.AudioAttributesImplBaseParcelizer);
                    this.ResultReceiver = view;
                    view.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = iAudioAttributesImplApi21Parcelizer;
                    ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = iMediaBrowserCompatItemReceiver;
                    this.onCustomAction.addView(this.ResultReceiver, -1, layoutParams);
                } else {
                    View view2 = this.ResultReceiver;
                    if (view2 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                        if (((ViewGroup.LayoutParams) marginLayoutParams2).height != marginLayoutParams.topMargin || marginLayoutParams2.leftMargin != iAudioAttributesImplApi21Parcelizer || marginLayoutParams2.rightMargin != iMediaBrowserCompatItemReceiver) {
                            ((ViewGroup.LayoutParams) marginLayoutParams2).height = marginLayoutParams.topMargin;
                            marginLayoutParams2.leftMargin = iAudioAttributesImplApi21Parcelizer;
                            marginLayoutParams2.rightMargin = iMediaBrowserCompatItemReceiver;
                            this.ResultReceiver.setLayoutParams(marginLayoutParams2);
                        }
                    }
                }
                View view3 = this.ResultReceiver;
                z = view3 != null;
                if (z && view3.getVisibility() != 0) {
                    write(this.ResultReceiver);
                }
                if (!this.onCommand && z) {
                    iMediaBrowserCompatCustomActionResultReceiver = 0;
                }
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z2 = true;
                z = false;
            } else {
                z2 = false;
                z = false;
            }
            if (z2) {
                this.AudioAttributesCompatParcelizer.setLayoutParams(marginLayoutParams);
            }
        }
        View view4 = this.ResultReceiver;
        if (view4 != null) {
            view4.setVisibility(z ? 0 : 8);
        }
        return iMediaBrowserCompatCustomActionResultReceiver;
    }

    private void write(View view) {
        int color;
        if ((InvalidTypeIdException.onPause(view) & 8192) != 0) {
            color = _isNaN.getColor(this.AudioAttributesImplBaseParcelizer, _init_lambda5.write.abc_decor_view_status_guard_light);
        } else {
            color = _isNaN.getColor(this.AudioAttributesImplBaseParcelizer, _init_lambda5.write.abc_decor_view_status_guard);
        }
        view.setBackgroundColor(color);
    }

    private void onPrepareFromUri() {
        if (this.r8lambdaKUbBm7ckfqTc9QCgukC86fguu4) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    void handleMediaPlayPauseIfPendingOnHandler() {
        removeCancellable removecancellable = this.onSetPlaybackSpeed;
        if (removecancellable != null) {
            removecancellable.IconCompatParcelizer();
        }
        if (this.IconCompatParcelizer != null) {
            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.getDecorView().removeCallbacks(this.onAddQueueItem);
            if (this.IconCompatParcelizer.isShowing()) {
                try {
                    this.IconCompatParcelizer.dismiss();
                } catch (IllegalArgumentException unused) {
                }
            }
            this.IconCompatParcelizer = null;
        }
        onAddQueueItem();
        MediaBrowserCompatSearchResultReceiver mediaBrowserCompatSearchResultReceiver = read(0, false);
        if (mediaBrowserCompatSearchResultReceiver == null || mediaBrowserCompatSearchResultReceiver.RatingCompat == null) {
            return;
        }
        mediaBrowserCompatSearchResultReceiver.RatingCompat.close();
    }

    @Override // kotlin.ensureViewModelStore
    public Context AudioAttributesImplApi26Parcelizer() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    @Override // kotlin.ensureViewModelStore
    public boolean read() {
        return AudioAttributesCompatParcelizer(true);
    }

    private boolean AudioAttributesCompatParcelizer(boolean z) {
        return AudioAttributesCompatParcelizer(z, true);
    }

    private boolean AudioAttributesCompatParcelizer(boolean z, boolean z2) {
        if (this.AudioAttributesImplApi21Parcelizer) {
            return false;
        }
        int iOnPrepare = onPrepare();
        int iWrite = write(this.AudioAttributesImplBaseParcelizer, iOnPrepare);
        StdKeyDeserializerStringCtorKeyDeserializer stdKeyDeserializerStringCtorKeyDeserializerAudioAttributesImplApi21Parcelizer = Build.VERSION.SDK_INT < 33 ? AudioAttributesImplApi21Parcelizer(this.AudioAttributesImplBaseParcelizer) : null;
        if (!z2 && stdKeyDeserializerStringCtorKeyDeserializerAudioAttributesImplApi21Parcelizer != null) {
            stdKeyDeserializerStringCtorKeyDeserializerAudioAttributesImplApi21Parcelizer = write(this.AudioAttributesImplBaseParcelizer.getResources().getConfiguration());
        }
        boolean zIconCompatParcelizer = IconCompatParcelizer(iWrite, stdKeyDeserializerStringCtorKeyDeserializerAudioAttributesImplApi21Parcelizer, z);
        if (iOnPrepare == 0) {
            AudioAttributesImplBaseParcelizer(this.AudioAttributesImplBaseParcelizer).write();
        } else {
            MediaMetadataCompat mediaMetadataCompat = this.onRewind;
            if (mediaMetadataCompat != null) {
                mediaMetadataCompat.read();
            }
        }
        if (iOnPrepare == 3) {
            AudioAttributesImplApi26Parcelizer(this.AudioAttributesImplBaseParcelizer).write();
            return zIconCompatParcelizer;
        }
        MediaMetadataCompat mediaMetadataCompat2 = this.onSeekTo;
        if (mediaMetadataCompat2 != null) {
            mediaMetadataCompat2.read();
        }
        return zIconCompatParcelizer;
    }

    StdKeyDeserializerStringCtorKeyDeserializer AudioAttributesImplApi21Parcelizer(Context context) {
        StdKeyDeserializerStringCtorKeyDeserializer stdKeyDeserializerStringCtorKeyDeserializerIconCompatParcelizer;
        if (Build.VERSION.SDK_INT >= 33 || (stdKeyDeserializerStringCtorKeyDeserializerIconCompatParcelizer = IconCompatParcelizer()) == null) {
            return null;
        }
        StdKeyDeserializerStringCtorKeyDeserializer stdKeyDeserializerStringCtorKeyDeserializerWrite = write(context.getApplicationContext().getResources().getConfiguration());
        StdKeyDeserializerStringCtorKeyDeserializer stdKeyDeserializerStringCtorKeyDeserializerWrite2 = addOnMultiWindowModeChangedListener.write(stdKeyDeserializerStringCtorKeyDeserializerIconCompatParcelizer, stdKeyDeserializerStringCtorKeyDeserializerWrite);
        return stdKeyDeserializerStringCtorKeyDeserializerWrite2.IconCompatParcelizer() ? stdKeyDeserializerStringCtorKeyDeserializerWrite : stdKeyDeserializerStringCtorKeyDeserializerWrite2;
    }

    @Override // kotlin.ensureViewModelStore
    public int AudioAttributesImplBaseParcelizer() {
        return this.PlaybackStateCompat;
    }

    int write(Context context, int i) {
        if (i == -100) {
            return -1;
        }
        if (i != -1) {
            if (i == 0) {
                if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() == 0) {
                    return -1;
                }
                return AudioAttributesImplBaseParcelizer(context).IconCompatParcelizer();
            }
            if (i != 1 && i != 2) {
                if (i == 3) {
                    return AudioAttributesImplApi26Parcelizer(context).IconCompatParcelizer();
                }
                throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
            }
        }
        return i;
    }

    private int onPrepare() {
        int i = this.PlaybackStateCompat;
        return i != -100 ? i : write();
    }

    void AudioAttributesCompatParcelizer(Configuration configuration, StdKeyDeserializerStringCtorKeyDeserializer stdKeyDeserializerStringCtorKeyDeserializer) {
        AudioAttributesImplApi21Parcelizer.AudioAttributesCompatParcelizer(configuration, stdKeyDeserializerStringCtorKeyDeserializer);
    }

    StdKeyDeserializerStringCtorKeyDeserializer write(Configuration configuration) {
        return AudioAttributesImplApi21Parcelizer.RemoteActionCompatParcelizer(configuration);
    }

    void RemoteActionCompatParcelizer(StdKeyDeserializerStringCtorKeyDeserializer stdKeyDeserializerStringCtorKeyDeserializer) {
        AudioAttributesImplApi21Parcelizer.read(stdKeyDeserializerStringCtorKeyDeserializer);
    }

    private Configuration write(Context context, int i, StdKeyDeserializerStringCtorKeyDeserializer stdKeyDeserializerStringCtorKeyDeserializer, Configuration configuration, boolean z) {
        int i2;
        if (i == 1) {
            i2 = 16;
        } else if (i != 2) {
            i2 = z ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48;
        } else {
            i2 = 32;
        }
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = BitmapDescriptorFactory.HUE_RED;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i2 | (configuration2.uiMode & (-49));
        if (stdKeyDeserializerStringCtorKeyDeserializer != null) {
            AudioAttributesCompatParcelizer(configuration2, stdKeyDeserializerStringCtorKeyDeserializer);
        }
        return configuration2;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean IconCompatParcelizer(int r9, kotlin.StdKeyDeserializerStringCtorKeyDeserializer r10, boolean r11) {
        /*
            r8 = this;
            android.content.Context r1 = r8.AudioAttributesImplBaseParcelizer
            r4 = 0
            r5 = 0
            r0 = r8
            r2 = r9
            r3 = r10
            android.content.res.Configuration r0 = r0.write(r1, r2, r3, r4, r5)
            android.content.Context r1 = r8.AudioAttributesImplBaseParcelizer
            int r1 = r8.MediaBrowserCompatItemReceiver(r1)
            android.content.res.Configuration r2 = r8.onSetRating
            if (r2 != 0) goto L1f
            android.content.Context r2 = r8.AudioAttributesImplBaseParcelizer
            android.content.res.Resources r2 = r2.getResources()
            android.content.res.Configuration r2 = r2.getConfiguration()
        L1f:
            int r3 = r2.uiMode
            int r4 = r0.uiMode
            r4 = r4 & 48
            o.StdKeyDeserializerStringCtorKeyDeserializer r2 = r8.write(r2)
            r5 = 0
            if (r10 != 0) goto L2e
            r0 = r5
            goto L32
        L2e:
            o.StdKeyDeserializerStringCtorKeyDeserializer r0 = r8.write(r0)
        L32:
            r3 = r3 & 48
            r6 = 0
            if (r3 == r4) goto L3a
            r3 = 512(0x200, float:7.17E-43)
            goto L3b
        L3a:
            r3 = r6
        L3b:
            if (r0 == 0) goto L45
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L45
            r3 = r3 | 8196(0x2004, float:1.1485E-41)
        L45:
            int r2 = ~r1
            r2 = r2 & r3
            r7 = 1
            if (r2 == 0) goto L6f
            if (r11 == 0) goto L6f
            boolean r11 = r8.onRemoveQueueItem
            if (r11 == 0) goto L6f
            boolean r11 = kotlin.getOnBackPressedDispatcherannotations.onPause
            if (r11 != 0) goto L58
            boolean r11 = r8.onSetShuffleMode
            if (r11 == 0) goto L6f
        L58:
            java.lang.Object r11 = r8.RatingCompat
            boolean r2 = r11 instanceof android.app.Activity
            if (r2 == 0) goto L6f
            android.app.Activity r11 = (android.app.Activity) r11
            boolean r11 = r11.isChild()
            if (r11 != 0) goto L6f
            java.lang.Object r11 = r8.RatingCompat
            android.app.Activity r11 = (android.app.Activity) r11
            kotlin._checkBooleanToStringCoercion.IconCompatParcelizer(r11)
            r11 = r7
            goto L70
        L6f:
            r11 = r6
        L70:
            if (r11 != 0) goto L7d
            if (r3 == 0) goto L7d
            r11 = r1 & r3
            if (r11 != r3) goto L79
            r6 = r7
        L79:
            r8.IconCompatParcelizer(r4, r0, r6, r5)
            goto L7e
        L7d:
            r7 = r11
        L7e:
            if (r7 == 0) goto L9a
            java.lang.Object r11 = r8.RatingCompat
            boolean r1 = r11 instanceof kotlin.addObserverForBackInvoker
            if (r1 == 0) goto L9a
            r1 = r3 & 512(0x200, float:7.17E-43)
            if (r1 == 0) goto L8f
            o.addObserverForBackInvoker r11 = (kotlin.addObserverForBackInvoker) r11
            r11.RemoteActionCompatParcelizer(r9)
        L8f:
            r9 = r3 & 4
            if (r9 == 0) goto L9a
            java.lang.Object r9 = r8.RatingCompat
            o.addObserverForBackInvoker r9 = (kotlin.addObserverForBackInvoker) r9
            r9.read(r10)
        L9a:
            if (r7 == 0) goto Laf
            if (r0 == 0) goto Laf
            android.content.Context r9 = r8.AudioAttributesImplBaseParcelizer
            android.content.res.Resources r9 = r9.getResources()
            android.content.res.Configuration r9 = r9.getConfiguration()
            o.StdKeyDeserializerStringCtorKeyDeserializer r9 = r8.write(r9)
            r8.RemoteActionCompatParcelizer(r9)
        Laf:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getOnBackPressedDispatcherannotations.IconCompatParcelizer(int, o.StdKeyDeserializerStringCtorKeyDeserializer, boolean):boolean");
    }

    private void IconCompatParcelizer(int i, StdKeyDeserializerStringCtorKeyDeserializer stdKeyDeserializerStringCtorKeyDeserializer, boolean z, Configuration configuration) {
        Resources resources = this.AudioAttributesImplBaseParcelizer.getResources();
        Configuration configuration2 = new Configuration(resources.getConfiguration());
        if (configuration != null) {
            configuration2.updateFrom(configuration);
        }
        configuration2.uiMode = i | (resources.getConfiguration().uiMode & (-49));
        if (stdKeyDeserializerStringCtorKeyDeserializer != null) {
            AudioAttributesCompatParcelizer(configuration2, stdKeyDeserializerStringCtorKeyDeserializer);
        }
        resources.updateConfiguration(configuration2, null);
        int i2 = this.r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0;
        if (i2 != 0) {
            this.AudioAttributesImplBaseParcelizer.setTheme(i2);
            this.AudioAttributesImplBaseParcelizer.getTheme().applyStyle(this.r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0, true);
        }
        if (z && (this.RatingCompat instanceof Activity)) {
            IconCompatParcelizer(configuration2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void IconCompatParcelizer(Configuration configuration) {
        Activity activity = (Activity) this.RatingCompat;
        if (activity instanceof hasGetter) {
            if (((hasGetter) activity).getLifecycle().getAudioAttributesImplApi26Parcelizer().RemoteActionCompatParcelizer(anyIgnorals.write.read)) {
                activity.onConfigurationChanged(configuration);
            }
        } else {
            if (!this.onSetShuffleMode || this.AudioAttributesImplApi21Parcelizer) {
                return;
            }
            activity.onConfigurationChanged(configuration);
        }
    }

    private MediaMetadataCompat AudioAttributesImplBaseParcelizer(Context context) {
        if (this.onRewind == null) {
            this.onRewind = new MediaBrowserCompatMediaItem(addOnTrimMemoryListener.IconCompatParcelizer(context));
        }
        return this.onRewind;
    }

    private MediaMetadataCompat AudioAttributesImplApi26Parcelizer(Context context) {
        if (this.onSeekTo == null) {
            this.onSeekTo = new MediaBrowserCompatItemReceiver(context);
        }
        return this.onSeekTo;
    }

    private int MediaBrowserCompatItemReceiver(Context context) {
        if (!this.onPrepareFromMediaId && (this.RatingCompat instanceof Activity)) {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                return 0;
            }
            try {
                ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(context, this.RatingCompat.getClass()), 269221888);
                if (activityInfo != null) {
                    this.onPrepareFromSearch = activityInfo.configChanges;
                }
            } catch (PackageManager.NameNotFoundException unused) {
                this.onPrepareFromSearch = 0;
            }
        }
        this.onPrepareFromMediaId = true;
        return this.onPrepareFromSearch;
    }

    class AudioAttributesCompatParcelizer implements onActivityResult.write {
        private onActivityResult.write IconCompatParcelizer;

        public AudioAttributesCompatParcelizer(onActivityResult.write writeVar) {
            this.IconCompatParcelizer = writeVar;
        }

        @Override // o.onActivityResult.write
        public boolean AudioAttributesCompatParcelizer(onActivityResult onactivityresult, Menu menu) {
            return this.IconCompatParcelizer.AudioAttributesCompatParcelizer(onactivityresult, menu);
        }

        @Override // o.onActivityResult.write
        public boolean RemoteActionCompatParcelizer(onActivityResult onactivityresult, Menu menu) {
            InvalidTypeIdException.onSetRepeatMode(getOnBackPressedDispatcherannotations.this.onCustomAction);
            return this.IconCompatParcelizer.RemoteActionCompatParcelizer(onactivityresult, menu);
        }

        @Override // o.onActivityResult.write
        public boolean IconCompatParcelizer(onActivityResult onactivityresult, MenuItem menuItem) {
            return this.IconCompatParcelizer.IconCompatParcelizer(onactivityresult, menuItem);
        }

        @Override // o.onActivityResult.write
        public void RemoteActionCompatParcelizer(onActivityResult onactivityresult) {
            this.IconCompatParcelizer.RemoteActionCompatParcelizer(onactivityresult);
            if (getOnBackPressedDispatcherannotations.this.IconCompatParcelizer != null) {
                getOnBackPressedDispatcherannotations.this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.getDecorView().removeCallbacks(getOnBackPressedDispatcherannotations.this.onAddQueueItem);
            }
            if (getOnBackPressedDispatcherannotations.this.AudioAttributesCompatParcelizer != null) {
                getOnBackPressedDispatcherannotations.this.onAddQueueItem();
                getOnBackPressedDispatcherannotations getonbackpresseddispatcherannotations = getOnBackPressedDispatcherannotations.this;
                getonbackpresseddispatcherannotations.MediaBrowserCompatCustomActionResultReceiver = InvalidTypeIdException.AudioAttributesCompatParcelizer(getonbackpresseddispatcherannotations.AudioAttributesCompatParcelizer).read(BitmapDescriptorFactory.HUE_RED);
                getOnBackPressedDispatcherannotations.this.MediaBrowserCompatCustomActionResultReceiver.AudioAttributesCompatParcelizer(new Java7SupportImpl() { // from class: o.getOnBackPressedDispatcherannotations.AudioAttributesCompatParcelizer.5
                    @Override // kotlin.Java7SupportImpl, kotlin.NioPathDeserializer
                    public void RemoteActionCompatParcelizer(View view) {
                        getOnBackPressedDispatcherannotations.this.AudioAttributesCompatParcelizer.setVisibility(8);
                        if (getOnBackPressedDispatcherannotations.this.IconCompatParcelizer != null) {
                            getOnBackPressedDispatcherannotations.this.IconCompatParcelizer.dismiss();
                        } else if (getOnBackPressedDispatcherannotations.this.AudioAttributesCompatParcelizer.getParent() instanceof View) {
                            InvalidTypeIdException.onSetRepeatMode((View) getOnBackPressedDispatcherannotations.this.AudioAttributesCompatParcelizer.getParent());
                        }
                        getOnBackPressedDispatcherannotations.this.AudioAttributesCompatParcelizer.MediaBrowserCompatItemReceiver();
                        getOnBackPressedDispatcherannotations.this.MediaBrowserCompatCustomActionResultReceiver.AudioAttributesCompatParcelizer((NioPathDeserializer) null);
                        getOnBackPressedDispatcherannotations.this.MediaBrowserCompatCustomActionResultReceiver = null;
                        InvalidTypeIdException.onSetRepeatMode(getOnBackPressedDispatcherannotations.this.onCustomAction);
                    }
                });
            }
            if (getOnBackPressedDispatcherannotations.this.MediaBrowserCompatItemReceiver != null) {
                getOnBackPressedDispatcherannotations.this.MediaBrowserCompatItemReceiver.IconCompatParcelizer(getOnBackPressedDispatcherannotations.this.read);
            }
            getOnBackPressedDispatcherannotations.this.read = null;
            InvalidTypeIdException.onSetRepeatMode(getOnBackPressedDispatcherannotations.this.onCustomAction);
            getOnBackPressedDispatcherannotations.this.onPlayFromSearch();
        }
    }

    final class onAddQueueItem implements peekAvailableContext.AudioAttributesCompatParcelizer {
        onAddQueueItem() {
        }

        @Override // o.peekAvailableContext.AudioAttributesCompatParcelizer
        public final void RemoteActionCompatParcelizer(onRequestPermissionsResult onrequestpermissionsresult, boolean z) {
            onRequestPermissionsResult onrequestpermissionsresultMediaBrowserCompatMediaItem = onrequestpermissionsresult.MediaBrowserCompatMediaItem();
            boolean z2 = onrequestpermissionsresultMediaBrowserCompatMediaItem != onrequestpermissionsresult;
            getOnBackPressedDispatcherannotations getonbackpresseddispatcherannotations = getOnBackPressedDispatcherannotations.this;
            if (z2) {
                onrequestpermissionsresult = onrequestpermissionsresultMediaBrowserCompatMediaItem;
            }
            MediaBrowserCompatSearchResultReceiver mediaBrowserCompatSearchResultReceiverAudioAttributesCompatParcelizer = getonbackpresseddispatcherannotations.AudioAttributesCompatParcelizer(onrequestpermissionsresult);
            if (mediaBrowserCompatSearchResultReceiverAudioAttributesCompatParcelizer != null) {
                if (z2) {
                    getOnBackPressedDispatcherannotations.this.AudioAttributesCompatParcelizer(mediaBrowserCompatSearchResultReceiverAudioAttributesCompatParcelizer.read, mediaBrowserCompatSearchResultReceiverAudioAttributesCompatParcelizer, onrequestpermissionsresultMediaBrowserCompatMediaItem);
                    getOnBackPressedDispatcherannotations.this.RemoteActionCompatParcelizer(mediaBrowserCompatSearchResultReceiverAudioAttributesCompatParcelizer, true);
                } else {
                    getOnBackPressedDispatcherannotations.this.RemoteActionCompatParcelizer(mediaBrowserCompatSearchResultReceiverAudioAttributesCompatParcelizer, z);
                }
            }
        }

        @Override // o.peekAvailableContext.AudioAttributesCompatParcelizer
        public final boolean read(onRequestPermissionsResult onrequestpermissionsresult) {
            Window.Callback callbackOnCommand;
            if (onrequestpermissionsresult != onrequestpermissionsresult.MediaBrowserCompatMediaItem() || !getOnBackPressedDispatcherannotations.this.AudioAttributesImplApi26Parcelizer || (callbackOnCommand = getOnBackPressedDispatcherannotations.this.onCommand()) == null || getOnBackPressedDispatcherannotations.this.AudioAttributesImplApi21Parcelizer) {
                return true;
            }
            callbackOnCommand.onMenuOpened(108, onrequestpermissionsresult);
            return true;
        }
    }

    final class write implements peekAvailableContext.AudioAttributesCompatParcelizer {
        write() {
        }

        @Override // o.peekAvailableContext.AudioAttributesCompatParcelizer
        public final boolean read(onRequestPermissionsResult onrequestpermissionsresult) {
            Window.Callback callbackOnCommand = getOnBackPressedDispatcherannotations.this.onCommand();
            if (callbackOnCommand == null) {
                return true;
            }
            callbackOnCommand.onMenuOpened(108, onrequestpermissionsresult);
            return true;
        }

        @Override // o.peekAvailableContext.AudioAttributesCompatParcelizer
        public final void RemoteActionCompatParcelizer(onRequestPermissionsResult onrequestpermissionsresult, boolean z) {
            getOnBackPressedDispatcherannotations.this.write(onrequestpermissionsresult);
        }
    }

    protected static final class MediaBrowserCompatSearchResultReceiver {
        ViewGroup AudioAttributesCompatParcelizer;
        boolean AudioAttributesImplApi21Parcelizer;
        onPanelClosed AudioAttributesImplApi26Parcelizer;
        int AudioAttributesImplBaseParcelizer;
        int IconCompatParcelizer;
        boolean MediaBrowserCompatCustomActionResultReceiver;
        boolean MediaBrowserCompatItemReceiver;
        Context MediaBrowserCompatMediaItem;
        public boolean MediaBrowserCompatSearchResultReceiver;
        int MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        boolean MediaDescriptionCompat;
        boolean MediaMetadataCompat = false;
        onRequestPermissionsResult RatingCompat;
        Bundle RemoteActionCompatParcelizer;
        View handleMediaPlayPauseIfPendingOnHandler;
        int onCommand;
        int onCustomAction;
        int read;
        View write;

        MediaBrowserCompatSearchResultReceiver(int i) {
            this.read = i;
        }

        public final boolean AudioAttributesCompatParcelizer() {
            if (this.handleMediaPlayPauseIfPendingOnHandler == null) {
                return false;
            }
            return this.write != null || this.AudioAttributesImplApi26Parcelizer.read().getCount() > 0;
        }

        final void RemoteActionCompatParcelizer(Context context) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme themeNewTheme = context.getResources().newTheme();
            themeNewTheme.setTo(context.getTheme());
            themeNewTheme.resolveAttribute(_init_lambda5.read.actionBarPopupTheme, typedValue, true);
            if (typedValue.resourceId != 0) {
                themeNewTheme.applyStyle(typedValue.resourceId, true);
            }
            themeNewTheme.resolveAttribute(_init_lambda5.read.panelMenuListTheme, typedValue, true);
            if (typedValue.resourceId != 0) {
                themeNewTheme.applyStyle(typedValue.resourceId, true);
            } else {
                themeNewTheme.applyStyle(_init_lambda5.MediaBrowserCompatItemReceiver.Theme_AppCompat_CompactMenu, true);
            }
            initializeViewTreeOwners initializeviewtreeowners = new initializeViewTreeOwners(context, 0);
            initializeviewtreeowners.getTheme().setTo(themeNewTheme);
            this.MediaBrowserCompatMediaItem = initializeviewtreeowners;
            TypedArray typedArrayObtainStyledAttributes = initializeviewtreeowners.obtainStyledAttributes(_init_lambda5.AudioAttributesImplApi26Parcelizer.AppCompatTheme);
            this.IconCompatParcelizer = typedArrayObtainStyledAttributes.getResourceId(_init_lambda5.AudioAttributesImplApi26Parcelizer.AppCompatTheme_panelBackground, 0);
            this.onCustomAction = typedArrayObtainStyledAttributes.getResourceId(_init_lambda5.AudioAttributesImplApi26Parcelizer.AppCompatTheme_android_windowAnimationStyle, 0);
            typedArrayObtainStyledAttributes.recycle();
        }

        final void read(onRequestPermissionsResult onrequestpermissionsresult) {
            onPanelClosed onpanelclosed;
            onRequestPermissionsResult onrequestpermissionsresult2 = this.RatingCompat;
            if (onrequestpermissionsresult != onrequestpermissionsresult2) {
                if (onrequestpermissionsresult2 != null) {
                    onrequestpermissionsresult2.RemoteActionCompatParcelizer(this.AudioAttributesImplApi26Parcelizer);
                }
                this.RatingCompat = onrequestpermissionsresult;
                if (onrequestpermissionsresult == null || (onpanelclosed = this.AudioAttributesImplApi26Parcelizer) == null) {
                    return;
                }
                onrequestpermissionsresult.AudioAttributesCompatParcelizer(onpanelclosed);
            }
        }

        final registerForActivityResult RemoteActionCompatParcelizer(peekAvailableContext.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
            if (this.RatingCompat == null) {
                return null;
            }
            if (this.AudioAttributesImplApi26Parcelizer == null) {
                onPanelClosed onpanelclosed = new onPanelClosed(this.MediaBrowserCompatMediaItem, _init_lambda5.MediaBrowserCompatCustomActionResultReceiver.abc_list_menu_item_layout);
                this.AudioAttributesImplApi26Parcelizer = onpanelclosed;
                onpanelclosed.read(audioAttributesCompatParcelizer);
                this.RatingCompat.AudioAttributesCompatParcelizer(this.AudioAttributesImplApi26Parcelizer);
            }
            return this.AudioAttributesImplApi26Parcelizer.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer);
        }
    }

    class MediaDescriptionCompat extends ContentFrameLayout {
        public MediaDescriptionCompat(Context context) {
            super(context);
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return getOnBackPressedDispatcherannotations.this.read(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0 && write((int) motionEvent.getX(), (int) motionEvent.getY())) {
                getOnBackPressedDispatcherannotations.this.AudioAttributesImplApi26Parcelizer(0);
                return true;
            }
            return super.onInterceptTouchEvent(motionEvent);
        }

        @Override // android.view.View
        public void setBackgroundResource(int i) {
            setBackgroundDrawable(getDefaultViewModelCreationExtras.write(getContext(), i));
        }

        private boolean write(int i, int i2) {
            return i < -5 || i2 < -5 || i > getWidth() + 5 || i2 > getHeight() + 5;
        }
    }

    class AudioAttributesImplBaseParcelizer extends onMultiWindowModeChanged {
        private boolean AudioAttributesCompatParcelizer;
        private boolean IconCompatParcelizer;
        private boolean MediaBrowserCompatItemReceiver;
        private IconCompatParcelizer read;

        @Override // kotlin.onMultiWindowModeChanged, android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            return null;
        }

        AudioAttributesImplBaseParcelizer(Window.Callback callback) {
            super(callback);
        }

        void write(IconCompatParcelizer iconCompatParcelizer) {
            this.read = iconCompatParcelizer;
        }

        @Override // kotlin.onMultiWindowModeChanged, android.view.Window.Callback
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            if (this.IconCompatParcelizer) {
                return write().dispatchKeyEvent(keyEvent);
            }
            return getOnBackPressedDispatcherannotations.this.read(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // kotlin.onMultiWindowModeChanged, android.view.Window.Callback
        public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            return super.dispatchKeyShortcutEvent(keyEvent) || getOnBackPressedDispatcherannotations.this.read(keyEvent.getKeyCode(), keyEvent);
        }

        @Override // kotlin.onMultiWindowModeChanged, android.view.Window.Callback
        public boolean onCreatePanelMenu(int i, Menu menu) {
            if (i != 0 || (menu instanceof onRequestPermissionsResult)) {
                return super.onCreatePanelMenu(i, menu);
            }
            return false;
        }

        @Override // kotlin.onMultiWindowModeChanged, android.view.Window.Callback
        public View onCreatePanelView(int i) {
            View viewWrite;
            IconCompatParcelizer iconCompatParcelizer = this.read;
            return (iconCompatParcelizer == null || (viewWrite = iconCompatParcelizer.write(i)) == null) ? super.onCreatePanelView(i) : viewWrite;
        }

        @Override // kotlin.onMultiWindowModeChanged, android.view.Window.Callback
        public void onContentChanged() {
            if (this.AudioAttributesCompatParcelizer) {
                write().onContentChanged();
            }
        }

        @Override // kotlin.onMultiWindowModeChanged, android.view.Window.Callback
        public boolean onPreparePanel(int i, View view, Menu menu) {
            onRequestPermissionsResult onrequestpermissionsresult = menu instanceof onRequestPermissionsResult ? (onRequestPermissionsResult) menu : null;
            if (i == 0 && onrequestpermissionsresult == null) {
                return false;
            }
            if (onrequestpermissionsresult != null) {
                onrequestpermissionsresult.AudioAttributesCompatParcelizer(true);
            }
            IconCompatParcelizer iconCompatParcelizer = this.read;
            boolean zOnPreparePanel = iconCompatParcelizer != null && iconCompatParcelizer.RemoteActionCompatParcelizer(i);
            if (!zOnPreparePanel) {
                zOnPreparePanel = super.onPreparePanel(i, view, menu);
            }
            if (onrequestpermissionsresult != null) {
                onrequestpermissionsresult.AudioAttributesCompatParcelizer(false);
            }
            return zOnPreparePanel;
        }

        @Override // kotlin.onMultiWindowModeChanged, android.view.Window.Callback
        public boolean onMenuOpened(int i, Menu menu) {
            super.onMenuOpened(i, menu);
            getOnBackPressedDispatcherannotations.this.AudioAttributesImplBaseParcelizer(i);
            return true;
        }

        @Override // kotlin.onMultiWindowModeChanged, android.view.Window.Callback
        public void onPanelClosed(int i, Menu menu) {
            if (this.MediaBrowserCompatItemReceiver) {
                write().onPanelClosed(i, menu);
            } else {
                super.onPanelClosed(i, menu);
                getOnBackPressedDispatcherannotations.this.MediaBrowserCompatItemReceiver(i);
            }
        }

        final ActionMode RemoteActionCompatParcelizer(ActionMode.Callback callback) {
            getViewModelStore.read readVar = new getViewModelStore.read(getOnBackPressedDispatcherannotations.this.AudioAttributesImplBaseParcelizer, callback);
            onActivityResult onactivityresultIconCompatParcelizer = getOnBackPressedDispatcherannotations.this.IconCompatParcelizer(readVar);
            if (onactivityresultIconCompatParcelizer != null) {
                return readVar.write(onactivityresultIconCompatParcelizer);
            }
            return null;
        }

        @Override // kotlin.onMultiWindowModeChanged, android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
            if (getOnBackPressedDispatcherannotations.this.onFastForward() && i == 0) {
                return RemoteActionCompatParcelizer(callback);
            }
            return super.onWindowStartingActionMode(callback, i);
        }

        @Override // kotlin.onMultiWindowModeChanged, android.view.Window.Callback
        public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i) {
            MediaBrowserCompatSearchResultReceiver mediaBrowserCompatSearchResultReceiver = getOnBackPressedDispatcherannotations.this.read(0, true);
            if (mediaBrowserCompatSearchResultReceiver != null && mediaBrowserCompatSearchResultReceiver.RatingCompat != null) {
                super.onProvideKeyboardShortcuts(list, mediaBrowserCompatSearchResultReceiver.RatingCompat, i);
            } else {
                super.onProvideKeyboardShortcuts(list, menu, i);
            }
        }

        public void IconCompatParcelizer(Window.Callback callback) {
            try {
                this.AudioAttributesCompatParcelizer = true;
                callback.onContentChanged();
            } finally {
                this.AudioAttributesCompatParcelizer = false;
            }
        }

        public boolean RemoteActionCompatParcelizer(Window.Callback callback, KeyEvent keyEvent) {
            try {
                this.IconCompatParcelizer = true;
                return callback.dispatchKeyEvent(keyEvent);
            } finally {
                this.IconCompatParcelizer = false;
            }
        }

        public void RemoteActionCompatParcelizer(Window.Callback callback, int i, Menu menu) {
            try {
                this.MediaBrowserCompatItemReceiver = true;
                callback.onPanelClosed(i, menu);
            } finally {
                this.MediaBrowserCompatItemReceiver = false;
            }
        }
    }

    abstract class MediaMetadataCompat {
        private BroadcastReceiver RemoteActionCompatParcelizer;

        abstract void AudioAttributesCompatParcelizer();

        abstract int IconCompatParcelizer();

        abstract IntentFilter RemoteActionCompatParcelizer();

        MediaMetadataCompat() {
        }

        void write() {
            read();
            IntentFilter intentFilterRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
            if (intentFilterRemoteActionCompatParcelizer == null || intentFilterRemoteActionCompatParcelizer.countActions() == 0) {
                return;
            }
            if (this.RemoteActionCompatParcelizer == null) {
                this.RemoteActionCompatParcelizer = new BroadcastReceiver() { // from class: o.getOnBackPressedDispatcherannotations.MediaMetadataCompat.4
                    @Override // android.content.BroadcastReceiver
                    public void onReceive(Context context, Intent intent) {
                        MediaMetadataCompat.this.AudioAttributesCompatParcelizer();
                    }
                };
            }
            getOnBackPressedDispatcherannotations.this.AudioAttributesImplBaseParcelizer.registerReceiver(this.RemoteActionCompatParcelizer, intentFilterRemoteActionCompatParcelizer);
        }

        void read() {
            if (this.RemoteActionCompatParcelizer != null) {
                try {
                    getOnBackPressedDispatcherannotations.this.AudioAttributesImplBaseParcelizer.unregisterReceiver(this.RemoteActionCompatParcelizer);
                } catch (IllegalArgumentException unused) {
                }
                this.RemoteActionCompatParcelizer = null;
            }
        }
    }

    class MediaBrowserCompatMediaItem extends MediaMetadataCompat {
        private final addOnTrimMemoryListener read;

        MediaBrowserCompatMediaItem(addOnTrimMemoryListener addontrimmemorylistener) {
            super();
            this.read = addontrimmemorylistener;
        }

        @Override // o.getOnBackPressedDispatcherannotations.MediaMetadataCompat
        public int IconCompatParcelizer() {
            return this.read.IconCompatParcelizer() ? 2 : 1;
        }

        @Override // o.getOnBackPressedDispatcherannotations.MediaMetadataCompat
        public void AudioAttributesCompatParcelizer() {
            getOnBackPressedDispatcherannotations.this.read();
        }

        @Override // o.getOnBackPressedDispatcherannotations.MediaMetadataCompat
        IntentFilter RemoteActionCompatParcelizer() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }
    }

    class MediaBrowserCompatItemReceiver extends MediaMetadataCompat {
        private final PowerManager write;

        MediaBrowserCompatItemReceiver(Context context) {
            super();
            this.write = (PowerManager) context.getApplicationContext().getSystemService("power");
        }

        @Override // o.getOnBackPressedDispatcherannotations.MediaMetadataCompat
        public int IconCompatParcelizer() {
            return RemoteActionCompatParcelizer.write(this.write) ? 2 : 1;
        }

        @Override // o.getOnBackPressedDispatcherannotations.MediaMetadataCompat
        public void AudioAttributesCompatParcelizer() {
            getOnBackPressedDispatcherannotations.this.read();
        }

        @Override // o.getOnBackPressedDispatcherannotations.MediaMetadataCompat
        IntentFilter RemoteActionCompatParcelizer() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            return intentFilter;
        }
    }

    private static Configuration RemoteActionCompatParcelizer(Configuration configuration, Configuration configuration2) {
        Configuration configuration3 = new Configuration();
        configuration3.fontScale = BitmapDescriptorFactory.HUE_RED;
        if (configuration2 != null && configuration.diff(configuration2) != 0) {
            if (configuration.fontScale != configuration2.fontScale) {
                configuration3.fontScale = configuration2.fontScale;
            }
            if (configuration.mcc != configuration2.mcc) {
                configuration3.mcc = configuration2.mcc;
            }
            if (configuration.mnc != configuration2.mnc) {
                configuration3.mnc = configuration2.mnc;
            }
            AudioAttributesImplApi21Parcelizer.RemoteActionCompatParcelizer(configuration, configuration2, configuration3);
            if (configuration.touchscreen != configuration2.touchscreen) {
                configuration3.touchscreen = configuration2.touchscreen;
            }
            if (configuration.keyboard != configuration2.keyboard) {
                configuration3.keyboard = configuration2.keyboard;
            }
            if (configuration.keyboardHidden != configuration2.keyboardHidden) {
                configuration3.keyboardHidden = configuration2.keyboardHidden;
            }
            if (configuration.navigation != configuration2.navigation) {
                configuration3.navigation = configuration2.navigation;
            }
            if (configuration.navigationHidden != configuration2.navigationHidden) {
                configuration3.navigationHidden = configuration2.navigationHidden;
            }
            if (configuration.orientation != configuration2.orientation) {
                configuration3.orientation = configuration2.orientation;
            }
            if ((configuration.screenLayout & 15) != (configuration2.screenLayout & 15)) {
                configuration3.screenLayout |= configuration2.screenLayout & 15;
            }
            if ((configuration.screenLayout & PsExtractor.AUDIO_STREAM) != (configuration2.screenLayout & PsExtractor.AUDIO_STREAM)) {
                configuration3.screenLayout |= configuration2.screenLayout & PsExtractor.AUDIO_STREAM;
            }
            if ((configuration.screenLayout & 48) != (configuration2.screenLayout & 48)) {
                configuration3.screenLayout |= configuration2.screenLayout & 48;
            }
            if ((configuration.screenLayout & 768) != (configuration2.screenLayout & 768)) {
                configuration3.screenLayout |= configuration2.screenLayout & 768;
            }
            MediaBrowserCompatCustomActionResultReceiver.write(configuration, configuration2, configuration3);
            if ((configuration.uiMode & 15) != (configuration2.uiMode & 15)) {
                configuration3.uiMode |= configuration2.uiMode & 15;
            }
            if ((configuration.uiMode & 48) != (configuration2.uiMode & 48)) {
                configuration3.uiMode |= configuration2.uiMode & 48;
            }
            if (configuration.screenWidthDp != configuration2.screenWidthDp) {
                configuration3.screenWidthDp = configuration2.screenWidthDp;
            }
            if (configuration.screenHeightDp != configuration2.screenHeightDp) {
                configuration3.screenHeightDp = configuration2.screenHeightDp;
            }
            if (configuration.smallestScreenWidthDp != configuration2.smallestScreenWidthDp) {
                configuration3.smallestScreenWidthDp = configuration2.smallestScreenWidthDp;
            }
            read.write(configuration, configuration2, configuration3);
        }
        return configuration3;
    }

    static class read {
        static void write(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            if (configuration.densityDpi != configuration2.densityDpi) {
                configuration3.densityDpi = configuration2.densityDpi;
            }
        }

        static Context write(Context context, Configuration configuration) {
            return context.createConfigurationContext(configuration);
        }
    }

    static class RemoteActionCompatParcelizer {
        static boolean write(PowerManager powerManager) {
            return powerManager.isPowerSaveMode();
        }
    }

    static class AudioAttributesImplApi21Parcelizer {
        static void RemoteActionCompatParcelizer(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            LocaleList locales = configuration.getLocales();
            LocaleList locales2 = configuration2.getLocales();
            if (locales.equals(locales2)) {
                return;
            }
            configuration3.setLocales(locales2);
            configuration3.locale = configuration2.locale;
        }

        static StdKeyDeserializerStringCtorKeyDeserializer RemoteActionCompatParcelizer(Configuration configuration) {
            return StdKeyDeserializerStringCtorKeyDeserializer.RemoteActionCompatParcelizer(configuration.getLocales().toLanguageTags());
        }

        static void AudioAttributesCompatParcelizer(Configuration configuration, StdKeyDeserializerStringCtorKeyDeserializer stdKeyDeserializerStringCtorKeyDeserializer) {
            configuration.setLocales(LocaleList.forLanguageTags(stdKeyDeserializerStringCtorKeyDeserializer.read()));
        }

        public static void read(StdKeyDeserializerStringCtorKeyDeserializer stdKeyDeserializerStringCtorKeyDeserializer) {
            LocaleList.setDefault(LocaleList.forLanguageTags(stdKeyDeserializerStringCtorKeyDeserializer.read()));
        }
    }

    static class MediaBrowserCompatCustomActionResultReceiver {
        static void write(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            if ((configuration.colorMode & 3) != (configuration2.colorMode & 3)) {
                configuration3.colorMode |= configuration2.colorMode & 3;
            }
            if ((configuration.colorMode & 12) != (configuration2.colorMode & 12)) {
                configuration3.colorMode |= configuration2.colorMode & 12;
            }
        }
    }

    static class AudioAttributesImplApi26Parcelizer {
        static OnBackInvokedCallback bE_(Object obj, final getOnBackPressedDispatcherannotations getonbackpresseddispatcherannotations) {
            Objects.requireNonNull(getonbackpresseddispatcherannotations);
            OnBackInvokedCallback onBackInvokedCallback = new OnBackInvokedCallback() { // from class: o.addContentView
                @Override // android.window.OnBackInvokedCallback
                public final void onBackInvoked() {
                    getonbackpresseddispatcherannotations.onPlayFromMediaId();
                }
            };
            ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(PlaybackException.CUSTOM_ERROR_CODE_BASE, onBackInvokedCallback);
            return onBackInvokedCallback;
        }

        static void write(Object obj, Object obj2) {
            ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
        }

        static OnBackInvokedDispatcher bD_(Activity activity) {
            return activity.getOnBackInvokedDispatcher();
        }
    }
}
