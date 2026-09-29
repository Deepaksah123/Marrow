package kotlin;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.FlacFrameReaderSampleNumberHolder;
import kotlin.SeekMapUnseekable;

/* JADX INFO: loaded from: classes3.dex */
public final class ExtractorUtil {
    private SeekMapUnseekable AudioAttributesCompatParcelizer;
    private float AudioAttributesImplApi21Parcelizer;
    private float AudioAttributesImplApi26Parcelizer;
    private float AudioAttributesImplBaseParcelizer;
    private float IconCompatParcelizer;
    private ColorStateList MediaBrowserCompatCustomActionResultReceiver;
    private float MediaBrowserCompatItemReceiver;
    private float MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    private float MediaDescriptionCompat;
    private ColorStateList MediaMetadataCompat;
    private float MediaSessionCompatQueueItem;
    private Typeface MediaSessionCompatResultReceiverWrapper;
    private Typeface MediaSessionCompatToken;
    private Typeface ParcelableVolumeInfo;
    private boolean PlaybackStateCompat;
    private float RatingCompat;
    private final Rect RemoteActionCompatParcelizer;
    private float _init_lambda2;
    private int[] _init_lambda3;
    private readFrameBlockSizeSamplesFromKey _init_lambda4;
    private final TextPaint _init_lambda5;
    private StaticLayout accessaddObserverForBackInvoker;
    private CharSequence accessensureViewModelStore;
    private TimeInterpolator accessgetReportFullyDrawnExecutorp;
    private CharSequence accessonBackPresseds1027565324;
    private final View addContentView;
    private final TextPaint addObserverForBackInvoker;
    private boolean addObserverForBackInvokerlambda7;
    private CharSequence createFullyDrawnExecutor;
    private Typeface handleMediaPlayPauseIfPendingOnHandler;
    private Typeface onAddQueueItem;
    private Typeface onCommand;
    private final RectF onCustomAction;
    private int onFastForward;
    private float onMediaButtonEvent;
    private float onPause;
    private int onPlay;
    private float onPlayFromMediaId;
    private float onPlayFromSearch;
    private Typeface onPlayFromUri;
    private final Rect onPrepare;
    private float onPrepareFromMediaId;
    private float onPrepareFromSearch;
    private float onPrepareFromUri;
    private float onRemoveQueueItem;
    private float onRemoveQueueItemAt;
    private float onRewind;
    private SeekMapUnseekable onSeekTo;
    private float onSetCaptioningEnabled;
    private int onSetPlaybackSpeed;
    private ColorStateList onSetRating;
    private float onSetRepeatMode;
    private float onSetShuffleMode;
    private Bitmap onSkipToPrevious;
    private ColorStateList onSkipToQueueItem;
    private float onStop;
    private float r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw;
    private boolean r8lambdaKUbBm7ckfqTc9QCgukC86fguu4;
    private TimeInterpolator r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0;
    private boolean read;
    private float write;
    private int setSessionImpl = 16;
    private int MediaBrowserCompatSearchResultReceiver = 16;
    private float onSkipToNext = 15.0f;
    private float MediaBrowserCompatMediaItem = 15.0f;
    private TextUtils.TruncateAt ensureViewModelStore = TextUtils.TruncateAt.END;
    private boolean ResultReceiver = true;
    private int r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8 = 1;
    private float PlaybackStateCompatCustomAction = BitmapDescriptorFactory.HUE_RED;
    private float r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = 1.0f;
    private int r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = FlacFrameReaderSampleNumberHolder.AudioAttributesCompatParcelizer;

    private void MediaBrowserCompatMediaItem() {
    }

    public ExtractorUtil(View view) {
        this.addContentView = view;
        TextPaint textPaint = new TextPaint(TsExtractor.TS_STREAM_TYPE_AC3);
        this._init_lambda5 = textPaint;
        this.addObserverForBackInvoker = new TextPaint(textPaint);
        this.RemoteActionCompatParcelizer = new Rect();
        this.onPrepare = new Rect();
        this.onCustomAction = new RectF();
        this.r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw = MediaMetadataCompat();
        IconCompatParcelizer(view.getContext().getResources().getConfiguration());
    }

    public final void AudioAttributesCompatParcelizer(TimeInterpolator timeInterpolator) {
        this.accessgetReportFullyDrawnExecutorp = timeInterpolator;
        AudioAttributesImplApi21Parcelizer();
    }

    public final void RemoteActionCompatParcelizer(TimeInterpolator timeInterpolator) {
        this.r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0 = timeInterpolator;
        AudioAttributesImplApi21Parcelizer();
    }

    public final void IconCompatParcelizer(float f) {
        if (this.onSkipToNext != f) {
            this.onSkipToNext = f;
            AudioAttributesImplApi21Parcelizer();
        }
    }

    public final void write(float f) {
        if (this.MediaBrowserCompatMediaItem != f) {
            this.MediaBrowserCompatMediaItem = f;
            AudioAttributesImplApi21Parcelizer();
        }
    }

    public final void AudioAttributesCompatParcelizer(ColorStateList colorStateList) {
        if (this.MediaMetadataCompat != colorStateList) {
            this.MediaMetadataCompat = colorStateList;
            AudioAttributesImplApi21Parcelizer();
        }
    }

    public final void RemoteActionCompatParcelizer(ColorStateList colorStateList) {
        if (this.onSkipToQueueItem != colorStateList) {
            this.onSkipToQueueItem = colorStateList;
            AudioAttributesImplApi21Parcelizer();
        }
    }

    public final void IconCompatParcelizer(ColorStateList colorStateList) {
        if (this.MediaMetadataCompat == colorStateList && this.onSkipToQueueItem == colorStateList) {
            return;
        }
        this.MediaMetadataCompat = colorStateList;
        this.onSkipToQueueItem = colorStateList;
        AudioAttributesImplApi21Parcelizer();
    }

    public final void RemoteActionCompatParcelizer(float f) {
        if (this.onPrepareFromUri != f) {
            this.onPrepareFromUri = f;
            AudioAttributesImplApi21Parcelizer();
        }
    }

    public final void RemoteActionCompatParcelizer(int i, int i2, int i3, int i4) {
        if (read(this.onPrepare, i, i2, i3, i4)) {
            return;
        }
        this.onPrepare.set(i, i2, i3, i4);
        this.read = true;
    }

    public final void AudioAttributesCompatParcelizer(Rect rect) {
        RemoteActionCompatParcelizer(rect.left, rect.top, rect.right, rect.bottom);
    }

    public final void IconCompatParcelizer(int i, int i2, int i3, int i4) {
        if (read(this.RemoteActionCompatParcelizer, i, i2, i3, i4)) {
            return;
        }
        this.RemoteActionCompatParcelizer.set(i, i2, i3, i4);
        this.read = true;
    }

    public final void read(Rect rect) {
        IconCompatParcelizer(rect.left, rect.top, rect.right, rect.bottom);
    }

    public final void write(RectF rectF, int i, int i2) {
        this.r8lambdaKUbBm7ckfqTc9QCgukC86fguu4 = write(this.accessensureViewModelStore);
        rectF.left = Math.max(read(i, i2), this.RemoteActionCompatParcelizer.left);
        rectF.top = this.RemoteActionCompatParcelizer.top;
        rectF.right = Math.min(RemoteActionCompatParcelizer(rectF, i, i2), this.RemoteActionCompatParcelizer.right);
        rectF.bottom = this.RemoteActionCompatParcelizer.top + read();
    }

    private float read(int i, int i2) {
        float f;
        float f2;
        if (i2 != 17 && (i2 & 7) != 1) {
            if ((i2 & 8388613) == 8388613 || (i2 & 5) == 5) {
                if (!this.r8lambdaKUbBm7ckfqTc9QCgukC86fguu4) {
                    f = this.RemoteActionCompatParcelizer.right;
                    f2 = this.RatingCompat;
                }
                return this.RemoteActionCompatParcelizer.left;
            }
            if (this.r8lambdaKUbBm7ckfqTc9QCgukC86fguu4) {
                f = this.RemoteActionCompatParcelizer.right;
                f2 = this.RatingCompat;
            }
            return this.RemoteActionCompatParcelizer.left;
        }
        f = i / 2.0f;
        f2 = this.RatingCompat / 2.0f;
        return f - f2;
    }

    private float RemoteActionCompatParcelizer(RectF rectF, int i, int i2) {
        float f;
        float f2;
        int i3;
        if (i2 == 17 || (i2 & 7) == 1) {
            f = i / 2.0f;
            f2 = this.RatingCompat / 2.0f;
        } else if ((i2 & 8388613) == 8388613 || (i2 & 5) == 5) {
            if (!this.r8lambdaKUbBm7ckfqTc9QCgukC86fguu4) {
                i3 = this.RemoteActionCompatParcelizer.right;
                return i3;
            }
            f = rectF.left;
            f2 = this.RatingCompat;
        } else {
            if (this.r8lambdaKUbBm7ckfqTc9QCgukC86fguu4) {
                i3 = this.RemoteActionCompatParcelizer.right;
                return i3;
            }
            f = rectF.left;
            f2 = this.RatingCompat;
        }
        return f + f2;
    }

    public final float write() {
        read(this.addObserverForBackInvoker);
        return -this.addObserverForBackInvoker.ascent();
    }

    public final float IconCompatParcelizer() {
        read(this.addObserverForBackInvoker);
        return (-this.addObserverForBackInvoker.ascent()) + this.addObserverForBackInvoker.descent();
    }

    public final float read() {
        RemoteActionCompatParcelizer(this.addObserverForBackInvoker);
        return -this.addObserverForBackInvoker.ascent();
    }

    public final void AudioAttributesCompatParcelizer(int i) {
        this.onPlay = i;
    }

    public final void AudioAttributesCompatParcelizer(float f) {
        this.MediaSessionCompatQueueItem = f;
        this.r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw = MediaMetadataCompat();
    }

    private float MediaMetadataCompat() {
        float f = this.MediaSessionCompatQueueItem;
        return f + ((1.0f - f) * 0.5f);
    }

    public final void RemoteActionCompatParcelizer(boolean z) {
        this.PlaybackStateCompat = z;
    }

    private void read(TextPaint textPaint) {
        textPaint.setTextSize(this.onSkipToNext);
        textPaint.setTypeface(this.MediaSessionCompatToken);
        textPaint.setLetterSpacing(this.onPrepareFromUri);
    }

    private void RemoteActionCompatParcelizer(TextPaint textPaint) {
        textPaint.setTextSize(this.MediaBrowserCompatMediaItem);
        textPaint.setTypeface(this.handleMediaPlayPauseIfPendingOnHandler);
        textPaint.setLetterSpacing(this.AudioAttributesImplBaseParcelizer);
    }

    public final void IconCompatParcelizer(int i) {
        if (this.setSessionImpl != i) {
            this.setSessionImpl = i;
            AudioAttributesImplApi21Parcelizer();
        }
    }

    public final void read(int i) {
        if (this.MediaBrowserCompatSearchResultReceiver != i) {
            this.MediaBrowserCompatSearchResultReceiver = i;
            AudioAttributesImplApi21Parcelizer();
        }
    }

    public final void write(int i) {
        TrackOutput trackOutput = new TrackOutput(this.addContentView.getContext(), i);
        if (trackOutput.RemoteActionCompatParcelizer() != null) {
            this.MediaMetadataCompat = trackOutput.RemoteActionCompatParcelizer();
        }
        if (trackOutput.IconCompatParcelizer() != BitmapDescriptorFactory.HUE_RED) {
            this.MediaBrowserCompatMediaItem = trackOutput.IconCompatParcelizer();
        }
        if (trackOutput.write != null) {
            this.MediaBrowserCompatCustomActionResultReceiver = trackOutput.write;
        }
        this.MediaBrowserCompatItemReceiver = trackOutput.AudioAttributesCompatParcelizer;
        this.AudioAttributesImplApi26Parcelizer = trackOutput.IconCompatParcelizer;
        this.AudioAttributesImplApi21Parcelizer = trackOutput.read;
        this.AudioAttributesImplBaseParcelizer = trackOutput.RemoteActionCompatParcelizer;
        SeekMapUnseekable seekMapUnseekable = this.AudioAttributesCompatParcelizer;
        if (seekMapUnseekable != null) {
            seekMapUnseekable.read();
        }
        this.AudioAttributesCompatParcelizer = new SeekMapUnseekable(new SeekMapUnseekable.AudioAttributesCompatParcelizer() { // from class: o.ExtractorUtil.3
            @Override // o.SeekMapUnseekable.AudioAttributesCompatParcelizer
            public final void RemoteActionCompatParcelizer(Typeface typeface) {
                ExtractorUtil.this.RemoteActionCompatParcelizer(typeface);
            }
        }, trackOutput.write());
        trackOutput.IconCompatParcelizer(this.addContentView.getContext(), this.AudioAttributesCompatParcelizer);
        AudioAttributesImplApi21Parcelizer();
    }

    public final void RemoteActionCompatParcelizer(int i) {
        TrackOutput trackOutput = new TrackOutput(this.addContentView.getContext(), i);
        if (trackOutput.RemoteActionCompatParcelizer() != null) {
            this.onSkipToQueueItem = trackOutput.RemoteActionCompatParcelizer();
        }
        if (trackOutput.IconCompatParcelizer() != BitmapDescriptorFactory.HUE_RED) {
            this.onSkipToNext = trackOutput.IconCompatParcelizer();
        }
        if (trackOutput.write != null) {
            this.onSetRating = trackOutput.write;
        }
        this.onSetShuffleMode = trackOutput.AudioAttributesCompatParcelizer;
        this.onSetRepeatMode = trackOutput.IconCompatParcelizer;
        this.onSetCaptioningEnabled = trackOutput.read;
        this.onPrepareFromUri = trackOutput.RemoteActionCompatParcelizer;
        SeekMapUnseekable seekMapUnseekable = this.onSeekTo;
        if (seekMapUnseekable != null) {
            seekMapUnseekable.read();
        }
        this.onSeekTo = new SeekMapUnseekable(new SeekMapUnseekable.AudioAttributesCompatParcelizer() { // from class: o.ExtractorUtil.1
            @Override // o.SeekMapUnseekable.AudioAttributesCompatParcelizer
            public final void RemoteActionCompatParcelizer(Typeface typeface) {
                ExtractorUtil.this.IconCompatParcelizer(typeface);
            }
        }, trackOutput.write());
        trackOutput.IconCompatParcelizer(this.addContentView.getContext(), this.onSeekTo);
        AudioAttributesImplApi21Parcelizer();
    }

    public final void RemoteActionCompatParcelizer(TextUtils.TruncateAt truncateAt) {
        this.ensureViewModelStore = truncateAt;
        AudioAttributesImplApi21Parcelizer();
    }

    public final void RemoteActionCompatParcelizer(Typeface typeface) {
        if (AudioAttributesCompatParcelizer(typeface)) {
            AudioAttributesImplApi21Parcelizer();
        }
    }

    public final void IconCompatParcelizer(Typeface typeface) {
        if (write(typeface)) {
            AudioAttributesImplApi21Parcelizer();
        }
    }

    public final void read(Typeface typeface) {
        boolean zAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(typeface);
        boolean zWrite = write(typeface);
        if (zAudioAttributesCompatParcelizer || zWrite) {
            AudioAttributesImplApi21Parcelizer();
        }
    }

    private boolean AudioAttributesCompatParcelizer(Typeface typeface) {
        SeekMapUnseekable seekMapUnseekable = this.AudioAttributesCompatParcelizer;
        if (seekMapUnseekable != null) {
            seekMapUnseekable.read();
        }
        if (this.onAddQueueItem == typeface) {
            return false;
        }
        this.onAddQueueItem = typeface;
        Typeface typefaceRemoteActionCompatParcelizer = TrackOutputSampleDataPart.RemoteActionCompatParcelizer(this.addContentView.getContext().getResources().getConfiguration(), typeface);
        this.onCommand = typefaceRemoteActionCompatParcelizer;
        if (typefaceRemoteActionCompatParcelizer == null) {
            typefaceRemoteActionCompatParcelizer = this.onAddQueueItem;
        }
        this.handleMediaPlayPauseIfPendingOnHandler = typefaceRemoteActionCompatParcelizer;
        return true;
    }

    private boolean write(Typeface typeface) {
        SeekMapUnseekable seekMapUnseekable = this.onSeekTo;
        if (seekMapUnseekable != null) {
            seekMapUnseekable.read();
        }
        if (this.MediaSessionCompatResultReceiverWrapper == typeface) {
            return false;
        }
        this.MediaSessionCompatResultReceiverWrapper = typeface;
        Typeface typefaceRemoteActionCompatParcelizer = TrackOutputSampleDataPart.RemoteActionCompatParcelizer(this.addContentView.getContext().getResources().getConfiguration(), typeface);
        this.ParcelableVolumeInfo = typefaceRemoteActionCompatParcelizer;
        if (typefaceRemoteActionCompatParcelizer == null) {
            typefaceRemoteActionCompatParcelizer = this.MediaSessionCompatResultReceiverWrapper;
        }
        this.MediaSessionCompatToken = typefaceRemoteActionCompatParcelizer;
        return true;
    }

    public final void IconCompatParcelizer(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.onAddQueueItem;
            if (typeface != null) {
                this.onCommand = TrackOutputSampleDataPart.RemoteActionCompatParcelizer(configuration, typeface);
            }
            Typeface typeface2 = this.MediaSessionCompatResultReceiverWrapper;
            if (typeface2 != null) {
                this.ParcelableVolumeInfo = TrackOutputSampleDataPart.RemoteActionCompatParcelizer(configuration, typeface2);
            }
            Typeface typeface3 = this.onCommand;
            if (typeface3 == null) {
                typeface3 = this.onAddQueueItem;
            }
            this.handleMediaPlayPauseIfPendingOnHandler = typeface3;
            Typeface typeface4 = this.ParcelableVolumeInfo;
            if (typeface4 == null) {
                typeface4 = this.MediaSessionCompatResultReceiverWrapper;
            }
            this.MediaSessionCompatToken = typeface4;
            AudioAttributesCompatParcelizer(true);
        }
    }

    public final void read(float f) {
        float fWrite = StdKeyDeserializer.write(f, BitmapDescriptorFactory.HUE_RED, 1.0f);
        if (fWrite != this.onRemoveQueueItemAt) {
            this.onRemoveQueueItemAt = fWrite;
            MediaBrowserCompatSearchResultReceiver();
        }
    }

    public final boolean RemoteActionCompatParcelizer(int[] iArr) {
        this._init_lambda3 = iArr;
        if (!onCommand()) {
            return false;
        }
        AudioAttributesImplApi21Parcelizer();
        return true;
    }

    private boolean onCommand() {
        ColorStateList colorStateList = this.MediaMetadataCompat;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        ColorStateList colorStateList2 = this.onSkipToQueueItem;
        return colorStateList2 != null && colorStateList2.isStateful();
    }

    public final float AudioAttributesImplBaseParcelizer() {
        return this.r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw;
    }

    public final float MediaBrowserCompatCustomActionResultReceiver() {
        return this.onRemoveQueueItemAt;
    }

    public final void read(boolean z) {
        this.ResultReceiver = z;
    }

    private void MediaBrowserCompatSearchResultReceiver() {
        MediaBrowserCompatCustomActionResultReceiver(this.onRemoveQueueItemAt);
    }

    private void MediaBrowserCompatCustomActionResultReceiver(float f) {
        float f2;
        RatingCompat(f);
        if (!this.PlaybackStateCompat) {
            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = read(this.onRemoveQueueItem, this.write, f, this.r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0);
            this.onPlayFromMediaId = read(this.onRewind, this.IconCompatParcelizer, f, this.r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0);
            MediaBrowserCompatMediaItem(f);
            f2 = f;
        } else if (f < this.r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw) {
            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = this.onRemoveQueueItem;
            this.onPlayFromMediaId = this.onRewind;
            MediaBrowserCompatMediaItem(BitmapDescriptorFactory.HUE_RED);
            f2 = 0.0f;
        } else {
            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = this.write;
            this.onPlayFromMediaId = this.IconCompatParcelizer - Math.max(0, this.onPlay);
            MediaBrowserCompatMediaItem(1.0f);
            f2 = 1.0f;
        }
        MediaMetadataCompat(1.0f - read(BitmapDescriptorFactory.HUE_RED, 1.0f, 1.0f - f, BinarySearchSeekerSeekOperationParams.AudioAttributesCompatParcelizer));
        MediaBrowserCompatSearchResultReceiver(read(1.0f, BitmapDescriptorFactory.HUE_RED, f, BinarySearchSeekerSeekOperationParams.AudioAttributesCompatParcelizer));
        if (this.MediaMetadataCompat != this.onSkipToQueueItem) {
            this._init_lambda5.setColor(read(MediaDescriptionCompat(), handleMediaPlayPauseIfPendingOnHandler(), f2));
        } else {
            this._init_lambda5.setColor(handleMediaPlayPauseIfPendingOnHandler());
        }
        float f3 = this.AudioAttributesImplBaseParcelizer;
        float f4 = this.onPrepareFromUri;
        if (f3 != f4) {
            this._init_lambda5.setLetterSpacing(read(f4, f3, f, BinarySearchSeekerSeekOperationParams.AudioAttributesCompatParcelizer));
        } else {
            this._init_lambda5.setLetterSpacing(f3);
        }
        this.onPrepareFromSearch = read(this.onSetCaptioningEnabled, this.AudioAttributesImplApi21Parcelizer, f, null);
        this.onPause = read(this.onSetShuffleMode, this.MediaBrowserCompatItemReceiver, f, null);
        this.onPlayFromSearch = read(this.onSetRepeatMode, this.AudioAttributesImplApi26Parcelizer, f, null);
        int i = read(read(this.onSetRating), read(this.MediaBrowserCompatCustomActionResultReceiver), f);
        this.onFastForward = i;
        this._init_lambda5.setShadowLayer(this.onPrepareFromSearch, this.onPause, this.onPlayFromSearch, i);
        if (this.PlaybackStateCompat) {
            this._init_lambda5.setAlpha((int) (AudioAttributesImplApi26Parcelizer(f) * this._init_lambda5.getAlpha()));
        }
        InvalidTypeIdException.onRemoveQueueItem(this.addContentView);
    }

    private float AudioAttributesImplApi26Parcelizer(float f) {
        float f2 = this.r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw;
        if (f <= f2) {
            return BinarySearchSeekerSeekOperationParams.RemoteActionCompatParcelizer(1.0f, BitmapDescriptorFactory.HUE_RED, this.MediaSessionCompatQueueItem, f2, f);
        }
        return BinarySearchSeekerSeekOperationParams.RemoteActionCompatParcelizer(BitmapDescriptorFactory.HUE_RED, 1.0f, f2, 1.0f, f);
    }

    private int MediaDescriptionCompat() {
        return read(this.onSkipToQueueItem);
    }

    private int handleMediaPlayPauseIfPendingOnHandler() {
        return read(this.MediaMetadataCompat);
    }

    private int read(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this._init_lambda3;
        if (iArr != null) {
            return colorStateList.getColorForState(iArr, 0);
        }
        return colorStateList.getDefaultColor();
    }

    private void write(boolean z) {
        StaticLayout staticLayout;
        AudioAttributesCompatParcelizer(1.0f, z);
        CharSequence charSequence = this.accessonBackPresseds1027565324;
        if (charSequence != null && (staticLayout = this.accessaddObserverForBackInvoker) != null) {
            this.createFullyDrawnExecutor = TextUtils.ellipsize(charSequence, this._init_lambda5, staticLayout.getWidth(), this.ensureViewModelStore);
        }
        CharSequence charSequence2 = this.createFullyDrawnExecutor;
        float fWrite = BitmapDescriptorFactory.HUE_RED;
        if (charSequence2 != null) {
            this.RatingCompat = write(this._init_lambda5, charSequence2);
        } else {
            this.RatingCompat = BitmapDescriptorFactory.HUE_RED;
        }
        int iWrite = _clearIfStdImpl.write(this.MediaBrowserCompatSearchResultReceiver, this.r8lambdaKUbBm7ckfqTc9QCgukC86fguu4 ? 1 : 0);
        int i = iWrite & 112;
        if (i == 48) {
            this.IconCompatParcelizer = this.RemoteActionCompatParcelizer.top;
        } else if (i == 80) {
            this.IconCompatParcelizer = this.RemoteActionCompatParcelizer.bottom + this._init_lambda5.ascent();
        } else {
            this.IconCompatParcelizer = this.RemoteActionCompatParcelizer.centerY() - ((this._init_lambda5.descent() - this._init_lambda5.ascent()) / 2.0f);
        }
        int i2 = iWrite & 8388615;
        if (i2 == 1) {
            this.write = this.RemoteActionCompatParcelizer.centerX() - (this.RatingCompat / 2.0f);
        } else if (i2 == 5) {
            this.write = this.RemoteActionCompatParcelizer.right - this.RatingCompat;
        } else {
            this.write = this.RemoteActionCompatParcelizer.left;
        }
        AudioAttributesCompatParcelizer(BitmapDescriptorFactory.HUE_RED, z);
        float height = this.accessaddObserverForBackInvoker != null ? r10.getHeight() : 0.0f;
        StaticLayout staticLayout2 = this.accessaddObserverForBackInvoker;
        if (staticLayout2 != null && this.r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8 > 1) {
            fWrite = staticLayout2.getWidth();
        } else {
            CharSequence charSequence3 = this.accessonBackPresseds1027565324;
            if (charSequence3 != null) {
                fWrite = write(this._init_lambda5, charSequence3);
            }
        }
        StaticLayout staticLayout3 = this.accessaddObserverForBackInvoker;
        this.onSetPlaybackSpeed = staticLayout3 != null ? staticLayout3.getLineCount() : 0;
        int iWrite2 = _clearIfStdImpl.write(this.setSessionImpl, this.r8lambdaKUbBm7ckfqTc9QCgukC86fguu4 ? 1 : 0);
        int i3 = iWrite2 & 112;
        if (i3 == 48) {
            this.onRewind = this.onPrepare.top;
        } else if (i3 != 80) {
            this.onRewind = this.onPrepare.centerY() - (height / 2.0f);
        } else {
            this.onRewind = (this.onPrepare.bottom - height) + this._init_lambda5.descent();
        }
        int i4 = iWrite2 & 8388615;
        if (i4 == 1) {
            this.onRemoveQueueItem = this.onPrepare.centerX() - (fWrite / 2.0f);
        } else if (i4 == 5) {
            this.onRemoveQueueItem = this.onPrepare.right - fWrite;
        } else {
            this.onRemoveQueueItem = this.onPrepare.left;
        }
        MediaBrowserCompatMediaItem();
        MediaBrowserCompatMediaItem(this.onRemoveQueueItemAt);
    }

    private static float write(TextPaint textPaint, CharSequence charSequence) {
        return textPaint.measureText(charSequence, 0, charSequence.length());
    }

    private void RatingCompat(float f) {
        if (this.PlaybackStateCompat) {
            this.onCustomAction.set(f < this.r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw ? this.onPrepare : this.RemoteActionCompatParcelizer);
            return;
        }
        this.onCustomAction.left = read(this.onPrepare.left, this.RemoteActionCompatParcelizer.left, f, this.r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0);
        this.onCustomAction.top = read(this.onRewind, this.IconCompatParcelizer, f, this.r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0);
        this.onCustomAction.right = read(this.onPrepare.right, this.RemoteActionCompatParcelizer.right, f, this.r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0);
        this.onCustomAction.bottom = read(this.onPrepare.bottom, this.RemoteActionCompatParcelizer.bottom, f, this.r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0);
    }

    private void MediaMetadataCompat(float f) {
        this.MediaDescriptionCompat = f;
        InvalidTypeIdException.onRemoveQueueItem(this.addContentView);
    }

    private void MediaBrowserCompatSearchResultReceiver(float f) {
        this.onStop = f;
        InvalidTypeIdException.onRemoveQueueItem(this.addContentView);
    }

    public final void RemoteActionCompatParcelizer(Canvas canvas) {
        int iSave = canvas.save();
        if (this.accessonBackPresseds1027565324 == null || this.onCustomAction.width() <= BitmapDescriptorFactory.HUE_RED || this.onCustomAction.height() <= BitmapDescriptorFactory.HUE_RED) {
            return;
        }
        this._init_lambda5.setTextSize(this.onPrepareFromMediaId);
        float f = this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        float f2 = this.onPlayFromMediaId;
        float f3 = this._init_lambda2;
        if (f3 != 1.0f && !this.PlaybackStateCompat) {
            canvas.scale(f3, f3, f, f2);
        }
        if (onCustomAction() && (!this.PlaybackStateCompat || this.onRemoveQueueItemAt > this.r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw)) {
            AudioAttributesCompatParcelizer(canvas, this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver - this.accessaddObserverForBackInvoker.getLineStart(0), f2);
        } else {
            canvas.translate(f, f2);
            this.accessaddObserverForBackInvoker.draw(canvas);
        }
        canvas.restoreToCount(iSave);
    }

    private boolean onCustomAction() {
        if (this.r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8 > 1) {
            return !this.r8lambdaKUbBm7ckfqTc9QCgukC86fguu4 || this.PlaybackStateCompat;
        }
        return false;
    }

    private void AudioAttributesCompatParcelizer(Canvas canvas, float f, float f2) {
        int alpha = this._init_lambda5.getAlpha();
        canvas.translate(f, f2);
        if (!this.PlaybackStateCompat) {
            this._init_lambda5.setAlpha((int) (this.onStop * alpha));
            if (Build.VERSION.SDK_INT >= 31) {
                TextPaint textPaint = this._init_lambda5;
                textPaint.setShadowLayer(this.onPrepareFromSearch, this.onPause, this.onPlayFromSearch, createExtractors.IconCompatParcelizer(this.onFastForward, textPaint.getAlpha()));
            }
            this.accessaddObserverForBackInvoker.draw(canvas);
        }
        if (!this.PlaybackStateCompat) {
            this._init_lambda5.setAlpha((int) (this.MediaDescriptionCompat * alpha));
        }
        if (Build.VERSION.SDK_INT >= 31) {
            TextPaint textPaint2 = this._init_lambda5;
            textPaint2.setShadowLayer(this.onPrepareFromSearch, this.onPause, this.onPlayFromSearch, createExtractors.IconCompatParcelizer(this.onFastForward, textPaint2.getAlpha()));
        }
        int lineBaseline = this.accessaddObserverForBackInvoker.getLineBaseline(0);
        CharSequence charSequence = this.createFullyDrawnExecutor;
        float f3 = lineBaseline;
        canvas.drawText(charSequence, 0, charSequence.length(), BitmapDescriptorFactory.HUE_RED, f3, this._init_lambda5);
        if (Build.VERSION.SDK_INT >= 31) {
            this._init_lambda5.setShadowLayer(this.onPrepareFromSearch, this.onPause, this.onPlayFromSearch, this.onFastForward);
        }
        if (this.PlaybackStateCompat) {
            return;
        }
        String strTrim = this.createFullyDrawnExecutor.toString().trim();
        if (strTrim.endsWith("…")) {
            strTrim = strTrim.substring(0, strTrim.length() - 1);
        }
        String str = strTrim;
        this._init_lambda5.setAlpha(alpha);
        canvas.drawText(str, 0, Math.min(this.accessaddObserverForBackInvoker.getLineEnd(0), str.length()), BitmapDescriptorFactory.HUE_RED, f3, (Paint) this._init_lambda5);
    }

    private boolean write(CharSequence charSequence) {
        boolean zOnAddQueueItem = onAddQueueItem();
        return this.ResultReceiver ? AudioAttributesCompatParcelizer(charSequence, zOnAddQueueItem) : zOnAddQueueItem;
    }

    private boolean onAddQueueItem() {
        return InvalidTypeIdException.MediaBrowserCompatMediaItem(this.addContentView) == 1;
    }

    private static boolean AudioAttributesCompatParcelizer(CharSequence charSequence, boolean z) {
        configureFromIntCreator configurefromintcreator;
        if (z) {
            configurefromintcreator = configureFromDoubleCreator.read;
        } else {
            configurefromintcreator = configureFromDoubleCreator.RemoteActionCompatParcelizer;
        }
        return configurefromintcreator.read(charSequence, 0, charSequence.length());
    }

    private void MediaBrowserCompatMediaItem(float f) {
        AudioAttributesImplApi21Parcelizer(f);
        this.addObserverForBackInvokerlambda7 = false;
        InvalidTypeIdException.onRemoveQueueItem(this.addContentView);
    }

    private void AudioAttributesImplApi21Parcelizer(float f) {
        AudioAttributesCompatParcelizer(f, false);
    }

    private void AudioAttributesCompatParcelizer(float f, boolean z) {
        float f2;
        float f3;
        Typeface typeface;
        if (this.accessensureViewModelStore != null) {
            float fWidth = this.RemoteActionCompatParcelizer.width();
            float fWidth2 = this.onPrepare.width();
            if (read(f, 1.0f)) {
                f2 = this.MediaBrowserCompatMediaItem;
                f3 = this.AudioAttributesImplBaseParcelizer;
                this._init_lambda2 = 1.0f;
                typeface = this.handleMediaPlayPauseIfPendingOnHandler;
            } else {
                float f4 = this.onSkipToNext;
                float f5 = this.onPrepareFromUri;
                Typeface typeface2 = this.MediaSessionCompatToken;
                if (read(f, BitmapDescriptorFactory.HUE_RED)) {
                    this._init_lambda2 = 1.0f;
                } else {
                    this._init_lambda2 = read(this.onSkipToNext, this.MediaBrowserCompatMediaItem, f, this.accessgetReportFullyDrawnExecutorp) / this.onSkipToNext;
                }
                float f6 = this.MediaBrowserCompatMediaItem / this.onSkipToNext;
                fWidth = (z || this.PlaybackStateCompat || fWidth2 * f6 <= fWidth) ? fWidth2 : Math.min(fWidth / f6, fWidth2);
                f2 = f4;
                f3 = f5;
                typeface = typeface2;
            }
            if (fWidth > BitmapDescriptorFactory.HUE_RED) {
                boolean z2 = this.onPrepareFromMediaId != f2;
                boolean z3 = this.onMediaButtonEvent != f3;
                boolean z4 = this.onPlayFromUri != typeface;
                StaticLayout staticLayout = this.accessaddObserverForBackInvoker;
                boolean z5 = z2 || z3 || (staticLayout != null && (fWidth > ((float) staticLayout.getWidth()) ? 1 : (fWidth == ((float) staticLayout.getWidth()) ? 0 : -1)) != 0) || z4 || this.read;
                this.onPrepareFromMediaId = f2;
                this.onMediaButtonEvent = f3;
                this.onPlayFromUri = typeface;
                this.read = false;
                this._init_lambda5.setLinearText(this._init_lambda2 != 1.0f);
                z = z5;
            }
            if (this.accessonBackPresseds1027565324 == null || z) {
                this._init_lambda5.setTextSize(this.onPrepareFromMediaId);
                this._init_lambda5.setTypeface(this.onPlayFromUri);
                this._init_lambda5.setLetterSpacing(this.onMediaButtonEvent);
                this.r8lambdaKUbBm7ckfqTc9QCgukC86fguu4 = write(this.accessensureViewModelStore);
                StaticLayout staticLayout2 = read(onCustomAction() ? this.r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8 : 1, fWidth, this.r8lambdaKUbBm7ckfqTc9QCgukC86fguu4);
                this.accessaddObserverForBackInvoker = staticLayout2;
                this.accessonBackPresseds1027565324 = staticLayout2.getText();
            }
        }
    }

    private StaticLayout read(int i, float f, boolean z) {
        StaticLayout staticLayoutRemoteActionCompatParcelizer;
        try {
            staticLayoutRemoteActionCompatParcelizer = FlacFrameReaderSampleNumberHolder.AudioAttributesCompatParcelizer(this.accessensureViewModelStore, this._init_lambda5, (int) f).write(this.ensureViewModelStore).write(z).AudioAttributesCompatParcelizer(i == 1 ? Layout.Alignment.ALIGN_NORMAL : RatingCompat()).AudioAttributesCompatParcelizer().write(i).IconCompatParcelizer(this.PlaybackStateCompatCustomAction, this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28).IconCompatParcelizer(this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM).RemoteActionCompatParcelizer(this._init_lambda4).RemoteActionCompatParcelizer();
        } catch (FlacFrameReaderSampleNumberHolder.read e) {
            e.getCause().getMessage();
            staticLayoutRemoteActionCompatParcelizer = null;
        }
        return (StaticLayout) StringCollectionDeserializer.RemoteActionCompatParcelizer(staticLayoutRemoteActionCompatParcelizer);
    }

    private Layout.Alignment RatingCompat() {
        int iWrite = _clearIfStdImpl.write(this.setSessionImpl, this.r8lambdaKUbBm7ckfqTc9QCgukC86fguu4 ? 1 : 0) & 7;
        if (iWrite != 1) {
            return iWrite != 5 ? this.r8lambdaKUbBm7ckfqTc9QCgukC86fguu4 ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : this.r8lambdaKUbBm7ckfqTc9QCgukC86fguu4 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE;
        }
        return Layout.Alignment.ALIGN_CENTER;
    }

    public final void AudioAttributesImplApi21Parcelizer() {
        AudioAttributesCompatParcelizer(false);
    }

    public final void AudioAttributesCompatParcelizer(boolean z) {
        if ((this.addContentView.getHeight() <= 0 || this.addContentView.getWidth() <= 0) && !z) {
            return;
        }
        write(z);
        MediaBrowserCompatSearchResultReceiver();
    }

    public final void AudioAttributesCompatParcelizer(CharSequence charSequence) {
        if (charSequence == null || !TextUtils.equals(this.accessensureViewModelStore, charSequence)) {
            this.accessensureViewModelStore = charSequence;
            this.accessonBackPresseds1027565324 = null;
            MediaBrowserCompatMediaItem();
            AudioAttributesImplApi21Parcelizer();
        }
    }

    public final CharSequence AudioAttributesImplApi26Parcelizer() {
        return this.accessensureViewModelStore;
    }

    public final void MediaBrowserCompatItemReceiver(int i) {
        if (i != this.r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8) {
            this.r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8 = i;
            MediaBrowserCompatMediaItem();
            AudioAttributesImplApi21Parcelizer();
        }
    }

    public final int MediaBrowserCompatItemReceiver() {
        return this.r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8;
    }

    public final int RemoteActionCompatParcelizer() {
        return this.onSetPlaybackSpeed;
    }

    public final void AudioAttributesImplBaseParcelizer(float f) {
        this.PlaybackStateCompatCustomAction = f;
    }

    public final void MediaBrowserCompatItemReceiver(float f) {
        this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = f;
    }

    public final void AudioAttributesImplBaseParcelizer(int i) {
        this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = i;
    }

    public final void IconCompatParcelizer(readFrameBlockSizeSamplesFromKey readframeblocksizesamplesfromkey) {
        if (this._init_lambda4 != readframeblocksizesamplesfromkey) {
            this._init_lambda4 = readframeblocksizesamplesfromkey;
            AudioAttributesCompatParcelizer(true);
        }
    }

    private static boolean read(float f, float f2) {
        return Math.abs(f - f2) < 1.0E-5f;
    }

    public final ColorStateList AudioAttributesCompatParcelizer() {
        return this.MediaMetadataCompat;
    }

    private static int read(int i, int i2, float f) {
        float f2 = 1.0f - f;
        return Color.argb(Math.round((Color.alpha(i) * f2) + (Color.alpha(i2) * f)), Math.round((Color.red(i) * f2) + (Color.red(i2) * f)), Math.round((Color.green(i) * f2) + (Color.green(i2) * f)), Math.round((Color.blue(i) * f2) + (Color.blue(i2) * f)));
    }

    private static float read(float f, float f2, float f3, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f3 = timeInterpolator.getInterpolation(f3);
        }
        return BinarySearchSeekerSeekOperationParams.read(f, f2, f3);
    }

    private static boolean read(Rect rect, int i, int i2, int i3, int i4) {
        return rect.left == i && rect.top == i2 && rect.right == i3 && rect.bottom == i4;
    }
}
