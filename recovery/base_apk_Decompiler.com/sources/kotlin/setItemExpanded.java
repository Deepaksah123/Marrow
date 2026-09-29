package kotlin;

import java.util.Arrays;
import java.util.Collection;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public class setItemExpanded implements setTags {
    private final Subscription AudioAttributesCompatParcelizer;
    private final String RemoteActionCompatParcelizer;

    public setItemExpanded(Subscription subscription, String... strArr) {
        toMagicModuleMetaRepoModel.write(subscription, "");
        toMagicModuleMetaRepoModel.write(strArr, "");
        this.AudioAttributesCompatParcelizer = subscription;
        String strRemoteActionCompatParcelizer = subscription.RemoteActionCompatParcelizer();
        Object[] objArrCopyOf = Arrays.copyOf(strArr, strArr.length);
        String str = String.format(strRemoteActionCompatParcelizer, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str, "");
        this.RemoteActionCompatParcelizer = str;
    }

    protected final String IconCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    @Override // kotlin.getMcqContentBody
    public getQuestionLimit AudioAttributesCompatParcelizer(getRelatedLessonId getrelatedlessonid, getTimeStamp gettimestamp) {
        toMagicModuleMetaRepoModel.write(getrelatedlessonid, "");
        toMagicModuleMetaRepoModel.write(gettimestamp, "");
        String str = String.format(isAddressAvailable.ERROR_CLASS.AudioAttributesCompatParcelizer(), Arrays.copyOf(new Object[]{getrelatedlessonid}, 1));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str, "");
        getRelatedLessonId getrelatedlessonidAudioAttributesCompatParcelizer = getRelatedLessonId.AudioAttributesCompatParcelizer(str);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getrelatedlessonidAudioAttributesCompatParcelizer, "");
        return new getPlanData(getrelatedlessonidAudioAttributesCompatParcelizer);
    }

    @Override // kotlin.setTags
    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: merged with bridge method [inline-methods] */
    public Set<CourseConfigV2SettingsItems> IconCompatParcelizer(getRelatedLessonId getrelatedlessonid, getTimeStamp gettimestamp) {
        toMagicModuleMetaRepoModel.write(getrelatedlessonid, "");
        toMagicModuleMetaRepoModel.write(gettimestamp, "");
        SubscriptionType subscriptionType = SubscriptionType.AudioAttributesCompatParcelizer;
        return SubscriptionType.IconCompatParcelizer();
    }

    @Override // kotlin.setTags, kotlin.getMcqContentBody
    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
    public Set<CourseConfigV2SupportItem> read(getRelatedLessonId getrelatedlessonid, getTimeStamp gettimestamp) {
        toMagicModuleMetaRepoModel.write(getrelatedlessonid, "");
        toMagicModuleMetaRepoModel.write(gettimestamp, "");
        SubscriptionType subscriptionType = SubscriptionType.AudioAttributesCompatParcelizer;
        return getKycMessage.read(new getItemExpanded(SubscriptionType.read()));
    }

    @Override // kotlin.getMcqContentBody
    public Collection<getVariant> read(setOption6AnsweredCount setoption6answeredcount, getAnswerMap<? super getRelatedLessonId, Boolean> getanswermap) {
        toMagicModuleMetaRepoModel.write(setoption6answeredcount, "");
        toMagicModuleMetaRepoModel.write(getanswermap, "");
        return IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
    }

    @Override // kotlin.setTags
    public Set<getRelatedLessonId> aY_() {
        return getKycMessage.read();
    }

    @Override // kotlin.setTags
    public Set<getRelatedLessonId> AudioAttributesCompatParcelizer() {
        return getKycMessage.read();
    }

    @Override // kotlin.setTags
    public Set<getRelatedLessonId> aW_() {
        return getKycMessage.read();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ErrorScope{");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append('}');
        return sb.toString();
    }

    @Override // kotlin.getMcqContentBody
    public void RemoteActionCompatParcelizer(getRelatedLessonId getrelatedlessonid, getTimeStamp gettimestamp) {
        toMagicModuleMetaRepoModel.write(getrelatedlessonid, "");
        toMagicModuleMetaRepoModel.write(gettimestamp, "");
    }
}
