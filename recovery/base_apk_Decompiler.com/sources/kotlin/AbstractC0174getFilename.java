package kotlin;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.getGroupDescription;

/* JADX INFO: renamed from: o.getFilename, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC0174getFilename extends PresenterBundle implements getBadgeText {
    private final PageValue<getPlanAddOns> AudioAttributesCompatParcelizer;
    private final getTotalSubject AudioAttributesImplBaseParcelizer;
    private final PageValue<getHref> IconCompatParcelizer;
    private final boolean RemoteActionCompatParcelizer;
    private final int read;
    private final getMini write;

    @Override // kotlin.getBadgeText
    public final boolean MediaDescriptionCompat() {
        return false;
    }

    protected abstract void RemoteActionCompatParcelizer(getLink getlink);

    protected abstract List<getLink> onAddQueueItem();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected AbstractC0174getFilename(final getMini getmini, getVariant getvariant, getQuote getquote, final getRelatedLessonId getrelatedlessonid, getTotalSubject gettotalsubject, boolean z, int i, getIntroDurationSeconds getintrodurationseconds, final CourseConfigV2VideoSubjectPageItem courseConfigV2VideoSubjectPageItem) {
        super(getvariant, getquote, getrelatedlessonid, getintrodurationseconds);
        if (getmini == null) {
            write(0);
        }
        if (getvariant == null) {
            write(1);
        }
        if (getquote == null) {
            write(2);
        }
        if (getrelatedlessonid == null) {
            write(3);
        }
        if (gettotalsubject == null) {
            write(4);
        }
        if (getintrodurationseconds == null) {
            write(5);
        }
        if (courseConfigV2VideoSubjectPageItem == null) {
            write(6);
        }
        this.AudioAttributesImplBaseParcelizer = gettotalsubject;
        this.RemoteActionCompatParcelizer = z;
        this.read = i;
        this.AudioAttributesCompatParcelizer = getmini.read(new getCreatedOnDateMs<getPlanAddOns>() { // from class: o.getFilename.3
            /* JADX INFO: Access modifiers changed from: private */
            @Override // kotlin.getCreatedOnDateMs
            /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
            public getPlanAddOns invoke() {
                return new IconCompatParcelizer(AbstractC0174getFilename.this, getmini, courseConfigV2VideoSubjectPageItem);
            }
        });
        this.IconCompatParcelizer = getmini.read(new getCreatedOnDateMs<getHref>() { // from class: o.getFilename.2
            /* JADX INFO: Access modifiers changed from: private */
            @Override // kotlin.getCreatedOnDateMs
            /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
            public getHref invoke() {
                getGroupDescription.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = getGroupDescription.AudioAttributesCompatParcelizer;
                return AddOnMetaKt.RemoteActionCompatParcelizer(getGroupDescription.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(), AbstractC0174getFilename.this.MediaBrowserCompatSearchResultReceiver(), Collections.emptyList(), false, new McqIndexCompanion(new getCreatedOnDateMs<setTags>() { // from class: o.getFilename.2.3
                    /* JADX INFO: Access modifiers changed from: private */
                    @Override // kotlin.getCreatedOnDateMs
                    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
                    public setTags invoke() {
                        StringBuilder sb = new StringBuilder("Scope for type parameter ");
                        sb.append(getrelatedlessonid.AudioAttributesCompatParcelizer());
                        return getMcqEncrypt.AudioAttributesCompatParcelizer(sb.toString(), AbstractC0174getFilename.this.MediaBrowserCompatCustomActionResultReceiver());
                    }
                }));
            }
        });
        this.write = getmini;
    }

    @Override // kotlin.getBadgeText
    public final getTotalSubject MediaBrowserCompatMediaItem() {
        getTotalSubject gettotalsubject = this.AudioAttributesImplBaseParcelizer;
        if (gettotalsubject == null) {
            write(7);
        }
        return gettotalsubject;
    }

    @Override // kotlin.getBadgeText
    public final boolean aZ_() {
        return this.RemoteActionCompatParcelizer;
    }

    @Override // kotlin.getBadgeText
    public final int write() {
        return this.read;
    }

    @Override // kotlin.getBadgeText
    public final List<getLink> MediaBrowserCompatCustomActionResultReceiver() {
        List<getLink> listAV_ = ((IconCompatParcelizer) MediaBrowserCompatSearchResultReceiver()).aV_();
        if (listAV_ == null) {
            write(8);
        }
        return listAV_;
    }

    @Override // kotlin.getBadgeText, kotlin.getQuestionLimit
    public final getPlanAddOns MediaBrowserCompatSearchResultReceiver() {
        getPlanAddOns getplanaddonsInvoke = this.AudioAttributesCompatParcelizer.invoke();
        if (getplanaddonsInvoke == null) {
            write(9);
        }
        return getplanaddonsInvoke;
    }

    @Override // kotlin.getQuestionLimit
    public final getHref aP_() {
        getHref gethrefInvoke = this.IconCompatParcelizer.invoke();
        if (gethrefInvoke == null) {
            write(10);
        }
        return gethrefInvoke;
    }

    @Override // kotlin.PresenterBundle, kotlin.getBooleanMap, kotlin.getVariant
    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final getBadgeText onPrepareFromMediaId() {
        getBadgeText getbadgetext = (getBadgeText) super.onAddQueueItem();
        if (getbadgetext == null) {
            write(11);
        }
        return getbadgetext;
    }

    protected List<getLink> read(List<getLink> list) {
        if (list == null) {
            write(12);
        }
        if (list == null) {
            write(13);
        }
        return list;
    }

    @Override // kotlin.getVariant
    public final <R, D> R AudioAttributesCompatParcelizer(CourseConfigV2NavDrawerItemAddVideo<R, D> courseConfigV2NavDrawerItemAddVideo, D d) {
        return courseConfigV2NavDrawerItemAddVideo.read(this, d);
    }

    @Override // kotlin.getBadgeText
    public final getMini MediaBrowserCompatItemReceiver() {
        getMini getmini = this.write;
        if (getmini == null) {
            write(14);
        }
        return getmini;
    }

    private static /* synthetic */ void write(int i) {
        String str;
        int i2;
        switch (i) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 12:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                i2 = 2;
                break;
            case 12:
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "containingDeclaration";
                break;
            case 2:
                objArr[0] = "annotations";
                break;
            case 3:
                objArr[0] = "name";
                break;
            case 4:
                objArr[0] = "variance";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
                objArr[0] = "supertypeLoopChecker";
                break;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor";
                break;
            case 12:
                objArr[0] = "bounds";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        switch (i) {
            case 7:
                objArr[1] = "getVariance";
                break;
            case 8:
                objArr[1] = "getUpperBounds";
                break;
            case 9:
                objArr[1] = "getTypeConstructor";
                break;
            case 10:
                objArr[1] = "getDefaultType";
                break;
            case 11:
                objArr[1] = "getOriginal";
                break;
            case 12:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor";
                break;
            case 13:
                objArr[1] = "processBoundsWithoutCycles";
                break;
            case 14:
                objArr[1] = "getStorageManager";
                break;
        }
        switch (i) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                break;
            case 12:
                objArr[2] = "processBoundsWithoutCycles";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                throw new IllegalStateException(str2);
            case 12:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    /* JADX INFO: renamed from: o.getFilename$IconCompatParcelizer */
    class IconCompatParcelizer extends isHtmlPearl {
        private final CourseConfigV2VideoSubjectPageItem AudioAttributesCompatParcelizer;
        private /* synthetic */ AbstractC0174getFilename IconCompatParcelizer;

        @Override // kotlin.getPlanAddOns
        public final boolean AudioAttributesImplApi26Parcelizer() {
            return true;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IconCompatParcelizer(AbstractC0174getFilename abstractC0174getFilename, getMini getmini, CourseConfigV2VideoSubjectPageItem courseConfigV2VideoSubjectPageItem) {
            super(getmini);
            if (getmini == null) {
                write(0);
            }
            this.IconCompatParcelizer = abstractC0174getFilename;
            this.AudioAttributesCompatParcelizer = courseConfigV2VideoSubjectPageItem;
        }

        @Override // kotlin.isHtmlPearl
        public final Collection<getLink> read() {
            List<getLink> listOnAddQueueItem = this.IconCompatParcelizer.onAddQueueItem();
            if (listOnAddQueueItem == null) {
                write(1);
            }
            return listOnAddQueueItem;
        }

        @Override // kotlin.getPlanAddOns
        public final List<getBadgeText> AudioAttributesCompatParcelizer() {
            List<getBadgeText> listEmptyList = Collections.emptyList();
            if (listEmptyList == null) {
                write(2);
            }
            return listEmptyList;
        }

        @Override // kotlin.setPearlType, kotlin.getPlanAddOns
        public final getQuestionLimit RemoteActionCompatParcelizer() {
            AbstractC0174getFilename abstractC0174getFilename = this.IconCompatParcelizer;
            if (abstractC0174getFilename == null) {
                write(3);
            }
            return abstractC0174getFilename;
        }

        @Override // kotlin.getPlanAddOns
        public final getTestTabItems aU_() {
            getTestTabItems gettesttabitemsAudioAttributesCompatParcelizer = setLocked.AudioAttributesCompatParcelizer(this.IconCompatParcelizer);
            if (gettesttabitemsAudioAttributesCompatParcelizer == null) {
                write(4);
            }
            return gettesttabitemsAudioAttributesCompatParcelizer;
        }

        public final String toString() {
            return this.IconCompatParcelizer.aQ_().toString();
        }

        @Override // kotlin.isHtmlPearl
        public final CourseConfigV2VideoSubjectPageItem write() {
            CourseConfigV2VideoSubjectPageItem courseConfigV2VideoSubjectPageItem = this.AudioAttributesCompatParcelizer;
            if (courseConfigV2VideoSubjectPageItem == null) {
                write(5);
            }
            return courseConfigV2VideoSubjectPageItem;
        }

        @Override // kotlin.isHtmlPearl
        public final void IconCompatParcelizer(getLink getlink) {
            if (getlink == null) {
                write(6);
            }
            this.IconCompatParcelizer.RemoteActionCompatParcelizer(getlink);
        }

        @Override // kotlin.isHtmlPearl
        public final List<getLink> AudioAttributesCompatParcelizer(List<getLink> list) {
            if (list == null) {
                write(7);
            }
            List<getLink> list2 = this.IconCompatParcelizer.read(list);
            if (list2 == null) {
                write(8);
            }
            return list2;
        }

        @Override // kotlin.isHtmlPearl
        public final getLink aT_() {
            return SubscriptionType.read(setAccessLevel.CYCLIC_UPPER_BOUNDS, new String[0]);
        }

        @Override // kotlin.setPearlType
        public final boolean AudioAttributesCompatParcelizer(getQuestionLimit getquestionlimit) {
            if (getquestionlimit == null) {
                write(9);
            }
            return (getquestionlimit instanceof getBadgeText) && setStarred.AudioAttributesCompatParcelizer.read(this.IconCompatParcelizer, (getBadgeText) getquestionlimit);
        }

        private static /* synthetic */ void write(int i) {
            String str = (i == 1 || i == 2 || i == 3 || i == 4 || i == 5 || i == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i == 1 || i == 2 || i == 3 || i == 4 || i == 5 || i == 8) ? 2 : 3];
            switch (i) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 8:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor$TypeParameterTypeConstructor";
                    break;
                case 6:
                    objArr[0] = "type";
                    break;
                case 7:
                    objArr[0] = "supertypes";
                    break;
                case 9:
                    objArr[0] = "classifier";
                    break;
                default:
                    objArr[0] = "storageManager";
                    break;
            }
            if (i == 1) {
                objArr[1] = "computeSupertypes";
            } else if (i == 2) {
                objArr[1] = "getParameters";
            } else if (i == 3) {
                objArr[1] = "getDeclarationDescriptor";
            } else if (i == 4) {
                objArr[1] = "getBuiltIns";
            } else if (i == 5) {
                objArr[1] = "getSupertypeLoopChecker";
            } else if (i != 8) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor$TypeParameterTypeConstructor";
            } else {
                objArr[1] = "processSupertypesWithoutCycles";
            }
            switch (i) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 8:
                    break;
                case 6:
                    objArr[2] = "reportSupertypeLoopError";
                    break;
                case 7:
                    objArr[2] = "processSupertypesWithoutCycles";
                    break;
                case 9:
                    objArr[2] = "isSameClassifier";
                    break;
                default:
                    objArr[2] = "<init>";
                    break;
            }
            String str2 = String.format(str, objArr);
            if (i != 1 && i != 2 && i != 3 && i != 4 && i != 5 && i != 8) {
                throw new IllegalArgumentException(str2);
            }
            throw new IllegalStateException(str2);
        }
    }
}
