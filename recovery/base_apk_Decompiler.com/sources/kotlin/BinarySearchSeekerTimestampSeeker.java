package kotlin;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.badge.BadgeState;
import java.lang.ref.WeakReference;
import java.text.NumberFormat;
import kotlin.calculateNextSearchBytePosition;
import kotlin.getFirstSampleNumber;

/* JADX INFO: loaded from: classes3.dex */
public final class BinarySearchSeekerTimestampSeeker extends Drawable implements getFirstSampleNumber.read {
    private static final int IconCompatParcelizer = calculateNextSearchBytePosition.MediaBrowserCompatMediaItem.Widget_MaterialComponents_Badge;
    private static final int write = calculateNextSearchBytePosition.IconCompatParcelizer.badgeStyle;
    private float AudioAttributesCompatParcelizer;
    private final WeakReference<Context> AudioAttributesImplApi21Parcelizer;
    private WeakReference<FrameLayout> AudioAttributesImplApi26Parcelizer;
    private float AudioAttributesImplBaseParcelizer;
    private float MediaBrowserCompatCustomActionResultReceiver;
    private float MediaBrowserCompatItemReceiver;
    private final BadgeState MediaBrowserCompatMediaItem;
    private float MediaBrowserCompatSearchResultReceiver;
    private final getFirstSampleNumber MediaDescriptionCompat;
    private int MediaMetadataCompat;
    private final frameSizeBytesByTypeNb RatingCompat;
    private WeakReference<View> RemoteActionCompatParcelizer;
    private final Rect read;

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    final BadgeState.State IconCompatParcelizer() {
        return this.MediaBrowserCompatMediaItem.onFastForward();
    }

    static BinarySearchSeekerTimestampSeeker write(Context context, BadgeState.State state) {
        return new BinarySearchSeekerTimestampSeeker(context, write, IconCompatParcelizer, state);
    }

    private void onFastForward() {
        setVisible(this.MediaBrowserCompatMediaItem.onSeekTo(), false);
    }

    private void onPlay() {
        onCustomAction();
        onPlayFromMediaId();
        onPause();
        onCommand();
        handleMediaPlayPauseIfPendingOnHandler();
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
        onMediaButtonEvent();
        onAddQueueItem();
        onPrepareFromSearch();
        onFastForward();
    }

    private BinarySearchSeekerTimestampSeeker(Context context, int i, int i2, BadgeState.State state) {
        int iAudioAttributesImplApi21Parcelizer;
        int iMediaBrowserCompatItemReceiver;
        this.AudioAttributesImplApi21Parcelizer = new WeakReference<>(context);
        readId3Metadata.read(context);
        this.read = new Rect();
        getFirstSampleNumber getfirstsamplenumber = new getFirstSampleNumber(this);
        this.MediaDescriptionCompat = getfirstsamplenumber;
        getfirstsamplenumber.RemoteActionCompatParcelizer().setTextAlign(Paint.Align.CENTER);
        BadgeState badgeState = new BadgeState(context, 0, i, i2, state);
        this.MediaBrowserCompatMediaItem = badgeState;
        if (MediaMetadataCompat()) {
            iAudioAttributesImplApi21Parcelizer = badgeState.MediaMetadataCompat();
        } else {
            iAudioAttributesImplApi21Parcelizer = badgeState.AudioAttributesImplApi21Parcelizer();
        }
        if (MediaMetadataCompat()) {
            iMediaBrowserCompatItemReceiver = badgeState.RatingCompat();
        } else {
            iMediaBrowserCompatItemReceiver = badgeState.MediaBrowserCompatItemReceiver();
        }
        this.RatingCompat = new frameSizeBytesByTypeNb(isValidFrameType.read(context, iAudioAttributesImplApi21Parcelizer, iMediaBrowserCompatItemReceiver).RemoteActionCompatParcelizer());
        onPlay();
    }

    public final void write(View view, FrameLayout frameLayout) {
        this.RemoteActionCompatParcelizer = new WeakReference<>(view);
        this.AudioAttributesImplApi26Parcelizer = new WeakReference<>(frameLayout);
        IconCompatParcelizer(view);
        onPrepareFromSearch();
        invalidateSelf();
    }

    private boolean MediaDescriptionCompat() {
        FrameLayout frameLayoutWrite = write();
        return frameLayoutWrite != null && frameLayoutWrite.getId() == calculateNextSearchBytePosition.AudioAttributesImplApi26Parcelizer.mtrl_anchor_parent;
    }

    public final FrameLayout write() {
        WeakReference<FrameLayout> weakReference = this.AudioAttributesImplApi26Parcelizer;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    private static void IconCompatParcelizer(View view) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
    }

    private void MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(this.MediaBrowserCompatMediaItem.AudioAttributesCompatParcelizer());
        if (this.RatingCompat.onPlay() != colorStateListValueOf) {
            this.RatingCompat.AudioAttributesImplApi21Parcelizer(colorStateListValueOf);
            invalidateSelf();
        }
    }

    private void onMediaButtonEvent() {
        this.MediaDescriptionCompat.RemoteActionCompatParcelizer().setColor(this.MediaBrowserCompatMediaItem.MediaBrowserCompatCustomActionResultReceiver());
        invalidateSelf();
    }

    private boolean onRemoveQueueItem() {
        return !this.MediaBrowserCompatMediaItem.onPlayFromUri() && this.MediaBrowserCompatMediaItem.onPrepareFromSearch();
    }

    private int onPlayFromUri() {
        if (this.MediaBrowserCompatMediaItem.onPrepareFromSearch()) {
            return this.MediaBrowserCompatMediaItem.onMediaButtonEvent();
        }
        return 0;
    }

    private boolean onSeekTo() {
        return this.MediaBrowserCompatMediaItem.onPlayFromUri();
    }

    private String onRemoveQueueItemAt() {
        return this.MediaBrowserCompatMediaItem.onPause();
    }

    private int onPrepareFromMediaId() {
        return this.MediaBrowserCompatMediaItem.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
    }

    private int onPlayFromSearch() {
        return this.MediaBrowserCompatMediaItem.onPlay();
    }

    private void onPause() {
        onPrepare();
        this.MediaDescriptionCompat.write();
        onPrepareFromSearch();
        invalidateSelf();
    }

    private void onAddQueueItem() {
        WeakReference<View> weakReference = this.RemoteActionCompatParcelizer;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        View view = this.RemoteActionCompatParcelizer.get();
        WeakReference<FrameLayout> weakReference2 = this.AudioAttributesImplApi26Parcelizer;
        write(view, weakReference2 != null ? weakReference2.get() : null);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.MediaBrowserCompatMediaItem.write();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer(i);
        handleMediaPlayPauseIfPendingOnHandler();
    }

    private void handleMediaPlayPauseIfPendingOnHandler() {
        this.MediaDescriptionCompat.RemoteActionCompatParcelizer().setAlpha(getAlpha());
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.read.height();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.read.width();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (getBounds().isEmpty() || getAlpha() == 0 || !isVisible()) {
            return;
        }
        this.RatingCompat.draw(canvas);
        if (MediaMetadataCompat()) {
            read(canvas);
        }
    }

    @Override // o.getFirstSampleNumber.read
    public final void AudioAttributesCompatParcelizer() {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable, o.getFirstSampleNumber.read
    public final boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    public final CharSequence read() {
        if (!isVisible()) {
            return null;
        }
        if (onSeekTo()) {
            return MediaBrowserCompatMediaItem();
        }
        if (onRemoveQueueItem()) {
            return MediaBrowserCompatItemReceiver();
        }
        return AudioAttributesImplApi21Parcelizer();
    }

    private String MediaBrowserCompatItemReceiver() {
        Context context;
        if (this.MediaBrowserCompatMediaItem.onCustomAction() == 0 || (context = this.AudioAttributesImplApi21Parcelizer.get()) == null) {
            return null;
        }
        if (this.MediaMetadataCompat == -2 || onPlayFromUri() <= this.MediaMetadataCompat) {
            return context.getResources().getQuantityString(this.MediaBrowserCompatMediaItem.onCustomAction(), onPlayFromUri(), Integer.valueOf(onPlayFromUri()));
        }
        return context.getString(this.MediaBrowserCompatMediaItem.MediaDescriptionCompat(), Integer.valueOf(this.MediaMetadataCompat));
    }

    private CharSequence MediaBrowserCompatMediaItem() {
        CharSequence charSequenceMediaBrowserCompatMediaItem = this.MediaBrowserCompatMediaItem.MediaBrowserCompatMediaItem();
        return charSequenceMediaBrowserCompatMediaItem != null ? charSequenceMediaBrowserCompatMediaItem : onRemoveQueueItemAt();
    }

    private CharSequence AudioAttributesImplApi21Parcelizer() {
        return this.MediaBrowserCompatMediaItem.MediaBrowserCompatSearchResultReceiver();
    }

    public final int RemoteActionCompatParcelizer() {
        return this.MediaBrowserCompatMediaItem.onCommand();
    }

    private void onPlayFromMediaId() {
        TrackOutput trackOutput;
        Context context = this.AudioAttributesImplApi21Parcelizer.get();
        if (context == null || this.MediaDescriptionCompat.read() == (trackOutput = new TrackOutput(context, this.MediaBrowserCompatMediaItem.onPlayFromSearch()))) {
            return;
        }
        this.MediaDescriptionCompat.write(trackOutput, context);
        onMediaButtonEvent();
        onPrepareFromSearch();
        invalidateSelf();
    }

    private void onCustomAction() {
        int iAudioAttributesImplApi21Parcelizer;
        int iMediaBrowserCompatItemReceiver;
        Context context = this.AudioAttributesImplApi21Parcelizer.get();
        if (context == null) {
            return;
        }
        frameSizeBytesByTypeNb framesizebytesbytypenb = this.RatingCompat;
        if (MediaMetadataCompat()) {
            iAudioAttributesImplApi21Parcelizer = this.MediaBrowserCompatMediaItem.MediaMetadataCompat();
        } else {
            iAudioAttributesImplApi21Parcelizer = this.MediaBrowserCompatMediaItem.AudioAttributesImplApi21Parcelizer();
        }
        if (MediaMetadataCompat()) {
            iMediaBrowserCompatItemReceiver = this.MediaBrowserCompatMediaItem.RatingCompat();
        } else {
            iMediaBrowserCompatItemReceiver = this.MediaBrowserCompatMediaItem.MediaBrowserCompatItemReceiver();
        }
        framesizebytesbytypenb.setShapeAppearanceModel(isValidFrameType.read(context, iAudioAttributesImplApi21Parcelizer, iMediaBrowserCompatItemReceiver).RemoteActionCompatParcelizer());
        invalidateSelf();
    }

    private void onPrepareFromSearch() {
        Context context = this.AudioAttributesImplApi21Parcelizer.get();
        WeakReference<View> weakReference = this.RemoteActionCompatParcelizer;
        View view = weakReference != null ? weakReference.get() : null;
        if (context == null || view == null) {
            return;
        }
        Rect rect = new Rect();
        rect.set(this.read);
        Rect rect2 = new Rect();
        view.getDrawingRect(rect2);
        WeakReference<FrameLayout> weakReference2 = this.AudioAttributesImplApi26Parcelizer;
        FrameLayout frameLayout = weakReference2 != null ? weakReference2.get() : null;
        if (frameLayout != null) {
            if (frameLayout == null) {
                frameLayout = (ViewGroup) view.getParent();
            }
            frameLayout.offsetDescendantRectToMyCoords(view, rect2);
        }
        write(rect2, view);
        onSeekFinished.AudioAttributesCompatParcelizer(this.read, this.AudioAttributesCompatParcelizer, this.MediaBrowserCompatItemReceiver, this.MediaBrowserCompatSearchResultReceiver, this.AudioAttributesImplBaseParcelizer);
        float f = this.MediaBrowserCompatCustomActionResultReceiver;
        if (f != -1.0f) {
            this.RatingCompat.MediaMetadataCompat(f);
        }
        if (rect.equals(this.read)) {
            return;
        }
        this.RatingCompat.setBounds(this.read);
    }

    private int MediaBrowserCompatSearchResultReceiver() {
        int iOnPrepare = this.MediaBrowserCompatMediaItem.onPrepare();
        if (MediaMetadataCompat()) {
            iOnPrepare = this.MediaBrowserCompatMediaItem.onPrepareFromMediaId();
            Context context = this.AudioAttributesImplApi21Parcelizer.get();
            if (context != null) {
                iOnPrepare = BinarySearchSeekerSeekOperationParams.RemoteActionCompatParcelizer(iOnPrepare, iOnPrepare - this.MediaBrowserCompatMediaItem.handleMediaPlayPauseIfPendingOnHandler(), BinarySearchSeekerSeekOperationParams.RemoteActionCompatParcelizer(BitmapDescriptorFactory.HUE_RED, 1.0f, 0.3f, 1.0f, SeekMap.read(context) - 1.0f));
            }
        }
        if (this.MediaBrowserCompatMediaItem.MediaBrowserCompatItemReceiver == 0) {
            iOnPrepare -= Math.round(this.AudioAttributesImplBaseParcelizer);
        }
        return iOnPrepare + this.MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer();
    }

    private int RatingCompat() {
        int iOnCommand;
        if (MediaMetadataCompat()) {
            iOnCommand = this.MediaBrowserCompatMediaItem.onAddQueueItem();
        } else {
            iOnCommand = this.MediaBrowserCompatMediaItem.onCommand();
        }
        if (this.MediaBrowserCompatMediaItem.MediaBrowserCompatItemReceiver == 1) {
            iOnCommand += MediaMetadataCompat() ? this.MediaBrowserCompatMediaItem.AudioAttributesImplApi26Parcelizer : this.MediaBrowserCompatMediaItem.AudioAttributesImplBaseParcelizer;
        }
        return iOnCommand + this.MediaBrowserCompatMediaItem.IconCompatParcelizer();
    }

    private void write(Rect rect, View view) {
        float f;
        float f2;
        float f3 = MediaMetadataCompat() ? this.MediaBrowserCompatMediaItem.AudioAttributesCompatParcelizer : this.MediaBrowserCompatMediaItem.IconCompatParcelizer;
        this.MediaBrowserCompatCustomActionResultReceiver = f3;
        if (f3 != -1.0f) {
            this.MediaBrowserCompatSearchResultReceiver = f3;
            this.AudioAttributesImplBaseParcelizer = f3;
        } else {
            this.MediaBrowserCompatSearchResultReceiver = Math.round((MediaMetadataCompat() ? this.MediaBrowserCompatMediaItem.MediaBrowserCompatCustomActionResultReceiver : this.MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer) / 2.0f);
            this.AudioAttributesImplBaseParcelizer = Math.round((MediaMetadataCompat() ? this.MediaBrowserCompatMediaItem.write : this.MediaBrowserCompatMediaItem.read) / 2.0f);
        }
        if (MediaMetadataCompat()) {
            String strAudioAttributesImplBaseParcelizer = AudioAttributesImplBaseParcelizer();
            this.MediaBrowserCompatSearchResultReceiver = Math.max(this.MediaBrowserCompatSearchResultReceiver, (this.MediaDescriptionCompat.IconCompatParcelizer(strAudioAttributesImplBaseParcelizer) / 2.0f) + this.MediaBrowserCompatMediaItem.AudioAttributesImplApi26Parcelizer());
            float fMax = Math.max(this.AudioAttributesImplBaseParcelizer, (this.MediaDescriptionCompat.write(strAudioAttributesImplBaseParcelizer) / 2.0f) + this.MediaBrowserCompatMediaItem.AudioAttributesImplBaseParcelizer());
            this.AudioAttributesImplBaseParcelizer = fMax;
            this.MediaBrowserCompatSearchResultReceiver = Math.max(this.MediaBrowserCompatSearchResultReceiver, fMax);
        }
        int iMediaBrowserCompatSearchResultReceiver = MediaBrowserCompatSearchResultReceiver();
        int i = this.MediaBrowserCompatMediaItem.read();
        if (i == 8388691 || i == 8388693) {
            this.MediaBrowserCompatItemReceiver = rect.bottom - iMediaBrowserCompatSearchResultReceiver;
        } else {
            this.MediaBrowserCompatItemReceiver = rect.top + iMediaBrowserCompatSearchResultReceiver;
        }
        int iRatingCompat = RatingCompat();
        int i2 = this.MediaBrowserCompatMediaItem.read();
        if (i2 == 8388659 || i2 == 8388691) {
            if (InvalidTypeIdException.MediaBrowserCompatMediaItem(view) == 0) {
                f = (rect.left - this.MediaBrowserCompatSearchResultReceiver) + iRatingCompat;
            } else {
                f = (rect.right + this.MediaBrowserCompatSearchResultReceiver) - iRatingCompat;
            }
            this.AudioAttributesCompatParcelizer = f;
        } else {
            if (InvalidTypeIdException.MediaBrowserCompatMediaItem(view) == 0) {
                f2 = (rect.right + this.MediaBrowserCompatSearchResultReceiver) - iRatingCompat;
            } else {
                f2 = (rect.left - this.MediaBrowserCompatSearchResultReceiver) + iRatingCompat;
            }
            this.AudioAttributesCompatParcelizer = f2;
        }
        if (this.MediaBrowserCompatMediaItem.onRemoveQueueItemAt()) {
            AudioAttributesCompatParcelizer(view);
        }
    }

    private void AudioAttributesCompatParcelizer(View view) {
        float y;
        float x;
        View viewWrite = write();
        if (viewWrite == null) {
            if (!(view.getParent() instanceof View)) {
                return;
            }
            float y2 = view.getY();
            x = view.getX();
            viewWrite = (View) view.getParent();
            y = y2;
        } else if (!MediaDescriptionCompat()) {
            y = 0.0f;
            x = 0.0f;
        } else {
            if (!(viewWrite.getParent() instanceof View)) {
                return;
            }
            y = viewWrite.getY();
            x = viewWrite.getX();
            viewWrite = (View) viewWrite.getParent();
        }
        float fRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(viewWrite, y);
        float fIconCompatParcelizer = IconCompatParcelizer(viewWrite, x);
        float f = read(viewWrite, y);
        float fWrite = write(viewWrite, x);
        if (fRemoteActionCompatParcelizer < BitmapDescriptorFactory.HUE_RED) {
            this.MediaBrowserCompatItemReceiver += Math.abs(fRemoteActionCompatParcelizer);
        }
        if (fIconCompatParcelizer < BitmapDescriptorFactory.HUE_RED) {
            this.AudioAttributesCompatParcelizer += Math.abs(fIconCompatParcelizer);
        }
        if (f > BitmapDescriptorFactory.HUE_RED) {
            this.MediaBrowserCompatItemReceiver -= Math.abs(f);
        }
        if (fWrite > BitmapDescriptorFactory.HUE_RED) {
            this.AudioAttributesCompatParcelizer -= Math.abs(fWrite);
        }
    }

    private float RemoteActionCompatParcelizer(View view, float f) {
        return (this.MediaBrowserCompatItemReceiver - this.AudioAttributesImplBaseParcelizer) + view.getY() + f;
    }

    private float IconCompatParcelizer(View view, float f) {
        return (this.AudioAttributesCompatParcelizer - this.MediaBrowserCompatSearchResultReceiver) + view.getX() + f;
    }

    private float read(View view, float f) {
        if (!(view.getParent() instanceof View)) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        return ((this.MediaBrowserCompatItemReceiver + this.AudioAttributesImplBaseParcelizer) - (((View) view.getParent()).getHeight() - view.getY())) + f;
    }

    private float write(View view, float f) {
        if (!(view.getParent() instanceof View)) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        return ((this.AudioAttributesCompatParcelizer + this.MediaBrowserCompatSearchResultReceiver) - (((View) view.getParent()).getWidth() - view.getX())) + f;
    }

    private void read(Canvas canvas) {
        String strAudioAttributesImplBaseParcelizer = AudioAttributesImplBaseParcelizer();
        if (strAudioAttributesImplBaseParcelizer != null) {
            Rect rect = new Rect();
            this.MediaDescriptionCompat.RemoteActionCompatParcelizer().getTextBounds(strAudioAttributesImplBaseParcelizer, 0, strAudioAttributesImplBaseParcelizer.length(), rect);
            float fExactCenterY = this.MediaBrowserCompatItemReceiver - rect.exactCenterY();
            canvas.drawText(strAudioAttributesImplBaseParcelizer, this.AudioAttributesCompatParcelizer, rect.bottom <= 0 ? (int) fExactCenterY : Math.round(fExactCenterY), this.MediaDescriptionCompat.RemoteActionCompatParcelizer());
        }
    }

    private boolean MediaMetadataCompat() {
        return onSeekTo() || onRemoveQueueItem();
    }

    private String AudioAttributesImplBaseParcelizer() {
        if (onSeekTo()) {
            return MediaBrowserCompatCustomActionResultReceiver();
        }
        if (onRemoveQueueItem()) {
            return AudioAttributesImplApi26Parcelizer();
        }
        return null;
    }

    private String MediaBrowserCompatCustomActionResultReceiver() {
        String strOnRemoveQueueItemAt = onRemoveQueueItemAt();
        int iOnPrepareFromMediaId = onPrepareFromMediaId();
        if (iOnPrepareFromMediaId == -2 || strOnRemoveQueueItemAt == null || strOnRemoveQueueItemAt.length() <= iOnPrepareFromMediaId) {
            return strOnRemoveQueueItemAt;
        }
        Context context = this.AudioAttributesImplApi21Parcelizer.get();
        if (context == null) {
            return "";
        }
        return String.format(context.getString(calculateNextSearchBytePosition.MediaBrowserCompatSearchResultReceiver.m3_exceed_max_badge_text_suffix), strOnRemoveQueueItemAt.substring(0, iOnPrepareFromMediaId - 1), "…");
    }

    private String AudioAttributesImplApi26Parcelizer() {
        if (this.MediaMetadataCompat == -2 || onPlayFromUri() <= this.MediaMetadataCompat) {
            return NumberFormat.getInstance(this.MediaBrowserCompatMediaItem.onPlayFromMediaId()).format(onPlayFromUri());
        }
        Context context = this.AudioAttributesImplApi21Parcelizer.get();
        if (context == null) {
            return "";
        }
        return String.format(this.MediaBrowserCompatMediaItem.onPlayFromMediaId(), context.getString(calculateNextSearchBytePosition.MediaBrowserCompatSearchResultReceiver.mtrl_exceed_max_badge_number_suffix), Integer.valueOf(this.MediaMetadataCompat), "+");
    }

    private void onCommand() {
        this.MediaDescriptionCompat.write();
        onCustomAction();
        onPrepareFromSearch();
        invalidateSelf();
    }

    private void onPrepare() {
        if (onPrepareFromMediaId() != -2) {
            this.MediaMetadataCompat = ((int) Math.pow(10.0d, ((double) onPrepareFromMediaId()) - 1.0d)) - 1;
        } else {
            this.MediaMetadataCompat = onPlayFromSearch();
        }
    }
}
