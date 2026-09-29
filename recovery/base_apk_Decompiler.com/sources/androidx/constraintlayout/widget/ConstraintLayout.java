package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.BlockingViewModel_HiltModulesKeyModule;
import kotlin.JdkDeserializers;
import kotlin.MapDeserializer;
import kotlin.ReferenceTypeDeserializer;
import kotlin.StackTraceElementDeserializerAdapter;
import kotlin.StdDelegatingDeserializer;
import kotlin._deserializeUsingCreator;
import kotlin._int;
import kotlin._isBlank;
import kotlin._long;
import kotlin._readAndBind;
import kotlin._readAndBindStringKeyMap;
import kotlin.convertValue;

/* JADX INFO: loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {
    private static convertValue IconCompatParcelizer;
    private int AudioAttributesCompatParcelizer;
    private StackTraceElementDeserializerAdapter AudioAttributesImplApi21Parcelizer;
    private int AudioAttributesImplApi26Parcelizer;
    private int AudioAttributesImplBaseParcelizer;
    private HashMap<String, Integer> MediaBrowserCompatCustomActionResultReceiver;
    private int MediaBrowserCompatItemReceiver;
    private int MediaBrowserCompatMediaItem;
    private int MediaBrowserCompatSearchResultReceiver;
    private RemoteActionCompatParcelizer MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    private int MediaDescriptionCompat;
    private int MediaMetadataCompat;
    private int RatingCompat;
    private ReferenceTypeDeserializer RemoteActionCompatParcelizer;
    public StdDelegatingDeserializer handleMediaPlayPauseIfPendingOnHandler;
    public _long onAddQueueItem;
    public boolean onCommand;
    private int onCustomAction;
    private int onFastForward;
    private SparseArray<JdkDeserializers> onMediaButtonEvent;
    private int onPause;
    private int onPlay;
    private int onPlayFromMediaId;
    private ArrayList<ConstraintHelper> read;
    private SparseArray<View> write;

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    protected /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return MediaDescriptionCompat();
    }

    public static convertValue MediaBrowserCompatMediaItem() {
        if (IconCompatParcelizer == null) {
            IconCompatParcelizer = new convertValue();
        }
        return IconCompatParcelizer;
    }

    public void setDesignInformation(int i, Object obj, Object obj2) {
        if (i == 0 && (obj instanceof String) && (obj2 instanceof Integer)) {
            if (this.MediaBrowserCompatCustomActionResultReceiver == null) {
                this.MediaBrowserCompatCustomActionResultReceiver = new HashMap<>();
            }
            String strSubstring = (String) obj;
            int iIndexOf = strSubstring.indexOf("/");
            if (iIndexOf != -1) {
                strSubstring = strSubstring.substring(iIndexOf + 1);
            }
            this.MediaBrowserCompatCustomActionResultReceiver.put(strSubstring, Integer.valueOf(((Integer) obj2).intValue()));
        }
    }

    public final Object write(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        HashMap<String, Integer> map = this.MediaBrowserCompatCustomActionResultReceiver;
        if (map == null || !map.containsKey(str)) {
            return null;
        }
        return this.MediaBrowserCompatCustomActionResultReceiver.get(str);
    }

    public ConstraintLayout(Context context) {
        super(context);
        this.write = new SparseArray<>();
        this.read = new ArrayList<>(4);
        this.onAddQueueItem = new _long();
        this.onFastForward = 0;
        this.onCustomAction = 0;
        this.MediaBrowserCompatSearchResultReceiver = Integer.MAX_VALUE;
        this.MediaDescriptionCompat = Integer.MAX_VALUE;
        this.onCommand = true;
        this.onPlay = 257;
        this.RemoteActionCompatParcelizer = null;
        this.handleMediaPlayPauseIfPendingOnHandler = null;
        this.AudioAttributesCompatParcelizer = -1;
        this.MediaBrowserCompatCustomActionResultReceiver = new HashMap<>();
        this.RatingCompat = -1;
        this.MediaBrowserCompatItemReceiver = -1;
        this.MediaMetadataCompat = -1;
        this.AudioAttributesImplApi26Parcelizer = -1;
        this.MediaBrowserCompatMediaItem = 0;
        this.AudioAttributesImplBaseParcelizer = 0;
        this.onMediaButtonEvent = new SparseArray<>();
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = new RemoteActionCompatParcelizer(this);
        this.onPause = 0;
        this.onPlayFromMediaId = 0;
        write(null, 0);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.write = new SparseArray<>();
        this.read = new ArrayList<>(4);
        this.onAddQueueItem = new _long();
        this.onFastForward = 0;
        this.onCustomAction = 0;
        this.MediaBrowserCompatSearchResultReceiver = Integer.MAX_VALUE;
        this.MediaDescriptionCompat = Integer.MAX_VALUE;
        this.onCommand = true;
        this.onPlay = 257;
        this.RemoteActionCompatParcelizer = null;
        this.handleMediaPlayPauseIfPendingOnHandler = null;
        this.AudioAttributesCompatParcelizer = -1;
        this.MediaBrowserCompatCustomActionResultReceiver = new HashMap<>();
        this.RatingCompat = -1;
        this.MediaBrowserCompatItemReceiver = -1;
        this.MediaMetadataCompat = -1;
        this.AudioAttributesImplApi26Parcelizer = -1;
        this.MediaBrowserCompatMediaItem = 0;
        this.AudioAttributesImplBaseParcelizer = 0;
        this.onMediaButtonEvent = new SparseArray<>();
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = new RemoteActionCompatParcelizer(this);
        this.onPause = 0;
        this.onPlayFromMediaId = 0;
        write(attributeSet, 0);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.write = new SparseArray<>();
        this.read = new ArrayList<>(4);
        this.onAddQueueItem = new _long();
        this.onFastForward = 0;
        this.onCustomAction = 0;
        this.MediaBrowserCompatSearchResultReceiver = Integer.MAX_VALUE;
        this.MediaDescriptionCompat = Integer.MAX_VALUE;
        this.onCommand = true;
        this.onPlay = 257;
        this.RemoteActionCompatParcelizer = null;
        this.handleMediaPlayPauseIfPendingOnHandler = null;
        this.AudioAttributesCompatParcelizer = -1;
        this.MediaBrowserCompatCustomActionResultReceiver = new HashMap<>();
        this.RatingCompat = -1;
        this.MediaBrowserCompatItemReceiver = -1;
        this.MediaMetadataCompat = -1;
        this.AudioAttributesImplApi26Parcelizer = -1;
        this.MediaBrowserCompatMediaItem = 0;
        this.AudioAttributesImplBaseParcelizer = 0;
        this.onMediaButtonEvent = new SparseArray<>();
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = new RemoteActionCompatParcelizer(this);
        this.onPause = 0;
        this.onPlayFromMediaId = 0;
        write(attributeSet, i);
    }

    @Override // android.view.View
    public void setId(int i) {
        this.write.remove(getId());
        super.setId(i);
        this.write.put(getId(), this);
    }

    /* JADX INFO: loaded from: classes2.dex */
    class RemoteActionCompatParcelizer implements _readAndBind.write {
        private int AudioAttributesCompatParcelizer;
        private int AudioAttributesImplApi21Parcelizer;
        int IconCompatParcelizer;
        private int MediaBrowserCompatCustomActionResultReceiver;
        private int MediaBrowserCompatItemReceiver;
        int RemoteActionCompatParcelizer;
        private ConstraintLayout read;

        public final void read(int i, int i2, int i3, int i4, int i5, int i6) {
            this.MediaBrowserCompatItemReceiver = i3;
            this.AudioAttributesImplApi21Parcelizer = i4;
            this.IconCompatParcelizer = i5;
            this.RemoteActionCompatParcelizer = i6;
            this.MediaBrowserCompatCustomActionResultReceiver = i;
            this.AudioAttributesCompatParcelizer = i2;
        }

        public RemoteActionCompatParcelizer(ConstraintLayout constraintLayout) {
            this.read = constraintLayout;
        }

        @Override // o._readAndBind.write
        public final void RemoteActionCompatParcelizer(JdkDeserializers jdkDeserializers, _readAndBind.IconCompatParcelizer iconCompatParcelizer) {
            int iMakeMeasureSpec;
            int iMakeMeasureSpec2;
            int baseline;
            int iMax;
            int i;
            int measuredHeight;
            int i2;
            if (jdkDeserializers != null) {
                if (jdkDeserializers.onRewind() == 8 && !jdkDeserializers.onSkipToQueueItem()) {
                    iconCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver = 0;
                    iconCompatParcelizer.AudioAttributesImplApi21Parcelizer = 0;
                    iconCompatParcelizer.RemoteActionCompatParcelizer = 0;
                    return;
                }
                if (jdkDeserializers.onPrepareFromMediaId() != null) {
                    JdkDeserializers.IconCompatParcelizer iconCompatParcelizer2 = iconCompatParcelizer.read;
                    JdkDeserializers.IconCompatParcelizer iconCompatParcelizer3 = iconCompatParcelizer.AudioAttributesImplApi26Parcelizer;
                    int i3 = iconCompatParcelizer.write;
                    int i4 = iconCompatParcelizer.AudioAttributesImplBaseParcelizer;
                    int i5 = this.MediaBrowserCompatItemReceiver + this.AudioAttributesImplApi21Parcelizer;
                    int i6 = this.IconCompatParcelizer;
                    View view = (View) jdkDeserializers.RatingCompat();
                    int i7 = AnonymousClass4.read[iconCompatParcelizer2.ordinal()];
                    if (i7 == 1) {
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
                    } else if (i7 == 2) {
                        iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.MediaBrowserCompatCustomActionResultReceiver, i6, -2);
                    } else if (i7 == 3) {
                        iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.MediaBrowserCompatCustomActionResultReceiver, i6 + jdkDeserializers.onPause(), -1);
                    } else if (i7 != 4) {
                        iMakeMeasureSpec = 0;
                    } else {
                        iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.MediaBrowserCompatCustomActionResultReceiver, i6, -2);
                        boolean z = jdkDeserializers.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver == 1;
                        if (iconCompatParcelizer.AudioAttributesCompatParcelizer == 1 || iconCompatParcelizer.AudioAttributesCompatParcelizer == 2) {
                            boolean z2 = view.getMeasuredHeight() == jdkDeserializers.onAddQueueItem();
                            if (iconCompatParcelizer.AudioAttributesCompatParcelizer == 2 || !z || ((z && z2) || (view instanceof Placeholder) || jdkDeserializers.AudioAttributesImplApi21Parcelizer())) {
                                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(jdkDeserializers.onSetShuffleMode(), 1073741824);
                            }
                        }
                    }
                    int i8 = AnonymousClass4.read[iconCompatParcelizer3.ordinal()];
                    if (i8 == 1) {
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
                    } else if (i8 == 2) {
                        iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.AudioAttributesCompatParcelizer, i5, -2);
                    } else if (i8 == 3) {
                        iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.AudioAttributesCompatParcelizer, i5 + jdkDeserializers.onPrepareFromUri(), -1);
                    } else if (i8 != 4) {
                        iMakeMeasureSpec2 = 0;
                    } else {
                        iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.AudioAttributesCompatParcelizer, i5, -2);
                        boolean z3 = jdkDeserializers.onAddQueueItem == 1;
                        if (iconCompatParcelizer.AudioAttributesCompatParcelizer == 1 || iconCompatParcelizer.AudioAttributesCompatParcelizer == 2) {
                            boolean z4 = view.getMeasuredWidth() == jdkDeserializers.onSetShuffleMode();
                            if (iconCompatParcelizer.AudioAttributesCompatParcelizer == 2 || !z3 || ((z3 && z4) || (view instanceof Placeholder) || jdkDeserializers.MediaBrowserCompatCustomActionResultReceiver())) {
                                iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(jdkDeserializers.onAddQueueItem(), 1073741824);
                            }
                        }
                    }
                    _long _longVar = (_long) jdkDeserializers.onPrepareFromMediaId();
                    if (_longVar != null && MapDeserializer.IconCompatParcelizer(ConstraintLayout.this.onPlay, 256) && view.getMeasuredWidth() == jdkDeserializers.onSetShuffleMode() && view.getMeasuredWidth() < _longVar.onSetShuffleMode() && view.getMeasuredHeight() == jdkDeserializers.onAddQueueItem() && view.getMeasuredHeight() < _longVar.onAddQueueItem() && view.getBaseline() == jdkDeserializers.MediaMetadataCompat() && !jdkDeserializers.MediaSessionCompatResultReceiverWrapper() && IconCompatParcelizer(jdkDeserializers.onPlay(), iMakeMeasureSpec, jdkDeserializers.onSetShuffleMode()) && IconCompatParcelizer(jdkDeserializers.onMediaButtonEvent(), iMakeMeasureSpec2, jdkDeserializers.onAddQueueItem())) {
                        iconCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver = jdkDeserializers.onSetShuffleMode();
                        iconCompatParcelizer.AudioAttributesImplApi21Parcelizer = jdkDeserializers.onAddQueueItem();
                        iconCompatParcelizer.RemoteActionCompatParcelizer = jdkDeserializers.MediaMetadataCompat();
                        return;
                    }
                    boolean z5 = iconCompatParcelizer2 == JdkDeserializers.IconCompatParcelizer.MATCH_CONSTRAINT;
                    boolean z6 = iconCompatParcelizer3 == JdkDeserializers.IconCompatParcelizer.MATCH_CONSTRAINT;
                    boolean z7 = iconCompatParcelizer3 == JdkDeserializers.IconCompatParcelizer.MATCH_PARENT || iconCompatParcelizer3 == JdkDeserializers.IconCompatParcelizer.FIXED;
                    boolean z8 = iconCompatParcelizer2 == JdkDeserializers.IconCompatParcelizer.MATCH_PARENT || iconCompatParcelizer2 == JdkDeserializers.IconCompatParcelizer.FIXED;
                    boolean z9 = z5 && jdkDeserializers.AudioAttributesImplApi21Parcelizer > BitmapDescriptorFactory.HUE_RED;
                    boolean z10 = z6 && jdkDeserializers.AudioAttributesImplApi21Parcelizer > BitmapDescriptorFactory.HUE_RED;
                    if (view == null) {
                        return;
                    }
                    LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
                    if (iconCompatParcelizer.AudioAttributesCompatParcelizer != 1 && iconCompatParcelizer.AudioAttributesCompatParcelizer != 2 && z5 && jdkDeserializers.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver == 0 && z6 && jdkDeserializers.onAddQueueItem == 0) {
                        i2 = -1;
                        measuredHeight = 0;
                        baseline = 0;
                        iMax = 0;
                    } else {
                        if ((view instanceof VirtualLayout) && (jdkDeserializers instanceof _readAndBindStringKeyMap)) {
                            ((VirtualLayout) view).read((_readAndBindStringKeyMap) jdkDeserializers, iMakeMeasureSpec, iMakeMeasureSpec2);
                        } else {
                            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                        }
                        jdkDeserializers.read(iMakeMeasureSpec, iMakeMeasureSpec2);
                        int measuredWidth = view.getMeasuredWidth();
                        int measuredHeight2 = view.getMeasuredHeight();
                        baseline = view.getBaseline();
                        iMax = jdkDeserializers.onPlayFromMediaId > 0 ? Math.max(jdkDeserializers.onPlayFromMediaId, measuredWidth) : measuredWidth;
                        if (jdkDeserializers.handleMediaPlayPauseIfPendingOnHandler > 0) {
                            iMax = Math.min(jdkDeserializers.handleMediaPlayPauseIfPendingOnHandler, iMax);
                        }
                        if (jdkDeserializers.onPause > 0) {
                            measuredHeight = Math.max(jdkDeserializers.onPause, measuredHeight2);
                            i = iMakeMeasureSpec;
                        } else {
                            i = iMakeMeasureSpec;
                            measuredHeight = measuredHeight2;
                        }
                        if (jdkDeserializers.onCustomAction > 0) {
                            measuredHeight = Math.min(jdkDeserializers.onCustomAction, measuredHeight);
                        }
                        if (!MapDeserializer.IconCompatParcelizer(ConstraintLayout.this.onPlay, 1)) {
                            if (z9 && z7) {
                                iMax = (int) ((measuredHeight * jdkDeserializers.AudioAttributesImplApi21Parcelizer) + 0.5f);
                            } else if (z10 && z8) {
                                measuredHeight = (int) ((iMax / jdkDeserializers.AudioAttributesImplApi21Parcelizer) + 0.5f);
                            }
                        }
                        if (measuredWidth != iMax || measuredHeight2 != measuredHeight) {
                            int iMakeMeasureSpec3 = measuredWidth != iMax ? View.MeasureSpec.makeMeasureSpec(iMax, 1073741824) : i;
                            if (measuredHeight2 != measuredHeight) {
                                iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
                            }
                            view.measure(iMakeMeasureSpec3, iMakeMeasureSpec2);
                            jdkDeserializers.read(iMakeMeasureSpec3, iMakeMeasureSpec2);
                            iMax = view.getMeasuredWidth();
                            measuredHeight = view.getMeasuredHeight();
                            baseline = view.getBaseline();
                        }
                        i2 = -1;
                    }
                    boolean z11 = baseline != i2;
                    iconCompatParcelizer.MediaBrowserCompatItemReceiver = (iMax == iconCompatParcelizer.write && measuredHeight == iconCompatParcelizer.AudioAttributesImplBaseParcelizer) ? false : true;
                    if (layoutParams.MediaSessionCompatQueueItem) {
                        z11 = true;
                    }
                    if (z11 && baseline != -1 && jdkDeserializers.MediaMetadataCompat() != baseline) {
                        iconCompatParcelizer.MediaBrowserCompatItemReceiver = true;
                    }
                    iconCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver = iMax;
                    iconCompatParcelizer.AudioAttributesImplApi21Parcelizer = measuredHeight;
                    iconCompatParcelizer.IconCompatParcelizer = z11;
                    iconCompatParcelizer.RemoteActionCompatParcelizer = baseline;
                }
            }
        }

        private static boolean IconCompatParcelizer(int i, int i2, int i3) {
            if (i == i2) {
                return true;
            }
            int mode = View.MeasureSpec.getMode(i);
            View.MeasureSpec.getSize(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            if (mode2 == 1073741824) {
                return (mode == Integer.MIN_VALUE || mode == 0) && i3 == size;
            }
            return false;
        }

        @Override // o._readAndBind.write
        public final void IconCompatParcelizer() {
            int childCount = this.read.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = this.read.getChildAt(i);
                if (childAt instanceof Placeholder) {
                    ((Placeholder) childAt).write();
                }
            }
            int size = this.read.read.size();
            if (size > 0) {
                for (int i2 = 0; i2 < size; i2++) {
                }
            }
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.widget.ConstraintLayout$4, reason: invalid class name */
    static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] read;

        static {
            int[] iArr = new int[JdkDeserializers.IconCompatParcelizer.values().length];
            read = iArr;
            try {
                iArr[JdkDeserializers.IconCompatParcelizer.FIXED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                read[JdkDeserializers.IconCompatParcelizer.WRAP_CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                read[JdkDeserializers.IconCompatParcelizer.MATCH_PARENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                read[JdkDeserializers.IconCompatParcelizer.MATCH_CONSTRAINT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private void write(AttributeSet attributeSet, int i) {
        this.onAddQueueItem.RemoteActionCompatParcelizer(this);
        this.onAddQueueItem.write(this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
        this.write.put(getId(), this);
        this.RemoteActionCompatParcelizer = null;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, _isBlank.read.ConstraintLayout_Layout, i, 0);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i2);
                if (index == _isBlank.read.ConstraintLayout_Layout_android_minWidth) {
                    this.onFastForward = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.onFastForward);
                } else if (index == _isBlank.read.ConstraintLayout_Layout_android_minHeight) {
                    this.onCustomAction = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.onCustomAction);
                } else if (index == _isBlank.read.ConstraintLayout_Layout_android_maxWidth) {
                    this.MediaBrowserCompatSearchResultReceiver = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.MediaBrowserCompatSearchResultReceiver);
                } else if (index == _isBlank.read.ConstraintLayout_Layout_android_maxHeight) {
                    this.MediaDescriptionCompat = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.MediaDescriptionCompat);
                } else if (index == _isBlank.read.ConstraintLayout_Layout_layout_optimizationLevel) {
                    this.onPlay = typedArrayObtainStyledAttributes.getInt(index, this.onPlay);
                } else if (index == _isBlank.read.ConstraintLayout_Layout_layoutDescription) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            read(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.handleMediaPlayPauseIfPendingOnHandler = null;
                        }
                    }
                } else if (index == _isBlank.read.ConstraintLayout_Layout_constraintSet) {
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    try {
                        ReferenceTypeDeserializer referenceTypeDeserializer = new ReferenceTypeDeserializer();
                        this.RemoteActionCompatParcelizer = referenceTypeDeserializer;
                        referenceTypeDeserializer.read(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.RemoteActionCompatParcelizer = null;
                    }
                    this.AudioAttributesCompatParcelizer = resourceId2;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.onAddQueueItem.read(this.onPlay);
    }

    protected void read(int i) {
        this.handleMediaPlayPauseIfPendingOnHandler = new StdDelegatingDeserializer(getContext(), this, i);
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        JdkDeserializers jdkDeserializersAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(view);
        if ((view instanceof Guideline) && !(jdkDeserializersAudioAttributesCompatParcelizer instanceof _deserializeUsingCreator)) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            layoutParams.getOnBackPressedDispatcherannotations = new _deserializeUsingCreator();
            layoutParams.onSeekTo = true;
            ((_deserializeUsingCreator) layoutParams.getOnBackPressedDispatcherannotations).onPrepare(layoutParams.PlaybackStateCompat);
        }
        if (view instanceof ConstraintHelper) {
            ConstraintHelper constraintHelper = (ConstraintHelper) view;
            constraintHelper.MediaBrowserCompatCustomActionResultReceiver();
            ((LayoutParams) view.getLayoutParams()).onSetCaptioningEnabled = true;
            if (!this.read.contains(constraintHelper)) {
                this.read.add(constraintHelper);
            }
        }
        this.write.put(view.getId(), view);
        this.onCommand = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.write.remove(view.getId());
        this.onAddQueueItem.read(AudioAttributesCompatParcelizer(view));
        this.read.remove(view);
        this.onCommand = true;
    }

    public void setMinWidth(int i) {
        if (i == this.onFastForward) {
            return;
        }
        this.onFastForward = i;
        requestLayout();
    }

    public void setMinHeight(int i) {
        if (i == this.onCustomAction) {
            return;
        }
        this.onCustomAction = i;
        requestLayout();
    }

    public void setMaxWidth(int i) {
        if (i == this.MediaBrowserCompatSearchResultReceiver) {
            return;
        }
        this.MediaBrowserCompatSearchResultReceiver = i;
        requestLayout();
    }

    public void setMaxHeight(int i) {
        if (i == this.MediaDescriptionCompat) {
            return;
        }
        this.MediaDescriptionCompat = i;
        requestLayout();
    }

    private boolean read() {
        int childCount = getChildCount();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= childCount) {
                break;
            }
            if (getChildAt(i).isLayoutRequested()) {
                z = true;
                break;
            }
            i++;
        }
        if (z) {
            AudioAttributesCompatParcelizer();
        }
        return z;
    }

    private void AudioAttributesCompatParcelizer() {
        boolean zIsInEditMode = isInEditMode();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            JdkDeserializers jdkDeserializersAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(getChildAt(i));
            if (jdkDeserializersAudioAttributesCompatParcelizer != null) {
                jdkDeserializersAudioAttributesCompatParcelizer.ResultReceiver();
            }
        }
        if (zIsInEditMode) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                try {
                    String resourceName = getResources().getResourceName(childAt.getId());
                    setDesignInformation(0, resourceName, Integer.valueOf(childAt.getId()));
                    int iIndexOf = resourceName.indexOf(47);
                    if (iIndexOf != -1) {
                        resourceName = resourceName.substring(iIndexOf + 1);
                    }
                    AudioAttributesCompatParcelizer(childAt.getId()).IconCompatParcelizer(resourceName);
                } catch (Resources.NotFoundException unused) {
                }
            }
        }
        if (this.AudioAttributesCompatParcelizer != -1) {
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt2 = getChildAt(i3);
                if (childAt2.getId() == this.AudioAttributesCompatParcelizer && (childAt2 instanceof Constraints)) {
                    this.RemoteActionCompatParcelizer = ((Constraints) childAt2).IconCompatParcelizer();
                }
            }
        }
        ReferenceTypeDeserializer referenceTypeDeserializer = this.RemoteActionCompatParcelizer;
        if (referenceTypeDeserializer != null) {
            referenceTypeDeserializer.AudioAttributesCompatParcelizer(this);
        }
        this.onAddQueueItem.ensureViewModelStore();
        int size = this.read.size();
        if (size > 0) {
            for (int i4 = 0; i4 < size; i4++) {
                this.read.get(i4).AudioAttributesCompatParcelizer(this);
            }
        }
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt3 = getChildAt(i5);
            if (childAt3 instanceof Placeholder) {
                ((Placeholder) childAt3).RemoteActionCompatParcelizer(this);
            }
        }
        this.onMediaButtonEvent.clear();
        this.onMediaButtonEvent.put(0, this.onAddQueueItem);
        this.onMediaButtonEvent.put(getId(), this.onAddQueueItem);
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt4 = getChildAt(i6);
            this.onMediaButtonEvent.put(childAt4.getId(), AudioAttributesCompatParcelizer(childAt4));
        }
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt5 = getChildAt(i7);
            JdkDeserializers jdkDeserializersAudioAttributesCompatParcelizer2 = AudioAttributesCompatParcelizer(childAt5);
            if (jdkDeserializersAudioAttributesCompatParcelizer2 != null) {
                LayoutParams layoutParams = (LayoutParams) childAt5.getLayoutParams();
                this.onAddQueueItem.RemoteActionCompatParcelizer(jdkDeserializersAudioAttributesCompatParcelizer2);
                RemoteActionCompatParcelizer(zIsInEditMode, childAt5, jdkDeserializersAudioAttributesCompatParcelizer2, layoutParams, this.onMediaButtonEvent);
            }
        }
    }

    public final void RemoteActionCompatParcelizer(boolean z, View view, JdkDeserializers jdkDeserializers, LayoutParams layoutParams, SparseArray<JdkDeserializers> sparseArray) {
        JdkDeserializers jdkDeserializers2;
        JdkDeserializers jdkDeserializers3;
        JdkDeserializers jdkDeserializers4;
        JdkDeserializers jdkDeserializers5;
        layoutParams.write();
        layoutParams.onPrepareFromMediaId = false;
        jdkDeserializers.onAddQueueItem(view.getVisibility());
        if (layoutParams.onSetShuffleMode) {
            jdkDeserializers.r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0();
            jdkDeserializers.onAddQueueItem(8);
        }
        jdkDeserializers.RemoteActionCompatParcelizer(view);
        if (view instanceof ConstraintHelper) {
            ((ConstraintHelper) view).read(jdkDeserializers, this.onAddQueueItem._init_lambda5());
        }
        if (layoutParams.onSeekTo) {
            _deserializeUsingCreator _deserializeusingcreator = (_deserializeUsingCreator) jdkDeserializers;
            int i = layoutParams.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
            int i2 = layoutParams.r8lambdaKUbBm7ckfqTc9QCgukC86fguu4;
            float f = layoutParams.ResultReceiver;
            if (f != -1.0f) {
                _deserializeusingcreator.IconCompatParcelizer(f);
                return;
            } else if (i != -1) {
                _deserializeusingcreator.read(i);
                return;
            } else {
                if (i2 != -1) {
                    _deserializeusingcreator.onPause(i2);
                    return;
                }
                return;
            }
        }
        int i3 = layoutParams.r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8;
        int i4 = layoutParams.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;
        int i5 = layoutParams._init_lambda2;
        int i6 = layoutParams.r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0;
        int i7 = layoutParams.r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw;
        int i8 = layoutParams.PlaybackStateCompatCustomAction;
        float f2 = layoutParams._init_lambda3;
        if (layoutParams.MediaBrowserCompatItemReceiver != -1) {
            JdkDeserializers jdkDeserializers6 = sparseArray.get(layoutParams.MediaBrowserCompatItemReceiver);
            if (jdkDeserializers6 != null) {
                jdkDeserializers.AudioAttributesCompatParcelizer(jdkDeserializers6, layoutParams.AudioAttributesImplBaseParcelizer, layoutParams.MediaBrowserCompatCustomActionResultReceiver);
            }
        } else {
            if (i3 != -1) {
                JdkDeserializers jdkDeserializers7 = sparseArray.get(i3);
                if (jdkDeserializers7 != null) {
                    jdkDeserializers.AudioAttributesCompatParcelizer(_int.read.LEFT, jdkDeserializers7, _int.read.LEFT, ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, i7);
                }
            } else if (i4 != -1 && (jdkDeserializers2 = sparseArray.get(i4)) != null) {
                jdkDeserializers.AudioAttributesCompatParcelizer(_int.read.LEFT, jdkDeserializers2, _int.read.RIGHT, ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, i7);
            }
            if (i5 != -1) {
                JdkDeserializers jdkDeserializers8 = sparseArray.get(i5);
                if (jdkDeserializers8 != null) {
                    jdkDeserializers.AudioAttributesCompatParcelizer(_int.read.RIGHT, jdkDeserializers8, _int.read.LEFT, ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, i8);
                }
            } else if (i6 != -1 && (jdkDeserializers3 = sparseArray.get(i6)) != null) {
                jdkDeserializers.AudioAttributesCompatParcelizer(_int.read.RIGHT, jdkDeserializers3, _int.read.RIGHT, ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, i8);
            }
            if (layoutParams.addObserverForBackInvokerlambda7 != -1) {
                JdkDeserializers jdkDeserializers9 = sparseArray.get(layoutParams.addObserverForBackInvokerlambda7);
                if (jdkDeserializers9 != null) {
                    jdkDeserializers.AudioAttributesCompatParcelizer(_int.read.TOP, jdkDeserializers9, _int.read.TOP, ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, layoutParams.onPrepareFromSearch);
                }
            } else if (layoutParams._init_lambda4 != -1 && (jdkDeserializers4 = sparseArray.get(layoutParams._init_lambda4)) != null) {
                jdkDeserializers.AudioAttributesCompatParcelizer(_int.read.TOP, jdkDeserializers4, _int.read.BOTTOM, ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, layoutParams.onPrepareFromSearch);
            }
            if (layoutParams.AudioAttributesImplApi21Parcelizer != -1) {
                JdkDeserializers jdkDeserializers10 = sparseArray.get(layoutParams.AudioAttributesImplApi21Parcelizer);
                if (jdkDeserializers10 != null) {
                    jdkDeserializers.AudioAttributesCompatParcelizer(_int.read.BOTTOM, jdkDeserializers10, _int.read.TOP, ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, layoutParams.onMediaButtonEvent);
                }
            } else if (layoutParams.read != -1 && (jdkDeserializers5 = sparseArray.get(layoutParams.read)) != null) {
                jdkDeserializers.AudioAttributesCompatParcelizer(_int.read.BOTTOM, jdkDeserializers5, _int.read.BOTTOM, ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, layoutParams.onMediaButtonEvent);
            }
            if (layoutParams.AudioAttributesCompatParcelizer != -1) {
                IconCompatParcelizer(jdkDeserializers, layoutParams, sparseArray, layoutParams.AudioAttributesCompatParcelizer, _int.read.BASELINE);
            } else if (layoutParams.write != -1) {
                IconCompatParcelizer(jdkDeserializers, layoutParams, sparseArray, layoutParams.write, _int.read.TOP);
            } else if (layoutParams.IconCompatParcelizer != -1) {
                IconCompatParcelizer(jdkDeserializers, layoutParams, sparseArray, layoutParams.IconCompatParcelizer, _int.read.BOTTOM);
            }
            if (f2 >= BitmapDescriptorFactory.HUE_RED) {
                jdkDeserializers.RemoteActionCompatParcelizer(f2);
            }
            if (layoutParams.ensureViewModelStore >= BitmapDescriptorFactory.HUE_RED) {
                jdkDeserializers.read(layoutParams.ensureViewModelStore);
            }
        }
        if (z && (layoutParams.onCustomAction != -1 || layoutParams.onCommand != -1)) {
            jdkDeserializers.AudioAttributesImplApi26Parcelizer(layoutParams.onCustomAction, layoutParams.onCommand);
        }
        if (!layoutParams.onRemoveQueueItemAt) {
            if (((ViewGroup.LayoutParams) layoutParams).width == -1) {
                if (layoutParams.MediaMetadataCompat) {
                    jdkDeserializers.AudioAttributesCompatParcelizer(JdkDeserializers.IconCompatParcelizer.MATCH_CONSTRAINT);
                } else {
                    jdkDeserializers.AudioAttributesCompatParcelizer(JdkDeserializers.IconCompatParcelizer.MATCH_PARENT);
                }
                jdkDeserializers.write(_int.read.LEFT).AudioAttributesCompatParcelizer = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
                jdkDeserializers.write(_int.read.RIGHT).AudioAttributesCompatParcelizer = ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
            } else {
                jdkDeserializers.AudioAttributesCompatParcelizer(JdkDeserializers.IconCompatParcelizer.MATCH_CONSTRAINT);
                jdkDeserializers.onFastForward(0);
            }
        } else {
            jdkDeserializers.AudioAttributesCompatParcelizer(JdkDeserializers.IconCompatParcelizer.FIXED);
            jdkDeserializers.onFastForward(((ViewGroup.LayoutParams) layoutParams).width);
            if (((ViewGroup.LayoutParams) layoutParams).width == -2) {
                jdkDeserializers.AudioAttributesCompatParcelizer(JdkDeserializers.IconCompatParcelizer.WRAP_CONTENT);
            }
        }
        if (!layoutParams.createFullyDrawnExecutor) {
            if (((ViewGroup.LayoutParams) layoutParams).height == -1) {
                if (layoutParams.AudioAttributesImplApi26Parcelizer) {
                    jdkDeserializers.write(JdkDeserializers.IconCompatParcelizer.MATCH_CONSTRAINT);
                } else {
                    jdkDeserializers.write(JdkDeserializers.IconCompatParcelizer.MATCH_PARENT);
                }
                jdkDeserializers.write(_int.read.TOP).AudioAttributesCompatParcelizer = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
                jdkDeserializers.write(_int.read.BOTTOM).AudioAttributesCompatParcelizer = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
            } else {
                jdkDeserializers.write(JdkDeserializers.IconCompatParcelizer.MATCH_CONSTRAINT);
                jdkDeserializers.MediaMetadataCompat(0);
            }
        } else {
            jdkDeserializers.write(JdkDeserializers.IconCompatParcelizer.FIXED);
            jdkDeserializers.MediaMetadataCompat(((ViewGroup.LayoutParams) layoutParams).height);
            if (((ViewGroup.LayoutParams) layoutParams).height == -2) {
                jdkDeserializers.write(JdkDeserializers.IconCompatParcelizer.WRAP_CONTENT);
            }
        }
        jdkDeserializers.AudioAttributesCompatParcelizer(layoutParams.MediaBrowserCompatMediaItem);
        jdkDeserializers.write(layoutParams.onRemoveQueueItem);
        jdkDeserializers.AudioAttributesCompatParcelizer(layoutParams.accessonBackPresseds1027565324);
        jdkDeserializers.RatingCompat(layoutParams.onPrepareFromUri);
        jdkDeserializers.handleMediaPlayPauseIfPendingOnHandler(layoutParams.addObserverForBackInvoker);
        jdkDeserializers.onPlay(layoutParams.getSavedStateRegistryControllerannotations);
        jdkDeserializers.read(layoutParams.onSkipToNext, layoutParams.MediaSessionCompatResultReceiverWrapper, layoutParams.onSkipToPrevious, layoutParams.ParcelableVolumeInfo);
        jdkDeserializers.RemoteActionCompatParcelizer(layoutParams.onStop, layoutParams.onSkipToQueueItem, layoutParams.setSessionImpl, layoutParams.MediaSessionCompatToken);
    }

    private void IconCompatParcelizer(JdkDeserializers jdkDeserializers, LayoutParams layoutParams, SparseArray<JdkDeserializers> sparseArray, int i, _int.read readVar) {
        View view = this.write.get(i);
        JdkDeserializers jdkDeserializers2 = sparseArray.get(i);
        if (jdkDeserializers2 == null || view == null || !(view.getLayoutParams() instanceof LayoutParams)) {
            return;
        }
        layoutParams.MediaSessionCompatQueueItem = true;
        if (readVar == _int.read.BASELINE) {
            LayoutParams layoutParams2 = (LayoutParams) view.getLayoutParams();
            layoutParams2.MediaSessionCompatQueueItem = true;
            layoutParams2.getOnBackPressedDispatcherannotations.read(true);
        }
        jdkDeserializers.write(_int.read.BASELINE).write(jdkDeserializers2.write(readVar), layoutParams.RemoteActionCompatParcelizer, layoutParams.handleMediaPlayPauseIfPendingOnHandler, true);
        jdkDeserializers.read(true);
        jdkDeserializers.write(_int.read.TOP).MediaBrowserCompatSearchResultReceiver();
        jdkDeserializers.write(_int.read.BOTTOM).MediaBrowserCompatSearchResultReceiver();
    }

    private final JdkDeserializers AudioAttributesCompatParcelizer(int i) {
        if (i == 0) {
            return this.onAddQueueItem;
        }
        View viewFindViewById = this.write.get(i);
        if (viewFindViewById == null && (viewFindViewById = findViewById(i)) != null && viewFindViewById != this && viewFindViewById.getParent() == this) {
            onViewAdded(viewFindViewById);
        }
        if (viewFindViewById == this) {
            return this.onAddQueueItem;
        }
        if (viewFindViewById == null) {
            return null;
        }
        return ((LayoutParams) viewFindViewById.getLayoutParams()).getOnBackPressedDispatcherannotations;
    }

    public final JdkDeserializers AudioAttributesCompatParcelizer(View view) {
        if (view == this) {
            return this.onAddQueueItem;
        }
        if (view == null) {
            return null;
        }
        if (view.getLayoutParams() instanceof LayoutParams) {
            return ((LayoutParams) view.getLayoutParams()).getOnBackPressedDispatcherannotations;
        }
        view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
        if (view.getLayoutParams() instanceof LayoutParams) {
            return ((LayoutParams) view.getLayoutParams()).getOnBackPressedDispatcherannotations;
        }
        return null;
    }

    public final void read(_long _longVar, int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        int iMax = Math.max(0, getPaddingTop());
        int iMax2 = Math.max(0, getPaddingBottom());
        int i4 = iMax + iMax2;
        int iIconCompatParcelizer = IconCompatParcelizer();
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.read(i2, i3, iMax, iMax2, iIconCompatParcelizer, i4);
        int iMax3 = Math.max(0, getPaddingStart());
        int iMax4 = Math.max(0, getPaddingEnd());
        if (iMax3 > 0 || iMax4 > 0) {
            if (handleMediaPlayPauseIfPendingOnHandler()) {
                iMax3 = iMax4;
            }
        } else {
            iMax3 = Math.max(0, getPaddingLeft());
        }
        int i5 = size - iIconCompatParcelizer;
        int i6 = size2 - i4;
        IconCompatParcelizer(_longVar, mode, i5, mode2, i6);
        _longVar.read(i, mode, i5, mode2, i6, iMax3, iMax);
    }

    public final void IconCompatParcelizer(int i, int i2, int i3, int i4, boolean z, boolean z2) {
        int i5 = this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.RemoteActionCompatParcelizer;
        int iResolveSizeAndState = resolveSizeAndState(i3 + this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.IconCompatParcelizer, i, 0);
        int iResolveSizeAndState2 = resolveSizeAndState(i4 + i5, i2, 0);
        int iMin = Math.min(this.MediaBrowserCompatSearchResultReceiver, iResolveSizeAndState & 16777215);
        int iMin2 = Math.min(this.MediaDescriptionCompat, iResolveSizeAndState2 & 16777215);
        if (z) {
            iMin |= BlockingViewModel_HiltModulesKeyModule.OKHTTP_CLIENT_WINDOW_SIZE;
        }
        if (z2) {
            iMin2 |= BlockingViewModel_HiltModulesKeyModule.OKHTTP_CLIENT_WINDOW_SIZE;
        }
        setMeasuredDimension(iMin, iMin2);
        this.RatingCompat = iMin;
        this.MediaBrowserCompatItemReceiver = iMin2;
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        if (!this.onCommand) {
            int childCount = getChildCount();
            int i3 = 0;
            while (true) {
                if (i3 >= childCount) {
                    break;
                }
                if (getChildAt(i3).isLayoutRequested()) {
                    this.onCommand = true;
                    break;
                }
                i3++;
            }
        }
        this.onPause = i;
        this.onPlayFromMediaId = i2;
        this.onAddQueueItem.write(handleMediaPlayPauseIfPendingOnHandler());
        if (this.onCommand) {
            this.onCommand = false;
            if (read()) {
                this.onAddQueueItem.accessaddObserverForBackInvoker();
            }
        }
        read(this.onAddQueueItem, this.onPlay, i, i2);
        IconCompatParcelizer(i, i2, this.onAddQueueItem.onSetShuffleMode(), this.onAddQueueItem.onAddQueueItem(), this.onAddQueueItem.accessensureViewModelStore(), this.onAddQueueItem.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28());
    }

    public final boolean handleMediaPlayPauseIfPendingOnHandler() {
        return (getContext().getApplicationInfo().flags & 4194304) != 0 && 1 == getLayoutDirection();
    }

    private int IconCompatParcelizer() {
        int iMax = Math.max(0, getPaddingLeft());
        int iMax2 = Math.max(0, getPaddingRight());
        int iMax3 = Math.max(0, getPaddingStart()) + Math.max(0, getPaddingEnd());
        return iMax3 > 0 ? iMax3 : iMax + iMax2;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002f A[PHI: r2
      0x002f: PHI (r2v4 o.JdkDeserializers$IconCompatParcelizer) = (r2v3 o.JdkDeserializers$IconCompatParcelizer), (r2v0 o.JdkDeserializers$IconCompatParcelizer) binds: [B:9:0x0026, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0055 A[PHI: r3
      0x0055: PHI (r3v4 o.JdkDeserializers$IconCompatParcelizer) = (r3v3 o.JdkDeserializers$IconCompatParcelizer), (r3v0 o.JdkDeserializers$IconCompatParcelizer) binds: [B:21:0x004c, B:17:0x003f] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void IconCompatParcelizer(kotlin._long r9, int r10, int r11, int r12, int r13) {
        /*
            r8 = this;
            androidx.constraintlayout.widget.ConstraintLayout$RemoteActionCompatParcelizer r0 = r8.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver
            int r0 = r0.RemoteActionCompatParcelizer
            androidx.constraintlayout.widget.ConstraintLayout$RemoteActionCompatParcelizer r1 = r8.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver
            int r1 = r1.IconCompatParcelizer
            o.JdkDeserializers$IconCompatParcelizer r2 = o.JdkDeserializers.IconCompatParcelizer.FIXED
            o.JdkDeserializers$IconCompatParcelizer r3 = o.JdkDeserializers.IconCompatParcelizer.FIXED
            int r4 = r8.getChildCount()
            r5 = 1073741824(0x40000000, float:2.0)
            r6 = 0
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r10 == r7) goto L31
            if (r10 == 0) goto L24
            if (r10 == r5) goto L1c
            goto L2f
        L1c:
            int r10 = r8.MediaBrowserCompatSearchResultReceiver
            int r10 = r10 - r1
            int r11 = java.lang.Math.min(r10, r11)
            goto L3b
        L24:
            o.JdkDeserializers$IconCompatParcelizer r2 = o.JdkDeserializers.IconCompatParcelizer.WRAP_CONTENT
            if (r4 != 0) goto L2f
            int r10 = r8.onFastForward
            int r11 = java.lang.Math.max(r6, r10)
            goto L3b
        L2f:
            r11 = r6
            goto L3b
        L31:
            o.JdkDeserializers$IconCompatParcelizer r2 = o.JdkDeserializers.IconCompatParcelizer.WRAP_CONTENT
            if (r4 != 0) goto L3b
            int r10 = r8.onFastForward
            int r11 = java.lang.Math.max(r6, r10)
        L3b:
            if (r12 == r7) goto L57
            if (r12 == 0) goto L4a
            if (r12 == r5) goto L42
            goto L55
        L42:
            int r10 = r8.MediaDescriptionCompat
            int r10 = r10 - r0
            int r13 = java.lang.Math.min(r10, r13)
            goto L61
        L4a:
            o.JdkDeserializers$IconCompatParcelizer r3 = o.JdkDeserializers.IconCompatParcelizer.WRAP_CONTENT
            if (r4 != 0) goto L55
            int r10 = r8.onCustomAction
            int r13 = java.lang.Math.max(r6, r10)
            goto L61
        L55:
            r13 = r6
            goto L61
        L57:
            o.JdkDeserializers$IconCompatParcelizer r3 = o.JdkDeserializers.IconCompatParcelizer.WRAP_CONTENT
            if (r4 != 0) goto L61
            int r10 = r8.onCustomAction
            int r13 = java.lang.Math.max(r6, r10)
        L61:
            int r10 = r9.onSetShuffleMode()
            if (r11 != r10) goto L6d
            int r10 = r9.onAddQueueItem()
            if (r13 == r10) goto L70
        L6d:
            r9.AudioAttributesImplBaseParcelizer()
        L70:
            r9.onPlayFromMediaId(r6)
            r9.onMediaButtonEvent(r6)
            int r10 = r8.MediaBrowserCompatSearchResultReceiver
            int r10 = r10 - r1
            r9.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(r10)
            int r10 = r8.MediaDescriptionCompat
            int r10 = r10 - r0
            r9.MediaBrowserCompatMediaItem(r10)
            r9.onCommand(r6)
            r9.onCustomAction(r6)
            r9.AudioAttributesCompatParcelizer(r2)
            r9.onFastForward(r11)
            r9.write(r3)
            r9.MediaMetadataCompat(r13)
            int r10 = r8.onFastForward
            int r10 = r10 - r1
            r9.onCommand(r10)
            int r8 = r8.onCustomAction
            int r8 = r8 - r0
            r9.onCustomAction(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.IconCompatParcelizer(o._long, int, int, int, int):void");
    }

    public void setState(int i, int i2, int i3) {
        StdDelegatingDeserializer stdDelegatingDeserializer = this.handleMediaPlayPauseIfPendingOnHandler;
        if (stdDelegatingDeserializer != null) {
            stdDelegatingDeserializer.IconCompatParcelizer(i, i2, i3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002c  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onLayout(boolean r6, int r7, int r8, int r9, int r10) {
        /*
            r5 = this;
            int r6 = r5.getChildCount()
            boolean r7 = r5.isInEditMode()
            r8 = 0
            r9 = r8
        La:
            if (r9 >= r6) goto L5a
            android.view.View r10 = r5.getChildAt(r9)
            android.view.ViewGroup$LayoutParams r0 = r10.getLayoutParams()
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r0 = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) r0
            o.JdkDeserializers r1 = r0.getOnBackPressedDispatcherannotations
            int r2 = r10.getVisibility()
            r3 = 8
            if (r2 != r3) goto L2c
            boolean r2 = r0.onSeekTo
            if (r2 != 0) goto L2c
            boolean r2 = r0.onSetCaptioningEnabled
            if (r2 != 0) goto L2c
            boolean r2 = r0.onSetRating
            if (r7 == 0) goto L57
        L2c:
            boolean r0 = r0.onSetShuffleMode
            if (r0 != 0) goto L57
            int r0 = r1.onSetRating()
            int r2 = r1.onSetRepeatMode()
            int r3 = r1.onSetShuffleMode()
            int r3 = r3 + r0
            int r1 = r1.onAddQueueItem()
            int r1 = r1 + r2
            r10.layout(r0, r2, r3, r1)
            boolean r4 = r10 instanceof androidx.constraintlayout.widget.Placeholder
            if (r4 == 0) goto L57
            androidx.constraintlayout.widget.Placeholder r10 = (androidx.constraintlayout.widget.Placeholder) r10
            android.view.View r10 = r10.read()
            if (r10 == 0) goto L57
            r10.setVisibility(r8)
            r10.layout(r0, r2, r3, r1)
        L57:
            int r9 = r9 + 1
            goto La
        L5a:
            java.util.ArrayList<androidx.constraintlayout.widget.ConstraintHelper> r6 = r5.read
            int r6 = r6.size()
            if (r6 <= 0) goto L72
        L62:
            if (r8 >= r6) goto L72
            java.util.ArrayList<androidx.constraintlayout.widget.ConstraintHelper> r7 = r5.read
            java.lang.Object r7 = r7.get(r8)
            androidx.constraintlayout.widget.ConstraintHelper r7 = (androidx.constraintlayout.widget.ConstraintHelper) r7
            r7.write()
            int r8 = r8 + 1
            goto L62
        L72:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.onLayout(boolean, int, int, int, int):void");
    }

    public void setOptimizationLevel(int i) {
        this.onPlay = i;
        this.onAddQueueItem.read(i);
    }

    public final int RatingCompat() {
        return this.onAddQueueItem.write();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public static LayoutParams MediaDescriptionCompat() {
        return new LayoutParams(-2, -2);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    public void setConstraintSet(ReferenceTypeDeserializer referenceTypeDeserializer) {
        this.RemoteActionCompatParcelizer = referenceTypeDeserializer;
    }

    public final View MediaBrowserCompatItemReceiver(int i) {
        return this.write.get(i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList<ConstraintHelper> arrayList = this.read;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i = 0; i < size; i++) {
                this.read.get(i).RemoteActionCompatParcelizer(this);
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = getWidth();
            float height = getHeight();
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] strArrSplit = ((String) tag).split(",");
                    if (strArrSplit.length == 4) {
                        int i3 = Integer.parseInt(strArrSplit[0]);
                        int i4 = Integer.parseInt(strArrSplit[1]);
                        int i5 = Integer.parseInt(strArrSplit[2]);
                        int i6 = (int) ((i3 / 1080.0f) * width);
                        int i7 = (int) ((i4 / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f = i6;
                        float f2 = i7;
                        float f3 = i6 + ((int) ((i5 / 1080.0f) * width));
                        canvas.drawLine(f, f2, f3, f2, paint);
                        float f4 = i7 + ((int) ((Integer.parseInt(strArrSplit[3]) / 1920.0f) * height));
                        canvas.drawLine(f3, f2, f3, f4, paint);
                        canvas.drawLine(f3, f4, f, f4, paint);
                        canvas.drawLine(f, f4, f, f2, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f, f2, f3, f4, paint);
                        canvas.drawLine(f, f4, f3, f2, paint);
                    }
                }
            }
        }
    }

    public void setOnConstraintsChanged(StackTraceElementDeserializerAdapter stackTraceElementDeserializerAdapter) {
        this.AudioAttributesImplApi21Parcelizer = stackTraceElementDeserializerAdapter;
        StdDelegatingDeserializer stdDelegatingDeserializer = this.handleMediaPlayPauseIfPendingOnHandler;
        if (stdDelegatingDeserializer != null) {
            stdDelegatingDeserializer.write(stackTraceElementDeserializerAdapter);
        }
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        public int AudioAttributesCompatParcelizer;
        public int AudioAttributesImplApi21Parcelizer;
        public boolean AudioAttributesImplApi26Parcelizer;
        public float AudioAttributesImplBaseParcelizer;
        public int IconCompatParcelizer;
        public int MediaBrowserCompatCustomActionResultReceiver;
        public int MediaBrowserCompatItemReceiver;
        public String MediaBrowserCompatMediaItem;
        public int MediaBrowserCompatSearchResultReceiver;
        public int MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        public String MediaDescriptionCompat;
        public boolean MediaMetadataCompat;
        boolean MediaSessionCompatQueueItem;
        public int MediaSessionCompatResultReceiverWrapper;
        public float MediaSessionCompatToken;
        public float ParcelableVolumeInfo;
        public int PlaybackStateCompat;
        int PlaybackStateCompatCustomAction;
        public float RatingCompat;
        public int RemoteActionCompatParcelizer;
        float ResultReceiver;
        int _init_lambda2;
        float _init_lambda3;
        public int _init_lambda4;
        public int _init_lambda5;
        public int accessaddObserverForBackInvoker;
        public int accessensureViewModelStore;
        public int accessgetReportFullyDrawnExecutorp;
        public float accessonBackPresseds1027565324;
        private boolean addContentView;
        private boolean addMenuProvider;
        public int addObserverForBackInvoker;
        public int addObserverForBackInvokerlambda7;
        boolean createFullyDrawnExecutor;
        public float ensureViewModelStore;
        JdkDeserializers getOnBackPressedDispatcherannotations;
        public int getSavedStateRegistryControllerannotations;
        public int handleMediaPlayPauseIfPendingOnHandler;
        private boolean menuHostHelperlambda0;
        public int onAddQueueItem;
        public int onCommand;
        public int onCustomAction;
        public int onFastForward;
        public int onMediaButtonEvent;
        public int onPause;
        public int onPlay;
        public int onPlayFromMediaId;
        public int onPlayFromSearch;
        public float onPlayFromUri;
        public int onPrepare;
        public boolean onPrepareFromMediaId;
        public int onPrepareFromSearch;
        public int onPrepareFromUri;
        public float onRemoveQueueItem;
        boolean onRemoveQueueItemAt;
        public float onRewind;
        boolean onSeekTo;
        boolean onSetCaptioningEnabled;
        public int onSetPlaybackSpeed;
        boolean onSetRating;
        public int onSetRepeatMode;
        boolean onSetShuffleMode;
        public int onSkipToNext;
        public int onSkipToPrevious;
        public int onSkipToQueueItem;
        public int onStop;
        int r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw;
        int r8lambdaKUbBm7ckfqTc9QCgukC86fguu4;
        int r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
        int r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;
        int r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8;
        int r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0;
        public int read;
        public int setSessionImpl;
        public int write;

        public final JdkDeserializers AudioAttributesCompatParcelizer() {
            return this.getOnBackPressedDispatcherannotations;
        }

        /* JADX INFO: loaded from: classes2.dex */
        static class write {
            public static final SparseIntArray RemoteActionCompatParcelizer;

            static {
                SparseIntArray sparseIntArray = new SparseIntArray();
                RemoteActionCompatParcelizer = sparseIntArray;
                sparseIntArray.append(_isBlank.read.ConstraintLayout_Layout_layout_constraintWidth, 64);
                sparseIntArray.append(_isBlank.read.ConstraintLayout_Layout_layout_constraintHeight, 65);
                sparseIntArray.append(_isBlank.read.ConstraintLayout_Layout_layout_constraintLeft_toLeftOf, 8);
                sparseIntArray.append(_isBlank.read.ConstraintLayout_Layout_layout_constraintLeft_toRightOf, 9);
                sparseIntArray.append(_isBlank.read.ConstraintLayout_Layout_layout_constraintRight_toLeftOf, 10);
                sparseIntArray.append(_isBlank.read.ConstraintLayout_Layout_layout_constraintRight_toRightOf, 11);
                sparseIntArray.append(_isBlank.read.ConstraintLayout_Layout_layout_constraintTop_toTopOf, 12);
                sparseIntArray.append(_isBlank.read.ConstraintLayout_Layout_layout_constraintTop_toBottomOf, 13);
                sparseIntArray.append(_isBlank.read.ConstraintLayout_Layout_layout_constraintBottom_toTopOf, 14);
                sparseIntArray.append(_isBlank.read.ConstraintLayout_Layout_layout_constraintBottom_toBottomOf, 15);
                sparseIntArray.append(_isBlank.read.ConstraintLayout_Layout_layout_constraintBaseline_toBaselineOf, 16);
                sparseIntArray.append(_isBlank.read.ConstraintLayout_Layout_layout_constraintBaseline_toTopOf, 52);
                sparseIntArray.append(_isBlank.read.ConstraintLayout_Layout_layout_constraintBaseline_toBottomOf, 53);
                sparseIntArray.append(_isBlank.read.ConstraintLayout_Layout_layout_constraintCircle, 2);
                sparseIntArray.append(_isBlank.read.ConstraintLayout_Layout_layout_constraintCircleRadius, 3);
                sparseIntArray.append(_isBlank.read.ConstraintLayout_Layout_layout_constraintCircleAngle, 4);
                sparseIntArray.append(_isBlank.read.ConstraintLayout_Layout_layout_editor_absoluteX, 49);
                sparseIntArray.append(_isBlank.read.ConstraintLayout_Layout_layout_editor_absoluteY, 50);
                sparseIntArray.append(_isBlank.read.ConstraintLayout_Layout_layout_constraintGuide_begin, 5);
                sparseIntArray.append(_isBlank.read.ConstraintLayout_Layout_layout_constraintGuide_end, 6);
                sparseIntArray.append(_isBlank.read.ConstraintLayout_Layout_layout_constraintGuide_percent, 7);
                sparseIntArray.append(_isBlank.read.ConstraintLayout_Layout_guidelineUseRtl, 67);
                sparseIntArray.append(_isBlank.read.ConstraintLayout_Layout_android_orientation, 1);
                sparseIntArray.append(_isBlank.read.ConstraintLayout_Layout_layout_constraintStart_toEndOf, 17);
                sparseIntArray.append(_isBlank.read.ConstraintLayout_Layout_layout_constraintStart_toStartOf, 18);
                sparseIntArray.append(_isBlank.read.ConstraintLayout_Layout_layout_constraintEnd_toStartOf, 19);
                sparseIntArray.append(_isBlank.read.ConstraintLayout_Layout_layout_constraintEnd_toEndOf, 20);
                sparseIntArray.append(_isBlank.read.ConstraintLayout_Layout_layout_goneMarginLeft, 21);
                sparseIntArray.append(_isBlank.read.ConstraintLayout_Layout_layout_goneMarginTop, 22);
                sparseIntArray.append(_isBlank.read.ConstraintLayout_Layout_layout_goneMarginRight, 23);
                sparseIntArray.append(_isBlank.read.ConstraintLayout_Layout_layout_goneMarginBottom, 24);
                sparseIntArray.append(_isBlank.read.ConstraintLayout_Layout_layout_goneMarginStart, 25);
                sparseIntArray.append(_isBlank.read.ConstraintLayout_Layout_layout_goneMarginEnd, 26);
                sparseIntArray.append(_isBlank.read.ConstraintLayout_Layout_layout_goneMarginBaseline, 55);
                sparseIntArray.append(_isBlank.read.ConstraintLayout_Layout_layout_marginBaseline, 54);
                sparseIntArray.append(_isBlank.read.ConstraintLayout_Layout_layout_constraintHorizontal_bias, 29);
                sparseIntArray.append(_isBlank.read.ConstraintLayout_Layout_layout_constraintVertical_bias, 30);
                sparseIntArray.append(_isBlank.read.ConstraintLayout_Layout_layout_constraintDimensionRatio, 44);
                sparseIntArray.append(_isBlank.read.ConstraintLayout_Layout_layout_constraintHorizontal_weight, 45);
                sparseIntArray.append(_isBlank.read.ConstraintLayout_Layout_layout_constraintVertical_weight, 46);
                sparseIntArray.append(_isBlank.read.ConstraintLayout_Layout_layout_constraintHorizontal_chainStyle, 47);
                sparseIntArray.append(_isBlank.read.ConstraintLayout_Layout_layout_constraintVertical_chainStyle, 48);
                sparseIntArray.append(_isBlank.read.ConstraintLayout_Layout_layout_constrainedWidth, 27);
                sparseIntArray.append(_isBlank.read.ConstraintLayout_Layout_layout_constrainedHeight, 28);
                sparseIntArray.append(_isBlank.read.ConstraintLayout_Layout_layout_constraintWidth_default, 31);
                sparseIntArray.append(_isBlank.read.ConstraintLayout_Layout_layout_constraintHeight_default, 32);
                sparseIntArray.append(_isBlank.read.ConstraintLayout_Layout_layout_constraintWidth_min, 33);
                sparseIntArray.append(_isBlank.read.ConstraintLayout_Layout_layout_constraintWidth_max, 34);
                sparseIntArray.append(_isBlank.read.ConstraintLayout_Layout_layout_constraintWidth_percent, 35);
                sparseIntArray.append(_isBlank.read.ConstraintLayout_Layout_layout_constraintHeight_min, 36);
                sparseIntArray.append(_isBlank.read.ConstraintLayout_Layout_layout_constraintHeight_max, 37);
                sparseIntArray.append(_isBlank.read.ConstraintLayout_Layout_layout_constraintHeight_percent, 38);
                sparseIntArray.append(_isBlank.read.ConstraintLayout_Layout_layout_constraintLeft_creator, 39);
                sparseIntArray.append(_isBlank.read.ConstraintLayout_Layout_layout_constraintTop_creator, 40);
                sparseIntArray.append(_isBlank.read.ConstraintLayout_Layout_layout_constraintRight_creator, 41);
                sparseIntArray.append(_isBlank.read.ConstraintLayout_Layout_layout_constraintBottom_creator, 42);
                sparseIntArray.append(_isBlank.read.ConstraintLayout_Layout_layout_constraintBaseline_creator, 43);
                sparseIntArray.append(_isBlank.read.ConstraintLayout_Layout_layout_constraintTag, 51);
                sparseIntArray.append(_isBlank.read.ConstraintLayout_Layout_layout_wrapBehaviorInParent, 66);
            }
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.onPrepare = -1;
            this.onPlayFromSearch = -1;
            this.onPlayFromUri = -1.0f;
            this.addContentView = true;
            this.onSetRepeatMode = -1;
            this.onSetPlaybackSpeed = -1;
            this.accessensureViewModelStore = -1;
            this.accessaddObserverForBackInvoker = -1;
            this.addObserverForBackInvokerlambda7 = -1;
            this._init_lambda4 = -1;
            this.AudioAttributesImplApi21Parcelizer = -1;
            this.read = -1;
            this.AudioAttributesCompatParcelizer = -1;
            this.write = -1;
            this.IconCompatParcelizer = -1;
            this.MediaBrowserCompatItemReceiver = -1;
            this.MediaBrowserCompatCustomActionResultReceiver = 0;
            this.AudioAttributesImplBaseParcelizer = BitmapDescriptorFactory.HUE_RED;
            this._init_lambda5 = -1;
            this.accessgetReportFullyDrawnExecutorp = -1;
            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = -1;
            this.onAddQueueItem = -1;
            this.onPause = Integer.MIN_VALUE;
            this.onPrepareFromSearch = Integer.MIN_VALUE;
            this.onPlay = Integer.MIN_VALUE;
            this.onMediaButtonEvent = Integer.MIN_VALUE;
            this.onPlayFromMediaId = Integer.MIN_VALUE;
            this.onFastForward = Integer.MIN_VALUE;
            this.handleMediaPlayPauseIfPendingOnHandler = Integer.MIN_VALUE;
            this.RemoteActionCompatParcelizer = 0;
            this.addMenuProvider = true;
            this.menuHostHelperlambda0 = true;
            this.onRewind = 0.5f;
            this.ensureViewModelStore = 0.5f;
            this.MediaBrowserCompatMediaItem = null;
            this.RatingCompat = BitmapDescriptorFactory.HUE_RED;
            this.MediaBrowserCompatSearchResultReceiver = 1;
            this.onRemoveQueueItem = -1.0f;
            this.accessonBackPresseds1027565324 = -1.0f;
            this.onPrepareFromUri = 0;
            this.addObserverForBackInvoker = 0;
            this.onSkipToNext = 0;
            this.onStop = 0;
            this.MediaSessionCompatResultReceiverWrapper = 0;
            this.onSkipToQueueItem = 0;
            this.onSkipToPrevious = 0;
            this.setSessionImpl = 0;
            this.ParcelableVolumeInfo = 1.0f;
            this.MediaSessionCompatToken = 1.0f;
            this.onCustomAction = -1;
            this.onCommand = -1;
            this.PlaybackStateCompat = -1;
            this.MediaMetadataCompat = false;
            this.AudioAttributesImplApi26Parcelizer = false;
            this.MediaDescriptionCompat = null;
            this.getSavedStateRegistryControllerannotations = 0;
            this.onRemoveQueueItemAt = true;
            this.createFullyDrawnExecutor = true;
            this.MediaSessionCompatQueueItem = false;
            this.onSeekTo = false;
            this.onSetCaptioningEnabled = false;
            this.onSetShuffleMode = false;
            this.onSetRating = false;
            this.r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8 = -1;
            this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = -1;
            this._init_lambda2 = -1;
            this.r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0 = -1;
            this.r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw = Integer.MIN_VALUE;
            this.PlaybackStateCompatCustomAction = Integer.MIN_VALUE;
            this._init_lambda3 = 0.5f;
            this.getOnBackPressedDispatcherannotations = new JdkDeserializers();
            this.onPrepareFromMediaId = false;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, _isBlank.read.ConstraintLayout_Layout);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                int i2 = write.RemoteActionCompatParcelizer.get(index);
                switch (i2) {
                    case 1:
                        this.PlaybackStateCompat = typedArrayObtainStyledAttributes.getInt(index, this.PlaybackStateCompat);
                        break;
                    case 2:
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.MediaBrowserCompatItemReceiver);
                        this.MediaBrowserCompatItemReceiver = resourceId;
                        if (resourceId == -1) {
                            this.MediaBrowserCompatItemReceiver = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 3:
                        this.MediaBrowserCompatCustomActionResultReceiver = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.MediaBrowserCompatCustomActionResultReceiver);
                        break;
                    case 4:
                        float f = typedArrayObtainStyledAttributes.getFloat(index, this.AudioAttributesImplBaseParcelizer) % 360.0f;
                        this.AudioAttributesImplBaseParcelizer = f;
                        if (f < BitmapDescriptorFactory.HUE_RED) {
                            this.AudioAttributesImplBaseParcelizer = (360.0f - f) % 360.0f;
                        }
                        break;
                    case 5:
                        this.onPrepare = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.onPrepare);
                        break;
                    case 6:
                        this.onPlayFromSearch = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.onPlayFromSearch);
                        break;
                    case 7:
                        this.onPlayFromUri = typedArrayObtainStyledAttributes.getFloat(index, this.onPlayFromUri);
                        break;
                    case 8:
                        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, this.onSetRepeatMode);
                        this.onSetRepeatMode = resourceId2;
                        if (resourceId2 == -1) {
                            this.onSetRepeatMode = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 9:
                        int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, this.onSetPlaybackSpeed);
                        this.onSetPlaybackSpeed = resourceId3;
                        if (resourceId3 == -1) {
                            this.onSetPlaybackSpeed = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 10:
                        int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(index, this.accessensureViewModelStore);
                        this.accessensureViewModelStore = resourceId4;
                        if (resourceId4 == -1) {
                            this.accessensureViewModelStore = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 11:
                        int resourceId5 = typedArrayObtainStyledAttributes.getResourceId(index, this.accessaddObserverForBackInvoker);
                        this.accessaddObserverForBackInvoker = resourceId5;
                        if (resourceId5 == -1) {
                            this.accessaddObserverForBackInvoker = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 12:
                        int resourceId6 = typedArrayObtainStyledAttributes.getResourceId(index, this.addObserverForBackInvokerlambda7);
                        this.addObserverForBackInvokerlambda7 = resourceId6;
                        if (resourceId6 == -1) {
                            this.addObserverForBackInvokerlambda7 = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 13:
                        int resourceId7 = typedArrayObtainStyledAttributes.getResourceId(index, this._init_lambda4);
                        this._init_lambda4 = resourceId7;
                        if (resourceId7 == -1) {
                            this._init_lambda4 = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 14:
                        int resourceId8 = typedArrayObtainStyledAttributes.getResourceId(index, this.AudioAttributesImplApi21Parcelizer);
                        this.AudioAttributesImplApi21Parcelizer = resourceId8;
                        if (resourceId8 == -1) {
                            this.AudioAttributesImplApi21Parcelizer = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 15:
                        int resourceId9 = typedArrayObtainStyledAttributes.getResourceId(index, this.read);
                        this.read = resourceId9;
                        if (resourceId9 == -1) {
                            this.read = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 16:
                        int resourceId10 = typedArrayObtainStyledAttributes.getResourceId(index, this.AudioAttributesCompatParcelizer);
                        this.AudioAttributesCompatParcelizer = resourceId10;
                        if (resourceId10 == -1) {
                            this.AudioAttributesCompatParcelizer = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 17:
                        int resourceId11 = typedArrayObtainStyledAttributes.getResourceId(index, this._init_lambda5);
                        this._init_lambda5 = resourceId11;
                        if (resourceId11 == -1) {
                            this._init_lambda5 = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 18:
                        int resourceId12 = typedArrayObtainStyledAttributes.getResourceId(index, this.accessgetReportFullyDrawnExecutorp);
                        this.accessgetReportFullyDrawnExecutorp = resourceId12;
                        if (resourceId12 == -1) {
                            this.accessgetReportFullyDrawnExecutorp = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 19:
                        int resourceId13 = typedArrayObtainStyledAttributes.getResourceId(index, this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
                        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = resourceId13;
                        if (resourceId13 == -1) {
                            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 20:
                        int resourceId14 = typedArrayObtainStyledAttributes.getResourceId(index, this.onAddQueueItem);
                        this.onAddQueueItem = resourceId14;
                        if (resourceId14 == -1) {
                            this.onAddQueueItem = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 21:
                        this.onPause = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.onPause);
                        break;
                    case 22:
                        this.onPrepareFromSearch = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.onPrepareFromSearch);
                        break;
                    case 23:
                        this.onPlay = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.onPlay);
                        break;
                    case 24:
                        this.onMediaButtonEvent = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.onMediaButtonEvent);
                        break;
                    case 25:
                        this.onPlayFromMediaId = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.onPlayFromMediaId);
                        break;
                    case 26:
                        this.onFastForward = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.onFastForward);
                        break;
                    case 27:
                        this.MediaMetadataCompat = typedArrayObtainStyledAttributes.getBoolean(index, this.MediaMetadataCompat);
                        break;
                    case 28:
                        this.AudioAttributesImplApi26Parcelizer = typedArrayObtainStyledAttributes.getBoolean(index, this.AudioAttributesImplApi26Parcelizer);
                        break;
                    case 29:
                        this.onRewind = typedArrayObtainStyledAttributes.getFloat(index, this.onRewind);
                        break;
                    case 30:
                        this.ensureViewModelStore = typedArrayObtainStyledAttributes.getFloat(index, this.ensureViewModelStore);
                        break;
                    case 31:
                        this.onSkipToNext = typedArrayObtainStyledAttributes.getInt(index, 0);
                        break;
                    case 32:
                        this.onStop = typedArrayObtainStyledAttributes.getInt(index, 0);
                        break;
                    case 33:
                        try {
                            this.MediaSessionCompatResultReceiverWrapper = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.MediaSessionCompatResultReceiverWrapper);
                        } catch (Exception unused) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.MediaSessionCompatResultReceiverWrapper) == -2) {
                                this.MediaSessionCompatResultReceiverWrapper = -2;
                            }
                        }
                        break;
                    case 34:
                        try {
                            this.onSkipToPrevious = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.onSkipToPrevious);
                        } catch (Exception unused2) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.onSkipToPrevious) == -2) {
                                this.onSkipToPrevious = -2;
                            }
                        }
                        break;
                    case 35:
                        this.ParcelableVolumeInfo = Math.max(BitmapDescriptorFactory.HUE_RED, typedArrayObtainStyledAttributes.getFloat(index, this.ParcelableVolumeInfo));
                        this.onSkipToNext = 2;
                        break;
                    case 36:
                        try {
                            this.onSkipToQueueItem = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.onSkipToQueueItem);
                        } catch (Exception unused3) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.onSkipToQueueItem) == -2) {
                                this.onSkipToQueueItem = -2;
                            }
                        }
                        break;
                    case 37:
                        try {
                            this.setSessionImpl = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.setSessionImpl);
                        } catch (Exception unused4) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.setSessionImpl) == -2) {
                                this.setSessionImpl = -2;
                            }
                        }
                        break;
                    case 38:
                        this.MediaSessionCompatToken = Math.max(BitmapDescriptorFactory.HUE_RED, typedArrayObtainStyledAttributes.getFloat(index, this.MediaSessionCompatToken));
                        this.onStop = 2;
                        break;
                    default:
                        switch (i2) {
                            case 44:
                                ReferenceTypeDeserializer.read(this, typedArrayObtainStyledAttributes.getString(index));
                                break;
                            case 45:
                                this.onRemoveQueueItem = typedArrayObtainStyledAttributes.getFloat(index, this.onRemoveQueueItem);
                                break;
                            case 46:
                                this.accessonBackPresseds1027565324 = typedArrayObtainStyledAttributes.getFloat(index, this.accessonBackPresseds1027565324);
                                break;
                            case 47:
                                this.onPrepareFromUri = typedArrayObtainStyledAttributes.getInt(index, 0);
                                break;
                            case 48:
                                this.addObserverForBackInvoker = typedArrayObtainStyledAttributes.getInt(index, 0);
                                break;
                            case 49:
                                this.onCustomAction = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.onCustomAction);
                                break;
                            case 50:
                                this.onCommand = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.onCommand);
                                break;
                            case 51:
                                this.MediaDescriptionCompat = typedArrayObtainStyledAttributes.getString(index);
                                break;
                            case 52:
                                int resourceId15 = typedArrayObtainStyledAttributes.getResourceId(index, this.write);
                                this.write = resourceId15;
                                if (resourceId15 == -1) {
                                    this.write = typedArrayObtainStyledAttributes.getInt(index, -1);
                                }
                                break;
                            case 53:
                                int resourceId16 = typedArrayObtainStyledAttributes.getResourceId(index, this.IconCompatParcelizer);
                                this.IconCompatParcelizer = resourceId16;
                                if (resourceId16 == -1) {
                                    this.IconCompatParcelizer = typedArrayObtainStyledAttributes.getInt(index, -1);
                                }
                                break;
                            case 54:
                                this.RemoteActionCompatParcelizer = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.RemoteActionCompatParcelizer);
                                break;
                            case 55:
                                this.handleMediaPlayPauseIfPendingOnHandler = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.handleMediaPlayPauseIfPendingOnHandler);
                                break;
                            default:
                                switch (i2) {
                                    case 64:
                                        ReferenceTypeDeserializer.IconCompatParcelizer(this, typedArrayObtainStyledAttributes, index, 0);
                                        this.addMenuProvider = true;
                                        break;
                                    case 65:
                                        ReferenceTypeDeserializer.IconCompatParcelizer(this, typedArrayObtainStyledAttributes, index, 1);
                                        this.menuHostHelperlambda0 = true;
                                        break;
                                    case 66:
                                        this.getSavedStateRegistryControllerannotations = typedArrayObtainStyledAttributes.getInt(index, this.getSavedStateRegistryControllerannotations);
                                        break;
                                    case 67:
                                        this.addContentView = typedArrayObtainStyledAttributes.getBoolean(index, this.addContentView);
                                        break;
                                }
                                break;
                        }
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
            write();
        }

        public final void write() {
            this.onSeekTo = false;
            this.onRemoveQueueItemAt = true;
            this.createFullyDrawnExecutor = true;
            if (((ViewGroup.LayoutParams) this).width == -2 && this.MediaMetadataCompat) {
                this.onRemoveQueueItemAt = false;
                if (this.onSkipToNext == 0) {
                    this.onSkipToNext = 1;
                }
            }
            if (((ViewGroup.LayoutParams) this).height == -2 && this.AudioAttributesImplApi26Parcelizer) {
                this.createFullyDrawnExecutor = false;
                if (this.onStop == 0) {
                    this.onStop = 1;
                }
            }
            if (((ViewGroup.LayoutParams) this).width == 0 || ((ViewGroup.LayoutParams) this).width == -1) {
                this.onRemoveQueueItemAt = false;
                if (((ViewGroup.LayoutParams) this).width == 0 && this.onSkipToNext == 1) {
                    ((ViewGroup.LayoutParams) this).width = -2;
                    this.MediaMetadataCompat = true;
                }
            }
            if (((ViewGroup.LayoutParams) this).height == 0 || ((ViewGroup.LayoutParams) this).height == -1) {
                this.createFullyDrawnExecutor = false;
                if (((ViewGroup.LayoutParams) this).height == 0 && this.onStop == 1) {
                    ((ViewGroup.LayoutParams) this).height = -2;
                    this.AudioAttributesImplApi26Parcelizer = true;
                }
            }
            if (this.onPlayFromUri == -1.0f && this.onPrepare == -1 && this.onPlayFromSearch == -1) {
                return;
            }
            this.onSeekTo = true;
            this.onRemoveQueueItemAt = true;
            this.createFullyDrawnExecutor = true;
            if (!(this.getOnBackPressedDispatcherannotations instanceof _deserializeUsingCreator)) {
                this.getOnBackPressedDispatcherannotations = new _deserializeUsingCreator();
            }
            ((_deserializeUsingCreator) this.getOnBackPressedDispatcherannotations).onPrepare(this.PlaybackStateCompat);
        }

        public LayoutParams(int i, int i2) {
            super(-2, -2);
            this.onPrepare = -1;
            this.onPlayFromSearch = -1;
            this.onPlayFromUri = -1.0f;
            this.addContentView = true;
            this.onSetRepeatMode = -1;
            this.onSetPlaybackSpeed = -1;
            this.accessensureViewModelStore = -1;
            this.accessaddObserverForBackInvoker = -1;
            this.addObserverForBackInvokerlambda7 = -1;
            this._init_lambda4 = -1;
            this.AudioAttributesImplApi21Parcelizer = -1;
            this.read = -1;
            this.AudioAttributesCompatParcelizer = -1;
            this.write = -1;
            this.IconCompatParcelizer = -1;
            this.MediaBrowserCompatItemReceiver = -1;
            this.MediaBrowserCompatCustomActionResultReceiver = 0;
            this.AudioAttributesImplBaseParcelizer = BitmapDescriptorFactory.HUE_RED;
            this._init_lambda5 = -1;
            this.accessgetReportFullyDrawnExecutorp = -1;
            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = -1;
            this.onAddQueueItem = -1;
            this.onPause = Integer.MIN_VALUE;
            this.onPrepareFromSearch = Integer.MIN_VALUE;
            this.onPlay = Integer.MIN_VALUE;
            this.onMediaButtonEvent = Integer.MIN_VALUE;
            this.onPlayFromMediaId = Integer.MIN_VALUE;
            this.onFastForward = Integer.MIN_VALUE;
            this.handleMediaPlayPauseIfPendingOnHandler = Integer.MIN_VALUE;
            this.RemoteActionCompatParcelizer = 0;
            this.addMenuProvider = true;
            this.menuHostHelperlambda0 = true;
            this.onRewind = 0.5f;
            this.ensureViewModelStore = 0.5f;
            this.MediaBrowserCompatMediaItem = null;
            this.RatingCompat = BitmapDescriptorFactory.HUE_RED;
            this.MediaBrowserCompatSearchResultReceiver = 1;
            this.onRemoveQueueItem = -1.0f;
            this.accessonBackPresseds1027565324 = -1.0f;
            this.onPrepareFromUri = 0;
            this.addObserverForBackInvoker = 0;
            this.onSkipToNext = 0;
            this.onStop = 0;
            this.MediaSessionCompatResultReceiverWrapper = 0;
            this.onSkipToQueueItem = 0;
            this.onSkipToPrevious = 0;
            this.setSessionImpl = 0;
            this.ParcelableVolumeInfo = 1.0f;
            this.MediaSessionCompatToken = 1.0f;
            this.onCustomAction = -1;
            this.onCommand = -1;
            this.PlaybackStateCompat = -1;
            this.MediaMetadataCompat = false;
            this.AudioAttributesImplApi26Parcelizer = false;
            this.MediaDescriptionCompat = null;
            this.getSavedStateRegistryControllerannotations = 0;
            this.onRemoveQueueItemAt = true;
            this.createFullyDrawnExecutor = true;
            this.MediaSessionCompatQueueItem = false;
            this.onSeekTo = false;
            this.onSetCaptioningEnabled = false;
            this.onSetShuffleMode = false;
            this.onSetRating = false;
            this.r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8 = -1;
            this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = -1;
            this._init_lambda2 = -1;
            this.r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0 = -1;
            this.r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw = Integer.MIN_VALUE;
            this.PlaybackStateCompatCustomAction = Integer.MIN_VALUE;
            this._init_lambda3 = 0.5f;
            this.getOnBackPressedDispatcherannotations = new JdkDeserializers();
            this.onPrepareFromMediaId = false;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.onPrepare = -1;
            this.onPlayFromSearch = -1;
            this.onPlayFromUri = -1.0f;
            this.addContentView = true;
            this.onSetRepeatMode = -1;
            this.onSetPlaybackSpeed = -1;
            this.accessensureViewModelStore = -1;
            this.accessaddObserverForBackInvoker = -1;
            this.addObserverForBackInvokerlambda7 = -1;
            this._init_lambda4 = -1;
            this.AudioAttributesImplApi21Parcelizer = -1;
            this.read = -1;
            this.AudioAttributesCompatParcelizer = -1;
            this.write = -1;
            this.IconCompatParcelizer = -1;
            this.MediaBrowserCompatItemReceiver = -1;
            this.MediaBrowserCompatCustomActionResultReceiver = 0;
            this.AudioAttributesImplBaseParcelizer = BitmapDescriptorFactory.HUE_RED;
            this._init_lambda5 = -1;
            this.accessgetReportFullyDrawnExecutorp = -1;
            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = -1;
            this.onAddQueueItem = -1;
            this.onPause = Integer.MIN_VALUE;
            this.onPrepareFromSearch = Integer.MIN_VALUE;
            this.onPlay = Integer.MIN_VALUE;
            this.onMediaButtonEvent = Integer.MIN_VALUE;
            this.onPlayFromMediaId = Integer.MIN_VALUE;
            this.onFastForward = Integer.MIN_VALUE;
            this.handleMediaPlayPauseIfPendingOnHandler = Integer.MIN_VALUE;
            this.RemoteActionCompatParcelizer = 0;
            this.addMenuProvider = true;
            this.menuHostHelperlambda0 = true;
            this.onRewind = 0.5f;
            this.ensureViewModelStore = 0.5f;
            this.MediaBrowserCompatMediaItem = null;
            this.RatingCompat = BitmapDescriptorFactory.HUE_RED;
            this.MediaBrowserCompatSearchResultReceiver = 1;
            this.onRemoveQueueItem = -1.0f;
            this.accessonBackPresseds1027565324 = -1.0f;
            this.onPrepareFromUri = 0;
            this.addObserverForBackInvoker = 0;
            this.onSkipToNext = 0;
            this.onStop = 0;
            this.MediaSessionCompatResultReceiverWrapper = 0;
            this.onSkipToQueueItem = 0;
            this.onSkipToPrevious = 0;
            this.setSessionImpl = 0;
            this.ParcelableVolumeInfo = 1.0f;
            this.MediaSessionCompatToken = 1.0f;
            this.onCustomAction = -1;
            this.onCommand = -1;
            this.PlaybackStateCompat = -1;
            this.MediaMetadataCompat = false;
            this.AudioAttributesImplApi26Parcelizer = false;
            this.MediaDescriptionCompat = null;
            this.getSavedStateRegistryControllerannotations = 0;
            this.onRemoveQueueItemAt = true;
            this.createFullyDrawnExecutor = true;
            this.MediaSessionCompatQueueItem = false;
            this.onSeekTo = false;
            this.onSetCaptioningEnabled = false;
            this.onSetShuffleMode = false;
            this.onSetRating = false;
            this.r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8 = -1;
            this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = -1;
            this._init_lambda2 = -1;
            this.r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0 = -1;
            this.r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw = Integer.MIN_VALUE;
            this.PlaybackStateCompatCustomAction = Integer.MIN_VALUE;
            this._init_lambda3 = 0.5f;
            this.getOnBackPressedDispatcherannotations = new JdkDeserializers();
            this.onPrepareFromMediaId = false;
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0049  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0050  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0057  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x005d  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0063  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x0079  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x0081  */
        @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void resolveLayoutDirection(int r11) {
            /*
                Method dump skipped, instruction units count: 258
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.LayoutParams.resolveLayoutDirection(int):void");
        }

        public final String RemoteActionCompatParcelizer() {
            return this.MediaDescriptionCompat;
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        write();
        super.requestLayout();
    }

    @Override // android.view.View
    public void forceLayout() {
        write();
        super.forceLayout();
    }

    private void write() {
        this.onCommand = true;
        this.RatingCompat = -1;
        this.MediaBrowserCompatItemReceiver = -1;
        this.MediaMetadataCompat = -1;
        this.AudioAttributesImplApi26Parcelizer = -1;
        this.MediaBrowserCompatMediaItem = 0;
        this.AudioAttributesImplBaseParcelizer = 0;
    }
}
