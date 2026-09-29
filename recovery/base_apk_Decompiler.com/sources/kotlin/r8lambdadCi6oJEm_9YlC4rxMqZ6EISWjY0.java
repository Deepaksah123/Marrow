package kotlin;

import java.io.IOException;
import java.io.InputStream;
import kotlin.r8lambdaS__QVsutFC117zAPgt_KKJAKcRY;

/* JADX INFO: loaded from: classes2.dex */
public final class r8lambdadCi6oJEm_9YlC4rxMqZ6EISWjY0 implements r8lambdaS__QVsutFC117zAPgt_KKJAKcRY<InputStream> {
    private final setDisplayTitle write;

    public r8lambdadCi6oJEm_9YlC4rxMqZ6EISWjY0(InputStream inputStream, setSubtitleConfigurations setsubtitleconfigurations) {
        setDisplayTitle setdisplaytitle = new setDisplayTitle(inputStream, setsubtitleconfigurations);
        this.write = setdisplaytitle;
        setdisplaytitle.mark(5242880);
    }

    @Override // kotlin.r8lambdaS__QVsutFC117zAPgt_KKJAKcRY
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final InputStream IconCompatParcelizer() throws IOException {
        this.write.reset();
        return this.write;
    }

    @Override // kotlin.r8lambdaS__QVsutFC117zAPgt_KKJAKcRY
    public final void read() {
        this.write.write();
    }

    public final void AudioAttributesCompatParcelizer() {
        this.write.AudioAttributesCompatParcelizer();
    }

    public static final class RemoteActionCompatParcelizer implements r8lambdaS__QVsutFC117zAPgt_KKJAKcRY.RemoteActionCompatParcelizer<InputStream> {
        private final setSubtitleConfigurations RemoteActionCompatParcelizer;

        public RemoteActionCompatParcelizer(setSubtitleConfigurations setsubtitleconfigurations) {
            this.RemoteActionCompatParcelizer = setsubtitleconfigurations;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // o.r8lambdaS__QVsutFC117zAPgt_KKJAKcRY.RemoteActionCompatParcelizer
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public r8lambdaS__QVsutFC117zAPgt_KKJAKcRY<InputStream> write(InputStream inputStream) {
            return new r8lambdadCi6oJEm_9YlC4rxMqZ6EISWjY0(inputStream, this.RemoteActionCompatParcelizer);
        }

        @Override // o.r8lambdaS__QVsutFC117zAPgt_KKJAKcRY.RemoteActionCompatParcelizer
        public final Class<InputStream> IconCompatParcelizer() {
            return InputStream.class;
        }
    }
}
