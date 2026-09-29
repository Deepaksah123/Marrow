package kotlin;

import kotlin.Metadata;
import kotlin._parser;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB%\b\u0002\u0012\u001a\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007B\t\b\u0016¢\u0006\u0004\b\u0006\u0010\bJ'\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0010¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Lo/iterator;", "Lo/asText;", "Lkotlin/Function2;", "Lo/_parser$IconCompatParcelizer;", "", "p0", "<init>", "(Lo/MagicModuleSubmissionRequestBody;)V", "()V", "Lo/isAbstract;", "p1", "p2", "IconCompatParcelizer", "(FLo/isAbstract;Lo/isAbstract;)F", "read"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class iterator extends asText {

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    private iterator(MagicModuleSubmissionRequestBody<? super _parser.IconCompatParcelizer, ? super Float, Float> magicModuleSubmissionRequestBody) {
        super(magicModuleSubmissionRequestBody, null);
    }

    public iterator() {
        this(null);
    }

    @Override // kotlin.asText
    public final float IconCompatParcelizer(float p0, isAbstract p1, isAbstract p2) {
        long j = -1;
        return Float.intBitsToFloat((int) (p2.RemoteActionCompatParcelizer(p1, getReferencedType.AudioAttributesCompatParcelizer((((long) Float.floatToRawIntBits(((int) p1.write()) / 2.0f)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)))) | (((long) Float.floatToRawIntBits(p0)) << 32))) >> 32));
    }

    /* JADX INFO: renamed from: o.iterator$read, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\u0007\u001a\u00020\u00052\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004\"\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\t\u001a\u00020\u00052\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004\"\u00020\u0005¢\u0006\u0004\b\t\u0010\bJ'\u0010\r\u001a\u00020\u00052\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lo/iterator$read;", "", "<init>", "()V", "", "Lo/iterator;", "p0", "read", "([Lo/iterator;)Lo/iterator;", "write", "Lkotlin/Function2;", "Lo/_parser$IconCompatParcelizer;", "", "IconCompatParcelizer", "(Lo/MagicModuleSubmissionRequestBody;)Lo/iterator;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        /* JADX INFO: renamed from: o.iterator$read$5, reason: invalid class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/_parser$IconCompatParcelizer;", "", "p0", "IconCompatParcelizer", "(Lo/_parser$IconCompatParcelizer;F)Ljava/lang/Float;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        static final class AnonymousClass5 extends MagicModuleUseCase implements MagicModuleSubmissionRequestBody<_parser.IconCompatParcelizer, Float, Float> {
            final /* synthetic */ iterator[] $write;

            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final /* synthetic */ Float invoke(_parser.IconCompatParcelizer iconCompatParcelizer, Float f) {
                return IconCompatParcelizer(iconCompatParcelizer, f.floatValue());
            }

            public final Float IconCompatParcelizer(_parser.IconCompatParcelizer iconCompatParcelizer, float f) {
                return Float.valueOf(asDouble.AudioAttributesCompatParcelizer(iconCompatParcelizer, true, this.$write, f));
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass5(iterator[] iteratorVarArr) {
                super(2);
                this.$write = iteratorVarArr;
            }
        }

        public final iterator read(iterator... p0) {
            return IconCompatParcelizer(new AnonymousClass5(p0));
        }

        /* JADX INFO: renamed from: o.iterator$read$1, reason: invalid class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/_parser$IconCompatParcelizer;", "", "p0", "AudioAttributesCompatParcelizer", "(Lo/_parser$IconCompatParcelizer;F)Ljava/lang/Float;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        static final class AnonymousClass1 extends MagicModuleUseCase implements MagicModuleSubmissionRequestBody<_parser.IconCompatParcelizer, Float, Float> {
            final /* synthetic */ iterator[] $read;

            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final /* synthetic */ Float invoke(_parser.IconCompatParcelizer iconCompatParcelizer, Float f) {
                return AudioAttributesCompatParcelizer(iconCompatParcelizer, f.floatValue());
            }

            public final Float AudioAttributesCompatParcelizer(_parser.IconCompatParcelizer iconCompatParcelizer, float f) {
                return Float.valueOf(asDouble.AudioAttributesCompatParcelizer(iconCompatParcelizer, false, this.$read, f));
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(iterator[] iteratorVarArr) {
                super(2);
                this.$read = iteratorVarArr;
            }
        }

        public final iterator write(iterator... p0) {
            return IconCompatParcelizer(new AnonymousClass1(p0));
        }

        public final iterator IconCompatParcelizer(MagicModuleSubmissionRequestBody<? super _parser.IconCompatParcelizer, ? super Float, Float> p0) {
            return new iterator(p0, null);
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    public /* synthetic */ iterator(MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(magicModuleSubmissionRequestBody);
    }
}
