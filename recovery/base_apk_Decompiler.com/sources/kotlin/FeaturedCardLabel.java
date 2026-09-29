package kotlin;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class FeaturedCardLabel extends getStringArrayMap {
    private final PageValue<CourseConfigV2TestTabItem> AudioAttributesCompatParcelizer;
    protected final PageValue<getHref> RemoteActionCompatParcelizer;
    private final getRelatedLessonId read;
    private final PageValue<setTags> write;

    @Override // kotlin.getStringArrayMap, kotlin.getVariant
    /* JADX INFO: renamed from: onPrepareFromMediaId, reason: merged with bridge method [inline-methods] */
    public final CourseConfigV2CustomModuleQuestionSource onAddQueueItem() {
        return this;
    }

    public FeaturedCardLabel(getMini getmini, getRelatedLessonId getrelatedlessonid) {
        if (getmini == null) {
            RemoteActionCompatParcelizer(0);
        }
        if (getrelatedlessonid == null) {
            RemoteActionCompatParcelizer(1);
        }
        this.read = getrelatedlessonid;
        this.RemoteActionCompatParcelizer = getmini.read(new getCreatedOnDateMs<getHref>() { // from class: o.FeaturedCardLabel.3
            /* JADX INFO: Access modifiers changed from: private */
            @Override // kotlin.getCreatedOnDateMs
            /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
            public getHref invoke() {
                FeaturedCardLabel featuredCardLabel = FeaturedCardLabel.this;
                return setPlanAddOns.RemoteActionCompatParcelizer(featuredCardLabel, featuredCardLabel.onRemoveQueueItem(), new getAnswerMap<getCheapestPlan, getHref>() { // from class: o.FeaturedCardLabel.3.5
                    /* JADX INFO: Access modifiers changed from: private */
                    @Override // kotlin.getAnswerMap
                    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
                    public getHref invoke(getCheapestPlan getcheapestplan) {
                        getcheapestplan.write(FeaturedCardLabel.this);
                        return FeaturedCardLabel.this.RemoteActionCompatParcelizer.invoke();
                    }
                });
            }
        });
        this.write = getmini.read(new getCreatedOnDateMs<setTags>() { // from class: o.FeaturedCardLabel.2
            /* JADX INFO: Access modifiers changed from: private */
            @Override // kotlin.getCreatedOnDateMs
            /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
            public setTags invoke() {
                return new McqIndexMini(FeaturedCardLabel.this.onRemoveQueueItem());
            }
        });
        this.AudioAttributesCompatParcelizer = getmini.read(new getCreatedOnDateMs<CourseConfigV2TestTabItem>() { // from class: o.FeaturedCardLabel.5
            /* JADX INFO: Access modifiers changed from: private */
            @Override // kotlin.getCreatedOnDateMs
            /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
            public CourseConfigV2TestTabItem invoke() {
                return new getStringArray(FeaturedCardLabel.this);
            }
        });
    }

    @Override // kotlin.getEmptyBuyPlanText
    public final getRelatedLessonId aQ_() {
        getRelatedLessonId getrelatedlessonid = this.read;
        if (getrelatedlessonid == null) {
            RemoteActionCompatParcelizer(2);
        }
        return getrelatedlessonid;
    }

    @Override // kotlin.CourseConfigV2CustomModuleQuestionSource
    public setTags onSeekTo() {
        setTags settagsInvoke = this.write.invoke();
        if (settagsInvoke == null) {
            RemoteActionCompatParcelizer(4);
        }
        return settagsInvoke;
    }

    @Override // kotlin.CourseConfigV2CustomModuleQuestionSource
    public final CourseConfigV2TestTabItem onPlayFromSearch() {
        CourseConfigV2TestTabItem courseConfigV2TestTabItemInvoke = this.AudioAttributesCompatParcelizer.invoke();
        if (courseConfigV2TestTabItemInvoke == null) {
            RemoteActionCompatParcelizer(5);
        }
        return courseConfigV2TestTabItemInvoke;
    }

    @Override // kotlin.CourseConfigV2CustomModuleQuestionSource
    public List<CourseConfigV2TestTabItem> onPrepare() {
        List<CourseConfigV2TestTabItem> listEmptyList = Collections.emptyList();
        if (listEmptyList == null) {
            RemoteActionCompatParcelizer(6);
        }
        return listEmptyList;
    }

    @Override // kotlin.getStringArrayMap
    public setTags write(isVideoPlanCtype isvideoplanctype, getCheapestPlan getcheapestplan) {
        if (isvideoplanctype == null) {
            RemoteActionCompatParcelizer(10);
        }
        if (getcheapestplan == null) {
            RemoteActionCompatParcelizer(11);
        }
        if (!isvideoplanctype.read()) {
            return new setMcqEncrypt(IconCompatParcelizer(getcheapestplan), setDesriptionList.RemoteActionCompatParcelizer(isvideoplanctype));
        }
        setTags settagsIconCompatParcelizer = IconCompatParcelizer(getcheapestplan);
        if (settagsIconCompatParcelizer == null) {
            RemoteActionCompatParcelizer(12);
        }
        return settagsIconCompatParcelizer;
    }

    @Override // kotlin.CourseConfigV2CustomModuleQuestionSource
    public final setTags write(isVideoPlanCtype isvideoplanctype) {
        if (isvideoplanctype == null) {
            RemoteActionCompatParcelizer(15);
        }
        setTags settagsWrite = write(isvideoplanctype, setLocked.write(getAnswerDescription.AudioAttributesCompatParcelizer(this)));
        if (settagsWrite == null) {
            RemoteActionCompatParcelizer(16);
        }
        return settagsWrite;
    }

    @Override // kotlin.CourseConfigV2CustomModuleQuestionSource
    public setTags onRemoveQueueItem() {
        setTags settagsIconCompatParcelizer = IconCompatParcelizer(setLocked.write(getAnswerDescription.AudioAttributesCompatParcelizer(this)));
        if (settagsIconCompatParcelizer == null) {
            RemoteActionCompatParcelizer(17);
        }
        return settagsIconCompatParcelizer;
    }

    @Override // kotlin.CourseConfigV2VideoItem
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public CourseConfigV2CustomModuleQuestionSource write(setDesriptionList setdesriptionlist) {
        if (setdesriptionlist == null) {
            RemoteActionCompatParcelizer(18);
        }
        return setdesriptionlist.read() ? this : new Schema(this, setdesriptionlist);
    }

    @Override // kotlin.CourseConfigV2CustomModuleQuestionSource, kotlin.getQuestionLimit
    public final getHref aP_() {
        getHref gethrefInvoke = this.RemoteActionCompatParcelizer.invoke();
        if (gethrefInvoke == null) {
            RemoteActionCompatParcelizer(20);
        }
        return gethrefInvoke;
    }

    @Override // kotlin.getVariant
    public final <R, D> R AudioAttributesCompatParcelizer(CourseConfigV2NavDrawerItemAddVideo<R, D> courseConfigV2NavDrawerItemAddVideo, D d) {
        return courseConfigV2NavDrawerItemAddVideo.write(this, d);
    }

    private static /* synthetic */ void RemoteActionCompatParcelizer(int i) {
        String str = (i == 2 || i == 3 || i == 4 || i == 5 || i == 6 || i == 9 || i == 12 || i == 14 || i == 16 || i == 17 || i == 19 || i == 20) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 2 || i == 3 || i == 4 || i == 5 || i == 6 || i == 9 || i == 12 || i == 14 || i == 16 || i == 17 || i == 19 || i == 20) ? 2 : 3];
        switch (i) {
            case 1:
                objArr[0] = "name";
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            case 17:
            case 19:
            case 20:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractClassDescriptor";
                break;
            case 7:
            case 13:
                objArr[0] = "typeArguments";
                break;
            case 8:
            case 11:
                objArr[0] = "kotlinTypeRefiner";
                break;
            case 10:
            case 15:
                objArr[0] = "typeSubstitution";
                break;
            case 18:
                objArr[0] = "substitutor";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        if (i == 2) {
            objArr[1] = "getName";
        } else if (i == 3) {
            objArr[1] = "getOriginal";
        } else if (i == 4) {
            objArr[1] = "getUnsubstitutedInnerClassesScope";
        } else if (i == 5) {
            objArr[1] = "getThisAsReceiverParameter";
        } else if (i == 6) {
            objArr[1] = "getContextReceivers";
        } else if (i == 9 || i == 12 || i == 14 || i == 16) {
            objArr[1] = "getMemberScope";
        } else if (i == 17) {
            objArr[1] = "getUnsubstitutedMemberScope";
        } else if (i == 19) {
            objArr[1] = "substitute";
        } else if (i != 20) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractClassDescriptor";
        } else {
            objArr[1] = "getDefaultType";
        }
        switch (i) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            case 17:
            case 19:
            case 20:
                break;
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
                objArr[2] = "getMemberScope";
                break;
            case 18:
                objArr[2] = "substitute";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 2 && i != 3 && i != 4 && i != 5 && i != 6 && i != 9 && i != 12 && i != 14 && i != 16 && i != 17 && i != 19 && i != 20) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }
}
