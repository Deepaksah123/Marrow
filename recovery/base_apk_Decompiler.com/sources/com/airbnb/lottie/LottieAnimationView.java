package com.airbnb.lottie;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.zip.ZipInputStream;
import kotlin.ExoPlayerImplExternalSyntheticLambda10;
import kotlin.ExoPlayerImplExternalSyntheticLambda12;
import kotlin.ExoPlayerImplExternalSyntheticLambda14;
import kotlin.ExoPlayerImplExternalSyntheticLambda18;
import kotlin.ExoPlayerImplExternalSyntheticLambda19;
import kotlin.ExoPlayerImplExternalSyntheticLambda21;
import kotlin.ExoPlayerImplExternalSyntheticLambda6;
import kotlin.access3000;
import kotlin.getDefaultViewModelCreationExtras;
import kotlin.maybeTriggerPendingMessages;
import kotlin.onAudioDecoderReleased;
import kotlin.onAudioEnabled;
import kotlin.onAudioPositionAdvancing;
import kotlin.onAudioUnderrun;
import kotlin.onCues;
import kotlin.onDroppedFrames;
import kotlin.onSkipSilenceEnabledChanged;
import kotlin.onStreamTypeChanged;
import kotlin.onSurfaceTextureSizeChanged;
import kotlin.onVideoCodecError;
import kotlin.setDrmInitData;
import kotlin.setEncoderPadding;

/* JADX INFO: loaded from: classes2.dex */
public class LottieAnimationView extends AppCompatImageView {
    private static final onAudioEnabled<Throwable> write = new onAudioEnabled() { // from class: o.ExoPlayerImplExternalSyntheticLambda17
        @Override // kotlin.onAudioEnabled
        public final void onResult(Object obj) {
            LottieAnimationView.RemoteActionCompatParcelizer((Throwable) obj);
        }
    };
    private int AudioAttributesCompatParcelizer;
    private int AudioAttributesImplApi21Parcelizer;
    private boolean AudioAttributesImplApi26Parcelizer;
    private onAudioEnabled<Throwable> AudioAttributesImplBaseParcelizer;
    private boolean IconCompatParcelizer;
    private final onAudioEnabled<ExoPlayerImplExternalSyntheticLambda19> MediaBrowserCompatCustomActionResultReceiver;
    private onCues<ExoPlayerImplExternalSyntheticLambda19> MediaBrowserCompatItemReceiver;
    private final Set<AudioAttributesCompatParcelizer> MediaBrowserCompatSearchResultReceiver;
    private final Set<onAudioUnderrun> MediaDescriptionCompat;
    private final ExoPlayerImplExternalSyntheticLambda6 MediaMetadataCompat;
    private final onAudioEnabled<Throwable> RatingCompat;
    private boolean RemoteActionCompatParcelizer;
    private String read;

    enum AudioAttributesCompatParcelizer {
        SET_ANIMATION,
        SET_PROGRESS,
        SET_REPEAT_MODE,
        SET_REPEAT_COUNT,
        SET_IMAGE_ASSETS,
        PLAY_OPTION
    }

    public static /* synthetic */ void RemoteActionCompatParcelizer(Throwable th) {
        if (setEncoderPadding.write(th)) {
            access3000.IconCompatParcelizer("Unable to load composition.", th);
            return;
        }
        throw new IllegalStateException("Unable to parse composition", th);
    }

    static class read implements onAudioEnabled<ExoPlayerImplExternalSyntheticLambda19> {
        private final WeakReference<LottieAnimationView> IconCompatParcelizer;

        public read(LottieAnimationView lottieAnimationView) {
            this.IconCompatParcelizer = new WeakReference<>(lottieAnimationView);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.onAudioEnabled
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public void onResult(ExoPlayerImplExternalSyntheticLambda19 exoPlayerImplExternalSyntheticLambda19) {
            LottieAnimationView lottieAnimationView = this.IconCompatParcelizer.get();
            if (lottieAnimationView == null) {
                return;
            }
            lottieAnimationView.setComposition(exoPlayerImplExternalSyntheticLambda19);
        }
    }

    static class IconCompatParcelizer implements onAudioEnabled<Throwable> {
        private final WeakReference<LottieAnimationView> IconCompatParcelizer;

        public IconCompatParcelizer(LottieAnimationView lottieAnimationView) {
            this.IconCompatParcelizer = new WeakReference<>(lottieAnimationView);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.onAudioEnabled
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public void onResult(Throwable th) {
            LottieAnimationView lottieAnimationView = this.IconCompatParcelizer.get();
            if (lottieAnimationView == null) {
                return;
            }
            if (lottieAnimationView.AudioAttributesImplApi21Parcelizer != 0) {
                lottieAnimationView.setImageResource(lottieAnimationView.AudioAttributesImplApi21Parcelizer);
            }
            (lottieAnimationView.AudioAttributesImplBaseParcelizer == null ? LottieAnimationView.write : lottieAnimationView.AudioAttributesImplBaseParcelizer).onResult(th);
        }
    }

    public LottieAnimationView(Context context) {
        super(context);
        this.MediaBrowserCompatCustomActionResultReceiver = new read(this);
        this.RatingCompat = new IconCompatParcelizer(this);
        this.AudioAttributesImplApi21Parcelizer = 0;
        this.MediaMetadataCompat = new ExoPlayerImplExternalSyntheticLambda6();
        this.AudioAttributesImplApi26Parcelizer = false;
        this.RemoteActionCompatParcelizer = false;
        this.IconCompatParcelizer = true;
        this.MediaBrowserCompatSearchResultReceiver = new HashSet();
        this.MediaDescriptionCompat = new HashSet();
        IconCompatParcelizer((AttributeSet) null, onSkipSilenceEnabledChanged.AudioAttributesCompatParcelizer.lottieAnimationViewStyle);
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.MediaBrowserCompatCustomActionResultReceiver = new read(this);
        this.RatingCompat = new IconCompatParcelizer(this);
        this.AudioAttributesImplApi21Parcelizer = 0;
        this.MediaMetadataCompat = new ExoPlayerImplExternalSyntheticLambda6();
        this.AudioAttributesImplApi26Parcelizer = false;
        this.RemoteActionCompatParcelizer = false;
        this.IconCompatParcelizer = true;
        this.MediaBrowserCompatSearchResultReceiver = new HashSet();
        this.MediaDescriptionCompat = new HashSet();
        IconCompatParcelizer(attributeSet, onSkipSilenceEnabledChanged.AudioAttributesCompatParcelizer.lottieAnimationViewStyle);
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.MediaBrowserCompatCustomActionResultReceiver = new read(this);
        this.RatingCompat = new IconCompatParcelizer(this);
        this.AudioAttributesImplApi21Parcelizer = 0;
        this.MediaMetadataCompat = new ExoPlayerImplExternalSyntheticLambda6();
        this.AudioAttributesImplApi26Parcelizer = false;
        this.RemoteActionCompatParcelizer = false;
        this.IconCompatParcelizer = true;
        this.MediaBrowserCompatSearchResultReceiver = new HashSet();
        this.MediaDescriptionCompat = new HashSet();
        IconCompatParcelizer(attributeSet, i);
    }

    private void IconCompatParcelizer(AttributeSet attributeSet, int i) {
        String string;
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, onSkipSilenceEnabledChanged.write.LottieAnimationView, i, 0);
        this.IconCompatParcelizer = typedArrayObtainStyledAttributes.getBoolean(onSkipSilenceEnabledChanged.write.LottieAnimationView_lottie_cacheComposition, true);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(onSkipSilenceEnabledChanged.write.LottieAnimationView_lottie_rawRes);
        boolean zHasValue2 = typedArrayObtainStyledAttributes.hasValue(onSkipSilenceEnabledChanged.write.LottieAnimationView_lottie_fileName);
        boolean zHasValue3 = typedArrayObtainStyledAttributes.hasValue(onSkipSilenceEnabledChanged.write.LottieAnimationView_lottie_url);
        if (zHasValue && zHasValue2) {
            throw new IllegalArgumentException("lottie_rawRes and lottie_fileName cannot be used at the same time. Please use only one at once.");
        }
        if (zHasValue) {
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(onSkipSilenceEnabledChanged.write.LottieAnimationView_lottie_rawRes, 0);
            if (resourceId != 0) {
                setAnimation(resourceId);
            }
        } else if (zHasValue2) {
            String string2 = typedArrayObtainStyledAttributes.getString(onSkipSilenceEnabledChanged.write.LottieAnimationView_lottie_fileName);
            if (string2 != null) {
                setAnimation(string2);
            }
        } else if (zHasValue3 && (string = typedArrayObtainStyledAttributes.getString(onSkipSilenceEnabledChanged.write.LottieAnimationView_lottie_url)) != null) {
            setAnimationFromUrl(string);
        }
        setFallbackResource(typedArrayObtainStyledAttributes.getResourceId(onSkipSilenceEnabledChanged.write.LottieAnimationView_lottie_fallbackRes, 0));
        if (typedArrayObtainStyledAttributes.getBoolean(onSkipSilenceEnabledChanged.write.LottieAnimationView_lottie_autoPlay, false)) {
            this.RemoteActionCompatParcelizer = true;
        }
        if (typedArrayObtainStyledAttributes.getBoolean(onSkipSilenceEnabledChanged.write.LottieAnimationView_lottie_loop, false)) {
            this.MediaMetadataCompat.AudioAttributesImplApi26Parcelizer(-1);
        }
        if (typedArrayObtainStyledAttributes.hasValue(onSkipSilenceEnabledChanged.write.LottieAnimationView_lottie_repeatMode)) {
            setRepeatMode(typedArrayObtainStyledAttributes.getInt(onSkipSilenceEnabledChanged.write.LottieAnimationView_lottie_repeatMode, 1));
        }
        if (typedArrayObtainStyledAttributes.hasValue(onSkipSilenceEnabledChanged.write.LottieAnimationView_lottie_repeatCount)) {
            setRepeatCount(typedArrayObtainStyledAttributes.getInt(onSkipSilenceEnabledChanged.write.LottieAnimationView_lottie_repeatCount, -1));
        }
        if (typedArrayObtainStyledAttributes.hasValue(onSkipSilenceEnabledChanged.write.LottieAnimationView_lottie_speed)) {
            setSpeed(typedArrayObtainStyledAttributes.getFloat(onSkipSilenceEnabledChanged.write.LottieAnimationView_lottie_speed, 1.0f));
        }
        if (typedArrayObtainStyledAttributes.hasValue(onSkipSilenceEnabledChanged.write.LottieAnimationView_lottie_clipToCompositionBounds)) {
            setClipToCompositionBounds(typedArrayObtainStyledAttributes.getBoolean(onSkipSilenceEnabledChanged.write.LottieAnimationView_lottie_clipToCompositionBounds, true));
        }
        if (typedArrayObtainStyledAttributes.hasValue(onSkipSilenceEnabledChanged.write.LottieAnimationView_lottie_clipTextToBoundingBox)) {
            setClipTextToBoundingBox(typedArrayObtainStyledAttributes.getBoolean(onSkipSilenceEnabledChanged.write.LottieAnimationView_lottie_clipTextToBoundingBox, false));
        }
        if (typedArrayObtainStyledAttributes.hasValue(onSkipSilenceEnabledChanged.write.LottieAnimationView_lottie_defaultFontFileExtension)) {
            setDefaultFontFileExtension(typedArrayObtainStyledAttributes.getString(onSkipSilenceEnabledChanged.write.LottieAnimationView_lottie_defaultFontFileExtension));
        }
        setImageAssetsFolder(typedArrayObtainStyledAttributes.getString(onSkipSilenceEnabledChanged.write.LottieAnimationView_lottie_imageAssetsFolder));
        IconCompatParcelizer(typedArrayObtainStyledAttributes.getFloat(onSkipSilenceEnabledChanged.write.LottieAnimationView_lottie_progress, BitmapDescriptorFactory.HUE_RED), typedArrayObtainStyledAttributes.hasValue(onSkipSilenceEnabledChanged.write.LottieAnimationView_lottie_progress));
        read(typedArrayObtainStyledAttributes.getBoolean(onSkipSilenceEnabledChanged.write.LottieAnimationView_lottie_enableMergePathsForKitKatAndAbove, false));
        setApplyingOpacityToLayersEnabled(typedArrayObtainStyledAttributes.getBoolean(onSkipSilenceEnabledChanged.write.LottieAnimationView_lottie_applyOpacityToLayers, false));
        setApplyingShadowToLayersEnabled(typedArrayObtainStyledAttributes.getBoolean(onSkipSilenceEnabledChanged.write.LottieAnimationView_lottie_applyShadowToLayers, true));
        if (typedArrayObtainStyledAttributes.hasValue(onSkipSilenceEnabledChanged.write.LottieAnimationView_lottie_colorFilter)) {
            AudioAttributesCompatParcelizer(new maybeTriggerPendingMessages("**"), onAudioPositionAdvancing.RemoteActionCompatParcelizer, new setDrmInitData(new onSurfaceTextureSizeChanged(getDefaultViewModelCreationExtras.IconCompatParcelizer(getContext(), typedArrayObtainStyledAttributes.getResourceId(onSkipSilenceEnabledChanged.write.LottieAnimationView_lottie_colorFilter, -1)).getDefaultColor())));
        }
        if (typedArrayObtainStyledAttributes.hasValue(onSkipSilenceEnabledChanged.write.LottieAnimationView_lottie_renderMode)) {
            int iOrdinal = typedArrayObtainStyledAttributes.getInt(onSkipSilenceEnabledChanged.write.LottieAnimationView_lottie_renderMode, onStreamTypeChanged.AUTOMATIC.ordinal());
            if (iOrdinal >= onStreamTypeChanged.values().length) {
                iOrdinal = onStreamTypeChanged.AUTOMATIC.ordinal();
            }
            setRenderMode(onStreamTypeChanged.values()[iOrdinal]);
        }
        if (typedArrayObtainStyledAttributes.hasValue(onSkipSilenceEnabledChanged.write.LottieAnimationView_lottie_asyncUpdates)) {
            int iOrdinal2 = typedArrayObtainStyledAttributes.getInt(onSkipSilenceEnabledChanged.write.LottieAnimationView_lottie_asyncUpdates, ExoPlayerImplExternalSyntheticLambda14.AUTOMATIC.ordinal());
            if (iOrdinal2 >= onStreamTypeChanged.values().length) {
                iOrdinal2 = ExoPlayerImplExternalSyntheticLambda14.AUTOMATIC.ordinal();
            }
            setAsyncUpdates(ExoPlayerImplExternalSyntheticLambda14.values()[iOrdinal2]);
        }
        setIgnoreDisabledSystemAnimations(typedArrayObtainStyledAttributes.getBoolean(onSkipSilenceEnabledChanged.write.LottieAnimationView_lottie_ignoreDisabledSystemAnimations, false));
        if (typedArrayObtainStyledAttributes.hasValue(onSkipSilenceEnabledChanged.write.LottieAnimationView_lottie_useCompositionFrameRate)) {
            setUseCompositionFrameRate(typedArrayObtainStyledAttributes.getBoolean(onSkipSilenceEnabledChanged.write.LottieAnimationView_lottie_useCompositionFrameRate, false));
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i) {
        this.AudioAttributesCompatParcelizer = 0;
        this.read = null;
        RemoteActionCompatParcelizer();
        super.setImageResource(i);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        this.AudioAttributesCompatParcelizer = 0;
        this.read = null;
        RemoteActionCompatParcelizer();
        super.setImageDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        this.AudioAttributesCompatParcelizer = 0;
        this.read = null;
        RemoteActionCompatParcelizer();
        super.setImageBitmap(bitmap);
    }

    @Override // android.view.View
    public void unscheduleDrawable(Drawable drawable) {
        ExoPlayerImplExternalSyntheticLambda6 exoPlayerImplExternalSyntheticLambda6;
        if (!this.AudioAttributesImplApi26Parcelizer && drawable == (exoPlayerImplExternalSyntheticLambda6 = this.MediaMetadataCompat) && exoPlayerImplExternalSyntheticLambda6.MediaDescriptionCompat()) {
            AudioAttributesImplApi21Parcelizer();
        } else if (!this.AudioAttributesImplApi26Parcelizer && (drawable instanceof ExoPlayerImplExternalSyntheticLambda6)) {
            ExoPlayerImplExternalSyntheticLambda6 exoPlayerImplExternalSyntheticLambda62 = (ExoPlayerImplExternalSyntheticLambda6) drawable;
            if (exoPlayerImplExternalSyntheticLambda62.MediaDescriptionCompat()) {
                exoPlayerImplExternalSyntheticLambda62.onCustomAction();
            }
        }
        super.unscheduleDrawable(drawable);
    }

    @Override // android.view.View
    public void invalidate() {
        super.invalidate();
        Drawable drawable = getDrawable();
        if ((drawable instanceof ExoPlayerImplExternalSyntheticLambda6) && ((ExoPlayerImplExternalSyntheticLambda6) drawable).AudioAttributesImplBaseParcelizer() == onStreamTypeChanged.SOFTWARE) {
            this.MediaMetadataCompat.invalidateSelf();
        }
    }

    @Override // android.widget.ImageView, android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Drawable drawable2 = getDrawable();
        ExoPlayerImplExternalSyntheticLambda6 exoPlayerImplExternalSyntheticLambda6 = this.MediaMetadataCompat;
        if (drawable2 == exoPlayerImplExternalSyntheticLambda6) {
            super.invalidateDrawable(exoPlayerImplExternalSyntheticLambda6);
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.read = this.read;
        savedState.RemoteActionCompatParcelizer = this.AudioAttributesCompatParcelizer;
        savedState.write = this.MediaMetadataCompat.MediaBrowserCompatCustomActionResultReceiver();
        savedState.IconCompatParcelizer = this.MediaMetadataCompat.RatingCompat();
        savedState.AudioAttributesCompatParcelizer = this.MediaMetadataCompat.IconCompatParcelizer();
        savedState.AudioAttributesImplApi21Parcelizer = this.MediaMetadataCompat.MediaBrowserCompatItemReceiver();
        savedState.MediaBrowserCompatCustomActionResultReceiver = this.MediaMetadataCompat.AudioAttributesImplApi26Parcelizer();
        return savedState;
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        int i;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.read = savedState.read;
        if (!this.MediaBrowserCompatSearchResultReceiver.contains(AudioAttributesCompatParcelizer.SET_ANIMATION) && !TextUtils.isEmpty(this.read)) {
            setAnimation(this.read);
        }
        this.AudioAttributesCompatParcelizer = savedState.RemoteActionCompatParcelizer;
        if (!this.MediaBrowserCompatSearchResultReceiver.contains(AudioAttributesCompatParcelizer.SET_ANIMATION) && (i = this.AudioAttributesCompatParcelizer) != 0) {
            setAnimation(i);
        }
        if (!this.MediaBrowserCompatSearchResultReceiver.contains(AudioAttributesCompatParcelizer.SET_PROGRESS)) {
            IconCompatParcelizer(savedState.write, false);
        }
        if (!this.MediaBrowserCompatSearchResultReceiver.contains(AudioAttributesCompatParcelizer.PLAY_OPTION) && savedState.IconCompatParcelizer) {
            write();
        }
        if (!this.MediaBrowserCompatSearchResultReceiver.contains(AudioAttributesCompatParcelizer.SET_IMAGE_ASSETS)) {
            setImageAssetsFolder(savedState.AudioAttributesCompatParcelizer);
        }
        if (!this.MediaBrowserCompatSearchResultReceiver.contains(AudioAttributesCompatParcelizer.SET_REPEAT_MODE)) {
            setRepeatMode(savedState.AudioAttributesImplApi21Parcelizer);
        }
        if (this.MediaBrowserCompatSearchResultReceiver.contains(AudioAttributesCompatParcelizer.SET_REPEAT_COUNT)) {
            return;
        }
        setRepeatCount(savedState.MediaBrowserCompatCustomActionResultReceiver);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isInEditMode() || !this.RemoteActionCompatParcelizer) {
            return;
        }
        this.MediaMetadataCompat.onCommand();
    }

    @Deprecated
    public void setIgnoreDisabledSystemAnimations(boolean z) {
        this.MediaMetadataCompat.RemoteActionCompatParcelizer(z);
    }

    public void setUseCompositionFrameRate(boolean z) {
        this.MediaMetadataCompat.MediaBrowserCompatItemReceiver(z);
    }

    public final void read(boolean z) {
        this.MediaMetadataCompat.read(onAudioDecoderReleased.MergePathsApi19, z);
    }

    public void setClipToCompositionBounds(boolean z) {
        this.MediaMetadataCompat.AudioAttributesCompatParcelizer(z);
    }

    public void setCacheComposition(boolean z) {
        this.IconCompatParcelizer = z;
    }

    public void setOutlineMasksAndMattes(boolean z) {
        this.MediaMetadataCompat.AudioAttributesImplApi26Parcelizer(z);
    }

    public void setAnimation(int i) {
        this.AudioAttributesCompatParcelizer = i;
        this.read = null;
        write(RemoteActionCompatParcelizer(i));
    }

    private onCues<ExoPlayerImplExternalSyntheticLambda19> RemoteActionCompatParcelizer(final int i) {
        if (isInEditMode()) {
            return new onCues<>(new Callable() { // from class: o.ExoPlayerImplExternalSyntheticLambda16
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.read.AudioAttributesCompatParcelizer(i);
                }
            }, true);
        }
        return this.IconCompatParcelizer ? ExoPlayerImplExternalSyntheticLambda21.IconCompatParcelizer(getContext(), i) : ExoPlayerImplExternalSyntheticLambda21.IconCompatParcelizer(getContext(), i, (String) null);
    }

    public final /* synthetic */ onDroppedFrames AudioAttributesCompatParcelizer(int i) throws Exception {
        return this.IconCompatParcelizer ? ExoPlayerImplExternalSyntheticLambda21.AudioAttributesCompatParcelizer(getContext(), i) : ExoPlayerImplExternalSyntheticLambda21.AudioAttributesCompatParcelizer(getContext(), i, (String) null);
    }

    public void setAnimation(String str) {
        this.read = str;
        this.AudioAttributesCompatParcelizer = 0;
        write(read(str));
    }

    private onCues<ExoPlayerImplExternalSyntheticLambda19> read(final String str) {
        if (isInEditMode()) {
            return new onCues<>(new Callable() { // from class: o.ExoPlayerImplExternalSyntheticLambda15
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.IconCompatParcelizer.write(str);
                }
            }, true);
        }
        return this.IconCompatParcelizer ? ExoPlayerImplExternalSyntheticLambda21.AudioAttributesCompatParcelizer(getContext(), str) : ExoPlayerImplExternalSyntheticLambda21.IconCompatParcelizer(getContext(), str, (String) null);
    }

    public final /* synthetic */ onDroppedFrames write(String str) throws Exception {
        return this.IconCompatParcelizer ? ExoPlayerImplExternalSyntheticLambda21.read(getContext(), str) : ExoPlayerImplExternalSyntheticLambda21.read(getContext(), str, (String) null);
    }

    @Deprecated
    public void setAnimationFromJson(String str) {
        setAnimationFromJson(str, null);
    }

    public void setAnimationFromJson(String str, String str2) {
        setAnimation(new ByteArrayInputStream(str.getBytes()), str2);
    }

    public void setAnimation(InputStream inputStream, String str) {
        write(ExoPlayerImplExternalSyntheticLambda21.RemoteActionCompatParcelizer(inputStream, str));
    }

    public void setAnimation(ZipInputStream zipInputStream, String str) {
        write(ExoPlayerImplExternalSyntheticLambda21.read(zipInputStream, str));
    }

    public void setAnimationFromUrl(String str) {
        write(this.IconCompatParcelizer ? ExoPlayerImplExternalSyntheticLambda21.IconCompatParcelizer(getContext(), str) : ExoPlayerImplExternalSyntheticLambda21.AudioAttributesCompatParcelizer(getContext(), str, (String) null));
    }

    public void setAnimationFromUrl(String str, String str2) {
        write(ExoPlayerImplExternalSyntheticLambda21.AudioAttributesCompatParcelizer(getContext(), str, str2));
    }

    public void setFailureListener(onAudioEnabled<Throwable> onaudioenabled) {
        this.AudioAttributesImplBaseParcelizer = onaudioenabled;
    }

    public void setFallbackResource(int i) {
        this.AudioAttributesImplApi21Parcelizer = i;
    }

    private void write(onCues<ExoPlayerImplExternalSyntheticLambda19> oncues) {
        onDroppedFrames<ExoPlayerImplExternalSyntheticLambda19> ondroppedframesAudioAttributesCompatParcelizer = oncues.AudioAttributesCompatParcelizer();
        ExoPlayerImplExternalSyntheticLambda6 exoPlayerImplExternalSyntheticLambda6 = this.MediaMetadataCompat;
        if (ondroppedframesAudioAttributesCompatParcelizer != null && exoPlayerImplExternalSyntheticLambda6 == getDrawable() && exoPlayerImplExternalSyntheticLambda6.RemoteActionCompatParcelizer() == ondroppedframesAudioAttributesCompatParcelizer.IconCompatParcelizer()) {
            return;
        }
        this.MediaBrowserCompatSearchResultReceiver.add(AudioAttributesCompatParcelizer.SET_ANIMATION);
        AudioAttributesCompatParcelizer();
        RemoteActionCompatParcelizer();
        this.MediaBrowserCompatItemReceiver = oncues.write(this.MediaBrowserCompatCustomActionResultReceiver).read(this.RatingCompat);
    }

    private void RemoteActionCompatParcelizer() {
        onCues<ExoPlayerImplExternalSyntheticLambda19> oncues = this.MediaBrowserCompatItemReceiver;
        if (oncues != null) {
            oncues.IconCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver);
            this.MediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer(this.RatingCompat);
        }
    }

    public void setComposition(ExoPlayerImplExternalSyntheticLambda19 exoPlayerImplExternalSyntheticLambda19) {
        boolean z = ExoPlayerImplExternalSyntheticLambda18.IconCompatParcelizer;
        this.MediaMetadataCompat.setCallback(this);
        this.AudioAttributesImplApi26Parcelizer = true;
        boolean zWrite = this.MediaMetadataCompat.write(exoPlayerImplExternalSyntheticLambda19);
        if (this.RemoteActionCompatParcelizer) {
            this.MediaMetadataCompat.onCommand();
        }
        this.AudioAttributesImplApi26Parcelizer = false;
        if (getDrawable() != this.MediaMetadataCompat || zWrite) {
            if (!zWrite) {
                read();
            }
            onVisibilityChanged(this, getVisibility());
            requestLayout();
            for (onAudioUnderrun onaudiounderrun : this.MediaDescriptionCompat) {
            }
        }
    }

    public final void write() {
        this.MediaBrowserCompatSearchResultReceiver.add(AudioAttributesCompatParcelizer.PLAY_OPTION);
        this.MediaMetadataCompat.onCommand();
    }

    public void setMinFrame(int i) {
        this.MediaMetadataCompat.IconCompatParcelizer(i);
    }

    public void setMinProgress(float f) {
        this.MediaMetadataCompat.RemoteActionCompatParcelizer(f);
    }

    public void setMaxFrame(int i) {
        this.MediaMetadataCompat.RemoteActionCompatParcelizer(i);
    }

    public void setMaxProgress(float f) {
        this.MediaMetadataCompat.read(f);
    }

    public void setMinFrame(String str) {
        this.MediaMetadataCompat.RemoteActionCompatParcelizer(str);
    }

    public void setMaxFrame(String str) {
        this.MediaMetadataCompat.IconCompatParcelizer(str);
    }

    public void setMinAndMaxFrame(String str) {
        this.MediaMetadataCompat.read(str);
    }

    public void setMinAndMaxFrame(String str, String str2, boolean z) {
        this.MediaMetadataCompat.IconCompatParcelizer(str, str2, z);
    }

    public void setMinAndMaxFrame(int i, int i2) {
        this.MediaMetadataCompat.AudioAttributesCompatParcelizer(i, i2);
    }

    public void setMinAndMaxProgress(float f, float f2) {
        this.MediaMetadataCompat.write(f, f2);
    }

    public void setSpeed(float f) {
        this.MediaMetadataCompat.MediaBrowserCompatCustomActionResultReceiver(f);
    }

    public final void read(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.MediaMetadataCompat.AudioAttributesCompatParcelizer(animatorUpdateListener);
    }

    public final void IconCompatParcelizer(Animator.AnimatorListener animatorListener) {
        this.MediaMetadataCompat.write(animatorListener);
    }

    public void setRepeatMode(int i) {
        this.MediaBrowserCompatSearchResultReceiver.add(AudioAttributesCompatParcelizer.SET_REPEAT_MODE);
        this.MediaMetadataCompat.AudioAttributesImplBaseParcelizer(i);
    }

    public void setRepeatCount(int i) {
        this.MediaBrowserCompatSearchResultReceiver.add(AudioAttributesCompatParcelizer.SET_REPEAT_COUNT);
        this.MediaMetadataCompat.AudioAttributesImplApi26Parcelizer(i);
    }

    private boolean AudioAttributesImplApi26Parcelizer() {
        return this.MediaMetadataCompat.MediaDescriptionCompat();
    }

    public void setImageAssetsFolder(String str) {
        this.MediaMetadataCompat.AudioAttributesImplApi21Parcelizer(str);
    }

    public void setMaintainOriginalImageBounds(boolean z) {
        this.MediaMetadataCompat.MediaBrowserCompatCustomActionResultReceiver(z);
    }

    public void setImageAssetDelegate(ExoPlayerImplExternalSyntheticLambda12 exoPlayerImplExternalSyntheticLambda12) {
        this.MediaMetadataCompat.RemoteActionCompatParcelizer(exoPlayerImplExternalSyntheticLambda12);
    }

    public void setDefaultFontFileExtension(String str) {
        this.MediaMetadataCompat.MediaBrowserCompatItemReceiver(str);
    }

    public void setFontAssetDelegate(ExoPlayerImplExternalSyntheticLambda10 exoPlayerImplExternalSyntheticLambda10) {
        this.MediaMetadataCompat.read(exoPlayerImplExternalSyntheticLambda10);
    }

    public void setFontMap(Map<String, Typeface> map) {
        this.MediaMetadataCompat.RemoteActionCompatParcelizer(map);
    }

    public void setTextDelegate(onVideoCodecError onvideocodecerror) {
        this.MediaMetadataCompat.RemoteActionCompatParcelizer(onvideocodecerror);
    }

    private <T> void AudioAttributesCompatParcelizer(maybeTriggerPendingMessages maybetriggerpendingmessages, T t, setDrmInitData<T> setdrminitdata) {
        this.MediaMetadataCompat.IconCompatParcelizer(maybetriggerpendingmessages, t, setdrminitdata);
    }

    private void AudioAttributesImplApi21Parcelizer() {
        this.RemoteActionCompatParcelizer = false;
        this.MediaMetadataCompat.onCustomAction();
    }

    public void setFrame(int i) {
        this.MediaMetadataCompat.AudioAttributesCompatParcelizer(i);
    }

    public void setProgress(float f) {
        IconCompatParcelizer(f, true);
    }

    private void IconCompatParcelizer(float f, boolean z) {
        if (z) {
            this.MediaBrowserCompatSearchResultReceiver.add(AudioAttributesCompatParcelizer.SET_PROGRESS);
        }
        this.MediaMetadataCompat.AudioAttributesCompatParcelizer(f);
    }

    public void setPerformanceTrackingEnabled(boolean z) {
        this.MediaMetadataCompat.AudioAttributesImplApi21Parcelizer(z);
    }

    private void AudioAttributesCompatParcelizer() {
        this.MediaMetadataCompat.read();
    }

    public void setSafeMode(boolean z) {
        this.MediaMetadataCompat.AudioAttributesImplBaseParcelizer(z);
    }

    public void setRenderMode(onStreamTypeChanged onstreamtypechanged) {
        this.MediaMetadataCompat.read(onstreamtypechanged);
    }

    public void setAsyncUpdates(ExoPlayerImplExternalSyntheticLambda14 exoPlayerImplExternalSyntheticLambda14) {
        this.MediaMetadataCompat.AudioAttributesCompatParcelizer(exoPlayerImplExternalSyntheticLambda14);
    }

    public void setApplyingOpacityToLayersEnabled(boolean z) {
        this.MediaMetadataCompat.read(z);
    }

    public void setApplyingShadowToLayersEnabled(boolean z) {
        this.MediaMetadataCompat.write(z);
    }

    public void setClipTextToBoundingBox(boolean z) {
        this.MediaMetadataCompat.IconCompatParcelizer(z);
    }

    private void read() {
        boolean zAudioAttributesImplApi26Parcelizer = AudioAttributesImplApi26Parcelizer();
        setImageDrawable(null);
        setImageDrawable(this.MediaMetadataCompat);
        if (zAudioAttributesImplApi26Parcelizer) {
            this.MediaMetadataCompat.onAddQueueItem();
        }
    }

    static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: com.airbnb.lottie.LottieAnimationView.SavedState.5
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ SavedState createFromParcel(Parcel parcel) {
                return write(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ SavedState[] newArray(int i) {
                return read(i);
            }

            private static SavedState write(Parcel parcel) {
                return new SavedState(parcel, (byte) 0);
            }

            private static SavedState[] read(int i) {
                return new SavedState[i];
            }
        };
        String AudioAttributesCompatParcelizer;
        int AudioAttributesImplApi21Parcelizer;
        boolean IconCompatParcelizer;
        int MediaBrowserCompatCustomActionResultReceiver;
        int RemoteActionCompatParcelizer;
        String read;
        float write;

        /* synthetic */ SavedState(Parcel parcel, byte b) {
            this(parcel);
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            this.read = parcel.readString();
            this.write = parcel.readFloat();
            this.IconCompatParcelizer = parcel.readInt() == 1;
            this.AudioAttributesCompatParcelizer = parcel.readString();
            this.AudioAttributesImplApi21Parcelizer = parcel.readInt();
            this.MediaBrowserCompatCustomActionResultReceiver = parcel.readInt();
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.read);
            parcel.writeFloat(this.write);
            parcel.writeInt(this.IconCompatParcelizer ? 1 : 0);
            parcel.writeString(this.AudioAttributesCompatParcelizer);
            parcel.writeInt(this.AudioAttributesImplApi21Parcelizer);
            parcel.writeInt(this.MediaBrowserCompatCustomActionResultReceiver);
        }
    }
}
