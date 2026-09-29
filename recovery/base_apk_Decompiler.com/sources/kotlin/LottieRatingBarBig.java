package kotlin;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public abstract class LottieRatingBarBig extends setMsDelay {
    int AudioAttributesCompatParcelizer;
    getPairOfTimeAndIndex IconCompatParcelizer;
    setMsDelay RemoteActionCompatParcelizer;
    setMsDelay read;
    setMinimumHeightMargin write;

    static {
        new setScaleType(LottieRatingBarBig.class) { // from class: o.LottieRatingBarBig.1
            @Override // kotlin.setScaleType
            final setMsDelay AudioAttributesCompatParcelizer(setMsFixedDuration setmsfixedduration) {
                return setmsfixedduration.AudioAttributesImplApi21Parcelizer();
            }
        };
    }

    abstract setMsFixedDuration RemoteActionCompatParcelizer();

    @Override // kotlin.setMsDelay
    final boolean write() {
        return true;
    }

    LottieRatingBarBig(setMinimumHeightMargin setminimumheightmargin, getPairOfTimeAndIndex getpairoftimeandindex, setMsDelay setmsdelay, int i, setMsDelay setmsdelay2) {
        this.write = setminimumheightmargin;
        this.IconCompatParcelizer = getpairoftimeandindex;
        this.RemoteActionCompatParcelizer = setmsdelay;
        this.AudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(i);
        this.read = RemoteActionCompatParcelizer(i, setmsdelay2);
    }

    LottieRatingBarBig(setMsFixedDuration setmsfixedduration) {
        int i = 0;
        setMsDelay setmsdelayIconCompatParcelizer = IconCompatParcelizer(setmsfixedduration, 0);
        if (setmsdelayIconCompatParcelizer instanceof setMinimumHeightMargin) {
            this.write = (setMinimumHeightMargin) setmsdelayIconCompatParcelizer;
            setmsdelayIconCompatParcelizer = IconCompatParcelizer(setmsfixedduration, 1);
            i = 1;
        }
        if (setmsdelayIconCompatParcelizer instanceof getPairOfTimeAndIndex) {
            this.IconCompatParcelizer = (getPairOfTimeAndIndex) setmsdelayIconCompatParcelizer;
            i++;
            setmsdelayIconCompatParcelizer = IconCompatParcelizer(setmsfixedduration, i);
        }
        if (!(setmsdelayIconCompatParcelizer instanceof ZoomableLinearLayoutManager)) {
            this.RemoteActionCompatParcelizer = setmsdelayIconCompatParcelizer;
            i++;
            setmsdelayIconCompatParcelizer = IconCompatParcelizer(setmsfixedduration, i);
        }
        if (setmsfixedduration.RemoteActionCompatParcelizer() != i + 1) {
            throw new IllegalArgumentException("input sequence too large");
        }
        if (!(setmsdelayIconCompatParcelizer instanceof ZoomableLinearLayoutManager)) {
            throw new IllegalArgumentException("No tagged object found in sequence. Structure doesn't seem to be of type External");
        }
        ZoomableLinearLayoutManager zoomableLinearLayoutManager = (ZoomableLinearLayoutManager) setmsdelayIconCompatParcelizer;
        this.AudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(zoomableLinearLayoutManager.AudioAttributesImplBaseParcelizer());
        this.read = RemoteActionCompatParcelizer(zoomableLinearLayoutManager);
    }

    private static int AudioAttributesCompatParcelizer(int i) {
        if (i < 0 || i > 2) {
            throw new IllegalArgumentException("invalid encoding value: ".concat(String.valueOf(i)));
        }
        return i;
    }

    private static setMsDelay RemoteActionCompatParcelizer(int i, setMsDelay setmsdelay) {
        setScaleType setscaletype;
        if (i == 1) {
            setscaletype = setIsTablet.IconCompatParcelizer;
        } else {
            if (i != 2) {
                return setmsdelay;
            }
            setscaletype = InteractivePanelTextView.read;
        }
        return setscaletype.AudioAttributesCompatParcelizer(setmsdelay);
    }

    private static setMsDelay RemoteActionCompatParcelizer(ZoomableLinearLayoutManager zoomableLinearLayoutManager) {
        isTranslatable.AudioAttributesCompatParcelizer(zoomableLinearLayoutManager);
        int iAudioAttributesImplBaseParcelizer = zoomableLinearLayoutManager.AudioAttributesImplBaseParcelizer();
        if (iAudioAttributesImplBaseParcelizer == 0) {
            return zoomableLinearLayoutManager.RemoteActionCompatParcelizer().AudioAttributesImplApi26Parcelizer();
        }
        if (iAudioAttributesImplBaseParcelizer == 1) {
            return setIsTablet.write(zoomableLinearLayoutManager);
        }
        if (iAudioAttributesImplBaseParcelizer == 2) {
            return InteractivePanelTextView.AudioAttributesCompatParcelizer(zoomableLinearLayoutManager);
        }
        StringBuilder sb = new StringBuilder("invalid tag: ");
        sb.append(isTranslatable.read(zoomableLinearLayoutManager));
        throw new IllegalArgumentException(sb.toString());
    }

    private static setMsDelay IconCompatParcelizer(setMsFixedDuration setmsfixedduration, int i) {
        if (setmsfixedduration.RemoteActionCompatParcelizer() > i) {
            return setmsfixedduration.IconCompatParcelizer(i).AudioAttributesImplApi26Parcelizer();
        }
        throw new IllegalArgumentException("too few objects in input sequence");
    }

    @Override // kotlin.setMsDelay
    final boolean IconCompatParcelizer(setMsDelay setmsdelay) {
        if (this == setmsdelay) {
            return true;
        }
        if (!(setmsdelay instanceof LottieRatingBarBig)) {
            return false;
        }
        LottieRatingBarBig lottieRatingBarBig = (LottieRatingBarBig) setmsdelay;
        return SampleLessonRSModel.write(this.write, lottieRatingBarBig.write) && SampleLessonRSModel.write(this.IconCompatParcelizer, lottieRatingBarBig.IconCompatParcelizer) && SampleLessonRSModel.write(this.RemoteActionCompatParcelizer, lottieRatingBarBig.RemoteActionCompatParcelizer) && this.AudioAttributesCompatParcelizer == lottieRatingBarBig.AudioAttributesCompatParcelizer && this.read.AudioAttributesCompatParcelizer(lottieRatingBarBig.read);
    }

    @Override // kotlin.setMsDelay
    final void RemoteActionCompatParcelizer(setMinimumWidthMargin setminimumwidthmargin, boolean z) throws IOException {
        setminimumwidthmargin.write(z, 40);
        RemoteActionCompatParcelizer().RemoteActionCompatParcelizer(setminimumwidthmargin, false);
    }

    @Override // kotlin.setMsDelay
    final int write(boolean z) throws IOException {
        return RemoteActionCompatParcelizer().write(z);
    }

    @Override // kotlin.setBlinkerTexts
    public int hashCode() {
        int i = SampleLessonRSModel.read(this.write);
        int i2 = SampleLessonRSModel.read(this.IconCompatParcelizer);
        int i3 = SampleLessonRSModel.read(this.RemoteActionCompatParcelizer);
        return this.read.hashCode() ^ (((i ^ i2) ^ i3) ^ this.AudioAttributesCompatParcelizer);
    }

    @Override // kotlin.setMsDelay
    setMsDelay IconCompatParcelizer() {
        return new TemporarySessionResponseBody(this.write, this.IconCompatParcelizer, this.RemoteActionCompatParcelizer, this.AudioAttributesCompatParcelizer, this.read);
    }

    @Override // kotlin.setMsDelay
    setMsDelay MediaBrowserCompatItemReceiver() {
        return new getEventBus(this.write, this.IconCompatParcelizer, this.RemoteActionCompatParcelizer, this.AudioAttributesCompatParcelizer, this.read);
    }
}
