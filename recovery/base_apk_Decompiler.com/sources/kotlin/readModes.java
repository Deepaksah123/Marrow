package kotlin;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.internal.ClippableRoundedCornerLayout;
import com.google.android.material.internal.TouchObserverFrameLayout;
import com.google.android.material.search.SearchBar;
import com.google.android.material.search.SearchView;
import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
public final class readModes {
    private final View AudioAttributesCompatParcelizer;
    private final Toolbar AudioAttributesImplApi21Parcelizer;
    private final View AudioAttributesImplApi26Parcelizer;
    private final ClippableRoundedCornerLayout AudioAttributesImplBaseParcelizer;
    private final getBitsPerSampleLookupKey IconCompatParcelizer;
    private final FrameLayout MediaBrowserCompatCustomActionResultReceiver;
    private final EditText MediaBrowserCompatItemReceiver;
    private final TextView MediaBrowserCompatMediaItem;
    private SearchBar MediaBrowserCompatSearchResultReceiver;
    private final Toolbar MediaDescriptionCompat;
    private final FrameLayout MediaMetadataCompat;
    private final SearchView RatingCompat;
    private final TouchObserverFrameLayout RemoteActionCompatParcelizer;
    private AnimatorSet read;
    private final ImageButton write;

    public readModes(SearchView searchView) {
        this.RatingCompat = searchView;
        this.AudioAttributesImplApi26Parcelizer = searchView.MediaBrowserCompatItemReceiver;
        ClippableRoundedCornerLayout clippableRoundedCornerLayout = searchView.AudioAttributesImplBaseParcelizer;
        this.AudioAttributesImplBaseParcelizer = clippableRoundedCornerLayout;
        this.MediaBrowserCompatCustomActionResultReceiver = searchView.MediaBrowserCompatCustomActionResultReceiver;
        this.MediaMetadataCompat = searchView.RatingCompat;
        this.MediaDescriptionCompat = searchView.AudioAttributesImplApi26Parcelizer;
        this.AudioAttributesImplApi21Parcelizer = searchView.write;
        this.MediaBrowserCompatMediaItem = searchView.AudioAttributesImplApi21Parcelizer;
        this.MediaBrowserCompatItemReceiver = searchView.IconCompatParcelizer;
        this.write = searchView.read;
        this.AudioAttributesCompatParcelizer = searchView.RemoteActionCompatParcelizer;
        this.RemoteActionCompatParcelizer = searchView.AudioAttributesCompatParcelizer;
        this.IconCompatParcelizer = new getBitsPerSampleLookupKey(clippableRoundedCornerLayout);
    }

    public final void AudioAttributesCompatParcelizer(SearchBar searchBar) {
        this.MediaBrowserCompatSearchResultReceiver = searchBar;
    }

    public final void AudioAttributesImplApi21Parcelizer() {
        if (this.MediaBrowserCompatSearchResultReceiver != null) {
            MediaMetadataCompat();
        } else {
            MediaBrowserCompatSearchResultReceiver();
        }
    }

    public final AnimatorSet AudioAttributesCompatParcelizer() {
        if (this.MediaBrowserCompatSearchResultReceiver != null) {
            return RatingCompat();
        }
        return MediaDescriptionCompat();
    }

    private void MediaMetadataCompat() {
        if (this.RatingCompat.AudioAttributesCompatParcelizer()) {
            this.RatingCompat.RatingCompat();
        }
        this.RatingCompat.write(SearchView.read.SHOWING);
        MediaBrowserCompatCustomActionResultReceiver();
        this.MediaBrowserCompatItemReceiver.setText(this.MediaBrowserCompatSearchResultReceiver.onPlayFromSearch());
        EditText editText = this.MediaBrowserCompatItemReceiver;
        editText.setSelection(editText.getText().length());
        this.AudioAttributesImplBaseParcelizer.setVisibility(4);
        this.AudioAttributesImplBaseParcelizer.post(new Runnable() { // from class: o.readMappings
            @Override // java.lang.Runnable
            public final void run() {
                this.AudioAttributesCompatParcelizer.read();
            }
        });
    }

    final /* synthetic */ void read() {
        AnimatorSet animatorSetMediaMetadataCompat = MediaMetadataCompat(true);
        animatorSetMediaMetadataCompat.addListener(new AnimatorListenerAdapter() { // from class: o.readModes.5
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
                readModes.this.AudioAttributesImplBaseParcelizer.setVisibility(0);
                readModes.this.MediaBrowserCompatSearchResultReceiver.onRewind();
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                if (!readModes.this.RatingCompat.AudioAttributesCompatParcelizer()) {
                    readModes.this.RatingCompat.RatingCompat();
                }
                readModes.this.RatingCompat.write(SearchView.read.SHOWN);
            }
        });
        animatorSetMediaMetadataCompat.start();
    }

    private AnimatorSet RatingCompat() {
        if (this.RatingCompat.AudioAttributesCompatParcelizer()) {
            this.RatingCompat.IconCompatParcelizer();
        }
        AnimatorSet animatorSetMediaMetadataCompat = MediaMetadataCompat(false);
        animatorSetMediaMetadataCompat.addListener(new AnimatorListenerAdapter() { // from class: o.readModes.3
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
                readModes.this.RatingCompat.write(SearchView.read.HIDING);
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                readModes.this.AudioAttributesImplBaseParcelizer.setVisibility(8);
                if (!readModes.this.RatingCompat.AudioAttributesCompatParcelizer()) {
                    readModes.this.RatingCompat.IconCompatParcelizer();
                }
                readModes.this.RatingCompat.write(SearchView.read.HIDDEN);
            }
        });
        animatorSetMediaMetadataCompat.start();
        return animatorSetMediaMetadataCompat;
    }

    private void MediaBrowserCompatSearchResultReceiver() {
        if (this.RatingCompat.AudioAttributesCompatParcelizer()) {
            final SearchView searchView = this.RatingCompat;
            Objects.requireNonNull(searchView);
            searchView.postDelayed(new Runnable() { // from class: o.readVorbisIdentificationHeader
                @Override // java.lang.Runnable
                public final void run() {
                    searchView.RatingCompat();
                }
            }, 150L);
        }
        this.AudioAttributesImplBaseParcelizer.setVisibility(4);
        this.AudioAttributesImplBaseParcelizer.post(new Runnable() { // from class: o.verifyVorbisHeaderCapturePattern
            @Override // java.lang.Runnable
            public final void run() {
                this.IconCompatParcelizer.IconCompatParcelizer();
            }
        });
    }

    final /* synthetic */ void IconCompatParcelizer() {
        this.AudioAttributesImplBaseParcelizer.setTranslationY(r0.getHeight());
        AnimatorSet animatorSetOnAddQueueItem = onAddQueueItem(true);
        animatorSetOnAddQueueItem.addListener(new AnimatorListenerAdapter() { // from class: o.readModes.2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
                readModes.this.AudioAttributesImplBaseParcelizer.setVisibility(0);
                readModes.this.RatingCompat.write(SearchView.read.SHOWING);
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                if (!readModes.this.RatingCompat.AudioAttributesCompatParcelizer()) {
                    readModes.this.RatingCompat.RatingCompat();
                }
                readModes.this.RatingCompat.write(SearchView.read.SHOWN);
            }
        });
        animatorSetOnAddQueueItem.start();
    }

    private AnimatorSet MediaDescriptionCompat() {
        if (this.RatingCompat.AudioAttributesCompatParcelizer()) {
            this.RatingCompat.IconCompatParcelizer();
        }
        AnimatorSet animatorSetOnAddQueueItem = onAddQueueItem(false);
        animatorSetOnAddQueueItem.addListener(new AnimatorListenerAdapter() { // from class: o.readModes.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
                readModes.this.RatingCompat.write(SearchView.read.HIDING);
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                readModes.this.AudioAttributesImplBaseParcelizer.setVisibility(8);
                if (!readModes.this.RatingCompat.AudioAttributesCompatParcelizer()) {
                    readModes.this.RatingCompat.IconCompatParcelizer();
                }
                readModes.this.RatingCompat.write(SearchView.read.HIDDEN);
            }
        });
        animatorSetOnAddQueueItem.start();
        return animatorSetOnAddQueueItem;
    }

    private AnimatorSet onAddQueueItem(boolean z) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(MediaBrowserCompatItemReceiver());
        IconCompatParcelizer(animatorSet);
        animatorSet.setInterpolator(checkAndReadSampleRate.write(z, BinarySearchSeekerSeekOperationParams.AudioAttributesCompatParcelizer));
        animatorSet.setDuration(z ? 350L : 300L);
        return animatorSet;
    }

    private Animator MediaBrowserCompatItemReceiver() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.AudioAttributesImplBaseParcelizer.getHeight(), BitmapDescriptorFactory.HUE_RED);
        valueAnimatorOfFloat.addUpdateListener(checkContainerInput.IconCompatParcelizer(this.AudioAttributesImplBaseParcelizer));
        return valueAnimatorOfFloat;
    }

    private AnimatorSet MediaMetadataCompat(final boolean z) {
        AnimatorSet animatorSet = new AnimatorSet();
        if (this.read == null) {
            animatorSet.playTogether(IconCompatParcelizer(z), AudioAttributesCompatParcelizer(z));
        }
        animatorSet.playTogether(MediaBrowserCompatMediaItem(z), MediaDescriptionCompat(z), write(z), MediaBrowserCompatItemReceiver(z), RatingCompat(z), AudioAttributesImplBaseParcelizer(z), read(z), AudioAttributesImplApi26Parcelizer(z), MediaBrowserCompatSearchResultReceiver(z));
        animatorSet.addListener(new AnimatorListenerAdapter() { // from class: o.readModes.4
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
                readModes.this.RemoteActionCompatParcelizer(z ? BitmapDescriptorFactory.HUE_RED : 1.0f);
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                readModes.this.RemoteActionCompatParcelizer(z ? 1.0f : BitmapDescriptorFactory.HUE_RED);
                readModes.this.AudioAttributesImplBaseParcelizer.read();
            }
        });
        return animatorSet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void RemoteActionCompatParcelizer(float f) {
        this.write.setAlpha(f);
        this.AudioAttributesCompatParcelizer.setAlpha(f);
        this.RemoteActionCompatParcelizer.setAlpha(f);
        read(f);
    }

    private void read(float f) {
        ActionMenuView actionMenuViewWrite;
        if (!this.RatingCompat.MediaBrowserCompatItemReceiver() || (actionMenuViewWrite = readMetadataBlock.write(this.MediaDescriptionCompat)) == null) {
            return;
        }
        actionMenuViewWrite.setAlpha(f);
    }

    private Animator MediaBrowserCompatMediaItem(boolean z) {
        TimeInterpolator timeInterpolator = z ? BinarySearchSeekerSeekOperationParams.write : BinarySearchSeekerSeekOperationParams.AudioAttributesCompatParcelizer;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f);
        valueAnimatorOfFloat.setDuration(z ? 300L : 250L);
        valueAnimatorOfFloat.setInterpolator(checkAndReadSampleRate.write(z, timeInterpolator));
        valueAnimatorOfFloat.addUpdateListener(checkContainerInput.AudioAttributesCompatParcelizer(this.AudioAttributesImplApi26Parcelizer));
        return valueAnimatorOfFloat;
    }

    private Animator MediaDescriptionCompat(boolean z) {
        Rect rectRemoteActionCompatParcelizer = this.IconCompatParcelizer.RemoteActionCompatParcelizer();
        Rect rectWrite = this.IconCompatParcelizer.write();
        if (rectRemoteActionCompatParcelizer == null) {
            rectRemoteActionCompatParcelizer = checkAndPeekStreamMarker.IconCompatParcelizer(this.RatingCompat);
        }
        if (rectWrite == null) {
            rectWrite = checkAndPeekStreamMarker.IconCompatParcelizer(this.AudioAttributesImplBaseParcelizer, this.MediaBrowserCompatSearchResultReceiver);
        }
        final Rect rect = new Rect(rectWrite);
        final float fOnPrepare = this.MediaBrowserCompatSearchResultReceiver.onPrepare();
        final float fMax = Math.max(this.AudioAttributesImplBaseParcelizer.write(), this.IconCompatParcelizer.read());
        ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(new checkAndReadFrameHeader(rect), rectWrite, rectRemoteActionCompatParcelizer);
        valueAnimatorOfObject.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.readResidues
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.write.read(fOnPrepare, fMax, rect, valueAnimator);
            }
        });
        valueAnimatorOfObject.setDuration(z ? 300L : 250L);
        valueAnimatorOfObject.setInterpolator(checkAndReadSampleRate.write(z, BinarySearchSeekerSeekOperationParams.AudioAttributesCompatParcelizer));
        return valueAnimatorOfObject;
    }

    final /* synthetic */ void read(float f, float f2, Rect rect, ValueAnimator valueAnimator) {
        this.AudioAttributesImplBaseParcelizer.AudioAttributesCompatParcelizer(rect, BinarySearchSeekerSeekOperationParams.read(f, f2, valueAnimator.getAnimatedFraction()));
    }

    private Animator write(boolean z) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f);
        valueAnimatorOfFloat.setDuration(z ? 50L : 42L);
        valueAnimatorOfFloat.setStartDelay(z ? 250L : 0L);
        valueAnimatorOfFloat.setInterpolator(checkAndReadSampleRate.write(z, BinarySearchSeekerSeekOperationParams.write));
        valueAnimatorOfFloat.addUpdateListener(checkContainerInput.AudioAttributesCompatParcelizer(this.write));
        return valueAnimatorOfFloat;
    }

    private AnimatorSet IconCompatParcelizer(boolean z) {
        AnimatorSet animatorSet = new AnimatorSet();
        IconCompatParcelizer(animatorSet);
        animatorSet.setDuration(z ? 300L : 250L);
        animatorSet.setInterpolator(checkAndReadSampleRate.write(z, BinarySearchSeekerSeekOperationParams.AudioAttributesCompatParcelizer));
        return animatorSet;
    }

    private AnimatorSet AudioAttributesCompatParcelizer(boolean z) {
        AnimatorSet animatorSet = new AnimatorSet();
        read(animatorSet);
        AudioAttributesCompatParcelizer(animatorSet);
        animatorSet.setDuration(z ? 300L : 250L);
        animatorSet.setInterpolator(checkAndReadSampleRate.write(z, BinarySearchSeekerSeekOperationParams.AudioAttributesCompatParcelizer));
        return animatorSet;
    }

    private void read(AnimatorSet animatorSet) {
        ImageButton imageButtonIconCompatParcelizer = readMetadataBlock.IconCompatParcelizer(this.MediaDescriptionCompat);
        if (imageButtonIconCompatParcelizer == null) {
            return;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(RemoteActionCompatParcelizer(imageButtonIconCompatParcelizer), BitmapDescriptorFactory.HUE_RED);
        valueAnimatorOfFloat.addUpdateListener(checkContainerInput.write(imageButtonIconCompatParcelizer));
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(AudioAttributesImplApi26Parcelizer(), BitmapDescriptorFactory.HUE_RED);
        valueAnimatorOfFloat2.addUpdateListener(checkContainerInput.IconCompatParcelizer(imageButtonIconCompatParcelizer));
        animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
    }

    private void IconCompatParcelizer(AnimatorSet animatorSet) {
        ImageButton imageButtonIconCompatParcelizer = readMetadataBlock.IconCompatParcelizer(this.MediaDescriptionCompat);
        if (imageButtonIconCompatParcelizer == null) {
            return;
        }
        Drawable drawableAudioAttributesImplApi21Parcelizer = findFormatOverrides.AudioAttributesImplApi21Parcelizer(imageButtonIconCompatParcelizer.getDrawable());
        if (this.RatingCompat.RemoteActionCompatParcelizer()) {
            write(animatorSet, drawableAudioAttributesImplApi21Parcelizer);
            IconCompatParcelizer(animatorSet, drawableAudioAttributesImplApi21Parcelizer);
        } else {
            AudioAttributesCompatParcelizer(drawableAudioAttributesImplApi21Parcelizer);
        }
    }

    private static void write(AnimatorSet animatorSet, Drawable drawable) {
        if (drawable instanceof getOnBackPressedDispatcher) {
            final getOnBackPressedDispatcher getonbackpresseddispatcher = (getOnBackPressedDispatcher) drawable;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f);
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.readVorbisCommentHeader
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    getonbackpresseddispatcher.AudioAttributesCompatParcelizer(((Float) valueAnimator.getAnimatedValue()).floatValue());
                }
            });
            animatorSet.playTogether(valueAnimatorOfFloat);
        }
    }

    private static void IconCompatParcelizer(AnimatorSet animatorSet, Drawable drawable) {
        if (drawable instanceof ExtractorInput) {
            final ExtractorInput extractorInput = (ExtractorInput) drawable;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f);
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.VorbisUtilCommentHeader
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    extractorInput.IconCompatParcelizer(((Float) valueAnimator.getAnimatedValue()).floatValue());
                }
            });
            animatorSet.playTogether(valueAnimatorOfFloat);
        }
    }

    private static void AudioAttributesCompatParcelizer(Drawable drawable) {
        if (drawable instanceof getOnBackPressedDispatcher) {
            ((getOnBackPressedDispatcher) drawable).AudioAttributesCompatParcelizer(1.0f);
        }
        if (drawable instanceof ExtractorInput) {
            ((ExtractorInput) drawable).IconCompatParcelizer(1.0f);
        }
    }

    private void AudioAttributesCompatParcelizer(AnimatorSet animatorSet) {
        ActionMenuView actionMenuViewWrite = readMetadataBlock.write(this.MediaDescriptionCompat);
        if (actionMenuViewWrite == null) {
            return;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(IconCompatParcelizer(actionMenuViewWrite), BitmapDescriptorFactory.HUE_RED);
        valueAnimatorOfFloat.addUpdateListener(checkContainerInput.write(actionMenuViewWrite));
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(AudioAttributesImplApi26Parcelizer(), BitmapDescriptorFactory.HUE_RED);
        valueAnimatorOfFloat2.addUpdateListener(checkContainerInput.IconCompatParcelizer(actionMenuViewWrite));
        animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
    }

    private Animator AudioAttributesImplBaseParcelizer(boolean z) {
        return IconCompatParcelizer(z, false, this.AudioAttributesImplApi21Parcelizer);
    }

    private Animator RatingCompat(boolean z) {
        return IconCompatParcelizer(z, false, this.MediaBrowserCompatCustomActionResultReceiver);
    }

    private Animator read(boolean z) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f);
        valueAnimatorOfFloat.setDuration(z ? 300L : 250L);
        valueAnimatorOfFloat.setInterpolator(checkAndReadSampleRate.write(z, BinarySearchSeekerSeekOperationParams.AudioAttributesCompatParcelizer));
        if (this.RatingCompat.MediaBrowserCompatItemReceiver()) {
            valueAnimatorOfFloat.addUpdateListener(new peekFullyQuietly(readMetadataBlock.write(this.AudioAttributesImplApi21Parcelizer), readMetadataBlock.write(this.MediaDescriptionCompat)));
        }
        return valueAnimatorOfFloat;
    }

    private Animator MediaBrowserCompatSearchResultReceiver(boolean z) {
        return IconCompatParcelizer(z, true, this.MediaBrowserCompatMediaItem);
    }

    private Animator AudioAttributesImplApi26Parcelizer(boolean z) {
        return IconCompatParcelizer(z, true, this.MediaBrowserCompatItemReceiver);
    }

    private Animator MediaBrowserCompatItemReceiver(boolean z) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(RemoteActionCompatParcelizer(z), MediaBrowserCompatCustomActionResultReceiver(z), AudioAttributesImplApi21Parcelizer(z));
        return animatorSet;
    }

    private Animator RemoteActionCompatParcelizer(boolean z) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f);
        valueAnimatorOfFloat.setDuration(z ? 150L : 83L);
        valueAnimatorOfFloat.setStartDelay(z ? 75L : 0L);
        valueAnimatorOfFloat.setInterpolator(checkAndReadSampleRate.write(z, BinarySearchSeekerSeekOperationParams.write));
        valueAnimatorOfFloat.addUpdateListener(checkContainerInput.AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer, this.RemoteActionCompatParcelizer));
        return valueAnimatorOfFloat;
    }

    private Animator MediaBrowserCompatCustomActionResultReceiver(boolean z) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat((this.RemoteActionCompatParcelizer.getHeight() * 0.050000012f) / 2.0f, BitmapDescriptorFactory.HUE_RED);
        valueAnimatorOfFloat.setDuration(z ? 300L : 250L);
        valueAnimatorOfFloat.setInterpolator(checkAndReadSampleRate.write(z, BinarySearchSeekerSeekOperationParams.AudioAttributesCompatParcelizer));
        valueAnimatorOfFloat.addUpdateListener(checkContainerInput.IconCompatParcelizer(this.AudioAttributesCompatParcelizer));
        return valueAnimatorOfFloat;
    }

    private Animator AudioAttributesImplApi21Parcelizer(boolean z) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.95f, 1.0f);
        valueAnimatorOfFloat.setDuration(z ? 300L : 250L);
        valueAnimatorOfFloat.setInterpolator(checkAndReadSampleRate.write(z, BinarySearchSeekerSeekOperationParams.AudioAttributesCompatParcelizer));
        valueAnimatorOfFloat.addUpdateListener(checkContainerInput.read(this.RemoteActionCompatParcelizer));
        return valueAnimatorOfFloat;
    }

    private Animator IconCompatParcelizer(boolean z, boolean z2, View view) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(z2 ? RemoteActionCompatParcelizer(view) : IconCompatParcelizer(view), BitmapDescriptorFactory.HUE_RED);
        valueAnimatorOfFloat.addUpdateListener(checkContainerInput.write(view));
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(AudioAttributesImplApi26Parcelizer(), BitmapDescriptorFactory.HUE_RED);
        valueAnimatorOfFloat2.addUpdateListener(checkContainerInput.IconCompatParcelizer(view));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
        animatorSet.setDuration(z ? 300L : 250L);
        animatorSet.setInterpolator(checkAndReadSampleRate.write(z, BinarySearchSeekerSeekOperationParams.AudioAttributesCompatParcelizer));
        return animatorSet;
    }

    private int RemoteActionCompatParcelizer(View view) {
        int iWrite = mapArray.write((ViewGroup.MarginLayoutParams) view.getLayoutParams());
        int iOnCommand = InvalidTypeIdException.onCommand(this.MediaBrowserCompatSearchResultReceiver);
        if (checkAndPeekStreamMarker.AudioAttributesImplBaseParcelizer(this.MediaBrowserCompatSearchResultReceiver)) {
            return ((this.MediaBrowserCompatSearchResultReceiver.getWidth() - this.MediaBrowserCompatSearchResultReceiver.getRight()) + iWrite) - iOnCommand;
        }
        return (this.MediaBrowserCompatSearchResultReceiver.getLeft() - iWrite) + iOnCommand;
    }

    private int IconCompatParcelizer(View view) {
        int iRemoteActionCompatParcelizer = mapArray.RemoteActionCompatParcelizer((ViewGroup.MarginLayoutParams) view.getLayoutParams());
        if (checkAndPeekStreamMarker.AudioAttributesImplBaseParcelizer(this.MediaBrowserCompatSearchResultReceiver)) {
            return this.MediaBrowserCompatSearchResultReceiver.getLeft() - iRemoteActionCompatParcelizer;
        }
        return (this.MediaBrowserCompatSearchResultReceiver.getRight() - this.RatingCompat.getWidth()) + iRemoteActionCompatParcelizer;
    }

    private int AudioAttributesImplApi26Parcelizer() {
        return ((this.MediaBrowserCompatSearchResultReceiver.getTop() + this.MediaBrowserCompatSearchResultReceiver.getBottom()) / 2) - ((this.MediaMetadataCompat.getTop() + this.MediaMetadataCompat.getBottom()) / 2);
    }

    private void MediaBrowserCompatCustomActionResultReceiver() {
        Menu menuMediaBrowserCompatCustomActionResultReceiver = this.AudioAttributesImplApi21Parcelizer.MediaBrowserCompatCustomActionResultReceiver();
        if (menuMediaBrowserCompatCustomActionResultReceiver != null) {
            menuMediaBrowserCompatCustomActionResultReceiver.clear();
        }
        if (this.MediaBrowserCompatSearchResultReceiver.onPrepareFromMediaId() != -1 && this.RatingCompat.MediaBrowserCompatItemReceiver()) {
            this.AudioAttributesImplApi21Parcelizer.write(this.MediaBrowserCompatSearchResultReceiver.onPrepareFromMediaId());
            write(this.AudioAttributesImplApi21Parcelizer);
            this.AudioAttributesImplApi21Parcelizer.setVisibility(0);
            return;
        }
        this.AudioAttributesImplApi21Parcelizer.setVisibility(8);
    }

    private static void write(Toolbar toolbar) {
        ActionMenuView actionMenuViewWrite = readMetadataBlock.write(toolbar);
        if (actionMenuViewWrite != null) {
            for (int i = 0; i < actionMenuViewWrite.getChildCount(); i++) {
                View childAt = actionMenuViewWrite.getChildAt(i);
                childAt.setClickable(false);
                childAt.setFocusable(false);
                childAt.setFocusableInTouchMode(false);
            }
        }
    }

    public final void IconCompatParcelizer(AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer) {
        this.IconCompatParcelizer.read(audioAttributesImplApi26Parcelizer, this.MediaBrowserCompatSearchResultReceiver);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void AudioAttributesCompatParcelizer(AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer) {
        if (audioAttributesImplApi26Parcelizer.getWrite() > BitmapDescriptorFactory.HUE_RED) {
            getBitsPerSampleLookupKey getbitspersamplelookupkey = this.IconCompatParcelizer;
            SearchBar searchBar = this.MediaBrowserCompatSearchResultReceiver;
            getbitspersamplelookupkey.RemoteActionCompatParcelizer(audioAttributesImplApi26Parcelizer, searchBar, searchBar.onPrepare());
            AnimatorSet animatorSet = this.read;
            if (animatorSet == null) {
                if (this.RatingCompat.AudioAttributesCompatParcelizer()) {
                    this.RatingCompat.IconCompatParcelizer();
                }
                if (this.RatingCompat.RemoteActionCompatParcelizer()) {
                    AnimatorSet animatorSetIconCompatParcelizer = IconCompatParcelizer(false);
                    this.read = animatorSetIconCompatParcelizer;
                    animatorSetIconCompatParcelizer.start();
                    this.read.pause();
                    return;
                }
                return;
            }
            animatorSet.setCurrentPlayTime((long) (audioAttributesImplApi26Parcelizer.getWrite() * this.read.getDuration()));
        }
    }

    public final AudioAttributesImplApi26Parcelizer AudioAttributesImplBaseParcelizer() {
        return this.IconCompatParcelizer.IconCompatParcelizer();
    }

    public final void write() {
        this.IconCompatParcelizer.AudioAttributesCompatParcelizer(AudioAttributesCompatParcelizer().getTotalDuration(), this.MediaBrowserCompatSearchResultReceiver);
        if (this.read != null) {
            AudioAttributesCompatParcelizer(false).start();
            this.read.resume();
        }
        this.read = null;
    }

    public final void RemoteActionCompatParcelizer() {
        this.IconCompatParcelizer.IconCompatParcelizer(this.MediaBrowserCompatSearchResultReceiver);
        AnimatorSet animatorSet = this.read;
        if (animatorSet != null) {
            animatorSet.reverse();
        }
        this.read = null;
    }
}
