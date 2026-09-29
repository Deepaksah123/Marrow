package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001a[\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\b\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00012\u001a\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u00032\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00028\u0001\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0006¢\u0006\u0004\b\t\u0010\n\u001a\u001f\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00010\b\"\u0004\b\u0000\u0010\u000b¢\u0006\u0004\b\f\u0010\r\"\"\u0010\u0010\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Original", "", "Saveable", "Lkotlin/Function2;", "Lo/JavaDoubleBitsFromCharSequence;", "p0", "Lkotlin/Function1;", "p1", "Lo/parseManyDecDigits;", "RemoteActionCompatParcelizer", "(Lo/MagicModuleSubmissionRequestBody;Lo/getAnswerMap;)Lo/parseManyDecDigits;", "T", "AudioAttributesCompatParcelizer", "()Lo/parseManyDecDigits;", "write", "Lo/parseManyDecDigits;", "read"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class JavaDoubleBitsFromByteArray {
    private static final parseManyDecDigits<Object, Object> write = RemoteActionCompatParcelizer(new MagicModuleSubmissionRequestBody() { // from class: o.JavaDoubleParser
        @Override // kotlin.MagicModuleSubmissionRequestBody
        public final Object invoke(Object obj, Object obj2) {
            return JavaDoubleBitsFromByteArray.AudioAttributesCompatParcelizer((JavaDoubleBitsFromCharSequence) obj, obj2);
        }
    }, new getAnswerMap() { // from class: o.JavaBigIntegerParser
        @Override // kotlin.getAnswerMap
        public final Object invoke(Object obj) {
            return JavaDoubleBitsFromByteArray.RemoteActionCompatParcelizer(obj);
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object AudioAttributesCompatParcelizer(JavaDoubleBitsFromCharSequence javaDoubleBitsFromCharSequence, Object obj) {
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object RemoteActionCompatParcelizer(Object obj) {
        return obj;
    }

    /* JADX INFO: Add missing generic type declarations: [Saveable, Original] */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001J\u001d\u0010\u0004\u001a\u0004\u0018\u00018\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\u0006\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0003\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lo/JavaDoubleBitsFromByteArray$AudioAttributesCompatParcelizer;", "Lo/parseManyDecDigits;", "Lo/JavaDoubleBitsFromCharSequence;", "p0", "AudioAttributesCompatParcelizer", "(Lo/JavaDoubleBitsFromCharSequence;Ljava/lang/Object;)Ljava/lang/Object;", "IconCompatParcelizer", "(Ljava/lang/Object;)Ljava/lang/Object;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AudioAttributesCompatParcelizer<Original, Saveable> implements parseManyDecDigits<Original, Saveable> {
        final /* synthetic */ MagicModuleSubmissionRequestBody<JavaDoubleBitsFromCharSequence, Original, Saveable> AudioAttributesCompatParcelizer;
        final /* synthetic */ getAnswerMap<Saveable, Original> IconCompatParcelizer;

        /* JADX WARN: Multi-variable type inference failed */
        AudioAttributesCompatParcelizer(MagicModuleSubmissionRequestBody<? super JavaDoubleBitsFromCharSequence, ? super Original, ? extends Saveable> magicModuleSubmissionRequestBody, getAnswerMap<? super Saveable, ? extends Original> getanswermap) {
            this.AudioAttributesCompatParcelizer = magicModuleSubmissionRequestBody;
            this.IconCompatParcelizer = getanswermap;
        }

        @Override // kotlin.parseManyDecDigits
        public final Saveable AudioAttributesCompatParcelizer(JavaDoubleBitsFromCharSequence javaDoubleBitsFromCharSequence, Original original) {
            return this.AudioAttributesCompatParcelizer.invoke(javaDoubleBitsFromCharSequence, original);
        }

        @Override // kotlin.parseManyDecDigits
        public final Original IconCompatParcelizer(Saveable p0) {
            return this.IconCompatParcelizer.invoke(p0);
        }
    }

    public static final <Original, Saveable> parseManyDecDigits<Original, Saveable> RemoteActionCompatParcelizer(MagicModuleSubmissionRequestBody<? super JavaDoubleBitsFromCharSequence, ? super Original, ? extends Saveable> magicModuleSubmissionRequestBody, getAnswerMap<? super Saveable, ? extends Original> getanswermap) {
        return new AudioAttributesCompatParcelizer(magicModuleSubmissionRequestBody, getanswermap);
    }

    public static final <T> parseManyDecDigits<T, Object> AudioAttributesCompatParcelizer() {
        parseManyDecDigits<T, Object> parsemanydecdigits = (parseManyDecDigits<T, Object>) write;
        toMagicModuleMetaRepoModel.read(parsemanydecdigits, "");
        return parsemanydecdigits;
    }
}
