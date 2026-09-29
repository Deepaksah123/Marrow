package kotlin;

import android.content.Intent;
import com.marrow2.ui.main.model.DeeplinkDestination;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u001d\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b"}, d2 = {"Lo/onDataRangeRemoved;", "", "Lo/DataBuffer;", "p0", "Lcom/marrow2/ui/main/model/DeeplinkDestination;", "p1", "<init>", "(Lo/DataBuffer;Lcom/marrow2/ui/main/model/DeeplinkDestination;)V", "Landroid/content/Intent;", "", "write", "(Landroid/content/Intent;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "IconCompatParcelizer", "Lo/DataBuffer;", "()Lo/DataBuffer;", "read", "Lcom/marrow2/ui/main/model/DeeplinkDestination;", "AudioAttributesCompatParcelizer", "()Lcom/marrow2/ui/main/model/DeeplinkDestination;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class onDataRangeRemoved {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final DataBuffer read;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final DeeplinkDestination AudioAttributesCompatParcelizer;

    public onDataRangeRemoved(DataBuffer dataBuffer, DeeplinkDestination deeplinkDestination) {
        this.read = dataBuffer;
        this.AudioAttributesCompatParcelizer = deeplinkDestination;
    }

    public /* synthetic */ onDataRangeRemoved(DataBuffer dataBuffer, DeeplinkDestination deeplinkDestination, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(dataBuffer, (i & 2) != 0 ? null : deeplinkDestination);
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final DataBuffer getRead() {
        return this.read;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final DeeplinkDestination getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final void write(Intent p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        p0.putExtra("homeBottomNavTab", this.read);
        p0.putExtra("deeplinkDestination", this.AudioAttributesCompatParcelizer);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public onDataRangeRemoved(DataBuffer dataBuffer) {
        this(dataBuffer, null, 2, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof onDataRangeRemoved)) {
            return false;
        }
        onDataRangeRemoved ondatarangeremoved = (onDataRangeRemoved) p0;
        return this.read == ondatarangeremoved.read && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, ondatarangeremoved.AudioAttributesCompatParcelizer);
    }

    public final int hashCode() {
        DataBuffer dataBuffer = this.read;
        int iHashCode = dataBuffer == null ? 0 : dataBuffer.hashCode();
        DeeplinkDestination deeplinkDestination = this.AudioAttributesCompatParcelizer;
        return (iHashCode * 31) + (deeplinkDestination != null ? deeplinkDestination.hashCode() : 0);
    }

    public final String toString() {
        DataBuffer dataBuffer = this.read;
        DeeplinkDestination deeplinkDestination = this.AudioAttributesCompatParcelizer;
        StringBuilder sb = new StringBuilder("onDataRangeRemoved(read=");
        sb.append(dataBuffer);
        sb.append(", AudioAttributesCompatParcelizer=");
        sb.append(deeplinkDestination);
        sb.append(")");
        return sb.toString();
    }

    /* JADX INFO: renamed from: o.onDataRangeRemoved$AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lo/onDataRangeRemoved$AudioAttributesCompatParcelizer;", "", "<init>", "()V", "Lo/POJOPropertyBuilder5;", "p0", "Lo/onDataRangeRemoved;", "RemoteActionCompatParcelizer", "(Lo/POJOPropertyBuilder5;)Lo/onDataRangeRemoved;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static onDataRangeRemoved RemoteActionCompatParcelizer(POJOPropertyBuilder5 p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            return new onDataRangeRemoved((DataBuffer) p0.write("homeBottomNavTab"), (DeeplinkDestination) p0.write("deeplinkDestination"));
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }
}
