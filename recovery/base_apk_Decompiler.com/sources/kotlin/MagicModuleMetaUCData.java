package kotlin;

import androidx.fragment.app.Fragment;

/* JADX INFO: loaded from: classes5.dex */
public final class MagicModuleMetaUCData {
    private static RecentUpdatesFilterResponse AudioAttributesCompatParcelizer(Fragment fragment, boolean z) {
        toMagicModuleMetaRepoModel.write(fragment, "");
        if (!(fragment instanceof transformToVMModel)) {
            throw new IllegalStateException("Fragment should implement AndroidScopeComponent".toString());
        }
        Fragment fragment2 = fragment;
        RecentUpdatesFilterResponse recentUpdatesFilterResponseAudioAttributesCompatParcelizer = getPausedOnTimeMs.RemoteActionCompatParcelizer(fragment2).AudioAttributesCompatParcelizer(getFaqsForMcq.write(fragment));
        if (recentUpdatesFilterResponseAudioAttributesCompatParcelizer == null) {
            recentUpdatesFilterResponseAudioAttributesCompatParcelizer = toResetLessonRepoModel.IconCompatParcelizer(fragment2, fragment);
        }
        if (z) {
            _isTrue activity = fragment.getActivity();
            transformToVMModel transformtovmmodel = activity instanceof transformToVMModel ? (transformToVMModel) activity : null;
            RecentUpdatesFilterResponse recentUpdatesFilterResponseIconCompatParcelizer = transformtovmmodel != null ? transformtovmmodel.IconCompatParcelizer() : null;
            if (recentUpdatesFilterResponseIconCompatParcelizer != null) {
                recentUpdatesFilterResponseAudioAttributesCompatParcelizer.write(recentUpdatesFilterResponseIconCompatParcelizer);
                return recentUpdatesFilterResponseAudioAttributesCompatParcelizer;
            }
            getBookmarked getbookmarkedWrite = recentUpdatesFilterResponseAudioAttributesCompatParcelizer.write();
            StringBuilder sb = new StringBuilder("Fragment '");
            sb.append(fragment);
            sb.append("' can't be linked to parent activity scope. No Parent Activity Scope found.");
            getbookmarkedWrite.write(sb.toString());
        }
        return recentUpdatesFilterResponseAudioAttributesCompatParcelizer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static RenewEligible<RecentUpdatesFilterResponse> IconCompatParcelizer(final Fragment fragment, boolean z) {
        toMagicModuleMetaRepoModel.write(fragment, "");
        final boolean z2 = true;
        return getRenewExpiresOn.RemoteActionCompatParcelizer(new getCreatedOnDateMs() { // from class: o.getRelatedMcq
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return MagicModuleMetaUCData.RemoteActionCompatParcelizer(fragment, z2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecentUpdatesFilterResponse RemoteActionCompatParcelizer(Fragment fragment, boolean z) {
        return AudioAttributesCompatParcelizer(fragment, z);
    }
}
