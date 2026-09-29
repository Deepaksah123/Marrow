package kotlin;

import android.graphics.ColorFilter;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0015\b\u0000\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001e\u0010\u0007\u001a\u00060\u0002j\u0002`\u00038\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n"}, d2 = {"Lo/switchAndReturnNext;", "", "Landroid/graphics/ColorFilter;", "Lo/AudioAttributesCompatParcelizer;", "p0", "<init>", "(Landroid/graphics/ColorFilter;)V", "read", "Landroid/graphics/ColorFilter;", "AudioAttributesCompatParcelizer", "()Landroid/graphics/ColorFilter;", "write"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class switchAndReturnNext {

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final ColorFilter read;

    public switchAndReturnNext(ColorFilter colorFilter) {
        this.read = colorFilter;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final ColorFilter getRead() {
        return this.read;
    }

    /* JADX INFO: renamed from: o.switchAndReturnNext$write, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lo/switchAndReturnNext$write;", "", "<init>", "()V", "Lo/switchToNext;", "p0", "Lo/createInstance;", "p1", "Lo/switchAndReturnNext;", "IconCompatParcelizer", "(JI)Lo/switchAndReturnNext;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static /* synthetic */ switchAndReturnNext IconCompatParcelizer$default(Companion companion, long j, int i, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                i = createInstance.INSTANCE.onPlayFromUri();
            }
            return companion.IconCompatParcelizer(j, i);
        }

        public final switchAndReturnNext IconCompatParcelizer(long p0, int p1) {
            return new DefaultPrettyPrinterIndenter(p0, p1, (MagicModuleRepositoryImplExternalSyntheticLambda0) null);
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }
}
