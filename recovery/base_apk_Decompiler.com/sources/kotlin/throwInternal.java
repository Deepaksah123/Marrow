package kotlin;

import android.graphics.Shader;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\u00060\u0006j\u0002`\u00072\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\u000b\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u000b\u0010\u0012R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0016\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0015R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00178\u0006@FX\u0086\f¢\u0006\u0006\n\u0004\b\b\u0010\u0018"}, d2 = {"Lo/throwInternal;", "Lo/Instantiatable;", "<init>", "()V", "Lo/calloc;", "p0", "Landroid/graphics/Shader;", "Lo/AudioAttributesCompatParcelizer;", "IconCompatParcelizer", "(J)Landroid/graphics/Shader;", "Lo/findDefaultEnumValue;", "RemoteActionCompatParcelizer", "()Lo/findDefaultEnumValue;", "Lo/releaseBuffers;", "p1", "", "p2", "", "(JLo/releaseBuffers;F)V", "read", "Lo/findDefaultEnumValue;", "J", "write", "Lo/resetWithShared;", "[F", "AudioAttributesCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class throwInternal extends Instantiatable {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    public float[] AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private long write;
    private findDefaultEnumValue read;

    public abstract Shader IconCompatParcelizer(long p0);

    public throwInternal() {
        super(null);
        this.write = calloc.INSTANCE.IconCompatParcelizer();
    }

    private final findDefaultEnumValue RemoteActionCompatParcelizer() {
        findDefaultEnumValue finddefaultenumvalue = this.read;
        if (finddefaultenumvalue != null) {
            return finddefaultenumvalue;
        }
        findDefaultEnumValue finddefaultenumvalue2 = new findDefaultEnumValue();
        this.read = finddefaultenumvalue2;
        return finddefaultenumvalue2;
    }

    @Override // kotlin.Instantiatable
    public final void RemoteActionCompatParcelizer(long p0, releaseBuffers p1, float p2) {
        findDefaultEnumValue finddefaultenumvalueRemoteActionCompatParcelizer = this.read;
        if (finddefaultenumvalueRemoteActionCompatParcelizer == null || !calloc.RemoteActionCompatParcelizer(this.write, p0)) {
            if (calloc.MediaBrowserCompatCustomActionResultReceiver(p0)) {
                this.read = null;
                this.write = calloc.INSTANCE.IconCompatParcelizer();
                finddefaultenumvalueRemoteActionCompatParcelizer = null;
            } else {
                finddefaultenumvalueRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
                float[] fArr = this.AudioAttributesCompatParcelizer;
                if (fArr != null) {
                    finddefaultenumvalueRemoteActionCompatParcelizer.read(fArr);
                }
                finddefaultenumvalueRemoteActionCompatParcelizer.RemoteActionCompatParcelizer(IconCompatParcelizer(p0));
                this.read = finddefaultenumvalueRemoteActionCompatParcelizer;
                this.write = p0;
            }
        }
        if (!switchToNext.RemoteActionCompatParcelizer(p1.AudioAttributesCompatParcelizer(), switchToNext.INSTANCE.AudioAttributesCompatParcelizer())) {
            p1.AudioAttributesCompatParcelizer(switchToNext.INSTANCE.AudioAttributesCompatParcelizer());
        }
        if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p1.MediaBrowserCompatItemReceiver(), finddefaultenumvalueRemoteActionCompatParcelizer != null ? finddefaultenumvalueRemoteActionCompatParcelizer.getWrite() : null)) {
            p1.read(finddefaultenumvalueRemoteActionCompatParcelizer != null ? finddefaultenumvalueRemoteActionCompatParcelizer.getWrite() : null);
        }
        if (p1.write() == p2) {
            return;
        }
        p1.RemoteActionCompatParcelizer(p2);
    }
}
