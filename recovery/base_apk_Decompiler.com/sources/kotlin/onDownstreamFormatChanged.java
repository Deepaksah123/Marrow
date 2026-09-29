package kotlin;

import android.content.Context;
import java.io.IOException;
import kotlin.MarrowTheme;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lo/onDownstreamFormatChanged;", "Lo/MarrowTheme;", "Lo/onDownstreamFormatChanged$RemoteActionCompatParcelizer;", "p0", "<init>", "()V", "Lo/MarrowTheme$AudioAttributesCompatParcelizer;", "Lo/TypeKt;", "AudioAttributesCompatParcelizer", "(Lo/MarrowTheme$AudioAttributesCompatParcelizer;)Lo/TypeKt;", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class onDownstreamFormatChanged implements MarrowTheme {
    private onDownstreamFormatChanged() {
    }

    @Override // kotlin.MarrowTheme
    public final C0156TypeKt AudioAttributesCompatParcelizer(MarrowTheme.AudioAttributesCompatParcelizer p0) throws IOException {
        toMagicModuleMetaRepoModel.write(p0, "");
        return p0.RemoteActionCompatParcelizer(p0.IconCompatParcelizer());
    }

    public /* synthetic */ onDownstreamFormatChanged(RemoteActionCompatParcelizer remoteActionCompatParcelizer, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this();
    }

    public static final class RemoteActionCompatParcelizer {
        private final Context IconCompatParcelizer;

        public final RemoteActionCompatParcelizer IconCompatParcelizer() {
            return this;
        }

        public RemoteActionCompatParcelizer(Context context) {
            toMagicModuleMetaRepoModel.write(context, "");
            this.IconCompatParcelizer = context;
        }

        public final onDownstreamFormatChanged write() {
            return new onDownstreamFormatChanged(this, null);
        }
    }
}
