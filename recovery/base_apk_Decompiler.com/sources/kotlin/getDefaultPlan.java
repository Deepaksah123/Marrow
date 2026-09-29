package kotlin;

import java.util.List;
import kotlin.getGroupDescription;

/* JADX INFO: loaded from: classes4.dex */
public final class getDefaultPlan extends getHref implements getCgstPercentInfo {
    private final getGroupDescription AudioAttributesCompatParcelizer;
    private final getFirstEligiblePlan IconCompatParcelizer;
    private final PlanAddOnsCompanion MediaBrowserCompatCustomActionResultReceiver;
    private final isQbank RemoteActionCompatParcelizer;
    private final boolean read;
    private final boolean write;

    @Override // kotlin.PlanAddOnsCompanion
    public final /* synthetic */ PlanAddOnsCompanion AudioAttributesCompatParcelizer(getGroupDescription getgroupdescription) {
        return read(getgroupdescription);
    }

    public final isQbank AudioAttributesImplApi26Parcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    @Override // kotlin.getLink
    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: merged with bridge method [inline-methods] */
    public final getFirstEligiblePlan AudioAttributesImplApi21Parcelizer() {
        return this.IconCompatParcelizer;
    }

    public final PlanAddOnsCompanion MediaBrowserCompatItemReceiver() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ getDefaultPlan(isQbank isqbank, getFirstEligiblePlan getfirsteligibleplan, PlanAddOnsCompanion planAddOnsCompanion, getGroupDescription getgroupdescription, boolean z, int i) {
        if ((i & 8) != 0) {
            getGroupDescription.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = getGroupDescription.AudioAttributesCompatParcelizer;
            getgroupdescription = getGroupDescription.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer();
        }
        this(isqbank, getfirsteligibleplan, planAddOnsCompanion, getgroupdescription, (i & 16) != 0 ? false : z, false);
    }

    @Override // kotlin.getLink
    public final getGroupDescription bc_() {
        return this.AudioAttributesCompatParcelizer;
    }

    @Override // kotlin.getLink
    public final boolean ba_() {
        return this.read;
    }

    public final boolean MediaBrowserCompatCustomActionResultReceiver() {
        return this.write;
    }

    public getDefaultPlan(isQbank isqbank, getFirstEligiblePlan getfirsteligibleplan, PlanAddOnsCompanion planAddOnsCompanion, getGroupDescription getgroupdescription, boolean z, boolean z2) {
        toMagicModuleMetaRepoModel.write(isqbank, "");
        toMagicModuleMetaRepoModel.write(getfirsteligibleplan, "");
        toMagicModuleMetaRepoModel.write(getgroupdescription, "");
        this.RemoteActionCompatParcelizer = isqbank;
        this.IconCompatParcelizer = getfirsteligibleplan;
        this.MediaBrowserCompatCustomActionResultReceiver = planAddOnsCompanion;
        this.AudioAttributesCompatParcelizer = getgroupdescription;
        this.read = z;
        this.write = z2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public getDefaultPlan(isQbank isqbank, PlanAddOnsCompanion planAddOnsCompanion, setDefault setdefault, getBadgeText getbadgetext) {
        this(isqbank, new getFirstEligiblePlan(setdefault, null, null, getbadgetext, 6), planAddOnsCompanion, (getGroupDescription) null, false, 56);
        toMagicModuleMetaRepoModel.write(isqbank, "");
        toMagicModuleMetaRepoModel.write(setdefault, "");
        toMagicModuleMetaRepoModel.write(getbadgetext, "");
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
    public final getHref read(getGroupDescription getgroupdescription) {
        toMagicModuleMetaRepoModel.write(getgroupdescription, "");
        return new getDefaultPlan(this.RemoteActionCompatParcelizer, AudioAttributesImplApi21Parcelizer(), this.MediaBrowserCompatCustomActionResultReceiver, getgroupdescription, ba_(), this.write);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.getHref
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public getDefaultPlan write(boolean z) {
        return new getDefaultPlan(this.RemoteActionCompatParcelizer, AudioAttributesImplApi21Parcelizer(), this.MediaBrowserCompatCustomActionResultReceiver, bc_(), z, 32);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.PlanAddOnsCompanion
    /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public getDefaultPlan write(getCheapestPlan getcheapestplan) {
        toMagicModuleMetaRepoModel.write(getcheapestplan, "");
        isQbank isqbank = this.RemoteActionCompatParcelizer;
        getFirstEligiblePlan getfirsteligibleplanIconCompatParcelizer = AudioAttributesImplApi21Parcelizer().IconCompatParcelizer(getcheapestplan);
        PlanAddOnsCompanion planAddOnsCompanion = this.MediaBrowserCompatCustomActionResultReceiver;
        return new getDefaultPlan(isqbank, getfirsteligibleplanIconCompatParcelizer, planAddOnsCompanion != null ? getcheapestplan.read(planAddOnsCompanion).MediaBrowserCompatMediaItem() : null, bc_(), ba_(), 32);
    }
}
