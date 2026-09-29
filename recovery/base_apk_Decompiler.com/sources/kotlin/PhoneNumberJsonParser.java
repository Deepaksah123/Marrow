package kotlin;

/* JADX INFO: loaded from: classes4.dex */
public final class PhoneNumberJsonParser {
    public static final Object IconCompatParcelizer(SampleVideos<? super getShowPopup> sampleVideos) {
        Object objIconCompatParcelizer;
        CurrentQuery write = sampleVideos.getWrite();
        getUserConfig.read(write);
        SampleVideos sampleVideosIconCompatParcelizer = getYear.IconCompatParcelizer(sampleVideos);
        setInternetConnected setinternetconnected = sampleVideosIconCompatParcelizer instanceof setInternetConnected ? (setInternetConnected) sampleVideosIconCompatParcelizer : null;
        if (setinternetconnected == null) {
            objIconCompatParcelizer = getShowPopup.INSTANCE;
        } else {
            if (setinternetconnected.AudioAttributesCompatParcelizer.IconCompatParcelizer(write)) {
                setinternetconnected.write(write, getShowPopup.INSTANCE);
            } else {
                setCountryCode setcountrycode = new setCountryCode();
                setinternetconnected.write(write.plus(setcountrycode), getShowPopup.INSTANCE);
                if (setcountrycode.write && !setEncryptedPlaybackVersion.write(setinternetconnected)) {
                    objIconCompatParcelizer = getShowPopup.INSTANCE;
                }
            }
            objIconCompatParcelizer = getYear.IconCompatParcelizer();
        }
        if (objIconCompatParcelizer == getYear.IconCompatParcelizer()) {
            getAnsweredMcqCount.write(sampleVideos);
        }
        return objIconCompatParcelizer == getYear.IconCompatParcelizer() ? objIconCompatParcelizer : getShowPopup.INSTANCE;
    }
}
