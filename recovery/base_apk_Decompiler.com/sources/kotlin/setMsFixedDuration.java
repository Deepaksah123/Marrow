package kotlin;

import java.util.Iterator;
import kotlin.SampleVideosRSModel;

/* JADX INFO: loaded from: classes4.dex */
public abstract class setMsFixedDuration extends setMsDelay implements FreeVideoListRSModel<LottieRatingBar> {
    LottieRatingBar[] RemoteActionCompatParcelizer;

    static {
        new setScaleType(setMsFixedDuration.class) { // from class: o.setMsFixedDuration.1
            @Override // kotlin.setScaleType
            final setMsDelay AudioAttributesCompatParcelizer(setMsFixedDuration setmsfixedduration) {
                return setmsfixedduration;
            }
        };
    }

    abstract LottieRatingBarBig AudioAttributesImplApi21Parcelizer();

    abstract InteractivePanelTextView AudioAttributesImplBaseParcelizer();

    abstract ResponsiveScrollView MediaBrowserCompatSearchResultReceiver();

    abstract setIsTablet RatingCompat();

    @Override // kotlin.setMsDelay
    final boolean write() {
        return true;
    }

    protected setMsFixedDuration() {
        this.RemoteActionCompatParcelizer = setHtmlLoadListener.IconCompatParcelizer;
    }

    protected setMsFixedDuration(LottieRatingBar lottieRatingBar) {
        if (lottieRatingBar == null) {
            throw new NullPointerException("'element' cannot be null");
        }
        this.RemoteActionCompatParcelizer = new LottieRatingBar[]{lottieRatingBar};
    }

    protected setMsFixedDuration(setHtmlLoadListener sethtmlloadlistener) {
        if (sethtmlloadlistener == null) {
            throw new NullPointerException("'elementVector' cannot be null");
        }
        this.RemoteActionCompatParcelizer = sethtmlloadlistener.AudioAttributesCompatParcelizer();
    }

    setMsFixedDuration(LottieRatingBar[] lottieRatingBarArr, boolean z) {
        this.RemoteActionCompatParcelizer = lottieRatingBarArr;
    }

    @Override // kotlin.setMsDelay
    final boolean IconCompatParcelizer(setMsDelay setmsdelay) {
        if (!(setmsdelay instanceof setMsFixedDuration)) {
            return false;
        }
        setMsFixedDuration setmsfixedduration = (setMsFixedDuration) setmsdelay;
        int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
        if (setmsfixedduration.RemoteActionCompatParcelizer() != iRemoteActionCompatParcelizer) {
            return false;
        }
        for (int i = 0; i < iRemoteActionCompatParcelizer; i++) {
            setMsDelay setmsdelayAudioAttributesImplApi26Parcelizer = this.RemoteActionCompatParcelizer[i].AudioAttributesImplApi26Parcelizer();
            setMsDelay setmsdelayAudioAttributesImplApi26Parcelizer2 = setmsfixedduration.RemoteActionCompatParcelizer[i].AudioAttributesImplApi26Parcelizer();
            if (setmsdelayAudioAttributesImplApi26Parcelizer != setmsdelayAudioAttributesImplApi26Parcelizer2 && !setmsdelayAudioAttributesImplApi26Parcelizer.IconCompatParcelizer(setmsdelayAudioAttributesImplApi26Parcelizer2)) {
                return false;
            }
        }
        return true;
    }

    final InteractivePanelTextView[] read() {
        int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
        InteractivePanelTextView[] interactivePanelTextViewArr = new InteractivePanelTextView[iRemoteActionCompatParcelizer];
        for (int i = 0; i < iRemoteActionCompatParcelizer; i++) {
            interactivePanelTextViewArr[i] = InteractivePanelTextView.write(this.RemoteActionCompatParcelizer[i]);
        }
        return interactivePanelTextViewArr;
    }

    final setIsTablet[] AudioAttributesCompatParcelizer() {
        int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
        setIsTablet[] setistabletArr = new setIsTablet[iRemoteActionCompatParcelizer];
        for (int i = 0; i < iRemoteActionCompatParcelizer; i++) {
            setistabletArr[i] = setIsTablet.AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer[i]);
        }
        return setistabletArr;
    }

    public LottieRatingBar IconCompatParcelizer(int i) {
        return this.RemoteActionCompatParcelizer[i];
    }

    @Override // kotlin.setBlinkerTexts
    public int hashCode() {
        int length = this.RemoteActionCompatParcelizer.length;
        int iHashCode = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return iHashCode;
            }
            iHashCode = (iHashCode * 257) ^ this.RemoteActionCompatParcelizer[length].AudioAttributesImplApi26Parcelizer().hashCode();
        }
    }

    public Iterator<LottieRatingBar> iterator() {
        return new SampleVideosRSModel.IconCompatParcelizer(this.RemoteActionCompatParcelizer);
    }

    public int RemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer.length;
    }

    LottieRatingBar[] MediaDescriptionCompat() {
        return this.RemoteActionCompatParcelizer;
    }

    @Override // kotlin.setMsDelay
    setMsDelay IconCompatParcelizer() {
        return new setCode(this.RemoteActionCompatParcelizer);
    }

    @Override // kotlin.setMsDelay
    setMsDelay MediaBrowserCompatItemReceiver() {
        return new getCourse_id(this.RemoteActionCompatParcelizer);
    }

    public String toString() {
        int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
        if (iRemoteActionCompatParcelizer == 0) {
            return ThemeAlphaConstantsKt.PATH_SEGMENT_ENCODE_SET_URI;
        }
        StringBuffer stringBuffer = new StringBuffer("[");
        int i = 0;
        while (true) {
            stringBuffer.append(this.RemoteActionCompatParcelizer[i]);
            i++;
            if (i >= iRemoteActionCompatParcelizer) {
                stringBuffer.append(']');
                return stringBuffer.toString();
            }
            stringBuffer.append(", ");
        }
    }
}
