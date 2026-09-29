package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import android.view.Display;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Constraints;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.FromStringDeserializer;
import kotlin.JdkDeserializers;
import kotlin.JsonNodeDeserializer;
import kotlin.JsonNodeDeserializerArrayDeserializer;
import kotlin.JsonNodeDeserializerObjectDeserializer;
import kotlin.NumberDeserializersIntegerDeserializer;
import kotlin.NumberDeserializersShortDeserializer;
import kotlin.PrimitiveArrayDeserializersBooleanDeser;
import kotlin.PrimitiveArrayDeserializersFloatDeser;
import kotlin.PrimitiveArrayDeserializersShortDeser;
import kotlin.ReferenceTypeDeserializer;
import kotlin._deSerializeBCP47Locale;
import kotlin._deserializeUsingCreator;
import kotlin._isBlank;
import kotlin._long;
import kotlin._parseDouble;
import kotlin._readAndBindStringKeyMap;
import kotlin._readAndUpdateStringKeyMap;
import kotlin.handleSingleElementUnwrapped;
import kotlin.resetAsObject;

/* JADX INFO: loaded from: classes2.dex */
public class MotionLayout extends ConstraintLayout implements resetAsObject {
    public static boolean RemoteActionCompatParcelizer = false;
    public int AudioAttributesCompatParcelizer;
    float AudioAttributesImplApi21Parcelizer;
    protected boolean AudioAttributesImplApi26Parcelizer;
    public float AudioAttributesImplBaseParcelizer;
    int IconCompatParcelizer;
    HashMap<View, handleSingleElementUnwrapped> MediaBrowserCompatCustomActionResultReceiver;
    int MediaBrowserCompatItemReceiver;
    int MediaBrowserCompatMediaItem;
    int MediaBrowserCompatSearchResultReceiver;
    int MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    public PrimitiveArrayDeserializersFloatDeser MediaDescriptionCompat;
    HashMap<View, _parseDouble> MediaMetadataCompat;
    private int MediaSessionCompatQueueItem;
    private int MediaSessionCompatResultReceiverWrapper;
    private int MediaSessionCompatToken;
    private int ParcelableVolumeInfo;
    private float PlaybackStateCompat;
    private boolean PlaybackStateCompatCustomAction;
    int RatingCompat;
    private int ResultReceiver;
    private ArrayList<MotionHelper> _init_lambda2;
    private int _init_lambda3;
    private float _init_lambda4;
    private View _init_lambda5;
    private Interpolator accessaddObserverForBackInvoker;
    private int accessensureViewModelStore;
    private int[] accessgetReportFullyDrawnExecutorp;
    private MediaBrowserCompatCustomActionResultReceiver accessonBackPresseds1027565324;
    private ArrayList<Integer> addContentView;
    private boolean addMenuProvider;
    private float addObserverForBackInvoker;
    private float addObserverForBackInvokerlambda7;
    private boolean addOnConfigurationChangedListener;
    private long addOnContextAvailableListener;
    private float addOnMultiWindowModeChangedListener;
    private AudioAttributesImplApi26Parcelizer addOnNewIntentListener;
    private CopyOnWriteArrayList<AudioAttributesImplApi26Parcelizer> addOnPictureInPictureModeChangedListener;
    private boolean addOnTrimMemoryListener;
    private NumberDeserializersIntegerDeserializer createFullyDrawnExecutor;
    private long ensureViewModelStore;
    private AudioAttributesImplApi21Parcelizer getActivityResultRegistry;
    private float getOnBackPressedDispatcherannotations;
    private Rect getSavedStateRegistryControllerannotations;
    private float menuHostHelperlambda0;
    float onCustomAction;
    private boolean onFastForward;
    private long onMediaButtonEvent;
    private float onPause;
    private int onPlay;
    private float onPlayFromMediaId;
    private ArrayList<MotionHelper> onPlayFromSearch;
    private RectF onPlayFromUri;
    private RemoteActionCompatParcelizer onPrepare;
    private boolean onPrepareFromMediaId;
    private AudioAttributesCompatParcelizer onPrepareFromSearch;
    private int onPrepareFromUri;
    private boolean onRemoveQueueItem;
    private boolean onRemoveQueueItemAt;
    private boolean onRewind;
    private int onSeekTo;
    private boolean onSetCaptioningEnabled;
    private boolean onSetPlaybackSpeed;
    private boolean onSetRating;
    private Interpolator onSetRepeatMode;
    private Matrix onSetShuffleMode;
    private float onSkipToNext;
    private long onSkipToPrevious;
    private FromStringDeserializer onSkipToQueueItem;
    private int onStop;
    private Runnable r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw;
    private IconCompatParcelizer r8lambdaKUbBm7ckfqTc9QCgukC86fguu4;
    private int r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
    private int r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;
    private int r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8;
    private ArrayList<MotionHelper> r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0;
    public int read;
    private boolean setSessionImpl;
    int write;

    public enum AudioAttributesImplApi21Parcelizer {
        UNDEFINED,
        SETUP,
        MOVING,
        FINISHED
    }

    public interface AudioAttributesImplApi26Parcelizer {
        void read(int i);
    }

    public interface write {
        float RemoteActionCompatParcelizer();

        void RemoteActionCompatParcelizer(int i);

        void RemoteActionCompatParcelizer(MotionEvent motionEvent);

        float read();

        void write();
    }

    private static boolean write(float f, float f2, float f3) {
        if (f > BitmapDescriptorFactory.HUE_RED) {
            float f4 = f / f3;
            return f2 + ((f * f4) - (((f3 * f4) * f4) / 2.0f)) > 1.0f;
        }
        float f5 = (-f) / f3;
        return f2 + ((f * f5) + (((f3 * f5) * f5) / 2.0f)) < BitmapDescriptorFactory.HUE_RED;
    }

    @Override // kotlin.resetAsArray
    public void AudioAttributesCompatParcelizer(View view, int i, int i2, int i3, int i4, int i5) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    public final handleSingleElementUnwrapped AudioAttributesCompatParcelizer(int i) {
        return this.MediaBrowserCompatCustomActionResultReceiver.get(findViewById(i));
    }

    public MotionLayout(Context context) {
        super(context);
        this.accessaddObserverForBackInvoker = null;
        this.AudioAttributesImplBaseParcelizer = BitmapDescriptorFactory.HUE_RED;
        this.onPlay = -1;
        this.AudioAttributesCompatParcelizer = -1;
        this.onPrepareFromUri = -1;
        this.MediaSessionCompatQueueItem = 0;
        this.onStop = 0;
        this.onSetRating = true;
        this.MediaBrowserCompatCustomActionResultReceiver = new HashMap<>();
        this.onMediaButtonEvent = 0L;
        this.menuHostHelperlambda0 = 1.0f;
        this.addOnMultiWindowModeChangedListener = BitmapDescriptorFactory.HUE_RED;
        this.onCustomAction = BitmapDescriptorFactory.HUE_RED;
        this.getOnBackPressedDispatcherannotations = BitmapDescriptorFactory.HUE_RED;
        this.onRemoveQueueItem = false;
        this.onSetCaptioningEnabled = false;
        this.read = 0;
        this.addMenuProvider = false;
        this.createFullyDrawnExecutor = new NumberDeserializersIntegerDeserializer();
        this.onPrepareFromSearch = new AudioAttributesCompatParcelizer();
        this.onFastForward = true;
        this.addOnTrimMemoryListener = false;
        this.setSessionImpl = false;
        this._init_lambda2 = null;
        this.r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0 = null;
        this.onPlayFromSearch = null;
        this.addOnPictureInPictureModeChangedListener = null;
        this.onSeekTo = 0;
        this.onSkipToPrevious = -1L;
        this.onSkipToNext = BitmapDescriptorFactory.HUE_RED;
        this.ParcelableVolumeInfo = 0;
        this.PlaybackStateCompat = BitmapDescriptorFactory.HUE_RED;
        this.onSetPlaybackSpeed = false;
        this.AudioAttributesImplApi26Parcelizer = false;
        this.onSkipToQueueItem = new FromStringDeserializer();
        this.onRewind = false;
        this.r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw = null;
        this.accessgetReportFullyDrawnExecutorp = null;
        this.accessensureViewModelStore = 0;
        this.onRemoveQueueItemAt = false;
        this.RatingCompat = 0;
        this.MediaMetadataCompat = new HashMap<>();
        this.getSavedStateRegistryControllerannotations = new Rect();
        this.onPrepareFromMediaId = false;
        this.getActivityResultRegistry = AudioAttributesImplApi21Parcelizer.UNDEFINED;
        this.r8lambdaKUbBm7ckfqTc9QCgukC86fguu4 = new IconCompatParcelizer();
        this.PlaybackStateCompatCustomAction = false;
        this.onPlayFromUri = new RectF();
        this._init_lambda5 = null;
        this.onSetShuffleMode = null;
        this.addContentView = new ArrayList<>();
        AudioAttributesCompatParcelizer((AttributeSet) null);
    }

    public MotionLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.accessaddObserverForBackInvoker = null;
        this.AudioAttributesImplBaseParcelizer = BitmapDescriptorFactory.HUE_RED;
        this.onPlay = -1;
        this.AudioAttributesCompatParcelizer = -1;
        this.onPrepareFromUri = -1;
        this.MediaSessionCompatQueueItem = 0;
        this.onStop = 0;
        this.onSetRating = true;
        this.MediaBrowserCompatCustomActionResultReceiver = new HashMap<>();
        this.onMediaButtonEvent = 0L;
        this.menuHostHelperlambda0 = 1.0f;
        this.addOnMultiWindowModeChangedListener = BitmapDescriptorFactory.HUE_RED;
        this.onCustomAction = BitmapDescriptorFactory.HUE_RED;
        this.getOnBackPressedDispatcherannotations = BitmapDescriptorFactory.HUE_RED;
        this.onRemoveQueueItem = false;
        this.onSetCaptioningEnabled = false;
        this.read = 0;
        this.addMenuProvider = false;
        this.createFullyDrawnExecutor = new NumberDeserializersIntegerDeserializer();
        this.onPrepareFromSearch = new AudioAttributesCompatParcelizer();
        this.onFastForward = true;
        this.addOnTrimMemoryListener = false;
        this.setSessionImpl = false;
        this._init_lambda2 = null;
        this.r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0 = null;
        this.onPlayFromSearch = null;
        this.addOnPictureInPictureModeChangedListener = null;
        this.onSeekTo = 0;
        this.onSkipToPrevious = -1L;
        this.onSkipToNext = BitmapDescriptorFactory.HUE_RED;
        this.ParcelableVolumeInfo = 0;
        this.PlaybackStateCompat = BitmapDescriptorFactory.HUE_RED;
        this.onSetPlaybackSpeed = false;
        this.AudioAttributesImplApi26Parcelizer = false;
        this.onSkipToQueueItem = new FromStringDeserializer();
        this.onRewind = false;
        this.r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw = null;
        this.accessgetReportFullyDrawnExecutorp = null;
        this.accessensureViewModelStore = 0;
        this.onRemoveQueueItemAt = false;
        this.RatingCompat = 0;
        this.MediaMetadataCompat = new HashMap<>();
        this.getSavedStateRegistryControllerannotations = new Rect();
        this.onPrepareFromMediaId = false;
        this.getActivityResultRegistry = AudioAttributesImplApi21Parcelizer.UNDEFINED;
        this.r8lambdaKUbBm7ckfqTc9QCgukC86fguu4 = new IconCompatParcelizer();
        this.PlaybackStateCompatCustomAction = false;
        this.onPlayFromUri = new RectF();
        this._init_lambda5 = null;
        this.onSetShuffleMode = null;
        this.addContentView = new ArrayList<>();
        AudioAttributesCompatParcelizer(attributeSet);
    }

    public MotionLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.accessaddObserverForBackInvoker = null;
        this.AudioAttributesImplBaseParcelizer = BitmapDescriptorFactory.HUE_RED;
        this.onPlay = -1;
        this.AudioAttributesCompatParcelizer = -1;
        this.onPrepareFromUri = -1;
        this.MediaSessionCompatQueueItem = 0;
        this.onStop = 0;
        this.onSetRating = true;
        this.MediaBrowserCompatCustomActionResultReceiver = new HashMap<>();
        this.onMediaButtonEvent = 0L;
        this.menuHostHelperlambda0 = 1.0f;
        this.addOnMultiWindowModeChangedListener = BitmapDescriptorFactory.HUE_RED;
        this.onCustomAction = BitmapDescriptorFactory.HUE_RED;
        this.getOnBackPressedDispatcherannotations = BitmapDescriptorFactory.HUE_RED;
        this.onRemoveQueueItem = false;
        this.onSetCaptioningEnabled = false;
        this.read = 0;
        this.addMenuProvider = false;
        this.createFullyDrawnExecutor = new NumberDeserializersIntegerDeserializer();
        this.onPrepareFromSearch = new AudioAttributesCompatParcelizer();
        this.onFastForward = true;
        this.addOnTrimMemoryListener = false;
        this.setSessionImpl = false;
        this._init_lambda2 = null;
        this.r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0 = null;
        this.onPlayFromSearch = null;
        this.addOnPictureInPictureModeChangedListener = null;
        this.onSeekTo = 0;
        this.onSkipToPrevious = -1L;
        this.onSkipToNext = BitmapDescriptorFactory.HUE_RED;
        this.ParcelableVolumeInfo = 0;
        this.PlaybackStateCompat = BitmapDescriptorFactory.HUE_RED;
        this.onSetPlaybackSpeed = false;
        this.AudioAttributesImplApi26Parcelizer = false;
        this.onSkipToQueueItem = new FromStringDeserializer();
        this.onRewind = false;
        this.r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw = null;
        this.accessgetReportFullyDrawnExecutorp = null;
        this.accessensureViewModelStore = 0;
        this.onRemoveQueueItemAt = false;
        this.RatingCompat = 0;
        this.MediaMetadataCompat = new HashMap<>();
        this.getSavedStateRegistryControllerannotations = new Rect();
        this.onPrepareFromMediaId = false;
        this.getActivityResultRegistry = AudioAttributesImplApi21Parcelizer.UNDEFINED;
        this.r8lambdaKUbBm7ckfqTc9QCgukC86fguu4 = new IconCompatParcelizer();
        this.PlaybackStateCompatCustomAction = false;
        this.onPlayFromUri = new RectF();
        this._init_lambda5 = null;
        this.onSetShuffleMode = null;
        this.addContentView = new ArrayList<>();
        AudioAttributesCompatParcelizer(attributeSet);
    }

    private static long onPause() {
        return System.nanoTime();
    }

    public static write AudioAttributesImplApi26Parcelizer() {
        return read.IconCompatParcelizer();
    }

    public final void write(AudioAttributesImplApi21Parcelizer audioAttributesImplApi21Parcelizer) {
        if (audioAttributesImplApi21Parcelizer == AudioAttributesImplApi21Parcelizer.FINISHED && this.AudioAttributesCompatParcelizer == -1) {
            return;
        }
        AudioAttributesImplApi21Parcelizer audioAttributesImplApi21Parcelizer2 = this.getActivityResultRegistry;
        this.getActivityResultRegistry = audioAttributesImplApi21Parcelizer;
        if (audioAttributesImplApi21Parcelizer2 == AudioAttributesImplApi21Parcelizer.MOVING && audioAttributesImplApi21Parcelizer == AudioAttributesImplApi21Parcelizer.MOVING) {
            MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
        }
        int i = AnonymousClass3.read[audioAttributesImplApi21Parcelizer2.ordinal()];
        if (i == 1 || i == 2) {
            if (audioAttributesImplApi21Parcelizer == AudioAttributesImplApi21Parcelizer.MOVING) {
                MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
            }
            if (audioAttributesImplApi21Parcelizer == AudioAttributesImplApi21Parcelizer.FINISHED) {
                onMediaButtonEvent();
                return;
            }
            return;
        }
        if (i == 3 && audioAttributesImplApi21Parcelizer == AudioAttributesImplApi21Parcelizer.FINISHED) {
            onMediaButtonEvent();
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.motion.widget.MotionLayout$3, reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] read;

        static {
            int[] iArr = new int[AudioAttributesImplApi21Parcelizer.values().length];
            read = iArr;
            try {
                iArr[AudioAttributesImplApi21Parcelizer.UNDEFINED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                read[AudioAttributesImplApi21Parcelizer.SETUP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                read[AudioAttributesImplApi21Parcelizer.MOVING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                read[AudioAttributesImplApi21Parcelizer.FINISHED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static class read implements write {
        private static read IconCompatParcelizer = new read();
        private VelocityTracker AudioAttributesCompatParcelizer;

        private read() {
        }

        public static read IconCompatParcelizer() {
            IconCompatParcelizer.AudioAttributesCompatParcelizer = VelocityTracker.obtain();
            return IconCompatParcelizer;
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.write
        public final void write() {
            VelocityTracker velocityTracker = this.AudioAttributesCompatParcelizer;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.AudioAttributesCompatParcelizer = null;
            }
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.write
        public final void RemoteActionCompatParcelizer(MotionEvent motionEvent) {
            VelocityTracker velocityTracker = this.AudioAttributesCompatParcelizer;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.write
        public final void RemoteActionCompatParcelizer(int i) {
            VelocityTracker velocityTracker = this.AudioAttributesCompatParcelizer;
            if (velocityTracker != null) {
                velocityTracker.computeCurrentVelocity(i);
            }
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.write
        public final float read() {
            VelocityTracker velocityTracker = this.AudioAttributesCompatParcelizer;
            return velocityTracker != null ? velocityTracker.getXVelocity() : BitmapDescriptorFactory.HUE_RED;
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.write
        public final float RemoteActionCompatParcelizer() {
            VelocityTracker velocityTracker = this.AudioAttributesCompatParcelizer;
            return velocityTracker != null ? velocityTracker.getYVelocity() : BitmapDescriptorFactory.HUE_RED;
        }
    }

    public void setTransition(int i, int i2) {
        if (!isAttachedToWindow()) {
            if (this.accessonBackPresseds1027565324 == null) {
                this.accessonBackPresseds1027565324 = new MediaBrowserCompatCustomActionResultReceiver();
            }
            this.accessonBackPresseds1027565324.AudioAttributesCompatParcelizer(i);
            this.accessonBackPresseds1027565324.read(i2);
            return;
        }
        PrimitiveArrayDeserializersFloatDeser primitiveArrayDeserializersFloatDeser = this.MediaDescriptionCompat;
        if (primitiveArrayDeserializersFloatDeser != null) {
            this.onPlay = i;
            this.onPrepareFromUri = i2;
            primitiveArrayDeserializersFloatDeser.RemoteActionCompatParcelizer(i, i2);
            IconCompatParcelizer iconCompatParcelizer = this.r8lambdaKUbBm7ckfqTc9QCgukC86fguu4;
            _long _longVar = this.onAddQueueItem;
            iconCompatParcelizer.read(this.MediaDescriptionCompat.RemoteActionCompatParcelizer(i), this.MediaDescriptionCompat.RemoteActionCompatParcelizer(i2));
            onPlay();
            this.onCustomAction = BitmapDescriptorFactory.HUE_RED;
            MediaBrowserCompatSearchResultReceiver();
        }
    }

    public void setTransition(int i) {
        float f;
        if (this.MediaDescriptionCompat != null) {
            PrimitiveArrayDeserializersFloatDeser.AudioAttributesCompatParcelizer audioAttributesCompatParcelizerWrite = write(i);
            this.onPlay = audioAttributesCompatParcelizerWrite.read();
            this.onPrepareFromUri = audioAttributesCompatParcelizerWrite.write();
            if (!isAttachedToWindow()) {
                if (this.accessonBackPresseds1027565324 == null) {
                    this.accessonBackPresseds1027565324 = new MediaBrowserCompatCustomActionResultReceiver();
                }
                this.accessonBackPresseds1027565324.AudioAttributesCompatParcelizer(this.onPlay);
                this.accessonBackPresseds1027565324.read(this.onPrepareFromUri);
                return;
            }
            int i2 = this.AudioAttributesCompatParcelizer;
            int i3 = this.onPlay;
            float f2 = BitmapDescriptorFactory.HUE_RED;
            if (i2 == i3) {
                f = 0.0f;
            } else {
                f = i2 == this.onPrepareFromUri ? 1.0f : Float.NaN;
            }
            this.MediaDescriptionCompat.IconCompatParcelizer(audioAttributesCompatParcelizerWrite);
            IconCompatParcelizer iconCompatParcelizer = this.r8lambdaKUbBm7ckfqTc9QCgukC86fguu4;
            _long _longVar = this.onAddQueueItem;
            iconCompatParcelizer.read(this.MediaDescriptionCompat.RemoteActionCompatParcelizer(this.onPlay), this.MediaDescriptionCompat.RemoteActionCompatParcelizer(this.onPrepareFromUri));
            onPlay();
            if (this.onCustomAction != f) {
                if (f == BitmapDescriptorFactory.HUE_RED) {
                    IconCompatParcelizer(true);
                    this.MediaDescriptionCompat.RemoteActionCompatParcelizer(this.onPlay).write(this);
                } else if (f == 1.0f) {
                    IconCompatParcelizer(false);
                    this.MediaDescriptionCompat.RemoteActionCompatParcelizer(this.onPrepareFromUri).write(this);
                }
            }
            if (!Float.isNaN(f)) {
                f2 = f;
            }
            this.onCustomAction = f2;
            if (Float.isNaN(f)) {
                NumberDeserializersShortDeserializer.RemoteActionCompatParcelizer();
                MediaBrowserCompatSearchResultReceiver();
            } else {
                setProgress(f);
            }
        }
    }

    public final void RemoteActionCompatParcelizer(PrimitiveArrayDeserializersFloatDeser.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        this.MediaDescriptionCompat.IconCompatParcelizer(audioAttributesCompatParcelizer);
        write(AudioAttributesImplApi21Parcelizer.SETUP);
        if (this.AudioAttributesCompatParcelizer == this.MediaDescriptionCompat.AudioAttributesImplApi21Parcelizer()) {
            this.onCustomAction = 1.0f;
            this.addOnMultiWindowModeChangedListener = 1.0f;
            this.getOnBackPressedDispatcherannotations = 1.0f;
        } else {
            this.onCustomAction = BitmapDescriptorFactory.HUE_RED;
            this.addOnMultiWindowModeChangedListener = BitmapDescriptorFactory.HUE_RED;
            this.getOnBackPressedDispatcherannotations = BitmapDescriptorFactory.HUE_RED;
        }
        this.addOnContextAvailableListener = audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(1) ? -1L : onPause();
        int iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = this.MediaDescriptionCompat.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
        int iAudioAttributesImplApi21Parcelizer = this.MediaDescriptionCompat.AudioAttributesImplApi21Parcelizer();
        if (iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver == this.onPlay && iAudioAttributesImplApi21Parcelizer == this.onPrepareFromUri) {
            return;
        }
        this.onPlay = iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        this.onPrepareFromUri = iAudioAttributesImplApi21Parcelizer;
        this.MediaDescriptionCompat.RemoteActionCompatParcelizer(iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, iAudioAttributesImplApi21Parcelizer);
        IconCompatParcelizer iconCompatParcelizer = this.r8lambdaKUbBm7ckfqTc9QCgukC86fguu4;
        _long _longVar = this.onAddQueueItem;
        iconCompatParcelizer.read(this.MediaDescriptionCompat.RemoteActionCompatParcelizer(this.onPlay), this.MediaDescriptionCompat.RemoteActionCompatParcelizer(this.onPrepareFromUri));
        this.r8lambdaKUbBm7ckfqTc9QCgukC86fguu4.write(this.onPlay, this.onPrepareFromUri);
        this.r8lambdaKUbBm7ckfqTc9QCgukC86fguu4.read();
        onPlay();
    }

    @Override // android.view.View
    public boolean isAttachedToWindow() {
        return super.isAttachedToWindow();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public void setState(int i, int i2, int i3) {
        write(AudioAttributesImplApi21Parcelizer.SETUP);
        this.AudioAttributesCompatParcelizer = i;
        this.onPlay = -1;
        this.onPrepareFromUri = -1;
        if (this.handleMediaPlayPauseIfPendingOnHandler != null) {
            this.handleMediaPlayPauseIfPendingOnHandler.IconCompatParcelizer(i, i2, i3);
            return;
        }
        PrimitiveArrayDeserializersFloatDeser primitiveArrayDeserializersFloatDeser = this.MediaDescriptionCompat;
        if (primitiveArrayDeserializersFloatDeser != null) {
            primitiveArrayDeserializersFloatDeser.RemoteActionCompatParcelizer(i).write(this);
        }
    }

    public void setInterpolatedProgress(float f) {
        if (this.MediaDescriptionCompat != null) {
            write(AudioAttributesImplApi21Parcelizer.MOVING);
            Interpolator interpolatorAudioAttributesImplBaseParcelizer = this.MediaDescriptionCompat.AudioAttributesImplBaseParcelizer();
            if (interpolatorAudioAttributesImplBaseParcelizer != null) {
                setProgress(interpolatorAudioAttributesImplBaseParcelizer.getInterpolation(f));
                return;
            }
        }
        setProgress(f);
    }

    public void setProgress(float f, float f2) {
        if (!isAttachedToWindow()) {
            if (this.accessonBackPresseds1027565324 == null) {
                this.accessonBackPresseds1027565324 = new MediaBrowserCompatCustomActionResultReceiver();
            }
            this.accessonBackPresseds1027565324.AudioAttributesCompatParcelizer(f);
            this.accessonBackPresseds1027565324.read(f2);
            return;
        }
        setProgress(f);
        write(AudioAttributesImplApi21Parcelizer.MOVING);
        this.AudioAttributesImplBaseParcelizer = f2;
        float f3 = BitmapDescriptorFactory.HUE_RED;
        if (f2 != BitmapDescriptorFactory.HUE_RED) {
            if (f2 > BitmapDescriptorFactory.HUE_RED) {
                f3 = 1.0f;
            }
            AudioAttributesCompatParcelizer(f3);
        } else {
            if (f == BitmapDescriptorFactory.HUE_RED || f == 1.0f) {
                return;
            }
            if (f > 0.5f) {
                f3 = 1.0f;
            }
            AudioAttributesCompatParcelizer(f3);
        }
    }

    class MediaBrowserCompatCustomActionResultReceiver {
        private float AudioAttributesImplApi21Parcelizer = Float.NaN;
        private float MediaBrowserCompatCustomActionResultReceiver = Float.NaN;
        private int AudioAttributesImplApi26Parcelizer = -1;
        private int MediaBrowserCompatItemReceiver = -1;
        final String RemoteActionCompatParcelizer = "motion.progress";
        final String read = "motion.velocity";
        final String write = "motion.StartState";
        final String AudioAttributesCompatParcelizer = "motion.EndState";

        MediaBrowserCompatCustomActionResultReceiver() {
        }

        final void RemoteActionCompatParcelizer() {
            int i = this.AudioAttributesImplApi26Parcelizer;
            if (i != -1 || this.MediaBrowserCompatItemReceiver != -1) {
                if (i == -1) {
                    MotionLayout.this.IconCompatParcelizer(this.MediaBrowserCompatItemReceiver);
                } else {
                    int i2 = this.MediaBrowserCompatItemReceiver;
                    if (i2 == -1) {
                        MotionLayout.this.setState(i, -1, -1);
                    } else {
                        MotionLayout.this.setTransition(i, i2);
                    }
                }
                MotionLayout.this.write(AudioAttributesImplApi21Parcelizer.SETUP);
            }
            if (Float.isNaN(this.MediaBrowserCompatCustomActionResultReceiver)) {
                if (Float.isNaN(this.AudioAttributesImplApi21Parcelizer)) {
                    return;
                }
                MotionLayout.this.setProgress(this.AudioAttributesImplApi21Parcelizer);
            } else {
                MotionLayout.this.setProgress(this.AudioAttributesImplApi21Parcelizer, this.MediaBrowserCompatCustomActionResultReceiver);
                this.AudioAttributesImplApi21Parcelizer = Float.NaN;
                this.MediaBrowserCompatCustomActionResultReceiver = Float.NaN;
                this.AudioAttributesImplApi26Parcelizer = -1;
                this.MediaBrowserCompatItemReceiver = -1;
            }
        }

        public final void IconCompatParcelizer(Bundle bundle) {
            this.AudioAttributesImplApi21Parcelizer = bundle.getFloat("motion.progress");
            this.MediaBrowserCompatCustomActionResultReceiver = bundle.getFloat("motion.velocity");
            this.AudioAttributesImplApi26Parcelizer = bundle.getInt("motion.StartState");
            this.MediaBrowserCompatItemReceiver = bundle.getInt("motion.EndState");
        }

        public final void AudioAttributesCompatParcelizer(float f) {
            this.AudioAttributesImplApi21Parcelizer = f;
        }

        public final void read(int i) {
            this.MediaBrowserCompatItemReceiver = i;
        }

        public final void read(float f) {
            this.MediaBrowserCompatCustomActionResultReceiver = f;
        }

        public final void AudioAttributesCompatParcelizer(int i) {
            this.AudioAttributesImplApi26Parcelizer = i;
        }
    }

    public void setTransitionState(Bundle bundle) {
        if (this.accessonBackPresseds1027565324 == null) {
            this.accessonBackPresseds1027565324 = new MediaBrowserCompatCustomActionResultReceiver();
        }
        this.accessonBackPresseds1027565324.IconCompatParcelizer(bundle);
        if (isAttachedToWindow()) {
            this.accessonBackPresseds1027565324.RemoteActionCompatParcelizer();
        }
    }

    public void setProgress(float f) {
        if (!isAttachedToWindow()) {
            if (this.accessonBackPresseds1027565324 == null) {
                this.accessonBackPresseds1027565324 = new MediaBrowserCompatCustomActionResultReceiver();
            }
            this.accessonBackPresseds1027565324.AudioAttributesCompatParcelizer(f);
            return;
        }
        if (f <= BitmapDescriptorFactory.HUE_RED) {
            if (this.onCustomAction == 1.0f && this.AudioAttributesCompatParcelizer == this.onPrepareFromUri) {
                write(AudioAttributesImplApi21Parcelizer.MOVING);
            }
            this.AudioAttributesCompatParcelizer = this.onPlay;
            if (this.onCustomAction == BitmapDescriptorFactory.HUE_RED) {
                write(AudioAttributesImplApi21Parcelizer.FINISHED);
            }
        } else if (f >= 1.0f) {
            if (this.onCustomAction == BitmapDescriptorFactory.HUE_RED && this.AudioAttributesCompatParcelizer == this.onPlay) {
                write(AudioAttributesImplApi21Parcelizer.MOVING);
            }
            this.AudioAttributesCompatParcelizer = this.onPrepareFromUri;
            if (this.onCustomAction == 1.0f) {
                write(AudioAttributesImplApi21Parcelizer.FINISHED);
            }
        } else {
            this.AudioAttributesCompatParcelizer = -1;
            write(AudioAttributesImplApi21Parcelizer.MOVING);
        }
        if (this.MediaDescriptionCompat == null) {
            return;
        }
        this.addOnConfigurationChangedListener = true;
        this.getOnBackPressedDispatcherannotations = f;
        this.addOnMultiWindowModeChangedListener = f;
        this.addOnContextAvailableListener = -1L;
        this.onMediaButtonEvent = -1L;
        this.onSetRepeatMode = null;
        this.onRemoveQueueItem = true;
        invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onPlayFromMediaId() {
        int childCount = getChildCount();
        this.r8lambdaKUbBm7ckfqTc9QCgukC86fguu4.AudioAttributesCompatParcelizer();
        this.onRemoveQueueItem = true;
        SparseArray sparseArray = new SparseArray();
        int i = 0;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            sparseArray.put(childAt.getId(), this.MediaBrowserCompatCustomActionResultReceiver.get(childAt));
        }
        int width = getWidth();
        int height = getHeight();
        int iRemoteActionCompatParcelizer = this.MediaDescriptionCompat.RemoteActionCompatParcelizer();
        if (iRemoteActionCompatParcelizer != -1) {
            for (int i3 = 0; i3 < childCount; i3++) {
                handleSingleElementUnwrapped handlesingleelementunwrapped = this.MediaBrowserCompatCustomActionResultReceiver.get(getChildAt(i3));
                if (handlesingleelementunwrapped != null) {
                    handlesingleelementunwrapped.read(iRemoteActionCompatParcelizer);
                }
            }
        }
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        int[] iArr = new int[this.MediaBrowserCompatCustomActionResultReceiver.size()];
        int i4 = 0;
        for (int i5 = 0; i5 < childCount; i5++) {
            handleSingleElementUnwrapped handlesingleelementunwrapped2 = this.MediaBrowserCompatCustomActionResultReceiver.get(getChildAt(i5));
            if (handlesingleelementunwrapped2.AudioAttributesCompatParcelizer() != -1) {
                sparseBooleanArray.put(handlesingleelementunwrapped2.AudioAttributesCompatParcelizer(), true);
                iArr[i4] = handlesingleelementunwrapped2.AudioAttributesCompatParcelizer();
                i4++;
            }
        }
        if (this.onPlayFromSearch != null) {
            for (int i6 = 0; i6 < i4; i6++) {
                handleSingleElementUnwrapped handlesingleelementunwrapped3 = this.MediaBrowserCompatCustomActionResultReceiver.get(findViewById(iArr[i6]));
                if (handlesingleelementunwrapped3 != null) {
                    this.MediaDescriptionCompat.write(handlesingleelementunwrapped3);
                }
            }
            Iterator<MotionHelper> it = this.onPlayFromSearch.iterator();
            while (it.hasNext()) {
                it.next().read(this, this.MediaBrowserCompatCustomActionResultReceiver);
            }
            for (int i7 = 0; i7 < i4; i7++) {
                handleSingleElementUnwrapped handlesingleelementunwrapped4 = this.MediaBrowserCompatCustomActionResultReceiver.get(findViewById(iArr[i7]));
                if (handlesingleelementunwrapped4 != null) {
                    handlesingleelementunwrapped4.RemoteActionCompatParcelizer(width, height, onPause());
                }
            }
        } else {
            for (int i8 = 0; i8 < i4; i8++) {
                handleSingleElementUnwrapped handlesingleelementunwrapped5 = this.MediaBrowserCompatCustomActionResultReceiver.get(findViewById(iArr[i8]));
                if (handlesingleelementunwrapped5 != null) {
                    this.MediaDescriptionCompat.write(handlesingleelementunwrapped5);
                    handlesingleelementunwrapped5.RemoteActionCompatParcelizer(width, height, onPause());
                }
            }
        }
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt2 = getChildAt(i9);
            handleSingleElementUnwrapped handlesingleelementunwrapped6 = this.MediaBrowserCompatCustomActionResultReceiver.get(childAt2);
            if (!sparseBooleanArray.get(childAt2.getId()) && handlesingleelementunwrapped6 != null) {
                this.MediaDescriptionCompat.write(handlesingleelementunwrapped6);
                handlesingleelementunwrapped6.RemoteActionCompatParcelizer(width, height, onPause());
            }
        }
        float fOnCustomAction = this.MediaDescriptionCompat.onCustomAction();
        if (fOnCustomAction != BitmapDescriptorFactory.HUE_RED) {
            boolean z = ((double) fOnCustomAction) < 0.0d;
            float fAbs = Math.abs(fOnCustomAction);
            float fMin = Float.MAX_VALUE;
            float fMax = -3.4028235E38f;
            float fMin2 = Float.MAX_VALUE;
            float fMax2 = -3.4028235E38f;
            for (int i10 = 0; i10 < childCount; i10++) {
                handleSingleElementUnwrapped handlesingleelementunwrapped7 = this.MediaBrowserCompatCustomActionResultReceiver.get(getChildAt(i10));
                if (!Float.isNaN(handlesingleelementunwrapped7.read)) {
                    for (int i11 = 0; i11 < childCount; i11++) {
                        handleSingleElementUnwrapped handlesingleelementunwrapped8 = this.MediaBrowserCompatCustomActionResultReceiver.get(getChildAt(i11));
                        if (!Float.isNaN(handlesingleelementunwrapped8.read)) {
                            fMin = Math.min(fMin, handlesingleelementunwrapped8.read);
                            fMax = Math.max(fMax, handlesingleelementunwrapped8.read);
                        }
                    }
                    while (i < childCount) {
                        handleSingleElementUnwrapped handlesingleelementunwrapped9 = this.MediaBrowserCompatCustomActionResultReceiver.get(getChildAt(i));
                        if (!Float.isNaN(handlesingleelementunwrapped9.read)) {
                            handlesingleelementunwrapped9.AudioAttributesCompatParcelizer = 1.0f / (1.0f - fAbs);
                            if (z) {
                                handlesingleelementunwrapped9.write = fAbs - (((fMax - handlesingleelementunwrapped9.read) / (fMax - fMin)) * fAbs);
                            } else {
                                handlesingleelementunwrapped9.write = fAbs - (((handlesingleelementunwrapped9.read - fMin) * fAbs) / (fMax - fMin));
                            }
                        }
                        i++;
                    }
                    return;
                }
                float fIconCompatParcelizer = handlesingleelementunwrapped7.IconCompatParcelizer();
                float fAudioAttributesImplApi21Parcelizer = handlesingleelementunwrapped7.AudioAttributesImplApi21Parcelizer();
                float f = z ? fAudioAttributesImplApi21Parcelizer - fIconCompatParcelizer : fAudioAttributesImplApi21Parcelizer + fIconCompatParcelizer;
                fMin2 = Math.min(fMin2, f);
                fMax2 = Math.max(fMax2, f);
            }
            while (i < childCount) {
                handleSingleElementUnwrapped handlesingleelementunwrapped10 = this.MediaBrowserCompatCustomActionResultReceiver.get(getChildAt(i));
                float fIconCompatParcelizer2 = handlesingleelementunwrapped10.IconCompatParcelizer();
                float fAudioAttributesImplApi21Parcelizer2 = handlesingleelementunwrapped10.AudioAttributesImplApi21Parcelizer();
                float f2 = z ? fAudioAttributesImplApi21Parcelizer2 - fIconCompatParcelizer2 : fAudioAttributesImplApi21Parcelizer2 + fIconCompatParcelizer2;
                handlesingleelementunwrapped10.AudioAttributesCompatParcelizer = 1.0f / (1.0f - fAbs);
                handlesingleelementunwrapped10.write = fAbs - (((f2 - fMin2) * fAbs) / (fMax2 - fMin2));
                i++;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0037, code lost:
    
        if (r12 != 7) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void IconCompatParcelizer(int r12, float r13, float r14) {
        /*
            Method dump skipped, instruction units count: 241
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionLayout.IconCompatParcelizer(int, float, float):void");
    }

    class AudioAttributesCompatParcelizer extends PrimitiveArrayDeserializersBooleanDeser {
        private float AudioAttributesCompatParcelizer;
        private float RemoteActionCompatParcelizer = BitmapDescriptorFactory.HUE_RED;
        private float IconCompatParcelizer = BitmapDescriptorFactory.HUE_RED;

        AudioAttributesCompatParcelizer() {
        }

        public final void RemoteActionCompatParcelizer(float f, float f2, float f3) {
            this.RemoteActionCompatParcelizer = f;
            this.IconCompatParcelizer = f2;
            this.AudioAttributesCompatParcelizer = f3;
        }

        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f) {
            float f2;
            float f3;
            float f4 = this.RemoteActionCompatParcelizer;
            if (f4 > BitmapDescriptorFactory.HUE_RED) {
                float f5 = this.AudioAttributesCompatParcelizer;
                float f6 = f4 / f5;
                if (f6 < f) {
                    f = f6;
                }
                MotionLayout.this.AudioAttributesImplBaseParcelizer = f4 - (f5 * f);
                f2 = (this.RemoteActionCompatParcelizer * f) - (((this.AudioAttributesCompatParcelizer * f) * f) / 2.0f);
                f3 = this.IconCompatParcelizer;
            } else {
                float f7 = this.AudioAttributesCompatParcelizer;
                float f8 = (-f4) / f7;
                if (f8 < f) {
                    f = f8;
                }
                MotionLayout.this.AudioAttributesImplBaseParcelizer = f4 + (f7 * f);
                f2 = (this.RemoteActionCompatParcelizer * f) + (((this.AudioAttributesCompatParcelizer * f) * f) / 2.0f);
                f3 = this.IconCompatParcelizer;
            }
            return f2 + f3;
        }

        @Override // kotlin.PrimitiveArrayDeserializersBooleanDeser
        public final float AudioAttributesCompatParcelizer() {
            return MotionLayout.this.AudioAttributesImplBaseParcelizer;
        }
    }

    private void AudioAttributesCompatParcelizer(float f) {
        if (this.MediaDescriptionCompat != null) {
            float f2 = this.onCustomAction;
            float f3 = this.addOnMultiWindowModeChangedListener;
            if (f2 != f3 && this.addOnConfigurationChangedListener) {
                this.onCustomAction = f3;
            }
            float f4 = this.onCustomAction;
            if (f4 == f) {
                return;
            }
            this.addMenuProvider = false;
            this.getOnBackPressedDispatcherannotations = f;
            this.menuHostHelperlambda0 = r0.write() / 1000.0f;
            setProgress(this.getOnBackPressedDispatcherannotations);
            this.onSetRepeatMode = null;
            this.accessaddObserverForBackInvoker = this.MediaDescriptionCompat.AudioAttributesImplBaseParcelizer();
            this.addOnConfigurationChangedListener = false;
            this.onMediaButtonEvent = onPause();
            this.onRemoveQueueItem = true;
            this.addOnMultiWindowModeChangedListener = f4;
            this.onCustomAction = f4;
            invalidate();
        }
    }

    private void onAddQueueItem() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            handleSingleElementUnwrapped handlesingleelementunwrapped = this.MediaBrowserCompatCustomActionResultReceiver.get(childAt);
            if (handlesingleelementunwrapped != null) {
                handlesingleelementunwrapped.IconCompatParcelizer(childAt);
            }
        }
    }

    public final void MediaBrowserCompatSearchResultReceiver() {
        AudioAttributesCompatParcelizer(BitmapDescriptorFactory.HUE_RED);
    }

    public final void MediaMetadataCompat() {
        AudioAttributesCompatParcelizer(1.0f);
        this.r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw = null;
    }

    public final void IconCompatParcelizer(Runnable runnable) {
        AudioAttributesCompatParcelizer(1.0f);
        this.r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw = runnable;
    }

    public final void IconCompatParcelizer(int i) {
        if (!isAttachedToWindow()) {
            if (this.accessonBackPresseds1027565324 == null) {
                this.accessonBackPresseds1027565324 = new MediaBrowserCompatCustomActionResultReceiver();
            }
            this.accessonBackPresseds1027565324.read(i);
            return;
        }
        AudioAttributesImplApi26Parcelizer(i);
    }

    public final void IconCompatParcelizer(int i, int i2) {
        if (!isAttachedToWindow()) {
            if (this.accessonBackPresseds1027565324 == null) {
                this.accessonBackPresseds1027565324 = new MediaBrowserCompatCustomActionResultReceiver();
            }
            this.accessonBackPresseds1027565324.read(i);
            return;
        }
        IconCompatParcelizer(i, -1, -1, i2);
    }

    private void AudioAttributesImplApi26Parcelizer(int i) {
        IconCompatParcelizer(i, -1, -1, -1);
    }

    private void IconCompatParcelizer(int i, int i2, int i3, int i4) {
        int iRemoteActionCompatParcelizer;
        PrimitiveArrayDeserializersFloatDeser primitiveArrayDeserializersFloatDeser = this.MediaDescriptionCompat;
        if (primitiveArrayDeserializersFloatDeser != null && primitiveArrayDeserializersFloatDeser.read != null && (iRemoteActionCompatParcelizer = this.MediaDescriptionCompat.read.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, i, -1.0f, -1.0f)) != -1) {
            i = iRemoteActionCompatParcelizer;
        }
        int i5 = this.AudioAttributesCompatParcelizer;
        if (i5 != i) {
            if (this.onPlay == i) {
                AudioAttributesCompatParcelizer(BitmapDescriptorFactory.HUE_RED);
                if (i4 > 0) {
                    this.menuHostHelperlambda0 = i4 / 1000.0f;
                    return;
                }
                return;
            }
            if (this.onPrepareFromUri == i) {
                AudioAttributesCompatParcelizer(1.0f);
                if (i4 > 0) {
                    this.menuHostHelperlambda0 = i4 / 1000.0f;
                    return;
                }
                return;
            }
            this.onPrepareFromUri = i;
            if (i5 != -1) {
                setTransition(i5, i);
                AudioAttributesCompatParcelizer(1.0f);
                this.onCustomAction = BitmapDescriptorFactory.HUE_RED;
                MediaMetadataCompat();
                if (i4 > 0) {
                    this.menuHostHelperlambda0 = i4 / 1000.0f;
                    return;
                }
                return;
            }
            this.addMenuProvider = false;
            this.getOnBackPressedDispatcherannotations = 1.0f;
            this.addOnMultiWindowModeChangedListener = BitmapDescriptorFactory.HUE_RED;
            this.onCustomAction = BitmapDescriptorFactory.HUE_RED;
            this.addOnContextAvailableListener = onPause();
            this.onMediaButtonEvent = onPause();
            this.addOnConfigurationChangedListener = false;
            this.onSetRepeatMode = null;
            if (i4 == -1) {
                this.menuHostHelperlambda0 = this.MediaDescriptionCompat.write() / 1000.0f;
            }
            this.onPlay = -1;
            this.MediaDescriptionCompat.RemoteActionCompatParcelizer(-1, this.onPrepareFromUri);
            SparseArray sparseArray = new SparseArray();
            if (i4 == 0) {
                this.menuHostHelperlambda0 = this.MediaDescriptionCompat.write() / 1000.0f;
            } else if (i4 > 0) {
                this.menuHostHelperlambda0 = i4 / 1000.0f;
            }
            int childCount = getChildCount();
            this.MediaBrowserCompatCustomActionResultReceiver.clear();
            for (int i6 = 0; i6 < childCount; i6++) {
                View childAt = getChildAt(i6);
                this.MediaBrowserCompatCustomActionResultReceiver.put(childAt, new handleSingleElementUnwrapped(childAt));
                sparseArray.put(childAt.getId(), this.MediaBrowserCompatCustomActionResultReceiver.get(childAt));
            }
            this.onRemoveQueueItem = true;
            IconCompatParcelizer iconCompatParcelizer = this.r8lambdaKUbBm7ckfqTc9QCgukC86fguu4;
            _long _longVar = this.onAddQueueItem;
            iconCompatParcelizer.read((ReferenceTypeDeserializer) null, this.MediaDescriptionCompat.RemoteActionCompatParcelizer(i));
            onPlay();
            this.r8lambdaKUbBm7ckfqTc9QCgukC86fguu4.AudioAttributesCompatParcelizer();
            onAddQueueItem();
            int width = getWidth();
            int height = getHeight();
            if (this.onPlayFromSearch != null) {
                for (int i7 = 0; i7 < childCount; i7++) {
                    handleSingleElementUnwrapped handlesingleelementunwrapped = this.MediaBrowserCompatCustomActionResultReceiver.get(getChildAt(i7));
                    if (handlesingleelementunwrapped != null) {
                        this.MediaDescriptionCompat.write(handlesingleelementunwrapped);
                    }
                }
                Iterator<MotionHelper> it = this.onPlayFromSearch.iterator();
                while (it.hasNext()) {
                    it.next().read(this, this.MediaBrowserCompatCustomActionResultReceiver);
                }
                for (int i8 = 0; i8 < childCount; i8++) {
                    handleSingleElementUnwrapped handlesingleelementunwrapped2 = this.MediaBrowserCompatCustomActionResultReceiver.get(getChildAt(i8));
                    if (handlesingleelementunwrapped2 != null) {
                        handlesingleelementunwrapped2.RemoteActionCompatParcelizer(width, height, onPause());
                    }
                }
            } else {
                for (int i9 = 0; i9 < childCount; i9++) {
                    handleSingleElementUnwrapped handlesingleelementunwrapped3 = this.MediaBrowserCompatCustomActionResultReceiver.get(getChildAt(i9));
                    if (handlesingleelementunwrapped3 != null) {
                        this.MediaDescriptionCompat.write(handlesingleelementunwrapped3);
                        handlesingleelementunwrapped3.RemoteActionCompatParcelizer(width, height, onPause());
                    }
                }
            }
            float fOnCustomAction = this.MediaDescriptionCompat.onCustomAction();
            if (fOnCustomAction != BitmapDescriptorFactory.HUE_RED) {
                float fMin = Float.MAX_VALUE;
                float fMax = -3.4028235E38f;
                for (int i10 = 0; i10 < childCount; i10++) {
                    handleSingleElementUnwrapped handlesingleelementunwrapped4 = this.MediaBrowserCompatCustomActionResultReceiver.get(getChildAt(i10));
                    float fAudioAttributesImplApi21Parcelizer = handlesingleelementunwrapped4.AudioAttributesImplApi21Parcelizer() + handlesingleelementunwrapped4.IconCompatParcelizer();
                    fMin = Math.min(fMin, fAudioAttributesImplApi21Parcelizer);
                    fMax = Math.max(fMax, fAudioAttributesImplApi21Parcelizer);
                }
                for (int i11 = 0; i11 < childCount; i11++) {
                    handleSingleElementUnwrapped handlesingleelementunwrapped5 = this.MediaBrowserCompatCustomActionResultReceiver.get(getChildAt(i11));
                    float fIconCompatParcelizer = handlesingleelementunwrapped5.IconCompatParcelizer();
                    float fAudioAttributesImplApi21Parcelizer2 = handlesingleelementunwrapped5.AudioAttributesImplApi21Parcelizer();
                    handlesingleelementunwrapped5.AudioAttributesCompatParcelizer = 1.0f / (1.0f - fOnCustomAction);
                    handlesingleelementunwrapped5.write = fOnCustomAction - ((((fIconCompatParcelizer + fAudioAttributesImplApi21Parcelizer2) - fMin) * fOnCustomAction) / (fMax - fMin));
                }
            }
            this.addOnMultiWindowModeChangedListener = BitmapDescriptorFactory.HUE_RED;
            this.onCustomAction = BitmapDescriptorFactory.HUE_RED;
            this.onRemoveQueueItem = true;
            invalidate();
        }
    }

    public final float AudioAttributesImplBaseParcelizer() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    public final void IconCompatParcelizer(View view, float f, float f2, float[] fArr, int i) {
        float interpolation;
        float fAudioAttributesCompatParcelizer = this.AudioAttributesImplBaseParcelizer;
        float f3 = this.onCustomAction;
        if (this.onSetRepeatMode != null) {
            float fSignum = Math.signum(this.getOnBackPressedDispatcherannotations - f3);
            float interpolation2 = this.onSetRepeatMode.getInterpolation(this.onCustomAction + 1.0E-5f);
            interpolation = this.onSetRepeatMode.getInterpolation(this.onCustomAction);
            fAudioAttributesCompatParcelizer = (fSignum * ((interpolation2 - interpolation) / 1.0E-5f)) / this.menuHostHelperlambda0;
        } else {
            interpolation = f3;
        }
        Interpolator interpolator = this.onSetRepeatMode;
        if (interpolator instanceof PrimitiveArrayDeserializersBooleanDeser) {
            fAudioAttributesCompatParcelizer = ((PrimitiveArrayDeserializersBooleanDeser) interpolator).AudioAttributesCompatParcelizer();
        }
        handleSingleElementUnwrapped handlesingleelementunwrapped = this.MediaBrowserCompatCustomActionResultReceiver.get(view);
        if ((i & 1) == 0) {
            handlesingleelementunwrapped.read(interpolation, view.getWidth(), view.getHeight(), f, f2, fArr);
        } else {
            handlesingleelementunwrapped.write(interpolation, f, f2, fArr);
        }
        if (i < 2) {
            fArr[0] = fArr[0] * fAudioAttributesCompatParcelizer;
            fArr[1] = fArr[1] * fAudioAttributesCompatParcelizer;
        }
    }

    class IconCompatParcelizer {
        private int AudioAttributesCompatParcelizer;
        private int MediaBrowserCompatCustomActionResultReceiver;
        private _long write = new _long();
        private _long RemoteActionCompatParcelizer = new _long();
        private ReferenceTypeDeserializer AudioAttributesImplApi26Parcelizer = null;
        private ReferenceTypeDeserializer read = null;

        IconCompatParcelizer() {
        }

        private static void RemoteActionCompatParcelizer(_long _longVar, _long _longVar2) {
            JdkDeserializers jdkDeserializers;
            ArrayList<JdkDeserializers> arrayListAccessgetReportFullyDrawnExecutorp = _longVar.accessgetReportFullyDrawnExecutorp();
            HashMap<JdkDeserializers, JdkDeserializers> map = new HashMap<>();
            map.put(_longVar, _longVar2);
            _longVar2.accessgetReportFullyDrawnExecutorp().clear();
            _longVar2.AudioAttributesCompatParcelizer(_longVar, map);
            for (JdkDeserializers jdkDeserializers2 : arrayListAccessgetReportFullyDrawnExecutorp) {
                if (jdkDeserializers2 instanceof _deSerializeBCP47Locale) {
                    jdkDeserializers = new _deSerializeBCP47Locale();
                } else if (jdkDeserializers2 instanceof _deserializeUsingCreator) {
                    jdkDeserializers = new _deserializeUsingCreator();
                } else if (jdkDeserializers2 instanceof JsonNodeDeserializerObjectDeserializer) {
                    jdkDeserializers = new JsonNodeDeserializerObjectDeserializer();
                } else if (jdkDeserializers2 instanceof _readAndUpdateStringKeyMap) {
                    jdkDeserializers = new _readAndUpdateStringKeyMap();
                } else if (jdkDeserializers2 instanceof JsonNodeDeserializer) {
                    jdkDeserializers = new JsonNodeDeserializerArrayDeserializer();
                } else {
                    jdkDeserializers = new JdkDeserializers();
                }
                _longVar2.RemoteActionCompatParcelizer(jdkDeserializers);
                map.put(jdkDeserializers2, jdkDeserializers);
            }
            for (JdkDeserializers jdkDeserializers3 : arrayListAccessgetReportFullyDrawnExecutorp) {
                map.get(jdkDeserializers3).AudioAttributesCompatParcelizer(jdkDeserializers3, map);
            }
        }

        final void read(ReferenceTypeDeserializer referenceTypeDeserializer, ReferenceTypeDeserializer referenceTypeDeserializer2) {
            this.AudioAttributesImplApi26Parcelizer = referenceTypeDeserializer;
            this.read = referenceTypeDeserializer2;
            this.write = new _long();
            this.RemoteActionCompatParcelizer = new _long();
            this.write.write(MotionLayout.this.onAddQueueItem.IconCompatParcelizer());
            this.RemoteActionCompatParcelizer.write(MotionLayout.this.onAddQueueItem.IconCompatParcelizer());
            this.write.ensureViewModelStore();
            this.RemoteActionCompatParcelizer.ensureViewModelStore();
            RemoteActionCompatParcelizer(MotionLayout.this.onAddQueueItem, this.write);
            RemoteActionCompatParcelizer(MotionLayout.this.onAddQueueItem, this.RemoteActionCompatParcelizer);
            if (MotionLayout.this.onCustomAction > 0.5d) {
                if (referenceTypeDeserializer != null) {
                    IconCompatParcelizer(this.write, referenceTypeDeserializer);
                }
                IconCompatParcelizer(this.RemoteActionCompatParcelizer, referenceTypeDeserializer2);
            } else {
                IconCompatParcelizer(this.RemoteActionCompatParcelizer, referenceTypeDeserializer2);
                if (referenceTypeDeserializer != null) {
                    IconCompatParcelizer(this.write, referenceTypeDeserializer);
                }
            }
            this.write.write(MotionLayout.this.handleMediaPlayPauseIfPendingOnHandler());
            this.write.accessaddObserverForBackInvoker();
            this.RemoteActionCompatParcelizer.write(MotionLayout.this.handleMediaPlayPauseIfPendingOnHandler());
            this.RemoteActionCompatParcelizer.accessaddObserverForBackInvoker();
            ViewGroup.LayoutParams layoutParams = MotionLayout.this.getLayoutParams();
            if (layoutParams != null) {
                if (layoutParams.width == -2) {
                    this.write.AudioAttributesCompatParcelizer(JdkDeserializers.IconCompatParcelizer.WRAP_CONTENT);
                    this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(JdkDeserializers.IconCompatParcelizer.WRAP_CONTENT);
                }
                if (layoutParams.height == -2) {
                    this.write.write(JdkDeserializers.IconCompatParcelizer.WRAP_CONTENT);
                    this.RemoteActionCompatParcelizer.write(JdkDeserializers.IconCompatParcelizer.WRAP_CONTENT);
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        private void IconCompatParcelizer(_long _longVar, ReferenceTypeDeserializer referenceTypeDeserializer) {
            SparseArray<JdkDeserializers> sparseArray = new SparseArray<>();
            Constraints.LayoutParams layoutParams = new Constraints.LayoutParams();
            sparseArray.clear();
            sparseArray.put(0, _longVar);
            sparseArray.put(MotionLayout.this.getId(), _longVar);
            if (referenceTypeDeserializer != null && referenceTypeDeserializer.RemoteActionCompatParcelizer != 0) {
                MotionLayout motionLayout = MotionLayout.this;
                motionLayout.read(this.RemoteActionCompatParcelizer, motionLayout.RatingCompat(), View.MeasureSpec.makeMeasureSpec(MotionLayout.this.getHeight(), 1073741824), View.MeasureSpec.makeMeasureSpec(MotionLayout.this.getWidth(), 1073741824));
            }
            for (JdkDeserializers jdkDeserializers : _longVar.accessgetReportFullyDrawnExecutorp()) {
                jdkDeserializers.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                sparseArray.put(((View) jdkDeserializers.RatingCompat()).getId(), jdkDeserializers);
            }
            for (JdkDeserializers jdkDeserializers2 : _longVar.accessgetReportFullyDrawnExecutorp()) {
                View view = (View) jdkDeserializers2.RatingCompat();
                referenceTypeDeserializer.write(view.getId(), layoutParams);
                jdkDeserializers2.onFastForward(referenceTypeDeserializer.MediaBrowserCompatCustomActionResultReceiver(view.getId()));
                jdkDeserializers2.MediaMetadataCompat(referenceTypeDeserializer.AudioAttributesCompatParcelizer(view.getId()));
                if (view instanceof ConstraintHelper) {
                    referenceTypeDeserializer.read((ConstraintHelper) view, jdkDeserializers2, layoutParams, sparseArray);
                    if (view instanceof Barrier) {
                        ((Barrier) view).MediaBrowserCompatCustomActionResultReceiver();
                    }
                }
                layoutParams.resolveLayoutDirection(MotionLayout.this.getLayoutDirection());
                MotionLayout.this.RemoteActionCompatParcelizer(false, view, jdkDeserializers2, (ConstraintLayout.LayoutParams) layoutParams, sparseArray);
                if (referenceTypeDeserializer.AudioAttributesImplApi21Parcelizer(view.getId()) == 1) {
                    jdkDeserializers2.onAddQueueItem(view.getVisibility());
                } else {
                    jdkDeserializers2.onAddQueueItem(referenceTypeDeserializer.read(view.getId()));
                }
            }
            for (JdkDeserializers jdkDeserializers3 : _longVar.accessgetReportFullyDrawnExecutorp()) {
                if (jdkDeserializers3 instanceof _readAndBindStringKeyMap) {
                    ConstraintHelper constraintHelper = (ConstraintHelper) jdkDeserializers3.RatingCompat();
                    JsonNodeDeserializer jsonNodeDeserializer = (JsonNodeDeserializer) jdkDeserializers3;
                    constraintHelper.IconCompatParcelizer(jsonNodeDeserializer, sparseArray);
                    ((_readAndBindStringKeyMap) jsonNodeDeserializer).write();
                }
            }
        }

        private static JdkDeserializers RemoteActionCompatParcelizer(_long _longVar, View view) {
            if (_longVar.RatingCompat() == view) {
                return _longVar;
            }
            ArrayList<JdkDeserializers> arrayListAccessgetReportFullyDrawnExecutorp = _longVar.accessgetReportFullyDrawnExecutorp();
            int size = arrayListAccessgetReportFullyDrawnExecutorp.size();
            for (int i = 0; i < size; i++) {
                JdkDeserializers jdkDeserializers = arrayListAccessgetReportFullyDrawnExecutorp.get(i);
                if (jdkDeserializers.RatingCompat() == view) {
                    return jdkDeserializers;
                }
            }
            return null;
        }

        public final void read() {
            read(MotionLayout.this.MediaSessionCompatQueueItem, MotionLayout.this.onStop);
            MotionLayout.this.onPlayFromMediaId();
        }

        private void read(int i, int i2) {
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            MotionLayout.this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = mode;
            MotionLayout.this.MediaBrowserCompatItemReceiver = mode2;
            MotionLayout.this.RatingCompat();
            IconCompatParcelizer(i, i2);
            if (!(MotionLayout.this.getParent() instanceof MotionLayout) || mode != 1073741824 || mode2 != 1073741824) {
                IconCompatParcelizer(i, i2);
                MotionLayout.this.MediaBrowserCompatSearchResultReceiver = this.write.onSetShuffleMode();
                MotionLayout.this.MediaBrowserCompatMediaItem = this.write.onAddQueueItem();
                MotionLayout.this.write = this.RemoteActionCompatParcelizer.onSetShuffleMode();
                MotionLayout.this.IconCompatParcelizer = this.RemoteActionCompatParcelizer.onAddQueueItem();
                MotionLayout motionLayout = MotionLayout.this;
                motionLayout.AudioAttributesImplApi26Parcelizer = (motionLayout.MediaBrowserCompatSearchResultReceiver == MotionLayout.this.write && MotionLayout.this.MediaBrowserCompatMediaItem == MotionLayout.this.IconCompatParcelizer) ? false : true;
            }
            int i3 = MotionLayout.this.MediaBrowserCompatSearchResultReceiver;
            int i4 = MotionLayout.this.MediaBrowserCompatMediaItem;
            if (MotionLayout.this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver == Integer.MIN_VALUE || MotionLayout.this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver == 0) {
                i3 = (int) (MotionLayout.this.MediaBrowserCompatSearchResultReceiver + (MotionLayout.this.AudioAttributesImplApi21Parcelizer * (MotionLayout.this.write - MotionLayout.this.MediaBrowserCompatSearchResultReceiver)));
            }
            int i5 = i3;
            if (MotionLayout.this.MediaBrowserCompatItemReceiver == Integer.MIN_VALUE || MotionLayout.this.MediaBrowserCompatItemReceiver == 0) {
                i4 = (int) (MotionLayout.this.MediaBrowserCompatMediaItem + (MotionLayout.this.AudioAttributesImplApi21Parcelizer * (MotionLayout.this.IconCompatParcelizer - MotionLayout.this.MediaBrowserCompatMediaItem)));
            }
            MotionLayout.this.IconCompatParcelizer(i, i2, i5, i4, this.write.accessensureViewModelStore() || this.RemoteActionCompatParcelizer.accessensureViewModelStore(), this.write.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28() || this.RemoteActionCompatParcelizer.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28());
        }

        private void IconCompatParcelizer(int i, int i2) {
            int iRatingCompat = MotionLayout.this.RatingCompat();
            if (MotionLayout.this.AudioAttributesCompatParcelizer == MotionLayout.this.MediaBrowserCompatItemReceiver()) {
                MotionLayout motionLayout = MotionLayout.this;
                _long _longVar = this.RemoteActionCompatParcelizer;
                ReferenceTypeDeserializer referenceTypeDeserializer = this.read;
                int i3 = (referenceTypeDeserializer == null || referenceTypeDeserializer.RemoteActionCompatParcelizer == 0) ? i : i2;
                ReferenceTypeDeserializer referenceTypeDeserializer2 = this.read;
                motionLayout.read(_longVar, iRatingCompat, i3, (referenceTypeDeserializer2 == null || referenceTypeDeserializer2.RemoteActionCompatParcelizer == 0) ? i2 : i);
                ReferenceTypeDeserializer referenceTypeDeserializer3 = this.AudioAttributesImplApi26Parcelizer;
                if (referenceTypeDeserializer3 != null) {
                    MotionLayout motionLayout2 = MotionLayout.this;
                    _long _longVar2 = this.write;
                    int i4 = referenceTypeDeserializer3.RemoteActionCompatParcelizer == 0 ? i : i2;
                    if (this.AudioAttributesImplApi26Parcelizer.RemoteActionCompatParcelizer == 0) {
                        i = i2;
                    }
                    motionLayout2.read(_longVar2, iRatingCompat, i4, i);
                    return;
                }
                return;
            }
            ReferenceTypeDeserializer referenceTypeDeserializer4 = this.AudioAttributesImplApi26Parcelizer;
            if (referenceTypeDeserializer4 != null) {
                MotionLayout.this.read(this.write, iRatingCompat, referenceTypeDeserializer4.RemoteActionCompatParcelizer == 0 ? i : i2, this.AudioAttributesImplApi26Parcelizer.RemoteActionCompatParcelizer == 0 ? i2 : i);
            }
            MotionLayout motionLayout3 = MotionLayout.this;
            _long _longVar3 = this.RemoteActionCompatParcelizer;
            ReferenceTypeDeserializer referenceTypeDeserializer5 = this.read;
            int i5 = (referenceTypeDeserializer5 == null || referenceTypeDeserializer5.RemoteActionCompatParcelizer == 0) ? i : i2;
            ReferenceTypeDeserializer referenceTypeDeserializer6 = this.read;
            if (referenceTypeDeserializer6 == null || referenceTypeDeserializer6.RemoteActionCompatParcelizer == 0) {
                i = i2;
            }
            motionLayout3.read(_longVar3, iRatingCompat, i5, i);
        }

        public final void AudioAttributesCompatParcelizer() {
            int childCount = MotionLayout.this.getChildCount();
            MotionLayout.this.MediaBrowserCompatCustomActionResultReceiver.clear();
            SparseArray sparseArray = new SparseArray();
            int[] iArr = new int[childCount];
            for (int i = 0; i < childCount; i++) {
                View childAt = MotionLayout.this.getChildAt(i);
                handleSingleElementUnwrapped handlesingleelementunwrapped = new handleSingleElementUnwrapped(childAt);
                int id = childAt.getId();
                iArr[i] = id;
                sparseArray.put(id, handlesingleelementunwrapped);
                MotionLayout.this.MediaBrowserCompatCustomActionResultReceiver.put(childAt, handlesingleelementunwrapped);
            }
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt2 = MotionLayout.this.getChildAt(i2);
                handleSingleElementUnwrapped handlesingleelementunwrapped2 = MotionLayout.this.MediaBrowserCompatCustomActionResultReceiver.get(childAt2);
                if (handlesingleelementunwrapped2 != null) {
                    if (this.AudioAttributesImplApi26Parcelizer == null) {
                        if (MotionLayout.this.onRemoveQueueItemAt) {
                            _parseDouble _parsedouble = MotionLayout.this.MediaMetadataCompat.get(childAt2);
                            int i3 = MotionLayout.this.RatingCompat;
                            handlesingleelementunwrapped2.IconCompatParcelizer(_parsedouble, childAt2, 0, MotionLayout.this._init_lambda3, MotionLayout.this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28);
                        }
                    } else {
                        JdkDeserializers jdkDeserializersRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(this.write, childAt2);
                        if (jdkDeserializersRemoteActionCompatParcelizer != null) {
                            handlesingleelementunwrapped2.read(MotionLayout.this.IconCompatParcelizer(jdkDeserializersRemoteActionCompatParcelizer), this.AudioAttributesImplApi26Parcelizer, MotionLayout.this.getWidth(), MotionLayout.this.getHeight());
                        } else if (MotionLayout.this.read != 0) {
                            NumberDeserializersShortDeserializer.RemoteActionCompatParcelizer();
                            NumberDeserializersShortDeserializer.write(childAt2);
                            childAt2.getClass().getName();
                        }
                    }
                    if (this.read != null) {
                        JdkDeserializers jdkDeserializersRemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, childAt2);
                        if (jdkDeserializersRemoteActionCompatParcelizer2 != null) {
                            handlesingleelementunwrapped2.AudioAttributesCompatParcelizer(MotionLayout.this.IconCompatParcelizer(jdkDeserializersRemoteActionCompatParcelizer2), this.read, MotionLayout.this.getWidth(), MotionLayout.this.getHeight());
                        } else if (MotionLayout.this.read != 0) {
                            NumberDeserializersShortDeserializer.RemoteActionCompatParcelizer();
                            NumberDeserializersShortDeserializer.write(childAt2);
                            childAt2.getClass().getName();
                        }
                    }
                }
            }
            for (int i4 = 0; i4 < childCount; i4++) {
                handleSingleElementUnwrapped handlesingleelementunwrapped3 = (handleSingleElementUnwrapped) sparseArray.get(iArr[i4]);
                int iAudioAttributesCompatParcelizer = handlesingleelementunwrapped3.AudioAttributesCompatParcelizer();
                if (iAudioAttributesCompatParcelizer != -1) {
                    handlesingleelementunwrapped3.IconCompatParcelizer((handleSingleElementUnwrapped) sparseArray.get(iAudioAttributesCompatParcelizer));
                }
            }
        }

        public final void write(int i, int i2) {
            this.MediaBrowserCompatCustomActionResultReceiver = i;
            this.AudioAttributesCompatParcelizer = i2;
        }

        public final boolean RemoteActionCompatParcelizer(int i, int i2) {
            return (i == this.MediaBrowserCompatCustomActionResultReceiver && i2 == this.AudioAttributesCompatParcelizer) ? false : true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Rect IconCompatParcelizer(JdkDeserializers jdkDeserializers) {
        this.getSavedStateRegistryControllerannotations.top = jdkDeserializers.onSetRepeatMode();
        this.getSavedStateRegistryControllerannotations.left = jdkDeserializers.onSetRating();
        this.getSavedStateRegistryControllerannotations.right = jdkDeserializers.onSetShuffleMode() + this.getSavedStateRegistryControllerannotations.left;
        this.getSavedStateRegistryControllerannotations.bottom = jdkDeserializers.onAddQueueItem() + this.getSavedStateRegistryControllerannotations.top;
        return this.getSavedStateRegistryControllerannotations;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View, android.view.ViewParent
    public void requestLayout() {
        PrimitiveArrayDeserializersFloatDeser primitiveArrayDeserializersFloatDeser;
        if (!this.AudioAttributesImplApi26Parcelizer && this.AudioAttributesCompatParcelizer == -1 && (primitiveArrayDeserializersFloatDeser = this.MediaDescriptionCompat) != null && primitiveArrayDeserializersFloatDeser.write != null) {
            int iAudioAttributesCompatParcelizer = this.MediaDescriptionCompat.write.AudioAttributesCompatParcelizer();
            if (iAudioAttributesCompatParcelizer == 0) {
                return;
            }
            if (iAudioAttributesCompatParcelizer == 2) {
                int childCount = getChildCount();
                for (int i = 0; i < childCount; i++) {
                    this.MediaBrowserCompatCustomActionResultReceiver.get(getChildAt(i)).AudioAttributesImplApi26Parcelizer();
                }
                return;
            }
        }
        super.requestLayout();
    }

    @Override // android.view.View
    public String toString() {
        Context context = getContext();
        StringBuilder sb = new StringBuilder();
        sb.append(NumberDeserializersShortDeserializer.IconCompatParcelizer(context, this.onPlay));
        sb.append("->");
        sb.append(NumberDeserializersShortDeserializer.IconCompatParcelizer(context, this.onPrepareFromUri));
        sb.append(" (pos:");
        sb.append(this.onCustomAction);
        sb.append(" Dpos/Dt:");
        sb.append(this.AudioAttributesImplBaseParcelizer);
        return sb.toString();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public void onMeasure(int i, int i2) {
        if (this.MediaDescriptionCompat == null) {
            super.onMeasure(i, i2);
            return;
        }
        boolean z = false;
        boolean z2 = (this.MediaSessionCompatQueueItem == i && this.onStop == i2) ? false : true;
        if (this.PlaybackStateCompatCustomAction) {
            this.PlaybackStateCompatCustomAction = false;
            MediaBrowserCompatCustomActionResultReceiver();
            onFastForward();
            z2 = true;
        }
        if (this.onCommand) {
            z2 = true;
        }
        this.MediaSessionCompatQueueItem = i;
        this.onStop = i2;
        int iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = this.MediaDescriptionCompat.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
        int iAudioAttributesImplApi21Parcelizer = this.MediaDescriptionCompat.AudioAttributesImplApi21Parcelizer();
        if ((z2 || this.r8lambdaKUbBm7ckfqTc9QCgukC86fguu4.RemoteActionCompatParcelizer(iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, iAudioAttributesImplApi21Parcelizer)) && this.onPlay != -1) {
            super.onMeasure(i, i2);
            IconCompatParcelizer iconCompatParcelizer = this.r8lambdaKUbBm7ckfqTc9QCgukC86fguu4;
            _long _longVar = this.onAddQueueItem;
            iconCompatParcelizer.read(this.MediaDescriptionCompat.RemoteActionCompatParcelizer(iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver), this.MediaDescriptionCompat.RemoteActionCompatParcelizer(iAudioAttributesImplApi21Parcelizer));
            this.r8lambdaKUbBm7ckfqTc9QCgukC86fguu4.read();
            this.r8lambdaKUbBm7ckfqTc9QCgukC86fguu4.write(iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, iAudioAttributesImplApi21Parcelizer);
        } else {
            if (z2) {
                super.onMeasure(i, i2);
            }
            z = true;
        }
        if (this.AudioAttributesImplApi26Parcelizer || z) {
            int paddingTop = getPaddingTop();
            int paddingBottom = getPaddingBottom();
            int iOnSetShuffleMode = this.onAddQueueItem.onSetShuffleMode() + getPaddingLeft() + getPaddingRight();
            int iOnAddQueueItem = this.onAddQueueItem.onAddQueueItem() + paddingTop + paddingBottom;
            int i3 = this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
            if (i3 == Integer.MIN_VALUE || i3 == 0) {
                iOnSetShuffleMode = (int) (this.MediaBrowserCompatSearchResultReceiver + (this.AudioAttributesImplApi21Parcelizer * (this.write - r8)));
                requestLayout();
            }
            int i4 = this.MediaBrowserCompatItemReceiver;
            if (i4 == Integer.MIN_VALUE || i4 == 0) {
                iOnAddQueueItem = (int) (this.MediaBrowserCompatMediaItem + (this.AudioAttributesImplApi21Parcelizer * (this.IconCompatParcelizer - r8)));
                requestLayout();
            }
            setMeasuredDimension(iOnSetShuffleMode, iOnAddQueueItem);
        }
        onCommand();
    }

    @Override // kotlin.resetAsArray
    public boolean IconCompatParcelizer(View view, View view2, int i, int i2) {
        PrimitiveArrayDeserializersFloatDeser primitiveArrayDeserializersFloatDeser = this.MediaDescriptionCompat;
        return (primitiveArrayDeserializersFloatDeser == null || primitiveArrayDeserializersFloatDeser.write == null || this.MediaDescriptionCompat.write.RemoteActionCompatParcelizer() == null || (this.MediaDescriptionCompat.write.RemoteActionCompatParcelizer().IconCompatParcelizer() & 2) != 0) ? false : true;
    }

    @Override // kotlin.resetAsArray
    public void read(View view, View view2, int i, int i2) {
        this.ensureViewModelStore = onPause();
        this._init_lambda4 = BitmapDescriptorFactory.HUE_RED;
        this.addObserverForBackInvoker = BitmapDescriptorFactory.HUE_RED;
        this.addObserverForBackInvokerlambda7 = BitmapDescriptorFactory.HUE_RED;
    }

    @Override // kotlin.resetAsArray
    public void RemoteActionCompatParcelizer(View view, int i) {
        PrimitiveArrayDeserializersFloatDeser primitiveArrayDeserializersFloatDeser = this.MediaDescriptionCompat;
        if (primitiveArrayDeserializersFloatDeser != null) {
            float f = this._init_lambda4;
            if (f != BitmapDescriptorFactory.HUE_RED) {
                primitiveArrayDeserializersFloatDeser.write(this.addObserverForBackInvoker / f, this.addObserverForBackInvokerlambda7 / f);
            }
        }
    }

    @Override // kotlin.resetAsObject
    public void read(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (this.addOnTrimMemoryListener || i != 0 || i2 != 0) {
            iArr[0] = iArr[0] + i3;
            iArr[1] = iArr[1] + i4;
        }
        this.addOnTrimMemoryListener = false;
    }

    @Override // kotlin.resetAsArray
    public void RemoteActionCompatParcelizer(final View view, int i, int i2, int[] iArr, int i3) {
        PrimitiveArrayDeserializersFloatDeser.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer;
        PrimitiveArrayDeserializersShortDeser primitiveArrayDeserializersShortDeserRemoteActionCompatParcelizer;
        int iMediaBrowserCompatMediaItem;
        PrimitiveArrayDeserializersFloatDeser primitiveArrayDeserializersFloatDeser = this.MediaDescriptionCompat;
        if (primitiveArrayDeserializersFloatDeser == null || (audioAttributesCompatParcelizer = primitiveArrayDeserializersFloatDeser.write) == null || !audioAttributesCompatParcelizer.AudioAttributesImplBaseParcelizer()) {
            return;
        }
        int i4 = -1;
        if (!audioAttributesCompatParcelizer.AudioAttributesImplBaseParcelizer() || (primitiveArrayDeserializersShortDeserRemoteActionCompatParcelizer = audioAttributesCompatParcelizer.RemoteActionCompatParcelizer()) == null || (iMediaBrowserCompatMediaItem = primitiveArrayDeserializersShortDeserRemoteActionCompatParcelizer.MediaBrowserCompatMediaItem()) == -1 || view.getId() == iMediaBrowserCompatMediaItem) {
            if (primitiveArrayDeserializersFloatDeser.MediaBrowserCompatItemReceiver()) {
                PrimitiveArrayDeserializersShortDeser primitiveArrayDeserializersShortDeserRemoteActionCompatParcelizer2 = audioAttributesCompatParcelizer.RemoteActionCompatParcelizer();
                if (primitiveArrayDeserializersShortDeserRemoteActionCompatParcelizer2 != null && (primitiveArrayDeserializersShortDeserRemoteActionCompatParcelizer2.IconCompatParcelizer() & 4) != 0) {
                    i4 = i2;
                }
                float f = this.addOnMultiWindowModeChangedListener;
                if ((f == 1.0f || f == BitmapDescriptorFactory.HUE_RED) && view.canScrollVertically(i4)) {
                    return;
                }
            }
            if (audioAttributesCompatParcelizer.RemoteActionCompatParcelizer() != null && (audioAttributesCompatParcelizer.RemoteActionCompatParcelizer().IconCompatParcelizer() & 1) != 0) {
                float fAudioAttributesCompatParcelizer = primitiveArrayDeserializersFloatDeser.AudioAttributesCompatParcelizer(i, i2);
                float f2 = this.onCustomAction;
                if ((f2 <= BitmapDescriptorFactory.HUE_RED && fAudioAttributesCompatParcelizer < BitmapDescriptorFactory.HUE_RED) || (f2 >= 1.0f && fAudioAttributesCompatParcelizer > BitmapDescriptorFactory.HUE_RED)) {
                    view.setNestedScrollingEnabled(false);
                    view.post(new Runnable() { // from class: androidx.constraintlayout.motion.widget.MotionLayout.4
                        @Override // java.lang.Runnable
                        public final void run() {
                            view.setNestedScrollingEnabled(true);
                        }
                    });
                    return;
                }
            }
            float f3 = this.addOnMultiWindowModeChangedListener;
            long jOnPause = onPause();
            float f4 = i;
            this.addObserverForBackInvoker = f4;
            float f5 = i2;
            this.addObserverForBackInvokerlambda7 = f5;
            this._init_lambda4 = (float) ((jOnPause - this.ensureViewModelStore) * 1.0E-9d);
            this.ensureViewModelStore = jOnPause;
            primitiveArrayDeserializersFloatDeser.RemoteActionCompatParcelizer(f4, f5);
            if (f3 != this.addOnMultiWindowModeChangedListener) {
                iArr[0] = i;
                iArr[1] = i2;
            }
            RemoteActionCompatParcelizer(false);
            if (iArr[0] == 0 && iArr[1] == 0) {
                return;
            }
            this.addOnTrimMemoryListener = true;
        }
    }

    class RemoteActionCompatParcelizer {
        private int AudioAttributesImplApi26Parcelizer;
        private DashPathEffect AudioAttributesImplBaseParcelizer;
        private Paint MediaBrowserCompatItemReceiver;
        private Paint MediaBrowserCompatMediaItem;
        private Paint MediaBrowserCompatSearchResultReceiver;
        private float[] MediaDescriptionCompat;
        private Paint MediaMetadataCompat;
        private Path RatingCompat;
        private float[] handleMediaPlayPauseIfPendingOnHandler;
        private int[] onAddQueueItem;
        private float[] onCustomAction;
        private Paint onPause;
        final int AudioAttributesCompatParcelizer = -21965;
        final int write = -2067046;
        final int read = -13391360;
        final int IconCompatParcelizer = 1996488704;
        final int RemoteActionCompatParcelizer = 10;
        private Rect AudioAttributesImplApi21Parcelizer = new Rect();
        private boolean onCommand = false;
        private int MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = 1;

        public RemoteActionCompatParcelizer() {
            Paint paint = new Paint();
            this.MediaBrowserCompatMediaItem = paint;
            paint.setAntiAlias(true);
            this.MediaBrowserCompatMediaItem.setColor(-21965);
            this.MediaBrowserCompatMediaItem.setStrokeWidth(2.0f);
            this.MediaBrowserCompatMediaItem.setStyle(Paint.Style.STROKE);
            Paint paint2 = new Paint();
            this.MediaBrowserCompatSearchResultReceiver = paint2;
            paint2.setAntiAlias(true);
            this.MediaBrowserCompatSearchResultReceiver.setColor(-2067046);
            this.MediaBrowserCompatSearchResultReceiver.setStrokeWidth(2.0f);
            this.MediaBrowserCompatSearchResultReceiver.setStyle(Paint.Style.STROKE);
            Paint paint3 = new Paint();
            this.MediaMetadataCompat = paint3;
            paint3.setAntiAlias(true);
            this.MediaMetadataCompat.setColor(-13391360);
            this.MediaMetadataCompat.setStrokeWidth(2.0f);
            this.MediaMetadataCompat.setStyle(Paint.Style.STROKE);
            Paint paint4 = new Paint();
            this.onPause = paint4;
            paint4.setAntiAlias(true);
            this.onPause.setColor(-13391360);
            this.onPause.setTextSize(MotionLayout.this.getContext().getResources().getDisplayMetrics().density * 12.0f);
            this.handleMediaPlayPauseIfPendingOnHandler = new float[8];
            Paint paint5 = new Paint();
            this.MediaBrowserCompatItemReceiver = paint5;
            paint5.setAntiAlias(true);
            DashPathEffect dashPathEffect = new DashPathEffect(new float[]{4.0f, 8.0f}, BitmapDescriptorFactory.HUE_RED);
            this.AudioAttributesImplBaseParcelizer = dashPathEffect;
            this.MediaMetadataCompat.setPathEffect(dashPathEffect);
            this.MediaDescriptionCompat = new float[100];
            this.onAddQueueItem = new int[50];
        }

        public final void read(Canvas canvas, HashMap<View, handleSingleElementUnwrapped> map, int i, int i2) {
            if (map == null || map.size() == 0) {
                return;
            }
            canvas.save();
            if (!MotionLayout.this.isInEditMode() && (i2 & 1) == 2) {
                StringBuilder sb = new StringBuilder();
                sb.append(MotionLayout.this.getContext().getResources().getResourceName(MotionLayout.this.onPrepareFromUri));
                sb.append(":");
                sb.append(MotionLayout.this.AudioAttributesCompatParcelizer());
                String string = sb.toString();
                canvas.drawText(string, 10.0f, MotionLayout.this.getHeight() - 30, this.onPause);
                canvas.drawText(string, 11.0f, MotionLayout.this.getHeight() - 29, this.MediaBrowserCompatMediaItem);
            }
            for (handleSingleElementUnwrapped handlesingleelementunwrapped : map.values()) {
                int iRemoteActionCompatParcelizer = handlesingleelementunwrapped.RemoteActionCompatParcelizer();
                if (i2 > 0 && iRemoteActionCompatParcelizer == 0) {
                    iRemoteActionCompatParcelizer = 1;
                }
                if (iRemoteActionCompatParcelizer != 0) {
                    this.AudioAttributesImplApi26Parcelizer = handlesingleelementunwrapped.RemoteActionCompatParcelizer(this.MediaDescriptionCompat, this.onAddQueueItem);
                    if (iRemoteActionCompatParcelizer > 0) {
                        int i3 = i / 16;
                        float[] fArr = this.onCustomAction;
                        if (fArr == null || fArr.length != (i3 << 1)) {
                            this.onCustomAction = new float[i3 << 1];
                            this.RatingCompat = new Path();
                        }
                        float f = this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
                        canvas.translate(f, f);
                        this.MediaBrowserCompatMediaItem.setColor(1996488704);
                        this.MediaBrowserCompatItemReceiver.setColor(1996488704);
                        this.MediaBrowserCompatSearchResultReceiver.setColor(1996488704);
                        this.MediaMetadataCompat.setColor(1996488704);
                        handlesingleelementunwrapped.AudioAttributesCompatParcelizer(this.onCustomAction, i3);
                        RemoteActionCompatParcelizer(canvas, iRemoteActionCompatParcelizer, this.AudioAttributesImplApi26Parcelizer, handlesingleelementunwrapped);
                        this.MediaBrowserCompatMediaItem.setColor(-21965);
                        this.MediaBrowserCompatSearchResultReceiver.setColor(-2067046);
                        this.MediaBrowserCompatItemReceiver.setColor(-2067046);
                        this.MediaMetadataCompat.setColor(-13391360);
                        float f2 = -this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
                        canvas.translate(f2, f2);
                        RemoteActionCompatParcelizer(canvas, iRemoteActionCompatParcelizer, this.AudioAttributesImplApi26Parcelizer, handlesingleelementunwrapped);
                        if (iRemoteActionCompatParcelizer == 5) {
                            RemoteActionCompatParcelizer(canvas, handlesingleelementunwrapped);
                        }
                    }
                }
            }
            canvas.restore();
        }

        private void RemoteActionCompatParcelizer(Canvas canvas, int i, int i2, handleSingleElementUnwrapped handlesingleelementunwrapped) {
            if (i == 4) {
                read(canvas);
            }
            if (i == 2) {
                RemoteActionCompatParcelizer(canvas);
            }
            if (i == 3) {
                write(canvas);
            }
            IconCompatParcelizer(canvas);
            AudioAttributesCompatParcelizer(canvas, i, i2, handlesingleelementunwrapped);
        }

        private void IconCompatParcelizer(Canvas canvas) {
            canvas.drawLines(this.onCustomAction, this.MediaBrowserCompatMediaItem);
        }

        private void AudioAttributesCompatParcelizer(Canvas canvas, int i, int i2, handleSingleElementUnwrapped handlesingleelementunwrapped) {
            int width;
            int height;
            float f;
            float f2;
            if (handlesingleelementunwrapped.IconCompatParcelizer != null) {
                width = handlesingleelementunwrapped.IconCompatParcelizer.getWidth();
                height = handlesingleelementunwrapped.IconCompatParcelizer.getHeight();
            } else {
                width = 0;
                height = 0;
            }
            int i3 = 1;
            int i4 = 1;
            while (i4 < i2 - 1) {
                if (i != 4 || this.onAddQueueItem[i4 - 1] != 0) {
                    float[] fArr = this.MediaDescriptionCompat;
                    int i5 = i4 << 1;
                    float f3 = fArr[i5];
                    float f4 = fArr[i5 + i3];
                    this.RatingCompat.reset();
                    this.RatingCompat.moveTo(f3, f4 + 10.0f);
                    this.RatingCompat.lineTo(f3 + 10.0f, f4);
                    this.RatingCompat.lineTo(f3, f4 - 10.0f);
                    this.RatingCompat.lineTo(f3 - 10.0f, f4);
                    this.RatingCompat.close();
                    int i6 = i4 - 1;
                    handlesingleelementunwrapped.AudioAttributesCompatParcelizer(i6);
                    if (i == 4) {
                        int i7 = this.onAddQueueItem[i6];
                        if (i7 == i3) {
                            read(canvas, f3, f4);
                        } else if (i7 == 0) {
                            AudioAttributesCompatParcelizer(canvas, f3, f4);
                        } else {
                            if (i7 == 2) {
                                f = f4;
                                f2 = f3;
                                RemoteActionCompatParcelizer(canvas, f3, f4, width, height);
                            }
                            canvas.drawPath(this.RatingCompat, this.MediaBrowserCompatItemReceiver);
                        }
                        f = f4;
                        f2 = f3;
                        canvas.drawPath(this.RatingCompat, this.MediaBrowserCompatItemReceiver);
                    } else {
                        f = f4;
                        f2 = f3;
                    }
                    if (i == 2) {
                        read(canvas, f2, f);
                    }
                    if (i == 3) {
                        AudioAttributesCompatParcelizer(canvas, f2, f);
                    }
                    if (i == 6) {
                        RemoteActionCompatParcelizer(canvas, f2, f, width, height);
                    }
                    canvas.drawPath(this.RatingCompat, this.MediaBrowserCompatItemReceiver);
                }
                i4++;
                i3 = 1;
            }
            float[] fArr2 = this.onCustomAction;
            if (fArr2.length > 1) {
                canvas.drawCircle(fArr2[0], fArr2[1], 8.0f, this.MediaBrowserCompatSearchResultReceiver);
                float[] fArr3 = this.onCustomAction;
                canvas.drawCircle(fArr3[fArr3.length - 2], fArr3[fArr3.length - 1], 8.0f, this.MediaBrowserCompatSearchResultReceiver);
            }
        }

        private void RemoteActionCompatParcelizer(Canvas canvas) {
            float[] fArr = this.onCustomAction;
            canvas.drawLine(fArr[0], fArr[1], fArr[fArr.length - 2], fArr[fArr.length - 1], this.MediaMetadataCompat);
        }

        private void read(Canvas canvas) {
            boolean z = false;
            boolean z2 = false;
            for (int i = 0; i < this.AudioAttributesImplApi26Parcelizer; i++) {
                int i2 = this.onAddQueueItem[i];
                if (i2 == 1) {
                    z = true;
                }
                if (i2 == 0) {
                    z2 = true;
                }
            }
            if (z) {
                RemoteActionCompatParcelizer(canvas);
            }
            if (z2) {
                write(canvas);
            }
        }

        private void read(Canvas canvas, float f, float f2) {
            float[] fArr = this.onCustomAction;
            float f3 = fArr[0];
            float f4 = fArr[1];
            float f5 = fArr[fArr.length - 2];
            float f6 = fArr[fArr.length - 1];
            float fHypot = (float) Math.hypot(f3 - f5, f4 - f6);
            float f7 = f5 - f3;
            float f8 = f6 - f4;
            float f9 = (((f - f3) * f7) + ((f2 - f4) * f8)) / (fHypot * fHypot);
            float f10 = f3 + (f7 * f9);
            float f11 = f4 + (f9 * f8);
            Path path = new Path();
            path.moveTo(f, f2);
            path.lineTo(f10, f11);
            float fHypot2 = (float) Math.hypot(f10 - f, f11 - f2);
            StringBuilder sb = new StringBuilder("");
            sb.append(((int) ((fHypot2 * 100.0f) / fHypot)) / 100.0f);
            String string = sb.toString();
            write(string, this.onPause);
            canvas.drawTextOnPath(string, path, (fHypot2 / 2.0f) - (this.AudioAttributesImplApi21Parcelizer.width() / 2), -20.0f, this.onPause);
            canvas.drawLine(f, f2, f10, f11, this.MediaMetadataCompat);
        }

        private void write(String str, Paint paint) {
            paint.getTextBounds(str, 0, str.length(), this.AudioAttributesImplApi21Parcelizer);
        }

        private void write(Canvas canvas) {
            float[] fArr = this.onCustomAction;
            float f = fArr[0];
            float f2 = fArr[1];
            float f3 = fArr[fArr.length - 2];
            float f4 = fArr[fArr.length - 1];
            canvas.drawLine(Math.min(f, f3), Math.max(f2, f4), Math.max(f, f3), Math.max(f2, f4), this.MediaMetadataCompat);
            canvas.drawLine(Math.min(f, f3), Math.min(f2, f4), Math.min(f, f3), Math.max(f2, f4), this.MediaMetadataCompat);
        }

        private void AudioAttributesCompatParcelizer(Canvas canvas, float f, float f2) {
            float[] fArr = this.onCustomAction;
            float f3 = fArr[0];
            float f4 = fArr[1];
            float f5 = fArr[fArr.length - 2];
            float f6 = fArr[fArr.length - 1];
            float fMin = Math.min(f3, f5);
            float fMax = Math.max(f4, f6);
            float fMin2 = f - Math.min(f3, f5);
            float fMax2 = Math.max(f4, f6) - f2;
            StringBuilder sb = new StringBuilder("");
            sb.append(((int) (((double) ((fMin2 * 100.0f) / Math.abs(f5 - f3))) + 0.5d)) / 100.0f);
            String string = sb.toString();
            write(string, this.onPause);
            canvas.drawText(string, ((fMin2 / 2.0f) - (this.AudioAttributesImplApi21Parcelizer.width() / 2)) + fMin, f2 - 20.0f, this.onPause);
            canvas.drawLine(f, f2, Math.min(f3, f5), f2, this.MediaMetadataCompat);
            StringBuilder sb2 = new StringBuilder("");
            sb2.append(((int) (((double) ((fMax2 * 100.0f) / Math.abs(f6 - f4))) + 0.5d)) / 100.0f);
            String string2 = sb2.toString();
            write(string2, this.onPause);
            canvas.drawText(string2, f + 5.0f, fMax - ((fMax2 / 2.0f) - (this.AudioAttributesImplApi21Parcelizer.height() / 2)), this.onPause);
            canvas.drawLine(f, f2, f, Math.max(f4, f6), this.MediaMetadataCompat);
        }

        private void RemoteActionCompatParcelizer(Canvas canvas, float f, float f2, int i, int i2) {
            StringBuilder sb = new StringBuilder("");
            sb.append(((int) (((double) (((f - (i / 2)) * 100.0f) / (MotionLayout.this.getWidth() - i))) + 0.5d)) / 100.0f);
            String string = sb.toString();
            write(string, this.onPause);
            canvas.drawText(string, ((f / 2.0f) - (this.AudioAttributesImplApi21Parcelizer.width() / 2)) + BitmapDescriptorFactory.HUE_RED, f2 - 20.0f, this.onPause);
            canvas.drawLine(f, f2, Math.min(BitmapDescriptorFactory.HUE_RED, 1.0f), f2, this.MediaMetadataCompat);
            StringBuilder sb2 = new StringBuilder("");
            sb2.append(((int) (((double) (((f2 - (i2 / 2)) * 100.0f) / (MotionLayout.this.getHeight() - i2))) + 0.5d)) / 100.0f);
            String string2 = sb2.toString();
            write(string2, this.onPause);
            canvas.drawText(string2, f + 5.0f, BitmapDescriptorFactory.HUE_RED - ((f2 / 2.0f) - (this.AudioAttributesImplApi21Parcelizer.height() / 2)), this.onPause);
            canvas.drawLine(f, f2, f, Math.max(BitmapDescriptorFactory.HUE_RED, 1.0f), this.MediaMetadataCompat);
        }

        private void RemoteActionCompatParcelizer(Canvas canvas, handleSingleElementUnwrapped handlesingleelementunwrapped) {
            this.RatingCompat.reset();
            for (int i = 0; i <= 50; i++) {
                handlesingleelementunwrapped.IconCompatParcelizer(i / 50.0f, this.handleMediaPlayPauseIfPendingOnHandler);
                Path path = this.RatingCompat;
                float[] fArr = this.handleMediaPlayPauseIfPendingOnHandler;
                path.moveTo(fArr[0], fArr[1]);
                Path path2 = this.RatingCompat;
                float[] fArr2 = this.handleMediaPlayPauseIfPendingOnHandler;
                path2.lineTo(fArr2[2], fArr2[3]);
                Path path3 = this.RatingCompat;
                float[] fArr3 = this.handleMediaPlayPauseIfPendingOnHandler;
                path3.lineTo(fArr3[4], fArr3[5]);
                Path path4 = this.RatingCompat;
                float[] fArr4 = this.handleMediaPlayPauseIfPendingOnHandler;
                path4.lineTo(fArr4[6], fArr4[7]);
                this.RatingCompat.close();
            }
            this.MediaBrowserCompatMediaItem.setColor(1140850688);
            canvas.translate(2.0f, 2.0f);
            canvas.drawPath(this.RatingCompat, this.MediaBrowserCompatMediaItem);
            canvas.translate(-2.0f, -2.0f);
            this.MediaBrowserCompatMediaItem.setColor(-65536);
            canvas.drawPath(this.RatingCompat, this.MediaBrowserCompatMediaItem);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c7  */
    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void dispatchDraw(android.graphics.Canvas r10) {
        /*
            Method dump skipped, instruction units count: 295
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionLayout.dispatchDraw(android.graphics.Canvas):void");
    }

    private void onCommand() {
        boolean z;
        float fSignum = Math.signum(this.getOnBackPressedDispatcherannotations - this.onCustomAction);
        long jOnPause = onPause();
        Interpolator interpolator = this.onSetRepeatMode;
        float interpolation = this.onCustomAction + (!(interpolator instanceof NumberDeserializersIntegerDeserializer) ? (((jOnPause - this.addOnContextAvailableListener) * fSignum) * 1.0E-9f) / this.menuHostHelperlambda0 : 0.0f);
        if (this.addOnConfigurationChangedListener) {
            interpolation = this.getOnBackPressedDispatcherannotations;
        }
        if ((fSignum <= BitmapDescriptorFactory.HUE_RED || interpolation < this.getOnBackPressedDispatcherannotations) && (fSignum > BitmapDescriptorFactory.HUE_RED || interpolation > this.getOnBackPressedDispatcherannotations)) {
            z = false;
        } else {
            interpolation = this.getOnBackPressedDispatcherannotations;
            z = true;
        }
        if (interpolator != null && !z) {
            if (this.addMenuProvider) {
                interpolation = interpolator.getInterpolation((jOnPause - this.onMediaButtonEvent) * 1.0E-9f);
            } else {
                interpolation = interpolator.getInterpolation(interpolation);
            }
        }
        if ((fSignum > BitmapDescriptorFactory.HUE_RED && interpolation >= this.getOnBackPressedDispatcherannotations) || (fSignum <= BitmapDescriptorFactory.HUE_RED && interpolation <= this.getOnBackPressedDispatcherannotations)) {
            interpolation = this.getOnBackPressedDispatcherannotations;
        }
        this.AudioAttributesImplApi21Parcelizer = interpolation;
        int childCount = getChildCount();
        long jOnPause2 = onPause();
        Interpolator interpolator2 = this.accessaddObserverForBackInvoker;
        if (interpolator2 != null) {
            interpolation = interpolator2.getInterpolation(interpolation);
        }
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            handleSingleElementUnwrapped handlesingleelementunwrapped = this.MediaBrowserCompatCustomActionResultReceiver.get(childAt);
            if (handlesingleelementunwrapped != null) {
                handlesingleelementunwrapped.write(childAt, interpolation, jOnPause2, this.onSkipToQueueItem);
            }
        }
        if (this.AudioAttributesImplApi26Parcelizer) {
            requestLayout();
        }
    }

    public final void IconCompatParcelizer(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            handleSingleElementUnwrapped handlesingleelementunwrapped = this.MediaBrowserCompatCustomActionResultReceiver.get(getChildAt(i));
            if (handlesingleelementunwrapped != null) {
                handlesingleelementunwrapped.write(z);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x016e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void RemoteActionCompatParcelizer(boolean r23) {
        /*
            Method dump skipped, instruction units count: 627
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionLayout.RemoteActionCompatParcelizer(boolean):void");
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.onRewind = true;
        try {
            if (this.MediaDescriptionCompat == null) {
                super.onLayout(z, i, i2, i3, i4);
                return;
            }
            int i5 = i3 - i;
            int i6 = i4 - i2;
            if (this.MediaSessionCompatResultReceiverWrapper != i5 || this.MediaSessionCompatToken != i6) {
                onPlay();
                RemoteActionCompatParcelizer(true);
            }
            this.MediaSessionCompatResultReceiverWrapper = i5;
            this.MediaSessionCompatToken = i6;
            this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = i5;
            this.ResultReceiver = i6;
        } finally {
            this.onRewind = false;
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public final void read(int i) {
        this.handleMediaPlayPauseIfPendingOnHandler = null;
    }

    private void AudioAttributesCompatParcelizer(AttributeSet attributeSet) {
        PrimitiveArrayDeserializersFloatDeser primitiveArrayDeserializersFloatDeser;
        RemoteActionCompatParcelizer = isInEditMode();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, _isBlank.read.MotionLayout);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            boolean z = true;
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == _isBlank.read.MotionLayout_layoutDescription) {
                    this.MediaDescriptionCompat = new PrimitiveArrayDeserializersFloatDeser(getContext(), this, typedArrayObtainStyledAttributes.getResourceId(index, -1));
                } else if (index == _isBlank.read.MotionLayout_currentState) {
                    this.AudioAttributesCompatParcelizer = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                } else if (index == _isBlank.read.MotionLayout_motionProgress) {
                    this.getOnBackPressedDispatcherannotations = typedArrayObtainStyledAttributes.getFloat(index, BitmapDescriptorFactory.HUE_RED);
                    this.onRemoveQueueItem = true;
                } else if (index == _isBlank.read.MotionLayout_applyMotionScene) {
                    z = typedArrayObtainStyledAttributes.getBoolean(index, z);
                } else if (index == _isBlank.read.MotionLayout_showPaths) {
                    if (this.read == 0) {
                        this.read = typedArrayObtainStyledAttributes.getBoolean(index, false) ? 2 : 0;
                    }
                } else if (index == _isBlank.read.MotionLayout_motionDebug) {
                    this.read = typedArrayObtainStyledAttributes.getInt(index, 0);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
            if (!z) {
                this.MediaDescriptionCompat = null;
            }
        }
        if (this.read != 0) {
            onCustomAction();
        }
        if (this.AudioAttributesCompatParcelizer != -1 || (primitiveArrayDeserializersFloatDeser = this.MediaDescriptionCompat) == null) {
            return;
        }
        this.AudioAttributesCompatParcelizer = primitiveArrayDeserializersFloatDeser.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
        this.onPlay = this.MediaDescriptionCompat.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
        this.onPrepareFromUri = this.MediaDescriptionCompat.AudioAttributesImplApi21Parcelizer();
    }

    public void setScene(PrimitiveArrayDeserializersFloatDeser primitiveArrayDeserializersFloatDeser) {
        this.MediaDescriptionCompat = primitiveArrayDeserializersFloatDeser;
        primitiveArrayDeserializersFloatDeser.AudioAttributesCompatParcelizer(handleMediaPlayPauseIfPendingOnHandler());
        onPlay();
    }

    private void onCustomAction() {
        PrimitiveArrayDeserializersFloatDeser primitiveArrayDeserializersFloatDeser = this.MediaDescriptionCompat;
        if (primitiveArrayDeserializersFloatDeser == null) {
            return;
        }
        int iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = primitiveArrayDeserializersFloatDeser.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
        PrimitiveArrayDeserializersFloatDeser primitiveArrayDeserializersFloatDeser2 = this.MediaDescriptionCompat;
        write(iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, primitiveArrayDeserializersFloatDeser2.RemoteActionCompatParcelizer(primitiveArrayDeserializersFloatDeser2.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver()));
        SparseIntArray sparseIntArray = new SparseIntArray();
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        for (PrimitiveArrayDeserializersFloatDeser.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer : this.MediaDescriptionCompat.IconCompatParcelizer()) {
            PrimitiveArrayDeserializersFloatDeser.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer2 = this.MediaDescriptionCompat.write;
            AudioAttributesCompatParcelizer(audioAttributesCompatParcelizer);
            int i = audioAttributesCompatParcelizer.read();
            int iWrite = audioAttributesCompatParcelizer.write();
            NumberDeserializersShortDeserializer.IconCompatParcelizer(getContext(), i);
            NumberDeserializersShortDeserializer.IconCompatParcelizer(getContext(), iWrite);
            sparseIntArray.get(i);
            sparseIntArray2.get(iWrite);
            sparseIntArray.put(i, iWrite);
            sparseIntArray2.put(iWrite, i);
            this.MediaDescriptionCompat.RemoteActionCompatParcelizer(i);
            this.MediaDescriptionCompat.RemoteActionCompatParcelizer(iWrite);
        }
    }

    private void write(int i, ReferenceTypeDeserializer referenceTypeDeserializer) {
        NumberDeserializersShortDeserializer.IconCompatParcelizer(getContext(), i);
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            int id = childAt.getId();
            if (id == -1) {
                childAt.getClass().getName();
            }
            if (referenceTypeDeserializer.RemoteActionCompatParcelizer(id) == null) {
                NumberDeserializersShortDeserializer.write(childAt);
            }
        }
        int[] iArrAudioAttributesCompatParcelizer = referenceTypeDeserializer.AudioAttributesCompatParcelizer();
        for (int i3 = 0; i3 < iArrAudioAttributesCompatParcelizer.length; i3++) {
            int i4 = iArrAudioAttributesCompatParcelizer[i3];
            NumberDeserializersShortDeserializer.IconCompatParcelizer(getContext(), i4);
            findViewById(iArrAudioAttributesCompatParcelizer[i3]);
            referenceTypeDeserializer.AudioAttributesCompatParcelizer(i4);
            referenceTypeDeserializer.MediaBrowserCompatCustomActionResultReceiver(i4);
        }
    }

    private static void AudioAttributesCompatParcelizer(PrimitiveArrayDeserializersFloatDeser.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        audioAttributesCompatParcelizer.read();
        audioAttributesCompatParcelizer.write();
    }

    public void setDebugMode(int i) {
        this.read = i;
        invalidate();
    }

    private boolean RemoteActionCompatParcelizer(View view, MotionEvent motionEvent, float f, float f2) {
        Matrix matrix = view.getMatrix();
        if (matrix.isIdentity()) {
            motionEvent.offsetLocation(f, f2);
            boolean zOnTouchEvent = view.onTouchEvent(motionEvent);
            motionEvent.offsetLocation(-f, -f2);
            return zOnTouchEvent;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        motionEventObtain.offsetLocation(f, f2);
        if (this.onSetShuffleMode == null) {
            this.onSetShuffleMode = new Matrix();
        }
        matrix.invert(this.onSetShuffleMode);
        motionEventObtain.transform(this.onSetShuffleMode);
        boolean zOnTouchEvent2 = view.onTouchEvent(motionEventObtain);
        motionEventObtain.recycle();
        return zOnTouchEvent2;
    }

    private boolean AudioAttributesCompatParcelizer(float f, float f2, View view, MotionEvent motionEvent) {
        boolean z;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                if (AudioAttributesCompatParcelizer((r3.getLeft() + f) - view.getScrollX(), (r3.getTop() + f2) - view.getScrollY(), viewGroup.getChildAt(childCount), motionEvent)) {
                    z = true;
                    break;
                }
            }
            z = false;
        } else {
            z = false;
        }
        if (!z) {
            this.onPlayFromUri.set(f, f2, (view.getRight() + f) - view.getLeft(), (view.getBottom() + f2) - view.getTop());
            if ((motionEvent.getAction() != 0 || this.onPlayFromUri.contains(motionEvent.getX(), motionEvent.getY())) && RemoteActionCompatParcelizer(view, motionEvent, -f, -f2)) {
                return true;
            }
        }
        return z;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        PrimitiveArrayDeserializersShortDeser primitiveArrayDeserializersShortDeserRemoteActionCompatParcelizer;
        int iMediaBrowserCompatMediaItem;
        RectF rectFAudioAttributesCompatParcelizer;
        PrimitiveArrayDeserializersFloatDeser primitiveArrayDeserializersFloatDeser = this.MediaDescriptionCompat;
        if (primitiveArrayDeserializersFloatDeser != null && this.onSetRating) {
            if (primitiveArrayDeserializersFloatDeser.RemoteActionCompatParcelizer != null) {
                this.MediaDescriptionCompat.RemoteActionCompatParcelizer.IconCompatParcelizer(motionEvent);
            }
            PrimitiveArrayDeserializersFloatDeser.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = this.MediaDescriptionCompat.write;
            if (audioAttributesCompatParcelizer != null && audioAttributesCompatParcelizer.AudioAttributesImplBaseParcelizer() && (primitiveArrayDeserializersShortDeserRemoteActionCompatParcelizer = audioAttributesCompatParcelizer.RemoteActionCompatParcelizer()) != null && ((motionEvent.getAction() != 0 || (rectFAudioAttributesCompatParcelizer = primitiveArrayDeserializersShortDeserRemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(this, new RectF())) == null || rectFAudioAttributesCompatParcelizer.contains(motionEvent.getX(), motionEvent.getY())) && (iMediaBrowserCompatMediaItem = primitiveArrayDeserializersShortDeserRemoteActionCompatParcelizer.MediaBrowserCompatMediaItem()) != -1)) {
                View view = this._init_lambda5;
                if (view == null || view.getId() != iMediaBrowserCompatMediaItem) {
                    this._init_lambda5 = findViewById(iMediaBrowserCompatMediaItem);
                }
                if (this._init_lambda5 != null) {
                    this.onPlayFromUri.set(r0.getLeft(), this._init_lambda5.getTop(), this._init_lambda5.getRight(), this._init_lambda5.getBottom());
                    if (this.onPlayFromUri.contains(motionEvent.getX(), motionEvent.getY()) && !AudioAttributesCompatParcelizer(this._init_lambda5.getLeft(), this._init_lambda5.getTop(), this._init_lambda5, motionEvent)) {
                        return onTouchEvent(motionEvent);
                    }
                }
            }
        }
        return false;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        PrimitiveArrayDeserializersFloatDeser primitiveArrayDeserializersFloatDeser = this.MediaDescriptionCompat;
        if (primitiveArrayDeserializersFloatDeser != null && this.onSetRating && primitiveArrayDeserializersFloatDeser.onCommand()) {
            PrimitiveArrayDeserializersFloatDeser.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = this.MediaDescriptionCompat.write;
            if (audioAttributesCompatParcelizer != null && !audioAttributesCompatParcelizer.AudioAttributesImplBaseParcelizer()) {
                return super.onTouchEvent(motionEvent);
            }
            this.MediaDescriptionCompat.AudioAttributesCompatParcelizer(motionEvent, write(), this);
            if (this.MediaDescriptionCompat.write.AudioAttributesCompatParcelizer(4)) {
                return this.MediaDescriptionCompat.write.RemoteActionCompatParcelizer().MediaMetadataCompat();
            }
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        int i;
        super.onAttachedToWindow();
        Display display = getDisplay();
        if (display != null) {
            this.r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8 = display.getRotation();
        }
        PrimitiveArrayDeserializersFloatDeser primitiveArrayDeserializersFloatDeser = this.MediaDescriptionCompat;
        if (primitiveArrayDeserializersFloatDeser != null && (i = this.AudioAttributesCompatParcelizer) != -1) {
            ReferenceTypeDeserializer referenceTypeDeserializerRemoteActionCompatParcelizer = primitiveArrayDeserializersFloatDeser.RemoteActionCompatParcelizer(i);
            this.MediaDescriptionCompat.IconCompatParcelizer(this);
            ArrayList<MotionHelper> arrayList = this.onPlayFromSearch;
            if (arrayList != null) {
                for (MotionHelper motionHelper : arrayList) {
                }
            }
            if (referenceTypeDeserializerRemoteActionCompatParcelizer != null) {
                referenceTypeDeserializerRemoteActionCompatParcelizer.write(this);
            }
            this.onPlay = this.AudioAttributesCompatParcelizer;
        }
        MediaBrowserCompatCustomActionResultReceiver();
        MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiver = this.accessonBackPresseds1027565324;
        if (mediaBrowserCompatCustomActionResultReceiver != null) {
            if (this.onPrepareFromMediaId) {
                post(new Runnable() { // from class: androidx.constraintlayout.motion.widget.MotionLayout.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        MotionLayout.this.accessonBackPresseds1027565324.RemoteActionCompatParcelizer();
                    }
                });
                return;
            } else {
                mediaBrowserCompatCustomActionResultReceiver.RemoteActionCompatParcelizer();
                return;
            }
        }
        PrimitiveArrayDeserializersFloatDeser primitiveArrayDeserializersFloatDeser2 = this.MediaDescriptionCompat;
        if (primitiveArrayDeserializersFloatDeser2 == null || primitiveArrayDeserializersFloatDeser2.write == null || this.MediaDescriptionCompat.write.IconCompatParcelizer() != 4) {
            return;
        }
        MediaMetadataCompat();
        write(AudioAttributesImplApi21Parcelizer.SETUP);
        write(AudioAttributesImplApi21Parcelizer.MOVING);
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i) {
        PrimitiveArrayDeserializersFloatDeser primitiveArrayDeserializersFloatDeser = this.MediaDescriptionCompat;
        if (primitiveArrayDeserializersFloatDeser != null) {
            primitiveArrayDeserializersFloatDeser.AudioAttributesCompatParcelizer(handleMediaPlayPauseIfPendingOnHandler());
        }
    }

    public final void MediaBrowserCompatCustomActionResultReceiver() {
        PrimitiveArrayDeserializersFloatDeser primitiveArrayDeserializersFloatDeser = this.MediaDescriptionCompat;
        if (primitiveArrayDeserializersFloatDeser != null) {
            if (primitiveArrayDeserializersFloatDeser.AudioAttributesCompatParcelizer(this, this.AudioAttributesCompatParcelizer)) {
                requestLayout();
                return;
            }
            int i = this.AudioAttributesCompatParcelizer;
            if (i != -1) {
                this.MediaDescriptionCompat.write(this, i);
            }
            if (this.MediaDescriptionCompat.onCommand()) {
                this.MediaDescriptionCompat.onAddQueueItem();
            }
        }
    }

    public final int write() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final float AudioAttributesCompatParcelizer() {
        return this.onCustomAction;
    }

    public final void write(int i, float f, float f2, float f3, float[] fArr) {
        HashMap<View, handleSingleElementUnwrapped> map = this.MediaBrowserCompatCustomActionResultReceiver;
        View viewMediaBrowserCompatItemReceiver = MediaBrowserCompatItemReceiver(i);
        handleSingleElementUnwrapped handlesingleelementunwrapped = map.get(viewMediaBrowserCompatItemReceiver);
        if (handlesingleelementunwrapped == null) {
            if (viewMediaBrowserCompatItemReceiver != null) {
                viewMediaBrowserCompatItemReceiver.getContext().getResources().getResourceName(i);
            }
        } else {
            handlesingleelementunwrapped.write(f, f2, f3, fArr);
            float y = viewMediaBrowserCompatItemReceiver.getY();
            this.onPause = f;
            this.onPlayFromMediaId = y;
        }
    }

    public void setTransitionListener(AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer) {
        this.addOnNewIntentListener = audioAttributesImplApi26Parcelizer;
    }

    public final void read() {
        CopyOnWriteArrayList<AudioAttributesImplApi26Parcelizer> copyOnWriteArrayList = this.addOnPictureInPictureModeChangedListener;
        if (copyOnWriteArrayList != null) {
            for (AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer : copyOnWriteArrayList) {
            }
        }
    }

    private void MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        CopyOnWriteArrayList<AudioAttributesImplApi26Parcelizer> copyOnWriteArrayList;
        if ((this.addOnNewIntentListener == null && ((copyOnWriteArrayList = this.addOnPictureInPictureModeChangedListener) == null || copyOnWriteArrayList.isEmpty())) || this.PlaybackStateCompat == this.addOnMultiWindowModeChangedListener) {
            return;
        }
        if (this.ParcelableVolumeInfo != -1) {
            CopyOnWriteArrayList<AudioAttributesImplApi26Parcelizer> copyOnWriteArrayList2 = this.addOnPictureInPictureModeChangedListener;
            if (copyOnWriteArrayList2 != null) {
                for (AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer : copyOnWriteArrayList2) {
                }
            }
            this.onSetPlaybackSpeed = true;
        }
        this.ParcelableVolumeInfo = -1;
        this.PlaybackStateCompat = this.addOnMultiWindowModeChangedListener;
        CopyOnWriteArrayList<AudioAttributesImplApi26Parcelizer> copyOnWriteArrayList3 = this.addOnPictureInPictureModeChangedListener;
        if (copyOnWriteArrayList3 != null) {
            for (AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer2 : copyOnWriteArrayList3) {
            }
        }
        this.onSetPlaybackSpeed = true;
    }

    private void onMediaButtonEvent() {
        int iIntValue;
        CopyOnWriteArrayList<AudioAttributesImplApi26Parcelizer> copyOnWriteArrayList;
        if ((this.addOnNewIntentListener != null || ((copyOnWriteArrayList = this.addOnPictureInPictureModeChangedListener) != null && !copyOnWriteArrayList.isEmpty())) && this.ParcelableVolumeInfo == -1) {
            this.ParcelableVolumeInfo = this.AudioAttributesCompatParcelizer;
            if (this.addContentView.isEmpty()) {
                iIntValue = -1;
            } else {
                iIntValue = this.addContentView.get(r0.size() - 1).intValue();
            }
            int i = this.AudioAttributesCompatParcelizer;
            if (iIntValue != i && i != -1) {
                this.addContentView.add(Integer.valueOf(i));
            }
        }
        onFastForward();
        Runnable runnable = this.r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw;
        if (runnable != null) {
            runnable.run();
        }
    }

    private void onFastForward() {
        CopyOnWriteArrayList<AudioAttributesImplApi26Parcelizer> copyOnWriteArrayList;
        if (this.addOnNewIntentListener == null && ((copyOnWriteArrayList = this.addOnPictureInPictureModeChangedListener) == null || copyOnWriteArrayList.isEmpty())) {
            return;
        }
        this.onSetPlaybackSpeed = false;
        for (Integer num : this.addContentView) {
            AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer = this.addOnNewIntentListener;
            if (audioAttributesImplApi26Parcelizer != null) {
                audioAttributesImplApi26Parcelizer.read(num.intValue());
            }
            CopyOnWriteArrayList<AudioAttributesImplApi26Parcelizer> copyOnWriteArrayList2 = this.addOnPictureInPictureModeChangedListener;
            if (copyOnWriteArrayList2 != null) {
                Iterator<AudioAttributesImplApi26Parcelizer> it = copyOnWriteArrayList2.iterator();
                while (it.hasNext()) {
                    it.next().read(num.intValue());
                }
            }
        }
        this.addContentView.clear();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        if (view instanceof MotionHelper) {
            MotionHelper motionHelper = (MotionHelper) view;
            if (this.addOnPictureInPictureModeChangedListener == null) {
                this.addOnPictureInPictureModeChangedListener = new CopyOnWriteArrayList<>();
            }
            this.addOnPictureInPictureModeChangedListener.add(motionHelper);
            if (motionHelper.RemoteActionCompatParcelizer()) {
                if (this._init_lambda2 == null) {
                    this._init_lambda2 = new ArrayList<>();
                }
                this._init_lambda2.add(motionHelper);
            }
            if (motionHelper.read()) {
                if (this.r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0 == null) {
                    this.r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0 = new ArrayList<>();
                }
                this.r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0.add(motionHelper);
            }
            if (motionHelper.IconCompatParcelizer()) {
                if (this.onPlayFromSearch == null) {
                    this.onPlayFromSearch = new ArrayList<>();
                }
                this.onPlayFromSearch.add(motionHelper);
            }
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        ArrayList<MotionHelper> arrayList = this._init_lambda2;
        if (arrayList != null) {
            arrayList.remove(view);
        }
        ArrayList<MotionHelper> arrayList2 = this.r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0;
        if (arrayList2 != null) {
            arrayList2.remove(view);
        }
    }

    public void setOnShow(float f) {
        ArrayList<MotionHelper> arrayList = this._init_lambda2;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this._init_lambda2.get(i).setProgress(f);
            }
        }
    }

    public void setOnHide(float f) {
        ArrayList<MotionHelper> arrayList = this.r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0.get(i).setProgress(f);
            }
        }
    }

    public final int[] RemoteActionCompatParcelizer() {
        PrimitiveArrayDeserializersFloatDeser primitiveArrayDeserializersFloatDeser = this.MediaDescriptionCompat;
        if (primitiveArrayDeserializersFloatDeser == null) {
            return null;
        }
        return primitiveArrayDeserializersFloatDeser.read();
    }

    public final ReferenceTypeDeserializer RemoteActionCompatParcelizer(int i) {
        PrimitiveArrayDeserializersFloatDeser primitiveArrayDeserializersFloatDeser = this.MediaDescriptionCompat;
        if (primitiveArrayDeserializersFloatDeser == null) {
            return null;
        }
        return primitiveArrayDeserializersFloatDeser.RemoteActionCompatParcelizer(i);
    }

    private void onPlay() {
        this.r8lambdaKUbBm7ckfqTc9QCgukC86fguu4.read();
        invalidate();
    }

    public final void IconCompatParcelizer(int i, ReferenceTypeDeserializer referenceTypeDeserializer) {
        PrimitiveArrayDeserializersFloatDeser primitiveArrayDeserializersFloatDeser = this.MediaDescriptionCompat;
        if (primitiveArrayDeserializersFloatDeser != null) {
            primitiveArrayDeserializersFloatDeser.read(i, referenceTypeDeserializer);
        }
        onPrepareFromMediaId();
        if (this.AudioAttributesCompatParcelizer == i) {
            referenceTypeDeserializer.write(this);
        }
    }

    private void onPrepareFromMediaId() {
        IconCompatParcelizer iconCompatParcelizer = this.r8lambdaKUbBm7ckfqTc9QCgukC86fguu4;
        _long _longVar = this.onAddQueueItem;
        iconCompatParcelizer.read(this.MediaDescriptionCompat.RemoteActionCompatParcelizer(this.onPlay), this.MediaDescriptionCompat.RemoteActionCompatParcelizer(this.onPrepareFromUri));
        onPlay();
    }

    public final int MediaBrowserCompatItemReceiver() {
        return this.onPlay;
    }

    public final int IconCompatParcelizer() {
        return this.onPrepareFromUri;
    }

    public void setTransitionDuration(int i) {
        PrimitiveArrayDeserializersFloatDeser primitiveArrayDeserializersFloatDeser = this.MediaDescriptionCompat;
        if (primitiveArrayDeserializersFloatDeser == null) {
            return;
        }
        primitiveArrayDeserializersFloatDeser.IconCompatParcelizer(i);
    }

    public final PrimitiveArrayDeserializersFloatDeser.AudioAttributesCompatParcelizer write(int i) {
        return this.MediaDescriptionCompat.write(i);
    }

    public void setInteractionEnabled(boolean z) {
        this.onSetRating = z;
    }

    public final boolean AudioAttributesImplApi21Parcelizer() {
        return this.onSetRating;
    }

    public final void IconCompatParcelizer(int i, View... viewArr) {
        PrimitiveArrayDeserializersFloatDeser primitiveArrayDeserializersFloatDeser = this.MediaDescriptionCompat;
        if (primitiveArrayDeserializersFloatDeser != null) {
            primitiveArrayDeserializersFloatDeser.read(i, viewArr);
        }
    }

    public final boolean IconCompatParcelizer(int i, handleSingleElementUnwrapped handlesingleelementunwrapped) {
        PrimitiveArrayDeserializersFloatDeser primitiveArrayDeserializersFloatDeser = this.MediaDescriptionCompat;
        if (primitiveArrayDeserializersFloatDeser != null) {
            return primitiveArrayDeserializersFloatDeser.RemoteActionCompatParcelizer(i, handlesingleelementunwrapped);
        }
        return false;
    }

    public void setDelayedApplicationOfInitialState(boolean z) {
        this.onPrepareFromMediaId = z;
    }
}
