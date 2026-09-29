package com.marrow.di.fragment;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.Metadata;
import kotlin.onPlaybackError;
import kotlin.sendTeardownRequest;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b&\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/marrow/di/fragment/FragmentProviderModule;", "", "<init>", "()V", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class FragmentProviderModule {

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: com.marrow.di.fragment.FragmentProviderModule$RemoteActionCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/marrow/di/fragment/FragmentProviderModule$RemoteActionCompatParcelizer;", "", "<init>", "()V", "Landroidx/fragment/app/Fragment;", "p0", "Lo/sendTeardownRequest;", "AudioAttributesCompatParcelizer", "(Landroidx/fragment/app/Fragment;)Lo/sendTeardownRequest;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final sendTeardownRequest AudioAttributesCompatParcelizer(Fragment p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            Bundle arguments = p0.getArguments();
            if (arguments == null) {
                arguments = new Bundle();
            }
            return new onPlaybackError(arguments);
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }
}
