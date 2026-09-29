package androidx.appcompat.widget;

import android.R;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.Property;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import kotlin.IntentSenderRequest;
import kotlin.InvalidTypeIdException;
import kotlin._addSuperTypes;
import kotlin._booleanType;
import kotlin._init_lambda5;
import kotlin.findFormatOverrides;
import kotlin.getDefaultViewModelCreationExtras;
import kotlin.getEnabledChangedCallbackactivity_release;
import kotlin.getLifecycle;
import kotlin.setChecked;
import kotlin.setEnabled;
import kotlin.setPositiveButton;
import kotlin.setTitle;

/* JADX INFO: loaded from: classes.dex */
public class SwitchCompat extends CompoundButton {
    private boolean AudioAttributesImplApi21Parcelizer;
    private boolean AudioAttributesImplApi26Parcelizer;
    private boolean AudioAttributesImplBaseParcelizer;
    ObjectAnimator IconCompatParcelizer;
    private AudioAttributesCompatParcelizer MediaBrowserCompatCustomActionResultReceiver;
    private boolean MediaBrowserCompatItemReceiver;
    private boolean MediaBrowserCompatMediaItem;
    private int MediaBrowserCompatSearchResultReceiver;
    private int MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    private Layout MediaDescriptionCompat;
    private Layout MediaMetadataCompat;
    private VelocityTracker MediaSessionCompatResultReceiverWrapper;
    private boolean RatingCompat;
    private boolean handleMediaPlayPauseIfPendingOnHandler;
    private int onAddQueueItem;
    private int onCommand;
    private int onCustomAction;
    private int onFastForward;
    private int onMediaButtonEvent;
    private int onPause;
    private TransformationMethod onPlay;
    private int onPlayFromMediaId;
    private final Rect onPlayFromSearch;
    private CharSequence onPlayFromUri;
    private final setEnabled onPrepare;
    private CharSequence onPrepareFromMediaId;
    private ColorStateList onPrepareFromSearch;
    private final TextPaint onPrepareFromUri;
    private CharSequence onRemoveQueueItem;
    private Drawable onRemoveQueueItemAt;
    private int onRewind;
    private CharSequence onSeekTo;
    private ColorStateList onSetCaptioningEnabled;
    private PorterDuff.Mode onSetPlaybackSpeed;
    private int onSetRating;
    private int onSetRepeatMode;
    private int onSetShuffleMode;
    private ColorStateList onSkipToNext;
    private PorterDuff.Mode onSkipToPrevious;
    private float onSkipToQueueItem;
    private float onStop;
    float read;
    private Drawable setSessionImpl;
    private getEnabledChangedCallbackactivity_release write;
    private static final Property<SwitchCompat, Float> RemoteActionCompatParcelizer = new Property<SwitchCompat, Float>(Float.class, "thumbPos") { // from class: androidx.appcompat.widget.SwitchCompat.5
        @Override // android.util.Property
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Float get(SwitchCompat switchCompat) {
            return Float.valueOf(switchCompat.read);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public void set(SwitchCompat switchCompat, Float f) {
            switchCompat.RemoteActionCompatParcelizer(f.floatValue());
        }
    };
    private static final int[] AudioAttributesCompatParcelizer = {R.attr.state_checked};

    private static float IconCompatParcelizer(float f, float f2, float f3) {
        return f < f2 ? f2 : f > f3 ? f3 : f;
    }

    public SwitchCompat(Context context) {
        this(context, null);
    }

    public SwitchCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, _init_lambda5.read.switchStyle);
    }

    public SwitchCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.onSetCaptioningEnabled = null;
        this.onSetPlaybackSpeed = null;
        this.AudioAttributesImplBaseParcelizer = false;
        this.AudioAttributesImplApi26Parcelizer = false;
        this.onSkipToNext = null;
        this.onSkipToPrevious = null;
        this.AudioAttributesImplApi21Parcelizer = false;
        this.RatingCompat = false;
        this.MediaSessionCompatResultReceiverWrapper = VelocityTracker.obtain();
        this.MediaBrowserCompatItemReceiver = true;
        this.onPlayFromSearch = new Rect();
        setPositiveButton.IconCompatParcelizer(this, getContext());
        TextPaint textPaint = new TextPaint(1);
        this.onPrepareFromUri = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        setTitle settitle = setTitle.read(context, attributeSet, _init_lambda5.AudioAttributesImplApi26Parcelizer.SwitchCompat, i, 0);
        InvalidTypeIdException.IconCompatParcelizer(this, context, _init_lambda5.AudioAttributesImplApi26Parcelizer.SwitchCompat, attributeSet, settitle.AudioAttributesCompatParcelizer(), i, 0);
        Drawable drawableIconCompatParcelizer = settitle.IconCompatParcelizer(_init_lambda5.AudioAttributesImplApi26Parcelizer.SwitchCompat_android_thumb);
        this.onRemoveQueueItemAt = drawableIconCompatParcelizer;
        if (drawableIconCompatParcelizer != null) {
            drawableIconCompatParcelizer.setCallback(this);
        }
        Drawable drawableIconCompatParcelizer2 = settitle.IconCompatParcelizer(_init_lambda5.AudioAttributesImplApi26Parcelizer.SwitchCompat_track);
        this.setSessionImpl = drawableIconCompatParcelizer2;
        if (drawableIconCompatParcelizer2 != null) {
            drawableIconCompatParcelizer2.setCallback(this);
        }
        IconCompatParcelizer(settitle.AudioAttributesImplBaseParcelizer(_init_lambda5.AudioAttributesImplApi26Parcelizer.SwitchCompat_android_textOn));
        RemoteActionCompatParcelizer(settitle.AudioAttributesImplBaseParcelizer(_init_lambda5.AudioAttributesImplApi26Parcelizer.SwitchCompat_android_textOff));
        this.MediaBrowserCompatMediaItem = settitle.AudioAttributesCompatParcelizer(_init_lambda5.AudioAttributesImplApi26Parcelizer.SwitchCompat_showText, true);
        this.onRewind = settitle.AudioAttributesCompatParcelizer(_init_lambda5.AudioAttributesImplApi26Parcelizer.SwitchCompat_thumbTextPadding, 0);
        this.onCommand = settitle.AudioAttributesCompatParcelizer(_init_lambda5.AudioAttributesImplApi26Parcelizer.SwitchCompat_switchMinWidth, 0);
        this.onMediaButtonEvent = settitle.AudioAttributesCompatParcelizer(_init_lambda5.AudioAttributesImplApi26Parcelizer.SwitchCompat_switchPadding, 0);
        this.handleMediaPlayPauseIfPendingOnHandler = settitle.AudioAttributesCompatParcelizer(_init_lambda5.AudioAttributesImplApi26Parcelizer.SwitchCompat_splitTrack, false);
        ColorStateList colorStateListWrite = settitle.write(_init_lambda5.AudioAttributesImplApi26Parcelizer.SwitchCompat_thumbTint);
        if (colorStateListWrite != null) {
            this.onSetCaptioningEnabled = colorStateListWrite;
            this.AudioAttributesImplBaseParcelizer = true;
        }
        PorterDuff.Mode modeWrite = IntentSenderRequest.write(settitle.read(_init_lambda5.AudioAttributesImplApi26Parcelizer.SwitchCompat_thumbTintMode, -1), null);
        if (this.onSetPlaybackSpeed != modeWrite) {
            this.onSetPlaybackSpeed = modeWrite;
            this.AudioAttributesImplApi26Parcelizer = true;
        }
        if (this.AudioAttributesImplBaseParcelizer || this.AudioAttributesImplApi26Parcelizer) {
            AudioAttributesImplBaseParcelizer();
        }
        ColorStateList colorStateListWrite2 = settitle.write(_init_lambda5.AudioAttributesImplApi26Parcelizer.SwitchCompat_trackTint);
        if (colorStateListWrite2 != null) {
            this.onSkipToNext = colorStateListWrite2;
            this.AudioAttributesImplApi21Parcelizer = true;
        }
        PorterDuff.Mode modeWrite2 = IntentSenderRequest.write(settitle.read(_init_lambda5.AudioAttributesImplApi26Parcelizer.SwitchCompat_trackTintMode, -1), null);
        if (this.onSkipToPrevious != modeWrite2) {
            this.onSkipToPrevious = modeWrite2;
            this.RatingCompat = true;
        }
        if (this.AudioAttributesImplApi21Parcelizer || this.RatingCompat) {
            MediaBrowserCompatItemReceiver();
        }
        int iMediaBrowserCompatItemReceiver = settitle.MediaBrowserCompatItemReceiver(_init_lambda5.AudioAttributesImplApi26Parcelizer.SwitchCompat_switchTextAppearance, 0);
        if (iMediaBrowserCompatItemReceiver != 0) {
            setSwitchTextAppearance(context, iMediaBrowserCompatItemReceiver);
        }
        setEnabled setenabled = new setEnabled(this);
        this.onPrepare = setenabled;
        setenabled.read(attributeSet, i);
        settitle.write();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.onSetRepeatMode = viewConfiguration.getScaledTouchSlop();
        this.MediaBrowserCompatSearchResultReceiver = viewConfiguration.getScaledMinimumFlingVelocity();
        MediaMetadataCompat().AudioAttributesCompatParcelizer(attributeSet, i);
        refreshDrawableState();
        setChecked(isChecked());
    }

    public void setSwitchTextAppearance(Context context, int i) {
        setTitle settitleAudioAttributesCompatParcelizer = setTitle.AudioAttributesCompatParcelizer(context, i, _init_lambda5.AudioAttributesImplApi26Parcelizer.TextAppearance);
        ColorStateList colorStateListWrite = settitleAudioAttributesCompatParcelizer.write(_init_lambda5.AudioAttributesImplApi26Parcelizer.TextAppearance_android_textColor);
        if (colorStateListWrite != null) {
            this.onPrepareFromSearch = colorStateListWrite;
        } else {
            this.onPrepareFromSearch = getTextColors();
        }
        int iAudioAttributesCompatParcelizer = settitleAudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(_init_lambda5.AudioAttributesImplApi26Parcelizer.TextAppearance_android_textSize, 0);
        if (iAudioAttributesCompatParcelizer != 0) {
            float f = iAudioAttributesCompatParcelizer;
            if (f != this.onPrepareFromUri.getTextSize()) {
                this.onPrepareFromUri.setTextSize(f);
                requestLayout();
            }
        }
        write(settitleAudioAttributesCompatParcelizer.read(_init_lambda5.AudioAttributesImplApi26Parcelizer.TextAppearance_android_typeface, -1), settitleAudioAttributesCompatParcelizer.read(_init_lambda5.AudioAttributesImplApi26Parcelizer.TextAppearance_android_textStyle, -1));
        if (settitleAudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(_init_lambda5.AudioAttributesImplApi26Parcelizer.TextAppearance_textAllCaps, false)) {
            this.onPlay = new getLifecycle(getContext());
        } else {
            this.onPlay = null;
        }
        IconCompatParcelizer(this.onSeekTo);
        RemoteActionCompatParcelizer(this.onPrepareFromMediaId);
        settitleAudioAttributesCompatParcelizer.write();
    }

    private void write(int i, int i2) {
        Typeface typeface;
        if (i == 1) {
            typeface = Typeface.SANS_SERIF;
        } else if (i == 2) {
            typeface = Typeface.SERIF;
        } else {
            typeface = i != 3 ? null : Typeface.MONOSPACE;
        }
        setSwitchTypeface(typeface, i2);
    }

    public void setSwitchTypeface(Typeface typeface, int i) {
        Typeface typefaceCreate;
        float f = BitmapDescriptorFactory.HUE_RED;
        if (i > 0) {
            if (typeface == null) {
                typefaceCreate = Typeface.defaultFromStyle(i);
            } else {
                typefaceCreate = Typeface.create(typeface, i);
            }
            setSwitchTypeface(typefaceCreate);
            int i2 = (~(typefaceCreate != null ? typefaceCreate.getStyle() : 0)) & i;
            this.onPrepareFromUri.setFakeBoldText((i2 & 1) != 0);
            TextPaint textPaint = this.onPrepareFromUri;
            if ((i2 & 2) != 0) {
                f = -0.25f;
            }
            textPaint.setTextSkewX(f);
            return;
        }
        this.onPrepareFromUri.setFakeBoldText(false);
        this.onPrepareFromUri.setTextSkewX(BitmapDescriptorFactory.HUE_RED);
        setSwitchTypeface(typeface);
    }

    public void setSwitchTypeface(Typeface typeface) {
        if ((this.onPrepareFromUri.getTypeface() == null || this.onPrepareFromUri.getTypeface().equals(typeface)) && (this.onPrepareFromUri.getTypeface() != null || typeface == null)) {
            return;
        }
        this.onPrepareFromUri.setTypeface(typeface);
        requestLayout();
        invalidate();
    }

    public void setSwitchPadding(int i) {
        this.onMediaButtonEvent = i;
        requestLayout();
    }

    public void setSwitchMinWidth(int i) {
        this.onCommand = i;
        requestLayout();
    }

    public void setThumbTextPadding(int i) {
        this.onRewind = i;
        requestLayout();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.setSessionImpl;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.setSessionImpl = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i) {
        setTrackDrawable(getDefaultViewModelCreationExtras.write(getContext(), i));
    }

    public Drawable RemoteActionCompatParcelizer() {
        return this.setSessionImpl;
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.onSkipToNext = colorStateList;
        this.AudioAttributesImplApi21Parcelizer = true;
        MediaBrowserCompatItemReceiver();
    }

    public ColorStateList MediaBrowserCompatCustomActionResultReceiver() {
        return this.onSkipToNext;
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
        this.onSkipToPrevious = mode;
        this.RatingCompat = true;
        MediaBrowserCompatItemReceiver();
    }

    public PorterDuff.Mode AudioAttributesImplApi21Parcelizer() {
        return this.onSkipToPrevious;
    }

    private void MediaBrowserCompatItemReceiver() {
        Drawable drawable = this.setSessionImpl;
        if (drawable != null) {
            if (this.AudioAttributesImplApi21Parcelizer || this.RatingCompat) {
                Drawable drawableMutate = findFormatOverrides.AudioAttributesImplApi26Parcelizer(drawable).mutate();
                this.setSessionImpl = drawableMutate;
                if (this.AudioAttributesImplApi21Parcelizer) {
                    findFormatOverrides.AudioAttributesCompatParcelizer(drawableMutate, this.onSkipToNext);
                }
                if (this.RatingCompat) {
                    findFormatOverrides.read(this.setSessionImpl, this.onSkipToPrevious);
                }
                if (this.setSessionImpl.isStateful()) {
                    this.setSessionImpl.setState(getDrawableState());
                }
            }
        }
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.onRemoveQueueItemAt;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.onRemoveQueueItemAt = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setThumbResource(int i) {
        setThumbDrawable(getDefaultViewModelCreationExtras.write(getContext(), i));
    }

    public Drawable IconCompatParcelizer() {
        return this.onRemoveQueueItemAt;
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.onSetCaptioningEnabled = colorStateList;
        this.AudioAttributesImplBaseParcelizer = true;
        AudioAttributesImplBaseParcelizer();
    }

    public ColorStateList write() {
        return this.onSetCaptioningEnabled;
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        this.onSetPlaybackSpeed = mode;
        this.AudioAttributesImplApi26Parcelizer = true;
        AudioAttributesImplBaseParcelizer();
    }

    public PorterDuff.Mode read() {
        return this.onSetPlaybackSpeed;
    }

    private void AudioAttributesImplBaseParcelizer() {
        Drawable drawable = this.onRemoveQueueItemAt;
        if (drawable != null) {
            if (this.AudioAttributesImplBaseParcelizer || this.AudioAttributesImplApi26Parcelizer) {
                Drawable drawableMutate = findFormatOverrides.AudioAttributesImplApi26Parcelizer(drawable).mutate();
                this.onRemoveQueueItemAt = drawableMutate;
                if (this.AudioAttributesImplBaseParcelizer) {
                    findFormatOverrides.AudioAttributesCompatParcelizer(drawableMutate, this.onSetCaptioningEnabled);
                }
                if (this.AudioAttributesImplApi26Parcelizer) {
                    findFormatOverrides.read(this.onRemoveQueueItemAt, this.onSetPlaybackSpeed);
                }
                if (this.onRemoveQueueItemAt.isStateful()) {
                    this.onRemoveQueueItemAt.setState(getDrawableState());
                }
            }
        }
    }

    public void setSplitTrack(boolean z) {
        this.handleMediaPlayPauseIfPendingOnHandler = z;
        invalidate();
    }

    private void IconCompatParcelizer(CharSequence charSequence) {
        this.onSeekTo = charSequence;
        this.onRemoveQueueItem = write(charSequence);
        this.MediaMetadataCompat = null;
        if (this.MediaBrowserCompatMediaItem) {
            onCustomAction();
        }
    }

    public void setTextOn(CharSequence charSequence) {
        IconCompatParcelizer(charSequence);
        requestLayout();
        if (isChecked()) {
            MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
        }
    }

    private void RemoteActionCompatParcelizer(CharSequence charSequence) {
        this.onPrepareFromMediaId = charSequence;
        this.onPlayFromUri = write(charSequence);
        this.MediaDescriptionCompat = null;
        if (this.MediaBrowserCompatMediaItem) {
            onCustomAction();
        }
    }

    public void setTextOff(CharSequence charSequence) {
        RemoteActionCompatParcelizer(charSequence);
        requestLayout();
        if (isChecked()) {
            return;
        }
        handleMediaPlayPauseIfPendingOnHandler();
    }

    private CharSequence write(CharSequence charSequence) {
        TransformationMethod transformationMethod = MediaMetadataCompat().read(this.onPlay);
        return transformationMethod != null ? transformationMethod.getTransformation(charSequence, this) : charSequence;
    }

    public void setShowText(boolean z) {
        if (this.MediaBrowserCompatMediaItem != z) {
            this.MediaBrowserCompatMediaItem = z;
            requestLayout();
            if (z) {
                onCustomAction();
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        int intrinsicWidth;
        int intrinsicHeight;
        int iMax;
        if (this.MediaBrowserCompatMediaItem) {
            if (this.MediaMetadataCompat == null) {
                this.MediaMetadataCompat = AudioAttributesCompatParcelizer(this.onRemoveQueueItem);
            }
            if (this.MediaDescriptionCompat == null) {
                this.MediaDescriptionCompat = AudioAttributesCompatParcelizer(this.onPlayFromUri);
            }
        }
        Rect rect = this.onPlayFromSearch;
        Drawable drawable = this.onRemoveQueueItemAt;
        int intrinsicHeight2 = 0;
        if (drawable != null) {
            drawable.getPadding(rect);
            intrinsicWidth = (this.onRemoveQueueItemAt.getIntrinsicWidth() - rect.left) - rect.right;
            intrinsicHeight = this.onRemoveQueueItemAt.getIntrinsicHeight();
        } else {
            intrinsicWidth = 0;
            intrinsicHeight = 0;
        }
        this.onSetShuffleMode = Math.max(this.MediaBrowserCompatMediaItem ? Math.max(this.MediaMetadataCompat.getWidth(), this.MediaDescriptionCompat.getWidth()) + (this.onRewind << 1) : 0, intrinsicWidth);
        Drawable drawable2 = this.setSessionImpl;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            intrinsicHeight2 = this.setSessionImpl.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int iMax2 = rect.left;
        int iMax3 = rect.right;
        Drawable drawable3 = this.onRemoveQueueItemAt;
        if (drawable3 != null) {
            Rect rectWrite = IntentSenderRequest.write(drawable3);
            iMax2 = Math.max(iMax2, rectWrite.left);
            iMax3 = Math.max(iMax3, rectWrite.right);
        }
        if (this.MediaBrowserCompatItemReceiver) {
            iMax = Math.max(this.onCommand, (this.onSetShuffleMode << 1) + iMax2 + iMax3);
        } else {
            iMax = this.onCommand;
        }
        int iMax4 = Math.max(intrinsicHeight2, intrinsicHeight);
        this.onPause = iMax;
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = iMax4;
        super.onMeasure(i, i2);
        if (getMeasuredHeight() < iMax4) {
            setMeasuredDimension(getMeasuredWidthAndState(), iMax4);
        }
    }

    @Override // android.view.View
    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.onSeekTo : this.onPrepareFromMediaId;
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    private Layout AudioAttributesCompatParcelizer(CharSequence charSequence) {
        return new StaticLayout(charSequence, this.onPrepareFromUri, charSequence != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence, r2)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, BitmapDescriptorFactory.HUE_RED, true);
    }

    private boolean IconCompatParcelizer(float f, float f2) {
        if (this.onRemoveQueueItemAt == null) {
            return false;
        }
        int iMediaBrowserCompatMediaItem = MediaBrowserCompatMediaItem();
        this.onRemoveQueueItemAt.getPadding(this.onPlayFromSearch);
        int i = this.onFastForward;
        int i2 = this.onSetRepeatMode;
        int i3 = (this.onAddQueueItem + iMediaBrowserCompatMediaItem) - i2;
        int i4 = this.onSetShuffleMode;
        int i5 = this.onPlayFromSearch.left;
        int i6 = this.onPlayFromSearch.right;
        int i7 = this.onSetRepeatMode;
        return f > ((float) i3) && f < ((float) ((((i4 + i3) + i5) + i6) + i7)) && f2 > ((float) (i - i2)) && f2 < ((float) (this.onCustomAction + i7));
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0086  */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            android.view.VelocityTracker r0 = r6.MediaSessionCompatResultReceiverWrapper
            r0.addMovement(r7)
            int r0 = r7.getActionMasked()
            r1 = 1
            if (r0 == 0) goto L9a
            r2 = 2
            if (r0 == r1) goto L86
            if (r0 == r2) goto L16
            r3 = 3
            if (r0 == r3) goto L86
            goto Lb4
        L16:
            int r0 = r6.onSetRating
            if (r0 == r1) goto L52
            if (r0 != r2) goto Lb4
            float r7 = r7.getX()
            int r0 = r6.MediaBrowserCompatSearchResultReceiver()
            float r2 = r6.onSkipToQueueItem
            float r2 = r7 - r2
            r3 = 1065353216(0x3f800000, float:1.0)
            r4 = 0
            if (r0 == 0) goto L30
            float r0 = (float) r0
            float r2 = r2 / r0
            goto L38
        L30:
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L36
            r2 = r3
            goto L38
        L36:
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
        L38:
            boolean r0 = kotlin.setChecked.AudioAttributesCompatParcelizer(r6)
            if (r0 == 0) goto L3f
            float r2 = -r2
        L3f:
            float r0 = r6.read
            float r0 = r0 + r2
            float r0 = IconCompatParcelizer(r0, r4, r3)
            float r2 = r6.read
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L51
            r6.onSkipToQueueItem = r7
            r6.RemoteActionCompatParcelizer(r0)
        L51:
            return r1
        L52:
            float r0 = r7.getX()
            float r3 = r7.getY()
            float r4 = r6.onSkipToQueueItem
            float r4 = r0 - r4
            float r4 = java.lang.Math.abs(r4)
            int r5 = r6.onSetRepeatMode
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 > 0) goto L78
            float r4 = r6.onStop
            float r4 = r3 - r4
            float r4 = java.lang.Math.abs(r4)
            int r5 = r6.onSetRepeatMode
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto Lb4
        L78:
            r6.onSetRating = r2
            android.view.ViewParent r7 = r6.getParent()
            r7.requestDisallowInterceptTouchEvent(r1)
            r6.onSkipToQueueItem = r0
            r6.onStop = r3
            return r1
        L86:
            int r0 = r6.onSetRating
            if (r0 != r2) goto L91
            r6.RemoteActionCompatParcelizer(r7)
            super.onTouchEvent(r7)
            return r1
        L91:
            r0 = 0
            r6.onSetRating = r0
            android.view.VelocityTracker r0 = r6.MediaSessionCompatResultReceiverWrapper
            r0.clear()
            goto Lb4
        L9a:
            float r0 = r7.getX()
            float r2 = r7.getY()
            boolean r3 = r6.isEnabled()
            if (r3 == 0) goto Lb4
            boolean r3 = r6.IconCompatParcelizer(r0, r2)
            if (r3 == 0) goto Lb4
            r6.onSetRating = r1
            r6.onSkipToQueueItem = r0
            r6.onStop = r2
        Lb4:
            boolean r6 = super.onTouchEvent(r7)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SwitchCompat.onTouchEvent(android.view.MotionEvent):boolean");
    }

    private void read(MotionEvent motionEvent) {
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        motionEventObtain.setAction(3);
        super.onTouchEvent(motionEventObtain);
        motionEventObtain.recycle();
    }

    private void RemoteActionCompatParcelizer(MotionEvent motionEvent) {
        this.onSetRating = 0;
        boolean zMediaDescriptionCompat = true;
        boolean z = motionEvent.getAction() == 1 && isEnabled();
        boolean zIsChecked = isChecked();
        if (z) {
            this.MediaSessionCompatResultReceiverWrapper.computeCurrentVelocity(1000);
            float xVelocity = this.MediaSessionCompatResultReceiverWrapper.getXVelocity();
            if (Math.abs(xVelocity) > this.MediaBrowserCompatSearchResultReceiver) {
                if (!setChecked.AudioAttributesCompatParcelizer(this) ? xVelocity <= BitmapDescriptorFactory.HUE_RED : xVelocity >= BitmapDescriptorFactory.HUE_RED) {
                    zMediaDescriptionCompat = false;
                }
            } else {
                zMediaDescriptionCompat = MediaDescriptionCompat();
            }
        } else {
            zMediaDescriptionCompat = zIsChecked;
        }
        if (zMediaDescriptionCompat != zIsChecked) {
            playSoundEffect(0);
        }
        setChecked(zMediaDescriptionCompat);
        read(motionEvent);
    }

    private void RemoteActionCompatParcelizer(boolean z) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, RemoteActionCompatParcelizer, z ? 1.0f : BitmapDescriptorFactory.HUE_RED);
        this.IconCompatParcelizer = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(250L);
        RemoteActionCompatParcelizer.read(this.IconCompatParcelizer, true);
        this.IconCompatParcelizer.start();
    }

    private void RatingCompat() {
        ObjectAnimator objectAnimator = this.IconCompatParcelizer;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    private boolean MediaDescriptionCompat() {
        return this.read > 0.5f;
    }

    protected final float AudioAttributesCompatParcelizer() {
        return this.read;
    }

    void RemoteActionCompatParcelizer(float f) {
        this.read = f;
        invalidate();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void toggle() {
        setChecked(!isChecked());
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        super.setChecked(z);
        boolean zIsChecked = isChecked();
        if (zIsChecked) {
            MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
        } else {
            handleMediaPlayPauseIfPendingOnHandler();
        }
        if (getWindowToken() != null && InvalidTypeIdException.onSeekTo(this)) {
            RemoteActionCompatParcelizer(zIsChecked);
        } else {
            RatingCompat();
            RemoteActionCompatParcelizer(zIsChecked ? 1.0f : BitmapDescriptorFactory.HUE_RED);
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int iMax;
        int width;
        int paddingLeft;
        int i5;
        int paddingTop;
        int i6;
        int height;
        super.onLayout(z, i, i2, i3, i4);
        int iMax2 = 0;
        if (this.onRemoveQueueItemAt != null) {
            Rect rect = this.onPlayFromSearch;
            Drawable drawable = this.setSessionImpl;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect rectWrite = IntentSenderRequest.write(this.onRemoveQueueItemAt);
            iMax = Math.max(0, rectWrite.left - rect.left);
            iMax2 = Math.max(0, rectWrite.right - rect.right);
        } else {
            iMax = 0;
        }
        if (setChecked.AudioAttributesCompatParcelizer(this)) {
            paddingLeft = getPaddingLeft() + iMax;
            width = ((this.onPause + paddingLeft) - iMax) - iMax2;
        } else {
            width = (getWidth() - getPaddingRight()) - iMax2;
            paddingLeft = (width - this.onPause) + iMax + iMax2;
        }
        int gravity = getGravity() & 112;
        if (gravity == 16) {
            int paddingTop2 = ((getPaddingTop() + getHeight()) - getPaddingBottom()) / 2;
            i5 = this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
            paddingTop = paddingTop2 - (i5 / 2);
        } else if (gravity != 80) {
            paddingTop = getPaddingTop();
            i5 = this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        } else {
            height = getHeight() - getPaddingBottom();
            i6 = height - this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
            this.onAddQueueItem = paddingLeft;
            this.onFastForward = i6;
            this.onCustomAction = height;
            this.onPlayFromMediaId = width;
        }
        int i7 = i5 + paddingTop;
        i6 = paddingTop;
        height = i7;
        this.onAddQueueItem = paddingLeft;
        this.onFastForward = i6;
        this.onCustomAction = height;
        this.onPlayFromMediaId = width;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        Rect rectWrite;
        int i;
        int i2;
        Rect rect = this.onPlayFromSearch;
        int i3 = this.onAddQueueItem;
        int i4 = this.onFastForward;
        int i5 = this.onPlayFromMediaId;
        int i6 = this.onCustomAction;
        int iMediaBrowserCompatMediaItem = MediaBrowserCompatMediaItem() + i3;
        Drawable drawable = this.onRemoveQueueItemAt;
        if (drawable != null) {
            rectWrite = IntentSenderRequest.write(drawable);
        } else {
            rectWrite = IntentSenderRequest.write;
        }
        Drawable drawable2 = this.setSessionImpl;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            iMediaBrowserCompatMediaItem += rect.left;
            if (rectWrite != null) {
                if (rectWrite.left > rect.left) {
                    i3 += rectWrite.left - rect.left;
                }
                i = rectWrite.top > rect.top ? (rectWrite.top - rect.top) + i4 : i4;
                if (rectWrite.right > rect.right) {
                    i5 -= rectWrite.right - rect.right;
                }
                if (rectWrite.bottom > rect.bottom) {
                    i2 = i6 - (rectWrite.bottom - rect.bottom);
                }
                this.setSessionImpl.setBounds(i3, i, i5, i2);
            } else {
                i = i4;
            }
            i2 = i6;
            this.setSessionImpl.setBounds(i3, i, i5, i2);
        }
        Drawable drawable3 = this.onRemoveQueueItemAt;
        if (drawable3 != null) {
            drawable3.getPadding(rect);
            int i7 = iMediaBrowserCompatMediaItem - rect.left;
            int i8 = iMediaBrowserCompatMediaItem + this.onSetShuffleMode + rect.right;
            this.onRemoveQueueItemAt.setBounds(i7, i4, i8, i6);
            Drawable background = getBackground();
            if (background != null) {
                findFormatOverrides.write(background, i7, i4, i8, i6);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        int width;
        super.onDraw(canvas);
        Rect rect = this.onPlayFromSearch;
        Drawable drawable = this.setSessionImpl;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i = this.onFastForward;
        int i2 = this.onCustomAction;
        int i3 = rect.top;
        int i4 = rect.bottom;
        Drawable drawable2 = this.onRemoveQueueItemAt;
        if (drawable != null) {
            if (this.handleMediaPlayPauseIfPendingOnHandler && drawable2 != null) {
                Rect rectWrite = IntentSenderRequest.write(drawable2);
                drawable2.copyBounds(rect);
                rect.left += rectWrite.left;
                rect.right -= rectWrite.right;
                int iSave = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(iSave);
            } else {
                drawable.draw(canvas);
            }
        }
        int iSave2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Layout layout = MediaDescriptionCompat() ? this.MediaMetadataCompat : this.MediaDescriptionCompat;
        if (layout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.onPrepareFromSearch;
            if (colorStateList != null) {
                this.onPrepareFromUri.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            this.onPrepareFromUri.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                width = bounds.left + bounds.right;
            } else {
                width = getWidth();
            }
            canvas.translate((width / 2) - (layout.getWidth() / 2), (((i + i3) + (i2 - i4)) / 2) - (layout.getHeight() / 2));
            layout.draw(canvas);
        }
        canvas.restoreToCount(iSave2);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        if (!setChecked.AudioAttributesCompatParcelizer(this)) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.onPause;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.onMediaButtonEvent : compoundPaddingLeft;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingRight() {
        if (setChecked.AudioAttributesCompatParcelizer(this)) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.onPause;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.onMediaButtonEvent : compoundPaddingRight;
    }

    private int MediaBrowserCompatMediaItem() {
        float f;
        if (setChecked.AudioAttributesCompatParcelizer(this)) {
            f = 1.0f - this.read;
        } else {
            f = this.read;
        }
        return (int) ((f * MediaBrowserCompatSearchResultReceiver()) + 0.5f);
    }

    private int MediaBrowserCompatSearchResultReceiver() {
        Rect rectWrite;
        Drawable drawable = this.setSessionImpl;
        if (drawable == null) {
            return 0;
        }
        Rect rect = this.onPlayFromSearch;
        drawable.getPadding(rect);
        Drawable drawable2 = this.onRemoveQueueItemAt;
        if (drawable2 != null) {
            rectWrite = IntentSenderRequest.write(drawable2);
        } else {
            rectWrite = IntentSenderRequest.write;
        }
        return ((((this.onPause - this.onSetShuffleMode) - rect.left) - rect.right) - rectWrite.left) - rectWrite.right;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (isChecked()) {
            mergeDrawableStates(iArrOnCreateDrawableState, AudioAttributesCompatParcelizer);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.onRemoveQueueItemAt;
        boolean state = (drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState);
        Drawable drawable2 = this.setSessionImpl;
        if (drawable2 != null && drawable2.isStateful()) {
            state |= drawable2.setState(drawableState);
        }
        if (state) {
            invalidate();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        Drawable drawable = this.onRemoveQueueItemAt;
        if (drawable != null) {
            findFormatOverrides.AudioAttributesCompatParcelizer(drawable, f, f2);
        }
        Drawable drawable2 = this.setSessionImpl;
        if (drawable2 != null) {
            findFormatOverrides.AudioAttributesCompatParcelizer(drawable2, f, f2);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.onRemoveQueueItemAt || drawable == this.setSessionImpl;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.onRemoveQueueItemAt;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.setSessionImpl;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.IconCompatParcelizer;
        if (objectAnimator == null || !objectAnimator.isStarted()) {
            return;
        }
        this.IconCompatParcelizer.end();
        this.IconCompatParcelizer = null;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        if (Build.VERSION.SDK_INT < 30) {
            CharSequence charSequence = isChecked() ? this.onSeekTo : this.onPrepareFromMediaId;
            if (TextUtils.isEmpty(charSequence)) {
                return;
            }
            CharSequence text = accessibilityNodeInfo.getText();
            if (TextUtils.isEmpty(text)) {
                accessibilityNodeInfo.setText(charSequence);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(text);
            sb.append(' ');
            sb.append(charSequence);
            accessibilityNodeInfo.setText(sb);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(_addSuperTypes.write(this, callback));
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return _addSuperTypes.AudioAttributesCompatParcelizer(super.getCustomSelectionActionModeCallback());
    }

    protected final void read(boolean z) {
        this.MediaBrowserCompatItemReceiver = z;
        invalidate();
    }

    private void MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        if (Build.VERSION.SDK_INT >= 30) {
            CharSequence string = this.onSeekTo;
            if (string == null) {
                string = getResources().getString(_init_lambda5.AudioAttributesImplApi21Parcelizer.abc_capital_on);
            }
            InvalidTypeIdException.RemoteActionCompatParcelizer(this, string);
        }
    }

    private void handleMediaPlayPauseIfPendingOnHandler() {
        if (Build.VERSION.SDK_INT >= 30) {
            CharSequence string = this.onPrepareFromMediaId;
            if (string == null) {
                string = getResources().getString(_init_lambda5.AudioAttributesImplApi21Parcelizer.abc_capital_off);
            }
            InvalidTypeIdException.RemoteActionCompatParcelizer(this, string);
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        MediaMetadataCompat().write(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(MediaMetadataCompat().AudioAttributesCompatParcelizer(inputFilterArr));
    }

    private getEnabledChangedCallbackactivity_release MediaMetadataCompat() {
        if (this.write == null) {
            this.write = new getEnabledChangedCallbackactivity_release(this);
        }
        return this.write;
    }

    public void setEmojiCompatEnabled(boolean z) {
        MediaMetadataCompat().read(z);
        IconCompatParcelizer(this.onSeekTo);
        RemoteActionCompatParcelizer(this.onPrepareFromMediaId);
        requestLayout();
    }

    private void onCustomAction() {
        if (this.MediaBrowserCompatCustomActionResultReceiver == null && this.write.write() && _booleanType.read()) {
            _booleanType _booleantypeAudioAttributesCompatParcelizer = _booleanType.AudioAttributesCompatParcelizer();
            int iIconCompatParcelizer = _booleantypeAudioAttributesCompatParcelizer.IconCompatParcelizer();
            if (iIconCompatParcelizer == 3 || iIconCompatParcelizer == 0) {
                AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = new AudioAttributesCompatParcelizer(this);
                this.MediaBrowserCompatCustomActionResultReceiver = audioAttributesCompatParcelizer;
                _booleantypeAudioAttributesCompatParcelizer.read(audioAttributesCompatParcelizer);
            }
        }
    }

    void AudioAttributesImplApi26Parcelizer() {
        IconCompatParcelizer(this.onSeekTo);
        RemoteActionCompatParcelizer(this.onPrepareFromMediaId);
        requestLayout();
    }

    /* JADX INFO: loaded from: classes4.dex */
    static class AudioAttributesCompatParcelizer extends _booleanType.IconCompatParcelizer {
        private final Reference<SwitchCompat> IconCompatParcelizer;

        AudioAttributesCompatParcelizer(SwitchCompat switchCompat) {
            this.IconCompatParcelizer = new WeakReference(switchCompat);
        }

        @Override // o._booleanType.IconCompatParcelizer
        public void read() {
            SwitchCompat switchCompat = this.IconCompatParcelizer.get();
            if (switchCompat != null) {
                switchCompat.AudioAttributesImplApi26Parcelizer();
            }
        }

        @Override // o._booleanType.IconCompatParcelizer
        public void RemoteActionCompatParcelizer(Throwable th) {
            SwitchCompat switchCompat = this.IconCompatParcelizer.get();
            if (switchCompat != null) {
                switchCompat.AudioAttributesImplApi26Parcelizer();
            }
        }
    }

    static class RemoteActionCompatParcelizer {
        static void read(ObjectAnimator objectAnimator, boolean z) {
            objectAnimator.setAutoCancel(z);
        }
    }
}
