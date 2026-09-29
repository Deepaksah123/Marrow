package androidx.media3.ui;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.exoplayer2.C;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Formatter;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.AsPropertyTypeSerializer;
import kotlin.LaissezFaireSubTypeValidator;
import kotlin.PolymorphicTypeValidator;
import kotlin.PrivateMaxEntriesMapRemovalTask;
import kotlin.buildTypeSerializer;
import kotlin.isSafeSubType;
import kotlin.isUnsafeBaseType;
import kotlin.maximumCapacity;

/* JADX INFO: loaded from: classes4.dex */
public class LegacyPlayerControlView extends FrameLayout {
    private final AudioAttributesCompatParcelizer AudioAttributesCompatParcelizer;
    private long[] AudioAttributesImplApi21Parcelizer;
    private long AudioAttributesImplApi26Parcelizer;
    private final TextView AudioAttributesImplBaseParcelizer;
    private final float IconCompatParcelizer;
    private long MediaBrowserCompatCustomActionResultReceiver;
    private boolean[] MediaBrowserCompatItemReceiver;
    private final Runnable MediaBrowserCompatMediaItem;
    private long MediaBrowserCompatSearchResultReceiver;
    private boolean MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    private final StringBuilder MediaDescriptionCompat;
    private final Formatter MediaMetadataCompat;
    private final PrivateMaxEntriesMapRemovalTask MediaSessionCompatQueueItem;
    private final String MediaSessionCompatResultReceiverWrapper;
    private final Drawable MediaSessionCompatToken;
    private final String ParcelableVolumeInfo;
    private final Drawable PlaybackStateCompat;
    private final CopyOnWriteArrayList<IconCompatParcelizer> PlaybackStateCompatCustomAction;
    private final View RatingCompat;
    private long[] RemoteActionCompatParcelizer;
    private final PolymorphicTypeValidator.IconCompatParcelizer ResultReceiver;
    private final View handleMediaPlayPauseIfPendingOnHandler;
    private final PolymorphicTypeValidator.AudioAttributesCompatParcelizer onAddQueueItem;
    private final View onCommand;
    private boolean onCustomAction;
    private isUnsafeBaseType onFastForward;
    private final TextView onMediaButtonEvent;
    private final View onPause;
    private boolean[] onPlay;
    private final View onPlayFromMediaId;
    private final Drawable onPlayFromSearch;
    private write onPlayFromUri;
    private final Drawable onPrepare;
    private final String onPrepareFromMediaId;
    private final String onPrepareFromSearch;
    private final View onPrepareFromUri;
    private final ImageView onRemoveQueueItem;
    private int onRemoveQueueItemAt;
    private final String onRewind;
    private final Drawable onSeekTo;
    private boolean onSetCaptioningEnabled;
    private boolean onSetPlaybackSpeed;
    private boolean onSetRating;
    private boolean onSetRepeatMode;
    private boolean onSetShuffleMode;
    private final ImageView onSkipToNext;
    private boolean onSkipToPrevious;
    private boolean onSkipToQueueItem;
    private int onStop;
    private final Runnable r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw;
    private int r8lambdaKUbBm7ckfqTc9QCgukC86fguu4;
    private final View r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
    private final float read;
    private boolean setSessionImpl;
    private long write;

    public interface IconCompatParcelizer {
    }

    public interface write {
    }

    private static boolean AudioAttributesCompatParcelizer(int i) {
        return i == 90 || i == 89 || i == 85 || i == 79 || i == 126 || i == 127 || i == 87 || i == 88;
    }

    static {
        isSafeSubType.AudioAttributesCompatParcelizer("media3.ui");
    }

    public LegacyPlayerControlView(Context context) {
        this(context, null);
    }

    public LegacyPlayerControlView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LegacyPlayerControlView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, attributeSet);
    }

    private LegacyPlayerControlView(Context context, AttributeSet attributeSet, int i, AttributeSet attributeSet2) {
        super(context, attributeSet, i);
        int resourceId = maximumCapacity.AudioAttributesImplApi21Parcelizer.exo_legacy_player_control_view;
        this.onSetCaptioningEnabled = true;
        this.onStop = 5000;
        byte b = 0;
        this.onRemoveQueueItemAt = 0;
        this.r8lambdaKUbBm7ckfqTc9QCgukC86fguu4 = 200;
        this.MediaBrowserCompatSearchResultReceiver = C.TIME_UNSET;
        this.onSkipToPrevious = true;
        this.onSetPlaybackSpeed = true;
        this.onSkipToQueueItem = true;
        this.onSetRepeatMode = true;
        this.setSessionImpl = false;
        if (attributeSet2 != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet2, maximumCapacity.MediaDescriptionCompat.LegacyPlayerControlView, i, 0);
            try {
                this.onStop = typedArrayObtainStyledAttributes.getInt(maximumCapacity.MediaDescriptionCompat.LegacyPlayerControlView_show_timeout, this.onStop);
                resourceId = typedArrayObtainStyledAttributes.getResourceId(maximumCapacity.MediaDescriptionCompat.LegacyPlayerControlView_controller_layout_id, resourceId);
                this.onRemoveQueueItemAt = AudioAttributesCompatParcelizer(typedArrayObtainStyledAttributes, this.onRemoveQueueItemAt);
                this.onSkipToPrevious = typedArrayObtainStyledAttributes.getBoolean(maximumCapacity.MediaDescriptionCompat.LegacyPlayerControlView_show_rewind_button, this.onSkipToPrevious);
                this.onSetPlaybackSpeed = typedArrayObtainStyledAttributes.getBoolean(maximumCapacity.MediaDescriptionCompat.LegacyPlayerControlView_show_fastforward_button, this.onSetPlaybackSpeed);
                this.onSkipToQueueItem = typedArrayObtainStyledAttributes.getBoolean(maximumCapacity.MediaDescriptionCompat.LegacyPlayerControlView_show_previous_button, this.onSkipToQueueItem);
                this.onSetRepeatMode = typedArrayObtainStyledAttributes.getBoolean(maximumCapacity.MediaDescriptionCompat.LegacyPlayerControlView_show_next_button, this.onSetRepeatMode);
                this.setSessionImpl = typedArrayObtainStyledAttributes.getBoolean(maximumCapacity.MediaDescriptionCompat.LegacyPlayerControlView_show_shuffle_button, this.setSessionImpl);
                setTimeBarMinUpdateInterval(typedArrayObtainStyledAttributes.getInt(maximumCapacity.MediaDescriptionCompat.LegacyPlayerControlView_time_bar_min_update_interval, this.r8lambdaKUbBm7ckfqTc9QCgukC86fguu4));
            } finally {
                typedArrayObtainStyledAttributes.recycle();
            }
        }
        this.PlaybackStateCompatCustomAction = new CopyOnWriteArrayList<>();
        this.onAddQueueItem = new PolymorphicTypeValidator.AudioAttributesCompatParcelizer();
        this.ResultReceiver = new PolymorphicTypeValidator.IconCompatParcelizer();
        StringBuilder sb = new StringBuilder();
        this.MediaDescriptionCompat = sb;
        this.MediaMetadataCompat = new Formatter(sb, Locale.getDefault());
        this.RemoteActionCompatParcelizer = new long[0];
        this.onPlay = new boolean[0];
        this.AudioAttributesImplApi21Parcelizer = new long[0];
        this.MediaBrowserCompatItemReceiver = new boolean[0];
        AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = new AudioAttributesCompatParcelizer(this, b);
        this.AudioAttributesCompatParcelizer = audioAttributesCompatParcelizer;
        this.r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw = new Runnable() { // from class: o.checkState
            @Override // java.lang.Runnable
            public final void run() {
                this.write.MediaBrowserCompatItemReceiver();
            }
        };
        this.MediaBrowserCompatMediaItem = new Runnable() { // from class: o.containsKey
            @Override // java.lang.Runnable
            public final void run() {
                this.AudioAttributesCompatParcelizer.IconCompatParcelizer();
            }
        };
        LayoutInflater.from(context).inflate(resourceId, this);
        setDescendantFocusability(262144);
        PrivateMaxEntriesMapRemovalTask privateMaxEntriesMapRemovalTask = (PrivateMaxEntriesMapRemovalTask) findViewById(maximumCapacity.AudioAttributesImplBaseParcelizer.exo_progress);
        View viewFindViewById = findViewById(maximumCapacity.AudioAttributesImplBaseParcelizer.exo_progress_placeholder);
        if (privateMaxEntriesMapRemovalTask != null) {
            this.MediaSessionCompatQueueItem = privateMaxEntriesMapRemovalTask;
        } else if (viewFindViewById != null) {
            DefaultTimeBar defaultTimeBar = new DefaultTimeBar(context, null, 0, attributeSet2);
            defaultTimeBar.setId(maximumCapacity.AudioAttributesImplBaseParcelizer.exo_progress);
            defaultTimeBar.setLayoutParams(viewFindViewById.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) viewFindViewById.getParent();
            int iIndexOfChild = viewGroup.indexOfChild(viewFindViewById);
            viewGroup.removeView(viewFindViewById);
            viewGroup.addView(defaultTimeBar, iIndexOfChild);
            this.MediaSessionCompatQueueItem = defaultTimeBar;
        } else {
            this.MediaSessionCompatQueueItem = null;
        }
        this.AudioAttributesImplBaseParcelizer = (TextView) findViewById(maximumCapacity.AudioAttributesImplBaseParcelizer.exo_duration);
        this.onMediaButtonEvent = (TextView) findViewById(maximumCapacity.AudioAttributesImplBaseParcelizer.exo_position);
        PrivateMaxEntriesMapRemovalTask privateMaxEntriesMapRemovalTask2 = this.MediaSessionCompatQueueItem;
        if (privateMaxEntriesMapRemovalTask2 != null) {
            privateMaxEntriesMapRemovalTask2.read(audioAttributesCompatParcelizer);
        }
        View viewFindViewById2 = findViewById(maximumCapacity.AudioAttributesImplBaseParcelizer.exo_play);
        this.onPause = viewFindViewById2;
        if (viewFindViewById2 != null) {
            viewFindViewById2.setOnClickListener(audioAttributesCompatParcelizer);
        }
        View viewFindViewById3 = findViewById(maximumCapacity.AudioAttributesImplBaseParcelizer.exo_pause);
        this.onCommand = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.setOnClickListener(audioAttributesCompatParcelizer);
        }
        View viewFindViewById4 = findViewById(maximumCapacity.AudioAttributesImplBaseParcelizer.exo_prev);
        this.onPlayFromMediaId = viewFindViewById4;
        if (viewFindViewById4 != null) {
            viewFindViewById4.setOnClickListener(audioAttributesCompatParcelizer);
        }
        View viewFindViewById5 = findViewById(maximumCapacity.AudioAttributesImplBaseParcelizer.exo_next);
        this.handleMediaPlayPauseIfPendingOnHandler = viewFindViewById5;
        if (viewFindViewById5 != null) {
            viewFindViewById5.setOnClickListener(audioAttributesCompatParcelizer);
        }
        View viewFindViewById6 = findViewById(maximumCapacity.AudioAttributesImplBaseParcelizer.exo_rew);
        this.onPrepareFromUri = viewFindViewById6;
        if (viewFindViewById6 != null) {
            viewFindViewById6.setOnClickListener(audioAttributesCompatParcelizer);
        }
        View viewFindViewById7 = findViewById(maximumCapacity.AudioAttributesImplBaseParcelizer.exo_ffwd);
        this.RatingCompat = viewFindViewById7;
        if (viewFindViewById7 != null) {
            viewFindViewById7.setOnClickListener(audioAttributesCompatParcelizer);
        }
        ImageView imageView = (ImageView) findViewById(maximumCapacity.AudioAttributesImplBaseParcelizer.exo_repeat_toggle);
        this.onRemoveQueueItem = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(audioAttributesCompatParcelizer);
        }
        ImageView imageView2 = (ImageView) findViewById(maximumCapacity.AudioAttributesImplBaseParcelizer.exo_shuffle);
        this.onSkipToNext = imageView2;
        if (imageView2 != null) {
            imageView2.setOnClickListener(audioAttributesCompatParcelizer);
        }
        View viewFindViewById8 = findViewById(maximumCapacity.AudioAttributesImplBaseParcelizer.exo_vr);
        this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = viewFindViewById8;
        setShowVrButton(false);
        RemoteActionCompatParcelizer(false, false, viewFindViewById8);
        Resources resources = context.getResources();
        this.IconCompatParcelizer = resources.getInteger(maximumCapacity.MediaBrowserCompatItemReceiver.exo_media_button_opacity_percentage_enabled) / 100.0f;
        this.read = resources.getInteger(maximumCapacity.MediaBrowserCompatItemReceiver.exo_media_button_opacity_percentage_disabled) / 100.0f;
        this.onPrepare = LaissezFaireSubTypeValidator.read(context, resources, maximumCapacity.write.exo_legacy_controls_repeat_off);
        this.onSeekTo = LaissezFaireSubTypeValidator.read(context, resources, maximumCapacity.write.exo_legacy_controls_repeat_one);
        this.onPlayFromSearch = LaissezFaireSubTypeValidator.read(context, resources, maximumCapacity.write.exo_legacy_controls_repeat_all);
        this.PlaybackStateCompat = LaissezFaireSubTypeValidator.read(context, resources, maximumCapacity.write.exo_legacy_controls_shuffle_on);
        this.MediaSessionCompatToken = LaissezFaireSubTypeValidator.read(context, resources, maximumCapacity.write.exo_legacy_controls_shuffle_off);
        this.onPrepareFromSearch = resources.getString(maximumCapacity.MediaBrowserCompatCustomActionResultReceiver.exo_controls_repeat_off_description);
        this.onRewind = resources.getString(maximumCapacity.MediaBrowserCompatCustomActionResultReceiver.exo_controls_repeat_one_description);
        this.onPrepareFromMediaId = resources.getString(maximumCapacity.MediaBrowserCompatCustomActionResultReceiver.exo_controls_repeat_all_description);
        this.ParcelableVolumeInfo = resources.getString(maximumCapacity.MediaBrowserCompatCustomActionResultReceiver.exo_controls_shuffle_on_description);
        this.MediaSessionCompatResultReceiverWrapper = resources.getString(maximumCapacity.MediaBrowserCompatCustomActionResultReceiver.exo_controls_shuffle_off_description);
        this.AudioAttributesImplApi26Parcelizer = C.TIME_UNSET;
        this.write = C.TIME_UNSET;
    }

    public void setPlayer(isUnsafeBaseType isunsafebasetype) {
        buildTypeSerializer.write(Looper.myLooper() == Looper.getMainLooper());
        buildTypeSerializer.IconCompatParcelizer(isunsafebasetype == null || isunsafebasetype.onCommand() == Looper.getMainLooper());
        isUnsafeBaseType isunsafebasetype2 = this.onFastForward;
        if (isunsafebasetype2 == isunsafebasetype) {
            return;
        }
        if (isunsafebasetype2 != null) {
            isunsafebasetype2.write(this.AudioAttributesCompatParcelizer);
        }
        this.onFastForward = isunsafebasetype;
        if (isunsafebasetype != null) {
            isunsafebasetype.read(this.AudioAttributesCompatParcelizer);
        }
        write();
    }

    @Deprecated
    public void setShowMultiWindowTimeBar(boolean z) {
        this.onSetRating = z;
        MediaMetadataCompat();
    }

    public void setShowPlayButtonIfPlaybackIsSuppressed(boolean z) {
        this.onSetCaptioningEnabled = z;
        AudioAttributesImplApi26Parcelizer();
    }

    public void setExtraAdGroupMarkers(long[] jArr, boolean[] zArr) {
        if (jArr == null) {
            this.AudioAttributesImplApi21Parcelizer = new long[0];
            this.MediaBrowserCompatItemReceiver = new boolean[0];
        } else {
            boolean[] zArr2 = (boolean[]) buildTypeSerializer.IconCompatParcelizer(zArr);
            buildTypeSerializer.IconCompatParcelizer(jArr.length == zArr2.length);
            this.AudioAttributesImplApi21Parcelizer = jArr;
            this.MediaBrowserCompatItemReceiver = zArr2;
        }
        MediaMetadataCompat();
    }

    public void setProgressUpdateListener(write writeVar) {
        this.onPlayFromUri = writeVar;
    }

    public void setShowRewindButton(boolean z) {
        this.onSkipToPrevious = z;
        AudioAttributesImplApi21Parcelizer();
    }

    public void setShowFastForwardButton(boolean z) {
        this.onSetPlaybackSpeed = z;
        AudioAttributesImplApi21Parcelizer();
    }

    public void setShowPreviousButton(boolean z) {
        this.onSkipToQueueItem = z;
        AudioAttributesImplApi21Parcelizer();
    }

    public void setShowNextButton(boolean z) {
        this.onSetRepeatMode = z;
        AudioAttributesImplApi21Parcelizer();
    }

    public void setShowTimeoutMs(int i) {
        this.onStop = i;
        if (MediaBrowserCompatMediaItem()) {
            AudioAttributesCompatParcelizer();
        }
    }

    public void setRepeatToggleModes(int i) {
        this.onRemoveQueueItemAt = i;
        isUnsafeBaseType isunsafebasetype = this.onFastForward;
        if (isunsafebasetype != null) {
            int iOnSetShuffleMode = isunsafebasetype.onSetShuffleMode();
            if (i == 0 && iOnSetShuffleMode != 0) {
                this.onFastForward.IconCompatParcelizer(0);
            } else if (i == 1 && iOnSetShuffleMode == 2) {
                this.onFastForward.IconCompatParcelizer(1);
            } else if (i == 2 && iOnSetShuffleMode == 1) {
                this.onFastForward.IconCompatParcelizer(2);
            }
        }
        AudioAttributesImplBaseParcelizer();
    }

    public void setShowShuffleButton(boolean z) {
        this.setSessionImpl = z;
        MediaBrowserCompatCustomActionResultReceiver();
    }

    private boolean MediaBrowserCompatSearchResultReceiver() {
        View view = this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
        return view != null && view.getVisibility() == 0;
    }

    public void setShowVrButton(boolean z) {
        View view = this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
        if (view != null) {
            view.setVisibility(z ? 0 : 8);
        }
    }

    public void setVrButtonListener(View.OnClickListener onClickListener) {
        View view = this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
        if (view != null) {
            view.setOnClickListener(onClickListener);
            RemoteActionCompatParcelizer(MediaBrowserCompatSearchResultReceiver(), onClickListener != null, this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM);
        }
    }

    public void setTimeBarMinUpdateInterval(int i) {
        this.r8lambdaKUbBm7ckfqTc9QCgukC86fguu4 = LaissezFaireSubTypeValidator.write(i, 16, 1000);
    }

    public final void IconCompatParcelizer() {
        if (MediaBrowserCompatMediaItem()) {
            setVisibility(8);
            for (IconCompatParcelizer iconCompatParcelizer : this.PlaybackStateCompatCustomAction) {
                getVisibility();
            }
            removeCallbacks(this.r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw);
            removeCallbacks(this.MediaBrowserCompatMediaItem);
            this.MediaBrowserCompatSearchResultReceiver = C.TIME_UNSET;
        }
    }

    private boolean MediaBrowserCompatMediaItem() {
        return getVisibility() == 0;
    }

    private void AudioAttributesCompatParcelizer() {
        removeCallbacks(this.MediaBrowserCompatMediaItem);
        if (this.onStop > 0) {
            long jUptimeMillis = SystemClock.uptimeMillis();
            long j = this.onStop;
            this.MediaBrowserCompatSearchResultReceiver = jUptimeMillis + j;
            if (this.onCustomAction) {
                postDelayed(this.MediaBrowserCompatMediaItem, j);
                return;
            }
            return;
        }
        this.MediaBrowserCompatSearchResultReceiver = C.TIME_UNSET;
    }

    private void write() {
        AudioAttributesImplApi26Parcelizer();
        AudioAttributesImplApi21Parcelizer();
        AudioAttributesImplBaseParcelizer();
        MediaBrowserCompatCustomActionResultReceiver();
        MediaMetadataCompat();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void AudioAttributesImplApi26Parcelizer() {
        boolean z;
        boolean z2;
        if (MediaBrowserCompatMediaItem() && this.onCustomAction) {
            boolean zRemoteActionCompatParcelizer = LaissezFaireSubTypeValidator.RemoteActionCompatParcelizer(this.onFastForward, this.onSetCaptioningEnabled);
            View view = this.onPause;
            boolean z3 = true;
            if (view != null) {
                z = !zRemoteActionCompatParcelizer && view.isFocused();
                if (LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver < 21) {
                    z2 = z;
                } else {
                    z2 = !zRemoteActionCompatParcelizer && RemoteActionCompatParcelizer.IconCompatParcelizer(this.onPause);
                }
                this.onPause.setVisibility(zRemoteActionCompatParcelizer ? 0 : 8);
            } else {
                z = false;
                z2 = false;
            }
            View view2 = this.onCommand;
            if (view2 != null) {
                z |= zRemoteActionCompatParcelizer && view2.isFocused();
                if (LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver < 21) {
                    z3 = z;
                } else if (!zRemoteActionCompatParcelizer || !RemoteActionCompatParcelizer.IconCompatParcelizer(this.onCommand)) {
                    z3 = false;
                }
                z2 |= z3;
                this.onCommand.setVisibility(zRemoteActionCompatParcelizer ? 8 : 0);
            }
            if (z) {
                read();
            }
            if (z2) {
                RemoteActionCompatParcelizer();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void AudioAttributesImplApi21Parcelizer() {
        boolean zWrite;
        boolean zWrite2;
        boolean zWrite3;
        boolean zWrite4;
        boolean zWrite5;
        if (MediaBrowserCompatMediaItem() && this.onCustomAction) {
            isUnsafeBaseType isunsafebasetype = this.onFastForward;
            if (isunsafebasetype != null) {
                zWrite = isunsafebasetype.write(5);
                zWrite3 = isunsafebasetype.write(7);
                zWrite4 = isunsafebasetype.write(11);
                zWrite5 = isunsafebasetype.write(12);
                zWrite2 = isunsafebasetype.write(9);
            } else {
                zWrite = false;
                zWrite2 = false;
                zWrite3 = false;
                zWrite4 = false;
                zWrite5 = false;
            }
            RemoteActionCompatParcelizer(this.onSkipToQueueItem, zWrite3, this.onPlayFromMediaId);
            RemoteActionCompatParcelizer(this.onSkipToPrevious, zWrite4, this.onPrepareFromUri);
            RemoteActionCompatParcelizer(this.onSetPlaybackSpeed, zWrite5, this.RatingCompat);
            RemoteActionCompatParcelizer(this.onSetRepeatMode, zWrite2, this.handleMediaPlayPauseIfPendingOnHandler);
            PrivateMaxEntriesMapRemovalTask privateMaxEntriesMapRemovalTask = this.MediaSessionCompatQueueItem;
            if (privateMaxEntriesMapRemovalTask != null) {
                privateMaxEntriesMapRemovalTask.setEnabled(zWrite);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void AudioAttributesImplBaseParcelizer() {
        ImageView imageView;
        if (MediaBrowserCompatMediaItem() && this.onCustomAction && (imageView = this.onRemoveQueueItem) != null) {
            if (this.onRemoveQueueItemAt == 0) {
                RemoteActionCompatParcelizer(false, false, (View) imageView);
                return;
            }
            isUnsafeBaseType isunsafebasetype = this.onFastForward;
            if (isunsafebasetype == null) {
                RemoteActionCompatParcelizer(true, false, (View) imageView);
                this.onRemoveQueueItem.setImageDrawable(this.onPrepare);
                this.onRemoveQueueItem.setContentDescription(this.onPrepareFromSearch);
                return;
            }
            RemoteActionCompatParcelizer(true, true, (View) imageView);
            int iOnSetShuffleMode = isunsafebasetype.onSetShuffleMode();
            if (iOnSetShuffleMode == 0) {
                this.onRemoveQueueItem.setImageDrawable(this.onPrepare);
                this.onRemoveQueueItem.setContentDescription(this.onPrepareFromSearch);
            } else if (iOnSetShuffleMode == 1) {
                this.onRemoveQueueItem.setImageDrawable(this.onSeekTo);
                this.onRemoveQueueItem.setContentDescription(this.onRewind);
            } else if (iOnSetShuffleMode == 2) {
                this.onRemoveQueueItem.setImageDrawable(this.onPlayFromSearch);
                this.onRemoveQueueItem.setContentDescription(this.onPrepareFromMediaId);
            }
            this.onRemoveQueueItem.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void MediaBrowserCompatCustomActionResultReceiver() {
        ImageView imageView;
        String str;
        if (MediaBrowserCompatMediaItem() && this.onCustomAction && (imageView = this.onSkipToNext) != null) {
            isUnsafeBaseType isunsafebasetype = this.onFastForward;
            if (!this.setSessionImpl) {
                RemoteActionCompatParcelizer(false, false, (View) imageView);
                return;
            }
            if (isunsafebasetype == null) {
                RemoteActionCompatParcelizer(true, false, (View) imageView);
                this.onSkipToNext.setImageDrawable(this.MediaSessionCompatToken);
                this.onSkipToNext.setContentDescription(this.MediaSessionCompatResultReceiverWrapper);
                return;
            }
            RemoteActionCompatParcelizer(true, true, (View) imageView);
            this.onSkipToNext.setImageDrawable(isunsafebasetype.onSetPlaybackSpeed() ? this.PlaybackStateCompat : this.MediaSessionCompatToken);
            ImageView imageView2 = this.onSkipToNext;
            if (isunsafebasetype.onSetPlaybackSpeed()) {
                str = this.ParcelableVolumeInfo;
            } else {
                str = this.MediaSessionCompatResultReceiverWrapper;
            }
            imageView2.setContentDescription(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void MediaMetadataCompat() {
        /*
            Method dump skipped, instruction units count: 334
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.ui.LegacyPlayerControlView.MediaMetadataCompat():void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void MediaBrowserCompatItemReceiver() {
        long jOnAddQueueItem;
        long jOnCustomAction;
        if (MediaBrowserCompatMediaItem() && this.onCustomAction) {
            isUnsafeBaseType isunsafebasetype = this.onFastForward;
            if (isunsafebasetype != null) {
                jOnAddQueueItem = this.MediaBrowserCompatCustomActionResultReceiver + isunsafebasetype.onAddQueueItem();
                jOnCustomAction = this.MediaBrowserCompatCustomActionResultReceiver + isunsafebasetype.onCustomAction();
            } else {
                jOnAddQueueItem = 0;
                jOnCustomAction = 0;
            }
            boolean z = jOnAddQueueItem != this.AudioAttributesImplApi26Parcelizer;
            this.AudioAttributesImplApi26Parcelizer = jOnAddQueueItem;
            this.write = jOnCustomAction;
            TextView textView = this.onMediaButtonEvent;
            if (textView != null && !this.onSetShuffleMode && z) {
                textView.setText(LaissezFaireSubTypeValidator.read(this.MediaDescriptionCompat, this.MediaMetadataCompat, jOnAddQueueItem));
            }
            PrivateMaxEntriesMapRemovalTask privateMaxEntriesMapRemovalTask = this.MediaSessionCompatQueueItem;
            if (privateMaxEntriesMapRemovalTask != null) {
                privateMaxEntriesMapRemovalTask.setPosition(jOnAddQueueItem);
                this.MediaSessionCompatQueueItem.setBufferedPosition(jOnCustomAction);
            }
            removeCallbacks(this.r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw);
            int iOnRewind = isunsafebasetype == null ? 1 : isunsafebasetype.onRewind();
            if (isunsafebasetype == null || !isunsafebasetype.AudioAttributesImplBaseParcelizer()) {
                if (iOnRewind == 4 || iOnRewind == 1) {
                    return;
                }
                postDelayed(this.r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw, 1000L);
                return;
            }
            PrivateMaxEntriesMapRemovalTask privateMaxEntriesMapRemovalTask2 = this.MediaSessionCompatQueueItem;
            long jMin = Math.min(privateMaxEntriesMapRemovalTask2 != null ? privateMaxEntriesMapRemovalTask2.write() : 1000L, 1000 - (jOnAddQueueItem % 1000));
            float f = isunsafebasetype.onRemoveQueueItemAt().AudioAttributesCompatParcelizer;
            postDelayed(this.r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw, LaissezFaireSubTypeValidator.read(f > BitmapDescriptorFactory.HUE_RED ? (long) (jMin / f) : 1000L, this.r8lambdaKUbBm7ckfqTc9QCgukC86fguu4, 1000L));
        }
    }

    private void read() {
        View view;
        View view2;
        boolean zRemoteActionCompatParcelizer = LaissezFaireSubTypeValidator.RemoteActionCompatParcelizer(this.onFastForward, this.onSetCaptioningEnabled);
        if (zRemoteActionCompatParcelizer && (view2 = this.onPause) != null) {
            view2.requestFocus();
        } else {
            if (zRemoteActionCompatParcelizer || (view = this.onCommand) == null) {
                return;
            }
            view.requestFocus();
        }
    }

    private void RemoteActionCompatParcelizer() {
        View view;
        View view2;
        boolean zRemoteActionCompatParcelizer = LaissezFaireSubTypeValidator.RemoteActionCompatParcelizer(this.onFastForward, this.onSetCaptioningEnabled);
        if (zRemoteActionCompatParcelizer && (view2 = this.onPause) != null) {
            view2.sendAccessibilityEvent(8);
        } else {
            if (zRemoteActionCompatParcelizer || (view = this.onCommand) == null) {
                return;
            }
            view.sendAccessibilityEvent(8);
        }
    }

    private void RemoteActionCompatParcelizer(boolean z, boolean z2, View view) {
        if (view == null) {
            return;
        }
        view.setEnabled(z2);
        view.setAlpha(z2 ? this.IconCompatParcelizer : this.read);
        view.setVisibility(z ? 0 : 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void AudioAttributesCompatParcelizer(isUnsafeBaseType isunsafebasetype, long j) {
        int iOnMediaButtonEvent;
        PolymorphicTypeValidator polymorphicTypeValidatorOnPrepare = isunsafebasetype.onPrepare();
        if (this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver && !polymorphicTypeValidatorOnPrepare.RemoteActionCompatParcelizer()) {
            int iAudioAttributesCompatParcelizer = polymorphicTypeValidatorOnPrepare.AudioAttributesCompatParcelizer();
            iOnMediaButtonEvent = 0;
            while (true) {
                long jWrite = polymorphicTypeValidatorOnPrepare.RemoteActionCompatParcelizer(iOnMediaButtonEvent, this.ResultReceiver).write();
                if (j < jWrite) {
                    break;
                }
                if (iOnMediaButtonEvent == iAudioAttributesCompatParcelizer - 1) {
                    j = jWrite;
                    break;
                } else {
                    j -= jWrite;
                    iOnMediaButtonEvent++;
                }
            }
        } else {
            iOnMediaButtonEvent = isunsafebasetype.onMediaButtonEvent();
        }
        RemoteActionCompatParcelizer(isunsafebasetype, iOnMediaButtonEvent, j);
        MediaBrowserCompatItemReceiver();
    }

    private static void RemoteActionCompatParcelizer(isUnsafeBaseType isunsafebasetype, int i, long j) {
        isunsafebasetype.IconCompatParcelizer(i, j);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.onCustomAction = true;
        long j = this.MediaBrowserCompatSearchResultReceiver;
        if (j != C.TIME_UNSET) {
            long jUptimeMillis = j - SystemClock.uptimeMillis();
            if (jUptimeMillis <= 0) {
                IconCompatParcelizer();
            } else {
                postDelayed(this.MediaBrowserCompatMediaItem, jUptimeMillis);
            }
        } else if (MediaBrowserCompatMediaItem()) {
            AudioAttributesCompatParcelizer();
        }
        write();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.onCustomAction = false;
        removeCallbacks(this.r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw);
        removeCallbacks(this.MediaBrowserCompatMediaItem);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            removeCallbacks(this.MediaBrowserCompatMediaItem);
        } else if (motionEvent.getAction() == 1) {
            AudioAttributesCompatParcelizer();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return IconCompatParcelizer(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    private boolean IconCompatParcelizer(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        isUnsafeBaseType isunsafebasetype = this.onFastForward;
        if (isunsafebasetype == null || !AudioAttributesCompatParcelizer(keyCode)) {
            return false;
        }
        if (keyEvent.getAction() != 0) {
            return true;
        }
        if (keyCode == 90) {
            if (isunsafebasetype.onRewind() == 4) {
                return true;
            }
            isunsafebasetype.MediaDescriptionCompat();
            return true;
        }
        if (keyCode == 89) {
            isunsafebasetype.MediaBrowserCompatSearchResultReceiver();
            return true;
        }
        if (keyEvent.getRepeatCount() != 0) {
            return true;
        }
        if (keyCode == 79 || keyCode == 85) {
            LaissezFaireSubTypeValidator.IconCompatParcelizer(isunsafebasetype, this.onSetCaptioningEnabled);
            return true;
        }
        if (keyCode == 87) {
            isunsafebasetype.RatingCompat();
            return true;
        }
        if (keyCode == 88) {
            isunsafebasetype.MediaBrowserCompatMediaItem();
            return true;
        }
        if (keyCode == 126) {
            LaissezFaireSubTypeValidator.AudioAttributesCompatParcelizer(isunsafebasetype);
            return true;
        }
        if (keyCode != 127) {
            return true;
        }
        LaissezFaireSubTypeValidator.write(isunsafebasetype);
        return true;
    }

    private static boolean read(PolymorphicTypeValidator polymorphicTypeValidator, PolymorphicTypeValidator.IconCompatParcelizer iconCompatParcelizer) {
        if (polymorphicTypeValidator.AudioAttributesCompatParcelizer() > 100) {
            return false;
        }
        int iAudioAttributesCompatParcelizer = polymorphicTypeValidator.AudioAttributesCompatParcelizer();
        for (int i = 0; i < iAudioAttributesCompatParcelizer; i++) {
            if (polymorphicTypeValidator.RemoteActionCompatParcelizer(i, iconCompatParcelizer).IconCompatParcelizer == C.TIME_UNSET) {
                return false;
            }
        }
        return true;
    }

    private static int AudioAttributesCompatParcelizer(TypedArray typedArray, int i) {
        return typedArray.getInt(maximumCapacity.MediaDescriptionCompat.LegacyPlayerControlView_repeat_toggle_modes, i);
    }

    final class AudioAttributesCompatParcelizer implements isUnsafeBaseType.AudioAttributesCompatParcelizer, PrivateMaxEntriesMapRemovalTask.write, View.OnClickListener {
        private AudioAttributesCompatParcelizer() {
        }

        /* synthetic */ AudioAttributesCompatParcelizer(LegacyPlayerControlView legacyPlayerControlView, byte b) {
            this();
        }

        @Override // o.isUnsafeBaseType.AudioAttributesCompatParcelizer
        public final void IconCompatParcelizer(isUnsafeBaseType isunsafebasetype, isUnsafeBaseType.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
            if (remoteActionCompatParcelizer.read(4, 5)) {
                LegacyPlayerControlView.this.AudioAttributesImplApi26Parcelizer();
            }
            if (remoteActionCompatParcelizer.read(4, 5, 7)) {
                LegacyPlayerControlView.this.MediaBrowserCompatItemReceiver();
            }
            if (remoteActionCompatParcelizer.AudioAttributesCompatParcelizer(8)) {
                LegacyPlayerControlView.this.AudioAttributesImplBaseParcelizer();
            }
            if (remoteActionCompatParcelizer.AudioAttributesCompatParcelizer(9)) {
                LegacyPlayerControlView.this.MediaBrowserCompatCustomActionResultReceiver();
            }
            if (remoteActionCompatParcelizer.read(8, 9, 11, 0, 13)) {
                LegacyPlayerControlView.this.AudioAttributesImplApi21Parcelizer();
            }
            if (remoteActionCompatParcelizer.read(11, 0)) {
                LegacyPlayerControlView.this.MediaMetadataCompat();
            }
        }

        @Override // o.PrivateMaxEntriesMapRemovalTask.write
        public final void RemoteActionCompatParcelizer(long j) {
            LegacyPlayerControlView.this.onSetShuffleMode = true;
            if (LegacyPlayerControlView.this.onMediaButtonEvent != null) {
                LegacyPlayerControlView.this.onMediaButtonEvent.setText(LaissezFaireSubTypeValidator.read(LegacyPlayerControlView.this.MediaDescriptionCompat, LegacyPlayerControlView.this.MediaMetadataCompat, j));
            }
        }

        @Override // o.PrivateMaxEntriesMapRemovalTask.write
        public final void IconCompatParcelizer(long j) {
            if (LegacyPlayerControlView.this.onMediaButtonEvent != null) {
                LegacyPlayerControlView.this.onMediaButtonEvent.setText(LaissezFaireSubTypeValidator.read(LegacyPlayerControlView.this.MediaDescriptionCompat, LegacyPlayerControlView.this.MediaMetadataCompat, j));
            }
        }

        @Override // o.PrivateMaxEntriesMapRemovalTask.write
        public final void RemoteActionCompatParcelizer(long j, boolean z) {
            LegacyPlayerControlView.this.onSetShuffleMode = false;
            if (z || LegacyPlayerControlView.this.onFastForward == null) {
                return;
            }
            LegacyPlayerControlView legacyPlayerControlView = LegacyPlayerControlView.this;
            legacyPlayerControlView.AudioAttributesCompatParcelizer(legacyPlayerControlView.onFastForward, j);
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            isUnsafeBaseType isunsafebasetype = LegacyPlayerControlView.this.onFastForward;
            if (isunsafebasetype != null) {
                if (LegacyPlayerControlView.this.handleMediaPlayPauseIfPendingOnHandler != view) {
                    if (LegacyPlayerControlView.this.onPlayFromMediaId != view) {
                        if (LegacyPlayerControlView.this.RatingCompat != view) {
                            if (LegacyPlayerControlView.this.onPrepareFromUri != view) {
                                if (LegacyPlayerControlView.this.onPause != view) {
                                    if (LegacyPlayerControlView.this.onCommand != view) {
                                        if (LegacyPlayerControlView.this.onRemoveQueueItem != view) {
                                            if (LegacyPlayerControlView.this.onSkipToNext == view) {
                                                isunsafebasetype.IconCompatParcelizer(!isunsafebasetype.onSetPlaybackSpeed());
                                                return;
                                            }
                                            return;
                                        }
                                        isunsafebasetype.IconCompatParcelizer(AsPropertyTypeSerializer.AudioAttributesCompatParcelizer(isunsafebasetype.onSetShuffleMode(), LegacyPlayerControlView.this.onRemoveQueueItemAt));
                                        return;
                                    }
                                    LaissezFaireSubTypeValidator.write(isunsafebasetype);
                                    return;
                                }
                                LaissezFaireSubTypeValidator.AudioAttributesCompatParcelizer(isunsafebasetype);
                                return;
                            }
                            isunsafebasetype.MediaBrowserCompatSearchResultReceiver();
                            return;
                        }
                        if (isunsafebasetype.onRewind() != 4) {
                            isunsafebasetype.MediaDescriptionCompat();
                            return;
                        }
                        return;
                    }
                    isunsafebasetype.MediaBrowserCompatMediaItem();
                    return;
                }
                isunsafebasetype.RatingCompat();
            }
        }
    }

    static final class RemoteActionCompatParcelizer {
        public static boolean IconCompatParcelizer(View view) {
            return view.isAccessibilityFocused();
        }
    }
}
