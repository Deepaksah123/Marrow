package kotlin;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.SampleVideosRSModel;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ResponsiveScrollView extends setMsDelay implements FreeVideoListRSModel<LottieRatingBar> {
    protected LottieRatingBar[] RemoteActionCompatParcelizer;
    protected final LottieRatingBar[] read;

    static {
        new setScaleType(ResponsiveScrollView.class) { // from class: o.ResponsiveScrollView.3
            @Override // kotlin.setScaleType
            final setMsDelay AudioAttributesCompatParcelizer(setMsFixedDuration setmsfixedduration) {
                return setmsfixedduration.MediaBrowserCompatSearchResultReceiver();
            }
        };
    }

    @Override // kotlin.setMsDelay
    final boolean write() {
        return true;
    }

    protected ResponsiveScrollView() {
        LottieRatingBar[] lottieRatingBarArr = setHtmlLoadListener.IconCompatParcelizer;
        this.read = lottieRatingBarArr;
        this.RemoteActionCompatParcelizer = lottieRatingBarArr;
    }

    protected ResponsiveScrollView(setHtmlLoadListener sethtmlloadlistener) {
        if (sethtmlloadlistener == null) {
            throw new NullPointerException("'elementVector' cannot be null");
        }
        LottieRatingBar[] lottieRatingBarArrAudioAttributesCompatParcelizer = sethtmlloadlistener.AudioAttributesCompatParcelizer();
        this.read = lottieRatingBarArrAudioAttributesCompatParcelizer;
        this.RemoteActionCompatParcelizer = lottieRatingBarArrAudioAttributesCompatParcelizer.length >= 2 ? null : lottieRatingBarArrAudioAttributesCompatParcelizer;
    }

    ResponsiveScrollView(boolean z, LottieRatingBar[] lottieRatingBarArr) {
        this.read = lottieRatingBarArr;
        if (!z && lottieRatingBarArr.length >= 2) {
            lottieRatingBarArr = null;
        }
        this.RemoteActionCompatParcelizer = lottieRatingBarArr;
    }

    ResponsiveScrollView(LottieRatingBar[] lottieRatingBarArr, LottieRatingBar[] lottieRatingBarArr2) {
        this.read = lottieRatingBarArr;
        this.RemoteActionCompatParcelizer = lottieRatingBarArr2;
    }

    private static byte[] write(LottieRatingBar lottieRatingBar) {
        try {
            return lottieRatingBar.AudioAttributesImplApi26Parcelizer().write("DER");
        } catch (IOException unused) {
            throw new IllegalArgumentException("cannot encode object added to SET");
        }
    }

    private static boolean RemoteActionCompatParcelizer(byte[] bArr, byte[] bArr2) {
        int i = bArr[0] & 223;
        int i2 = bArr2[0] & 223;
        if (i != i2) {
            return i < i2;
        }
        int iMin = Math.min(bArr.length, bArr2.length) - 1;
        for (int i3 = 1; i3 < iMin; i3++) {
            byte b = bArr[i3];
            byte b2 = bArr2[i3];
            if (b != b2) {
                return (b & 255) < (b2 & 255);
            }
        }
        return (bArr[iMin] & 255) <= (bArr2[iMin] & 255);
    }

    private static void IconCompatParcelizer(LottieRatingBar[] lottieRatingBarArr) {
        int i;
        int length = lottieRatingBarArr.length;
        if (length < 2) {
            return;
        }
        LottieRatingBar lottieRatingBar = lottieRatingBarArr[0];
        LottieRatingBar lottieRatingBar2 = lottieRatingBarArr[1];
        byte[] bArrWrite = write(lottieRatingBar);
        byte[] bArrWrite2 = write(lottieRatingBar2);
        if (RemoteActionCompatParcelizer(bArrWrite2, bArrWrite)) {
            lottieRatingBar2 = lottieRatingBar;
            lottieRatingBar = lottieRatingBar2;
        } else {
            bArrWrite2 = bArrWrite;
            bArrWrite = bArrWrite2;
        }
        for (int i2 = 2; i2 < length; i2++) {
            LottieRatingBar lottieRatingBar3 = lottieRatingBarArr[i2];
            byte[] bArrWrite3 = write(lottieRatingBar3);
            if (RemoteActionCompatParcelizer(bArrWrite, bArrWrite3)) {
                lottieRatingBarArr[i2 - 2] = lottieRatingBar;
                lottieRatingBar = lottieRatingBar2;
                bArrWrite2 = bArrWrite;
                lottieRatingBar2 = lottieRatingBar3;
                bArrWrite = bArrWrite3;
            } else if (RemoteActionCompatParcelizer(bArrWrite2, bArrWrite3)) {
                lottieRatingBarArr[i2 - 2] = lottieRatingBar;
                lottieRatingBar = lottieRatingBar3;
                bArrWrite2 = bArrWrite3;
            } else {
                int i3 = i2 - 1;
                while (true) {
                    i = i3 - 1;
                    if (i <= 0) {
                        break;
                    }
                    LottieRatingBar lottieRatingBar4 = lottieRatingBarArr[i3 - 2];
                    if (RemoteActionCompatParcelizer(write(lottieRatingBar4), bArrWrite3)) {
                        break;
                    }
                    lottieRatingBarArr[i] = lottieRatingBar4;
                    i3 = i;
                }
                lottieRatingBarArr[i] = lottieRatingBar3;
            }
        }
        lottieRatingBarArr[length - 2] = lottieRatingBar;
        lottieRatingBarArr[length - 1] = lottieRatingBar2;
    }

    @Override // kotlin.setMsDelay
    final boolean IconCompatParcelizer(setMsDelay setmsdelay) {
        if (!(setmsdelay instanceof ResponsiveScrollView)) {
            return false;
        }
        ResponsiveScrollView responsiveScrollView = (ResponsiveScrollView) setmsdelay;
        int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
        if (responsiveScrollView.RemoteActionCompatParcelizer() != iRemoteActionCompatParcelizer) {
            return false;
        }
        setErrorMessage seterrormessage = (setErrorMessage) IconCompatParcelizer();
        setErrorMessage seterrormessage2 = (setErrorMessage) responsiveScrollView.IconCompatParcelizer();
        for (int i = 0; i < iRemoteActionCompatParcelizer; i++) {
            setMsDelay setmsdelayAudioAttributesImplApi26Parcelizer = seterrormessage.read[i].AudioAttributesImplApi26Parcelizer();
            setMsDelay setmsdelayAudioAttributesImplApi26Parcelizer2 = seterrormessage2.read[i].AudioAttributesImplApi26Parcelizer();
            if (setmsdelayAudioAttributesImplApi26Parcelizer != setmsdelayAudioAttributesImplApi26Parcelizer2 && !setmsdelayAudioAttributesImplApi26Parcelizer.IconCompatParcelizer(setmsdelayAudioAttributesImplApi26Parcelizer2)) {
                return false;
            }
        }
        return true;
    }

    public final Enumeration read() {
        return new Enumeration() { // from class: o.ResponsiveScrollView.5
            private int IconCompatParcelizer = 0;

            @Override // java.util.Enumeration
            public final boolean hasMoreElements() {
                return this.IconCompatParcelizer < ResponsiveScrollView.this.read.length;
            }

            @Override // java.util.Enumeration
            public final Object nextElement() {
                if (this.IconCompatParcelizer >= ResponsiveScrollView.this.read.length) {
                    throw new NoSuchElementException();
                }
                LottieRatingBar[] lottieRatingBarArr = ResponsiveScrollView.this.read;
                int i = this.IconCompatParcelizer;
                this.IconCompatParcelizer = i + 1;
                return lottieRatingBarArr[i];
            }
        };
    }

    @Override // kotlin.setBlinkerTexts
    public int hashCode() {
        int length = this.read.length;
        int iHashCode = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return iHashCode;
            }
            iHashCode += this.read[length].AudioAttributesImplApi26Parcelizer().hashCode();
        }
    }

    @Override // java.lang.Iterable
    public Iterator<LottieRatingBar> iterator() {
        return new SampleVideosRSModel.IconCompatParcelizer(AudioAttributesCompatParcelizer());
    }

    private int RemoteActionCompatParcelizer() {
        return this.read.length;
    }

    private LottieRatingBar[] AudioAttributesCompatParcelizer() {
        return setHtmlLoadListener.write(this.read);
    }

    @Override // kotlin.setMsDelay
    setMsDelay IconCompatParcelizer() {
        if (this.RemoteActionCompatParcelizer == null) {
            LottieRatingBar[] lottieRatingBarArr = (LottieRatingBar[]) this.read.clone();
            this.RemoteActionCompatParcelizer = lottieRatingBarArr;
            IconCompatParcelizer(lottieRatingBarArr);
        }
        return new setErrorMessage(this.RemoteActionCompatParcelizer);
    }

    @Override // kotlin.setMsDelay
    setMsDelay MediaBrowserCompatItemReceiver() {
        return new McqBookmarkResponseBody(this.read, this.RemoteActionCompatParcelizer);
    }

    public String toString() {
        int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
        if (iRemoteActionCompatParcelizer == 0) {
            return ThemeAlphaConstantsKt.PATH_SEGMENT_ENCODE_SET_URI;
        }
        StringBuffer stringBuffer = new StringBuffer("[");
        int i = 0;
        while (true) {
            stringBuffer.append(this.read[i]);
            i++;
            if (i >= iRemoteActionCompatParcelizer) {
                stringBuffer.append(']');
                return stringBuffer.toString();
            }
            stringBuffer.append(", ");
        }
    }
}
