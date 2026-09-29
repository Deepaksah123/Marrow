package kotlin;

import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class RecentUpdatesLastSyncedModel extends PearlMini {
    private final getHref AudioAttributesCompatParcelizer;
    private final Set<getBadgeText> AudioAttributesImplApi21Parcelizer;
    private final boolean IconCompatParcelizer;
    private final setGroupSubttile RemoteActionCompatParcelizer;
    private final boolean read;
    private final getPearlList write;

    @Override // kotlin.PearlMini
    public final setGroupSubttile IconCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public /* synthetic */ RecentUpdatesLastSyncedModel(setGroupSubttile setgroupsubttile, getPearlList getpearllist, boolean z, boolean z2, Set set, int i) {
        this(setgroupsubttile, (i & 2) != 0 ? getPearlList.INFLEXIBLE : getpearllist, (i & 4) != 0 ? false : z, (i & 8) != 0 ? false : z2, (Set<? extends getBadgeText>) ((i & 16) != 0 ? null : set), (getHref) null);
    }

    public final getPearlList RemoteActionCompatParcelizer() {
        return this.write;
    }

    public final boolean MediaBrowserCompatCustomActionResultReceiver() {
        return this.read;
    }

    public final boolean write() {
        return this.IconCompatParcelizer;
    }

    @Override // kotlin.PearlMini
    public final Set<getBadgeText> AudioAttributesCompatParcelizer() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    @Override // kotlin.PearlMini
    public final getHref read() {
        return this.AudioAttributesCompatParcelizer;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    private RecentUpdatesLastSyncedModel(setGroupSubttile setgroupsubttile, getPearlList getpearllist, boolean z, boolean z2, Set<? extends getBadgeText> set, getHref gethref) {
        super(setgroupsubttile, set, gethref);
        toMagicModuleMetaRepoModel.write(setgroupsubttile, "");
        toMagicModuleMetaRepoModel.write(getpearllist, "");
        this.RemoteActionCompatParcelizer = setgroupsubttile;
        this.write = getpearllist;
        this.read = z;
        this.IconCompatParcelizer = z2;
        this.AudioAttributesImplApi21Parcelizer = set;
        this.AudioAttributesCompatParcelizer = gethref;
    }

    public final RecentUpdatesLastSyncedModel AudioAttributesCompatParcelizer(getPearlList getpearllist) {
        toMagicModuleMetaRepoModel.write(getpearllist, "");
        return write(this, null, getpearllist, false, false, null, null, 61);
    }

    public final RecentUpdatesLastSyncedModel write(boolean z) {
        return write(this, null, null, z, false, null, null, 59);
    }

    public final RecentUpdatesLastSyncedModel read(getHref gethref) {
        return write(this, null, null, false, false, null, gethref, 31);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.PearlMini
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public RecentUpdatesLastSyncedModel IconCompatParcelizer(getBadgeText getbadgetext) {
        toMagicModuleMetaRepoModel.write(getbadgetext, "");
        return write(this, null, null, false, false, AudioAttributesCompatParcelizer() != null ? getKycMessage.write(AudioAttributesCompatParcelizer(), getbadgetext) : getKycMessage.read(getbadgetext), null, 47);
    }

    @Override // kotlin.PearlMini
    public final boolean equals(Object obj) {
        if (!(obj instanceof RecentUpdatesLastSyncedModel)) {
            return false;
        }
        RecentUpdatesLastSyncedModel recentUpdatesLastSyncedModel = (RecentUpdatesLastSyncedModel) obj;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(recentUpdatesLastSyncedModel.read(), read()) && recentUpdatesLastSyncedModel.IconCompatParcelizer() == IconCompatParcelizer() && recentUpdatesLastSyncedModel.write == this.write && recentUpdatesLastSyncedModel.read == this.read && recentUpdatesLastSyncedModel.IconCompatParcelizer == this.IconCompatParcelizer;
    }

    @Override // kotlin.PearlMini
    public final int hashCode() {
        getHref gethref = read();
        int iHashCode = gethref != null ? gethref.hashCode() : 0;
        int iHashCode2 = iHashCode + (iHashCode * 31) + IconCompatParcelizer().hashCode();
        int iHashCode3 = iHashCode2 + (iHashCode2 * 31) + this.write.hashCode();
        int i = iHashCode3 + (iHashCode3 * 31) + (this.read ? 1 : 0);
        return i + (i * 31) + (this.IconCompatParcelizer ? 1 : 0);
    }

    private static /* synthetic */ RecentUpdatesLastSyncedModel write(RecentUpdatesLastSyncedModel recentUpdatesLastSyncedModel, setGroupSubttile setgroupsubttile, getPearlList getpearllist, boolean z, boolean z2, Set set, getHref gethref, int i) {
        if ((i & 1) != 0) {
            setgroupsubttile = recentUpdatesLastSyncedModel.RemoteActionCompatParcelizer;
        }
        if ((i & 2) != 0) {
            getpearllist = recentUpdatesLastSyncedModel.write;
        }
        getPearlList getpearllist2 = getpearllist;
        if ((i & 4) != 0) {
            z = recentUpdatesLastSyncedModel.read;
        }
        boolean z3 = z;
        if ((i & 8) != 0) {
            z2 = recentUpdatesLastSyncedModel.IconCompatParcelizer;
        }
        boolean z4 = z2;
        if ((i & 16) != 0) {
            set = recentUpdatesLastSyncedModel.AudioAttributesImplApi21Parcelizer;
        }
        Set set2 = set;
        if ((i & 32) != 0) {
            gethref = recentUpdatesLastSyncedModel.AudioAttributesCompatParcelizer;
        }
        return IconCompatParcelizer(setgroupsubttile, getpearllist2, z3, z4, set2, gethref);
    }

    private static RecentUpdatesLastSyncedModel IconCompatParcelizer(setGroupSubttile setgroupsubttile, getPearlList getpearllist, boolean z, boolean z2, Set<? extends getBadgeText> set, getHref gethref) {
        toMagicModuleMetaRepoModel.write(setgroupsubttile, "");
        toMagicModuleMetaRepoModel.write(getpearllist, "");
        return new RecentUpdatesLastSyncedModel(setgroupsubttile, getpearllist, z, z2, set, gethref);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("JavaTypeAttributes(howThisTypeIsUsed=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", flexibility=");
        sb.append(this.write);
        sb.append(", isRaw=");
        sb.append(this.read);
        sb.append(", isForAnnotationParameter=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", visitedTypeParameters=");
        sb.append(this.AudioAttributesImplApi21Parcelizer);
        sb.append(", defaultType=");
        sb.append(this.AudioAttributesCompatParcelizer);
        sb.append(')');
        return sb.toString();
    }
}
