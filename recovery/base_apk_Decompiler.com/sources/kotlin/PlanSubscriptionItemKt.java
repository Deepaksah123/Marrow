package kotlin;

import java.util.Arrays;
import java.util.List;
import kotlin.getGroupDescription;

/* JADX INFO: loaded from: classes4.dex */
public final class PlanSubscriptionItemKt extends getHref {
    private final getPlanAddOns AudioAttributesCompatParcelizer;
    private final setAccessLevel AudioAttributesImplApi21Parcelizer;
    private final setTags AudioAttributesImplBaseParcelizer;
    private final String[] IconCompatParcelizer;
    private final List<setDefault> RemoteActionCompatParcelizer;
    private final String read;
    private final boolean write;

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
        return this.AudioAttributesCompatParcelizer;
    }

    @Override // kotlin.getLink
    public final setTags read() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    public final setAccessLevel MediaBrowserCompatItemReceiver() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    public /* synthetic */ PlanSubscriptionItemKt(getPlanAddOns getplanaddons, setTags settags, setAccessLevel setaccesslevel, String[] strArr) {
        this(getplanaddons, settags, setaccesslevel, IntermediateLoginResponseBody.RemoteActionCompatParcelizer(), false, strArr);
    }

    @Override // kotlin.getLink
    public final List<setDefault> bb_() {
        return this.RemoteActionCompatParcelizer;
    }

    @Override // kotlin.getLink
    public final boolean ba_() {
        return this.write;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PlanSubscriptionItemKt(getPlanAddOns getplanaddons, setTags settags, setAccessLevel setaccesslevel, List<? extends setDefault> list, boolean z, String... strArr) {
        toMagicModuleMetaRepoModel.write(getplanaddons, "");
        toMagicModuleMetaRepoModel.write(settags, "");
        toMagicModuleMetaRepoModel.write(setaccesslevel, "");
        toMagicModuleMetaRepoModel.write(list, "");
        toMagicModuleMetaRepoModel.write(strArr, "");
        this.AudioAttributesCompatParcelizer = getplanaddons;
        this.AudioAttributesImplBaseParcelizer = settags;
        this.AudioAttributesImplApi21Parcelizer = setaccesslevel;
        this.RemoteActionCompatParcelizer = list;
        this.write = z;
        this.IconCompatParcelizer = strArr;
        toMagicModuleStatusUcModel tomagicmodulestatusucmodel = toMagicModuleStatusUcModel.INSTANCE;
        String strRemoteActionCompatParcelizer = setaccesslevel.RemoteActionCompatParcelizer();
        Object[] objArrCopyOf = Arrays.copyOf(strArr, strArr.length);
        String str = String.format(strRemoteActionCompatParcelizer, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str, "");
        this.read = str;
    }

    public final String AudioAttributesImplApi26Parcelizer() {
        return this.read;
    }

    @Override // kotlin.getLink
    public final getGroupDescription bc_() {
        getGroupDescription.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = getGroupDescription.AudioAttributesCompatParcelizer;
        return getGroupDescription.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer();
    }

    @Override // kotlin.getHref
    public final getHref read(getGroupDescription getgroupdescription) {
        toMagicModuleMetaRepoModel.write(getgroupdescription, "");
        return this;
    }

    public final PlanSubscriptionItemKt read(List<? extends setDefault> list) {
        toMagicModuleMetaRepoModel.write(list, "");
        getPlanAddOns getplanaddonsAudioAttributesImplApi21Parcelizer = AudioAttributesImplApi21Parcelizer();
        setTags settags = read();
        setAccessLevel setaccesslevel = this.AudioAttributesImplApi21Parcelizer;
        boolean zBa_ = ba_();
        String[] strArr = this.IconCompatParcelizer;
        return new PlanSubscriptionItemKt(getplanaddonsAudioAttributesImplApi21Parcelizer, settags, setaccesslevel, list, zBa_, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    @Override // kotlin.getHref
    public final getHref write(boolean z) {
        getPlanAddOns getplanaddonsAudioAttributesImplApi21Parcelizer = AudioAttributesImplApi21Parcelizer();
        setTags settags = read();
        setAccessLevel setaccesslevel = this.AudioAttributesImplApi21Parcelizer;
        List<setDefault> listBb_ = bb_();
        String[] strArr = this.IconCompatParcelizer;
        return new PlanSubscriptionItemKt(getplanaddonsAudioAttributesImplApi21Parcelizer, settags, setaccesslevel, listBb_, z, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.PlanAddOnsCompanion
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public PlanSubscriptionItemKt write(getCheapestPlan getcheapestplan) {
        toMagicModuleMetaRepoModel.write(getcheapestplan, "");
        return this;
    }
}
