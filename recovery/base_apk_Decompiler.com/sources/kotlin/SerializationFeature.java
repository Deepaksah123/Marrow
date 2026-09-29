package kotlin;

import android.content.Context;
import kotlin.Metadata;
import kotlin.deserializeAndSet;

/* JADX INFO: loaded from: classes.dex */
@getRenewGrpId
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007"}, d2 = {"Lo/SerializationFeature;", "Lo/deserializeAndSet$RemoteActionCompatParcelizer;", "Landroid/content/Context;", "p0", "<init>", "(Landroid/content/Context;)V", "write", "Landroid/content/Context;", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SerializationFeature implements deserializeAndSet.RemoteActionCompatParcelizer {

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final Context RemoteActionCompatParcelizer;

    public SerializationFeature(Context context) {
        this.RemoteActionCompatParcelizer = context;
    }
}
