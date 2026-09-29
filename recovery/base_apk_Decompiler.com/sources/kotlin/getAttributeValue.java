package kotlin;

import com.marrow.data.models.common.CourseConfigKeyConstantsKt;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public final class getAttributeValue {

    public static final /* synthetic */ class IconCompatParcelizer {
        public static final /* synthetic */ int[] write;

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
                iArr[XmlPullParserUtil.AudioAttributesImplApi21Parcelizer.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[XmlPullParserUtil.write.ordinal()] = 4;
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
            write = iArr;
        }
    }

    public static final XmlPullParserUtil write(String str) throws Throwable {
        toMagicModuleMetaRepoModel.write(str, "");
        String lowerCase = str.toLowerCase(Locale.ROOT);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(lowerCase, "");
        switch (lowerCase.hashCode()) {
            case -992224019:
                if (lowerCase.equals(CourseConfigKeyConstantsKt.KEY_PEARLS)) {
                    return XmlPullParserUtil.IconCompatParcelizer;
                }
                break;
            case 107931:
                if (lowerCase.equals("mcq")) {
                    return XmlPullParserUtil.AudioAttributesCompatParcelizer;
                }
                break;
            case 3556498:
                if (lowerCase.equals("test")) {
                    return XmlPullParserUtil.MediaBrowserCompatCustomActionResultReceiver;
                }
                break;
            case 107374125:
                if (lowerCase.equals("qbank")) {
                    return XmlPullParserUtil.write;
                }
                break;
            case 112202875:
                if (lowerCase.equals("video")) {
                    return XmlPullParserUtil.AudioAttributesImplApi26Parcelizer;
                }
                break;
            case 621661061:
                if (lowerCase.equals("video_timeline")) {
                    return XmlPullParserUtil.MediaBrowserCompatSearchResultReceiver;
                }
                break;
            case 959477165:
                if (lowerCase.equals("practical_corner_qbank")) {
                    return XmlPullParserUtil.AudioAttributesImplApi21Parcelizer;
                }
                break;
            case 1426691355:
                if (lowerCase.equals("practical_corner_mcq")) {
                    return XmlPullParserUtil.MediaBrowserCompatItemReceiver;
                }
                break;
        }
        throw new Throwable("No type found for search");
    }

    public static final String AudioAttributesCompatParcelizer(XmlPullParserUtil xmlPullParserUtil) {
        toMagicModuleMetaRepoModel.write(xmlPullParserUtil, "");
        switch (IconCompatParcelizer.write[xmlPullParserUtil.ordinal()]) {
            case 1:
            case 2:
                return "mcq";
            case 3:
                return "practical_corner_qbank";
            case 4:
                return "qbank";
            case 5:
                return CourseConfigKeyConstantsKt.KEY_PEARLS;
            case 6:
                return "test";
            case 7:
                return "video";
            case 8:
                return "video_timeline";
            case 9:
            case 10:
                return "practical_corner_mcq";
            case 11:
                return CourseConfigKeyConstantsKt.KEY_PEARLS;
            default:
                throw new RenewEligibleCreator();
        }
    }
}
