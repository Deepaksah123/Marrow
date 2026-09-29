package kotlin;

import kotlin.getTestHeaderTitle;
import kotlin.setActiveRecallQbankId;

/* JADX INFO: loaded from: classes4.dex */
public final class getLessonName {

    public final /* synthetic */ class AudioAttributesCompatParcelizer {
        public static final /* synthetic */ int[] IconCompatParcelizer;
        public static final /* synthetic */ int[] read;

        static {
            int[] iArr = new int[setActiveRecallQbankId.AudioAttributesImplBaseParcelizer.values().length];
            try {
                iArr[setActiveRecallQbankId.AudioAttributesImplBaseParcelizer.DECLARATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[setActiveRecallQbankId.AudioAttributesImplBaseParcelizer.FAKE_OVERRIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[setActiveRecallQbankId.AudioAttributesImplBaseParcelizer.DELEGATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[setActiveRecallQbankId.AudioAttributesImplBaseParcelizer.SYNTHESIZED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            read = iArr;
            int[] iArr2 = new int[getTestHeaderTitle.RemoteActionCompatParcelizer.values().length];
            try {
                iArr2[getTestHeaderTitle.RemoteActionCompatParcelizer.DECLARATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[getTestHeaderTitle.RemoteActionCompatParcelizer.FAKE_OVERRIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[getTestHeaderTitle.RemoteActionCompatParcelizer.DELEGATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[getTestHeaderTitle.RemoteActionCompatParcelizer.SYNTHESIZED.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            int[] iArr3 = new int[setActiveRecallQbankId.onMediaButtonEvent.values().length];
            try {
                iArr3[setActiveRecallQbankId.onMediaButtonEvent.INTERNAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[setActiveRecallQbankId.onMediaButtonEvent.PRIVATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[setActiveRecallQbankId.onMediaButtonEvent.PRIVATE_TO_THIS.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[setActiveRecallQbankId.onMediaButtonEvent.PROTECTED.ordinal()] = 4;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[setActiveRecallQbankId.onMediaButtonEvent.PUBLIC.ordinal()] = 5;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr3[setActiveRecallQbankId.onMediaButtonEvent.LOCAL.ordinal()] = 6;
            } catch (NoSuchFieldError unused14) {
            }
            IconCompatParcelizer = iArr3;
        }
    }

    public static final getTestHeaderTitle.RemoteActionCompatParcelizer read(MultiBookmarkCounter multiBookmarkCounter, setActiveRecallQbankId.AudioAttributesImplBaseParcelizer audioAttributesImplBaseParcelizer) {
        toMagicModuleMetaRepoModel.write(multiBookmarkCounter, "");
        int i = audioAttributesImplBaseParcelizer == null ? -1 : AudioAttributesCompatParcelizer.read[audioAttributesImplBaseParcelizer.ordinal()];
        if (i == 1) {
            return getTestHeaderTitle.RemoteActionCompatParcelizer.DECLARATION;
        }
        if (i == 2) {
            return getTestHeaderTitle.RemoteActionCompatParcelizer.FAKE_OVERRIDE;
        }
        if (i == 3) {
            return getTestHeaderTitle.RemoteActionCompatParcelizer.DELEGATION;
        }
        if (i == 4) {
            return getTestHeaderTitle.RemoteActionCompatParcelizer.SYNTHESIZED;
        }
        return getTestHeaderTitle.RemoteActionCompatParcelizer.DECLARATION;
    }

    public static final CourseConfigV2NavDrawerItemFreeExtension write(MultiBookmarkCounter multiBookmarkCounter, setActiveRecallQbankId.onMediaButtonEvent onmediabuttonevent) {
        toMagicModuleMetaRepoModel.write(multiBookmarkCounter, "");
        switch (onmediabuttonevent == null ? -1 : AudioAttributesCompatParcelizer.IconCompatParcelizer[onmediabuttonevent.ordinal()]) {
            case 1:
                CourseConfigV2NavDrawerItemFreeExtension courseConfigV2NavDrawerItemFreeExtension = CourseConfigV2NavDrawerItemFaq.IconCompatParcelizer;
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(courseConfigV2NavDrawerItemFreeExtension, "");
                return courseConfigV2NavDrawerItemFreeExtension;
            case 2:
                CourseConfigV2NavDrawerItemFreeExtension courseConfigV2NavDrawerItemFreeExtension2 = CourseConfigV2NavDrawerItemFaq.AudioAttributesImplBaseParcelizer;
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(courseConfigV2NavDrawerItemFreeExtension2, "");
                return courseConfigV2NavDrawerItemFreeExtension2;
            case 3:
                CourseConfigV2NavDrawerItemFreeExtension courseConfigV2NavDrawerItemFreeExtension3 = CourseConfigV2NavDrawerItemFaq.MediaBrowserCompatCustomActionResultReceiver;
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(courseConfigV2NavDrawerItemFreeExtension3, "");
                return courseConfigV2NavDrawerItemFreeExtension3;
            case 4:
                CourseConfigV2NavDrawerItemFreeExtension courseConfigV2NavDrawerItemFreeExtension4 = CourseConfigV2NavDrawerItemFaq.AudioAttributesImplApi26Parcelizer;
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(courseConfigV2NavDrawerItemFreeExtension4, "");
                return courseConfigV2NavDrawerItemFreeExtension4;
            case 5:
                CourseConfigV2NavDrawerItemFreeExtension courseConfigV2NavDrawerItemFreeExtension5 = CourseConfigV2NavDrawerItemFaq.MediaBrowserCompatMediaItem;
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(courseConfigV2NavDrawerItemFreeExtension5, "");
                return courseConfigV2NavDrawerItemFreeExtension5;
            case 6:
                CourseConfigV2NavDrawerItemFreeExtension courseConfigV2NavDrawerItemFreeExtension6 = CourseConfigV2NavDrawerItemFaq.AudioAttributesImplApi21Parcelizer;
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(courseConfigV2NavDrawerItemFreeExtension6, "");
                return courseConfigV2NavDrawerItemFreeExtension6;
            default:
                CourseConfigV2NavDrawerItemFreeExtension courseConfigV2NavDrawerItemFreeExtension7 = CourseConfigV2NavDrawerItemFaq.AudioAttributesImplBaseParcelizer;
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(courseConfigV2NavDrawerItemFreeExtension7, "");
                return courseConfigV2NavDrawerItemFreeExtension7;
        }
    }
}
