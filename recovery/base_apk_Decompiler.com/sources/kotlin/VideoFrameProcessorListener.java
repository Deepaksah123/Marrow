package kotlin;

/* JADX INFO: loaded from: classes3.dex */
public final class VideoFrameProcessorListener {

    public static final /* synthetic */ class write {
        public static final /* synthetic */ int[] read;

        static {
            int[] iArr = new int[XmlPullParserUtil.values().length];
            try {
                iArr[XmlPullParserUtil.AudioAttributesCompatParcelizer.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[XmlPullParserUtil.RemoteActionCompatParcelizer.ordinal()] = 2;
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
                iArr[XmlPullParserUtil.MediaBrowserCompatItemReceiver.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[XmlPullParserUtil.AudioAttributesImplBaseParcelizer.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[XmlPullParserUtil.read.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            read = iArr;
        }
    }

    public static final XmlPullParserUtil RemoteActionCompatParcelizer(String str) throws Throwable {
        toMagicModuleMetaRepoModel.write(str, "");
        switch (str.hashCode()) {
            case -1908356851:
                if (str.equals("Pearls")) {
                    return XmlPullParserUtil.IconCompatParcelizer;
                }
                break;
            case -1732810888:
                if (str.equals("Videos")) {
                    return XmlPullParserUtil.AudioAttributesImplApi26Parcelizer;
                }
                break;
            case -677368517:
                if (str.equals("Practical_Corner_Mcq")) {
                    return XmlPullParserUtil.MediaBrowserCompatItemReceiver;
                }
                break;
            case -575175384:
                if (str.equals("Videos_timeline")) {
                    return XmlPullParserUtil.MediaBrowserCompatSearchResultReceiver;
                }
                break;
            case 77179:
                if (str.equals("Mcq")) {
                    return XmlPullParserUtil.AudioAttributesCompatParcelizer;
                }
                break;
            case 76868141:
                if (str.equals("QBank")) {
                    return XmlPullParserUtil.write;
                }
                break;
            case 80698881:
                if (str.equals("Tests")) {
                    return XmlPullParserUtil.MediaBrowserCompatCustomActionResultReceiver;
                }
                break;
            case 1887536589:
                if (str.equals("Practical_Corner_Qbank")) {
                    return XmlPullParserUtil.AudioAttributesImplApi21Parcelizer;
                }
                break;
        }
        throw new Throwable("No type found for recent search");
    }

    public static final String IconCompatParcelizer(XmlPullParserUtil xmlPullParserUtil) {
        toMagicModuleMetaRepoModel.write(xmlPullParserUtil, "");
        switch (write.read[xmlPullParserUtil.ordinal()]) {
            case 1:
            case 2:
                return "Mcq";
            case 3:
                return "QBank";
            case 4:
                return "Practical_Corner_Qbank";
            case 5:
                return "Pearls";
            case 6:
                return "Tests";
            case 7:
                return "Videos";
            case 8:
                return "Videos_timeline";
            case 9:
            case 10:
                return "Practical_Corner_Mcq";
            case 11:
                return "Pearls";
            default:
                throw new RenewEligibleCreator();
        }
    }
}
