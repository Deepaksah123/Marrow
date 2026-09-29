package kotlin;

import kotlin.getTestHeaderTitle;

/* JADX INFO: loaded from: classes4.dex */
public final class NestfgetmTitle {
    public static boolean read(CourseConfigV2SettingsItems courseConfigV2SettingsItems) {
        if (courseConfigV2SettingsItems == null) {
            write(0);
        }
        if (courseConfigV2SettingsItems.handleMediaPlayPauseIfPendingOnHandler() == getTestHeaderTitle.RemoteActionCompatParcelizer.FAKE_OVERRIDE) {
            return false;
        }
        if (read(courseConfigV2SettingsItems.AudioAttributesImplApi21Parcelizer())) {
            return true;
        }
        return getAnswerDescription.AudioAttributesImplApi21Parcelizer(courseConfigV2SettingsItems.AudioAttributesImplApi21Parcelizer()) && RemoteActionCompatParcelizer(courseConfigV2SettingsItems);
    }

    private static boolean read(getVariant getvariant) {
        if (getvariant == null) {
            write(1);
        }
        return getAnswerDescription.AudioAttributesImplApi21Parcelizer(getvariant) && getAnswerDescription.MediaBrowserCompatCustomActionResultReceiver(getvariant.AudioAttributesImplApi21Parcelizer()) && !read((CourseConfigV2CustomModuleQuestionSource) getvariant);
    }

    private static boolean read(CourseConfigV2CustomModuleQuestionSource courseConfigV2CustomModuleQuestionSource) {
        if (courseConfigV2CustomModuleQuestionSource == null) {
            write(2);
        }
        return getShowGoProButton.read(getQbankItems.RemoteActionCompatParcelizer, courseConfigV2CustomModuleQuestionSource);
    }

    private static boolean RemoteActionCompatParcelizer(getTestHeaderTitle gettestheadertitle) {
        CourseConfigV2NavDrawerItemKnowMore courseConfigV2NavDrawerItemKnowMoreMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        if (gettestheadertitle == null) {
            write(3);
        }
        if ((gettestheadertitle instanceof CourseConfigV2SettingsItems) && (courseConfigV2NavDrawerItemKnowMoreMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = ((CourseConfigV2SettingsItems) gettestheadertitle).MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver()) != null && courseConfigV2NavDrawerItemKnowMoreMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.RemoteActionCompatParcelizer().AudioAttributesCompatParcelizer(VideoInfoMini.RemoteActionCompatParcelizer)) {
            return true;
        }
        return gettestheadertitle.RemoteActionCompatParcelizer().AudioAttributesCompatParcelizer(VideoInfoMini.RemoteActionCompatParcelizer);
    }

    private static /* synthetic */ void write(int i) {
        Object[] objArr = new Object[3];
        if (i == 1 || i == 2) {
            objArr[0] = "companionObject";
        } else if (i != 3) {
            objArr[0] = "propertyDescriptor";
        } else {
            objArr[0] = "memberDescriptor";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/DescriptorsJvmAbiUtil";
        if (i == 1) {
            objArr[2] = "isClassCompanionObjectWithBackingFieldsInOuter";
        } else if (i == 2) {
            objArr[2] = "isMappedIntrinsicCompanionObject";
        } else if (i != 3) {
            objArr[2] = "isPropertyWithBackingFieldInOuterClass";
        } else {
            objArr[2] = "hasJvmFieldAnnotation";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }
}
