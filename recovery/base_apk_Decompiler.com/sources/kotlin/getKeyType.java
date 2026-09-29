package kotlin;

import kotlin.Metadata;
import kotlin._parser;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB%\b\u0002\u0012\u001a\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007B\t\b\u0016¢\u0006\u0004\b\u0006\u0010\bJ'\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0010¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Lo/getKeyType;", "Lo/asText;", "Lkotlin/Function2;", "Lo/_parser$IconCompatParcelizer;", "", "p0", "<init>", "(Lo/MagicModuleSubmissionRequestBody;)V", "()V", "Lo/isAbstract;", "p1", "p2", "IconCompatParcelizer", "(FLo/isAbstract;Lo/isAbstract;)F", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getKeyType extends asText {

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    private getKeyType(MagicModuleSubmissionRequestBody<? super _parser.IconCompatParcelizer, ? super Float, Float> magicModuleSubmissionRequestBody) {
        super(magicModuleSubmissionRequestBody, null);
    }

    public getKeyType() {
        this(null);
    }

    @Override // kotlin.asText
    public final float IconCompatParcelizer(float p0, isAbstract p1, isAbstract p2) {
        long j = -1;
        return Float.intBitsToFloat((int) p2.RemoteActionCompatParcelizer(p1, getReferencedType.AudioAttributesCompatParcelizer((((((long) 0) << 32) | (j - ((j >> 63) << 32))) & ((long) Float.floatToRawIntBits(p0))) | (Float.floatToRawIntBits(((int) (p1.write() >> 32)) / 2.0f) << 32))));
    }

    /* JADX INFO: renamed from: o.getKeyType$RemoteActionCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\u0007\u001a\u00020\u00052\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004\"\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\t\u001a\u00020\u00052\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004\"\u00020\u0005¢\u0006\u0004\b\t\u0010\b"}, d2 = {"Lo/getKeyType$RemoteActionCompatParcelizer;", "", "<init>", "()V", "", "Lo/getKeyType;", "p0", "IconCompatParcelizer", "([Lo/getKeyType;)Lo/getKeyType;", "AudioAttributesCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        /* JADX INFO: renamed from: o.getKeyType$RemoteActionCompatParcelizer$3, reason: invalid class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/_parser$IconCompatParcelizer;", "", "p0", "read", "(Lo/_parser$IconCompatParcelizer;F)Ljava/lang/Float;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        static final class AnonymousClass3 extends MagicModuleUseCase implements MagicModuleSubmissionRequestBody<_parser.IconCompatParcelizer, Float, Float> {
            final /* synthetic */ getKeyType[] $RemoteActionCompatParcelizer;

            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final /* synthetic */ Float invoke(_parser.IconCompatParcelizer iconCompatParcelizer, Float f) {
                return read(iconCompatParcelizer, f.floatValue());
            }

            public final Float read(_parser.IconCompatParcelizer iconCompatParcelizer, float f) {
                return Float.valueOf(asDouble.AudioAttributesCompatParcelizer(iconCompatParcelizer, true, this.$RemoteActionCompatParcelizer, f));
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(getKeyType[] getkeytypeArr) {
                super(2);
                this.$RemoteActionCompatParcelizer = getkeytypeArr;
            }
        }

        public final getKeyType IconCompatParcelizer(getKeyType... p0) {
            return new getKeyType(new AnonymousClass3(p0), null);
        }

        /* JADX INFO: renamed from: o.getKeyType$RemoteActionCompatParcelizer$5, reason: invalid class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/_parser$IconCompatParcelizer;", "", "p0", "RemoteActionCompatParcelizer", "(Lo/_parser$IconCompatParcelizer;F)Ljava/lang/Float;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        static final class AnonymousClass5 extends MagicModuleUseCase implements MagicModuleSubmissionRequestBody<_parser.IconCompatParcelizer, Float, Float> {
            final /* synthetic */ getKeyType[] $RemoteActionCompatParcelizer;

            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final /* synthetic */ Float invoke(_parser.IconCompatParcelizer iconCompatParcelizer, Float f) {
                return RemoteActionCompatParcelizer(iconCompatParcelizer, f.floatValue());
            }

            public final Float RemoteActionCompatParcelizer(_parser.IconCompatParcelizer iconCompatParcelizer, float f) {
                return Float.valueOf(asDouble.AudioAttributesCompatParcelizer(iconCompatParcelizer, false, this.$RemoteActionCompatParcelizer, f));
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass5(getKeyType[] getkeytypeArr) {
                super(2);
                this.$RemoteActionCompatParcelizer = getkeytypeArr;
            }
        }

        public final getKeyType AudioAttributesCompatParcelizer(getKeyType... p0) {
            return new getKeyType(new AnonymousClass5(p0), null);
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    public /* synthetic */ getKeyType(MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(magicModuleSubmissionRequestBody);
    }
}
