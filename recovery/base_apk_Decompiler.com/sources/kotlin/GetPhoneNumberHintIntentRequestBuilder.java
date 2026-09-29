package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r"}, d2 = {"Lo/GetPhoneNumberHintIntentRequestBuilder;", "", "<init>", "()V", "RemoteActionCompatParcelizer", "read", "write", "AudioAttributesCompatParcelizer", "IconCompatParcelizer", "Lo/GetPhoneNumberHintIntentRequestBuilder$RemoteActionCompatParcelizer;", "Lo/GetPhoneNumberHintIntentRequestBuilder$write;", "Lo/GetPhoneNumberHintIntentRequestBuilder$IconCompatParcelizer;", "Lo/GetPhoneNumberHintIntentRequestBuilder$read;", "Lo/GetPhoneNumberHintIntentRequestBuilder$AudioAttributesCompatParcelizer;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class GetPhoneNumberHintIntentRequestBuilder {
    private GetPhoneNumberHintIntentRequestBuilder() {
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/GetPhoneNumberHintIntentRequestBuilder$RemoteActionCompatParcelizer;", "Lo/GetPhoneNumberHintIntentRequestBuilder;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class RemoteActionCompatParcelizer extends GetPhoneNumberHintIntentRequestBuilder {
        public static final RemoteActionCompatParcelizer INSTANCE = new RemoteActionCompatParcelizer();

        private RemoteActionCompatParcelizer() {
            super(null);
        }
    }

    public /* synthetic */ GetPhoneNumberHintIntentRequestBuilder(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/GetPhoneNumberHintIntentRequestBuilder$read;", "Lo/GetPhoneNumberHintIntentRequestBuilder;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class read extends GetPhoneNumberHintIntentRequestBuilder {
        public static final read INSTANCE = new read();

        private read() {
            super(null);
        }
    }

    public static final class write extends GetPhoneNumberHintIntentRequestBuilder {
        private final String RemoteActionCompatParcelizer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public write(String str) {
            super(null);
            toMagicModuleMetaRepoModel.write(str, "");
            this.RemoteActionCompatParcelizer = str;
        }

        public final String AudioAttributesCompatParcelizer() {
            return this.RemoteActionCompatParcelizer;
        }
    }

    public static final class AudioAttributesCompatParcelizer extends GetPhoneNumberHintIntentRequestBuilder {
        private final String write;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AudioAttributesCompatParcelizer(String str) {
            super(null);
            toMagicModuleMetaRepoModel.write(str, "");
            this.write = str;
        }
    }

    public static final class IconCompatParcelizer extends GetPhoneNumberHintIntentRequestBuilder {
        private final String RemoteActionCompatParcelizer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IconCompatParcelizer(String str) {
            super(null);
            toMagicModuleMetaRepoModel.write(str, "");
            this.RemoteActionCompatParcelizer = str;
        }

        public final String IconCompatParcelizer() {
            return this.RemoteActionCompatParcelizer;
        }
    }
}
