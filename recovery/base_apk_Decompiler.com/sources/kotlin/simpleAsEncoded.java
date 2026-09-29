package kotlin;

import android.content.ClipboardManager;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0096@¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\n\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0006H\u0096@¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0018\u0010\n\u001a\u00060\u000fj\u0002`\u00108WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0011"}, d2 = {"Lo/simpleAsEncoded;", "Lo/findNullKeySerializer;", "Lo/hasSimpleName;", "p0", "<init>", "(Lo/hasSimpleName;)V", "Lo/findNullValueSerializer;", "write", "(Lo/SampleVideos;)Ljava/lang/Object;", "", "read", "(Lo/findNullValueSerializer;Lo/SampleVideos;)Ljava/lang/Object;", "IconCompatParcelizer", "Lo/hasSimpleName;", "RemoteActionCompatParcelizer", "Landroid/content/ClipboardManager;", "Lo/AudioAttributesCompatParcelizer;", "()Landroid/content/ClipboardManager;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class simpleAsEncoded implements findNullKeySerializer {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final hasSimpleName RemoteActionCompatParcelizer;

    public simpleAsEncoded(hasSimpleName hassimplename) {
        this.RemoteActionCompatParcelizer = hassimplename;
    }

    @Override // kotlin.findNullKeySerializer
    public final Object write(SampleVideos<? super findNullValueSerializer> sampleVideos) {
        return this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer();
    }

    @Override // kotlin.findNullKeySerializer
    public final Object read(findNullValueSerializer findnullvalueserializer, SampleVideos<? super getShowPopup> sampleVideos) {
        this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(findnullvalueserializer);
        return getShowPopup.INSTANCE;
    }

    @Override // kotlin.findNullKeySerializer
    public final ClipboardManager write() {
        return this.RemoteActionCompatParcelizer.getIconCompatParcelizer();
    }
}
