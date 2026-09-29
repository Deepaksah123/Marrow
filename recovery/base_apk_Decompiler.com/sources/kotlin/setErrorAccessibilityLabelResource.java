package kotlin;

import com.marrow.R;

/* JADX INFO: loaded from: classes4.dex */
public final class setErrorAccessibilityLabelResource {

    public static final /* synthetic */ class write {
        public static final /* synthetic */ int[] read;

        static {
            int[] iArr = new int[getMediaMimeType.values().length];
            try {
                iArr[getMediaMimeType.MediaMetadataCompat.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[getMediaMimeType.AudioAttributesImplApi26Parcelizer.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[getMediaMimeType.MediaBrowserCompatItemReceiver.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[getMediaMimeType.AudioAttributesCompatParcelizer.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[getMediaMimeType.MediaBrowserCompatCustomActionResultReceiver.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[getMediaMimeType.write.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[getMediaMimeType.RemoteActionCompatParcelizer.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[getMediaMimeType.read.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[getMediaMimeType.AudioAttributesImplApi21Parcelizer.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[getMediaMimeType.IconCompatParcelizer.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[getMediaMimeType.AudioAttributesImplBaseParcelizer.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            read = iArr;
        }
    }

    public static final int RemoteActionCompatParcelizer(getMediaMimeType getmediamimetype) {
        toMagicModuleMetaRepoModel.write(getmediamimetype, "");
        switch (write.read[getmediamimetype.ordinal()]) {
            case 1:
                return R.string.text_review_filter_wrong;
            case 2:
                return R.string.text_review_filter_correct;
            case 3:
                return R.string.text_review_filter_skip;
            case 4:
                return R.string.text_review_filter_bookmark;
            case 5:
                return R.string.text_review_filter_new;
            case 6:
                return R.string.text_review_filter_changed;
            case 7:
                return R.string.text_review_filter_guess_wrong;
            case 8:
                return R.string.text_review_filter_guess_correct;
            case 9:
                return R.string.text_review_filter_silly_mistake;
            case 10:
                return R.string.text_review_filter_hyt;
            case 11:
                return R.string.text_review_filter_all;
            default:
                throw new RenewEligibleCreator();
        }
    }
}
