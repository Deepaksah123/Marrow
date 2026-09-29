package com.marrow.di.app.data;

import kotlin.GTNudgeRequestModel;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.Metadata;
import kotlin.getMagicModuleMeta;
import kotlin.isUnused;
import kotlin.maybeNotifyDownstreamFormatChanged;
import kotlin.setGateway;
import kotlin.setTrackId;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/marrow/di/app/data/PlanDataModule;", "", "<init>", "()V", "Lo/maybeNotifyDownstreamFormatChanged;", "p0", "Lo/isUnused;", "IconCompatParcelizer", "(Lo/maybeNotifyDownstreamFormatChanged;)Lo/isUnused;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class PlanDataModule {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    public abstract isUnused IconCompatParcelizer(maybeNotifyDownstreamFormatChanged p0);

    @getMagicModuleMeta
    public static final setTrackId RemoteActionCompatParcelizer(@setGateway(IconCompatParcelizer = "v3.1") GTNudgeRequestModel gTNudgeRequestModel) {
        return INSTANCE.AudioAttributesCompatParcelizer(gTNudgeRequestModel);
    }

    /* JADX INFO: renamed from: com.marrow.di.app.data.PlanDataModule$IconCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/marrow/di/app/data/PlanDataModule$IconCompatParcelizer;", "", "<init>", "()V", "Lo/GTNudgeRequestModel;", "p0", "Lo/setTrackId;", "AudioAttributesCompatParcelizer", "(Lo/GTNudgeRequestModel;)Lo/setTrackId;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @getMagicModuleMeta
        public final setTrackId AudioAttributesCompatParcelizer(@setGateway(IconCompatParcelizer = "v3.1") GTNudgeRequestModel p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            Object obj = p0.read((Class<Object>) setTrackId.class);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(obj, "");
            return (setTrackId) obj;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }
}
