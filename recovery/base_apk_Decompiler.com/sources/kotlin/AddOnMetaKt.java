package kotlin;

import java.util.List;
import kotlin.NotesSubscriptionResponse;
import kotlin.getGroupDescription;
import kotlin.getMinPrice;

/* JADX INFO: loaded from: classes4.dex */
public final class AddOnMetaKt {
    public static final AddOnMetaKt write = new AddOnMetaKt();

    static final class RemoteActionCompatParcelizer extends MagicModuleUseCase implements getAnswerMap {
        public static final RemoteActionCompatParcelizer read = new RemoteActionCompatParcelizer();

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ Object invoke(Object obj) {
            return read((getCheapestPlan) obj);
        }

        RemoteActionCompatParcelizer() {
            super(1);
        }

        private static Void read(getCheapestPlan getcheapestplan) {
            toMagicModuleMetaRepoModel.write(getcheapestplan, "");
            return null;
        }
    }

    private AddOnMetaKt() {
    }

    static {
        RemoteActionCompatParcelizer remoteActionCompatParcelizer = RemoteActionCompatParcelizer.read;
    }

    private static setTags read(getPlanAddOns getplanaddons, List<? extends setDefault> list, getCheapestPlan getcheapestplan) {
        getQuestionLimit getquestionlimitRemoteActionCompatParcelizer = getplanaddons.RemoteActionCompatParcelizer();
        if (getquestionlimitRemoteActionCompatParcelizer instanceof getBadgeText) {
            return ((getBadgeText) getquestionlimitRemoteActionCompatParcelizer).aP_().read();
        }
        if (getquestionlimitRemoteActionCompatParcelizer instanceof CourseConfigV2CustomModuleQuestionSource) {
            if (getcheapestplan == null) {
                getcheapestplan = setLocked.write(setLocked.IconCompatParcelizer(getquestionlimitRemoteActionCompatParcelizer));
            }
            if (list.isEmpty()) {
                return putSerializable.AudioAttributesCompatParcelizer((CourseConfigV2CustomModuleQuestionSource) getquestionlimitRemoteActionCompatParcelizer, getcheapestplan);
            }
            return putSerializable.AudioAttributesCompatParcelizer((CourseConfigV2CustomModuleQuestionSource) getquestionlimitRemoteActionCompatParcelizer, getSubscriptionDetails.read.read(getplanaddons, list), getcheapestplan);
        }
        if (getquestionlimitRemoteActionCompatParcelizer instanceof CourseConfigV2VideoProperties) {
            Subscription subscription = Subscription.SCOPE_FOR_ABBREVIATION_TYPE;
            String string = ((CourseConfigV2VideoProperties) getquestionlimitRemoteActionCompatParcelizer).aQ_().toString();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
            return SubscriptionType.write(subscription, true, string);
        }
        if (getplanaddons instanceof getMainCopy) {
            return ((getMainCopy) getplanaddons).IconCompatParcelizer();
        }
        StringBuilder sb = new StringBuilder("Unsupported classifier: ");
        sb.append(getquestionlimitRemoteActionCompatParcelizer);
        sb.append(" for constructor: ");
        sb.append(getplanaddons);
        throw new IllegalStateException(sb.toString());
    }

    public static /* synthetic */ getHref write(getGroupDescription getgroupdescription, getPlanAddOns getplanaddons, List list, boolean z) {
        return IconCompatParcelizer(getgroupdescription, getplanaddons, list, z, null);
    }

    @getMagicModuleMeta
    public static final getHref IconCompatParcelizer(getGroupDescription getgroupdescription, getPlanAddOns getplanaddons, List<? extends setDefault> list, boolean z, getCheapestPlan getcheapestplan) {
        toMagicModuleMetaRepoModel.write(getgroupdescription, "");
        toMagicModuleMetaRepoModel.write(getplanaddons, "");
        toMagicModuleMetaRepoModel.write(list, "");
        if (getgroupdescription.write() && list.isEmpty() && !z && getplanaddons.RemoteActionCompatParcelizer() != null) {
            getQuestionLimit getquestionlimitRemoteActionCompatParcelizer = getplanaddons.RemoteActionCompatParcelizer();
            toMagicModuleMetaRepoModel.write(getquestionlimitRemoteActionCompatParcelizer);
            getHref gethrefAP_ = getquestionlimitRemoteActionCompatParcelizer.aP_();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(gethrefAP_, "");
            return gethrefAP_;
        }
        return write(getgroupdescription, getplanaddons, list, z, read(getplanaddons, list, getcheapestplan), new write(getplanaddons, list, getgroupdescription, z));
    }

    static final class write extends MagicModuleUseCase implements getAnswerMap<getCheapestPlan, getHref> {
        private /* synthetic */ List<setDefault> AudioAttributesCompatParcelizer;
        private /* synthetic */ boolean IconCompatParcelizer;
        private /* synthetic */ getGroupDescription RemoteActionCompatParcelizer;
        private /* synthetic */ getPlanAddOns read;

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public getHref invoke(getCheapestPlan getcheapestplan) {
            toMagicModuleMetaRepoModel.write(getcheapestplan, "");
            AddOnMetaKt addOnMetaKt = AddOnMetaKt.write;
            read readVarWrite = AddOnMetaKt.write(this.read, getcheapestplan, this.AudioAttributesCompatParcelizer);
            if (readVarWrite == null) {
                return null;
            }
            getHref gethrefRemoteActionCompatParcelizer = readVarWrite.RemoteActionCompatParcelizer();
            if (gethrefRemoteActionCompatParcelizer != null) {
                return gethrefRemoteActionCompatParcelizer;
            }
            getGroupDescription getgroupdescription = this.RemoteActionCompatParcelizer;
            getPlanAddOns getplanaddonsAudioAttributesCompatParcelizer = readVarWrite.AudioAttributesCompatParcelizer();
            toMagicModuleMetaRepoModel.write(getplanaddonsAudioAttributesCompatParcelizer);
            return AddOnMetaKt.IconCompatParcelizer(getgroupdescription, getplanaddonsAudioAttributesCompatParcelizer, this.AudioAttributesCompatParcelizer, this.IconCompatParcelizer, getcheapestplan);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        write(getPlanAddOns getplanaddons, List<? extends setDefault> list, getGroupDescription getgroupdescription, boolean z) {
            super(1);
            this.read = getplanaddons;
            this.AudioAttributesCompatParcelizer = list;
            this.RemoteActionCompatParcelizer = getgroupdescription;
            this.IconCompatParcelizer = z;
        }
    }

    @getMagicModuleMeta
    public static final getHref RemoteActionCompatParcelizer(CourseConfigV2VideoProperties courseConfigV2VideoProperties, List<? extends setDefault> list) {
        toMagicModuleMetaRepoModel.write(courseConfigV2VideoProperties, "");
        toMagicModuleMetaRepoModel.write(list, "");
        MetaCompanion metaCompanion = new MetaCompanion(getMinPrice.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer);
        NotesSubscriptionResponse.write writeVar = NotesSubscriptionResponse.AudioAttributesCompatParcelizer;
        NotesSubscriptionResponse notesSubscriptionResponseRemoteActionCompatParcelizer = NotesSubscriptionResponse.write.RemoteActionCompatParcelizer(null, courseConfigV2VideoProperties, list);
        getGroupDescription.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = getGroupDescription.AudioAttributesCompatParcelizer;
        return metaCompanion.RemoteActionCompatParcelizer(notesSubscriptionResponseRemoteActionCompatParcelizer, getGroupDescription.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static read write(getPlanAddOns getplanaddons, getCheapestPlan getcheapestplan, List<? extends setDefault> list) {
        getQuestionLimit getquestionlimitRemoteActionCompatParcelizer = getplanaddons.RemoteActionCompatParcelizer();
        if (getquestionlimitRemoteActionCompatParcelizer == null) {
            return null;
        }
        getcheapestplan.write(getquestionlimitRemoteActionCompatParcelizer);
        return null;
    }

    static final class read {
        private final getPlanAddOns AudioAttributesCompatParcelizer;
        private final getHref IconCompatParcelizer;

        public final getPlanAddOns AudioAttributesCompatParcelizer() {
            return this.AudioAttributesCompatParcelizer;
        }

        public final getHref RemoteActionCompatParcelizer() {
            return this.IconCompatParcelizer;
        }
    }

    static final class IconCompatParcelizer extends MagicModuleUseCase implements getAnswerMap<getCheapestPlan, getHref> {
        private /* synthetic */ setTags AudioAttributesCompatParcelizer;
        private /* synthetic */ boolean IconCompatParcelizer;
        private /* synthetic */ getGroupDescription RemoteActionCompatParcelizer;
        private /* synthetic */ getPlanAddOns read;
        private /* synthetic */ List<setDefault> write;

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public getHref invoke(getCheapestPlan getcheapestplan) {
            toMagicModuleMetaRepoModel.write(getcheapestplan, "");
            AddOnMetaKt addOnMetaKt = AddOnMetaKt.write;
            read readVarWrite = AddOnMetaKt.write(this.read, getcheapestplan, this.write);
            if (readVarWrite == null) {
                return null;
            }
            getHref gethrefRemoteActionCompatParcelizer = readVarWrite.RemoteActionCompatParcelizer();
            if (gethrefRemoteActionCompatParcelizer != null) {
                return gethrefRemoteActionCompatParcelizer;
            }
            getGroupDescription getgroupdescription = this.RemoteActionCompatParcelizer;
            getPlanAddOns getplanaddonsAudioAttributesCompatParcelizer = readVarWrite.AudioAttributesCompatParcelizer();
            toMagicModuleMetaRepoModel.write(getplanaddonsAudioAttributesCompatParcelizer);
            return AddOnMetaKt.RemoteActionCompatParcelizer(getgroupdescription, getplanaddonsAudioAttributesCompatParcelizer, this.write, this.IconCompatParcelizer, this.AudioAttributesCompatParcelizer);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        IconCompatParcelizer(getPlanAddOns getplanaddons, List<? extends setDefault> list, getGroupDescription getgroupdescription, boolean z, setTags settags) {
            super(1);
            this.read = getplanaddons;
            this.write = list;
            this.RemoteActionCompatParcelizer = getgroupdescription;
            this.IconCompatParcelizer = z;
            this.AudioAttributesCompatParcelizer = settags;
        }
    }

    @getMagicModuleMeta
    public static final getHref RemoteActionCompatParcelizer(getGroupDescription getgroupdescription, getPlanAddOns getplanaddons, List<? extends setDefault> list, boolean z, setTags settags) {
        toMagicModuleMetaRepoModel.write(getgroupdescription, "");
        toMagicModuleMetaRepoModel.write(getplanaddons, "");
        toMagicModuleMetaRepoModel.write(list, "");
        toMagicModuleMetaRepoModel.write(settags, "");
        isVpnUsageDetected isvpnusagedetected = new isVpnUsageDetected(getplanaddons, list, z, settags, new IconCompatParcelizer(getplanaddons, list, getgroupdescription, z, settags));
        if (getgroupdescription.write()) {
            return isvpnusagedetected;
        }
        return new getTaxInfo(isvpnusagedetected, getgroupdescription);
    }

    @getMagicModuleMeta
    public static final getHref write(getGroupDescription getgroupdescription, getPlanAddOns getplanaddons, List<? extends setDefault> list, boolean z, setTags settags, getAnswerMap<? super getCheapestPlan, ? extends getHref> getanswermap) {
        toMagicModuleMetaRepoModel.write(getgroupdescription, "");
        toMagicModuleMetaRepoModel.write(getplanaddons, "");
        toMagicModuleMetaRepoModel.write(list, "");
        toMagicModuleMetaRepoModel.write(settags, "");
        toMagicModuleMetaRepoModel.write(getanswermap, "");
        isVpnUsageDetected isvpnusagedetected = new isVpnUsageDetected(getplanaddons, list, z, settags, getanswermap);
        if (getgroupdescription.write()) {
            return isvpnusagedetected;
        }
        return new getTaxInfo(isvpnusagedetected, getgroupdescription);
    }

    @getMagicModuleMeta
    public static final getHref write(getGroupDescription getgroupdescription, CourseConfigV2CustomModuleQuestionSource courseConfigV2CustomModuleQuestionSource, List<? extends setDefault> list) {
        toMagicModuleMetaRepoModel.write(getgroupdescription, "");
        toMagicModuleMetaRepoModel.write(courseConfigV2CustomModuleQuestionSource, "");
        toMagicModuleMetaRepoModel.write(list, "");
        getPlanAddOns getplanaddonsMediaBrowserCompatSearchResultReceiver = courseConfigV2CustomModuleQuestionSource.MediaBrowserCompatSearchResultReceiver();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getplanaddonsMediaBrowserCompatSearchResultReceiver, "");
        return write(getgroupdescription, getplanaddonsMediaBrowserCompatSearchResultReceiver, list, false);
    }

    @getMagicModuleMeta
    public static final PlanAddOnsCompanion AudioAttributesCompatParcelizer(getHref gethref, getHref gethref2) {
        toMagicModuleMetaRepoModel.write(gethref, "");
        toMagicModuleMetaRepoModel.write(gethref2, "");
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(gethref, gethref2) ? gethref : new PearlTopicInfo(gethref, gethref2);
    }

    @getMagicModuleMeta
    public static final getHref AudioAttributesCompatParcelizer(getGroupDescription getgroupdescription, getOption5AnsweredCount getoption5answeredcount) {
        toMagicModuleMetaRepoModel.write(getgroupdescription, "");
        toMagicModuleMetaRepoModel.write(getoption5answeredcount, "");
        return RemoteActionCompatParcelizer(getgroupdescription, getoption5answeredcount, IntermediateLoginResponseBody.RemoteActionCompatParcelizer(), false, SubscriptionType.write(Subscription.INTEGER_LITERAL_TYPE_SCOPE, true, "unknown integer literal type"));
    }

    @getMagicModuleMeta
    public static final getHref IconCompatParcelizer(getGroupDescription getgroupdescription, getPlanAddOns getplanaddons, List<? extends setDefault> list) {
        toMagicModuleMetaRepoModel.write(getgroupdescription, "");
        toMagicModuleMetaRepoModel.write(getplanaddons, "");
        toMagicModuleMetaRepoModel.write(list, "");
        return write(getgroupdescription, getplanaddons, list, false);
    }
}
