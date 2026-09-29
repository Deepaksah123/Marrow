package kotlin;

import java.nio.ByteBuffer;
import kotlin.r8lambdaS__QVsutFC117zAPgt_KKJAKcRY;

/* JADX INFO: loaded from: classes2.dex */
public final class setReleaseDay implements r8lambdaS__QVsutFC117zAPgt_KKJAKcRY<ByteBuffer> {
    private final ByteBuffer read;

    @Override // kotlin.r8lambdaS__QVsutFC117zAPgt_KKJAKcRY
    public final void read() {
    }

    public setReleaseDay(ByteBuffer byteBuffer) {
        this.read = byteBuffer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.r8lambdaS__QVsutFC117zAPgt_KKJAKcRY
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public ByteBuffer IconCompatParcelizer() {
        this.read.position(0);
        return this.read;
    }

    public static class IconCompatParcelizer implements r8lambdaS__QVsutFC117zAPgt_KKJAKcRY.RemoteActionCompatParcelizer<ByteBuffer> {
        @Override // o.r8lambdaS__QVsutFC117zAPgt_KKJAKcRY.RemoteActionCompatParcelizer
        public final /* synthetic */ r8lambdaS__QVsutFC117zAPgt_KKJAKcRY<ByteBuffer> write(ByteBuffer byteBuffer) {
            return RemoteActionCompatParcelizer(byteBuffer);
        }

        private static r8lambdaS__QVsutFC117zAPgt_KKJAKcRY<ByteBuffer> RemoteActionCompatParcelizer(ByteBuffer byteBuffer) {
            return new setReleaseDay(byteBuffer);
        }

        @Override // o.r8lambdaS__QVsutFC117zAPgt_KKJAKcRY.RemoteActionCompatParcelizer
        public final Class<ByteBuffer> IconCompatParcelizer() {
            return ByteBuffer.class;
        }
    }
}
