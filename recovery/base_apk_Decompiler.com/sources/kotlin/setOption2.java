package kotlin;

import java.util.List;
import kotlin.getGroupDescription;

/* JADX INFO: loaded from: classes4.dex */
public final class setOption2 extends getHref implements getCgstPercentInfo {
    private final McqIndex IconCompatParcelizer;
    private final boolean RemoteActionCompatParcelizer;
    private final setDefault read;
    private final getGroupDescription write;

    @Override // kotlin.PlanAddOnsCompanion
    public final /* synthetic */ PlanAddOnsCompanion AudioAttributesCompatParcelizer(getGroupDescription getgroupdescription) {
        return read(getgroupdescription);
    }

    public /* synthetic */ setOption2(setDefault setdefault) {
        getAnswerCount getanswercount = new getAnswerCount(setdefault);
        getGroupDescription.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = getGroupDescription.AudioAttributesCompatParcelizer;
        this(setdefault, getanswercount, false, getGroupDescription.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer());
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.getLink
    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: merged with bridge method [inline-methods] */
    public McqIndex AudioAttributesImplApi21Parcelizer() {
        return this.IconCompatParcelizer;
    }

    @Override // kotlin.getLink
    public final boolean ba_() {
        return this.RemoteActionCompatParcelizer;
    }

    @Override // kotlin.getLink
    public final getGroupDescription bc_() {
        return this.write;
    }

    private setOption2(setDefault setdefault, McqIndex mcqIndex, boolean z, getGroupDescription getgroupdescription) {
        toMagicModuleMetaRepoModel.write(setdefault, "");
        toMagicModuleMetaRepoModel.write(mcqIndex, "");
        toMagicModuleMetaRepoModel.write(getgroupdescription, "");
        this.read = setdefault;
        this.IconCompatParcelizer = mcqIndex;
        this.RemoteActionCompatParcelizer = z;
        this.write = getgroupdescription;
    }

    @Override // kotlin.getLink
    public final List<setDefault> bb_() {
        return IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
    }

    @Override // kotlin.getLink
    public final setTags read() {
        return SubscriptionType.write(Subscription.CAPTURED_TYPE_SCOPE, true, new String[0]);
    }

    @Override // kotlin.getHref
    public final String toString() {
        StringBuilder sb = new StringBuilder("Captured(");
        sb.append(this.read);
        sb.append(')');
        sb.append(ba_() ? "?" : "");
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.getHref
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public setOption2 write(boolean z) {
        return z == ba_() ? this : new setOption2(this.read, AudioAttributesImplApi21Parcelizer(), z, bc_());
    }

    @Override // kotlin.getHref
    public final getHref read(getGroupDescription getgroupdescription) {
        toMagicModuleMetaRepoModel.write(getgroupdescription, "");
        return new setOption2(this.read, AudioAttributesImplApi21Parcelizer(), ba_(), getgroupdescription);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.PlanAddOnsCompanion
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public setOption2 write(getCheapestPlan getcheapestplan) {
        toMagicModuleMetaRepoModel.write(getcheapestplan, "");
        setDefault setdefaultIconCompatParcelizer = this.read.IconCompatParcelizer(getcheapestplan);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(setdefaultIconCompatParcelizer, "");
        return new setOption2(setdefaultIconCompatParcelizer, AudioAttributesImplApi21Parcelizer(), ba_(), bc_());
    }
}
