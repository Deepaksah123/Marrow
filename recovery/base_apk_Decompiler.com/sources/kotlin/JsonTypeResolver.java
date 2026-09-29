package kotlin;

import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u000e\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00000\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R$\u0010\u0014\u001a\u0004\u0018\u00010\u00068\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u000e\u0010\u0016\"\u0004\b\u0014\u0010\u0017R$\u0010\u0012\u001a\u0004\u0018\u00010\u00068\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0015\u001a\u0004\b\u0018\u0010\u0016\"\u0004\b\u0010\u0010\u0017R$\u0010\u0018\u001a\u0004\u0018\u00010\t8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0014\u0010\u001a\"\u0004\b\u0018\u0010\u001bR$\u0010\u001d\u001a\u0004\u0018\u00010\t8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u0012\u0010\u001a\"\u0004\b\u0014\u0010\u001bR\u0014\u0010!\u001a\u00020\u001e8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 "}, d2 = {"Lo/JsonTypeResolver;", "Lo/createDummyDeserializationContext;", "", "p0", "", "p1", "", "p2", "p3", "Lo/withAdditionalKeyDeserializers;", "p4", "p5", "<init>", "(ILjava/util/List;Ljava/lang/Float;Ljava/lang/Float;Lo/withAdditionalKeyDeserializers;Lo/withAdditionalKeyDeserializers;)V", "RemoteActionCompatParcelizer", "I", "AudioAttributesCompatParcelizer", "()I", "read", "Ljava/util/List;", "write", "Ljava/lang/Float;", "()Ljava/lang/Float;", "(Ljava/lang/Float;)V", "IconCompatParcelizer", "Lo/withAdditionalKeyDeserializers;", "()Lo/withAdditionalKeyDeserializers;", "(Lo/withAdditionalKeyDeserializers;)V", "MediaBrowserCompatCustomActionResultReceiver", "AudioAttributesImplBaseParcelizer", "", "onRemoveQueueItem", "()Z", "AudioAttributesImplApi26Parcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class JsonTypeResolver implements createDummyDeserializationContext {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private Float read;
    private withAdditionalKeyDeserializers IconCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private withAdditionalKeyDeserializers AudioAttributesImplBaseParcelizer;
    private final int RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final List<JsonTypeResolver> AudioAttributesCompatParcelizer;
    private Float write;

    public JsonTypeResolver(int i, List<JsonTypeResolver> list, Float f, Float f2, withAdditionalKeyDeserializers withadditionalkeydeserializers, withAdditionalKeyDeserializers withadditionalkeydeserializers2) {
        this.RemoteActionCompatParcelizer = i;
        this.AudioAttributesCompatParcelizer = list;
        this.write = f;
        this.read = f2;
        this.IconCompatParcelizer = withadditionalkeydeserializers;
        this.AudioAttributesImplBaseParcelizer = withadditionalkeydeserializers2;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final int getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final Float getWrite() {
        return this.write;
    }

    public final void write(Float f) {
        this.write = f;
    }

    public final void AudioAttributesCompatParcelizer(Float f) {
        this.read = f;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final Float getRead() {
        return this.read;
    }

    public final void IconCompatParcelizer(withAdditionalKeyDeserializers withadditionalkeydeserializers) {
        this.IconCompatParcelizer = withadditionalkeydeserializers;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final withAdditionalKeyDeserializers getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final withAdditionalKeyDeserializers getAudioAttributesImplBaseParcelizer() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    public final void write(withAdditionalKeyDeserializers withadditionalkeydeserializers) {
        this.AudioAttributesImplBaseParcelizer = withadditionalkeydeserializers;
    }

    @Override // kotlin.createDummyDeserializationContext
    public final boolean onRemoveQueueItem() {
        return this.AudioAttributesCompatParcelizer.contains(this);
    }
}
