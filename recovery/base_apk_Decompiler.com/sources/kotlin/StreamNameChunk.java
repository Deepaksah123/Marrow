package kotlin;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.textfield.TextInputLayout;
import java.util.ArrayList;
import java.util.List;
import kotlin.calculateNextSearchBytePosition;

/* JADX INFO: loaded from: classes3.dex */
public final class StreamNameChunk {
    private FrameLayout AudioAttributesCompatParcelizer;
    private int AudioAttributesImplApi21Parcelizer;
    private final int AudioAttributesImplApi26Parcelizer;
    private final TimeInterpolator AudioAttributesImplBaseParcelizer;
    private int IconCompatParcelizer;
    private final int MediaBrowserCompatCustomActionResultReceiver;
    private final TimeInterpolator MediaBrowserCompatItemReceiver;
    private final Context MediaBrowserCompatMediaItem;
    private final float MediaBrowserCompatSearchResultReceiver;
    private CharSequence MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    private boolean MediaDescriptionCompat;
    private CharSequence MediaMetadataCompat;
    private int RatingCompat;
    private Animator RemoteActionCompatParcelizer;
    private int handleMediaPlayPauseIfPendingOnHandler;
    private ColorStateList onAddQueueItem;
    private CharSequence onCommand;
    private TextView onCustomAction;
    private boolean onFastForward;
    private ColorStateList onMediaButtonEvent;
    private TextView onPause;
    private LinearLayout onPlay;
    private int onPlayFromMediaId;
    private int onPlayFromSearch;
    private final TextInputLayout onPrepareFromMediaId;
    private Typeface onPrepareFromSearch;
    private final int read;
    private final TimeInterpolator write;

    private static boolean AudioAttributesImplApi26Parcelizer(int i) {
        return i == 0 || i == 1;
    }

    static /* synthetic */ Animator read(StreamNameChunk streamNameChunk) {
        streamNameChunk.RemoteActionCompatParcelizer = null;
        return null;
    }

    public StreamNameChunk(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.MediaBrowserCompatMediaItem = context;
        this.onPrepareFromMediaId = textInputLayout;
        this.MediaBrowserCompatSearchResultReceiver = context.getResources().getDimensionPixelSize(calculateNextSearchBytePosition.write.design_textinput_caption_translate_y);
        this.AudioAttributesImplApi26Parcelizer = getSampleRateLookupKey.write(context, calculateNextSearchBytePosition.IconCompatParcelizer.motionDurationShort4, 217);
        this.read = getSampleRateLookupKey.write(context, calculateNextSearchBytePosition.IconCompatParcelizer.motionDurationMedium4, 167);
        this.MediaBrowserCompatCustomActionResultReceiver = getSampleRateLookupKey.write(context, calculateNextSearchBytePosition.IconCompatParcelizer.motionDurationShort4, 167);
        this.AudioAttributesImplBaseParcelizer = getSampleRateLookupKey.read(context, calculateNextSearchBytePosition.IconCompatParcelizer.motionEasingEmphasizedDecelerateInterpolator, BinarySearchSeekerSeekOperationParams.RemoteActionCompatParcelizer);
        this.write = getSampleRateLookupKey.read(context, calculateNextSearchBytePosition.IconCompatParcelizer.motionEasingEmphasizedDecelerateInterpolator, BinarySearchSeekerSeekOperationParams.write);
        this.MediaBrowserCompatItemReceiver = getSampleRateLookupKey.read(context, calculateNextSearchBytePosition.IconCompatParcelizer.motionEasingLinearInterpolator, BinarySearchSeekerSeekOperationParams.write);
    }

    public final void write(CharSequence charSequence) {
        MediaDescriptionCompat();
        this.onCommand = charSequence;
        this.onPause.setText(charSequence);
        int i = this.IconCompatParcelizer;
        if (i != 2) {
            this.AudioAttributesImplApi21Parcelizer = 2;
        }
        RemoteActionCompatParcelizer(i, this.AudioAttributesImplApi21Parcelizer, RemoteActionCompatParcelizer(this.onPause, charSequence));
    }

    private void MediaMetadataCompat() {
        MediaDescriptionCompat();
        int i = this.IconCompatParcelizer;
        if (i == 2) {
            this.AudioAttributesImplApi21Parcelizer = 0;
        }
        RemoteActionCompatParcelizer(i, this.AudioAttributesImplApi21Parcelizer, RemoteActionCompatParcelizer(this.onPause, ""));
    }

    public final void IconCompatParcelizer(CharSequence charSequence) {
        MediaDescriptionCompat();
        this.MediaMetadataCompat = charSequence;
        this.onCustomAction.setText(charSequence);
        int i = this.IconCompatParcelizer;
        if (i != 1) {
            this.AudioAttributesImplApi21Parcelizer = 1;
        }
        RemoteActionCompatParcelizer(i, this.AudioAttributesImplApi21Parcelizer, RemoteActionCompatParcelizer(this.onCustomAction, charSequence));
    }

    public final void MediaBrowserCompatItemReceiver() {
        this.MediaMetadataCompat = null;
        MediaDescriptionCompat();
        if (this.IconCompatParcelizer == 1) {
            if (this.onFastForward && !TextUtils.isEmpty(this.onCommand)) {
                this.AudioAttributesImplApi21Parcelizer = 2;
            } else {
                this.AudioAttributesImplApi21Parcelizer = 0;
            }
        }
        RemoteActionCompatParcelizer(this.IconCompatParcelizer, this.AudioAttributesImplApi21Parcelizer, RemoteActionCompatParcelizer(this.onCustomAction, ""));
    }

    private boolean RemoteActionCompatParcelizer(TextView textView, CharSequence charSequence) {
        if (InvalidTypeIdException.onSeekTo(this.onPrepareFromMediaId) && this.onPrepareFromMediaId.isEnabled()) {
            return (this.AudioAttributesImplApi21Parcelizer == this.IconCompatParcelizer && textView != null && TextUtils.equals(textView.getText(), charSequence)) ? false : true;
        }
        return false;
    }

    private void RemoteActionCompatParcelizer(final int i, final int i2, boolean z) {
        if (i == i2) {
            return;
        }
        if (z) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.RemoteActionCompatParcelizer = animatorSet;
            ArrayList arrayList = new ArrayList();
            IconCompatParcelizer(arrayList, this.onFastForward, this.onPause, 2, i, i2);
            IconCompatParcelizer(arrayList, this.MediaDescriptionCompat, this.onCustomAction, 1, i, i2);
            getCeilingBytePosition.IconCompatParcelizer(animatorSet, arrayList);
            final TextView textViewRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(i);
            final TextView textViewRemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer(i2);
            animatorSet.addListener(new AnimatorListenerAdapter() { // from class: o.StreamNameChunk.3
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    StreamNameChunk.this.IconCompatParcelizer = i2;
                    StreamNameChunk.read(StreamNameChunk.this);
                    TextView textView = textViewRemoteActionCompatParcelizer;
                    if (textView != null) {
                        textView.setVisibility(4);
                        if (i == 1 && StreamNameChunk.this.onCustomAction != null) {
                            StreamNameChunk.this.onCustomAction.setText((CharSequence) null);
                        }
                    }
                    TextView textView2 = textViewRemoteActionCompatParcelizer2;
                    if (textView2 != null) {
                        textView2.setTranslationY(BitmapDescriptorFactory.HUE_RED);
                        textViewRemoteActionCompatParcelizer2.setAlpha(1.0f);
                    }
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationStart(Animator animator) {
                    TextView textView = textViewRemoteActionCompatParcelizer2;
                    if (textView != null) {
                        textView.setVisibility(0);
                        textViewRemoteActionCompatParcelizer2.setAlpha(BitmapDescriptorFactory.HUE_RED);
                    }
                }
            });
            animatorSet.start();
        } else {
            read(i, i2);
        }
        this.onPrepareFromMediaId.onAddQueueItem();
        this.onPrepareFromMediaId.write(z);
        this.onPrepareFromMediaId.onCommand();
    }

    private void read(int i, int i2) {
        TextView textViewRemoteActionCompatParcelizer;
        TextView textViewRemoteActionCompatParcelizer2;
        if (i == i2) {
            return;
        }
        if (i2 != 0 && (textViewRemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer(i2)) != null) {
            textViewRemoteActionCompatParcelizer2.setVisibility(0);
            textViewRemoteActionCompatParcelizer2.setAlpha(1.0f);
        }
        if (i != 0 && (textViewRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(i)) != null) {
            textViewRemoteActionCompatParcelizer.setVisibility(4);
            if (i == 1) {
                textViewRemoteActionCompatParcelizer.setText((CharSequence) null);
            }
        }
        this.IconCompatParcelizer = i2;
    }

    private void IconCompatParcelizer(List<Animator> list, boolean z, TextView textView, int i, int i2, int i3) {
        if (textView == null || !z) {
            return;
        }
        if (i == i3 || i == i2) {
            ObjectAnimator objectAnimatorIconCompatParcelizer = IconCompatParcelizer(textView, i3 == i);
            if (i == i3 && i2 != 0) {
                objectAnimatorIconCompatParcelizer.setStartDelay(this.MediaBrowserCompatCustomActionResultReceiver);
            }
            list.add(objectAnimatorIconCompatParcelizer);
            if (i3 != i || i2 == 0) {
                return;
            }
            ObjectAnimator objectAnimator = read(textView);
            objectAnimator.setStartDelay(this.MediaBrowserCompatCustomActionResultReceiver);
            list.add(objectAnimator);
        }
    }

    private ObjectAnimator IconCompatParcelizer(TextView textView, boolean z) {
        int i;
        TimeInterpolator timeInterpolator;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.ALPHA, z ? 1.0f : BitmapDescriptorFactory.HUE_RED);
        if (z) {
            i = this.read;
        } else {
            i = this.MediaBrowserCompatCustomActionResultReceiver;
        }
        objectAnimatorOfFloat.setDuration(i);
        if (z) {
            timeInterpolator = this.write;
        } else {
            timeInterpolator = this.MediaBrowserCompatItemReceiver;
        }
        objectAnimatorOfFloat.setInterpolator(timeInterpolator);
        return objectAnimatorOfFloat;
    }

    private ObjectAnimator read(TextView textView) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.TRANSLATION_Y, -this.MediaBrowserCompatSearchResultReceiver, BitmapDescriptorFactory.HUE_RED);
        objectAnimatorOfFloat.setDuration(this.AudioAttributesImplApi26Parcelizer);
        objectAnimatorOfFloat.setInterpolator(this.AudioAttributesImplBaseParcelizer);
        return objectAnimatorOfFloat;
    }

    private void MediaDescriptionCompat() {
        Animator animator = this.RemoteActionCompatParcelizer;
        if (animator != null) {
            animator.cancel();
        }
    }

    private TextView RemoteActionCompatParcelizer(int i) {
        if (i == 1) {
            return this.onCustomAction;
        }
        if (i != 2) {
            return null;
        }
        return this.onPause;
    }

    public final void write() {
        if (AudioAttributesImplApi21Parcelizer()) {
            EditText editTextAudioAttributesCompatParcelizer = this.onPrepareFromMediaId.AudioAttributesCompatParcelizer();
            boolean zIconCompatParcelizer = SeekMap.IconCompatParcelizer(this.MediaBrowserCompatMediaItem);
            InvalidTypeIdException.read(this.onPlay, write(zIconCompatParcelizer, calculateNextSearchBytePosition.write.material_helper_text_font_1_3_padding_horizontal, InvalidTypeIdException.onCommand(editTextAudioAttributesCompatParcelizer)), write(zIconCompatParcelizer, calculateNextSearchBytePosition.write.material_helper_text_font_1_3_padding_top, this.MediaBrowserCompatMediaItem.getResources().getDimensionPixelSize(calculateNextSearchBytePosition.write.material_helper_text_default_padding_top)), write(zIconCompatParcelizer, calculateNextSearchBytePosition.write.material_helper_text_font_1_3_padding_horizontal, InvalidTypeIdException.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(editTextAudioAttributesCompatParcelizer)), 0);
        }
    }

    private boolean AudioAttributesImplApi21Parcelizer() {
        return (this.onPlay == null || this.onPrepareFromMediaId.AudioAttributesCompatParcelizer() == null) ? false : true;
    }

    private int write(boolean z, int i, int i2) {
        return z ? this.MediaBrowserCompatMediaItem.getResources().getDimensionPixelSize(i) : i2;
    }

    public final void AudioAttributesCompatParcelizer(TextView textView, int i) {
        if (this.onPlay == null && this.AudioAttributesCompatParcelizer == null) {
            LinearLayout linearLayout = new LinearLayout(this.MediaBrowserCompatMediaItem);
            this.onPlay = linearLayout;
            linearLayout.setOrientation(0);
            this.onPrepareFromMediaId.addView(this.onPlay, -1, -2);
            this.AudioAttributesCompatParcelizer = new FrameLayout(this.MediaBrowserCompatMediaItem);
            this.onPlay.addView(this.AudioAttributesCompatParcelizer, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (this.onPrepareFromMediaId.AudioAttributesCompatParcelizer() != null) {
                write();
            }
        }
        if (AudioAttributesImplApi26Parcelizer(i)) {
            this.AudioAttributesCompatParcelizer.setVisibility(0);
            this.AudioAttributesCompatParcelizer.addView(textView);
        } else {
            this.onPlay.addView(textView, new LinearLayout.LayoutParams(-2, -2));
        }
        this.onPlay.setVisibility(0);
        this.onPlayFromSearch++;
    }

    public final void IconCompatParcelizer(TextView textView, int i) {
        FrameLayout frameLayout;
        if (this.onPlay == null) {
            return;
        }
        if (AudioAttributesImplApi26Parcelizer(i) && (frameLayout = this.AudioAttributesCompatParcelizer) != null) {
            frameLayout.removeView(textView);
        } else {
            this.onPlay.removeView(textView);
        }
        int i2 = this.onPlayFromSearch - 1;
        this.onPlayFromSearch = i2;
        RemoteActionCompatParcelizer(this.onPlay, i2);
    }

    private static void RemoteActionCompatParcelizer(ViewGroup viewGroup, int i) {
        if (i == 0) {
            viewGroup.setVisibility(8);
        }
    }

    public final void read(boolean z) {
        if (this.MediaDescriptionCompat == z) {
            return;
        }
        MediaDescriptionCompat();
        if (z) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(this.MediaBrowserCompatMediaItem);
            this.onCustomAction = appCompatTextView;
            appCompatTextView.setId(calculateNextSearchBytePosition.AudioAttributesImplApi26Parcelizer.textinput_error);
            this.onCustomAction.setTextAlignment(5);
            Typeface typeface = this.onPrepareFromSearch;
            if (typeface != null) {
                this.onCustomAction.setTypeface(typeface);
            }
            AudioAttributesCompatParcelizer(this.RatingCompat);
            write(this.onAddQueueItem);
            read(this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
            IconCompatParcelizer(this.handleMediaPlayPauseIfPendingOnHandler);
            this.onCustomAction.setVisibility(4);
            AudioAttributesCompatParcelizer(this.onCustomAction, 0);
        } else {
            MediaBrowserCompatItemReceiver();
            IconCompatParcelizer(this.onCustomAction, 0);
            this.onCustomAction = null;
            this.onPrepareFromMediaId.onAddQueueItem();
            this.onPrepareFromMediaId.onCommand();
        }
        this.MediaDescriptionCompat = z;
    }

    public final boolean AudioAttributesImplBaseParcelizer() {
        return this.MediaDescriptionCompat;
    }

    public final boolean MediaBrowserCompatCustomActionResultReceiver() {
        return this.onFastForward;
    }

    public final void IconCompatParcelizer(boolean z) {
        if (this.onFastForward == z) {
            return;
        }
        MediaDescriptionCompat();
        if (z) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(this.MediaBrowserCompatMediaItem);
            this.onPause = appCompatTextView;
            appCompatTextView.setId(calculateNextSearchBytePosition.AudioAttributesImplApi26Parcelizer.textinput_helper_text);
            this.onPause.setTextAlignment(5);
            Typeface typeface = this.onPrepareFromSearch;
            if (typeface != null) {
                this.onPause.setTypeface(typeface);
            }
            this.onPause.setVisibility(4);
            InvalidTypeIdException.AudioAttributesImplApi21Parcelizer(this.onPause, 1);
            write(this.onPlayFromMediaId);
            RemoteActionCompatParcelizer(this.onMediaButtonEvent);
            AudioAttributesCompatParcelizer(this.onPause, 1);
            this.onPause.setAccessibilityDelegate(new View.AccessibilityDelegate() { // from class: o.StreamNameChunk.1
                @Override // android.view.View.AccessibilityDelegate
                public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
                    super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                    EditText editTextAudioAttributesCompatParcelizer = StreamNameChunk.this.onPrepareFromMediaId.AudioAttributesCompatParcelizer();
                    if (editTextAudioAttributesCompatParcelizer != null) {
                        accessibilityNodeInfo.setLabeledBy(editTextAudioAttributesCompatParcelizer);
                    }
                }
            });
        } else {
            MediaMetadataCompat();
            IconCompatParcelizer(this.onPause, 1);
            this.onPause = null;
            this.onPrepareFromMediaId.onAddQueueItem();
            this.onPrepareFromMediaId.onCommand();
        }
        this.onFastForward = z;
    }

    public final View AudioAttributesImplApi26Parcelizer() {
        return this.onPause;
    }

    public final boolean read() {
        return read(this.AudioAttributesImplApi21Parcelizer);
    }

    private boolean read(int i) {
        return (i != 1 || this.onCustomAction == null || TextUtils.isEmpty(this.MediaMetadataCompat)) ? false : true;
    }

    public final CharSequence RemoteActionCompatParcelizer() {
        return this.MediaMetadataCompat;
    }

    public final void IconCompatParcelizer(Typeface typeface) {
        if (typeface != this.onPrepareFromSearch) {
            this.onPrepareFromSearch = typeface;
            read(this.onCustomAction, typeface);
            read(this.onPause, typeface);
        }
    }

    private static void read(TextView textView, Typeface typeface) {
        if (textView != null) {
            textView.setTypeface(typeface);
        }
    }

    public final int IconCompatParcelizer() {
        TextView textView = this.onCustomAction;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    public final ColorStateList AudioAttributesCompatParcelizer() {
        TextView textView = this.onCustomAction;
        if (textView != null) {
            return textView.getTextColors();
        }
        return null;
    }

    public final void write(ColorStateList colorStateList) {
        this.onAddQueueItem = colorStateList;
        TextView textView = this.onCustomAction;
        if (textView == null || colorStateList == null) {
            return;
        }
        textView.setTextColor(colorStateList);
    }

    public final void AudioAttributesCompatParcelizer(int i) {
        this.RatingCompat = i;
        TextView textView = this.onCustomAction;
        if (textView != null) {
            this.onPrepareFromMediaId.IconCompatParcelizer(textView, i);
        }
    }

    public final void read(CharSequence charSequence) {
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = charSequence;
        TextView textView = this.onCustomAction;
        if (textView != null) {
            textView.setContentDescription(charSequence);
        }
    }

    public final void IconCompatParcelizer(int i) {
        this.handleMediaPlayPauseIfPendingOnHandler = i;
        TextView textView = this.onCustomAction;
        if (textView != null) {
            InvalidTypeIdException.AudioAttributesImplApi21Parcelizer(textView, i);
        }
    }

    public final void RemoteActionCompatParcelizer(ColorStateList colorStateList) {
        this.onMediaButtonEvent = colorStateList;
        TextView textView = this.onPause;
        if (textView == null || colorStateList == null) {
            return;
        }
        textView.setTextColor(colorStateList);
    }

    public final void write(int i) {
        this.onPlayFromMediaId = i;
        TextView textView = this.onPause;
        if (textView != null) {
            _addSuperTypes.RemoteActionCompatParcelizer(textView, i);
        }
    }
}
