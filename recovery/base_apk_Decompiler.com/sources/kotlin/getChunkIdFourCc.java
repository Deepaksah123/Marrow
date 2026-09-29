package kotlin;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.calculateNextSearchBytePosition;

/* JADX INFO: loaded from: classes3.dex */
final class getChunkIdFourCc extends getMimeTypeFromTag {
    private final int AudioAttributesCompatParcelizer;
    private final TimeInterpolator AudioAttributesImplApi21Parcelizer;
    private AnimatorSet AudioAttributesImplApi26Parcelizer;
    private EditText AudioAttributesImplBaseParcelizer;
    private final TimeInterpolator MediaBrowserCompatCustomActionResultReceiver;
    private final int MediaBrowserCompatItemReceiver;
    private final View.OnClickListener MediaBrowserCompatMediaItem;
    private ValueAnimator MediaBrowserCompatSearchResultReceiver;
    private final View.OnFocusChangeListener RatingCompat;

    final /* synthetic */ void AudioAttributesImplApi26Parcelizer() {
        EditText editText = this.AudioAttributesImplBaseParcelizer;
        if (editText == null) {
            return;
        }
        Editable text = editText.getText();
        if (text != null) {
            text.clear();
        }
        handleMediaPlayPauseIfPendingOnHandler();
    }

    final /* synthetic */ void AudioAttributesImplBaseParcelizer() {
        AudioAttributesCompatParcelizer(MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver());
    }

    getChunkIdFourCc(parseBitmapInfoHeader parsebitmapinfoheader) {
        super(parsebitmapinfoheader);
        this.MediaBrowserCompatMediaItem = new View.OnClickListener() { // from class: o.appendKeyFrameToIndex
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.write.AudioAttributesImplApi26Parcelizer();
            }
        };
        this.RatingCompat = new View.OnFocusChangeListener() { // from class: o.getCurrentChunkTimestampUs
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                this.RemoteActionCompatParcelizer.AudioAttributesImplBaseParcelizer();
            }
        };
        this.AudioAttributesCompatParcelizer = getSampleRateLookupKey.write(parsebitmapinfoheader.getContext(), calculateNextSearchBytePosition.IconCompatParcelizer.motionDurationShort3, 100);
        this.MediaBrowserCompatItemReceiver = getSampleRateLookupKey.write(parsebitmapinfoheader.getContext(), calculateNextSearchBytePosition.IconCompatParcelizer.motionDurationShort3, 150);
        this.AudioAttributesImplApi21Parcelizer = getSampleRateLookupKey.read(parsebitmapinfoheader.getContext(), calculateNextSearchBytePosition.IconCompatParcelizer.motionEasingLinearInterpolator, BinarySearchSeekerSeekOperationParams.write);
        this.MediaBrowserCompatCustomActionResultReceiver = getSampleRateLookupKey.read(parsebitmapinfoheader.getContext(), calculateNextSearchBytePosition.IconCompatParcelizer.motionEasingEmphasizedInterpolator, BinarySearchSeekerSeekOperationParams.RemoteActionCompatParcelizer);
    }

    @Override // kotlin.getMimeTypeFromTag
    final void MediaBrowserCompatCustomActionResultReceiver() {
        MediaBrowserCompatSearchResultReceiver();
    }

    @Override // kotlin.getMimeTypeFromTag
    final void RatingCompat() {
        EditText editText = this.AudioAttributesImplBaseParcelizer;
        if (editText != null) {
            editText.post(new Runnable() { // from class: o.getFrameDurationUs
                @Override // java.lang.Runnable
                public final void run() {
                    this.AudioAttributesCompatParcelizer.AudioAttributesImplApi21Parcelizer();
                }
            });
        }
    }

    final /* synthetic */ void AudioAttributesImplApi21Parcelizer() {
        AudioAttributesCompatParcelizer(true);
    }

    @Override // kotlin.getMimeTypeFromTag
    final int AudioAttributesCompatParcelizer() {
        return calculateNextSearchBytePosition.MediaBrowserCompatItemReceiver.mtrl_ic_cancel;
    }

    @Override // kotlin.getMimeTypeFromTag
    final int RemoteActionCompatParcelizer() {
        return calculateNextSearchBytePosition.MediaBrowserCompatSearchResultReceiver.clear_text_end_icon_content_description;
    }

    @Override // kotlin.getMimeTypeFromTag
    final void read(boolean z) {
        if (this.read.AudioAttributesImplApi26Parcelizer() == null) {
            return;
        }
        AudioAttributesCompatParcelizer(z);
    }

    @Override // kotlin.getMimeTypeFromTag
    final View.OnClickListener IconCompatParcelizer() {
        return this.MediaBrowserCompatMediaItem;
    }

    @Override // kotlin.getMimeTypeFromTag
    public final void AudioAttributesCompatParcelizer(EditText editText) {
        this.AudioAttributesImplBaseParcelizer = editText;
        this.IconCompatParcelizer.setEndIconVisible(MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver());
    }

    @Override // kotlin.getMimeTypeFromTag
    final void read() {
        if (this.read.AudioAttributesImplApi26Parcelizer() != null) {
            return;
        }
        AudioAttributesCompatParcelizer(MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver());
    }

    @Override // kotlin.getMimeTypeFromTag
    final View.OnFocusChangeListener write() {
        return this.RatingCompat;
    }

    @Override // kotlin.getMimeTypeFromTag
    final View.OnFocusChangeListener MediaBrowserCompatItemReceiver() {
        return this.RatingCompat;
    }

    private void AudioAttributesCompatParcelizer(boolean z) {
        boolean z2 = this.read.MediaBrowserCompatSearchResultReceiver() == z;
        if (z && !this.AudioAttributesImplApi26Parcelizer.isRunning()) {
            this.MediaBrowserCompatSearchResultReceiver.cancel();
            this.AudioAttributesImplApi26Parcelizer.start();
            if (z2) {
                this.AudioAttributesImplApi26Parcelizer.end();
                return;
            }
            return;
        }
        if (z) {
            return;
        }
        this.AudioAttributesImplApi26Parcelizer.cancel();
        this.MediaBrowserCompatSearchResultReceiver.start();
        if (z2) {
            this.MediaBrowserCompatSearchResultReceiver.end();
        }
    }

    private void MediaBrowserCompatSearchResultReceiver() {
        ValueAnimator valueAnimatorMediaBrowserCompatMediaItem = MediaBrowserCompatMediaItem();
        ValueAnimator valueAnimatorRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(BitmapDescriptorFactory.HUE_RED, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        this.AudioAttributesImplApi26Parcelizer = animatorSet;
        animatorSet.playTogether(valueAnimatorMediaBrowserCompatMediaItem, valueAnimatorRemoteActionCompatParcelizer);
        this.AudioAttributesImplApi26Parcelizer.addListener(new AnimatorListenerAdapter() { // from class: o.getChunkIdFourCc.2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
                getChunkIdFourCc.this.read.write(true);
            }
        });
        ValueAnimator valueAnimatorRemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer(1.0f, BitmapDescriptorFactory.HUE_RED);
        this.MediaBrowserCompatSearchResultReceiver = valueAnimatorRemoteActionCompatParcelizer2;
        valueAnimatorRemoteActionCompatParcelizer2.addListener(new AnimatorListenerAdapter() { // from class: o.getChunkIdFourCc.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                getChunkIdFourCc.this.read.write(false);
            }
        });
    }

    private ValueAnimator RemoteActionCompatParcelizer(float... fArr) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
        valueAnimatorOfFloat.setInterpolator(this.AudioAttributesImplApi21Parcelizer);
        valueAnimatorOfFloat.setDuration(this.AudioAttributesCompatParcelizer);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.compactIndex
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.RemoteActionCompatParcelizer.read(valueAnimator);
            }
        });
        return valueAnimatorOfFloat;
    }

    final /* synthetic */ void read(ValueAnimator valueAnimator) {
        this.write.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    private ValueAnimator MediaBrowserCompatMediaItem() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        valueAnimatorOfFloat.setInterpolator(this.MediaBrowserCompatCustomActionResultReceiver);
        valueAnimatorOfFloat.setDuration(this.MediaBrowserCompatItemReceiver);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.incrementIndexChunkCount
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.IconCompatParcelizer.RemoteActionCompatParcelizer(valueAnimator);
            }
        });
        return valueAnimatorOfFloat;
    }

    final /* synthetic */ void RemoteActionCompatParcelizer(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.write.setScaleX(fFloatValue);
        this.write.setScaleY(fFloatValue);
    }

    private boolean MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        EditText editText = this.AudioAttributesImplBaseParcelizer;
        if (editText != null) {
            return (editText.hasFocus() || this.write.hasFocus()) && this.AudioAttributesImplBaseParcelizer.getText().length() > 0;
        }
        return false;
    }
}
