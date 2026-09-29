package kotlin;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes4.dex */
public final class PrivateMaxEntriesMapEntrySet {
    private Rect AudioAttributesCompatParcelizer;
    private int AudioAttributesImplApi21Parcelizer;
    private float AudioAttributesImplApi26Parcelizer;
    private float AudioAttributesImplBaseParcelizer;
    private int IconCompatParcelizer;
    private int MediaBrowserCompatCustomActionResultReceiver;
    private float MediaBrowserCompatItemReceiver;
    private float MediaBrowserCompatMediaItem;
    private float MediaBrowserCompatSearchResultReceiver;
    private StaticLayout MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    private Layout.Alignment MediaDescriptionCompat;
    private CharSequence MediaMetadataCompat;
    private int RatingCompat;
    private float RemoteActionCompatParcelizer;
    private int handleMediaPlayPauseIfPendingOnHandler;
    private int onAddQueueItem;
    private int onCommand;
    private float onCustomAction;
    private final float onFastForward;
    private int onMediaButtonEvent;
    private int onPause;
    private int onPlay;
    private int onPlayFromMediaId;
    private final float onPlayFromSearch;
    private final float onPlayFromUri;
    private StaticLayout onPrepare;
    private final float onPrepareFromMediaId;
    private final float onPrepareFromSearch;
    private int onPrepareFromUri;
    private final TextPaint onRemoveQueueItem;
    private int onRemoveQueueItemAt;
    private int onRewind;
    private int onSeekTo;
    private final Paint onSetRepeatMode;
    private Bitmap read;
    private final Paint write;

    public PrivateMaxEntriesMapEntrySet(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, new int[]{R.attr.lineSpacingExtra, R.attr.lineSpacingMultiplier}, 0, 0);
        this.onPrepareFromSearch = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.onPrepareFromMediaId = typedArrayObtainStyledAttributes.getFloat(1, 1.0f);
        typedArrayObtainStyledAttributes.recycle();
        float fRound = Math.round((context.getResources().getDisplayMetrics().densityDpi * 2.0f) / 160.0f);
        this.onFastForward = fRound;
        this.onPlayFromUri = fRound;
        this.onPlayFromSearch = fRound;
        TextPaint textPaint = new TextPaint();
        this.onRemoveQueueItem = textPaint;
        textPaint.setAntiAlias(true);
        textPaint.setSubpixelText(true);
        Paint paint = new Paint();
        this.onSetRepeatMode = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.write = paint2;
        paint2.setAntiAlias(true);
        paint2.setFilterBitmap(true);
    }

    public final void write(getDefaultImpl getdefaultimpl, computeNext computenext, float f, float f2, float f3, Canvas canvas, int i, int i2, int i3, int i4) {
        int i5;
        boolean z = getdefaultimpl.AudioAttributesCompatParcelizer == null;
        if (!z) {
            i5 = -16777216;
        } else if (TextUtils.isEmpty(getdefaultimpl.RatingCompat)) {
            return;
        } else {
            i5 = getdefaultimpl.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver ? getdefaultimpl.onCustomAction : computenext.AudioAttributesImplApi26Parcelizer;
        }
        if (AudioAttributesCompatParcelizer(this.MediaMetadataCompat, getdefaultimpl.RatingCompat) && LaissezFaireSubTypeValidator.read(this.MediaDescriptionCompat, getdefaultimpl.MediaBrowserCompatMediaItem) && this.read == getdefaultimpl.AudioAttributesCompatParcelizer && this.AudioAttributesImplBaseParcelizer == getdefaultimpl.IconCompatParcelizer && this.AudioAttributesImplApi21Parcelizer == getdefaultimpl.read && LaissezFaireSubTypeValidator.read(Integer.valueOf(this.MediaBrowserCompatCustomActionResultReceiver), Integer.valueOf(getdefaultimpl.write)) && this.MediaBrowserCompatItemReceiver == getdefaultimpl.AudioAttributesImplApi21Parcelizer && LaissezFaireSubTypeValidator.read(Integer.valueOf(this.RatingCompat), Integer.valueOf(getdefaultimpl.AudioAttributesImplApi26Parcelizer)) && this.MediaBrowserCompatSearchResultReceiver == getdefaultimpl.AudioAttributesImplBaseParcelizer && this.AudioAttributesImplApi26Parcelizer == getdefaultimpl.RemoteActionCompatParcelizer && this.onCommand == computenext.write && this.IconCompatParcelizer == computenext.RemoteActionCompatParcelizer && this.onPrepareFromUri == i5 && this.onAddQueueItem == computenext.AudioAttributesCompatParcelizer && this.handleMediaPlayPauseIfPendingOnHandler == computenext.read && LaissezFaireSubTypeValidator.read(this.onRemoveQueueItem.getTypeface(), computenext.AudioAttributesImplBaseParcelizer) && this.onCustomAction == f && this.MediaBrowserCompatMediaItem == f2 && this.RemoteActionCompatParcelizer == f3 && this.onPause == i && this.onMediaButtonEvent == i2 && this.onPlay == i3 && this.onPlayFromMediaId == i4) {
            RemoteActionCompatParcelizer(canvas, z);
            return;
        }
        this.MediaMetadataCompat = getdefaultimpl.RatingCompat;
        this.MediaDescriptionCompat = getdefaultimpl.MediaBrowserCompatMediaItem;
        this.read = getdefaultimpl.AudioAttributesCompatParcelizer;
        this.AudioAttributesImplBaseParcelizer = getdefaultimpl.IconCompatParcelizer;
        this.AudioAttributesImplApi21Parcelizer = getdefaultimpl.read;
        this.MediaBrowserCompatCustomActionResultReceiver = getdefaultimpl.write;
        this.MediaBrowserCompatItemReceiver = getdefaultimpl.AudioAttributesImplApi21Parcelizer;
        this.RatingCompat = getdefaultimpl.AudioAttributesImplApi26Parcelizer;
        this.MediaBrowserCompatSearchResultReceiver = getdefaultimpl.AudioAttributesImplBaseParcelizer;
        this.AudioAttributesImplApi26Parcelizer = getdefaultimpl.RemoteActionCompatParcelizer;
        this.onCommand = computenext.write;
        this.IconCompatParcelizer = computenext.RemoteActionCompatParcelizer;
        this.onPrepareFromUri = i5;
        this.onAddQueueItem = computenext.AudioAttributesCompatParcelizer;
        this.handleMediaPlayPauseIfPendingOnHandler = computenext.read;
        this.onRemoveQueueItem.setTypeface(computenext.AudioAttributesImplBaseParcelizer);
        this.onCustomAction = f;
        this.MediaBrowserCompatMediaItem = f2;
        this.RemoteActionCompatParcelizer = f3;
        this.onPause = i;
        this.onMediaButtonEvent = i2;
        this.onPlay = i3;
        this.onPlayFromMediaId = i4;
        if (z) {
            write();
        } else {
            RemoteActionCompatParcelizer();
        }
        RemoteActionCompatParcelizer(canvas, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x019e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void write() {
        /*
            Method dump skipped, instruction units count: 484
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.PrivateMaxEntriesMapEntrySet.write():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void RemoteActionCompatParcelizer() {
        /*
            r7 = this;
            android.graphics.Bitmap r0 = r7.read
            int r1 = r7.onPlay
            int r2 = r7.onPause
            int r3 = r7.onPlayFromMediaId
            int r4 = r7.onMediaButtonEvent
            float r5 = (float) r2
            int r1 = r1 - r2
            float r1 = (float) r1
            float r2 = r7.MediaBrowserCompatItemReceiver
            float r2 = r2 * r1
            float r5 = r5 + r2
            float r2 = (float) r4
            int r3 = r3 - r4
            float r3 = (float) r3
            float r4 = r7.AudioAttributesImplBaseParcelizer
            float r4 = r4 * r3
            float r2 = r2 + r4
            float r4 = r7.MediaBrowserCompatSearchResultReceiver
            float r1 = r1 * r4
            int r1 = java.lang.Math.round(r1)
            float r4 = r7.AudioAttributesImplApi26Parcelizer
            r6 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 == 0) goto L2e
            float r3 = r3 * r4
            int r0 = java.lang.Math.round(r3)
            goto L3f
        L2e:
            float r3 = (float) r1
            int r4 = r0.getHeight()
            float r4 = (float) r4
            int r0 = r0.getWidth()
            float r0 = (float) r0
            float r4 = r4 / r0
            float r3 = r3 * r4
            int r0 = java.lang.Math.round(r3)
        L3f:
            int r3 = r7.RatingCompat
            r4 = 1
            r6 = 2
            if (r3 != r6) goto L47
            float r3 = (float) r1
            goto L4c
        L47:
            if (r3 != r4) goto L4d
            int r3 = r1 / 2
            float r3 = (float) r3
        L4c:
            float r5 = r5 - r3
        L4d:
            int r3 = java.lang.Math.round(r5)
            int r5 = r7.MediaBrowserCompatCustomActionResultReceiver
            if (r5 != r6) goto L57
            float r4 = (float) r0
            goto L5c
        L57:
            if (r5 != r4) goto L5d
            int r4 = r0 / 2
            float r4 = (float) r4
        L5c:
            float r2 = r2 - r4
        L5d:
            int r2 = java.lang.Math.round(r2)
            android.graphics.Rect r4 = new android.graphics.Rect
            int r1 = r1 + r3
            int r0 = r0 + r2
            r4.<init>(r3, r2, r1, r0)
            r7.AudioAttributesCompatParcelizer = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.PrivateMaxEntriesMapEntrySet.RemoteActionCompatParcelizer():void");
    }

    private void RemoteActionCompatParcelizer(Canvas canvas, boolean z) {
        if (z) {
            IconCompatParcelizer(canvas);
        } else {
            read(canvas);
        }
    }

    private void IconCompatParcelizer(Canvas canvas) {
        StaticLayout staticLayout = this.onPrepare;
        StaticLayout staticLayout2 = this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        if (staticLayout == null || staticLayout2 == null) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(this.onRewind, this.onSeekTo);
        if (Color.alpha(this.onPrepareFromUri) > 0) {
            this.onSetRepeatMode.setColor(this.onPrepareFromUri);
            canvas.drawRect(-this.onRemoveQueueItemAt, BitmapDescriptorFactory.HUE_RED, staticLayout.getWidth() + this.onRemoveQueueItemAt, staticLayout.getHeight(), this.onSetRepeatMode);
        }
        int i = this.onAddQueueItem;
        if (i == 1) {
            this.onRemoveQueueItem.setStrokeJoin(Paint.Join.ROUND);
            this.onRemoveQueueItem.setStrokeWidth(this.onFastForward);
            this.onRemoveQueueItem.setColor(this.handleMediaPlayPauseIfPendingOnHandler);
            this.onRemoveQueueItem.setStyle(Paint.Style.FILL_AND_STROKE);
            staticLayout2.draw(canvas);
        } else if (i == 2) {
            TextPaint textPaint = this.onRemoveQueueItem;
            float f = this.onPlayFromUri;
            float f2 = this.onPlayFromSearch;
            textPaint.setShadowLayer(f, f2, f2, this.handleMediaPlayPauseIfPendingOnHandler);
        } else if (i == 3 || i == 4) {
            boolean z = i == 3;
            int i2 = z ? -1 : this.handleMediaPlayPauseIfPendingOnHandler;
            int i3 = z ? this.handleMediaPlayPauseIfPendingOnHandler : -1;
            float f3 = this.onPlayFromUri / 2.0f;
            this.onRemoveQueueItem.setColor(this.onCommand);
            this.onRemoveQueueItem.setStyle(Paint.Style.FILL);
            float f4 = -f3;
            this.onRemoveQueueItem.setShadowLayer(this.onPlayFromUri, f4, f4, i2);
            staticLayout2.draw(canvas);
            this.onRemoveQueueItem.setShadowLayer(this.onPlayFromUri, f3, f3, i3);
        }
        this.onRemoveQueueItem.setColor(this.onCommand);
        this.onRemoveQueueItem.setStyle(Paint.Style.FILL);
        staticLayout.draw(canvas);
        this.onRemoveQueueItem.setShadowLayer(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0);
        canvas.restoreToCount(iSave);
    }

    private void read(Canvas canvas) {
        canvas.drawBitmap(this.read, (Rect) null, this.AudioAttributesCompatParcelizer, this.write);
    }

    private static boolean AudioAttributesCompatParcelizer(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence != charSequence2) {
            return charSequence != null && charSequence.equals(charSequence2);
        }
        return true;
    }
}
