package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b"}, d2 = {"Lo/WalletWalletOptionsBuilder;", "", "<init>", "()V", "IconCompatParcelizer", "AudioAttributesCompatParcelizer", "RemoteActionCompatParcelizer", "read", "Lo/WalletWalletOptionsBuilder$IconCompatParcelizer;", "Lo/WalletWalletOptionsBuilder$AudioAttributesCompatParcelizer;", "Lo/WalletWalletOptionsBuilder$RemoteActionCompatParcelizer;", "Lo/WalletWalletOptionsBuilder$read;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class WalletWalletOptionsBuilder {

    public static final class IconCompatParcelizer extends WalletWalletOptionsBuilder {
        private final long IconCompatParcelizer;

        public IconCompatParcelizer(long j) {
            super(null);
            this.IconCompatParcelizer = j;
        }

        public final long RemoteActionCompatParcelizer() {
            return this.IconCompatParcelizer;
        }
    }

    private WalletWalletOptionsBuilder() {
    }

    public static final class AudioAttributesCompatParcelizer extends WalletWalletOptionsBuilder {
        private final boolean AudioAttributesCompatParcelizer;

        public AudioAttributesCompatParcelizer(boolean z) {
            super(null);
            this.AudioAttributesCompatParcelizer = z;
        }

        public final boolean AudioAttributesCompatParcelizer() {
            return this.AudioAttributesCompatParcelizer;
        }
    }

    public /* synthetic */ WalletWalletOptionsBuilder(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this();
    }

    public static final class RemoteActionCompatParcelizer extends WalletWalletOptionsBuilder {
        private final boolean RemoteActionCompatParcelizer;

        public RemoteActionCompatParcelizer(boolean z) {
            super(null);
            this.RemoteActionCompatParcelizer = z;
        }

        public final boolean read() {
            return this.RemoteActionCompatParcelizer;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/WalletWalletOptionsBuilder$read;", "Lo/WalletWalletOptionsBuilder;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class read extends WalletWalletOptionsBuilder {
        public static final read INSTANCE = new read();

        private read() {
            super(null);
        }
    }
}
