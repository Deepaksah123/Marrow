package androidx.recyclerview.widget;

import android.R;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.customview.view.AbsSavedState;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import kotlin.InvalidTypeIdException;
import kotlin.RegexDeserializer;
import kotlin.RegexDeserializerdeserializeoptions1;
import kotlin.SequenceDeserializer;
import kotlin.SingletonSupport;
import kotlin.TypesKt;
import kotlin.UIntKeyDeserializer;
import kotlin.UIntSerializer;
import kotlin.ULongDeserializer;
import kotlin._putValueHandleDups;
import kotlin.accessgetTRUEcp;
import kotlin.addValue;
import kotlin.constructDelegatingKeyDeserializer;
import kotlin.createPrimordial;
import kotlin.deserializeUsingCustom;
import kotlin.emptyList;
import kotlin.findNameForRegularGetter;
import kotlin.getDeserializerForJavaNioFilePath;
import kotlin.hasSuperClassStartingWith;
import kotlin.memberMethods;
import kotlin.rootObjectScope;

/* JADX INFO: loaded from: classes2.dex */
public class RecyclerView extends ViewGroup implements _putValueHandleDups, addValue {
    public static boolean AudioAttributesImplApi26Parcelizer = false;
    static boolean AudioAttributesImplBaseParcelizer = false;
    UIntKeyDeserializer AudioAttributesImplApi21Parcelizer;
    public IconCompatParcelizer MediaBrowserCompatItemReceiver;
    boolean MediaBrowserCompatMediaItem;
    public TypesKt MediaBrowserCompatSearchResultReceiver;
    boolean MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    boolean MediaDescriptionCompat;
    public RegexDeserializer MediaMetadataCompat;
    private RemoteActionCompatParcelizer MediaSessionCompatQueueItem;
    private int MediaSessionCompatResultReceiverWrapper;
    private int MediaSessionCompatToken;
    private write ParcelableVolumeInfo;
    private boolean PlaybackStateCompat;
    private boolean PlaybackStateCompatCustomAction;
    public boolean RatingCompat;
    private int ResultReceiver;
    private int _init_lambda2;
    private Runnable _init_lambda3;
    private int _init_lambda4;
    private boolean _init_lambda5;
    private int accessaddObserverForBackInvoker;
    private EdgeEffect accessensureViewModelStore;
    private int accessgetReportFullyDrawnExecutorp;
    private final onCommand accessonBackPresseds1027565324;
    private final float addContentView;
    private RatingCompat addMenuProvider;
    private final int[] addObserverForBackInvoker;
    private final int addObserverForBackInvokerlambda7;
    private MediaBrowserCompatSearchResultReceiver addOnConfigurationChangedListener;
    private List<MediaBrowserCompatSearchResultReceiver> addOnContextAvailableListener;
    private EdgeEffect addOnMultiWindowModeChangedListener;
    private float addOnNewIntentListener;
    private float addOnPictureInPictureModeChangedListener;
    private int addOnTrimMemoryListener;
    private rootObjectScope addOnUserLeaveHintListener;
    private final int createFullyDrawnExecutor;
    private final int[] ensureViewModelStore;
    private final int[] getActivityResultRegistry;
    private int getDefaultViewModelCreationExtras;
    private final Rect getDefaultViewModelProviderFactory;
    private EdgeEffect getFullyDrawnReporter;
    private int getLastCustomNonConfigurationInstance;
    private final UIntSerializer.AudioAttributesCompatParcelizer getLifecycle;
    private List<AudioAttributesImplApi21Parcelizer> getOnBackPressedDispatcherannotations;
    private VelocityTracker getSavedStateRegistry;
    private boolean getSavedStateRegistryControllerannotations;
    boolean handleMediaPlayPauseIfPendingOnHandler;
    private final ArrayList<MediaBrowserCompatMediaItem> menuHostHelperlambda0;
    SingletonSupport onAddQueueItem;
    AudioAttributesImplApi26Parcelizer onCommand;
    boolean onCustomAction;
    boolean onFastForward;
    boolean onMediaButtonEvent;
    final ArrayList<AudioAttributesImplBaseParcelizer> onPause;
    boolean onPlay;
    public MediaBrowserCompatItemReceiver onPlayFromMediaId;
    public SingletonSupport.read onPlayFromSearch;
    boolean onPlayFromUri;
    boolean onPrepare;
    SavedState onPrepareFromMediaId;
    final List<onMediaButtonEvent> onPrepareFromSearch;
    public final MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver onPrepareFromUri;
    final int[] onRemoveQueueItem;
    public final MediaDescriptionCompat onRemoveQueueItemAt;
    final List<onAddQueueItem> onRewind;
    onAddQueueItem onSeekTo;
    final onFastForward onSetCaptioningEnabled;
    final Rect onSetPlaybackSpeed;
    final UIntSerializer onSetRating;
    final RectF onSetRepeatMode;
    final Runnable onSetShuffleMode;
    private EdgeEffect onSkipToQueueItem;
    private boolean r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw;
    private int r8lambdaKUbBm7ckfqTc9QCgukC86fguu4;
    private int r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
    private AudioAttributesImplApi26Parcelizer.read r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;
    private MediaBrowserCompatMediaItem r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8;
    private int r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0;
    private final AccessibilityManager setSessionImpl;
    private static final int[] onSkipToPrevious = {R.attr.nestedScrollingEnabled};
    private static final float RemoteActionCompatParcelizer = (float) (Math.log(0.78d) / Math.log(0.9d));
    static final boolean write = false;
    static final boolean read = true;
    static final boolean AudioAttributesCompatParcelizer = true;
    static final boolean IconCompatParcelizer = true;
    private static final Class<?>[] onSkipToNext = {Context.class, AttributeSet.class, Integer.TYPE, Integer.TYPE};
    static final Interpolator MediaBrowserCompatCustomActionResultReceiver = new Interpolator() { // from class: androidx.recyclerview.widget.RecyclerView.2
        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    };
    private static handleMediaPlayPauseIfPendingOnHandler onStop = new handleMediaPlayPauseIfPendingOnHandler();

    public interface AudioAttributesImplApi21Parcelizer {
        void RemoteActionCompatParcelizer(View view);

        void read(View view);
    }

    public interface MediaBrowserCompatMediaItem {
        boolean IconCompatParcelizer(MotionEvent motionEvent);

        void read(MotionEvent motionEvent);
    }

    public static abstract class MediaBrowserCompatSearchResultReceiver {
        public void AudioAttributesCompatParcelizer(RecyclerView recyclerView, int i) {
        }

        public void RemoteActionCompatParcelizer(RecyclerView recyclerView, int i, int i2) {
        }
    }

    public static abstract class RatingCompat {
        public abstract boolean read(int i, int i2);
    }

    public interface onAddQueueItem {
    }

    public static abstract class onPlayFromMediaId {
        public abstract View AudioAttributesCompatParcelizer();
    }

    public interface write {
        int RemoteActionCompatParcelizer();
    }

    public void AudioAttributesImplApi26Parcelizer(View view) {
    }

    public void MediaBrowserCompatSearchResultReceiver(View view) {
    }

    @Override // android.view.View
    public void scrollTo(int i, int i2) {
    }

    public static void setDebugAssertionsEnabled(boolean z) {
        AudioAttributesImplApi26Parcelizer = z;
    }

    public static void setVerboseLoggingEnabled(boolean z) {
        AudioAttributesImplBaseParcelizer = z;
    }

    public RecyclerView(Context context) {
        this(context, null);
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, accessgetTRUEcp.RemoteActionCompatParcelizer.recyclerViewStyle);
    }

    public RecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.accessonBackPresseds1027565324 = new onCommand();
        this.onRemoveQueueItemAt = new MediaDescriptionCompat();
        this.onSetRating = new UIntSerializer();
        this.onSetShuffleMode = new Runnable() { // from class: androidx.recyclerview.widget.RecyclerView.3
            @Override // java.lang.Runnable
            public final void run() {
                if (!RecyclerView.this.onCustomAction || RecyclerView.this.isLayoutRequested()) {
                    return;
                }
                if (!RecyclerView.this.handleMediaPlayPauseIfPendingOnHandler) {
                    RecyclerView.this.requestLayout();
                } else if (RecyclerView.this.onPlay) {
                    RecyclerView.this.onPrepare = true;
                } else {
                    RecyclerView.this.read();
                }
            }
        };
        this.onSetPlaybackSpeed = new Rect();
        this.getDefaultViewModelProviderFactory = new Rect();
        this.onSetRepeatMode = new RectF();
        this.onRewind = new ArrayList();
        this.onPause = new ArrayList<>();
        this.menuHostHelperlambda0 = new ArrayList<>();
        this.r8lambdaKUbBm7ckfqTc9QCgukC86fguu4 = 0;
        this.RatingCompat = false;
        this.PlaybackStateCompat = false;
        this._init_lambda4 = 0;
        this.MediaSessionCompatToken = 0;
        this.MediaSessionCompatQueueItem = onStop;
        this.onCommand = new RegexDeserializerdeserializeoptions1();
        this.addOnTrimMemoryListener = 0;
        this.getDefaultViewModelCreationExtras = -1;
        this.addOnNewIntentListener = Float.MIN_VALUE;
        this.addOnPictureInPictureModeChangedListener = Float.MIN_VALUE;
        this.getSavedStateRegistryControllerannotations = true;
        this.onSetCaptioningEnabled = new onFastForward();
        this.onPlayFromSearch = IconCompatParcelizer ? new SingletonSupport.read() : null;
        this.onPrepareFromUri = new MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
        this.onMediaButtonEvent = false;
        this.onFastForward = false;
        this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = new MediaBrowserCompatCustomActionResultReceiver();
        this.onPlayFromUri = false;
        this.addObserverForBackInvoker = new int[2];
        this.getActivityResultRegistry = new int[2];
        this.ensureViewModelStore = new int[2];
        this.onRemoveQueueItem = new int[2];
        this.onPrepareFromSearch = new ArrayList();
        this._init_lambda3 = new Runnable() { // from class: androidx.recyclerview.widget.RecyclerView.5
            @Override // java.lang.Runnable
            public final void run() {
                if (RecyclerView.this.onCommand != null) {
                    RecyclerView.this.onCommand.RemoteActionCompatParcelizer();
                }
                RecyclerView.this.onPlayFromUri = false;
            }
        };
        this._init_lambda2 = 0;
        this.r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0 = 0;
        this.getLifecycle = new UIntSerializer.AudioAttributesCompatParcelizer() { // from class: androidx.recyclerview.widget.RecyclerView.4
            @Override // o.UIntSerializer.AudioAttributesCompatParcelizer
            public final void RemoteActionCompatParcelizer(onMediaButtonEvent onmediabuttonevent, AudioAttributesImplApi26Parcelizer.write writeVar, AudioAttributesImplApi26Parcelizer.write writeVar2) {
                RecyclerView.this.onRemoveQueueItemAt.AudioAttributesCompatParcelizer(onmediabuttonevent);
                RecyclerView.this.AudioAttributesCompatParcelizer(onmediabuttonevent, writeVar, writeVar2);
            }

            @Override // o.UIntSerializer.AudioAttributesCompatParcelizer
            public final void read(onMediaButtonEvent onmediabuttonevent, AudioAttributesImplApi26Parcelizer.write writeVar, AudioAttributesImplApi26Parcelizer.write writeVar2) {
                RecyclerView.this.RemoteActionCompatParcelizer(onmediabuttonevent, writeVar, writeVar2);
            }

            @Override // o.UIntSerializer.AudioAttributesCompatParcelizer
            public final void AudioAttributesCompatParcelizer(onMediaButtonEvent onmediabuttonevent, AudioAttributesImplApi26Parcelizer.write writeVar, AudioAttributesImplApi26Parcelizer.write writeVar2) {
                onmediabuttonevent.setIsRecyclable(false);
                if (RecyclerView.this.RatingCompat) {
                    if (RecyclerView.this.onCommand.write(onmediabuttonevent, onmediabuttonevent, writeVar, writeVar2)) {
                        RecyclerView.this.handleMediaPlayPauseIfPendingOnHandler();
                    }
                } else if (RecyclerView.this.onCommand.write(onmediabuttonevent, writeVar, writeVar2)) {
                    RecyclerView.this.handleMediaPlayPauseIfPendingOnHandler();
                }
            }

            @Override // o.UIntSerializer.AudioAttributesCompatParcelizer
            public final void write(onMediaButtonEvent onmediabuttonevent) {
                RecyclerView.this.onPlayFromMediaId.AudioAttributesCompatParcelizer(onmediabuttonevent.itemView, RecyclerView.this.onRemoveQueueItemAt);
            }
        };
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.getLastCustomNonConfigurationInstance = viewConfiguration.getScaledTouchSlop();
        this.addOnNewIntentListener = getDeserializerForJavaNioFilePath.AudioAttributesCompatParcelizer(viewConfiguration, context);
        this.addOnPictureInPictureModeChangedListener = getDeserializerForJavaNioFilePath.RemoteActionCompatParcelizer(viewConfiguration, context);
        this.addObserverForBackInvokerlambda7 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.createFullyDrawnExecutor = viewConfiguration.getScaledMaximumFlingVelocity();
        this.addContentView = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        setWillNotDraw(getOverScrollMode() == 2);
        this.onCommand.RemoteActionCompatParcelizer(this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28);
        onSkipToPrevious();
        onPrepareFromMediaId();
        onPlayFromUri();
        if (InvalidTypeIdException.MediaBrowserCompatItemReceiver(this) == 0) {
            InvalidTypeIdException.AudioAttributesImplBaseParcelizer(this, 1);
        }
        this.setSessionImpl = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new UIntKeyDeserializer(this));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, accessgetTRUEcp.IconCompatParcelizer.RecyclerView, i, 0);
        InvalidTypeIdException.IconCompatParcelizer(this, context, accessgetTRUEcp.IconCompatParcelizer.RecyclerView, attributeSet, typedArrayObtainStyledAttributes, i, 0);
        String string = typedArrayObtainStyledAttributes.getString(accessgetTRUEcp.IconCompatParcelizer.RecyclerView_layoutManager);
        if (typedArrayObtainStyledAttributes.getInt(accessgetTRUEcp.IconCompatParcelizer.RecyclerView_android_descendantFocusability, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.MediaDescriptionCompat = typedArrayObtainStyledAttributes.getBoolean(accessgetTRUEcp.IconCompatParcelizer.RecyclerView_android_clipToPadding, true);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(accessgetTRUEcp.IconCompatParcelizer.RecyclerView_fastScrollEnabled, false);
        this.r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw = z;
        if (z) {
            IconCompatParcelizer((StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(accessgetTRUEcp.IconCompatParcelizer.RecyclerView_fastScrollVerticalThumbDrawable), typedArrayObtainStyledAttributes.getDrawable(accessgetTRUEcp.IconCompatParcelizer.RecyclerView_fastScrollVerticalTrackDrawable), (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(accessgetTRUEcp.IconCompatParcelizer.RecyclerView_fastScrollHorizontalThumbDrawable), typedArrayObtainStyledAttributes.getDrawable(accessgetTRUEcp.IconCompatParcelizer.RecyclerView_fastScrollHorizontalTrackDrawable));
        }
        typedArrayObtainStyledAttributes.recycle();
        AudioAttributesCompatParcelizer(context, string, attributeSet, i);
        int[] iArr = onSkipToPrevious;
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        InvalidTypeIdException.IconCompatParcelizer(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes2, i, 0);
        boolean z2 = typedArrayObtainStyledAttributes2.getBoolean(0, true);
        typedArrayObtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z2);
        createPrimordial.write((View) this);
    }

    final String write() {
        StringBuilder sb = new StringBuilder(" ");
        sb.append(super.toString());
        sb.append(", adapter:");
        sb.append(this.MediaBrowserCompatItemReceiver);
        sb.append(", layout:");
        sb.append(this.onPlayFromMediaId);
        sb.append(", context:");
        sb.append(getContext());
        return sb.toString();
    }

    private void onPlayFromUri() {
        if (InvalidTypeIdException.MediaMetadataCompat(this) == 0) {
            InvalidTypeIdException.MediaBrowserCompatCustomActionResultReceiver(this, 8);
        }
    }

    public void setAccessibilityDelegateCompat(UIntKeyDeserializer uIntKeyDeserializer) {
        this.AudioAttributesImplApi21Parcelizer = uIntKeyDeserializer;
        InvalidTypeIdException.AudioAttributesCompatParcelizer(this, uIntKeyDeserializer);
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    private void AudioAttributesCompatParcelizer(Context context, String str, AttributeSet attributeSet, int i) {
        ClassLoader classLoader;
        Constructor constructor;
        Object[] objArr;
        if (str != null) {
            String strTrim = str.trim();
            if (strTrim.isEmpty()) {
                return;
            }
            String strIconCompatParcelizer = IconCompatParcelizer(context, strTrim);
            try {
                if (isInEditMode()) {
                    classLoader = getClass().getClassLoader();
                } else {
                    classLoader = context.getClassLoader();
                }
                Class<? extends U> clsAsSubclass = Class.forName(strIconCompatParcelizer, false, classLoader).asSubclass(MediaBrowserCompatItemReceiver.class);
                try {
                    constructor = clsAsSubclass.getConstructor(onSkipToNext);
                    objArr = new Object[]{context, attributeSet, Integer.valueOf(i), 0};
                } catch (NoSuchMethodException e) {
                    try {
                        constructor = clsAsSubclass.getConstructor(new Class[0]);
                        objArr = null;
                    } catch (NoSuchMethodException e2) {
                        e2.initCause(e);
                        StringBuilder sb = new StringBuilder();
                        sb.append(attributeSet.getPositionDescription());
                        sb.append(": Error creating LayoutManager ");
                        sb.append(strIconCompatParcelizer);
                        throw new IllegalStateException(sb.toString(), e2);
                    }
                }
                constructor.setAccessible(true);
                setLayoutManager((MediaBrowserCompatItemReceiver) constructor.newInstance(objArr));
            } catch (ClassCastException e3) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(attributeSet.getPositionDescription());
                sb2.append(": Class is not a LayoutManager ");
                sb2.append(strIconCompatParcelizer);
                throw new IllegalStateException(sb2.toString(), e3);
            } catch (ClassNotFoundException e4) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(attributeSet.getPositionDescription());
                sb3.append(": Unable to find LayoutManager ");
                sb3.append(strIconCompatParcelizer);
                throw new IllegalStateException(sb3.toString(), e4);
            } catch (IllegalAccessException e5) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(attributeSet.getPositionDescription());
                sb4.append(": Cannot access non-public constructor ");
                sb4.append(strIconCompatParcelizer);
                throw new IllegalStateException(sb4.toString(), e5);
            } catch (InstantiationException e6) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(attributeSet.getPositionDescription());
                sb5.append(": Could not instantiate the LayoutManager: ");
                sb5.append(strIconCompatParcelizer);
                throw new IllegalStateException(sb5.toString(), e6);
            } catch (InvocationTargetException e7) {
                StringBuilder sb6 = new StringBuilder();
                sb6.append(attributeSet.getPositionDescription());
                sb6.append(": Could not instantiate the LayoutManager: ");
                sb6.append(strIconCompatParcelizer);
                throw new IllegalStateException(sb6.toString(), e7);
            }
        }
    }

    private static String IconCompatParcelizer(Context context, String str) {
        if (str.charAt(0) == '.') {
            StringBuilder sb = new StringBuilder();
            sb.append(context.getPackageName());
            sb.append(str);
            return sb.toString();
        }
        if (str.contains(".")) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(RecyclerView.class.getPackage().getName());
        sb2.append('.');
        sb2.append(str);
        return sb2.toString();
    }

    private void onPrepareFromMediaId() {
        this.MediaBrowserCompatSearchResultReceiver = new TypesKt(new TypesKt.IconCompatParcelizer() { // from class: androidx.recyclerview.widget.RecyclerView.1
            @Override // o.TypesKt.IconCompatParcelizer
            public final int AudioAttributesCompatParcelizer() {
                return RecyclerView.this.getChildCount();
            }

            @Override // o.TypesKt.IconCompatParcelizer
            public final void AudioAttributesCompatParcelizer(View view, int i) {
                RecyclerView.this.addView(view, i);
                RecyclerView.this.read(view);
            }

            @Override // o.TypesKt.IconCompatParcelizer
            public final int read(View view) {
                return RecyclerView.this.indexOfChild(view);
            }

            @Override // o.TypesKt.IconCompatParcelizer
            public final void write(int i) {
                View childAt = RecyclerView.this.getChildAt(i);
                if (childAt != null) {
                    RecyclerView.this.RemoteActionCompatParcelizer(childAt);
                    childAt.clearAnimation();
                }
                RecyclerView.this.removeViewAt(i);
            }

            @Override // o.TypesKt.IconCompatParcelizer
            public final View IconCompatParcelizer(int i) {
                return RecyclerView.this.getChildAt(i);
            }

            @Override // o.TypesKt.IconCompatParcelizer
            public final void RemoteActionCompatParcelizer() {
                int iAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer();
                for (int i = 0; i < iAudioAttributesCompatParcelizer; i++) {
                    View viewIconCompatParcelizer = IconCompatParcelizer(i);
                    RecyclerView.this.RemoteActionCompatParcelizer(viewIconCompatParcelizer);
                    viewIconCompatParcelizer.clearAnimation();
                }
                RecyclerView.this.removeAllViews();
            }

            @Override // o.TypesKt.IconCompatParcelizer
            public final onMediaButtonEvent RemoteActionCompatParcelizer(View view) {
                return RecyclerView.IconCompatParcelizer(view);
            }

            @Override // o.TypesKt.IconCompatParcelizer
            public final void IconCompatParcelizer(View view, int i, ViewGroup.LayoutParams layoutParams) {
                onMediaButtonEvent onmediabuttoneventIconCompatParcelizer = RecyclerView.IconCompatParcelizer(view);
                if (onmediabuttoneventIconCompatParcelizer != null) {
                    if (!onmediabuttoneventIconCompatParcelizer.isTmpDetached() && !onmediabuttoneventIconCompatParcelizer.shouldIgnore()) {
                        StringBuilder sb = new StringBuilder("Called attach on a child which is not detached: ");
                        sb.append(onmediabuttoneventIconCompatParcelizer);
                        sb.append(RecyclerView.this.write());
                        throw new IllegalArgumentException(sb.toString());
                    }
                    if (RecyclerView.AudioAttributesImplBaseParcelizer) {
                        Objects.toString(onmediabuttoneventIconCompatParcelizer);
                    }
                    onmediabuttoneventIconCompatParcelizer.clearTmpDetachFlag();
                } else if (RecyclerView.AudioAttributesImplApi26Parcelizer) {
                    StringBuilder sb2 = new StringBuilder("No ViewHolder found for child: ");
                    sb2.append(view);
                    sb2.append(", index: ");
                    sb2.append(i);
                    sb2.append(RecyclerView.this.write());
                    throw new IllegalArgumentException(sb2.toString());
                }
                RecyclerView.this.attachViewToParent(view, i, layoutParams);
            }

            @Override // o.TypesKt.IconCompatParcelizer
            public final void AudioAttributesCompatParcelizer(int i) {
                View viewIconCompatParcelizer = IconCompatParcelizer(i);
                if (viewIconCompatParcelizer != null) {
                    onMediaButtonEvent onmediabuttoneventIconCompatParcelizer = RecyclerView.IconCompatParcelizer(viewIconCompatParcelizer);
                    if (onmediabuttoneventIconCompatParcelizer != null) {
                        if (onmediabuttoneventIconCompatParcelizer.isTmpDetached() && !onmediabuttoneventIconCompatParcelizer.shouldIgnore()) {
                            StringBuilder sb = new StringBuilder("called detach on an already detached child ");
                            sb.append(onmediabuttoneventIconCompatParcelizer);
                            sb.append(RecyclerView.this.write());
                            throw new IllegalArgumentException(sb.toString());
                        }
                        if (RecyclerView.AudioAttributesImplBaseParcelizer) {
                            Objects.toString(onmediabuttoneventIconCompatParcelizer);
                        }
                        onmediabuttoneventIconCompatParcelizer.addFlags(256);
                    }
                } else if (RecyclerView.AudioAttributesImplApi26Parcelizer) {
                    StringBuilder sb2 = new StringBuilder("No view at offset ");
                    sb2.append(i);
                    sb2.append(RecyclerView.this.write());
                    throw new IllegalArgumentException(sb2.toString());
                }
                RecyclerView.this.detachViewFromParent(i);
            }

            @Override // o.TypesKt.IconCompatParcelizer
            public final void AudioAttributesCompatParcelizer(View view) {
                onMediaButtonEvent onmediabuttoneventIconCompatParcelizer = RecyclerView.IconCompatParcelizer(view);
                if (onmediabuttoneventIconCompatParcelizer != null) {
                    onmediabuttoneventIconCompatParcelizer.onEnteredHiddenState(RecyclerView.this);
                }
            }

            @Override // o.TypesKt.IconCompatParcelizer
            public final void write(View view) {
                onMediaButtonEvent onmediabuttoneventIconCompatParcelizer = RecyclerView.IconCompatParcelizer(view);
                if (onmediabuttoneventIconCompatParcelizer != null) {
                    onmediabuttoneventIconCompatParcelizer.onLeftHiddenState(RecyclerView.this);
                }
            }
        });
    }

    private void onSkipToPrevious() {
        this.MediaMetadataCompat = new RegexDeserializer(new RegexDeserializer.read() { // from class: androidx.recyclerview.widget.RecyclerView.8
            @Override // o.RegexDeserializer.read
            public final onMediaButtonEvent RemoteActionCompatParcelizer(int i) {
                onMediaButtonEvent onmediabuttoneventWrite = RecyclerView.this.write(i, true);
                if (onmediabuttoneventWrite == null) {
                    return null;
                }
                if (!RecyclerView.this.MediaBrowserCompatSearchResultReceiver.IconCompatParcelizer(onmediabuttoneventWrite.itemView)) {
                    return onmediabuttoneventWrite;
                }
                boolean z = RecyclerView.AudioAttributesImplBaseParcelizer;
                return null;
            }

            @Override // o.RegexDeserializer.read
            public final void RemoteActionCompatParcelizer(int i, int i2) {
                RecyclerView.this.read(i, i2, true);
                RecyclerView.this.onMediaButtonEvent = true;
                RecyclerView.this.onPrepareFromUri.AudioAttributesCompatParcelizer += i2;
            }

            @Override // o.RegexDeserializer.read
            public final void AudioAttributesCompatParcelizer(int i, int i2) {
                RecyclerView.this.read(i, i2, false);
                RecyclerView.this.onMediaButtonEvent = true;
            }

            @Override // o.RegexDeserializer.read
            public final void RemoteActionCompatParcelizer(int i, int i2, Object obj) {
                RecyclerView.this.IconCompatParcelizer(i, i2, obj);
                RecyclerView.this.onFastForward = true;
            }

            @Override // o.RegexDeserializer.read
            public final void read(RegexDeserializer.IconCompatParcelizer iconCompatParcelizer) {
                IconCompatParcelizer(iconCompatParcelizer);
            }

            private void IconCompatParcelizer(RegexDeserializer.IconCompatParcelizer iconCompatParcelizer) {
                int i = iconCompatParcelizer.read;
                if (i == 1) {
                    RecyclerView.this.onPlayFromMediaId.RemoteActionCompatParcelizer(RecyclerView.this, iconCompatParcelizer.RemoteActionCompatParcelizer, iconCompatParcelizer.write);
                    return;
                }
                if (i == 2) {
                    RecyclerView.this.onPlayFromMediaId.AudioAttributesCompatParcelizer(RecyclerView.this, iconCompatParcelizer.RemoteActionCompatParcelizer, iconCompatParcelizer.write);
                } else if (i == 4) {
                    RecyclerView.this.onPlayFromMediaId.write(RecyclerView.this, iconCompatParcelizer.RemoteActionCompatParcelizer, iconCompatParcelizer.write, iconCompatParcelizer.AudioAttributesCompatParcelizer);
                } else {
                    if (i != 8) {
                        return;
                    }
                    RecyclerView.this.onPlayFromMediaId.IconCompatParcelizer(RecyclerView.this, iconCompatParcelizer.RemoteActionCompatParcelizer, iconCompatParcelizer.write, 1);
                }
            }

            @Override // o.RegexDeserializer.read
            public final void RemoteActionCompatParcelizer(RegexDeserializer.IconCompatParcelizer iconCompatParcelizer) {
                IconCompatParcelizer(iconCompatParcelizer);
            }

            @Override // o.RegexDeserializer.read
            public final void read(int i, int i2) {
                RecyclerView.this.read(i, i2);
                RecyclerView.this.onMediaButtonEvent = true;
            }

            @Override // o.RegexDeserializer.read
            public final void write(int i, int i2) {
                RecyclerView.this.AudioAttributesImplBaseParcelizer(i, i2);
                RecyclerView.this.onMediaButtonEvent = true;
            }
        });
    }

    public void setHasFixedSize(boolean z) {
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = z;
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z) {
        if (z != this.MediaDescriptionCompat) {
            setSessionImpl();
        }
        this.MediaDescriptionCompat = z;
        super.setClipToPadding(z);
        if (this.onCustomAction) {
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.MediaDescriptionCompat;
    }

    public void setScrollingTouchSlop(int i) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i == 0 || i != 1) {
            this.getLastCustomNonConfigurationInstance = viewConfiguration.getScaledTouchSlop();
        } else {
            this.getLastCustomNonConfigurationInstance = viewConfiguration.getScaledPagingTouchSlop();
        }
    }

    public void IconCompatParcelizer(IconCompatParcelizer iconCompatParcelizer, boolean z) {
        setLayoutFrozen(false);
        read((IconCompatParcelizer<?>) iconCompatParcelizer, true, z);
        IconCompatParcelizer(true);
        requestLayout();
    }

    public void setAdapter(IconCompatParcelizer iconCompatParcelizer) {
        setLayoutFrozen(false);
        read((IconCompatParcelizer<?>) iconCompatParcelizer, false, true);
        IconCompatParcelizer(false);
        requestLayout();
    }

    public final void onAddQueueItem() {
        AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer = this.onCommand;
        if (audioAttributesImplApi26Parcelizer != null) {
            audioAttributesImplApi26Parcelizer.write();
        }
        MediaBrowserCompatItemReceiver mediaBrowserCompatItemReceiver = this.onPlayFromMediaId;
        if (mediaBrowserCompatItemReceiver != null) {
            mediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer(this.onRemoveQueueItemAt);
            this.onPlayFromMediaId.read(this.onRemoveQueueItemAt);
        }
        this.onRemoveQueueItemAt.write();
    }

    private void read(IconCompatParcelizer<?> iconCompatParcelizer, boolean z, boolean z2) {
        IconCompatParcelizer iconCompatParcelizer2 = this.MediaBrowserCompatItemReceiver;
        if (iconCompatParcelizer2 != null) {
            iconCompatParcelizer2.unregisterAdapterDataObserver(this.accessonBackPresseds1027565324);
            this.MediaBrowserCompatItemReceiver.onDetachedFromRecyclerView(this);
        }
        if (!z || z2) {
            onAddQueueItem();
        }
        this.MediaMetadataCompat.MediaBrowserCompatItemReceiver();
        IconCompatParcelizer<?> iconCompatParcelizer3 = this.MediaBrowserCompatItemReceiver;
        this.MediaBrowserCompatItemReceiver = iconCompatParcelizer;
        if (iconCompatParcelizer != null) {
            iconCompatParcelizer.registerAdapterDataObserver(this.accessonBackPresseds1027565324);
            iconCompatParcelizer.onAttachedToRecyclerView(this);
        }
        MediaBrowserCompatItemReceiver mediaBrowserCompatItemReceiver = this.onPlayFromMediaId;
        if (mediaBrowserCompatItemReceiver != null) {
            mediaBrowserCompatItemReceiver.IconCompatParcelizer(iconCompatParcelizer3, this.MediaBrowserCompatItemReceiver);
        }
        this.onRemoveQueueItemAt.RemoteActionCompatParcelizer(iconCompatParcelizer3, this.MediaBrowserCompatItemReceiver, z);
        this.onPrepareFromUri.RatingCompat = true;
    }

    public final IconCompatParcelizer IconCompatParcelizer() {
        return this.MediaBrowserCompatItemReceiver;
    }

    @Deprecated
    public void setRecyclerListener(onAddQueueItem onaddqueueitem) {
        this.onSeekTo = onaddqueueitem;
    }

    @Override // android.view.View
    public int getBaseline() {
        if (this.onPlayFromMediaId != null) {
            return MediaBrowserCompatItemReceiver.onCustomAction();
        }
        return super.getBaseline();
    }

    public final void read(AudioAttributesImplApi21Parcelizer audioAttributesImplApi21Parcelizer) {
        if (this.getOnBackPressedDispatcherannotations == null) {
            this.getOnBackPressedDispatcherannotations = new ArrayList();
        }
        this.getOnBackPressedDispatcherannotations.add(audioAttributesImplApi21Parcelizer);
    }

    public final void write(AudioAttributesImplApi21Parcelizer audioAttributesImplApi21Parcelizer) {
        List<AudioAttributesImplApi21Parcelizer> list = this.getOnBackPressedDispatcherannotations;
        if (list == null) {
            return;
        }
        list.remove(audioAttributesImplApi21Parcelizer);
    }

    public void setLayoutManager(MediaBrowserCompatItemReceiver mediaBrowserCompatItemReceiver) {
        if (mediaBrowserCompatItemReceiver == this.onPlayFromMediaId) {
            return;
        }
        ResultReceiver();
        if (this.onPlayFromMediaId != null) {
            AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer = this.onCommand;
            if (audioAttributesImplApi26Parcelizer != null) {
                audioAttributesImplApi26Parcelizer.write();
            }
            this.onPlayFromMediaId.RemoteActionCompatParcelizer(this.onRemoveQueueItemAt);
            this.onPlayFromMediaId.read(this.onRemoveQueueItemAt);
            this.onRemoveQueueItemAt.write();
            if (this.handleMediaPlayPauseIfPendingOnHandler) {
                this.onPlayFromMediaId.RemoteActionCompatParcelizer(this, this.onRemoveQueueItemAt);
            }
            this.onPlayFromMediaId.read((RecyclerView) null);
            this.onPlayFromMediaId = null;
        } else {
            this.onRemoveQueueItemAt.write();
        }
        this.MediaBrowserCompatSearchResultReceiver.AudioAttributesCompatParcelizer();
        this.onPlayFromMediaId = mediaBrowserCompatItemReceiver;
        if (mediaBrowserCompatItemReceiver != null) {
            if (mediaBrowserCompatItemReceiver.MediaBrowserCompatMediaItem != null) {
                StringBuilder sb = new StringBuilder("LayoutManager ");
                sb.append(mediaBrowserCompatItemReceiver);
                sb.append(" is already attached to a RecyclerView:");
                sb.append(mediaBrowserCompatItemReceiver.MediaBrowserCompatMediaItem.write());
                throw new IllegalArgumentException(sb.toString());
            }
            this.onPlayFromMediaId.read(this);
            if (this.handleMediaPlayPauseIfPendingOnHandler) {
                this.onPlayFromMediaId.RemoteActionCompatParcelizer(this);
            }
        }
        this.onRemoveQueueItemAt.RatingCompat();
        requestLayout();
    }

    public void setOnFlingListener(RatingCompat ratingCompat) {
        this.addMenuProvider = ratingCompat;
    }

    public final RatingCompat MediaBrowserCompatCustomActionResultReceiver() {
        return this.addMenuProvider;
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SavedState savedState2 = this.onPrepareFromMediaId;
        if (savedState2 != null) {
            savedState.write(savedState2);
            return savedState;
        }
        MediaBrowserCompatItemReceiver mediaBrowserCompatItemReceiver = this.onPlayFromMediaId;
        if (mediaBrowserCompatItemReceiver != null) {
            savedState.read = mediaBrowserCompatItemReceiver.onAddQueueItem();
            return savedState;
        }
        savedState.read = null;
        return savedState;
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        this.onPrepareFromMediaId = savedState;
        super.onRestoreInstanceState(savedState.read());
        requestLayout();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    private void IconCompatParcelizer(onMediaButtonEvent onmediabuttonevent) {
        View view = onmediabuttonevent.itemView;
        boolean z = view.getParent() == this;
        this.onRemoveQueueItemAt.AudioAttributesCompatParcelizer(MediaBrowserCompatCustomActionResultReceiver(view));
        if (onmediabuttonevent.isTmpDetached()) {
            this.MediaBrowserCompatSearchResultReceiver.AudioAttributesCompatParcelizer(view, -1, view.getLayoutParams(), true);
        } else if (!z) {
            this.MediaBrowserCompatSearchResultReceiver.RemoteActionCompatParcelizer(view);
        } else {
            this.MediaBrowserCompatSearchResultReceiver.AudioAttributesCompatParcelizer(view);
        }
    }

    final boolean MediaBrowserCompatMediaItem(View view) {
        r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw();
        boolean zAudioAttributesImplApi26Parcelizer = this.MediaBrowserCompatSearchResultReceiver.AudioAttributesImplApi26Parcelizer(view);
        if (zAudioAttributesImplApi26Parcelizer) {
            onMediaButtonEvent onmediabuttoneventIconCompatParcelizer = IconCompatParcelizer(view);
            this.onRemoveQueueItemAt.AudioAttributesCompatParcelizer(onmediabuttoneventIconCompatParcelizer);
            this.onRemoveQueueItemAt.read(onmediabuttoneventIconCompatParcelizer);
            if (AudioAttributesImplBaseParcelizer) {
                Objects.toString(view);
                toString();
            }
        }
        read(!zAudioAttributesImplApi26Parcelizer);
        return zAudioAttributesImplApi26Parcelizer;
    }

    public final MediaBrowserCompatItemReceiver AudioAttributesImplApi21Parcelizer() {
        return this.onPlayFromMediaId;
    }

    public final MediaMetadataCompat AudioAttributesImplBaseParcelizer() {
        return this.onRemoveQueueItemAt.RemoteActionCompatParcelizer();
    }

    public void setRecycledViewPool(MediaMetadataCompat mediaMetadataCompat) {
        this.onRemoveQueueItemAt.AudioAttributesCompatParcelizer(mediaMetadataCompat);
    }

    public void setViewCacheExtension(onPlayFromMediaId onplayfrommediaid) {
        this.onRemoveQueueItemAt.read(onplayfrommediaid);
    }

    public void setItemViewCacheSize(int i) {
        this.onRemoveQueueItemAt.write(i);
    }

    public final int RatingCompat() {
        return this.addOnTrimMemoryListener;
    }

    final void MediaBrowserCompatItemReceiver(int i) {
        if (i == this.addOnTrimMemoryListener) {
            return;
        }
        this.addOnTrimMemoryListener = i;
        if (i != 2) {
            onRewind();
        }
        MediaMetadataCompat(i);
    }

    private void read(AudioAttributesImplBaseParcelizer audioAttributesImplBaseParcelizer) {
        MediaBrowserCompatItemReceiver mediaBrowserCompatItemReceiver = this.onPlayFromMediaId;
        if (mediaBrowserCompatItemReceiver != null) {
            mediaBrowserCompatItemReceiver.IconCompatParcelizer("Cannot add item decoration during a scroll  or layout");
        }
        if (this.onPause.isEmpty()) {
            setWillNotDraw(false);
        }
        this.onPause.add(audioAttributesImplBaseParcelizer);
        MediaSessionCompatToken();
        requestLayout();
    }

    public final void AudioAttributesCompatParcelizer(AudioAttributesImplBaseParcelizer audioAttributesImplBaseParcelizer) {
        read(audioAttributesImplBaseParcelizer);
    }

    public final AudioAttributesImplBaseParcelizer AudioAttributesCompatParcelizer() {
        int iOnSkipToQueueItem = onSkipToQueueItem();
        if (iOnSkipToQueueItem <= 0) {
            StringBuilder sb = new StringBuilder("0 is an invalid index for size ");
            sb.append(iOnSkipToQueueItem);
            throw new IndexOutOfBoundsException(sb.toString());
        }
        return this.onPause.get(0);
    }

    private int onSkipToQueueItem() {
        return this.onPause.size();
    }

    public final void RemoteActionCompatParcelizer(AudioAttributesImplBaseParcelizer audioAttributesImplBaseParcelizer) {
        MediaBrowserCompatItemReceiver mediaBrowserCompatItemReceiver = this.onPlayFromMediaId;
        if (mediaBrowserCompatItemReceiver != null) {
            mediaBrowserCompatItemReceiver.IconCompatParcelizer("Cannot remove item decoration during a scroll  or layout");
        }
        this.onPause.remove(audioAttributesImplBaseParcelizer);
        if (this.onPause.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        MediaSessionCompatToken();
        requestLayout();
    }

    public void setChildDrawingOrderCallback(write writeVar) {
        if (writeVar == this.ParcelableVolumeInfo) {
            return;
        }
        this.ParcelableVolumeInfo = writeVar;
        setChildrenDrawingOrderEnabled(writeVar != null);
    }

    @Deprecated
    public void setOnScrollListener(MediaBrowserCompatSearchResultReceiver mediaBrowserCompatSearchResultReceiver) {
        this.addOnConfigurationChangedListener = mediaBrowserCompatSearchResultReceiver;
    }

    public final void RemoteActionCompatParcelizer(MediaBrowserCompatSearchResultReceiver mediaBrowserCompatSearchResultReceiver) {
        if (this.addOnContextAvailableListener == null) {
            this.addOnContextAvailableListener = new ArrayList();
        }
        this.addOnContextAvailableListener.add(mediaBrowserCompatSearchResultReceiver);
    }

    public final void write(MediaBrowserCompatSearchResultReceiver mediaBrowserCompatSearchResultReceiver) {
        List<MediaBrowserCompatSearchResultReceiver> list = this.addOnContextAvailableListener;
        if (list != null) {
            list.remove(mediaBrowserCompatSearchResultReceiver);
        }
    }

    public final void AudioAttributesImplApi21Parcelizer(int i) {
        if (this.onPlay) {
            return;
        }
        ResultReceiver();
        MediaBrowserCompatItemReceiver mediaBrowserCompatItemReceiver = this.onPlayFromMediaId;
        if (mediaBrowserCompatItemReceiver == null) {
            return;
        }
        mediaBrowserCompatItemReceiver.read(i);
        awakenScrollBars();
    }

    final void write(int i) {
        if (this.onPlayFromMediaId == null) {
            return;
        }
        MediaBrowserCompatItemReceiver(2);
        this.onPlayFromMediaId.read(i);
        awakenScrollBars();
    }

    public final void AudioAttributesImplBaseParcelizer(int i) {
        MediaBrowserCompatItemReceiver mediaBrowserCompatItemReceiver;
        if (this.onPlay || (mediaBrowserCompatItemReceiver = this.onPlayFromMediaId) == null) {
            return;
        }
        mediaBrowserCompatItemReceiver.AudioAttributesCompatParcelizer(this, i);
    }

    @Override // android.view.View
    public void scrollBy(int i, int i2) {
        MediaBrowserCompatItemReceiver mediaBrowserCompatItemReceiver = this.onPlayFromMediaId;
        if (mediaBrowserCompatItemReceiver == null || this.onPlay) {
            return;
        }
        boolean zAudioAttributesImplApi26Parcelizer = mediaBrowserCompatItemReceiver.AudioAttributesImplApi26Parcelizer();
        boolean zAudioAttributesImplApi21Parcelizer = this.onPlayFromMediaId.AudioAttributesImplApi21Parcelizer();
        if (zAudioAttributesImplApi26Parcelizer || zAudioAttributesImplApi21Parcelizer) {
            if (!zAudioAttributesImplApi26Parcelizer) {
                i = 0;
            }
            if (!zAudioAttributesImplApi21Parcelizer) {
                i2 = 0;
            }
            write(i, i2, (MotionEvent) null, 0);
        }
    }

    private void AudioAttributesCompatParcelizer(int i, int i2, MotionEvent motionEvent) {
        MediaBrowserCompatItemReceiver mediaBrowserCompatItemReceiver = this.onPlayFromMediaId;
        if (mediaBrowserCompatItemReceiver == null || this.onPlay) {
            return;
        }
        int[] iArr = this.onRemoveQueueItem;
        iArr[0] = 0;
        iArr[1] = 0;
        boolean zAudioAttributesImplApi26Parcelizer = mediaBrowserCompatItemReceiver.AudioAttributesImplApi26Parcelizer();
        boolean zAudioAttributesImplApi21Parcelizer = this.onPlayFromMediaId.AudioAttributesImplApi21Parcelizer();
        int i3 = zAudioAttributesImplApi21Parcelizer ? (zAudioAttributesImplApi26Parcelizer ? 1 : 0) | 2 : zAudioAttributesImplApi26Parcelizer ? 1 : 0;
        float height = motionEvent == null ? getHeight() / 2.0f : motionEvent.getY();
        float width = motionEvent == null ? getWidth() / 2.0f : motionEvent.getX();
        int i4 = i - read(i, height);
        int iWrite = i2 - write(i2, width);
        MediaBrowserCompatMediaItem(i3, 1);
        if (write(zAudioAttributesImplApi26Parcelizer ? i4 : 0, zAudioAttributesImplApi21Parcelizer ? iWrite : 0, this.onRemoveQueueItem, this.getActivityResultRegistry, 1)) {
            int[] iArr2 = this.onRemoveQueueItem;
            i4 -= iArr2[0];
            iWrite -= iArr2[1];
        }
        write(zAudioAttributesImplApi26Parcelizer ? i4 : 0, zAudioAttributesImplApi21Parcelizer ? iWrite : 0, motionEvent, 1);
        SingletonSupport singletonSupport = this.onAddQueueItem;
        if (singletonSupport != null && (i4 != 0 || iWrite != 0)) {
            singletonSupport.AudioAttributesCompatParcelizer(this, i4, iWrite);
        }
        MediaBrowserCompatCustomActionResultReceiver(1);
    }

    final void AudioAttributesCompatParcelizer(int i, int i2, int[] iArr) {
        r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw();
        MediaMetadataCompat();
        constructDelegatingKeyDeserializer.read("RV Scroll");
        write(this.onPrepareFromUri);
        int i3 = i != 0 ? this.onPlayFromMediaId.read(i, this.onRemoveQueueItemAt, this.onPrepareFromUri) : 0;
        int iRemoteActionCompatParcelizer = i2 != 0 ? this.onPlayFromMediaId.RemoteActionCompatParcelizer(i2, this.onRemoveQueueItemAt, this.onPrepareFromUri) : 0;
        constructDelegatingKeyDeserializer.RemoteActionCompatParcelizer();
        ParcelableVolumeInfo();
        MediaSessionCompatQueueItem();
        read(false);
        if (iArr != null) {
            iArr[0] = i3;
            iArr[1] = iRemoteActionCompatParcelizer;
        }
    }

    final void read() {
        if (!this.onCustomAction || this.RatingCompat) {
            constructDelegatingKeyDeserializer.read("RV FullInvalidate");
            onSetRating();
            constructDelegatingKeyDeserializer.RemoteActionCompatParcelizer();
            return;
        }
        if (this.MediaMetadataCompat.read()) {
            if (this.MediaMetadataCompat.read(4) && !this.MediaMetadataCompat.read(11)) {
                constructDelegatingKeyDeserializer.read("RV PartialInvalidate");
                r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw();
                MediaMetadataCompat();
                this.MediaMetadataCompat.RemoteActionCompatParcelizer();
                if (!this.onPrepare) {
                    if (onPlay()) {
                        onSetRating();
                    } else {
                        this.MediaMetadataCompat.IconCompatParcelizer();
                    }
                }
                read(true);
                MediaSessionCompatQueueItem();
                constructDelegatingKeyDeserializer.RemoteActionCompatParcelizer();
                return;
            }
            if (this.MediaMetadataCompat.read()) {
                constructDelegatingKeyDeserializer.read("RV FullInvalidate");
                onSetRating();
                constructDelegatingKeyDeserializer.RemoteActionCompatParcelizer();
            }
        }
    }

    private boolean onPlay() {
        int i = this.MediaBrowserCompatSearchResultReceiver.read();
        for (int i2 = 0; i2 < i; i2++) {
            onMediaButtonEvent onmediabuttoneventIconCompatParcelizer = IconCompatParcelizer(this.MediaBrowserCompatSearchResultReceiver.read(i2));
            if (onmediabuttoneventIconCompatParcelizer != null && !onmediabuttoneventIconCompatParcelizer.shouldIgnore() && onmediabuttoneventIconCompatParcelizer.isUpdated()) {
                return true;
            }
        }
        return false;
    }

    private boolean write(int i, int i2, MotionEvent motionEvent, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        read();
        if (this.MediaBrowserCompatItemReceiver != null) {
            int[] iArr = this.onRemoveQueueItem;
            iArr[0] = 0;
            iArr[1] = 0;
            AudioAttributesCompatParcelizer(i, i2, iArr);
            int[] iArr2 = this.onRemoveQueueItem;
            int i8 = iArr2[0];
            int i9 = iArr2[1];
            i4 = i9;
            i5 = i8;
            i6 = i - i8;
            i7 = i2 - i9;
        } else {
            i4 = 0;
            i5 = 0;
            i6 = 0;
            i7 = 0;
        }
        if (!this.onPause.isEmpty()) {
            invalidate();
        }
        int[] iArr3 = this.onRemoveQueueItem;
        iArr3[0] = 0;
        iArr3[1] = 0;
        write(i5, i4, i6, i7, this.getActivityResultRegistry, i3, iArr3);
        int[] iArr4 = this.onRemoveQueueItem;
        boolean z = (iArr4[0] == 0 && iArr4[1] == 0) ? false : true;
        int i10 = this.accessaddObserverForBackInvoker;
        int[] iArr5 = this.getActivityResultRegistry;
        int i11 = iArr5[0];
        this.accessaddObserverForBackInvoker = i10 - i11;
        int i12 = this.accessgetReportFullyDrawnExecutorp;
        int i13 = iArr5[1];
        this.accessgetReportFullyDrawnExecutorp = i12 - i13;
        int[] iArr6 = this.ensureViewModelStore;
        iArr6[0] = iArr6[0] + i11;
        iArr6[1] = iArr6[1] + i13;
        if (getOverScrollMode() != 2) {
            if (motionEvent != null && !emptyList.IconCompatParcelizer(motionEvent, 8194)) {
                RemoteActionCompatParcelizer(motionEvent.getX(), i6 - r1, motionEvent.getY(), i7 - r0);
            }
            RemoteActionCompatParcelizer(i, i2);
        }
        if (i5 != 0 || i4 != 0) {
            write(i5, i4);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return (!z && i5 == 0 && i4 == 0) ? false : true;
    }

    private int read(int i, float f) {
        float height = f / getHeight();
        float width = i / getWidth();
        EdgeEffect edgeEffect = this.accessensureViewModelStore;
        float f2 = BitmapDescriptorFactory.HUE_RED;
        if (edgeEffect != null && memberMethods.write(edgeEffect) != BitmapDescriptorFactory.HUE_RED) {
            if (canScrollHorizontally(-1)) {
                this.accessensureViewModelStore.onRelease();
            } else {
                float f3 = -memberMethods.read(this.accessensureViewModelStore, -width, 1.0f - height);
                if (memberMethods.write(this.accessensureViewModelStore) == BitmapDescriptorFactory.HUE_RED) {
                    this.accessensureViewModelStore.onRelease();
                }
                f2 = f3;
            }
            invalidate();
        } else {
            EdgeEffect edgeEffect2 = this.addOnMultiWindowModeChangedListener;
            if (edgeEffect2 != null && memberMethods.write(edgeEffect2) != BitmapDescriptorFactory.HUE_RED) {
                if (canScrollHorizontally(1)) {
                    this.addOnMultiWindowModeChangedListener.onRelease();
                } else {
                    float f4 = memberMethods.read(this.addOnMultiWindowModeChangedListener, width, height);
                    if (memberMethods.write(this.addOnMultiWindowModeChangedListener) == BitmapDescriptorFactory.HUE_RED) {
                        this.addOnMultiWindowModeChangedListener.onRelease();
                    }
                    f2 = f4;
                }
                invalidate();
            }
        }
        return Math.round(f2 * getWidth());
    }

    private int write(int i, float f) {
        float width = f / getWidth();
        float height = i / getHeight();
        EdgeEffect edgeEffect = this.getFullyDrawnReporter;
        float f2 = BitmapDescriptorFactory.HUE_RED;
        if (edgeEffect != null && memberMethods.write(edgeEffect) != BitmapDescriptorFactory.HUE_RED) {
            if (canScrollVertically(-1)) {
                this.getFullyDrawnReporter.onRelease();
            } else {
                float f3 = -memberMethods.read(this.getFullyDrawnReporter, -height, width);
                if (memberMethods.write(this.getFullyDrawnReporter) == BitmapDescriptorFactory.HUE_RED) {
                    this.getFullyDrawnReporter.onRelease();
                }
                f2 = f3;
            }
            invalidate();
        } else {
            EdgeEffect edgeEffect2 = this.onSkipToQueueItem;
            if (edgeEffect2 != null && memberMethods.write(edgeEffect2) != BitmapDescriptorFactory.HUE_RED) {
                if (canScrollVertically(1)) {
                    this.onSkipToQueueItem.onRelease();
                } else {
                    float f4 = memberMethods.read(this.onSkipToQueueItem, height, 1.0f - width);
                    if (memberMethods.write(this.onSkipToQueueItem) == BitmapDescriptorFactory.HUE_RED) {
                        this.onSkipToQueueItem.onRelease();
                    }
                    f2 = f4;
                }
                invalidate();
            }
        }
        return Math.round(f2 * getHeight());
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
        MediaBrowserCompatItemReceiver mediaBrowserCompatItemReceiver = this.onPlayFromMediaId;
        if (mediaBrowserCompatItemReceiver != null && mediaBrowserCompatItemReceiver.AudioAttributesImplApi26Parcelizer()) {
            return this.onPlayFromMediaId.AudioAttributesCompatParcelizer(this.onPrepareFromUri);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeHorizontalScrollExtent() {
        MediaBrowserCompatItemReceiver mediaBrowserCompatItemReceiver = this.onPlayFromMediaId;
        if (mediaBrowserCompatItemReceiver != null && mediaBrowserCompatItemReceiver.AudioAttributesImplApi26Parcelizer()) {
            return this.onPlayFromMediaId.MediaBrowserCompatItemReceiver(this.onPrepareFromUri);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
        MediaBrowserCompatItemReceiver mediaBrowserCompatItemReceiver = this.onPlayFromMediaId;
        if (mediaBrowserCompatItemReceiver != null && mediaBrowserCompatItemReceiver.AudioAttributesImplApi26Parcelizer()) {
            return this.onPlayFromMediaId.IconCompatParcelizer(this.onPrepareFromUri);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
        MediaBrowserCompatItemReceiver mediaBrowserCompatItemReceiver = this.onPlayFromMediaId;
        if (mediaBrowserCompatItemReceiver != null && mediaBrowserCompatItemReceiver.AudioAttributesImplApi21Parcelizer()) {
            return this.onPlayFromMediaId.RemoteActionCompatParcelizer(this.onPrepareFromUri);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        MediaBrowserCompatItemReceiver mediaBrowserCompatItemReceiver = this.onPlayFromMediaId;
        if (mediaBrowserCompatItemReceiver != null && mediaBrowserCompatItemReceiver.AudioAttributesImplApi21Parcelizer()) {
            return this.onPlayFromMediaId.AudioAttributesImplBaseParcelizer(this.onPrepareFromUri);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        MediaBrowserCompatItemReceiver mediaBrowserCompatItemReceiver = this.onPlayFromMediaId;
        if (mediaBrowserCompatItemReceiver != null && mediaBrowserCompatItemReceiver.AudioAttributesImplApi21Parcelizer()) {
            return this.onPlayFromMediaId.read(this.onPrepareFromUri);
        }
        return 0;
    }

    private void r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw() {
        int i = this.r8lambdaKUbBm7ckfqTc9QCgukC86fguu4 + 1;
        this.r8lambdaKUbBm7ckfqTc9QCgukC86fguu4 = i;
        if (i != 1 || this.onPlay) {
            return;
        }
        this.onPrepare = false;
    }

    private void read(boolean z) {
        if (this.r8lambdaKUbBm7ckfqTc9QCgukC86fguu4 <= 0) {
            if (AudioAttributesImplApi26Parcelizer) {
                StringBuilder sb = new StringBuilder("stopInterceptRequestLayout was called more times than startInterceptRequestLayout.");
                sb.append(write());
                throw new IllegalStateException(sb.toString());
            }
            this.r8lambdaKUbBm7ckfqTc9QCgukC86fguu4 = 1;
        }
        if (!z && !this.onPlay) {
            this.onPrepare = false;
        }
        if (this.r8lambdaKUbBm7ckfqTc9QCgukC86fguu4 == 1) {
            if (z && this.onPrepare && !this.onPlay && this.onPlayFromMediaId != null && this.MediaBrowserCompatItemReceiver != null) {
                onSetRating();
            }
            if (!this.onPlay) {
                this.onPrepare = false;
            }
        }
        this.r8lambdaKUbBm7ckfqTc9QCgukC86fguu4--;
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z) {
        if (z != this.onPlay) {
            write("Do not suppressLayout in layout or scroll");
            if (!z) {
                this.onPlay = false;
                if (this.onPrepare && this.onPlayFromMediaId != null && this.MediaBrowserCompatItemReceiver != null) {
                    requestLayout();
                }
                this.onPrepare = false;
                return;
            }
            long jUptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0));
            this.onPlay = true;
            this.PlaybackStateCompatCustomAction = true;
            ResultReceiver();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.onPlay;
    }

    @Deprecated
    public void setLayoutFrozen(boolean z) {
        suppressLayout(z);
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition == null) {
            super.setLayoutTransition(null);
            return;
        }
        throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
    }

    public final void AudioAttributesImplApi26Parcelizer(int i, int i2) {
        MediaBrowserCompatCustomActionResultReceiver(i, i2);
    }

    private void MediaBrowserCompatCustomActionResultReceiver(int i, int i2) {
        AudioAttributesCompatParcelizer(i, i2, (Interpolator) null);
    }

    private void AudioAttributesCompatParcelizer(int i, int i2, Interpolator interpolator) {
        write(i, i2, (Interpolator) null, Integer.MIN_VALUE, false);
    }

    final void write(int i, int i2, Interpolator interpolator, int i3, boolean z) {
        MediaBrowserCompatItemReceiver mediaBrowserCompatItemReceiver = this.onPlayFromMediaId;
        if (mediaBrowserCompatItemReceiver == null || this.onPlay) {
            return;
        }
        if (!mediaBrowserCompatItemReceiver.AudioAttributesImplApi26Parcelizer()) {
            i = 0;
        }
        if (!this.onPlayFromMediaId.AudioAttributesImplApi21Parcelizer()) {
            i2 = 0;
        }
        if (i == 0 && i2 == 0) {
            return;
        }
        if (z) {
            int i4 = i != 0 ? 1 : 0;
            if (i2 != 0) {
                i4 |= 2;
            }
            MediaBrowserCompatMediaItem(i4, 1);
        }
        this.onSetCaptioningEnabled.RemoteActionCompatParcelizer(i, i2, Integer.MIN_VALUE, interpolator);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4 */
    private boolean AudioAttributesImplApi21Parcelizer(int i, int i2) {
        int i3;
        int i4;
        MediaBrowserCompatItemReceiver mediaBrowserCompatItemReceiver = this.onPlayFromMediaId;
        if (mediaBrowserCompatItemReceiver == null || this.onPlay) {
            return false;
        }
        int iAudioAttributesImplApi26Parcelizer = mediaBrowserCompatItemReceiver.AudioAttributesImplApi26Parcelizer();
        boolean zAudioAttributesImplApi21Parcelizer = this.onPlayFromMediaId.AudioAttributesImplApi21Parcelizer();
        if (iAudioAttributesImplApi26Parcelizer == 0 || Math.abs(i) < this.addObserverForBackInvokerlambda7) {
            i = 0;
        }
        if (!zAudioAttributesImplApi21Parcelizer || Math.abs(i2) < this.addObserverForBackInvokerlambda7) {
            i2 = 0;
        }
        if (i == 0 && i2 == 0) {
            return false;
        }
        if (i == 0) {
            i3 = i;
            i = 0;
        } else {
            EdgeEffect edgeEffect = this.accessensureViewModelStore;
            if (edgeEffect != null && memberMethods.write(edgeEffect) != BitmapDescriptorFactory.HUE_RED) {
                int i5 = -i;
                if (write(this.accessensureViewModelStore, i5, getWidth())) {
                    this.accessensureViewModelStore.onAbsorb(i5);
                    i = 0;
                }
                i3 = 0;
            } else {
                EdgeEffect edgeEffect2 = this.addOnMultiWindowModeChangedListener;
                if (edgeEffect2 != null && memberMethods.write(edgeEffect2) != BitmapDescriptorFactory.HUE_RED) {
                    if (write(this.addOnMultiWindowModeChangedListener, i, getWidth())) {
                        this.addOnMultiWindowModeChangedListener.onAbsorb(i);
                        i = 0;
                    }
                    i3 = 0;
                }
                i3 = i;
                i = 0;
            }
        }
        if (i2 == 0) {
            i4 = i2;
            i2 = 0;
        } else {
            EdgeEffect edgeEffect3 = this.getFullyDrawnReporter;
            if (edgeEffect3 != null && memberMethods.write(edgeEffect3) != BitmapDescriptorFactory.HUE_RED) {
                int i6 = -i2;
                if (write(this.getFullyDrawnReporter, i6, getHeight())) {
                    this.getFullyDrawnReporter.onAbsorb(i6);
                    i2 = 0;
                }
                i4 = 0;
            } else {
                EdgeEffect edgeEffect4 = this.onSkipToQueueItem;
                if (edgeEffect4 != null && memberMethods.write(edgeEffect4) != BitmapDescriptorFactory.HUE_RED) {
                    if (write(this.onSkipToQueueItem, i2, getHeight())) {
                        this.onSkipToQueueItem.onAbsorb(i2);
                        i2 = 0;
                    }
                    i4 = 0;
                }
                i4 = i2;
                i2 = 0;
            }
        }
        if (i != 0 || i2 != 0) {
            int i7 = this.createFullyDrawnExecutor;
            i = Math.max(-i7, Math.min(i, i7));
            int i8 = this.createFullyDrawnExecutor;
            i2 = Math.max(-i8, Math.min(i2, i8));
            this.onSetCaptioningEnabled.RemoteActionCompatParcelizer(i, i2);
        }
        if (i3 == 0 && i4 == 0) {
            return (i == 0 && i2 == 0) ? false : true;
        }
        float f = i3;
        float f2 = i4;
        if (!dispatchNestedPreFling(f, f2)) {
            boolean z = iAudioAttributesImplApi26Parcelizer != 0 || zAudioAttributesImplApi21Parcelizer;
            dispatchNestedFling(f, f2, z);
            RatingCompat ratingCompat = this.addMenuProvider;
            if (ratingCompat != null && ratingCompat.read(i3, i4)) {
                return true;
            }
            if (z) {
                if (zAudioAttributesImplApi21Parcelizer) {
                    iAudioAttributesImplApi26Parcelizer = (iAudioAttributesImplApi26Parcelizer == true ? 1 : 0) | 2;
                }
                MediaBrowserCompatMediaItem(iAudioAttributesImplApi26Parcelizer, 1);
                int i9 = this.createFullyDrawnExecutor;
                int iMax = Math.max(-i9, Math.min(i3, i9));
                int i10 = this.createFullyDrawnExecutor;
                this.onSetCaptioningEnabled.RemoteActionCompatParcelizer(iMax, Math.max(-i10, Math.min(i4, i10)));
                return true;
            }
        }
        return false;
    }

    private boolean write(EdgeEffect edgeEffect, int i, int i2) {
        return i > 0 || MediaBrowserCompatMediaItem(-i) < memberMethods.write(edgeEffect) * ((float) i2);
    }

    final int RemoteActionCompatParcelizer(int i) {
        return write(i, this.accessensureViewModelStore, this.addOnMultiWindowModeChangedListener, getWidth());
    }

    final int read(int i) {
        return write(i, this.getFullyDrawnReporter, this.onSkipToQueueItem, getHeight());
    }

    private static int write(int i, EdgeEffect edgeEffect, EdgeEffect edgeEffect2, int i2) {
        if (i > 0 && edgeEffect != null && memberMethods.write(edgeEffect) != BitmapDescriptorFactory.HUE_RED) {
            int iRound = Math.round(((-i2) / 4.0f) * memberMethods.read(edgeEffect, ((-i) * 4.0f) / i2, 0.5f));
            if (iRound != i) {
                edgeEffect.finish();
            }
            return i - iRound;
        }
        if (i >= 0 || edgeEffect2 == null || memberMethods.write(edgeEffect2) == BitmapDescriptorFactory.HUE_RED) {
            return i;
        }
        float f = i2;
        int iRound2 = Math.round((f / 4.0f) * memberMethods.read(edgeEffect2, (i * 4.0f) / f, 0.5f));
        if (iRound2 != i) {
            edgeEffect2.finish();
        }
        return i - iRound2;
    }

    private void ResultReceiver() {
        MediaBrowserCompatItemReceiver(0);
        onRewind();
    }

    private void onRewind() {
        this.onSetCaptioningEnabled.read();
        MediaBrowserCompatItemReceiver mediaBrowserCompatItemReceiver = this.onPlayFromMediaId;
        if (mediaBrowserCompatItemReceiver != null) {
            mediaBrowserCompatItemReceiver.onSkipToNext();
        }
    }

    public final int AudioAttributesImplApi26Parcelizer() {
        return this.addObserverForBackInvokerlambda7;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void RemoteActionCompatParcelizer(float r6, float r7, float r8, float r9) {
        /*
            r5 = this;
            r0 = 0
            int r1 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            r2 = 1065353216(0x3f800000, float:1.0)
            if (r1 >= 0) goto L1f
            r5.onSetRepeatMode()
            android.widget.EdgeEffect r1 = r5.accessensureViewModelStore
            float r3 = -r7
            int r4 = r5.getWidth()
            float r4 = (float) r4
            float r3 = r3 / r4
            int r4 = r5.getHeight()
            float r4 = (float) r4
            float r8 = r8 / r4
            float r8 = r2 - r8
            kotlin.memberMethods.read(r1, r3, r8)
            goto L38
        L1f:
            int r1 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r1 <= 0) goto L3a
            r5.onStop()
            android.widget.EdgeEffect r1 = r5.addOnMultiWindowModeChangedListener
            int r3 = r5.getWidth()
            float r3 = (float) r3
            float r3 = r7 / r3
            int r4 = r5.getHeight()
            float r4 = (float) r4
            float r8 = r8 / r4
            kotlin.memberMethods.read(r1, r3, r8)
        L38:
            r8 = 1
            goto L3b
        L3a:
            r8 = 0
        L3b:
            int r1 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r1 >= 0) goto L55
            r5.onSkipToNext()
            android.widget.EdgeEffect r7 = r5.getFullyDrawnReporter
            float r8 = -r9
            int r9 = r5.getHeight()
            float r9 = (float) r9
            float r8 = r8 / r9
            int r9 = r5.getWidth()
            float r9 = (float) r9
            float r6 = r6 / r9
            kotlin.memberMethods.read(r7, r8, r6)
            goto L7a
        L55:
            int r1 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r1 <= 0) goto L6f
            r5.onSetShuffleMode()
            android.widget.EdgeEffect r7 = r5.onSkipToQueueItem
            int r8 = r5.getHeight()
            float r8 = (float) r8
            float r9 = r9 / r8
            int r8 = r5.getWidth()
            float r8 = (float) r8
            float r6 = r6 / r8
            float r2 = r2 - r6
            kotlin.memberMethods.read(r7, r9, r2)
            goto L7a
        L6f:
            if (r8 != 0) goto L7a
            int r6 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r6 != 0) goto L7a
            int r6 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r6 != 0) goto L7a
            return
        L7a:
            kotlin.InvalidTypeIdException.onRemoveQueueItem(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.RemoteActionCompatParcelizer(float, float, float, float):void");
    }

    private void onSeekTo() {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.accessensureViewModelStore;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            zIsFinished = this.accessensureViewModelStore.isFinished();
        } else {
            zIsFinished = false;
        }
        EdgeEffect edgeEffect2 = this.getFullyDrawnReporter;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            zIsFinished |= this.getFullyDrawnReporter.isFinished();
        }
        EdgeEffect edgeEffect3 = this.addOnMultiWindowModeChangedListener;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            zIsFinished |= this.addOnMultiWindowModeChangedListener.isFinished();
        }
        EdgeEffect edgeEffect4 = this.onSkipToQueueItem;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            zIsFinished |= this.onSkipToQueueItem.isFinished();
        }
        if (zIsFinished) {
            InvalidTypeIdException.onRemoveQueueItem(this);
        }
    }

    final void RemoteActionCompatParcelizer(int i, int i2) {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.accessensureViewModelStore;
        if (edgeEffect == null || edgeEffect.isFinished() || i <= 0) {
            zIsFinished = false;
        } else {
            this.accessensureViewModelStore.onRelease();
            zIsFinished = this.accessensureViewModelStore.isFinished();
        }
        EdgeEffect edgeEffect2 = this.addOnMultiWindowModeChangedListener;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i < 0) {
            this.addOnMultiWindowModeChangedListener.onRelease();
            zIsFinished |= this.addOnMultiWindowModeChangedListener.isFinished();
        }
        EdgeEffect edgeEffect3 = this.getFullyDrawnReporter;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i2 > 0) {
            this.getFullyDrawnReporter.onRelease();
            zIsFinished |= this.getFullyDrawnReporter.isFinished();
        }
        EdgeEffect edgeEffect4 = this.onSkipToQueueItem;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i2 < 0) {
            this.onSkipToQueueItem.onRelease();
            zIsFinished |= this.onSkipToQueueItem.isFinished();
        }
        if (zIsFinished) {
            InvalidTypeIdException.onRemoveQueueItem(this);
        }
    }

    final void AudioAttributesCompatParcelizer(int i, int i2) {
        if (i < 0) {
            onSetRepeatMode();
            if (this.accessensureViewModelStore.isFinished()) {
                this.accessensureViewModelStore.onAbsorb(-i);
            }
        } else if (i > 0) {
            onStop();
            if (this.addOnMultiWindowModeChangedListener.isFinished()) {
                this.addOnMultiWindowModeChangedListener.onAbsorb(i);
            }
        }
        if (i2 < 0) {
            onSkipToNext();
            if (this.getFullyDrawnReporter.isFinished()) {
                this.getFullyDrawnReporter.onAbsorb(-i2);
            }
        } else if (i2 > 0) {
            onSetShuffleMode();
            if (this.onSkipToQueueItem.isFinished()) {
                this.onSkipToQueueItem.onAbsorb(i2);
            }
        }
        if (i == 0 && i2 == 0) {
            return;
        }
        InvalidTypeIdException.onRemoveQueueItem(this);
    }

    private void onSetRepeatMode() {
        if (this.accessensureViewModelStore != null) {
            return;
        }
        EdgeEffect edgeEffectRemoteActionCompatParcelizer = this.MediaSessionCompatQueueItem.RemoteActionCompatParcelizer(this);
        this.accessensureViewModelStore = edgeEffectRemoteActionCompatParcelizer;
        if (this.MediaDescriptionCompat) {
            int measuredHeight = getMeasuredHeight();
            int paddingTop = getPaddingTop();
            edgeEffectRemoteActionCompatParcelizer.setSize((measuredHeight - paddingTop) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
            return;
        }
        edgeEffectRemoteActionCompatParcelizer.setSize(getMeasuredHeight(), getMeasuredWidth());
    }

    private void onStop() {
        if (this.addOnMultiWindowModeChangedListener != null) {
            return;
        }
        EdgeEffect edgeEffectRemoteActionCompatParcelizer = this.MediaSessionCompatQueueItem.RemoteActionCompatParcelizer(this);
        this.addOnMultiWindowModeChangedListener = edgeEffectRemoteActionCompatParcelizer;
        if (this.MediaDescriptionCompat) {
            int measuredHeight = getMeasuredHeight();
            int paddingTop = getPaddingTop();
            edgeEffectRemoteActionCompatParcelizer.setSize((measuredHeight - paddingTop) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
            return;
        }
        edgeEffectRemoteActionCompatParcelizer.setSize(getMeasuredHeight(), getMeasuredWidth());
    }

    private void onSkipToNext() {
        if (this.getFullyDrawnReporter != null) {
            return;
        }
        EdgeEffect edgeEffectRemoteActionCompatParcelizer = this.MediaSessionCompatQueueItem.RemoteActionCompatParcelizer(this);
        this.getFullyDrawnReporter = edgeEffectRemoteActionCompatParcelizer;
        if (this.MediaDescriptionCompat) {
            int measuredWidth = getMeasuredWidth();
            int paddingLeft = getPaddingLeft();
            edgeEffectRemoteActionCompatParcelizer.setSize((measuredWidth - paddingLeft) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
            return;
        }
        edgeEffectRemoteActionCompatParcelizer.setSize(getMeasuredWidth(), getMeasuredHeight());
    }

    private void onSetShuffleMode() {
        if (this.onSkipToQueueItem != null) {
            return;
        }
        EdgeEffect edgeEffectRemoteActionCompatParcelizer = this.MediaSessionCompatQueueItem.RemoteActionCompatParcelizer(this);
        this.onSkipToQueueItem = edgeEffectRemoteActionCompatParcelizer;
        if (this.MediaDescriptionCompat) {
            int measuredWidth = getMeasuredWidth();
            int paddingLeft = getPaddingLeft();
            edgeEffectRemoteActionCompatParcelizer.setSize((measuredWidth - paddingLeft) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
            return;
        }
        edgeEffectRemoteActionCompatParcelizer.setSize(getMeasuredWidth(), getMeasuredHeight());
    }

    private void setSessionImpl() {
        this.onSkipToQueueItem = null;
        this.getFullyDrawnReporter = null;
        this.addOnMultiWindowModeChangedListener = null;
        this.accessensureViewModelStore = null;
    }

    public void setEdgeEffectFactory(RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        this.MediaSessionCompatQueueItem = remoteActionCompatParcelizer;
        setSessionImpl();
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0065  */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View focusSearch(android.view.View r7, int r8) {
        /*
            Method dump skipped, instruction units count: 202
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.focusSearch(android.view.View, int):android.view.View");
    }

    private boolean AudioAttributesCompatParcelizer(View view, View view2, int i) {
        int i2;
        if (view2 == null || view2 == this || view2 == view || write(view2) == null) {
            return false;
        }
        if (view == null || write(view) == null) {
            return true;
        }
        this.onSetPlaybackSpeed.set(0, 0, view.getWidth(), view.getHeight());
        this.getDefaultViewModelProviderFactory.set(0, 0, view2.getWidth(), view2.getHeight());
        offsetDescendantRectToMyCoords(view, this.onSetPlaybackSpeed);
        offsetDescendantRectToMyCoords(view2, this.getDefaultViewModelProviderFactory);
        byte b = -1;
        int i3 = this.onPlayFromMediaId.onPlayFromSearch() == 1 ? -1 : 1;
        if ((this.onSetPlaybackSpeed.left < this.getDefaultViewModelProviderFactory.left || this.onSetPlaybackSpeed.right <= this.getDefaultViewModelProviderFactory.left) && this.onSetPlaybackSpeed.right < this.getDefaultViewModelProviderFactory.right) {
            i2 = 1;
        } else {
            i2 = ((this.onSetPlaybackSpeed.right > this.getDefaultViewModelProviderFactory.right || this.onSetPlaybackSpeed.left >= this.getDefaultViewModelProviderFactory.right) && this.onSetPlaybackSpeed.left > this.getDefaultViewModelProviderFactory.left) ? -1 : 0;
        }
        if ((this.onSetPlaybackSpeed.top < this.getDefaultViewModelProviderFactory.top || this.onSetPlaybackSpeed.bottom <= this.getDefaultViewModelProviderFactory.top) && this.onSetPlaybackSpeed.bottom < this.getDefaultViewModelProviderFactory.bottom) {
            b = 1;
        } else if ((this.onSetPlaybackSpeed.bottom <= this.getDefaultViewModelProviderFactory.bottom && this.onSetPlaybackSpeed.top < this.getDefaultViewModelProviderFactory.bottom) || this.onSetPlaybackSpeed.top <= this.getDefaultViewModelProviderFactory.top) {
            b = 0;
        }
        if (i == 1) {
            return b < 0 || (b == 0 && i2 * i3 < 0);
        }
        if (i == 2) {
            return b > 0 || (b == 0 && i2 * i3 > 0);
        }
        if (i == 17) {
            return i2 < 0;
        }
        if (i == 33) {
            return b < 0;
        }
        if (i == 66) {
            return i2 > 0;
        }
        if (i == 130) {
            return b > 0;
        }
        StringBuilder sb = new StringBuilder("Invalid direction: ");
        sb.append(i);
        sb.append(write());
        throw new IllegalArgumentException(sb.toString());
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (!this.onPlayFromMediaId.write(this) && view2 != null) {
            read(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    private void read(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        this.onSetPlaybackSpeed.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof LayoutParams) {
            LayoutParams layoutParams2 = (LayoutParams) layoutParams;
            if (!layoutParams2.AudioAttributesCompatParcelizer) {
                Rect rect = layoutParams2.RemoteActionCompatParcelizer;
                this.onSetPlaybackSpeed.left -= rect.left;
                this.onSetPlaybackSpeed.right += rect.right;
                this.onSetPlaybackSpeed.top -= rect.top;
                this.onSetPlaybackSpeed.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.onSetPlaybackSpeed);
            offsetRectIntoDescendantCoords(view, this.onSetPlaybackSpeed);
        }
        this.onPlayFromMediaId.IconCompatParcelizer(this, view, this.onSetPlaybackSpeed, !this.onCustomAction, view2 == null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        return this.onPlayFromMediaId.IconCompatParcelizer(this, view, rect, z);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        super.addFocusables(arrayList, i, i2);
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (MediaBrowserCompatMediaItem()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i, rect);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0051  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onAttachedToWindow() {
        /*
            r4 = this;
            super.onAttachedToWindow()
            r0 = 0
            r4._init_lambda4 = r0
            r1 = 1
            r4.handleMediaPlayPauseIfPendingOnHandler = r1
            boolean r2 = r4.onCustomAction
            if (r2 == 0) goto L13
            boolean r2 = r4.isLayoutRequested()
            if (r2 == 0) goto L14
        L13:
            r1 = r0
        L14:
            r4.onCustomAction = r1
            androidx.recyclerview.widget.RecyclerView$MediaDescriptionCompat r1 = r4.onRemoveQueueItemAt
            r1.AudioAttributesImplApi26Parcelizer()
            androidx.recyclerview.widget.RecyclerView$MediaBrowserCompatItemReceiver r1 = r4.onPlayFromMediaId
            if (r1 == 0) goto L22
            r1.RemoteActionCompatParcelizer(r4)
        L22:
            r4.onPlayFromUri = r0
            boolean r0 = androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
            if (r0 == 0) goto L68
            java.lang.ThreadLocal<o.SingletonSupport> r0 = kotlin.SingletonSupport.AudioAttributesCompatParcelizer
            java.lang.Object r0 = r0.get()
            o.SingletonSupport r0 = (kotlin.SingletonSupport) r0
            r4.onAddQueueItem = r0
            if (r0 != 0) goto L63
            o.SingletonSupport r0 = new o.SingletonSupport
            r0.<init>()
            r4.onAddQueueItem = r0
            android.view.Display r0 = kotlin.InvalidTypeIdException.AudioAttributesImplApi26Parcelizer(r4)
            boolean r1 = r4.isInEditMode()
            if (r1 != 0) goto L51
            if (r0 == 0) goto L51
            float r0 = r0.getRefreshRate()
            r1 = 1106247680(0x41f00000, float:30.0)
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 >= 0) goto L53
        L51:
            r0 = 1114636288(0x42700000, float:60.0)
        L53:
            o.SingletonSupport r1 = r4.onAddQueueItem
            r2 = 1315859240(0x4e6e6b28, float:1.0E9)
            float r2 = r2 / r0
            long r2 = (long) r2
            r1.read = r2
            java.lang.ThreadLocal<o.SingletonSupport> r0 = kotlin.SingletonSupport.AudioAttributesCompatParcelizer
            o.SingletonSupport r1 = r4.onAddQueueItem
            r0.set(r1)
        L63:
            o.SingletonSupport r0 = r4.onAddQueueItem
            r0.RemoteActionCompatParcelizer(r4)
        L68:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onAttachedToWindow():void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        SingletonSupport singletonSupport;
        super.onDetachedFromWindow();
        AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer = this.onCommand;
        if (audioAttributesImplApi26Parcelizer != null) {
            audioAttributesImplApi26Parcelizer.write();
        }
        ResultReceiver();
        this.handleMediaPlayPauseIfPendingOnHandler = false;
        MediaBrowserCompatItemReceiver mediaBrowserCompatItemReceiver = this.onPlayFromMediaId;
        if (mediaBrowserCompatItemReceiver != null) {
            mediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer(this, this.onRemoveQueueItemAt);
        }
        this.onPrepareFromSearch.clear();
        removeCallbacks(this._init_lambda3);
        UIntSerializer.IconCompatParcelizer();
        this.onRemoveQueueItemAt.MediaBrowserCompatCustomActionResultReceiver();
        createPrimordial.write((ViewGroup) this);
        if (!IconCompatParcelizer || (singletonSupport = this.onAddQueueItem) == null) {
            return;
        }
        singletonSupport.AudioAttributesCompatParcelizer(this);
        this.onAddQueueItem = null;
    }

    @Override // android.view.View
    public boolean isAttachedToWindow() {
        return this.handleMediaPlayPauseIfPendingOnHandler;
    }

    final void write(String str) {
        if (MediaBrowserCompatMediaItem()) {
            if (str == null) {
                StringBuilder sb = new StringBuilder("Cannot call this method while RecyclerView is computing a layout or scrolling");
                sb.append(write());
                throw new IllegalStateException(sb.toString());
            }
            throw new IllegalStateException(str);
        }
        if (this.MediaSessionCompatToken > 0) {
            StringBuilder sb2 = new StringBuilder("");
            sb2.append(write());
            new IllegalStateException(sb2.toString());
        }
    }

    public final void AudioAttributesCompatParcelizer(MediaBrowserCompatMediaItem mediaBrowserCompatMediaItem) {
        this.menuHostHelperlambda0.add(mediaBrowserCompatMediaItem);
    }

    public final void write(MediaBrowserCompatMediaItem mediaBrowserCompatMediaItem) {
        this.menuHostHelperlambda0.remove(mediaBrowserCompatMediaItem);
        if (this.r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8 == mediaBrowserCompatMediaItem) {
            this.r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8 = null;
        }
    }

    private boolean AudioAttributesCompatParcelizer(MotionEvent motionEvent) {
        MediaBrowserCompatMediaItem mediaBrowserCompatMediaItem = this.r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8;
        if (mediaBrowserCompatMediaItem == null) {
            if (motionEvent.getAction() == 0) {
                return false;
            }
            return IconCompatParcelizer(motionEvent);
        }
        mediaBrowserCompatMediaItem.read(motionEvent);
        int action = motionEvent.getAction();
        if (action == 3 || action == 1) {
            this.r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8 = null;
        }
        return true;
    }

    private boolean IconCompatParcelizer(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int size = this.menuHostHelperlambda0.size();
        for (int i = 0; i < size; i++) {
            MediaBrowserCompatMediaItem mediaBrowserCompatMediaItem = this.menuHostHelperlambda0.get(i);
            if (mediaBrowserCompatMediaItem.IconCompatParcelizer(motionEvent) && action != 3) {
                this.r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8 = mediaBrowserCompatMediaItem;
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        if (this.onPlay) {
            return false;
        }
        this.r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8 = null;
        if (IconCompatParcelizer(motionEvent)) {
            MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
            return true;
        }
        MediaBrowserCompatItemReceiver mediaBrowserCompatItemReceiver = this.onPlayFromMediaId;
        if (mediaBrowserCompatItemReceiver == null) {
            return false;
        }
        boolean zAudioAttributesImplApi26Parcelizer = mediaBrowserCompatItemReceiver.AudioAttributesImplApi26Parcelizer();
        boolean zAudioAttributesImplApi21Parcelizer = this.onPlayFromMediaId.AudioAttributesImplApi21Parcelizer();
        if (this.getSavedStateRegistry == null) {
            this.getSavedStateRegistry = VelocityTracker.obtain();
        }
        this.getSavedStateRegistry.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.PlaybackStateCompatCustomAction) {
                this.PlaybackStateCompatCustomAction = false;
            }
            this.getDefaultViewModelCreationExtras = motionEvent.getPointerId(0);
            int x = (int) (motionEvent.getX() + 0.5f);
            this.accessaddObserverForBackInvoker = x;
            this.ResultReceiver = x;
            int y = (int) (motionEvent.getY() + 0.5f);
            this.accessgetReportFullyDrawnExecutorp = y;
            this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = y;
            if (read(motionEvent) || this.addOnTrimMemoryListener == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                MediaBrowserCompatItemReceiver(1);
                MediaBrowserCompatCustomActionResultReceiver(1);
            }
            int[] iArr = this.ensureViewModelStore;
            iArr[1] = 0;
            iArr[0] = 0;
            int i = zAudioAttributesImplApi26Parcelizer;
            if (zAudioAttributesImplApi21Parcelizer) {
                i = (zAudioAttributesImplApi26Parcelizer ? 1 : 0) | 2;
            }
            MediaBrowserCompatMediaItem(i, 0);
        } else if (actionMasked == 1) {
            this.getSavedStateRegistry.clear();
            MediaBrowserCompatCustomActionResultReceiver(0);
        } else if (actionMasked == 2) {
            int iFindPointerIndex = motionEvent.findPointerIndex(this.getDefaultViewModelCreationExtras);
            if (iFindPointerIndex < 0) {
                return false;
            }
            int x2 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
            int y2 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
            if (this.addOnTrimMemoryListener != 1) {
                int i2 = this.ResultReceiver;
                int i3 = this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
                if (!zAudioAttributesImplApi26Parcelizer || Math.abs(x2 - i2) <= this.getLastCustomNonConfigurationInstance) {
                    z = false;
                } else {
                    this.accessaddObserverForBackInvoker = x2;
                    z = true;
                }
                if (zAudioAttributesImplApi21Parcelizer && Math.abs(y2 - i3) > this.getLastCustomNonConfigurationInstance) {
                    this.accessgetReportFullyDrawnExecutorp = y2;
                } else if (z) {
                }
                MediaBrowserCompatItemReceiver(1);
            }
        } else if (actionMasked == 3) {
            MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
        } else if (actionMasked == 5) {
            this.getDefaultViewModelCreationExtras = motionEvent.getPointerId(actionIndex);
            int x3 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.accessaddObserverForBackInvoker = x3;
            this.ResultReceiver = x3;
            int y3 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.accessgetReportFullyDrawnExecutorp = y3;
            this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = y3;
        } else if (actionMasked == 6) {
            write(motionEvent);
        }
        return this.addOnTrimMemoryListener == 1;
    }

    private boolean read(MotionEvent motionEvent) {
        boolean z;
        EdgeEffect edgeEffect = this.accessensureViewModelStore;
        if (edgeEffect == null || memberMethods.write(edgeEffect) == BitmapDescriptorFactory.HUE_RED || canScrollHorizontally(-1)) {
            z = false;
        } else {
            memberMethods.read(this.accessensureViewModelStore, BitmapDescriptorFactory.HUE_RED, 1.0f - (motionEvent.getY() / getHeight()));
            z = true;
        }
        EdgeEffect edgeEffect2 = this.addOnMultiWindowModeChangedListener;
        if (edgeEffect2 != null && memberMethods.write(edgeEffect2) != BitmapDescriptorFactory.HUE_RED && !canScrollHorizontally(1)) {
            memberMethods.read(this.addOnMultiWindowModeChangedListener, BitmapDescriptorFactory.HUE_RED, motionEvent.getY() / getHeight());
            z = true;
        }
        EdgeEffect edgeEffect3 = this.getFullyDrawnReporter;
        if (edgeEffect3 != null && memberMethods.write(edgeEffect3) != BitmapDescriptorFactory.HUE_RED && !canScrollVertically(-1)) {
            memberMethods.read(this.getFullyDrawnReporter, BitmapDescriptorFactory.HUE_RED, motionEvent.getX() / getWidth());
            z = true;
        }
        EdgeEffect edgeEffect4 = this.onSkipToQueueItem;
        if (edgeEffect4 == null || memberMethods.write(edgeEffect4) == BitmapDescriptorFactory.HUE_RED || canScrollVertically(1)) {
            return z;
        }
        memberMethods.read(this.onSkipToQueueItem, BitmapDescriptorFactory.HUE_RED, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        int size = this.menuHostHelperlambda0.size();
        for (int i = 0; i < size; i++) {
            this.menuHostHelperlambda0.get(i);
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00be A[PHI: r0
      0x00be: PHI (r0v37 int) = (r0v26 int), (r0v41 int) binds: [B:38:0x00a7, B:42:0x00ba] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d7  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            Method dump skipped, instruction units count: 463
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    private void onRemoveQueueItem() {
        VelocityTracker velocityTracker = this.getSavedStateRegistry;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        MediaBrowserCompatCustomActionResultReceiver(0);
        onSeekTo();
    }

    private void MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        onRemoveQueueItem();
        MediaBrowserCompatItemReceiver(0);
    }

    private void write(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.getDefaultViewModelCreationExtras) {
            int i = actionIndex == 0 ? 1 : 0;
            this.getDefaultViewModelCreationExtras = motionEvent.getPointerId(i);
            int x = (int) (motionEvent.getX(i) + 0.5f);
            this.accessaddObserverForBackInvoker = x;
            this.ResultReceiver = x;
            int y = (int) (motionEvent.getY(i) + 0.5f);
            this.accessgetReportFullyDrawnExecutorp = y;
            this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = y;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006a  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onGenericMotionEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            androidx.recyclerview.widget.RecyclerView$MediaBrowserCompatItemReceiver r0 = r5.onPlayFromMediaId
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            boolean r0 = r5.onPlay
            if (r0 == 0) goto Lb
            return r1
        Lb:
            int r0 = r6.getAction()
            r2 = 8
            if (r0 != r2) goto L75
            int r0 = r6.getSource()
            r0 = r0 & 2
            r2 = 0
            if (r0 == 0) goto L3c
            androidx.recyclerview.widget.RecyclerView$MediaBrowserCompatItemReceiver r0 = r5.onPlayFromMediaId
            boolean r0 = r0.AudioAttributesImplApi21Parcelizer()
            if (r0 == 0) goto L2c
            r0 = 9
            float r0 = r6.getAxisValue(r0)
            float r0 = -r0
            goto L2d
        L2c:
            r0 = r2
        L2d:
            androidx.recyclerview.widget.RecyclerView$MediaBrowserCompatItemReceiver r3 = r5.onPlayFromMediaId
            boolean r3 = r3.AudioAttributesImplApi26Parcelizer()
            if (r3 == 0) goto L54
            r3 = 10
            float r3 = r6.getAxisValue(r3)
            goto L62
        L3c:
            int r0 = r6.getSource()
            r3 = 4194304(0x400000, float:5.877472E-39)
            r0 = r0 & r3
            if (r0 == 0) goto L60
            r0 = 26
            float r3 = r6.getAxisValue(r0)
            androidx.recyclerview.widget.RecyclerView$MediaBrowserCompatItemReceiver r0 = r5.onPlayFromMediaId
            boolean r0 = r0.AudioAttributesImplApi21Parcelizer()
            if (r0 == 0) goto L56
            float r0 = -r3
        L54:
            r3 = r2
            goto L62
        L56:
            androidx.recyclerview.widget.RecyclerView$MediaBrowserCompatItemReceiver r0 = r5.onPlayFromMediaId
            boolean r0 = r0.AudioAttributesImplApi26Parcelizer()
            if (r0 == 0) goto L60
            r0 = r2
            goto L62
        L60:
            r0 = r2
            r3 = r0
        L62:
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L6a
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 == 0) goto L75
        L6a:
            float r2 = r5.addOnNewIntentListener
            float r3 = r3 * r2
            int r2 = (int) r3
            float r3 = r5.addOnPictureInPictureModeChangedListener
            float r0 = r0 * r3
            int r0 = (int) r0
            r5.AudioAttributesCompatParcelizer(r2, r0, r6)
        L75:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        MediaBrowserCompatItemReceiver mediaBrowserCompatItemReceiver = this.onPlayFromMediaId;
        if (mediaBrowserCompatItemReceiver == null) {
            IconCompatParcelizer(i, i2);
            return;
        }
        boolean z = false;
        if (mediaBrowserCompatItemReceiver.RatingCompat()) {
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            this.onPlayFromMediaId.write(i, i2);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z = true;
            }
            this._init_lambda5 = z;
            if (z || this.MediaBrowserCompatItemReceiver == null) {
                return;
            }
            if (this.onPrepareFromUri.AudioAttributesImplApi21Parcelizer == 1) {
                onCommand();
            }
            this.onPlayFromMediaId.IconCompatParcelizer(i, i2);
            this.onPrepareFromUri.MediaBrowserCompatItemReceiver = true;
            onMediaButtonEvent();
            this.onPlayFromMediaId.AudioAttributesCompatParcelizer(i, i2);
            if (this.onPlayFromMediaId.handleMediaPlayPauseIfPendingOnHandler()) {
                this.onPlayFromMediaId.IconCompatParcelizer(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                this.onPrepareFromUri.MediaBrowserCompatItemReceiver = true;
                onMediaButtonEvent();
                this.onPlayFromMediaId.AudioAttributesCompatParcelizer(i, i2);
            }
            this._init_lambda2 = getMeasuredWidth();
            this.r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0 = getMeasuredHeight();
            return;
        }
        if (this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) {
            this.onPlayFromMediaId.write(i, i2);
            return;
        }
        if (this.MediaBrowserCompatMediaItem) {
            r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw();
            MediaMetadataCompat();
            onPrepare();
            MediaSessionCompatQueueItem();
            if (this.onPrepareFromUri.MediaMetadataCompat) {
                this.onPrepareFromUri.IconCompatParcelizer = true;
            } else {
                this.MediaMetadataCompat.write();
                this.onPrepareFromUri.IconCompatParcelizer = false;
            }
            this.MediaBrowserCompatMediaItem = false;
            read(false);
        } else if (this.onPrepareFromUri.MediaMetadataCompat) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        IconCompatParcelizer iconCompatParcelizer = this.MediaBrowserCompatItemReceiver;
        if (iconCompatParcelizer != null) {
            this.onPrepareFromUri.AudioAttributesImplApi26Parcelizer = iconCompatParcelizer.getItemCount();
        } else {
            this.onPrepareFromUri.AudioAttributesImplApi26Parcelizer = 0;
        }
        r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw();
        this.onPlayFromMediaId.write(i, i2);
        read(false);
        this.onPrepareFromUri.IconCompatParcelizer = false;
    }

    final void IconCompatParcelizer(int i, int i2) {
        setMeasuredDimension(MediaBrowserCompatItemReceiver.a_(i, getPaddingLeft() + getPaddingRight(), InvalidTypeIdException.MediaBrowserCompatSearchResultReceiver(this)), MediaBrowserCompatItemReceiver.a_(i2, getPaddingTop() + getPaddingBottom(), InvalidTypeIdException.RatingCompat(this)));
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i == i3 && i2 == i4) {
            return;
        }
        setSessionImpl();
    }

    public void setItemAnimator(AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer) {
        AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer2 = this.onCommand;
        if (audioAttributesImplApi26Parcelizer2 != null) {
            audioAttributesImplApi26Parcelizer2.write();
            this.onCommand.RemoteActionCompatParcelizer((AudioAttributesImplApi26Parcelizer.read) null);
        }
        this.onCommand = audioAttributesImplApi26Parcelizer;
        if (audioAttributesImplApi26Parcelizer != null) {
            audioAttributesImplApi26Parcelizer.RemoteActionCompatParcelizer(this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28);
        }
    }

    public final void MediaMetadataCompat() {
        this._init_lambda4++;
    }

    private void MediaSessionCompatQueueItem() {
        RemoteActionCompatParcelizer(true);
    }

    public final void RemoteActionCompatParcelizer(boolean z) {
        int i = this._init_lambda4 - 1;
        this._init_lambda4 = i;
        if (i <= 0) {
            if (AudioAttributesImplApi26Parcelizer && i < 0) {
                StringBuilder sb = new StringBuilder("layout or scroll counter cannot go below zero.Some calls are not matching");
                sb.append(write());
                throw new IllegalStateException(sb.toString());
            }
            this._init_lambda4 = 0;
            if (z) {
                onCustomAction();
                onSetPlaybackSpeed();
            }
        }
    }

    final boolean MediaBrowserCompatSearchResultReceiver() {
        AccessibilityManager accessibilityManager = this.setSessionImpl;
        return accessibilityManager != null && accessibilityManager.isEnabled();
    }

    private void onCustomAction() {
        int i = this.MediaSessionCompatResultReceiverWrapper;
        this.MediaSessionCompatResultReceiverWrapper = 0;
        if (i == 0 || !MediaBrowserCompatSearchResultReceiver()) {
            return;
        }
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
        accessibilityEventObtain.setEventType(2048);
        findNameForRegularGetter.read(accessibilityEventObtain, i);
        sendAccessibilityEventUnchecked(accessibilityEventObtain);
    }

    public final boolean MediaBrowserCompatMediaItem() {
        return this._init_lambda4 > 0;
    }

    private boolean AudioAttributesCompatParcelizer(AccessibilityEvent accessibilityEvent) {
        if (!MediaBrowserCompatMediaItem()) {
            return false;
        }
        int iIconCompatParcelizer = accessibilityEvent != null ? findNameForRegularGetter.IconCompatParcelizer(accessibilityEvent) : 0;
        this.MediaSessionCompatResultReceiverWrapper |= iIconCompatParcelizer != 0 ? iIconCompatParcelizer : 0;
        return true;
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (AudioAttributesCompatParcelizer(accessibilityEvent)) {
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    public final AudioAttributesImplApi26Parcelizer RemoteActionCompatParcelizer() {
        return this.onCommand;
    }

    final void handleMediaPlayPauseIfPendingOnHandler() {
        if (this.onPlayFromUri || !this.handleMediaPlayPauseIfPendingOnHandler) {
            return;
        }
        InvalidTypeIdException.AudioAttributesCompatParcelizer(this, this._init_lambda3);
        this.onPlayFromUri = true;
    }

    private boolean onPrepareFromSearch() {
        return this.onCommand != null && this.onPlayFromMediaId.M_();
    }

    private void onPrepare() {
        if (this.RatingCompat) {
            this.MediaMetadataCompat.MediaBrowserCompatItemReceiver();
            if (this.PlaybackStateCompat) {
                this.onPlayFromMediaId.L_();
            }
        }
        if (onPrepareFromSearch()) {
            this.MediaMetadataCompat.RemoteActionCompatParcelizer();
        } else {
            this.MediaMetadataCompat.write();
        }
        boolean z = this.onMediaButtonEvent || this.onFastForward;
        this.onPrepareFromUri.MediaBrowserCompatSearchResultReceiver = this.onCustomAction && this.onCommand != null && (this.RatingCompat || z || this.onPlayFromMediaId.MediaBrowserCompatSearchResultReceiver) && (!this.RatingCompat || this.MediaBrowserCompatItemReceiver.hasStableIds());
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = this.onPrepareFromUri;
        mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.MediaMetadataCompat = mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.MediaBrowserCompatSearchResultReceiver && z && !this.RatingCompat && onPrepareFromSearch();
    }

    private void onSetRating() {
        if (this.MediaBrowserCompatItemReceiver == null || this.onPlayFromMediaId == null) {
            return;
        }
        this.onPrepareFromUri.MediaBrowserCompatItemReceiver = false;
        boolean z = this._init_lambda5 && !(this._init_lambda2 == getWidth() && this.r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0 == getHeight());
        this._init_lambda2 = 0;
        this.r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0 = 0;
        this._init_lambda5 = false;
        if (this.onPrepareFromUri.AudioAttributesImplApi21Parcelizer == 1) {
            onCommand();
        } else {
            if (!this.MediaMetadataCompat.AudioAttributesCompatParcelizer() && !z && this.onPlayFromMediaId.onPrepare() == getWidth() && this.onPlayFromMediaId.onMediaButtonEvent() == getHeight()) {
                this.onPlayFromMediaId.IconCompatParcelizer(this);
            }
            onFastForward();
        }
        this.onPlayFromMediaId.IconCompatParcelizer(this);
        onMediaButtonEvent();
        onFastForward();
    }

    private void onRemoveQueueItemAt() {
        int absoluteAdapterPosition;
        View focusedChild = (this.getSavedStateRegistryControllerannotations && hasFocus() && this.MediaBrowserCompatItemReceiver != null) ? getFocusedChild() : null;
        onMediaButtonEvent onmediabuttoneventRatingCompat = focusedChild != null ? RatingCompat(focusedChild) : null;
        if (onmediabuttoneventRatingCompat == null) {
            onPrepareFromUri();
            return;
        }
        this.onPrepareFromUri.RemoteActionCompatParcelizer = this.MediaBrowserCompatItemReceiver.hasStableIds() ? onmediabuttoneventRatingCompat.getItemId() : -1L;
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = this.onPrepareFromUri;
        if (this.RatingCompat) {
            absoluteAdapterPosition = -1;
        } else {
            absoluteAdapterPosition = onmediabuttoneventRatingCompat.isRemoved() ? onmediabuttoneventRatingCompat.mOldPosition : onmediabuttoneventRatingCompat.getAbsoluteAdapterPosition();
        }
        mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.read = absoluteAdapterPosition;
        this.onPrepareFromUri.write = MediaDescriptionCompat(onmediabuttoneventRatingCompat.itemView);
    }

    private void onPrepareFromUri() {
        this.onPrepareFromUri.RemoteActionCompatParcelizer = -1L;
        this.onPrepareFromUri.read = -1;
        this.onPrepareFromUri.write = -1;
    }

    private View onPlayFromMediaId() {
        onMediaButtonEvent onmediabuttoneventMediaBrowserCompatSearchResultReceiver;
        int i = this.onPrepareFromUri.read != -1 ? this.onPrepareFromUri.read : 0;
        int i2 = this.onPrepareFromUri.read();
        for (int i3 = i; i3 < i2; i3++) {
            onMediaButtonEvent onmediabuttoneventMediaBrowserCompatSearchResultReceiver2 = MediaBrowserCompatSearchResultReceiver(i3);
            if (onmediabuttoneventMediaBrowserCompatSearchResultReceiver2 == null) {
                break;
            }
            if (onmediabuttoneventMediaBrowserCompatSearchResultReceiver2.itemView.hasFocusable()) {
                return onmediabuttoneventMediaBrowserCompatSearchResultReceiver2.itemView;
            }
        }
        int iMin = Math.min(i2, i);
        do {
            iMin--;
            if (iMin < 0 || (onmediabuttoneventMediaBrowserCompatSearchResultReceiver = MediaBrowserCompatSearchResultReceiver(iMin)) == null) {
                return null;
            }
        } while (!onmediabuttoneventMediaBrowserCompatSearchResultReceiver.itemView.hasFocusable());
        return onmediabuttoneventMediaBrowserCompatSearchResultReceiver.itemView;
    }

    private void onPlayFromSearch() {
        View viewFindViewById;
        if (!this.getSavedStateRegistryControllerannotations || this.MediaBrowserCompatItemReceiver == null || !hasFocus() || getDescendantFocusability() == 393216) {
            return;
        }
        if (getDescendantFocusability() == 131072 && isFocused()) {
            return;
        }
        if (!isFocused()) {
            if (!this.MediaBrowserCompatSearchResultReceiver.IconCompatParcelizer(getFocusedChild())) {
                return;
            }
        }
        View viewOnPlayFromMediaId = null;
        onMediaButtonEvent onmediabuttoneventWrite = (this.onPrepareFromUri.RemoteActionCompatParcelizer == -1 || !this.MediaBrowserCompatItemReceiver.hasStableIds()) ? null : write(this.onPrepareFromUri.RemoteActionCompatParcelizer);
        if (onmediabuttoneventWrite == null || this.MediaBrowserCompatSearchResultReceiver.IconCompatParcelizer(onmediabuttoneventWrite.itemView) || !onmediabuttoneventWrite.itemView.hasFocusable()) {
            if (this.MediaBrowserCompatSearchResultReceiver.read() > 0) {
                viewOnPlayFromMediaId = onPlayFromMediaId();
            }
        } else {
            viewOnPlayFromMediaId = onmediabuttoneventWrite.itemView;
        }
        if (viewOnPlayFromMediaId != null) {
            if (this.onPrepareFromUri.write != -1 && (viewFindViewById = viewOnPlayFromMediaId.findViewById(this.onPrepareFromUri.write)) != null && viewFindViewById.isFocusable()) {
                viewOnPlayFromMediaId = viewFindViewById;
            }
            viewOnPlayFromMediaId.requestFocus();
        }
    }

    private static int MediaDescriptionCompat(View view) {
        int id = view.getId();
        while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
            view = ((ViewGroup) view).getFocusedChild();
            if (view.getId() != -1) {
                id = view.getId();
            }
        }
        return id;
    }

    private void write(MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) {
        if (RatingCompat() == 2) {
            OverScroller overScroller = this.onSetCaptioningEnabled.AudioAttributesCompatParcelizer;
            mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.AudioAttributesImplBaseParcelizer = overScroller.getFinalX() - overScroller.getCurrX();
            mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.MediaBrowserCompatMediaItem = overScroller.getFinalY() - overScroller.getCurrY();
        } else {
            mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.AudioAttributesImplBaseParcelizer = 0;
            mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.MediaBrowserCompatMediaItem = 0;
        }
    }

    private void onCommand() {
        this.onPrepareFromUri.write(1);
        write(this.onPrepareFromUri);
        this.onPrepareFromUri.MediaBrowserCompatItemReceiver = false;
        r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw();
        this.onSetRating.AudioAttributesCompatParcelizer();
        MediaMetadataCompat();
        onPrepare();
        onRemoveQueueItemAt();
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = this.onPrepareFromUri;
        mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.MediaBrowserCompatSearchResultReceiver && this.onFastForward;
        this.onFastForward = false;
        this.onMediaButtonEvent = false;
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver2 = this.onPrepareFromUri;
        mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver2.IconCompatParcelizer = mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver2.MediaMetadataCompat;
        this.onPrepareFromUri.AudioAttributesImplApi26Parcelizer = this.MediaBrowserCompatItemReceiver.getItemCount();
        IconCompatParcelizer(this.addObserverForBackInvoker);
        if (this.onPrepareFromUri.MediaBrowserCompatSearchResultReceiver) {
            int i = this.MediaBrowserCompatSearchResultReceiver.read();
            for (int i2 = 0; i2 < i; i2++) {
                onMediaButtonEvent onmediabuttoneventIconCompatParcelizer = IconCompatParcelizer(this.MediaBrowserCompatSearchResultReceiver.read(i2));
                if (!onmediabuttoneventIconCompatParcelizer.shouldIgnore() && (!onmediabuttoneventIconCompatParcelizer.isInvalid() || this.MediaBrowserCompatItemReceiver.hasStableIds())) {
                    AudioAttributesImplApi26Parcelizer.RemoteActionCompatParcelizer(onmediabuttoneventIconCompatParcelizer);
                    onmediabuttoneventIconCompatParcelizer.getUnmodifiedPayloads();
                    this.onSetRating.IconCompatParcelizer(onmediabuttoneventIconCompatParcelizer, AudioAttributesImplApi26Parcelizer.MediaBrowserCompatItemReceiver(onmediabuttoneventIconCompatParcelizer));
                    if (this.onPrepareFromUri.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver && onmediabuttoneventIconCompatParcelizer.isUpdated() && !onmediabuttoneventIconCompatParcelizer.isRemoved() && !onmediabuttoneventIconCompatParcelizer.shouldIgnore() && !onmediabuttoneventIconCompatParcelizer.isInvalid()) {
                        this.onSetRating.write(AudioAttributesCompatParcelizer(onmediabuttoneventIconCompatParcelizer), onmediabuttoneventIconCompatParcelizer);
                    }
                }
            }
        }
        if (this.onPrepareFromUri.MediaMetadataCompat) {
            MediaSessionCompatResultReceiverWrapper();
            boolean z = this.onPrepareFromUri.RatingCompat;
            this.onPrepareFromUri.RatingCompat = false;
            this.onPlayFromMediaId.write(this.onRemoveQueueItemAt, this.onPrepareFromUri);
            this.onPrepareFromUri.RatingCompat = z;
            for (int i3 = 0; i3 < this.MediaBrowserCompatSearchResultReceiver.read(); i3++) {
                onMediaButtonEvent onmediabuttoneventIconCompatParcelizer2 = IconCompatParcelizer(this.MediaBrowserCompatSearchResultReceiver.read(i3));
                if (!onmediabuttoneventIconCompatParcelizer2.shouldIgnore() && !this.onSetRating.write(onmediabuttoneventIconCompatParcelizer2)) {
                    AudioAttributesImplApi26Parcelizer.RemoteActionCompatParcelizer(onmediabuttoneventIconCompatParcelizer2);
                    boolean zHasAnyOfTheFlags = onmediabuttoneventIconCompatParcelizer2.hasAnyOfTheFlags(8192);
                    onmediabuttoneventIconCompatParcelizer2.getUnmodifiedPayloads();
                    AudioAttributesImplApi26Parcelizer.write writeVarMediaBrowserCompatItemReceiver = AudioAttributesImplApi26Parcelizer.MediaBrowserCompatItemReceiver(onmediabuttoneventIconCompatParcelizer2);
                    if (zHasAnyOfTheFlags) {
                        read(onmediabuttoneventIconCompatParcelizer2, writeVarMediaBrowserCompatItemReceiver);
                    } else {
                        this.onSetRating.RemoteActionCompatParcelizer(onmediabuttoneventIconCompatParcelizer2, writeVarMediaBrowserCompatItemReceiver);
                    }
                }
            }
            onSetCaptioningEnabled();
        } else {
            onSetCaptioningEnabled();
        }
        MediaSessionCompatQueueItem();
        read(false);
        this.onPrepareFromUri.AudioAttributesImplApi21Parcelizer = 2;
    }

    private void onMediaButtonEvent() {
        r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw();
        MediaMetadataCompat();
        this.onPrepareFromUri.write(6);
        this.MediaMetadataCompat.write();
        this.onPrepareFromUri.AudioAttributesImplApi26Parcelizer = this.MediaBrowserCompatItemReceiver.getItemCount();
        this.onPrepareFromUri.AudioAttributesCompatParcelizer = 0;
        if (this.onPrepareFromMediaId != null && this.MediaBrowserCompatItemReceiver.canRestoreState()) {
            if (this.onPrepareFromMediaId.read != null) {
                this.onPlayFromMediaId.IconCompatParcelizer(this.onPrepareFromMediaId.read);
            }
            this.onPrepareFromMediaId = null;
        }
        this.onPrepareFromUri.IconCompatParcelizer = false;
        this.onPlayFromMediaId.write(this.onRemoveQueueItemAt, this.onPrepareFromUri);
        this.onPrepareFromUri.RatingCompat = false;
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = this.onPrepareFromUri;
        mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.MediaBrowserCompatSearchResultReceiver = mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.MediaBrowserCompatSearchResultReceiver && this.onCommand != null;
        this.onPrepareFromUri.AudioAttributesImplApi21Parcelizer = 4;
        MediaSessionCompatQueueItem();
        read(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void onFastForward() {
        /*
            Method dump skipped, instruction units count: 234
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onFastForward():void");
    }

    private void read(long j, onMediaButtonEvent onmediabuttonevent, onMediaButtonEvent onmediabuttonevent2) {
        int i = this.MediaBrowserCompatSearchResultReceiver.read();
        for (int i2 = 0; i2 < i; i2++) {
            onMediaButtonEvent onmediabuttoneventIconCompatParcelizer = IconCompatParcelizer(this.MediaBrowserCompatSearchResultReceiver.read(i2));
            if (onmediabuttoneventIconCompatParcelizer != onmediabuttonevent && AudioAttributesCompatParcelizer(onmediabuttoneventIconCompatParcelizer) == j) {
                IconCompatParcelizer iconCompatParcelizer = this.MediaBrowserCompatItemReceiver;
                if (iconCompatParcelizer != null && iconCompatParcelizer.hasStableIds()) {
                    StringBuilder sb = new StringBuilder("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:");
                    sb.append(onmediabuttoneventIconCompatParcelizer);
                    sb.append(" \n View Holder 2:");
                    sb.append(onmediabuttonevent);
                    sb.append(write());
                    throw new IllegalStateException(sb.toString());
                }
                StringBuilder sb2 = new StringBuilder("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:");
                sb2.append(onmediabuttoneventIconCompatParcelizer);
                sb2.append(" \n View Holder 2:");
                sb2.append(onmediabuttonevent);
                sb2.append(write());
                throw new IllegalStateException(sb2.toString());
            }
        }
        Objects.toString(onmediabuttonevent2);
        Objects.toString(onmediabuttonevent);
        write();
    }

    final void read(onMediaButtonEvent onmediabuttonevent, AudioAttributesImplApi26Parcelizer.write writeVar) {
        onmediabuttonevent.setFlags(0, 8192);
        if (this.onPrepareFromUri.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver && onmediabuttonevent.isUpdated() && !onmediabuttonevent.isRemoved() && !onmediabuttonevent.shouldIgnore()) {
            this.onSetRating.write(AudioAttributesCompatParcelizer(onmediabuttonevent), onmediabuttonevent);
        }
        this.onSetRating.IconCompatParcelizer(onmediabuttonevent, writeVar);
    }

    private void IconCompatParcelizer(int[] iArr) {
        int i = this.MediaBrowserCompatSearchResultReceiver.read();
        if (i == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i2 = Integer.MAX_VALUE;
        int i3 = Integer.MIN_VALUE;
        for (int i4 = 0; i4 < i; i4++) {
            onMediaButtonEvent onmediabuttoneventIconCompatParcelizer = IconCompatParcelizer(this.MediaBrowserCompatSearchResultReceiver.read(i4));
            if (!onmediabuttoneventIconCompatParcelizer.shouldIgnore()) {
                int layoutPosition = onmediabuttoneventIconCompatParcelizer.getLayoutPosition();
                if (layoutPosition < i2) {
                    i2 = layoutPosition;
                }
                if (layoutPosition > i3) {
                    i3 = layoutPosition;
                }
            }
        }
        iArr[0] = i2;
        iArr[1] = i3;
    }

    private boolean MediaBrowserCompatItemReceiver(int i, int i2) {
        IconCompatParcelizer(this.addObserverForBackInvoker);
        int[] iArr = this.addObserverForBackInvoker;
        return (iArr[0] == i && iArr[1] == i2) ? false : true;
    }

    @Override // android.view.ViewGroup
    protected void removeDetachedView(View view, boolean z) {
        onMediaButtonEvent onmediabuttoneventIconCompatParcelizer = IconCompatParcelizer(view);
        if (onmediabuttoneventIconCompatParcelizer != null) {
            if (onmediabuttoneventIconCompatParcelizer.isTmpDetached()) {
                onmediabuttoneventIconCompatParcelizer.clearTmpDetachFlag();
            } else if (!onmediabuttoneventIconCompatParcelizer.shouldIgnore()) {
                StringBuilder sb = new StringBuilder("Called removeDetachedView with a view which is not flagged as tmp detached.");
                sb.append(onmediabuttoneventIconCompatParcelizer);
                sb.append(write());
                throw new IllegalArgumentException(sb.toString());
            }
        } else if (AudioAttributesImplApi26Parcelizer) {
            StringBuilder sb2 = new StringBuilder("No ViewHolder found for child: ");
            sb2.append(view);
            sb2.append(write());
            throw new IllegalArgumentException(sb2.toString());
        }
        view.clearAnimation();
        RemoteActionCompatParcelizer(view);
        super.removeDetachedView(view, z);
    }

    private long AudioAttributesCompatParcelizer(onMediaButtonEvent onmediabuttonevent) {
        return this.MediaBrowserCompatItemReceiver.hasStableIds() ? onmediabuttonevent.getItemId() : onmediabuttonevent.mPosition;
    }

    final void RemoteActionCompatParcelizer(onMediaButtonEvent onmediabuttonevent, AudioAttributesImplApi26Parcelizer.write writeVar, AudioAttributesImplApi26Parcelizer.write writeVar2) {
        onmediabuttonevent.setIsRecyclable(false);
        if (this.onCommand.IconCompatParcelizer(onmediabuttonevent, writeVar, writeVar2)) {
            handleMediaPlayPauseIfPendingOnHandler();
        }
    }

    final void AudioAttributesCompatParcelizer(onMediaButtonEvent onmediabuttonevent, AudioAttributesImplApi26Parcelizer.write writeVar, AudioAttributesImplApi26Parcelizer.write writeVar2) {
        IconCompatParcelizer(onmediabuttonevent);
        onmediabuttonevent.setIsRecyclable(false);
        if (this.onCommand.RemoteActionCompatParcelizer(onmediabuttonevent, writeVar, writeVar2)) {
            handleMediaPlayPauseIfPendingOnHandler();
        }
    }

    private void write(onMediaButtonEvent onmediabuttonevent, onMediaButtonEvent onmediabuttonevent2, AudioAttributesImplApi26Parcelizer.write writeVar, AudioAttributesImplApi26Parcelizer.write writeVar2, boolean z, boolean z2) {
        onmediabuttonevent.setIsRecyclable(false);
        if (z) {
            IconCompatParcelizer(onmediabuttonevent);
        }
        if (onmediabuttonevent != onmediabuttonevent2) {
            if (z2) {
                IconCompatParcelizer(onmediabuttonevent2);
            }
            onmediabuttonevent.mShadowedHolder = onmediabuttonevent2;
            IconCompatParcelizer(onmediabuttonevent);
            this.onRemoveQueueItemAt.AudioAttributesCompatParcelizer(onmediabuttonevent);
            onmediabuttonevent2.setIsRecyclable(false);
            onmediabuttonevent2.mShadowingHolder = onmediabuttonevent;
        }
        if (this.onCommand.write(onmediabuttonevent, onmediabuttonevent2, writeVar, writeVar2)) {
            handleMediaPlayPauseIfPendingOnHandler();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        constructDelegatingKeyDeserializer.read("RV OnLayout");
        onSetRating();
        constructDelegatingKeyDeserializer.RemoteActionCompatParcelizer();
        this.onCustomAction = true;
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.r8lambdaKUbBm7ckfqTc9QCgukC86fguu4 == 0 && !this.onPlay) {
            super.requestLayout();
        } else {
            this.onPrepare = true;
        }
    }

    private void MediaSessionCompatToken() {
        int iRemoteActionCompatParcelizer = this.MediaBrowserCompatSearchResultReceiver.RemoteActionCompatParcelizer();
        for (int i = 0; i < iRemoteActionCompatParcelizer; i++) {
            ((LayoutParams) this.MediaBrowserCompatSearchResultReceiver.AudioAttributesCompatParcelizer(i).getLayoutParams()).AudioAttributesCompatParcelizer = true;
        }
        this.onRemoveQueueItemAt.AudioAttributesImplBaseParcelizer();
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        boolean z;
        super.draw(canvas);
        int size = this.onPause.size();
        boolean z2 = false;
        for (int i = 0; i < size; i++) {
            this.onPause.get(i).AudioAttributesCompatParcelizer(canvas, this, this.onPrepareFromUri);
        }
        EdgeEffect edgeEffect = this.accessensureViewModelStore;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z = false;
        } else {
            int iSave = canvas.save();
            int paddingBottom = this.MediaDescriptionCompat ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, BitmapDescriptorFactory.HUE_RED);
            EdgeEffect edgeEffect2 = this.accessensureViewModelStore;
            z = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect3 = this.getFullyDrawnReporter;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int iSave2 = canvas.save();
            if (this.MediaDescriptionCompat) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.getFullyDrawnReporter;
            z |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(iSave2);
        }
        EdgeEffect edgeEffect5 = this.addOnMultiWindowModeChangedListener;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int iSave3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.MediaDescriptionCompat ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(paddingTop, -width);
            EdgeEffect edgeEffect6 = this.addOnMultiWindowModeChangedListener;
            z |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(iSave3);
        }
        EdgeEffect edgeEffect7 = this.onSkipToQueueItem;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int iSave4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.MediaDescriptionCompat) {
                canvas.translate((-getWidth()) + getPaddingRight(), (-getHeight()) + getPaddingBottom());
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.onSkipToQueueItem;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z2 = true;
            }
            z |= z2;
            canvas.restoreToCount(iSave4);
        }
        if ((z || this.onCommand == null || this.onPause.size() <= 0 || !this.onCommand.IconCompatParcelizer()) && !z) {
            return;
        }
        InvalidTypeIdException.onRemoveQueueItem(this);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.onPause.size();
        for (int i = 0; i < size; i++) {
            this.onPause.get(i).IconCompatParcelizer(canvas, this, this.onPrepareFromUri);
        }
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && this.onPlayFromMediaId.RemoteActionCompatParcelizer((LayoutParams) layoutParams);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        MediaBrowserCompatItemReceiver mediaBrowserCompatItemReceiver = this.onPlayFromMediaId;
        if (mediaBrowserCompatItemReceiver == null) {
            StringBuilder sb = new StringBuilder("RecyclerView has no LayoutManager");
            sb.append(write());
            throw new IllegalStateException(sb.toString());
        }
        return mediaBrowserCompatItemReceiver.read();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        MediaBrowserCompatItemReceiver mediaBrowserCompatItemReceiver = this.onPlayFromMediaId;
        if (mediaBrowserCompatItemReceiver == null) {
            StringBuilder sb = new StringBuilder("RecyclerView has no LayoutManager");
            sb.append(write());
            throw new IllegalStateException(sb.toString());
        }
        return mediaBrowserCompatItemReceiver.AudioAttributesCompatParcelizer(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        MediaBrowserCompatItemReceiver mediaBrowserCompatItemReceiver = this.onPlayFromMediaId;
        if (mediaBrowserCompatItemReceiver == null) {
            StringBuilder sb = new StringBuilder("RecyclerView has no LayoutManager");
            sb.append(write());
            throw new IllegalStateException(sb.toString());
        }
        return mediaBrowserCompatItemReceiver.read(layoutParams);
    }

    private void MediaSessionCompatResultReceiverWrapper() {
        int iRemoteActionCompatParcelizer = this.MediaBrowserCompatSearchResultReceiver.RemoteActionCompatParcelizer();
        for (int i = 0; i < iRemoteActionCompatParcelizer; i++) {
            onMediaButtonEvent onmediabuttoneventIconCompatParcelizer = IconCompatParcelizer(this.MediaBrowserCompatSearchResultReceiver.AudioAttributesCompatParcelizer(i));
            if (AudioAttributesImplApi26Parcelizer && onmediabuttoneventIconCompatParcelizer.mPosition == -1 && !onmediabuttoneventIconCompatParcelizer.isRemoved()) {
                StringBuilder sb = new StringBuilder("view holder cannot have position -1 unless it is removed");
                sb.append(write());
                throw new IllegalStateException(sb.toString());
            }
            if (!onmediabuttoneventIconCompatParcelizer.shouldIgnore()) {
                onmediabuttoneventIconCompatParcelizer.saveOldPosition();
            }
        }
    }

    private void onSetCaptioningEnabled() {
        int iRemoteActionCompatParcelizer = this.MediaBrowserCompatSearchResultReceiver.RemoteActionCompatParcelizer();
        for (int i = 0; i < iRemoteActionCompatParcelizer; i++) {
            onMediaButtonEvent onmediabuttoneventIconCompatParcelizer = IconCompatParcelizer(this.MediaBrowserCompatSearchResultReceiver.AudioAttributesCompatParcelizer(i));
            if (!onmediabuttoneventIconCompatParcelizer.shouldIgnore()) {
                onmediabuttoneventIconCompatParcelizer.clearOldPosition();
            }
        }
        this.onRemoveQueueItemAt.IconCompatParcelizer();
    }

    final void AudioAttributesImplBaseParcelizer(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int iRemoteActionCompatParcelizer = this.MediaBrowserCompatSearchResultReceiver.RemoteActionCompatParcelizer();
        if (i < i2) {
            i5 = -1;
            i4 = i;
            i3 = i2;
        } else {
            i3 = i;
            i4 = i2;
            i5 = 1;
        }
        for (int i6 = 0; i6 < iRemoteActionCompatParcelizer; i6++) {
            onMediaButtonEvent onmediabuttoneventIconCompatParcelizer = IconCompatParcelizer(this.MediaBrowserCompatSearchResultReceiver.AudioAttributesCompatParcelizer(i6));
            if (onmediabuttoneventIconCompatParcelizer != null && onmediabuttoneventIconCompatParcelizer.mPosition >= i4 && onmediabuttoneventIconCompatParcelizer.mPosition <= i3) {
                if (AudioAttributesImplBaseParcelizer) {
                    Objects.toString(onmediabuttoneventIconCompatParcelizer);
                }
                if (onmediabuttoneventIconCompatParcelizer.mPosition == i) {
                    onmediabuttoneventIconCompatParcelizer.offsetPosition(i2 - i, false);
                } else {
                    onmediabuttoneventIconCompatParcelizer.offsetPosition(i5, false);
                }
                this.onPrepareFromUri.RatingCompat = true;
            }
        }
        this.onRemoveQueueItemAt.IconCompatParcelizer(i, i2);
        requestLayout();
    }

    final void read(int i, int i2) {
        int iRemoteActionCompatParcelizer = this.MediaBrowserCompatSearchResultReceiver.RemoteActionCompatParcelizer();
        for (int i3 = 0; i3 < iRemoteActionCompatParcelizer; i3++) {
            onMediaButtonEvent onmediabuttoneventIconCompatParcelizer = IconCompatParcelizer(this.MediaBrowserCompatSearchResultReceiver.AudioAttributesCompatParcelizer(i3));
            if (onmediabuttoneventIconCompatParcelizer != null && !onmediabuttoneventIconCompatParcelizer.shouldIgnore() && onmediabuttoneventIconCompatParcelizer.mPosition >= i) {
                if (AudioAttributesImplBaseParcelizer) {
                    Objects.toString(onmediabuttoneventIconCompatParcelizer);
                    int i4 = onmediabuttoneventIconCompatParcelizer.mPosition;
                }
                onmediabuttoneventIconCompatParcelizer.offsetPosition(i2, false);
                this.onPrepareFromUri.RatingCompat = true;
            }
        }
        this.onRemoveQueueItemAt.AudioAttributesCompatParcelizer(i, i2);
        requestLayout();
    }

    final void read(int i, int i2, boolean z) {
        int iRemoteActionCompatParcelizer = this.MediaBrowserCompatSearchResultReceiver.RemoteActionCompatParcelizer();
        for (int i3 = 0; i3 < iRemoteActionCompatParcelizer; i3++) {
            onMediaButtonEvent onmediabuttoneventIconCompatParcelizer = IconCompatParcelizer(this.MediaBrowserCompatSearchResultReceiver.AudioAttributesCompatParcelizer(i3));
            if (onmediabuttoneventIconCompatParcelizer != null && !onmediabuttoneventIconCompatParcelizer.shouldIgnore()) {
                if (onmediabuttoneventIconCompatParcelizer.mPosition >= i + i2) {
                    if (AudioAttributesImplBaseParcelizer) {
                        Objects.toString(onmediabuttoneventIconCompatParcelizer);
                        int i4 = onmediabuttoneventIconCompatParcelizer.mPosition;
                    }
                    onmediabuttoneventIconCompatParcelizer.offsetPosition(-i2, z);
                    this.onPrepareFromUri.RatingCompat = true;
                } else if (onmediabuttoneventIconCompatParcelizer.mPosition >= i) {
                    if (AudioAttributesImplBaseParcelizer) {
                        Objects.toString(onmediabuttoneventIconCompatParcelizer);
                    }
                    onmediabuttoneventIconCompatParcelizer.flagRemovedAndOffsetPosition(i - 1, -i2, z);
                    this.onPrepareFromUri.RatingCompat = true;
                }
            }
        }
        this.onRemoveQueueItemAt.read(i, i2, z);
        requestLayout();
    }

    final void IconCompatParcelizer(int i, int i2, Object obj) {
        int iRemoteActionCompatParcelizer = this.MediaBrowserCompatSearchResultReceiver.RemoteActionCompatParcelizer();
        for (int i3 = 0; i3 < iRemoteActionCompatParcelizer; i3++) {
            View viewAudioAttributesCompatParcelizer = this.MediaBrowserCompatSearchResultReceiver.AudioAttributesCompatParcelizer(i3);
            onMediaButtonEvent onmediabuttoneventIconCompatParcelizer = IconCompatParcelizer(viewAudioAttributesCompatParcelizer);
            if (onmediabuttoneventIconCompatParcelizer != null && !onmediabuttoneventIconCompatParcelizer.shouldIgnore() && onmediabuttoneventIconCompatParcelizer.mPosition >= i && onmediabuttoneventIconCompatParcelizer.mPosition < i + i2) {
                onmediabuttoneventIconCompatParcelizer.addFlags(2);
                onmediabuttoneventIconCompatParcelizer.addChangePayload(obj);
                ((LayoutParams) viewAudioAttributesCompatParcelizer.getLayoutParams()).AudioAttributesCompatParcelizer = true;
            }
        }
        this.onRemoveQueueItemAt.RemoteActionCompatParcelizer(i, i2);
    }

    final boolean write(onMediaButtonEvent onmediabuttonevent) {
        AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer = this.onCommand;
        return audioAttributesImplApi26Parcelizer == null || audioAttributesImplApi26Parcelizer.IconCompatParcelizer(onmediabuttonevent, onmediabuttonevent.getUnmodifiedPayloads());
    }

    final void IconCompatParcelizer(boolean z) {
        this.PlaybackStateCompat = z | this.PlaybackStateCompat;
        this.RatingCompat = true;
        PlaybackStateCompat();
    }

    private void PlaybackStateCompat() {
        int iRemoteActionCompatParcelizer = this.MediaBrowserCompatSearchResultReceiver.RemoteActionCompatParcelizer();
        for (int i = 0; i < iRemoteActionCompatParcelizer; i++) {
            onMediaButtonEvent onmediabuttoneventIconCompatParcelizer = IconCompatParcelizer(this.MediaBrowserCompatSearchResultReceiver.AudioAttributesCompatParcelizer(i));
            if (onmediabuttoneventIconCompatParcelizer != null && !onmediabuttoneventIconCompatParcelizer.shouldIgnore()) {
                onmediabuttoneventIconCompatParcelizer.addFlags(6);
            }
        }
        MediaSessionCompatToken();
        this.onRemoveQueueItemAt.MediaBrowserCompatItemReceiver();
    }

    public void setPreserveFocusAfterLayout(boolean z) {
        this.getSavedStateRegistryControllerannotations = z;
    }

    public final onMediaButtonEvent MediaBrowserCompatCustomActionResultReceiver(View view) {
        ViewParent parent = view.getParent();
        if (parent != null && parent != this) {
            StringBuilder sb = new StringBuilder("View ");
            sb.append(view);
            sb.append(" is not a direct child of ");
            sb.append(this);
            throw new IllegalArgumentException(sb.toString());
        }
        return IconCompatParcelizer(view);
    }

    public final View write(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = parent;
            parent = view.getParent();
        }
        if (parent == this) {
            return view;
        }
        return null;
    }

    private onMediaButtonEvent RatingCompat(View view) {
        View viewWrite = write(view);
        if (viewWrite == null) {
            return null;
        }
        return MediaBrowserCompatCustomActionResultReceiver(viewWrite);
    }

    public static onMediaButtonEvent IconCompatParcelizer(View view) {
        if (view == null) {
            return null;
        }
        return ((LayoutParams) view.getLayoutParams()).AudioAttributesImplBaseParcelizer;
    }

    public static int MediaBrowserCompatItemReceiver(View view) {
        onMediaButtonEvent onmediabuttoneventIconCompatParcelizer = IconCompatParcelizer(view);
        if (onmediabuttoneventIconCompatParcelizer != null) {
            return onmediabuttoneventIconCompatParcelizer.getAbsoluteAdapterPosition();
        }
        return -1;
    }

    public static int AudioAttributesImplBaseParcelizer(View view) {
        onMediaButtonEvent onmediabuttoneventIconCompatParcelizer = IconCompatParcelizer(view);
        if (onmediabuttoneventIconCompatParcelizer != null) {
            return onmediabuttoneventIconCompatParcelizer.getLayoutPosition();
        }
        return -1;
    }

    public final onMediaButtonEvent IconCompatParcelizer(int i) {
        return write(i, false);
    }

    private onMediaButtonEvent MediaBrowserCompatSearchResultReceiver(int i) {
        onMediaButtonEvent onmediabuttonevent = null;
        if (this.RatingCompat) {
            return null;
        }
        int iRemoteActionCompatParcelizer = this.MediaBrowserCompatSearchResultReceiver.RemoteActionCompatParcelizer();
        for (int i2 = 0; i2 < iRemoteActionCompatParcelizer; i2++) {
            onMediaButtonEvent onmediabuttoneventIconCompatParcelizer = IconCompatParcelizer(this.MediaBrowserCompatSearchResultReceiver.AudioAttributesCompatParcelizer(i2));
            if (onmediabuttoneventIconCompatParcelizer != null && !onmediabuttoneventIconCompatParcelizer.isRemoved() && RemoteActionCompatParcelizer(onmediabuttoneventIconCompatParcelizer) == i) {
                if (!this.MediaBrowserCompatSearchResultReceiver.IconCompatParcelizer(onmediabuttoneventIconCompatParcelizer.itemView)) {
                    return onmediabuttoneventIconCompatParcelizer;
                }
                onmediabuttonevent = onmediabuttoneventIconCompatParcelizer;
            }
        }
        return onmediabuttonevent;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final androidx.recyclerview.widget.RecyclerView.onMediaButtonEvent write(int r6, boolean r7) {
        /*
            r5 = this;
            o.TypesKt r0 = r5.MediaBrowserCompatSearchResultReceiver
            int r0 = r0.RemoteActionCompatParcelizer()
            r1 = 0
            r2 = 0
        L8:
            if (r2 >= r0) goto L3a
            o.TypesKt r3 = r5.MediaBrowserCompatSearchResultReceiver
            android.view.View r3 = r3.AudioAttributesCompatParcelizer(r2)
            androidx.recyclerview.widget.RecyclerView$onMediaButtonEvent r3 = IconCompatParcelizer(r3)
            if (r3 == 0) goto L37
            boolean r4 = r3.isRemoved()
            if (r4 != 0) goto L37
            if (r7 == 0) goto L23
            int r4 = r3.mPosition
            if (r4 == r6) goto L2a
            goto L37
        L23:
            int r4 = r3.getLayoutPosition()
            if (r4 == r6) goto L2a
            goto L37
        L2a:
            o.TypesKt r1 = r5.MediaBrowserCompatSearchResultReceiver
            android.view.View r4 = r3.itemView
            boolean r1 = r1.IconCompatParcelizer(r4)
            if (r1 == 0) goto L36
            r1 = r3
            goto L37
        L36:
            return r3
        L37:
            int r2 = r2 + 1
            goto L8
        L3a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.write(int, boolean):androidx.recyclerview.widget.RecyclerView$onMediaButtonEvent");
    }

    private onMediaButtonEvent write(long j) {
        IconCompatParcelizer iconCompatParcelizer = this.MediaBrowserCompatItemReceiver;
        onMediaButtonEvent onmediabuttonevent = null;
        if (iconCompatParcelizer != null && iconCompatParcelizer.hasStableIds()) {
            int iRemoteActionCompatParcelizer = this.MediaBrowserCompatSearchResultReceiver.RemoteActionCompatParcelizer();
            for (int i = 0; i < iRemoteActionCompatParcelizer; i++) {
                onMediaButtonEvent onmediabuttoneventIconCompatParcelizer = IconCompatParcelizer(this.MediaBrowserCompatSearchResultReceiver.AudioAttributesCompatParcelizer(i));
                if (onmediabuttoneventIconCompatParcelizer != null && !onmediabuttoneventIconCompatParcelizer.isRemoved() && onmediabuttoneventIconCompatParcelizer.getItemId() == j) {
                    if (!this.MediaBrowserCompatSearchResultReceiver.IconCompatParcelizer(onmediabuttoneventIconCompatParcelizer.itemView)) {
                        return onmediabuttoneventIconCompatParcelizer;
                    }
                    onmediabuttonevent = onmediabuttoneventIconCompatParcelizer;
                }
            }
        }
        return onmediabuttonevent;
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    public final void AudioAttributesImplApi26Parcelizer(int i) {
        int i2 = this.MediaBrowserCompatSearchResultReceiver.read();
        for (int i3 = 0; i3 < i2; i3++) {
            this.MediaBrowserCompatSearchResultReceiver.read(i3).offsetTopAndBottom(i);
        }
    }

    public final void AudioAttributesCompatParcelizer(int i) {
        int i2 = this.MediaBrowserCompatSearchResultReceiver.read();
        for (int i3 = 0; i3 < i2; i3++) {
            this.MediaBrowserCompatSearchResultReceiver.read(i3).offsetLeftAndRight(i);
        }
    }

    static void read(View view, Rect rect) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        Rect rect2 = layoutParams.RemoteActionCompatParcelizer;
        int left = view.getLeft();
        int i = rect2.left;
        int i2 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
        int top = view.getTop();
        int i3 = rect2.top;
        int i4 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
        int right = view.getRight();
        int i5 = rect2.right;
        rect.set((left - i) - i2, (top - i3) - i4, right + i5 + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
    }

    final Rect AudioAttributesImplApi21Parcelizer(View view) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (!layoutParams.AudioAttributesCompatParcelizer) {
            return layoutParams.RemoteActionCompatParcelizer;
        }
        if (this.onPrepareFromUri.write() && (layoutParams.P_() || layoutParams.R_())) {
            return layoutParams.RemoteActionCompatParcelizer;
        }
        Rect rect = layoutParams.RemoteActionCompatParcelizer;
        rect.set(0, 0, 0, 0);
        int size = this.onPause.size();
        for (int i = 0; i < size; i++) {
            this.onSetPlaybackSpeed.set(0, 0, 0, 0);
            this.onPause.get(i).IconCompatParcelizer(this.onSetPlaybackSpeed, view, this, this.onPrepareFromUri);
            rect.left += this.onSetPlaybackSpeed.left;
            rect.top += this.onSetPlaybackSpeed.top;
            rect.right += this.onSetPlaybackSpeed.right;
            rect.bottom += this.onSetPlaybackSpeed.bottom;
        }
        layoutParams.AudioAttributesCompatParcelizer = false;
        return rect;
    }

    final void write(int i, int i2) {
        this.MediaSessionCompatToken++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i, scrollY - i2);
        MediaBrowserCompatSearchResultReceiver mediaBrowserCompatSearchResultReceiver = this.addOnConfigurationChangedListener;
        if (mediaBrowserCompatSearchResultReceiver != null) {
            mediaBrowserCompatSearchResultReceiver.RemoteActionCompatParcelizer(this, i, i2);
        }
        List<MediaBrowserCompatSearchResultReceiver> list = this.addOnContextAvailableListener;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.addOnContextAvailableListener.get(size).RemoteActionCompatParcelizer(this, i, i2);
            }
        }
        this.MediaSessionCompatToken--;
    }

    private float MediaBrowserCompatMediaItem(int i) {
        double dLog = Math.log((Math.abs(i) * 0.35f) / (this.addContentView * 0.015f));
        double d = RemoteActionCompatParcelizer;
        return (float) (((double) (this.addContentView * 0.015f)) * Math.exp((d / (d - 1.0d)) * dLog));
    }

    private void MediaMetadataCompat(int i) {
        MediaBrowserCompatItemReceiver mediaBrowserCompatItemReceiver = this.onPlayFromMediaId;
        if (mediaBrowserCompatItemReceiver != null) {
            mediaBrowserCompatItemReceiver.MediaBrowserCompatItemReceiver(i);
        }
        MediaBrowserCompatSearchResultReceiver mediaBrowserCompatSearchResultReceiver = this.addOnConfigurationChangedListener;
        if (mediaBrowserCompatSearchResultReceiver != null) {
            mediaBrowserCompatSearchResultReceiver.AudioAttributesCompatParcelizer(this, i);
        }
        List<MediaBrowserCompatSearchResultReceiver> list = this.addOnContextAvailableListener;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.addOnContextAvailableListener.get(size).AudioAttributesCompatParcelizer(this, i);
            }
        }
    }

    public final boolean MediaDescriptionCompat() {
        return !this.onCustomAction || this.RatingCompat || this.MediaMetadataCompat.read();
    }

    class onFastForward implements Runnable {
        OverScroller AudioAttributesCompatParcelizer;
        private int AudioAttributesImplBaseParcelizer;
        private int read;
        private Interpolator RemoteActionCompatParcelizer = RecyclerView.MediaBrowserCompatCustomActionResultReceiver;
        private boolean write = false;
        private boolean MediaBrowserCompatItemReceiver = false;

        onFastForward() {
            this.AudioAttributesCompatParcelizer = new OverScroller(RecyclerView.this.getContext(), RecyclerView.MediaBrowserCompatCustomActionResultReceiver);
        }

        @Override // java.lang.Runnable
        public final void run() {
            int i;
            int i2;
            if (RecyclerView.this.onPlayFromMediaId == null) {
                read();
                return;
            }
            this.MediaBrowserCompatItemReceiver = false;
            this.write = true;
            RecyclerView.this.read();
            OverScroller overScroller = this.AudioAttributesCompatParcelizer;
            if (overScroller.computeScrollOffset()) {
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int i3 = this.read;
                int i4 = this.AudioAttributesImplBaseParcelizer;
                this.read = currX;
                this.AudioAttributesImplBaseParcelizer = currY;
                int iRemoteActionCompatParcelizer = RecyclerView.this.RemoteActionCompatParcelizer(currX - i3);
                int i5 = RecyclerView.this.read(currY - i4);
                RecyclerView.this.onRemoveQueueItem[0] = 0;
                RecyclerView.this.onRemoveQueueItem[1] = 0;
                RecyclerView recyclerView = RecyclerView.this;
                if (recyclerView.write(iRemoteActionCompatParcelizer, i5, recyclerView.onRemoveQueueItem, (int[]) null, 1)) {
                    iRemoteActionCompatParcelizer -= RecyclerView.this.onRemoveQueueItem[0];
                    i5 -= RecyclerView.this.onRemoveQueueItem[1];
                }
                if (RecyclerView.this.getOverScrollMode() != 2) {
                    RecyclerView.this.RemoteActionCompatParcelizer(iRemoteActionCompatParcelizer, i5);
                }
                if (RecyclerView.this.MediaBrowserCompatItemReceiver != null) {
                    RecyclerView.this.onRemoveQueueItem[0] = 0;
                    RecyclerView.this.onRemoveQueueItem[1] = 0;
                    RecyclerView recyclerView2 = RecyclerView.this;
                    recyclerView2.AudioAttributesCompatParcelizer(iRemoteActionCompatParcelizer, i5, recyclerView2.onRemoveQueueItem);
                    i = RecyclerView.this.onRemoveQueueItem[0];
                    i2 = RecyclerView.this.onRemoveQueueItem[1];
                    iRemoteActionCompatParcelizer -= i;
                    i5 -= i2;
                    onCustomAction oncustomaction = RecyclerView.this.onPlayFromMediaId.MediaDescriptionCompat;
                    if (oncustomaction != null && !oncustomaction.IconCompatParcelizer() && oncustomaction.MediaBrowserCompatCustomActionResultReceiver()) {
                        int i6 = RecyclerView.this.onPrepareFromUri.read();
                        if (i6 == 0) {
                            oncustomaction.MediaBrowserCompatItemReceiver();
                        } else {
                            if (oncustomaction.write() >= i6) {
                                oncustomaction.RemoteActionCompatParcelizer(i6 - 1);
                            }
                            oncustomaction.RemoteActionCompatParcelizer(i, i2);
                        }
                    }
                } else {
                    i = 0;
                    i2 = 0;
                }
                if (!RecyclerView.this.onPause.isEmpty()) {
                    RecyclerView.this.invalidate();
                }
                RecyclerView.this.onRemoveQueueItem[0] = 0;
                RecyclerView.this.onRemoveQueueItem[1] = 0;
                RecyclerView recyclerView3 = RecyclerView.this;
                recyclerView3.write(i, i2, iRemoteActionCompatParcelizer, i5, null, 1, recyclerView3.onRemoveQueueItem);
                int i7 = iRemoteActionCompatParcelizer - RecyclerView.this.onRemoveQueueItem[0];
                int i8 = i5 - RecyclerView.this.onRemoveQueueItem[1];
                if (i != 0 || i2 != 0) {
                    RecyclerView.this.write(i, i2);
                }
                if (!RecyclerView.this.awakenScrollBars()) {
                    RecyclerView.this.invalidate();
                }
                boolean z = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i7 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i8 != 0));
                onCustomAction oncustomaction2 = RecyclerView.this.onPlayFromMediaId.MediaDescriptionCompat;
                if ((oncustomaction2 == null || !oncustomaction2.IconCompatParcelizer()) && z) {
                    if (RecyclerView.this.getOverScrollMode() != 2) {
                        int currVelocity = (int) overScroller.getCurrVelocity();
                        int i9 = i7 < 0 ? -currVelocity : i7 > 0 ? currVelocity : 0;
                        if (i8 < 0) {
                            currVelocity = -currVelocity;
                        } else if (i8 <= 0) {
                            currVelocity = 0;
                        }
                        RecyclerView.this.AudioAttributesCompatParcelizer(i9, currVelocity);
                    }
                    if (RecyclerView.IconCompatParcelizer) {
                        RecyclerView.this.onPlayFromSearch.RemoteActionCompatParcelizer();
                    }
                } else {
                    AudioAttributesCompatParcelizer();
                    if (RecyclerView.this.onAddQueueItem != null) {
                        RecyclerView.this.onAddQueueItem.AudioAttributesCompatParcelizer(RecyclerView.this, i, i2);
                    }
                }
            }
            onCustomAction oncustomaction3 = RecyclerView.this.onPlayFromMediaId.MediaDescriptionCompat;
            if (oncustomaction3 != null && oncustomaction3.IconCompatParcelizer()) {
                oncustomaction3.RemoteActionCompatParcelizer(0, 0);
            }
            this.write = false;
            if (this.MediaBrowserCompatItemReceiver) {
                RemoteActionCompatParcelizer();
            } else {
                RecyclerView.this.MediaBrowserCompatItemReceiver(0);
                RecyclerView.this.MediaBrowserCompatCustomActionResultReceiver(1);
            }
        }

        final void AudioAttributesCompatParcelizer() {
            if (this.write) {
                this.MediaBrowserCompatItemReceiver = true;
            } else {
                RemoteActionCompatParcelizer();
            }
        }

        private void RemoteActionCompatParcelizer() {
            RecyclerView.this.removeCallbacks(this);
            InvalidTypeIdException.AudioAttributesCompatParcelizer(RecyclerView.this, this);
        }

        public final void RemoteActionCompatParcelizer(int i, int i2) {
            RecyclerView.this.MediaBrowserCompatItemReceiver(2);
            this.AudioAttributesImplBaseParcelizer = 0;
            this.read = 0;
            if (this.RemoteActionCompatParcelizer != RecyclerView.MediaBrowserCompatCustomActionResultReceiver) {
                this.RemoteActionCompatParcelizer = RecyclerView.MediaBrowserCompatCustomActionResultReceiver;
                this.AudioAttributesCompatParcelizer = new OverScroller(RecyclerView.this.getContext(), RecyclerView.MediaBrowserCompatCustomActionResultReceiver);
            }
            this.AudioAttributesCompatParcelizer.fling(0, 0, i, i2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
            AudioAttributesCompatParcelizer();
        }

        public final void RemoteActionCompatParcelizer(int i, int i2, int i3, Interpolator interpolator) {
            if (i3 == Integer.MIN_VALUE) {
                i3 = AudioAttributesCompatParcelizer(i, i2);
            }
            int i4 = i3;
            if (interpolator == null) {
                interpolator = RecyclerView.MediaBrowserCompatCustomActionResultReceiver;
            }
            if (this.RemoteActionCompatParcelizer != interpolator) {
                this.RemoteActionCompatParcelizer = interpolator;
                this.AudioAttributesCompatParcelizer = new OverScroller(RecyclerView.this.getContext(), interpolator);
            }
            this.AudioAttributesImplBaseParcelizer = 0;
            this.read = 0;
            RecyclerView.this.MediaBrowserCompatItemReceiver(2);
            this.AudioAttributesCompatParcelizer.startScroll(0, 0, i, i2, i4);
            AudioAttributesCompatParcelizer();
        }

        private int AudioAttributesCompatParcelizer(int i, int i2) {
            int iAbs = Math.abs(i);
            int iAbs2 = Math.abs(i2);
            boolean z = iAbs > iAbs2;
            RecyclerView recyclerView = RecyclerView.this;
            int width = z ? recyclerView.getWidth() : recyclerView.getHeight();
            if (!z) {
                iAbs = iAbs2;
            }
            return Math.min((int) (((iAbs / width) + 1.0f) * 300.0f), 2000);
        }

        public final void read() {
            RecyclerView.this.removeCallbacks(this);
            this.AudioAttributesCompatParcelizer.abortAnimation();
        }
    }

    private void ParcelableVolumeInfo() {
        int i = this.MediaBrowserCompatSearchResultReceiver.read();
        for (int i2 = 0; i2 < i; i2++) {
            View view = this.MediaBrowserCompatSearchResultReceiver.read(i2);
            onMediaButtonEvent onmediabuttoneventMediaBrowserCompatCustomActionResultReceiver = MediaBrowserCompatCustomActionResultReceiver(view);
            if (onmediabuttoneventMediaBrowserCompatCustomActionResultReceiver != null && onmediabuttoneventMediaBrowserCompatCustomActionResultReceiver.mShadowingHolder != null) {
                View view2 = onmediabuttoneventMediaBrowserCompatCustomActionResultReceiver.mShadowingHolder.itemView;
                int left = view.getLeft();
                int top = view.getTop();
                if (left != view2.getLeft() || top != view2.getTop()) {
                    view2.layout(left, top, view2.getWidth() + left, view2.getHeight() + top);
                }
            }
        }
    }

    class onCommand extends read {
        onCommand() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.read
        public final void read() {
            RecyclerView.this.write((String) null);
            RecyclerView.this.onPrepareFromUri.RatingCompat = true;
            RecyclerView.this.IconCompatParcelizer(true);
            if (RecyclerView.this.MediaMetadataCompat.read()) {
                return;
            }
            RecyclerView.this.requestLayout();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.read
        public final void AudioAttributesCompatParcelizer(int i, int i2, Object obj) {
            RecyclerView.this.write((String) null);
            if (RecyclerView.this.MediaMetadataCompat.IconCompatParcelizer(i, i2, obj)) {
                write();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.read
        public final void AudioAttributesCompatParcelizer(int i, int i2) {
            RecyclerView.this.write((String) null);
            if (RecyclerView.this.MediaMetadataCompat.IconCompatParcelizer(i, i2)) {
                write();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.read
        public final void read(int i, int i2) {
            RecyclerView.this.write((String) null);
            if (RecyclerView.this.MediaMetadataCompat.write(i, i2)) {
                write();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.read
        public final void RemoteActionCompatParcelizer(int i, int i2) {
            RecyclerView.this.write((String) null);
            if (RecyclerView.this.MediaMetadataCompat.read(i, i2, 1)) {
                write();
            }
        }

        private void write() {
            if (RecyclerView.AudioAttributesCompatParcelizer && RecyclerView.this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver && RecyclerView.this.handleMediaPlayPauseIfPendingOnHandler) {
                RecyclerView recyclerView = RecyclerView.this;
                InvalidTypeIdException.AudioAttributesCompatParcelizer(recyclerView, recyclerView.onSetShuffleMode);
            } else {
                RecyclerView.this.MediaBrowserCompatMediaItem = true;
                RecyclerView.this.requestLayout();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.read
        public final void IconCompatParcelizer() {
            IconCompatParcelizer iconCompatParcelizer;
            if (RecyclerView.this.onPrepareFromMediaId == null || (iconCompatParcelizer = RecyclerView.this.MediaBrowserCompatItemReceiver) == null || !iconCompatParcelizer.canRestoreState()) {
                return;
            }
            RecyclerView.this.requestLayout();
        }
    }

    public static class RemoteActionCompatParcelizer {
        protected EdgeEffect RemoteActionCompatParcelizer(RecyclerView recyclerView) {
            return new EdgeEffect(recyclerView.getContext());
        }
    }

    static class handleMediaPlayPauseIfPendingOnHandler extends RemoteActionCompatParcelizer {
        handleMediaPlayPauseIfPendingOnHandler() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.RemoteActionCompatParcelizer
        protected final EdgeEffect RemoteActionCompatParcelizer(RecyclerView recyclerView) {
            return new EdgeEffect(recyclerView.getContext());
        }
    }

    public static class MediaMetadataCompat {
        private SparseArray<write> read = new SparseArray<>();
        private int write = 0;
        private Set<IconCompatParcelizer<?>> RemoteActionCompatParcelizer = Collections.newSetFromMap(new IdentityHashMap());

        static class write {
            final ArrayList<onMediaButtonEvent> write = new ArrayList<>();
            int AudioAttributesCompatParcelizer = 5;
            long IconCompatParcelizer = 0;
            long read = 0;

            write() {
            }
        }

        public void AudioAttributesCompatParcelizer() {
            for (int i = 0; i < this.read.size(); i++) {
                write writeVarValueAt = this.read.valueAt(i);
                Iterator<onMediaButtonEvent> it = writeVarValueAt.write.iterator();
                while (it.hasNext()) {
                    createPrimordial.AudioAttributesCompatParcelizer(it.next().itemView);
                }
                writeVarValueAt.write.clear();
            }
        }

        public onMediaButtonEvent IconCompatParcelizer(int i) {
            write writeVar = this.read.get(i);
            if (writeVar == null || writeVar.write.isEmpty()) {
                return null;
            }
            ArrayList<onMediaButtonEvent> arrayList = writeVar.write;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (!arrayList.get(size).isAttachedToTransitionOverlay()) {
                    return arrayList.remove(size);
                }
            }
            return null;
        }

        public void AudioAttributesCompatParcelizer(onMediaButtonEvent onmediabuttonevent) {
            int itemViewType = onmediabuttonevent.getItemViewType();
            ArrayList<onMediaButtonEvent> arrayList = RemoteActionCompatParcelizer(itemViewType).write;
            if (this.read.get(itemViewType).AudioAttributesCompatParcelizer <= arrayList.size()) {
                createPrimordial.AudioAttributesCompatParcelizer(onmediabuttonevent.itemView);
            } else {
                if (RecyclerView.AudioAttributesImplApi26Parcelizer && arrayList.contains(onmediabuttonevent)) {
                    throw new IllegalArgumentException("this scrap item already exists");
                }
                onmediabuttonevent.resetInternal();
                arrayList.add(onmediabuttonevent);
            }
        }

        private static long write(long j, long j2) {
            return j == 0 ? j2 : ((j / 4) * 3) + (j2 / 4);
        }

        final void IconCompatParcelizer(int i, long j) {
            write writeVarRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(i);
            writeVarRemoteActionCompatParcelizer.IconCompatParcelizer = write(writeVarRemoteActionCompatParcelizer.IconCompatParcelizer, j);
        }

        final void write(int i, long j) {
            write writeVarRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(i);
            writeVarRemoteActionCompatParcelizer.read = write(writeVarRemoteActionCompatParcelizer.read, j);
        }

        final boolean write(int i, long j, long j2) {
            long j3 = RemoteActionCompatParcelizer(i).IconCompatParcelizer;
            return j3 == 0 || j + j3 < j2;
        }

        final boolean read(int i, long j, long j2) {
            long j3 = RemoteActionCompatParcelizer(i).read;
            return j3 == 0 || j + j3 < j2;
        }

        final void write() {
            this.write++;
        }

        final void RemoteActionCompatParcelizer() {
            this.write--;
        }

        final void IconCompatParcelizer(IconCompatParcelizer<?> iconCompatParcelizer) {
            this.RemoteActionCompatParcelizer.add(iconCompatParcelizer);
        }

        final void IconCompatParcelizer(IconCompatParcelizer<?> iconCompatParcelizer, boolean z) {
            this.RemoteActionCompatParcelizer.remove(iconCompatParcelizer);
            if (this.RemoteActionCompatParcelizer.size() != 0 || z) {
                return;
            }
            for (int i = 0; i < this.read.size(); i++) {
                SparseArray<write> sparseArray = this.read;
                ArrayList<onMediaButtonEvent> arrayList = sparseArray.get(sparseArray.keyAt(i)).write;
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    createPrimordial.AudioAttributesCompatParcelizer(arrayList.get(i2).itemView);
                }
            }
        }

        final void IconCompatParcelizer(IconCompatParcelizer<?> iconCompatParcelizer, IconCompatParcelizer<?> iconCompatParcelizer2, boolean z) {
            if (iconCompatParcelizer != null) {
                RemoteActionCompatParcelizer();
            }
            if (!z && this.write == 0) {
                AudioAttributesCompatParcelizer();
            }
            if (iconCompatParcelizer2 != null) {
                write();
            }
        }

        private write RemoteActionCompatParcelizer(int i) {
            write writeVar = this.read.get(i);
            if (writeVar != null) {
                return writeVar;
            }
            write writeVar2 = new write();
            this.read.put(i, writeVar2);
            return writeVar2;
        }
    }

    static RecyclerView AudioAttributesCompatParcelizer(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            RecyclerView recyclerViewAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(viewGroup.getChildAt(i));
            if (recyclerViewAudioAttributesCompatParcelizer != null) {
                return recyclerViewAudioAttributesCompatParcelizer;
            }
        }
        return null;
    }

    static void read(onMediaButtonEvent onmediabuttonevent) {
        if (onmediabuttonevent.mNestedRecyclerView != null) {
            RecyclerView recyclerView = onmediabuttonevent.mNestedRecyclerView.get();
            while (recyclerView != null) {
                if (recyclerView == onmediabuttonevent.itemView) {
                    return;
                }
                Object parent = recyclerView.getParent();
                recyclerView = parent instanceof View ? (View) parent : null;
            }
            onmediabuttonevent.mNestedRecyclerView = null;
        }
    }

    public static long MediaBrowserCompatItemReceiver() {
        if (IconCompatParcelizer) {
            return System.nanoTime();
        }
        return 0L;
    }

    public final class MediaDescriptionCompat {
        final ArrayList<onMediaButtonEvent> AudioAttributesCompatParcelizer;
        private int AudioAttributesImplApi21Parcelizer;
        private onPlayFromMediaId AudioAttributesImplApi26Parcelizer;
        private int AudioAttributesImplBaseParcelizer;
        private MediaMetadataCompat IconCompatParcelizer;
        private final List<onMediaButtonEvent> MediaBrowserCompatItemReceiver;
        ArrayList<onMediaButtonEvent> read;
        final ArrayList<onMediaButtonEvent> write;

        public MediaDescriptionCompat() {
            ArrayList<onMediaButtonEvent> arrayList = new ArrayList<>();
            this.write = arrayList;
            this.read = null;
            this.AudioAttributesCompatParcelizer = new ArrayList<>();
            this.MediaBrowserCompatItemReceiver = Collections.unmodifiableList(arrayList);
            this.AudioAttributesImplBaseParcelizer = 2;
            this.AudioAttributesImplApi21Parcelizer = 2;
        }

        public final void write() {
            this.write.clear();
            MediaDescriptionCompat();
        }

        public final void write(int i) {
            this.AudioAttributesImplBaseParcelizer = i;
            RatingCompat();
        }

        public final void RatingCompat() {
            this.AudioAttributesImplApi21Parcelizer = this.AudioAttributesImplBaseParcelizer + (RecyclerView.this.onPlayFromMediaId != null ? RecyclerView.this.onPlayFromMediaId.AudioAttributesImplApi26Parcelizer : 0);
            for (int size = this.AudioAttributesCompatParcelizer.size() - 1; size >= 0 && this.AudioAttributesCompatParcelizer.size() > this.AudioAttributesImplApi21Parcelizer; size--) {
                MediaBrowserCompatCustomActionResultReceiver(size);
            }
        }

        public final List<onMediaButtonEvent> AudioAttributesImplApi21Parcelizer() {
            return this.MediaBrowserCompatItemReceiver;
        }

        private boolean IconCompatParcelizer(onMediaButtonEvent onmediabuttonevent) {
            if (onmediabuttonevent.isRemoved()) {
                if (RecyclerView.AudioAttributesImplApi26Parcelizer && !RecyclerView.this.onPrepareFromUri.write()) {
                    StringBuilder sb = new StringBuilder("should not receive a removed view unless it is pre layout");
                    sb.append(RecyclerView.this.write());
                    throw new IllegalStateException(sb.toString());
                }
                return RecyclerView.this.onPrepareFromUri.write();
            }
            if (onmediabuttonevent.mPosition < 0 || onmediabuttonevent.mPosition >= RecyclerView.this.MediaBrowserCompatItemReceiver.getItemCount()) {
                StringBuilder sb2 = new StringBuilder("Inconsistency detected. Invalid view holder adapter position");
                sb2.append(onmediabuttonevent);
                sb2.append(RecyclerView.this.write());
                throw new IndexOutOfBoundsException(sb2.toString());
            }
            if (RecyclerView.this.onPrepareFromUri.write() || RecyclerView.this.MediaBrowserCompatItemReceiver.getItemViewType(onmediabuttonevent.mPosition) == onmediabuttonevent.getItemViewType()) {
                return !RecyclerView.this.MediaBrowserCompatItemReceiver.hasStableIds() || onmediabuttonevent.getItemId() == RecyclerView.this.MediaBrowserCompatItemReceiver.getItemId(onmediabuttonevent.mPosition);
            }
            return false;
        }

        private boolean IconCompatParcelizer(onMediaButtonEvent onmediabuttonevent, int i, int i2, long j) {
            onmediabuttonevent.mBindingAdapter = null;
            onmediabuttonevent.mOwnerRecyclerView = RecyclerView.this;
            int itemViewType = onmediabuttonevent.getItemViewType();
            long jMediaBrowserCompatItemReceiver = RecyclerView.MediaBrowserCompatItemReceiver();
            boolean z = false;
            if (j != Long.MAX_VALUE && !this.IconCompatParcelizer.read(itemViewType, jMediaBrowserCompatItemReceiver, j)) {
                return false;
            }
            if (onmediabuttonevent.isTmpDetached()) {
                RecyclerView.this.attachViewToParent(onmediabuttonevent.itemView, RecyclerView.this.getChildCount(), onmediabuttonevent.itemView.getLayoutParams());
                z = true;
            }
            RecyclerView.this.MediaBrowserCompatItemReceiver.bindViewHolder(onmediabuttonevent, i);
            if (z) {
                RecyclerView.this.detachViewFromParent(onmediabuttonevent.itemView);
            }
            this.IconCompatParcelizer.write(onmediabuttonevent.getItemViewType(), RecyclerView.MediaBrowserCompatItemReceiver() - jMediaBrowserCompatItemReceiver);
            write(onmediabuttonevent);
            if (RecyclerView.this.onPrepareFromUri.write()) {
                onmediabuttonevent.mPreLayoutPosition = i2;
            }
            return true;
        }

        public final void write(View view, int i) {
            LayoutParams layoutParams;
            onMediaButtonEvent onmediabuttoneventIconCompatParcelizer = RecyclerView.IconCompatParcelizer(view);
            if (onmediabuttoneventIconCompatParcelizer == null) {
                StringBuilder sb = new StringBuilder("The view does not have a ViewHolder. You cannot pass arbitrary views to this method, they should be created by the Adapter");
                sb.append(RecyclerView.this.write());
                throw new IllegalArgumentException(sb.toString());
            }
            int iWrite = RecyclerView.this.MediaMetadataCompat.write(i);
            if (iWrite < 0 || iWrite >= RecyclerView.this.MediaBrowserCompatItemReceiver.getItemCount()) {
                StringBuilder sb2 = new StringBuilder("Inconsistency detected. Invalid item position ");
                sb2.append(i);
                sb2.append("(offset:");
                sb2.append(iWrite);
                sb2.append(").state:");
                sb2.append(RecyclerView.this.onPrepareFromUri.read());
                sb2.append(RecyclerView.this.write());
                throw new IndexOutOfBoundsException(sb2.toString());
            }
            IconCompatParcelizer(onmediabuttoneventIconCompatParcelizer, iWrite, i, Long.MAX_VALUE);
            ViewGroup.LayoutParams layoutParams2 = onmediabuttoneventIconCompatParcelizer.itemView.getLayoutParams();
            if (layoutParams2 == null) {
                layoutParams = (LayoutParams) RecyclerView.this.generateDefaultLayoutParams();
                onmediabuttoneventIconCompatParcelizer.itemView.setLayoutParams(layoutParams);
            } else if (!RecyclerView.this.checkLayoutParams(layoutParams2)) {
                layoutParams = (LayoutParams) RecyclerView.this.generateLayoutParams(layoutParams2);
                onmediabuttoneventIconCompatParcelizer.itemView.setLayoutParams(layoutParams);
            } else {
                layoutParams = (LayoutParams) layoutParams2;
            }
            layoutParams.AudioAttributesCompatParcelizer = true;
            layoutParams.AudioAttributesImplBaseParcelizer = onmediabuttoneventIconCompatParcelizer;
            layoutParams.write = onmediabuttoneventIconCompatParcelizer.itemView.getParent() == null;
        }

        public final int AudioAttributesCompatParcelizer(int i) {
            if (i >= 0 && i < RecyclerView.this.onPrepareFromUri.read()) {
                return !RecyclerView.this.onPrepareFromUri.write() ? i : RecyclerView.this.MediaMetadataCompat.write(i);
            }
            StringBuilder sb = new StringBuilder("invalid position ");
            sb.append(i);
            sb.append(". State item count is ");
            sb.append(RecyclerView.this.onPrepareFromUri.read());
            sb.append(RecyclerView.this.write());
            throw new IndexOutOfBoundsException(sb.toString());
        }

        public final View RemoteActionCompatParcelizer(int i) {
            return AudioAttributesImplBaseParcelizer(i);
        }

        private View AudioAttributesImplBaseParcelizer(int i) {
            return read(i, false, Long.MAX_VALUE).itemView;
        }

        /* JADX WARN: Removed duplicated region for block: B:100:0x021f  */
        /* JADX WARN: Removed duplicated region for block: B:106:0x023b A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:108:0x023e  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0058  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x005b  */
        /* JADX WARN: Removed duplicated region for block: B:76:0x0190  */
        /* JADX WARN: Removed duplicated region for block: B:82:0x01ba  */
        /* JADX WARN: Removed duplicated region for block: B:99:0x0211  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final androidx.recyclerview.widget.RecyclerView.onMediaButtonEvent read(int r18, boolean r19, long r20) {
            /*
                Method dump skipped, instruction units count: 631
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.MediaDescriptionCompat.read(int, boolean, long):androidx.recyclerview.widget.RecyclerView$onMediaButtonEvent");
        }

        private void write(onMediaButtonEvent onmediabuttonevent) {
            if (RecyclerView.this.MediaBrowserCompatSearchResultReceiver()) {
                View view = onmediabuttonevent.itemView;
                if (InvalidTypeIdException.MediaBrowserCompatItemReceiver(view) == 0) {
                    InvalidTypeIdException.AudioAttributesImplBaseParcelizer(view, 1);
                }
                if (RecyclerView.this.AudioAttributesImplApi21Parcelizer != null) {
                    deserializeUsingCustom deserializeusingcustomIconCompatParcelizer = RecyclerView.this.AudioAttributesImplApi21Parcelizer.IconCompatParcelizer();
                    if (deserializeusingcustomIconCompatParcelizer instanceof UIntKeyDeserializer.write) {
                        ((UIntKeyDeserializer.write) deserializeusingcustomIconCompatParcelizer).AudioAttributesCompatParcelizer(view);
                    }
                    InvalidTypeIdException.AudioAttributesCompatParcelizer(view, deserializeusingcustomIconCompatParcelizer);
                }
            }
        }

        public final void write(View view) {
            onMediaButtonEvent onmediabuttoneventIconCompatParcelizer = RecyclerView.IconCompatParcelizer(view);
            if (onmediabuttoneventIconCompatParcelizer.isTmpDetached()) {
                RecyclerView.this.removeDetachedView(view, false);
            }
            if (onmediabuttoneventIconCompatParcelizer.isScrap()) {
                onmediabuttoneventIconCompatParcelizer.unScrap();
            } else if (onmediabuttoneventIconCompatParcelizer.wasReturnedFromScrap()) {
                onmediabuttoneventIconCompatParcelizer.clearReturnedFromScrapFlag();
            }
            read(onmediabuttoneventIconCompatParcelizer);
            if (RecyclerView.this.onCommand == null || onmediabuttoneventIconCompatParcelizer.isRecyclable()) {
                return;
            }
            RecyclerView.this.onCommand.write(onmediabuttoneventIconCompatParcelizer);
        }

        private void MediaDescriptionCompat() {
            for (int size = this.AudioAttributesCompatParcelizer.size() - 1; size >= 0; size--) {
                MediaBrowserCompatCustomActionResultReceiver(size);
            }
            this.AudioAttributesCompatParcelizer.clear();
            if (RecyclerView.IconCompatParcelizer) {
                RecyclerView.this.onPlayFromSearch.RemoteActionCompatParcelizer();
            }
        }

        private void MediaBrowserCompatCustomActionResultReceiver(int i) {
            boolean z = RecyclerView.AudioAttributesImplBaseParcelizer;
            onMediaButtonEvent onmediabuttonevent = this.AudioAttributesCompatParcelizer.get(i);
            if (RecyclerView.AudioAttributesImplBaseParcelizer) {
                Objects.toString(onmediabuttonevent);
            }
            IconCompatParcelizer(onmediabuttonevent, true);
            this.AudioAttributesCompatParcelizer.remove(i);
        }

        final void read(onMediaButtonEvent onmediabuttonevent) {
            boolean z;
            if (onmediabuttonevent.isScrap() || onmediabuttonevent.itemView.getParent() != null) {
                StringBuilder sb = new StringBuilder("Scrapped or attached views may not be recycled. isScrap:");
                sb.append(onmediabuttonevent.isScrap());
                sb.append(" isAttached:");
                sb.append(onmediabuttonevent.itemView.getParent() != null);
                sb.append(RecyclerView.this.write());
                throw new IllegalArgumentException(sb.toString());
            }
            if (onmediabuttonevent.isTmpDetached()) {
                StringBuilder sb2 = new StringBuilder("Tmp detached view should be removed from RecyclerView before it can be recycled: ");
                sb2.append(onmediabuttonevent);
                sb2.append(RecyclerView.this.write());
                throw new IllegalArgumentException(sb2.toString());
            }
            if (onmediabuttonevent.shouldIgnore()) {
                StringBuilder sb3 = new StringBuilder("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle.");
                sb3.append(RecyclerView.this.write());
                throw new IllegalArgumentException(sb3.toString());
            }
            boolean zDoesTransientStatePreventRecycling = onmediabuttonevent.doesTransientStatePreventRecycling();
            boolean z2 = RecyclerView.this.MediaBrowserCompatItemReceiver != null && zDoesTransientStatePreventRecycling && RecyclerView.this.MediaBrowserCompatItemReceiver.onFailedToRecycleView(onmediabuttonevent);
            if (RecyclerView.AudioAttributesImplApi26Parcelizer && this.AudioAttributesCompatParcelizer.contains(onmediabuttonevent)) {
                StringBuilder sb4 = new StringBuilder("cached view received recycle internal? ");
                sb4.append(onmediabuttonevent);
                sb4.append(RecyclerView.this.write());
                throw new IllegalArgumentException(sb4.toString());
            }
            if (z2 || onmediabuttonevent.isRecyclable()) {
                if (this.AudioAttributesImplApi21Parcelizer <= 0 || onmediabuttonevent.hasAnyOfTheFlags(526)) {
                    z = false;
                } else {
                    int size = this.AudioAttributesCompatParcelizer.size();
                    if (size >= this.AudioAttributesImplApi21Parcelizer && size > 0) {
                        MediaBrowserCompatCustomActionResultReceiver(0);
                        size--;
                    }
                    if (RecyclerView.IconCompatParcelizer && size > 0 && !RecyclerView.this.onPlayFromSearch.write(onmediabuttonevent.mPosition)) {
                        do {
                            size--;
                            if (size < 0) {
                                break;
                            }
                        } while (RecyclerView.this.onPlayFromSearch.write(this.AudioAttributesCompatParcelizer.get(size).mPosition));
                        size++;
                    }
                    this.AudioAttributesCompatParcelizer.add(size, onmediabuttonevent);
                    z = true;
                }
                if (!z) {
                    IconCompatParcelizer(onmediabuttonevent, true);
                }
                RecyclerView.this.onSetRating.MediaBrowserCompatCustomActionResultReceiver(onmediabuttonevent);
                if (z && !z && zDoesTransientStatePreventRecycling) {
                    createPrimordial.AudioAttributesCompatParcelizer(onmediabuttonevent.itemView);
                    onmediabuttonevent.mBindingAdapter = null;
                    onmediabuttonevent.mOwnerRecyclerView = null;
                    return;
                }
                return;
            }
            if (RecyclerView.AudioAttributesImplBaseParcelizer) {
                RecyclerView.this.write();
            }
            z = false;
            z = false;
            RecyclerView.this.onSetRating.MediaBrowserCompatCustomActionResultReceiver(onmediabuttonevent);
            if (z) {
            }
        }

        public final void IconCompatParcelizer(onMediaButtonEvent onmediabuttonevent, boolean z) {
            RecyclerView.read(onmediabuttonevent);
            View view = onmediabuttonevent.itemView;
            if (RecyclerView.this.AudioAttributesImplApi21Parcelizer != null) {
                deserializeUsingCustom deserializeusingcustomIconCompatParcelizer = RecyclerView.this.AudioAttributesImplApi21Parcelizer.IconCompatParcelizer();
                InvalidTypeIdException.AudioAttributesCompatParcelizer(view, deserializeusingcustomIconCompatParcelizer instanceof UIntKeyDeserializer.write ? ((UIntKeyDeserializer.write) deserializeusingcustomIconCompatParcelizer).IconCompatParcelizer(view) : null);
            }
            if (z) {
                RemoteActionCompatParcelizer(onmediabuttonevent);
            }
            onmediabuttonevent.mBindingAdapter = null;
            onmediabuttonevent.mOwnerRecyclerView = null;
            RemoteActionCompatParcelizer().AudioAttributesCompatParcelizer(onmediabuttonevent);
        }

        final void read(View view) {
            onMediaButtonEvent onmediabuttoneventIconCompatParcelizer = RecyclerView.IconCompatParcelizer(view);
            onmediabuttoneventIconCompatParcelizer.mScrapContainer = null;
            onmediabuttoneventIconCompatParcelizer.mInChangeScrap = false;
            onmediabuttoneventIconCompatParcelizer.clearReturnedFromScrapFlag();
            read(onmediabuttoneventIconCompatParcelizer);
        }

        final void RemoteActionCompatParcelizer(View view) {
            onMediaButtonEvent onmediabuttoneventIconCompatParcelizer = RecyclerView.IconCompatParcelizer(view);
            if (onmediabuttoneventIconCompatParcelizer.hasAnyOfTheFlags(12) || !onmediabuttoneventIconCompatParcelizer.isUpdated() || RecyclerView.this.write(onmediabuttoneventIconCompatParcelizer)) {
                if (onmediabuttoneventIconCompatParcelizer.isInvalid() && !onmediabuttoneventIconCompatParcelizer.isRemoved() && !RecyclerView.this.MediaBrowserCompatItemReceiver.hasStableIds()) {
                    StringBuilder sb = new StringBuilder("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.");
                    sb.append(RecyclerView.this.write());
                    throw new IllegalArgumentException(sb.toString());
                }
                onmediabuttoneventIconCompatParcelizer.setScrapContainer(this, false);
                this.write.add(onmediabuttoneventIconCompatParcelizer);
                return;
            }
            if (this.read == null) {
                this.read = new ArrayList<>();
            }
            onmediabuttoneventIconCompatParcelizer.setScrapContainer(this, true);
            this.read.add(onmediabuttoneventIconCompatParcelizer);
        }

        final void AudioAttributesCompatParcelizer(onMediaButtonEvent onmediabuttonevent) {
            if (onmediabuttonevent.mInChangeScrap) {
                this.read.remove(onmediabuttonevent);
            } else {
                this.write.remove(onmediabuttonevent);
            }
            onmediabuttonevent.mScrapContainer = null;
            onmediabuttonevent.mInChangeScrap = false;
            onmediabuttonevent.clearReturnedFromScrapFlag();
        }

        final int AudioAttributesCompatParcelizer() {
            return this.write.size();
        }

        final View IconCompatParcelizer(int i) {
            return this.write.get(i).itemView;
        }

        final void read() {
            this.write.clear();
            ArrayList<onMediaButtonEvent> arrayList = this.read;
            if (arrayList != null) {
                arrayList.clear();
            }
        }

        private onMediaButtonEvent read(int i) {
            int size;
            int iWrite;
            ArrayList<onMediaButtonEvent> arrayList = this.read;
            if (arrayList == null || (size = arrayList.size()) == 0) {
                return null;
            }
            for (int i2 = 0; i2 < size; i2++) {
                onMediaButtonEvent onmediabuttonevent = this.read.get(i2);
                if (!onmediabuttonevent.wasReturnedFromScrap() && onmediabuttonevent.getLayoutPosition() == i) {
                    onmediabuttonevent.addFlags(32);
                    return onmediabuttonevent;
                }
            }
            if (!RecyclerView.this.MediaBrowserCompatItemReceiver.hasStableIds() || (iWrite = RecyclerView.this.MediaMetadataCompat.write(i)) <= 0 || iWrite >= RecyclerView.this.MediaBrowserCompatItemReceiver.getItemCount()) {
                return null;
            }
            long itemId = RecyclerView.this.MediaBrowserCompatItemReceiver.getItemId(iWrite);
            for (int i3 = 0; i3 < size; i3++) {
                onMediaButtonEvent onmediabuttonevent2 = this.read.get(i3);
                if (!onmediabuttonevent2.wasReturnedFromScrap() && onmediabuttonevent2.getItemId() == itemId) {
                    onmediabuttonevent2.addFlags(32);
                    return onmediabuttonevent2;
                }
            }
            return null;
        }

        private onMediaButtonEvent AudioAttributesCompatParcelizer(int i, boolean z) {
            View viewRemoteActionCompatParcelizer;
            int size = this.write.size();
            for (int i2 = 0; i2 < size; i2++) {
                onMediaButtonEvent onmediabuttonevent = this.write.get(i2);
                if (!onmediabuttonevent.wasReturnedFromScrap() && onmediabuttonevent.getLayoutPosition() == i && !onmediabuttonevent.isInvalid() && (RecyclerView.this.onPrepareFromUri.IconCompatParcelizer || !onmediabuttonevent.isRemoved())) {
                    onmediabuttonevent.addFlags(32);
                    return onmediabuttonevent;
                }
            }
            if (!z && (viewRemoteActionCompatParcelizer = RecyclerView.this.MediaBrowserCompatSearchResultReceiver.RemoteActionCompatParcelizer(i)) != null) {
                onMediaButtonEvent onmediabuttoneventIconCompatParcelizer = RecyclerView.IconCompatParcelizer(viewRemoteActionCompatParcelizer);
                RecyclerView.this.MediaBrowserCompatSearchResultReceiver.AudioAttributesImplApi21Parcelizer(viewRemoteActionCompatParcelizer);
                int i3 = RecyclerView.this.MediaBrowserCompatSearchResultReceiver.read(viewRemoteActionCompatParcelizer);
                if (i3 == -1) {
                    StringBuilder sb = new StringBuilder("layout index should not be -1 after unhiding a view:");
                    sb.append(onmediabuttoneventIconCompatParcelizer);
                    sb.append(RecyclerView.this.write());
                    throw new IllegalStateException(sb.toString());
                }
                RecyclerView.this.MediaBrowserCompatSearchResultReceiver.write(i3);
                RemoteActionCompatParcelizer(viewRemoteActionCompatParcelizer);
                onmediabuttoneventIconCompatParcelizer.addFlags(8224);
                return onmediabuttoneventIconCompatParcelizer;
            }
            int size2 = this.AudioAttributesCompatParcelizer.size();
            for (int i4 = 0; i4 < size2; i4++) {
                onMediaButtonEvent onmediabuttonevent2 = this.AudioAttributesCompatParcelizer.get(i4);
                if (!onmediabuttonevent2.isInvalid() && onmediabuttonevent2.getLayoutPosition() == i && !onmediabuttonevent2.isAttachedToTransitionOverlay()) {
                    if (!z) {
                        this.AudioAttributesCompatParcelizer.remove(i4);
                    }
                    if (RecyclerView.AudioAttributesImplBaseParcelizer) {
                        Objects.toString(onmediabuttonevent2);
                    }
                    return onmediabuttonevent2;
                }
            }
            return null;
        }

        private onMediaButtonEvent read(long j, int i, boolean z) {
            for (int size = this.write.size() - 1; size >= 0; size--) {
                onMediaButtonEvent onmediabuttonevent = this.write.get(size);
                if (onmediabuttonevent.getItemId() == j && !onmediabuttonevent.wasReturnedFromScrap()) {
                    if (i == onmediabuttonevent.getItemViewType()) {
                        onmediabuttonevent.addFlags(32);
                        if (onmediabuttonevent.isRemoved() && !RecyclerView.this.onPrepareFromUri.write()) {
                            onmediabuttonevent.setFlags(2, 14);
                        }
                        return onmediabuttonevent;
                    }
                    if (!z) {
                        this.write.remove(size);
                        RecyclerView.this.removeDetachedView(onmediabuttonevent.itemView, false);
                        read(onmediabuttonevent.itemView);
                    }
                }
            }
            int size2 = this.AudioAttributesCompatParcelizer.size();
            while (true) {
                size2--;
                if (size2 < 0) {
                    return null;
                }
                onMediaButtonEvent onmediabuttonevent2 = this.AudioAttributesCompatParcelizer.get(size2);
                if (onmediabuttonevent2.getItemId() == j && !onmediabuttonevent2.isAttachedToTransitionOverlay()) {
                    if (i == onmediabuttonevent2.getItemViewType()) {
                        if (!z) {
                            this.AudioAttributesCompatParcelizer.remove(size2);
                        }
                        return onmediabuttonevent2;
                    }
                    if (!z) {
                        MediaBrowserCompatCustomActionResultReceiver(size2);
                        return null;
                    }
                }
            }
        }

        private void RemoteActionCompatParcelizer(onMediaButtonEvent onmediabuttonevent) {
            if (RecyclerView.this.onSeekTo != null) {
                onAddQueueItem onaddqueueitem = RecyclerView.this.onSeekTo;
            }
            int size = RecyclerView.this.onRewind.size();
            for (int i = 0; i < size; i++) {
                RecyclerView.this.onRewind.get(i);
            }
            if (RecyclerView.this.MediaBrowserCompatItemReceiver != null) {
                RecyclerView.this.MediaBrowserCompatItemReceiver.onViewRecycled(onmediabuttonevent);
            }
            if (RecyclerView.this.onPrepareFromUri != null) {
                RecyclerView.this.onSetRating.MediaBrowserCompatCustomActionResultReceiver(onmediabuttonevent);
            }
            if (RecyclerView.AudioAttributesImplBaseParcelizer) {
                Objects.toString(onmediabuttonevent);
            }
        }

        final void RemoteActionCompatParcelizer(IconCompatParcelizer<?> iconCompatParcelizer, IconCompatParcelizer<?> iconCompatParcelizer2, boolean z) {
            write();
            RemoteActionCompatParcelizer(iconCompatParcelizer, true);
            RemoteActionCompatParcelizer().IconCompatParcelizer(iconCompatParcelizer, iconCompatParcelizer2, z);
            MediaMetadataCompat();
        }

        final void IconCompatParcelizer(int i, int i2) {
            int i3;
            int i4;
            int i5;
            if (i < i2) {
                i3 = -1;
                i5 = i;
                i4 = i2;
            } else {
                i3 = 1;
                i4 = i;
                i5 = i2;
            }
            int size = this.AudioAttributesCompatParcelizer.size();
            for (int i6 = 0; i6 < size; i6++) {
                onMediaButtonEvent onmediabuttonevent = this.AudioAttributesCompatParcelizer.get(i6);
                if (onmediabuttonevent != null && onmediabuttonevent.mPosition >= i5 && onmediabuttonevent.mPosition <= i4) {
                    if (onmediabuttonevent.mPosition == i) {
                        onmediabuttonevent.offsetPosition(i2 - i, false);
                    } else {
                        onmediabuttonevent.offsetPosition(i3, false);
                    }
                    if (RecyclerView.AudioAttributesImplBaseParcelizer) {
                        Objects.toString(onmediabuttonevent);
                    }
                }
            }
        }

        final void AudioAttributesCompatParcelizer(int i, int i2) {
            int size = this.AudioAttributesCompatParcelizer.size();
            for (int i3 = 0; i3 < size; i3++) {
                onMediaButtonEvent onmediabuttonevent = this.AudioAttributesCompatParcelizer.get(i3);
                if (onmediabuttonevent != null && onmediabuttonevent.mPosition >= i) {
                    if (RecyclerView.AudioAttributesImplBaseParcelizer) {
                        Objects.toString(onmediabuttonevent);
                        int i4 = onmediabuttonevent.mPosition;
                    }
                    onmediabuttonevent.offsetPosition(i2, false);
                }
            }
        }

        final void read(int i, int i2, boolean z) {
            for (int size = this.AudioAttributesCompatParcelizer.size() - 1; size >= 0; size--) {
                onMediaButtonEvent onmediabuttonevent = this.AudioAttributesCompatParcelizer.get(size);
                if (onmediabuttonevent != null) {
                    if (onmediabuttonevent.mPosition >= i + i2) {
                        if (RecyclerView.AudioAttributesImplBaseParcelizer) {
                            Objects.toString(onmediabuttonevent);
                            int i3 = onmediabuttonevent.mPosition;
                        }
                        onmediabuttonevent.offsetPosition(-i2, z);
                    } else if (onmediabuttonevent.mPosition >= i) {
                        onmediabuttonevent.addFlags(8);
                        MediaBrowserCompatCustomActionResultReceiver(size);
                    }
                }
            }
        }

        final void read(onPlayFromMediaId onplayfrommediaid) {
            this.AudioAttributesImplApi26Parcelizer = onplayfrommediaid;
        }

        final void AudioAttributesCompatParcelizer(MediaMetadataCompat mediaMetadataCompat) {
            write(RecyclerView.this.MediaBrowserCompatItemReceiver);
            MediaMetadataCompat mediaMetadataCompat2 = this.IconCompatParcelizer;
            if (mediaMetadataCompat2 != null) {
                mediaMetadataCompat2.RemoteActionCompatParcelizer();
            }
            this.IconCompatParcelizer = mediaMetadataCompat;
            if (mediaMetadataCompat != null && RecyclerView.this.IconCompatParcelizer() != null) {
                this.IconCompatParcelizer.write();
            }
            MediaMetadataCompat();
        }

        private void MediaMetadataCompat() {
            if (this.IconCompatParcelizer == null || RecyclerView.this.MediaBrowserCompatItemReceiver == null || !RecyclerView.this.isAttachedToWindow()) {
                return;
            }
            this.IconCompatParcelizer.IconCompatParcelizer(RecyclerView.this.MediaBrowserCompatItemReceiver);
        }

        private void write(IconCompatParcelizer<?> iconCompatParcelizer) {
            RemoteActionCompatParcelizer(iconCompatParcelizer, false);
        }

        private void RemoteActionCompatParcelizer(IconCompatParcelizer<?> iconCompatParcelizer, boolean z) {
            MediaMetadataCompat mediaMetadataCompat = this.IconCompatParcelizer;
            if (mediaMetadataCompat != null) {
                mediaMetadataCompat.IconCompatParcelizer(iconCompatParcelizer, z);
            }
        }

        final void AudioAttributesImplApi26Parcelizer() {
            MediaMetadataCompat();
        }

        final void MediaBrowserCompatCustomActionResultReceiver() {
            for (int i = 0; i < this.AudioAttributesCompatParcelizer.size(); i++) {
                createPrimordial.AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer.get(i).itemView);
            }
            write(RecyclerView.this.MediaBrowserCompatItemReceiver);
        }

        final MediaMetadataCompat RemoteActionCompatParcelizer() {
            if (this.IconCompatParcelizer == null) {
                this.IconCompatParcelizer = new MediaMetadataCompat();
                MediaMetadataCompat();
            }
            return this.IconCompatParcelizer;
        }

        final void RemoteActionCompatParcelizer(int i, int i2) {
            int i3;
            for (int size = this.AudioAttributesCompatParcelizer.size() - 1; size >= 0; size--) {
                onMediaButtonEvent onmediabuttonevent = this.AudioAttributesCompatParcelizer.get(size);
                if (onmediabuttonevent != null && (i3 = onmediabuttonevent.mPosition) >= i && i3 < i2 + i) {
                    onmediabuttonevent.addFlags(2);
                    MediaBrowserCompatCustomActionResultReceiver(size);
                }
            }
        }

        final void MediaBrowserCompatItemReceiver() {
            int size = this.AudioAttributesCompatParcelizer.size();
            for (int i = 0; i < size; i++) {
                onMediaButtonEvent onmediabuttonevent = this.AudioAttributesCompatParcelizer.get(i);
                if (onmediabuttonevent != null) {
                    onmediabuttonevent.addFlags(6);
                    onmediabuttonevent.addChangePayload(null);
                }
            }
            if (RecyclerView.this.MediaBrowserCompatItemReceiver == null || !RecyclerView.this.MediaBrowserCompatItemReceiver.hasStableIds()) {
                MediaDescriptionCompat();
            }
        }

        final void IconCompatParcelizer() {
            int size = this.AudioAttributesCompatParcelizer.size();
            for (int i = 0; i < size; i++) {
                this.AudioAttributesCompatParcelizer.get(i).clearOldPosition();
            }
            int size2 = this.write.size();
            for (int i2 = 0; i2 < size2; i2++) {
                this.write.get(i2).clearOldPosition();
            }
            ArrayList<onMediaButtonEvent> arrayList = this.read;
            if (arrayList != null) {
                int size3 = arrayList.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    this.read.get(i3).clearOldPosition();
                }
            }
        }

        final void AudioAttributesImplBaseParcelizer() {
            int size = this.AudioAttributesCompatParcelizer.size();
            for (int i = 0; i < size; i++) {
                LayoutParams layoutParams = (LayoutParams) this.AudioAttributesCompatParcelizer.get(i).itemView.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.AudioAttributesCompatParcelizer = true;
                }
            }
        }
    }

    public static abstract class IconCompatParcelizer<VH extends onMediaButtonEvent> {
        private final AudioAttributesCompatParcelizer mObservable = new AudioAttributesCompatParcelizer();
        private boolean mHasStableIds = false;
        private read mStateRestorationPolicy = read.ALLOW;

        public enum read {
            ALLOW,
            PREVENT_WHEN_EMPTY,
            PREVENT
        }

        public int findRelativeAdapterPositionIn(IconCompatParcelizer<? extends onMediaButtonEvent> iconCompatParcelizer, onMediaButtonEvent onmediabuttonevent, int i) {
            if (iconCompatParcelizer == this) {
                return i;
            }
            return -1;
        }

        public abstract int getItemCount();

        public long getItemId(int i) {
            return -1L;
        }

        public int getItemViewType(int i) {
            return 0;
        }

        public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        }

        public abstract void onBindViewHolder(VH vh, int i);

        public abstract VH onCreateViewHolder(ViewGroup viewGroup, int i);

        public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        }

        public boolean onFailedToRecycleView(VH vh) {
            return false;
        }

        public void onViewAttachedToWindow(VH vh) {
        }

        public void onViewDetachedFromWindow(VH vh) {
        }

        public void onViewRecycled(VH vh) {
        }

        public void onBindViewHolder(VH vh, int i, List<Object> list) {
            onBindViewHolder(vh, i);
        }

        public final VH createViewHolder(ViewGroup viewGroup, int i) {
            try {
                constructDelegatingKeyDeserializer.read("RV CreateView");
                VH vh = (VH) onCreateViewHolder(viewGroup, i);
                if (vh.itemView.getParent() != null) {
                    throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
                }
                vh.mItemViewType = i;
                return vh;
            } finally {
                constructDelegatingKeyDeserializer.RemoteActionCompatParcelizer();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void bindViewHolder(VH vh, int i) {
            boolean z = vh.mBindingAdapter == null;
            if (z) {
                vh.mPosition = i;
                if (hasStableIds()) {
                    vh.mItemId = getItemId(i);
                }
                vh.setFlags(1, 519);
                constructDelegatingKeyDeserializer.read("RV OnBindView");
            }
            vh.mBindingAdapter = this;
            if (RecyclerView.AudioAttributesImplApi26Parcelizer) {
                if (vh.itemView.getParent() == null && InvalidTypeIdException.onPlayFromSearch(vh.itemView) != vh.isTmpDetached()) {
                    StringBuilder sb = new StringBuilder("Temp-detached state out of sync with reality. holder.isTmpDetached(): ");
                    sb.append(vh.isTmpDetached());
                    sb.append(", attached to window: ");
                    sb.append(InvalidTypeIdException.onPlayFromSearch(vh.itemView));
                    sb.append(", holder: ");
                    sb.append(vh);
                    throw new IllegalStateException(sb.toString());
                }
                if (vh.itemView.getParent() == null && InvalidTypeIdException.onPlayFromSearch(vh.itemView)) {
                    throw new IllegalStateException("Attempting to bind attached holder with no parent (AKA temp detached): ".concat(String.valueOf(vh)));
                }
            }
            onBindViewHolder(vh, i, vh.getUnmodifiedPayloads());
            if (z) {
                vh.clearPayload();
                ViewGroup.LayoutParams layoutParams = vh.itemView.getLayoutParams();
                if (layoutParams instanceof LayoutParams) {
                    ((LayoutParams) layoutParams).AudioAttributesCompatParcelizer = true;
                }
                constructDelegatingKeyDeserializer.RemoteActionCompatParcelizer();
            }
        }

        public void setHasStableIds(boolean z) {
            if (hasObservers()) {
                throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
            }
            this.mHasStableIds = z;
        }

        public final boolean hasStableIds() {
            return this.mHasStableIds;
        }

        public final boolean hasObservers() {
            return this.mObservable.write();
        }

        public void registerAdapterDataObserver(read readVar) {
            this.mObservable.registerObserver(readVar);
        }

        public void unregisterAdapterDataObserver(read readVar) {
            this.mObservable.unregisterObserver(readVar);
        }

        public final void notifyDataSetChanged() {
            this.mObservable.RemoteActionCompatParcelizer();
        }

        public final void notifyItemChanged(int i) {
            this.mObservable.write(i, 1);
        }

        public final void notifyItemChanged(int i, Object obj) {
            this.mObservable.RemoteActionCompatParcelizer(i, 1, obj);
        }

        public final void notifyItemRangeChanged(int i, int i2) {
            this.mObservable.write(i, i2);
        }

        public final void notifyItemRangeChanged(int i, int i2, Object obj) {
            this.mObservable.RemoteActionCompatParcelizer(i, i2, obj);
        }

        public final void notifyItemInserted(int i) {
            this.mObservable.IconCompatParcelizer(i, 1);
        }

        public final void notifyItemMoved(int i, int i2) {
            this.mObservable.read(i, i2);
        }

        public final void notifyItemRangeInserted(int i, int i2) {
            this.mObservable.IconCompatParcelizer(i, i2);
        }

        public final void notifyItemRemoved(int i) {
            this.mObservable.RemoteActionCompatParcelizer(i, 1);
        }

        public final void notifyItemRangeRemoved(int i, int i2) {
            this.mObservable.RemoteActionCompatParcelizer(i, i2);
        }

        public void setStateRestorationPolicy(read readVar) {
            this.mStateRestorationPolicy = readVar;
            this.mObservable.AudioAttributesCompatParcelizer();
        }

        public final read getStateRestorationPolicy() {
            return this.mStateRestorationPolicy;
        }

        boolean canRestoreState() {
            int i = AnonymousClass7.AudioAttributesCompatParcelizer[this.mStateRestorationPolicy.ordinal()];
            if (i != 1) {
                return i != 2 || getItemCount() > 0;
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$7, reason: invalid class name */
    static /* synthetic */ class AnonymousClass7 {
        static final /* synthetic */ int[] AudioAttributesCompatParcelizer;

        static {
            int[] iArr = new int[IconCompatParcelizer.read.values().length];
            AudioAttributesCompatParcelizer = iArr;
            try {
                iArr[IconCompatParcelizer.read.PREVENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                AudioAttributesCompatParcelizer[IconCompatParcelizer.read.PREVENT_WHEN_EMPTY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    final void RemoteActionCompatParcelizer(View view) {
        onMediaButtonEvent onmediabuttoneventIconCompatParcelizer = IconCompatParcelizer(view);
        MediaBrowserCompatSearchResultReceiver(view);
        IconCompatParcelizer iconCompatParcelizer = this.MediaBrowserCompatItemReceiver;
        if (iconCompatParcelizer != null && onmediabuttoneventIconCompatParcelizer != null) {
            iconCompatParcelizer.onViewDetachedFromWindow(onmediabuttoneventIconCompatParcelizer);
        }
        List<AudioAttributesImplApi21Parcelizer> list = this.getOnBackPressedDispatcherannotations;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.getOnBackPressedDispatcherannotations.get(size).read(view);
            }
        }
    }

    final void read(View view) {
        onMediaButtonEvent onmediabuttoneventIconCompatParcelizer = IconCompatParcelizer(view);
        AudioAttributesImplApi26Parcelizer(view);
        IconCompatParcelizer iconCompatParcelizer = this.MediaBrowserCompatItemReceiver;
        if (iconCompatParcelizer != null && onmediabuttoneventIconCompatParcelizer != null) {
            iconCompatParcelizer.onViewAttachedToWindow(onmediabuttoneventIconCompatParcelizer);
        }
        List<AudioAttributesImplApi21Parcelizer> list = this.getOnBackPressedDispatcherannotations;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.getOnBackPressedDispatcherannotations.get(size).RemoteActionCompatParcelizer(view);
            }
        }
    }

    public static abstract class MediaBrowserCompatItemReceiver {
        private int AudioAttributesCompatParcelizer;
        private boolean AudioAttributesImplApi21Parcelizer;
        public int AudioAttributesImplApi26Parcelizer;
        ULongDeserializer AudioAttributesImplBaseParcelizer;
        private boolean IconCompatParcelizer;
        private boolean MediaBrowserCompatCustomActionResultReceiver;
        private boolean MediaBrowserCompatItemReceiver;
        RecyclerView MediaBrowserCompatMediaItem;
        boolean MediaBrowserCompatSearchResultReceiver;
        private int MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        onCustomAction MediaDescriptionCompat;
        public boolean MediaMetadataCompat;
        ULongDeserializer RatingCompat;
        private TypesKt RemoteActionCompatParcelizer;
        private final ULongDeserializer.IconCompatParcelizer handleMediaPlayPauseIfPendingOnHandler;
        private int onAddQueueItem;
        private final ULongDeserializer.IconCompatParcelizer read;
        private int write;

        public interface RemoteActionCompatParcelizer {
            void read(int i, int i2);
        }

        /* JADX INFO: loaded from: classes4.dex */
        public static class write {
            public int AudioAttributesCompatParcelizer;
            public boolean IconCompatParcelizer;
            public boolean RemoteActionCompatParcelizer;
            public int write;
        }

        public static int onCustomAction() {
            return -1;
        }

        public int AudioAttributesCompatParcelizer(MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) {
            return 0;
        }

        public View AudioAttributesCompatParcelizer(View view, int i, MediaDescriptionCompat mediaDescriptionCompat, MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) {
            return null;
        }

        public void AudioAttributesCompatParcelizer(int i, int i2, MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        }

        public void AudioAttributesCompatParcelizer(int i, RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        }

        public void AudioAttributesCompatParcelizer(RecyclerView recyclerView) {
        }

        public void AudioAttributesCompatParcelizer(RecyclerView recyclerView, int i) {
        }

        public void AudioAttributesCompatParcelizer(RecyclerView recyclerView, int i, int i2) {
        }

        public boolean AudioAttributesImplApi21Parcelizer() {
            return false;
        }

        public boolean AudioAttributesImplApi26Parcelizer() {
            return false;
        }

        public int AudioAttributesImplBaseParcelizer(MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) {
            return 0;
        }

        public int IconCompatParcelizer(MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) {
            return 0;
        }

        public int IconCompatParcelizer(MediaDescriptionCompat mediaDescriptionCompat, MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) {
            return -1;
        }

        public void IconCompatParcelizer(Parcelable parcelable) {
        }

        public void IconCompatParcelizer(IconCompatParcelizer iconCompatParcelizer, IconCompatParcelizer iconCompatParcelizer2) {
        }

        public void IconCompatParcelizer(MediaDescriptionCompat mediaDescriptionCompat, MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, View view, hasSuperClassStartingWith hassuperclassstartingwith) {
        }

        public void IconCompatParcelizer(RecyclerView recyclerView, int i, int i2) {
        }

        public void IconCompatParcelizer(RecyclerView recyclerView, int i, int i2, int i3) {
        }

        public void L_() {
        }

        public boolean M_() {
            return false;
        }

        public int MediaBrowserCompatItemReceiver(MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) {
            return 0;
        }

        public void MediaBrowserCompatItemReceiver(int i) {
        }

        public int RemoteActionCompatParcelizer(int i, MediaDescriptionCompat mediaDescriptionCompat, MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) {
            return 0;
        }

        public int RemoteActionCompatParcelizer(MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) {
            return 0;
        }

        public int RemoteActionCompatParcelizer(MediaDescriptionCompat mediaDescriptionCompat, MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) {
            return -1;
        }

        public void RemoteActionCompatParcelizer(RecyclerView recyclerView, int i, int i2) {
        }

        public boolean RemoteActionCompatParcelizer(LayoutParams layoutParams) {
            return layoutParams != null;
        }

        boolean handleMediaPlayPauseIfPendingOnHandler() {
            return false;
        }

        public Parcelable onAddQueueItem() {
            return null;
        }

        public int read(int i, MediaDescriptionCompat mediaDescriptionCompat, MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) {
            return 0;
        }

        public int read(MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) {
            return 0;
        }

        public abstract LayoutParams read();

        public void read(RecyclerView recyclerView, MediaDescriptionCompat mediaDescriptionCompat) {
        }

        public void write(MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) {
        }

        public void write(MediaDescriptionCompat mediaDescriptionCompat, MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) {
        }

        public MediaBrowserCompatItemReceiver() {
            ULongDeserializer.IconCompatParcelizer iconCompatParcelizer = new ULongDeserializer.IconCompatParcelizer() { // from class: androidx.recyclerview.widget.RecyclerView.MediaBrowserCompatItemReceiver.5
                @Override // o.ULongDeserializer.IconCompatParcelizer
                public final View IconCompatParcelizer(int i) {
                    return MediaBrowserCompatItemReceiver.this.MediaBrowserCompatCustomActionResultReceiver(i);
                }

                @Override // o.ULongDeserializer.IconCompatParcelizer
                public final int AudioAttributesCompatParcelizer() {
                    return MediaBrowserCompatItemReceiver.this.getPaddingLeft();
                }

                @Override // o.ULongDeserializer.IconCompatParcelizer
                public final int write() {
                    return MediaBrowserCompatItemReceiver.this.onPrepare() - MediaBrowserCompatItemReceiver.this.getPaddingRight();
                }

                @Override // o.ULongDeserializer.IconCompatParcelizer
                public final int read(View view) {
                    return MediaBrowserCompatItemReceiver.MediaBrowserCompatItemReceiver(view) - ((ViewGroup.MarginLayoutParams) ((LayoutParams) view.getLayoutParams())).leftMargin;
                }

                @Override // o.ULongDeserializer.IconCompatParcelizer
                public final int AudioAttributesCompatParcelizer(View view) {
                    return MediaBrowserCompatItemReceiver.MediaMetadataCompat(view) + ((ViewGroup.MarginLayoutParams) ((LayoutParams) view.getLayoutParams())).rightMargin;
                }
            };
            this.read = iconCompatParcelizer;
            ULongDeserializer.IconCompatParcelizer iconCompatParcelizer2 = new ULongDeserializer.IconCompatParcelizer() { // from class: androidx.recyclerview.widget.RecyclerView.MediaBrowserCompatItemReceiver.1
                @Override // o.ULongDeserializer.IconCompatParcelizer
                public final View IconCompatParcelizer(int i) {
                    return MediaBrowserCompatItemReceiver.this.MediaBrowserCompatCustomActionResultReceiver(i);
                }

                @Override // o.ULongDeserializer.IconCompatParcelizer
                public final int AudioAttributesCompatParcelizer() {
                    return MediaBrowserCompatItemReceiver.this.getPaddingTop();
                }

                @Override // o.ULongDeserializer.IconCompatParcelizer
                public final int write() {
                    return MediaBrowserCompatItemReceiver.this.onMediaButtonEvent() - MediaBrowserCompatItemReceiver.this.getPaddingBottom();
                }

                @Override // o.ULongDeserializer.IconCompatParcelizer
                public final int read(View view) {
                    return MediaBrowserCompatItemReceiver.RatingCompat(view) - ((ViewGroup.MarginLayoutParams) ((LayoutParams) view.getLayoutParams())).topMargin;
                }

                @Override // o.ULongDeserializer.IconCompatParcelizer
                public final int AudioAttributesCompatParcelizer(View view) {
                    return MediaBrowserCompatItemReceiver.AudioAttributesImplApi21Parcelizer(view) + ((ViewGroup.MarginLayoutParams) ((LayoutParams) view.getLayoutParams())).bottomMargin;
                }
            };
            this.handleMediaPlayPauseIfPendingOnHandler = iconCompatParcelizer2;
            this.AudioAttributesImplBaseParcelizer = new ULongDeserializer(iconCompatParcelizer);
            this.RatingCompat = new ULongDeserializer(iconCompatParcelizer2);
            this.MediaBrowserCompatSearchResultReceiver = false;
            this.MediaBrowserCompatItemReceiver = false;
            this.IconCompatParcelizer = false;
            this.AudioAttributesImplApi21Parcelizer = true;
            this.MediaBrowserCompatCustomActionResultReceiver = true;
        }

        final void read(RecyclerView recyclerView) {
            if (recyclerView == null) {
                this.MediaBrowserCompatMediaItem = null;
                this.RemoteActionCompatParcelizer = null;
                this.onAddQueueItem = 0;
                this.write = 0;
            } else {
                this.MediaBrowserCompatMediaItem = recyclerView;
                this.RemoteActionCompatParcelizer = recyclerView.MediaBrowserCompatSearchResultReceiver;
                this.onAddQueueItem = recyclerView.getWidth();
                this.write = recyclerView.getHeight();
            }
            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = 1073741824;
            this.AudioAttributesCompatParcelizer = 1073741824;
        }

        final void IconCompatParcelizer(int i, int i2) {
            this.onAddQueueItem = View.MeasureSpec.getSize(i);
            int mode = View.MeasureSpec.getMode(i);
            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = mode;
            if (mode == 0 && !RecyclerView.read) {
                this.onAddQueueItem = 0;
            }
            this.write = View.MeasureSpec.getSize(i2);
            int mode2 = View.MeasureSpec.getMode(i2);
            this.AudioAttributesCompatParcelizer = mode2;
            if (mode2 != 0 || RecyclerView.read) {
                return;
            }
            this.write = 0;
        }

        final void AudioAttributesCompatParcelizer(int i, int i2) {
            int iOnPlay = onPlay();
            if (iOnPlay == 0) {
                this.MediaBrowserCompatMediaItem.IconCompatParcelizer(i, i2);
                return;
            }
            int i3 = Integer.MAX_VALUE;
            int i4 = Integer.MIN_VALUE;
            int i5 = Integer.MAX_VALUE;
            int i6 = Integer.MIN_VALUE;
            for (int i7 = 0; i7 < iOnPlay; i7++) {
                View viewMediaBrowserCompatCustomActionResultReceiver = MediaBrowserCompatCustomActionResultReceiver(i7);
                Rect rect = this.MediaBrowserCompatMediaItem.onSetPlaybackSpeed;
                read(viewMediaBrowserCompatCustomActionResultReceiver, rect);
                if (rect.left < i3) {
                    i3 = rect.left;
                }
                if (rect.right > i6) {
                    i6 = rect.right;
                }
                if (rect.top < i5) {
                    i5 = rect.top;
                }
                if (rect.bottom > i4) {
                    i4 = rect.bottom;
                }
            }
            this.MediaBrowserCompatMediaItem.onSetPlaybackSpeed.set(i3, i5, i6, i4);
            IconCompatParcelizer(this.MediaBrowserCompatMediaItem.onSetPlaybackSpeed, i, i2);
        }

        public void IconCompatParcelizer(Rect rect, int i, int i2) {
            int iWidth = rect.width();
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            int iHeight = rect.height();
            int paddingTop = getPaddingTop();
            RemoteActionCompatParcelizer(a_(i, iWidth + paddingLeft + paddingRight, onPlayFromUri()), a_(i2, iHeight + paddingTop + getPaddingBottom(), onPrepareFromSearch()));
        }

        public final void onSetRating() {
            RecyclerView recyclerView = this.MediaBrowserCompatMediaItem;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }

        public static int a_(int i, int i2, int i3) {
            int mode = View.MeasureSpec.getMode(i);
            int size = View.MeasureSpec.getSize(i);
            if (mode != Integer.MIN_VALUE) {
                return mode != 1073741824 ? Math.max(i2, i3) : size;
            }
            return Math.min(size, Math.max(i2, i3));
        }

        public void IconCompatParcelizer(String str) {
            RecyclerView recyclerView = this.MediaBrowserCompatMediaItem;
            if (recyclerView != null) {
                recyclerView.write(str);
            }
        }

        public boolean RatingCompat() {
            return this.IconCompatParcelizer;
        }

        public final boolean onPrepareFromUri() {
            return this.MediaBrowserCompatCustomActionResultReceiver;
        }

        final void RemoteActionCompatParcelizer(RecyclerView recyclerView) {
            this.MediaBrowserCompatItemReceiver = true;
            AudioAttributesCompatParcelizer(recyclerView);
        }

        final void RemoteActionCompatParcelizer(RecyclerView recyclerView, MediaDescriptionCompat mediaDescriptionCompat) {
            this.MediaBrowserCompatItemReceiver = false;
            read(recyclerView, mediaDescriptionCompat);
        }

        public final boolean onRemoveQueueItem() {
            return this.MediaBrowserCompatItemReceiver;
        }

        public final boolean AudioAttributesCompatParcelizer(Runnable runnable) {
            RecyclerView recyclerView = this.MediaBrowserCompatMediaItem;
            if (recyclerView != null) {
                return recyclerView.removeCallbacks(runnable);
            }
            return false;
        }

        public final boolean onPause() {
            RecyclerView recyclerView = this.MediaBrowserCompatMediaItem;
            return recyclerView != null && recyclerView.MediaDescriptionCompat;
        }

        public LayoutParams read(ViewGroup.LayoutParams layoutParams) {
            if (layoutParams instanceof LayoutParams) {
                return new LayoutParams((LayoutParams) layoutParams);
            }
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                return new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
            }
            return new LayoutParams(layoutParams);
        }

        public LayoutParams AudioAttributesCompatParcelizer(Context context, AttributeSet attributeSet) {
            return new LayoutParams(context, attributeSet);
        }

        public void read(int i) {
            boolean z = RecyclerView.AudioAttributesImplBaseParcelizer;
        }

        public final void RemoteActionCompatParcelizer(onCustomAction oncustomaction) {
            onCustomAction oncustomaction2 = this.MediaDescriptionCompat;
            if (oncustomaction2 != null && oncustomaction != oncustomaction2 && oncustomaction2.MediaBrowserCompatCustomActionResultReceiver()) {
                this.MediaDescriptionCompat.MediaBrowserCompatItemReceiver();
            }
            this.MediaDescriptionCompat = oncustomaction;
            oncustomaction.AudioAttributesCompatParcelizer(this.MediaBrowserCompatMediaItem, this);
        }

        public final boolean onSetRepeatMode() {
            onCustomAction oncustomaction = this.MediaDescriptionCompat;
            return oncustomaction != null && oncustomaction.MediaBrowserCompatCustomActionResultReceiver();
        }

        public final int onPlayFromSearch() {
            return InvalidTypeIdException.MediaBrowserCompatMediaItem(this.MediaBrowserCompatMediaItem);
        }

        public final void RemoteActionCompatParcelizer(View view) {
            AudioAttributesCompatParcelizer(view, -1);
        }

        public final void AudioAttributesCompatParcelizer(View view, int i) {
            IconCompatParcelizer(view, i, true);
        }

        public final void AudioAttributesCompatParcelizer(View view) {
            read(view, -1);
        }

        public final void read(View view, int i) {
            IconCompatParcelizer(view, i, false);
        }

        private void IconCompatParcelizer(View view, int i, boolean z) {
            onMediaButtonEvent onmediabuttoneventIconCompatParcelizer = RecyclerView.IconCompatParcelizer(view);
            if (z || onmediabuttoneventIconCompatParcelizer.isRemoved()) {
                this.MediaBrowserCompatMediaItem.onSetRating.read(onmediabuttoneventIconCompatParcelizer);
            } else {
                this.MediaBrowserCompatMediaItem.onSetRating.AudioAttributesImplApi26Parcelizer(onmediabuttoneventIconCompatParcelizer);
            }
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            if (onmediabuttoneventIconCompatParcelizer.wasReturnedFromScrap() || onmediabuttoneventIconCompatParcelizer.isScrap()) {
                if (onmediabuttoneventIconCompatParcelizer.isScrap()) {
                    onmediabuttoneventIconCompatParcelizer.unScrap();
                } else {
                    onmediabuttoneventIconCompatParcelizer.clearReturnedFromScrapFlag();
                }
                this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(view, i, view.getLayoutParams(), false);
            } else if (view.getParent() == this.MediaBrowserCompatMediaItem) {
                int i2 = this.RemoteActionCompatParcelizer.read(view);
                if (i == -1) {
                    i = this.RemoteActionCompatParcelizer.read();
                }
                if (i2 == -1) {
                    StringBuilder sb = new StringBuilder("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:");
                    sb.append(this.MediaBrowserCompatMediaItem.indexOfChild(view));
                    sb.append(this.MediaBrowserCompatMediaItem.write());
                    throw new IllegalStateException(sb.toString());
                }
                if (i2 != i) {
                    this.MediaBrowserCompatMediaItem.onPlayFromMediaId.read(i2, i);
                }
            } else {
                this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(view, i, false);
                layoutParams.AudioAttributesCompatParcelizer = true;
                onCustomAction oncustomaction = this.MediaDescriptionCompat;
                if (oncustomaction != null && oncustomaction.MediaBrowserCompatCustomActionResultReceiver()) {
                    this.MediaDescriptionCompat.write(view);
                }
            }
            if (layoutParams.write) {
                if (RecyclerView.AudioAttributesImplBaseParcelizer) {
                    Objects.toString(layoutParams.AudioAttributesImplBaseParcelizer);
                }
                onmediabuttoneventIconCompatParcelizer.itemView.invalidate();
                layoutParams.write = false;
            }
        }

        public final void onPlayFromMediaId(View view) {
            this.RemoteActionCompatParcelizer.write(view);
        }

        private void AudioAttributesCompatParcelizer(int i) {
            if (MediaBrowserCompatCustomActionResultReceiver(i) != null) {
                this.RemoteActionCompatParcelizer.IconCompatParcelizer(i);
            }
        }

        public final void onSetPlaybackSpeed() {
            for (int iOnPlay = onPlay() - 1; iOnPlay >= 0; iOnPlay--) {
                this.RemoteActionCompatParcelizer.IconCompatParcelizer(iOnPlay);
            }
        }

        public static int MediaDescriptionCompat(View view) {
            return ((LayoutParams) view.getLayoutParams()).O_();
        }

        public static int MediaBrowserCompatMediaItem(View view) {
            return RecyclerView.IconCompatParcelizer(view).getItemViewType();
        }

        public final View write(View view) {
            View viewWrite;
            RecyclerView recyclerView = this.MediaBrowserCompatMediaItem;
            if (recyclerView == null || (viewWrite = recyclerView.write(view)) == null || this.RemoteActionCompatParcelizer.IconCompatParcelizer(viewWrite)) {
                return null;
            }
            return viewWrite;
        }

        public View write(int i) {
            int iOnPlay = onPlay();
            for (int i2 = 0; i2 < iOnPlay; i2++) {
                View viewMediaBrowserCompatCustomActionResultReceiver = MediaBrowserCompatCustomActionResultReceiver(i2);
                onMediaButtonEvent onmediabuttoneventIconCompatParcelizer = RecyclerView.IconCompatParcelizer(viewMediaBrowserCompatCustomActionResultReceiver);
                if (onmediabuttoneventIconCompatParcelizer != null && onmediabuttoneventIconCompatParcelizer.getLayoutPosition() == i && !onmediabuttoneventIconCompatParcelizer.shouldIgnore() && (this.MediaBrowserCompatMediaItem.onPrepareFromUri.write() || !onmediabuttoneventIconCompatParcelizer.isRemoved())) {
                    return viewMediaBrowserCompatCustomActionResultReceiver;
                }
            }
            return null;
        }

        public final void a_(View view) {
            int i = this.RemoteActionCompatParcelizer.read(view);
            if (i >= 0) {
                IconCompatParcelizer(i);
            }
        }

        private void RemoteActionCompatParcelizer(int i) {
            MediaBrowserCompatCustomActionResultReceiver(i);
            IconCompatParcelizer(i);
        }

        private void IconCompatParcelizer(int i) {
            this.RemoteActionCompatParcelizer.write(i);
        }

        private void RemoteActionCompatParcelizer(View view, int i, LayoutParams layoutParams) {
            onMediaButtonEvent onmediabuttoneventIconCompatParcelizer = RecyclerView.IconCompatParcelizer(view);
            if (onmediabuttoneventIconCompatParcelizer.isRemoved()) {
                this.MediaBrowserCompatMediaItem.onSetRating.read(onmediabuttoneventIconCompatParcelizer);
            } else {
                this.MediaBrowserCompatMediaItem.onSetRating.AudioAttributesImplApi26Parcelizer(onmediabuttoneventIconCompatParcelizer);
            }
            this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(view, i, layoutParams, onmediabuttoneventIconCompatParcelizer.isRemoved());
        }

        private void IconCompatParcelizer(View view, int i) {
            RemoteActionCompatParcelizer(view, i, (LayoutParams) view.getLayoutParams());
        }

        public final void read(View view) {
            IconCompatParcelizer(view, -1);
        }

        private void read(int i, int i2) {
            View viewMediaBrowserCompatCustomActionResultReceiver = MediaBrowserCompatCustomActionResultReceiver(i);
            if (viewMediaBrowserCompatCustomActionResultReceiver == null) {
                StringBuilder sb = new StringBuilder("Cannot move a child from non-existing index:");
                sb.append(i);
                sb.append(this.MediaBrowserCompatMediaItem.toString());
                throw new IllegalArgumentException(sb.toString());
            }
            RemoteActionCompatParcelizer(i);
            IconCompatParcelizer(viewMediaBrowserCompatCustomActionResultReceiver, i2);
        }

        public final void AudioAttributesCompatParcelizer(View view, MediaDescriptionCompat mediaDescriptionCompat) {
            onPlayFromMediaId(view);
            mediaDescriptionCompat.write(view);
        }

        public final void IconCompatParcelizer(int i, MediaDescriptionCompat mediaDescriptionCompat) {
            View viewMediaBrowserCompatCustomActionResultReceiver = MediaBrowserCompatCustomActionResultReceiver(i);
            AudioAttributesCompatParcelizer(i);
            mediaDescriptionCompat.write(viewMediaBrowserCompatCustomActionResultReceiver);
        }

        public final int onPlay() {
            TypesKt typesKt = this.RemoteActionCompatParcelizer;
            if (typesKt != null) {
                return typesKt.read();
            }
            return 0;
        }

        public final View MediaBrowserCompatCustomActionResultReceiver(int i) {
            TypesKt typesKt = this.RemoteActionCompatParcelizer;
            if (typesKt != null) {
                return typesKt.read(i);
            }
            return null;
        }

        public final int onSeekTo() {
            return this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        }

        public final int onFastForward() {
            return this.AudioAttributesCompatParcelizer;
        }

        public final int onPrepare() {
            return this.onAddQueueItem;
        }

        public final int onMediaButtonEvent() {
            return this.write;
        }

        public int getPaddingLeft() {
            RecyclerView recyclerView = this.MediaBrowserCompatMediaItem;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        public int getPaddingTop() {
            RecyclerView recyclerView = this.MediaBrowserCompatMediaItem;
            if (recyclerView != null) {
                return recyclerView.getPaddingTop();
            }
            return 0;
        }

        public int getPaddingRight() {
            RecyclerView recyclerView = this.MediaBrowserCompatMediaItem;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        public int getPaddingBottom() {
            RecyclerView recyclerView = this.MediaBrowserCompatMediaItem;
            if (recyclerView != null) {
                return recyclerView.getPaddingBottom();
            }
            return 0;
        }

        public int getPaddingStart() {
            RecyclerView recyclerView = this.MediaBrowserCompatMediaItem;
            if (recyclerView != null) {
                return InvalidTypeIdException.onCommand(recyclerView);
            }
            return 0;
        }

        public int getPaddingEnd() {
            RecyclerView recyclerView = this.MediaBrowserCompatMediaItem;
            if (recyclerView != null) {
                return InvalidTypeIdException.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(recyclerView);
            }
            return 0;
        }

        public final View onPlayFromMediaId() {
            View focusedChild;
            RecyclerView recyclerView = this.MediaBrowserCompatMediaItem;
            if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.RemoteActionCompatParcelizer.IconCompatParcelizer(focusedChild)) {
                return null;
            }
            return focusedChild;
        }

        public final int onPrepareFromMediaId() {
            RecyclerView recyclerView = this.MediaBrowserCompatMediaItem;
            IconCompatParcelizer IconCompatParcelizer = recyclerView != null ? recyclerView.IconCompatParcelizer() : null;
            if (IconCompatParcelizer != null) {
                return IconCompatParcelizer.getItemCount();
            }
            return 0;
        }

        public void AudioAttributesImplBaseParcelizer(int i) {
            RecyclerView recyclerView = this.MediaBrowserCompatMediaItem;
            if (recyclerView != null) {
                recyclerView.AudioAttributesCompatParcelizer(i);
            }
        }

        public void AudioAttributesImplApi26Parcelizer(int i) {
            RecyclerView recyclerView = this.MediaBrowserCompatMediaItem;
            if (recyclerView != null) {
                recyclerView.AudioAttributesImplApi26Parcelizer(i);
            }
        }

        public final void onCustomAction(View view) {
            ViewParent parent = view.getParent();
            RecyclerView recyclerView = this.MediaBrowserCompatMediaItem;
            if (parent != recyclerView || recyclerView.indexOfChild(view) == -1) {
                StringBuilder sb = new StringBuilder("View should be fully attached to be ignored");
                sb.append(this.MediaBrowserCompatMediaItem.write());
                throw new IllegalArgumentException(sb.toString());
            }
            onMediaButtonEvent onmediabuttoneventIconCompatParcelizer = RecyclerView.IconCompatParcelizer(view);
            onmediabuttoneventIconCompatParcelizer.addFlags(128);
            this.MediaBrowserCompatMediaItem.onSetRating.MediaBrowserCompatCustomActionResultReceiver(onmediabuttoneventIconCompatParcelizer);
        }

        public static void onMediaButtonEvent(View view) {
            onMediaButtonEvent onmediabuttoneventIconCompatParcelizer = RecyclerView.IconCompatParcelizer(view);
            onmediabuttoneventIconCompatParcelizer.stopIgnoring();
            onmediabuttoneventIconCompatParcelizer.resetInternal();
            onmediabuttoneventIconCompatParcelizer.addFlags(4);
        }

        public final void write(MediaDescriptionCompat mediaDescriptionCompat) {
            for (int iOnPlay = onPlay() - 1; iOnPlay >= 0; iOnPlay--) {
                IconCompatParcelizer(mediaDescriptionCompat, iOnPlay, MediaBrowserCompatCustomActionResultReceiver(iOnPlay));
            }
        }

        private void IconCompatParcelizer(MediaDescriptionCompat mediaDescriptionCompat, int i, View view) {
            onMediaButtonEvent onmediabuttoneventIconCompatParcelizer = RecyclerView.IconCompatParcelizer(view);
            if (onmediabuttoneventIconCompatParcelizer.shouldIgnore()) {
                if (RecyclerView.AudioAttributesImplBaseParcelizer) {
                    Objects.toString(onmediabuttoneventIconCompatParcelizer);
                }
            } else if (onmediabuttoneventIconCompatParcelizer.isInvalid() && !onmediabuttoneventIconCompatParcelizer.isRemoved() && !this.MediaBrowserCompatMediaItem.MediaBrowserCompatItemReceiver.hasStableIds()) {
                AudioAttributesCompatParcelizer(i);
                mediaDescriptionCompat.read(onmediabuttoneventIconCompatParcelizer);
            } else {
                RemoteActionCompatParcelizer(i);
                mediaDescriptionCompat.RemoteActionCompatParcelizer(view);
                this.MediaBrowserCompatMediaItem.onSetRating.AudioAttributesCompatParcelizer(onmediabuttoneventIconCompatParcelizer);
            }
        }

        final void read(MediaDescriptionCompat mediaDescriptionCompat) {
            int iAudioAttributesCompatParcelizer = mediaDescriptionCompat.AudioAttributesCompatParcelizer();
            for (int i = iAudioAttributesCompatParcelizer - 1; i >= 0; i--) {
                View viewIconCompatParcelizer = mediaDescriptionCompat.IconCompatParcelizer(i);
                onMediaButtonEvent onmediabuttoneventIconCompatParcelizer = RecyclerView.IconCompatParcelizer(viewIconCompatParcelizer);
                if (!onmediabuttoneventIconCompatParcelizer.shouldIgnore()) {
                    onmediabuttoneventIconCompatParcelizer.setIsRecyclable(false);
                    if (onmediabuttoneventIconCompatParcelizer.isTmpDetached()) {
                        this.MediaBrowserCompatMediaItem.removeDetachedView(viewIconCompatParcelizer, false);
                    }
                    if (this.MediaBrowserCompatMediaItem.onCommand != null) {
                        this.MediaBrowserCompatMediaItem.onCommand.write(onmediabuttoneventIconCompatParcelizer);
                    }
                    onmediabuttoneventIconCompatParcelizer.setIsRecyclable(true);
                    mediaDescriptionCompat.read(viewIconCompatParcelizer);
                }
            }
            mediaDescriptionCompat.read();
            if (iAudioAttributesCompatParcelizer > 0) {
                this.MediaBrowserCompatMediaItem.invalidate();
            }
        }

        final boolean IconCompatParcelizer(View view, int i, int i2, LayoutParams layoutParams) {
            return (this.AudioAttributesImplApi21Parcelizer && RemoteActionCompatParcelizer(view.getMeasuredWidth(), i, ((ViewGroup.LayoutParams) layoutParams).width) && RemoteActionCompatParcelizer(view.getMeasuredHeight(), i2, ((ViewGroup.LayoutParams) layoutParams).height)) ? false : true;
        }

        final boolean read(View view, int i, int i2, LayoutParams layoutParams) {
            return (!view.isLayoutRequested() && this.AudioAttributesImplApi21Parcelizer && RemoteActionCompatParcelizer(view.getWidth(), i, ((ViewGroup.LayoutParams) layoutParams).width) && RemoteActionCompatParcelizer(view.getHeight(), i2, ((ViewGroup.LayoutParams) layoutParams).height)) ? false : true;
        }

        public final boolean onRewind() {
            return this.AudioAttributesImplApi21Parcelizer;
        }

        private static boolean RemoteActionCompatParcelizer(int i, int i2, int i3) {
            int mode = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            if (i3 > 0 && i != i3) {
                return false;
            }
            if (mode == Integer.MIN_VALUE) {
                return size >= i;
            }
            if (mode != 0) {
                return mode == 1073741824 && size == i;
            }
            return true;
        }

        public void onCommand(View view) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            Rect rectAudioAttributesImplApi21Parcelizer = this.MediaBrowserCompatMediaItem.AudioAttributesImplApi21Parcelizer(view);
            int i = rectAudioAttributesImplApi21Parcelizer.left;
            int i2 = rectAudioAttributesImplApi21Parcelizer.right;
            int i3 = rectAudioAttributesImplApi21Parcelizer.top;
            int i4 = rectAudioAttributesImplApi21Parcelizer.bottom;
            int iOnPrepare = onPrepare();
            int iOnSeekTo = onSeekTo();
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            int i5 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
            int iWrite = write(iOnPrepare, iOnSeekTo, paddingLeft + paddingRight + i5 + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin + i + i2, ((ViewGroup.LayoutParams) layoutParams).width, AudioAttributesImplApi26Parcelizer());
            int iOnMediaButtonEvent = onMediaButtonEvent();
            int iOnFastForward = onFastForward();
            int paddingTop = getPaddingTop();
            int paddingBottom = getPaddingBottom();
            int i6 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
            int iWrite2 = write(iOnMediaButtonEvent, iOnFastForward, paddingTop + paddingBottom + i6 + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin + i3 + i4, ((ViewGroup.LayoutParams) layoutParams).height, AudioAttributesImplApi21Parcelizer());
            if (read(view, iWrite, iWrite2, layoutParams)) {
                view.measure(iWrite, iWrite2);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x001e  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x002d  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static int write(int r3, int r4, int r5, int r6, boolean r7) {
            /*
                int r3 = r3 - r5
                r5 = 0
                int r3 = java.lang.Math.max(r5, r3)
                r0 = -1
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r2 = 1073741824(0x40000000, float:2.0)
                if (r7 == 0) goto L18
                if (r6 >= 0) goto L1a
                if (r6 != r0) goto L2d
                if (r4 == r1) goto L1e
                if (r4 == 0) goto L2d
                if (r4 == r2) goto L1e
                goto L2d
            L18:
                if (r6 < 0) goto L1c
            L1a:
                r4 = r2
                goto L2f
            L1c:
                if (r6 != r0) goto L20
            L1e:
                r6 = r3
                goto L2f
            L20:
                r7 = -2
                if (r6 != r7) goto L2d
                if (r4 == r1) goto L2a
                if (r4 == r2) goto L2a
                r6 = r3
                r4 = r5
                goto L2f
            L2a:
                r6 = r3
                r4 = r1
                goto L2f
            L2d:
                r4 = r5
                r6 = r4
            L2f:
                int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r4)
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.MediaBrowserCompatItemReceiver.write(int, int, int, int, boolean):int");
        }

        public static int AudioAttributesImplBaseParcelizer(View view) {
            Rect rect = ((LayoutParams) view.getLayoutParams()).RemoteActionCompatParcelizer;
            return view.getMeasuredWidth() + rect.left + rect.right;
        }

        public static int MediaBrowserCompatCustomActionResultReceiver(View view) {
            Rect rect = ((LayoutParams) view.getLayoutParams()).RemoteActionCompatParcelizer;
            return view.getMeasuredHeight() + rect.top + rect.bottom;
        }

        public static void RemoteActionCompatParcelizer(View view, int i, int i2, int i3, int i4) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            Rect rect = layoutParams.RemoteActionCompatParcelizer;
            view.layout(i + rect.left + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, i2 + rect.top + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, (i3 - rect.right) - ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, (i4 - rect.bottom) - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
        }

        public final void write(View view, Rect rect) {
            Matrix matrix;
            Rect rect2 = ((LayoutParams) view.getLayoutParams()).RemoteActionCompatParcelizer;
            rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            if (this.MediaBrowserCompatMediaItem != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
                RectF rectF = this.MediaBrowserCompatMediaItem.onSetRepeatMode;
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        public void read(View view, Rect rect) {
            RecyclerView.read(view, rect);
        }

        public static int MediaBrowserCompatItemReceiver(View view) {
            return view.getLeft() - MediaBrowserCompatSearchResultReceiver(view);
        }

        public static int RatingCompat(View view) {
            return view.getTop() - MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(view);
        }

        public static int MediaMetadataCompat(View view) {
            return view.getRight() + handleMediaPlayPauseIfPendingOnHandler(view);
        }

        public static int AudioAttributesImplApi21Parcelizer(View view) {
            return view.getBottom() + AudioAttributesImplApi26Parcelizer(view);
        }

        public final void AudioAttributesCompatParcelizer(View view, Rect rect) {
            RecyclerView recyclerView = this.MediaBrowserCompatMediaItem;
            if (recyclerView == null) {
                rect.set(0, 0, 0, 0);
            } else {
                rect.set(recyclerView.AudioAttributesImplApi21Parcelizer(view));
            }
        }

        public static int MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(View view) {
            return ((LayoutParams) view.getLayoutParams()).RemoteActionCompatParcelizer.top;
        }

        public static int AudioAttributesImplApi26Parcelizer(View view) {
            return ((LayoutParams) view.getLayoutParams()).RemoteActionCompatParcelizer.bottom;
        }

        public static int MediaBrowserCompatSearchResultReceiver(View view) {
            return ((LayoutParams) view.getLayoutParams()).RemoteActionCompatParcelizer.left;
        }

        public static int handleMediaPlayPauseIfPendingOnHandler(View view) {
            return ((LayoutParams) view.getLayoutParams()).RemoteActionCompatParcelizer.right;
        }

        private int[] IconCompatParcelizer(View view, Rect rect) {
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int iOnPrepare = onPrepare();
            int paddingRight = getPaddingRight();
            int iOnMediaButtonEvent = onMediaButtonEvent();
            int paddingBottom = getPaddingBottom();
            int left = (view.getLeft() + rect.left) - view.getScrollX();
            int top = (view.getTop() + rect.top) - view.getScrollY();
            int iWidth = rect.width();
            int iHeight = rect.height();
            int i = left - paddingLeft;
            int iMin = Math.min(0, i);
            int i2 = top - paddingTop;
            int iMin2 = Math.min(0, i2);
            int i3 = (iWidth + left) - (iOnPrepare - paddingRight);
            int iMax = Math.max(0, i3);
            int iMax2 = Math.max(0, (iHeight + top) - (iOnMediaButtonEvent - paddingBottom));
            if (onPlayFromSearch() == 1) {
                iMin = iMax != 0 ? iMax : Math.max(iMin, i3);
            } else if (iMin == 0) {
                iMin = Math.min(i, iMax);
            }
            if (iMin2 == 0) {
                iMin2 = Math.min(i2, iMax2);
            }
            return new int[]{iMin, iMin2};
        }

        public final boolean IconCompatParcelizer(RecyclerView recyclerView, View view, Rect rect, boolean z) {
            return IconCompatParcelizer(recyclerView, view, rect, z, false);
        }

        public boolean IconCompatParcelizer(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
            int[] iArrIconCompatParcelizer = IconCompatParcelizer(view, rect);
            int i = iArrIconCompatParcelizer[0];
            int i2 = iArrIconCompatParcelizer[1];
            if ((z2 && !write(recyclerView, i, i2)) || (i == 0 && i2 == 0)) {
                return false;
            }
            if (z) {
                recyclerView.scrollBy(i, i2);
            } else {
                recyclerView.AudioAttributesImplApi26Parcelizer(i, i2);
            }
            return true;
        }

        public final boolean onAddQueueItem(View view) {
            return !(this.AudioAttributesImplBaseParcelizer.write(view) && this.RatingCompat.write(view));
        }

        private boolean write(RecyclerView recyclerView, int i, int i2) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild == null) {
                return false;
            }
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int iOnPrepare = onPrepare();
            int paddingRight = getPaddingRight();
            int iOnMediaButtonEvent = onMediaButtonEvent();
            int paddingBottom = getPaddingBottom();
            Rect rect = this.MediaBrowserCompatMediaItem.onSetPlaybackSpeed;
            read(focusedChild, rect);
            return rect.left - i < iOnPrepare - paddingRight && rect.right - i > paddingLeft && rect.top - i2 < iOnMediaButtonEvent - paddingBottom && rect.bottom - i2 > paddingTop;
        }

        @Deprecated
        private boolean MediaBrowserCompatItemReceiver(RecyclerView recyclerView) {
            return onSetRepeatMode() || recyclerView.MediaBrowserCompatMediaItem();
        }

        public final boolean write(RecyclerView recyclerView) {
            return MediaBrowserCompatItemReceiver(recyclerView);
        }

        public void write(RecyclerView recyclerView, int i, int i2, Object obj) {
            IconCompatParcelizer(recyclerView, i, i2);
        }

        public final void write(int i, int i2) {
            this.MediaBrowserCompatMediaItem.IconCompatParcelizer(i, i2);
        }

        public final void RemoteActionCompatParcelizer(int i, int i2) {
            this.MediaBrowserCompatMediaItem.setMeasuredDimension(i, i2);
        }

        public final int onPlayFromUri() {
            return InvalidTypeIdException.MediaBrowserCompatSearchResultReceiver(this.MediaBrowserCompatMediaItem);
        }

        public final int onPrepareFromSearch() {
            return InvalidTypeIdException.RatingCompat(this.MediaBrowserCompatMediaItem);
        }

        final void onSkipToNext() {
            onCustomAction oncustomaction = this.MediaDescriptionCompat;
            if (oncustomaction != null) {
                oncustomaction.MediaBrowserCompatItemReceiver();
            }
        }

        final void read(onCustomAction oncustomaction) {
            if (this.MediaDescriptionCompat == oncustomaction) {
                this.MediaDescriptionCompat = null;
            }
        }

        public final void RemoteActionCompatParcelizer(MediaDescriptionCompat mediaDescriptionCompat) {
            for (int iOnPlay = onPlay() - 1; iOnPlay >= 0; iOnPlay--) {
                if (!RecyclerView.IconCompatParcelizer(MediaBrowserCompatCustomActionResultReceiver(iOnPlay)).shouldIgnore()) {
                    IconCompatParcelizer(iOnPlay, mediaDescriptionCompat);
                }
            }
        }

        public final void AudioAttributesCompatParcelizer(hasSuperClassStartingWith hassuperclassstartingwith) {
            IconCompatParcelizer(this.MediaBrowserCompatMediaItem.onRemoveQueueItemAt, this.MediaBrowserCompatMediaItem.onPrepareFromUri, hassuperclassstartingwith);
        }

        public void IconCompatParcelizer(MediaDescriptionCompat mediaDescriptionCompat, MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, hasSuperClassStartingWith hassuperclassstartingwith) {
            if (this.MediaBrowserCompatMediaItem.canScrollVertically(-1) || this.MediaBrowserCompatMediaItem.canScrollHorizontally(-1)) {
                hassuperclassstartingwith.AudioAttributesCompatParcelizer(8192);
                hassuperclassstartingwith.handleMediaPlayPauseIfPendingOnHandler(true);
            }
            if (this.MediaBrowserCompatMediaItem.canScrollVertically(1) || this.MediaBrowserCompatMediaItem.canScrollHorizontally(1)) {
                hassuperclassstartingwith.AudioAttributesCompatParcelizer(4096);
                hassuperclassstartingwith.handleMediaPlayPauseIfPendingOnHandler(true);
            }
            hassuperclassstartingwith.RemoteActionCompatParcelizer(hasSuperClassStartingWith.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(RemoteActionCompatParcelizer(mediaDescriptionCompat, mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver), IconCompatParcelizer(mediaDescriptionCompat, mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver), false, 0));
        }

        public void RemoteActionCompatParcelizer(AccessibilityEvent accessibilityEvent) {
            MediaDescriptionCompat mediaDescriptionCompat = this.MediaBrowserCompatMediaItem.onRemoveQueueItemAt;
            MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = this.MediaBrowserCompatMediaItem.onPrepareFromUri;
            read(accessibilityEvent);
        }

        private void read(AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.MediaBrowserCompatMediaItem;
            if (recyclerView == null || accessibilityEvent == null) {
                return;
            }
            boolean z = true;
            if (!recyclerView.canScrollVertically(1) && !this.MediaBrowserCompatMediaItem.canScrollVertically(-1) && !this.MediaBrowserCompatMediaItem.canScrollHorizontally(-1) && !this.MediaBrowserCompatMediaItem.canScrollHorizontally(1)) {
                z = false;
            }
            accessibilityEvent.setScrollable(z);
            if (this.MediaBrowserCompatMediaItem.MediaBrowserCompatItemReceiver != null) {
                accessibilityEvent.setItemCount(this.MediaBrowserCompatMediaItem.MediaBrowserCompatItemReceiver.getItemCount());
            }
        }

        public final void IconCompatParcelizer(View view, hasSuperClassStartingWith hassuperclassstartingwith) {
            onMediaButtonEvent onmediabuttoneventIconCompatParcelizer = RecyclerView.IconCompatParcelizer(view);
            if (onmediabuttoneventIconCompatParcelizer == null || onmediabuttoneventIconCompatParcelizer.isRemoved() || this.RemoteActionCompatParcelizer.IconCompatParcelizer(onmediabuttoneventIconCompatParcelizer.itemView)) {
                return;
            }
            IconCompatParcelizer(this.MediaBrowserCompatMediaItem.onRemoveQueueItemAt, this.MediaBrowserCompatMediaItem.onPrepareFromUri, view, hassuperclassstartingwith);
        }

        public final void onSetShuffleMode() {
            this.MediaBrowserCompatSearchResultReceiver = true;
        }

        public final boolean AudioAttributesCompatParcelizer(int i, Bundle bundle) {
            return write(this.MediaBrowserCompatMediaItem.onRemoveQueueItemAt, this.MediaBrowserCompatMediaItem.onPrepareFromUri, i, bundle);
        }

        public boolean write(MediaDescriptionCompat mediaDescriptionCompat, MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, int i, Bundle bundle) {
            int paddingTop;
            int paddingLeft;
            int i2;
            int i3;
            if (this.MediaBrowserCompatMediaItem == null) {
                return false;
            }
            int iOnMediaButtonEvent = onMediaButtonEvent();
            int iOnPrepare = onPrepare();
            Rect rect = new Rect();
            if (this.MediaBrowserCompatMediaItem.getMatrix().isIdentity() && this.MediaBrowserCompatMediaItem.getGlobalVisibleRect(rect)) {
                iOnMediaButtonEvent = rect.height();
                iOnPrepare = rect.width();
            }
            if (i == 4096) {
                paddingTop = this.MediaBrowserCompatMediaItem.canScrollVertically(1) ? (iOnMediaButtonEvent - getPaddingTop()) - getPaddingBottom() : 0;
                if (this.MediaBrowserCompatMediaItem.canScrollHorizontally(1)) {
                    paddingLeft = (iOnPrepare - getPaddingLeft()) - getPaddingRight();
                    i2 = paddingTop;
                    i3 = paddingLeft;
                }
                i2 = paddingTop;
                i3 = 0;
            } else if (i != 8192) {
                i3 = 0;
                i2 = 0;
            } else {
                paddingTop = this.MediaBrowserCompatMediaItem.canScrollVertically(-1) ? -((iOnMediaButtonEvent - getPaddingTop()) - getPaddingBottom()) : 0;
                if (this.MediaBrowserCompatMediaItem.canScrollHorizontally(-1)) {
                    paddingLeft = -((iOnPrepare - getPaddingLeft()) - getPaddingRight());
                    i2 = paddingTop;
                    i3 = paddingLeft;
                }
                i2 = paddingTop;
                i3 = 0;
            }
            if (i2 == 0 && i3 == 0) {
                return false;
            }
            this.MediaBrowserCompatMediaItem.write(i3, i2, (Interpolator) null, Integer.MIN_VALUE, true);
            return true;
        }

        public final boolean onSetCaptioningEnabled() {
            MediaDescriptionCompat mediaDescriptionCompat = this.MediaBrowserCompatMediaItem.onRemoveQueueItemAt;
            MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = this.MediaBrowserCompatMediaItem.onPrepareFromUri;
            return false;
        }

        public static write read(Context context, AttributeSet attributeSet, int i, int i2) {
            write writeVar = new write();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, accessgetTRUEcp.IconCompatParcelizer.RecyclerView, i, i2);
            writeVar.write = typedArrayObtainStyledAttributes.getInt(accessgetTRUEcp.IconCompatParcelizer.RecyclerView_android_orientation, 1);
            writeVar.AudioAttributesCompatParcelizer = typedArrayObtainStyledAttributes.getInt(accessgetTRUEcp.IconCompatParcelizer.RecyclerView_spanCount, 1);
            writeVar.RemoteActionCompatParcelizer = typedArrayObtainStyledAttributes.getBoolean(accessgetTRUEcp.IconCompatParcelizer.RecyclerView_reverseLayout, false);
            writeVar.IconCompatParcelizer = typedArrayObtainStyledAttributes.getBoolean(accessgetTRUEcp.IconCompatParcelizer.RecyclerView_stackFromEnd, false);
            typedArrayObtainStyledAttributes.recycle();
            return writeVar;
        }

        final void IconCompatParcelizer(RecyclerView recyclerView) {
            IconCompatParcelizer(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
        }

        final boolean onRemoveQueueItemAt() {
            int iOnPlay = onPlay();
            for (int i = 0; i < iOnPlay; i++) {
                ViewGroup.LayoutParams layoutParams = MediaBrowserCompatCustomActionResultReceiver(i).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
            return false;
        }
    }

    public static abstract class AudioAttributesImplBaseParcelizer {
        public void AudioAttributesCompatParcelizer(Canvas canvas, RecyclerView recyclerView, MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) {
        }

        public void IconCompatParcelizer(Canvas canvas, RecyclerView recyclerView, MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) {
        }

        @Deprecated
        private static void RemoteActionCompatParcelizer(Rect rect) {
            rect.set(0, 0, 0, 0);
        }

        public void IconCompatParcelizer(Rect rect, View view, RecyclerView recyclerView, MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) {
            ((LayoutParams) view.getLayoutParams()).O_();
            RemoteActionCompatParcelizer(rect);
        }
    }

    public static abstract class onMediaButtonEvent {
        static final int FLAG_ADAPTER_FULLUPDATE = 1024;
        static final int FLAG_ADAPTER_POSITION_UNKNOWN = 512;
        static final int FLAG_APPEARED_IN_PRE_LAYOUT = 4096;
        static final int FLAG_BOUNCED_FROM_HIDDEN_LIST = 8192;
        static final int FLAG_BOUND = 1;
        static final int FLAG_IGNORE = 128;
        static final int FLAG_INVALID = 4;
        static final int FLAG_MOVED = 2048;
        static final int FLAG_NOT_RECYCLABLE = 16;
        static final int FLAG_REMOVED = 8;
        static final int FLAG_RETURNED_FROM_SCRAP = 32;
        static final int FLAG_TMP_DETACHED = 256;
        static final int FLAG_UPDATE = 2;
        private static final List<Object> FULLUPDATE_PAYLOADS = Collections.emptyList();
        static final int PENDING_ACCESSIBILITY_STATE_NOT_SET = -1;
        public final View itemView;
        IconCompatParcelizer<? extends onMediaButtonEvent> mBindingAdapter;
        int mFlags;
        public WeakReference<RecyclerView> mNestedRecyclerView;
        RecyclerView mOwnerRecyclerView;
        public int mPosition = -1;
        int mOldPosition = -1;
        long mItemId = -1;
        int mItemViewType = -1;
        int mPreLayoutPosition = -1;
        onMediaButtonEvent mShadowedHolder = null;
        onMediaButtonEvent mShadowingHolder = null;
        List<Object> mPayloads = null;
        List<Object> mUnmodifiedPayloads = null;
        private int mIsRecyclableCount = 0;
        MediaDescriptionCompat mScrapContainer = null;
        boolean mInChangeScrap = false;
        private int mWasImportantForAccessibilityBeforeHidden = 0;
        int mPendingAccessibilityState = -1;

        public onMediaButtonEvent(View view) {
            if (view == null) {
                throw new IllegalArgumentException("itemView may not be null");
            }
            this.itemView = view;
        }

        void flagRemovedAndOffsetPosition(int i, int i2, boolean z) {
            addFlags(8);
            offsetPosition(i2, z);
            this.mPosition = i;
        }

        void offsetPosition(int i, boolean z) {
            if (this.mOldPosition == -1) {
                this.mOldPosition = this.mPosition;
            }
            if (this.mPreLayoutPosition == -1) {
                this.mPreLayoutPosition = this.mPosition;
            }
            if (z) {
                this.mPreLayoutPosition += i;
            }
            this.mPosition += i;
            if (this.itemView.getLayoutParams() != null) {
                ((LayoutParams) this.itemView.getLayoutParams()).AudioAttributesCompatParcelizer = true;
            }
        }

        void clearOldPosition() {
            this.mOldPosition = -1;
            this.mPreLayoutPosition = -1;
        }

        void saveOldPosition() {
            if (this.mOldPosition == -1) {
                this.mOldPosition = this.mPosition;
            }
        }

        public boolean shouldIgnore() {
            return (this.mFlags & 128) != 0;
        }

        @Deprecated
        public final int getPosition() {
            int i = this.mPreLayoutPosition;
            return i == -1 ? this.mPosition : i;
        }

        public final int getLayoutPosition() {
            int i = this.mPreLayoutPosition;
            return i == -1 ? this.mPosition : i;
        }

        @Deprecated
        public final int getAdapterPosition() {
            return getBindingAdapterPosition();
        }

        public final int getBindingAdapterPosition() {
            RecyclerView recyclerView;
            IconCompatParcelizer IconCompatParcelizer;
            int iRemoteActionCompatParcelizer;
            if (this.mBindingAdapter == null || (recyclerView = this.mOwnerRecyclerView) == null || (IconCompatParcelizer = recyclerView.IconCompatParcelizer()) == null || (iRemoteActionCompatParcelizer = this.mOwnerRecyclerView.RemoteActionCompatParcelizer(this)) == -1) {
                return -1;
            }
            return IconCompatParcelizer.findRelativeAdapterPositionIn(this.mBindingAdapter, this, iRemoteActionCompatParcelizer);
        }

        public final int getAbsoluteAdapterPosition() {
            RecyclerView recyclerView = this.mOwnerRecyclerView;
            if (recyclerView == null) {
                return -1;
            }
            return recyclerView.RemoteActionCompatParcelizer(this);
        }

        public final IconCompatParcelizer<? extends onMediaButtonEvent> getBindingAdapter() {
            return this.mBindingAdapter;
        }

        public final int getOldPosition() {
            return this.mOldPosition;
        }

        public final long getItemId() {
            return this.mItemId;
        }

        public final int getItemViewType() {
            return this.mItemViewType;
        }

        boolean isScrap() {
            return this.mScrapContainer != null;
        }

        void unScrap() {
            this.mScrapContainer.AudioAttributesCompatParcelizer(this);
        }

        boolean wasReturnedFromScrap() {
            return (this.mFlags & 32) != 0;
        }

        void clearReturnedFromScrapFlag() {
            this.mFlags &= -33;
        }

        void clearTmpDetachFlag() {
            this.mFlags &= -257;
        }

        void stopIgnoring() {
            this.mFlags &= -129;
        }

        void setScrapContainer(MediaDescriptionCompat mediaDescriptionCompat, boolean z) {
            this.mScrapContainer = mediaDescriptionCompat;
            this.mInChangeScrap = z;
        }

        public boolean isInvalid() {
            return (this.mFlags & 4) != 0;
        }

        boolean needsUpdate() {
            return (this.mFlags & 2) != 0;
        }

        public boolean isBound() {
            return (this.mFlags & 1) != 0;
        }

        public boolean isRemoved() {
            return (this.mFlags & 8) != 0;
        }

        boolean hasAnyOfTheFlags(int i) {
            return (this.mFlags & i) != 0;
        }

        boolean isTmpDetached() {
            return (this.mFlags & 256) != 0;
        }

        boolean isAttachedToTransitionOverlay() {
            return (this.itemView.getParent() == null || this.itemView.getParent() == this.mOwnerRecyclerView) ? false : true;
        }

        boolean isAdapterPositionUnknown() {
            return (this.mFlags & 512) != 0 || isInvalid();
        }

        void setFlags(int i, int i2) {
            this.mFlags = (i & i2) | ((~i2) & this.mFlags);
        }

        void addFlags(int i) {
            this.mFlags = i | this.mFlags;
        }

        void addChangePayload(Object obj) {
            if (obj == null) {
                addFlags(1024);
            } else if ((1024 & this.mFlags) == 0) {
                createPayloadsIfNeeded();
                this.mPayloads.add(obj);
            }
        }

        private void createPayloadsIfNeeded() {
            if (this.mPayloads == null) {
                ArrayList arrayList = new ArrayList();
                this.mPayloads = arrayList;
                this.mUnmodifiedPayloads = Collections.unmodifiableList(arrayList);
            }
        }

        void clearPayload() {
            List<Object> list = this.mPayloads;
            if (list != null) {
                list.clear();
            }
            this.mFlags &= -1025;
        }

        List<Object> getUnmodifiedPayloads() {
            if ((this.mFlags & 1024) == 0) {
                List<Object> list = this.mPayloads;
                if (list == null || list.size() == 0) {
                    return FULLUPDATE_PAYLOADS;
                }
                return this.mUnmodifiedPayloads;
            }
            return FULLUPDATE_PAYLOADS;
        }

        void resetInternal() {
            if (RecyclerView.AudioAttributesImplApi26Parcelizer && isTmpDetached()) {
                StringBuilder sb = new StringBuilder("Attempting to reset temp-detached ViewHolder: ");
                sb.append(this);
                sb.append(". ViewHolders should be fully detached before resetting.");
                throw new IllegalStateException(sb.toString());
            }
            this.mFlags = 0;
            this.mPosition = -1;
            this.mOldPosition = -1;
            this.mItemId = -1L;
            this.mPreLayoutPosition = -1;
            this.mIsRecyclableCount = 0;
            this.mShadowedHolder = null;
            this.mShadowingHolder = null;
            clearPayload();
            this.mWasImportantForAccessibilityBeforeHidden = 0;
            this.mPendingAccessibilityState = -1;
            RecyclerView.read(this);
        }

        void onEnteredHiddenState(RecyclerView recyclerView) {
            int i = this.mPendingAccessibilityState;
            if (i != -1) {
                this.mWasImportantForAccessibilityBeforeHidden = i;
            } else {
                this.mWasImportantForAccessibilityBeforeHidden = InvalidTypeIdException.MediaBrowserCompatItemReceiver(this.itemView);
            }
            recyclerView.read(this, 4);
        }

        void onLeftHiddenState(RecyclerView recyclerView) {
            recyclerView.read(this, this.mWasImportantForAccessibilityBeforeHidden);
            this.mWasImportantForAccessibilityBeforeHidden = 0;
        }

        public String toString() {
            String simpleName = getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName();
            StringBuilder sb = new StringBuilder();
            sb.append(simpleName);
            sb.append("{");
            sb.append(Integer.toHexString(hashCode()));
            sb.append(" position=");
            sb.append(this.mPosition);
            sb.append(" id=");
            sb.append(this.mItemId);
            sb.append(", oldPos=");
            sb.append(this.mOldPosition);
            sb.append(", pLpos:");
            sb.append(this.mPreLayoutPosition);
            StringBuilder sb2 = new StringBuilder(sb.toString());
            if (isScrap()) {
                sb2.append(" scrap ");
                sb2.append(this.mInChangeScrap ? "[changeScrap]" : "[attachedScrap]");
            }
            if (isInvalid()) {
                sb2.append(" invalid");
            }
            if (!isBound()) {
                sb2.append(" unbound");
            }
            if (needsUpdate()) {
                sb2.append(" update");
            }
            if (isRemoved()) {
                sb2.append(" removed");
            }
            if (shouldIgnore()) {
                sb2.append(" ignored");
            }
            if (isTmpDetached()) {
                sb2.append(" tmpDetached");
            }
            if (!isRecyclable()) {
                StringBuilder sb3 = new StringBuilder(" not recyclable(");
                sb3.append(this.mIsRecyclableCount);
                sb3.append(")");
                sb2.append(sb3.toString());
            }
            if (isAdapterPositionUnknown()) {
                sb2.append(" undefined adapter position");
            }
            if (this.itemView.getParent() == null) {
                sb2.append(" no parent");
            }
            sb2.append("}");
            return sb2.toString();
        }

        public final void setIsRecyclable(boolean z) {
            int i = this.mIsRecyclableCount;
            int i2 = z ? i - 1 : i + 1;
            this.mIsRecyclableCount = i2;
            if (i2 < 0) {
                this.mIsRecyclableCount = 0;
                if (RecyclerView.AudioAttributesImplApi26Parcelizer) {
                    throw new RuntimeException("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for ".concat(String.valueOf(this)));
                }
                toString();
            } else if (!z && i2 == 1) {
                this.mFlags |= 16;
            } else if (z && i2 == 0) {
                this.mFlags &= -17;
            }
            if (RecyclerView.AudioAttributesImplBaseParcelizer) {
                toString();
            }
        }

        public final boolean isRecyclable() {
            return (this.mFlags & 16) == 0 && !InvalidTypeIdException.onPrepare(this.itemView);
        }

        boolean shouldBeKeptAsChild() {
            return (this.mFlags & 16) != 0;
        }

        boolean doesTransientStatePreventRecycling() {
            return (this.mFlags & 16) == 0 && InvalidTypeIdException.onPrepare(this.itemView);
        }

        boolean isUpdated() {
            return (this.mFlags & 2) != 0;
        }
    }

    final boolean read(onMediaButtonEvent onmediabuttonevent, int i) {
        if (MediaBrowserCompatMediaItem()) {
            onmediabuttonevent.mPendingAccessibilityState = i;
            this.onPrepareFromSearch.add(onmediabuttonevent);
            return false;
        }
        InvalidTypeIdException.AudioAttributesImplBaseParcelizer(onmediabuttonevent.itemView, i);
        return true;
    }

    private void onSetPlaybackSpeed() {
        int i;
        for (int size = this.onPrepareFromSearch.size() - 1; size >= 0; size--) {
            onMediaButtonEvent onmediabuttonevent = this.onPrepareFromSearch.get(size);
            if (onmediabuttonevent.itemView.getParent() == this && !onmediabuttonevent.shouldIgnore() && (i = onmediabuttonevent.mPendingAccessibilityState) != -1) {
                InvalidTypeIdException.AudioAttributesImplBaseParcelizer(onmediabuttonevent.itemView, i);
                onmediabuttonevent.mPendingAccessibilityState = -1;
            }
        }
        this.onPrepareFromSearch.clear();
    }

    final int RemoteActionCompatParcelizer(onMediaButtonEvent onmediabuttonevent) {
        if (onmediabuttonevent.hasAnyOfTheFlags(524) || !onmediabuttonevent.isBound()) {
            return -1;
        }
        return this.MediaMetadataCompat.IconCompatParcelizer(onmediabuttonevent.mPosition);
    }

    private void IconCompatParcelizer(StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2) {
        if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
            StringBuilder sb = new StringBuilder("Trying to set fast scroller without both required drawables.");
            sb.append(write());
            throw new IllegalArgumentException(sb.toString());
        }
        Resources resources = getContext().getResources();
        new SequenceDeserializer(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(accessgetTRUEcp.AudioAttributesCompatParcelizer.fastscroll_default_thickness), resources.getDimensionPixelSize(accessgetTRUEcp.AudioAttributesCompatParcelizer.fastscroll_minimum_range), resources.getDimensionPixelOffset(accessgetTRUEcp.AudioAttributesCompatParcelizer.fastscroll_margin));
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        onPause().write(z);
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return onPause().read();
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i) {
        return onPause().write(i);
    }

    private boolean MediaBrowserCompatMediaItem(int i, int i2) {
        return onPause().read(i, i2);
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        onPause().IconCompatParcelizer();
    }

    public final void MediaBrowserCompatCustomActionResultReceiver(int i) {
        onPause().AudioAttributesCompatParcelizer(i);
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return onPause().write();
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return onPause().RemoteActionCompatParcelizer(i, i2, i3, i4, iArr);
    }

    public final void write(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        onPause().IconCompatParcelizer(i, i2, i3, i4, iArr, i5, iArr2);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return onPause().write(i, i2, iArr, iArr2);
    }

    public final boolean write(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return onPause().write(i, i2, iArr, iArr2, i3);
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return onPause().AudioAttributesCompatParcelizer(f, f2, z);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f, float f2) {
        return onPause().RemoteActionCompatParcelizer(f, f2);
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        boolean AudioAttributesCompatParcelizer;
        onMediaButtonEvent AudioAttributesImplBaseParcelizer;
        final Rect RemoteActionCompatParcelizer;
        boolean write;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.RemoteActionCompatParcelizer = new Rect();
            this.AudioAttributesCompatParcelizer = true;
            this.write = false;
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.RemoteActionCompatParcelizer = new Rect();
            this.AudioAttributesCompatParcelizer = true;
            this.write = false;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.RemoteActionCompatParcelizer = new Rect();
            this.AudioAttributesCompatParcelizer = true;
            this.write = false;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.RemoteActionCompatParcelizer = new Rect();
            this.AudioAttributesCompatParcelizer = true;
            this.write = false;
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((ViewGroup.LayoutParams) layoutParams);
            this.RemoteActionCompatParcelizer = new Rect();
            this.AudioAttributesCompatParcelizer = true;
            this.write = false;
        }

        public final boolean R_() {
            return this.AudioAttributesImplBaseParcelizer.isInvalid();
        }

        public final boolean Q_() {
            return this.AudioAttributesImplBaseParcelizer.isRemoved();
        }

        public final boolean P_() {
            return this.AudioAttributesImplBaseParcelizer.isUpdated();
        }

        public final int O_() {
            return this.AudioAttributesImplBaseParcelizer.getLayoutPosition();
        }

        @Deprecated
        public final int N_() {
            return this.AudioAttributesImplBaseParcelizer.getBindingAdapterPosition();
        }
    }

    public static abstract class read {
        public void AudioAttributesCompatParcelizer(int i, int i2) {
        }

        public void IconCompatParcelizer() {
        }

        public void IconCompatParcelizer(int i, int i2) {
        }

        public void RemoteActionCompatParcelizer(int i, int i2) {
        }

        public void read() {
        }

        public void read(int i, int i2) {
        }

        public void AudioAttributesCompatParcelizer(int i, int i2, Object obj) {
            IconCompatParcelizer(i, i2);
        }
    }

    public static abstract class onCustomAction {
        private RecyclerView AudioAttributesCompatParcelizer;
        private boolean IconCompatParcelizer;
        private boolean MediaBrowserCompatCustomActionResultReceiver;
        private View MediaBrowserCompatItemReceiver;
        private boolean RemoteActionCompatParcelizer;
        private MediaBrowserCompatItemReceiver write;
        private int AudioAttributesImplBaseParcelizer = -1;
        private final write read = new write();

        public interface RemoteActionCompatParcelizer {
            PointF RemoteActionCompatParcelizer(int i);
        }

        protected abstract void AudioAttributesCompatParcelizer();

        protected abstract void IconCompatParcelizer(int i, int i2, write writeVar);

        protected abstract void IconCompatParcelizer(View view, write writeVar);

        final void AudioAttributesCompatParcelizer(RecyclerView recyclerView, MediaBrowserCompatItemReceiver mediaBrowserCompatItemReceiver) {
            recyclerView.onSetCaptioningEnabled.read();
            if (this.MediaBrowserCompatCustomActionResultReceiver) {
                getClass().getSimpleName();
                getClass().getSimpleName();
            }
            this.AudioAttributesCompatParcelizer = recyclerView;
            this.write = mediaBrowserCompatItemReceiver;
            if (this.AudioAttributesImplBaseParcelizer == -1) {
                throw new IllegalArgumentException("Invalid target position");
            }
            recyclerView.onPrepareFromUri.MediaDescriptionCompat = this.AudioAttributesImplBaseParcelizer;
            this.IconCompatParcelizer = true;
            this.RemoteActionCompatParcelizer = true;
            this.MediaBrowserCompatItemReceiver = write(write());
            this.AudioAttributesCompatParcelizer.onSetCaptioningEnabled.AudioAttributesCompatParcelizer();
            this.MediaBrowserCompatCustomActionResultReceiver = true;
        }

        public final void RemoteActionCompatParcelizer(int i) {
            this.AudioAttributesImplBaseParcelizer = i;
        }

        public PointF read(int i) {
            Object obj = read();
            if (obj instanceof RemoteActionCompatParcelizer) {
                return ((RemoteActionCompatParcelizer) obj).RemoteActionCompatParcelizer(i);
            }
            return null;
        }

        public final MediaBrowserCompatItemReceiver read() {
            return this.write;
        }

        protected final void MediaBrowserCompatItemReceiver() {
            if (this.IconCompatParcelizer) {
                this.IconCompatParcelizer = false;
                AudioAttributesCompatParcelizer();
                this.AudioAttributesCompatParcelizer.onPrepareFromUri.MediaDescriptionCompat = -1;
                this.MediaBrowserCompatItemReceiver = null;
                this.AudioAttributesImplBaseParcelizer = -1;
                this.RemoteActionCompatParcelizer = false;
                this.write.read(this);
                this.write = null;
                this.AudioAttributesCompatParcelizer = null;
            }
        }

        public final boolean IconCompatParcelizer() {
            return this.RemoteActionCompatParcelizer;
        }

        public final boolean MediaBrowserCompatCustomActionResultReceiver() {
            return this.IconCompatParcelizer;
        }

        public final int write() {
            return this.AudioAttributesImplBaseParcelizer;
        }

        final void RemoteActionCompatParcelizer(int i, int i2) {
            PointF pointF;
            RecyclerView recyclerView = this.AudioAttributesCompatParcelizer;
            if (this.AudioAttributesImplBaseParcelizer == -1 || recyclerView == null) {
                MediaBrowserCompatItemReceiver();
            }
            if (this.RemoteActionCompatParcelizer && this.MediaBrowserCompatItemReceiver == null && this.write != null && (pointF = read(this.AudioAttributesImplBaseParcelizer)) != null && (pointF.x != BitmapDescriptorFactory.HUE_RED || pointF.y != BitmapDescriptorFactory.HUE_RED)) {
                recyclerView.AudioAttributesCompatParcelizer((int) Math.signum(pointF.x), (int) Math.signum(pointF.y), (int[]) null);
            }
            this.RemoteActionCompatParcelizer = false;
            View view = this.MediaBrowserCompatItemReceiver;
            if (view != null) {
                if (AudioAttributesCompatParcelizer(view) == this.AudioAttributesImplBaseParcelizer) {
                    View view2 = this.MediaBrowserCompatItemReceiver;
                    MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = recyclerView.onPrepareFromUri;
                    IconCompatParcelizer(view2, this.read);
                    this.read.write(recyclerView);
                    MediaBrowserCompatItemReceiver();
                } else {
                    this.MediaBrowserCompatItemReceiver = null;
                }
            }
            if (this.IconCompatParcelizer) {
                MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver2 = recyclerView.onPrepareFromUri;
                IconCompatParcelizer(i, i2, this.read);
                boolean zWrite = this.read.write();
                this.read.write(recyclerView);
                if (zWrite && this.IconCompatParcelizer) {
                    this.RemoteActionCompatParcelizer = true;
                    recyclerView.onSetCaptioningEnabled.AudioAttributesCompatParcelizer();
                }
            }
        }

        private int AudioAttributesCompatParcelizer(View view) {
            return RecyclerView.AudioAttributesImplBaseParcelizer(view);
        }

        public final int RemoteActionCompatParcelizer() {
            return this.AudioAttributesCompatParcelizer.onPlayFromMediaId.onPlay();
        }

        private View write(int i) {
            return this.AudioAttributesCompatParcelizer.onPlayFromMediaId.write(i);
        }

        protected final void write(View view) {
            if (AudioAttributesCompatParcelizer(view) == write()) {
                this.MediaBrowserCompatItemReceiver = view;
                boolean z = RecyclerView.AudioAttributesImplBaseParcelizer;
            }
        }

        protected static void IconCompatParcelizer(PointF pointF) {
            float fSqrt = (float) Math.sqrt((pointF.x * pointF.x) + (pointF.y * pointF.y));
            pointF.x /= fSqrt;
            pointF.y /= fSqrt;
        }

        public static class write {
            private int AudioAttributesCompatParcelizer;
            private Interpolator AudioAttributesImplApi26Parcelizer;
            private int IconCompatParcelizer;
            private int MediaBrowserCompatItemReceiver;
            private boolean RemoteActionCompatParcelizer;
            private int read;
            private int write;

            public write() {
                this(0, 0);
            }

            private write(int i, int i2) {
                this.MediaBrowserCompatItemReceiver = -1;
                this.RemoteActionCompatParcelizer = false;
                this.AudioAttributesCompatParcelizer = 0;
                this.IconCompatParcelizer = 0;
                this.read = 0;
                this.write = Integer.MIN_VALUE;
                this.AudioAttributesImplApi26Parcelizer = null;
            }

            public final void read(int i) {
                this.MediaBrowserCompatItemReceiver = i;
            }

            final boolean write() {
                return this.MediaBrowserCompatItemReceiver >= 0;
            }

            final void write(RecyclerView recyclerView) {
                int i = this.MediaBrowserCompatItemReceiver;
                if (i >= 0) {
                    this.MediaBrowserCompatItemReceiver = -1;
                    recyclerView.write(i);
                    this.RemoteActionCompatParcelizer = false;
                } else {
                    if (this.RemoteActionCompatParcelizer) {
                        RemoteActionCompatParcelizer();
                        recyclerView.onSetCaptioningEnabled.RemoteActionCompatParcelizer(this.IconCompatParcelizer, this.read, this.write, this.AudioAttributesImplApi26Parcelizer);
                        this.AudioAttributesCompatParcelizer++;
                        this.RemoteActionCompatParcelizer = false;
                        return;
                    }
                    this.AudioAttributesCompatParcelizer = 0;
                }
            }

            private void RemoteActionCompatParcelizer() {
                if (this.AudioAttributesImplApi26Parcelizer != null && this.write <= 0) {
                    throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                }
                if (this.write <= 0) {
                    throw new IllegalStateException("Scroll duration must be a positive number");
                }
            }

            public final void IconCompatParcelizer(int i, int i2, int i3, Interpolator interpolator) {
                this.IconCompatParcelizer = i;
                this.read = i2;
                this.write = i3;
                this.AudioAttributesImplApi26Parcelizer = interpolator;
                this.RemoteActionCompatParcelizer = true;
            }
        }
    }

    static class AudioAttributesCompatParcelizer extends Observable<read> {
        AudioAttributesCompatParcelizer() {
        }

        public final boolean write() {
            return !((Observable) this).mObservers.isEmpty();
        }

        public final void RemoteActionCompatParcelizer() {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((read) ((Observable) this).mObservers.get(size)).read();
            }
        }

        public final void AudioAttributesCompatParcelizer() {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((read) ((Observable) this).mObservers.get(size)).IconCompatParcelizer();
            }
        }

        public final void write(int i, int i2) {
            RemoteActionCompatParcelizer(i, i2, null);
        }

        public final void RemoteActionCompatParcelizer(int i, int i2, Object obj) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((read) ((Observable) this).mObservers.get(size)).AudioAttributesCompatParcelizer(i, i2, obj);
            }
        }

        public final void IconCompatParcelizer(int i, int i2) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((read) ((Observable) this).mObservers.get(size)).AudioAttributesCompatParcelizer(i, i2);
            }
        }

        public final void RemoteActionCompatParcelizer(int i, int i2) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((read) ((Observable) this).mObservers.get(size)).read(i, i2);
            }
        }

        public final void read(int i, int i2) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((read) ((Observable) this).mObservers.get(size)).RemoteActionCompatParcelizer(i, i2);
            }
        }
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: androidx.recyclerview.widget.RecyclerView.SavedState.3
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return AudioAttributesCompatParcelizer(parcel);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final /* synthetic */ SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return RemoteActionCompatParcelizer(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ Object[] newArray(int i) {
                return AudioAttributesCompatParcelizer(i);
            }

            private static SavedState RemoteActionCompatParcelizer(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            private static SavedState AudioAttributesCompatParcelizer(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            private static SavedState[] AudioAttributesCompatParcelizer(int i) {
                return new SavedState[i];
            }
        };
        Parcelable read;

        SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.read = parcel.readParcelable(classLoader == null ? MediaBrowserCompatItemReceiver.class.getClassLoader() : classLoader);
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeParcelable(this.read, 0);
        }

        final void write(SavedState savedState) {
            this.read = savedState.read;
        }
    }

    public static class MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver {
        int AudioAttributesImplBaseParcelizer;
        int MediaBrowserCompatMediaItem;
        long RemoteActionCompatParcelizer;
        private SparseArray<Object> handleMediaPlayPauseIfPendingOnHandler;
        int read;
        int write;
        int MediaDescriptionCompat = -1;
        int MediaBrowserCompatCustomActionResultReceiver = 0;
        int AudioAttributesCompatParcelizer = 0;
        int AudioAttributesImplApi21Parcelizer = 1;
        int AudioAttributesImplApi26Parcelizer = 0;
        boolean RatingCompat = false;
        boolean IconCompatParcelizer = false;
        boolean MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = false;
        boolean MediaBrowserCompatItemReceiver = false;
        boolean MediaBrowserCompatSearchResultReceiver = false;
        boolean MediaMetadataCompat = false;

        final void write(int i) {
            if ((this.AudioAttributesImplApi21Parcelizer & i) != 0) {
                return;
            }
            StringBuilder sb = new StringBuilder("Layout state should be one of ");
            sb.append(Integer.toBinaryString(i));
            sb.append(" but it is ");
            sb.append(Integer.toBinaryString(this.AudioAttributesImplApi21Parcelizer));
            throw new IllegalStateException(sb.toString());
        }

        public final void RemoteActionCompatParcelizer(IconCompatParcelizer iconCompatParcelizer) {
            this.AudioAttributesImplApi21Parcelizer = 1;
            this.AudioAttributesImplApi26Parcelizer = iconCompatParcelizer.getItemCount();
            this.IconCompatParcelizer = false;
            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = false;
            this.MediaBrowserCompatItemReceiver = false;
        }

        public final boolean write() {
            return this.IconCompatParcelizer;
        }

        public final boolean AudioAttributesCompatParcelizer() {
            return this.MediaMetadataCompat;
        }

        public final int RemoteActionCompatParcelizer() {
            return this.MediaDescriptionCompat;
        }

        public final boolean IconCompatParcelizer() {
            return this.MediaDescriptionCompat != -1;
        }

        public final int read() {
            if (this.IconCompatParcelizer) {
                return this.MediaBrowserCompatCustomActionResultReceiver - this.AudioAttributesCompatParcelizer;
            }
            return this.AudioAttributesImplApi26Parcelizer;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("State{mTargetPosition=");
            sb.append(this.MediaDescriptionCompat);
            sb.append(", mData=");
            sb.append(this.handleMediaPlayPauseIfPendingOnHandler);
            sb.append(", mItemCount=");
            sb.append(this.AudioAttributesImplApi26Parcelizer);
            sb.append(", mIsMeasuring=");
            sb.append(this.MediaBrowserCompatItemReceiver);
            sb.append(", mPreviousLayoutItemCount=");
            sb.append(this.MediaBrowserCompatCustomActionResultReceiver);
            sb.append(", mDeletedInvisibleItemCountSincePreviousLayout=");
            sb.append(this.AudioAttributesCompatParcelizer);
            sb.append(", mStructureChanged=");
            sb.append(this.RatingCompat);
            sb.append(", mInPreLayout=");
            sb.append(this.IconCompatParcelizer);
            sb.append(", mRunSimpleAnimations=");
            sb.append(this.MediaBrowserCompatSearchResultReceiver);
            sb.append(", mRunPredictiveAnimations=");
            sb.append(this.MediaMetadataCompat);
            sb.append('}');
            return sb.toString();
        }
    }

    class MediaBrowserCompatCustomActionResultReceiver implements AudioAttributesImplApi26Parcelizer.read {
        MediaBrowserCompatCustomActionResultReceiver() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AudioAttributesImplApi26Parcelizer.read
        public final void IconCompatParcelizer(onMediaButtonEvent onmediabuttonevent) {
            onmediabuttonevent.setIsRecyclable(true);
            if (onmediabuttonevent.mShadowedHolder != null && onmediabuttonevent.mShadowingHolder == null) {
                onmediabuttonevent.mShadowedHolder = null;
            }
            onmediabuttonevent.mShadowingHolder = null;
            if (onmediabuttonevent.shouldBeKeptAsChild() || RecyclerView.this.MediaBrowserCompatMediaItem(onmediabuttonevent.itemView) || !onmediabuttonevent.isTmpDetached()) {
                return;
            }
            RecyclerView.this.removeDetachedView(onmediabuttonevent.itemView, false);
        }
    }

    public static abstract class AudioAttributesImplApi26Parcelizer {
        private read write = null;
        private ArrayList<AudioAttributesCompatParcelizer> read = new ArrayList<>();
        private long AudioAttributesCompatParcelizer = 120;
        private long MediaBrowserCompatCustomActionResultReceiver = 120;
        private long RemoteActionCompatParcelizer = 250;
        private long IconCompatParcelizer = 250;

        public interface AudioAttributesCompatParcelizer {
        }

        interface read {
            void IconCompatParcelizer(onMediaButtonEvent onmediabuttonevent);
        }

        public boolean AudioAttributesImplBaseParcelizer(onMediaButtonEvent onmediabuttonevent) {
            return true;
        }

        public abstract boolean IconCompatParcelizer();

        public abstract boolean IconCompatParcelizer(onMediaButtonEvent onmediabuttonevent, write writeVar, write writeVar2);

        public abstract void RemoteActionCompatParcelizer();

        public abstract boolean RemoteActionCompatParcelizer(onMediaButtonEvent onmediabuttonevent, write writeVar, write writeVar2);

        public abstract void write();

        public abstract void write(onMediaButtonEvent onmediabuttonevent);

        public abstract boolean write(onMediaButtonEvent onmediabuttonevent, write writeVar, write writeVar2);

        public abstract boolean write(onMediaButtonEvent onmediabuttonevent, onMediaButtonEvent onmediabuttonevent2, write writeVar, write writeVar2);

        public final long MediaBrowserCompatItemReceiver() {
            return this.RemoteActionCompatParcelizer;
        }

        public final long AudioAttributesImplApi26Parcelizer() {
            return this.AudioAttributesCompatParcelizer;
        }

        public final long AudioAttributesImplBaseParcelizer() {
            return this.MediaBrowserCompatCustomActionResultReceiver;
        }

        public final long AudioAttributesImplApi21Parcelizer() {
            return this.IconCompatParcelizer;
        }

        final void RemoteActionCompatParcelizer(read readVar) {
            this.write = readVar;
        }

        public static write MediaBrowserCompatItemReceiver(onMediaButtonEvent onmediabuttonevent) {
            return AudioAttributesCompatParcelizer().read(onmediabuttonevent);
        }

        public static write AudioAttributesImplApi21Parcelizer(onMediaButtonEvent onmediabuttonevent) {
            return AudioAttributesCompatParcelizer().read(onmediabuttonevent);
        }

        static int RemoteActionCompatParcelizer(onMediaButtonEvent onmediabuttonevent) {
            int i = onmediabuttonevent.mFlags;
            int i2 = i & 14;
            if (onmediabuttonevent.isInvalid()) {
                return 4;
            }
            if ((i & 4) == 0) {
                int oldPosition = onmediabuttonevent.getOldPosition();
                int absoluteAdapterPosition = onmediabuttonevent.getAbsoluteAdapterPosition();
                if (oldPosition != -1 && absoluteAdapterPosition != -1 && oldPosition != absoluteAdapterPosition) {
                    return i2 | 2048;
                }
            }
            return i2;
        }

        public final void AudioAttributesImplApi26Parcelizer(onMediaButtonEvent onmediabuttonevent) {
            read readVar = this.write;
            if (readVar != null) {
                readVar.IconCompatParcelizer(onmediabuttonevent);
            }
        }

        public boolean IconCompatParcelizer(onMediaButtonEvent onmediabuttonevent, List<Object> list) {
            return AudioAttributesImplBaseParcelizer(onmediabuttonevent);
        }

        public final void read() {
            int size = this.read.size();
            for (int i = 0; i < size; i++) {
                this.read.get(i);
            }
            this.read.clear();
        }

        private static write AudioAttributesCompatParcelizer() {
            return new write();
        }

        public static class write {
            private int AudioAttributesCompatParcelizer;
            private int IconCompatParcelizer;
            public int RemoteActionCompatParcelizer;
            public int read;

            public final write read(onMediaButtonEvent onmediabuttonevent) {
                return IconCompatParcelizer(onmediabuttonevent);
            }

            private write IconCompatParcelizer(onMediaButtonEvent onmediabuttonevent) {
                View view = onmediabuttonevent.itemView;
                this.RemoteActionCompatParcelizer = view.getLeft();
                this.read = view.getTop();
                this.IconCompatParcelizer = view.getRight();
                this.AudioAttributesCompatParcelizer = view.getBottom();
                return this;
            }
        }
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i, int i2) {
        write writeVar = this.ParcelableVolumeInfo;
        if (writeVar == null) {
            return super.getChildDrawingOrder(i, i2);
        }
        return writeVar.RemoteActionCompatParcelizer();
    }

    private rootObjectScope onPause() {
        if (this.addOnUserLeaveHintListener == null) {
            this.addOnUserLeaveHintListener = new rootObjectScope(this);
        }
        return this.addOnUserLeaveHintListener;
    }
}
