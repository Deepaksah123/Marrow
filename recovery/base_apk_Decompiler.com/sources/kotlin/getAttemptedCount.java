package kotlin;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.CourseConfigV2NavDrawerItemRateUs;
import kotlin.getTestHeaderTitle;
import kotlin.getVideoPageNotesTitle;

/* JADX INFO: loaded from: classes4.dex */
public class getAttemptedCount extends getIntegerMap implements CourseConfigV2SupportItem {
    @Override // kotlin.getIntegerMap, kotlin.getTestHeaderTitle
    public /* synthetic */ getTestHeaderTitle write(getVariant getvariant, CourseConfigV2NavDrawerItems courseConfigV2NavDrawerItems, CourseConfigV2NavDrawerItemFreeExtension courseConfigV2NavDrawerItemFreeExtension, getTestHeaderTitle.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        return AudioAttributesCompatParcelizer(getvariant, courseConfigV2NavDrawerItems, courseConfigV2NavDrawerItemFreeExtension, remoteActionCompatParcelizer, false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getAttemptedCount(getVariant getvariant, CourseConfigV2SupportItem courseConfigV2SupportItem, getQuote getquote, getRelatedLessonId getrelatedlessonid, getTestHeaderTitle.RemoteActionCompatParcelizer remoteActionCompatParcelizer, getIntroDurationSeconds getintrodurationseconds) {
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
    }

    public static getAttemptedCount read(getVariant getvariant, getQuote getquote, getRelatedLessonId getrelatedlessonid, getTestHeaderTitle.RemoteActionCompatParcelizer remoteActionCompatParcelizer, getIntroDurationSeconds getintrodurationseconds) {
        if (getvariant == null) {
            AudioAttributesCompatParcelizer(5);
        }
        if (getquote == null) {
            AudioAttributesCompatParcelizer(6);
        }
        if (getrelatedlessonid == null) {
            AudioAttributesCompatParcelizer(7);
        }
        if (remoteActionCompatParcelizer == null) {
            AudioAttributesCompatParcelizer(8);
        }
        if (getintrodurationseconds == null) {
            AudioAttributesCompatParcelizer(9);
        }
        return new getAttemptedCount(getvariant, null, getquote, getrelatedlessonid, remoteActionCompatParcelizer, getintrodurationseconds);
    }

    @Override // kotlin.getIntegerMap
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final getAttemptedCount read(CourseConfigV2TestTabItem courseConfigV2TestTabItem, CourseConfigV2TestTabItem courseConfigV2TestTabItem2, List<CourseConfigV2TestTabItem> list, List<? extends getBadgeText> list2, List<getMeta> list3, getLink getlink, CourseConfigV2NavDrawerItems courseConfigV2NavDrawerItems, CourseConfigV2NavDrawerItemFreeExtension courseConfigV2NavDrawerItemFreeExtension) {
        if (list == null) {
            AudioAttributesCompatParcelizer(14);
        }
        if (list2 == null) {
            AudioAttributesCompatParcelizer(15);
        }
        if (list3 == null) {
            AudioAttributesCompatParcelizer(16);
        }
        if (courseConfigV2NavDrawerItemFreeExtension == null) {
            AudioAttributesCompatParcelizer(17);
        }
        getAttemptedCount getattemptedcount = read(courseConfigV2TestTabItem, courseConfigV2TestTabItem2, list, list2, list3, getlink, courseConfigV2NavDrawerItems, courseConfigV2NavDrawerItemFreeExtension, null);
        if (getattemptedcount == null) {
            AudioAttributesCompatParcelizer(18);
        }
        return getattemptedcount;
    }

    public getAttemptedCount read(CourseConfigV2TestTabItem courseConfigV2TestTabItem, CourseConfigV2TestTabItem courseConfigV2TestTabItem2, List<CourseConfigV2TestTabItem> list, List<? extends getBadgeText> list2, List<getMeta> list3, getLink getlink, CourseConfigV2NavDrawerItems courseConfigV2NavDrawerItems, CourseConfigV2NavDrawerItemFreeExtension courseConfigV2NavDrawerItemFreeExtension, Map<? extends getVideoPageNotesTitle.RemoteActionCompatParcelizer<?>, ?> map) {
        if (list == null) {
            AudioAttributesCompatParcelizer(19);
        }
        if (list2 == null) {
            AudioAttributesCompatParcelizer(20);
        }
        if (list3 == null) {
            AudioAttributesCompatParcelizer(21);
        }
        if (courseConfigV2NavDrawerItemFreeExtension == null) {
            AudioAttributesCompatParcelizer(22);
        }
        super.read(courseConfigV2TestTabItem, courseConfigV2TestTabItem2, list, list2, list3, getlink, courseConfigV2NavDrawerItems, courseConfigV2NavDrawerItemFreeExtension);
        if (map != null && !map.isEmpty()) {
            ((getIntegerMap) this).AudioAttributesCompatParcelizer = new LinkedHashMap(map);
        }
        return this;
    }

    @Override // kotlin.getIntegerMap, kotlin.CourseConfigV2NavDrawerItemRateUs
    /* JADX INFO: renamed from: MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final CourseConfigV2SupportItem onPrepareFromMediaId() {
        CourseConfigV2SupportItem courseConfigV2SupportItem = (CourseConfigV2SupportItem) super.onPrepareFromMediaId();
        if (courseConfigV2SupportItem == null) {
            AudioAttributesCompatParcelizer(24);
        }
        return courseConfigV2SupportItem;
    }

    @Override // kotlin.getIntegerMap
    protected getIntegerMap read(getVariant getvariant, CourseConfigV2NavDrawerItemRateUs courseConfigV2NavDrawerItemRateUs, getTestHeaderTitle.RemoteActionCompatParcelizer remoteActionCompatParcelizer, getRelatedLessonId getrelatedlessonid, getQuote getquote, getIntroDurationSeconds getintrodurationseconds) {
        if (getvariant == null) {
            AudioAttributesCompatParcelizer(25);
        }
        if (remoteActionCompatParcelizer == null) {
            AudioAttributesCompatParcelizer(26);
        }
        if (getquote == null) {
            AudioAttributesCompatParcelizer(27);
        }
        if (getintrodurationseconds == null) {
            AudioAttributesCompatParcelizer(28);
        }
        CourseConfigV2SupportItem courseConfigV2SupportItem = (CourseConfigV2SupportItem) courseConfigV2NavDrawerItemRateUs;
        if (getrelatedlessonid == null) {
            getrelatedlessonid = aQ_();
        }
        return new getAttemptedCount(getvariant, courseConfigV2SupportItem, getquote, getrelatedlessonid, remoteActionCompatParcelizer, getintrodurationseconds);
    }

    @Override // kotlin.getIntegerMap
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public CourseConfigV2SupportItem AudioAttributesCompatParcelizer(getVariant getvariant, CourseConfigV2NavDrawerItems courseConfigV2NavDrawerItems, CourseConfigV2NavDrawerItemFreeExtension courseConfigV2NavDrawerItemFreeExtension, getTestHeaderTitle.RemoteActionCompatParcelizer remoteActionCompatParcelizer, boolean z) {
        CourseConfigV2SupportItem courseConfigV2SupportItem = (CourseConfigV2SupportItem) super.AudioAttributesCompatParcelizer(getvariant, courseConfigV2NavDrawerItems, courseConfigV2NavDrawerItemFreeExtension, remoteActionCompatParcelizer, z);
        if (courseConfigV2SupportItem == null) {
            AudioAttributesCompatParcelizer(29);
        }
        return courseConfigV2SupportItem;
    }

    @Override // kotlin.getIntegerMap, kotlin.CourseConfigV2NavDrawerItemRateUs
    public CourseConfigV2NavDrawerItemRateUs.write<? extends CourseConfigV2SupportItem> onRemoveQueueItemAt() {
        CourseConfigV2NavDrawerItemRateUs.write writeVarOnRemoveQueueItemAt = super.onRemoveQueueItemAt();
        if (writeVarOnRemoveQueueItemAt == null) {
            AudioAttributesCompatParcelizer(30);
        }
        return writeVarOnRemoveQueueItemAt;
    }

    private static /* synthetic */ void AudioAttributesCompatParcelizer(int i) {
        String str = (i == 13 || i == 18 || i == 23 || i == 24 || i == 29 || i == 30) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 13 || i == 18 || i == 23 || i == 24 || i == 29 || i == 30) ? 2 : 3];
        switch (i) {
            case 1:
            case 6:
            case 27:
                objArr[0] = "annotations";
                break;
            case 2:
            case 7:
                objArr[0] = "name";
                break;
            case 3:
            case 8:
            case 26:
                objArr[0] = "kind";
                break;
            case 4:
            case 9:
            case 28:
                objArr[0] = "source";
                break;
            case 5:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 10:
            case 15:
            case 20:
                objArr[0] = "typeParameters";
                break;
            case 11:
            case 16:
            case 21:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 12:
            case 17:
            case 22:
                objArr[0] = "visibility";
                break;
            case 13:
            case 18:
            case 23:
            case 24:
            case 29:
            case 30:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/SimpleFunctionDescriptorImpl";
                break;
            case 14:
            case 19:
                objArr[0] = "contextReceiverParameters";
                break;
            case 25:
                objArr[0] = "newOwner";
                break;
        }
        if (i == 13 || i == 18 || i == 23) {
            objArr[1] = "initialize";
        } else if (i == 24) {
            objArr[1] = "getOriginal";
        } else if (i == 29) {
            objArr[1] = "copy";
        } else if (i != 30) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/SimpleFunctionDescriptorImpl";
        } else {
            objArr[1] = "newCopyBuilder";
        }
        switch (i) {
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                objArr[2] = "create";
                break;
            case 10:
            case 11:
            case 12:
            case 14:
            case 15:
            case 16:
            case 17:
            case 19:
            case 20:
            case 21:
            case 22:
                objArr[2] = "initialize";
                break;
            case 13:
            case 18:
            case 23:
            case 24:
            case 29:
            case 30:
                break;
            case 25:
            case 26:
            case 27:
            case 28:
                objArr[2] = "createSubstitutedCopy";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 13 && i != 18 && i != 23 && i != 24 && i != 29 && i != 30) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }
}
