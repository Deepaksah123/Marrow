package kotlin;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import kotlin._coercedTypeDesc;

/* JADX INFO: loaded from: classes2.dex */
public final class r8lambdaO1AKYYBs0J_c1Ii_0sR8NCl4HfI {
    private final MediaSourceListForwardingEventListenerExternalSyntheticLambda4 RemoteActionCompatParcelizer;

    public r8lambdaO1AKYYBs0J_c1Ii_0sR8NCl4HfI(MediaSourceListForwardingEventListenerExternalSyntheticLambda4 mediaSourceListForwardingEventListenerExternalSyntheticLambda4) {
        toMagicModuleMetaRepoModel.write(mediaSourceListForwardingEventListenerExternalSyntheticLambda4, "");
        this.RemoteActionCompatParcelizer = mediaSourceListForwardingEventListenerExternalSyntheticLambda4;
    }

    public final _coercedTypeDesc.AudioAttributesImplBaseParcelizer read(Context context, Bundle bundle, int i, _coercedTypeDesc.AudioAttributesImplBaseParcelizer audioAttributesImplBaseParcelizer, boolean z) {
        toMagicModuleMetaRepoModel.write(context, "");
        toMagicModuleMetaRepoModel.write(bundle, "");
        toMagicModuleMetaRepoModel.write(audioAttributesImplBaseParcelizer, "");
        if (Build.VERSION.SDK_INT < 31 && !z) {
            return audioAttributesImplBaseParcelizer;
        }
        MediaSourceListForwardingEventListenerExternalSyntheticLambda4 mediaSourceListForwardingEventListenerExternalSyntheticLambda4 = this.RemoteActionCompatParcelizer;
        mediaSourceListForwardingEventListenerExternalSyntheticLambda4.read(context, bundle, i, audioAttributesImplBaseParcelizer, mediaSourceListForwardingEventListenerExternalSyntheticLambda4.getOnSkipToPrevious());
        return audioAttributesImplBaseParcelizer;
    }
}
