package kotlin;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public final class getTaxPercentInfo extends newHeaderInstance implements getNoteEdition {
    public static int AudioAttributesCompatParcelizer;
    public static int read;
    private final getHref IconCompatParcelizer;
    private final getLink write;

    @Override // kotlin.PlanAddOnsCompanion
    public final /* synthetic */ PlanAddOnsCompanion AudioAttributesCompatParcelizer(getGroupDescription getgroupdescription) {
        return read(getgroupdescription);
    }

    @Override // kotlin.PlanAddOnsCompanion
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer */
    public final /* synthetic */ PlanAddOnsCompanion write(boolean z) {
        return write(z);
    }

    @Override // kotlin.newHeaderInstance
    protected final getHref write() {
        return this.IconCompatParcelizer;
    }

    @Override // kotlin.getNoteEdition
    public final getLink MediaBrowserCompatCustomActionResultReceiver() {
        return this.write;
    }

    public getTaxPercentInfo(getHref gethref, getLink getlink) {
        toMagicModuleMetaRepoModel.write(gethref, "");
        toMagicModuleMetaRepoModel.write(getlink, "");
        this.IconCompatParcelizer = gethref;
        this.write = getlink;
    }

    @Override // kotlin.getNoteEdition
    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: merged with bridge method [inline-methods] */
    public final getHref MediaBrowserCompatItemReceiver() {
        return write();
    }

    @Override // kotlin.getHref
    public final getHref read(getGroupDescription getgroupdescription) {
        toMagicModuleMetaRepoModel.write(getgroupdescription, "");
        PlanAddOnsCompanion planAddOnsCompanionRemoteActionCompatParcelizer = setPlanType.RemoteActionCompatParcelizer(MediaBrowserCompatItemReceiver().read(getgroupdescription), MediaBrowserCompatCustomActionResultReceiver());
        toMagicModuleMetaRepoModel.read(planAddOnsCompanionRemoteActionCompatParcelizer, "");
        return (getHref) planAddOnsCompanionRemoteActionCompatParcelizer;
    }

    @Override // kotlin.getHref
    public final getHref write(boolean z) {
        PlanAddOnsCompanion planAddOnsCompanionRemoteActionCompatParcelizer = setPlanType.RemoteActionCompatParcelizer(MediaBrowserCompatItemReceiver().write(z), MediaBrowserCompatCustomActionResultReceiver().MediaBrowserCompatMediaItem().write(z));
        toMagicModuleMetaRepoModel.read(planAddOnsCompanionRemoteActionCompatParcelizer, "");
        return (getHref) planAddOnsCompanionRemoteActionCompatParcelizer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.newHeaderInstance
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public getTaxPercentInfo AudioAttributesCompatParcelizer(getHref gethref) {
        toMagicModuleMetaRepoModel.write(gethref, "");
        return new getTaxPercentInfo(gethref, MediaBrowserCompatCustomActionResultReceiver());
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.newHeaderInstance, kotlin.PlanAddOnsCompanion
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public getTaxPercentInfo write(getCheapestPlan getcheapestplan) {
        toMagicModuleMetaRepoModel.write(getcheapestplan, "");
        getLink getlink = getcheapestplan.read(write());
        toMagicModuleMetaRepoModel.read(getlink, "");
        return new getTaxPercentInfo((getHref) getlink, getcheapestplan.read(MediaBrowserCompatCustomActionResultReceiver()));
    }

    @Override // kotlin.getHref
    public final String toString() {
        StringBuilder sb = new StringBuilder("[@EnhancedForWarnings(");
        sb.append(MediaBrowserCompatCustomActionResultReceiver());
        sb.append(")] ");
        sb.append(MediaBrowserCompatItemReceiver());
        return sb.toString();
    }

    public static int AudioAttributesImplApi26Parcelizer() {
        int i = read;
        int i2 = i % 9566487;
        read = i + 1;
        if (i2 != 0) {
            return AudioAttributesCompatParcelizer;
        }
        int i3 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().touchscreen;
        AudioAttributesCompatParcelizer = i3;
        return i3;
    }
}
