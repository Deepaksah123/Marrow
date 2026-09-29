package kotlin;

import java.util.List;
import java.util.Map;
import kotlin.getQuote;
import kotlin.getTestHeaderTitle;
import kotlin.getVideoPageNotesTitle;

/* JADX INFO: loaded from: classes4.dex */
public final class setUserInitiatedExamStartedOn extends getAttemptedCount implements setExpiredOn {
    private final boolean RemoteActionCompatParcelizer;
    private IconCompatParcelizer write;
    public static final getVideoPageNotesTitle.RemoteActionCompatParcelizer<getMeta> read = new getVideoPageNotesTitle.RemoteActionCompatParcelizer<getMeta>() { // from class: o.setUserInitiatedExamStartedOn.2
    };
    public static final getVideoPageNotesTitle.RemoteActionCompatParcelizer<Boolean> IconCompatParcelizer = new getVideoPageNotesTitle.RemoteActionCompatParcelizer<Boolean>() { // from class: o.setUserInitiatedExamStartedOn.5
    };

    enum IconCompatParcelizer {
        NON_STABLE_DECLARED(false, false),
        STABLE_DECLARED(true, false),
        NON_STABLE_SYNTHESIZED(false, true),
        STABLE_SYNTHESIZED(true, true);

        public final boolean RemoteActionCompatParcelizer;
        public final boolean write;

        IconCompatParcelizer(boolean z, boolean z2) {
            this.RemoteActionCompatParcelizer = z;
            this.write = z2;
        }

        public static IconCompatParcelizer RemoteActionCompatParcelizer(boolean z, boolean z2) {
            IconCompatParcelizer iconCompatParcelizer;
            if (z) {
                iconCompatParcelizer = z2 ? STABLE_SYNTHESIZED : STABLE_DECLARED;
            } else {
                iconCompatParcelizer = z2 ? NON_STABLE_SYNTHESIZED : NON_STABLE_DECLARED;
            }
            if (iconCompatParcelizer == null) {
                IconCompatParcelizer();
            }
            return iconCompatParcelizer;
        }

        private static /* synthetic */ void IconCompatParcelizer() {
            throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor$ParameterNamesStatus", "get"));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private setUserInitiatedExamStartedOn(getVariant getvariant, CourseConfigV2SupportItem courseConfigV2SupportItem, getQuote getquote, getRelatedLessonId getrelatedlessonid, getTestHeaderTitle.RemoteActionCompatParcelizer remoteActionCompatParcelizer, getIntroDurationSeconds getintrodurationseconds, boolean z) {
        super(getvariant, courseConfigV2SupportItem, getquote, getrelatedlessonid, remoteActionCompatParcelizer, getintrodurationseconds);
        if (getvariant == null) {
            AudioAttributesCompatParcelizer(0);
        }
        if (getquote == null) {
            AudioAttributesCompatParcelizer(1);
        }
        if (getrelatedlessonid == null) {
            AudioAttributesCompatParcelizer(2);
        }
        if (remoteActionCompatParcelizer == null) {
            AudioAttributesCompatParcelizer(3);
        }
        if (getintrodurationseconds == null) {
            AudioAttributesCompatParcelizer(4);
        }
        this.write = null;
        this.RemoteActionCompatParcelizer = z;
    }

    public static setUserInitiatedExamStartedOn RemoteActionCompatParcelizer(getVariant getvariant, getQuote getquote, getRelatedLessonId getrelatedlessonid, getIntroDurationSeconds getintrodurationseconds, boolean z) {
        if (getvariant == null) {
            AudioAttributesCompatParcelizer(5);
        }
        if (getquote == null) {
            AudioAttributesCompatParcelizer(6);
        }
        if (getrelatedlessonid == null) {
            AudioAttributesCompatParcelizer(7);
        }
        if (getintrodurationseconds == null) {
            AudioAttributesCompatParcelizer(8);
        }
        return new setUserInitiatedExamStartedOn(getvariant, null, getquote, getrelatedlessonid, getTestHeaderTitle.RemoteActionCompatParcelizer.DECLARATION, getintrodurationseconds, z);
    }

    @Override // kotlin.getAttemptedCount
    public final getAttemptedCount read(CourseConfigV2TestTabItem courseConfigV2TestTabItem, CourseConfigV2TestTabItem courseConfigV2TestTabItem2, List<CourseConfigV2TestTabItem> list, List<? extends getBadgeText> list2, List<getMeta> list3, getLink getlink, CourseConfigV2NavDrawerItems courseConfigV2NavDrawerItems, CourseConfigV2NavDrawerItemFreeExtension courseConfigV2NavDrawerItemFreeExtension, Map<? extends getVideoPageNotesTitle.RemoteActionCompatParcelizer<?>, ?> map) {
        if (list == null) {
            AudioAttributesCompatParcelizer(9);
        }
        if (list2 == null) {
            AudioAttributesCompatParcelizer(10);
        }
        if (list3 == null) {
            AudioAttributesCompatParcelizer(11);
        }
        if (courseConfigV2NavDrawerItemFreeExtension == null) {
            AudioAttributesCompatParcelizer(12);
        }
        getAttemptedCount getattemptedcount = super.read(courseConfigV2TestTabItem, courseConfigV2TestTabItem2, list, list2, list3, getlink, courseConfigV2NavDrawerItems, courseConfigV2NavDrawerItemFreeExtension, map);
        AudioAttributesImplBaseParcelizer(setVideoUpdatedTime.AudioAttributesCompatParcelizer.write(getattemptedcount).AudioAttributesCompatParcelizer());
        if (getattemptedcount == null) {
            AudioAttributesCompatParcelizer(13);
        }
        return getattemptedcount;
    }

    @Override // kotlin.getIntegerMap
    public final boolean onRewind() {
        return this.write.RemoteActionCompatParcelizer;
    }

    @Override // kotlin.getIntegerMap, kotlin.getVideoPageNotesTitle
    public final boolean MediaBrowserCompatSearchResultReceiver() {
        return this.write.write;
    }

    public final void RemoteActionCompatParcelizer(boolean z, boolean z2) {
        this.write = IconCompatParcelizer.RemoteActionCompatParcelizer(z, z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.getAttemptedCount, kotlin.getIntegerMap
    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
    public setUserInitiatedExamStartedOn read(getVariant getvariant, CourseConfigV2NavDrawerItemRateUs courseConfigV2NavDrawerItemRateUs, getTestHeaderTitle.RemoteActionCompatParcelizer remoteActionCompatParcelizer, getRelatedLessonId getrelatedlessonid, getQuote getquote, getIntroDurationSeconds getintrodurationseconds) {
        if (getvariant == null) {
            AudioAttributesCompatParcelizer(14);
        }
        if (remoteActionCompatParcelizer == null) {
            AudioAttributesCompatParcelizer(15);
        }
        if (getquote == null) {
            AudioAttributesCompatParcelizer(16);
        }
        if (getintrodurationseconds == null) {
            AudioAttributesCompatParcelizer(17);
        }
        CourseConfigV2SupportItem courseConfigV2SupportItem = (CourseConfigV2SupportItem) courseConfigV2NavDrawerItemRateUs;
        if (getrelatedlessonid == null) {
            getrelatedlessonid = aQ_();
        }
        setUserInitiatedExamStartedOn setuserinitiatedexamstartedon = new setUserInitiatedExamStartedOn(getvariant, courseConfigV2SupportItem, getquote, getrelatedlessonid, remoteActionCompatParcelizer, getintrodurationseconds, this.RemoteActionCompatParcelizer);
        setuserinitiatedexamstartedon.RemoteActionCompatParcelizer(onRewind(), MediaBrowserCompatSearchResultReceiver());
        return setuserinitiatedexamstartedon;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.setExpiredOn
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public setUserInitiatedExamStartedOn AudioAttributesCompatParcelizer(getLink getlink, List<getLink> list, getLink getlink2, Pair<getVideoPageNotesTitle.RemoteActionCompatParcelizer<?>, ?> pair) {
        CourseConfigV2TestTabItem courseConfigV2TestTabItemAudioAttributesCompatParcelizer;
        if (list == null) {
            AudioAttributesCompatParcelizer(19);
        }
        if (getlink2 == null) {
            AudioAttributesCompatParcelizer(20);
        }
        List<getMeta> list2 = getIncludeUntagged.read(list, aX_(), this);
        if (getlink == null) {
            courseConfigV2TestTabItemAudioAttributesCompatParcelizer = null;
        } else {
            getQuote.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = getQuote.IconCompatParcelizer;
            courseConfigV2TestTabItemAudioAttributesCompatParcelizer = getOption2.AudioAttributesCompatParcelizer(this, getlink, getQuote.AudioAttributesCompatParcelizer.read());
        }
        setUserInitiatedExamStartedOn setuserinitiatedexamstartedon = (setUserInitiatedExamStartedOn) onRemoveQueueItemAt().AudioAttributesCompatParcelizer(list2).AudioAttributesCompatParcelizer(getlink2).write(courseConfigV2TestTabItemAudioAttributesCompatParcelizer).read().AudioAttributesCompatParcelizer().IconCompatParcelizer();
        if (pair != null) {
            setuserinitiatedexamstartedon.AudioAttributesCompatParcelizer(pair.write(), pair.IconCompatParcelizer());
        }
        if (setuserinitiatedexamstartedon == null) {
            AudioAttributesCompatParcelizer(21);
        }
        return setuserinitiatedexamstartedon;
    }

    private static /* synthetic */ void AudioAttributesCompatParcelizer(int i) {
        String str = (i == 13 || i == 18 || i == 21) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 13 || i == 18 || i == 21) ? 2 : 3];
        switch (i) {
            case 1:
            case 6:
            case 16:
                objArr[0] = "annotations";
                break;
            case 2:
            case 7:
                objArr[0] = "name";
                break;
            case 3:
            case 15:
                objArr[0] = "kind";
                break;
            case 4:
            case 8:
            case 17:
                objArr[0] = "source";
                break;
            case 5:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 9:
                objArr[0] = "contextReceiverParameters";
                break;
            case 10:
                objArr[0] = "typeParameters";
                break;
            case 11:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 12:
                objArr[0] = "visibility";
                break;
            case 13:
            case 18:
            case 21:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor";
                break;
            case 14:
                objArr[0] = "newOwner";
                break;
            case 19:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case 20:
                objArr[0] = "enhancedReturnType";
                break;
        }
        if (i == 13) {
            objArr[1] = "initialize";
        } else if (i == 18) {
            objArr[1] = "createSubstitutedCopy";
        } else if (i != 21) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i) {
            case 5:
            case 6:
            case 7:
            case 8:
                objArr[2] = "createJavaMethod";
                break;
            case 9:
            case 10:
            case 11:
            case 12:
                objArr[2] = "initialize";
                break;
            case 13:
            case 18:
            case 21:
                break;
            case 14:
            case 15:
            case 16:
            case 17:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 19:
            case 20:
                objArr[2] = "enhance";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 13 && i != 18 && i != 21) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }
}
