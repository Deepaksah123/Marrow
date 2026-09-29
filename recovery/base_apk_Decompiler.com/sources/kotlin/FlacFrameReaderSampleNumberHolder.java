package kotlin;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes3.dex */
final class FlacFrameReaderSampleNumberHolder {
    static final int AudioAttributesCompatParcelizer = 1;
    private boolean AudioAttributesImplApi21Parcelizer;
    private CharSequence MediaBrowserCompatMediaItem;
    private readFrameBlockSizeSamplesFromKey MediaBrowserCompatSearchResultReceiver;
    private final int MediaMetadataCompat;
    private final TextPaint RatingCompat;
    private int read;
    private int MediaDescriptionCompat = 0;
    private Layout.Alignment write = Layout.Alignment.ALIGN_NORMAL;
    private int MediaBrowserCompatCustomActionResultReceiver = Integer.MAX_VALUE;
    private float AudioAttributesImplBaseParcelizer = BitmapDescriptorFactory.HUE_RED;
    private float AudioAttributesImplApi26Parcelizer = 1.0f;
    private int RemoteActionCompatParcelizer = AudioAttributesCompatParcelizer;
    private boolean MediaBrowserCompatItemReceiver = true;
    private TextUtils.TruncateAt IconCompatParcelizer = null;

    static class read extends Exception {
    }

    private FlacFrameReaderSampleNumberHolder(CharSequence charSequence, TextPaint textPaint, int i) {
        this.MediaBrowserCompatMediaItem = charSequence;
        this.RatingCompat = textPaint;
        this.MediaMetadataCompat = i;
        this.read = charSequence.length();
    }

    public static FlacFrameReaderSampleNumberHolder AudioAttributesCompatParcelizer(CharSequence charSequence, TextPaint textPaint, int i) {
        return new FlacFrameReaderSampleNumberHolder(charSequence, textPaint, i);
    }

    public final FlacFrameReaderSampleNumberHolder AudioAttributesCompatParcelizer(Layout.Alignment alignment) {
        this.write = alignment;
        return this;
    }

    public final FlacFrameReaderSampleNumberHolder AudioAttributesCompatParcelizer() {
        this.MediaBrowserCompatItemReceiver = false;
        return this;
    }

    public final FlacFrameReaderSampleNumberHolder write(int i) {
        this.MediaBrowserCompatCustomActionResultReceiver = i;
        return this;
    }

    public final FlacFrameReaderSampleNumberHolder IconCompatParcelizer(float f, float f2) {
        this.AudioAttributesImplBaseParcelizer = f;
        this.AudioAttributesImplApi26Parcelizer = f2;
        return this;
    }

    public final FlacFrameReaderSampleNumberHolder IconCompatParcelizer(int i) {
        this.RemoteActionCompatParcelizer = i;
        return this;
    }

    public final FlacFrameReaderSampleNumberHolder write(TextUtils.TruncateAt truncateAt) {
        this.IconCompatParcelizer = truncateAt;
        return this;
    }

    public final FlacFrameReaderSampleNumberHolder RemoteActionCompatParcelizer(readFrameBlockSizeSamplesFromKey readframeblocksizesamplesfromkey) {
        this.MediaBrowserCompatSearchResultReceiver = readframeblocksizesamplesfromkey;
        return this;
    }

    public final StaticLayout RemoteActionCompatParcelizer() throws read {
        TextDirectionHeuristic textDirectionHeuristic;
        if (this.MediaBrowserCompatMediaItem == null) {
            this.MediaBrowserCompatMediaItem = "";
        }
        int iMax = Math.max(0, this.MediaMetadataCompat);
        CharSequence charSequenceEllipsize = this.MediaBrowserCompatMediaItem;
        if (this.MediaBrowserCompatCustomActionResultReceiver == 1) {
            charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, this.RatingCompat, iMax, this.IconCompatParcelizer);
        }
        this.read = Math.min(charSequenceEllipsize.length(), this.read);
        if (this.AudioAttributesImplApi21Parcelizer && this.MediaBrowserCompatCustomActionResultReceiver == 1) {
            this.write = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequenceEllipsize, 0, this.read, this.RatingCompat, iMax);
        builderObtain.setAlignment(this.write);
        builderObtain.setIncludePad(this.MediaBrowserCompatItemReceiver);
        if (this.AudioAttributesImplApi21Parcelizer) {
            textDirectionHeuristic = TextDirectionHeuristics.RTL;
        } else {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        }
        builderObtain.setTextDirection(textDirectionHeuristic);
        TextUtils.TruncateAt truncateAt = this.IconCompatParcelizer;
        if (truncateAt != null) {
            builderObtain.setEllipsize(truncateAt);
        }
        builderObtain.setMaxLines(this.MediaBrowserCompatCustomActionResultReceiver);
        float f = this.AudioAttributesImplBaseParcelizer;
        if (f != BitmapDescriptorFactory.HUE_RED || this.AudioAttributesImplApi26Parcelizer != 1.0f) {
            builderObtain.setLineSpacing(f, this.AudioAttributesImplApi26Parcelizer);
        }
        if (this.MediaBrowserCompatCustomActionResultReceiver > 1) {
            builderObtain.setHyphenationFrequency(this.RemoteActionCompatParcelizer);
        }
        return builderObtain.build();
    }

    public final FlacFrameReaderSampleNumberHolder write(boolean z) {
        this.AudioAttributesImplApi21Parcelizer = z;
        return this;
    }
}
