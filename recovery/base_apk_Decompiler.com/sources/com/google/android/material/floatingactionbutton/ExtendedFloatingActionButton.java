package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import java.util.Iterator;
import java.util.List;
import kotlin.AbstractC0213track;
import kotlin.BinarySearchSeekerSeekTimestampConverter;
import kotlin.DummyTrackOutput;
import kotlin.Extractor;
import kotlin.ExtractorOutput;
import kotlin.InvalidTypeIdException;
import kotlin.calculateNextSearchBytePosition;
import kotlin.isValidFrameType;
import kotlin.readFrames;
import kotlin.readId3Metadata;

/* JADX INFO: loaded from: classes5.dex */
public class ExtendedFloatingActionButton extends MaterialButton implements CoordinatorLayout.read {
    private int AudioAttributesImplApi21Parcelizer;
    private final DummyTrackOutput AudioAttributesImplBaseParcelizer;
    public ColorStateList IconCompatParcelizer;
    private boolean MediaBrowserCompatCustomActionResultReceiver;
    private final CoordinatorLayout.Behavior<ExtendedFloatingActionButton> MediaBrowserCompatItemReceiver;
    private final Extractor MediaBrowserCompatMediaItem;
    private int MediaBrowserCompatSearchResultReceiver;
    private int MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    private int MediaDescriptionCompat;
    private final int MediaMetadataCompat;
    private final int RatingCompat;
    private boolean handleMediaPlayPauseIfPendingOnHandler;
    private final Extractor onAddQueueItem;
    private boolean onCommand;
    private int onCustomAction;
    private final Extractor onMediaButtonEvent;
    private final Extractor onPause;
    private static final int AudioAttributesImplApi26Parcelizer = calculateNextSearchBytePosition.MediaBrowserCompatMediaItem.Widget_MaterialComponents_ExtendedFloatingActionButton_Icon;
    public static final Property<View, Float> write = new Property<View, Float>(Float.class, "width") { // from class: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.6
        @Override // android.util.Property
        public final /* synthetic */ Float get(View view) {
            return RemoteActionCompatParcelizer(view);
        }

        @Override // android.util.Property
        public final /* synthetic */ void set(View view, Float f) {
            write(view, f);
        }

        private static void write(View view, Float f) {
            view.getLayoutParams().width = f.intValue();
            view.requestLayout();
        }

        private static Float RemoteActionCompatParcelizer(View view) {
            return Float.valueOf(view.getLayoutParams().width);
        }
    };
    public static final Property<View, Float> read = new Property<View, Float>(Float.class, "height") { // from class: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.10
        @Override // android.util.Property
        public final /* synthetic */ Float get(View view) {
            return RemoteActionCompatParcelizer(view);
        }

        @Override // android.util.Property
        public final /* synthetic */ void set(View view, Float f) {
            read(view, f);
        }

        private static void read(View view, Float f) {
            view.getLayoutParams().height = f.intValue();
            view.requestLayout();
        }

        private static Float RemoteActionCompatParcelizer(View view) {
            return Float.valueOf(view.getLayoutParams().height);
        }
    };
    public static final Property<View, Float> AudioAttributesCompatParcelizer = new Property<View, Float>(Float.class, "paddingStart") { // from class: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.7
        @Override // android.util.Property
        public final /* synthetic */ Float get(View view) {
            return AudioAttributesCompatParcelizer(view);
        }

        @Override // android.util.Property
        public final /* synthetic */ void set(View view, Float f) {
            read(view, f);
        }

        private static void read(View view, Float f) {
            InvalidTypeIdException.read(view, f.intValue(), view.getPaddingTop(), InvalidTypeIdException.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(view), view.getPaddingBottom());
        }

        private static Float AudioAttributesCompatParcelizer(View view) {
            return Float.valueOf(InvalidTypeIdException.onCommand(view));
        }
    };
    public static final Property<View, Float> RemoteActionCompatParcelizer = new Property<View, Float>(Float.class, "paddingEnd") { // from class: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.9
        @Override // android.util.Property
        public final /* synthetic */ Float get(View view) {
            return IconCompatParcelizer(view);
        }

        @Override // android.util.Property
        public final /* synthetic */ void set(View view, Float f) {
            read(view, f);
        }

        private static void read(View view, Float f) {
            InvalidTypeIdException.read(view, InvalidTypeIdException.onCommand(view), view.getPaddingTop(), f.intValue(), view.getPaddingBottom());
        }

        private static Float IconCompatParcelizer(View view) {
            return Float.valueOf(InvalidTypeIdException.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(view));
        }
    };

    public static abstract class RemoteActionCompatParcelizer {
    }

    interface write {
        int AudioAttributesCompatParcelizer();

        int IconCompatParcelizer();

        int RemoteActionCompatParcelizer();

        int read();

        ViewGroup.LayoutParams write();
    }

    public ExtendedFloatingActionButton(Context context) {
        this(context, null);
    }

    public ExtendedFloatingActionButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, calculateNextSearchBytePosition.IconCompatParcelizer.extendedFloatingActionButtonStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ExtendedFloatingActionButton(Context context, AttributeSet attributeSet, int i) {
        int i2 = AudioAttributesImplApi26Parcelizer;
        super(readFrames.IconCompatParcelizer(context, attributeSet, i, i2), attributeSet, i);
        this.AudioAttributesImplApi21Parcelizer = 0;
        DummyTrackOutput dummyTrackOutput = new DummyTrackOutput();
        this.AudioAttributesImplBaseParcelizer = dummyTrackOutput;
        read readVar = new read(dummyTrackOutput);
        this.onMediaButtonEvent = readVar;
        AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = new AudioAttributesCompatParcelizer(dummyTrackOutput);
        this.onAddQueueItem = audioAttributesCompatParcelizer;
        this.handleMediaPlayPauseIfPendingOnHandler = true;
        this.onCommand = false;
        this.MediaBrowserCompatCustomActionResultReceiver = false;
        Context context2 = getContext();
        this.MediaBrowserCompatItemReceiver = new ExtendedFloatingActionButtonBehavior(context2, attributeSet);
        TypedArray typedArrayWrite = readId3Metadata.write(context2, attributeSet, calculateNextSearchBytePosition.MediaMetadataCompat.ExtendedFloatingActionButton, i, i2, new int[0]);
        BinarySearchSeekerSeekTimestampConverter binarySearchSeekerSeekTimestampConverterAudioAttributesCompatParcelizer = BinarySearchSeekerSeekTimestampConverter.AudioAttributesCompatParcelizer(context2, typedArrayWrite, calculateNextSearchBytePosition.MediaMetadataCompat.ExtendedFloatingActionButton_showMotionSpec);
        BinarySearchSeekerSeekTimestampConverter binarySearchSeekerSeekTimestampConverterAudioAttributesCompatParcelizer2 = BinarySearchSeekerSeekTimestampConverter.AudioAttributesCompatParcelizer(context2, typedArrayWrite, calculateNextSearchBytePosition.MediaMetadataCompat.ExtendedFloatingActionButton_hideMotionSpec);
        BinarySearchSeekerSeekTimestampConverter binarySearchSeekerSeekTimestampConverterAudioAttributesCompatParcelizer3 = BinarySearchSeekerSeekTimestampConverter.AudioAttributesCompatParcelizer(context2, typedArrayWrite, calculateNextSearchBytePosition.MediaMetadataCompat.ExtendedFloatingActionButton_extendMotionSpec);
        BinarySearchSeekerSeekTimestampConverter binarySearchSeekerSeekTimestampConverterAudioAttributesCompatParcelizer4 = BinarySearchSeekerSeekTimestampConverter.AudioAttributesCompatParcelizer(context2, typedArrayWrite, calculateNextSearchBytePosition.MediaMetadataCompat.ExtendedFloatingActionButton_shrinkMotionSpec);
        this.RatingCompat = typedArrayWrite.getDimensionPixelSize(calculateNextSearchBytePosition.MediaMetadataCompat.ExtendedFloatingActionButton_collapsedSize, -1);
        int i3 = typedArrayWrite.getInt(calculateNextSearchBytePosition.MediaMetadataCompat.ExtendedFloatingActionButton_extendStrategy, 1);
        this.MediaMetadataCompat = i3;
        this.MediaBrowserCompatSearchResultReceiver = InvalidTypeIdException.onCommand(this);
        this.MediaDescriptionCompat = InvalidTypeIdException.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(this);
        DummyTrackOutput dummyTrackOutput2 = new DummyTrackOutput();
        IconCompatParcelizer iconCompatParcelizer = new IconCompatParcelizer(dummyTrackOutput2, RemoteActionCompatParcelizer(i3), true);
        this.MediaBrowserCompatMediaItem = iconCompatParcelizer;
        IconCompatParcelizer iconCompatParcelizer2 = new IconCompatParcelizer(dummyTrackOutput2, new write() { // from class: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.5
            @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.write
            public final int AudioAttributesCompatParcelizer() {
                return ExtendedFloatingActionButton.this.AudioAttributesImplApi26Parcelizer();
            }

            @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.write
            public final int RemoteActionCompatParcelizer() {
                return ExtendedFloatingActionButton.this.AudioAttributesImplApi26Parcelizer();
            }

            @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.write
            public final int read() {
                return ExtendedFloatingActionButton.this.AudioAttributesImplApi21Parcelizer();
            }

            @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.write
            public final int IconCompatParcelizer() {
                return ExtendedFloatingActionButton.this.AudioAttributesImplApi21Parcelizer();
            }

            @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.write
            public final ViewGroup.LayoutParams write() {
                return new ViewGroup.LayoutParams(AudioAttributesCompatParcelizer(), RemoteActionCompatParcelizer());
            }
        }, false);
        this.onPause = iconCompatParcelizer2;
        readVar.AudioAttributesCompatParcelizer(binarySearchSeekerSeekTimestampConverterAudioAttributesCompatParcelizer);
        audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(binarySearchSeekerSeekTimestampConverterAudioAttributesCompatParcelizer2);
        iconCompatParcelizer.AudioAttributesCompatParcelizer(binarySearchSeekerSeekTimestampConverterAudioAttributesCompatParcelizer3);
        iconCompatParcelizer2.AudioAttributesCompatParcelizer(binarySearchSeekerSeekTimestampConverterAudioAttributesCompatParcelizer4);
        typedArrayWrite.recycle();
        setShapeAppearanceModel(isValidFrameType.read(context2, attributeSet, i, i2, isValidFrameType.AudioAttributesCompatParcelizer).RemoteActionCompatParcelizer());
        MediaBrowserCompatSearchResultReceiver();
    }

    private write RemoteActionCompatParcelizer(int i) {
        final write writeVar = new write() { // from class: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.1
            @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.write
            public final int AudioAttributesCompatParcelizer() {
                int measuredWidth = ExtendedFloatingActionButton.this.getMeasuredWidth();
                int iAudioAttributesImplApi21Parcelizer = ExtendedFloatingActionButton.this.AudioAttributesImplApi21Parcelizer();
                return (measuredWidth - (iAudioAttributesImplApi21Parcelizer << 1)) + ExtendedFloatingActionButton.this.MediaBrowserCompatSearchResultReceiver + ExtendedFloatingActionButton.this.MediaDescriptionCompat;
            }

            @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.write
            public final int RemoteActionCompatParcelizer() {
                return ExtendedFloatingActionButton.this.getMeasuredHeight();
            }

            @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.write
            public final int read() {
                return ExtendedFloatingActionButton.this.MediaBrowserCompatSearchResultReceiver;
            }

            @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.write
            public final int IconCompatParcelizer() {
                return ExtendedFloatingActionButton.this.MediaDescriptionCompat;
            }

            @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.write
            public final ViewGroup.LayoutParams write() {
                return new ViewGroup.LayoutParams(-2, -2);
            }
        };
        final write writeVar2 = new write() { // from class: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.4
            @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.write
            public final int AudioAttributesCompatParcelizer() {
                ViewGroup.MarginLayoutParams marginLayoutParams;
                if (!(ExtendedFloatingActionButton.this.getParent() instanceof View)) {
                    return writeVar.AudioAttributesCompatParcelizer();
                }
                View view = (View) ExtendedFloatingActionButton.this.getParent();
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams != null && layoutParams.width == -2) {
                    return writeVar.AudioAttributesCompatParcelizer();
                }
                return (view.getWidth() - ((!(ExtendedFloatingActionButton.this.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams = (ViewGroup.MarginLayoutParams) ExtendedFloatingActionButton.this.getLayoutParams()) == null) ? 0 : marginLayoutParams.leftMargin + marginLayoutParams.rightMargin)) - (view.getPaddingLeft() + view.getPaddingRight());
            }

            @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.write
            public final int RemoteActionCompatParcelizer() {
                ViewGroup.MarginLayoutParams marginLayoutParams;
                if (ExtendedFloatingActionButton.this.onCustomAction != -1) {
                    if (ExtendedFloatingActionButton.this.onCustomAction != 0 && ExtendedFloatingActionButton.this.onCustomAction != -2) {
                        return ExtendedFloatingActionButton.this.onCustomAction;
                    }
                    return writeVar.RemoteActionCompatParcelizer();
                }
                if (!(ExtendedFloatingActionButton.this.getParent() instanceof View)) {
                    return writeVar.RemoteActionCompatParcelizer();
                }
                View view = (View) ExtendedFloatingActionButton.this.getParent();
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams != null && layoutParams.height == -2) {
                    return writeVar.RemoteActionCompatParcelizer();
                }
                return (view.getHeight() - ((!(ExtendedFloatingActionButton.this.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams = (ViewGroup.MarginLayoutParams) ExtendedFloatingActionButton.this.getLayoutParams()) == null) ? 0 : marginLayoutParams.topMargin + marginLayoutParams.bottomMargin)) - (view.getPaddingTop() + view.getPaddingBottom());
            }

            @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.write
            public final int read() {
                return ExtendedFloatingActionButton.this.MediaBrowserCompatSearchResultReceiver;
            }

            @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.write
            public final int IconCompatParcelizer() {
                return ExtendedFloatingActionButton.this.MediaDescriptionCompat;
            }

            @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.write
            public final ViewGroup.LayoutParams write() {
                return new ViewGroup.LayoutParams(-1, ExtendedFloatingActionButton.this.onCustomAction == 0 ? -2 : ExtendedFloatingActionButton.this.onCustomAction);
            }
        };
        return i != 1 ? i != 2 ? new write() { // from class: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.3
            @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.write
            public final int AudioAttributesCompatParcelizer() {
                if (ExtendedFloatingActionButton.this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver != -1) {
                    if (ExtendedFloatingActionButton.this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver != 0 && ExtendedFloatingActionButton.this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver != -2) {
                        return ExtendedFloatingActionButton.this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
                    }
                    return writeVar.AudioAttributesCompatParcelizer();
                }
                return writeVar2.AudioAttributesCompatParcelizer();
            }

            @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.write
            public final int RemoteActionCompatParcelizer() {
                if (ExtendedFloatingActionButton.this.onCustomAction != -1) {
                    if (ExtendedFloatingActionButton.this.onCustomAction != 0 && ExtendedFloatingActionButton.this.onCustomAction != -2) {
                        return ExtendedFloatingActionButton.this.onCustomAction;
                    }
                    return writeVar.RemoteActionCompatParcelizer();
                }
                return writeVar2.RemoteActionCompatParcelizer();
            }

            @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.write
            public final int read() {
                return ExtendedFloatingActionButton.this.MediaBrowserCompatSearchResultReceiver;
            }

            @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.write
            public final int IconCompatParcelizer() {
                return ExtendedFloatingActionButton.this.MediaDescriptionCompat;
            }

            @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.write
            public final ViewGroup.LayoutParams write() {
                return new ViewGroup.LayoutParams(ExtendedFloatingActionButton.this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver == 0 ? -2 : ExtendedFloatingActionButton.this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, ExtendedFloatingActionButton.this.onCustomAction != 0 ? ExtendedFloatingActionButton.this.onCustomAction : -2);
            }
        } : writeVar2 : writeVar;
    }

    @Override // android.widget.TextView
    public void setTextColor(int i) {
        super.setTextColor(i);
        MediaBrowserCompatSearchResultReceiver();
    }

    @Override // android.widget.TextView
    public void setTextColor(ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
        MediaBrowserCompatSearchResultReceiver();
    }

    private void MediaBrowserCompatSearchResultReceiver() {
        this.IconCompatParcelizer = getTextColors();
    }

    public final void AudioAttributesCompatParcelizer(ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
    }

    @Override // com.google.android.material.button.MaterialButton, android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.handleMediaPlayPauseIfPendingOnHandler && TextUtils.isEmpty(getText()) && RemoteActionCompatParcelizer() != null) {
            this.handleMediaPlayPauseIfPendingOnHandler = false;
            this.onPause.AudioAttributesImplBaseParcelizer();
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.read
    public final CoordinatorLayout.Behavior<ExtendedFloatingActionButton> write() {
        return this.MediaBrowserCompatItemReceiver;
    }

    public void setExtended(boolean z) {
        if (this.handleMediaPlayPauseIfPendingOnHandler != z) {
            Extractor extractor = z ? this.MediaBrowserCompatMediaItem : this.onPause;
            if (extractor.AudioAttributesImplApi21Parcelizer()) {
                return;
            }
            extractor.AudioAttributesImplBaseParcelizer();
        }
    }

    public void setAnimateShowBeforeLayout(boolean z) {
        this.MediaBrowserCompatCustomActionResultReceiver = z;
    }

    @Override // android.widget.TextView, android.view.View
    public void setPaddingRelative(int i, int i2, int i3, int i4) {
        super.setPaddingRelative(i, i2, i3, i4);
        if (!this.handleMediaPlayPauseIfPendingOnHandler || this.onCommand) {
            return;
        }
        this.MediaBrowserCompatSearchResultReceiver = i;
        this.MediaDescriptionCompat = i3;
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
        super.setPadding(i, i2, i3, i4);
        if (!this.handleMediaPlayPauseIfPendingOnHandler || this.onCommand) {
            return;
        }
        this.MediaBrowserCompatSearchResultReceiver = InvalidTypeIdException.onCommand(this);
        this.MediaDescriptionCompat = InvalidTypeIdException.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(this);
    }

    public void setShowMotionSpec(BinarySearchSeekerSeekTimestampConverter binarySearchSeekerSeekTimestampConverter) {
        this.onMediaButtonEvent.AudioAttributesCompatParcelizer(binarySearchSeekerSeekTimestampConverter);
    }

    public void setShowMotionSpecResource(int i) {
        setShowMotionSpec(BinarySearchSeekerSeekTimestampConverter.write(getContext(), i));
    }

    public void setHideMotionSpec(BinarySearchSeekerSeekTimestampConverter binarySearchSeekerSeekTimestampConverter) {
        this.onAddQueueItem.AudioAttributesCompatParcelizer(binarySearchSeekerSeekTimestampConverter);
    }

    public void setHideMotionSpecResource(int i) {
        setHideMotionSpec(BinarySearchSeekerSeekTimestampConverter.write(getContext(), i));
    }

    public void setExtendMotionSpec(BinarySearchSeekerSeekTimestampConverter binarySearchSeekerSeekTimestampConverter) {
        this.MediaBrowserCompatMediaItem.AudioAttributesCompatParcelizer(binarySearchSeekerSeekTimestampConverter);
    }

    public void setExtendMotionSpecResource(int i) {
        setExtendMotionSpec(BinarySearchSeekerSeekTimestampConverter.write(getContext(), i));
    }

    public void setShrinkMotionSpec(BinarySearchSeekerSeekTimestampConverter binarySearchSeekerSeekTimestampConverter) {
        this.onPause.AudioAttributesCompatParcelizer(binarySearchSeekerSeekTimestampConverter);
    }

    public void setShrinkMotionSpecResource(int i) {
        setShrinkMotionSpec(BinarySearchSeekerSeekTimestampConverter.write(getContext(), i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void RemoteActionCompatParcelizer(int i, final RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        final Extractor extractor;
        if (i == 0) {
            extractor = this.onMediaButtonEvent;
        } else if (i == 1) {
            extractor = this.onAddQueueItem;
        } else if (i == 2) {
            extractor = this.onPause;
        } else if (i == 3) {
            extractor = this.MediaBrowserCompatMediaItem;
        } else {
            throw new IllegalStateException("Unknown strategy type: ".concat(String.valueOf(i)));
        }
        if (extractor.AudioAttributesImplApi21Parcelizer()) {
            return;
        }
        if (!RatingCompat()) {
            extractor.AudioAttributesImplBaseParcelizer();
            extractor.write(remoteActionCompatParcelizer);
            return;
        }
        if (i == 2) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams != null) {
                this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = layoutParams.width;
                this.onCustomAction = layoutParams.height;
            } else {
                this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = getWidth();
                this.onCustomAction = getHeight();
            }
        }
        measure(0, 0);
        AnimatorSet animatorSetAudioAttributesCompatParcelizer = extractor.AudioAttributesCompatParcelizer();
        animatorSetAudioAttributesCompatParcelizer.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.2
            private boolean RemoteActionCompatParcelizer;

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
                extractor.write(animator);
                this.RemoteActionCompatParcelizer = false;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationCancel(Animator animator) {
                this.RemoteActionCompatParcelizer = true;
                extractor.IconCompatParcelizer();
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                extractor.read();
                if (this.RemoteActionCompatParcelizer) {
                    return;
                }
                extractor.write(remoteActionCompatParcelizer);
            }
        });
        Iterator<Animator.AnimatorListener> it = extractor.RemoteActionCompatParcelizer().iterator();
        while (it.hasNext()) {
            animatorSetAudioAttributesCompatParcelizer.addListener(it.next());
        }
        animatorSetAudioAttributesCompatParcelizer.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean MediaDescriptionCompat() {
        return getVisibility() != 0 ? this.AudioAttributesImplApi21Parcelizer == 2 : this.AudioAttributesImplApi21Parcelizer != 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean AudioAttributesImplBaseParcelizer() {
        return getVisibility() == 0 ? this.AudioAttributesImplApi21Parcelizer == 1 : this.AudioAttributesImplApi21Parcelizer != 2;
    }

    private boolean RatingCompat() {
        return (InvalidTypeIdException.onSeekTo(this) || (!MediaDescriptionCompat() && this.MediaBrowserCompatCustomActionResultReceiver)) && !isInEditMode();
    }

    final int AudioAttributesImplApi26Parcelizer() {
        int i = this.RatingCompat;
        return i < 0 ? (Math.min(InvalidTypeIdException.onCommand(this), InvalidTypeIdException.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(this)) << 1) + IconCompatParcelizer() : i;
    }

    final int AudioAttributesImplApi21Parcelizer() {
        return (AudioAttributesImplApi26Parcelizer() - IconCompatParcelizer()) / 2;
    }

    protected static class ExtendedFloatingActionButtonBehavior<T extends ExtendedFloatingActionButton> extends CoordinatorLayout.Behavior<T> {
        private RemoteActionCompatParcelizer AudioAttributesCompatParcelizer;
        private boolean IconCompatParcelizer;
        private boolean RemoteActionCompatParcelizer;
        private RemoteActionCompatParcelizer read;
        private Rect write;

        public ExtendedFloatingActionButtonBehavior() {
            this.RemoteActionCompatParcelizer = false;
            this.IconCompatParcelizer = true;
        }

        public ExtendedFloatingActionButtonBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, calculateNextSearchBytePosition.MediaMetadataCompat.ExtendedFloatingActionButton_Behavior_Layout);
            this.RemoteActionCompatParcelizer = typedArrayObtainStyledAttributes.getBoolean(calculateNextSearchBytePosition.MediaMetadataCompat.ExtendedFloatingActionButton_Behavior_Layout_behavior_autoHide, false);
            this.IconCompatParcelizer = typedArrayObtainStyledAttributes.getBoolean(calculateNextSearchBytePosition.MediaMetadataCompat.ExtendedFloatingActionButton_Behavior_Layout_behavior_autoShrink, true);
            typedArrayObtainStyledAttributes.recycle();
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public boolean RemoteActionCompatParcelizer(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, Rect rect) {
            return super.RemoteActionCompatParcelizer(coordinatorLayout, extendedFloatingActionButton, rect);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final void IconCompatParcelizer(CoordinatorLayout.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
            if (remoteActionCompatParcelizer.RemoteActionCompatParcelizer == 0) {
                remoteActionCompatParcelizer.RemoteActionCompatParcelizer = 80;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public boolean IconCompatParcelizer(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, View view) {
            if (view instanceof AppBarLayout) {
                write(coordinatorLayout, (AppBarLayout) view, extendedFloatingActionButton);
                return false;
            }
            if (!IconCompatParcelizer(view)) {
                return false;
            }
            AudioAttributesCompatParcelizer(view, extendedFloatingActionButton);
            return false;
        }

        private static boolean IconCompatParcelizer(View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.RemoteActionCompatParcelizer) {
                return ((CoordinatorLayout.RemoteActionCompatParcelizer) layoutParams).write() instanceof BottomSheetBehavior;
            }
            return false;
        }

        private boolean IconCompatParcelizer(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            return (this.RemoteActionCompatParcelizer || this.IconCompatParcelizer) && ((CoordinatorLayout.RemoteActionCompatParcelizer) extendedFloatingActionButton.getLayoutParams()).RemoteActionCompatParcelizer() == view.getId();
        }

        private boolean write(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!IconCompatParcelizer(appBarLayout, extendedFloatingActionButton)) {
                return false;
            }
            if (this.write == null) {
                this.write = new Rect();
            }
            Rect rect = this.write;
            ExtractorOutput.AudioAttributesCompatParcelizer(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.read()) {
                AudioAttributesCompatParcelizer(extendedFloatingActionButton);
                return true;
            }
            read(extendedFloatingActionButton);
            return true;
        }

        private boolean AudioAttributesCompatParcelizer(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!IconCompatParcelizer(view, extendedFloatingActionButton)) {
                return false;
            }
            if (view.getTop() < (extendedFloatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.RemoteActionCompatParcelizer) extendedFloatingActionButton.getLayoutParams())).topMargin) {
                AudioAttributesCompatParcelizer(extendedFloatingActionButton);
                return true;
            }
            read(extendedFloatingActionButton);
            return true;
        }

        private void AudioAttributesCompatParcelizer(ExtendedFloatingActionButton extendedFloatingActionButton) {
            extendedFloatingActionButton.RemoteActionCompatParcelizer(this.IconCompatParcelizer ? 2 : 1, (RemoteActionCompatParcelizer) null);
        }

        private void read(ExtendedFloatingActionButton extendedFloatingActionButton) {
            extendedFloatingActionButton.RemoteActionCompatParcelizer(this.IconCompatParcelizer ? 3 : 0, (RemoteActionCompatParcelizer) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public boolean write(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, int i) {
            List<View> listRemoteActionCompatParcelizer = coordinatorLayout.RemoteActionCompatParcelizer(extendedFloatingActionButton);
            int size = listRemoteActionCompatParcelizer.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view = listRemoteActionCompatParcelizer.get(i2);
                if (view instanceof AppBarLayout) {
                    if (write(coordinatorLayout, (AppBarLayout) view, extendedFloatingActionButton)) {
                        break;
                    }
                } else {
                    if (IconCompatParcelizer(view) && AudioAttributesCompatParcelizer(view, extendedFloatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.write(extendedFloatingActionButton, i);
            return true;
        }
    }

    class IconCompatParcelizer extends AbstractC0213track {
        private final write RemoteActionCompatParcelizer;
        private final boolean write;

        @Override // kotlin.Extractor
        public final void write(RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        }

        IconCompatParcelizer(DummyTrackOutput dummyTrackOutput, write writeVar, boolean z) {
            super(ExtendedFloatingActionButton.this, dummyTrackOutput);
            this.RemoteActionCompatParcelizer = writeVar;
            this.write = z;
        }

        @Override // kotlin.Extractor
        public final void AudioAttributesImplBaseParcelizer() {
            ExtendedFloatingActionButton.this.handleMediaPlayPauseIfPendingOnHandler = this.write;
            ViewGroup.LayoutParams layoutParams = ExtendedFloatingActionButton.this.getLayoutParams();
            if (layoutParams == null) {
                return;
            }
            if (!this.write) {
                ExtendedFloatingActionButton.this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = layoutParams.width;
                ExtendedFloatingActionButton.this.onCustomAction = layoutParams.height;
            }
            layoutParams.width = this.RemoteActionCompatParcelizer.write().width;
            layoutParams.height = this.RemoteActionCompatParcelizer.write().height;
            InvalidTypeIdException.read(ExtendedFloatingActionButton.this, this.RemoteActionCompatParcelizer.read(), ExtendedFloatingActionButton.this.getPaddingTop(), this.RemoteActionCompatParcelizer.IconCompatParcelizer(), ExtendedFloatingActionButton.this.getPaddingBottom());
            ExtendedFloatingActionButton.this.requestLayout();
        }

        @Override // kotlin.Extractor
        public final int MediaBrowserCompatCustomActionResultReceiver() {
            if (this.write) {
                return calculateNextSearchBytePosition.RemoteActionCompatParcelizer.mtrl_extended_fab_change_size_expand_motion_spec;
            }
            return calculateNextSearchBytePosition.RemoteActionCompatParcelizer.mtrl_extended_fab_change_size_collapse_motion_spec;
        }

        @Override // kotlin.AbstractC0213track, kotlin.Extractor
        public final AnimatorSet AudioAttributesCompatParcelizer() {
            BinarySearchSeekerSeekTimestampConverter binarySearchSeekerSeekTimestampConverterWrite = write();
            if (binarySearchSeekerSeekTimestampConverterWrite.IconCompatParcelizer("width")) {
                PropertyValuesHolder[] propertyValuesHolderArrWrite = binarySearchSeekerSeekTimestampConverterWrite.write("width");
                propertyValuesHolderArrWrite[0].setFloatValues(ExtendedFloatingActionButton.this.getWidth(), this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer());
                binarySearchSeekerSeekTimestampConverterWrite.read("width", propertyValuesHolderArrWrite);
            }
            if (binarySearchSeekerSeekTimestampConverterWrite.IconCompatParcelizer("height")) {
                PropertyValuesHolder[] propertyValuesHolderArrWrite2 = binarySearchSeekerSeekTimestampConverterWrite.write("height");
                propertyValuesHolderArrWrite2[0].setFloatValues(ExtendedFloatingActionButton.this.getHeight(), this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer());
                binarySearchSeekerSeekTimestampConverterWrite.read("height", propertyValuesHolderArrWrite2);
            }
            if (binarySearchSeekerSeekTimestampConverterWrite.IconCompatParcelizer("paddingStart")) {
                PropertyValuesHolder[] propertyValuesHolderArrWrite3 = binarySearchSeekerSeekTimestampConverterWrite.write("paddingStart");
                propertyValuesHolderArrWrite3[0].setFloatValues(InvalidTypeIdException.onCommand(ExtendedFloatingActionButton.this), this.RemoteActionCompatParcelizer.read());
                binarySearchSeekerSeekTimestampConverterWrite.read("paddingStart", propertyValuesHolderArrWrite3);
            }
            if (binarySearchSeekerSeekTimestampConverterWrite.IconCompatParcelizer("paddingEnd")) {
                PropertyValuesHolder[] propertyValuesHolderArrWrite4 = binarySearchSeekerSeekTimestampConverterWrite.write("paddingEnd");
                propertyValuesHolderArrWrite4[0].setFloatValues(InvalidTypeIdException.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(ExtendedFloatingActionButton.this), this.RemoteActionCompatParcelizer.IconCompatParcelizer());
                binarySearchSeekerSeekTimestampConverterWrite.read("paddingEnd", propertyValuesHolderArrWrite4);
            }
            if (binarySearchSeekerSeekTimestampConverterWrite.IconCompatParcelizer("labelOpacity")) {
                PropertyValuesHolder[] propertyValuesHolderArrWrite5 = binarySearchSeekerSeekTimestampConverterWrite.write("labelOpacity");
                boolean z = this.write;
                propertyValuesHolderArrWrite5[0].setFloatValues(z ? 0.0f : 1.0f, z ? 1.0f : 0.0f);
                binarySearchSeekerSeekTimestampConverterWrite.read("labelOpacity", propertyValuesHolderArrWrite5);
            }
            return super.read(binarySearchSeekerSeekTimestampConverterWrite);
        }

        @Override // kotlin.AbstractC0213track, kotlin.Extractor
        public final void write(Animator animator) {
            super.write(animator);
            ExtendedFloatingActionButton.this.handleMediaPlayPauseIfPendingOnHandler = this.write;
            ExtendedFloatingActionButton.this.onCommand = true;
            ExtendedFloatingActionButton.this.setHorizontallyScrolling(true);
        }

        @Override // kotlin.AbstractC0213track, kotlin.Extractor
        public final void read() {
            super.read();
            ExtendedFloatingActionButton.this.onCommand = false;
            ExtendedFloatingActionButton.this.setHorizontallyScrolling(false);
            ViewGroup.LayoutParams layoutParams = ExtendedFloatingActionButton.this.getLayoutParams();
            if (layoutParams == null) {
                return;
            }
            layoutParams.width = this.RemoteActionCompatParcelizer.write().width;
            layoutParams.height = this.RemoteActionCompatParcelizer.write().height;
        }

        @Override // kotlin.Extractor
        public final boolean AudioAttributesImplApi21Parcelizer() {
            return this.write == ExtendedFloatingActionButton.this.handleMediaPlayPauseIfPendingOnHandler || ExtendedFloatingActionButton.this.RemoteActionCompatParcelizer() == null || TextUtils.isEmpty(ExtendedFloatingActionButton.this.getText());
        }
    }

    class read extends AbstractC0213track {
        @Override // kotlin.Extractor
        public final void write(RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        }

        public read(DummyTrackOutput dummyTrackOutput) {
            super(ExtendedFloatingActionButton.this, dummyTrackOutput);
        }

        @Override // kotlin.Extractor
        public final void AudioAttributesImplBaseParcelizer() {
            ExtendedFloatingActionButton.this.setVisibility(0);
            ExtendedFloatingActionButton.this.setAlpha(1.0f);
            ExtendedFloatingActionButton.this.setScaleY(1.0f);
            ExtendedFloatingActionButton.this.setScaleX(1.0f);
        }

        @Override // kotlin.Extractor
        public final int MediaBrowserCompatCustomActionResultReceiver() {
            return calculateNextSearchBytePosition.RemoteActionCompatParcelizer.mtrl_extended_fab_show_motion_spec;
        }

        @Override // kotlin.AbstractC0213track, kotlin.Extractor
        public final void write(Animator animator) {
            super.write(animator);
            ExtendedFloatingActionButton.this.setVisibility(0);
            ExtendedFloatingActionButton.this.AudioAttributesImplApi21Parcelizer = 2;
        }

        @Override // kotlin.AbstractC0213track, kotlin.Extractor
        public final void read() {
            super.read();
            ExtendedFloatingActionButton.this.AudioAttributesImplApi21Parcelizer = 0;
        }

        @Override // kotlin.Extractor
        public final boolean AudioAttributesImplApi21Parcelizer() {
            return ExtendedFloatingActionButton.this.MediaDescriptionCompat();
        }
    }

    class AudioAttributesCompatParcelizer extends AbstractC0213track {
        private boolean AudioAttributesCompatParcelizer;

        @Override // kotlin.Extractor
        public final void write(RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        }

        public AudioAttributesCompatParcelizer(DummyTrackOutput dummyTrackOutput) {
            super(ExtendedFloatingActionButton.this, dummyTrackOutput);
        }

        @Override // kotlin.Extractor
        public final void AudioAttributesImplBaseParcelizer() {
            ExtendedFloatingActionButton.this.setVisibility(8);
        }

        @Override // kotlin.Extractor
        public final boolean AudioAttributesImplApi21Parcelizer() {
            return ExtendedFloatingActionButton.this.AudioAttributesImplBaseParcelizer();
        }

        @Override // kotlin.Extractor
        public final int MediaBrowserCompatCustomActionResultReceiver() {
            return calculateNextSearchBytePosition.RemoteActionCompatParcelizer.mtrl_extended_fab_hide_motion_spec;
        }

        @Override // kotlin.AbstractC0213track, kotlin.Extractor
        public final void write(Animator animator) {
            super.write(animator);
            this.AudioAttributesCompatParcelizer = false;
            ExtendedFloatingActionButton.this.setVisibility(0);
            ExtendedFloatingActionButton.this.AudioAttributesImplApi21Parcelizer = 1;
        }

        @Override // kotlin.AbstractC0213track, kotlin.Extractor
        public final void IconCompatParcelizer() {
            super.IconCompatParcelizer();
            this.AudioAttributesCompatParcelizer = true;
        }

        @Override // kotlin.AbstractC0213track, kotlin.Extractor
        public final void read() {
            super.read();
            ExtendedFloatingActionButton.this.AudioAttributesImplApi21Parcelizer = 0;
            if (this.AudioAttributesCompatParcelizer) {
                return;
            }
            ExtendedFloatingActionButton.this.setVisibility(8);
        }
    }
}
