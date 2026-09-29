package kotlin;

import com.marrow.data.models.magicModule.MagicModuleTimeline;

/* JADX INFO: loaded from: classes3.dex */
public final class notifyBytesRead {
    public static final notifyCacheIgnored IconCompatParcelizer(MagicModuleTimeline magicModuleTimeline) {
        toMagicModuleMetaRepoModel.write(magicModuleTimeline, "");
        return new notifyCacheIgnored(magicModuleTimeline.getId(), magicModuleTimeline.getTitle(), magicModuleTimeline.getCorrectCount(), magicModuleTimeline.getMcqCount(), magicModuleTimeline.getSubmittedOn());
    }
}
