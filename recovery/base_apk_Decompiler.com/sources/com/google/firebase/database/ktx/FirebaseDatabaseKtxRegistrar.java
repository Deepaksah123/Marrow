package com.google.firebase.database.ktx;

import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import kotlin.FlacReaderFlacOggSeeker;
import kotlin.IntermediateLoginResponseBody;
import kotlin.Metadata;
import kotlin.outputMetadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/google/firebase/database/ktx/FirebaseDatabaseKtxRegistrar;", "Lcom/google/firebase/components/ComponentRegistrar;", "<init>", "()V", "", "Lo/FlacReaderFlacOggSeeker;", "RemoteActionCompatParcelizer", "()Ljava/util/List;"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class FirebaseDatabaseKtxRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List<FlacReaderFlacOggSeeker<?>> RemoteActionCompatParcelizer() {
        return IntermediateLoginResponseBody.RemoteActionCompatParcelizer(outputMetadata.write("fire-db-ktx", "unspecified"));
    }
}
