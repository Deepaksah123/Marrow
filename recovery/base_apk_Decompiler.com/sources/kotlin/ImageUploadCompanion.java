package kotlin;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.getCompletenessScore;
import kotlin.setTags;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ImageUploadCompanion extends PresenterBundle implements CourseConfigV2VideoProperties {
    private final write IconCompatParcelizer;
    private final CourseConfigV2NavDrawerItemFreeExtension read;
    private List<? extends getBadgeText> write;

    protected abstract getMini MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();

    protected abstract List<getBadgeText> handleMediaPlayPauseIfPendingOnHandler();

    @Override // kotlin.CourseConfigV2NavDrawerItemYourCourse
    public final boolean onCommand() {
        return false;
    }

    @Override // kotlin.CourseConfigV2NavDrawerItemYourCourse
    public final boolean onMediaButtonEvent() {
        return false;
    }

    @Override // kotlin.CourseConfigV2NavDrawerItemYourCourse
    public final boolean onPause() {
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageUploadCompanion(getVariant getvariant, getQuote getquote, getRelatedLessonId getrelatedlessonid, getIntroDurationSeconds getintrodurationseconds, CourseConfigV2NavDrawerItemFreeExtension courseConfigV2NavDrawerItemFreeExtension) {
        super(getvariant, getquote, getrelatedlessonid, getintrodurationseconds);
        toMagicModuleMetaRepoModel.write(getvariant, "");
        toMagicModuleMetaRepoModel.write(getquote, "");
        toMagicModuleMetaRepoModel.write(getrelatedlessonid, "");
        toMagicModuleMetaRepoModel.write(getintrodurationseconds, "");
        toMagicModuleMetaRepoModel.write(courseConfigV2NavDrawerItemFreeExtension, "");
        this.read = courseConfigV2NavDrawerItemFreeExtension;
        this.IconCompatParcelizer = new write();
    }

    public final void AudioAttributesCompatParcelizer(List<? extends getBadgeText> list) {
        toMagicModuleMetaRepoModel.write(list, "");
        this.write = list;
    }

    @Override // kotlin.getVariant
    public final <R, D> R AudioAttributesCompatParcelizer(CourseConfigV2NavDrawerItemAddVideo<R, D> courseConfigV2NavDrawerItemAddVideo, D d) {
        toMagicModuleMetaRepoModel.write(courseConfigV2NavDrawerItemAddVideo, "");
        return courseConfigV2NavDrawerItemAddVideo.RemoteActionCompatParcelizer(this, d);
    }

    static final class IconCompatParcelizer extends MagicModuleUseCase implements getAnswerMap<PlanAddOnsCompanion, Boolean> {
        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Boolean invoke(kotlin.PlanAddOnsCompanion r2) {
            /*
                r1 = this;
                java.lang.String r0 = ""
                kotlin.toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(r2, r0)
                r0 = r2
                o.getLink r0 = (kotlin.getLink) r0
                boolean r0 = kotlin.Copy.write(r0)
                if (r0 != 0) goto L2a
                o.ImageUploadCompanion r1 = kotlin.ImageUploadCompanion.this
                o.getPlanAddOns r2 = r2.AudioAttributesImplApi21Parcelizer()
                o.getQuestionLimit r2 = r2.RemoteActionCompatParcelizer()
                boolean r0 = r2 instanceof kotlin.getBadgeText
                if (r0 == 0) goto L2a
                o.getBadgeText r2 = (kotlin.getBadgeText) r2
                o.getVariant r2 = r2.onPlayFromMediaId()
                boolean r1 = kotlin.toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(r2, r1)
                if (r1 != 0) goto L2a
                r1 = 1
                goto L2b
            L2a:
                r1 = 0
            L2b:
                java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: o.ImageUploadCompanion.IconCompatParcelizer.invoke(o.PlanAddOnsCompanion):java.lang.Boolean");
        }

        IconCompatParcelizer() {
            super(1);
        }
    }

    @Override // kotlin.getBadge
    public final boolean onPrepareFromSearch() {
        return setPlanAddOns.RemoteActionCompatParcelizer(AudioAttributesImplBaseParcelizer(), new IconCompatParcelizer());
    }

    public final Collection<SchemaUserStatus> onAddQueueItem() {
        CourseConfigV2CustomModuleQuestionSource courseConfigV2CustomModuleQuestionSourceWrite = write();
        if (courseConfigV2CustomModuleQuestionSourceWrite == null) {
            return IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
        }
        Collection<CourseConfigV2EditionSwitch> collectionMediaBrowserCompatCustomActionResultReceiver = courseConfigV2CustomModuleQuestionSourceWrite.MediaBrowserCompatCustomActionResultReceiver();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(collectionMediaBrowserCompatCustomActionResultReceiver, "");
        ArrayList arrayList = new ArrayList();
        for (CourseConfigV2EditionSwitch courseConfigV2EditionSwitch : collectionMediaBrowserCompatCustomActionResultReceiver) {
            getCompletenessScore.read readVar = getCompletenessScore.read;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(courseConfigV2EditionSwitch, "");
            SchemaUserStatus schemaUserStatusAudioAttributesCompatParcelizer = getCompletenessScore.read.AudioAttributesCompatParcelizer(MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(), this, courseConfigV2EditionSwitch);
            if (schemaUserStatusAudioAttributesCompatParcelizer != null) {
                arrayList.add(schemaUserStatusAudioAttributesCompatParcelizer);
            }
        }
        return arrayList;
    }

    @Override // kotlin.getBadge
    public final List<getBadgeText> MediaBrowserCompatItemReceiver() {
        List list = this.write;
        if (list != null) {
            return list;
        }
        toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        return null;
    }

    @Override // kotlin.CourseConfigV2NavDrawerItemYourCourse
    public final CourseConfigV2NavDrawerItems MediaBrowserCompatMediaItem() {
        return CourseConfigV2NavDrawerItems.FINAL;
    }

    @Override // kotlin.CourseConfigV2NavDrawerItemYourCourse, kotlin.getSubText
    public final CourseConfigV2NavDrawerItemFreeExtension onCustomAction() {
        return this.read;
    }

    @Override // kotlin.getQuestionLimit
    public final getPlanAddOns MediaBrowserCompatSearchResultReceiver() {
        return this.IconCompatParcelizer;
    }

    @Override // kotlin.getBooleanMap
    public String toString() {
        StringBuilder sb = new StringBuilder("typealias ");
        sb.append(aQ_().AudioAttributesCompatParcelizer());
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.PresenterBundle, kotlin.getBooleanMap, kotlin.getVariant
    /* JADX INFO: renamed from: onPlay, reason: merged with bridge method [inline-methods] */
    public CourseConfigV2VideoProperties aS_() {
        CourseConfigV2HomePageItems courseConfigV2HomePageItemsAS_ = super.aS_();
        toMagicModuleMetaRepoModel.read(courseConfigV2HomePageItemsAS_, "");
        return (CourseConfigV2VideoProperties) courseConfigV2HomePageItemsAS_;
    }

    static final class RemoteActionCompatParcelizer extends MagicModuleUseCase implements getAnswerMap<getCheapestPlan, getHref> {
        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public getHref invoke(getCheapestPlan getcheapestplan) {
            getcheapestplan.write(ImageUploadCompanion.this);
            return null;
        }

        RemoteActionCompatParcelizer() {
            super(1);
        }
    }

    protected final getHref MediaDescriptionCompat() {
        setTags.write writeVarOnRemoveQueueItem;
        ImageUploadCompanion imageUploadCompanion = this;
        CourseConfigV2CustomModuleQuestionSource courseConfigV2CustomModuleQuestionSourceWrite = write();
        if (courseConfigV2CustomModuleQuestionSourceWrite == null || (writeVarOnRemoveQueueItem = courseConfigV2CustomModuleQuestionSourceWrite.onRemoveQueueItem()) == null) {
            writeVarOnRemoveQueueItem = setTags.write.RemoteActionCompatParcelizer;
        }
        getHref gethrefRemoteActionCompatParcelizer = setPlanAddOns.RemoteActionCompatParcelizer(imageUploadCompanion, writeVarOnRemoveQueueItem, new RemoteActionCompatParcelizer());
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(gethrefRemoteActionCompatParcelizer, "");
        return gethrefRemoteActionCompatParcelizer;
    }

    public static final class write implements getPlanAddOns {
        @Override // kotlin.getPlanAddOns
        public final boolean AudioAttributesImplApi26Parcelizer() {
            return true;
        }

        write() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getPlanAddOns
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public CourseConfigV2VideoProperties RemoteActionCompatParcelizer() {
            return ImageUploadCompanion.this;
        }

        @Override // kotlin.getPlanAddOns
        public final List<getBadgeText> AudioAttributesCompatParcelizer() {
            return ImageUploadCompanion.this.handleMediaPlayPauseIfPendingOnHandler();
        }

        @Override // kotlin.getPlanAddOns
        public final Collection<getLink> aV_() {
            Collection<getLink> collectionAV_ = RemoteActionCompatParcelizer().AudioAttributesImplBaseParcelizer().AudioAttributesImplApi21Parcelizer().aV_();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(collectionAV_, "");
            return collectionAV_;
        }

        @Override // kotlin.getPlanAddOns
        public final getTestTabItems aU_() {
            return setLocked.AudioAttributesCompatParcelizer(RemoteActionCompatParcelizer());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("[typealias ");
            sb.append(RemoteActionCompatParcelizer().aQ_().AudioAttributesCompatParcelizer());
            sb.append(']');
            return sb.toString();
        }
    }
}
