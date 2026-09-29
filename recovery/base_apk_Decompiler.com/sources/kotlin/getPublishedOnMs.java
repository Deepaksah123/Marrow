package kotlin;

/* JADX INFO: loaded from: classes4.dex */
public final class getPublishedOnMs {
    public static /* synthetic */ RecentUpdatesLastSyncedModel read(setGroupSubttile setgroupsubttile, boolean z, boolean z2, getBadgeText getbadgetext, int i) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = false;
        }
        if ((i & 4) != 0) {
            getbadgetext = null;
        }
        return AudioAttributesCompatParcelizer(setgroupsubttile, z, z2, getbadgetext);
    }

    private static RecentUpdatesLastSyncedModel AudioAttributesCompatParcelizer(setGroupSubttile setgroupsubttile, boolean z, boolean z2, getBadgeText getbadgetext) {
        toMagicModuleMetaRepoModel.write(setgroupsubttile, "");
        return new RecentUpdatesLastSyncedModel(setgroupsubttile, (getPearlList) null, z2, z, getbadgetext != null ? getKycMessage.read(getbadgetext) : null, 34);
    }
}
