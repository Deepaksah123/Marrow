package kotlin;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.ServiceLoader;
import kotlin.C0212toJsonArray;
import kotlin.isRootSubject;

/* JADX INFO: loaded from: classes4.dex */
public final class CourseConfigV2NavDrawerItemFaq {
    public static final getStartIndex AudioAttributesCompatParcelizer;
    public static final CourseConfigV2NavDrawerItemFreeExtension AudioAttributesImplApi21Parcelizer;
    public static final CourseConfigV2NavDrawerItemFreeExtension AudioAttributesImplApi26Parcelizer;
    public static final CourseConfigV2NavDrawerItemFreeExtension AudioAttributesImplBaseParcelizer;
    public static final CourseConfigV2NavDrawerItemFreeExtension IconCompatParcelizer;
    public static final CourseConfigV2NavDrawerItemFreeExtension MediaBrowserCompatCustomActionResultReceiver;
    public static final CourseConfigV2NavDrawerItemFreeExtension MediaBrowserCompatItemReceiver;
    public static final CourseConfigV2NavDrawerItemFreeExtension MediaBrowserCompatMediaItem;
    private static final getStartIndex MediaBrowserCompatSearchResultReceiver;
    public static final CourseConfigV2NavDrawerItemFreeExtension MediaDescriptionCompat;
    private static final Map<DataSet, CourseConfigV2NavDrawerItemFreeExtension> MediaMetadataCompat;
    private static final isRootSubject RatingCompat;
    public static final CourseConfigV2NavDrawerItemFreeExtension RemoteActionCompatParcelizer;

    @Deprecated
    public static final getStartIndex read;
    public static final CourseConfigV2NavDrawerItemFreeExtension write;

    static {
        CourseConfigV2NavDrawerItem courseConfigV2NavDrawerItem = new CourseConfigV2NavDrawerItem(C0212toJsonArray.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer) { // from class: o.CourseConfigV2NavDrawerItemFaq.4
            private static boolean RemoteActionCompatParcelizer(getVariant getvariant) {
                if (getvariant == null) {
                    read(0);
                }
                return getAnswerDescription.IconCompatParcelizer(getvariant) != CourseConfigV2VideoPageItem.read;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.CourseConfigV2NavDrawerItemFreeExtension
            public final boolean IconCompatParcelizer(getStartIndex getstartindex, getSubText getsubtext, getVariant getvariant, boolean z) {
                if (getsubtext == 0) {
                    read(1);
                }
                if (getvariant == null) {
                    read(2);
                }
                if (getAnswerDescription.RatingCompat(getsubtext) && RemoteActionCompatParcelizer(getvariant)) {
                    return CourseConfigV2NavDrawerItemFaq.AudioAttributesCompatParcelizer(getsubtext, getvariant);
                }
                if (getsubtext instanceof CourseConfigV2GtAnalyticsCard) {
                    getBadge getbadgeOnPlayFromMediaId = ((CourseConfigV2GtAnalyticsCard) getsubtext).onPlayFromMediaId();
                    if (z && getAnswerDescription.MediaBrowserCompatMediaItem(getbadgeOnPlayFromMediaId) && getAnswerDescription.RatingCompat(getbadgeOnPlayFromMediaId) && (getvariant instanceof CourseConfigV2GtAnalyticsCard) && getAnswerDescription.RatingCompat(getvariant.AudioAttributesImplApi21Parcelizer()) && CourseConfigV2NavDrawerItemFaq.AudioAttributesCompatParcelizer(getsubtext, getvariant)) {
                        return true;
                    }
                }
                while (getsubtext != 0) {
                    getsubtext = getsubtext.AudioAttributesImplApi21Parcelizer();
                    if (((getsubtext instanceof CourseConfigV2CustomModuleQuestionSource) && !getAnswerDescription.AudioAttributesImplApi21Parcelizer(getsubtext)) || (getsubtext instanceof getShouldShowEmptyPlanScreen)) {
                        break;
                    }
                }
                if (getsubtext == 0) {
                    return false;
                }
                while (getvariant != null) {
                    if (getsubtext == getvariant) {
                        return true;
                    }
                    if (getvariant instanceof getShouldShowEmptyPlanScreen) {
                        return (getsubtext instanceof getShouldShowEmptyPlanScreen) && ((getShouldShowEmptyPlanScreen) getsubtext).IconCompatParcelizer().equals(((getShouldShowEmptyPlanScreen) getvariant).IconCompatParcelizer()) && getAnswerDescription.RemoteActionCompatParcelizer(getvariant, getsubtext);
                    }
                    getvariant = getvariant.AudioAttributesImplApi21Parcelizer();
                }
                return false;
            }

            private static /* synthetic */ void read(int i) {
                Object[] objArr = new Object[3];
                if (i == 1) {
                    objArr[0] = "what";
                } else if (i != 2) {
                    objArr[0] = "descriptor";
                } else {
                    objArr[0] = "from";
                }
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$1";
                if (i == 1 || i == 2) {
                    objArr[2] = "isVisible";
                } else {
                    objArr[2] = "hasContainingSourceFile";
                }
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
            }
        };
        AudioAttributesImplBaseParcelizer = courseConfigV2NavDrawerItem;
        CourseConfigV2NavDrawerItem courseConfigV2NavDrawerItem2 = new CourseConfigV2NavDrawerItem(C0212toJsonArray.AudioAttributesImplBaseParcelizer.IconCompatParcelizer) { // from class: o.CourseConfigV2NavDrawerItemFaq.1
            @Override // kotlin.CourseConfigV2NavDrawerItemFreeExtension
            public final boolean IconCompatParcelizer(getStartIndex getstartindex, getSubText getsubtext, getVariant getvariant, boolean z) {
                getVariant getvariantAudioAttributesCompatParcelizer;
                if (getsubtext == null) {
                    RemoteActionCompatParcelizer(0);
                }
                if (getvariant == null) {
                    RemoteActionCompatParcelizer(1);
                }
                if (!CourseConfigV2NavDrawerItemFaq.AudioAttributesImplBaseParcelizer.IconCompatParcelizer(getstartindex, getsubtext, getvariant, z)) {
                    return false;
                }
                if (getstartindex == CourseConfigV2NavDrawerItemFaq.AudioAttributesCompatParcelizer) {
                    return true;
                }
                if (getstartindex == CourseConfigV2NavDrawerItemFaq.MediaBrowserCompatSearchResultReceiver || (getvariantAudioAttributesCompatParcelizer = getAnswerDescription.AudioAttributesCompatParcelizer(getsubtext, (Class<getVariant>) CourseConfigV2CustomModuleQuestionSource.class)) == null || !(getstartindex instanceof isFirstMcq)) {
                    return false;
                }
                return ((isFirstMcq) getstartindex).read().onPrepareFromMediaId().equals(getvariantAudioAttributesCompatParcelizer.onAddQueueItem());
            }

            private static /* synthetic */ void RemoteActionCompatParcelizer(int i) {
                Object[] objArr = new Object[3];
                if (i != 1) {
                    objArr[0] = "what";
                } else {
                    objArr[0] = "from";
                }
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$2";
                objArr[2] = "isVisible";
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
            }
        };
        MediaBrowserCompatCustomActionResultReceiver = courseConfigV2NavDrawerItem2;
        CourseConfigV2NavDrawerItem courseConfigV2NavDrawerItem3 = new CourseConfigV2NavDrawerItem(C0212toJsonArray.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer) { // from class: o.CourseConfigV2NavDrawerItemFaq.10
            @Override // kotlin.CourseConfigV2NavDrawerItemFreeExtension
            public final boolean IconCompatParcelizer(getStartIndex getstartindex, getSubText getsubtext, getVariant getvariant, boolean z) {
                CourseConfigV2CustomModuleQuestionSource courseConfigV2CustomModuleQuestionSource;
                if (getsubtext == null) {
                    AudioAttributesCompatParcelizer(0);
                }
                if (getvariant == null) {
                    AudioAttributesCompatParcelizer(1);
                }
                CourseConfigV2CustomModuleQuestionSource courseConfigV2CustomModuleQuestionSource2 = (CourseConfigV2CustomModuleQuestionSource) getAnswerDescription.AudioAttributesCompatParcelizer(getsubtext, CourseConfigV2CustomModuleQuestionSource.class);
                CourseConfigV2CustomModuleQuestionSource courseConfigV2CustomModuleQuestionSource3 = (CourseConfigV2CustomModuleQuestionSource) getAnswerDescription.write(getvariant, CourseConfigV2CustomModuleQuestionSource.class, false);
                if (courseConfigV2CustomModuleQuestionSource3 == null) {
                    return false;
                }
                if (courseConfigV2CustomModuleQuestionSource2 != null && getAnswerDescription.AudioAttributesImplApi21Parcelizer(courseConfigV2CustomModuleQuestionSource2) && (courseConfigV2CustomModuleQuestionSource = (CourseConfigV2CustomModuleQuestionSource) getAnswerDescription.AudioAttributesCompatParcelizer(courseConfigV2CustomModuleQuestionSource2, CourseConfigV2CustomModuleQuestionSource.class)) != null && getAnswerDescription.read(courseConfigV2CustomModuleQuestionSource3, courseConfigV2CustomModuleQuestionSource)) {
                    return true;
                }
                getSubText getsubtextIconCompatParcelizer = getAnswerDescription.IconCompatParcelizer(getsubtext);
                CourseConfigV2CustomModuleQuestionSource courseConfigV2CustomModuleQuestionSource4 = (CourseConfigV2CustomModuleQuestionSource) getAnswerDescription.AudioAttributesCompatParcelizer(getsubtextIconCompatParcelizer, CourseConfigV2CustomModuleQuestionSource.class);
                if (courseConfigV2CustomModuleQuestionSource4 == null) {
                    return false;
                }
                if (getAnswerDescription.read(courseConfigV2CustomModuleQuestionSource3, courseConfigV2CustomModuleQuestionSource4) && RemoteActionCompatParcelizer(getstartindex, getsubtextIconCompatParcelizer, courseConfigV2CustomModuleQuestionSource3)) {
                    return true;
                }
                return IconCompatParcelizer(getstartindex, getsubtext, courseConfigV2CustomModuleQuestionSource3.AudioAttributesImplApi21Parcelizer(), z);
            }

            private static boolean RemoteActionCompatParcelizer(getStartIndex getstartindex, getSubText getsubtext, CourseConfigV2CustomModuleQuestionSource courseConfigV2CustomModuleQuestionSource) {
                getLink getlinkWrite;
                if (getsubtext == null) {
                    AudioAttributesCompatParcelizer(2);
                }
                if (courseConfigV2CustomModuleQuestionSource == null) {
                    AudioAttributesCompatParcelizer(3);
                }
                if (getstartindex == CourseConfigV2NavDrawerItemFaq.read) {
                    return false;
                }
                if (!(getsubtext instanceof getTestHeaderTitle) || (getsubtext instanceof CourseConfigV2GtAnalyticsCard) || getstartindex == CourseConfigV2NavDrawerItemFaq.AudioAttributesCompatParcelizer) {
                    return true;
                }
                if (getstartindex == CourseConfigV2NavDrawerItemFaq.MediaBrowserCompatSearchResultReceiver || getstartindex == null) {
                    return false;
                }
                if (getstartindex instanceof getPlaybackCount) {
                    getlinkWrite = ((getPlaybackCount) getstartindex).IconCompatParcelizer();
                } else {
                    getlinkWrite = getstartindex.write();
                }
                return getAnswerDescription.IconCompatParcelizer(getlinkWrite, courseConfigV2CustomModuleQuestionSource) || getKeySubjectIds.AudioAttributesCompatParcelizer(getlinkWrite);
            }

            private static /* synthetic */ void AudioAttributesCompatParcelizer(int i) {
                Object[] objArr = new Object[3];
                if (i == 1) {
                    objArr[0] = "from";
                } else if (i == 2) {
                    objArr[0] = "whatDeclaration";
                } else if (i != 3) {
                    objArr[0] = "what";
                } else {
                    objArr[0] = "fromClass";
                }
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$3";
                if (i == 2 || i == 3) {
                    objArr[2] = "doesReceiverFitForProtectedVisibility";
                } else {
                    objArr[2] = "isVisible";
                }
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
            }
        };
        AudioAttributesImplApi26Parcelizer = courseConfigV2NavDrawerItem3;
        CourseConfigV2NavDrawerItem courseConfigV2NavDrawerItem4 = new CourseConfigV2NavDrawerItem(C0212toJsonArray.write.IconCompatParcelizer) { // from class: o.CourseConfigV2NavDrawerItemFaq.6
            @Override // kotlin.CourseConfigV2NavDrawerItemFreeExtension
            public final boolean IconCompatParcelizer(getStartIndex getstartindex, getSubText getsubtext, getVariant getvariant, boolean z) {
                if (getsubtext == null) {
                    write(0);
                }
                if (getvariant == null) {
                    write(1);
                }
                if (getAnswerDescription.AudioAttributesCompatParcelizer(getvariant).read(getAnswerDescription.AudioAttributesCompatParcelizer(getsubtext))) {
                    return CourseConfigV2NavDrawerItemFaq.RatingCompat.AudioAttributesCompatParcelizer(getsubtext, getvariant);
                }
                return false;
            }

            private static /* synthetic */ void write(int i) {
                Object[] objArr = new Object[3];
                if (i != 1) {
                    objArr[0] = "what";
                } else {
                    objArr[0] = "from";
                }
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$4";
                objArr[2] = "isVisible";
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
            }
        };
        IconCompatParcelizer = courseConfigV2NavDrawerItem4;
        CourseConfigV2NavDrawerItem courseConfigV2NavDrawerItem5 = new CourseConfigV2NavDrawerItem(C0212toJsonArray.MediaBrowserCompatItemReceiver.write) { // from class: o.CourseConfigV2NavDrawerItemFaq.8
            private static /* synthetic */ void write(int i) {
                Object[] objArr = new Object[3];
                if (i != 1) {
                    objArr[0] = "what";
                } else {
                    objArr[0] = "from";
                }
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$5";
                objArr[2] = "isVisible";
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
            }

            @Override // kotlin.CourseConfigV2NavDrawerItemFreeExtension
            public final boolean IconCompatParcelizer(getStartIndex getstartindex, getSubText getsubtext, getVariant getvariant, boolean z) {
                if (getsubtext == null) {
                    write(0);
                }
                if (getvariant == null) {
                    write(1);
                }
                return true;
            }
        };
        MediaBrowserCompatMediaItem = courseConfigV2NavDrawerItem5;
        CourseConfigV2NavDrawerItem courseConfigV2NavDrawerItem6 = new CourseConfigV2NavDrawerItem(C0212toJsonArray.IconCompatParcelizer.IconCompatParcelizer) { // from class: o.CourseConfigV2NavDrawerItemFaq.7
            @Override // kotlin.CourseConfigV2NavDrawerItemFreeExtension
            public final boolean IconCompatParcelizer(getStartIndex getstartindex, getSubText getsubtext, getVariant getvariant, boolean z) {
                if (getsubtext == null) {
                    RemoteActionCompatParcelizer(0);
                }
                if (getvariant == null) {
                    RemoteActionCompatParcelizer(1);
                }
                throw new IllegalStateException("This method shouldn't be invoked for LOCAL visibility");
            }

            private static /* synthetic */ void RemoteActionCompatParcelizer(int i) {
                Object[] objArr = new Object[3];
                if (i != 1) {
                    objArr[0] = "what";
                } else {
                    objArr[0] = "from";
                }
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$6";
                objArr[2] = "isVisible";
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
            }
        };
        AudioAttributesImplApi21Parcelizer = courseConfigV2NavDrawerItem6;
        CourseConfigV2NavDrawerItem courseConfigV2NavDrawerItem7 = new CourseConfigV2NavDrawerItem(C0212toJsonArray.read.RemoteActionCompatParcelizer) { // from class: o.CourseConfigV2NavDrawerItemFaq.9
            @Override // kotlin.CourseConfigV2NavDrawerItemFreeExtension
            public final boolean IconCompatParcelizer(getStartIndex getstartindex, getSubText getsubtext, getVariant getvariant, boolean z) {
                if (getsubtext == null) {
                    write(0);
                }
                if (getvariant == null) {
                    write(1);
                }
                throw new IllegalStateException("Visibility is unknown yet");
            }

            private static /* synthetic */ void write(int i) {
                Object[] objArr = new Object[3];
                if (i != 1) {
                    objArr[0] = "what";
                } else {
                    objArr[0] = "from";
                }
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$7";
                objArr[2] = "isVisible";
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
            }
        };
        RemoteActionCompatParcelizer = courseConfigV2NavDrawerItem7;
        CourseConfigV2NavDrawerItem courseConfigV2NavDrawerItem8 = new CourseConfigV2NavDrawerItem(C0212toJsonArray.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer) { // from class: o.CourseConfigV2NavDrawerItemFaq.11
            private static /* synthetic */ void write(int i) {
                Object[] objArr = new Object[3];
                if (i != 1) {
                    objArr[0] = "what";
                } else {
                    objArr[0] = "from";
                }
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$8";
                objArr[2] = "isVisible";
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
            }

            @Override // kotlin.CourseConfigV2NavDrawerItemFreeExtension
            public final boolean IconCompatParcelizer(getStartIndex getstartindex, getSubText getsubtext, getVariant getvariant, boolean z) {
                if (getsubtext == null) {
                    write(0);
                }
                if (getvariant == null) {
                    write(1);
                }
                return false;
            }
        };
        MediaBrowserCompatItemReceiver = courseConfigV2NavDrawerItem8;
        CourseConfigV2NavDrawerItem courseConfigV2NavDrawerItem9 = new CourseConfigV2NavDrawerItem(C0212toJsonArray.AudioAttributesImplApi21Parcelizer.AudioAttributesCompatParcelizer) { // from class: o.CourseConfigV2NavDrawerItemFaq.15
            private static /* synthetic */ void write(int i) {
                Object[] objArr = new Object[3];
                if (i != 1) {
                    objArr[0] = "what";
                } else {
                    objArr[0] = "from";
                }
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$9";
                objArr[2] = "isVisible";
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
            }

            @Override // kotlin.CourseConfigV2NavDrawerItemFreeExtension
            public final boolean IconCompatParcelizer(getStartIndex getstartindex, getSubText getsubtext, getVariant getvariant, boolean z) {
                if (getsubtext == null) {
                    write(0);
                }
                if (getvariant == null) {
                    write(1);
                }
                return false;
            }
        };
        MediaDescriptionCompat = courseConfigV2NavDrawerItem9;
        Collections.unmodifiableSet(getKycMessage.IconCompatParcelizer(courseConfigV2NavDrawerItem, courseConfigV2NavDrawerItem2, courseConfigV2NavDrawerItem4, courseConfigV2NavDrawerItem6));
        HashMap mapIconCompatParcelizer = SubjectGroupTypeConstant.IconCompatParcelizer(4);
        mapIconCompatParcelizer.put(courseConfigV2NavDrawerItem2, 0);
        mapIconCompatParcelizer.put(courseConfigV2NavDrawerItem, 0);
        mapIconCompatParcelizer.put(courseConfigV2NavDrawerItem4, 1);
        mapIconCompatParcelizer.put(courseConfigV2NavDrawerItem3, 1);
        mapIconCompatParcelizer.put(courseConfigV2NavDrawerItem5, 2);
        Collections.unmodifiableMap(mapIconCompatParcelizer);
        write = courseConfigV2NavDrawerItem5;
        MediaBrowserCompatSearchResultReceiver = new getStartIndex() { // from class: o.CourseConfigV2NavDrawerItemFaq.3
            @Override // kotlin.getStartIndex
            public final getLink write() {
                throw new IllegalStateException("This method should not be called");
            }
        };
        AudioAttributesCompatParcelizer = new getStartIndex() { // from class: o.CourseConfigV2NavDrawerItemFaq.2
            @Override // kotlin.getStartIndex
            public final getLink write() {
                throw new IllegalStateException("This method should not be called");
            }
        };
        read = new getStartIndex() { // from class: o.CourseConfigV2NavDrawerItemFaq.5
            @Override // kotlin.getStartIndex
            public final getLink write() {
                throw new IllegalStateException("This method should not be called");
            }
        };
        Iterator it = ServiceLoader.load(isRootSubject.class, isRootSubject.class.getClassLoader()).iterator();
        RatingCompat = it.hasNext() ? (isRootSubject) it.next() : isRootSubject.write.read;
        MediaMetadataCompat = new HashMap();
        RemoteActionCompatParcelizer(courseConfigV2NavDrawerItem);
        RemoteActionCompatParcelizer(courseConfigV2NavDrawerItem2);
        RemoteActionCompatParcelizer(courseConfigV2NavDrawerItem3);
        RemoteActionCompatParcelizer(courseConfigV2NavDrawerItem4);
        RemoteActionCompatParcelizer(courseConfigV2NavDrawerItem5);
        RemoteActionCompatParcelizer(courseConfigV2NavDrawerItem6);
        RemoteActionCompatParcelizer(courseConfigV2NavDrawerItem7);
        RemoteActionCompatParcelizer(courseConfigV2NavDrawerItem8);
        RemoteActionCompatParcelizer(courseConfigV2NavDrawerItem9);
    }

    public static boolean AudioAttributesCompatParcelizer(getSubText getsubtext, getVariant getvariant, boolean z) {
        if (getsubtext == null) {
            AudioAttributesCompatParcelizer(2);
        }
        if (getvariant == null) {
            AudioAttributesCompatParcelizer(3);
        }
        return IconCompatParcelizer(AudioAttributesCompatParcelizer, getsubtext, getvariant, false) == null;
    }

    public static boolean AudioAttributesCompatParcelizer(getVariant getvariant, getVariant getvariant2) {
        if (getvariant == null) {
            AudioAttributesCompatParcelizer(6);
        }
        if (getvariant2 == null) {
            AudioAttributesCompatParcelizer(7);
        }
        CourseConfigV2VideoPageItem courseConfigV2VideoPageItemIconCompatParcelizer = getAnswerDescription.IconCompatParcelizer(getvariant2);
        if (courseConfigV2VideoPageItemIconCompatParcelizer != CourseConfigV2VideoPageItem.read) {
            return courseConfigV2VideoPageItemIconCompatParcelizer.equals(getAnswerDescription.IconCompatParcelizer(getvariant));
        }
        return false;
    }

    private static getSubText IconCompatParcelizer(getStartIndex getstartindex, getSubText getsubtext, getVariant getvariant, boolean z) {
        getSubText getsubtextIconCompatParcelizer;
        if (getsubtext == null) {
            AudioAttributesCompatParcelizer(8);
        }
        if (getvariant == null) {
            AudioAttributesCompatParcelizer(9);
        }
        for (getSubText getsubtext2 = (getSubText) getsubtext.onAddQueueItem(); getsubtext2 != null && getsubtext2.onCustomAction() != AudioAttributesImplApi21Parcelizer; getsubtext2 = (getSubText) getAnswerDescription.AudioAttributesCompatParcelizer(getsubtext2, getSubText.class)) {
            if (!getsubtext2.onCustomAction().IconCompatParcelizer(getstartindex, getsubtext2, getvariant, z)) {
                return getsubtext2;
            }
        }
        if (!(getsubtext instanceof SchemaUserStatus) || (getsubtextIconCompatParcelizer = IconCompatParcelizer(getstartindex, ((SchemaUserStatus) getsubtext).MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(), getvariant, z)) == null) {
            return null;
        }
        return getsubtextIconCompatParcelizer;
    }

    public static Integer IconCompatParcelizer(CourseConfigV2NavDrawerItemFreeExtension courseConfigV2NavDrawerItemFreeExtension, CourseConfigV2NavDrawerItemFreeExtension courseConfigV2NavDrawerItemFreeExtension2) {
        if (courseConfigV2NavDrawerItemFreeExtension == null) {
            AudioAttributesCompatParcelizer(12);
        }
        if (courseConfigV2NavDrawerItemFreeExtension2 == null) {
            AudioAttributesCompatParcelizer(13);
        }
        Integer numWrite = courseConfigV2NavDrawerItemFreeExtension.write(courseConfigV2NavDrawerItemFreeExtension2);
        if (numWrite != null) {
            return numWrite;
        }
        Integer numWrite2 = courseConfigV2NavDrawerItemFreeExtension2.write(courseConfigV2NavDrawerItemFreeExtension);
        if (numWrite2 != null) {
            return Integer.valueOf(-numWrite2.intValue());
        }
        return null;
    }

    public static boolean write(CourseConfigV2NavDrawerItemFreeExtension courseConfigV2NavDrawerItemFreeExtension) {
        if (courseConfigV2NavDrawerItemFreeExtension == null) {
            AudioAttributesCompatParcelizer(14);
        }
        return courseConfigV2NavDrawerItemFreeExtension == AudioAttributesImplBaseParcelizer || courseConfigV2NavDrawerItemFreeExtension == MediaBrowserCompatCustomActionResultReceiver;
    }

    private static void RemoteActionCompatParcelizer(CourseConfigV2NavDrawerItemFreeExtension courseConfigV2NavDrawerItemFreeExtension) {
        MediaMetadataCompat.put(courseConfigV2NavDrawerItemFreeExtension.AudioAttributesCompatParcelizer(), courseConfigV2NavDrawerItemFreeExtension);
    }

    public static CourseConfigV2NavDrawerItemFreeExtension AudioAttributesCompatParcelizer(DataSet dataSet) {
        if (dataSet == null) {
            AudioAttributesCompatParcelizer(15);
        }
        CourseConfigV2NavDrawerItemFreeExtension courseConfigV2NavDrawerItemFreeExtension = MediaMetadataCompat.get(dataSet);
        if (courseConfigV2NavDrawerItemFreeExtension == null) {
            throw new IllegalArgumentException("Inapplicable visibility: ".concat(String.valueOf(dataSet)));
        }
        if (courseConfigV2NavDrawerItemFreeExtension == null) {
            AudioAttributesCompatParcelizer(16);
        }
        return courseConfigV2NavDrawerItemFreeExtension;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ void AudioAttributesCompatParcelizer(int r8) {
        /*
            r0 = 16
            if (r8 == r0) goto L7
            java.lang.String r1 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            goto L9
        L7:
            java.lang.String r1 = "@NotNull method %s.%s must not return null"
        L9:
            r2 = 3
            r3 = 2
            if (r8 == r0) goto Lf
            r4 = r2
            goto L10
        Lf:
            r4 = r3
        L10:
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.String r5 = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities"
            r6 = 1
            r7 = 0
            if (r8 == r6) goto L3a
            if (r8 == r2) goto L3a
            r2 = 5
            if (r8 == r2) goto L3a
            r2 = 7
            if (r8 == r2) goto L3a
            switch(r8) {
                case 9: goto L3a;
                case 10: goto L35;
                case 11: goto L30;
                case 12: goto L35;
                case 13: goto L30;
                case 14: goto L2b;
                case 15: goto L2b;
                case 16: goto L28;
                default: goto L23;
            }
        L23:
            java.lang.String r2 = "what"
            r4[r7] = r2
            goto L3e
        L28:
            r4[r7] = r5
            goto L3e
        L2b:
            java.lang.String r2 = "visibility"
            r4[r7] = r2
            goto L3e
        L30:
            java.lang.String r2 = "second"
            r4[r7] = r2
            goto L3e
        L35:
            java.lang.String r2 = "first"
            r4[r7] = r2
            goto L3e
        L3a:
            java.lang.String r2 = "from"
            r4[r7] = r2
        L3e:
            java.lang.String r2 = "toDescriptorVisibility"
            if (r8 == r0) goto L45
            r4[r6] = r5
            goto L47
        L45:
            r4[r6] = r2
        L47:
            switch(r8) {
                case 2: goto L70;
                case 3: goto L70;
                case 4: goto L6b;
                case 5: goto L6b;
                case 6: goto L66;
                case 7: goto L66;
                case 8: goto L61;
                case 9: goto L61;
                case 10: goto L5c;
                case 11: goto L5c;
                case 12: goto L57;
                case 13: goto L57;
                case 14: goto L52;
                case 15: goto L4f;
                case 16: goto L74;
                default: goto L4a;
            }
        L4a:
            java.lang.String r2 = "isVisible"
            r4[r3] = r2
            goto L74
        L4f:
            r4[r3] = r2
            goto L74
        L52:
            java.lang.String r2 = "isPrivate"
            r4[r3] = r2
            goto L74
        L57:
            java.lang.String r2 = "compare"
            r4[r3] = r2
            goto L74
        L5c:
            java.lang.String r2 = "compareLocal"
            r4[r3] = r2
            goto L74
        L61:
            java.lang.String r2 = "findInvisibleMember"
            r4[r3] = r2
            goto L74
        L66:
            java.lang.String r2 = "inSameFile"
            r4[r3] = r2
            goto L74
        L6b:
            java.lang.String r2 = "isVisibleWithAnyReceiver"
            r4[r3] = r2
            goto L74
        L70:
            java.lang.String r2 = "isVisibleIgnoringReceiver"
            r4[r3] = r2
        L74:
            java.lang.String r1 = java.lang.String.format(r1, r4)
            if (r8 == r0) goto L80
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            r8.<init>(r1)
            goto L85
        L80:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>(r1)
        L85:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.CourseConfigV2NavDrawerItemFaq.AudioAttributesCompatParcelizer(int):void");
    }
}
