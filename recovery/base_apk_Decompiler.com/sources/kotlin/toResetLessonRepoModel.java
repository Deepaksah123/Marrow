package kotlin;

import android.content.ComponentCallbacks;

/* JADX INFO: loaded from: classes5.dex */
public final class toResetLessonRepoModel {

    public static final class RemoteActionCompatParcelizer implements RecentUpdatesReferencesResponse {
        final /* synthetic */ hasGetter IconCompatParcelizer;

        RemoteActionCompatParcelizer(hasGetter hasgetter) {
            this.IconCompatParcelizer = hasgetter;
        }

        @Override // kotlin.RecentUpdatesReferencesResponse
        public final void read(RecentUpdatesFilterResponse recentUpdatesFilterResponse) {
            toMagicModuleMetaRepoModel.write(recentUpdatesFilterResponse, "");
            hasGetter hasgetter = this.IconCompatParcelizer;
            toMagicModuleMetaRepoModel.read(hasgetter, "");
        }
    }

    public static final RecentUpdatesFilterResponse IconCompatParcelizer(ComponentCallbacks componentCallbacks, hasGetter hasgetter) {
        toMagicModuleMetaRepoModel.write(componentCallbacks, "");
        toMagicModuleMetaRepoModel.write(hasgetter, "");
        RecentUpdatesFilterResponse recentUpdatesFilterResponseIconCompatParcelizer = getPausedOnTimeMs.RemoteActionCompatParcelizer(componentCallbacks).IconCompatParcelizer(getFaqsForMcq.write(componentCallbacks), getFaqsForMcq.AudioAttributesCompatParcelizer(componentCallbacks), componentCallbacks);
        recentUpdatesFilterResponseIconCompatParcelizer.read(new RemoteActionCompatParcelizer(hasgetter));
        write(hasgetter, recentUpdatesFilterResponseIconCompatParcelizer);
        return recentUpdatesFilterResponseIconCompatParcelizer;
    }

    public static final class read implements addGetter {
        private /* synthetic */ RecentUpdatesFilterResponse write;

        read(RecentUpdatesFilterResponse recentUpdatesFilterResponse) {
            this.write = recentUpdatesFilterResponse;
        }

        @Override // kotlin.addGetter
        public final void AudioAttributesCompatParcelizer(hasGetter hasgetter) {
            toMagicModuleMetaRepoModel.write(hasgetter, "");
            super.AudioAttributesCompatParcelizer(hasgetter);
            this.write.IconCompatParcelizer();
        }
    }

    private static void write(hasGetter hasgetter, RecentUpdatesFilterResponse recentUpdatesFilterResponse) {
        toMagicModuleMetaRepoModel.write(hasgetter, "");
        toMagicModuleMetaRepoModel.write(recentUpdatesFilterResponse, "");
        hasgetter.getLifecycle().IconCompatParcelizer(new read(recentUpdatesFilterResponse));
    }
}
