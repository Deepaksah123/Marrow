package androidx.media3.ui;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.C;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Formatter;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.AsPropertyTypeSerializer;
import kotlin.C0170format;
import kotlin.LaissezFaireSubTypeValidator;
import kotlin.PolymorphicTypeValidator;
import kotlin.PrivateMaxEntriesMapRemovalTask;
import kotlin.PrivateMaxEntriesMapUpdateTask;
import kotlin.SubtypeResolver;
import kotlin.TypeDeserializer;
import kotlin._parseDoublePrimitive;
import kotlin.buildTypeSerializer;
import kotlin.checkArgument;
import kotlin.collectAndResolveSubtypesByTypeId;
import kotlin.containsValue;
import kotlin.initExtraTracks;
import kotlin.isSafeSubType;
import kotlin.isUnsafeBaseType;
import kotlin.maximumCapacity;
import kotlin.setName;

/* JADX INFO: loaded from: classes2.dex */
public class PlayerControlView extends FrameLayout {
    private static final float[] IconCompatParcelizer;
    private long[] AudioAttributesCompatParcelizer;
    private final TextView AudioAttributesImplApi21Parcelizer;
    private final containsValue AudioAttributesImplApi26Parcelizer;
    private long AudioAttributesImplBaseParcelizer;
    private final float MediaBrowserCompatCustomActionResultReceiver;
    private final read MediaBrowserCompatItemReceiver;
    private boolean[] MediaBrowserCompatMediaItem;
    private final View MediaBrowserCompatSearchResultReceiver;
    private final Formatter MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    private final TextView MediaDescriptionCompat;
    private final StringBuilder MediaMetadataCompat;
    private int MediaSessionCompatQueueItem;
    private final View MediaSessionCompatResultReceiverWrapper;
    private final Resources MediaSessionCompatToken;
    private final ImageView ParcelableVolumeInfo;
    private final TextView PlaybackStateCompat;
    private final PopupWindow PlaybackStateCompatCustomAction;
    private long[] RatingCompat;
    private final View RemoteActionCompatParcelizer;
    private boolean ResultReceiver;
    private final int _init_lambda2;
    private int _init_lambda3;
    private final Drawable _init_lambda4;
    private final String _init_lambda5;
    private final ImageView accessaddObserverForBackInvoker;
    private final Drawable accessensureViewModelStore;
    private final String accessgetReportFullyDrawnExecutorp;
    private final AudioAttributesImplBaseParcelizer accessonBackPresseds1027565324;
    private final Runnable addContentView;
    private final PrivateMaxEntriesMapRemovalTask addMenuProvider;
    private final String addObserverForBackInvoker;
    private final Drawable addObserverForBackInvokerlambda7;
    private final PolymorphicTypeValidator.IconCompatParcelizer addOnNewIntentListener;
    private final ImageView addOnPictureInPictureModeChangedListener;
    private final String createFullyDrawnExecutor;
    private final Drawable ensureViewModelStore;
    private final CopyOnWriteArrayList<MediaBrowserCompatSearchResultReceiver> getOnBackPressedDispatcherannotations;
    private final PrivateMaxEntriesMapUpdateTask getSavedStateRegistryControllerannotations;
    private final Drawable handleMediaPlayPauseIfPendingOnHandler;
    private int menuHostHelperlambda0;
    private final ImageView onAddQueueItem;
    private final String onCommand;
    private final String onCustomAction;
    private boolean onFastForward;
    private boolean onMediaButtonEvent;
    private boolean onPause;
    private final ImageView onPlay;
    private final Drawable onPlayFromMediaId;
    private final PolymorphicTypeValidator.AudioAttributesCompatParcelizer onPlayFromSearch;
    private final ImageView onPlayFromUri;
    private boolean onPrepare;
    private AudioAttributesCompatParcelizer onPrepareFromMediaId;
    private final Drawable onPrepareFromSearch;
    private final Drawable onPrepareFromUri;
    private final IconCompatParcelizer onRemoveQueueItem;
    private boolean[] onRemoveQueueItemAt;
    private final ImageView onRewind;
    private final View onSeekTo;
    private RemoteActionCompatParcelizer onSetCaptioningEnabled;
    private final TextView onSetPlaybackSpeed;
    private isUnsafeBaseType onSetRating;
    private final String onSetRepeatMode;
    private final ImageView onSetShuffleMode;
    private final Drawable onSkipToNext;
    private final String onSkipToPrevious;
    private final Drawable onSkipToQueueItem;
    private final Drawable onStop;
    private final AudioAttributesImplApi21Parcelizer r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw;
    private final View r8lambdaKUbBm7ckfqTc9QCgukC86fguu4;
    private final RecyclerView r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
    private boolean r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;
    private final ImageView r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8;
    private boolean r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0;
    private final write read;
    private final String setSessionImpl;
    private final float write;

    @Deprecated
    public interface AudioAttributesCompatParcelizer {
        void read();
    }

    @Deprecated
    public interface MediaBrowserCompatSearchResultReceiver {
        void RemoteActionCompatParcelizer();
    }

    public interface RemoteActionCompatParcelizer {
    }

    private static boolean RemoteActionCompatParcelizer(int i) {
        return i == 90 || i == 89 || i == 85 || i == 79 || i == 126 || i == 127 || i == 87 || i == 88;
    }

    static {
        isSafeSubType.AudioAttributesCompatParcelizer("media3.ui");
        IconCompatParcelizer = new float[]{0.25f, 0.5f, 0.75f, 1.0f, 1.25f, 1.5f, 2.0f};
    }

    public PlayerControlView(Context context) {
        this(context, null);
    }

    public PlayerControlView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PlayerControlView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, attributeSet);
    }

    public PlayerControlView(Context context, AttributeSet attributeSet, int i, AttributeSet attributeSet2) {
        final PlayerControlView playerControlView;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        boolean z7;
        boolean z8;
        int i19;
        int i20;
        read readVar;
        final PlayerControlView playerControlView2;
        ImageView imageView;
        boolean z9;
        int i21;
        ImageView imageView2;
        super(context, attributeSet, i);
        int i22 = maximumCapacity.AudioAttributesImplApi21Parcelizer.exo_player_control_view;
        int i23 = maximumCapacity.write.exo_styled_controls_play;
        int i24 = maximumCapacity.write.exo_styled_controls_pause;
        int i25 = maximumCapacity.write.exo_styled_controls_next;
        int i26 = maximumCapacity.write.exo_styled_controls_simple_fastforward;
        int i27 = maximumCapacity.write.exo_styled_controls_previous;
        int i28 = maximumCapacity.write.exo_styled_controls_simple_rewind;
        int i29 = maximumCapacity.write.exo_styled_controls_fullscreen_exit;
        int i30 = maximumCapacity.write.exo_styled_controls_fullscreen_enter;
        int i31 = maximumCapacity.write.exo_styled_controls_repeat_off;
        int i32 = maximumCapacity.write.exo_styled_controls_repeat_one;
        int i33 = maximumCapacity.write.exo_styled_controls_repeat_all;
        int i34 = maximumCapacity.write.exo_styled_controls_shuffle_on;
        int i35 = maximumCapacity.write.exo_styled_controls_shuffle_off;
        int i36 = maximumCapacity.write.exo_styled_controls_subtitle_on;
        int i37 = maximumCapacity.write.exo_styled_controls_subtitle_off;
        int i38 = maximumCapacity.write.exo_styled_controls_vr;
        this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = true;
        this._init_lambda3 = 5000;
        this.MediaSessionCompatQueueItem = 0;
        this.menuHostHelperlambda0 = 200;
        if (attributeSet2 != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet2, maximumCapacity.MediaDescriptionCompat.PlayerControlView, i, 0);
            try {
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(maximumCapacity.MediaDescriptionCompat.PlayerControlView_controller_layout_id, i22);
                int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(maximumCapacity.MediaDescriptionCompat.PlayerControlView_play_icon, i23);
                int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(maximumCapacity.MediaDescriptionCompat.PlayerControlView_pause_icon, i24);
                int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(maximumCapacity.MediaDescriptionCompat.PlayerControlView_next_icon, i25);
                int resourceId5 = typedArrayObtainStyledAttributes.getResourceId(maximumCapacity.MediaDescriptionCompat.PlayerControlView_fastforward_icon, i26);
                int resourceId6 = typedArrayObtainStyledAttributes.getResourceId(maximumCapacity.MediaDescriptionCompat.PlayerControlView_previous_icon, i27);
                int resourceId7 = typedArrayObtainStyledAttributes.getResourceId(maximumCapacity.MediaDescriptionCompat.PlayerControlView_rewind_icon, i28);
                int resourceId8 = typedArrayObtainStyledAttributes.getResourceId(maximumCapacity.MediaDescriptionCompat.PlayerControlView_fullscreen_exit_icon, i29);
                int resourceId9 = typedArrayObtainStyledAttributes.getResourceId(maximumCapacity.MediaDescriptionCompat.PlayerControlView_fullscreen_enter_icon, i30);
                int resourceId10 = typedArrayObtainStyledAttributes.getResourceId(maximumCapacity.MediaDescriptionCompat.PlayerControlView_repeat_off_icon, i31);
                int resourceId11 = typedArrayObtainStyledAttributes.getResourceId(maximumCapacity.MediaDescriptionCompat.PlayerControlView_repeat_one_icon, i32);
                int resourceId12 = typedArrayObtainStyledAttributes.getResourceId(maximumCapacity.MediaDescriptionCompat.PlayerControlView_repeat_all_icon, i33);
                int resourceId13 = typedArrayObtainStyledAttributes.getResourceId(maximumCapacity.MediaDescriptionCompat.PlayerControlView_shuffle_on_icon, i34);
                int resourceId14 = typedArrayObtainStyledAttributes.getResourceId(maximumCapacity.MediaDescriptionCompat.PlayerControlView_shuffle_off_icon, i35);
                int resourceId15 = typedArrayObtainStyledAttributes.getResourceId(maximumCapacity.MediaDescriptionCompat.PlayerControlView_subtitle_on_icon, i36);
                int resourceId16 = typedArrayObtainStyledAttributes.getResourceId(maximumCapacity.MediaDescriptionCompat.PlayerControlView_subtitle_off_icon, i37);
                int resourceId17 = typedArrayObtainStyledAttributes.getResourceId(maximumCapacity.MediaDescriptionCompat.PlayerControlView_vr_icon, i38);
                playerControlView = this;
                playerControlView._init_lambda3 = typedArrayObtainStyledAttributes.getInt(maximumCapacity.MediaDescriptionCompat.PlayerControlView_show_timeout, playerControlView._init_lambda3);
                playerControlView.MediaSessionCompatQueueItem = write(typedArrayObtainStyledAttributes, playerControlView.MediaSessionCompatQueueItem);
                boolean z10 = typedArrayObtainStyledAttributes.getBoolean(maximumCapacity.MediaDescriptionCompat.PlayerControlView_show_rewind_button, true);
                boolean z11 = typedArrayObtainStyledAttributes.getBoolean(maximumCapacity.MediaDescriptionCompat.PlayerControlView_show_fastforward_button, true);
                boolean z12 = typedArrayObtainStyledAttributes.getBoolean(maximumCapacity.MediaDescriptionCompat.PlayerControlView_show_previous_button, true);
                boolean z13 = typedArrayObtainStyledAttributes.getBoolean(maximumCapacity.MediaDescriptionCompat.PlayerControlView_show_next_button, true);
                boolean z14 = typedArrayObtainStyledAttributes.getBoolean(maximumCapacity.MediaDescriptionCompat.PlayerControlView_show_shuffle_button, false);
                boolean z15 = typedArrayObtainStyledAttributes.getBoolean(maximumCapacity.MediaDescriptionCompat.PlayerControlView_show_subtitle_button, false);
                boolean z16 = typedArrayObtainStyledAttributes.getBoolean(maximumCapacity.MediaDescriptionCompat.PlayerControlView_show_vr_button, false);
                playerControlView.setTimeBarMinUpdateInterval(typedArrayObtainStyledAttributes.getInt(maximumCapacity.MediaDescriptionCompat.PlayerControlView_time_bar_min_update_interval, playerControlView.menuHostHelperlambda0));
                boolean z17 = typedArrayObtainStyledAttributes.getBoolean(maximumCapacity.MediaDescriptionCompat.PlayerControlView_animation_enabled, true);
                typedArrayObtainStyledAttributes.recycle();
                i16 = resourceId;
                z6 = z17;
                i3 = resourceId7;
                i4 = resourceId8;
                i5 = resourceId9;
                i6 = resourceId10;
                i7 = resourceId11;
                i8 = resourceId12;
                i9 = resourceId13;
                i10 = resourceId4;
                i11 = resourceId17;
                z8 = z10;
                z2 = z12;
                z7 = z13;
                z3 = z14;
                z4 = z15;
                z5 = z16;
                i12 = resourceId14;
                i13 = resourceId2;
                i14 = resourceId3;
                i15 = resourceId5;
                i2 = resourceId6;
                i17 = resourceId15;
                i18 = resourceId16;
                z = z11;
            } catch (Throwable th) {
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        } else {
            playerControlView = this;
            i2 = i27;
            i3 = i28;
            i4 = i29;
            i5 = i30;
            i6 = i31;
            i7 = i32;
            i8 = i33;
            i9 = i34;
            i10 = i25;
            z = true;
            z2 = true;
            z3 = false;
            z4 = false;
            z5 = false;
            z6 = true;
            i11 = i38;
            i12 = i35;
            i13 = i23;
            i14 = i24;
            i15 = i26;
            i16 = i22;
            i17 = i36;
            i18 = i37;
            z7 = true;
            z8 = true;
        }
        LayoutInflater.from(context).inflate(i16, playerControlView);
        playerControlView.setDescendantFocusability(262144);
        read readVar2 = new read(playerControlView, (byte) 0);
        playerControlView.MediaBrowserCompatItemReceiver = readVar2;
        playerControlView.getOnBackPressedDispatcherannotations = new CopyOnWriteArrayList<>();
        playerControlView.onPlayFromSearch = new PolymorphicTypeValidator.AudioAttributesCompatParcelizer();
        playerControlView.addOnNewIntentListener = new PolymorphicTypeValidator.IconCompatParcelizer();
        StringBuilder sb = new StringBuilder();
        playerControlView.MediaMetadataCompat = sb;
        int i39 = i18;
        playerControlView.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = new Formatter(sb, Locale.getDefault());
        playerControlView.AudioAttributesCompatParcelizer = new long[0];
        playerControlView.onRemoveQueueItemAt = new boolean[0];
        playerControlView.RatingCompat = new long[0];
        playerControlView.MediaBrowserCompatMediaItem = new boolean[0];
        playerControlView.addContentView = new Runnable() { // from class: o.readBufferIndex
            @Override // java.lang.Runnable
            public final void run() {
                this.read.onCommand();
            }
        };
        playerControlView.AudioAttributesImplApi21Parcelizer = (TextView) playerControlView.findViewById(maximumCapacity.AudioAttributesImplBaseParcelizer.exo_duration);
        playerControlView.onSetPlaybackSpeed = (TextView) playerControlView.findViewById(maximumCapacity.AudioAttributesImplBaseParcelizer.exo_position);
        ImageView imageView3 = (ImageView) playerControlView.findViewById(maximumCapacity.AudioAttributesImplBaseParcelizer.exo_subtitle);
        playerControlView.accessaddObserverForBackInvoker = imageView3;
        if (imageView3 != null) {
            imageView3.setOnClickListener(readVar2);
        }
        ImageView imageView4 = (ImageView) playerControlView.findViewById(maximumCapacity.AudioAttributesImplBaseParcelizer.exo_fullscreen);
        playerControlView.onAddQueueItem = imageView4;
        write(imageView4, new View.OnClickListener() { // from class: o.afterWrite
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.read.MediaDescriptionCompat();
            }
        });
        ImageView imageView5 = (ImageView) playerControlView.findViewById(maximumCapacity.AudioAttributesImplBaseParcelizer.exo_minimal_fullscreen);
        playerControlView.onPlay = imageView5;
        write(imageView5, new View.OnClickListener() { // from class: o.afterWrite
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.read.MediaDescriptionCompat();
            }
        });
        View viewFindViewById = playerControlView.findViewById(maximumCapacity.AudioAttributesImplBaseParcelizer.exo_settings);
        playerControlView.r8lambdaKUbBm7ckfqTc9QCgukC86fguu4 = viewFindViewById;
        if (viewFindViewById != null) {
            viewFindViewById.setOnClickListener(readVar2);
        }
        View viewFindViewById2 = playerControlView.findViewById(maximumCapacity.AudioAttributesImplBaseParcelizer.exo_playback_speed);
        playerControlView.onSeekTo = viewFindViewById2;
        if (viewFindViewById2 != null) {
            viewFindViewById2.setOnClickListener(readVar2);
        }
        View viewFindViewById3 = playerControlView.findViewById(maximumCapacity.AudioAttributesImplBaseParcelizer.exo_audio_track);
        playerControlView.RemoteActionCompatParcelizer = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.setOnClickListener(readVar2);
        }
        PrivateMaxEntriesMapRemovalTask privateMaxEntriesMapRemovalTask = (PrivateMaxEntriesMapRemovalTask) playerControlView.findViewById(maximumCapacity.AudioAttributesImplBaseParcelizer.exo_progress);
        View viewFindViewById4 = playerControlView.findViewById(maximumCapacity.AudioAttributesImplBaseParcelizer.exo_progress_placeholder);
        boolean z18 = z7;
        if (privateMaxEntriesMapRemovalTask != null) {
            playerControlView.addMenuProvider = privateMaxEntriesMapRemovalTask;
            i19 = i2;
            i20 = i39;
            readVar = readVar2;
            playerControlView2 = playerControlView;
            imageView = imageView3;
            z9 = z2;
            i21 = i17;
        } else if (viewFindViewById4 != null) {
            i19 = i2;
            readVar = readVar2;
            i20 = i39;
            playerControlView2 = playerControlView;
            imageView = imageView3;
            z9 = z2;
            i21 = i17;
            DefaultTimeBar defaultTimeBar = new DefaultTimeBar(context, null, 0, attributeSet2, maximumCapacity.MediaBrowserCompatSearchResultReceiver.ExoStyledControls_TimeBar);
            defaultTimeBar.setId(maximumCapacity.AudioAttributesImplBaseParcelizer.exo_progress);
            defaultTimeBar.setLayoutParams(viewFindViewById4.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) viewFindViewById4.getParent();
            int iIndexOfChild = viewGroup.indexOfChild(viewFindViewById4);
            viewGroup.removeView(viewFindViewById4);
            viewGroup.addView(defaultTimeBar, iIndexOfChild);
            playerControlView2.addMenuProvider = defaultTimeBar;
        } else {
            i19 = i2;
            i20 = i39;
            readVar = readVar2;
            playerControlView2 = playerControlView;
            imageView = imageView3;
            z9 = z2;
            i21 = i17;
            playerControlView2.addMenuProvider = null;
        }
        PrivateMaxEntriesMapRemovalTask privateMaxEntriesMapRemovalTask2 = playerControlView2.addMenuProvider;
        read readVar3 = readVar;
        if (privateMaxEntriesMapRemovalTask2 != null) {
            privateMaxEntriesMapRemovalTask2.read(readVar3);
        }
        Resources resources = context.getResources();
        playerControlView2.MediaSessionCompatToken = resources;
        ImageView imageView6 = (ImageView) playerControlView2.findViewById(maximumCapacity.AudioAttributesImplBaseParcelizer.exo_play_pause);
        playerControlView2.onRewind = imageView6;
        if (imageView6 != null) {
            imageView6.setOnClickListener(readVar3);
        }
        ImageView imageView7 = (ImageView) playerControlView2.findViewById(maximumCapacity.AudioAttributesImplBaseParcelizer.exo_prev);
        playerControlView2.onSetShuffleMode = imageView7;
        if (imageView7 != null) {
            imageView7.setImageDrawable(LaissezFaireSubTypeValidator.read(context, resources, i19));
            imageView7.setOnClickListener(readVar3);
        }
        ImageView imageView8 = (ImageView) playerControlView2.findViewById(maximumCapacity.AudioAttributesImplBaseParcelizer.exo_next);
        playerControlView2.onPlayFromUri = imageView8;
        if (imageView8 != null) {
            imageView8.setImageDrawable(LaissezFaireSubTypeValidator.read(context, resources, i10));
            imageView8.setOnClickListener(readVar3);
        }
        Typeface typefaceIconCompatParcelizer = _parseDoublePrimitive.IconCompatParcelizer(context, maximumCapacity.AudioAttributesCompatParcelizer.roboto_medium_numbers);
        ImageView imageView9 = (ImageView) playerControlView2.findViewById(maximumCapacity.AudioAttributesImplBaseParcelizer.exo_rew);
        TextView textView = (TextView) playerControlView2.findViewById(maximumCapacity.AudioAttributesImplBaseParcelizer.exo_rew_with_amount);
        if (imageView9 != null) {
            imageView2 = imageView7;
            imageView9.setImageDrawable(LaissezFaireSubTypeValidator.read(context, resources, i3));
            playerControlView2.MediaSessionCompatResultReceiverWrapper = imageView9;
            playerControlView2.PlaybackStateCompat = null;
        } else {
            imageView2 = imageView7;
            if (textView != null) {
                textView.setTypeface(typefaceIconCompatParcelizer);
                playerControlView2.PlaybackStateCompat = textView;
                playerControlView2.MediaSessionCompatResultReceiverWrapper = textView;
            } else {
                playerControlView2.PlaybackStateCompat = null;
                playerControlView2.MediaSessionCompatResultReceiverWrapper = null;
            }
        }
        View view = playerControlView2.MediaSessionCompatResultReceiverWrapper;
        if (view != null) {
            view.setOnClickListener(readVar3);
        }
        ImageView imageView10 = (ImageView) playerControlView2.findViewById(maximumCapacity.AudioAttributesImplBaseParcelizer.exo_ffwd);
        TextView textView2 = (TextView) playerControlView2.findViewById(maximumCapacity.AudioAttributesImplBaseParcelizer.exo_ffwd_with_amount);
        if (imageView10 != null) {
            imageView10.setImageDrawable(LaissezFaireSubTypeValidator.read(context, resources, i15));
            playerControlView2.MediaBrowserCompatSearchResultReceiver = imageView10;
            playerControlView2.MediaDescriptionCompat = null;
        } else if (textView2 != null) {
            textView2.setTypeface(typefaceIconCompatParcelizer);
            playerControlView2.MediaDescriptionCompat = textView2;
            playerControlView2.MediaBrowserCompatSearchResultReceiver = textView2;
        } else {
            playerControlView2.MediaDescriptionCompat = null;
            playerControlView2.MediaBrowserCompatSearchResultReceiver = null;
        }
        View view2 = playerControlView2.MediaBrowserCompatSearchResultReceiver;
        if (view2 != null) {
            view2.setOnClickListener(readVar3);
        }
        ImageView imageView11 = (ImageView) playerControlView2.findViewById(maximumCapacity.AudioAttributesImplBaseParcelizer.exo_repeat_toggle);
        playerControlView2.ParcelableVolumeInfo = imageView11;
        if (imageView11 != null) {
            imageView11.setOnClickListener(readVar3);
        }
        ImageView imageView12 = (ImageView) playerControlView2.findViewById(maximumCapacity.AudioAttributesImplBaseParcelizer.exo_shuffle);
        playerControlView2.r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8 = imageView12;
        if (imageView12 != null) {
            imageView12.setOnClickListener(readVar3);
        }
        playerControlView2.MediaBrowserCompatCustomActionResultReceiver = resources.getInteger(maximumCapacity.MediaBrowserCompatItemReceiver.exo_media_button_opacity_percentage_enabled) / 100.0f;
        playerControlView2.write = resources.getInteger(maximumCapacity.MediaBrowserCompatItemReceiver.exo_media_button_opacity_percentage_disabled) / 100.0f;
        ImageView imageView13 = (ImageView) playerControlView2.findViewById(maximumCapacity.AudioAttributesImplBaseParcelizer.exo_vr);
        playerControlView2.addOnPictureInPictureModeChangedListener = imageView13;
        if (imageView13 != null) {
            imageView13.setImageDrawable(LaissezFaireSubTypeValidator.read(context, resources, i11));
            playerControlView2.AudioAttributesCompatParcelizer(false, (View) imageView13);
        }
        containsValue containsvalue = new containsValue(playerControlView2);
        playerControlView2.AudioAttributesImplApi26Parcelizer = containsvalue;
        containsvalue.write(z6);
        AudioAttributesImplApi21Parcelizer audioAttributesImplApi21Parcelizer = playerControlView2.new AudioAttributesImplApi21Parcelizer(new String[]{resources.getString(maximumCapacity.MediaBrowserCompatCustomActionResultReceiver.exo_controls_playback_speed), resources.getString(maximumCapacity.MediaBrowserCompatCustomActionResultReceiver.exo_track_selection_title_audio)}, new Drawable[]{LaissezFaireSubTypeValidator.read(context, resources, maximumCapacity.write.exo_styled_controls_speed), LaissezFaireSubTypeValidator.read(context, resources, maximumCapacity.write.exo_styled_controls_audiotrack)});
        playerControlView2.r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw = audioAttributesImplApi21Parcelizer;
        playerControlView2._init_lambda2 = resources.getDimensionPixelSize(maximumCapacity.RemoteActionCompatParcelizer.exo_settings_offset);
        RecyclerView recyclerView = (RecyclerView) LayoutInflater.from(context).inflate(maximumCapacity.AudioAttributesImplApi21Parcelizer.exo_styled_settings_list, (ViewGroup) null);
        playerControlView2.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = recyclerView;
        recyclerView.setAdapter(audioAttributesImplApi21Parcelizer);
        getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        PopupWindow popupWindow = new PopupWindow((View) recyclerView, -2, -2, true);
        playerControlView2.PlaybackStateCompatCustomAction = popupWindow;
        if (LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver < 23) {
            popupWindow.setBackgroundDrawable(new ColorDrawable(0));
        }
        popupWindow.setOnDismissListener(readVar3);
        playerControlView2.onPrepare = true;
        playerControlView2.getSavedStateRegistryControllerannotations = new checkArgument(getResources());
        playerControlView2.addObserverForBackInvokerlambda7 = LaissezFaireSubTypeValidator.read(context, resources, i21);
        playerControlView2.ensureViewModelStore = LaissezFaireSubTypeValidator.read(context, resources, i20);
        playerControlView2.addObserverForBackInvoker = resources.getString(maximumCapacity.MediaBrowserCompatCustomActionResultReceiver.exo_controls_cc_enabled_description);
        playerControlView2.createFullyDrawnExecutor = resources.getString(maximumCapacity.MediaBrowserCompatCustomActionResultReceiver.exo_controls_cc_disabled_description);
        byte b = 0;
        playerControlView2.accessonBackPresseds1027565324 = new AudioAttributesImplBaseParcelizer(playerControlView2, b);
        playerControlView2.read = new write(playerControlView2, b);
        playerControlView2.onRemoveQueueItem = playerControlView2.new IconCompatParcelizer(resources.getStringArray(maximumCapacity.IconCompatParcelizer.exo_controls_playback_speeds), IconCompatParcelizer);
        playerControlView2.onPrepareFromUri = LaissezFaireSubTypeValidator.read(context, resources, i13);
        playerControlView2.onPrepareFromSearch = LaissezFaireSubTypeValidator.read(context, resources, i14);
        playerControlView2.onPlayFromMediaId = LaissezFaireSubTypeValidator.read(context, resources, i4);
        playerControlView2.handleMediaPlayPauseIfPendingOnHandler = LaissezFaireSubTypeValidator.read(context, resources, i5);
        playerControlView2.onStop = LaissezFaireSubTypeValidator.read(context, resources, i6);
        playerControlView2.onSkipToQueueItem = LaissezFaireSubTypeValidator.read(context, resources, i7);
        playerControlView2.onSkipToNext = LaissezFaireSubTypeValidator.read(context, resources, i8);
        playerControlView2.accessensureViewModelStore = LaissezFaireSubTypeValidator.read(context, resources, i9);
        playerControlView2._init_lambda4 = LaissezFaireSubTypeValidator.read(context, resources, i12);
        playerControlView2.onCustomAction = resources.getString(maximumCapacity.MediaBrowserCompatCustomActionResultReceiver.exo_controls_fullscreen_exit_description);
        playerControlView2.onCommand = resources.getString(maximumCapacity.MediaBrowserCompatCustomActionResultReceiver.exo_controls_fullscreen_enter_description);
        playerControlView2.setSessionImpl = resources.getString(maximumCapacity.MediaBrowserCompatCustomActionResultReceiver.exo_controls_repeat_off_description);
        playerControlView2.onSkipToPrevious = resources.getString(maximumCapacity.MediaBrowserCompatCustomActionResultReceiver.exo_controls_repeat_one_description);
        playerControlView2.onSetRepeatMode = resources.getString(maximumCapacity.MediaBrowserCompatCustomActionResultReceiver.exo_controls_repeat_all_description);
        playerControlView2.accessgetReportFullyDrawnExecutorp = resources.getString(maximumCapacity.MediaBrowserCompatCustomActionResultReceiver.exo_controls_shuffle_on_description);
        playerControlView2._init_lambda5 = resources.getString(maximumCapacity.MediaBrowserCompatCustomActionResultReceiver.exo_controls_shuffle_off_description);
        containsvalue.RemoteActionCompatParcelizer(playerControlView2.findViewById(maximumCapacity.AudioAttributesImplBaseParcelizer.exo_bottom_bar), true);
        containsvalue.RemoteActionCompatParcelizer(playerControlView2.MediaBrowserCompatSearchResultReceiver, z);
        containsvalue.RemoteActionCompatParcelizer(playerControlView2.MediaSessionCompatResultReceiverWrapper, z8);
        containsvalue.RemoteActionCompatParcelizer(imageView2, z9);
        containsvalue.RemoteActionCompatParcelizer(imageView8, z18);
        containsvalue.RemoteActionCompatParcelizer(imageView12, z3);
        containsvalue.RemoteActionCompatParcelizer(imageView, z4);
        containsvalue.RemoteActionCompatParcelizer(imageView13, z5);
        containsvalue.RemoteActionCompatParcelizer(imageView11, playerControlView2.MediaSessionCompatQueueItem != 0);
        playerControlView2.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: o.applyRead
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view3, int i40, int i41, int i42, int i43, int i44, int i45, int i46, int i47) {
                this.write.read(view3, i40, i41, i42, i43, i44, i45, i46, i47);
            }
        });
    }

    public void setPlayer(isUnsafeBaseType isunsafebasetype) {
        buildTypeSerializer.write(Looper.myLooper() == Looper.getMainLooper());
        buildTypeSerializer.IconCompatParcelizer(isunsafebasetype == null || isunsafebasetype.onCommand() == Looper.getMainLooper());
        isUnsafeBaseType isunsafebasetype2 = this.onSetRating;
        if (isunsafebasetype2 == isunsafebasetype) {
            return;
        }
        if (isunsafebasetype2 != null) {
            isunsafebasetype2.write(this.MediaBrowserCompatItemReceiver);
        }
        this.onSetRating = isunsafebasetype;
        if (isunsafebasetype != null) {
            isunsafebasetype.read(this.MediaBrowserCompatItemReceiver);
        }
        MediaBrowserCompatItemReceiver();
    }

    @Deprecated
    public void setShowMultiWindowTimeBar(boolean z) {
        this.r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0 = z;
        onPlayFromMediaId();
    }

    public void setShowPlayButtonIfPlaybackIsSuppressed(boolean z) {
        this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = z;
        MediaMetadataCompat();
    }

    public void setExtraAdGroupMarkers(long[] jArr, boolean[] zArr) {
        if (jArr == null) {
            this.RatingCompat = new long[0];
            this.MediaBrowserCompatMediaItem = new boolean[0];
        } else {
            boolean[] zArr2 = (boolean[]) buildTypeSerializer.IconCompatParcelizer(zArr);
            buildTypeSerializer.IconCompatParcelizer(jArr.length == zArr2.length);
            this.RatingCompat = jArr;
            this.MediaBrowserCompatMediaItem = zArr2;
        }
        onPlayFromMediaId();
    }

    @Deprecated
    public final void write(MediaBrowserCompatSearchResultReceiver mediaBrowserCompatSearchResultReceiver) {
        this.getOnBackPressedDispatcherannotations.add(mediaBrowserCompatSearchResultReceiver);
    }

    @Deprecated
    public final void RemoteActionCompatParcelizer(MediaBrowserCompatSearchResultReceiver mediaBrowserCompatSearchResultReceiver) {
        this.getOnBackPressedDispatcherannotations.remove(mediaBrowserCompatSearchResultReceiver);
    }

    public void setProgressUpdateListener(RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        this.onSetCaptioningEnabled = remoteActionCompatParcelizer;
    }

    public void setShowRewindButton(boolean z) {
        this.AudioAttributesImplApi26Parcelizer.RemoteActionCompatParcelizer(this.MediaSessionCompatResultReceiverWrapper, z);
        MediaBrowserCompatSearchResultReceiver();
    }

    public void setShowFastForwardButton(boolean z) {
        this.AudioAttributesImplApi26Parcelizer.RemoteActionCompatParcelizer(this.MediaBrowserCompatSearchResultReceiver, z);
        MediaBrowserCompatSearchResultReceiver();
    }

    public void setShowPreviousButton(boolean z) {
        this.AudioAttributesImplApi26Parcelizer.RemoteActionCompatParcelizer(this.onSetShuffleMode, z);
        MediaBrowserCompatSearchResultReceiver();
    }

    public void setShowNextButton(boolean z) {
        this.AudioAttributesImplApi26Parcelizer.RemoteActionCompatParcelizer(this.onPlayFromUri, z);
        MediaBrowserCompatSearchResultReceiver();
    }

    public final int AudioAttributesCompatParcelizer() {
        return this._init_lambda3;
    }

    public void setShowTimeoutMs(int i) {
        this._init_lambda3 = i;
        if (IconCompatParcelizer()) {
            this.AudioAttributesImplApi26Parcelizer.MediaBrowserCompatCustomActionResultReceiver();
        }
    }

    public void setRepeatToggleModes(int i) {
        this.MediaSessionCompatQueueItem = i;
        isUnsafeBaseType isunsafebasetype = this.onSetRating;
        if (isunsafebasetype != null && isunsafebasetype.write(15)) {
            int iOnSetShuffleMode = this.onSetRating.onSetShuffleMode();
            if (i == 0 && iOnSetShuffleMode != 0) {
                this.onSetRating.IconCompatParcelizer(0);
            } else if (i == 1 && iOnSetShuffleMode == 2) {
                this.onSetRating.IconCompatParcelizer(1);
            } else if (i == 2 && iOnSetShuffleMode == 1) {
                this.onSetRating.IconCompatParcelizer(2);
            }
        }
        this.AudioAttributesImplApi26Parcelizer.RemoteActionCompatParcelizer(this.ParcelableVolumeInfo, i != 0);
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
    }

    public void setShowShuffleButton(boolean z) {
        this.AudioAttributesImplApi26Parcelizer.RemoteActionCompatParcelizer(this.r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8, z);
        onFastForward();
    }

    public void setShowSubtitleButton(boolean z) {
        this.AudioAttributesImplApi26Parcelizer.RemoteActionCompatParcelizer(this.accessaddObserverForBackInvoker, z);
    }

    public void setShowVrButton(boolean z) {
        this.AudioAttributesImplApi26Parcelizer.RemoteActionCompatParcelizer(this.addOnPictureInPictureModeChangedListener, z);
    }

    public void setVrButtonListener(View.OnClickListener onClickListener) {
        ImageView imageView = this.addOnPictureInPictureModeChangedListener;
        if (imageView != null) {
            imageView.setOnClickListener(onClickListener);
            AudioAttributesCompatParcelizer(onClickListener != null, this.addOnPictureInPictureModeChangedListener);
        }
    }

    public void setAnimationEnabled(boolean z) {
        this.AudioAttributesImplApi26Parcelizer.write(z);
    }

    public void setTimeBarMinUpdateInterval(int i) {
        this.menuHostHelperlambda0 = LaissezFaireSubTypeValidator.write(i, 16, 1000);
    }

    @Deprecated
    public void setOnFullScreenModeChangedListener(AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        this.onPrepareFromMediaId = audioAttributesCompatParcelizer;
        RemoteActionCompatParcelizer(this.onAddQueueItem, audioAttributesCompatParcelizer != null);
        RemoteActionCompatParcelizer(this.onPlay, audioAttributesCompatParcelizer != null);
    }

    public final void AudioAttributesImplApi26Parcelizer() {
        this.AudioAttributesImplApi26Parcelizer.AudioAttributesImplApi21Parcelizer();
    }

    public final void RemoteActionCompatParcelizer() {
        this.AudioAttributesImplApi26Parcelizer.IconCompatParcelizer();
    }

    public final void write() {
        this.AudioAttributesImplApi26Parcelizer.AudioAttributesCompatParcelizer();
    }

    public final boolean IconCompatParcelizer() {
        return this.AudioAttributesImplApi26Parcelizer.RemoteActionCompatParcelizer();
    }

    public final boolean read() {
        return getVisibility() == 0;
    }

    public final void AudioAttributesImplApi21Parcelizer() {
        for (MediaBrowserCompatSearchResultReceiver mediaBrowserCompatSearchResultReceiver : this.getOnBackPressedDispatcherannotations) {
            getVisibility();
            mediaBrowserCompatSearchResultReceiver.RemoteActionCompatParcelizer();
        }
    }

    public final void MediaBrowserCompatItemReceiver() {
        MediaMetadataCompat();
        MediaBrowserCompatSearchResultReceiver();
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
        onFastForward();
        onMediaButtonEvent();
        onCustomAction();
        onPlayFromMediaId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void MediaMetadataCompat() {
        int i;
        if (read() && this.onMediaButtonEvent && this.onRewind != null) {
            boolean zRemoteActionCompatParcelizer = LaissezFaireSubTypeValidator.RemoteActionCompatParcelizer(this.onSetRating, this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28);
            Drawable drawable = zRemoteActionCompatParcelizer ? this.onPrepareFromUri : this.onPrepareFromSearch;
            if (zRemoteActionCompatParcelizer) {
                i = maximumCapacity.MediaBrowserCompatCustomActionResultReceiver.exo_controls_play_description;
            } else {
                i = maximumCapacity.MediaBrowserCompatCustomActionResultReceiver.exo_controls_pause_description;
            }
            this.onRewind.setImageDrawable(drawable);
            this.onRewind.setContentDescription(this.MediaSessionCompatToken.getString(i));
            AudioAttributesCompatParcelizer(MediaBrowserCompatMediaItem(), this.onRewind);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void MediaBrowserCompatSearchResultReceiver() {
        boolean zWrite;
        boolean zWrite2;
        boolean zWrite3;
        boolean zWrite4;
        boolean zWrite5;
        if (read() && this.onMediaButtonEvent) {
            isUnsafeBaseType isunsafebasetype = this.onSetRating;
            if (isunsafebasetype != null) {
                if (this.r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0 && RemoteActionCompatParcelizer(isunsafebasetype, this.addOnNewIntentListener)) {
                    zWrite = isunsafebasetype.write(10);
                } else {
                    zWrite = isunsafebasetype.write(5);
                }
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
            if (zWrite4) {
                handleMediaPlayPauseIfPendingOnHandler();
            }
            if (zWrite5) {
                RatingCompat();
            }
            AudioAttributesCompatParcelizer(zWrite3, this.onSetShuffleMode);
            AudioAttributesCompatParcelizer(zWrite4, this.MediaSessionCompatResultReceiverWrapper);
            AudioAttributesCompatParcelizer(zWrite5, this.MediaBrowserCompatSearchResultReceiver);
            AudioAttributesCompatParcelizer(zWrite2, this.onPlayFromUri);
            PrivateMaxEntriesMapRemovalTask privateMaxEntriesMapRemovalTask = this.addMenuProvider;
            if (privateMaxEntriesMapRemovalTask != null) {
                privateMaxEntriesMapRemovalTask.setEnabled(zWrite);
            }
        }
    }

    private void handleMediaPlayPauseIfPendingOnHandler() {
        isUnsafeBaseType isunsafebasetype = this.onSetRating;
        int iOnSetCaptioningEnabled = (int) ((isunsafebasetype != null ? isunsafebasetype.onSetCaptioningEnabled() : 5000L) / 1000);
        TextView textView = this.PlaybackStateCompat;
        if (textView != null) {
            textView.setText(String.valueOf(iOnSetCaptioningEnabled));
        }
        View view = this.MediaSessionCompatResultReceiverWrapper;
        if (view != null) {
            view.setContentDescription(this.MediaSessionCompatToken.getQuantityString(maximumCapacity.AudioAttributesImplApi26Parcelizer.exo_controls_rewind_by_amount_description, iOnSetCaptioningEnabled, Integer.valueOf(iOnSetCaptioningEnabled)));
        }
    }

    private void RatingCompat() {
        isUnsafeBaseType isunsafebasetype = this.onSetRating;
        int iOnSetRepeatMode = (int) ((isunsafebasetype != null ? isunsafebasetype.onSetRepeatMode() : C.DEFAULT_SEEK_FORWARD_INCREMENT_MS) / 1000);
        TextView textView = this.MediaDescriptionCompat;
        if (textView != null) {
            textView.setText(String.valueOf(iOnSetRepeatMode));
        }
        View view = this.MediaBrowserCompatSearchResultReceiver;
        if (view != null) {
            view.setContentDescription(this.MediaSessionCompatToken.getQuantityString(maximumCapacity.AudioAttributesImplApi26Parcelizer.exo_controls_fastforward_by_amount_description, iOnSetRepeatMode, Integer.valueOf(iOnSetRepeatMode)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        ImageView imageView;
        if (read() && this.onMediaButtonEvent && (imageView = this.ParcelableVolumeInfo) != null) {
            if (this.MediaSessionCompatQueueItem == 0) {
                AudioAttributesCompatParcelizer(false, (View) imageView);
                return;
            }
            isUnsafeBaseType isunsafebasetype = this.onSetRating;
            if (isunsafebasetype == null || !isunsafebasetype.write(15)) {
                AudioAttributesCompatParcelizer(false, (View) this.ParcelableVolumeInfo);
                this.ParcelableVolumeInfo.setImageDrawable(this.onStop);
                this.ParcelableVolumeInfo.setContentDescription(this.setSessionImpl);
                return;
            }
            AudioAttributesCompatParcelizer(true, (View) this.ParcelableVolumeInfo);
            int iOnSetShuffleMode = isunsafebasetype.onSetShuffleMode();
            if (iOnSetShuffleMode == 0) {
                this.ParcelableVolumeInfo.setImageDrawable(this.onStop);
                this.ParcelableVolumeInfo.setContentDescription(this.setSessionImpl);
            } else if (iOnSetShuffleMode == 1) {
                this.ParcelableVolumeInfo.setImageDrawable(this.onSkipToQueueItem);
                this.ParcelableVolumeInfo.setContentDescription(this.onSkipToPrevious);
            } else if (iOnSetShuffleMode == 2) {
                this.ParcelableVolumeInfo.setImageDrawable(this.onSkipToNext);
                this.ParcelableVolumeInfo.setContentDescription(this.onSetRepeatMode);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onFastForward() {
        ImageView imageView;
        String str;
        if (read() && this.onMediaButtonEvent && (imageView = this.r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8) != null) {
            isUnsafeBaseType isunsafebasetype = this.onSetRating;
            if (!this.AudioAttributesImplApi26Parcelizer.write(imageView)) {
                AudioAttributesCompatParcelizer(false, (View) this.r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8);
                return;
            }
            if (isunsafebasetype == null || !isunsafebasetype.write(14)) {
                AudioAttributesCompatParcelizer(false, (View) this.r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8);
                this.r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8.setImageDrawable(this._init_lambda4);
                this.r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8.setContentDescription(this._init_lambda5);
                return;
            }
            AudioAttributesCompatParcelizer(true, (View) this.r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8);
            this.r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8.setImageDrawable(isunsafebasetype.onSetPlaybackSpeed() ? this.accessensureViewModelStore : this._init_lambda4);
            ImageView imageView2 = this.r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8;
            if (isunsafebasetype.onSetPlaybackSpeed()) {
                str = this.accessgetReportFullyDrawnExecutorp;
            } else {
                str = this._init_lambda5;
            }
            imageView2.setContentDescription(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onMediaButtonEvent() {
        MediaBrowserCompatCustomActionResultReceiver();
        AudioAttributesCompatParcelizer(this.accessonBackPresseds1027565324.getItemCount() > 0, this.accessaddObserverForBackInvoker);
        onAddQueueItem();
    }

    private void MediaBrowserCompatCustomActionResultReceiver() {
        this.accessonBackPresseds1027565324.AudioAttributesCompatParcelizer();
        this.read.AudioAttributesCompatParcelizer();
        isUnsafeBaseType isunsafebasetype = this.onSetRating;
        if (isunsafebasetype != null && isunsafebasetype.write(30) && this.onSetRating.write(29)) {
            collectAndResolveSubtypesByTypeId collectandresolvesubtypesbytypeidOnPrepareFromSearch = this.onSetRating.onPrepareFromSearch();
            this.read.read(AudioAttributesCompatParcelizer(collectandresolvesubtypesbytypeidOnPrepareFromSearch, 1));
            if (this.AudioAttributesImplApi26Parcelizer.write(this.accessaddObserverForBackInvoker)) {
                this.accessonBackPresseds1027565324.AudioAttributesCompatParcelizer(AudioAttributesCompatParcelizer(collectandresolvesubtypesbytypeidOnPrepareFromSearch, 3));
            } else {
                this.accessonBackPresseds1027565324.AudioAttributesCompatParcelizer(initExtraTracks.AudioAttributesImplApi26Parcelizer());
            }
        }
    }

    private initExtraTracks<AudioAttributesImplApi26Parcelizer> AudioAttributesCompatParcelizer(collectAndResolveSubtypesByTypeId collectandresolvesubtypesbytypeid, int i) {
        initExtraTracks.IconCompatParcelizer iconCompatParcelizer = new initExtraTracks.IconCompatParcelizer();
        initExtraTracks<collectAndResolveSubtypesByTypeId.write> initextratracksIconCompatParcelizer = collectandresolvesubtypesbytypeid.IconCompatParcelizer();
        for (int i2 = 0; i2 < initextratracksIconCompatParcelizer.size(); i2++) {
            collectAndResolveSubtypesByTypeId.write writeVar = initextratracksIconCompatParcelizer.get(i2);
            if (writeVar.AudioAttributesCompatParcelizer() == i) {
                for (int i3 = 0; i3 < writeVar.IconCompatParcelizer; i3++) {
                    if (writeVar.write(i3)) {
                        C0170format c0170formatRemoteActionCompatParcelizer = writeVar.RemoteActionCompatParcelizer(i3);
                        if ((c0170formatRemoteActionCompatParcelizer.onRewind & 2) == 0) {
                            iconCompatParcelizer.read(new AudioAttributesImplApi26Parcelizer(collectandresolvesubtypesbytypeid, i2, i3, this.getSavedStateRegistryControllerannotations.write(c0170formatRemoteActionCompatParcelizer)));
                        }
                    }
                }
            }
        }
        return iconCompatParcelizer.IconCompatParcelizer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0119  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onPlayFromMediaId() {
        /*
            Method dump skipped, instruction units count: 362
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.ui.PlayerControlView.onPlayFromMediaId():void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onCommand() {
        long jOnAddQueueItem;
        long jOnCustomAction;
        if (read() && this.onMediaButtonEvent) {
            isUnsafeBaseType isunsafebasetype = this.onSetRating;
            if (isunsafebasetype == null || !isunsafebasetype.write(16)) {
                jOnAddQueueItem = 0;
                jOnCustomAction = 0;
            } else {
                jOnAddQueueItem = this.AudioAttributesImplBaseParcelizer + isunsafebasetype.onAddQueueItem();
                jOnCustomAction = this.AudioAttributesImplBaseParcelizer + isunsafebasetype.onCustomAction();
            }
            TextView textView = this.onSetPlaybackSpeed;
            if (textView != null && !this.ResultReceiver) {
                textView.setText(LaissezFaireSubTypeValidator.read(this.MediaMetadataCompat, this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, jOnAddQueueItem));
            }
            PrivateMaxEntriesMapRemovalTask privateMaxEntriesMapRemovalTask = this.addMenuProvider;
            if (privateMaxEntriesMapRemovalTask != null) {
                privateMaxEntriesMapRemovalTask.setPosition(jOnAddQueueItem);
                this.addMenuProvider.setBufferedPosition(jOnCustomAction);
            }
            removeCallbacks(this.addContentView);
            int iOnRewind = isunsafebasetype == null ? 1 : isunsafebasetype.onRewind();
            if (isunsafebasetype == null || !isunsafebasetype.AudioAttributesImplBaseParcelizer()) {
                if (iOnRewind == 4 || iOnRewind == 1) {
                    return;
                }
                postDelayed(this.addContentView, 1000L);
                return;
            }
            PrivateMaxEntriesMapRemovalTask privateMaxEntriesMapRemovalTask2 = this.addMenuProvider;
            long jMin = Math.min(privateMaxEntriesMapRemovalTask2 != null ? privateMaxEntriesMapRemovalTask2.write() : 1000L, 1000 - (jOnAddQueueItem % 1000));
            float f = isunsafebasetype.onRemoveQueueItemAt().AudioAttributesCompatParcelizer;
            postDelayed(this.addContentView, LaissezFaireSubTypeValidator.read(f > BitmapDescriptorFactory.HUE_RED ? (long) (jMin / f) : 1000L, this.menuHostHelperlambda0, 1000L));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onCustomAction() {
        isUnsafeBaseType isunsafebasetype = this.onSetRating;
        if (isunsafebasetype == null) {
            return;
        }
        this.onRemoveQueueItem.write(isunsafebasetype.onRemoveQueueItemAt().AudioAttributesCompatParcelizer);
        this.r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw.IconCompatParcelizer(0, this.onRemoveQueueItem.AudioAttributesCompatParcelizer());
        onAddQueueItem();
    }

    private void onAddQueueItem() {
        AudioAttributesCompatParcelizer(this.r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw.read(), this.r8lambdaKUbBm7ckfqTc9QCgukC86fguu4);
    }

    private void onPlay() {
        this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM.measure(0, 0);
        this.PlaybackStateCompatCustomAction.setWidth(Math.min(this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM.getMeasuredWidth(), getWidth() - (this._init_lambda2 << 1)));
        this.PlaybackStateCompatCustomAction.setHeight(Math.min(getHeight() - (this._init_lambda2 << 1), this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM.getMeasuredHeight()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void IconCompatParcelizer(RecyclerView.IconCompatParcelizer<?> iconCompatParcelizer, View view) {
        this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM.setAdapter(iconCompatParcelizer);
        onPlay();
        this.onPrepare = false;
        this.PlaybackStateCompatCustomAction.dismiss();
        this.onPrepare = true;
        int width = getWidth();
        int width2 = this.PlaybackStateCompatCustomAction.getWidth();
        this.PlaybackStateCompatCustomAction.showAsDropDown(view, (width - width2) - this._init_lambda2, (-this.PlaybackStateCompatCustomAction.getHeight()) - this._init_lambda2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void AudioAttributesCompatParcelizer(float f) {
        isUnsafeBaseType isunsafebasetype = this.onSetRating;
        if (isunsafebasetype == null || !isunsafebasetype.write(13)) {
            return;
        }
        isUnsafeBaseType isunsafebasetype2 = this.onSetRating;
        isunsafebasetype2.AudioAttributesCompatParcelizer(isunsafebasetype2.onRemoveQueueItemAt().RemoteActionCompatParcelizer(f));
    }

    public final void AudioAttributesImplBaseParcelizer() {
        ImageView imageView = this.onRewind;
        if (imageView != null) {
            imageView.requestFocus();
        }
    }

    private void AudioAttributesCompatParcelizer(boolean z, View view) {
        if (view == null) {
            return;
        }
        view.setEnabled(z);
        view.setAlpha(z ? this.MediaBrowserCompatCustomActionResultReceiver : this.write);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void IconCompatParcelizer(isUnsafeBaseType isunsafebasetype, long j) {
        if (this.onFastForward) {
            if (isunsafebasetype.write(17) && isunsafebasetype.write(10)) {
                PolymorphicTypeValidator polymorphicTypeValidatorOnPrepare = isunsafebasetype.onPrepare();
                int iAudioAttributesCompatParcelizer = polymorphicTypeValidatorOnPrepare.AudioAttributesCompatParcelizer();
                int i = 0;
                while (true) {
                    long jWrite = polymorphicTypeValidatorOnPrepare.RemoteActionCompatParcelizer(i, this.addOnNewIntentListener).write();
                    if (j < jWrite) {
                        break;
                    }
                    if (i == iAudioAttributesCompatParcelizer - 1) {
                        j = jWrite;
                        break;
                    } else {
                        j -= jWrite;
                        i++;
                    }
                }
                isunsafebasetype.IconCompatParcelizer(i, j);
            }
        } else if (isunsafebasetype.write(5)) {
            isunsafebasetype.AudioAttributesCompatParcelizer(j);
        }
        onCommand();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void MediaDescriptionCompat() {
        if (this.onPrepareFromMediaId != null) {
            boolean z = !this.onPause;
            this.onPause = z;
            write(this.onAddQueueItem, z);
            write(this.onPlay, this.onPause);
            AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = this.onPrepareFromMediaId;
            if (audioAttributesCompatParcelizer != null) {
                audioAttributesCompatParcelizer.read();
            }
        }
    }

    private void write(ImageView imageView, boolean z) {
        if (imageView == null) {
            return;
        }
        if (z) {
            imageView.setImageDrawable(this.onPlayFromMediaId);
            imageView.setContentDescription(this.onCustomAction);
        } else {
            imageView.setImageDrawable(this.handleMediaPlayPauseIfPendingOnHandler);
            imageView.setContentDescription(this.onCommand);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void IconCompatParcelizer(int i) {
        if (i == 0) {
            IconCompatParcelizer(this.onRemoveQueueItem, (View) buildTypeSerializer.IconCompatParcelizer(this.r8lambdaKUbBm7ckfqTc9QCgukC86fguu4));
        } else if (i == 1) {
            IconCompatParcelizer(this.read, (View) buildTypeSerializer.IconCompatParcelizer(this.r8lambdaKUbBm7ckfqTc9QCgukC86fguu4));
        } else {
            this.PlaybackStateCompatCustomAction.dismiss();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.AudioAttributesImplApi26Parcelizer.write();
        this.onMediaButtonEvent = true;
        if (IconCompatParcelizer()) {
            this.AudioAttributesImplApi26Parcelizer.MediaBrowserCompatCustomActionResultReceiver();
        }
        MediaBrowserCompatItemReceiver();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.AudioAttributesImplApi26Parcelizer.read();
        this.onMediaButtonEvent = false;
        removeCallbacks(this.addContentView);
        this.AudioAttributesImplApi26Parcelizer.MediaBrowserCompatItemReceiver();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return read(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    public final boolean read(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        isUnsafeBaseType isunsafebasetype = this.onSetRating;
        if (isunsafebasetype == null || !RemoteActionCompatParcelizer(keyCode)) {
            return false;
        }
        if (keyEvent.getAction() != 0) {
            return true;
        }
        if (keyCode == 90) {
            if (isunsafebasetype.onRewind() == 4 || !isunsafebasetype.write(12)) {
                return true;
            }
            isunsafebasetype.MediaDescriptionCompat();
            return true;
        }
        if (keyCode == 89 && isunsafebasetype.write(11)) {
            isunsafebasetype.MediaBrowserCompatSearchResultReceiver();
            return true;
        }
        if (keyEvent.getRepeatCount() != 0) {
            return true;
        }
        if (keyCode == 79 || keyCode == 85) {
            LaissezFaireSubTypeValidator.IconCompatParcelizer(isunsafebasetype, this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28);
            return true;
        }
        if (keyCode == 87) {
            if (!isunsafebasetype.write(9)) {
                return true;
            }
            isunsafebasetype.RatingCompat();
            return true;
        }
        if (keyCode == 88) {
            if (!isunsafebasetype.write(7)) {
                return true;
            }
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

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.AudioAttributesImplApi26Parcelizer.AudioAttributesCompatParcelizer(i, i2, i3, i4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void read(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (!(i3 - i == i7 - i5 && i4 - i2 == i8 - i6) && this.PlaybackStateCompatCustomAction.isShowing()) {
            onPlay();
            int width = getWidth();
            int width2 = this.PlaybackStateCompatCustomAction.getWidth();
            this.PlaybackStateCompatCustomAction.update(view, (width - width2) - this._init_lambda2, (-this.PlaybackStateCompatCustomAction.getHeight()) - this._init_lambda2, -1, -1);
        }
    }

    private boolean MediaBrowserCompatMediaItem() {
        isUnsafeBaseType isunsafebasetype = this.onSetRating;
        if (isunsafebasetype == null || !isunsafebasetype.write(1)) {
            return false;
        }
        return (this.onSetRating.write(17) && this.onSetRating.onPrepare().RemoteActionCompatParcelizer()) ? false : true;
    }

    private static boolean RemoteActionCompatParcelizer(isUnsafeBaseType isunsafebasetype, PolymorphicTypeValidator.IconCompatParcelizer iconCompatParcelizer) {
        PolymorphicTypeValidator polymorphicTypeValidatorOnPrepare;
        int iAudioAttributesCompatParcelizer;
        if (!isunsafebasetype.write(17) || (iAudioAttributesCompatParcelizer = (polymorphicTypeValidatorOnPrepare = isunsafebasetype.onPrepare()).AudioAttributesCompatParcelizer()) <= 1 || iAudioAttributesCompatParcelizer > 100) {
            return false;
        }
        for (int i = 0; i < iAudioAttributesCompatParcelizer; i++) {
            if (polymorphicTypeValidatorOnPrepare.RemoteActionCompatParcelizer(i, iconCompatParcelizer).IconCompatParcelizer == C.TIME_UNSET) {
                return false;
            }
        }
        return true;
    }

    private static void write(View view, View.OnClickListener onClickListener) {
        if (view == null) {
            return;
        }
        view.setVisibility(8);
        view.setOnClickListener(onClickListener);
    }

    private static void RemoteActionCompatParcelizer(View view, boolean z) {
        if (view == null) {
            return;
        }
        if (z) {
            view.setVisibility(0);
        } else {
            view.setVisibility(8);
        }
    }

    private static int write(TypedArray typedArray, int i) {
        return typedArray.getInt(maximumCapacity.MediaDescriptionCompat.PlayerControlView_repeat_toggle_modes, i);
    }

    final class read implements isUnsafeBaseType.AudioAttributesCompatParcelizer, PrivateMaxEntriesMapRemovalTask.write, View.OnClickListener, PopupWindow.OnDismissListener {
        private read() {
        }

        /* synthetic */ read(PlayerControlView playerControlView, byte b) {
            this();
        }

        @Override // o.isUnsafeBaseType.AudioAttributesCompatParcelizer
        public final void IconCompatParcelizer(isUnsafeBaseType isunsafebasetype, isUnsafeBaseType.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
            if (remoteActionCompatParcelizer.read(4, 5, 13)) {
                PlayerControlView.this.MediaMetadataCompat();
            }
            if (remoteActionCompatParcelizer.read(4, 5, 7, 13)) {
                PlayerControlView.this.onCommand();
            }
            if (remoteActionCompatParcelizer.read(8, 13)) {
                PlayerControlView.this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
            }
            if (remoteActionCompatParcelizer.read(9, 13)) {
                PlayerControlView.this.onFastForward();
            }
            if (remoteActionCompatParcelizer.read(8, 9, 11, 0, 16, 17, 13)) {
                PlayerControlView.this.MediaBrowserCompatSearchResultReceiver();
            }
            if (remoteActionCompatParcelizer.read(11, 0, 13)) {
                PlayerControlView.this.onPlayFromMediaId();
            }
            if (remoteActionCompatParcelizer.read(12, 13)) {
                PlayerControlView.this.onCustomAction();
            }
            if (remoteActionCompatParcelizer.read(2, 13)) {
                PlayerControlView.this.onMediaButtonEvent();
            }
        }

        @Override // o.PrivateMaxEntriesMapRemovalTask.write
        public final void RemoteActionCompatParcelizer(long j) {
            PlayerControlView.this.ResultReceiver = true;
            if (PlayerControlView.this.onSetPlaybackSpeed != null) {
                PlayerControlView.this.onSetPlaybackSpeed.setText(LaissezFaireSubTypeValidator.read(PlayerControlView.this.MediaMetadataCompat, PlayerControlView.this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, j));
            }
            PlayerControlView.this.AudioAttributesImplApi26Parcelizer.MediaBrowserCompatItemReceiver();
        }

        @Override // o.PrivateMaxEntriesMapRemovalTask.write
        public final void IconCompatParcelizer(long j) {
            if (PlayerControlView.this.onSetPlaybackSpeed != null) {
                PlayerControlView.this.onSetPlaybackSpeed.setText(LaissezFaireSubTypeValidator.read(PlayerControlView.this.MediaMetadataCompat, PlayerControlView.this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, j));
            }
        }

        @Override // o.PrivateMaxEntriesMapRemovalTask.write
        public final void RemoteActionCompatParcelizer(long j, boolean z) {
            PlayerControlView.this.ResultReceiver = false;
            if (!z && PlayerControlView.this.onSetRating != null) {
                PlayerControlView playerControlView = PlayerControlView.this;
                playerControlView.IconCompatParcelizer(playerControlView.onSetRating, j);
            }
            PlayerControlView.this.AudioAttributesImplApi26Parcelizer.MediaBrowserCompatCustomActionResultReceiver();
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public final void onDismiss() {
            if (PlayerControlView.this.onPrepare) {
                PlayerControlView.this.AudioAttributesImplApi26Parcelizer.MediaBrowserCompatCustomActionResultReceiver();
            }
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            isUnsafeBaseType isunsafebasetype = PlayerControlView.this.onSetRating;
            if (isunsafebasetype != null) {
                PlayerControlView.this.AudioAttributesImplApi26Parcelizer.MediaBrowserCompatCustomActionResultReceiver();
                if (PlayerControlView.this.onPlayFromUri != view) {
                    if (PlayerControlView.this.onSetShuffleMode != view) {
                        if (PlayerControlView.this.MediaBrowserCompatSearchResultReceiver != view) {
                            if (PlayerControlView.this.MediaSessionCompatResultReceiverWrapper != view) {
                                if (PlayerControlView.this.onRewind == view) {
                                    LaissezFaireSubTypeValidator.IconCompatParcelizer(isunsafebasetype, PlayerControlView.this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28);
                                    return;
                                }
                                if (PlayerControlView.this.ParcelableVolumeInfo != view) {
                                    if (PlayerControlView.this.r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8 != view) {
                                        if (PlayerControlView.this.r8lambdaKUbBm7ckfqTc9QCgukC86fguu4 == view) {
                                            PlayerControlView.this.AudioAttributesImplApi26Parcelizer.MediaBrowserCompatItemReceiver();
                                            PlayerControlView playerControlView = PlayerControlView.this;
                                            playerControlView.IconCompatParcelizer(playerControlView.r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw, PlayerControlView.this.r8lambdaKUbBm7ckfqTc9QCgukC86fguu4);
                                            return;
                                        }
                                        if (PlayerControlView.this.onSeekTo == view) {
                                            PlayerControlView.this.AudioAttributesImplApi26Parcelizer.MediaBrowserCompatItemReceiver();
                                            PlayerControlView playerControlView2 = PlayerControlView.this;
                                            playerControlView2.IconCompatParcelizer(playerControlView2.onRemoveQueueItem, PlayerControlView.this.onSeekTo);
                                            return;
                                        } else if (PlayerControlView.this.RemoteActionCompatParcelizer == view) {
                                            PlayerControlView.this.AudioAttributesImplApi26Parcelizer.MediaBrowserCompatItemReceiver();
                                            PlayerControlView playerControlView3 = PlayerControlView.this;
                                            playerControlView3.IconCompatParcelizer(playerControlView3.read, PlayerControlView.this.RemoteActionCompatParcelizer);
                                            return;
                                        } else {
                                            if (PlayerControlView.this.accessaddObserverForBackInvoker == view) {
                                                PlayerControlView.this.AudioAttributesImplApi26Parcelizer.MediaBrowserCompatItemReceiver();
                                                PlayerControlView playerControlView4 = PlayerControlView.this;
                                                playerControlView4.IconCompatParcelizer(playerControlView4.accessonBackPresseds1027565324, PlayerControlView.this.accessaddObserverForBackInvoker);
                                                return;
                                            }
                                            return;
                                        }
                                    }
                                    if (isunsafebasetype.write(14)) {
                                        isunsafebasetype.IconCompatParcelizer(!isunsafebasetype.onSetPlaybackSpeed());
                                        return;
                                    }
                                    return;
                                }
                                if (isunsafebasetype.write(15)) {
                                    isunsafebasetype.IconCompatParcelizer(AsPropertyTypeSerializer.AudioAttributesCompatParcelizer(isunsafebasetype.onSetShuffleMode(), PlayerControlView.this.MediaSessionCompatQueueItem));
                                    return;
                                }
                                return;
                            }
                            if (isunsafebasetype.write(11)) {
                                isunsafebasetype.MediaBrowserCompatSearchResultReceiver();
                                return;
                            }
                            return;
                        }
                        if (isunsafebasetype.onRewind() == 4 || !isunsafebasetype.write(12)) {
                            return;
                        }
                        isunsafebasetype.MediaDescriptionCompat();
                        return;
                    }
                    if (isunsafebasetype.write(7)) {
                        isunsafebasetype.MediaBrowserCompatMediaItem();
                        return;
                    }
                    return;
                }
                if (isunsafebasetype.write(9)) {
                    isunsafebasetype.RatingCompat();
                }
            }
        }
    }

    class AudioAttributesImplApi21Parcelizer extends RecyclerView.IconCompatParcelizer<MediaBrowserCompatItemReceiver> {
        private final Drawable[] AudioAttributesCompatParcelizer;
        private final String[] IconCompatParcelizer;
        private final String[] read;

        @Override // androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
        public final long getItemId(int i) {
            return i;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
        public final /* synthetic */ RecyclerView.onMediaButtonEvent onCreateViewHolder(ViewGroup viewGroup, int i) {
            return read(viewGroup);
        }

        public AudioAttributesImplApi21Parcelizer(String[] strArr, Drawable[] drawableArr) {
            this.IconCompatParcelizer = strArr;
            this.read = new String[strArr.length];
            this.AudioAttributesCompatParcelizer = drawableArr;
        }

        private MediaBrowserCompatItemReceiver read(ViewGroup viewGroup) {
            return PlayerControlView.this.new MediaBrowserCompatItemReceiver(LayoutInflater.from(PlayerControlView.this.getContext()).inflate(maximumCapacity.AudioAttributesImplApi21Parcelizer.exo_styled_settings_list_item, viewGroup, false));
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(MediaBrowserCompatItemReceiver mediaBrowserCompatItemReceiver, int i) {
            if (read(i)) {
                mediaBrowserCompatItemReceiver.itemView.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
            } else {
                mediaBrowserCompatItemReceiver.itemView.setLayoutParams(new RecyclerView.LayoutParams(0, 0));
            }
            mediaBrowserCompatItemReceiver.IconCompatParcelizer.setText(this.IconCompatParcelizer[i]);
            if (this.read[i] == null) {
                mediaBrowserCompatItemReceiver.AudioAttributesCompatParcelizer.setVisibility(8);
            } else {
                mediaBrowserCompatItemReceiver.AudioAttributesCompatParcelizer.setText(this.read[i]);
            }
            if (this.AudioAttributesCompatParcelizer[i] == null) {
                mediaBrowserCompatItemReceiver.write.setVisibility(8);
            } else {
                mediaBrowserCompatItemReceiver.write.setImageDrawable(this.AudioAttributesCompatParcelizer[i]);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
        public final int getItemCount() {
            return this.IconCompatParcelizer.length;
        }

        public final void IconCompatParcelizer(int i, String str) {
            this.read[i] = str;
        }

        public final boolean read() {
            return read(1) || read(0);
        }

        private boolean read(int i) {
            if (PlayerControlView.this.onSetRating == null) {
                return false;
            }
            if (i == 0) {
                return PlayerControlView.this.onSetRating.write(13);
            }
            if (i != 1) {
                return true;
            }
            return PlayerControlView.this.onSetRating.write(30) && PlayerControlView.this.onSetRating.write(29);
        }
    }

    public final class MediaBrowserCompatItemReceiver extends RecyclerView.onMediaButtonEvent {
        private final TextView AudioAttributesCompatParcelizer;
        private final TextView IconCompatParcelizer;
        private final ImageView write;

        public MediaBrowserCompatItemReceiver(View view) {
            super(view);
            if (LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver < 26) {
                view.setFocusable(true);
            }
            this.IconCompatParcelizer = (TextView) view.findViewById(maximumCapacity.AudioAttributesImplBaseParcelizer.exo_main_text);
            this.AudioAttributesCompatParcelizer = (TextView) view.findViewById(maximumCapacity.AudioAttributesImplBaseParcelizer.exo_sub_text);
            this.write = (ImageView) view.findViewById(maximumCapacity.AudioAttributesImplBaseParcelizer.exo_icon);
            view.setOnClickListener(new View.OnClickListener() { // from class: o.drainReadBuffer
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.read.read();
                }
            });
        }

        public final /* synthetic */ void read() {
            PlayerControlView.this.IconCompatParcelizer(getBindingAdapterPosition());
        }
    }

    public final class IconCompatParcelizer extends RecyclerView.IconCompatParcelizer<MediaBrowserCompatCustomActionResultReceiver> {
        private final float[] AudioAttributesCompatParcelizer;
        private final String[] IconCompatParcelizer;
        private int RemoteActionCompatParcelizer;

        @Override // androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
        public final /* synthetic */ RecyclerView.onMediaButtonEvent onCreateViewHolder(ViewGroup viewGroup, int i) {
            return RemoteActionCompatParcelizer(viewGroup);
        }

        public IconCompatParcelizer(String[] strArr, float[] fArr) {
            this.IconCompatParcelizer = strArr;
            this.AudioAttributesCompatParcelizer = fArr;
        }

        public final void write(float f) {
            int i = 0;
            float f2 = Float.MAX_VALUE;
            int i2 = 0;
            while (true) {
                float[] fArr = this.AudioAttributesCompatParcelizer;
                if (i < fArr.length) {
                    float fAbs = Math.abs(f - fArr[i]);
                    if (fAbs < f2) {
                        i2 = i;
                        f2 = fAbs;
                    }
                    i++;
                } else {
                    this.RemoteActionCompatParcelizer = i2;
                    return;
                }
            }
        }

        public final String AudioAttributesCompatParcelizer() {
            return this.IconCompatParcelizer[this.RemoteActionCompatParcelizer];
        }

        private MediaBrowserCompatCustomActionResultReceiver RemoteActionCompatParcelizer(ViewGroup viewGroup) {
            return new MediaBrowserCompatCustomActionResultReceiver(LayoutInflater.from(PlayerControlView.this.getContext()).inflate(maximumCapacity.AudioAttributesImplApi21Parcelizer.exo_styled_sub_settings_list_item, viewGroup, false));
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiver, final int i) {
            if (i < this.IconCompatParcelizer.length) {
                mediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer.setText(this.IconCompatParcelizer[i]);
            }
            if (i == this.RemoteActionCompatParcelizer) {
                mediaBrowserCompatCustomActionResultReceiver.itemView.setSelected(true);
                mediaBrowserCompatCustomActionResultReceiver.RemoteActionCompatParcelizer.setVisibility(0);
            } else {
                mediaBrowserCompatCustomActionResultReceiver.itemView.setSelected(false);
                mediaBrowserCompatCustomActionResultReceiver.RemoteActionCompatParcelizer.setVisibility(4);
            }
            mediaBrowserCompatCustomActionResultReceiver.itemView.setOnClickListener(new View.OnClickListener() { // from class: o.drainOnReadIfNeeded
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(i);
                }
            });
        }

        public final /* synthetic */ void AudioAttributesCompatParcelizer(int i) {
            if (i != this.RemoteActionCompatParcelizer) {
                PlayerControlView.this.AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer[i]);
            }
            PlayerControlView.this.PlaybackStateCompatCustomAction.dismiss();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
        public final int getItemCount() {
            return this.IconCompatParcelizer.length;
        }
    }

    public static final class AudioAttributesImplApi26Parcelizer {
        public final collectAndResolveSubtypesByTypeId.write IconCompatParcelizer;
        public final String read;
        public final int write;

        public AudioAttributesImplApi26Parcelizer(collectAndResolveSubtypesByTypeId collectandresolvesubtypesbytypeid, int i, int i2, String str) {
            this.IconCompatParcelizer = collectandresolvesubtypesbytypeid.IconCompatParcelizer().get(i);
            this.write = i2;
            this.read = str;
        }

        public final boolean write() {
            return this.IconCompatParcelizer.read(this.write);
        }
    }

    public final class AudioAttributesImplBaseParcelizer extends MediaMetadataCompat {
        @Override // androidx.media3.ui.PlayerControlView.MediaMetadataCompat
        public final void write(String str) {
        }

        private AudioAttributesImplBaseParcelizer() {
            super();
        }

        /* synthetic */ AudioAttributesImplBaseParcelizer(PlayerControlView playerControlView, byte b) {
            this();
        }

        public final void AudioAttributesCompatParcelizer(List<AudioAttributesImplApi26Parcelizer> list) {
            boolean z = false;
            int i = 0;
            while (true) {
                if (i >= list.size()) {
                    break;
                }
                if (list.get(i).write()) {
                    z = true;
                    break;
                }
                i++;
            }
            if (PlayerControlView.this.accessaddObserverForBackInvoker != null) {
                ImageView imageView = PlayerControlView.this.accessaddObserverForBackInvoker;
                PlayerControlView playerControlView = PlayerControlView.this;
                imageView.setImageDrawable(z ? playerControlView.addObserverForBackInvokerlambda7 : playerControlView.ensureViewModelStore);
                PlayerControlView.this.accessaddObserverForBackInvoker.setContentDescription(z ? PlayerControlView.this.addObserverForBackInvoker : PlayerControlView.this.createFullyDrawnExecutor);
            }
            this.IconCompatParcelizer = list;
        }

        @Override // androidx.media3.ui.PlayerControlView.MediaMetadataCompat
        public final void read(MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiver) {
            boolean z;
            mediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer.setText(maximumCapacity.MediaBrowserCompatCustomActionResultReceiver.exo_track_selection_none);
            int i = 0;
            while (true) {
                if (i >= this.IconCompatParcelizer.size()) {
                    z = true;
                    break;
                } else {
                    if (this.IconCompatParcelizer.get(i).write()) {
                        z = false;
                        break;
                    }
                    i++;
                }
            }
            mediaBrowserCompatCustomActionResultReceiver.RemoteActionCompatParcelizer.setVisibility(z ? 0 : 4);
            mediaBrowserCompatCustomActionResultReceiver.itemView.setOnClickListener(new View.OnClickListener() { // from class: o.drainReadBuffers
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.RemoteActionCompatParcelizer.IconCompatParcelizer();
                }
            });
        }

        public final /* synthetic */ void IconCompatParcelizer() {
            if (PlayerControlView.this.onSetRating == null || !PlayerControlView.this.onSetRating.write(29)) {
                return;
            }
            PlayerControlView.this.onSetRating.AudioAttributesCompatParcelizer(PlayerControlView.this.onSetRating.onStop().write().write(3).AudioAttributesCompatParcelizer(-3).read());
            PlayerControlView.this.PlaybackStateCompatCustomAction.dismiss();
        }

        @Override // androidx.media3.ui.PlayerControlView.MediaMetadataCompat, androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final void onBindViewHolder(MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiver, int i) {
            super.onBindViewHolder(mediaBrowserCompatCustomActionResultReceiver, i);
            if (i > 0) {
                mediaBrowserCompatCustomActionResultReceiver.RemoteActionCompatParcelizer.setVisibility(this.IconCompatParcelizer.get(i + (-1)).write() ? 0 : 4);
            }
        }
    }

    public final class write extends MediaMetadataCompat {
        private write() {
            super();
        }

        /* synthetic */ write(PlayerControlView playerControlView, byte b) {
            this();
        }

        @Override // androidx.media3.ui.PlayerControlView.MediaMetadataCompat
        public final void read(MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiver) {
            mediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer.setText(maximumCapacity.MediaBrowserCompatCustomActionResultReceiver.exo_track_selection_auto);
            mediaBrowserCompatCustomActionResultReceiver.RemoteActionCompatParcelizer.setVisibility(IconCompatParcelizer(((isUnsafeBaseType) buildTypeSerializer.IconCompatParcelizer(PlayerControlView.this.onSetRating)).onStop()) ? 4 : 0);
            mediaBrowserCompatCustomActionResultReceiver.itemView.setOnClickListener(new View.OnClickListener() { // from class: o.afterRead
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.AudioAttributesCompatParcelizer.read();
                }
            });
        }

        public final /* synthetic */ void read() {
            if (PlayerControlView.this.onSetRating == null || !PlayerControlView.this.onSetRating.write(29)) {
                return;
            }
            ((isUnsafeBaseType) LaissezFaireSubTypeValidator.IconCompatParcelizer(PlayerControlView.this.onSetRating)).AudioAttributesCompatParcelizer(PlayerControlView.this.onSetRating.onStop().write().write(1).AudioAttributesCompatParcelizer(1, false).read());
            PlayerControlView.this.r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw.IconCompatParcelizer(1, PlayerControlView.this.getResources().getString(maximumCapacity.MediaBrowserCompatCustomActionResultReceiver.exo_track_selection_auto));
            PlayerControlView.this.PlaybackStateCompatCustomAction.dismiss();
        }

        private boolean IconCompatParcelizer(SubtypeResolver subtypeResolver) {
            for (int i = 0; i < this.IconCompatParcelizer.size(); i++) {
                if (subtypeResolver.onAddQueueItem.containsKey(this.IconCompatParcelizer.get(i).IconCompatParcelizer.read())) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.media3.ui.PlayerControlView.MediaMetadataCompat
        public final void write(String str) {
            PlayerControlView.this.r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw.IconCompatParcelizer(1, str);
        }

        public final void read(List<AudioAttributesImplApi26Parcelizer> list) {
            this.IconCompatParcelizer = list;
            SubtypeResolver subtypeResolverOnStop = ((isUnsafeBaseType) buildTypeSerializer.IconCompatParcelizer(PlayerControlView.this.onSetRating)).onStop();
            if (list.isEmpty()) {
                PlayerControlView.this.r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw.IconCompatParcelizer(1, PlayerControlView.this.getResources().getString(maximumCapacity.MediaBrowserCompatCustomActionResultReceiver.exo_track_selection_none));
                return;
            }
            if (!IconCompatParcelizer(subtypeResolverOnStop)) {
                PlayerControlView.this.r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw.IconCompatParcelizer(1, PlayerControlView.this.getResources().getString(maximumCapacity.MediaBrowserCompatCustomActionResultReceiver.exo_track_selection_auto));
                return;
            }
            for (int i = 0; i < list.size(); i++) {
                AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer = list.get(i);
                if (audioAttributesImplApi26Parcelizer.write()) {
                    PlayerControlView.this.r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw.IconCompatParcelizer(1, audioAttributesImplApi26Parcelizer.read);
                    return;
                }
            }
        }
    }

    public abstract class MediaMetadataCompat extends RecyclerView.IconCompatParcelizer<MediaBrowserCompatCustomActionResultReceiver> {
        protected List<AudioAttributesImplApi26Parcelizer> IconCompatParcelizer = new ArrayList();

        protected abstract void read(MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiver);

        protected abstract void write(String str);

        @Override // androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
        public /* synthetic */ RecyclerView.onMediaButtonEvent onCreateViewHolder(ViewGroup viewGroup, int i) {
            return IconCompatParcelizer(viewGroup);
        }

        protected MediaMetadataCompat() {
        }

        private MediaBrowserCompatCustomActionResultReceiver IconCompatParcelizer(ViewGroup viewGroup) {
            return new MediaBrowserCompatCustomActionResultReceiver(LayoutInflater.from(PlayerControlView.this.getContext()).inflate(maximumCapacity.AudioAttributesImplApi21Parcelizer.exo_styled_sub_settings_list_item, viewGroup, false));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer */
        public void onBindViewHolder(MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiver, int i) {
            final isUnsafeBaseType isunsafebasetype = PlayerControlView.this.onSetRating;
            if (isunsafebasetype == null) {
                return;
            }
            if (i == 0) {
                read(mediaBrowserCompatCustomActionResultReceiver);
                return;
            }
            final AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer = this.IconCompatParcelizer.get(i - 1);
            final setName setname = audioAttributesImplApi26Parcelizer.IconCompatParcelizer.read();
            boolean z = isunsafebasetype.onStop().onAddQueueItem.get(setname) != null && audioAttributesImplApi26Parcelizer.write();
            mediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer.setText(audioAttributesImplApi26Parcelizer.read);
            mediaBrowserCompatCustomActionResultReceiver.RemoteActionCompatParcelizer.setVisibility(z ? 0 : 4);
            mediaBrowserCompatCustomActionResultReceiver.itemView.setOnClickListener(new View.OnClickListener() { // from class: o.drainBuffers
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.RemoteActionCompatParcelizer.IconCompatParcelizer(isunsafebasetype, setname, audioAttributesImplApi26Parcelizer);
                }
            });
        }

        public final /* synthetic */ void IconCompatParcelizer(isUnsafeBaseType isunsafebasetype, setName setname, AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer) {
            if (isunsafebasetype.write(29)) {
                isunsafebasetype.AudioAttributesCompatParcelizer(isunsafebasetype.onStop().write().write(new TypeDeserializer(setname, initExtraTracks.read(Integer.valueOf(audioAttributesImplApi26Parcelizer.write)))).AudioAttributesCompatParcelizer(audioAttributesImplApi26Parcelizer.IconCompatParcelizer.AudioAttributesCompatParcelizer(), false).read());
                write(audioAttributesImplApi26Parcelizer.read);
                PlayerControlView.this.PlaybackStateCompatCustomAction.dismiss();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
        public int getItemCount() {
            if (this.IconCompatParcelizer.isEmpty()) {
                return 0;
            }
            return this.IconCompatParcelizer.size() + 1;
        }

        protected final void AudioAttributesCompatParcelizer() {
            this.IconCompatParcelizer = Collections.emptyList();
        }
    }

    static class MediaBrowserCompatCustomActionResultReceiver extends RecyclerView.onMediaButtonEvent {
        public final TextView IconCompatParcelizer;
        public final View RemoteActionCompatParcelizer;

        public MediaBrowserCompatCustomActionResultReceiver(View view) {
            super(view);
            if (LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver < 26) {
                view.setFocusable(true);
            }
            this.IconCompatParcelizer = (TextView) view.findViewById(maximumCapacity.AudioAttributesImplBaseParcelizer.exo_text);
            this.RemoteActionCompatParcelizer = view.findViewById(maximumCapacity.AudioAttributesImplBaseParcelizer.exo_check);
        }
    }
}
