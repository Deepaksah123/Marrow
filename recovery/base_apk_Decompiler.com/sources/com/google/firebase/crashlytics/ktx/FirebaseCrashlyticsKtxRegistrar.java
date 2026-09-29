package com.google.firebase.crashlytics.ktx;

import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import kotlin.FlacReaderFlacOggSeeker;
import kotlin.IntermediateLoginResponseBody;
import kotlin.Metadata;
import kotlin.outputMetadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/google/firebase/crashlytics/ktx/FirebaseCrashlyticsKtxRegistrar;", "Lcom/google/firebase/components/ComponentRegistrar;", "<init>", "()V", "", "Lo/FlacReaderFlacOggSeeker;", "RemoteActionCompatParcelizer", "()Ljava/util/List;", "read"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class FirebaseCrashlyticsKtxRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List<FlacReaderFlacOggSeeker<?>> RemoteActionCompatParcelizer() {
        return IntermediateLoginResponseBody.RemoteActionCompatParcelizer(outputMetadata.write("fire-cls-ktx", "unspecified"));
    }
}
