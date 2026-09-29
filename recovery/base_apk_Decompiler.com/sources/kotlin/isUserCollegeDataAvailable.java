package kotlin;

import kotlin.C0177getRfBanners;

/* JADX INFO: loaded from: classes4.dex */
public final class isUserCollegeDataAvailable {
    public static final boolean AudioAttributesCompatParcelizer(int i) {
        return i == 2;
    }

    public static final boolean IconCompatParcelizer(int i) {
        return i == 1 || i == 2;
    }

    public static final <T> void IconCompatParcelizer(setCollegeName<? super T> setcollegename, int i) {
        getCollegeId.write();
        SampleVideos<? super T> sampleVideosWrite = setcollegename.write();
        boolean z = i == 4;
        if (!z && (sampleVideosWrite instanceof setInternetConnected) && IconCompatParcelizer(i) == IconCompatParcelizer(setcollegename.RemoteActionCompatParcelizer)) {
            setInternetConnected setinternetconnected = (setInternetConnected) sampleVideosWrite;
            getPlatform getplatform = setinternetconnected.AudioAttributesCompatParcelizer;
            CurrentQuery audioAttributesImplApi26Parcelizer = setinternetconnected.getWrite();
            if (getplatform.IconCompatParcelizer(audioAttributesImplApi26Parcelizer)) {
                getplatform.RemoteActionCompatParcelizer(audioAttributesImplApi26Parcelizer, setcollegename);
                return;
            } else {
                IconCompatParcelizer(setcollegename);
                return;
            }
        }
        AudioAttributesCompatParcelizer(setcollegename, sampleVideosWrite, z);
    }

    private static <T> void AudioAttributesCompatParcelizer(setCollegeName<? super T> setcollegename, SampleVideos<? super T> sampleVideos, boolean z) {
        Object objIconCompatParcelizer;
        Object objAudioAttributesImplApi26Parcelizer = setcollegename.AudioAttributesImplApi26Parcelizer();
        Throwable th = setcollegename.read(objAudioAttributesImplApi26Parcelizer);
        if (th != null) {
            C0177getRfBanners.IconCompatParcelizer iconCompatParcelizer = C0177getRfBanners.IconCompatParcelizer;
            objIconCompatParcelizer = SdkPayloadData.write(th);
        } else {
            C0177getRfBanners.IconCompatParcelizer iconCompatParcelizer2 = C0177getRfBanners.IconCompatParcelizer;
            objIconCompatParcelizer = setcollegename.IconCompatParcelizer(objAudioAttributesImplApi26Parcelizer);
        }
        Object obj = C0177getRfBanners.read(objIconCompatParcelizer);
        if (z) {
            toMagicModuleMetaRepoModel.read(sampleVideos, "");
            setInternetConnected setinternetconnected = (setInternetConnected) sampleVideos;
            SampleVideos<T> sampleVideos2 = setinternetconnected.read;
            Object obj2 = setinternetconnected.IconCompatParcelizer;
            CurrentQuery audioAttributesImplApi26Parcelizer = sampleVideos2.getWrite();
            Object objRemoteActionCompatParcelizer = getBufferMultiplier.RemoteActionCompatParcelizer(audioAttributesImplApi26Parcelizer, obj2);
            NestfgetmNationalNumber<?> nestfgetmNationalNumber = objRemoteActionCompatParcelizer != getBufferMultiplier.read ? TestStat.read(sampleVideos2, audioAttributesImplApi26Parcelizer, objRemoteActionCompatParcelizer) : null;
            try {
                setinternetconnected.read.resumeWith(obj);
                getShowPopup getshowpopup = getShowPopup.INSTANCE;
                if (nestfgetmNationalNumber == null || nestfgetmNationalNumber.AudioAttributesImplApi26Parcelizer()) {
                    getBufferMultiplier.AudioAttributesCompatParcelizer(audioAttributesImplApi26Parcelizer, objRemoteActionCompatParcelizer);
                    return;
                }
                return;
            } catch (Throwable th2) {
                if (nestfgetmNationalNumber == null || nestfgetmNationalNumber.AudioAttributesImplApi26Parcelizer()) {
                    getBufferMultiplier.AudioAttributesCompatParcelizer(audioAttributesImplApi26Parcelizer, objRemoteActionCompatParcelizer);
                }
                throw th2;
            }
        }
        sampleVideos.resumeWith(obj);
    }

    private static final void IconCompatParcelizer(setCollegeName<?> setcollegename) {
        getAddLine2 getaddline2 = getAddLine2.RemoteActionCompatParcelizer;
        CollegeJsonParser collegeJsonParser = getAddLine2.read();
        if (collegeJsonParser.read()) {
            collegeJsonParser.RemoteActionCompatParcelizer(setcollegename);
            return;
        }
        collegeJsonParser.read(true);
        try {
            AudioAttributesCompatParcelizer(setcollegename, setcollegename.write(), true);
            do {
            } while (collegeJsonParser.MediaBrowserCompatCustomActionResultReceiver());
        } finally {
            try {
            } finally {
            }
        }
    }
}
