package kotlin;

import com.marrow.data.models.test.StateResult;

/* JADX INFO: loaded from: classes3.dex */
public final class FrameInfoBuilder {
    public static final checkEglException IconCompatParcelizer(StateResult stateResult) {
        toMagicModuleMetaRepoModel.write(stateResult, "");
        return new checkEglException(stateResult.getRank(), stateResult.getStateId(), stateResult.getPercentile(), stateResult.getTotalAttempt(), stateResult.getStateSolved());
    }
}
