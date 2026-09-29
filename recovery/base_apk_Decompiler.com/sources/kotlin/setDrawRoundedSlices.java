package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\bR \u0010\u000e\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u000b\u0018\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00078WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u000f"}, d2 = {"Lo/setDrawRoundedSlices;", "Lo/setMaxAngle;", "Lo/setEntryLabelColor;", "p0", "", "AudioAttributesCompatParcelizer", "(Lo/setEntryLabelColor;)V", "", "Ljava/lang/String;", "read", "", "", "IconCompatParcelizer", "[Ljava/lang/Object;", "RemoteActionCompatParcelizer", "()Ljava/lang/String;", "write"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class setDrawRoundedSlices implements setMaxAngle {

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final String read;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final Object[] RemoteActionCompatParcelizer;

    @Override // kotlin.setMaxAngle
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final String getRead() {
        return this.read;
    }

    @Override // kotlin.setMaxAngle
    public final void AudioAttributesCompatParcelizer(setEntryLabelColor p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        Companion.read(p0, this.RemoteActionCompatParcelizer);
    }

    /* JADX INFO: renamed from: o.setDrawRoundedSlices$write, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0007\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ)\u0010\r\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lo/setDrawRoundedSlices$write;", "", "<init>", "()V", "Lo/setEntryLabelColor;", "p0", "", "p1", "", "read", "(Lo/setEntryLabelColor;[Ljava/lang/Object;)V", "", "p2", "AudioAttributesCompatParcelizer", "(Lo/setEntryLabelColor;ILjava/lang/Object;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @getMagicModuleMeta
        public static void read(setEntryLabelColor p0, Object[] p1) {
            toMagicModuleMetaRepoModel.write(p0, "");
            if (p1 != null) {
                int length = p1.length;
                int i = 0;
                while (i < length) {
                    Object obj = p1[i];
                    i++;
                    AudioAttributesCompatParcelizer(p0, i, obj);
                }
            }
        }

        private static void AudioAttributesCompatParcelizer(setEntryLabelColor p0, int p1, Object p2) {
            if (p2 == null) {
                p0.read(p1);
                return;
            }
            if (p2 instanceof byte[]) {
                p0.write(p1, (byte[]) p2);
                return;
            }
            if (p2 instanceof Float) {
                p0.AudioAttributesCompatParcelizer(p1, ((Number) p2).floatValue());
                return;
            }
            if (p2 instanceof Double) {
                p0.AudioAttributesCompatParcelizer(p1, ((Number) p2).doubleValue());
                return;
            }
            if (p2 instanceof Long) {
                p0.IconCompatParcelizer(p1, ((Number) p2).longValue());
                return;
            }
            if (p2 instanceof Integer) {
                p0.IconCompatParcelizer(p1, ((Number) p2).intValue());
                return;
            }
            if (p2 instanceof Short) {
                p0.IconCompatParcelizer(p1, ((Number) p2).shortValue());
                return;
            }
            if (p2 instanceof Byte) {
                p0.IconCompatParcelizer(p1, ((Number) p2).byteValue());
                return;
            }
            if (p2 instanceof String) {
                p0.read(p1, (String) p2);
                return;
            }
            if (p2 instanceof Boolean) {
                p0.IconCompatParcelizer(p1, ((Boolean) p2).booleanValue() ? 1L : 0L);
                return;
            }
            StringBuilder sb = new StringBuilder("Cannot bind ");
            sb.append(p2);
            sb.append(" at index ");
            sb.append(p1);
            sb.append(" Supported types: Null, ByteArray, Float, Double, Long, Int, Short, Byte, String");
            throw new IllegalArgumentException(sb.toString());
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }
}
