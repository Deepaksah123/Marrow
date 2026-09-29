package kotlin;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.util.Property;
import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.calculateNextSearchBytePosition;

/* JADX INFO: loaded from: classes5.dex */
public class sampleData {
    seek AudioAttributesImplApi21Parcelizer;
    Drawable AudioAttributesImplApi26Parcelizer;
    float AudioAttributesImplBaseParcelizer;
    Drawable MediaBrowserCompatMediaItem;
    int MediaBrowserCompatSearchResultReceiver;
    isValidFrameType MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    float MediaDescriptionCompat;
    final readVorbisModes MediaMetadataCompat;
    float RatingCompat;
    frameSizeBytesByTypeNb handleMediaPlayPauseIfPendingOnHandler;
    final FloatingActionButton onAddQueueItem;
    private Animator onPause;
    private boolean onPlayFromMediaId;
    private BinarySearchSeekerSeekTimestampConverter onPlayFromUri;
    private ArrayList<Animator.AnimatorListener> onPrepare;
    private ViewTreeObserver.OnPreDrawListener onPrepareFromMediaId;
    private int onPrepareFromSearch;
    private ArrayList<Animator.AnimatorListener> onPrepareFromUri;
    private final checkChannelAssignment onRemoveQueueItem;
    private float onRemoveQueueItemAt;
    private BinarySearchSeekerSeekTimestampConverter onRewind;
    private ArrayList<write> onSetPlaybackSpeed;
    static final TimeInterpolator RemoteActionCompatParcelizer = BinarySearchSeekerSeekOperationParams.IconCompatParcelizer;
    private static final int onMediaButtonEvent = calculateNextSearchBytePosition.IconCompatParcelizer.motionDurationLong2;
    private static final int onFastForward = calculateNextSearchBytePosition.IconCompatParcelizer.motionEasingEmphasizedInterpolator;
    private static final int onCustomAction = calculateNextSearchBytePosition.IconCompatParcelizer.motionDurationMedium1;
    private static final int onCommand = calculateNextSearchBytePosition.IconCompatParcelizer.motionEasingEmphasizedAccelerateInterpolator;
    static final int[] MediaBrowserCompatItemReceiver = {R.attr.state_pressed, R.attr.state_enabled};
    static final int[] MediaBrowserCompatCustomActionResultReceiver = {R.attr.state_hovered, R.attr.state_focused, R.attr.state_enabled};
    static final int[] read = {R.attr.state_focused, R.attr.state_enabled};
    static final int[] AudioAttributesCompatParcelizer = {R.attr.state_hovered, R.attr.state_enabled};
    static final int[] IconCompatParcelizer = {R.attr.state_enabled};
    static final int[] write = new int[0];
    private boolean onSeekTo = true;
    private float onPlayFromSearch = 1.0f;
    private int onPlay = 0;
    private final Rect onSetRepeatMode = new Rect();
    private final RectF onSetCaptioningEnabled = new RectF();
    private final RectF onSetRating = new RectF();
    private final Matrix onSetShuffleMode = new Matrix();

    public interface AudioAttributesCompatParcelizer {
        void IconCompatParcelizer();

        void RemoteActionCompatParcelizer();
    }

    public interface write {
        void AudioAttributesCompatParcelizer();

        void write();
    }

    boolean MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        return true;
    }

    public void MediaDescriptionCompat() {
    }

    boolean handleMediaPlayPauseIfPendingOnHandler() {
        return true;
    }

    sampleData(FloatingActionButton floatingActionButton, readVorbisModes readvorbismodes) {
        this.onAddQueueItem = floatingActionButton;
        this.MediaMetadataCompat = readvorbismodes;
        checkChannelAssignment checkchannelassignment = new checkChannelAssignment();
        this.onRemoveQueueItem = checkchannelassignment;
        checkchannelassignment.write(MediaBrowserCompatItemReceiver, write(new RemoteActionCompatParcelizer()));
        checkchannelassignment.write(MediaBrowserCompatCustomActionResultReceiver, write(new IconCompatParcelizer()));
        checkchannelassignment.write(read, write(new IconCompatParcelizer()));
        checkchannelassignment.write(AudioAttributesCompatParcelizer, write(new IconCompatParcelizer()));
        checkchannelassignment.write(IconCompatParcelizer, write(new MediaBrowserCompatCustomActionResultReceiver()));
        checkchannelassignment.write(write, write(new read()));
        this.onRemoveQueueItemAt = floatingActionButton.getRotation();
    }

    public void read(ColorStateList colorStateList, PorterDuff.Mode mode, ColorStateList colorStateList2, int i) {
        frameSizeBytesByTypeNb framesizebytesbytypenbAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer();
        this.handleMediaPlayPauseIfPendingOnHandler = framesizebytesbytypenbAudioAttributesCompatParcelizer;
        framesizebytesbytypenbAudioAttributesCompatParcelizer.setTintList(colorStateList);
        if (mode != null) {
            this.handleMediaPlayPauseIfPendingOnHandler.setTintMode(mode);
        }
        this.handleMediaPlayPauseIfPendingOnHandler.onSetCaptioningEnabled();
        this.handleMediaPlayPauseIfPendingOnHandler.RemoteActionCompatParcelizer(this.onAddQueueItem.getContext());
        TrueHdSampleRechunker trueHdSampleRechunker = new TrueHdSampleRechunker(this.handleMediaPlayPauseIfPendingOnHandler.onPlayFromUri());
        trueHdSampleRechunker.setTintList(outputPendingSampleMetadata.RemoteActionCompatParcelizer(colorStateList2));
        this.MediaBrowserCompatMediaItem = trueHdSampleRechunker;
        this.AudioAttributesImplApi26Parcelizer = new LayerDrawable(new Drawable[]{(Drawable) StringCollectionDeserializer.RemoteActionCompatParcelizer(this.handleMediaPlayPauseIfPendingOnHandler), trueHdSampleRechunker});
    }

    public final void read(ColorStateList colorStateList) {
        frameSizeBytesByTypeNb framesizebytesbytypenb = this.handleMediaPlayPauseIfPendingOnHandler;
        if (framesizebytesbytypenb != null) {
            framesizebytesbytypenb.setTintList(colorStateList);
        }
        seek seekVar = this.AudioAttributesImplApi21Parcelizer;
        if (seekVar != null) {
            seekVar.RemoteActionCompatParcelizer(colorStateList);
        }
    }

    public final void RemoteActionCompatParcelizer(PorterDuff.Mode mode) {
        frameSizeBytesByTypeNb framesizebytesbytypenb = this.handleMediaPlayPauseIfPendingOnHandler;
        if (framesizebytesbytypenb != null) {
            framesizebytesbytypenb.setTintMode(mode);
        }
    }

    public final void RemoteActionCompatParcelizer(int i) {
        this.MediaBrowserCompatSearchResultReceiver = i;
    }

    public void AudioAttributesCompatParcelizer(ColorStateList colorStateList) {
        Drawable drawable = this.MediaBrowserCompatMediaItem;
        if (drawable != null) {
            findFormatOverrides.AudioAttributesCompatParcelizer(drawable, outputPendingSampleMetadata.RemoteActionCompatParcelizer(colorStateList));
        }
    }

    public final void IconCompatParcelizer(float f) {
        if (this.AudioAttributesImplBaseParcelizer != f) {
            this.AudioAttributesImplBaseParcelizer = f;
            RemoteActionCompatParcelizer(f, this.MediaDescriptionCompat, this.RatingCompat);
        }
    }

    float read() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    public final void write(float f) {
        if (this.MediaDescriptionCompat != f) {
            this.MediaDescriptionCompat = f;
            RemoteActionCompatParcelizer(this.AudioAttributesImplBaseParcelizer, f, this.RatingCompat);
        }
    }

    public final void AudioAttributesCompatParcelizer(float f) {
        if (this.RatingCompat != f) {
            this.RatingCompat = f;
            RemoteActionCompatParcelizer(this.AudioAttributesImplBaseParcelizer, this.MediaDescriptionCompat, f);
        }
    }

    public final void read(int i) {
        if (this.onPrepareFromSearch != i) {
            this.onPrepareFromSearch = i;
            onPlay();
        }
    }

    public final void onPlay() {
        RemoteActionCompatParcelizer(this.onPlayFromSearch);
    }

    private void RemoteActionCompatParcelizer(float f) {
        this.onPlayFromSearch = f;
        Matrix matrix = this.onSetShuffleMode;
        write(f, matrix);
        this.onAddQueueItem.setImageMatrix(matrix);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void write(float f, Matrix matrix) {
        matrix.reset();
        if (this.onAddQueueItem.getDrawable() == null || this.onPrepareFromSearch == 0) {
            return;
        }
        RectF rectF = this.onSetCaptioningEnabled;
        RectF rectF2 = this.onSetRating;
        rectF.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, r0.getIntrinsicWidth(), r0.getIntrinsicHeight());
        float f2 = this.onPrepareFromSearch;
        rectF2.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f2, f2);
        matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
        float f3 = this.onPrepareFromSearch / 2.0f;
        matrix.postScale(f, f, f3, f3);
    }

    public final void write(isValidFrameType isvalidframetype) {
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = isvalidframetype;
        frameSizeBytesByTypeNb framesizebytesbytypenb = this.handleMediaPlayPauseIfPendingOnHandler;
        if (framesizebytesbytypenb != null) {
            framesizebytesbytypenb.setShapeAppearanceModel(isvalidframetype);
        }
        Object obj = this.MediaBrowserCompatMediaItem;
        if (obj instanceof readSample) {
            ((readSample) obj).setShapeAppearanceModel(isvalidframetype);
        }
        seek seekVar = this.AudioAttributesImplApi21Parcelizer;
        if (seekVar != null) {
            seekVar.RemoteActionCompatParcelizer(isvalidframetype);
        }
    }

    public final isValidFrameType RemoteActionCompatParcelizer() {
        return this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    }

    public final BinarySearchSeekerSeekTimestampConverter AudioAttributesImplApi26Parcelizer() {
        return this.onRewind;
    }

    public final void RemoteActionCompatParcelizer(BinarySearchSeekerSeekTimestampConverter binarySearchSeekerSeekTimestampConverter) {
        this.onRewind = binarySearchSeekerSeekTimestampConverter;
    }

    public final BinarySearchSeekerSeekTimestampConverter IconCompatParcelizer() {
        return this.onPlayFromUri;
    }

    public final void write(BinarySearchSeekerSeekTimestampConverter binarySearchSeekerSeekTimestampConverter) {
        this.onPlayFromUri = binarySearchSeekerSeekTimestampConverter;
    }

    final boolean onAddQueueItem() {
        return !this.onPlayFromMediaId || this.onAddQueueItem.MediaBrowserCompatCustomActionResultReceiver() >= this.MediaBrowserCompatSearchResultReceiver;
    }

    public final boolean write() {
        return this.onPlayFromMediaId;
    }

    public final void RemoteActionCompatParcelizer(boolean z) {
        this.onPlayFromMediaId = z;
    }

    public final void write(boolean z) {
        this.onSeekTo = z;
        onMediaButtonEvent();
    }

    void RemoteActionCompatParcelizer(float f, float f2, float f3) {
        AudioAttributesImplBaseParcelizer();
        onMediaButtonEvent();
        read(f);
    }

    public final void read(float f) {
        frameSizeBytesByTypeNb framesizebytesbytypenb = this.handleMediaPlayPauseIfPendingOnHandler;
        if (framesizebytesbytypenb != null) {
            framesizebytesbytypenb.handleMediaPlayPauseIfPendingOnHandler(f);
        }
    }

    public void RemoteActionCompatParcelizer(int[] iArr) {
        this.onRemoveQueueItem.read(iArr);
    }

    public void AudioAttributesImplBaseParcelizer() {
        this.onRemoveQueueItem.AudioAttributesCompatParcelizer();
    }

    public final void RemoteActionCompatParcelizer(Animator.AnimatorListener animatorListener) {
        if (this.onPrepareFromUri == null) {
            this.onPrepareFromUri = new ArrayList<>();
        }
        this.onPrepareFromUri.add(animatorListener);
    }

    public final void AudioAttributesCompatParcelizer(Animator.AnimatorListener animatorListener) {
        if (this.onPrepare == null) {
            this.onPrepare = new ArrayList<>();
        }
        this.onPrepare.add(animatorListener);
    }

    public final void write(final AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, final boolean z) {
        AnimatorSet animatorSetAudioAttributesCompatParcelizer;
        if (MediaBrowserCompatCustomActionResultReceiver()) {
            return;
        }
        Animator animator = this.onPause;
        if (animator != null) {
            animator.cancel();
        }
        if (onFastForward()) {
            BinarySearchSeekerSeekTimestampConverter binarySearchSeekerSeekTimestampConverter = this.onPlayFromUri;
            if (binarySearchSeekerSeekTimestampConverter != null) {
                animatorSetAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(binarySearchSeekerSeekTimestampConverter, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
            } else {
                animatorSetAudioAttributesCompatParcelizer = read(BitmapDescriptorFactory.HUE_RED, 0.4f, 0.4f, onCustomAction, onCommand);
            }
            animatorSetAudioAttributesCompatParcelizer.addListener(new AnimatorListenerAdapter() { // from class: o.sampleData.3
                private boolean write;

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationStart(Animator animator2) {
                    sampleData.this.onAddQueueItem.RemoteActionCompatParcelizer(0, z);
                    sampleData.this.onPlay = 1;
                    sampleData.this.onPause = animator2;
                    this.write = false;
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationCancel(Animator animator2) {
                    this.write = true;
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator2) {
                    sampleData.this.onPlay = 0;
                    sampleData.this.onPause = null;
                    if (this.write) {
                        return;
                    }
                    FloatingActionButton floatingActionButton = sampleData.this.onAddQueueItem;
                    boolean z2 = z;
                    floatingActionButton.RemoteActionCompatParcelizer(z2 ? 8 : 4, z2);
                    AudioAttributesCompatParcelizer audioAttributesCompatParcelizer2 = audioAttributesCompatParcelizer;
                    if (audioAttributesCompatParcelizer2 != null) {
                        audioAttributesCompatParcelizer2.RemoteActionCompatParcelizer();
                    }
                }
            });
            ArrayList<Animator.AnimatorListener> arrayList = this.onPrepare;
            if (arrayList != null) {
                Iterator<Animator.AnimatorListener> it = arrayList.iterator();
                while (it.hasNext()) {
                    animatorSetAudioAttributesCompatParcelizer.addListener(it.next());
                }
            }
            animatorSetAudioAttributesCompatParcelizer.start();
            return;
        }
        this.onAddQueueItem.RemoteActionCompatParcelizer(z ? 8 : 4, z);
        if (audioAttributesCompatParcelizer != null) {
            audioAttributesCompatParcelizer.RemoteActionCompatParcelizer();
        }
    }

    public final void IconCompatParcelizer(final AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, final boolean z) {
        AnimatorSet animatorSetAudioAttributesCompatParcelizer;
        if (MediaBrowserCompatItemReceiver()) {
            return;
        }
        Animator animator = this.onPause;
        if (animator != null) {
            animator.cancel();
        }
        boolean z2 = this.onRewind == null;
        if (onFastForward()) {
            if (this.onAddQueueItem.getVisibility() != 0) {
                FloatingActionButton floatingActionButton = this.onAddQueueItem;
                float f = BitmapDescriptorFactory.HUE_RED;
                floatingActionButton.setAlpha(BitmapDescriptorFactory.HUE_RED);
                this.onAddQueueItem.setScaleY(z2 ? 0.4f : 0.0f);
                this.onAddQueueItem.setScaleX(z2 ? 0.4f : 0.0f);
                if (z2) {
                    f = 0.4f;
                }
                RemoteActionCompatParcelizer(f);
            }
            BinarySearchSeekerSeekTimestampConverter binarySearchSeekerSeekTimestampConverter = this.onRewind;
            if (binarySearchSeekerSeekTimestampConverter != null) {
                animatorSetAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(binarySearchSeekerSeekTimestampConverter, 1.0f, 1.0f, 1.0f);
            } else {
                animatorSetAudioAttributesCompatParcelizer = read(1.0f, 1.0f, 1.0f, onMediaButtonEvent, onFastForward);
            }
            animatorSetAudioAttributesCompatParcelizer.addListener(new AnimatorListenerAdapter() { // from class: o.sampleData.1
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationStart(Animator animator2) {
                    sampleData.this.onAddQueueItem.RemoteActionCompatParcelizer(0, z);
                    sampleData.this.onPlay = 2;
                    sampleData.this.onPause = animator2;
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator2) {
                    sampleData.this.onPlay = 0;
                    sampleData.this.onPause = null;
                    AudioAttributesCompatParcelizer audioAttributesCompatParcelizer2 = audioAttributesCompatParcelizer;
                    if (audioAttributesCompatParcelizer2 != null) {
                        audioAttributesCompatParcelizer2.IconCompatParcelizer();
                    }
                }
            });
            ArrayList<Animator.AnimatorListener> arrayList = this.onPrepareFromUri;
            if (arrayList != null) {
                Iterator<Animator.AnimatorListener> it = arrayList.iterator();
                while (it.hasNext()) {
                    animatorSetAudioAttributesCompatParcelizer.addListener(it.next());
                }
            }
            animatorSetAudioAttributesCompatParcelizer.start();
            return;
        }
        this.onAddQueueItem.RemoteActionCompatParcelizer(0, z);
        this.onAddQueueItem.setAlpha(1.0f);
        this.onAddQueueItem.setScaleY(1.0f);
        this.onAddQueueItem.setScaleX(1.0f);
        RemoteActionCompatParcelizer(1.0f);
        if (audioAttributesCompatParcelizer != null) {
            audioAttributesCompatParcelizer.IconCompatParcelizer();
        }
    }

    private AnimatorSet AudioAttributesCompatParcelizer(BinarySearchSeekerSeekTimestampConverter binarySearchSeekerSeekTimestampConverter, float f, float f2, float f3) {
        ArrayList arrayList = new ArrayList();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.onAddQueueItem, (Property<FloatingActionButton, Float>) View.ALPHA, f);
        binarySearchSeekerSeekTimestampConverter.read("opacity").read(objectAnimatorOfFloat);
        arrayList.add(objectAnimatorOfFloat);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.onAddQueueItem, (Property<FloatingActionButton, Float>) View.SCALE_X, f2);
        binarySearchSeekerSeekTimestampConverter.read("scale").read(objectAnimatorOfFloat2);
        arrayList.add(objectAnimatorOfFloat2);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.onAddQueueItem, (Property<FloatingActionButton, Float>) View.SCALE_Y, f2);
        binarySearchSeekerSeekTimestampConverter.read("scale").read(objectAnimatorOfFloat3);
        arrayList.add(objectAnimatorOfFloat3);
        write(f3, this.onSetShuffleMode);
        ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(this.onAddQueueItem, new updateNextSearchBytePosition(), new getTargetTimePosition() { // from class: o.sampleData.4
            @Override // kotlin.getTargetTimePosition, android.animation.TypeEvaluator
            public final /* synthetic */ Matrix evaluate(float f4, Matrix matrix, Matrix matrix2) {
                return evaluate(f4, matrix, matrix2);
            }

            @Override // kotlin.getTargetTimePosition
            /* JADX INFO: renamed from: IconCompatParcelizer */
            public final Matrix evaluate(float f4, Matrix matrix, Matrix matrix2) {
                sampleData.this.onPlayFromSearch = f4;
                return super.evaluate(f4, matrix, matrix2);
            }
        }, new Matrix(this.onSetShuffleMode));
        binarySearchSeekerSeekTimestampConverter.read("iconScale").read(objectAnimatorOfObject);
        arrayList.add(objectAnimatorOfObject);
        AnimatorSet animatorSet = new AnimatorSet();
        getCeilingBytePosition.IconCompatParcelizer(animatorSet, arrayList);
        return animatorSet;
    }

    private AnimatorSet read(final float f, final float f2, final float f3, int i, int i2) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f);
        final float alpha = this.onAddQueueItem.getAlpha();
        final float scaleX = this.onAddQueueItem.getScaleX();
        final float scaleY = this.onAddQueueItem.getScaleY();
        final float f4 = this.onPlayFromSearch;
        final Matrix matrix = new Matrix(this.onSetShuffleMode);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.sampleData.5
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sampleData.this.onAddQueueItem.setAlpha(BinarySearchSeekerSeekOperationParams.RemoteActionCompatParcelizer(alpha, f, BitmapDescriptorFactory.HUE_RED, 0.2f, fFloatValue));
                sampleData.this.onAddQueueItem.setScaleX(BinarySearchSeekerSeekOperationParams.read(scaleX, f2, fFloatValue));
                sampleData.this.onAddQueueItem.setScaleY(BinarySearchSeekerSeekOperationParams.read(scaleY, f2, fFloatValue));
                sampleData.this.onPlayFromSearch = BinarySearchSeekerSeekOperationParams.read(f4, f3, fFloatValue);
                sampleData.this.write(BinarySearchSeekerSeekOperationParams.read(f4, f3, fFloatValue), matrix);
                sampleData.this.onAddQueueItem.setImageMatrix(matrix);
            }
        });
        arrayList.add(valueAnimatorOfFloat);
        getCeilingBytePosition.IconCompatParcelizer(animatorSet, arrayList);
        animatorSet.setDuration(getSampleRateLookupKey.write(this.onAddQueueItem.getContext(), i, this.onAddQueueItem.getContext().getResources().getInteger(calculateNextSearchBytePosition.AudioAttributesImplApi21Parcelizer.material_motion_duration_long_1)));
        animatorSet.setInterpolator(getSampleRateLookupKey.read(this.onAddQueueItem.getContext(), i2, BinarySearchSeekerSeekOperationParams.AudioAttributesCompatParcelizer));
        return animatorSet;
    }

    public final void IconCompatParcelizer(write writeVar) {
        if (this.onSetPlaybackSpeed == null) {
            this.onSetPlaybackSpeed = new ArrayList<>();
        }
        this.onSetPlaybackSpeed.add(writeVar);
    }

    public final void onCustomAction() {
        ArrayList<write> arrayList = this.onSetPlaybackSpeed;
        if (arrayList != null) {
            Iterator<write> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().AudioAttributesCompatParcelizer();
            }
        }
    }

    public final void MediaBrowserCompatSearchResultReceiver() {
        ArrayList<write> arrayList = this.onSetPlaybackSpeed;
        if (arrayList != null) {
            Iterator<write> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().write();
            }
        }
    }

    public final void onMediaButtonEvent() {
        Rect rect = this.onSetRepeatMode;
        write(rect);
        RemoteActionCompatParcelizer(rect);
        this.MediaMetadataCompat.write(rect.left, rect.top, rect.right, rect.bottom);
    }

    void write(Rect rect) {
        int iAudioAttributesImplApi21Parcelizer = AudioAttributesImplApi21Parcelizer();
        int iMax = Math.max(iAudioAttributesImplApi21Parcelizer, (int) Math.ceil(this.onSeekTo ? read() + this.RatingCompat : BitmapDescriptorFactory.HUE_RED));
        int iMax2 = Math.max(iAudioAttributesImplApi21Parcelizer, (int) Math.ceil(r1 * 1.5f));
        rect.set(iMax, iMax2, iMax, iMax2);
    }

    public final int AudioAttributesImplApi21Parcelizer() {
        if (this.onPlayFromMediaId) {
            return Math.max((this.MediaBrowserCompatSearchResultReceiver - this.onAddQueueItem.MediaBrowserCompatCustomActionResultReceiver()) / 2, 0);
        }
        return 0;
    }

    private void RemoteActionCompatParcelizer(Rect rect) {
        StringCollectionDeserializer.write(this.AudioAttributesImplApi26Parcelizer, "Didn't initialize content background");
        if (MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver()) {
            this.MediaMetadataCompat.RemoteActionCompatParcelizer(new InsetDrawable(this.AudioAttributesImplApi26Parcelizer, rect.left, rect.top, rect.right, rect.bottom));
        } else {
            this.MediaMetadataCompat.RemoteActionCompatParcelizer(this.AudioAttributesImplApi26Parcelizer);
        }
    }

    public final void MediaMetadataCompat() {
        frameSizeBytesByTypeNb framesizebytesbytypenb = this.handleMediaPlayPauseIfPendingOnHandler;
        if (framesizebytesbytypenb != null) {
            getConstantBitrateSeekMap.RemoteActionCompatParcelizer(this.onAddQueueItem, framesizebytesbytypenb);
        }
        if (handleMediaPlayPauseIfPendingOnHandler()) {
            this.onAddQueueItem.getViewTreeObserver().addOnPreDrawListener(onPlayFromMediaId());
        }
    }

    public final void RatingCompat() {
        ViewTreeObserver viewTreeObserver = this.onAddQueueItem.getViewTreeObserver();
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = this.onPrepareFromMediaId;
        if (onPreDrawListener != null) {
            viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
            this.onPrepareFromMediaId = null;
        }
    }

    final void MediaBrowserCompatMediaItem() {
        float rotation = this.onAddQueueItem.getRotation();
        if (this.onRemoveQueueItemAt != rotation) {
            this.onRemoveQueueItemAt = rotation;
            onCommand();
        }
    }

    private ViewTreeObserver.OnPreDrawListener onPlayFromMediaId() {
        if (this.onPrepareFromMediaId == null) {
            this.onPrepareFromMediaId = new ViewTreeObserver.OnPreDrawListener() { // from class: o.sampleData.2
                @Override // android.view.ViewTreeObserver.OnPreDrawListener
                public final boolean onPreDraw() {
                    sampleData.this.MediaBrowserCompatMediaItem();
                    return true;
                }
            };
        }
        return this.onPrepareFromMediaId;
    }

    frameSizeBytesByTypeNb AudioAttributesCompatParcelizer() {
        return new frameSizeBytesByTypeNb((isValidFrameType) StringCollectionDeserializer.RemoteActionCompatParcelizer(this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver));
    }

    public final boolean MediaBrowserCompatItemReceiver() {
        return this.onAddQueueItem.getVisibility() != 0 ? this.onPlay == 2 : this.onPlay != 1;
    }

    public final boolean MediaBrowserCompatCustomActionResultReceiver() {
        return this.onAddQueueItem.getVisibility() == 0 ? this.onPlay == 1 : this.onPlay != 2;
    }

    private static ValueAnimator write(AudioAttributesImplApi21Parcelizer audioAttributesImplApi21Parcelizer) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(RemoteActionCompatParcelizer);
        valueAnimator.setDuration(100L);
        valueAnimator.addListener(audioAttributesImplApi21Parcelizer);
        valueAnimator.addUpdateListener(audioAttributesImplApi21Parcelizer);
        valueAnimator.setFloatValues(BitmapDescriptorFactory.HUE_RED, 1.0f);
        return valueAnimator;
    }

    abstract class AudioAttributesImplApi21Parcelizer extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {
        private boolean RemoteActionCompatParcelizer;
        private float read;
        private float write;

        protected abstract float write();

        private AudioAttributesImplApi21Parcelizer() {
        }

        /* synthetic */ AudioAttributesImplApi21Parcelizer(sampleData sampledata, byte b) {
            this();
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (!this.RemoteActionCompatParcelizer) {
                this.write = sampleData.this.handleMediaPlayPauseIfPendingOnHandler == null ? BitmapDescriptorFactory.HUE_RED : sampleData.this.handleMediaPlayPauseIfPendingOnHandler.onPlayFromMediaId();
                this.read = write();
                this.RemoteActionCompatParcelizer = true;
            }
            sampleData sampledata = sampleData.this;
            float f = this.write;
            sampledata.read((int) (f + ((this.read - f) * valueAnimator.getAnimatedFraction())));
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            sampleData.this.read((int) this.read);
            this.RemoteActionCompatParcelizer = false;
        }
    }

    class MediaBrowserCompatCustomActionResultReceiver extends AudioAttributesImplApi21Parcelizer {
        MediaBrowserCompatCustomActionResultReceiver() {
            super(sampleData.this, (byte) 0);
        }

        @Override // o.sampleData.AudioAttributesImplApi21Parcelizer
        protected final float write() {
            return sampleData.this.AudioAttributesImplBaseParcelizer;
        }
    }

    class IconCompatParcelizer extends AudioAttributesImplApi21Parcelizer {
        IconCompatParcelizer() {
            super(sampleData.this, (byte) 0);
        }

        @Override // o.sampleData.AudioAttributesImplApi21Parcelizer
        protected final float write() {
            return sampleData.this.AudioAttributesImplBaseParcelizer + sampleData.this.MediaDescriptionCompat;
        }
    }

    class RemoteActionCompatParcelizer extends AudioAttributesImplApi21Parcelizer {
        RemoteActionCompatParcelizer() {
            super(sampleData.this, (byte) 0);
        }

        @Override // o.sampleData.AudioAttributesImplApi21Parcelizer
        protected final float write() {
            return sampleData.this.AudioAttributesImplBaseParcelizer + sampleData.this.RatingCompat;
        }
    }

    class read extends AudioAttributesImplApi21Parcelizer {
        @Override // o.sampleData.AudioAttributesImplApi21Parcelizer
        protected final float write() {
            return BitmapDescriptorFactory.HUE_RED;
        }

        read() {
            super(sampleData.this, (byte) 0);
        }
    }

    private boolean onFastForward() {
        return InvalidTypeIdException.onSeekTo(this.onAddQueueItem) && !this.onAddQueueItem.isInEditMode();
    }

    void onCommand() {
        frameSizeBytesByTypeNb framesizebytesbytypenb = this.handleMediaPlayPauseIfPendingOnHandler;
        if (framesizebytesbytypenb != null) {
            framesizebytesbytypenb.onRewind((int) this.onRemoveQueueItemAt);
        }
    }
}
