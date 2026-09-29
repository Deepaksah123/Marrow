package kotlin;

import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.getInstanceParameter;

/* JADX INFO: loaded from: classes2.dex */
public final class objectSingletonInstance {
    private final read write = new read();

    public final /* synthetic */ class write {
        public static final /* synthetic */ int[] read;

        static {
            int[] iArr = new int[accessgetStaticJsonKeyGetter.values().length];
            try {
                iArr[accessgetStaticJsonKeyGetter.PREPEND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[accessgetStaticJsonKeyGetter.APPEND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            read = iArr;
        }
    }

    public final getInstanceParameter.IconCompatParcelizer RemoteActionCompatParcelizer() {
        return this.write.read();
    }

    public final NewNumberOtpResendRequest<getInstanceParameter> AudioAttributesCompatParcelizer(accessgetStaticJsonKeyGetter accessgetstaticjsonkeygetter) {
        toMagicModuleMetaRepoModel.write(accessgetstaticjsonkeygetter, "");
        int i = write.read[accessgetstaticjsonkeygetter.ordinal()];
        if (i == 1) {
            return this.write.AudioAttributesCompatParcelizer();
        }
        if (i == 2) {
            return this.write.IconCompatParcelizer();
        }
        throw new IllegalArgumentException("invalid load type for hints");
    }

    public final void read(accessgetStaticJsonKeyGetter accessgetstaticjsonkeygetter, getInstanceParameter getinstanceparameter) {
        toMagicModuleMetaRepoModel.write(accessgetstaticjsonkeygetter, "");
        toMagicModuleMetaRepoModel.write(getinstanceparameter, "");
        if (accessgetstaticjsonkeygetter != accessgetStaticJsonKeyGetter.PREPEND && accessgetstaticjsonkeygetter != accessgetStaticJsonKeyGetter.APPEND) {
            throw new IllegalArgumentException("invalid load type for reset: ".concat(String.valueOf(accessgetstaticjsonkeygetter)).toString());
        }
        this.write.read(null, new AnonymousClass4(accessgetstaticjsonkeygetter, getinstanceparameter));
    }

    /* JADX INFO: renamed from: o.objectSingletonInstance$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\n\u0010\u0002\u001a\u00060\u0000R\u00020\u00012\n\u0010\u0003\u001a\u00060\u0000R\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lo/objectSingletonInstance$AudioAttributesCompatParcelizer;", "Lo/objectSingletonInstance;", "p0", "p1", "", "read", "(Lo/objectSingletonInstance$AudioAttributesCompatParcelizer;Lo/objectSingletonInstance$AudioAttributesCompatParcelizer;)V"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass4 extends MagicModuleUseCase implements MagicModuleSubmissionRequestBody<AudioAttributesCompatParcelizer, AudioAttributesCompatParcelizer, getShowPopup> {
        final /* synthetic */ accessgetStaticJsonKeyGetter $IconCompatParcelizer;
        final /* synthetic */ getInstanceParameter $write;

        @Override // kotlin.MagicModuleSubmissionRequestBody
        public final /* synthetic */ getShowPopup invoke(AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, AudioAttributesCompatParcelizer audioAttributesCompatParcelizer2) {
            read(audioAttributesCompatParcelizer, audioAttributesCompatParcelizer2);
            return getShowPopup.INSTANCE;
        }

        public final void read(AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, AudioAttributesCompatParcelizer audioAttributesCompatParcelizer2) {
            toMagicModuleMetaRepoModel.write(audioAttributesCompatParcelizer, "");
            toMagicModuleMetaRepoModel.write(audioAttributesCompatParcelizer2, "");
            if (this.$IconCompatParcelizer == accessgetStaticJsonKeyGetter.PREPEND) {
                audioAttributesCompatParcelizer.IconCompatParcelizer(this.$write);
            } else {
                audioAttributesCompatParcelizer2.IconCompatParcelizer(this.$write);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass4(accessgetStaticJsonKeyGetter accessgetstaticjsonkeygetter, getInstanceParameter getinstanceparameter) {
            super(2);
            this.$IconCompatParcelizer = accessgetstaticjsonkeygetter;
            this.$write = getinstanceparameter;
        }
    }

    /* JADX INFO: renamed from: o.objectSingletonInstance$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\n\u0010\u0002\u001a\u00060\u0000R\u00020\u00012\n\u0010\u0003\u001a\u00060\u0000R\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lo/objectSingletonInstance$AudioAttributesCompatParcelizer;", "Lo/objectSingletonInstance;", "p0", "p1", "", "write", "(Lo/objectSingletonInstance$AudioAttributesCompatParcelizer;Lo/objectSingletonInstance$AudioAttributesCompatParcelizer;)V"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass1 extends MagicModuleUseCase implements MagicModuleSubmissionRequestBody<AudioAttributesCompatParcelizer, AudioAttributesCompatParcelizer, getShowPopup> {
        final /* synthetic */ getInstanceParameter $AudioAttributesCompatParcelizer;

        @Override // kotlin.MagicModuleSubmissionRequestBody
        public final /* synthetic */ getShowPopup invoke(AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, AudioAttributesCompatParcelizer audioAttributesCompatParcelizer2) {
            write(audioAttributesCompatParcelizer, audioAttributesCompatParcelizer2);
            return getShowPopup.INSTANCE;
        }

        public final void write(AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, AudioAttributesCompatParcelizer audioAttributesCompatParcelizer2) {
            toMagicModuleMetaRepoModel.write(audioAttributesCompatParcelizer, "");
            toMagicModuleMetaRepoModel.write(audioAttributesCompatParcelizer2, "");
            if (KotlinFeature.IconCompatParcelizer(this.$AudioAttributesCompatParcelizer, audioAttributesCompatParcelizer.read(), accessgetStaticJsonKeyGetter.PREPEND)) {
                audioAttributesCompatParcelizer.IconCompatParcelizer(this.$AudioAttributesCompatParcelizer);
            }
            if (KotlinFeature.IconCompatParcelizer(this.$AudioAttributesCompatParcelizer, audioAttributesCompatParcelizer2.read(), accessgetStaticJsonKeyGetter.APPEND)) {
                audioAttributesCompatParcelizer2.IconCompatParcelizer(this.$AudioAttributesCompatParcelizer);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(getInstanceParameter getinstanceparameter) {
            super(2);
            this.$AudioAttributesCompatParcelizer = getinstanceparameter;
        }
    }

    public final void read(getInstanceParameter getinstanceparameter) {
        toMagicModuleMetaRepoModel.write(getinstanceparameter, "");
        this.write.read(getinstanceparameter instanceof getInstanceParameter.IconCompatParcelizer ? (getInstanceParameter.IconCompatParcelizer) getinstanceparameter : null, new AnonymousClass1(getinstanceparameter));
    }

    final class read {
        private final AudioAttributesCompatParcelizer AudioAttributesCompatParcelizer;
        private getInstanceParameter.IconCompatParcelizer RemoteActionCompatParcelizer;
        private final ReentrantLock read = new ReentrantLock();
        private final AudioAttributesCompatParcelizer write;

        public read() {
            this.write = objectSingletonInstance.this.new AudioAttributesCompatParcelizer();
            this.AudioAttributesCompatParcelizer = objectSingletonInstance.this.new AudioAttributesCompatParcelizer();
        }

        public final getInstanceParameter.IconCompatParcelizer read() {
            return this.RemoteActionCompatParcelizer;
        }

        public final NewNumberOtpResendRequest<getInstanceParameter> AudioAttributesCompatParcelizer() {
            return this.write.write();
        }

        public final NewNumberOtpResendRequest<getInstanceParameter> IconCompatParcelizer() {
            return this.AudioAttributesCompatParcelizer.write();
        }

        public final void read(getInstanceParameter.IconCompatParcelizer iconCompatParcelizer, MagicModuleSubmissionRequestBody<? super AudioAttributesCompatParcelizer, ? super AudioAttributesCompatParcelizer, getShowPopup> magicModuleSubmissionRequestBody) {
            toMagicModuleMetaRepoModel.write(magicModuleSubmissionRequestBody, "");
            ReentrantLock reentrantLock = this.read;
            reentrantLock.lock();
            if (iconCompatParcelizer != null) {
                try {
                    this.RemoteActionCompatParcelizer = iconCompatParcelizer;
                } finally {
                    reentrantLock.unlock();
                }
            }
            magicModuleSubmissionRequestBody.invoke(this.write, this.AudioAttributesCompatParcelizer);
            getShowPopup getshowpopup = getShowPopup.INSTANCE;
        }
    }

    final class AudioAttributesCompatParcelizer {
        private getInstanceParameter IconCompatParcelizer;
        private final ThemeState<getInstanceParameter> RemoteActionCompatParcelizer = getThemeState.AudioAttributesCompatParcelizer(1, 0, setAddressLine2.AudioAttributesCompatParcelizer, 2);

        public AudioAttributesCompatParcelizer() {
        }

        public final getInstanceParameter read() {
            return this.IconCompatParcelizer;
        }

        public final void IconCompatParcelizer(getInstanceParameter getinstanceparameter) {
            this.IconCompatParcelizer = getinstanceparameter;
            if (getinstanceparameter != null) {
                this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(getinstanceparameter);
            }
        }

        public final NewNumberOtpResendRequest<getInstanceParameter> write() {
            return this.RemoteActionCompatParcelizer;
        }
    }
}
