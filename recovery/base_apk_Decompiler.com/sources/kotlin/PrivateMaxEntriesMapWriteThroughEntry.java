package kotlin;

import android.R;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaControllerCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.view.animation.Transformation;
import android.view.animation.TranslateAnimation;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.mediarouter.app.MediaRouteExpandCollapseButton;
import androidx.mediarouter.app.MediaRouteVolumeSlider;
import androidx.mediarouter.app.OverlayListView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.ExtensionsKtkotlinModule1;
import kotlin.PrivateMaxEntriesMapNode;
import kotlin.ReflectionCache;

/* JADX INFO: loaded from: classes4.dex */
public final class PrivateMaxEntriesMapWriteThroughEntry extends createFullyDrawnExecutor {
    static final boolean IconCompatParcelizer = Log.isLoggable("MediaRouteCtrlDialog", 3);
    static final int read = (int) TimeUnit.SECONDS.toMillis(30);
    int AudioAttributesCompatParcelizer;
    Uri AudioAttributesImplApi21Parcelizer;
    Context AudioAttributesImplApi26Parcelizer;
    Bitmap AudioAttributesImplBaseParcelizer;
    Bitmap MediaBrowserCompatCustomActionResultReceiver;
    boolean MediaBrowserCompatItemReceiver;
    AudioAttributesCompatParcelizer MediaBrowserCompatMediaItem;
    FrameLayout MediaBrowserCompatSearchResultReceiver;
    Set<ExtensionsKtkotlinModule1.MediaBrowserCompatCustomActionResultReceiver> MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    MediaDescriptionCompat MediaDescriptionCompat;
    int MediaMetadataCompat;
    private Interpolator MediaSessionCompatQueueItem;
    private int MediaSessionCompatResultReceiverWrapper;
    private int MediaSessionCompatToken;
    private FrameLayout ParcelableVolumeInfo;
    private MediaRouteExpandCollapseButton PlaybackStateCompat;
    private Set<ExtensionsKtkotlinModule1.MediaBrowserCompatCustomActionResultReceiver> PlaybackStateCompatCustomAction;
    IconCompatParcelizer RatingCompat;
    final AccessibilityManager RemoteActionCompatParcelizer;
    private Interpolator ResultReceiver;
    private TextView _init_lambda2;
    private ImageButton _init_lambda3;
    private boolean _init_lambda4;
    private LinearLayout _init_lambda5;
    private int accessaddObserverForBackInvoker;
    private int accessensureViewModelStore;
    private TextView accessgetReportFullyDrawnExecutorp;
    private int addObserverForBackInvoker;
    private final int addObserverForBackInvokerlambda7;
    boolean handleMediaPlayPauseIfPendingOnHandler;
    Runnable onAddQueueItem;
    boolean onCommand;
    Set<ExtensionsKtkotlinModule1.MediaBrowserCompatCustomActionResultReceiver> onCustomAction;
    final ExtensionsKtkotlinModule1.MediaBrowserCompatCustomActionResultReceiver onFastForward;
    boolean onMediaButtonEvent;
    MediaControllerCompat onPause;
    boolean onPlay;
    boolean onPlayFromMediaId;
    ExtensionsKtkotlinModule1.MediaBrowserCompatCustomActionResultReceiver onPlayFromSearch;
    PlaybackStateCompat onPlayFromUri;
    MediaBrowserCompatCustomActionResultReceiver onPrepare;
    final ExtensionsKtkotlinModule1 onPrepareFromMediaId;
    write onPrepareFromSearch;
    private ImageView onPrepareFromUri;
    SeekBar onRemoveQueueItem;
    Map<ExtensionsKtkotlinModule1.MediaBrowserCompatCustomActionResultReceiver, SeekBar> onRemoveQueueItemAt;
    private Interpolator onRewind;
    OverlayListView onSeekTo;
    private final read onSetCaptioningEnabled;
    private boolean onSetPlaybackSpeed;
    private FrameLayout onSetRating;
    private boolean onSetRepeatMode;
    private ImageButton onSetShuffleMode;
    private int onSkipToNext;
    private View onSkipToPrevious;
    private View onSkipToQueueItem;
    private LinearLayout onStop;
    private LinearLayout r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw;
    private List<ExtensionsKtkotlinModule1.MediaBrowserCompatCustomActionResultReceiver> r8lambdaKUbBm7ckfqTc9QCgukC86fguu4;
    private Interpolator r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
    private Button r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;
    private RelativeLayout r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8;
    private TextView r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0;
    private Button setSessionImpl;

    public PrivateMaxEntriesMapWriteThroughEntry(Context context) {
        this(context, (byte) 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    private PrivateMaxEntriesMapWriteThroughEntry(Context context, byte b) {
        Context contextWrite = getAccessible.write(context, 0, true);
        super(contextWrite, getAccessible.IconCompatParcelizer(contextWrite));
        this._init_lambda4 = true;
        this.onAddQueueItem = new Runnable() { // from class: o.PrivateMaxEntriesMapWriteThroughEntry.3
            @Override // java.lang.Runnable
            public final void run() {
                PrivateMaxEntriesMapWriteThroughEntry.this.AudioAttributesImplBaseParcelizer();
            }
        };
        this.AudioAttributesImplApi26Parcelizer = getContext();
        this.MediaBrowserCompatMediaItem = new AudioAttributesCompatParcelizer();
        this.onPrepareFromMediaId = ExtensionsKtkotlinModule1.write(this.AudioAttributesImplApi26Parcelizer);
        this.onSetCaptioningEnabled = new read();
        this.onFastForward = ExtensionsKtkotlinModule1.read();
        RemoteActionCompatParcelizer(ExtensionsKtkotlinModule1.RemoteActionCompatParcelizer());
        this.addObserverForBackInvokerlambda7 = this.AudioAttributesImplApi26Parcelizer.getResources().getDimensionPixelSize(PrivateMaxEntriesMapNode.AudioAttributesCompatParcelizer.mr_controller_volume_group_list_padding_top);
        this.RemoteActionCompatParcelizer = (AccessibilityManager) this.AudioAttributesImplApi26Parcelizer.getSystemService("accessibility");
        this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = AnimationUtils.loadInterpolator(contextWrite, PrivateMaxEntriesMapNode.AudioAttributesImplBaseParcelizer.mr_linear_out_slow_in);
        this.MediaSessionCompatQueueItem = AnimationUtils.loadInterpolator(contextWrite, PrivateMaxEntriesMapNode.AudioAttributesImplBaseParcelizer.mr_fast_out_slow_in);
        this.onRewind = new AccelerateDecelerateInterpolator();
    }

    private ExtensionsKtkotlinModule1.AudioAttributesImplApi21Parcelizer MediaDescriptionCompat() {
        ExtensionsKtkotlinModule1.MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiver = this.onFastForward;
        if (mediaBrowserCompatCustomActionResultReceiver instanceof ExtensionsKtkotlinModule1.AudioAttributesImplApi21Parcelizer) {
            return (ExtensionsKtkotlinModule1.AudioAttributesImplApi21Parcelizer) mediaBrowserCompatCustomActionResultReceiver;
        }
        return null;
    }

    private void RemoteActionCompatParcelizer(MediaSessionCompat.Token token) {
        MediaControllerCompat mediaControllerCompat = this.onPause;
        if (mediaControllerCompat != null) {
            mediaControllerCompat.IconCompatParcelizer(this.MediaBrowserCompatMediaItem);
            this.onPause = null;
        }
        if (token == null || !this.onSetPlaybackSpeed) {
            return;
        }
        try {
            this.onPause = new MediaControllerCompat(this.AudioAttributesImplApi26Parcelizer, token);
        } catch (RemoteException unused) {
        }
        MediaControllerCompat mediaControllerCompat2 = this.onPause;
        if (mediaControllerCompat2 != null) {
            mediaControllerCompat2.AudioAttributesCompatParcelizer(this.MediaBrowserCompatMediaItem);
        }
        MediaControllerCompat mediaControllerCompat3 = this.onPause;
        MediaMetadataCompat mediaMetadataCompatIconCompatParcelizer = mediaControllerCompat3 == null ? null : mediaControllerCompat3.IconCompatParcelizer();
        this.MediaDescriptionCompat = mediaMetadataCompatIconCompatParcelizer == null ? null : mediaMetadataCompatIconCompatParcelizer.write();
        MediaControllerCompat mediaControllerCompat4 = this.onPause;
        this.onPlayFromUri = mediaControllerCompat4 != null ? mediaControllerCompat4.AudioAttributesCompatParcelizer() : null;
        MediaBrowserCompatMediaItem();
        write(false);
    }

    @Override // kotlin.createFullyDrawnExecutor, kotlin.menuHostHelperlambda0, kotlin.onFastForward, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setBackgroundDrawableResource(R.color.transparent);
        setContentView(PrivateMaxEntriesMapNode.MediaBrowserCompatCustomActionResultReceiver.mr_controller_material_dialog_b);
        findViewById(R.id.button3).setVisibility(8);
        RemoteActionCompatParcelizer remoteActionCompatParcelizer = new RemoteActionCompatParcelizer();
        FrameLayout frameLayout = (FrameLayout) findViewById(PrivateMaxEntriesMapNode.IconCompatParcelizer.mr_expandable_area);
        this.ParcelableVolumeInfo = frameLayout;
        frameLayout.setOnClickListener(new View.OnClickListener() { // from class: o.PrivateMaxEntriesMapWriteThroughEntry.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PrivateMaxEntriesMapWriteThroughEntry.this.dismiss();
            }
        });
        LinearLayout linearLayout = (LinearLayout) findViewById(PrivateMaxEntriesMapNode.IconCompatParcelizer.mr_dialog_area);
        this.onStop = linearLayout;
        linearLayout.setOnClickListener(new View.OnClickListener() { // from class: o.PrivateMaxEntriesMapWriteThroughEntry.8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
            }
        });
        int iWrite = getAccessible.write(this.AudioAttributesImplApi26Parcelizer);
        Button button = (Button) findViewById(R.id.button2);
        this.setSessionImpl = button;
        button.setText(PrivateMaxEntriesMapNode.MediaBrowserCompatItemReceiver.mr_controller_disconnect);
        this.setSessionImpl.setTextColor(iWrite);
        this.setSessionImpl.setOnClickListener(remoteActionCompatParcelizer);
        Button button2 = (Button) findViewById(R.id.button1);
        this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = button2;
        button2.setText(PrivateMaxEntriesMapNode.MediaBrowserCompatItemReceiver.mr_controller_stop_casting);
        this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28.setTextColor(iWrite);
        this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28.setOnClickListener(remoteActionCompatParcelizer);
        this.r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0 = (TextView) findViewById(PrivateMaxEntriesMapNode.IconCompatParcelizer.mr_name);
        ImageButton imageButton = (ImageButton) findViewById(PrivateMaxEntriesMapNode.IconCompatParcelizer.mr_close);
        this.onSetShuffleMode = imageButton;
        imageButton.setOnClickListener(remoteActionCompatParcelizer);
        this.onSetRating = (FrameLayout) findViewById(PrivateMaxEntriesMapNode.IconCompatParcelizer.mr_custom_control);
        this.MediaBrowserCompatSearchResultReceiver = (FrameLayout) findViewById(PrivateMaxEntriesMapNode.IconCompatParcelizer.mr_default_control);
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: o.PrivateMaxEntriesMapWriteThroughEntry.7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PendingIntent pendingIntent;
                if (PrivateMaxEntriesMapWriteThroughEntry.this.onPause == null || (pendingIntent = PrivateMaxEntriesMapWriteThroughEntry.this.onPause.read()) == null) {
                    return;
                }
                try {
                    pendingIntent.send();
                    PrivateMaxEntriesMapWriteThroughEntry.this.dismiss();
                } catch (PendingIntent.CanceledException unused) {
                    Objects.toString(pendingIntent);
                }
            }
        };
        ImageView imageView = (ImageView) findViewById(PrivateMaxEntriesMapNode.IconCompatParcelizer.mr_art);
        this.onPrepareFromUri = imageView;
        imageView.setOnClickListener(onClickListener);
        findViewById(PrivateMaxEntriesMapNode.IconCompatParcelizer.mr_control_title_container).setOnClickListener(onClickListener);
        this.r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw = (LinearLayout) findViewById(PrivateMaxEntriesMapNode.IconCompatParcelizer.mr_media_main_control);
        this.onSkipToPrevious = findViewById(PrivateMaxEntriesMapNode.IconCompatParcelizer.mr_control_divider);
        this.r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8 = (RelativeLayout) findViewById(PrivateMaxEntriesMapNode.IconCompatParcelizer.mr_playback_control);
        this.accessgetReportFullyDrawnExecutorp = (TextView) findViewById(PrivateMaxEntriesMapNode.IconCompatParcelizer.mr_control_title);
        this._init_lambda2 = (TextView) findViewById(PrivateMaxEntriesMapNode.IconCompatParcelizer.mr_control_subtitle);
        ImageButton imageButton2 = (ImageButton) findViewById(PrivateMaxEntriesMapNode.IconCompatParcelizer.mr_control_playback_ctrl);
        this._init_lambda3 = imageButton2;
        imageButton2.setOnClickListener(remoteActionCompatParcelizer);
        LinearLayout linearLayout2 = (LinearLayout) findViewById(PrivateMaxEntriesMapNode.IconCompatParcelizer.mr_volume_control);
        this._init_lambda5 = linearLayout2;
        linearLayout2.setVisibility(8);
        SeekBar seekBar = (SeekBar) findViewById(PrivateMaxEntriesMapNode.IconCompatParcelizer.mr_volume_slider);
        this.onRemoveQueueItem = seekBar;
        seekBar.setTag(this.onFastForward);
        write writeVar = new write();
        this.onPrepareFromSearch = writeVar;
        this.onRemoveQueueItem.setOnSeekBarChangeListener(writeVar);
        this.onSeekTo = (OverlayListView) findViewById(PrivateMaxEntriesMapNode.IconCompatParcelizer.mr_volume_group_list);
        this.r8lambdaKUbBm7ckfqTc9QCgukC86fguu4 = new ArrayList();
        MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiver = new MediaBrowserCompatCustomActionResultReceiver(this.onSeekTo.getContext(), this.r8lambdaKUbBm7ckfqTc9QCgukC86fguu4);
        this.onPrepare = mediaBrowserCompatCustomActionResultReceiver;
        this.onSeekTo.setAdapter((ListAdapter) mediaBrowserCompatCustomActionResultReceiver);
        this.onCustomAction = new HashSet();
        getAccessible.IconCompatParcelizer(this.AudioAttributesImplApi26Parcelizer, this.r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw, this.onSeekTo, MediaDescriptionCompat() != null);
        getAccessible.read(this.AudioAttributesImplApi26Parcelizer, (MediaRouteVolumeSlider) this.onRemoveQueueItem, this.r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw);
        HashMap map = new HashMap();
        this.onRemoveQueueItemAt = map;
        map.put(this.onFastForward, this.onRemoveQueueItem);
        MediaRouteExpandCollapseButton mediaRouteExpandCollapseButton = (MediaRouteExpandCollapseButton) findViewById(PrivateMaxEntriesMapNode.IconCompatParcelizer.mr_group_expand_collapse);
        this.PlaybackStateCompat = mediaRouteExpandCollapseButton;
        mediaRouteExpandCollapseButton.setOnClickListener(new View.OnClickListener() { // from class: o.PrivateMaxEntriesMapWriteThroughEntry.6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PrivateMaxEntriesMapWriteThroughEntry.this.onCommand = !r3.onCommand;
                if (PrivateMaxEntriesMapWriteThroughEntry.this.onCommand) {
                    PrivateMaxEntriesMapWriteThroughEntry.this.onSeekTo.setVisibility(0);
                }
                PrivateMaxEntriesMapWriteThroughEntry.this.AudioAttributesImplApi21Parcelizer();
                PrivateMaxEntriesMapWriteThroughEntry.this.RemoteActionCompatParcelizer(true);
            }
        });
        AudioAttributesImplApi21Parcelizer();
        this.MediaMetadataCompat = this.AudioAttributesImplApi26Parcelizer.getResources().getInteger(PrivateMaxEntriesMapNode.write.mr_controller_volume_group_list_animation_duration_ms);
        this.MediaSessionCompatResultReceiverWrapper = this.AudioAttributesImplApi26Parcelizer.getResources().getInteger(PrivateMaxEntriesMapNode.write.mr_controller_volume_group_list_fade_in_duration_ms);
        this.MediaSessionCompatToken = this.AudioAttributesImplApi26Parcelizer.getResources().getInteger(PrivateMaxEntriesMapNode.write.mr_controller_volume_group_list_fade_out_duration_ms);
        this.onSkipToQueueItem = null;
        this.onSetRepeatMode = true;
        MediaMetadataCompat();
    }

    final void MediaMetadataCompat() {
        int i = ClosedRangeMixin.read(this.AudioAttributesImplApi26Parcelizer);
        getWindow().setLayout(i, -2);
        View decorView = getWindow().getDecorView();
        this.onSkipToNext = (i - decorView.getPaddingLeft()) - decorView.getPaddingRight();
        Resources resources = this.AudioAttributesImplApi26Parcelizer.getResources();
        this.accessaddObserverForBackInvoker = resources.getDimensionPixelSize(PrivateMaxEntriesMapNode.AudioAttributesCompatParcelizer.mr_controller_volume_group_list_item_icon_size);
        this.accessensureViewModelStore = resources.getDimensionPixelSize(PrivateMaxEntriesMapNode.AudioAttributesCompatParcelizer.mr_controller_volume_group_list_item_height);
        this.addObserverForBackInvoker = resources.getDimensionPixelSize(PrivateMaxEntriesMapNode.AudioAttributesCompatParcelizer.mr_controller_volume_group_list_max_height);
        this.AudioAttributesImplBaseParcelizer = null;
        this.AudioAttributesImplApi21Parcelizer = null;
        MediaBrowserCompatMediaItem();
        write(false);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.onSetPlaybackSpeed = true;
        this.onPrepareFromMediaId.RemoteActionCompatParcelizer(C0185kotlinModule.read, this.onSetCaptioningEnabled, 2);
        RemoteActionCompatParcelizer(ExtensionsKtkotlinModule1.RemoteActionCompatParcelizer());
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.onPrepareFromMediaId.read(this.onSetCaptioningEnabled);
        RemoteActionCompatParcelizer((MediaSessionCompat.Token) null);
        this.onSetPlaybackSpeed = false;
        super.onDetachedFromWindow();
    }

    @Override // kotlin.createFullyDrawnExecutor, android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 25 || i == 24) {
            this.onFastForward.IconCompatParcelizer(i == 25 ? -1 : 1);
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // kotlin.createFullyDrawnExecutor, android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i == 25 || i == 24) {
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    final void write(boolean z) {
        if (this.onPlayFromSearch != null) {
            this.handleMediaPlayPauseIfPendingOnHandler = true;
            this.onPlay = z | this.onPlay;
            return;
        }
        this.handleMediaPlayPauseIfPendingOnHandler = false;
        this.onPlay = false;
        if (!this.onFastForward.onFastForward() || this.onFastForward.handleMediaPlayPauseIfPendingOnHandler()) {
            dismiss();
            return;
        }
        if (this.onSetRepeatMode) {
            this.r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0.setText(this.onFastForward.AudioAttributesImplBaseParcelizer());
            this.setSessionImpl.setVisibility(this.onFastForward.read() ? 0 : 8);
            if (this.MediaBrowserCompatItemReceiver) {
                if (IconCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver)) {
                    Objects.toString(this.MediaBrowserCompatCustomActionResultReceiver);
                } else {
                    this.onPrepareFromUri.setImageBitmap(this.MediaBrowserCompatCustomActionResultReceiver);
                    this.onPrepareFromUri.setBackgroundColor(this.AudioAttributesCompatParcelizer);
                }
                RemoteActionCompatParcelizer();
            }
            onCommand();
            MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
            RemoteActionCompatParcelizer(z);
        }
    }

    static boolean IconCompatParcelizer(Bitmap bitmap) {
        return bitmap != null && bitmap.isRecycled();
    }

    private boolean MediaBrowserCompatSearchResultReceiver() {
        return (this.MediaDescriptionCompat == null && this.onPlayFromUri == null) ? false : true;
    }

    private int MediaBrowserCompatItemReceiver(boolean z) {
        if (!z && this._init_lambda5.getVisibility() != 0) {
            return 0;
        }
        int paddingTop = this.r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw.getPaddingTop() + this.r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw.getPaddingBottom();
        if (z) {
            paddingTop += this.r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8.getMeasuredHeight();
        }
        if (this._init_lambda5.getVisibility() == 0) {
            paddingTop += this._init_lambda5.getMeasuredHeight();
        }
        return (z && this._init_lambda5.getVisibility() == 0) ? paddingTop + this.onSkipToPrevious.getMeasuredHeight() : paddingTop;
    }

    private void AudioAttributesImplApi26Parcelizer(boolean z) {
        int i = 0;
        this.onSkipToPrevious.setVisibility((this._init_lambda5.getVisibility() == 0 && z) ? 0 : 8);
        LinearLayout linearLayout = this.r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw;
        if (this._init_lambda5.getVisibility() == 8 && !z) {
            i = 8;
        }
        linearLayout.setVisibility(i);
    }

    final void RemoteActionCompatParcelizer(final boolean z) {
        this.MediaBrowserCompatSearchResultReceiver.requestLayout();
        this.MediaBrowserCompatSearchResultReceiver.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: o.PrivateMaxEntriesMapWriteThroughEntry.10
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                PrivateMaxEntriesMapWriteThroughEntry.this.MediaBrowserCompatSearchResultReceiver.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                if (PrivateMaxEntriesMapWriteThroughEntry.this.onMediaButtonEvent) {
                    PrivateMaxEntriesMapWriteThroughEntry.this.onPlayFromMediaId = true;
                } else {
                    PrivateMaxEntriesMapWriteThroughEntry.this.AudioAttributesCompatParcelizer(z);
                }
            }
        });
    }

    final void AudioAttributesCompatParcelizer(boolean z) {
        int i;
        Bitmap bitmap;
        int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(this.r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw);
        read(this.r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw, -1);
        AudioAttributesImplApi26Parcelizer(MediaBrowserCompatSearchResultReceiver());
        View decorView = getWindow().getDecorView();
        decorView.measure(View.MeasureSpec.makeMeasureSpec(((ViewGroup.LayoutParams) getWindow().getAttributes()).width, 1073741824), 0);
        read(this.r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw, iRemoteActionCompatParcelizer);
        if (!(this.onPrepareFromUri.getDrawable() instanceof BitmapDrawable) || (bitmap = ((BitmapDrawable) this.onPrepareFromUri.getDrawable()).getBitmap()) == null) {
            i = 0;
        } else {
            i = read(bitmap.getWidth(), bitmap.getHeight());
            this.onPrepareFromUri.setScaleType(bitmap.getWidth() >= bitmap.getHeight() ? ImageView.ScaleType.FIT_XY : ImageView.ScaleType.FIT_CENTER);
        }
        int iMediaBrowserCompatItemReceiver = MediaBrowserCompatItemReceiver(MediaBrowserCompatSearchResultReceiver());
        int size = this.r8lambdaKUbBm7ckfqTc9QCgukC86fguu4.size();
        int size2 = MediaDescriptionCompat() == null ? 0 : this.accessensureViewModelStore * MediaDescriptionCompat().AudioAttributesCompatParcelizer().size();
        if (size > 0) {
            size2 += this.addObserverForBackInvokerlambda7;
        }
        int iMin = Math.min(size2, this.addObserverForBackInvoker);
        if (!this.onCommand) {
            iMin = 0;
        }
        int iMax = Math.max(i, iMin) + iMediaBrowserCompatItemReceiver;
        Rect rect = new Rect();
        decorView.getWindowVisibleDisplayFrame(rect);
        int iHeight = rect.height() - (this.onStop.getMeasuredHeight() - this.MediaBrowserCompatSearchResultReceiver.getMeasuredHeight());
        if (i > 0 && iMax <= iHeight) {
            this.onPrepareFromUri.setVisibility(0);
            read(this.onPrepareFromUri, i);
        } else {
            if (RemoteActionCompatParcelizer(this.onSeekTo) + this.r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw.getMeasuredHeight() >= this.MediaBrowserCompatSearchResultReceiver.getMeasuredHeight()) {
                this.onPrepareFromUri.setVisibility(8);
            }
            iMax = iMin + iMediaBrowserCompatItemReceiver;
            i = 0;
        }
        if (MediaBrowserCompatSearchResultReceiver() && iMax <= iHeight) {
            this.r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8.setVisibility(0);
        } else {
            this.r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8.setVisibility(8);
        }
        AudioAttributesImplApi26Parcelizer(this.r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8.getVisibility() == 0);
        int iMediaBrowserCompatItemReceiver2 = MediaBrowserCompatItemReceiver(this.r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8.getVisibility() == 0);
        int iMax2 = Math.max(i, iMin) + iMediaBrowserCompatItemReceiver2;
        if (iMax2 > iHeight) {
            iMin -= iMax2 - iHeight;
        } else {
            iHeight = iMax2;
        }
        this.r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw.clearAnimation();
        this.onSeekTo.clearAnimation();
        this.MediaBrowserCompatSearchResultReceiver.clearAnimation();
        if (z) {
            RemoteActionCompatParcelizer(this.r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw, iMediaBrowserCompatItemReceiver2);
            RemoteActionCompatParcelizer(this.onSeekTo, iMin);
            RemoteActionCompatParcelizer(this.MediaBrowserCompatSearchResultReceiver, iHeight);
        } else {
            read(this.r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw, iMediaBrowserCompatItemReceiver2);
            read(this.onSeekTo, iMin);
            read(this.MediaBrowserCompatSearchResultReceiver, iHeight);
        }
        read(this.ParcelableVolumeInfo, rect.height());
        MediaBrowserCompatCustomActionResultReceiver(z);
    }

    final void write(View view) {
        read((LinearLayout) view.findViewById(PrivateMaxEntriesMapNode.IconCompatParcelizer.volume_item_container), this.accessensureViewModelStore);
        View viewFindViewById = view.findViewById(PrivateMaxEntriesMapNode.IconCompatParcelizer.mr_volume_item_icon);
        ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
        layoutParams.width = this.accessaddObserverForBackInvoker;
        layoutParams.height = this.accessaddObserverForBackInvoker;
        viewFindViewById.setLayoutParams(layoutParams);
    }

    private void RemoteActionCompatParcelizer(final View view, final int i) {
        final int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(view);
        Animation animation = new Animation() { // from class: o.PrivateMaxEntriesMapWriteThroughEntry.9
            @Override // android.view.animation.Animation
            protected final void applyTransformation(float f, Transformation transformation) {
                PrivateMaxEntriesMapWriteThroughEntry.read(view, iRemoteActionCompatParcelizer - ((int) ((r3 - i) * f)));
            }
        };
        animation.setDuration(this.MediaMetadataCompat);
        animation.setInterpolator(this.ResultReceiver);
        view.startAnimation(animation);
    }

    final void AudioAttributesImplApi21Parcelizer() {
        this.ResultReceiver = this.onCommand ? this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM : this.MediaSessionCompatQueueItem;
    }

    private void onCommand() {
        if (AudioAttributesCompatParcelizer(this.onFastForward)) {
            if (this._init_lambda5.getVisibility() == 8) {
                this._init_lambda5.setVisibility(0);
                this.onRemoveQueueItem.setMax(this.onFastForward.onCommand());
                this.onRemoveQueueItem.setProgress(this.onFastForward.MediaDescriptionCompat());
                this.PlaybackStateCompat.setVisibility(MediaDescriptionCompat() != null ? 0 : 8);
                return;
            }
            return;
        }
        this._init_lambda5.setVisibility(8);
    }

    private void MediaBrowserCompatCustomActionResultReceiver(boolean z) {
        List<ExtensionsKtkotlinModule1.MediaBrowserCompatCustomActionResultReceiver> listAudioAttributesCompatParcelizer = MediaDescriptionCompat() == null ? null : MediaDescriptionCompat().AudioAttributesCompatParcelizer();
        if (listAudioAttributesCompatParcelizer == null) {
            this.r8lambdaKUbBm7ckfqTc9QCgukC86fguu4.clear();
            this.onPrepare.notifyDataSetChanged();
            return;
        }
        if (ClosedRangeMixin.RemoteActionCompatParcelizer(this.r8lambdaKUbBm7ckfqTc9QCgukC86fguu4, listAudioAttributesCompatParcelizer)) {
            this.onPrepare.notifyDataSetChanged();
            return;
        }
        HashMap map = z ? ClosedRangeMixin.read(this.onSeekTo, this.onPrepare) : null;
        HashMap map2 = z ? ClosedRangeMixin.read(this.AudioAttributesImplApi26Parcelizer, this.onSeekTo, this.onPrepare) : null;
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = ClosedRangeMixin.write(this.r8lambdaKUbBm7ckfqTc9QCgukC86fguu4, listAudioAttributesCompatParcelizer);
        this.PlaybackStateCompatCustomAction = ClosedRangeMixin.IconCompatParcelizer(this.r8lambdaKUbBm7ckfqTc9QCgukC86fguu4, listAudioAttributesCompatParcelizer);
        this.r8lambdaKUbBm7ckfqTc9QCgukC86fguu4.addAll(0, this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
        this.r8lambdaKUbBm7ckfqTc9QCgukC86fguu4.removeAll(this.PlaybackStateCompatCustomAction);
        this.onPrepare.notifyDataSetChanged();
        if (z && this.onCommand && this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.size() + this.PlaybackStateCompatCustomAction.size() > 0) {
            AudioAttributesCompatParcelizer(map, map2);
        } else {
            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = null;
            this.PlaybackStateCompatCustomAction = null;
        }
    }

    private void AudioAttributesCompatParcelizer(final Map<ExtensionsKtkotlinModule1.MediaBrowserCompatCustomActionResultReceiver, Rect> map, final Map<ExtensionsKtkotlinModule1.MediaBrowserCompatCustomActionResultReceiver, BitmapDrawable> map2) {
        this.onSeekTo.setEnabled(false);
        this.onSeekTo.requestLayout();
        this.onMediaButtonEvent = true;
        this.onSeekTo.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: o.PrivateMaxEntriesMapWriteThroughEntry.13
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                PrivateMaxEntriesMapWriteThroughEntry.this.onSeekTo.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                PrivateMaxEntriesMapWriteThroughEntry.this.write(map, map2);
            }
        });
    }

    final void write(Map<ExtensionsKtkotlinModule1.MediaBrowserCompatCustomActionResultReceiver, Rect> map, Map<ExtensionsKtkotlinModule1.MediaBrowserCompatCustomActionResultReceiver, BitmapDrawable> map2) {
        OverlayListView.write writeVarRemoteActionCompatParcelizer;
        Set<ExtensionsKtkotlinModule1.MediaBrowserCompatCustomActionResultReceiver> set = this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        if (set == null || this.PlaybackStateCompatCustomAction == null) {
            return;
        }
        int size = set.size() - this.PlaybackStateCompatCustomAction.size();
        Animation.AnimationListener animationListener = new Animation.AnimationListener() { // from class: o.PrivateMaxEntriesMapWriteThroughEntry.14
            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationEnd(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationStart(Animation animation) {
                PrivateMaxEntriesMapWriteThroughEntry.this.onSeekTo.read();
                PrivateMaxEntriesMapWriteThroughEntry.this.onSeekTo.postDelayed(PrivateMaxEntriesMapWriteThroughEntry.this.onAddQueueItem, PrivateMaxEntriesMapWriteThroughEntry.this.MediaMetadataCompat);
            }
        };
        int firstVisiblePosition = this.onSeekTo.getFirstVisiblePosition();
        boolean z = false;
        for (int i = 0; i < this.onSeekTo.getChildCount(); i++) {
            View childAt = this.onSeekTo.getChildAt(i);
            ExtensionsKtkotlinModule1.MediaBrowserCompatCustomActionResultReceiver item = this.onPrepare.getItem(firstVisiblePosition + i);
            Rect rect = map.get(item);
            int top = childAt.getTop();
            int i2 = rect != null ? rect.top : (this.accessensureViewModelStore * size) + top;
            AnimationSet animationSet = new AnimationSet(true);
            Set<ExtensionsKtkotlinModule1.MediaBrowserCompatCustomActionResultReceiver> set2 = this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
            if (set2 != null && set2.contains(item)) {
                AlphaAnimation alphaAnimation = new AlphaAnimation(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
                alphaAnimation.setDuration(this.MediaSessionCompatResultReceiverWrapper);
                animationSet.addAnimation(alphaAnimation);
                i2 = top;
            }
            TranslateAnimation translateAnimation = new TranslateAnimation(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, i2 - top, BitmapDescriptorFactory.HUE_RED);
            translateAnimation.setDuration(this.MediaMetadataCompat);
            animationSet.addAnimation(translateAnimation);
            animationSet.setFillAfter(true);
            animationSet.setFillEnabled(true);
            animationSet.setInterpolator(this.ResultReceiver);
            if (!z) {
                animationSet.setAnimationListener(animationListener);
                z = true;
            }
            childAt.clearAnimation();
            childAt.startAnimation(animationSet);
            map.remove(item);
            map2.remove(item);
        }
        for (Map.Entry<ExtensionsKtkotlinModule1.MediaBrowserCompatCustomActionResultReceiver, BitmapDrawable> entry : map2.entrySet()) {
            final ExtensionsKtkotlinModule1.MediaBrowserCompatCustomActionResultReceiver key = entry.getKey();
            BitmapDrawable value = entry.getValue();
            Rect rect2 = map.get(key);
            if (this.PlaybackStateCompatCustomAction.contains(key)) {
                writeVarRemoteActionCompatParcelizer = new OverlayListView.write(value, rect2).read().AudioAttributesCompatParcelizer(this.MediaSessionCompatToken).RemoteActionCompatParcelizer(this.ResultReceiver);
            } else {
                writeVarRemoteActionCompatParcelizer = new OverlayListView.write(value, rect2).IconCompatParcelizer(this.accessensureViewModelStore * size).AudioAttributesCompatParcelizer(this.MediaMetadataCompat).RemoteActionCompatParcelizer(this.ResultReceiver).read(new OverlayListView.write.RemoteActionCompatParcelizer() { // from class: o.PrivateMaxEntriesMapWriteThroughEntry.5
                    @Override // androidx.mediarouter.app.OverlayListView.write.RemoteActionCompatParcelizer
                    public final void RemoteActionCompatParcelizer() {
                        PrivateMaxEntriesMapWriteThroughEntry.this.onCustomAction.remove(key);
                        PrivateMaxEntriesMapWriteThroughEntry.this.onPrepare.notifyDataSetChanged();
                    }
                });
                this.onCustomAction.add(key);
            }
            this.onSeekTo.AudioAttributesCompatParcelizer(writeVarRemoteActionCompatParcelizer);
        }
    }

    final void AudioAttributesImplBaseParcelizer() {
        read(true);
        this.onSeekTo.requestLayout();
        this.onSeekTo.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: o.PrivateMaxEntriesMapWriteThroughEntry.4
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                PrivateMaxEntriesMapWriteThroughEntry.this.onSeekTo.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                PrivateMaxEntriesMapWriteThroughEntry.this.MediaBrowserCompatItemReceiver();
            }
        });
    }

    final void MediaBrowserCompatItemReceiver() {
        Set<ExtensionsKtkotlinModule1.MediaBrowserCompatCustomActionResultReceiver> set = this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        if (set != null && set.size() != 0) {
            RatingCompat();
        } else {
            IconCompatParcelizer(true);
        }
    }

    final void IconCompatParcelizer(boolean z) {
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = null;
        this.PlaybackStateCompatCustomAction = null;
        this.onMediaButtonEvent = false;
        if (this.onPlayFromMediaId) {
            this.onPlayFromMediaId = false;
            RemoteActionCompatParcelizer(z);
        }
        this.onSeekTo.setEnabled(true);
    }

    private void RatingCompat() {
        Animation.AnimationListener animationListener = new Animation.AnimationListener() { // from class: o.PrivateMaxEntriesMapWriteThroughEntry.2
            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationStart(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationEnd(Animation animation) {
                PrivateMaxEntriesMapWriteThroughEntry.this.IconCompatParcelizer(true);
            }
        };
        int firstVisiblePosition = this.onSeekTo.getFirstVisiblePosition();
        boolean z = false;
        for (int i = 0; i < this.onSeekTo.getChildCount(); i++) {
            View childAt = this.onSeekTo.getChildAt(i);
            if (this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.contains(this.onPrepare.getItem(firstVisiblePosition + i))) {
                AlphaAnimation alphaAnimation = new AlphaAnimation(BitmapDescriptorFactory.HUE_RED, 1.0f);
                alphaAnimation.setDuration(this.MediaSessionCompatResultReceiverWrapper);
                alphaAnimation.setFillEnabled(true);
                alphaAnimation.setFillAfter(true);
                if (!z) {
                    alphaAnimation.setAnimationListener(animationListener);
                    z = true;
                }
                childAt.clearAnimation();
                childAt.startAnimation(alphaAnimation);
            }
        }
    }

    final void read(boolean z) {
        Set<ExtensionsKtkotlinModule1.MediaBrowserCompatCustomActionResultReceiver> set;
        int firstVisiblePosition = this.onSeekTo.getFirstVisiblePosition();
        for (int i = 0; i < this.onSeekTo.getChildCount(); i++) {
            View childAt = this.onSeekTo.getChildAt(i);
            ExtensionsKtkotlinModule1.MediaBrowserCompatCustomActionResultReceiver item = this.onPrepare.getItem(firstVisiblePosition + i);
            if (!z || (set = this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) == null || !set.contains(item)) {
                ((LinearLayout) childAt.findViewById(PrivateMaxEntriesMapNode.IconCompatParcelizer.volume_item_container)).setVisibility(0);
                AnimationSet animationSet = new AnimationSet(true);
                AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 1.0f);
                alphaAnimation.setDuration(0L);
                animationSet.addAnimation(alphaAnimation);
                new TranslateAnimation(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED).setDuration(0L);
                animationSet.setFillAfter(true);
                animationSet.setFillEnabled(true);
                childAt.clearAnimation();
                childAt.startAnimation(animationSet);
            }
        }
        this.onSeekTo.AudioAttributesCompatParcelizer();
        if (z) {
            return;
        }
        IconCompatParcelizer(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        /*
            Method dump skipped, instruction units count: 228
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.PrivateMaxEntriesMapWriteThroughEntry.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver():void");
    }

    final boolean MediaBrowserCompatCustomActionResultReceiver() {
        return (this.onPlayFromUri.IconCompatParcelizer() & 516) != 0;
    }

    final boolean write() {
        return (this.onPlayFromUri.IconCompatParcelizer() & 514) != 0;
    }

    final boolean AudioAttributesImplApi26Parcelizer() {
        return (this.onPlayFromUri.IconCompatParcelizer() & 1) != 0;
    }

    final boolean AudioAttributesCompatParcelizer(ExtensionsKtkotlinModule1.MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiver) {
        return this._init_lambda4 && mediaBrowserCompatCustomActionResultReceiver.onAddQueueItem() == 1;
    }

    private static int RemoteActionCompatParcelizer(View view) {
        return view.getLayoutParams().height;
    }

    static void read(View view, int i) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = i;
        view.setLayoutParams(layoutParams);
    }

    private static boolean read(Uri uri, Uri uri2) {
        if (uri == null || !uri.equals(uri2)) {
            return uri == null && uri2 == null;
        }
        return true;
    }

    final int read(int i, int i2) {
        float f;
        float f2;
        if (i >= i2) {
            f = this.onSkipToNext * i2;
            f2 = i;
        } else {
            f = this.onSkipToNext * 9.0f;
            f2 = 16.0f;
        }
        return (int) ((f / f2) + 0.5f);
    }

    final void MediaBrowserCompatMediaItem() {
        if (onAddQueueItem()) {
            IconCompatParcelizer iconCompatParcelizer = this.RatingCompat;
            if (iconCompatParcelizer != null) {
                iconCompatParcelizer.cancel(true);
            }
            IconCompatParcelizer iconCompatParcelizer2 = new IconCompatParcelizer();
            this.RatingCompat = iconCompatParcelizer2;
            iconCompatParcelizer2.execute(new Void[0]);
        }
    }

    final void RemoteActionCompatParcelizer() {
        this.MediaBrowserCompatItemReceiver = false;
        this.MediaBrowserCompatCustomActionResultReceiver = null;
        this.AudioAttributesCompatParcelizer = 0;
    }

    private boolean onAddQueueItem() {
        MediaDescriptionCompat mediaDescriptionCompat = this.MediaDescriptionCompat;
        Bitmap bitmapWrite = mediaDescriptionCompat == null ? null : mediaDescriptionCompat.write();
        MediaDescriptionCompat mediaDescriptionCompat2 = this.MediaDescriptionCompat;
        Uri uriRemoteActionCompatParcelizer = mediaDescriptionCompat2 != null ? mediaDescriptionCompat2.RemoteActionCompatParcelizer() : null;
        IconCompatParcelizer iconCompatParcelizer = this.RatingCompat;
        Bitmap bitmapAudioAttributesCompatParcelizer = iconCompatParcelizer == null ? this.AudioAttributesImplBaseParcelizer : iconCompatParcelizer.AudioAttributesCompatParcelizer();
        IconCompatParcelizer iconCompatParcelizer2 = this.RatingCompat;
        Uri uriIconCompatParcelizer = iconCompatParcelizer2 == null ? this.AudioAttributesImplApi21Parcelizer : iconCompatParcelizer2.IconCompatParcelizer();
        if (bitmapAudioAttributesCompatParcelizer != bitmapWrite) {
            return true;
        }
        return bitmapAudioAttributesCompatParcelizer == null && !read(uriIconCompatParcelizer, uriRemoteActionCompatParcelizer);
    }

    final class read extends ExtensionsKtkotlinModule1.IconCompatParcelizer {
        read() {
        }

        @Override // o.ExtensionsKtkotlinModule1.IconCompatParcelizer
        public final void AudioAttributesImplBaseParcelizer() {
            PrivateMaxEntriesMapWriteThroughEntry.this.write(false);
        }

        @Override // o.ExtensionsKtkotlinModule1.IconCompatParcelizer
        public final void AudioAttributesCompatParcelizer() {
            PrivateMaxEntriesMapWriteThroughEntry.this.write(true);
        }

        @Override // o.ExtensionsKtkotlinModule1.IconCompatParcelizer
        public final void RemoteActionCompatParcelizer(ExtensionsKtkotlinModule1.MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiver) {
            SeekBar seekBar = PrivateMaxEntriesMapWriteThroughEntry.this.onRemoveQueueItemAt.get(mediaBrowserCompatCustomActionResultReceiver);
            int iMediaDescriptionCompat = mediaBrowserCompatCustomActionResultReceiver.MediaDescriptionCompat();
            boolean z = PrivateMaxEntriesMapWriteThroughEntry.IconCompatParcelizer;
            if (seekBar == null || PrivateMaxEntriesMapWriteThroughEntry.this.onPlayFromSearch == mediaBrowserCompatCustomActionResultReceiver) {
                return;
            }
            seekBar.setProgress(iMediaDescriptionCompat);
        }
    }

    final class AudioAttributesCompatParcelizer extends MediaControllerCompat.RemoteActionCompatParcelizer {
        AudioAttributesCompatParcelizer() {
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.RemoteActionCompatParcelizer
        public final void write() {
            if (PrivateMaxEntriesMapWriteThroughEntry.this.onPause != null) {
                PrivateMaxEntriesMapWriteThroughEntry.this.onPause.IconCompatParcelizer(PrivateMaxEntriesMapWriteThroughEntry.this.MediaBrowserCompatMediaItem);
                PrivateMaxEntriesMapWriteThroughEntry.this.onPause = null;
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.RemoteActionCompatParcelizer
        public final void RemoteActionCompatParcelizer(PlaybackStateCompat playbackStateCompat) {
            PrivateMaxEntriesMapWriteThroughEntry.this.onPlayFromUri = playbackStateCompat;
            PrivateMaxEntriesMapWriteThroughEntry.this.write(false);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.RemoteActionCompatParcelizer
        public final void write(MediaMetadataCompat mediaMetadataCompat) {
            PrivateMaxEntriesMapWriteThroughEntry.this.MediaDescriptionCompat = mediaMetadataCompat == null ? null : mediaMetadataCompat.write();
            PrivateMaxEntriesMapWriteThroughEntry.this.MediaBrowserCompatMediaItem();
            PrivateMaxEntriesMapWriteThroughEntry.this.write(false);
        }
    }

    final class RemoteActionCompatParcelizer implements View.OnClickListener {
        RemoteActionCompatParcelizer() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            int id = view.getId();
            if (id == 16908313 || id == 16908314) {
                if (PrivateMaxEntriesMapWriteThroughEntry.this.onFastForward.onFastForward()) {
                    ExtensionsKtkotlinModule1 extensionsKtkotlinModule1 = PrivateMaxEntriesMapWriteThroughEntry.this.onPrepareFromMediaId;
                    ExtensionsKtkotlinModule1.write(id == 16908313 ? 2 : 1);
                }
                PrivateMaxEntriesMapWriteThroughEntry.this.dismiss();
                return;
            }
            if (id == PrivateMaxEntriesMapNode.IconCompatParcelizer.mr_control_playback_ctrl) {
                if (PrivateMaxEntriesMapWriteThroughEntry.this.onPause == null || PrivateMaxEntriesMapWriteThroughEntry.this.onPlayFromUri == null) {
                    return;
                }
                int i = 0;
                int i2 = PrivateMaxEntriesMapWriteThroughEntry.this.onPlayFromUri.AudioAttributesImplBaseParcelizer() != 3 ? 0 : 1;
                if (i2 != 0 && PrivateMaxEntriesMapWriteThroughEntry.this.write()) {
                    PrivateMaxEntriesMapWriteThroughEntry.this.onPause.RemoteActionCompatParcelizer().RemoteActionCompatParcelizer();
                    i = PrivateMaxEntriesMapNode.MediaBrowserCompatItemReceiver.mr_controller_pause;
                } else if (i2 != 0 && PrivateMaxEntriesMapWriteThroughEntry.this.AudioAttributesImplApi26Parcelizer()) {
                    PrivateMaxEntriesMapWriteThroughEntry.this.onPause.RemoteActionCompatParcelizer().IconCompatParcelizer();
                    i = PrivateMaxEntriesMapNode.MediaBrowserCompatItemReceiver.mr_controller_stop;
                } else if (i2 == 0 && PrivateMaxEntriesMapWriteThroughEntry.this.MediaBrowserCompatCustomActionResultReceiver()) {
                    PrivateMaxEntriesMapWriteThroughEntry.this.onPause.RemoteActionCompatParcelizer().AudioAttributesCompatParcelizer();
                    i = PrivateMaxEntriesMapNode.MediaBrowserCompatItemReceiver.mr_controller_play;
                }
                if (PrivateMaxEntriesMapWriteThroughEntry.this.RemoteActionCompatParcelizer == null || !PrivateMaxEntriesMapWriteThroughEntry.this.RemoteActionCompatParcelizer.isEnabled() || i == 0) {
                    return;
                }
                AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(16384);
                accessibilityEventObtain.setPackageName(PrivateMaxEntriesMapWriteThroughEntry.this.AudioAttributesImplApi26Parcelizer.getPackageName());
                accessibilityEventObtain.setClassName(getClass().getName());
                accessibilityEventObtain.getText().add(PrivateMaxEntriesMapWriteThroughEntry.this.AudioAttributesImplApi26Parcelizer.getString(i));
                PrivateMaxEntriesMapWriteThroughEntry.this.RemoteActionCompatParcelizer.sendAccessibilityEvent(accessibilityEventObtain);
                return;
            }
            if (id == PrivateMaxEntriesMapNode.IconCompatParcelizer.mr_close) {
                PrivateMaxEntriesMapWriteThroughEntry.this.dismiss();
            }
        }
    }

    class write implements SeekBar.OnSeekBarChangeListener {
        private final Runnable write = new Runnable() { // from class: o.PrivateMaxEntriesMapWriteThroughEntry.write.3
            @Override // java.lang.Runnable
            public final void run() {
                if (PrivateMaxEntriesMapWriteThroughEntry.this.onPlayFromSearch != null) {
                    PrivateMaxEntriesMapWriteThroughEntry.this.onPlayFromSearch = null;
                    if (PrivateMaxEntriesMapWriteThroughEntry.this.handleMediaPlayPauseIfPendingOnHandler) {
                        PrivateMaxEntriesMapWriteThroughEntry.this.write(PrivateMaxEntriesMapWriteThroughEntry.this.onPlay);
                    }
                }
            }
        };

        write() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onStartTrackingTouch(SeekBar seekBar) {
            if (PrivateMaxEntriesMapWriteThroughEntry.this.onPlayFromSearch != null) {
                PrivateMaxEntriesMapWriteThroughEntry.this.onRemoveQueueItem.removeCallbacks(this.write);
            }
            PrivateMaxEntriesMapWriteThroughEntry.this.onPlayFromSearch = (ExtensionsKtkotlinModule1.MediaBrowserCompatCustomActionResultReceiver) seekBar.getTag();
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onStopTrackingTouch(SeekBar seekBar) {
            PrivateMaxEntriesMapWriteThroughEntry.this.onRemoveQueueItem.postDelayed(this.write, 500L);
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            if (z) {
                ExtensionsKtkotlinModule1.MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiver = (ExtensionsKtkotlinModule1.MediaBrowserCompatCustomActionResultReceiver) seekBar.getTag();
                boolean z2 = PrivateMaxEntriesMapWriteThroughEntry.IconCompatParcelizer;
                mediaBrowserCompatCustomActionResultReceiver.AudioAttributesCompatParcelizer(i);
            }
        }
    }

    class MediaBrowserCompatCustomActionResultReceiver extends ArrayAdapter<ExtensionsKtkotlinModule1.MediaBrowserCompatCustomActionResultReceiver> {
        final float AudioAttributesCompatParcelizer;

        @Override // android.widget.BaseAdapter, android.widget.ListAdapter
        public final boolean isEnabled(int i) {
            return false;
        }

        public MediaBrowserCompatCustomActionResultReceiver(Context context, List<ExtensionsKtkotlinModule1.MediaBrowserCompatCustomActionResultReceiver> list) {
            super(context, 0, list);
            this.AudioAttributesCompatParcelizer = getAccessible.AudioAttributesCompatParcelizer(context);
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public final View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                view = LayoutInflater.from(viewGroup.getContext()).inflate(PrivateMaxEntriesMapNode.MediaBrowserCompatCustomActionResultReceiver.mr_controller_volume_item, viewGroup, false);
            } else {
                PrivateMaxEntriesMapWriteThroughEntry.this.write(view);
            }
            ExtensionsKtkotlinModule1.MediaBrowserCompatCustomActionResultReceiver item = getItem(i);
            if (item != null) {
                boolean zOnMediaButtonEvent = item.onMediaButtonEvent();
                TextView textView = (TextView) view.findViewById(PrivateMaxEntriesMapNode.IconCompatParcelizer.mr_name);
                textView.setEnabled(zOnMediaButtonEvent);
                textView.setText(item.AudioAttributesImplBaseParcelizer());
                MediaRouteVolumeSlider mediaRouteVolumeSlider = (MediaRouteVolumeSlider) view.findViewById(PrivateMaxEntriesMapNode.IconCompatParcelizer.mr_volume_slider);
                getAccessible.read(viewGroup.getContext(), mediaRouteVolumeSlider, PrivateMaxEntriesMapWriteThroughEntry.this.onSeekTo);
                mediaRouteVolumeSlider.setTag(item);
                PrivateMaxEntriesMapWriteThroughEntry.this.onRemoveQueueItemAt.put(item, mediaRouteVolumeSlider);
                mediaRouteVolumeSlider.setHideThumb(!zOnMediaButtonEvent);
                mediaRouteVolumeSlider.setEnabled(zOnMediaButtonEvent);
                if (zOnMediaButtonEvent) {
                    if (PrivateMaxEntriesMapWriteThroughEntry.this.AudioAttributesCompatParcelizer(item)) {
                        mediaRouteVolumeSlider.setMax(item.onCommand());
                        mediaRouteVolumeSlider.setProgress(item.MediaDescriptionCompat());
                        mediaRouteVolumeSlider.setOnSeekBarChangeListener(PrivateMaxEntriesMapWriteThroughEntry.this.onPrepareFromSearch);
                    } else {
                        mediaRouteVolumeSlider.setMax(100);
                        mediaRouteVolumeSlider.setProgress(100);
                        mediaRouteVolumeSlider.setEnabled(false);
                    }
                }
                ((ImageView) view.findViewById(PrivateMaxEntriesMapNode.IconCompatParcelizer.mr_volume_item_icon)).setAlpha(zOnMediaButtonEvent ? 255 : (int) (this.AudioAttributesCompatParcelizer * 255.0f));
                ((LinearLayout) view.findViewById(PrivateMaxEntriesMapNode.IconCompatParcelizer.volume_item_container)).setVisibility(PrivateMaxEntriesMapWriteThroughEntry.this.onCustomAction.contains(item) ? 4 : 0);
                if (PrivateMaxEntriesMapWriteThroughEntry.this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver != null && PrivateMaxEntriesMapWriteThroughEntry.this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.contains(item)) {
                    AlphaAnimation alphaAnimation = new AlphaAnimation(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
                    alphaAnimation.setDuration(0L);
                    alphaAnimation.setFillEnabled(true);
                    alphaAnimation.setFillAfter(true);
                    view.clearAnimation();
                    view.startAnimation(alphaAnimation);
                }
            }
            return view;
        }
    }

    class IconCompatParcelizer extends AsyncTask<Void, Void, Bitmap> {
        private final Uri AudioAttributesCompatParcelizer;
        private int RemoteActionCompatParcelizer;
        private long read;
        private final Bitmap write;

        @Override // android.os.AsyncTask
        protected final /* synthetic */ Bitmap doInBackground(Void[] voidArr) {
            return write();
        }

        IconCompatParcelizer() {
            Bitmap bitmapWrite = PrivateMaxEntriesMapWriteThroughEntry.this.MediaDescriptionCompat == null ? null : PrivateMaxEntriesMapWriteThroughEntry.this.MediaDescriptionCompat.write();
            this.write = PrivateMaxEntriesMapWriteThroughEntry.IconCompatParcelizer(bitmapWrite) ? null : bitmapWrite;
            this.AudioAttributesCompatParcelizer = PrivateMaxEntriesMapWriteThroughEntry.this.MediaDescriptionCompat != null ? PrivateMaxEntriesMapWriteThroughEntry.this.MediaDescriptionCompat.RemoteActionCompatParcelizer() : null;
        }

        public final Bitmap AudioAttributesCompatParcelizer() {
            return this.write;
        }

        public final Uri IconCompatParcelizer() {
            return this.AudioAttributesCompatParcelizer;
        }

        @Override // android.os.AsyncTask
        protected final void onPreExecute() {
            this.read = SystemClock.uptimeMillis();
            PrivateMaxEntriesMapWriteThroughEntry.this.RemoteActionCompatParcelizer();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0 */
        /* JADX WARN: Type inference failed for: r1v8 */
        /* JADX WARN: Type inference failed for: r1v9, types: [java.io.InputStream] */
        private Bitmap write() throws Throwable {
            InputStream inputStreamWrite;
            Bitmap bitmap = this.write;
            ?? r1 = 0;
            if (bitmap == null) {
                Uri uri = this.AudioAttributesCompatParcelizer;
                try {
                    if (uri != null) {
                        try {
                            inputStreamWrite = write(uri);
                            try {
                                if (inputStreamWrite == null) {
                                    Objects.toString(this.AudioAttributesCompatParcelizer);
                                    if (inputStreamWrite != null) {
                                        try {
                                            inputStreamWrite.close();
                                        } catch (IOException unused) {
                                        }
                                    }
                                    return null;
                                }
                                BitmapFactory.Options options = new BitmapFactory.Options();
                                options.inJustDecodeBounds = true;
                                BitmapFactory.decodeStream(inputStreamWrite, null, options);
                                if (options.outWidth == 0 || options.outHeight == 0) {
                                    if (inputStreamWrite != null) {
                                        try {
                                            inputStreamWrite.close();
                                        } catch (IOException unused2) {
                                        }
                                    }
                                    return null;
                                }
                                try {
                                    inputStreamWrite.reset();
                                } catch (IOException unused3) {
                                    inputStreamWrite.close();
                                    inputStreamWrite = write(this.AudioAttributesCompatParcelizer);
                                    if (inputStreamWrite == null) {
                                        Objects.toString(this.AudioAttributesCompatParcelizer);
                                        if (inputStreamWrite != null) {
                                            try {
                                                inputStreamWrite.close();
                                            } catch (IOException unused4) {
                                            }
                                        }
                                        return null;
                                    }
                                }
                                options.inJustDecodeBounds = false;
                                options.inSampleSize = Math.max(1, Integer.highestOneBit(options.outHeight / PrivateMaxEntriesMapWriteThroughEntry.this.read(options.outWidth, options.outHeight)));
                                if (isCancelled()) {
                                    if (inputStreamWrite != null) {
                                        try {
                                            inputStreamWrite.close();
                                        } catch (IOException unused5) {
                                        }
                                    }
                                    return null;
                                }
                                Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamWrite, null, options);
                                if (inputStreamWrite != null) {
                                    try {
                                        inputStreamWrite.close();
                                    } catch (IOException unused6) {
                                    }
                                }
                                bitmap = bitmapDecodeStream;
                            } catch (IOException unused7) {
                                Objects.toString(this.AudioAttributesCompatParcelizer);
                                if (inputStreamWrite != null) {
                                    try {
                                        inputStreamWrite.close();
                                    } catch (IOException unused8) {
                                    }
                                }
                                bitmap = null;
                            }
                        } catch (IOException unused9) {
                            inputStreamWrite = null;
                        } catch (Throwable th) {
                            th = th;
                            if (r1 != 0) {
                                try {
                                    r1.close();
                                } catch (IOException unused10) {
                                }
                            }
                            throw th;
                        }
                    } else {
                        bitmap = null;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    r1 = uri;
                }
            }
            if (PrivateMaxEntriesMapWriteThroughEntry.IconCompatParcelizer(bitmap)) {
                Objects.toString(bitmap);
                return null;
            }
            if (bitmap != null && bitmap.getWidth() < bitmap.getHeight()) {
                ReflectionCache reflectionCache = new ReflectionCache.write(bitmap).IconCompatParcelizer().read();
                this.RemoteActionCompatParcelizer = reflectionCache.write().isEmpty() ? 0 : reflectionCache.write().get(0).AudioAttributesCompatParcelizer();
            }
            return bitmap;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Bitmap bitmap) {
            PrivateMaxEntriesMapWriteThroughEntry.this.RatingCompat = null;
            if (configureFromStringCreator.RemoteActionCompatParcelizer(PrivateMaxEntriesMapWriteThroughEntry.this.AudioAttributesImplBaseParcelizer, this.write) && configureFromStringCreator.RemoteActionCompatParcelizer(PrivateMaxEntriesMapWriteThroughEntry.this.AudioAttributesImplApi21Parcelizer, this.AudioAttributesCompatParcelizer)) {
                return;
            }
            PrivateMaxEntriesMapWriteThroughEntry.this.AudioAttributesImplBaseParcelizer = this.write;
            PrivateMaxEntriesMapWriteThroughEntry.this.MediaBrowserCompatCustomActionResultReceiver = bitmap;
            PrivateMaxEntriesMapWriteThroughEntry.this.AudioAttributesImplApi21Parcelizer = this.AudioAttributesCompatParcelizer;
            PrivateMaxEntriesMapWriteThroughEntry.this.AudioAttributesCompatParcelizer = this.RemoteActionCompatParcelizer;
            PrivateMaxEntriesMapWriteThroughEntry.this.MediaBrowserCompatItemReceiver = true;
            PrivateMaxEntriesMapWriteThroughEntry.this.write(SystemClock.uptimeMillis() - this.read > 120);
        }

        private InputStream write(Uri uri) throws IOException {
            InputStream inputStreamOpenInputStream;
            String lowerCase = uri.getScheme().toLowerCase();
            if ("android.resource".equals(lowerCase) || "content".equals(lowerCase) || "file".equals(lowerCase)) {
                inputStreamOpenInputStream = PrivateMaxEntriesMapWriteThroughEntry.this.AudioAttributesImplApi26Parcelizer.getContentResolver().openInputStream(uri);
            } else {
                URLConnection uRLConnection = (URLConnection) getAvcProfileAndLevel.read(new URL(uri.toString()).openConnection());
                uRLConnection.setConnectTimeout(PrivateMaxEntriesMapWriteThroughEntry.read);
                uRLConnection.setReadTimeout(PrivateMaxEntriesMapWriteThroughEntry.read);
                inputStreamOpenInputStream = uRLConnection.getInputStream();
            }
            if (inputStreamOpenInputStream == null) {
                return null;
            }
            return new BufferedInputStream(inputStreamOpenInputStream);
        }
    }
}
