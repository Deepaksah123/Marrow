package kotlin;

/* JADX INFO: loaded from: classes3.dex */
public final class stripPrefix {

    public static final /* synthetic */ class AudioAttributesCompatParcelizer {
        public static final /* synthetic */ int[] IconCompatParcelizer;

        static {
            int[] iArr = new int[XmlPullParserUtil.values().length];
            try {
                iArr[XmlPullParserUtil.MediaBrowserCompatItemReceiver.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[XmlPullParserUtil.AudioAttributesCompatParcelizer.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[XmlPullParserUtil.write.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[XmlPullParserUtil.AudioAttributesImplApi21Parcelizer.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[XmlPullParserUtil.IconCompatParcelizer.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[XmlPullParserUtil.MediaBrowserCompatCustomActionResultReceiver.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[XmlPullParserUtil.AudioAttributesImplApi26Parcelizer.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[XmlPullParserUtil.MediaBrowserCompatSearchResultReceiver.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[XmlPullParserUtil.RemoteActionCompatParcelizer.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[XmlPullParserUtil.read.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[XmlPullParserUtil.AudioAttributesImplBaseParcelizer.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            IconCompatParcelizer = iArr;
        }
    }

    public static final isStartTagIgnorePrefix IconCompatParcelizer(getFirstSampleTimestampUs getfirstsampletimestampus) {
        toMagicModuleMetaRepoModel.write(getfirstsampletimestampus, "");
        switch (AudioAttributesCompatParcelizer.IconCompatParcelizer[getfirstsampletimestampus.AudioAttributesImplBaseParcelizer().ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                if (getfirstsampletimestampus instanceof usToWrappedPts) {
                    usToWrappedPts ustowrappedpts = (usToWrappedPts) getfirstsampletimestampus;
                    return new buildNalUnitForChild(ustowrappedpts.getRemoteActionCompatParcelizer(), ustowrappedpts.getRead(), ustowrappedpts.getIconCompatParcelizer(), ustowrappedpts.getWrite(), ustowrappedpts.getAudioAttributesCompatParcelizer());
                }
                break;
            case 8:
                if (getfirstsampletimestampus instanceof getTimestampOffsetUs) {
                    getTimestampOffsetUs gettimestampoffsetus = (getTimestampOffsetUs) getfirstsampletimestampus;
                    String remoteActionCompatParcelizer = gettimestampoffsetus.getRemoteActionCompatParcelizer();
                    String read = gettimestampoffsetus.getRead();
                    return new ColorInfo(remoteActionCompatParcelizer, gettimestampoffsetus.getAudioAttributesCompatParcelizer(), read, gettimestampoffsetus.getIconCompatParcelizer(), gettimestampoffsetus.getWrite(), gettimestampoffsetus.getAudioAttributesImplBaseParcelizer(), gettimestampoffsetus.getAudioAttributesImplApi26Parcelizer());
                }
                break;
            case 9:
            case 10:
            case 11:
                if (getfirstsampletimestampus instanceof ptsToUs) {
                    ptsToUs ptstous = (ptsToUs) getfirstsampletimestampus;
                    String write = ptstous.getWrite();
                    String read2 = ptstous.getRead();
                    return new VideoFrameProcessorInputType(write, ptstous.getIconCompatParcelizer(), read2, ptstous.getRemoteActionCompatParcelizer(), ptstous.getAudioAttributesCompatParcelizer(), ptstous.getMediaBrowserCompatCustomActionResultReceiver(), false, 64, null);
                }
                break;
            default:
                throw new RenewEligibleCreator();
        }
        return new buildNalUnitForChild(getfirstsampletimestampus.MediaBrowserCompatItemReceiver(), getfirstsampletimestampus.AudioAttributesImplBaseParcelizer(), getfirstsampletimestampus.AudioAttributesImplApi21Parcelizer(), getfirstsampletimestampus.AudioAttributesImplApi26Parcelizer(), 0, 16, null);
    }
}
