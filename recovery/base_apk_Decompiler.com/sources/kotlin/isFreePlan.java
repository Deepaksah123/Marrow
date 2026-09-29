package kotlin;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.getSettingsItems;

/* JADX INFO: loaded from: classes4.dex */
public final class isFreePlan implements getPlanAddOns {
    private final setAccessLevel RemoteActionCompatParcelizer;
    private final String[] read;
    private final String write;

    @Override // kotlin.getPlanAddOns
    public final boolean AudioAttributesImplApi26Parcelizer() {
        return false;
    }

    public isFreePlan(setAccessLevel setaccesslevel, String... strArr) {
        toMagicModuleMetaRepoModel.write(setaccesslevel, "");
        toMagicModuleMetaRepoModel.write(strArr, "");
        this.RemoteActionCompatParcelizer = setaccesslevel;
        this.read = strArr;
        String strAudioAttributesCompatParcelizer = isAddressAvailable.ERROR_TYPE.AudioAttributesCompatParcelizer();
        String strRemoteActionCompatParcelizer = setaccesslevel.RemoteActionCompatParcelizer();
        Object[] objArrCopyOf = Arrays.copyOf(strArr, strArr.length);
        String str = String.format(strRemoteActionCompatParcelizer, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str, "");
        String str2 = String.format(strAudioAttributesCompatParcelizer, Arrays.copyOf(new Object[]{str}, 1));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str2, "");
        this.write = str2;
    }

    public final setAccessLevel IconCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final String MediaBrowserCompatItemReceiver() {
        return this.read[0];
    }

    @Override // kotlin.getPlanAddOns
    public final List<getBadgeText> AudioAttributesCompatParcelizer() {
        return IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
    }

    @Override // kotlin.getPlanAddOns
    public final Collection<getLink> aV_() {
        return IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
    }

    @Override // kotlin.getPlanAddOns
    public final getQuestionLimit RemoteActionCompatParcelizer() {
        SubscriptionType subscriptionType = SubscriptionType.AudioAttributesCompatParcelizer;
        return SubscriptionType.read();
    }

    @Override // kotlin.getPlanAddOns
    public final getTestTabItems aU_() {
        getSettingsItems.IconCompatParcelizer iconCompatParcelizer = getSettingsItems.RemoteActionCompatParcelizer;
        return getSettingsItems.IconCompatParcelizer.read();
    }

    public final String toString() {
        return this.write;
    }
}
