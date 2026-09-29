package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b$\"\u0011\u0010\u0003\u001a\u00020\u00008\u0006¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0011\u0010\u0001\u001a\u00020\u00008\u0006¢\u0006\u0006\n\u0004\b\u0004\u0010\u0002\"\u0011\u0010\u0006\u001a\u00020\u00008\u0006¢\u0006\u0006\n\u0004\b\u0005\u0010\u0002\"\u0011\u0010\b\u001a\u00020\u00008\u0006¢\u0006\u0006\n\u0004\b\u0007\u0010\u0002\"\u0011\u0010\u0005\u001a\u00020\u00008\u0006¢\u0006\u0006\n\u0004\b\t\u0010\u0002\"\u0011\u0010\u000b\u001a\u00020\u00008\u0006¢\u0006\u0006\n\u0004\b\n\u0010\u0002\"\u0011\u0010\r\u001a\u00020\u00008\u0006¢\u0006\u0006\n\u0004\b\f\u0010\u0002\"\u0011\u0010\u0007\u001a\u00020\u00008\u0006¢\u0006\u0006\n\u0004\b\u000e\u0010\u0002\"\u0011\u0010\u000e\u001a\u00020\u00008\u0006¢\u0006\u0006\n\u0004\b\u000f\u0010\u0002\"\u0017\u0010\u0012\u001a\u00020\u00008\u0007¢\u0006\f\n\u0004\b\u0010\u0010\u0002\u001a\u0004\b\u0001\u0010\u0011\"\u0014\u0010\u0010\u001a\u00020\u00008\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0002\"\u0014\u0010\u0015\u001a\u00020\u00008\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0002\"\u0014\u0010\u0017\u001a\u00020\u00008\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0002\"\u0014\u0010\u0018\u001a\u00020\u00008\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0002\"\u0014\u0010\u001a\u001a\u00020\u00008\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0002\"\u0014\u0010\u001b\u001a\u00020\u00008\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0002\"\u0014\u0010\f\u001a\u00020\u00008\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0002\"\u0014\u0010\u001d\u001a\u00020\u00008\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0002\"\u0014\u0010\u0016\u001a\u00020\u00008\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0002\"\u0014\u0010\u001e\u001a\u00020\u00008\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0002\"\u0014\u0010!\u001a\u00020\u00008\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b \u0010\u0002\"\u0014\u0010\u001f\u001a\u00020\u00008\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0002\"\u0014\u0010\u0004\u001a\u00020\u00008\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0002\"\u0014\u0010\u0013\u001a\u00020\u00008\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0002\"\u0014\u0010\t\u001a\u00020\u00008\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0002\"\u0014\u0010\u0019\u001a\u00020\u00008\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0002\"\u0014\u0010#\u001a\u00020\u00008\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0002\"\u0014\u0010\u000f\u001a\u00020\u00008\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0002\"\u0014\u0010\"\u001a\u00020\u00008\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0002\"\u0014\u0010$\u001a\u00020\u00008\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b$\u0010\u0002\"\u0014\u0010\n\u001a\u00020\u00008\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0002\"\u0014\u0010\u0014\u001a\u00020\u00008\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0002\"\u0014\u0010 \u001a\u00020\u00008\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0002\"\u0014\u0010\u001c\u001a\u00020\u00008\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0002"}, d2 = {"Lo/setOnQueryTextFocusChangeListener;", "read", "Lo/setOnQueryTextFocusChangeListener;", "AudioAttributesCompatParcelizer", "onMediaButtonEvent", "RemoteActionCompatParcelizer", "write", "MediaBrowserCompatItemReceiver", "IconCompatParcelizer", "onPlay", "onSeekTo", "AudioAttributesImplApi21Parcelizer", "handleMediaPlayPauseIfPendingOnHandler", "AudioAttributesImplBaseParcelizer", "MediaBrowserCompatCustomActionResultReceiver", "onPrepareFromMediaId", "MediaBrowserCompatSearchResultReceiver", "()Lo/setOnQueryTextFocusChangeListener;", "AudioAttributesImplApi26Parcelizer", "onPlayFromMediaId", "onRewind", "MediaDescriptionCompat", "onCustomAction", "MediaBrowserCompatMediaItem", "MediaMetadataCompat", "onPrepareFromSearch", "RatingCompat", "onCommand", "onRemoveQueueItemAt", "MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver", "onAddQueueItem", "onPause", "onPrepareFromUri", "onFastForward", "onPlayFromUri", "onPrepare", "onPlayFromSearch"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class setOnSearchClickListener {
    private static final setOnQueryTextFocusChangeListener read = new setMaxWidth(0.25f, 0.1f, 0.25f, 1.0f);
    private static final setOnQueryTextFocusChangeListener onMediaButtonEvent = new setMaxWidth(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0.58f, 1.0f);
    private static final setOnQueryTextFocusChangeListener RemoteActionCompatParcelizer = new setMaxWidth(0.42f, BitmapDescriptorFactory.HUE_RED, 1.0f, 1.0f);
    private static final setOnQueryTextFocusChangeListener MediaBrowserCompatItemReceiver = new setMaxWidth(0.42f, BitmapDescriptorFactory.HUE_RED, 0.58f, 1.0f);
    private static final setOnQueryTextFocusChangeListener onPlay = new setMaxWidth(0.12f, BitmapDescriptorFactory.HUE_RED, 0.39f, BitmapDescriptorFactory.HUE_RED);
    private static final setOnQueryTextFocusChangeListener onSeekTo = new setMaxWidth(0.61f, 1.0f, 0.88f, 1.0f);
    private static final setOnQueryTextFocusChangeListener handleMediaPlayPauseIfPendingOnHandler = new setMaxWidth(0.37f, BitmapDescriptorFactory.HUE_RED, 0.63f, 1.0f);
    private static final setOnQueryTextFocusChangeListener MediaBrowserCompatCustomActionResultReceiver = new setMaxWidth(0.32f, BitmapDescriptorFactory.HUE_RED, 0.67f, BitmapDescriptorFactory.HUE_RED);
    private static final setOnQueryTextFocusChangeListener onPrepareFromMediaId = new setMaxWidth(0.33f, 1.0f, 0.68f, 1.0f);
    private static final setOnQueryTextFocusChangeListener MediaBrowserCompatSearchResultReceiver = new setMaxWidth(0.65f, BitmapDescriptorFactory.HUE_RED, 0.35f, 1.0f);
    private static final setOnQueryTextFocusChangeListener onPlayFromMediaId = new setMaxWidth(0.64f, BitmapDescriptorFactory.HUE_RED, 0.78f, BitmapDescriptorFactory.HUE_RED);
    private static final setOnQueryTextFocusChangeListener onRewind = new setMaxWidth(0.22f, 1.0f, 0.36f, 1.0f);
    private static final setOnQueryTextFocusChangeListener onCustomAction = new setMaxWidth(0.83f, BitmapDescriptorFactory.HUE_RED, 0.17f, 1.0f);
    private static final setOnQueryTextFocusChangeListener write = new setMaxWidth(0.55f, BitmapDescriptorFactory.HUE_RED, 1.0f, 0.45f);
    private static final setOnQueryTextFocusChangeListener onPrepareFromSearch = new setMaxWidth(BitmapDescriptorFactory.HUE_RED, 0.55f, 0.45f, 1.0f);
    private static final setOnQueryTextFocusChangeListener RatingCompat = new setMaxWidth(0.85f, BitmapDescriptorFactory.HUE_RED, 0.15f, 1.0f);
    private static final setOnQueryTextFocusChangeListener onCommand = new setMaxWidth(0.11f, BitmapDescriptorFactory.HUE_RED, 0.5f, BitmapDescriptorFactory.HUE_RED);
    private static final setOnQueryTextFocusChangeListener onRemoveQueueItemAt = new setMaxWidth(0.5f, 1.0f, 0.89f, 1.0f);
    private static final setOnQueryTextFocusChangeListener onAddQueueItem = new setMaxWidth(0.45f, BitmapDescriptorFactory.HUE_RED, 0.55f, 1.0f);
    private static final setOnQueryTextFocusChangeListener onPause = new setMaxWidth(0.5f, BitmapDescriptorFactory.HUE_RED, 0.75f, BitmapDescriptorFactory.HUE_RED);
    private static final setOnQueryTextFocusChangeListener onPrepareFromUri = new setMaxWidth(0.25f, 1.0f, 0.5f, 1.0f);
    private static final setOnQueryTextFocusChangeListener MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = new setMaxWidth(0.76f, BitmapDescriptorFactory.HUE_RED, 0.24f, 1.0f);
    private static final setOnQueryTextFocusChangeListener AudioAttributesImplBaseParcelizer = new setMaxWidth(0.7f, BitmapDescriptorFactory.HUE_RED, 0.84f, BitmapDescriptorFactory.HUE_RED);
    private static final setOnQueryTextFocusChangeListener onPlayFromUri = new setMaxWidth(0.16f, 1.0f, 0.3f, 1.0f);
    private static final setOnQueryTextFocusChangeListener MediaDescriptionCompat = new setMaxWidth(0.87f, BitmapDescriptorFactory.HUE_RED, 0.13f, 1.0f);
    private static final setOnQueryTextFocusChangeListener AudioAttributesCompatParcelizer = new setMaxWidth(0.36f, BitmapDescriptorFactory.HUE_RED, 0.66f, -0.56f);
    private static final setOnQueryTextFocusChangeListener onFastForward = new setMaxWidth(0.34f, 1.56f, 0.64f, 1.0f);
    private static final setOnQueryTextFocusChangeListener AudioAttributesImplApi26Parcelizer = new setMaxWidth(0.68f, -0.6f, 0.32f, 1.6f);
    private static final setOnQueryTextFocusChangeListener AudioAttributesImplApi21Parcelizer = new setOnQueryTextFocusChangeListener() { // from class: o.setQuery
        @Override // kotlin.setOnQueryTextFocusChangeListener
        public final float AudioAttributesCompatParcelizer(float f) {
            return setOnSearchClickListener.AudioAttributesImplApi21Parcelizer(f);
        }
    };
    private static final setOnQueryTextFocusChangeListener onPlayFromSearch = new setOnQueryTextFocusChangeListener() { // from class: o.setSuggestionsAdapter
        @Override // kotlin.setOnQueryTextFocusChangeListener
        public final float AudioAttributesCompatParcelizer(float f) {
            return setOnSearchClickListener.RatingCompat(f);
        }
    };
    private static final setOnQueryTextFocusChangeListener MediaMetadataCompat = new setOnQueryTextFocusChangeListener() { // from class: o.setQueryRefinementEnabled
        @Override // kotlin.setOnQueryTextFocusChangeListener
        public final float AudioAttributesCompatParcelizer(float f) {
            return setOnSearchClickListener.MediaBrowserCompatCustomActionResultReceiver(f);
        }
    };
    private static final setOnQueryTextFocusChangeListener onPrepare = new setOnQueryTextFocusChangeListener() { // from class: o.setSubmitButtonEnabled
        @Override // kotlin.setOnQueryTextFocusChangeListener
        public final float AudioAttributesCompatParcelizer(float f) {
            return setOnSearchClickListener.MediaBrowserCompatSearchResultReceiver(f);
        }
    };
    private static final setOnQueryTextFocusChangeListener IconCompatParcelizer = new setOnQueryTextFocusChangeListener() { // from class: o.setQueryHint
        @Override // kotlin.setOnQueryTextFocusChangeListener
        public final float AudioAttributesCompatParcelizer(float f) {
            return setOnSearchClickListener.AudioAttributesImplApi26Parcelizer(f);
        }
    };
    private static final setOnQueryTextFocusChangeListener MediaBrowserCompatMediaItem = new setOnQueryTextFocusChangeListener() { // from class: o.setSearchableInfo
        @Override // kotlin.setOnQueryTextFocusChangeListener
        public final float AudioAttributesCompatParcelizer(float f) {
            return setOnSearchClickListener.MediaBrowserCompatItemReceiver(f);
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static final float MediaBrowserCompatSearchResultReceiver(float f) {
        if (f < 0.36363637f) {
            return 7.5625f * f * f;
        }
        if (f < 0.72727275f) {
            float f2 = f - 0.54545456f;
            return (7.5625f * f2 * f2) + 0.75f;
        }
        if (f < 0.90909094f) {
            float f3 = f - 0.8181818f;
            return (7.5625f * f3 * f3) + 0.9375f;
        }
        float f4 = f - 0.95454544f;
        return (7.5625f * f4 * f4) + 0.984375f;
    }

    public static final setOnQueryTextFocusChangeListener read() {
        return MediaBrowserCompatSearchResultReceiver;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float AudioAttributesImplApi21Parcelizer(float f) {
        if (f == BitmapDescriptorFactory.HUE_RED) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        if (f == 1.0f) {
            return 1.0f;
        }
        return (float) (((double) (-((float) Math.pow(2.0d, r6 - 10.0f)))) * Math.sin(((double) ((f * 10.0f) - 10.75f)) * 2.0943951023931953d));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float RatingCompat(float f) {
        if (f == BitmapDescriptorFactory.HUE_RED) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        if (f == 1.0f) {
            return 1.0f;
        }
        return (float) ((((double) ((float) Math.pow(2.0d, (-10.0f) * f))) * Math.sin(((double) ((f * 10.0f) - 0.75f)) * 2.0943951023931953d)) + 1.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float MediaBrowserCompatCustomActionResultReceiver(float f) {
        if (f == BitmapDescriptorFactory.HUE_RED) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        if (f == 1.0f) {
            return 1.0f;
        }
        if (BitmapDescriptorFactory.HUE_RED <= f && f <= 0.5f) {
            return (float) ((-(((double) ((float) Math.pow(2.0d, r11 - 10.0f))) * Math.sin(((double) ((f * 20.0f) - 11.125f)) * 1.3962634015954636d))) / 2.0d);
        }
        return ((float) ((((double) ((float) Math.pow(2.0d, ((-20.0f) * f) + 10.0f))) * Math.sin(((double) ((f * 20.0f) - 11.125f)) * 1.3962634015954636d)) / 2.0d)) + 1.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float AudioAttributesImplApi26Parcelizer(float f) {
        return 1.0f - onPrepare.AudioAttributesCompatParcelizer(1.0f - f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float MediaBrowserCompatItemReceiver(float f) {
        float fAudioAttributesCompatParcelizer;
        if (f < 0.5d) {
            fAudioAttributesCompatParcelizer = 1.0f - onPrepare.AudioAttributesCompatParcelizer(1.0f - (f * 2.0f));
        } else {
            fAudioAttributesCompatParcelizer = 1.0f + onPrepare.AudioAttributesCompatParcelizer((f * 2.0f) - 1.0f);
        }
        return fAudioAttributesCompatParcelizer / 2.0f;
    }
}
