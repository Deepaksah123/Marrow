package kotlin;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class SubscriptionType {
    public static final SubscriptionType AudioAttributesCompatParcelizer = new SubscriptionType();
    private static final getTopSection IconCompatParcelizer = getPlanId.AudioAttributesCompatParcelizer;
    private static final getLink MediaBrowserCompatCustomActionResultReceiver;
    private static final getLink RemoteActionCompatParcelizer;
    private static final getPlanData read;
    private static final Set<CourseConfigV2SettingsItems> write;

    private SubscriptionType() {
    }

    static {
        String str = String.format(isAddressAvailable.ERROR_CLASS.AudioAttributesCompatParcelizer(), Arrays.copyOf(new Object[]{"unknown class"}, 1));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str, "");
        getRelatedLessonId getrelatedlessonidAudioAttributesCompatParcelizer = getRelatedLessonId.AudioAttributesCompatParcelizer(str);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getrelatedlessonidAudioAttributesCompatParcelizer, "");
        read = new getPlanData(getrelatedlessonidAudioAttributesCompatParcelizer);
        MediaBrowserCompatCustomActionResultReceiver = read(setAccessLevel.CYCLIC_SUPERTYPES, new String[0]);
        RemoteActionCompatParcelizer = read(setAccessLevel.ERROR_PROPERTY_TYPE, new String[0]);
        write = getKycMessage.read(new getPaymentDate());
    }

    public static getTopSection AudioAttributesCompatParcelizer() {
        return IconCompatParcelizer;
    }

    public static getPlanData read() {
        return read;
    }

    public static getLink write() {
        return MediaBrowserCompatCustomActionResultReceiver;
    }

    public static getLink RemoteActionCompatParcelizer() {
        return RemoteActionCompatParcelizer;
    }

    public static Set<CourseConfigV2SettingsItems> IconCompatParcelizer() {
        return write;
    }

    @getMagicModuleMeta
    public static final setItemExpanded write(Subscription subscription, String... strArr) {
        toMagicModuleMetaRepoModel.write(subscription, "");
        toMagicModuleMetaRepoModel.write(strArr, "");
        return write(subscription, false, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    @getMagicModuleMeta
    public static final setItemExpanded write(Subscription subscription, boolean z, String... strArr) {
        toMagicModuleMetaRepoModel.write(subscription, "");
        toMagicModuleMetaRepoModel.write(strArr, "");
        return z ? new setContentNameForEvent(subscription, (String[]) Arrays.copyOf(strArr, strArr.length)) : new setItemExpanded(subscription, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    @getMagicModuleMeta
    public static final PlanSubscriptionItemKt read(setAccessLevel setaccesslevel, String... strArr) {
        toMagicModuleMetaRepoModel.write(setaccesslevel, "");
        toMagicModuleMetaRepoModel.write(strArr, "");
        return IconCompatParcelizer(setaccesslevel, IntermediateLoginResponseBody.RemoteActionCompatParcelizer(), (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public static PlanSubscriptionItemKt write(setAccessLevel setaccesslevel, getPlanAddOns getplanaddons, String... strArr) {
        toMagicModuleMetaRepoModel.write(setaccesslevel, "");
        toMagicModuleMetaRepoModel.write(getplanaddons, "");
        toMagicModuleMetaRepoModel.write(strArr, "");
        return read(setaccesslevel, IntermediateLoginResponseBody.RemoteActionCompatParcelizer(), getplanaddons, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    private static PlanSubscriptionItemKt IconCompatParcelizer(setAccessLevel setaccesslevel, List<? extends setDefault> list, String... strArr) {
        toMagicModuleMetaRepoModel.write(setaccesslevel, "");
        toMagicModuleMetaRepoModel.write(list, "");
        toMagicModuleMetaRepoModel.write(strArr, "");
        return read(setaccesslevel, list, RemoteActionCompatParcelizer(setaccesslevel, (String[]) Arrays.copyOf(strArr, strArr.length)), (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public static PlanSubscriptionItemKt read(setAccessLevel setaccesslevel, List<? extends setDefault> list, getPlanAddOns getplanaddons, String... strArr) {
        toMagicModuleMetaRepoModel.write(setaccesslevel, "");
        toMagicModuleMetaRepoModel.write(list, "");
        toMagicModuleMetaRepoModel.write(getplanaddons, "");
        toMagicModuleMetaRepoModel.write(strArr, "");
        return new PlanSubscriptionItemKt(getplanaddons, write(Subscription.ERROR_TYPE_SCOPE, getplanaddons.toString()), setaccesslevel, list, false, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public static isFreePlan RemoteActionCompatParcelizer(setAccessLevel setaccesslevel, String... strArr) {
        toMagicModuleMetaRepoModel.write(setaccesslevel, "");
        toMagicModuleMetaRepoModel.write(strArr, "");
        return new isFreePlan(setaccesslevel, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    @getMagicModuleMeta
    public static final boolean write(getVariant getvariant) {
        if (getvariant != null) {
            return read(getvariant) || read(getvariant.AudioAttributesImplApi21Parcelizer()) || getvariant == IconCompatParcelizer;
        }
        return false;
    }

    private static boolean read(getVariant getvariant) {
        return getvariant instanceof getPlanData;
    }

    @getMagicModuleMeta
    public static final boolean read(getLink getlink) {
        if (getlink == null) {
            return false;
        }
        getPlanAddOns getplanaddonsAudioAttributesImplApi21Parcelizer = getlink.AudioAttributesImplApi21Parcelizer();
        return (getplanaddonsAudioAttributesImplApi21Parcelizer instanceof isFreePlan) && ((isFreePlan) getplanaddonsAudioAttributesImplApi21Parcelizer).IconCompatParcelizer() == setAccessLevel.UNINFERRED_TYPE_VARIABLE;
    }

    public static String AudioAttributesCompatParcelizer(getLink getlink) {
        toMagicModuleMetaRepoModel.write(getlink, "");
        getSearchTimes.MediaBrowserCompatCustomActionResultReceiver(getlink);
        getPlanAddOns getplanaddonsAudioAttributesImplApi21Parcelizer = getlink.AudioAttributesImplApi21Parcelizer();
        toMagicModuleMetaRepoModel.read(getplanaddonsAudioAttributesImplApi21Parcelizer, "");
        return ((isFreePlan) getplanaddonsAudioAttributesImplApi21Parcelizer).MediaBrowserCompatItemReceiver();
    }
}
