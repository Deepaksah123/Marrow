package kotlin;

import java.util.List;
import kotlin.getGroupDescription;

/* JADX INFO: loaded from: classes4.dex */
final class isVpnUsageDetected extends getHref {
    private final boolean AudioAttributesCompatParcelizer;
    private final List<setDefault> IconCompatParcelizer;
    private final getAnswerMap<getCheapestPlan, getHref> RemoteActionCompatParcelizer;
    private final setTags read;
    private final getPlanAddOns write;

    @Override // kotlin.PlanAddOnsCompanion
    public final /* synthetic */ PlanAddOnsCompanion AudioAttributesCompatParcelizer(getGroupDescription getgroupdescription) {
        return read(getgroupdescription);
    }

    @Override // kotlin.PlanAddOnsCompanion
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer */
    public final /* synthetic */ PlanAddOnsCompanion write(boolean z) {
        return write(z);
    }

    @Override // kotlin.getLink
    public final getPlanAddOns AudioAttributesImplApi21Parcelizer() {
        return this.write;
    }

    @Override // kotlin.getLink
    public final List<setDefault> bb_() {
        return this.IconCompatParcelizer;
    }

    @Override // kotlin.getLink
    public final boolean ba_() {
        return this.AudioAttributesCompatParcelizer;
    }

    @Override // kotlin.getLink
    public final setTags read() {
        return this.read;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public isVpnUsageDetected(getPlanAddOns getplanaddons, List<? extends setDefault> list, boolean z, setTags settags, getAnswerMap<? super getCheapestPlan, ? extends getHref> getanswermap) {
        toMagicModuleMetaRepoModel.write(getplanaddons, "");
        toMagicModuleMetaRepoModel.write(list, "");
        toMagicModuleMetaRepoModel.write(settags, "");
        toMagicModuleMetaRepoModel.write(getanswermap, "");
        this.write = getplanaddons;
        this.IconCompatParcelizer = list;
        this.AudioAttributesCompatParcelizer = z;
        this.read = settags;
        this.RemoteActionCompatParcelizer = getanswermap;
        if (!(read() instanceof setItemExpanded) || (read() instanceof setContentNameForEvent)) {
            return;
        }
        StringBuilder sb = new StringBuilder("SimpleTypeImpl should not be created for error type: ");
        sb.append(read());
        sb.append('\n');
        sb.append(AudioAttributesImplApi21Parcelizer());
        throw new IllegalStateException(sb.toString());
    }

    @Override // kotlin.getLink
    public final getGroupDescription bc_() {
        getGroupDescription.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = getGroupDescription.AudioAttributesCompatParcelizer;
        return getGroupDescription.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer();
    }

    @Override // kotlin.getHref
    public final getHref read(getGroupDescription getgroupdescription) {
        toMagicModuleMetaRepoModel.write(getgroupdescription, "");
        if (getgroupdescription.write()) {
            return this;
        }
        return new getTaxInfo(this, getgroupdescription);
    }

    @Override // kotlin.getHref
    public final getHref write(boolean z) {
        if (z == ba_()) {
            return this;
        }
        if (z) {
            return new getVpnUsageCopy(this);
        }
        return new getCountryRestrictionCopy(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.PlanAddOnsCompanion
    /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public getHref write(getCheapestPlan getcheapestplan) {
        toMagicModuleMetaRepoModel.write(getcheapestplan, "");
        getHref gethrefInvoke = this.RemoteActionCompatParcelizer.invoke(getcheapestplan);
        return gethrefInvoke == null ? this : gethrefInvoke;
    }
}
