package com.marrow.di.activity;

import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.Metadata;
import kotlin.WebvttSubtitle;
import kotlin.WebvttSubtitleExternalSyntheticLambda0;
import kotlin.getNextChunkDurationUs;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/marrow/di/activity/ActivityAdapterModule;", "", "<init>", "()V", "Lo/getNextChunkDurationUs;", "p0", "Lo/WebvttSubtitleExternalSyntheticLambda0$IconCompatParcelizer;", "write", "(Lo/getNextChunkDurationUs;)Lo/WebvttSubtitleExternalSyntheticLambda0$IconCompatParcelizer;", "IconCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class ActivityAdapterModule {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    public abstract WebvttSubtitleExternalSyntheticLambda0.IconCompatParcelizer write(getNextChunkDurationUs p0);

    /* JADX INFO: renamed from: com.marrow.di.activity.ActivityAdapterModule$IconCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/marrow/di/activity/ActivityAdapterModule$IconCompatParcelizer;", "", "<init>", "()V", "Lo/WebvttSubtitleExternalSyntheticLambda0$IconCompatParcelizer;", "p0", "Lo/WebvttSubtitle;", "AudioAttributesCompatParcelizer", "(Lo/WebvttSubtitleExternalSyntheticLambda0$IconCompatParcelizer;)Lo/WebvttSubtitle;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final WebvttSubtitle AudioAttributesCompatParcelizer(WebvttSubtitleExternalSyntheticLambda0.IconCompatParcelizer p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            return new WebvttSubtitle(p0);
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }
}
