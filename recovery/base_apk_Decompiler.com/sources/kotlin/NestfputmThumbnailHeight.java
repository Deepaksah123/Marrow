package kotlin;

import java.util.HashMap;
import java.util.Map;
import kotlin.fromSection;

/* JADX INFO: loaded from: classes4.dex */
public final class NestfputmThumbnailHeight {
    private static final Map<DataSet, CourseConfigV2NavDrawerItemFreeExtension> AudioAttributesCompatParcelizer;
    public static final CourseConfigV2NavDrawerItemFreeExtension IconCompatParcelizer;
    public static final CourseConfigV2NavDrawerItemFreeExtension RemoteActionCompatParcelizer;
    public static final CourseConfigV2NavDrawerItemFreeExtension write;

    static {
        CourseConfigV2NavDrawerItem courseConfigV2NavDrawerItem = new CourseConfigV2NavDrawerItem(fromSection.IconCompatParcelizer.AudioAttributesCompatParcelizer) { // from class: o.NestfputmThumbnailHeight.5
            @Override // kotlin.CourseConfigV2NavDrawerItemFreeExtension
            public final boolean IconCompatParcelizer(getStartIndex getstartindex, getSubText getsubtext, getVariant getvariant, boolean z) {
                if (getsubtext == null) {
                    read(0);
                }
                if (getvariant == null) {
                    read(1);
                }
                return NestfputmThumbnailHeight.AudioAttributesCompatParcelizer(getsubtext, getvariant);
            }

            private static /* synthetic */ void read(int i) {
                Object[] objArr = new Object[3];
                if (i != 1) {
                    objArr[0] = "what";
                } else {
                    objArr[0] = "from";
                }
                objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$1";
                objArr[2] = "isVisible";
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
            }
        };
        write = courseConfigV2NavDrawerItem;
        CourseConfigV2NavDrawerItem courseConfigV2NavDrawerItem2 = new CourseConfigV2NavDrawerItem(fromSection.write.write) { // from class: o.NestfputmThumbnailHeight.1
            @Override // kotlin.CourseConfigV2NavDrawerItemFreeExtension
            public final boolean IconCompatParcelizer(getStartIndex getstartindex, getSubText getsubtext, getVariant getvariant, boolean z) {
                if (getsubtext == null) {
                    IconCompatParcelizer(0);
                }
                if (getvariant == null) {
                    IconCompatParcelizer(1);
                }
                return NestfputmThumbnailHeight.AudioAttributesCompatParcelizer(getstartindex, getsubtext, getvariant);
            }

            private static /* synthetic */ void IconCompatParcelizer(int i) {
                Object[] objArr = new Object[3];
                if (i != 1) {
                    objArr[0] = "what";
                } else {
                    objArr[0] = "from";
                }
                objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$2";
                objArr[2] = "isVisible";
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
            }
        };
        IconCompatParcelizer = courseConfigV2NavDrawerItem2;
        CourseConfigV2NavDrawerItem courseConfigV2NavDrawerItem3 = new CourseConfigV2NavDrawerItem(fromSection.RemoteActionCompatParcelizer.IconCompatParcelizer) { // from class: o.NestfputmThumbnailHeight.2
            @Override // kotlin.CourseConfigV2NavDrawerItemFreeExtension
            public final boolean IconCompatParcelizer(getStartIndex getstartindex, getSubText getsubtext, getVariant getvariant, boolean z) {
                if (getsubtext == null) {
                    IconCompatParcelizer(0);
                }
                if (getvariant == null) {
                    IconCompatParcelizer(1);
                }
                return NestfputmThumbnailHeight.AudioAttributesCompatParcelizer(getstartindex, getsubtext, getvariant);
            }

            private static /* synthetic */ void IconCompatParcelizer(int i) {
                Object[] objArr = new Object[3];
                if (i != 1) {
                    objArr[0] = "what";
                } else {
                    objArr[0] = "from";
                }
                objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$3";
                objArr[2] = "isVisible";
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
            }
        };
        RemoteActionCompatParcelizer = courseConfigV2NavDrawerItem3;
        AudioAttributesCompatParcelizer = new HashMap();
        read(courseConfigV2NavDrawerItem);
        read(courseConfigV2NavDrawerItem2);
        read(courseConfigV2NavDrawerItem3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean AudioAttributesCompatParcelizer(getStartIndex getstartindex, getSubText getsubtext, getVariant getvariant) {
        if (getsubtext == null) {
            read(0);
        }
        if (getvariant == null) {
            read(1);
        }
        if (AudioAttributesCompatParcelizer(getAnswerDescription.IconCompatParcelizer(getsubtext), getvariant)) {
            return true;
        }
        return CourseConfigV2NavDrawerItemFaq.AudioAttributesImplApi26Parcelizer.IconCompatParcelizer(getstartindex, getsubtext, getvariant, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean AudioAttributesCompatParcelizer(getVariant getvariant, getVariant getvariant2) {
        if (getvariant == null) {
            read(2);
        }
        if (getvariant2 == null) {
            read(3);
        }
        getShouldShowEmptyPlanScreen getshouldshowemptyplanscreen = (getShouldShowEmptyPlanScreen) getAnswerDescription.write(getvariant, getShouldShowEmptyPlanScreen.class, false);
        getShouldShowEmptyPlanScreen getshouldshowemptyplanscreen2 = (getShouldShowEmptyPlanScreen) getAnswerDescription.write(getvariant2, getShouldShowEmptyPlanScreen.class, false);
        return (getshouldshowemptyplanscreen2 == null || getshouldshowemptyplanscreen == null || !getshouldshowemptyplanscreen.IconCompatParcelizer().equals(getshouldshowemptyplanscreen2.IconCompatParcelizer())) ? false : true;
    }

    private static void read(CourseConfigV2NavDrawerItemFreeExtension courseConfigV2NavDrawerItemFreeExtension) {
        AudioAttributesCompatParcelizer.put(courseConfigV2NavDrawerItemFreeExtension.AudioAttributesCompatParcelizer(), courseConfigV2NavDrawerItemFreeExtension);
    }

    public static CourseConfigV2NavDrawerItemFreeExtension IconCompatParcelizer(DataSet dataSet) {
        if (dataSet == null) {
            read(4);
        }
        CourseConfigV2NavDrawerItemFreeExtension courseConfigV2NavDrawerItemFreeExtension = AudioAttributesCompatParcelizer.get(dataSet);
        if (courseConfigV2NavDrawerItemFreeExtension != null) {
            if (courseConfigV2NavDrawerItemFreeExtension == null) {
                read(6);
            }
            return courseConfigV2NavDrawerItemFreeExtension;
        }
        CourseConfigV2NavDrawerItemFreeExtension courseConfigV2NavDrawerItemFreeExtensionAudioAttributesCompatParcelizer = CourseConfigV2NavDrawerItemFaq.AudioAttributesCompatParcelizer(dataSet);
        if (courseConfigV2NavDrawerItemFreeExtensionAudioAttributesCompatParcelizer == null) {
            read(5);
        }
        return courseConfigV2NavDrawerItemFreeExtensionAudioAttributesCompatParcelizer;
    }

    private static /* synthetic */ void read(int i) {
        String str = (i == 5 || i == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 5 || i == 6) ? 2 : 3];
        switch (i) {
            case 1:
                objArr[0] = "from";
                break;
            case 2:
                objArr[0] = "first";
                break;
            case 3:
                objArr[0] = "second";
                break;
            case 4:
                objArr[0] = "visibility";
                break;
            case 5:
            case 6:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities";
                break;
            default:
                objArr[0] = "what";
                break;
        }
        if (i == 5 || i == 6) {
            objArr[1] = "toDescriptorVisibility";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities";
        }
        if (i == 2 || i == 3) {
            objArr[2] = "areInSamePackage";
        } else if (i == 4) {
            objArr[2] = "toDescriptorVisibility";
        } else if (i != 5 && i != 6) {
            objArr[2] = "isVisibleForProtectedAndPackage";
        }
        String str2 = String.format(str, objArr);
        if (i != 5 && i != 6) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }
}
