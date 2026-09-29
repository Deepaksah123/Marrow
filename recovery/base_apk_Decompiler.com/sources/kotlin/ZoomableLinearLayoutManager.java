package kotlin;

import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ZoomableLinearLayoutManager extends setMsDelay implements ZoomageView {
    final int AudioAttributesCompatParcelizer;
    private int RemoteActionCompatParcelizer;
    final int read;
    final LottieRatingBar write;

    ZoomableLinearLayoutManager(int i, int i2, int i3, LottieRatingBar lottieRatingBar) {
        if (lottieRatingBar == null) {
            throw new NullPointerException("'obj' cannot be null");
        }
        if (i2 == 0 || (i2 & PsExtractor.AUDIO_STREAM) != i2) {
            throw new IllegalArgumentException("invalid tag class: ".concat(String.valueOf(i2)));
        }
        this.RemoteActionCompatParcelizer = lottieRatingBar instanceof InteractivePanelIconView ? 1 : i;
        this.AudioAttributesCompatParcelizer = i2;
        this.read = i3;
        this.write = lottieRatingBar;
    }

    @Override // kotlin.toResetBookmarkRepoModel
    public final setMsDelay AudioAttributesCompatParcelizer() {
        return this;
    }

    abstract setMsFixedDuration write(setMsDelay setmsdelay);

    private ZoomableLinearLayoutManager(boolean z, int i, LottieRatingBar lottieRatingBar, byte b) {
        this(z ? 1 : 2, 128, i, lottieRatingBar);
    }

    protected ZoomableLinearLayoutManager(boolean z, int i, LottieRatingBar lottieRatingBar) {
        this(z, i, lottieRatingBar, (byte) 0);
    }

    static setMsDelay RemoteActionCompatParcelizer(int i, int i2, setHtmlLoadListener sethtmlloadlistener) {
        return sethtmlloadlistener.RemoteActionCompatParcelizer() == 1 ? new setCourse_id(3, i, i2, sethtmlloadlistener.read(0)) : new setCourse_id(4, i, i2, setVideoAnalyticPublisher.read(sethtmlloadlistener));
    }

    static setMsDelay read(int i, int i2, setHtmlLoadListener sethtmlloadlistener) {
        return sethtmlloadlistener.RemoteActionCompatParcelizer() == 1 ? new isRetryRequired(3, i, i2, sethtmlloadlistener.read(0)) : new isRetryRequired(4, i, i2, setTranslatable.AudioAttributesCompatParcelizer(sethtmlloadlistener));
    }

    static setMsDelay write(int i, int i2, byte[] bArr) {
        return new setCourse_id(4, i, i2, new EmptyBody(bArr));
    }

    @Override // kotlin.setMsDelay
    final boolean IconCompatParcelizer(setMsDelay setmsdelay) {
        if (!(setmsdelay instanceof ZoomableLinearLayoutManager)) {
            return false;
        }
        ZoomableLinearLayoutManager zoomableLinearLayoutManager = (ZoomableLinearLayoutManager) setmsdelay;
        if (this.read != zoomableLinearLayoutManager.read || this.AudioAttributesCompatParcelizer != zoomableLinearLayoutManager.AudioAttributesCompatParcelizer) {
            return false;
        }
        if (this.RemoteActionCompatParcelizer != zoomableLinearLayoutManager.RemoteActionCompatParcelizer && MediaDescriptionCompat() != zoomableLinearLayoutManager.MediaDescriptionCompat()) {
            return false;
        }
        setMsDelay setmsdelayAudioAttributesImplApi26Parcelizer = this.write.AudioAttributesImplApi26Parcelizer();
        setMsDelay setmsdelayAudioAttributesImplApi26Parcelizer2 = zoomableLinearLayoutManager.write.AudioAttributesImplApi26Parcelizer();
        if (setmsdelayAudioAttributesImplApi26Parcelizer == setmsdelayAudioAttributesImplApi26Parcelizer2) {
            return true;
        }
        if (MediaDescriptionCompat()) {
            return setmsdelayAudioAttributesImplApi26Parcelizer.IconCompatParcelizer(setmsdelayAudioAttributesImplApi26Parcelizer2);
        }
        try {
            return SampleVideosRSModel.write(MediaBrowserCompatCustomActionResultReceiver(), zoomableLinearLayoutManager.MediaBrowserCompatCustomActionResultReceiver());
        } catch (IOException unused) {
            return false;
        }
    }

    public final setBlinkerTexts read() {
        LottieRatingBar lottieRatingBar = this.write;
        return lottieRatingBar instanceof setBlinkerTexts ? (setBlinkerTexts) lottieRatingBar : lottieRatingBar.AudioAttributesImplApi26Parcelizer();
    }

    final setMsDelay RemoteActionCompatParcelizer(boolean z, setScaleType setscaletype) {
        if (z) {
            if (MediaDescriptionCompat()) {
                return setscaletype.AudioAttributesCompatParcelizer(this.write.AudioAttributesImplApi26Parcelizer());
            }
            throw new IllegalStateException("object explicit - implicit expected.");
        }
        if (1 == this.RemoteActionCompatParcelizer) {
            throw new IllegalStateException("object explicit - implicit expected.");
        }
        setMsDelay setmsdelayAudioAttributesImplApi26Parcelizer = this.write.AudioAttributesImplApi26Parcelizer();
        int i = this.RemoteActionCompatParcelizer;
        return i != 3 ? i != 4 ? setscaletype.AudioAttributesCompatParcelizer(setmsdelayAudioAttributesImplApi26Parcelizer) : setmsdelayAudioAttributesImplApi26Parcelizer instanceof setMsFixedDuration ? setscaletype.AudioAttributesCompatParcelizer((setMsFixedDuration) setmsdelayAudioAttributesImplApi26Parcelizer) : setscaletype.read((EmptyBody) setmsdelayAudioAttributesImplApi26Parcelizer) : setscaletype.AudioAttributesCompatParcelizer(write(setmsdelayAudioAttributesImplApi26Parcelizer));
    }

    public final setBlinkerTexts RemoteActionCompatParcelizer() {
        if (!MediaDescriptionCompat()) {
            throw new IllegalStateException("object implicit - explicit expected.");
        }
        LottieRatingBar lottieRatingBar = this.write;
        return lottieRatingBar instanceof setBlinkerTexts ? (setBlinkerTexts) lottieRatingBar : lottieRatingBar.AudioAttributesImplApi26Parcelizer();
    }

    public final int AudioAttributesImplApi21Parcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final int AudioAttributesImplBaseParcelizer() {
        return this.read;
    }

    public final boolean IconCompatParcelizer(int i) {
        return this.AudioAttributesCompatParcelizer == 128;
    }

    @Override // kotlin.setBlinkerTexts
    public int hashCode() {
        int i = this.AudioAttributesCompatParcelizer;
        return this.write.AudioAttributesImplApi26Parcelizer().hashCode() ^ (((i * 7919) ^ this.read) ^ (MediaDescriptionCompat() ? 15 : PsExtractor.VIDEO_STREAM_MASK));
    }

    public final boolean MediaDescriptionCompat() {
        int i = this.RemoteActionCompatParcelizer;
        return i == 1 || i == 3;
    }

    @Override // kotlin.setMsDelay
    setMsDelay IconCompatParcelizer() {
        return new getVideoAnalyticPublisher(this.RemoteActionCompatParcelizer, this.AudioAttributesCompatParcelizer, this.read, this.write);
    }

    @Override // kotlin.setMsDelay
    setMsDelay MediaBrowserCompatItemReceiver() {
        return new setCourse_id(this.RemoteActionCompatParcelizer, this.AudioAttributesCompatParcelizer, this.read, this.write);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(isTranslatable.IconCompatParcelizer(this.AudioAttributesCompatParcelizer, this.read));
        sb.append(this.write);
        return sb.toString();
    }
}
