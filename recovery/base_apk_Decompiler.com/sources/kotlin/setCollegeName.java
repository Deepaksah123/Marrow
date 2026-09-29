package kotlin;

import java.util.concurrent.CancellationException;
import kotlin.C0177getRfBanners;

/* JADX INFO: loaded from: classes4.dex */
public abstract class setCollegeName<T> extends getDownloadCount {
    public int RemoteActionCompatParcelizer;

    public abstract Object AudioAttributesImplApi26Parcelizer();

    /* JADX WARN: Multi-variable type inference failed */
    public <T> T IconCompatParcelizer(Object obj) {
        return obj;
    }

    public void IconCompatParcelizer(Throwable th) {
    }

    public abstract SampleVideos<T> write();

    public setCollegeName(int i) {
        this.RemoteActionCompatParcelizer = i;
    }

    public Throwable read(Object obj) {
        setUserSubmittedTimestampMs setusersubmittedtimestampms = obj instanceof setUserSubmittedTimestampMs ? (setUserSubmittedTimestampMs) obj : null;
        if (setusersubmittedtimestampms != null) {
            return setusersubmittedtimestampms.RemoteActionCompatParcelizer;
        }
        return null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        CancellationException cancellationException;
        getCollegeId.write();
        try {
            SampleVideos<T> sampleVideosWrite = write();
            toMagicModuleMetaRepoModel.read(sampleVideosWrite, "");
            setInternetConnected setinternetconnected = (setInternetConnected) sampleVideosWrite;
            SampleVideos<T> sampleVideos = setinternetconnected.read;
            Object obj = setinternetconnected.IconCompatParcelizer;
            CurrentQuery context = sampleVideos.getWrite();
            Object objRemoteActionCompatParcelizer = getBufferMultiplier.RemoteActionCompatParcelizer(context, obj);
            setPassingYear setpassingyear = null;
            NestfgetmNationalNumber<?> nestfgetmNationalNumber = objRemoteActionCompatParcelizer != getBufferMultiplier.read ? TestStat.read(sampleVideos, context, objRemoteActionCompatParcelizer) : null;
            try {
                CurrentQuery context2 = sampleVideos.getWrite();
                Object objAudioAttributesImplApi26Parcelizer = AudioAttributesImplApi26Parcelizer();
                Throwable th = read(objAudioAttributesImplApi26Parcelizer);
                if (th == null && isUserCollegeDataAvailable.IconCompatParcelizer(this.RemoteActionCompatParcelizer)) {
                    setpassingyear = (setPassingYear) context2.get(setPassingYear.b_);
                }
                if (setpassingyear != null && !setpassingyear.read()) {
                    CancellationException cancellationExceptionMediaBrowserCompatItemReceiver = setpassingyear.MediaBrowserCompatItemReceiver();
                    IconCompatParcelizer((Throwable) cancellationExceptionMediaBrowserCompatItemReceiver);
                    C0177getRfBanners.IconCompatParcelizer iconCompatParcelizer = C0177getRfBanners.IconCompatParcelizer;
                    if (getCollegeId.RemoteActionCompatParcelizer() && (sampleVideos instanceof getNextQuery)) {
                        cancellationException = accessgetVideoConfigurationC0cp.read(cancellationExceptionMediaBrowserCompatItemReceiver, (getNextQuery) sampleVideos);
                    } else {
                        cancellationException = cancellationExceptionMediaBrowserCompatItemReceiver;
                    }
                    sampleVideos.resumeWith(C0177getRfBanners.read(SdkPayloadData.write(cancellationException)));
                } else if (th != null) {
                    C0177getRfBanners.IconCompatParcelizer iconCompatParcelizer2 = C0177getRfBanners.IconCompatParcelizer;
                    sampleVideos.resumeWith(C0177getRfBanners.read(SdkPayloadData.write(th)));
                } else {
                    C0177getRfBanners.IconCompatParcelizer iconCompatParcelizer3 = C0177getRfBanners.IconCompatParcelizer;
                    sampleVideos.resumeWith(C0177getRfBanners.read(IconCompatParcelizer(objAudioAttributesImplApi26Parcelizer)));
                }
                getShowPopup getshowpopup = getShowPopup.INSTANCE;
                if (nestfgetmNationalNumber != null && !nestfgetmNationalNumber.AudioAttributesImplApi26Parcelizer()) {
                    return;
                }
                getBufferMultiplier.AudioAttributesCompatParcelizer(context, objRemoteActionCompatParcelizer);
            } catch (Throwable th2) {
                if (nestfgetmNationalNumber == null || nestfgetmNationalNumber.AudioAttributesImplApi26Parcelizer()) {
                    getBufferMultiplier.AudioAttributesCompatParcelizer(context, objRemoteActionCompatParcelizer);
                }
                throw th2;
            }
        } catch (Throwable th3) {
            RemoteActionCompatParcelizer(th3);
        }
    }

    public final void RemoteActionCompatParcelizer(Throwable th) {
        StringBuilder sb = new StringBuilder("Fatal exception in coroutines machinery for ");
        sb.append(this);
        sb.append(". Please read KDoc to 'handleFatalException' method and report this incident to maintainers");
        YearItem.read(write().getWrite(), new getCountry(sb.toString(), th));
    }
}
