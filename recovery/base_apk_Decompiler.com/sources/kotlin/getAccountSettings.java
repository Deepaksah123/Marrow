package kotlin;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class getAccountSettings {
    private final getBadge IconCompatParcelizer;
    private final List<setDefault> RemoteActionCompatParcelizer;
    private final getAccountSettings read;

    /* JADX WARN: Multi-variable type inference failed */
    public getAccountSettings(getBadge getbadge, List<? extends setDefault> list, getAccountSettings getaccountsettings) {
        toMagicModuleMetaRepoModel.write(getbadge, "");
        toMagicModuleMetaRepoModel.write(list, "");
        this.IconCompatParcelizer = getbadge;
        this.RemoteActionCompatParcelizer = list;
        this.read = getaccountsettings;
    }

    public final getBadge IconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final List<setDefault> RemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final getAccountSettings write() {
        return this.read;
    }
}
