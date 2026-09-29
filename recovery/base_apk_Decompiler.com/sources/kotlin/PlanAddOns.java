package kotlin;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class PlanAddOns extends getLink {
    public boolean AudioAttributesImplApi26Parcelizer() {
        return true;
    }

    protected abstract getLink MediaBrowserCompatItemReceiver();

    public PlanAddOns() {
        super((byte) 0);
    }

    @Override // kotlin.getLink
    public final getPlanAddOns AudioAttributesImplApi21Parcelizer() {
        return MediaBrowserCompatItemReceiver().AudioAttributesImplApi21Parcelizer();
    }

    @Override // kotlin.getLink
    public final List<setDefault> bb_() {
        return MediaBrowserCompatItemReceiver().bb_();
    }

    @Override // kotlin.getLink
    public final boolean ba_() {
        return MediaBrowserCompatItemReceiver().ba_();
    }

    @Override // kotlin.getLink
    public final setTags read() {
        return MediaBrowserCompatItemReceiver().read();
    }

    @Override // kotlin.getLink
    public final getGroupDescription bc_() {
        return MediaBrowserCompatItemReceiver().bc_();
    }

    @Override // kotlin.getLink
    public final PlanAddOnsCompanion MediaBrowserCompatMediaItem() {
        getLink getlinkMediaBrowserCompatItemReceiver = MediaBrowserCompatItemReceiver();
        while (getlinkMediaBrowserCompatItemReceiver instanceof PlanAddOns) {
            getlinkMediaBrowserCompatItemReceiver = ((PlanAddOns) getlinkMediaBrowserCompatItemReceiver).MediaBrowserCompatItemReceiver();
        }
        toMagicModuleMetaRepoModel.read(getlinkMediaBrowserCompatItemReceiver, "");
        return (PlanAddOnsCompanion) getlinkMediaBrowserCompatItemReceiver;
    }

    public String toString() {
        if (AudioAttributesImplApi26Parcelizer()) {
            return MediaBrowserCompatItemReceiver().toString();
        }
        return "<Not computed yet>";
    }
}
