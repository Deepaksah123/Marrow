package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t"}, d2 = {"Lo/MediaCodecVideoRendererCodecMaxValues;", "", "<init>", "()V", "IconCompatParcelizer", "read", "AudioAttributesCompatParcelizer", "Lo/MediaCodecVideoRendererCodecMaxValues$AudioAttributesCompatParcelizer;", "Lo/MediaCodecVideoRendererCodecMaxValues$IconCompatParcelizer;", "Lo/MediaCodecVideoRendererCodecMaxValues$read;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class MediaCodecVideoRendererCodecMaxValues {
    private static final byte[] $$a = {123, -91, -44, 22, -19, -10, -3, 20, -6, 5};
    private static final int $$b = 38;
    private static int IconCompatParcelizer = 0;
    private static int write = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(short r5, short r6, byte r7, java.lang.Object[] r8) {
        /*
            byte[] r0 = kotlin.MediaCodecVideoRendererCodecMaxValues.$$a
            int r5 = r5 * 3
            int r1 = 4 - r5
            int r6 = r6 * 39
            int r6 = 114 - r6
            int r7 = r7 * 3
            int r7 = 6 - r7
            byte[] r1 = new byte[r1]
            int r5 = 3 - r5
            r2 = 0
            if (r0 != 0) goto L18
            r4 = r5
            r3 = r2
            goto L2c
        L18:
            r3 = r2
        L19:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r7 = r7 + 1
            if (r3 != r5) goto L28
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L28:
            r4 = r0[r7]
            int r3 = r3 + 1
        L2c:
            int r6 = r6 + r4
            int r6 = r6 + 6
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.MediaCodecVideoRendererCodecMaxValues.a(short, short, byte, java.lang.Object[]):void");
    }

    private MediaCodecVideoRendererCodecMaxValues() {
    }

    public static final class IconCompatParcelizer extends MediaCodecVideoRendererCodecMaxValues {
        private final int write;

        public IconCompatParcelizer(int i) {
            super(null);
            this.write = i;
        }

        public final int read() {
            return this.write;
        }
    }

    public /* synthetic */ MediaCodecVideoRendererCodecMaxValues(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this();
    }

    public static final class read extends MediaCodecVideoRendererCodecMaxValues {
        private final String AudioAttributesCompatParcelizer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public read(String str) {
            super(null);
            toMagicModuleMetaRepoModel.write(str, "");
            this.AudioAttributesCompatParcelizer = str;
        }

        public final String write() {
            return this.AudioAttributesCompatParcelizer;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x06b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object[] read(int r37, int r38, int r39) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2438
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.MediaCodecVideoRendererCodecMaxValues.read(int, int, int):java.lang.Object[]");
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/MediaCodecVideoRendererCodecMaxValues$AudioAttributesCompatParcelizer;", "Lo/MediaCodecVideoRendererCodecMaxValues;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AudioAttributesCompatParcelizer extends MediaCodecVideoRendererCodecMaxValues {
        public static final AudioAttributesCompatParcelizer INSTANCE = new AudioAttributesCompatParcelizer();

        private AudioAttributesCompatParcelizer() {
            super(null);
        }
    }
}
