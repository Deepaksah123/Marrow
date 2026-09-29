package kotlin;

import java.io.IOException;
import kotlin.MarrowTheme;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lo/TagModule;", "Lo/MarrowTheme;", "<init>", "()V", "Lo/MarrowTheme$AudioAttributesCompatParcelizer;", "p0", "Lo/TypeKt;", "AudioAttributesCompatParcelizer", "(Lo/MarrowTheme$AudioAttributesCompatParcelizer;)Lo/TypeKt;"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class TagModule implements MarrowTheme {
    public static final TagModule INSTANCE = new TagModule();

    private TagModule() {
    }

    @Override // kotlin.MarrowTheme
    public final C0156TypeKt AudioAttributesCompatParcelizer(MarrowTheme.AudioAttributesCompatParcelizer p0) throws IOException {
        toMagicModuleMetaRepoModel.write(p0, "");
        BaseDaggerFragment baseDaggerFragment = (BaseDaggerFragment) p0;
        return BaseDaggerFragment.read(baseDaggerFragment, 0, baseDaggerFragment.write().RemoteActionCompatParcelizer(baseDaggerFragment), null, 0, 0, 0, 61).RemoteActionCompatParcelizer(baseDaggerFragment.AudioAttributesImplApi21Parcelizer());
    }
}
