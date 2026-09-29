package com.google.android.material.textfield;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityEvent;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.customview.view.AbsSavedState;
import androidx.transition.Fade;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.BinarySearchSeekerSeekOperationParams;
import kotlin.ExtractorOutput;
import kotlin.ExtractorUtil;
import kotlin.FlacBinarySearchSeekerFlacTimestampSeeker;
import kotlin.IntentSenderRequest;
import kotlin.InvalidTypeIdException;
import kotlin.SeekMap;
import kotlin.StreamFormatChunk;
import kotlin.StreamNameChunk;
import kotlin._addSuperTypes;
import kotlin._createUsingDelegate;
import kotlin._isNaN;
import kotlin.calculateNextSearchBytePosition;
import kotlin.checkAndPeekStreamMarker;
import kotlin.createExtractors;
import kotlin.deserializeUsingCustom;
import kotlin.findFormatOverrides;
import kotlin.frameSizeBytesByTypeNb;
import kotlin.getDefaultViewModelCreationExtras;
import kotlin.getSampleRateLookupKey;
import kotlin.hasSuperClassStartingWith;
import kotlin.isValidFrameType;
import kotlin.mapArray;
import kotlin.onChunkData;
import kotlin.parseBitmapInfoHeader;
import kotlin.readFrames;
import kotlin.readId3Metadata;
import kotlin.reportWithProductId;
import kotlin.setTitle;
import kotlin.startIntentSenderForResult;

/* JADX INFO: loaded from: classes3.dex */
public class TextInputLayout extends LinearLayout implements ViewTreeObserver.OnGlobalLayoutListener {
    private boolean AudioAttributesImplApi21Parcelizer;
    private ValueAnimator AudioAttributesImplApi26Parcelizer;
    private int AudioAttributesImplBaseParcelizer;
    public EditText IconCompatParcelizer;
    private boolean MediaBrowserCompatCustomActionResultReceiver;
    private frameSizeBytesByTypeNb MediaBrowserCompatItemReceiver;
    private int MediaBrowserCompatMediaItem;
    private int MediaBrowserCompatSearchResultReceiver;
    private int MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    private int MediaDescriptionCompat;
    private final int MediaMetadataCompat;
    private boolean MediaSessionCompatQueueItem;
    private int MediaSessionCompatResultReceiverWrapper;
    private int MediaSessionCompatToken;
    private boolean ParcelableVolumeInfo;
    private boolean PlaybackStateCompat;
    private final StreamNameChunk PlaybackStateCompatCustomAction;
    private int RatingCompat;
    final ExtractorUtil RemoteActionCompatParcelizer;
    private int ResultReceiver;
    private Drawable _init_lambda2;
    private CharSequence _init_lambda3;
    private frameSizeBytesByTypeNb _init_lambda4;
    private boolean _init_lambda5;
    private Fade accessaddObserverForBackInvoker;
    private CharSequence accessensureViewModelStore;
    private Fade accessgetReportFullyDrawnExecutorp;
    private boolean accessonBackPresseds1027565324;
    private int addContentView;
    private Drawable addMenuProvider;
    private int addObserverForBackInvoker;
    private TextView addObserverForBackInvokerlambda7;
    private final Rect addOnConfigurationChangedListener;
    private Typeface addOnNewIntentListener;
    private final RectF addOnPictureInPictureModeChangedListener;
    private isValidFrameType createFullyDrawnExecutor;
    private ColorStateList ensureViewModelStore;
    private final Rect getOnBackPressedDispatcherannotations;
    private ColorStateList getSavedStateRegistryControllerannotations;
    private frameSizeBytesByTypeNb handleMediaPlayPauseIfPendingOnHandler;
    private final FlacBinarySearchSeekerFlacTimestampSeeker menuHostHelperlambda0;
    private frameSizeBytesByTypeNb onAddQueueItem;
    private int onCommand;
    private int onCustomAction;
    private ColorStateList onFastForward;
    private int onMediaButtonEvent;
    private int onPause;
    private boolean onPlay;
    private ColorStateList onPlayFromMediaId;
    private ColorStateList onPlayFromSearch;
    private ColorStateList onPlayFromUri;
    private ColorStateList onPrepare;
    private int onPrepareFromMediaId;
    private TextView onPrepareFromSearch;
    private int onPrepareFromUri;
    private int onRemoveQueueItem;
    private int onRemoveQueueItemAt;
    private Drawable onRewind;
    private final LinkedHashSet<IconCompatParcelizer> onSeekTo;
    private StateListDrawable onSetCaptioningEnabled;
    private int onSetPlaybackSpeed;
    private int onSetRating;
    private boolean onSetRepeatMode;
    private final parseBitmapInfoHeader onSetShuffleMode;
    private boolean onSkipToNext;
    private boolean onSkipToPrevious;
    private ColorStateList onSkipToQueueItem;
    private int onStop;
    private final FrameLayout r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw;
    private boolean r8lambdaKUbBm7ckfqTc9QCgukC86fguu4;
    private write r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
    private int r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;
    private int r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8;
    private int r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0;
    private CharSequence setSessionImpl;
    boolean write;
    private static final int read = calculateNextSearchBytePosition.MediaBrowserCompatMediaItem.Widget_Design_TextInputLayout;
    private static final int[][] AudioAttributesCompatParcelizer = {new int[]{R.attr.state_pressed}, new int[0]};

    public interface IconCompatParcelizer {
        void write(TextInputLayout textInputLayout);
    }

    /* JADX INFO: loaded from: classes5.dex */
    public interface RemoteActionCompatParcelizer {
    }

    public interface write {
        int read(Editable editable);
    }

    public static /* synthetic */ int read(Editable editable) {
        if (editable != null) {
            return editable.length();
        }
        return 0;
    }

    public TextInputLayout(Context context) {
        this(context, null);
    }

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, calculateNextSearchBytePosition.IconCompatParcelizer.textInputStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public TextInputLayout(Context context, AttributeSet attributeSet, int i) {
        int i2 = read;
        super(readFrames.IconCompatParcelizer(context, attributeSet, i, i2), attributeSet, i);
        this.r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0 = -1;
        this.ResultReceiver = -1;
        this.r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8 = -1;
        this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = -1;
        this.PlaybackStateCompatCustomAction = new StreamNameChunk(this);
        this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = new write() { // from class: o.FlacConstants
            @Override // com.google.android.material.textfield.TextInputLayout.write
            public final int read(Editable editable) {
                return TextInputLayout.read(editable);
            }
        };
        this.addOnConfigurationChangedListener = new Rect();
        this.getOnBackPressedDispatcherannotations = new Rect();
        this.addOnPictureInPictureModeChangedListener = new RectF();
        this.onSeekTo = new LinkedHashSet<>();
        ExtractorUtil extractorUtil = new ExtractorUtil(this);
        this.RemoteActionCompatParcelizer = extractorUtil;
        this.onSkipToNext = false;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        extractorUtil.AudioAttributesCompatParcelizer(BinarySearchSeekerSeekOperationParams.write);
        extractorUtil.RemoteActionCompatParcelizer(BinarySearchSeekerSeekOperationParams.write);
        extractorUtil.read(8388659);
        setTitle settitle = readId3Metadata.read(context2, attributeSet, calculateNextSearchBytePosition.MediaMetadataCompat.TextInputLayout, i, i2, calculateNextSearchBytePosition.MediaMetadataCompat.TextInputLayout_counterTextAppearance, calculateNextSearchBytePosition.MediaMetadataCompat.TextInputLayout_counterOverflowTextAppearance, calculateNextSearchBytePosition.MediaMetadataCompat.TextInputLayout_errorTextAppearance, calculateNextSearchBytePosition.MediaMetadataCompat.TextInputLayout_helperTextTextAppearance, calculateNextSearchBytePosition.MediaMetadataCompat.TextInputLayout_hintTextAppearance);
        FlacBinarySearchSeekerFlacTimestampSeeker flacBinarySearchSeekerFlacTimestampSeeker = new FlacBinarySearchSeekerFlacTimestampSeeker(this, settitle);
        this.menuHostHelperlambda0 = flacBinarySearchSeekerFlacTimestampSeeker;
        this.MediaSessionCompatQueueItem = settitle.AudioAttributesCompatParcelizer(calculateNextSearchBytePosition.MediaMetadataCompat.TextInputLayout_hintEnabled, true);
        setHint(settitle.AudioAttributesImplBaseParcelizer(calculateNextSearchBytePosition.MediaMetadataCompat.TextInputLayout_android_hint));
        this.onSkipToPrevious = settitle.AudioAttributesCompatParcelizer(calculateNextSearchBytePosition.MediaMetadataCompat.TextInputLayout_hintAnimationEnabled, true);
        this.onSetRepeatMode = settitle.AudioAttributesCompatParcelizer(calculateNextSearchBytePosition.MediaMetadataCompat.TextInputLayout_expandedHintEnabled, true);
        if (settitle.AudioAttributesImplApi26Parcelizer(calculateNextSearchBytePosition.MediaMetadataCompat.TextInputLayout_android_minEms)) {
            setMinEms(settitle.read(calculateNextSearchBytePosition.MediaMetadataCompat.TextInputLayout_android_minEms, -1));
        } else if (settitle.AudioAttributesImplApi26Parcelizer(calculateNextSearchBytePosition.MediaMetadataCompat.TextInputLayout_android_minWidth)) {
            setMinWidth(settitle.AudioAttributesCompatParcelizer(calculateNextSearchBytePosition.MediaMetadataCompat.TextInputLayout_android_minWidth, -1));
        }
        if (settitle.AudioAttributesImplApi26Parcelizer(calculateNextSearchBytePosition.MediaMetadataCompat.TextInputLayout_android_maxEms)) {
            setMaxEms(settitle.read(calculateNextSearchBytePosition.MediaMetadataCompat.TextInputLayout_android_maxEms, -1));
        } else if (settitle.AudioAttributesImplApi26Parcelizer(calculateNextSearchBytePosition.MediaMetadataCompat.TextInputLayout_android_maxWidth)) {
            setMaxWidth(settitle.AudioAttributesCompatParcelizer(calculateNextSearchBytePosition.MediaMetadataCompat.TextInputLayout_android_maxWidth, -1));
        }
        this.createFullyDrawnExecutor = isValidFrameType.read(context2, attributeSet, i, i2).RemoteActionCompatParcelizer();
        this.MediaMetadataCompat = context2.getResources().getDimensionPixelOffset(calculateNextSearchBytePosition.write.mtrl_textinput_box_label_cutout_padding);
        this.MediaBrowserCompatMediaItem = settitle.write(calculateNextSearchBytePosition.MediaMetadataCompat.TextInputLayout_boxCollapsedPaddingTop, 0);
        this.MediaBrowserCompatSearchResultReceiver = settitle.AudioAttributesCompatParcelizer(calculateNextSearchBytePosition.MediaMetadataCompat.TextInputLayout_boxStrokeWidth, context2.getResources().getDimensionPixelSize(calculateNextSearchBytePosition.write.mtrl_textinput_box_stroke_width_default));
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = settitle.AudioAttributesCompatParcelizer(calculateNextSearchBytePosition.MediaMetadataCompat.TextInputLayout_boxStrokeWidthFocused, context2.getResources().getDimensionPixelSize(calculateNextSearchBytePosition.write.mtrl_textinput_box_stroke_width_focused));
        this.onCustomAction = this.MediaBrowserCompatSearchResultReceiver;
        float f = settitle.read(calculateNextSearchBytePosition.MediaMetadataCompat.TextInputLayout_boxCornerRadiusTopStart);
        float f2 = settitle.read(calculateNextSearchBytePosition.MediaMetadataCompat.TextInputLayout_boxCornerRadiusTopEnd);
        float f3 = settitle.read(calculateNextSearchBytePosition.MediaMetadataCompat.TextInputLayout_boxCornerRadiusBottomEnd);
        float f4 = settitle.read(calculateNextSearchBytePosition.MediaMetadataCompat.TextInputLayout_boxCornerRadiusBottomStart);
        isValidFrameType.write writeVarMediaDescriptionCompat = this.createFullyDrawnExecutor.MediaDescriptionCompat();
        if (f >= BitmapDescriptorFactory.HUE_RED) {
            writeVarMediaDescriptionCompat.MediaBrowserCompatItemReceiver(f);
        }
        if (f2 >= BitmapDescriptorFactory.HUE_RED) {
            writeVarMediaDescriptionCompat.MediaBrowserCompatCustomActionResultReceiver(f2);
        }
        if (f3 >= BitmapDescriptorFactory.HUE_RED) {
            writeVarMediaDescriptionCompat.read(f3);
        }
        if (f4 >= BitmapDescriptorFactory.HUE_RED) {
            writeVarMediaDescriptionCompat.write(f4);
        }
        this.createFullyDrawnExecutor = writeVarMediaDescriptionCompat.RemoteActionCompatParcelizer();
        ColorStateList colorStateListIconCompatParcelizer = SeekMap.IconCompatParcelizer(context2, settitle, calculateNextSearchBytePosition.MediaMetadataCompat.TextInputLayout_boxBackgroundColor);
        if (colorStateListIconCompatParcelizer != null) {
            int defaultColor = colorStateListIconCompatParcelizer.getDefaultColor();
            this.onPrepareFromMediaId = defaultColor;
            this.AudioAttributesImplBaseParcelizer = defaultColor;
            if (colorStateListIconCompatParcelizer.isStateful()) {
                this.onPrepareFromUri = colorStateListIconCompatParcelizer.getColorForState(new int[]{-16842910}, -1);
                this.onSetPlaybackSpeed = colorStateListIconCompatParcelizer.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
                this.MediaSessionCompatResultReceiverWrapper = colorStateListIconCompatParcelizer.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            } else {
                this.onSetPlaybackSpeed = this.onPrepareFromMediaId;
                ColorStateList colorStateListIconCompatParcelizer2 = getDefaultViewModelCreationExtras.IconCompatParcelizer(context2, calculateNextSearchBytePosition.read.mtrl_filled_background_color);
                this.onPrepareFromUri = colorStateListIconCompatParcelizer2.getColorForState(new int[]{-16842910}, -1);
                this.MediaSessionCompatResultReceiverWrapper = colorStateListIconCompatParcelizer2.getColorForState(new int[]{R.attr.state_hovered}, -1);
            }
        } else {
            this.AudioAttributesImplBaseParcelizer = 0;
            this.onPrepareFromMediaId = 0;
            this.onPrepareFromUri = 0;
            this.onSetPlaybackSpeed = 0;
            this.MediaSessionCompatResultReceiverWrapper = 0;
        }
        if (settitle.AudioAttributesImplApi26Parcelizer(calculateNextSearchBytePosition.MediaMetadataCompat.TextInputLayout_android_textColorHint)) {
            ColorStateList colorStateListWrite = settitle.write(calculateNextSearchBytePosition.MediaMetadataCompat.TextInputLayout_android_textColorHint);
            this.onSkipToQueueItem = colorStateListWrite;
            this.onPrepare = colorStateListWrite;
        }
        ColorStateList colorStateListIconCompatParcelizer3 = SeekMap.IconCompatParcelizer(context2, settitle, calculateNextSearchBytePosition.MediaMetadataCompat.TextInputLayout_boxStrokeColor);
        this.onStop = settitle.AudioAttributesCompatParcelizer(calculateNextSearchBytePosition.MediaMetadataCompat.TextInputLayout_boxStrokeColor);
        this.onRemoveQueueItem = _isNaN.getColor(context2, calculateNextSearchBytePosition.read.mtrl_textinput_default_box_stroke_color);
        this.onRemoveQueueItemAt = _isNaN.getColor(context2, calculateNextSearchBytePosition.read.mtrl_textinput_disabled_color);
        this.MediaSessionCompatToken = _isNaN.getColor(context2, calculateNextSearchBytePosition.read.mtrl_textinput_hovered_box_stroke_color);
        if (colorStateListIconCompatParcelizer3 != null) {
            setBoxStrokeColorStateList(colorStateListIconCompatParcelizer3);
        }
        if (settitle.AudioAttributesImplApi26Parcelizer(calculateNextSearchBytePosition.MediaMetadataCompat.TextInputLayout_boxStrokeErrorColor)) {
            setBoxStrokeErrorColor(SeekMap.IconCompatParcelizer(context2, settitle, calculateNextSearchBytePosition.MediaMetadataCompat.TextInputLayout_boxStrokeErrorColor));
        }
        if (settitle.MediaBrowserCompatItemReceiver(calculateNextSearchBytePosition.MediaMetadataCompat.TextInputLayout_hintTextAppearance, -1) != -1) {
            setHintTextAppearance(settitle.MediaBrowserCompatItemReceiver(calculateNextSearchBytePosition.MediaMetadataCompat.TextInputLayout_hintTextAppearance, 0));
        }
        this.onPlayFromUri = settitle.write(calculateNextSearchBytePosition.MediaMetadataCompat.TextInputLayout_cursorColor);
        this.onPlayFromSearch = settitle.write(calculateNextSearchBytePosition.MediaMetadataCompat.TextInputLayout_cursorErrorColor);
        int iMediaBrowserCompatItemReceiver = settitle.MediaBrowserCompatItemReceiver(calculateNextSearchBytePosition.MediaMetadataCompat.TextInputLayout_errorTextAppearance, 0);
        CharSequence charSequenceAudioAttributesImplBaseParcelizer = settitle.AudioAttributesImplBaseParcelizer(calculateNextSearchBytePosition.MediaMetadataCompat.TextInputLayout_errorContentDescription);
        int i3 = settitle.read(calculateNextSearchBytePosition.MediaMetadataCompat.TextInputLayout_errorAccessibilityLiveRegion, 1);
        boolean zAudioAttributesCompatParcelizer = settitle.AudioAttributesCompatParcelizer(calculateNextSearchBytePosition.MediaMetadataCompat.TextInputLayout_errorEnabled, false);
        int iMediaBrowserCompatItemReceiver2 = settitle.MediaBrowserCompatItemReceiver(calculateNextSearchBytePosition.MediaMetadataCompat.TextInputLayout_helperTextTextAppearance, 0);
        boolean zAudioAttributesCompatParcelizer2 = settitle.AudioAttributesCompatParcelizer(calculateNextSearchBytePosition.MediaMetadataCompat.TextInputLayout_helperTextEnabled, false);
        CharSequence charSequenceAudioAttributesImplBaseParcelizer2 = settitle.AudioAttributesImplBaseParcelizer(calculateNextSearchBytePosition.MediaMetadataCompat.TextInputLayout_helperText);
        int iMediaBrowserCompatItemReceiver3 = settitle.MediaBrowserCompatItemReceiver(calculateNextSearchBytePosition.MediaMetadataCompat.TextInputLayout_placeholderTextAppearance, 0);
        CharSequence charSequenceAudioAttributesImplBaseParcelizer3 = settitle.AudioAttributesImplBaseParcelizer(calculateNextSearchBytePosition.MediaMetadataCompat.TextInputLayout_placeholderText);
        boolean zAudioAttributesCompatParcelizer3 = settitle.AudioAttributesCompatParcelizer(calculateNextSearchBytePosition.MediaMetadataCompat.TextInputLayout_counterEnabled, false);
        setCounterMaxLength(settitle.read(calculateNextSearchBytePosition.MediaMetadataCompat.TextInputLayout_counterMaxLength, -1));
        this.onPause = settitle.MediaBrowserCompatItemReceiver(calculateNextSearchBytePosition.MediaMetadataCompat.TextInputLayout_counterTextAppearance, 0);
        this.onMediaButtonEvent = settitle.MediaBrowserCompatItemReceiver(calculateNextSearchBytePosition.MediaMetadataCompat.TextInputLayout_counterOverflowTextAppearance, 0);
        setBoxBackgroundMode(settitle.read(calculateNextSearchBytePosition.MediaMetadataCompat.TextInputLayout_boxBackgroundMode, 0));
        setErrorContentDescription(charSequenceAudioAttributesImplBaseParcelizer);
        setErrorAccessibilityLiveRegion(i3);
        setCounterOverflowTextAppearance(this.onMediaButtonEvent);
        setHelperTextTextAppearance(iMediaBrowserCompatItemReceiver2);
        setErrorTextAppearance(iMediaBrowserCompatItemReceiver);
        setCounterTextAppearance(this.onPause);
        setPlaceholderText(charSequenceAudioAttributesImplBaseParcelizer3);
        setPlaceholderTextAppearance(iMediaBrowserCompatItemReceiver3);
        if (settitle.AudioAttributesImplApi26Parcelizer(calculateNextSearchBytePosition.MediaMetadataCompat.TextInputLayout_errorTextColor)) {
            setErrorTextColor(settitle.write(calculateNextSearchBytePosition.MediaMetadataCompat.TextInputLayout_errorTextColor));
        }
        if (settitle.AudioAttributesImplApi26Parcelizer(calculateNextSearchBytePosition.MediaMetadataCompat.TextInputLayout_helperTextTextColor)) {
            setHelperTextColor(settitle.write(calculateNextSearchBytePosition.MediaMetadataCompat.TextInputLayout_helperTextTextColor));
        }
        if (settitle.AudioAttributesImplApi26Parcelizer(calculateNextSearchBytePosition.MediaMetadataCompat.TextInputLayout_hintTextColor)) {
            setHintTextColor(settitle.write(calculateNextSearchBytePosition.MediaMetadataCompat.TextInputLayout_hintTextColor));
        }
        if (settitle.AudioAttributesImplApi26Parcelizer(calculateNextSearchBytePosition.MediaMetadataCompat.TextInputLayout_counterTextColor)) {
            setCounterTextColor(settitle.write(calculateNextSearchBytePosition.MediaMetadataCompat.TextInputLayout_counterTextColor));
        }
        if (settitle.AudioAttributesImplApi26Parcelizer(calculateNextSearchBytePosition.MediaMetadataCompat.TextInputLayout_counterOverflowTextColor)) {
            setCounterOverflowTextColor(settitle.write(calculateNextSearchBytePosition.MediaMetadataCompat.TextInputLayout_counterOverflowTextColor));
        }
        if (settitle.AudioAttributesImplApi26Parcelizer(calculateNextSearchBytePosition.MediaMetadataCompat.TextInputLayout_placeholderTextColor)) {
            setPlaceholderTextColor(settitle.write(calculateNextSearchBytePosition.MediaMetadataCompat.TextInputLayout_placeholderTextColor));
        }
        parseBitmapInfoHeader parsebitmapinfoheader = new parseBitmapInfoHeader(this, settitle);
        this.onSetShuffleMode = parsebitmapinfoheader;
        boolean zAudioAttributesCompatParcelizer4 = settitle.AudioAttributesCompatParcelizer(calculateNextSearchBytePosition.MediaMetadataCompat.TextInputLayout_android_enabled, true);
        settitle.write();
        InvalidTypeIdException.AudioAttributesImplBaseParcelizer(this, 2);
        InvalidTypeIdException.MediaBrowserCompatCustomActionResultReceiver(this, 1);
        frameLayout.addView(flacBinarySearchSeekerFlacTimestampSeeker);
        frameLayout.addView(parsebitmapinfoheader);
        addView(frameLayout);
        setEnabled(zAudioAttributesCompatParcelizer4);
        setHelperTextEnabled(zAudioAttributesCompatParcelizer2);
        setErrorEnabled(zAudioAttributesCompatParcelizer);
        setCounterEnabled(zAudioAttributesCompatParcelizer3);
        setHelperText(charSequenceAudioAttributesImplBaseParcelizer2);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        this.onSetShuffleMode.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        this.onSkipToNext = false;
        boolean zR8lambdaKUbBm7ckfqTc9QCgukC86fguu4 = r8lambdaKUbBm7ckfqTc9QCgukC86fguu4();
        boolean zMediaBrowserCompatSearchResultReceiver = MediaBrowserCompatSearchResultReceiver();
        if (zR8lambdaKUbBm7ckfqTc9QCgukC86fguu4 || zMediaBrowserCompatSearchResultReceiver) {
            this.IconCompatParcelizer.post(new Runnable() { // from class: o.FlacBinarySearchSeekerExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.read.MediaDescriptionCompat();
                }
            });
        }
    }

    public final /* synthetic */ void MediaDescriptionCompat() {
        this.IconCompatParcelizer.requestLayout();
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof EditText) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
            layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
            this.r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw.addView(view, layoutParams2);
            this.r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw.setLayoutParams(layoutParams);
            r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            read((EditText) view);
            return;
        }
        super.addView(view, i, layoutParams);
    }

    public void setBoxBackgroundMode(int i) {
        if (i != this.RatingCompat) {
            this.RatingCompat = i;
            if (this.IconCompatParcelizer != null) {
                onSetShuffleMode();
            }
        }
    }

    public final int write() {
        return this.RatingCompat;
    }

    private void onSetShuffleMode() {
        onPlayFromMediaId();
        handleMediaPlayPauseIfPendingOnHandler();
        onCommand();
        MediaSessionCompatResultReceiverWrapper();
        onCustomAction();
        if (this.RatingCompat != 0) {
            r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        setSessionImpl();
    }

    private void onPlayFromMediaId() {
        int i = this.RatingCompat;
        if (i == 0) {
            this.MediaBrowserCompatItemReceiver = null;
            this.onAddQueueItem = null;
            this.handleMediaPlayPauseIfPendingOnHandler = null;
            return;
        }
        if (i == 1) {
            this.MediaBrowserCompatItemReceiver = new frameSizeBytesByTypeNb(this.createFullyDrawnExecutor);
            this.onAddQueueItem = new frameSizeBytesByTypeNb();
            this.handleMediaPlayPauseIfPendingOnHandler = new frameSizeBytesByTypeNb();
        } else {
            if (i == 2) {
                if (this.MediaSessionCompatQueueItem && !(this.MediaBrowserCompatItemReceiver instanceof onChunkData)) {
                    this.MediaBrowserCompatItemReceiver = onChunkData.IconCompatParcelizer(this.createFullyDrawnExecutor);
                } else {
                    this.MediaBrowserCompatItemReceiver = new frameSizeBytesByTypeNb(this.createFullyDrawnExecutor);
                }
                this.onAddQueueItem = null;
                this.handleMediaPlayPauseIfPendingOnHandler = null;
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(this.RatingCompat);
            sb.append(" is illegal; only @BoxBackgroundMode constants are supported.");
            throw new IllegalArgumentException(sb.toString());
        }
    }

    final void handleMediaPlayPauseIfPendingOnHandler() {
        EditText editText = this.IconCompatParcelizer;
        if (editText == null || this.MediaBrowserCompatItemReceiver == null) {
            return;
        }
        if ((this.AudioAttributesImplApi21Parcelizer || editText.getBackground() == null) && this.RatingCompat != 0) {
            ParcelableVolumeInfo();
            this.AudioAttributesImplApi21Parcelizer = true;
        }
    }

    private void ParcelableVolumeInfo() {
        InvalidTypeIdException.read(this.IconCompatParcelizer, onRemoveQueueItemAt());
    }

    private Drawable onRemoveQueueItemAt() {
        EditText editText = this.IconCompatParcelizer;
        if (!(editText instanceof AutoCompleteTextView) || StreamFormatChunk.read(editText)) {
            return this.MediaBrowserCompatItemReceiver;
        }
        int iRemoteActionCompatParcelizer = createExtractors.RemoteActionCompatParcelizer(this.IconCompatParcelizer, calculateNextSearchBytePosition.IconCompatParcelizer.colorControlHighlight);
        int i = this.RatingCompat;
        if (i == 2) {
            return write(getContext(), this.MediaBrowserCompatItemReceiver, iRemoteActionCompatParcelizer, AudioAttributesCompatParcelizer);
        }
        if (i == 1) {
            return read(this.MediaBrowserCompatItemReceiver, this.AudioAttributesImplBaseParcelizer, iRemoteActionCompatParcelizer, AudioAttributesCompatParcelizer);
        }
        return null;
    }

    private static Drawable write(Context context, frameSizeBytesByTypeNb framesizebytesbytypenb, int i, int[][] iArr) {
        int i2 = createExtractors.read(context, calculateNextSearchBytePosition.IconCompatParcelizer.colorSurface, "TextInputLayout");
        frameSizeBytesByTypeNb framesizebytesbytypenb2 = new frameSizeBytesByTypeNb(framesizebytesbytypenb.onPlayFromUri());
        int iWrite = createExtractors.write(i, i2, 0.1f);
        framesizebytesbytypenb2.AudioAttributesImplApi21Parcelizer(new ColorStateList(iArr, new int[]{iWrite, 0}));
        framesizebytesbytypenb2.setTint(i2);
        ColorStateList colorStateList = new ColorStateList(iArr, new int[]{iWrite, i2});
        frameSizeBytesByTypeNb framesizebytesbytypenb3 = new frameSizeBytesByTypeNb(framesizebytesbytypenb.onPlayFromUri());
        framesizebytesbytypenb3.setTint(-1);
        return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, framesizebytesbytypenb2, framesizebytesbytypenb3), framesizebytesbytypenb});
    }

    private static Drawable read(frameSizeBytesByTypeNb framesizebytesbytypenb, int i, int i2, int[][] iArr) {
        return new RippleDrawable(new ColorStateList(iArr, new int[]{createExtractors.write(i2, i, 0.1f), i}), framesizebytesbytypenb, framesizebytesbytypenb);
    }

    private void setSessionImpl() {
        EditText editText = this.IconCompatParcelizer;
        if (editText instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
            if (autoCompleteTextView.getDropDownBackground() == null) {
                int i = this.RatingCompat;
                if (i == 2) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(onRemoveQueueItem());
                } else if (i == 1) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(onRewind());
                }
            }
        }
    }

    private Drawable onRemoveQueueItem() {
        if (this._init_lambda4 == null) {
            this._init_lambda4 = RemoteActionCompatParcelizer(true);
        }
        return this._init_lambda4;
    }

    private Drawable onRewind() {
        if (this.onSetCaptioningEnabled == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.onSetCaptioningEnabled = stateListDrawable;
            stateListDrawable.addState(new int[]{R.attr.state_above_anchor}, onRemoveQueueItem());
            this.onSetCaptioningEnabled.addState(new int[0], RemoteActionCompatParcelizer(false));
        }
        return this.onSetCaptioningEnabled;
    }

    private frameSizeBytesByTypeNb RemoteActionCompatParcelizer(boolean z) {
        float dimensionPixelOffset;
        float dimensionPixelOffset2 = getResources().getDimensionPixelOffset(calculateNextSearchBytePosition.write.mtrl_shape_corner_size_small_component);
        float f = z ? dimensionPixelOffset2 : BitmapDescriptorFactory.HUE_RED;
        EditText editText = this.IconCompatParcelizer;
        if (editText instanceof MaterialAutoCompleteTextView) {
            dimensionPixelOffset = ((MaterialAutoCompleteTextView) editText).RemoteActionCompatParcelizer();
        } else {
            dimensionPixelOffset = getResources().getDimensionPixelOffset(calculateNextSearchBytePosition.write.m3_comp_outlined_autocomplete_menu_container_elevation);
        }
        int dimensionPixelOffset3 = getResources().getDimensionPixelOffset(calculateNextSearchBytePosition.write.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        isValidFrameType isvalidframetypeRemoteActionCompatParcelizer = isValidFrameType.RemoteActionCompatParcelizer().MediaBrowserCompatItemReceiver(f).MediaBrowserCompatCustomActionResultReceiver(f).write(dimensionPixelOffset2).read(dimensionPixelOffset2).RemoteActionCompatParcelizer();
        EditText editText2 = this.IconCompatParcelizer;
        frameSizeBytesByTypeNb framesizebytesbytypenbAudioAttributesCompatParcelizer = frameSizeBytesByTypeNb.AudioAttributesCompatParcelizer(getContext(), dimensionPixelOffset, editText2 instanceof MaterialAutoCompleteTextView ? ((MaterialAutoCompleteTextView) editText2).AudioAttributesCompatParcelizer() : null);
        framesizebytesbytypenbAudioAttributesCompatParcelizer.setShapeAppearanceModel(isvalidframetypeRemoteActionCompatParcelizer);
        framesizebytesbytypenbAudioAttributesCompatParcelizer.write(dimensionPixelOffset3, dimensionPixelOffset3);
        return framesizebytesbytypenbAudioAttributesCompatParcelizer;
    }

    private void MediaSessionCompatResultReceiverWrapper() {
        if (this.RatingCompat == 1) {
            if (SeekMap.RemoteActionCompatParcelizer(getContext())) {
                this.MediaBrowserCompatMediaItem = getResources().getDimensionPixelSize(calculateNextSearchBytePosition.write.material_font_2_0_box_collapsed_padding_top);
            } else if (SeekMap.IconCompatParcelizer(getContext())) {
                this.MediaBrowserCompatMediaItem = getResources().getDimensionPixelSize(calculateNextSearchBytePosition.write.material_font_1_3_box_collapsed_padding_top);
            }
        }
    }

    private void onCustomAction() {
        if (this.IconCompatParcelizer == null || this.RatingCompat != 1) {
            return;
        }
        if (SeekMap.RemoteActionCompatParcelizer(getContext())) {
            EditText editText = this.IconCompatParcelizer;
            InvalidTypeIdException.read(editText, InvalidTypeIdException.onCommand(editText), getResources().getDimensionPixelSize(calculateNextSearchBytePosition.write.material_filled_edittext_font_2_0_padding_top), InvalidTypeIdException.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(this.IconCompatParcelizer), getResources().getDimensionPixelSize(calculateNextSearchBytePosition.write.material_filled_edittext_font_2_0_padding_bottom));
        } else if (SeekMap.IconCompatParcelizer(getContext())) {
            EditText editText2 = this.IconCompatParcelizer;
            InvalidTypeIdException.read(editText2, InvalidTypeIdException.onCommand(editText2), getResources().getDimensionPixelSize(calculateNextSearchBytePosition.write.material_filled_edittext_font_1_3_padding_top), InvalidTypeIdException.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(this.IconCompatParcelizer), getResources().getDimensionPixelSize(calculateNextSearchBytePosition.write.material_filled_edittext_font_1_3_padding_bottom));
        }
    }

    public void setBoxCollapsedPaddingTop(int i) {
        this.MediaBrowserCompatMediaItem = i;
    }

    public void setBoxStrokeWidthResource(int i) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i));
    }

    public void setBoxStrokeWidth(int i) {
        this.MediaBrowserCompatSearchResultReceiver = i;
        onCommand();
    }

    public void setBoxStrokeWidthFocusedResource(int i) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i));
    }

    public void setBoxStrokeWidthFocused(int i) {
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = i;
        onCommand();
    }

    public void setBoxStrokeColor(int i) {
        if (this.onStop != i) {
            this.onStop = i;
            onCommand();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.onRemoveQueueItem = colorStateList.getDefaultColor();
            this.onRemoveQueueItemAt = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.MediaSessionCompatToken = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            this.onStop = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        } else if (this.onStop != colorStateList.getDefaultColor()) {
            this.onStop = colorStateList.getDefaultColor();
        }
        onCommand();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.getSavedStateRegistryControllerannotations != colorStateList) {
            this.getSavedStateRegistryControllerannotations = colorStateList;
            onCommand();
        }
    }

    public void setBoxBackgroundColorResource(int i) {
        setBoxBackgroundColor(_isNaN.getColor(getContext(), i));
    }

    public void setBoxBackgroundColor(int i) {
        if (this.AudioAttributesImplBaseParcelizer != i) {
            this.AudioAttributesImplBaseParcelizer = i;
            this.onPrepareFromMediaId = i;
            this.onSetPlaybackSpeed = i;
            this.MediaSessionCompatResultReceiverWrapper = i;
            onPlay();
        }
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.onPrepareFromMediaId = defaultColor;
        this.AudioAttributesImplBaseParcelizer = defaultColor;
        this.onPrepareFromUri = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.onSetPlaybackSpeed = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        this.MediaSessionCompatResultReceiverWrapper = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
        onPlay();
    }

    public void setShapeAppearanceModel(isValidFrameType isvalidframetype) {
        frameSizeBytesByTypeNb framesizebytesbytypenb = this.MediaBrowserCompatItemReceiver;
        if (framesizebytesbytypenb == null || framesizebytesbytypenb.onPlayFromUri() == isvalidframetype) {
            return;
        }
        this.createFullyDrawnExecutor = isvalidframetype;
        onPlay();
    }

    public void setBoxCornerFamily(int i) {
        this.createFullyDrawnExecutor = this.createFullyDrawnExecutor.MediaDescriptionCompat().IconCompatParcelizer(i, this.createFullyDrawnExecutor.MediaBrowserCompatSearchResultReceiver()).AudioAttributesCompatParcelizer(i, this.createFullyDrawnExecutor.MediaMetadataCompat()).write(i, this.createFullyDrawnExecutor.read()).read(i, this.createFullyDrawnExecutor.MediaBrowserCompatItemReceiver()).RemoteActionCompatParcelizer();
        onPlay();
    }

    public void setBoxCornerRadiiResources(int i, int i2, int i3, int i4) {
        setBoxCornerRadii(getContext().getResources().getDimension(i), getContext().getResources().getDimension(i2), getContext().getResources().getDimension(i4), getContext().getResources().getDimension(i3));
    }

    public void setBoxCornerRadii(float f, float f2, float f3, float f4) {
        boolean zAudioAttributesImplBaseParcelizer = checkAndPeekStreamMarker.AudioAttributesImplBaseParcelizer(this);
        this.MediaBrowserCompatCustomActionResultReceiver = zAudioAttributesImplBaseParcelizer;
        float f5 = zAudioAttributesImplBaseParcelizer ? f2 : f;
        if (!zAudioAttributesImplBaseParcelizer) {
            f = f2;
        }
        float f6 = zAudioAttributesImplBaseParcelizer ? f4 : f3;
        if (!zAudioAttributesImplBaseParcelizer) {
            f3 = f4;
        }
        frameSizeBytesByTypeNb framesizebytesbytypenb = this.MediaBrowserCompatItemReceiver;
        if (framesizebytesbytypenb != null && framesizebytesbytypenb.onRemoveQueueItemAt() == f5 && this.MediaBrowserCompatItemReceiver.onRewind() == f && this.MediaBrowserCompatItemReceiver.onMediaButtonEvent() == f6 && this.MediaBrowserCompatItemReceiver.onFastForward() == f3) {
            return;
        }
        this.createFullyDrawnExecutor = this.createFullyDrawnExecutor.MediaDescriptionCompat().MediaBrowserCompatItemReceiver(f5).MediaBrowserCompatCustomActionResultReceiver(f).write(f6).read(f3).RemoteActionCompatParcelizer();
        onPlay();
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.addOnNewIntentListener) {
            this.addOnNewIntentListener = typeface;
            this.RemoteActionCompatParcelizer.read(typeface);
            this.PlaybackStateCompatCustomAction.IconCompatParcelizer(typeface);
            TextView textView = this.onPrepareFromSearch;
            if (textView != null) {
                textView.setTypeface(typeface);
            }
        }
    }

    public void setLengthCounter(write writeVar) {
        this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = writeVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        EditText editText = this.IconCompatParcelizer;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            return;
        }
        if (this._init_lambda3 != null) {
            boolean z = this.r8lambdaKUbBm7ckfqTc9QCgukC86fguu4;
            this.r8lambdaKUbBm7ckfqTc9QCgukC86fguu4 = false;
            CharSequence hint = editText.getHint();
            this.IconCompatParcelizer.setHint(this._init_lambda3);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i);
                return;
            } finally {
                this.IconCompatParcelizer.setHint(hint);
                this.r8lambdaKUbBm7ckfqTc9QCgukC86fguu4 = z;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i);
        onProvideAutofillVirtualStructure(viewStructure, i);
        viewStructure.setChildCount(this.r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw.getChildCount());
        for (int i2 = 0; i2 < this.r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw.getChildCount(); i2++) {
            View childAt = this.r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw.getChildAt(i2);
            ViewStructure viewStructureNewChild = viewStructure.newChild(i2);
            childAt.dispatchProvideAutofillStructure(viewStructureNewChild, i);
            if (childAt == this.IconCompatParcelizer) {
                viewStructureNewChild.setHint(AudioAttributesImplApi21Parcelizer());
            }
        }
    }

    private void read(EditText editText) {
        if (this.IconCompatParcelizer != null) {
            throw new IllegalArgumentException("We already have an EditText, can only have one");
        }
        PlaybackStateCompatCustomAction();
        this.IconCompatParcelizer = editText;
        int i = this.r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0;
        if (i != -1) {
            setMinEms(i);
        } else {
            setMinWidth(this.r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8);
        }
        int i2 = this.ResultReceiver;
        if (i2 != -1) {
            setMaxEms(i2);
        } else {
            setMaxWidth(this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28);
        }
        this.AudioAttributesImplApi21Parcelizer = false;
        onSetShuffleMode();
        setTextInputAccessibilityDelegate(new AudioAttributesCompatParcelizer(this));
        this.RemoteActionCompatParcelizer.read(this.IconCompatParcelizer.getTypeface());
        this.RemoteActionCompatParcelizer.IconCompatParcelizer(this.IconCompatParcelizer.getTextSize());
        this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(this.IconCompatParcelizer.getLetterSpacing());
        int gravity = this.IconCompatParcelizer.getGravity();
        this.RemoteActionCompatParcelizer.read((gravity & (-113)) | 48);
        this.RemoteActionCompatParcelizer.IconCompatParcelizer(gravity);
        this.IconCompatParcelizer.addTextChangedListener(new TextWatcher() { // from class: com.google.android.material.textfield.TextInputLayout.3
            @Override // android.text.TextWatcher
            public final void beforeTextChanged(CharSequence charSequence, int i3, int i4, int i5) {
            }

            @Override // android.text.TextWatcher
            public final void onTextChanged(CharSequence charSequence, int i3, int i4, int i5) {
            }

            @Override // android.text.TextWatcher
            public final void afterTextChanged(Editable editable) {
                TextInputLayout.this.write(!r0.accessonBackPresseds1027565324);
                if (TextInputLayout.this.write) {
                    TextInputLayout.this.IconCompatParcelizer(editable);
                }
                if (TextInputLayout.this._init_lambda5) {
                    TextInputLayout.this.write(editable);
                }
            }
        });
        if (this.onPrepare == null) {
            this.onPrepare = this.IconCompatParcelizer.getHintTextColors();
        }
        if (this.MediaSessionCompatQueueItem) {
            if (TextUtils.isEmpty(this.setSessionImpl)) {
                CharSequence hint = this.IconCompatParcelizer.getHint();
                this._init_lambda3 = hint;
                setHint(hint);
                this.IconCompatParcelizer.setHint((CharSequence) null);
            }
            this.r8lambdaKUbBm7ckfqTc9QCgukC86fguu4 = true;
        }
        MediaSessionCompatQueueItem();
        if (this.onPrepareFromSearch != null) {
            IconCompatParcelizer(this.IconCompatParcelizer.getText());
        }
        onAddQueueItem();
        this.PlaybackStateCompatCustomAction.write();
        this.menuHostHelperlambda0.bringToFront();
        this.onSetShuffleMode.bringToFront();
        onPrepareFromUri();
        this.onSetShuffleMode.MediaMetadataCompat();
        if (!isEnabled()) {
            editText.setEnabled(false);
        }
        read(false, true);
    }

    private void r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM() {
        if (this.RatingCompat != 1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw.getLayoutParams();
            int iOnFastForward = onFastForward();
            if (iOnFastForward != ((ViewGroup.MarginLayoutParams) layoutParams).topMargin) {
                ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = iOnFastForward;
                this.r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw.requestLayout();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.IconCompatParcelizer;
        if (editText != null) {
            return editText.getBaseline() + getPaddingTop() + onFastForward();
        }
        return super.getBaseline();
    }

    public final void write(boolean z) {
        read(z, false);
    }

    private void read(boolean z, boolean z2) {
        ColorStateList colorStateList;
        TextView textView;
        int colorForState;
        boolean zIsEnabled = isEnabled();
        EditText editText = this.IconCompatParcelizer;
        boolean z3 = false;
        boolean z4 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.IconCompatParcelizer;
        if (editText2 != null && editText2.hasFocus()) {
            z3 = true;
        }
        ColorStateList colorStateList2 = this.onPrepare;
        if (colorStateList2 != null) {
            this.RemoteActionCompatParcelizer.IconCompatParcelizer(colorStateList2);
        }
        if (!zIsEnabled) {
            ColorStateList colorStateList3 = this.onPrepare;
            if (colorStateList3 != null) {
                colorForState = colorStateList3.getColorForState(new int[]{-16842910}, this.onRemoveQueueItemAt);
            } else {
                colorForState = this.onRemoveQueueItemAt;
            }
            this.RemoteActionCompatParcelizer.IconCompatParcelizer(ColorStateList.valueOf(colorForState));
        } else if (MediaBrowserCompatMediaItem()) {
            this.RemoteActionCompatParcelizer.IconCompatParcelizer(this.PlaybackStateCompatCustomAction.AudioAttributesCompatParcelizer());
        } else if (this.onPlay && (textView = this.onPrepareFromSearch) != null) {
            this.RemoteActionCompatParcelizer.IconCompatParcelizer(textView.getTextColors());
        } else if (z3 && (colorStateList = this.onSkipToQueueItem) != null) {
            this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(colorStateList);
        }
        if (z4 || !this.onSetRepeatMode || (isEnabled() && z3)) {
            if (z2 || this.ParcelableVolumeInfo) {
                AudioAttributesCompatParcelizer(z);
                return;
            }
            return;
        }
        if (z2 || !this.ParcelableVolumeInfo) {
            read(z);
        }
    }

    public final EditText AudioAttributesCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public void setMinEms(int i) {
        this.r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0 = i;
        EditText editText = this.IconCompatParcelizer;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMinEms(i);
    }

    public void setMaxEms(int i) {
        this.ResultReceiver = i;
        EditText editText = this.IconCompatParcelizer;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMaxEms(i);
    }

    public void setMinWidth(int i) {
        this.r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8 = i;
        EditText editText = this.IconCompatParcelizer;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMinWidth(i);
    }

    public void setMinWidthResource(int i) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    public void setMaxWidth(int i) {
        this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = i;
        EditText editText = this.IconCompatParcelizer;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMaxWidth(i);
    }

    public void setMaxWidthResource(int i) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    public void setHint(CharSequence charSequence) {
        if (this.MediaSessionCompatQueueItem) {
            AudioAttributesCompatParcelizer(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHint(int i) {
        setHint(i != 0 ? getResources().getText(i) : null);
    }

    private void AudioAttributesCompatParcelizer(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.setSessionImpl)) {
            return;
        }
        this.setSessionImpl = charSequence;
        this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(charSequence);
        if (this.ParcelableVolumeInfo) {
            return;
        }
        onSetPlaybackSpeed();
    }

    public final CharSequence AudioAttributesImplApi21Parcelizer() {
        if (this.MediaSessionCompatQueueItem) {
            return this.setSessionImpl;
        }
        return null;
    }

    public void setHintEnabled(boolean z) {
        if (z != this.MediaSessionCompatQueueItem) {
            this.MediaSessionCompatQueueItem = z;
            if (!z) {
                this.r8lambdaKUbBm7ckfqTc9QCgukC86fguu4 = false;
                if (!TextUtils.isEmpty(this.setSessionImpl) && TextUtils.isEmpty(this.IconCompatParcelizer.getHint())) {
                    this.IconCompatParcelizer.setHint(this.setSessionImpl);
                }
                AudioAttributesCompatParcelizer((CharSequence) null);
            } else {
                CharSequence hint = this.IconCompatParcelizer.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.setSessionImpl)) {
                        setHint(hint);
                    }
                    this.IconCompatParcelizer.setHint((CharSequence) null);
                }
                this.r8lambdaKUbBm7ckfqTc9QCgukC86fguu4 = true;
            }
            if (this.IconCompatParcelizer != null) {
                r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            }
        }
    }

    public final boolean RatingCompat() {
        return this.r8lambdaKUbBm7ckfqTc9QCgukC86fguu4;
    }

    public void setHintTextAppearance(int i) {
        this.RemoteActionCompatParcelizer.write(i);
        this.onSkipToQueueItem = this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer();
        if (this.IconCompatParcelizer != null) {
            write(false);
            r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.onSkipToQueueItem != colorStateList) {
            if (this.onPrepare == null) {
                this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(colorStateList);
            }
            this.onSkipToQueueItem = colorStateList;
            if (this.IconCompatParcelizer != null) {
                write(false);
            }
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.onPrepare = colorStateList;
        this.onSkipToQueueItem = colorStateList;
        if (this.IconCompatParcelizer != null) {
            write(false);
        }
    }

    public void setErrorEnabled(boolean z) {
        this.PlaybackStateCompatCustomAction.read(z);
    }

    public void setErrorTextAppearance(int i) {
        this.PlaybackStateCompatCustomAction.AudioAttributesCompatParcelizer(i);
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        this.PlaybackStateCompatCustomAction.write(colorStateList);
    }

    public final int MediaBrowserCompatItemReceiver() {
        return this.PlaybackStateCompatCustomAction.IconCompatParcelizer();
    }

    public void setHelperTextTextAppearance(int i) {
        this.PlaybackStateCompatCustomAction.write(i);
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        this.PlaybackStateCompatCustomAction.RemoteActionCompatParcelizer(colorStateList);
    }

    public final boolean MediaBrowserCompatCustomActionResultReceiver() {
        return this.PlaybackStateCompatCustomAction.AudioAttributesImplBaseParcelizer();
    }

    public void setHelperTextEnabled(boolean z) {
        this.PlaybackStateCompatCustomAction.IconCompatParcelizer(z);
    }

    public void setHelperText(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            if (accessgetReportFullyDrawnExecutorp()) {
                setHelperTextEnabled(false);
            }
        } else {
            if (!accessgetReportFullyDrawnExecutorp()) {
                setHelperTextEnabled(true);
            }
            this.PlaybackStateCompatCustomAction.write(charSequence);
        }
    }

    private boolean accessgetReportFullyDrawnExecutorp() {
        return this.PlaybackStateCompatCustomAction.MediaBrowserCompatCustomActionResultReceiver();
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        this.PlaybackStateCompatCustomAction.read(charSequence);
    }

    public void setErrorAccessibilityLiveRegion(int i) {
        this.PlaybackStateCompatCustomAction.IconCompatParcelizer(i);
    }

    public void setError(CharSequence charSequence) {
        if (!this.PlaybackStateCompatCustomAction.AudioAttributesImplBaseParcelizer()) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                setErrorEnabled(true);
            }
        }
        if (!TextUtils.isEmpty(charSequence)) {
            this.PlaybackStateCompatCustomAction.IconCompatParcelizer(charSequence);
        } else {
            this.PlaybackStateCompatCustomAction.MediaBrowserCompatItemReceiver();
        }
    }

    public void setErrorIconDrawable(int i) {
        this.onSetShuffleMode.IconCompatParcelizer(i);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.onSetShuffleMode.read(drawable);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        this.onSetShuffleMode.IconCompatParcelizer(colorStateList);
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        this.onSetShuffleMode.IconCompatParcelizer(mode);
    }

    public void setCounterEnabled(boolean z) {
        if (this.write != z) {
            if (z) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
                this.onPrepareFromSearch = appCompatTextView;
                appCompatTextView.setId(calculateNextSearchBytePosition.AudioAttributesImplApi26Parcelizer.textinput_counter);
                Typeface typeface = this.addOnNewIntentListener;
                if (typeface != null) {
                    this.onPrepareFromSearch.setTypeface(typeface);
                }
                this.onPrepareFromSearch.setMaxLines(1);
                this.PlaybackStateCompatCustomAction.AudioAttributesCompatParcelizer(this.onPrepareFromSearch, 2);
                mapArray.AudioAttributesCompatParcelizer((ViewGroup.MarginLayoutParams) this.onPrepareFromSearch.getLayoutParams(), getResources().getDimensionPixelOffset(calculateNextSearchBytePosition.write.mtrl_textinput_counter_margin_start));
                MediaSessionCompatToken();
                PlaybackStateCompat();
            } else {
                this.PlaybackStateCompatCustomAction.IconCompatParcelizer(this.onPrepareFromSearch, 2);
                this.onPrepareFromSearch = null;
            }
            this.write = z;
        }
    }

    public void setCounterTextAppearance(int i) {
        if (this.onPause != i) {
            this.onPause = i;
            MediaSessionCompatToken();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.onPlayFromMediaId != colorStateList) {
            this.onPlayFromMediaId = colorStateList;
            MediaSessionCompatToken();
        }
    }

    public void setCounterOverflowTextAppearance(int i) {
        if (this.onMediaButtonEvent != i) {
            this.onMediaButtonEvent = i;
            MediaSessionCompatToken();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.onFastForward != colorStateList) {
            this.onFastForward = colorStateList;
            MediaSessionCompatToken();
        }
    }

    public void setCounterMaxLength(int i) {
        if (this.onCommand != i) {
            if (i > 0) {
                this.onCommand = i;
            } else {
                this.onCommand = -1;
            }
            if (this.write) {
                PlaybackStateCompat();
            }
        }
    }

    private void PlaybackStateCompat() {
        if (this.onPrepareFromSearch != null) {
            EditText editText = this.IconCompatParcelizer;
            IconCompatParcelizer(editText == null ? null : editText.getText());
        }
    }

    final void IconCompatParcelizer(Editable editable) {
        int i = this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM.read(editable);
        boolean z = this.onPlay;
        int i2 = this.onCommand;
        if (i2 == -1) {
            this.onPrepareFromSearch.setText(String.valueOf(i));
            this.onPrepareFromSearch.setContentDescription(null);
            this.onPlay = false;
        } else {
            this.onPlay = i > i2;
            RemoteActionCompatParcelizer(getContext(), this.onPrepareFromSearch, i, this.onCommand, this.onPlay);
            if (z != this.onPlay) {
                MediaSessionCompatToken();
            }
            this.onPrepareFromSearch.setText(_createUsingDelegate.IconCompatParcelizer().RemoteActionCompatParcelizer(getContext().getString(calculateNextSearchBytePosition.MediaBrowserCompatSearchResultReceiver.character_counter_pattern, Integer.valueOf(i), Integer.valueOf(this.onCommand))));
        }
        if (this.IconCompatParcelizer == null || z == this.onPlay) {
            return;
        }
        write(false);
        onCommand();
        onAddQueueItem();
    }

    private static void RemoteActionCompatParcelizer(Context context, TextView textView, int i, int i2, boolean z) {
        int i3;
        if (z) {
            i3 = calculateNextSearchBytePosition.MediaBrowserCompatSearchResultReceiver.character_counter_overflowed_content_description;
        } else {
            i3 = calculateNextSearchBytePosition.MediaBrowserCompatSearchResultReceiver.character_counter_content_description;
        }
        textView.setContentDescription(context.getString(i3, Integer.valueOf(i), Integer.valueOf(i2)));
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (this.addObserverForBackInvokerlambda7 == null) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
            this.addObserverForBackInvokerlambda7 = appCompatTextView;
            appCompatTextView.setId(calculateNextSearchBytePosition.AudioAttributesImplApi26Parcelizer.textinput_placeholder);
            InvalidTypeIdException.AudioAttributesImplBaseParcelizer(this.addObserverForBackInvokerlambda7, 2);
            Fade fadeOnPlayFromUri = onPlayFromUri();
            this.accessaddObserverForBackInvoker = fadeOnPlayFromUri;
            fadeOnPlayFromUri.read(67L);
            this.accessgetReportFullyDrawnExecutorp = onPlayFromUri();
            setPlaceholderTextAppearance(this.addObserverForBackInvoker);
            setPlaceholderTextColor(this.ensureViewModelStore);
        }
        if (TextUtils.isEmpty(charSequence)) {
            IconCompatParcelizer(false);
        } else {
            if (!this._init_lambda5) {
                IconCompatParcelizer(true);
            }
            this.accessensureViewModelStore = charSequence;
        }
        ResultReceiver();
    }

    public final CharSequence AudioAttributesImplApi26Parcelizer() {
        if (this._init_lambda5) {
            return this.accessensureViewModelStore;
        }
        return null;
    }

    private void IconCompatParcelizer(boolean z) {
        if (this._init_lambda5 == z) {
            return;
        }
        if (z) {
            MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
        } else {
            onStop();
            this.addObserverForBackInvokerlambda7 = null;
        }
        this._init_lambda5 = z;
    }

    private Fade onPlayFromUri() {
        Fade fade = new Fade();
        fade.RemoteActionCompatParcelizer(getSampleRateLookupKey.write(getContext(), calculateNextSearchBytePosition.IconCompatParcelizer.motionDurationShort2, 87));
        fade.write(getSampleRateLookupKey.read(getContext(), calculateNextSearchBytePosition.IconCompatParcelizer.motionEasingLinearInterpolator, BinarySearchSeekerSeekOperationParams.write));
        return fade;
    }

    private void ResultReceiver() {
        EditText editText = this.IconCompatParcelizer;
        write(editText == null ? null : editText.getText());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void write(Editable editable) {
        if (this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM.read(editable) == 0 && !this.ParcelableVolumeInfo) {
            onSkipToPrevious();
        } else {
            onSeekTo();
        }
    }

    private void onSkipToPrevious() {
        if (this.addObserverForBackInvokerlambda7 == null || !this._init_lambda5 || TextUtils.isEmpty(this.accessensureViewModelStore)) {
            return;
        }
        this.addObserverForBackInvokerlambda7.setText(this.accessensureViewModelStore);
        reportWithProductId.RemoteActionCompatParcelizer(this.r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw, this.accessaddObserverForBackInvoker);
        this.addObserverForBackInvokerlambda7.setVisibility(0);
        this.addObserverForBackInvokerlambda7.bringToFront();
        announceForAccessibility(this.accessensureViewModelStore);
    }

    private void onSeekTo() {
        TextView textView = this.addObserverForBackInvokerlambda7;
        if (textView == null || !this._init_lambda5) {
            return;
        }
        textView.setText((CharSequence) null);
        reportWithProductId.RemoteActionCompatParcelizer(this.r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw, this.accessgetReportFullyDrawnExecutorp);
        this.addObserverForBackInvokerlambda7.setVisibility(4);
    }

    private void MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        TextView textView = this.addObserverForBackInvokerlambda7;
        if (textView != null) {
            this.r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw.addView(textView);
            this.addObserverForBackInvokerlambda7.setVisibility(0);
        }
    }

    private void onStop() {
        TextView textView = this.addObserverForBackInvokerlambda7;
        if (textView != null) {
            textView.setVisibility(8);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.ensureViewModelStore != colorStateList) {
            this.ensureViewModelStore = colorStateList;
            TextView textView = this.addObserverForBackInvokerlambda7;
            if (textView == null || colorStateList == null) {
                return;
            }
            textView.setTextColor(colorStateList);
        }
    }

    public void setPlaceholderTextAppearance(int i) {
        this.addObserverForBackInvoker = i;
        TextView textView = this.addObserverForBackInvokerlambda7;
        if (textView != null) {
            _addSuperTypes.RemoteActionCompatParcelizer(textView, i);
        }
    }

    public void setCursorColor(ColorStateList colorStateList) {
        if (this.onPlayFromUri != colorStateList) {
            this.onPlayFromUri = colorStateList;
            MediaSessionCompatQueueItem();
        }
    }

    public void setCursorErrorColor(ColorStateList colorStateList) {
        if (this.onPlayFromSearch != colorStateList) {
            this.onPlayFromSearch = colorStateList;
            if (onSetCaptioningEnabled()) {
                MediaSessionCompatQueueItem();
            }
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        this.menuHostHelperlambda0.AudioAttributesCompatParcelizer(charSequence);
    }

    private CharSequence r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8() {
        return this.menuHostHelperlambda0.read();
    }

    private TextView _init_lambda3() {
        return this.menuHostHelperlambda0.write();
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.menuHostHelperlambda0.IconCompatParcelizer(colorStateList);
    }

    public void setPrefixTextAppearance(int i) {
        this.menuHostHelperlambda0.AudioAttributesCompatParcelizer(i);
    }

    public void setSuffixText(CharSequence charSequence) {
        this.onSetShuffleMode.RemoteActionCompatParcelizer(charSequence);
    }

    private CharSequence _init_lambda2() {
        return this.onSetShuffleMode.AudioAttributesImplApi26Parcelizer();
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.onSetShuffleMode.write(colorStateList);
    }

    public void setSuffixTextAppearance(int i) {
        this.onSetShuffleMode.AudioAttributesImplApi26Parcelizer(i);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        read(this, z);
        super.setEnabled(z);
    }

    private static void read(ViewGroup viewGroup, boolean z) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            childAt.setEnabled(z);
            if (childAt instanceof ViewGroup) {
                read((ViewGroup) childAt, z);
            }
        }
    }

    public final int IconCompatParcelizer() {
        return this.onCommand;
    }

    final CharSequence RemoteActionCompatParcelizer() {
        TextView textView;
        if (this.write && this.onPlay && (textView = this.onPrepareFromSearch) != null) {
            return textView.getContentDescription();
        }
        return null;
    }

    private void MediaSessionCompatToken() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        TextView textView = this.onPrepareFromSearch;
        if (textView != null) {
            IconCompatParcelizer(textView, this.onPlay ? this.onMediaButtonEvent : this.onPause);
            if (!this.onPlay && (colorStateList2 = this.onPlayFromMediaId) != null) {
                this.onPrepareFromSearch.setTextColor(colorStateList2);
            }
            if (!this.onPlay || (colorStateList = this.onFastForward) == null) {
                return;
            }
            this.onPrepareFromSearch.setTextColor(colorStateList);
        }
    }

    public final void IconCompatParcelizer(TextView textView, int i) {
        try {
            _addSuperTypes.RemoteActionCompatParcelizer(textView, i);
            if (textView.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        _addSuperTypes.RemoteActionCompatParcelizer(textView, calculateNextSearchBytePosition.MediaBrowserCompatMediaItem.TextAppearance_AppCompat_Caption);
        textView.setTextColor(_isNaN.getColor(getContext(), calculateNextSearchBytePosition.read.design_error));
    }

    private int onFastForward() {
        float f;
        if (!this.MediaSessionCompatQueueItem) {
            return 0;
        }
        int i = this.RatingCompat;
        if (i == 0) {
            f = this.RemoteActionCompatParcelizer.read();
        } else {
            if (i != 2) {
                return 0;
            }
            f = this.RemoteActionCompatParcelizer.read() / 2.0f;
        }
        return (int) f;
    }

    private Rect RemoteActionCompatParcelizer(Rect rect) {
        if (this.IconCompatParcelizer == null) {
            throw new IllegalStateException();
        }
        Rect rect2 = this.getOnBackPressedDispatcherannotations;
        boolean zAudioAttributesImplBaseParcelizer = checkAndPeekStreamMarker.AudioAttributesImplBaseParcelizer(this);
        rect2.bottom = rect.bottom;
        int i = this.RatingCompat;
        if (i == 1) {
            rect2.left = read(rect.left, zAudioAttributesImplBaseParcelizer);
            rect2.top = rect.top + this.MediaBrowserCompatMediaItem;
            rect2.right = write(rect.right, zAudioAttributesImplBaseParcelizer);
            return rect2;
        }
        if (i == 2) {
            rect2.left = rect.left + this.IconCompatParcelizer.getPaddingLeft();
            rect2.top = rect.top - onFastForward();
            rect2.right = rect.right - this.IconCompatParcelizer.getPaddingRight();
            return rect2;
        }
        rect2.left = read(rect.left, zAudioAttributesImplBaseParcelizer);
        rect2.top = getPaddingTop();
        rect2.right = write(rect.right, zAudioAttributesImplBaseParcelizer);
        return rect2;
    }

    private int read(int i, boolean z) {
        int compoundPaddingLeft;
        if (!z && r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8() != null) {
            compoundPaddingLeft = this.menuHostHelperlambda0.RemoteActionCompatParcelizer();
        } else if (z && _init_lambda2() != null) {
            compoundPaddingLeft = this.onSetShuffleMode.MediaBrowserCompatItemReceiver();
        } else {
            compoundPaddingLeft = this.IconCompatParcelizer.getCompoundPaddingLeft();
        }
        return i + compoundPaddingLeft;
    }

    private int write(int i, boolean z) {
        int compoundPaddingRight;
        if (!z && _init_lambda2() != null) {
            compoundPaddingRight = this.onSetShuffleMode.MediaBrowserCompatItemReceiver();
        } else if (z && r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8() != null) {
            compoundPaddingRight = this.menuHostHelperlambda0.RemoteActionCompatParcelizer();
        } else {
            compoundPaddingRight = this.IconCompatParcelizer.getCompoundPaddingRight();
        }
        return i - compoundPaddingRight;
    }

    private Rect write(Rect rect) {
        if (this.IconCompatParcelizer == null) {
            throw new IllegalStateException();
        }
        Rect rect2 = this.getOnBackPressedDispatcherannotations;
        float fWrite = this.RemoteActionCompatParcelizer.write();
        rect2.left = rect.left + this.IconCompatParcelizer.getCompoundPaddingLeft();
        rect2.top = read(rect, fWrite);
        rect2.right = rect.right - this.IconCompatParcelizer.getCompoundPaddingRight();
        rect2.bottom = write(rect, rect2, fWrite);
        return rect2;
    }

    private int read(Rect rect, float f) {
        if (onSetRating()) {
            return (int) (rect.centerY() - (f / 2.0f));
        }
        return rect.top + this.IconCompatParcelizer.getCompoundPaddingTop();
    }

    private int write(Rect rect, Rect rect2, float f) {
        if (onSetRating()) {
            return (int) (rect2.top + f);
        }
        return rect.bottom - this.IconCompatParcelizer.getCompoundPaddingBottom();
    }

    private boolean onSetRating() {
        return this.RatingCompat == 1 && this.IconCompatParcelizer.getMinLines() <= 1;
    }

    private int onPause() {
        return this.RatingCompat == 1 ? createExtractors.read(createExtractors.AudioAttributesCompatParcelizer(this, calculateNextSearchBytePosition.IconCompatParcelizer.colorSurface), this.AudioAttributesImplBaseParcelizer) : this.AudioAttributesImplBaseParcelizer;
    }

    private void onPlay() {
        frameSizeBytesByTypeNb framesizebytesbytypenb = this.MediaBrowserCompatItemReceiver;
        if (framesizebytesbytypenb == null) {
            return;
        }
        isValidFrameType isvalidframetypeOnPlayFromUri = framesizebytesbytypenb.onPlayFromUri();
        isValidFrameType isvalidframetype = this.createFullyDrawnExecutor;
        if (isvalidframetypeOnPlayFromUri != isvalidframetype) {
            this.MediaBrowserCompatItemReceiver.setShapeAppearanceModel(isvalidframetype);
        }
        if (onPrepareFromSearch()) {
            this.MediaBrowserCompatItemReceiver.IconCompatParcelizer(this.onCustomAction, this.MediaDescriptionCompat);
        }
        int iOnPause = onPause();
        this.AudioAttributesImplBaseParcelizer = iOnPause;
        this.MediaBrowserCompatItemReceiver.AudioAttributesImplApi21Parcelizer(ColorStateList.valueOf(iOnPause));
        onMediaButtonEvent();
        handleMediaPlayPauseIfPendingOnHandler();
    }

    private void onMediaButtonEvent() {
        ColorStateList colorStateListValueOf;
        if (this.onAddQueueItem == null || this.handleMediaPlayPauseIfPendingOnHandler == null) {
            return;
        }
        if (onPrepareFromMediaId()) {
            frameSizeBytesByTypeNb framesizebytesbytypenb = this.onAddQueueItem;
            if (this.IconCompatParcelizer.isFocused()) {
                colorStateListValueOf = ColorStateList.valueOf(this.onRemoveQueueItem);
            } else {
                colorStateListValueOf = ColorStateList.valueOf(this.MediaDescriptionCompat);
            }
            framesizebytesbytypenb.AudioAttributesImplApi21Parcelizer(colorStateListValueOf);
            this.handleMediaPlayPauseIfPendingOnHandler.AudioAttributesImplApi21Parcelizer(ColorStateList.valueOf(this.MediaDescriptionCompat));
        }
        invalidate();
    }

    private boolean onPrepareFromSearch() {
        return this.RatingCompat == 2 && onPrepareFromMediaId();
    }

    private boolean onPrepareFromMediaId() {
        return this.onCustomAction >= 0 && this.MediaDescriptionCompat != 0;
    }

    public final void onAddQueueItem() {
        Drawable background;
        TextView textView;
        EditText editText = this.IconCompatParcelizer;
        if (editText == null || this.RatingCompat != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        IntentSenderRequest.write();
        Drawable drawableMutate = background.mutate();
        if (MediaBrowserCompatMediaItem()) {
            drawableMutate.setColorFilter(startIntentSenderForResult.IconCompatParcelizer(MediaBrowserCompatItemReceiver(), PorterDuff.Mode.SRC_IN));
        } else if (this.onPlay && (textView = this.onPrepareFromSearch) != null) {
            drawableMutate.setColorFilter(startIntentSenderForResult.IconCompatParcelizer(textView.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        } else {
            findFormatOverrides.IconCompatParcelizer(drawableMutate);
            this.IconCompatParcelizer.refreshDrawableState();
        }
    }

    public final boolean MediaBrowserCompatMediaItem() {
        return this.PlaybackStateCompatCustomAction.read();
    }

    static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: com.google.android.material.textfield.TextInputLayout.SavedState.2
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return AudioAttributesCompatParcelizer(parcel);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final /* synthetic */ SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return IconCompatParcelizer(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ Object[] newArray(int i) {
                return RemoteActionCompatParcelizer(i);
            }

            private static SavedState IconCompatParcelizer(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            private static SavedState AudioAttributesCompatParcelizer(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            private static SavedState[] RemoteActionCompatParcelizer(int i) {
                return new SavedState[i];
            }
        };
        boolean IconCompatParcelizer;
        CharSequence RemoteActionCompatParcelizer;

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.RemoteActionCompatParcelizer = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.IconCompatParcelizer = parcel.readInt() == 1;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            TextUtils.writeToParcel(this.RemoteActionCompatParcelizer, parcel, i);
            parcel.writeInt(this.IconCompatParcelizer ? 1 : 0);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("TextInputLayout.SavedState{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" error=");
            sb.append((Object) this.RemoteActionCompatParcelizer);
            sb.append("}");
            return sb.toString();
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        if (MediaBrowserCompatMediaItem()) {
            savedState.RemoteActionCompatParcelizer = AudioAttributesImplBaseParcelizer();
        }
        savedState.IconCompatParcelizer = this.onSetShuffleMode.MediaBrowserCompatCustomActionResultReceiver();
        return savedState;
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.read());
        setError(savedState.RemoteActionCompatParcelizer);
        if (savedState.IconCompatParcelizer) {
            post(new Runnable() { // from class: com.google.android.material.textfield.TextInputLayout.1
                @Override // java.lang.Runnable
                public final void run() {
                    TextInputLayout.this.onSetShuffleMode.read();
                }
            });
        }
        requestLayout();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        this.accessonBackPresseds1027565324 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.accessonBackPresseds1027565324 = false;
    }

    public final CharSequence AudioAttributesImplBaseParcelizer() {
        if (this.PlaybackStateCompatCustomAction.AudioAttributesImplBaseParcelizer()) {
            return this.PlaybackStateCompatCustomAction.RemoteActionCompatParcelizer();
        }
        return null;
    }

    public void setHintAnimationEnabled(boolean z) {
        this.onSkipToPrevious = z;
    }

    public void setExpandedHintEnabled(boolean z) {
        if (this.onSetRepeatMode != z) {
            this.onSetRepeatMode = z;
            write(false);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        boolean z = i == 1;
        if (z != this.MediaBrowserCompatCustomActionResultReceiver) {
            float fIconCompatParcelizer = this.createFullyDrawnExecutor.MediaBrowserCompatSearchResultReceiver().IconCompatParcelizer(this.addOnPictureInPictureModeChangedListener);
            float fIconCompatParcelizer2 = this.createFullyDrawnExecutor.MediaMetadataCompat().IconCompatParcelizer(this.addOnPictureInPictureModeChangedListener);
            isValidFrameType isvalidframetypeRemoteActionCompatParcelizer = isValidFrameType.RemoteActionCompatParcelizer().IconCompatParcelizer(this.createFullyDrawnExecutor.RatingCompat()).write(this.createFullyDrawnExecutor.AudioAttributesImplApi26Parcelizer()).read(this.createFullyDrawnExecutor.AudioAttributesCompatParcelizer()).RemoteActionCompatParcelizer(this.createFullyDrawnExecutor.write()).MediaBrowserCompatItemReceiver(fIconCompatParcelizer2).MediaBrowserCompatCustomActionResultReceiver(fIconCompatParcelizer).write(this.createFullyDrawnExecutor.MediaBrowserCompatItemReceiver().IconCompatParcelizer(this.addOnPictureInPictureModeChangedListener)).read(this.createFullyDrawnExecutor.read().IconCompatParcelizer(this.addOnPictureInPictureModeChangedListener)).RemoteActionCompatParcelizer();
            this.MediaBrowserCompatCustomActionResultReceiver = z;
            setShapeAppearanceModel(isvalidframetypeRemoteActionCompatParcelizer);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (!this.onSkipToNext) {
            this.onSetShuffleMode.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.onSkipToNext = true;
        }
        r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw();
        this.onSetShuffleMode.MediaMetadataCompat();
    }

    private boolean r8lambdaKUbBm7ckfqTc9QCgukC86fguu4() {
        int iMax;
        if (this.IconCompatParcelizer == null || this.IconCompatParcelizer.getMeasuredHeight() >= (iMax = Math.max(this.onSetShuffleMode.getMeasuredHeight(), this.menuHostHelperlambda0.getMeasuredHeight()))) {
            return false;
        }
        this.IconCompatParcelizer.setMinimumHeight(iMax);
        return true;
    }

    private void r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw() {
        EditText editText;
        if (this.addObserverForBackInvokerlambda7 == null || (editText = this.IconCompatParcelizer) == null) {
            return;
        }
        this.addObserverForBackInvokerlambda7.setGravity(editText.getGravity());
        this.addObserverForBackInvokerlambda7.setPadding(this.IconCompatParcelizer.getCompoundPaddingLeft(), this.IconCompatParcelizer.getCompoundPaddingTop(), this.IconCompatParcelizer.getCompoundPaddingRight(), this.IconCompatParcelizer.getCompoundPaddingBottom());
    }

    public void setStartIconDrawable(int i) {
        setStartIconDrawable(i != 0 ? getDefaultViewModelCreationExtras.write(getContext(), i) : null);
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.menuHostHelperlambda0.read(drawable);
    }

    private Drawable r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28() {
        return this.menuHostHelperlambda0.AudioAttributesCompatParcelizer();
    }

    public void setStartIconMinSize(int i) {
        this.menuHostHelperlambda0.read(i);
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        this.menuHostHelperlambda0.AudioAttributesCompatParcelizer(onClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.menuHostHelperlambda0.RemoteActionCompatParcelizer(onLongClickListener);
    }

    public void setStartIconVisible(boolean z) {
        this.menuHostHelperlambda0.RemoteActionCompatParcelizer(z);
    }

    private void _init_lambda5() {
        this.menuHostHelperlambda0.IconCompatParcelizer();
    }

    public void setStartIconCheckable(boolean z) {
        this.menuHostHelperlambda0.read(z);
    }

    public void setStartIconContentDescription(int i) {
        setStartIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        this.menuHostHelperlambda0.write(charSequence);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        this.menuHostHelperlambda0.RemoteActionCompatParcelizer(colorStateList);
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        this.menuHostHelperlambda0.RemoteActionCompatParcelizer(mode);
    }

    public void setEndIconMode(int i) {
        this.onSetShuffleMode.RemoteActionCompatParcelizer(i);
    }

    private int PlaybackStateCompatCustomAction() {
        return this.onSetShuffleMode.IconCompatParcelizer();
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        this.onSetShuffleMode.AudioAttributesCompatParcelizer(onClickListener);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        this.onSetShuffleMode.write(onClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.onSetShuffleMode.RemoteActionCompatParcelizer(onLongClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.onSetShuffleMode.IconCompatParcelizer(onLongClickListener);
    }

    public void setEndIconVisible(boolean z) {
        this.onSetShuffleMode.write(z);
    }

    private boolean r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0() {
        return this.onSetShuffleMode.MediaBrowserCompatSearchResultReceiver();
    }

    public void setEndIconActivated(boolean z) {
        this.onSetShuffleMode.IconCompatParcelizer(z);
    }

    public void setEndIconCheckable(boolean z) {
        this.onSetShuffleMode.RemoteActionCompatParcelizer(z);
    }

    public void setEndIconDrawable(int i) {
        this.onSetShuffleMode.read(i);
    }

    public void setEndIconDrawable(Drawable drawable) {
        this.onSetShuffleMode.write(drawable);
    }

    public void setEndIconMinSize(int i) {
        this.onSetShuffleMode.AudioAttributesCompatParcelizer(i);
    }

    public void setStartIconScaleType(ImageView.ScaleType scaleType) {
        this.menuHostHelperlambda0.IconCompatParcelizer(scaleType);
    }

    public void setEndIconScaleType(ImageView.ScaleType scaleType) {
        this.onSetShuffleMode.RemoteActionCompatParcelizer(scaleType);
    }

    public void setEndIconContentDescription(int i) {
        this.onSetShuffleMode.write(i);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        this.onSetShuffleMode.read(charSequence);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        this.onSetShuffleMode.read(colorStateList);
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        this.onSetShuffleMode.AudioAttributesCompatParcelizer(mode);
    }

    public final void IconCompatParcelizer(IconCompatParcelizer iconCompatParcelizer) {
        this.onSeekTo.add(iconCompatParcelizer);
        if (this.IconCompatParcelizer != null) {
            iconCompatParcelizer.write(this);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i) {
        this.onSetShuffleMode.AudioAttributesImplBaseParcelizer(i);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.onSetShuffleMode.AudioAttributesCompatParcelizer(drawable);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i) {
        this.onSetShuffleMode.AudioAttributesImplApi21Parcelizer(i);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.onSetShuffleMode.IconCompatParcelizer(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z) {
        this.onSetShuffleMode.AudioAttributesImplApi26Parcelizer(z);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        this.onSetShuffleMode.RemoteActionCompatParcelizer(colorStateList);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        this.onSetShuffleMode.RemoteActionCompatParcelizer(mode);
    }

    public void setTextInputAccessibilityDelegate(AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        EditText editText = this.IconCompatParcelizer;
        if (editText != null) {
            InvalidTypeIdException.AudioAttributesCompatParcelizer(editText, audioAttributesCompatParcelizer);
        }
    }

    final CheckableImageButton read() {
        return this.onSetShuffleMode.RemoteActionCompatParcelizer();
    }

    private void onPrepareFromUri() {
        Iterator<IconCompatParcelizer> it = this.onSeekTo.iterator();
        while (it.hasNext()) {
            it.next().write(this);
        }
    }

    public final boolean MediaBrowserCompatSearchResultReceiver() {
        boolean z;
        if (this.IconCompatParcelizer == null) {
            return false;
        }
        boolean z2 = true;
        if (onSkipToQueueItem()) {
            int measuredWidth = this.menuHostHelperlambda0.getMeasuredWidth() - this.IconCompatParcelizer.getPaddingLeft();
            if (this.addMenuProvider == null || this.addContentView != measuredWidth) {
                ColorDrawable colorDrawable = new ColorDrawable();
                this.addMenuProvider = colorDrawable;
                this.addContentView = measuredWidth;
                colorDrawable.setBounds(0, 0, measuredWidth, 1);
            }
            Drawable[] drawableArr = _addSuperTypes.read(this.IconCompatParcelizer);
            Drawable drawable = drawableArr[0];
            Drawable drawable2 = this.addMenuProvider;
            if (drawable != drawable2) {
                _addSuperTypes.read(this.IconCompatParcelizer, drawable2, drawableArr[1], drawableArr[2], drawableArr[3]);
                z = true;
            }
            z = false;
        } else {
            if (this.addMenuProvider != null) {
                Drawable[] drawableArr2 = _addSuperTypes.read(this.IconCompatParcelizer);
                _addSuperTypes.read(this.IconCompatParcelizer, null, drawableArr2[1], drawableArr2[2], drawableArr2[3]);
                this.addMenuProvider = null;
                z = true;
            }
            z = false;
        }
        if (onSkipToNext()) {
            int measuredWidth2 = this.onSetShuffleMode.AudioAttributesImplApi21Parcelizer().getMeasuredWidth() - this.IconCompatParcelizer.getPaddingRight();
            CheckableImageButton checkableImageButtonWrite = this.onSetShuffleMode.write();
            if (checkableImageButtonWrite != null) {
                measuredWidth2 = measuredWidth2 + checkableImageButtonWrite.getMeasuredWidth() + mapArray.write((ViewGroup.MarginLayoutParams) checkableImageButtonWrite.getLayoutParams());
            }
            Drawable[] drawableArr3 = _addSuperTypes.read(this.IconCompatParcelizer);
            Drawable drawable3 = this.onRewind;
            if (drawable3 != null && this.onSetRating != measuredWidth2) {
                this.onSetRating = measuredWidth2;
                drawable3.setBounds(0, 0, measuredWidth2, 1);
                _addSuperTypes.read(this.IconCompatParcelizer, drawableArr3[0], drawableArr3[1], this.onRewind, drawableArr3[3]);
                return true;
            }
            if (drawable3 == null) {
                ColorDrawable colorDrawable2 = new ColorDrawable();
                this.onRewind = colorDrawable2;
                this.onSetRating = measuredWidth2;
                colorDrawable2.setBounds(0, 0, measuredWidth2, 1);
            }
            Drawable drawable4 = drawableArr3[2];
            Drawable drawable5 = this.onRewind;
            if (drawable4 != drawable5) {
                this._init_lambda2 = drawable4;
                _addSuperTypes.read(this.IconCompatParcelizer, drawableArr3[0], drawableArr3[1], drawable5, drawableArr3[3]);
                return true;
            }
        } else if (this.onRewind != null) {
            Drawable[] drawableArr4 = _addSuperTypes.read(this.IconCompatParcelizer);
            if (drawableArr4[2] == this.onRewind) {
                _addSuperTypes.read(this.IconCompatParcelizer, drawableArr4[0], drawableArr4[1], this._init_lambda2, drawableArr4[3]);
            } else {
                z2 = z;
            }
            this.onRewind = null;
            return z2;
        }
        return z;
    }

    private boolean onSkipToQueueItem() {
        return (r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28() != null || (r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8() != null && _init_lambda3().getVisibility() == 0)) && this.menuHostHelperlambda0.getMeasuredWidth() > 0;
    }

    private boolean onSkipToNext() {
        return (this.onSetShuffleMode.MediaBrowserCompatMediaItem() || ((this.onSetShuffleMode.AudioAttributesImplBaseParcelizer() && r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0()) || this.onSetShuffleMode.AudioAttributesImplApi26Parcelizer() != null)) && this.onSetShuffleMode.getMeasuredWidth() > 0;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        EditText editText = this.IconCompatParcelizer;
        if (editText != null) {
            Rect rect = this.addOnConfigurationChangedListener;
            ExtractorOutput.AudioAttributesCompatParcelizer(this, editText, rect);
            read(rect);
            if (this.MediaSessionCompatQueueItem) {
                this.RemoteActionCompatParcelizer.IconCompatParcelizer(this.IconCompatParcelizer.getTextSize());
                int gravity = this.IconCompatParcelizer.getGravity();
                this.RemoteActionCompatParcelizer.read((gravity & (-113)) | 48);
                this.RemoteActionCompatParcelizer.IconCompatParcelizer(gravity);
                this.RemoteActionCompatParcelizer.read(RemoteActionCompatParcelizer(rect));
                this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(write(rect));
                this.RemoteActionCompatParcelizer.AudioAttributesImplApi21Parcelizer();
                if (!onPlayFromSearch() || this.ParcelableVolumeInfo) {
                    return;
                }
                onSetPlaybackSpeed();
            }
        }
    }

    private void read(Rect rect) {
        if (this.onAddQueueItem != null) {
            this.onAddQueueItem.setBounds(rect.left, rect.bottom - this.MediaBrowserCompatSearchResultReceiver, rect.right, rect.bottom);
        }
        if (this.handleMediaPlayPauseIfPendingOnHandler != null) {
            this.handleMediaPlayPauseIfPendingOnHandler.setBounds(rect.left, rect.bottom - this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, rect.right, rect.bottom);
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        RemoteActionCompatParcelizer(canvas);
        read(canvas);
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.RemoteActionCompatParcelizer.IconCompatParcelizer(configuration);
    }

    private void RemoteActionCompatParcelizer(Canvas canvas) {
        if (this.MediaSessionCompatQueueItem) {
            this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(canvas);
        }
    }

    private void read(Canvas canvas) {
        frameSizeBytesByTypeNb framesizebytesbytypenb;
        if (this.handleMediaPlayPauseIfPendingOnHandler == null || (framesizebytesbytypenb = this.onAddQueueItem) == null) {
            return;
        }
        framesizebytesbytypenb.draw(canvas);
        if (this.IconCompatParcelizer.isFocused()) {
            Rect bounds = this.handleMediaPlayPauseIfPendingOnHandler.getBounds();
            Rect bounds2 = this.onAddQueueItem.getBounds();
            float fMediaBrowserCompatCustomActionResultReceiver = this.RemoteActionCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver();
            int iCenterX = bounds2.centerX();
            bounds.left = BinarySearchSeekerSeekOperationParams.RemoteActionCompatParcelizer(iCenterX, bounds2.left, fMediaBrowserCompatCustomActionResultReceiver);
            bounds.right = BinarySearchSeekerSeekOperationParams.RemoteActionCompatParcelizer(iCenterX, bounds2.right, fMediaBrowserCompatCustomActionResultReceiver);
            this.handleMediaPlayPauseIfPendingOnHandler.draw(canvas);
        }
    }

    private void AudioAttributesCompatParcelizer(boolean z) {
        ValueAnimator valueAnimator = this.AudioAttributesImplApi26Parcelizer;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.AudioAttributesImplApi26Parcelizer.cancel();
        }
        if (z && this.onSkipToPrevious) {
            AudioAttributesCompatParcelizer(1.0f);
        } else {
            this.RemoteActionCompatParcelizer.read(1.0f);
        }
        this.ParcelableVolumeInfo = false;
        if (onPlayFromSearch()) {
            onSetPlaybackSpeed();
        }
        ResultReceiver();
        this.menuHostHelperlambda0.IconCompatParcelizer(false);
        this.onSetShuffleMode.AudioAttributesCompatParcelizer(false);
    }

    private boolean onPlayFromSearch() {
        return this.MediaSessionCompatQueueItem && !TextUtils.isEmpty(this.setSessionImpl) && (this.MediaBrowserCompatItemReceiver instanceof onChunkData);
    }

    private void onSetPlaybackSpeed() {
        if (onPlayFromSearch()) {
            RectF rectF = this.addOnPictureInPictureModeChangedListener;
            this.RemoteActionCompatParcelizer.write(rectF, this.IconCompatParcelizer.getWidth(), this.IconCompatParcelizer.getGravity());
            if (rectF.width() <= BitmapDescriptorFactory.HUE_RED || rectF.height() <= BitmapDescriptorFactory.HUE_RED) {
                return;
            }
            IconCompatParcelizer(rectF);
            rectF.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF.height() / 2.0f)) + this.onCustomAction);
            ((onChunkData) this.MediaBrowserCompatItemReceiver).read(rectF);
        }
    }

    private void onSetRepeatMode() {
        if (!onPlayFromSearch() || this.ParcelableVolumeInfo) {
            return;
        }
        onPrepare();
        onSetPlaybackSpeed();
    }

    private void onPrepare() {
        if (onPlayFromSearch()) {
            ((onChunkData) this.MediaBrowserCompatItemReceiver).read();
        }
    }

    private void IconCompatParcelizer(RectF rectF) {
        rectF.left -= this.MediaMetadataCompat;
        rectF.right += this.MediaMetadataCompat;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        if (this.PlaybackStateCompat) {
            return;
        }
        this.PlaybackStateCompat = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        ExtractorUtil extractorUtil = this.RemoteActionCompatParcelizer;
        boolean zRemoteActionCompatParcelizer = extractorUtil != null ? extractorUtil.RemoteActionCompatParcelizer(drawableState) : false;
        if (this.IconCompatParcelizer != null) {
            write(InvalidTypeIdException.onSeekTo(this) && isEnabled());
        }
        onAddQueueItem();
        onCommand();
        if (zRemoteActionCompatParcelizer) {
            invalidate();
        }
        this.PlaybackStateCompat = false;
    }

    public final void onCommand() {
        TextView textView;
        EditText editText;
        EditText editText2;
        if (this.MediaBrowserCompatItemReceiver == null || this.RatingCompat == 0) {
            return;
        }
        boolean z = false;
        boolean z2 = isFocused() || ((editText2 = this.IconCompatParcelizer) != null && editText2.hasFocus());
        if (isHovered() || ((editText = this.IconCompatParcelizer) != null && editText.isHovered())) {
            z = true;
        }
        if (!isEnabled()) {
            this.MediaDescriptionCompat = this.onRemoveQueueItemAt;
        } else if (MediaBrowserCompatMediaItem()) {
            if (this.getSavedStateRegistryControllerannotations != null) {
                IconCompatParcelizer(z2, z);
            } else {
                this.MediaDescriptionCompat = MediaBrowserCompatItemReceiver();
            }
        } else if (!this.onPlay || (textView = this.onPrepareFromSearch) == null) {
            if (z2) {
                this.MediaDescriptionCompat = this.onStop;
            } else if (z) {
                this.MediaDescriptionCompat = this.MediaSessionCompatToken;
            } else {
                this.MediaDescriptionCompat = this.onRemoveQueueItem;
            }
        } else if (this.getSavedStateRegistryControllerannotations != null) {
            IconCompatParcelizer(z2, z);
        } else {
            this.MediaDescriptionCompat = textView.getCurrentTextColor();
        }
        MediaSessionCompatQueueItem();
        this.onSetShuffleMode.RatingCompat();
        _init_lambda5();
        if (this.RatingCompat == 2) {
            int i = this.onCustomAction;
            if (z2 && isEnabled()) {
                this.onCustomAction = this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
            } else {
                this.onCustomAction = this.MediaBrowserCompatSearchResultReceiver;
            }
            if (this.onCustomAction != i) {
                onSetRepeatMode();
            }
        }
        if (this.RatingCompat == 1) {
            if (!isEnabled()) {
                this.AudioAttributesImplBaseParcelizer = this.onPrepareFromUri;
            } else if (z && !z2) {
                this.AudioAttributesImplBaseParcelizer = this.MediaSessionCompatResultReceiverWrapper;
            } else if (z2) {
                this.AudioAttributesImplBaseParcelizer = this.onSetPlaybackSpeed;
            } else {
                this.AudioAttributesImplBaseParcelizer = this.onPrepareFromMediaId;
            }
        }
        onPlay();
    }

    private boolean onSetCaptioningEnabled() {
        if (MediaBrowserCompatMediaItem()) {
            return true;
        }
        return this.onPrepareFromSearch != null && this.onPlay;
    }

    private void IconCompatParcelizer(boolean z, boolean z2) {
        int defaultColor = this.getSavedStateRegistryControllerannotations.getDefaultColor();
        int colorForState = this.getSavedStateRegistryControllerannotations.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.getSavedStateRegistryControllerannotations.getColorForState(new int[]{R.attr.state_activated, R.attr.state_enabled}, defaultColor);
        if (z) {
            this.MediaDescriptionCompat = colorForState2;
        } else if (z2) {
            this.MediaDescriptionCompat = colorForState;
        } else {
            this.MediaDescriptionCompat = defaultColor;
        }
    }

    private void MediaSessionCompatQueueItem() {
        ColorStateList colorStateList;
        ColorStateList colorStateListRemoteActionCompatParcelizer = this.onPlayFromUri;
        if (colorStateListRemoteActionCompatParcelizer == null) {
            colorStateListRemoteActionCompatParcelizer = createExtractors.RemoteActionCompatParcelizer(getContext(), calculateNextSearchBytePosition.IconCompatParcelizer.colorControlActivated);
        }
        EditText editText = this.IconCompatParcelizer;
        if (editText == null || editText.getTextCursorDrawable() == null) {
            return;
        }
        Drawable drawableMutate = findFormatOverrides.AudioAttributesImplApi26Parcelizer(this.IconCompatParcelizer.getTextCursorDrawable()).mutate();
        if (onSetCaptioningEnabled() && (colorStateList = this.onPlayFromSearch) != null) {
            colorStateListRemoteActionCompatParcelizer = colorStateList;
        }
        findFormatOverrides.AudioAttributesCompatParcelizer(drawableMutate, colorStateListRemoteActionCompatParcelizer);
    }

    private void read(boolean z) {
        ValueAnimator valueAnimator = this.AudioAttributesImplApi26Parcelizer;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.AudioAttributesImplApi26Parcelizer.cancel();
        }
        if (z && this.onSkipToPrevious) {
            AudioAttributesCompatParcelizer(BitmapDescriptorFactory.HUE_RED);
        } else {
            this.RemoteActionCompatParcelizer.read(BitmapDescriptorFactory.HUE_RED);
        }
        if (onPlayFromSearch() && ((onChunkData) this.MediaBrowserCompatItemReceiver).RemoteActionCompatParcelizer()) {
            onPrepare();
        }
        this.ParcelableVolumeInfo = true;
        onSeekTo();
        this.menuHostHelperlambda0.IconCompatParcelizer(true);
        this.onSetShuffleMode.AudioAttributesCompatParcelizer(true);
    }

    private void AudioAttributesCompatParcelizer(float f) {
        if (this.RemoteActionCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver() == f) {
            return;
        }
        if (this.AudioAttributesImplApi26Parcelizer == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.AudioAttributesImplApi26Parcelizer = valueAnimator;
            valueAnimator.setInterpolator(getSampleRateLookupKey.read(getContext(), calculateNextSearchBytePosition.IconCompatParcelizer.motionEasingEmphasizedInterpolator, BinarySearchSeekerSeekOperationParams.AudioAttributesCompatParcelizer));
            this.AudioAttributesImplApi26Parcelizer.setDuration(getSampleRateLookupKey.write(getContext(), calculateNextSearchBytePosition.IconCompatParcelizer.motionDurationMedium4, 167));
            this.AudioAttributesImplApi26Parcelizer.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.textfield.TextInputLayout.2
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    TextInputLayout.this.RemoteActionCompatParcelizer.read(((Float) valueAnimator2.getAnimatedValue()).floatValue());
                }
            });
        }
        this.AudioAttributesImplApi26Parcelizer.setFloatValues(this.RemoteActionCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver(), f);
        this.AudioAttributesImplApi26Parcelizer.start();
    }

    final boolean MediaMetadataCompat() {
        return this.ParcelableVolumeInfo;
    }

    public static class AudioAttributesCompatParcelizer extends deserializeUsingCustom {
        private final TextInputLayout IconCompatParcelizer;

        public AudioAttributesCompatParcelizer(TextInputLayout textInputLayout) {
            this.IconCompatParcelizer = textInputLayout;
        }

        @Override // kotlin.deserializeUsingCustom
        public void onInitializeAccessibilityNodeInfo(View view, hasSuperClassStartingWith hassuperclassstartingwith) {
            super.onInitializeAccessibilityNodeInfo(view, hassuperclassstartingwith);
            EditText editTextAudioAttributesCompatParcelizer = this.IconCompatParcelizer.AudioAttributesCompatParcelizer();
            CharSequence text = editTextAudioAttributesCompatParcelizer != null ? editTextAudioAttributesCompatParcelizer.getText() : null;
            CharSequence charSequenceAudioAttributesImplApi21Parcelizer = this.IconCompatParcelizer.AudioAttributesImplApi21Parcelizer();
            CharSequence charSequenceAudioAttributesImplBaseParcelizer = this.IconCompatParcelizer.AudioAttributesImplBaseParcelizer();
            CharSequence charSequenceAudioAttributesImplApi26Parcelizer = this.IconCompatParcelizer.AudioAttributesImplApi26Parcelizer();
            int iIconCompatParcelizer = this.IconCompatParcelizer.IconCompatParcelizer();
            CharSequence charSequenceRemoteActionCompatParcelizer = this.IconCompatParcelizer.RemoteActionCompatParcelizer();
            boolean zIsEmpty = TextUtils.isEmpty(text);
            boolean zIsEmpty2 = TextUtils.isEmpty(charSequenceAudioAttributesImplApi21Parcelizer);
            boolean zMediaMetadataCompat = this.IconCompatParcelizer.MediaMetadataCompat();
            boolean zIsEmpty3 = TextUtils.isEmpty(charSequenceAudioAttributesImplBaseParcelizer);
            boolean z = (zIsEmpty3 && TextUtils.isEmpty(charSequenceRemoteActionCompatParcelizer)) ? false : true;
            String string = !zIsEmpty2 ? charSequenceAudioAttributesImplApi21Parcelizer.toString() : "";
            this.IconCompatParcelizer.menuHostHelperlambda0.AudioAttributesCompatParcelizer(hassuperclassstartingwith);
            if (!zIsEmpty) {
                hassuperclassstartingwith.MediaBrowserCompatItemReceiver(text);
            } else if (!TextUtils.isEmpty(string)) {
                hassuperclassstartingwith.MediaBrowserCompatItemReceiver(string);
                if (!zMediaMetadataCompat && charSequenceAudioAttributesImplApi26Parcelizer != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(string);
                    sb.append(", ");
                    sb.append((Object) charSequenceAudioAttributesImplApi26Parcelizer);
                    hassuperclassstartingwith.MediaBrowserCompatItemReceiver(sb.toString());
                }
            } else if (charSequenceAudioAttributesImplApi26Parcelizer != null) {
                hassuperclassstartingwith.MediaBrowserCompatItemReceiver(charSequenceAudioAttributesImplApi26Parcelizer);
            }
            if (!TextUtils.isEmpty(string)) {
                hassuperclassstartingwith.read(string);
                hassuperclassstartingwith.onCustomAction(zIsEmpty);
            }
            if (text == null || text.length() != iIconCompatParcelizer) {
                iIconCompatParcelizer = -1;
            }
            hassuperclassstartingwith.read(iIconCompatParcelizer);
            if (z) {
                if (zIsEmpty3) {
                    charSequenceAudioAttributesImplBaseParcelizer = charSequenceRemoteActionCompatParcelizer;
                }
                hassuperclassstartingwith.RemoteActionCompatParcelizer(charSequenceAudioAttributesImplBaseParcelizer);
            }
            View viewAudioAttributesImplApi26Parcelizer = this.IconCompatParcelizer.PlaybackStateCompatCustomAction.AudioAttributesImplApi26Parcelizer();
            if (viewAudioAttributesImplApi26Parcelizer != null) {
                hassuperclassstartingwith.AudioAttributesCompatParcelizer(viewAudioAttributesImplApi26Parcelizer);
            }
            this.IconCompatParcelizer.onSetShuffleMode.AudioAttributesCompatParcelizer().IconCompatParcelizer(hassuperclassstartingwith);
        }

        @Override // kotlin.deserializeUsingCustom
        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            super.onPopulateAccessibilityEvent(view, accessibilityEvent);
            this.IconCompatParcelizer.onSetShuffleMode.AudioAttributesCompatParcelizer().write(accessibilityEvent);
        }
    }
}
